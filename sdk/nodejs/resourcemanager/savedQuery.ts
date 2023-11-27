// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Resource Manager Saved Query resource. Saved Query Requests.
 *
 * For information about Resource Manager Saved Query and how to use it, see [What is Saved Query](https://www.alibabacloud.com/help/zh/resource-management/developer-reference/api-resourcecenter-2022-12-01-createsavedquery).
 *
 * > **NOTE:** Available since v1.212.0.
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
 * const name = config.get("name") || "terraform-example";
 * const _default = new alicloud.resourcemanager.SavedQuery("default", {
 *     description: name,
 *     expression: "select * from resources limit 1;",
 *     savedQueryName: name,
 * });
 * ```
 *
 * ## Import
 *
 * Resource Manager Saved Query can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:resourcemanager/savedQuery:SavedQuery example <id>
 * ```
 */
export class SavedQuery extends pulumi.CustomResource {
    /**
     * Get an existing SavedQuery resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SavedQueryState, opts?: pulumi.CustomResourceOptions): SavedQuery {
        return new SavedQuery(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:resourcemanager/savedQuery:SavedQuery';

    /**
     * Returns true if the given object is an instance of SavedQuery.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SavedQuery {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SavedQuery.__pulumiType;
    }

    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Query Description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Query Expression.
     */
    public readonly expression!: pulumi.Output<string>;
    /**
     * The name of the resource.
     */
    public readonly savedQueryName!: pulumi.Output<string>;

    /**
     * Create a SavedQuery resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SavedQueryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SavedQueryArgs | SavedQueryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SavedQueryState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["expression"] = state ? state.expression : undefined;
            resourceInputs["savedQueryName"] = state ? state.savedQueryName : undefined;
        } else {
            const args = argsOrState as SavedQueryArgs | undefined;
            if ((!args || args.expression === undefined) && !opts.urn) {
                throw new Error("Missing required property 'expression'");
            }
            if ((!args || args.savedQueryName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'savedQueryName'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["expression"] = args ? args.expression : undefined;
            resourceInputs["savedQueryName"] = args ? args.savedQueryName : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SavedQuery.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SavedQuery resources.
 */
export interface SavedQueryState {
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Query Description.
     */
    description?: pulumi.Input<string>;
    /**
     * Query Expression.
     */
    expression?: pulumi.Input<string>;
    /**
     * The name of the resource.
     */
    savedQueryName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SavedQuery resource.
 */
export interface SavedQueryArgs {
    /**
     * Query Description.
     */
    description?: pulumi.Input<string>;
    /**
     * Query Expression.
     */
    expression: pulumi.Input<string>;
    /**
     * The name of the resource.
     */
    savedQueryName: pulumi.Input<string>;
}
