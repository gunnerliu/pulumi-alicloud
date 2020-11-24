// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a RAM Group membership resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Create a RAM Group membership.
 * const group = new alicloud.ram.Group("group", {
 *     comments: "this is a group comments.",
 *     force: true,
 * });
 * const user = new alicloud.ram.User("user", {
 *     displayName: "user_display_name",
 *     mobile: "86-18688888888",
 *     email: "hello.uuu@aaa.com",
 *     comments: "yoyoyo",
 *     force: true,
 * });
 * const user1 = new alicloud.ram.User("user1", {
 *     displayName: "user_display_name1",
 *     mobile: "86-18688888889",
 *     email: "hello.uuu@aaa.com",
 *     comments: "yoyoyo",
 *     force: true,
 * });
 * const membership = new alicloud.ram.GroupMembership("membership", {
 *     groupName: group.name,
 *     userNames: [
 *         user.name,
 *         user1.name,
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * RAM Group membership can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ram/groupMembership:GroupMembership example my-group
 * ```
 */
export class GroupMembership extends pulumi.CustomResource {
    /**
     * Get an existing GroupMembership resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupMembershipState, opts?: pulumi.CustomResourceOptions): GroupMembership {
        return new GroupMembership(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ram/groupMembership:GroupMembership';

    /**
     * Returns true if the given object is an instance of GroupMembership.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GroupMembership {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GroupMembership.__pulumiType;
    }

    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    public readonly groupName!: pulumi.Output<string>;
    /**
     * Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    public readonly userNames!: pulumi.Output<string[]>;

    /**
     * Create a GroupMembership resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupMembershipArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GroupMembershipArgs | GroupMembershipState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as GroupMembershipState | undefined;
            inputs["groupName"] = state ? state.groupName : undefined;
            inputs["userNames"] = state ? state.userNames : undefined;
        } else {
            const args = argsOrState as GroupMembershipArgs | undefined;
            if (!args || args.groupName === undefined) {
                throw new Error("Missing required property 'groupName'");
            }
            if (!args || args.userNames === undefined) {
                throw new Error("Missing required property 'userNames'");
            }
            inputs["groupName"] = args ? args.groupName : undefined;
            inputs["userNames"] = args ? args.userNames : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(GroupMembership.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GroupMembership resources.
 */
export interface GroupMembershipState {
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly groupName?: pulumi.Input<string>;
    /**
     * Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userNames?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a GroupMembership resource.
 */
export interface GroupMembershipArgs {
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    readonly groupName: pulumi.Input<string>;
    /**
     * Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userNames: pulumi.Input<pulumi.Input<string>[]>;
}
