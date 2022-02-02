// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Quick BI User resource.
 *
 * For information about Quick BI User and how to use it, see [What is User](https://www.alibabacloud.com/help/doc-detail/33813.htm).
 *
 * > **NOTE:** Available in v1.136.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.quickbi.User("example", {
 *     accountName: "example_value",
 *     adminUser: false,
 *     authAdminUser: false,
 *     nickName: "example_value",
 *     userType: "Analyst",
 * });
 * ```
 *
 * ## Import
 *
 * Quick BI User can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:quickbi/user:User example <id>
 * ```
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:quickbi/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    /**
     * Alibaba Cloud account ID.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * An Alibaba Cloud account, Alibaba Cloud name.
     */
    public readonly accountName!: pulumi.Output<string>;
    /**
     * Whether it is the administrator. Valid values: `true` and `false`.
     */
    public readonly adminUser!: pulumi.Output<boolean>;
    /**
     * Whether this is a permissions administrator. Valid values: `false`, `true`.
     */
    public readonly authAdminUser!: pulumi.Output<boolean>;
    /**
     * The nickname of the user.
     */
    public readonly nickName!: pulumi.Output<string>;
    /**
     * The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
     */
    public readonly userType!: pulumi.Output<string>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["accountName"] = state ? state.accountName : undefined;
            resourceInputs["adminUser"] = state ? state.adminUser : undefined;
            resourceInputs["authAdminUser"] = state ? state.authAdminUser : undefined;
            resourceInputs["nickName"] = state ? state.nickName : undefined;
            resourceInputs["userType"] = state ? state.userType : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if ((!args || args.accountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountName'");
            }
            if ((!args || args.adminUser === undefined) && !opts.urn) {
                throw new Error("Missing required property 'adminUser'");
            }
            if ((!args || args.authAdminUser === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authAdminUser'");
            }
            if ((!args || args.nickName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nickName'");
            }
            if ((!args || args.userType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userType'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["accountName"] = args ? args.accountName : undefined;
            resourceInputs["adminUser"] = args ? args.adminUser : undefined;
            resourceInputs["authAdminUser"] = args ? args.authAdminUser : undefined;
            resourceInputs["nickName"] = args ? args.nickName : undefined;
            resourceInputs["userType"] = args ? args.userType : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(User.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * Alibaba Cloud account ID.
     */
    accountId?: pulumi.Input<string>;
    /**
     * An Alibaba Cloud account, Alibaba Cloud name.
     */
    accountName?: pulumi.Input<string>;
    /**
     * Whether it is the administrator. Valid values: `true` and `false`.
     */
    adminUser?: pulumi.Input<boolean>;
    /**
     * Whether this is a permissions administrator. Valid values: `false`, `true`.
     */
    authAdminUser?: pulumi.Input<boolean>;
    /**
     * The nickname of the user.
     */
    nickName?: pulumi.Input<string>;
    /**
     * The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
     */
    userType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * Alibaba Cloud account ID.
     */
    accountId?: pulumi.Input<string>;
    /**
     * An Alibaba Cloud account, Alibaba Cloud name.
     */
    accountName: pulumi.Input<string>;
    /**
     * Whether it is the administrator. Valid values: `true` and `false`.
     */
    adminUser: pulumi.Input<boolean>;
    /**
     * Whether this is a permissions administrator. Valid values: `false`, `true`.
     */
    authAdminUser: pulumi.Input<boolean>;
    /**
     * The nickname of the user.
     */
    nickName: pulumi.Input<string>;
    /**
     * The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
     */
    userType: pulumi.Input<string>;
}
