// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an elastic IP resource.
 *
 * > **DEPRECATED:**  This resource  has been deprecated from version `1.126.0`. Please use new resource alicloud_eip_address.
 *
 * > **NOTE:** The resource only supports to create `PostPaid PayByTraffic`  or `PrePaid PayByBandwidth` elastic IP for international account. Otherwise, you will happened error `COMMODITY.INVALID_COMPONENT`.
 * Your account is international if you can use it to login in [International Web Console](https://account.alibabacloud.com/login/login.htm).
 *
 * > **NOTE:** From version 1.10.1, this resource supports creating "PrePaid" EIP. In addition, it supports setting EIP name and description.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Create a new EIP.
 * const example = new alicloud.ecs.Eip("example", {
 *     bandwidth: "10",
 *     internetChargeType: "PayByBandwidth",
 * });
 * ```
 * ## Module Support
 *
 * You can use the existing eip module
 * to create several EIP instances and associate them with other resources one-click, like ECS instances, SLB, Nat Gateway and so on.
 *
 * ## Import
 *
 * Elastic IP address can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ecs/eip:Eip example eip-abc12345678
 * ```
 *
 * @deprecated This resource has been deprecated in favour of the EipAddress resource
 */
export class Eip extends pulumi.CustomResource {
    /**
     * Get an existing Eip resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EipState, opts?: pulumi.CustomResourceOptions): Eip {
        pulumi.log.warn("Eip is deprecated: This resource has been deprecated in favour of the EipAddress resource")
        return new Eip(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/eip:Eip';

    /**
     * Returns true if the given object is an instance of Eip.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Eip {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Eip.__pulumiType;
    }

    public readonly activityId!: pulumi.Output<string | undefined>;
    /**
     * The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
     */
    public readonly addressName!: pulumi.Output<string>;
    public readonly autoPay!: pulumi.Output<boolean | undefined>;
    /**
     * Maximum bandwidth to the elastic public network, measured in Mbps (Mega bit per second). If this value is not specified, then automatically sets it to 5 Mbps.
     */
    public readonly bandwidth!: pulumi.Output<string>;
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Whether enable the deletion protection or not. Default value: `false`.
     * - true: Enable deletion protection.
     * - false: Disable deletion protection.
     */
    public readonly deletionProtection!: pulumi.Output<boolean>;
    /**
     * Description of the EIP instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly highDefinitionMonitorLogStatus!: pulumi.Output<string>;
    /**
     * (It has been deprecated from version 1.126.0 and using new attribute `paymentType` instead) Elastic IP instance charge type. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
     *
     * @deprecated Field 'instance_charge_type' has been deprecated since provider version 1.126.0. New field 'payment_type' instead.
     */
    public readonly instanceChargeType!: pulumi.Output<string>;
    /**
     * Internet charge type of the EIP, Valid values are `PayByBandwidth`, `PayByTraffic`. Default to `PayByBandwidth`. **NOTE:** From version `1.7.1` to `1.125.0`, it defaults to `PayByTraffic`. It is only "PayByBandwidth" when `instanceChargeType` is PrePaid.
     */
    public readonly internetChargeType!: pulumi.Output<string>;
    /**
     * The elastic ip address
     */
    public readonly ipAddress!: pulumi.Output<string>;
    /**
     * The line type of the Elastic IP instance. Default to `BGP`. Other type of the isp need to open a whitelist.
     */
    public readonly isp!: pulumi.Output<string>;
    public readonly logProject!: pulumi.Output<string | undefined>;
    public readonly logStore!: pulumi.Output<string | undefined>;
    /**
     * It has been deprecated from version 1.126.0 and using new attribute `addressName` instead.
     *
     * @deprecated Field 'name' has been deprecated since provider version 1.126.0. New field 'address_name' instead.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly netmode!: pulumi.Output<string>;
    /**
     * The billing method of the EIP. Valid values: `Subscription` and `PayAsYouGo`. Default value is `PayAsYouGo`.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `instanceChargeType` is `PrePaid`. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
     * **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    public readonly pricingCycle!: pulumi.Output<string | undefined>;
    public readonly publicIpAddressPoolId!: pulumi.Output<string | undefined>;
    /**
     * The Id of resource group which the eip belongs.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    public readonly securityProtectionTypes!: pulumi.Output<string[] | undefined>;
    /**
     * The EIP current status.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    public readonly zone!: pulumi.Output<string>;

    /**
     * Create a Eip resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    /** @deprecated This resource has been deprecated in favour of the EipAddress resource */
    constructor(name: string, args?: EipArgs, opts?: pulumi.CustomResourceOptions)
    /** @deprecated This resource has been deprecated in favour of the EipAddress resource */
    constructor(name: string, argsOrState?: EipArgs | EipState, opts?: pulumi.CustomResourceOptions) {
        pulumi.log.warn("Eip is deprecated: This resource has been deprecated in favour of the EipAddress resource")
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EipState | undefined;
            resourceInputs["activityId"] = state ? state.activityId : undefined;
            resourceInputs["addressName"] = state ? state.addressName : undefined;
            resourceInputs["autoPay"] = state ? state.autoPay : undefined;
            resourceInputs["bandwidth"] = state ? state.bandwidth : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["deletionProtection"] = state ? state.deletionProtection : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["highDefinitionMonitorLogStatus"] = state ? state.highDefinitionMonitorLogStatus : undefined;
            resourceInputs["instanceChargeType"] = state ? state.instanceChargeType : undefined;
            resourceInputs["internetChargeType"] = state ? state.internetChargeType : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["isp"] = state ? state.isp : undefined;
            resourceInputs["logProject"] = state ? state.logProject : undefined;
            resourceInputs["logStore"] = state ? state.logStore : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["netmode"] = state ? state.netmode : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["pricingCycle"] = state ? state.pricingCycle : undefined;
            resourceInputs["publicIpAddressPoolId"] = state ? state.publicIpAddressPoolId : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["securityProtectionTypes"] = state ? state.securityProtectionTypes : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["zone"] = state ? state.zone : undefined;
        } else {
            const args = argsOrState as EipArgs | undefined;
            resourceInputs["activityId"] = args ? args.activityId : undefined;
            resourceInputs["addressName"] = args ? args.addressName : undefined;
            resourceInputs["autoPay"] = args ? args.autoPay : undefined;
            resourceInputs["bandwidth"] = args ? args.bandwidth : undefined;
            resourceInputs["deletionProtection"] = args ? args.deletionProtection : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["highDefinitionMonitorLogStatus"] = args ? args.highDefinitionMonitorLogStatus : undefined;
            resourceInputs["instanceChargeType"] = args ? args.instanceChargeType : undefined;
            resourceInputs["internetChargeType"] = args ? args.internetChargeType : undefined;
            resourceInputs["ipAddress"] = args ? args.ipAddress : undefined;
            resourceInputs["isp"] = args ? args.isp : undefined;
            resourceInputs["logProject"] = args ? args.logProject : undefined;
            resourceInputs["logStore"] = args ? args.logStore : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["netmode"] = args ? args.netmode : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["pricingCycle"] = args ? args.pricingCycle : undefined;
            resourceInputs["publicIpAddressPoolId"] = args ? args.publicIpAddressPoolId : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["securityProtectionTypes"] = args ? args.securityProtectionTypes : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["zone"] = args ? args.zone : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Eip.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Eip resources.
 */
export interface EipState {
    activityId?: pulumi.Input<string>;
    /**
     * The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
     */
    addressName?: pulumi.Input<string>;
    autoPay?: pulumi.Input<boolean>;
    /**
     * Maximum bandwidth to the elastic public network, measured in Mbps (Mega bit per second). If this value is not specified, then automatically sets it to 5 Mbps.
     */
    bandwidth?: pulumi.Input<string>;
    createTime?: pulumi.Input<string>;
    /**
     * Whether enable the deletion protection or not. Default value: `false`.
     * - true: Enable deletion protection.
     * - false: Disable deletion protection.
     */
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * Description of the EIP instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    description?: pulumi.Input<string>;
    highDefinitionMonitorLogStatus?: pulumi.Input<string>;
    /**
     * (It has been deprecated from version 1.126.0 and using new attribute `paymentType` instead) Elastic IP instance charge type. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
     *
     * @deprecated Field 'instance_charge_type' has been deprecated since provider version 1.126.0. New field 'payment_type' instead.
     */
    instanceChargeType?: pulumi.Input<string>;
    /**
     * Internet charge type of the EIP, Valid values are `PayByBandwidth`, `PayByTraffic`. Default to `PayByBandwidth`. **NOTE:** From version `1.7.1` to `1.125.0`, it defaults to `PayByTraffic`. It is only "PayByBandwidth" when `instanceChargeType` is PrePaid.
     */
    internetChargeType?: pulumi.Input<string>;
    /**
     * The elastic ip address
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * The line type of the Elastic IP instance. Default to `BGP`. Other type of the isp need to open a whitelist.
     */
    isp?: pulumi.Input<string>;
    logProject?: pulumi.Input<string>;
    logStore?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.126.0 and using new attribute `addressName` instead.
     *
     * @deprecated Field 'name' has been deprecated since provider version 1.126.0. New field 'address_name' instead.
     */
    name?: pulumi.Input<string>;
    netmode?: pulumi.Input<string>;
    /**
     * The billing method of the EIP. Valid values: `Subscription` and `PayAsYouGo`. Default value is `PayAsYouGo`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `instanceChargeType` is `PrePaid`. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
     * **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     */
    period?: pulumi.Input<number>;
    pricingCycle?: pulumi.Input<string>;
    publicIpAddressPoolId?: pulumi.Input<string>;
    /**
     * The Id of resource group which the eip belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    securityProtectionTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The EIP current status.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    zone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Eip resource.
 */
export interface EipArgs {
    activityId?: pulumi.Input<string>;
    /**
     * The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
     */
    addressName?: pulumi.Input<string>;
    autoPay?: pulumi.Input<boolean>;
    /**
     * Maximum bandwidth to the elastic public network, measured in Mbps (Mega bit per second). If this value is not specified, then automatically sets it to 5 Mbps.
     */
    bandwidth?: pulumi.Input<string>;
    /**
     * Whether enable the deletion protection or not. Default value: `false`.
     * - true: Enable deletion protection.
     * - false: Disable deletion protection.
     */
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * Description of the EIP instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    description?: pulumi.Input<string>;
    highDefinitionMonitorLogStatus?: pulumi.Input<string>;
    /**
     * (It has been deprecated from version 1.126.0 and using new attribute `paymentType` instead) Elastic IP instance charge type. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
     *
     * @deprecated Field 'instance_charge_type' has been deprecated since provider version 1.126.0. New field 'payment_type' instead.
     */
    instanceChargeType?: pulumi.Input<string>;
    /**
     * Internet charge type of the EIP, Valid values are `PayByBandwidth`, `PayByTraffic`. Default to `PayByBandwidth`. **NOTE:** From version `1.7.1` to `1.125.0`, it defaults to `PayByTraffic`. It is only "PayByBandwidth" when `instanceChargeType` is PrePaid.
     */
    internetChargeType?: pulumi.Input<string>;
    /**
     * The elastic ip address
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * The line type of the Elastic IP instance. Default to `BGP`. Other type of the isp need to open a whitelist.
     */
    isp?: pulumi.Input<string>;
    logProject?: pulumi.Input<string>;
    logStore?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.126.0 and using new attribute `addressName` instead.
     *
     * @deprecated Field 'name' has been deprecated since provider version 1.126.0. New field 'address_name' instead.
     */
    name?: pulumi.Input<string>;
    netmode?: pulumi.Input<string>;
    /**
     * The billing method of the EIP. Valid values: `Subscription` and `PayAsYouGo`. Default value is `PayAsYouGo`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `instanceChargeType` is `PrePaid`. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
     * **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     */
    period?: pulumi.Input<number>;
    pricingCycle?: pulumi.Input<string>;
    publicIpAddressPoolId?: pulumi.Input<string>;
    /**
     * The Id of resource group which the eip belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    securityProtectionTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    zone?: pulumi.Input<string>;
}
