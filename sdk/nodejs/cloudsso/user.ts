// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud SSO User resource.
 *
 * For information about Cloud SSO User and how to use it, see [What is User](https://www.alibabacloud.com/help/zh/doc-detail/264683.htm).
 *
 * > **NOTE:** Available in v1.140.0+.
 *
 * > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
 *
 * ## Import
 *
 * Cloud SSO User can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cloudsso/user:User example <directory_id>:<user_id>
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
    public static readonly __pulumiType = 'alicloud:cloudsso/user:User';

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
     * The description of user. The description can be up to `1024` characters long.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Directory.
     */
    public readonly directoryId!: pulumi.Output<string>;
    /**
     * The display name of user. The display name can be up to `256` characters long.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * The User's Contact Email Address. The email can be up to `128` characters long.
     */
    public readonly email!: pulumi.Output<string | undefined>;
    /**
     * The first name of user. The firstName can be up to `64` characters long.
     */
    public readonly firstName!: pulumi.Output<string | undefined>;
    /**
     * The last name of user. The lastName can be up to `64` characters long.
     */
    public readonly lastName!: pulumi.Output<string | undefined>;
    /**
     * The status of user. Valid values: `Disabled`, `Enabled`.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The User ID of the group.
     */
    public /*out*/ readonly userId!: pulumi.Output<string>;
    /**
     * The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
     */
    public readonly userName!: pulumi.Output<string>;

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
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["directoryId"] = state ? state.directoryId : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["firstName"] = state ? state.firstName : undefined;
            resourceInputs["lastName"] = state ? state.lastName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
            resourceInputs["userName"] = state ? state.userName : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if ((!args || args.directoryId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'directoryId'");
            }
            if ((!args || args.userName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userName'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["directoryId"] = args ? args.directoryId : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["firstName"] = args ? args.firstName : undefined;
            resourceInputs["lastName"] = args ? args.lastName : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["userName"] = args ? args.userName : undefined;
            resourceInputs["userId"] = undefined /*out*/;
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
     * The description of user. The description can be up to `1024` characters long.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the Directory.
     */
    directoryId?: pulumi.Input<string>;
    /**
     * The display name of user. The display name can be up to `256` characters long.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The User's Contact Email Address. The email can be up to `128` characters long.
     */
    email?: pulumi.Input<string>;
    /**
     * The first name of user. The firstName can be up to `64` characters long.
     */
    firstName?: pulumi.Input<string>;
    /**
     * The last name of user. The lastName can be up to `64` characters long.
     */
    lastName?: pulumi.Input<string>;
    /**
     * The status of user. Valid values: `Disabled`, `Enabled`.
     */
    status?: pulumi.Input<string>;
    /**
     * The User ID of the group.
     */
    userId?: pulumi.Input<string>;
    /**
     * The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
     */
    userName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * The description of user. The description can be up to `1024` characters long.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the Directory.
     */
    directoryId: pulumi.Input<string>;
    /**
     * The display name of user. The display name can be up to `256` characters long.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The User's Contact Email Address. The email can be up to `128` characters long.
     */
    email?: pulumi.Input<string>;
    /**
     * The first name of user. The firstName can be up to `64` characters long.
     */
    firstName?: pulumi.Input<string>;
    /**
     * The last name of user. The lastName can be up to `64` characters long.
     */
    lastName?: pulumi.Input<string>;
    /**
     * The status of user. Valid values: `Disabled`, `Enabled`.
     */
    status?: pulumi.Input<string>;
    /**
     * The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
     */
    userName: pulumi.Input<string>;
}
