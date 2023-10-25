// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Alidns Address Pool resource.
 *
 * For information about Alidns Address Pool and how to use it, see [What is Address Pool](https://www.alibabacloud.com/help/doc-detail/189621.html).
 *
 * > **NOTE:** Available since v1.152.0.
 *
 * ## Import
 *
 * Alidns Address Pool can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:dns/addressPool:AddressPool example <id>
 * ```
 */
export class AddressPool extends pulumi.CustomResource {
    /**
     * Get an existing AddressPool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AddressPoolState, opts?: pulumi.CustomResourceOptions): AddressPool {
        return new AddressPool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:dns/addressPool:AddressPool';

    /**
     * Returns true if the given object is an instance of AddressPool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AddressPool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AddressPool.__pulumiType;
    }

    /**
     * The name of the address pool.
     */
    public readonly addressPoolName!: pulumi.Output<string>;
    /**
     * The address lists of the Address Pool. See `address` below for details.
     */
    public readonly addresses!: pulumi.Output<outputs.dns.AddressPoolAddress[]>;
    /**
     * The ID of the instance.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The load balancing policy of the address pool. Valid values:`ALL_RR` or `RATIO`. `ALL_RR`: returns all addresses. `RATIO`: returns addresses by weight.
     */
    public readonly lbaStrategy!: pulumi.Output<string>;
    /**
     * The type of the address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a AddressPool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AddressPoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AddressPoolArgs | AddressPoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AddressPoolState | undefined;
            resourceInputs["addressPoolName"] = state ? state.addressPoolName : undefined;
            resourceInputs["addresses"] = state ? state.addresses : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["lbaStrategy"] = state ? state.lbaStrategy : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as AddressPoolArgs | undefined;
            if ((!args || args.addressPoolName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'addressPoolName'");
            }
            if ((!args || args.addresses === undefined) && !opts.urn) {
                throw new Error("Missing required property 'addresses'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.lbaStrategy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'lbaStrategy'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["addressPoolName"] = args ? args.addressPoolName : undefined;
            resourceInputs["addresses"] = args ? args.addresses : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["lbaStrategy"] = args ? args.lbaStrategy : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AddressPool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AddressPool resources.
 */
export interface AddressPoolState {
    /**
     * The name of the address pool.
     */
    addressPoolName?: pulumi.Input<string>;
    /**
     * The address lists of the Address Pool. See `address` below for details.
     */
    addresses?: pulumi.Input<pulumi.Input<inputs.dns.AddressPoolAddress>[]>;
    /**
     * The ID of the instance.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The load balancing policy of the address pool. Valid values:`ALL_RR` or `RATIO`. `ALL_RR`: returns all addresses. `RATIO`: returns addresses by weight.
     */
    lbaStrategy?: pulumi.Input<string>;
    /**
     * The type of the address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AddressPool resource.
 */
export interface AddressPoolArgs {
    /**
     * The name of the address pool.
     */
    addressPoolName: pulumi.Input<string>;
    /**
     * The address lists of the Address Pool. See `address` below for details.
     */
    addresses: pulumi.Input<pulumi.Input<inputs.dns.AddressPoolAddress>[]>;
    /**
     * The ID of the instance.
     */
    instanceId: pulumi.Input<string>;
    /**
     * The load balancing policy of the address pool. Valid values:`ALL_RR` or `RATIO`. `ALL_RR`: returns all addresses. `RATIO`: returns addresses by weight.
     */
    lbaStrategy: pulumi.Input<string>;
    /**
     * The type of the address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
     */
    type: pulumi.Input<string>;
}
