// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ECD Desktop resource.
 *
 * For information about ECD Desktop and how to use it, see [What is Desktop](https://help.aliyun.com/document_detail/188382.html).
 *
 * > **NOTE:** Available in v1.144.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultSimpleOfficeSite = new alicloud.eds.SimpleOfficeSite("defaultSimpleOfficeSite", {
 *     cidrBlock: "172.16.0.0/12",
 *     desktopAccessType: "Internet",
 *     officeSiteName: "your_office_site_name",
 *     enableInternetAccess: false,
 * });
 * const defaultBundles = alicloud.eds.getBundles({
 *     bundleType: "SYSTEM",
 * });
 * const defaultEcdPolicyGroup = new alicloud.eds.EcdPolicyGroup("defaultEcdPolicyGroup", {
 *     policyGroupName: "your_policy_group_name",
 *     clipboard: "readwrite",
 *     localDrive: "read",
 *     authorizeAccessPolicyRules: [{
 *         description: "example_value",
 *         cidrIp: "1.2.3.4/24",
 *     }],
 *     authorizeSecurityPolicyRules: [{
 *         type: "inflow",
 *         policy: "accept",
 *         description: "example_value",
 *         portRange: "80/80",
 *         ipProtocol: "TCP",
 *         priority: "1",
 *         cidrIp: "0.0.0.0/0",
 *     }],
 * });
 * const defaultUser = new alicloud.eds.User("defaultUser", {
 *     endUserId: "your_end_user_id",
 *     email: "your_email",
 *     phone: "your_phone",
 *     password: "your_password",
 * });
 * const defaultDesktop = new alicloud.eds.Desktop("defaultDesktop", {
 *     officeSiteId: defaultSimpleOfficeSite.id,
 *     policyGroupId: defaultEcdPolicyGroup.id,
 *     bundleId: defaultBundles.then(defaultBundles => defaultBundles.bundles?[0]?.id),
 *     desktopName: "your_desktop_name",
 *     endUserIds: [defaultUser.id],
 * });
 * ```
 *
 * ## Import
 *
 * ECD Desktop can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:eds/desktop:Desktop example <id>
 * ```
 */
export class Desktop extends pulumi.CustomResource {
    /**
     * Get an existing Desktop resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DesktopState, opts?: pulumi.CustomResourceOptions): Desktop {
        return new Desktop(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:eds/desktop:Desktop';

    /**
     * Returns true if the given object is an instance of Desktop.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Desktop {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Desktop.__pulumiType;
    }

    /**
     * The amount of the Desktop.
     */
    public readonly amount!: pulumi.Output<number | undefined>;
    /**
     * The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
     */
    public readonly autoPay!: pulumi.Output<boolean | undefined>;
    /**
     * The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
     */
    public readonly autoRenew!: pulumi.Output<boolean | undefined>;
    /**
     * The bundle id of the Desktop.
     */
    public readonly bundleId!: pulumi.Output<string>;
    /**
     * The desktop name of the Desktop.
     */
    public readonly desktopName!: pulumi.Output<string | undefined>;
    /**
     * The desktop type of the Desktop.
     */
    public readonly desktopType!: pulumi.Output<string>;
    /**
     * The desktop end user id of the Desktop.
     */
    public readonly endUserIds!: pulumi.Output<string[] | undefined>;
    /**
     * The hostname of the Desktop.
     */
    public readonly hostName!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Simple Office Site.
     */
    public readonly officeSiteId!: pulumi.Output<string>;
    /**
     * The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The period of the Desktop.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * The period unit of the Desktop.
     */
    public readonly periodUnit!: pulumi.Output<string | undefined>;
    /**
     * The policy group id of the Desktop.
     */
    public readonly policyGroupId!: pulumi.Output<string>;
    /**
     * The root disk size gib of the Desktop.
     */
    public readonly rootDiskSizeGib!: pulumi.Output<number | undefined>;
    /**
     * The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The stopped mode of the Desktop.
     */
    public readonly stoppedMode!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
     */
    public readonly userAssignMode!: pulumi.Output<string>;
    /**
     * The user disk size gib of the Desktop.
     */
    public readonly userDiskSizeGib!: pulumi.Output<number | undefined>;

    /**
     * Create a Desktop resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DesktopArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DesktopArgs | DesktopState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DesktopState | undefined;
            resourceInputs["amount"] = state ? state.amount : undefined;
            resourceInputs["autoPay"] = state ? state.autoPay : undefined;
            resourceInputs["autoRenew"] = state ? state.autoRenew : undefined;
            resourceInputs["bundleId"] = state ? state.bundleId : undefined;
            resourceInputs["desktopName"] = state ? state.desktopName : undefined;
            resourceInputs["desktopType"] = state ? state.desktopType : undefined;
            resourceInputs["endUserIds"] = state ? state.endUserIds : undefined;
            resourceInputs["hostName"] = state ? state.hostName : undefined;
            resourceInputs["officeSiteId"] = state ? state.officeSiteId : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["periodUnit"] = state ? state.periodUnit : undefined;
            resourceInputs["policyGroupId"] = state ? state.policyGroupId : undefined;
            resourceInputs["rootDiskSizeGib"] = state ? state.rootDiskSizeGib : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["stoppedMode"] = state ? state.stoppedMode : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["userAssignMode"] = state ? state.userAssignMode : undefined;
            resourceInputs["userDiskSizeGib"] = state ? state.userDiskSizeGib : undefined;
        } else {
            const args = argsOrState as DesktopArgs | undefined;
            if ((!args || args.bundleId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bundleId'");
            }
            if ((!args || args.officeSiteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'officeSiteId'");
            }
            if ((!args || args.policyGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyGroupId'");
            }
            resourceInputs["amount"] = args ? args.amount : undefined;
            resourceInputs["autoPay"] = args ? args.autoPay : undefined;
            resourceInputs["autoRenew"] = args ? args.autoRenew : undefined;
            resourceInputs["bundleId"] = args ? args.bundleId : undefined;
            resourceInputs["desktopName"] = args ? args.desktopName : undefined;
            resourceInputs["desktopType"] = args ? args.desktopType : undefined;
            resourceInputs["endUserIds"] = args ? args.endUserIds : undefined;
            resourceInputs["hostName"] = args ? args.hostName : undefined;
            resourceInputs["officeSiteId"] = args ? args.officeSiteId : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["periodUnit"] = args ? args.periodUnit : undefined;
            resourceInputs["policyGroupId"] = args ? args.policyGroupId : undefined;
            resourceInputs["rootDiskSizeGib"] = args ? args.rootDiskSizeGib : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["stoppedMode"] = args ? args.stoppedMode : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userAssignMode"] = args ? args.userAssignMode : undefined;
            resourceInputs["userDiskSizeGib"] = args ? args.userDiskSizeGib : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Desktop.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Desktop resources.
 */
export interface DesktopState {
    /**
     * The amount of the Desktop.
     */
    amount?: pulumi.Input<number>;
    /**
     * The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
     */
    autoPay?: pulumi.Input<boolean>;
    /**
     * The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The bundle id of the Desktop.
     */
    bundleId?: pulumi.Input<string>;
    /**
     * The desktop name of the Desktop.
     */
    desktopName?: pulumi.Input<string>;
    /**
     * The desktop type of the Desktop.
     */
    desktopType?: pulumi.Input<string>;
    /**
     * The desktop end user id of the Desktop.
     */
    endUserIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The hostname of the Desktop.
     */
    hostName?: pulumi.Input<string>;
    /**
     * The ID of the Simple Office Site.
     */
    officeSiteId?: pulumi.Input<string>;
    /**
     * The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The period of the Desktop.
     */
    period?: pulumi.Input<number>;
    /**
     * The period unit of the Desktop.
     */
    periodUnit?: pulumi.Input<string>;
    /**
     * The policy group id of the Desktop.
     */
    policyGroupId?: pulumi.Input<string>;
    /**
     * The root disk size gib of the Desktop.
     */
    rootDiskSizeGib?: pulumi.Input<number>;
    /**
     * The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
     */
    status?: pulumi.Input<string>;
    /**
     * The stopped mode of the Desktop.
     */
    stoppedMode?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
     */
    userAssignMode?: pulumi.Input<string>;
    /**
     * The user disk size gib of the Desktop.
     */
    userDiskSizeGib?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Desktop resource.
 */
export interface DesktopArgs {
    /**
     * The amount of the Desktop.
     */
    amount?: pulumi.Input<number>;
    /**
     * The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
     */
    autoPay?: pulumi.Input<boolean>;
    /**
     * The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The bundle id of the Desktop.
     */
    bundleId: pulumi.Input<string>;
    /**
     * The desktop name of the Desktop.
     */
    desktopName?: pulumi.Input<string>;
    /**
     * The desktop type of the Desktop.
     */
    desktopType?: pulumi.Input<string>;
    /**
     * The desktop end user id of the Desktop.
     */
    endUserIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The hostname of the Desktop.
     */
    hostName?: pulumi.Input<string>;
    /**
     * The ID of the Simple Office Site.
     */
    officeSiteId: pulumi.Input<string>;
    /**
     * The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The period of the Desktop.
     */
    period?: pulumi.Input<number>;
    /**
     * The period unit of the Desktop.
     */
    periodUnit?: pulumi.Input<string>;
    /**
     * The policy group id of the Desktop.
     */
    policyGroupId: pulumi.Input<string>;
    /**
     * The root disk size gib of the Desktop.
     */
    rootDiskSizeGib?: pulumi.Input<number>;
    /**
     * The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
     */
    status?: pulumi.Input<string>;
    /**
     * The stopped mode of the Desktop.
     */
    stoppedMode?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
     */
    userAssignMode?: pulumi.Input<string>;
    /**
     * The user disk size gib of the Desktop.
     */
    userDiskSizeGib?: pulumi.Input<number>;
}
