// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/vpn_route_entry.html.markdown.
 */
export class RouteEntry extends pulumi.CustomResource {
    /**
     * Get an existing RouteEntry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteEntryState, opts?: pulumi.CustomResourceOptions): RouteEntry {
        return new RouteEntry(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpn/routeEntry:RouteEntry';

    /**
     * Returns true if the given object is an instance of RouteEntry.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RouteEntry {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RouteEntry.__pulumiType;
    }

    /**
     * The next hop of the destination route.
     */
    public readonly nextHop!: pulumi.Output<string>;
    /**
     * Whether to issue the destination route to the VPC.
     */
    public readonly publishVpc!: pulumi.Output<boolean>;
    /**
     * The destination network segment of the destination route.
     */
    public readonly routeDest!: pulumi.Output<string>;
    /**
     * The id of the vpn gateway.
     */
    public readonly vpnGatewayId!: pulumi.Output<string>;
    /**
     * The value should be 0 or 100.
     */
    public readonly weight!: pulumi.Output<number>;

    /**
     * Create a RouteEntry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteEntryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RouteEntryArgs | RouteEntryState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as RouteEntryState | undefined;
            inputs["nextHop"] = state ? state.nextHop : undefined;
            inputs["publishVpc"] = state ? state.publishVpc : undefined;
            inputs["routeDest"] = state ? state.routeDest : undefined;
            inputs["vpnGatewayId"] = state ? state.vpnGatewayId : undefined;
            inputs["weight"] = state ? state.weight : undefined;
        } else {
            const args = argsOrState as RouteEntryArgs | undefined;
            if (!args || args.nextHop === undefined) {
                throw new Error("Missing required property 'nextHop'");
            }
            if (!args || args.publishVpc === undefined) {
                throw new Error("Missing required property 'publishVpc'");
            }
            if (!args || args.routeDest === undefined) {
                throw new Error("Missing required property 'routeDest'");
            }
            if (!args || args.vpnGatewayId === undefined) {
                throw new Error("Missing required property 'vpnGatewayId'");
            }
            if (!args || args.weight === undefined) {
                throw new Error("Missing required property 'weight'");
            }
            inputs["nextHop"] = args ? args.nextHop : undefined;
            inputs["publishVpc"] = args ? args.publishVpc : undefined;
            inputs["routeDest"] = args ? args.routeDest : undefined;
            inputs["vpnGatewayId"] = args ? args.vpnGatewayId : undefined;
            inputs["weight"] = args ? args.weight : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(RouteEntry.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RouteEntry resources.
 */
export interface RouteEntryState {
    /**
     * The next hop of the destination route.
     */
    readonly nextHop?: pulumi.Input<string>;
    /**
     * Whether to issue the destination route to the VPC.
     */
    readonly publishVpc?: pulumi.Input<boolean>;
    /**
     * The destination network segment of the destination route.
     */
    readonly routeDest?: pulumi.Input<string>;
    /**
     * The id of the vpn gateway.
     */
    readonly vpnGatewayId?: pulumi.Input<string>;
    /**
     * The value should be 0 or 100.
     */
    readonly weight?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a RouteEntry resource.
 */
export interface RouteEntryArgs {
    /**
     * The next hop of the destination route.
     */
    readonly nextHop: pulumi.Input<string>;
    /**
     * Whether to issue the destination route to the VPC.
     */
    readonly publishVpc: pulumi.Input<boolean>;
    /**
     * The destination network segment of the destination route.
     */
    readonly routeDest: pulumi.Input<string>;
    /**
     * The id of the vpn gateway.
     */
    readonly vpnGatewayId: pulumi.Input<string>;
    /**
     * The value should be 0 or 100.
     */
    readonly weight: pulumi.Input<number>;
}