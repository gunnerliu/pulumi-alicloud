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
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultInstance = new alicloud.sddp.Instance("default", {
 *     dataphin: "yes",
 *     paymentType: "Subscription",
 *     period: 1,
 *     sdCbool: "yes",
 *     sdc: "3",
 *     sddpVersion: "version_company",
 *     udCbool: "yes",
 *     udc: "2000",
 * });
 * ```
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
    public /*out*/ readonly ossSize!: pulumi.Output<string>;
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
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceState | undefined;
            inputs["authed"] = state ? state.authed : undefined;
            inputs["dataphin"] = state ? state.dataphin : undefined;
            inputs["dataphinCount"] = state ? state.dataphinCount : undefined;
            inputs["instanceNum"] = state ? state.instanceNum : undefined;
            inputs["logistics"] = state ? state.logistics : undefined;
            inputs["modifyType"] = state ? state.modifyType : undefined;
            inputs["odpsSet"] = state ? state.odpsSet : undefined;
            inputs["ossBucketSet"] = state ? state.ossBucketSet : undefined;
            inputs["ossSize"] = state ? state.ossSize : undefined;
            inputs["paymentType"] = state ? state.paymentType : undefined;
            inputs["period"] = state ? state.period : undefined;
            inputs["rdsSet"] = state ? state.rdsSet : undefined;
            inputs["remainDays"] = state ? state.remainDays : undefined;
            inputs["renewPeriod"] = state ? state.renewPeriod : undefined;
            inputs["renewalStatus"] = state ? state.renewalStatus : undefined;
            inputs["sdCbool"] = state ? state.sdCbool : undefined;
            inputs["sdc"] = state ? state.sdc : undefined;
            inputs["sddpVersion"] = state ? state.sddpVersion : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["udCbool"] = state ? state.udCbool : undefined;
            inputs["udc"] = state ? state.udc : undefined;
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
            inputs["dataphin"] = args ? args.dataphin : undefined;
            inputs["dataphinCount"] = args ? args.dataphinCount : undefined;
            inputs["logistics"] = args ? args.logistics : undefined;
            inputs["modifyType"] = args ? args.modifyType : undefined;
            inputs["paymentType"] = args ? args.paymentType : undefined;
            inputs["period"] = args ? args.period : undefined;
            inputs["renewPeriod"] = args ? args.renewPeriod : undefined;
            inputs["renewalStatus"] = args ? args.renewalStatus : undefined;
            inputs["sdCbool"] = args ? args.sdCbool : undefined;
            inputs["sdc"] = args ? args.sdc : undefined;
            inputs["sddpVersion"] = args ? args.sddpVersion : undefined;
            inputs["udCbool"] = args ? args.udCbool : undefined;
            inputs["udc"] = args ? args.udc : undefined;
            inputs["authed"] = undefined /*out*/;
            inputs["instanceNum"] = undefined /*out*/;
            inputs["odpsSet"] = undefined /*out*/;
            inputs["ossBucketSet"] = undefined /*out*/;
            inputs["ossSize"] = undefined /*out*/;
            inputs["rdsSet"] = undefined /*out*/;
            inputs["remainDays"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Instance.__pulumiType, name, inputs, opts);
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
