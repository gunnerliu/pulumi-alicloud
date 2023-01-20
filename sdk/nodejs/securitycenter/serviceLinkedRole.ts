// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Using this resource can create SecurityCenter service-linked role : `AliyunServiceRolePolicyForSas`.  This Role is a Resource Access Management (RAM) role, which to obtain permissions to access another Alibaba Cloud service.
 *
 * For information about Security Center Service Role and how to use it, see [What is Security Center](https://www.alibabacloud.com/help/en/doc-detail/42302.htm).
 *
 * > **NOTE:** Available in v1.142.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const serviceLinkedRole = new alicloud.securitycenter.ServiceLinkedRole("serviceLinkedRole", {});
 * ```
 *
 * ## Import
 *
 * SecurityCenter service-linked roles(SLR) can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:securitycenter/serviceLinkedRole:ServiceLinkedRole example <product_name>
 * ```
 */
export class ServiceLinkedRole extends pulumi.CustomResource {
    /**
     * Get an existing ServiceLinkedRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceLinkedRoleState, opts?: pulumi.CustomResourceOptions): ServiceLinkedRole {
        return new ServiceLinkedRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:securitycenter/serviceLinkedRole:ServiceLinkedRole';

    /**
     * Returns true if the given object is an instance of ServiceLinkedRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceLinkedRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceLinkedRole.__pulumiType;
    }

    /**
     * The status of the service Associated role. Valid Values: `true`: Created. `false`: not created.
     */
    public /*out*/ readonly status!: pulumi.Output<boolean>;

    /**
     * Create a ServiceLinkedRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ServiceLinkedRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceLinkedRoleArgs | ServiceLinkedRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceLinkedRoleState | undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ServiceLinkedRoleArgs | undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceLinkedRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceLinkedRole resources.
 */
export interface ServiceLinkedRoleState {
    /**
     * The status of the service Associated role. Valid Values: `true`: Created. `false`: not created.
     */
    status?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ServiceLinkedRole resource.
 */
export interface ServiceLinkedRoleArgs {
}
