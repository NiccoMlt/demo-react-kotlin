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

typealias ComponentsProps = Any

external interface ComponentsPropsList {
    var MuiAppBar: AppBarProps
    var MuiAvatar: AvatarProps
    var MuiBackdrop: BackdropProps
    var MuiBadge: BadgeProps
    var MuiBottomNavigation: BottomNavigationProps
    var MuiBottomNavigationAction: BottomNavigationActionProps
    var MuiBreadcrumbs: BreadcrumbsProps
    var MuiButton: ButtonProps
    var MuiButtonBase: ButtonBaseProps
    var MuiButtonGroup: ButtonGroupProps
    var MuiCard: CardProps
    var MuiCardActionArea: CardActionAreaProps
    var MuiCardActions: CardActionsProps
    var MuiCardContent: CardContentProps
    var MuiCardHeader: CardHeaderProps
    var MuiCardMedia: CardMediaProps
    var MuiCheckbox: CheckboxProps
    var MuiChip: ChipProps
    var MuiCircularProgress: CircularProgressProps
    var MuiCollapse: CollapseProps
    var MuiCssBaseline: CssBaselineProps
    var MuiDialog: DialogProps
    var MuiDialogActions: DialogActionsProps
    var MuiDialogContent: DialogContentProps
    var MuiDialogContentText: DialogContentTextProps
    var MuiDialogTitle: DialogTitleProps
    var MuiDivider: DividerProps
    var MuiDrawer: DrawerProps
    var MuiExpansionPanel: ExpansionPanelProps
    var MuiExpansionPanelActions: ExpansionPanelActionsProps
    var MuiExpansionPanelDetails: ExpansionPanelDetailsProps
    var MuiExpansionPanelSummary: ExpansionPanelSummaryProps
    var MuiFab: FabProps
    var MuiFilledInput: FilledInputProps
    var MuiFormControl: FormControlProps
    var MuiFormControlLabel: FormControlLabelProps
    var MuiFormGroup: FormGroupProps
    var MuiFormHelperText: FormHelperTextProps
    var MuiFormLabel: FormLabelProps
    var MuiGrid: GridProps
    var MuiGridList: GridListProps
    var MuiGridListTile: GridListTileProps
    var MuiGridListTileBar: GridListTileBarProps
    var MuiIcon: IconProps
    var MuiIconButton: IconButtonProps
    var MuiInput: InputProps
    var MuiInputAdornment: InputAdornmentProps
    var MuiInputBase: InputBaseProps
    var MuiInputLabel: InputLabelProps
    var MuiLinearProgress: LinearProgressProps
    var MuiLink: LinkProps
    var MuiList: ListProps
    var MuiListItem: ListItemProps
    var MuiListItemAvatar: ListItemAvatarProps
    var MuiListItemIcon: ListItemIconProps
    var MuiListItemSecondaryAction: ListItemSecondaryActionProps
    var MuiListItemText: ListItemTextProps
    var MuiListSubheader: ListSubheaderProps
    var MuiMenu: MenuProps
    var MuiMenuItem: MenuItemProps
    var MuiMenuList: MenuListProps
    var MuiMobileStepper: MobileStepperProps
    var MuiModal: ModalProps
    var MuiNativeSelect: NativeSelectProps
    var MuiOutlinedInput: OutlinedInputProps
    var MuiPaper: PaperProps
    var MuiPopover: PopoverProps
    var MuiRadio: RadioProps
    var MuiRadioGroup: RadioGroupProps
    var MuiSelect: SelectProps
    var MuiSlider: SliderProps
    var MuiSnackbar: SnackbarProps
    var MuiSnackbarContent: SnackbarContentProps
    var MuiStep: StepProps
    var MuiStepButton: StepButtonProps
    var MuiStepConnector: StepConnectorProps
    var MuiStepContent: StepContentProps
    var MuiStepIcon: StepIconProps
    var MuiStepLabel: StepLabelProps
    var MuiStepper: StepperProps
    var MuiSvgIcon: SvgIconProps
    var MuiSwitch: SwitchProps
    var MuiTab: TabProps
    var MuiTable: TableProps
    var MuiTableBody: TableBodyProps
    var MuiTableCell: TableCellProps
    var MuiTableHead: TableHeadProps
    var MuiTablePagination: TablePaginationProps
    var MuiTableRow: TableRowProps
    var MuiTableSortLabel: TableSortLabelProps
    var MuiTabs: TabsProps
    var MuiTextField: TextFieldProps
    var MuiToolbar: ToolbarProps
    var MuiTooltip: TooltipProps
    var MuiTouchRipple: TouchRippleProps
    var MuiTypography: TypographyProps
    var MuiUseMediaQuery: useMediaQueryOptions
    var MuiWithWidth: WithWidthOptions
}