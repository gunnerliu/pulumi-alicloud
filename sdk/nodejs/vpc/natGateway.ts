// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Nat gateway can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:vpc/natGateway:NatGateway example <id>
 * ```
 */
export class NatGateway extends pulumi.CustomResource {
    /**
     * Get an existing NatGateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NatGatewayState, opts?: pulumi.CustomResourceOptions): NatGateway {
        return new NatGateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/natGateway:NatGateway';

    /**
     * Returns true if the given object is an instance of NatGateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NatGateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NatGateway.__pulumiType;
    }

    /**
     * Whether enable the deletion protection or not. Default value: `false`.
     * - true: Enable deletion protection.
     * - false: Disable deletion protection.
     */
    public readonly deletionProtection!: pulumi.Output<boolean>;
    /**
     * Description of the nat gateway, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Defaults to null.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether to only precheck this request. Default value: `false`.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The EIP binding mode of the NAT gateway. Default value: `MULTI_BINDED`. Valid values:
     */
    public readonly eipBindMode!: pulumi.Output<string>;
    /**
     * Specifies whether to forcefully delete the NAT gateway.
     */
    public readonly force!: pulumi.Output<boolean | undefined>;
    /**
     * The nat gateway will auto create a forward item.
     */
    public /*out*/ readonly forwardTableIds!: pulumi.Output<string>;
    /**
     * Field `instanceChargeType` has been deprecated from provider version 1.121.0. New field `paymentType` instead.
     */
    public readonly instanceChargeType!: pulumi.Output<string>;
    /**
     * The internet charge type. Valid values `PayByLcu` and `PayBySpec`. The `PayByLcu` is only support enhanced NAT. **NOTE:** From 1.137.0+, The `PayBySpec` has been deprecated.
     */
    public readonly internetChargeType!: pulumi.Output<string>;
    /**
     * Field `name` has been deprecated from provider version 1.121.0. New field `natGatewayName` instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Name of the nat gateway. The value can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Defaults to null.
     */
    public readonly natGatewayName!: pulumi.Output<string>;
    /**
     * The type of NAT gateway. Valid values: `Normal` and `Enhanced`. **NOTE:** From 1.137.0+,  The `Normal` has been deprecated.
     */
    public readonly natType!: pulumi.Output<string>;
    /**
     * Indicates the type of the created NAT gateway. Valid values `internet` and `intranet`. `internet`: Internet NAT Gateway. `intranet`: VPC NAT Gateway.
     */
    public readonly networkType!: pulumi.Output<string>;
    /**
     * The billing method of the NAT gateway. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `paymentType` is `Subscription`. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console. **NOTE:** International station only supports `Subscription`.
     * > **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * The nat gateway will auto create a snat item.
     */
    public /*out*/ readonly snatTableIds!: pulumi.Output<string>;
    /**
     * The specification of the nat gateway. Valid values are `Small`, `Middle` and `Large`. Effective when `internetChargeType` is `PayBySpec` and `networkType` is `internet`. Details refer to [Nat Gateway Specification](https://help.aliyun.com/document_detail/203500.html).
     */
    public readonly specification!: pulumi.Output<string>;
    /**
     * (Available in 1.121.0+) The status of NAT gateway.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The tags of NAT gateway.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The VPC ID.
     */
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * The id of VSwitch.
     */
    public readonly vswitchId!: pulumi.Output<string | undefined>;

    /**
     * Create a NatGateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NatGatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NatGatewayArgs | NatGatewayState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NatGatewayState | undefined;
            resourceInputs["deletionProtection"] = state ? state.deletionProtection : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["eipBindMode"] = state ? state.eipBindMode : undefined;
            resourceInputs["force"] = state ? state.force : undefined;
            resourceInputs["forwardTableIds"] = state ? state.forwardTableIds : undefined;
            resourceInputs["instanceChargeType"] = state ? state.instanceChargeType : undefined;
            resourceInputs["internetChargeType"] = state ? state.internetChargeType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["natGatewayName"] = state ? state.natGatewayName : undefined;
            resourceInputs["natType"] = state ? state.natType : undefined;
            resourceInputs["networkType"] = state ? state.networkType : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["snatTableIds"] = state ? state.snatTableIds : undefined;
            resourceInputs["specification"] = state ? state.specification : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as NatGatewayArgs | undefined;
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["deletionProtection"] = args ? args.deletionProtection : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["eipBindMode"] = args ? args.eipBindMode : undefined;
            resourceInputs["force"] = args ? args.force : undefined;
            resourceInputs["instanceChargeType"] = args ? args.instanceChargeType : undefined;
            resourceInputs["internetChargeType"] = args ? args.internetChargeType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["natGatewayName"] = args ? args.natGatewayName : undefined;
            resourceInputs["natType"] = args ? args.natType : undefined;
            resourceInputs["networkType"] = args ? args.networkType : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["specification"] = args ? args.specification : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["forwardTableIds"] = undefined /*out*/;
            resourceInputs["snatTableIds"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NatGateway.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NatGateway resources.
 */
export interface NatGatewayState {
    /**
     * Whether enable the deletion protection or not. Default value: `false`.
     * - true: Enable deletion protection.
     * - false: Disable deletion protection.
     */
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * Description of the nat gateway, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Defaults to null.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies whether to only precheck this request. Default value: `false`.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The EIP binding mode of the NAT gateway. Default value: `MULTI_BINDED`. Valid values:
     */
    eipBindMode?: pulumi.Input<string>;
    /**
     * Specifies whether to forcefully delete the NAT gateway.
     */
    force?: pulumi.Input<boolean>;
    /**
     * The nat gateway will auto create a forward item.
     */
    forwardTableIds?: pulumi.Input<string>;
    /**
     * Field `instanceChargeType` has been deprecated from provider version 1.121.0. New field `paymentType` instead.
     */
    instanceChargeType?: pulumi.Input<string>;
    /**
     * The internet charge type. Valid values `PayByLcu` and `PayBySpec`. The `PayByLcu` is only support enhanced NAT. **NOTE:** From 1.137.0+, The `PayBySpec` has been deprecated.
     */
    internetChargeType?: pulumi.Input<string>;
    /**
     * Field `name` has been deprecated from provider version 1.121.0. New field `natGatewayName` instead.
     */
    name?: pulumi.Input<string>;
    /**
     * Name of the nat gateway. The value can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Defaults to null.
     */
    natGatewayName?: pulumi.Input<string>;
    /**
     * The type of NAT gateway. Valid values: `Normal` and `Enhanced`. **NOTE:** From 1.137.0+,  The `Normal` has been deprecated.
     */
    natType?: pulumi.Input<string>;
    /**
     * Indicates the type of the created NAT gateway. Valid values `internet` and `intranet`. `internet`: Internet NAT Gateway. `intranet`: VPC NAT Gateway.
     */
    networkType?: pulumi.Input<string>;
    /**
     * The billing method of the NAT gateway. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `paymentType` is `Subscription`. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console. **NOTE:** International station only supports `Subscription`.
     * > **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     */
    period?: pulumi.Input<number>;
    /**
     * The nat gateway will auto create a snat item.
     */
    snatTableIds?: pulumi.Input<string>;
    /**
     * The specification of the nat gateway. Valid values are `Small`, `Middle` and `Large`. Effective when `internetChargeType` is `PayBySpec` and `networkType` is `internet`. Details refer to [Nat Gateway Specification](https://help.aliyun.com/document_detail/203500.html).
     */
    specification?: pulumi.Input<string>;
    /**
     * (Available in 1.121.0+) The status of NAT gateway.
     */
    status?: pulumi.Input<string>;
    /**
     * The tags of NAT gateway.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The VPC ID.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The id of VSwitch.
     */
    vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NatGateway resource.
 */
export interface NatGatewayArgs {
    /**
     * Whether enable the deletion protection or not. Default value: `false`.
     * - true: Enable deletion protection.
     * - false: Disable deletion protection.
     */
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * Description of the nat gateway, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Defaults to null.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies whether to only precheck this request. Default value: `false`.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The EIP binding mode of the NAT gateway. Default value: `MULTI_BINDED`. Valid values:
     */
    eipBindMode?: pulumi.Input<string>;
    /**
     * Specifies whether to forcefully delete the NAT gateway.
     */
    force?: pulumi.Input<boolean>;
    /**
     * Field `instanceChargeType` has been deprecated from provider version 1.121.0. New field `paymentType` instead.
     */
    instanceChargeType?: pulumi.Input<string>;
    /**
     * The internet charge type. Valid values `PayByLcu` and `PayBySpec`. The `PayByLcu` is only support enhanced NAT. **NOTE:** From 1.137.0+, The `PayBySpec` has been deprecated.
     */
    internetChargeType?: pulumi.Input<string>;
    /**
     * Field `name` has been deprecated from provider version 1.121.0. New field `natGatewayName` instead.
     */
    name?: pulumi.Input<string>;
    /**
     * Name of the nat gateway. The value can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Defaults to null.
     */
    natGatewayName?: pulumi.Input<string>;
    /**
     * The type of NAT gateway. Valid values: `Normal` and `Enhanced`. **NOTE:** From 1.137.0+,  The `Normal` has been deprecated.
     */
    natType?: pulumi.Input<string>;
    /**
     * Indicates the type of the created NAT gateway. Valid values `internet` and `intranet`. `internet`: Internet NAT Gateway. `intranet`: VPC NAT Gateway.
     */
    networkType?: pulumi.Input<string>;
    /**
     * The billing method of the NAT gateway. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The duration that you will buy the resource, in month. It is valid when `paymentType` is `Subscription`. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console. **NOTE:** International station only supports `Subscription`.
     * > **NOTE:** The attribute `period` is only used to create Subscription instance or modify the PayAsYouGo instance to Subscription. Once effect, it will not be modified that means running `pulumi up` will not effect the resource.
     */
    period?: pulumi.Input<number>;
    /**
     * The specification of the nat gateway. Valid values are `Small`, `Middle` and `Large`. Effective when `internetChargeType` is `PayBySpec` and `networkType` is `internet`. Details refer to [Nat Gateway Specification](https://help.aliyun.com/document_detail/203500.html).
     */
    specification?: pulumi.Input<string>;
    /**
     * The tags of NAT gateway.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The VPC ID.
     */
    vpcId: pulumi.Input<string>;
    /**
     * The id of VSwitch.
     */
    vswitchId?: pulumi.Input<string>;
}
