// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Resource Manager Resource Directory resource. Resource Directory enables you to establish an organizational structure for the resources used by applications of your enterprise. You can plan, build, and manage the resources in a centralized manner by using only one resource directory.
 *
 * For information about Resource Manager Resource Directory and how to use it, see [What is Resource Manager Resource Directory](https://www.alibabacloud.com/help/en/doc-detail/94475.htm).
 *
 * > **NOTE:** Available in v1.84.0+.
 *
 * > **NOTE:** An account can only be used to enable a resource directory after it passes enterprise real-name verification. An account that only passed individual real-name verification cannot be used to enable a resource directory.
 *
 * > **NOTE:** Before you destroy the resource, make sure that the following requirements are met:
 *   - All member accounts must be removed from the resource directory.
 *   - All folders except the root folder must be deleted from the resource directory.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.resourcemanager.ResourceDirectory("example", {
 *     // Enable the control policy
 *     status: "Enabled",
 * });
 * ```
 *
 * ## Import
 *
 * Resource Manager Resource Directory can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:resourcemanager/resourceDirectory:ResourceDirectory example rd-s3****
 * ```
 */
export class ResourceDirectory extends pulumi.CustomResource {
    /**
     * Get an existing ResourceDirectory resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResourceDirectoryState, opts?: pulumi.CustomResourceOptions): ResourceDirectory {
        return new ResourceDirectory(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:resourcemanager/resourceDirectory:ResourceDirectory';

    /**
     * Returns true if the given object is an instance of ResourceDirectory.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResourceDirectory {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResourceDirectory.__pulumiType;
    }

    /**
     * The ID of the master account.
     */
    public /*out*/ readonly masterAccountId!: pulumi.Output<string>;
    /**
     * The name of the master account.
     */
    public /*out*/ readonly masterAccountName!: pulumi.Output<string>;
    /**
     * The ID of the root folder.
     */
    public /*out*/ readonly rootFolderId!: pulumi.Output<string>;
    /**
     * The status of control policy. Valid values:`Enabled` and `Disabled`. Default value is `Disabled`.
     */
    public readonly status!: pulumi.Output<string | undefined>;

    /**
     * Create a ResourceDirectory resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ResourceDirectoryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResourceDirectoryArgs | ResourceDirectoryState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ResourceDirectoryState | undefined;
            inputs["masterAccountId"] = state ? state.masterAccountId : undefined;
            inputs["masterAccountName"] = state ? state.masterAccountName : undefined;
            inputs["rootFolderId"] = state ? state.rootFolderId : undefined;
            inputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ResourceDirectoryArgs | undefined;
            inputs["status"] = args ? args.status : undefined;
            inputs["masterAccountId"] = undefined /*out*/;
            inputs["masterAccountName"] = undefined /*out*/;
            inputs["rootFolderId"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ResourceDirectory.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResourceDirectory resources.
 */
export interface ResourceDirectoryState {
    /**
     * The ID of the master account.
     */
    readonly masterAccountId?: pulumi.Input<string>;
    /**
     * The name of the master account.
     */
    readonly masterAccountName?: pulumi.Input<string>;
    /**
     * The ID of the root folder.
     */
    readonly rootFolderId?: pulumi.Input<string>;
    /**
     * The status of control policy. Valid values:`Enabled` and `Disabled`. Default value is `Disabled`.
     */
    readonly status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ResourceDirectory resource.
 */
export interface ResourceDirectoryArgs {
    /**
     * The status of control policy. Valid values:`Enabled` and `Disabled`. Default value is `Disabled`.
     */
    readonly status?: pulumi.Input<string>;
}
