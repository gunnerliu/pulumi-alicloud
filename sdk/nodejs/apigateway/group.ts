// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.apigateway.Group("default", {description: "tf_example"});
 * ```
 *
 * ## Import
 *
 * Api gateway group can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:apigateway/group:Group example "ab2351f2ce904edaa8d92a0510832b91"
 * ```
 */
export class Group extends pulumi.CustomResource {
    /**
     * Get an existing Group resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupState, opts?: pulumi.CustomResourceOptions): Group {
        return new Group(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:apigateway/group:Group';

    /**
     * Returns true if the given object is an instance of Group.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Group {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Group.__pulumiType;
    }

    /**
     * The description of the api gateway group. Defaults to null.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The id of the api gateway.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The name of the api gateway group. Defaults to null.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * (Available in 1.69.0+)	Second-level domain name automatically assigned to the API group.
     */
    public /*out*/ readonly subDomain!: pulumi.Output<string>;
    /**
     * (Available in 1.69.0+)	Second-level VPC domain name automatically assigned to the API group.
     */
    public /*out*/ readonly vpcDomain!: pulumi.Output<string>;

    /**
     * Create a Group resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GroupArgs | GroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GroupState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["subDomain"] = state ? state.subDomain : undefined;
            resourceInputs["vpcDomain"] = state ? state.vpcDomain : undefined;
        } else {
            const args = argsOrState as GroupArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["subDomain"] = undefined /*out*/;
            resourceInputs["vpcDomain"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Group.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Group resources.
 */
export interface GroupState {
    /**
     * The description of the api gateway group. Defaults to null.
     */
    description?: pulumi.Input<string>;
    /**
     * The id of the api gateway.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The name of the api gateway group. Defaults to null.
     */
    name?: pulumi.Input<string>;
    /**
     * (Available in 1.69.0+)	Second-level domain name automatically assigned to the API group.
     */
    subDomain?: pulumi.Input<string>;
    /**
     * (Available in 1.69.0+)	Second-level VPC domain name automatically assigned to the API group.
     */
    vpcDomain?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Group resource.
 */
export interface GroupArgs {
    /**
     * The description of the api gateway group. Defaults to null.
     */
    description: pulumi.Input<string>;
    /**
     * The id of the api gateway.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The name of the api gateway group. Defaults to null.
     */
    name?: pulumi.Input<string>;
}
