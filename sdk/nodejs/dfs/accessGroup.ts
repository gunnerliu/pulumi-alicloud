// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a DFS Access Group resource.
 *
 * For information about DFS Access Group and how to use it, see [What is Access Group](https://www.alibabacloud.com/help/doc-detail/207144.htm).
 *
 * > **NOTE:** Available since v1.133.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-example";
 * const _default = new alicloud.dfs.AccessGroup("default", {
 *     accessGroupName: name,
 *     networkType: "VPC",
 * });
 * ```
 *
 * ## Import
 *
 * DFS Access Group can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:dfs/accessGroup:AccessGroup example <id>
 * ```
 */
export class AccessGroup extends pulumi.CustomResource {
    /**
     * Get an existing AccessGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessGroupState, opts?: pulumi.CustomResourceOptions): AccessGroup {
        return new AccessGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:dfs/accessGroup:AccessGroup';

    /**
     * Returns true if the given object is an instance of AccessGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessGroup.__pulumiType;
    }

    /**
     * The Name of Access Group.The length of `accessGroupName` does not exceed 100 bytes.
     */
    public readonly accessGroupName!: pulumi.Output<string>;
    /**
     * The Description of Access Group. The length of `description` does not exceed 100 bytes.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The NetworkType of Access Group. Valid values: `VPC`.
     */
    public readonly networkType!: pulumi.Output<string>;

    /**
     * Create a AccessGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessGroupArgs | AccessGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessGroupState | undefined;
            resourceInputs["accessGroupName"] = state ? state.accessGroupName : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["networkType"] = state ? state.networkType : undefined;
        } else {
            const args = argsOrState as AccessGroupArgs | undefined;
            if ((!args || args.accessGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessGroupName'");
            }
            if ((!args || args.networkType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkType'");
            }
            resourceInputs["accessGroupName"] = args ? args.accessGroupName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["networkType"] = args ? args.networkType : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessGroup resources.
 */
export interface AccessGroupState {
    /**
     * The Name of Access Group.The length of `accessGroupName` does not exceed 100 bytes.
     */
    accessGroupName?: pulumi.Input<string>;
    /**
     * The Description of Access Group. The length of `description` does not exceed 100 bytes.
     */
    description?: pulumi.Input<string>;
    /**
     * The NetworkType of Access Group. Valid values: `VPC`.
     */
    networkType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessGroup resource.
 */
export interface AccessGroupArgs {
    /**
     * The Name of Access Group.The length of `accessGroupName` does not exceed 100 bytes.
     */
    accessGroupName: pulumi.Input<string>;
    /**
     * The Description of Access Group. The length of `description` does not exceed 100 bytes.
     */
    description?: pulumi.Input<string>;
    /**
     * The NetworkType of Access Group. Valid values: `VPC`.
     */
    networkType: pulumi.Input<string>;
}
