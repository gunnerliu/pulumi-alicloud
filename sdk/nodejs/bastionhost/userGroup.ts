// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Bastion Host User Group resource.
 *
 * For information about Bastion Host User Group and how to use it, see [What is User Group](https://www.alibabacloud.com/help/doc-detail/204596.htm).
 *
 * > **NOTE:** Available since v1.132.0.
 *
 * ## Import
 *
 * Bastion Host User Group can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:bastionhost/userGroup:UserGroup example <instance_id>:<user_group_id>
 * ```
 */
export class UserGroup extends pulumi.CustomResource {
    /**
     * Get an existing UserGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserGroupState, opts?: pulumi.CustomResourceOptions): UserGroup {
        return new UserGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:bastionhost/userGroup:UserGroup';

    /**
     * Returns true if the given object is an instance of UserGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserGroup.__pulumiType;
    }

    /**
     * Specify the New Group of Remark Information. Supports up to 500 Characters.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Specify the New Group of the Bastion Host of Instance Id.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The User Group self ID.
     */
    public /*out*/ readonly userGroupId!: pulumi.Output<string>;
    /**
     * Specify the New Group Name. Supports up to 128 Characters.
     */
    public readonly userGroupName!: pulumi.Output<string>;

    /**
     * Create a UserGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserGroupArgs | UserGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserGroupState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["userGroupId"] = state ? state.userGroupId : undefined;
            resourceInputs["userGroupName"] = state ? state.userGroupName : undefined;
        } else {
            const args = argsOrState as UserGroupArgs | undefined;
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.userGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userGroupName'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["userGroupName"] = args ? args.userGroupName : undefined;
            resourceInputs["userGroupId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserGroup resources.
 */
export interface UserGroupState {
    /**
     * Specify the New Group of Remark Information. Supports up to 500 Characters.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specify the New Group of the Bastion Host of Instance Id.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The User Group self ID.
     */
    userGroupId?: pulumi.Input<string>;
    /**
     * Specify the New Group Name. Supports up to 128 Characters.
     */
    userGroupName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserGroup resource.
 */
export interface UserGroupArgs {
    /**
     * Specify the New Group of Remark Information. Supports up to 500 Characters.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specify the New Group of the Bastion Host of Instance Id.
     */
    instanceId: pulumi.Input<string>;
    /**
     * Specify the New Group Name. Supports up to 128 Characters.
     */
    userGroupName: pulumi.Input<string>;
}
