// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Data Security Center Instance resource.
 *
 * For information about Data Security Center Instance and how to use it, see [What is Instance](https://help.aliyun.com/product/88674.html).
 *
 * > **NOTE:** Available in v1.136.0+.
 *
 * > **NOTE:** The Data Security Center Instance is not support in the international site.
 *
 * ## Import
 *
 * Data Security Center Instance can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:sddp/instance:Instance example <id>
 * ```
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:sddp/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    /**
     * Whether the required RAM authorization is configured.
     */
    public /*out*/ readonly authed!: pulumi.Output<boolean>;
    /**
     * The dataphin. Valid values: `yes`,`no`.
     */
    public readonly dataphin!: pulumi.Output<string | undefined>;
    /**
     * The dataphin count. Valid values: 1 to 20.
     */
    public readonly dataphinCount!: pulumi.Output<string | undefined>;
    /**
     * The number of instances.
     */
    public /*out*/ readonly instanceNum!: pulumi.Output<string>;
    /**
     * The logistics.
     */
    public readonly logistics!: pulumi.Output<string | undefined>;
    /**
     * The modify type. Valid values: `Upgrade`, `Downgrade`.  **NOTE:** The `modifyType` is required when you execute a update operation.
     */
    public readonly modifyType!: pulumi.Output<string | undefined>;
    /**
     * Whether the authorized MaxCompute (ODPS) assets.
     */
    public /*out*/ readonly odpsSet!: pulumi.Output<boolean>;
    /**
     * Whether the authorized oss assets.
     */
    public /*out*/ readonly ossBucketSet!: pulumi.Output<boolean>;
    /**
     * The OSS storage capacity.
     */
    public readonly ossSize!: pulumi.Output<string>;
    /**
     * The payment type of the resource. Valid values: `Subscription`.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The Prepaid period. Valid values: `1`, `2`, `3`, `6`,`12`,`24`.
     */
    public readonly period!: pulumi.Output<number>;
    /**
     * Whether the authorized rds assets.
     */
    public /*out*/ readonly rdsSet!: pulumi.Output<boolean>;
    /**
     * The remaining days of the protection period of the assets in the current login account.
     */
    public /*out*/ readonly remainDays!: pulumi.Output<string>;
    /**
     * Automatic renewal period. **NOTE:** The `renewPeriod` is required under the condition that renewalStatus is `AutoRenewal`,
     */
    public readonly renewPeriod!: pulumi.Output<number | undefined>;
    /**
     * Automatic renewal status. Valid values: `AutoRenewal`,`ManualRenewal`. Default Value: `ManualRenewal`.
     */
    public readonly renewalStatus!: pulumi.Output<string>;
    /**
     * Whether to use the database. Valid values:`yes`,`no`.
     */
    public readonly sdCbool!: pulumi.Output<string>;
    /**
     * The number of instances.
     */
    public readonly sdc!: pulumi.Output<string>;
    /**
     * The sddp version. Valid values: `versionAudit`,`versionCompany`,`versionDlp`.
     */
    public readonly sddpVersion!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Whether to use OSS. Valid values: `yes`,`no`.
     */
    public readonly udCbool!: pulumi.Output<string>;
    /**
     * OSS Size.
     */
    public readonly udc!: pulumi.Output<string>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceState | undefined;
            resourceInputs["authed"] = state ? state.authed : undefined;
            resourceInputs["dataphin"] = state ? state.dataphin : undefined;
            resourceInputs["dataphinCount"] = state ? state.dataphinCount : undefined;
            resourceInputs["instanceNum"] = state ? state.instanceNum : undefined;
            resourceInputs["logistics"] = state ? state.logistics : undefined;
            resourceInputs["modifyType"] = state ? state.modifyType : undefined;
            resourceInputs["odpsSet"] = state ? state.odpsSet : undefined;
            resourceInputs["ossBucketSet"] = state ? state.ossBucketSet : undefined;
            resourceInputs["ossSize"] = state ? state.ossSize : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["rdsSet"] = state ? state.rdsSet : undefined;
            resourceInputs["remainDays"] = state ? state.remainDays : undefined;
            resourceInputs["renewPeriod"] = state ? state.renewPeriod : undefined;
            resourceInputs["renewalStatus"] = state ? state.renewalStatus : undefined;
            resourceInputs["sdCbool"] = state ? state.sdCbool : undefined;
            resourceInputs["sdc"] = state ? state.sdc : undefined;
            resourceInputs["sddpVersion"] = state ? state.sddpVersion : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["udCbool"] = state ? state.udCbool : undefined;
            resourceInputs["udc"] = state ? state.udc : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if ((!args || args.paymentType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'paymentType'");
            }
            if ((!args || args.period === undefined) && !opts.urn) {
                throw new Error("Missing required property 'period'");
            }
            if ((!args || args.sdCbool === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sdCbool'");
            }
            if ((!args || args.sdc === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sdc'");
            }
            if ((!args || args.sddpVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sddpVersion'");
            }
            if ((!args || args.udCbool === undefined) && !opts.urn) {
                throw new Error("Missing required property 'udCbool'");
            }
            if ((!args || args.udc === undefined) && !opts.urn) {
                throw new Error("Missing required property 'udc'");
            }
            resourceInputs["dataphin"] = args ? args.dataphin : undefined;
            resourceInputs["dataphinCount"] = args ? args.dataphinCount : undefined;
            resourceInputs["logistics"] = args ? args.logistics : undefined;
            resourceInputs["modifyType"] = args ? args.modifyType : undefined;
            resourceInputs["ossSize"] = args ? args.ossSize : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["renewPeriod"] = args ? args.renewPeriod : undefined;
            resourceInputs["renewalStatus"] = args ? args.renewalStatus : undefined;
            resourceInputs["sdCbool"] = args ? args.sdCbool : undefined;
            resourceInputs["sdc"] = args ? args.sdc : undefined;
            resourceInputs["sddpVersion"] = args ? args.sddpVersion : undefined;
            resourceInputs["udCbool"] = args ? args.udCbool : undefined;
            resourceInputs["udc"] = args ? args.udc : undefined;
            resourceInputs["authed"] = undefined /*out*/;
            resourceInputs["instanceNum"] = undefined /*out*/;
            resourceInputs["odpsSet"] = undefined /*out*/;
            resourceInputs["ossBucketSet"] = undefined /*out*/;
            resourceInputs["rdsSet"] = undefined /*out*/;
            resourceInputs["remainDays"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Instance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * Whether the required RAM authorization is configured.
     */
    authed?: pulumi.Input<boolean>;
    /**
     * The dataphin. Valid values: `yes`,`no`.
     */
    dataphin?: pulumi.Input<string>;
    /**
     * The dataphin count. Valid values: 1 to 20.
     */
    dataphinCount?: pulumi.Input<string>;
    /**
     * The number of instances.
     */
    instanceNum?: pulumi.Input<string>;
    /**
     * The logistics.
     */
    logistics?: pulumi.Input<string>;
    /**
     * The modify type. Valid values: `Upgrade`, `Downgrade`.  **NOTE:** The `modifyType` is required when you execute a update operation.
     */
    modifyType?: pulumi.Input<string>;
    /**
     * Whether the authorized MaxCompute (ODPS) assets.
     */
    odpsSet?: pulumi.Input<boolean>;
    /**
     * Whether the authorized oss assets.
     */
    ossBucketSet?: pulumi.Input<boolean>;
    /**
     * The OSS storage capacity.
     */
    ossSize?: pulumi.Input<string>;
    /**
     * The payment type of the resource. Valid values: `Subscription`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The Prepaid period. Valid values: `1`, `2`, `3`, `6`,`12`,`24`.
     */
    period?: pulumi.Input<number>;
    /**
     * Whether the authorized rds assets.
     */
    rdsSet?: pulumi.Input<boolean>;
    /**
     * The remaining days of the protection period of the assets in the current login account.
     */
    remainDays?: pulumi.Input<string>;
    /**
     * Automatic renewal period. **NOTE:** The `renewPeriod` is required under the condition that renewalStatus is `AutoRenewal`,
     */
    renewPeriod?: pulumi.Input<number>;
    /**
     * Automatic renewal status. Valid values: `AutoRenewal`,`ManualRenewal`. Default Value: `ManualRenewal`.
     */
    renewalStatus?: pulumi.Input<string>;
    /**
     * Whether to use the database. Valid values:`yes`,`no`.
     */
    sdCbool?: pulumi.Input<string>;
    /**
     * The number of instances.
     */
    sdc?: pulumi.Input<string>;
    /**
     * The sddp version. Valid values: `versionAudit`,`versionCompany`,`versionDlp`.
     */
    sddpVersion?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * Whether to use OSS. Valid values: `yes`,`no`.
     */
    udCbool?: pulumi.Input<string>;
    /**
     * OSS Size.
     */
    udc?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * The dataphin. Valid values: `yes`,`no`.
     */
    dataphin?: pulumi.Input<string>;
    /**
     * The dataphin count. Valid values: 1 to 20.
     */
    dataphinCount?: pulumi.Input<string>;
    /**
     * The logistics.
     */
    logistics?: pulumi.Input<string>;
    /**
     * The modify type. Valid values: `Upgrade`, `Downgrade`.  **NOTE:** The `modifyType` is required when you execute a update operation.
     */
    modifyType?: pulumi.Input<string>;
    /**
     * The OSS storage capacity.
     */
    ossSize?: pulumi.Input<string>;
    /**
     * The payment type of the resource. Valid values: `Subscription`.
     */
    paymentType: pulumi.Input<string>;
    /**
     * The Prepaid period. Valid values: `1`, `2`, `3`, `6`,`12`,`24`.
     */
    period: pulumi.Input<number>;
    /**
     * Automatic renewal period. **NOTE:** The `renewPeriod` is required under the condition that renewalStatus is `AutoRenewal`,
     */
    renewPeriod?: pulumi.Input<number>;
    /**
     * Automatic renewal status. Valid values: `AutoRenewal`,`ManualRenewal`. Default Value: `ManualRenewal`.
     */
    renewalStatus?: pulumi.Input<string>;
    /**
     * Whether to use the database. Valid values:`yes`,`no`.
     */
    sdCbool: pulumi.Input<string>;
    /**
     * The number of instances.
     */
    sdc: pulumi.Input<string>;
    /**
     * The sddp version. Valid values: `versionAudit`,`versionCompany`,`versionDlp`.
     */
    sddpVersion: pulumi.Input<string>;
    /**
     * Whether to use OSS. Valid values: `yes`,`no`.
     */
    udCbool: pulumi.Input<string>;
    /**
     * OSS Size.
     */
    udc: pulumi.Input<string>;
}
