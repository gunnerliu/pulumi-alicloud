// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Alidns Domain Group resource. For information about Alidns Domain Group and how to use it, see [What is Resource Alidns Domain Group](https://www.alibabacloud.com/help/en/doc-detail/29762.htm).
 *
 * > **NOTE:** Available since v1.84.0.
 *
 * ## Import
 *
 * Alidns domain group can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:dns/domainGroup:DomainGroup example 0932eb3ddee7499085c4d13d45*****
 * ```
 */
export class DomainGroup extends pulumi.CustomResource {
    /**
     * Get an existing DomainGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainGroupState, opts?: pulumi.CustomResourceOptions): DomainGroup {
        return new DomainGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:dns/domainGroup:DomainGroup';

    /**
     * Returns true if the given object is an instance of DomainGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DomainGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DomainGroup.__pulumiType;
    }

    /**
     * The Name of the domain group. The `domainGroupName` is required when the value of the `groupName`  is Empty.
     */
    public readonly domainGroupName!: pulumi.Output<string>;
    /**
     * The Name of the domain group. The `groupName` has been deprecated from provider version 1.97.0. Please use `domainGroupName` instead.
     *
     * @deprecated Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.
     */
    public readonly groupName!: pulumi.Output<string>;
    /**
     * User language.
     */
    public readonly lang!: pulumi.Output<string | undefined>;

    /**
     * Create a DomainGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DomainGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainGroupArgs | DomainGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainGroupState | undefined;
            resourceInputs["domainGroupName"] = state ? state.domainGroupName : undefined;
            resourceInputs["groupName"] = state ? state.groupName : undefined;
            resourceInputs["lang"] = state ? state.lang : undefined;
        } else {
            const args = argsOrState as DomainGroupArgs | undefined;
            resourceInputs["domainGroupName"] = args ? args.domainGroupName : undefined;
            resourceInputs["groupName"] = args ? args.groupName : undefined;
            resourceInputs["lang"] = args ? args.lang : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DomainGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DomainGroup resources.
 */
export interface DomainGroupState {
    /**
     * The Name of the domain group. The `domainGroupName` is required when the value of the `groupName`  is Empty.
     */
    domainGroupName?: pulumi.Input<string>;
    /**
     * The Name of the domain group. The `groupName` has been deprecated from provider version 1.97.0. Please use `domainGroupName` instead.
     *
     * @deprecated Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.
     */
    groupName?: pulumi.Input<string>;
    /**
     * User language.
     */
    lang?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DomainGroup resource.
 */
export interface DomainGroupArgs {
    /**
     * The Name of the domain group. The `domainGroupName` is required when the value of the `groupName`  is Empty.
     */
    domainGroupName?: pulumi.Input<string>;
    /**
     * The Name of the domain group. The `groupName` has been deprecated from provider version 1.97.0. Please use `domainGroupName` instead.
     *
     * @deprecated Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.
     */
    groupName?: pulumi.Input<string>;
    /**
     * User language.
     */
    lang?: pulumi.Input<string>;
}
