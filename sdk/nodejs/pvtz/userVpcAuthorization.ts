// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Private Zone User Vpc Authorization resource.
 *
 * > **NOTE:** Available in v1.138.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.pvtz.UserVpcAuthorization("example", {
 *     authChannel: "RESOURCE_DIRECTORY",
 *     authType: "NORMAL",
 *     authorizedUserId: "example_value",
 * });
 * ```
 *
 * ## Import
 *
 * Private Zone User Vpc Authorization can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:pvtz/userVpcAuthorization:UserVpcAuthorization example <authorized_user_id>:<auth_type>
 * ```
 */
export class UserVpcAuthorization extends pulumi.CustomResource {
    /**
     * Get an existing UserVpcAuthorization resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserVpcAuthorizationState, opts?: pulumi.CustomResourceOptions): UserVpcAuthorization {
        return new UserVpcAuthorization(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:pvtz/userVpcAuthorization:UserVpcAuthorization';

    /**
     * Returns true if the given object is an instance of UserVpcAuthorization.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserVpcAuthorization {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserVpcAuthorization.__pulumiType;
    }

    /**
     * The auth channel. Valid values: `RESOURCE_DIRECTORY`.
     */
    public readonly authChannel!: pulumi.Output<string | undefined>;
    /**
     * The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
     */
    public readonly authType!: pulumi.Output<string | undefined>;
    /**
     * The primary account ID of the user who authorizes the resource.
     */
    public readonly authorizedUserId!: pulumi.Output<string>;

    /**
     * Create a UserVpcAuthorization resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserVpcAuthorizationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserVpcAuthorizationArgs | UserVpcAuthorizationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserVpcAuthorizationState | undefined;
            resourceInputs["authChannel"] = state ? state.authChannel : undefined;
            resourceInputs["authType"] = state ? state.authType : undefined;
            resourceInputs["authorizedUserId"] = state ? state.authorizedUserId : undefined;
        } else {
            const args = argsOrState as UserVpcAuthorizationArgs | undefined;
            if ((!args || args.authorizedUserId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authorizedUserId'");
            }
            resourceInputs["authChannel"] = args ? args.authChannel : undefined;
            resourceInputs["authType"] = args ? args.authType : undefined;
            resourceInputs["authorizedUserId"] = args ? args.authorizedUserId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserVpcAuthorization.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserVpcAuthorization resources.
 */
export interface UserVpcAuthorizationState {
    /**
     * The auth channel. Valid values: `RESOURCE_DIRECTORY`.
     */
    authChannel?: pulumi.Input<string>;
    /**
     * The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
     */
    authType?: pulumi.Input<string>;
    /**
     * The primary account ID of the user who authorizes the resource.
     */
    authorizedUserId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserVpcAuthorization resource.
 */
export interface UserVpcAuthorizationArgs {
    /**
     * The auth channel. Valid values: `RESOURCE_DIRECTORY`.
     */
    authChannel?: pulumi.Input<string>;
    /**
     * The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
     */
    authType?: pulumi.Input<string>;
    /**
     * The primary account ID of the user who authorizes the resource.
     */
    authorizedUserId: pulumi.Input<string>;
}
