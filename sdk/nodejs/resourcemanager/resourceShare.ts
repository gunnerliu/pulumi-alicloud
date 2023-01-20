// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Resource Manager Resource Share resource.
 *
 * For information about Resource Manager Resource Share and how to use it, see [What is Resource Share](https://www.alibabacloud.com/help/en/doc-detail/94475.htm).
 *
 * > **NOTE:** Available in v1.111.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.resourcemanager.ResourceShare("example", {resourceShareName: "example_value"});
 * ```
 *
 * ## Import
 *
 * Resource Manager Resource Share can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:resourcemanager/resourceShare:ResourceShare example <id>
 * ```
 */
export class ResourceShare extends pulumi.CustomResource {
    /**
     * Get an existing ResourceShare resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResourceShareState, opts?: pulumi.CustomResourceOptions): ResourceShare {
        return new ResourceShare(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:resourcemanager/resourceShare:ResourceShare';

    /**
     * Returns true if the given object is an instance of ResourceShare.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResourceShare {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResourceShare.__pulumiType;
    }

    /**
     * The name of resource share.
     */
    public readonly resourceShareName!: pulumi.Output<string>;
    /**
     * The owner of resource share.
     */
    public /*out*/ readonly resourceShareOwner!: pulumi.Output<string>;
    /**
     * The status of resource share.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a ResourceShare resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ResourceShareArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResourceShareArgs | ResourceShareState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ResourceShareState | undefined;
            resourceInputs["resourceShareName"] = state ? state.resourceShareName : undefined;
            resourceInputs["resourceShareOwner"] = state ? state.resourceShareOwner : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ResourceShareArgs | undefined;
            if ((!args || args.resourceShareName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceShareName'");
            }
            resourceInputs["resourceShareName"] = args ? args.resourceShareName : undefined;
            resourceInputs["resourceShareOwner"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ResourceShare.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResourceShare resources.
 */
export interface ResourceShareState {
    /**
     * The name of resource share.
     */
    resourceShareName?: pulumi.Input<string>;
    /**
     * The owner of resource share.
     */
    resourceShareOwner?: pulumi.Input<string>;
    /**
     * The status of resource share.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ResourceShare resource.
 */
export interface ResourceShareArgs {
    /**
     * The name of resource share.
     */
    resourceShareName: pulumi.Input<string>;
}
