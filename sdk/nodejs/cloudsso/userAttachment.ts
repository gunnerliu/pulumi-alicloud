// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud SSO User Attachment resource.
 *
 * For information about Cloud SSO User Attachment and how to use it, see [What is User Attachment](https://www.alibabacloud.com/help/en/doc-detail/264683.htm).
 *
 * > **NOTE:** Available in v1.141.0+.
 *
 * > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
 *
 * ## Import
 *
 * Cloud SSO User Attachment can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cloudsso/userAttachment:UserAttachment example <directory_id>:<group_id>:<user_id>
 * ```
 */
export class UserAttachment extends pulumi.CustomResource {
    /**
     * Get an existing UserAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserAttachmentState, opts?: pulumi.CustomResourceOptions): UserAttachment {
        return new UserAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudsso/userAttachment:UserAttachment';

    /**
     * Returns true if the given object is an instance of UserAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserAttachment.__pulumiType;
    }

    /**
     * The ID of the Directory.
     */
    public readonly directoryId!: pulumi.Output<string>;
    /**
     * The Group ID.
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * The User ID.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a UserAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserAttachmentArgs | UserAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserAttachmentState | undefined;
            resourceInputs["directoryId"] = state ? state.directoryId : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as UserAttachmentArgs | undefined;
            if ((!args || args.directoryId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'directoryId'");
            }
            if ((!args || args.groupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupId'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["directoryId"] = args ? args.directoryId : undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserAttachment resources.
 */
export interface UserAttachmentState {
    /**
     * The ID of the Directory.
     */
    directoryId?: pulumi.Input<string>;
    /**
     * The Group ID.
     */
    groupId?: pulumi.Input<string>;
    /**
     * The User ID.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserAttachment resource.
 */
export interface UserAttachmentArgs {
    /**
     * The ID of the Directory.
     */
    directoryId: pulumi.Input<string>;
    /**
     * The Group ID.
     */
    groupId: pulumi.Input<string>;
    /**
     * The User ID.
     */
    userId: pulumi.Input<string>;
}
