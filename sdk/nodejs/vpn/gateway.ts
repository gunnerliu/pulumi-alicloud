// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class Gateway extends pulumi.CustomResource {
    /**
     * Get an existing Gateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewayState, opts?: pulumi.CustomResourceOptions): Gateway {
        return new Gateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpn/gateway:Gateway';

    /**
     * Returns true if the given object is an instance of Gateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Gateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Gateway.__pulumiType;
    }

    public readonly bandwidth!: pulumi.Output<number>;
    /**
     * The business status of the VPN gateway.
     */
    public /*out*/ readonly businessStatus!: pulumi.Output<string>;
    /**
     * The description of the VPN instance.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
     */
    public readonly enableIpsec!: pulumi.Output<boolean | undefined>;
    /**
     * Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
     */
    public readonly enableSsl!: pulumi.Output<boolean | undefined>;
    /**
     * The charge type for instance. If it is an international site account, the valid value is PostPaid, otherwise PrePaid. 
     * Default to PostPaid.
     */
    public readonly instanceChargeType!: pulumi.Output<string | undefined>;
    /**
     * The internet ip of the VPN.
     */
    public /*out*/ readonly internetIp!: pulumi.Output<string>;
    /**
     * The name of the VPN. Defaults to null.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1. 
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different. 
     * This field is ignored when enableSsl is false.
     */
    public readonly sslConnections!: pulumi.Output<number | undefined>;
    /**
     * The status of the VPN gateway.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The VPN belongs the vpc_id, the field can't be changed.
     */
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * The VPN belongs the vswitch_id, the field can't be changed.
     */
    public readonly vswitchId!: pulumi.Output<string>;

    /**
     * Create a Gateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GatewayArgs | GatewayState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as GatewayState | undefined;
            inputs["bandwidth"] = state ? state.bandwidth : undefined;
            inputs["businessStatus"] = state ? state.businessStatus : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["enableIpsec"] = state ? state.enableIpsec : undefined;
            inputs["enableSsl"] = state ? state.enableSsl : undefined;
            inputs["instanceChargeType"] = state ? state.instanceChargeType : undefined;
            inputs["internetIp"] = state ? state.internetIp : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["period"] = state ? state.period : undefined;
            inputs["sslConnections"] = state ? state.sslConnections : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["vpcId"] = state ? state.vpcId : undefined;
            inputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as GatewayArgs | undefined;
            if (!args || args.bandwidth === undefined) {
                throw new Error("Missing required property 'bandwidth'");
            }
            if (!args || args.vpcId === undefined) {
                throw new Error("Missing required property 'vpcId'");
            }
            inputs["bandwidth"] = args ? args.bandwidth : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["enableIpsec"] = args ? args.enableIpsec : undefined;
            inputs["enableSsl"] = args ? args.enableSsl : undefined;
            inputs["instanceChargeType"] = args ? args.instanceChargeType : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["period"] = args ? args.period : undefined;
            inputs["sslConnections"] = args ? args.sslConnections : undefined;
            inputs["vpcId"] = args ? args.vpcId : undefined;
            inputs["vswitchId"] = args ? args.vswitchId : undefined;
            inputs["businessStatus"] = undefined /*out*/;
            inputs["internetIp"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Gateway.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Gateway resources.
 */
export interface GatewayState {
    readonly bandwidth?: pulumi.Input<number>;
    /**
     * The business status of the VPN gateway.
     */
    readonly businessStatus?: pulumi.Input<string>;
    /**
     * The description of the VPN instance.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
     */
    readonly enableIpsec?: pulumi.Input<boolean>;
    /**
     * Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
     */
    readonly enableSsl?: pulumi.Input<boolean>;
    /**
     * The charge type for instance. If it is an international site account, the valid value is PostPaid, otherwise PrePaid. 
     * Default to PostPaid.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * The internet ip of the VPN.
     */
    readonly internetIp?: pulumi.Input<string>;
    /**
     * The name of the VPN. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1. 
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different. 
     * This field is ignored when enableSsl is false.
     */
    readonly sslConnections?: pulumi.Input<number>;
    /**
     * The status of the VPN gateway.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The VPN belongs the vpc_id, the field can't be changed.
     */
    readonly vpcId?: pulumi.Input<string>;
    /**
     * The VPN belongs the vswitch_id, the field can't be changed.
     */
    readonly vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Gateway resource.
 */
export interface GatewayArgs {
    readonly bandwidth: pulumi.Input<number>;
    /**
     * The description of the VPN instance.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
     */
    readonly enableIpsec?: pulumi.Input<boolean>;
    /**
     * Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
     */
    readonly enableSsl?: pulumi.Input<boolean>;
    /**
     * The charge type for instance. If it is an international site account, the valid value is PostPaid, otherwise PrePaid. 
     * Default to PostPaid.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * The name of the VPN. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1. 
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different. 
     * This field is ignored when enableSsl is false.
     */
    readonly sslConnections?: pulumi.Input<number>;
    /**
     * The VPN belongs the vpc_id, the field can't be changed.
     */
    readonly vpcId: pulumi.Input<string>;
    /**
     * The VPN belongs the vswitch_id, the field can't be changed.
     */
    readonly vswitchId?: pulumi.Input<string>;
}
