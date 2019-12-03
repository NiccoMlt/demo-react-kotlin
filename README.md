# Kotlin/JS with React and Material-UI

The aim of this project is try to build a demo SPA to check if it's feasible to use React with Kotlin in my thesis project ([Protelis-Web](https://github.com/NiccoMlt/Protelis-Web)).
Currently, the frontend is being built with TypeScript and React, using Material-UI for GUI components.

## Reasons

Main reasons to adopt Kotlin in place of TypeScript for web GUI are the following:

  - _the backend is built in Kotlin_ with Vert.X;
    using one single language for both frontend and backend could be easier to develop and maintain.
  - as a JVM developer, Kotlin is a sweet spot for many use cases;
    with Kotlin/JS and Kotlin/Native, it enables _multi-platform possibilities_ without changing languages.
    Considering that thesis is a researching experience, this possibility should not be ignored:
      - _if this demo is successful_, I will migrate the codebase already written to Kotlin/JS.
      -  _if this demo is **not** successful_, I will continue with TypeScript and this repo will act as a documentation of the possibility that was evaluated.

## Build environment

This project was bootstrapped with [Create React Kotlin App](https://github.com/JetBrains/create-react-kotlin-app).

Another possibility could have been using Gradle with [kotlin-frontend-plugin](https://github.com/Kotlin/kotlin-frontend-plugin).
The main reasons against it are:

  - **lockdown to Karma** as a testing technology:
    as of now, [Jest](https://jestjs.io/) could be considered the more modern and suggested testing framework, but this plugin forces [KarmaJS Test Runner](https://karma-runner.github.io/).
    
    It's not bad to use Karma, but it's bad not to have the choice.
  - **manual WebPack configuration**:
    [WebPack](https://webpack.js.org/) is the de-facto standard for code and resource bundling, but it's also hard to configure (there is a reason behind the choice to hide it with tools like [Angular CLI](https://cli.angular.io/) and [Create React App](https://create-react-app.dev/)).
    
    The choice to expose WebPack configuration leave freedom to the developer, but breaks the rule of "convention over configuration" that helps developers in JS community to avoid going crazy.

The philosophy behind `create-react-kotlin-app` is the same that led Facebook releasing and encouraging the use of `create-react-app`:

> **One Dependency:** There is only one build dependency. It uses Webpack, Babel, ESLint, and other amazing projects, but provides a cohesive curated experience on top of them.
>  
> **No Configuration Required:** You don't need to configure anything. A reasonably good configuration of both development and production builds is handled for you so you can focus on writing code.
>  
> **No Lock-In:** You can “eject” to a custom setup at any time. Run a single command, and all the configuration and build dependencies will be moved directly into your project, so you can pick up right where you left off.

The choice to avoid using Gradle in favour of `create-react-kotlin-app`, on the other hand, limits the access to many libraries:
JetBrains encourages to release Kotlin/JS wrappers for JS/TS libraries on NPM, because it's easily accessible by both Gradle and NPM/Yarn projects;
many developers ignore that and release wrappers on Maven, locking out any NPM/Yarn project.

## Types

[TypeScript](https://www.typescriptlang.org/) is a typed superset of JavaScript that enable strict type checking in a JS codebase;
as of now, pretty much all the modern libraries have their type definitions (generated by `tsc` at compilation, or manually written).

Kotlin needs types to be defined in Kotlin code, with `@JsModule` annotations to declare JS imports and interfaces and functions defined.

There some tools to generate Kotlin types automatically:

  - `create-react-kotlin-app` bundles the "old" [`ts2kt`](https://github.com/Kotlin/ts2kt) and uses it with [`ts2kt-automator`](https://www.npmjs.com/package/@jetbrains/ts2kt-automator).
    
    This solution kinda works, but has some limits:
      - `ts2kt` is [officially deprecated](https://github.com/Kotlin/ts2kt/commit/0a6664c4530a5fdf380af84ed5e327338d223eaf) in favor of `dukat`, so no further support will be given;
      - `ts2kt-automator` fetches only types from [DefinitelyTyped](http://definitelytyped.org/) NPM scope (`@types/*`), so it can't automatically work with bundled types provided by library itself (like with Material-UI).
  - [`dukat`](https://github.com/Kotlin/dukat) is the new supported converter of TypeScript definition files to Kotlin declarations.
    
    It also kinda works, but with problems:
      - as [this issue](https://github.com/Kotlin/dukat/issues/120) shows, there is a problem with the script itself and I managed to get it working only invoking it with node shell;
      - it can't reference NPM modules directly, so it needs to be invoked on specific .d.ts files, making automation difficult.

### Material-UI

Some libraries _just work_ because wrappers are available (like the [ones](https://github.com/JetBrains/kotlin-wrappers) from JetBrains), but all the others requires the usage of the tools above or a manual adaptation.

This is pretty much the case of Material-UI.
It's true that some people already adapted it, but they are:

  - not really definitive and stable yet;
  - not available through NPM, but only on Maven.

In this section I will consider the manual adaptation; the fetch of NPM modules from Maven without Gradle will be in a following section.

About manual adaptation, I can't leave aside those projects that I found on the internet:

  - three are attempts to define adaptations for Material-UI components (only two are released somewhere, and sadly only on Maven)
      - https://github.com/subroh0508/kotlin-material-ui
      - https://github.com/cfnz/muirwik
      - https://gitlab.com/AnimusDesign/KotlinReactMaterialUI
  - one is a demo project similar to this one:
      - https://github.com/blackmamo/kotlin-kitties

The first try was to generate types for Material-UI Button with `dukat`;
because dukat seems to have a bug that prevents its invokation without Node shell, as I am on linux I added a simple script to `package.json`:

```json
{
  "scripts": {
    "generate-with-dukat": "node $(which dukat) -d src/types"
  }
}

```

and then invoked it:

```bash
yarn generate-with-dukat node_modules/@material-ui/core/Button/Button.d.ts
```

It generated a lot of files in `src/types` folder, with a lot of type conflicts (see [commit cda14e6](https://github.com/NiccoMlt/demo-react-kotlin/commit/cda14e6896f99435db0bdc05436bbafa0c0962ac)):
I can say that it doesn't work correctly out of the box (as also states Matthew Amos in [his README](https://github.com/blackmamo/kotlin-kitties/blob/master/README.md#using-material-ui).

So, I tried adding the code from `kotlin-material-ui` by _subroh0508_ (see [commit 8f8ee13](https://github.com/NiccoMlt/demo-react-kotlin/commit/8f8ee1317c13f2e108518bafc72b592cdef25ad4)), but without result:

<details>
<summary>Console output</summary>

```log
yarn run v1.19.1
$ react-scripts-kotlin build
Creating an optimized production build...
Failed to compile.

exception: java.lang.OutOfMemoryError: Java heap space
    at kotlin.jvm.internal.ArrayIteratorKt.iterator(ArrayIterator.kt:14)
    at kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1.iterator(Sequences.kt:634)
    at kotlin.sequences.FlatteningSequence$iterator$1.<init>(Sequences.kt:255)
    at kotlin.sequences.FlatteningSequence.iterator(Sequences.kt:254)
    at kotlin.sequences.SequencesKt___SequencesKt.joinTo(_Sequences.kt:1721)
    at kotlin.sequences.SequencesKt___SequencesKt.joinToString(_Sequences.kt:1743)
    at kotlin.sequences.SequencesKt___SequencesKt.joinToString$default(_Sequences.kt:1742)
    at org.jetbrains.kotlin.js.translate.utils.SignatureUtilsKt.generateSignature(signatureUtils.kt:61)
    at org.jetbrains.kotlin.js.translate.utils.SignatureUtilsKt.generateSignature(signatureUtils.kt:64)
    at org.jetbrains.kotlin.js.translate.utils.SignatureUtilsKt.generateSignature(signatureUtils.kt:64)
    at org.jetbrains.kotlin.js.translate.context.StaticContext$ObjectInstanceNameGenerator.lambda$new$0(StaticContext.java:568)
    at org.jetbrains.kotlin.js.translate.context.StaticContext$ObjectInstanceNameGenerator$$Lambda$221/816044759.apply(Unknown Source)
    at org.jetbrains.kotlin.js.translate.context.generator.Generator.generate(Generator.java:52)
    at org.jetbrains.kotlin.js.translate.context.generator.Generator.get(Generator.java:44)
    at org.jetbrains.kotlin.js.translate.context.StaticContext.getNameForObjectInstance(StaticContext.java:404)
    at org.jetbrains.kotlin.js.translate.context.TranslationContext.getNameForObjectInstance(TranslationContext.java:358)
    at org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor.visitEnumEntry(DeclarationBodyVisitor.kt:88)
    at org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor.visitEnumEntry(DeclarationBodyVisitor.kt:32)
    at org.jetbrains.kotlin.psi.KtEnumEntry.accept(KtEnumEntry.java:61)
    at org.jetbrains.kotlin.js.translate.general.TranslatorVisitor.traverseContainer(TranslatorVisitor.java:43)
    at org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate(ClassTranslator.kt:92)
    at org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.access$translate(ClassTranslator.kt:63)
    at org.jetbrains.kotlin.js.translate.declaration.ClassTranslator$Companion.translate(ClassTranslator.kt:573)
    at org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitClassOrObject(AbstractDeclarationVisitor.kt:42)
    at org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitClassOrObject(AbstractDeclarationVisitor.kt:35)
    at org.jetbrains.kotlin.psi.KtVisitor.visitClass(KtVisitor.java:33)
    at org.jetbrains.kotlin.psi.KtClass.accept(KtClass.kt:20)
    at org.jetbrains.kotlin.js.translate.general.Translation.translateFile(Translation.java:377)
    at org.jetbrains.kotlin.js.translate.general.Translation.doGenerateAst(Translation.java:336)
    at org.jetbrains.kotlin.js.translate.general.Translation.generateAst(Translation.java:305)
    at org.jetbrains.kotlin.js.facade.K2JSTranslator.translate(K2JSTranslator.kt:162)
    at org.jetbrains.kotlin.js.facade.K2JSTranslator.translateUnits(K2JSTranslator.kt:107)

stacktrace: Error: exception: java.lang.OutOfMemoryError: Java heap space
    at kotlin.jvm.internal.ArrayIteratorKt.iterator(ArrayIterator.kt:14)
    at kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1.iterator(Sequences.kt:634)
    at kotlin.sequences.FlatteningSequence$iterator$1.<init>(Sequences.kt:255)
    at kotlin.sequences.FlatteningSequence.iterator(Sequences.kt:254)
    at kotlin.sequences.SequencesKt___SequencesKt.joinTo(_Sequences.kt:1721)
    at kotlin.sequences.SequencesKt___SequencesKt.joinToString(_Sequences.kt:1743)
    at kotlin.sequences.SequencesKt___SequencesKt.joinToString$default(_Sequences.kt:1742)
    at org.jetbrains.kotlin.js.translate.utils.SignatureUtilsKt.generateSignature(signatureUtils.kt:61)
    at org.jetbrains.kotlin.js.translate.utils.SignatureUtilsKt.generateSignature(signatureUtils.kt:64)
    at org.jetbrains.kotlin.js.translate.utils.SignatureUtilsKt.generateSignature(signatureUtils.kt:64)
    at org.jetbrains.kotlin.js.translate.context.StaticContext$ObjectInstanceNameGenerator.lambda$new$0(StaticContext.java:568)
    at org.jetbrains.kotlin.js.translate.context.StaticContext$ObjectInstanceNameGenerator$$Lambda$221/816044759.apply(Unknown Source)
    at org.jetbrains.kotlin.js.translate.context.generator.Generator.generate(Generator.java:52)
    at org.jetbrains.kotlin.js.translate.context.generator.Generator.get(Generator.java:44)
    at org.jetbrains.kotlin.js.translate.context.StaticContext.getNameForObjectInstance(StaticContext.java:404)
    at org.jetbrains.kotlin.js.translate.context.TranslationContext.getNameForObjectInstance(TranslationContext.java:358)
    at org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor.visitEnumEntry(DeclarationBodyVisitor.kt:88)
    at org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor.visitEnumEntry(DeclarationBodyVisitor.kt:32)
    at org.jetbrains.kotlin.psi.KtEnumEntry.accept(KtEnumEntry.java:61)
    at org.jetbrains.kotlin.js.translate.general.TranslatorVisitor.traverseContainer(TranslatorVisitor.java:43)
    at org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate(ClassTranslator.kt:92)
    at org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.access$translate(ClassTranslator.kt:63)
    at org.jetbrains.kotlin.js.translate.declaration.ClassTranslator$Companion.translate(ClassTranslator.kt:573)
    at org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitClassOrObject(AbstractDeclarationVisitor.kt:42)
    at org.jetbrains.kotlin.js.translate.declaration.AbstractDeclarationVisitor.visitClassOrObject(AbstractDeclarationVisitor.kt:35)
    at org.jetbrains.kotlin.psi.KtVisitor.visitClass(KtVisitor.java:33)
    at org.jetbrains.kotlin.psi.KtClass.accept(KtClass.kt:20)
    at org.jetbrains.kotlin.js.translate.general.Translation.translateFile(Translation.java:377)
    at org.jetbrains.kotlin.js.translate.general.Translation.doGenerateAst(Translation.java:336)
    at org.jetbrains.kotlin.js.translate.general.Translation.generateAst(Translation.java:305)
    at org.jetbrains.kotlin.js.facade.K2JSTranslator.translate(K2JSTranslator.kt:162)
    at org.jetbrains.kotlin.js.facade.K2JSTranslator.translateUnits(K2JSTranslator.kt:107)
    at compiler.run (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/react-scripts-kotlin/scripts/build.js:115:23)
    at finalCallback (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/webpack/lib/Compiler.js:257:39)
    at hooks.done.callAsync.err (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/webpack/lib/Compiler.js:273:13)
    at AsyncSeriesHook.eval [as callAsync] (eval at create (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/tapable/lib/HookCodeFactory.js:33:10), <anonymous>:6:1)
    at AsyncSeriesHook.lazyCompileHook (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/tapable/lib/Hook.js:154:20)
    at onCompiled (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/webpack/lib/Compiler.js:271:21)
    at hooks.afterCompile.callAsync.err (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/webpack/lib/Compiler.js:681:15)
    at AsyncSeriesHook.eval [as callAsync] (eval at create (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/tapable/lib/HookCodeFactory.js:33:10), <anonymous>:6:1)
    at AsyncSeriesHook.lazyCompileHook (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/tapable/lib/Hook.js:154:20)
    at compilation.seal.err (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/webpack/lib/Compiler.js:678:31)
    at AsyncSeriesHook.eval [as callAsync] (eval at create (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/tapable/lib/HookCodeFactory.js:33:10), <anonymous>:6:1)
    at AsyncSeriesHook.lazyCompileHook (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/tapable/lib/Hook.js:154:20)
    at hooks.optimizeAssets.callAsync.err (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/webpack/lib/Compilation.js:1423:35)
    at AsyncSeriesHook.eval [as callAsync] (eval at create (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/tapable/lib/HookCodeFactory.js:33:10), <anonymous>:6:1)
    at AsyncSeriesHook.lazyCompileHook (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/tapable/lib/Hook.js:154:20)
    at hooks.optimizeChunkAssets.callAsync.err (/home/nicco/workspace/tesi/demo-react-kotlin-manual/node_modules/webpack/lib/Compilation.js:1414:32)
error Command failed with exit code 1.
info Visit https://yarnpkg.com/en/docs/cli/run for documentation about this command.
```

</details>

To make the build lighter and not kill my laptop, I probably need to adapt the typings, not import all the code.

The next step tried was the code found in the GitLab repo by AnimusDesign:
those offered were adaptations of some components from Material-UI, wrapped in a naive way (i.e. string literal types are not type-checked).

But it worked: it was possible to add a Button to main frontend.

### NPM module from Maven without Gradle

Because of some libraries are available only on Maven, they are packaged as jar files;
in a `package.json`, compatible options are:

  - packages from NPM, by name;
  - local packages in folders, by path or by symlink;
  - local packages in gzipped tarballs, by path;
  - packages from git repository, by URL and with optional specific branch, commit or tag;
  - remote packages in gzipped tarballs, by URL.

There is no way to import the jar without decompressing it (as jar or zip format are not supported, and git repo is not an NPM module).

The package can be fetch with `wget` from Bintray:

```bash
wget https://dl.bintray.com/subroh0508/maven/subroh0508/net/kotlinmaterialui/core/0.2.3/core-0.2.3.jar
```

And then extracted:

```bash
unzip core-0.2.3.jar -d kotlin-material-ui-core
```

And finally add it with yarn:

```bash
yarn add file:kotlin-material-ui-core
```

The problem here is the following:

<details>
<summary>Console output</summary>

```log
yarn add link:kotlin-material-ui-core                  
yarn add v1.19.1
[1/4] Resolving packages...
Couldn't find any versions for "kotlinx-html-js" that matches "0.6.12"
? Please choose a version of "kotlinx-html-js" from this list: (Use arrow keys)
Couldn't find any versions for "kotlin-react-dom" that matches "16.9.0-pre.83-kotlin-1.3.41"
? Please choose a version of "kotlin-react-dom" from this list: (Use arrow keys)
❯ 0.0.2 
? Please choose a version of "kotlin-react-dom" from this list: 0.0.2error Couldn't find package "kotlin-react@16.9.0-pre.83-kotlin-1.3.41" required by "link:kotlin-material-ui-core" on the "npm" registry.
info Visit https://yarnpkg.com/en/docs/cli/add for documentation about this command.
Error: Couldn't find package "kotlin-extensions@1.0.1-pre.83-kotlin-1.3.41" required by "link:kotlin-material-ui-core" on the "npm" registry.
    at MessageError.ExtendableBuiltin (/usr/lib/node_modules/yarn/lib/cli.js:721:66)
    at new MessageError (/usr/lib/node_modules/yarn/lib/cli.js:750:123)
    at PackageRequest.<anonymous> (/usr/lib/node_modules/yarn/lib/cli.js:36539:17)
    at Generator.throw (<anonymous>)
    at step (/usr/lib/node_modules/yarn/lib/cli.js:304:30)
    at /usr/lib/node_modules/yarn/lib/cli.js:317:13
    at process._tickCallback (internal/process/next_tick.js:68:7)
Error: Couldn't find package "kotlin-css-js@1.0.0-pre.83-kotlin-1.3.41" required by "link:kotlin-material-ui-core" on the "npm" registry.
    at MessageError.ExtendableBuiltin (/usr/lib/node_modules/yarn/lib/cli.js:721:66)
    at new MessageError (/usr/lib/node_modules/yarn/lib/cli.js:750:123)
    at PackageRequest.<anonymous> (/usr/lib/node_modules/yarn/lib/cli.js:36539:17)
    at Generator.throw (<anonymous>)
    at step (/usr/lib/node_modules/yarn/lib/cli.js:304:30)
    at /usr/lib/node_modules/yarn/lib/cli.js:317:13
    at process._tickCallback (internal/process/next_tick.js:68:7)
Error: Couldn't find package "kotlin-styled@1.0.0-pre.83-kotlin-1.3.41" required by "link:kotlin-material-ui-core" on the "npm" registry.
    at MessageError.ExtendableBuiltin (/usr/lib/node_modules/yarn/lib/cli.js:721:66)
    at new MessageError (/usr/lib/node_modules/yarn/lib/cli.js:750:123)
    at PackageRequest.<anonymous> (/usr/lib/node_modules/yarn/lib/cli.js:36539:17)
    at Generator.throw (<anonymous>)
    at step (/usr/lib/node_modules/yarn/lib/cli.js:304:30)
    at /usr/lib/node_modules/yarn/lib/cli.js:317:13
    at process._tickCallback (internal/process/next_tick.js:68:7)
```

</details>

Probably this is because kotlin-related packages are now provided under `@jetbrains/` NPM scope and in the package.json provided with the jar they are "un-scoped";
this could be the reason why they can't be found on NPM.

## Folder Structure

This is a standard Node/React project, with a standard folder structure:

```
my-app/
  README.md
  node_modules/
  package.json
  .gitignore
  public/
    favicon.ico
    index.html
    manifest.json
  src/
    app/
      App.css
      App.kt
    index/
      index.css
      index.kt
    logo/
      kotlin.svg
      Logo.css
      Logo.kt
      react.svg
    ticker/
      Ticker.kt
```

For the project to build, **these files must exist with exact filenames**:

* `public/index.html` is the page template;

You can delete or rename the other files.

You may create subdirectories inside `src`. For faster rebuilds, only files inside `src` are processed by Webpack.

You need to **put any Kotlin and CSS files inside `src`**, or Webpack won’t see them.

Only files inside `public` can be used from `public/index.html`.

You can, however, create more top-level directories.

They will not be included in the production build so you can use them for things like documentation.

## Available Scripts

Once the installation is done, you can run some commands inside the project folder;
those commands are scripts defined in `package.json` file.

### `yarn start`

Runs the app in development mode.<br>
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload automatically when you make edits.

You will see build errors and lint warnings in the console.

### `yarn build`

Builds the app for production to the `build` folder.

The build is optimized and minified and the filenames include hashes for cache management.

Your app is ready to be deployed.

### `yarn eject`

**Note: this is a one-way operation. Once you `eject`, you can’t go back!**

If you are not satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Running `npm run eject` copies all configuration files and transitive dependencies (webpack, Kotlin Compiler, etc) right into your project so you have full control over them. Commands like `npm start` and `npm run build` will still work, but they will point to the copied scripts so you can tweak them. At this point, you’re on your own.

