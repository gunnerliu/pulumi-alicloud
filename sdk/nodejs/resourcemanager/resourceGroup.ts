// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Resource Manager Resource Group resource. If you need to group cloud resources according to business departments, projects, and other dimensions, you can create resource groups.
 * For information about Resource Manager Resoource Group and how to use it, see [What is Resource Manager Resource Group](https://www.alibabacloud.com/help/en/doc-detail/94485.htm)
 *
 * > **NOTE:** Available in v1.82.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.resourcemanager.ResourceGroup("example", {
 *     displayName: "testrd",
 *     resourceGroupName: "testrd",
 * });
 * ```
 *
 * ## Import
 *
 * Resource Manager Resource Group can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:resourcemanager/resourceGroup:ResourceGroup example abc123456
 * ```
 */
export class ResourceGroup extends pulumi.CustomResource {
    /**
     * Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResourceGroupState, opts?: pulumi.CustomResourceOptions): ResourceGroup {
        return new ResourceGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:resourcemanager/resourceGroup:ResourceGroup';

    /**
     * Returns true if the given object is an instance of ResourceGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResourceGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResourceGroup.__pulumiType;
    }

    /**
     * The ID of the Alibaba Cloud account to which the resource group belongs.
     */
    public /*out*/ readonly accountId!: pulumi.Output<string>;
    /**
     * The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Field `name` has been deprecated from version 1.114.0. Use `resourceGroupName` instead.
     *
     * @deprecated Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead.
     */
    public readonly name!: pulumi.Output<string>;
    public /*out*/ readonly regionStatuses!: pulumi.Output<outputs.resourcemanager.ResourceGroupRegionStatus[]>;
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The status of the regional resource group.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a ResourceGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ResourceGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResourceGroupArgs | ResourceGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ResourceGroupState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["regionStatuses"] = state ? state.regionStatuses : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ResourceGroupArgs | undefined;
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["accountId"] = undefined /*out*/;
            resourceInputs["regionStatuses"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ResourceGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResourceGroup resources.
 */
export interface ResourceGroupState {
    /**
     * The ID of the Alibaba Cloud account to which the resource group belongs.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
     */
    displayName?: pulumi.Input<string>;
    /**
     * Field `name` has been deprecated from version 1.114.0. Use `resourceGroupName` instead.
     *
     * @deprecated Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead.
     */
    name?: pulumi.Input<string>;
    regionStatuses?: pulumi.Input<pulumi.Input<inputs.resourcemanager.ResourceGroupRegionStatus>[]>;
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The status of the regional resource group.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ResourceGroup resource.
 */
export interface ResourceGroupArgs {
    /**
     * The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
     */
    displayName: pulumi.Input<string>;
    /**
     * Field `name` has been deprecated from version 1.114.0. Use `resourceGroupName` instead.
     *
     * @deprecated Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead.
     */
    name?: pulumi.Input<string>;
    resourceGroupName?: pulumi.Input<string>;
}
