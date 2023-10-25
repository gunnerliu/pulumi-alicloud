// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Quotas Quota Alarm resource.
 *
 * For information about Quotas Quota Alarm and how to use it, see [What is Quota Alarm](https://www.alibabacloud.com/help/en/quota-center/developer-reference/api-quotas-2020-05-10-createquotaalarm).
 *
 * > **NOTE:** Available since v1.116.0.
 *
 * ## Import
 *
 * Quotas Quota Alarm can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:quotas/quotaAlarm:QuotaAlarm example <id>
 * ```
 */
export class QuotaAlarm extends pulumi.CustomResource {
    /**
     * Get an existing QuotaAlarm resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: QuotaAlarmState, opts?: pulumi.CustomResourceOptions): QuotaAlarm {
        return new QuotaAlarm(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:quotas/quotaAlarm:QuotaAlarm';

    /**
     * Returns true if the given object is an instance of QuotaAlarm.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is QuotaAlarm {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === QuotaAlarm.__pulumiType;
    }

    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The Product Code.
     */
    public readonly productCode!: pulumi.Output<string>;
    /**
     * The Quota Action Code.
     */
    public readonly quotaActionCode!: pulumi.Output<string>;
    /**
     * The name of Quota Alarm.
     */
    public readonly quotaAlarmName!: pulumi.Output<string>;
    /**
     * The Quota Dimensions. See `quotaDimensions` below.
     */
    public readonly quotaDimensions!: pulumi.Output<outputs.quotas.QuotaAlarmQuotaDimension[] | undefined>;
    /**
     * The threshold of Quota Alarm.
     */
    public readonly threshold!: pulumi.Output<number | undefined>;
    /**
     * The threshold percent of Quota Alarm.
     */
    public readonly thresholdPercent!: pulumi.Output<number | undefined>;
    /**
     * Quota alarm type. Value:
     * - used: Quota used alarm.
     * - usable: alarm for the remaining available quota.
     */
    public readonly thresholdType!: pulumi.Output<string>;
    /**
     * The WebHook of Quota Alarm.
     */
    public readonly webHook!: pulumi.Output<string | undefined>;

    /**
     * Create a QuotaAlarm resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: QuotaAlarmArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: QuotaAlarmArgs | QuotaAlarmState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as QuotaAlarmState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["productCode"] = state ? state.productCode : undefined;
            resourceInputs["quotaActionCode"] = state ? state.quotaActionCode : undefined;
            resourceInputs["quotaAlarmName"] = state ? state.quotaAlarmName : undefined;
            resourceInputs["quotaDimensions"] = state ? state.quotaDimensions : undefined;
            resourceInputs["threshold"] = state ? state.threshold : undefined;
            resourceInputs["thresholdPercent"] = state ? state.thresholdPercent : undefined;
            resourceInputs["thresholdType"] = state ? state.thresholdType : undefined;
            resourceInputs["webHook"] = state ? state.webHook : undefined;
        } else {
            const args = argsOrState as QuotaAlarmArgs | undefined;
            if ((!args || args.productCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'productCode'");
            }
            if ((!args || args.quotaActionCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'quotaActionCode'");
            }
            if ((!args || args.quotaAlarmName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'quotaAlarmName'");
            }
            resourceInputs["productCode"] = args ? args.productCode : undefined;
            resourceInputs["quotaActionCode"] = args ? args.quotaActionCode : undefined;
            resourceInputs["quotaAlarmName"] = args ? args.quotaAlarmName : undefined;
            resourceInputs["quotaDimensions"] = args ? args.quotaDimensions : undefined;
            resourceInputs["threshold"] = args ? args.threshold : undefined;
            resourceInputs["thresholdPercent"] = args ? args.thresholdPercent : undefined;
            resourceInputs["thresholdType"] = args ? args.thresholdType : undefined;
            resourceInputs["webHook"] = args ? args.webHook : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(QuotaAlarm.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering QuotaAlarm resources.
 */
export interface QuotaAlarmState {
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The Product Code.
     */
    productCode?: pulumi.Input<string>;
    /**
     * The Quota Action Code.
     */
    quotaActionCode?: pulumi.Input<string>;
    /**
     * The name of Quota Alarm.
     */
    quotaAlarmName?: pulumi.Input<string>;
    /**
     * The Quota Dimensions. See `quotaDimensions` below.
     */
    quotaDimensions?: pulumi.Input<pulumi.Input<inputs.quotas.QuotaAlarmQuotaDimension>[]>;
    /**
     * The threshold of Quota Alarm.
     */
    threshold?: pulumi.Input<number>;
    /**
     * The threshold percent of Quota Alarm.
     */
    thresholdPercent?: pulumi.Input<number>;
    /**
     * Quota alarm type. Value:
     * - used: Quota used alarm.
     * - usable: alarm for the remaining available quota.
     */
    thresholdType?: pulumi.Input<string>;
    /**
     * The WebHook of Quota Alarm.
     */
    webHook?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a QuotaAlarm resource.
 */
export interface QuotaAlarmArgs {
    /**
     * The Product Code.
     */
    productCode: pulumi.Input<string>;
    /**
     * The Quota Action Code.
     */
    quotaActionCode: pulumi.Input<string>;
    /**
     * The name of Quota Alarm.
     */
    quotaAlarmName: pulumi.Input<string>;
    /**
     * The Quota Dimensions. See `quotaDimensions` below.
     */
    quotaDimensions?: pulumi.Input<pulumi.Input<inputs.quotas.QuotaAlarmQuotaDimension>[]>;
    /**
     * The threshold of Quota Alarm.
     */
    threshold?: pulumi.Input<number>;
    /**
     * The threshold percent of Quota Alarm.
     */
    thresholdPercent?: pulumi.Input<number>;
    /**
     * Quota alarm type. Value:
     * - used: Quota used alarm.
     * - usable: alarm for the remaining available quota.
     */
    thresholdType?: pulumi.Input<string>;
    /**
     * The WebHook of Quota Alarm.
     */
    webHook?: pulumi.Input<string>;
}
