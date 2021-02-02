// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Resource Manager Account resource. Member accounts are containers for resources in a resource directory. These accounts isolate resources and serve as organizational units in the resource directory. You can create member accounts in a folder and then manage them in a unified manner.
 * For information about Resource Manager Account and how to use it, see [What is Resource Manager Account](https://www.alibabacloud.com/help/en/doc-detail/111231.htm).
 *
 * > **NOTE:** Available in v1.83.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Add a Resource Manager Account.
 * const f1 = new alicloud.resourcemanager.Folder("f1", {folderName: "test1"});
 * const example = new alicloud.resourcemanager.Account("example", {
 *     displayName: "RDAccount",
 *     folderId: f1.id,
 * });
 * ```
 *
 * ## Import
 *
 * Resource Manager Account can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:resourcemanager/account:Account example 13148890145*****
 * ```
 */
export class Account extends pulumi.CustomResource {
    /**
     * Get an existing Account resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountState, opts?: pulumi.CustomResourceOptions): Account {
        return new Account(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:resourcemanager/account:Account';

    /**
     * Returns true if the given object is an instance of Account.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Account {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Account.__pulumiType;
    }

    /**
     * The name prefix of account.
     */
    public readonly accountNamePrefix!: pulumi.Output<string | undefined>;
    /**
     * Member name. The length is 2 ~ 50 characters or Chinese characters, which can include Chinese characters, English letters, numbers, underscores (_), dots (.) And dashes (-).
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * The ID of the parent folder.
     */
    public readonly folderId!: pulumi.Output<string>;
    /**
     * Ways for members to join the resource directory. Valid values: `invited`, `created`.
     */
    public /*out*/ readonly joinMethod!: pulumi.Output<string>;
    /**
     * The time when the member joined the resource directory.
     */
    public /*out*/ readonly joinTime!: pulumi.Output<string>;
    /**
     * The modification time of the invitation.
     */
    public /*out*/ readonly modifyTime!: pulumi.Output<string>;
    /**
     * Settlement account ID. If the value is empty, the current account will be used for settlement.
     */
    public readonly payerAccountId!: pulumi.Output<string | undefined>;
    /**
     * Resource directory ID.
     */
    public /*out*/ readonly resourceDirectoryId!: pulumi.Output<string>;
    /**
     * Member joining status. Valid values: `CreateSuccess`,`CreateVerifying`,`CreateFailed`,`CreateExpired`,`CreateCancelled`,`PromoteVerifying`,`PromoteFailed`,`PromoteExpired`,`PromoteCancelled`,`PromoteSuccess`,`InviteSuccess`,`Removed`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Member type. The value of `ResourceAccount` indicates the resource account.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a Account resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccountArgs | AccountState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AccountState | undefined;
            inputs["accountNamePrefix"] = state ? state.accountNamePrefix : undefined;
            inputs["displayName"] = state ? state.displayName : undefined;
            inputs["folderId"] = state ? state.folderId : undefined;
            inputs["joinMethod"] = state ? state.joinMethod : undefined;
            inputs["joinTime"] = state ? state.joinTime : undefined;
            inputs["modifyTime"] = state ? state.modifyTime : undefined;
            inputs["payerAccountId"] = state ? state.payerAccountId : undefined;
            inputs["resourceDirectoryId"] = state ? state.resourceDirectoryId : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as AccountArgs | undefined;
            if ((!args || args.displayName === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'displayName'");
            }
            inputs["accountNamePrefix"] = args ? args.accountNamePrefix : undefined;
            inputs["displayName"] = args ? args.displayName : undefined;
            inputs["folderId"] = args ? args.folderId : undefined;
            inputs["payerAccountId"] = args ? args.payerAccountId : undefined;
            inputs["joinMethod"] = undefined /*out*/;
            inputs["joinTime"] = undefined /*out*/;
            inputs["modifyTime"] = undefined /*out*/;
            inputs["resourceDirectoryId"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
            inputs["type"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Account.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Account resources.
 */
export interface AccountState {
    /**
     * The name prefix of account.
     */
    readonly accountNamePrefix?: pulumi.Input<string>;
    /**
     * Member name. The length is 2 ~ 50 characters or Chinese characters, which can include Chinese characters, English letters, numbers, underscores (_), dots (.) And dashes (-).
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * The ID of the parent folder.
     */
    readonly folderId?: pulumi.Input<string>;
    /**
     * Ways for members to join the resource directory. Valid values: `invited`, `created`.
     */
    readonly joinMethod?: pulumi.Input<string>;
    /**
     * The time when the member joined the resource directory.
     */
    readonly joinTime?: pulumi.Input<string>;
    /**
     * The modification time of the invitation.
     */
    readonly modifyTime?: pulumi.Input<string>;
    /**
     * Settlement account ID. If the value is empty, the current account will be used for settlement.
     */
    readonly payerAccountId?: pulumi.Input<string>;
    /**
     * Resource directory ID.
     */
    readonly resourceDirectoryId?: pulumi.Input<string>;
    /**
     * Member joining status. Valid values: `CreateSuccess`,`CreateVerifying`,`CreateFailed`,`CreateExpired`,`CreateCancelled`,`PromoteVerifying`,`PromoteFailed`,`PromoteExpired`,`PromoteCancelled`,`PromoteSuccess`,`InviteSuccess`,`Removed`.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * Member type. The value of `ResourceAccount` indicates the resource account.
     */
    readonly type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Account resource.
 */
export interface AccountArgs {
    /**
     * The name prefix of account.
     */
    readonly accountNamePrefix?: pulumi.Input<string>;
    /**
     * Member name. The length is 2 ~ 50 characters or Chinese characters, which can include Chinese characters, English letters, numbers, underscores (_), dots (.) And dashes (-).
     */
    readonly displayName: pulumi.Input<string>;
    /**
     * The ID of the parent folder.
     */
    readonly folderId?: pulumi.Input<string>;
    /**
     * Settlement account ID. If the value is empty, the current account will be used for settlement.
     */
    readonly payerAccountId?: pulumi.Input<string>;
}
