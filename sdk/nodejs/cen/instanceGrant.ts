// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a CEN child instance grant resource, which allow you to authorize a VPC or VBR to a CEN of a different account.
 *
 * For more information about how to use it, see [Attach a network in a different account](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-attachcenchildinstance).
 *
 * > **NOTE:** Available since v1.37.0.
 *
 * ## Import
 *
 * CEN instance can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cen/instanceGrant:InstanceGrant example cen-abc123456:vpc-abc123456:uid123456
 * ```
 */
export class InstanceGrant extends pulumi.CustomResource {
    /**
     * Get an existing InstanceGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceGrantState, opts?: pulumi.CustomResourceOptions): InstanceGrant {
        return new InstanceGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/instanceGrant:InstanceGrant';

    /**
     * Returns true if the given object is an instance of InstanceGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceGrant.__pulumiType;
    }

    /**
     * The ID of the CEN.
     */
    public readonly cenId!: pulumi.Output<string>;
    /**
     * The owner UID of the  CEN which the child instance granted to.
     */
    public readonly cenOwnerId!: pulumi.Output<string>;
    /**
     * The ID of the child instance to grant.
     */
    public readonly childInstanceId!: pulumi.Output<string>;

    /**
     * Create a InstanceGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceGrantArgs | InstanceGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceGrantState | undefined;
            resourceInputs["cenId"] = state ? state.cenId : undefined;
            resourceInputs["cenOwnerId"] = state ? state.cenOwnerId : undefined;
            resourceInputs["childInstanceId"] = state ? state.childInstanceId : undefined;
        } else {
            const args = argsOrState as InstanceGrantArgs | undefined;
            if ((!args || args.cenId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cenId'");
            }
            if ((!args || args.cenOwnerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cenOwnerId'");
            }
            if ((!args || args.childInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'childInstanceId'");
            }
            resourceInputs["cenId"] = args ? args.cenId : undefined;
            resourceInputs["cenOwnerId"] = args ? args.cenOwnerId : undefined;
            resourceInputs["childInstanceId"] = args ? args.childInstanceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InstanceGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceGrant resources.
 */
export interface InstanceGrantState {
    /**
     * The ID of the CEN.
     */
    cenId?: pulumi.Input<string>;
    /**
     * The owner UID of the  CEN which the child instance granted to.
     */
    cenOwnerId?: pulumi.Input<string>;
    /**
     * The ID of the child instance to grant.
     */
    childInstanceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstanceGrant resource.
 */
export interface InstanceGrantArgs {
    /**
     * The ID of the CEN.
     */
    cenId: pulumi.Input<string>;
    /**
     * The owner UID of the  CEN which the child instance granted to.
     */
    cenOwnerId: pulumi.Input<string>;
    /**
     * The ID of the child instance to grant.
     */
    childInstanceId: pulumi.Input<string>;
}
