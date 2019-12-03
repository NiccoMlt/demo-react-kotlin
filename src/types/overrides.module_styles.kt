@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

typealias Overrides = Any

external interface ComponentNameToClassKey {
    var MuiAppBar: AppBarClassKey
    var MuiAvatar: AvatarClassKey
    var MuiBackdrop: BackdropClassKey
    var MuiBadge: BadgeClassKey
    var MuiBottomNavigation: BottomNavigationClassKey
    var MuiBottomNavigationAction: BottomNavigationActionClassKey
    var MuiBreadcrumbs: BreadcrumbsClassKey
    var MuiButton: ButtonClassKey
    var MuiButtonBase: ButtonBaseClassKey
    var MuiButtonGroup: ButtonGroupClassKey
    var MuiCard: CardClassKey
    var MuiCardActionArea: CardActionAreaClassKey
    var MuiCardActions: CardActionsClassKey
    var MuiCardContent: CardContentClassKey
    var MuiCardHeader: CardHeaderClassKey
    var MuiCardMedia: CardMediaClassKey
    var MuiCheckbox: CheckboxClassKey
    var MuiChip: ChipClassKey
    var MuiCircularProgress: CircularProgressClassKey
    var MuiCollapse: CollapseClassKey
    var MuiContainer: ContainerClassKey
    var MuiCssBaseline: CssBaselineClassKey
    var MuiDialog: DialogClassKey
    var MuiDialogActions: DialogActionsClassKey
    var MuiDialogContent: DialogContentClassKey
    var MuiDialogContentText: DialogContentTextClassKey
    var MuiDialogTitle: DialogTitleClassKey
    var MuiDivider: DividerClassKey
    var MuiDrawer: DrawerClassKey
    var MuiExpansionPanel: ExpansionPanelClassKey
    var MuiExpansionPanelActions: ExpansionPanelActionsClassKey
    var MuiExpansionPanelDetails: ExpansionPanelDetailsClassKey
    var MuiExpansionPanelSummary: ExpansionPanelSummaryClassKey
    var MuiFab: FabClassKey
    var MuiFilledInput: FilledInputClassKey
    var MuiFormControl: FormControlClassKey
    var MuiFormControlLabel: FormControlLabelClassKey
    var MuiFormGroup: FormGroupClassKey
    var MuiFormHelperText: FormHelperTextClassKey
    var MuiFormLabel: FormLabelClassKey
    var MuiGrid: GridClassKey
    var MuiGridList: GridListClassKey
    var MuiGridListTile: GridListTileClassKey
    var MuiGridListTileBar: GridListTileBarClassKey
    var MuiIcon: IconClassKey
    var MuiIconButton: IconButtonClassKey
    var MuiInput: InputClassKey
    var MuiInputAdornment: InputAdornmentClassKey
    var MuiInputBase: InputBaseClassKey
    var MuiInputLabel: InputLabelClassKey
    var MuiLinearProgress: LinearProgressClassKey
    var MuiLink: LinkClassKey
    var MuiList: ListClassKey
    var MuiListItem: ListItemClassKey
    var MuiListItemAvatar: ListItemAvatarClassKey
    var MuiListItemIcon: ListItemIconClassKey
    var MuiListItemSecondaryAction: ListItemSecondaryActionClassKey
    var MuiListItemText: ListItemTextClassKey
    var MuiListSubheader: ListSubheaderClassKey
    var MuiMenu: MenuClassKey
    var MuiMenuItem: MenuItemClassKey
    var MuiMobileStepper: MobileStepperClassKey
    var MuiNativeSelect: NativeSelectClassKey
    var MuiOutlinedInput: OutlinedInputClassKey
    var MuiPaper: PaperClassKey
    var MuiPopover: PopoverClassKey
    var MuiRadio: RadioClassKey
    var MuiSelect: SelectClassKey
    var MuiSlider: SliderClassKey
    var MuiSnackbar: SnackbarClassKey
    var MuiSnackbarContent: SnackbarContentClassKey
    var MuiStep: StepClasskey
    var MuiStepButton: StepButtonClasskey
    var MuiStepConnector: StepConnectorClasskey
    var MuiStepContent: StepContentClasskey
    var MuiStepIcon: StepIconClasskey
    var MuiStepLabel: StepLabelClasskey
    var MuiStepper: StepperClasskey
    var MuiSvgIcon: SvgIconClassKey
    var MuiSwitch: SwitchClassKey
    var MuiTab: TabClassKey
    var MuiTable: TableClassKey
    var MuiTableBody: TableBodyClassKey
    var MuiTableCell: TableCellClassKey
    var MuiTableFooter: TableFooterClassKey
    var MuiTableHead: TableHeadClassKey
    var MuiTablePagination: TablePaginationClassKey
    var MuiTableRow: TableRowClassKey
    var MuiTableSortLabel: TableSortLabelClassKey
    var MuiTabs: TabsClassKey
    var MuiTextField: TextFieldClassKey
    var MuiToolbar: ToolbarClassKey
    var MuiTooltip: TooltipClassKey
    var MuiTouchRipple: TouchRippleClassKey
    var MuiTypography: TypographyClassKey
}