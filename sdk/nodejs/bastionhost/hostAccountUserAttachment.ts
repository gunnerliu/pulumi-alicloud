// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Bastion Host Host Account Attachment resource to add list host accounts into one user.
 *
 * > **NOTE:** Available in v1.135.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultHost = new alicloud.bastionhost.Host("defaultHost", {
 *     instanceId: "bastionhost-cn-tl32bh0no30",
 *     hostName: _var.name,
 *     activeAddressType: "Private",
 *     hostPrivateAddress: "172.16.0.10",
 *     osType: "Linux",
 *     source: "Local",
 * });
 * const defaultHostAccount: alicloud.bastionhost.HostAccount[] = [];
 * for (const range = {value: 0}; range.value < 3; range.value++) {
 *     defaultHostAccount.push(new alicloud.bastionhost.HostAccount(`defaultHostAccount-${range.value}`, {
 *         instanceId: defaultHost.instanceId,
 *         hostAccountName: `example_value-${range.value}`,
 *         hostId: defaultHost.hostId,
 *         protocolName: "SSH",
 *         password: "YourPassword12345",
 *     }));
 * }
 * const defaultUser = new alicloud.bastionhost.User("defaultUser", {
 *     instanceId: defaultHost.instanceId,
 *     mobileCountryCode: "CN",
 *     mobile: "13312345678",
 *     password: "YourPassword-123",
 *     source: "Local",
 *     userName: "my-local-user",
 * });
 * const defaultHostAccountUserAttachment = new alicloud.bastionhost.HostAccountUserAttachment("defaultHostAccountUserAttachment", {
 *     instanceId: defaultHost.instanceId,
 *     userId: defaultUser.userId,
 *     hostId: defaultHost.hostId,
 *     hostAccountIds: defaultHostAccount.map(__item => __item.hostAccountId),
 * });
 * ```
 *
 * ## Import
 *
 * Bastion Host Host Account can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:bastionhost/hostAccountUserAttachment:HostAccountUserAttachment example <instance_id>:<user_id>:<host_id>
 * ```
 */
export class HostAccountUserAttachment extends pulumi.CustomResource {
    /**
     * Get an existing HostAccountUserAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HostAccountUserAttachmentState, opts?: pulumi.CustomResourceOptions): HostAccountUserAttachment {
        return new HostAccountUserAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:bastionhost/hostAccountUserAttachment:HostAccountUserAttachment';

    /**
     * Returns true if the given object is an instance of HostAccountUserAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HostAccountUserAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HostAccountUserAttachment.__pulumiType;
    }

    /**
     * A list IDs of the host account.
     */
    public readonly hostAccountIds!: pulumi.Output<string[]>;
    /**
     * The ID of the host.
     */
    public readonly hostId!: pulumi.Output<string>;
    /**
     * The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The ID of the user that you want to authorize to manage the specified hosts and host accounts.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a HostAccountUserAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HostAccountUserAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HostAccountUserAttachmentArgs | HostAccountUserAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HostAccountUserAttachmentState | undefined;
            resourceInputs["hostAccountIds"] = state ? state.hostAccountIds : undefined;
            resourceInputs["hostId"] = state ? state.hostId : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as HostAccountUserAttachmentArgs | undefined;
            if ((!args || args.hostAccountIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostAccountIds'");
            }
            if ((!args || args.hostId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostId'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["hostAccountIds"] = args ? args.hostAccountIds : undefined;
            resourceInputs["hostId"] = args ? args.hostId : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(HostAccountUserAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HostAccountUserAttachment resources.
 */
export interface HostAccountUserAttachmentState {
    /**
     * A list IDs of the host account.
     */
    hostAccountIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the host.
     */
    hostId?: pulumi.Input<string>;
    /**
     * The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The ID of the user that you want to authorize to manage the specified hosts and host accounts.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a HostAccountUserAttachment resource.
 */
export interface HostAccountUserAttachmentArgs {
    /**
     * A list IDs of the host account.
     */
    hostAccountIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the host.
     */
    hostId: pulumi.Input<string>;
    /**
     * The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
     */
    instanceId: pulumi.Input<string>;
    /**
     * The ID of the user that you want to authorize to manage the specified hosts and host accounts.
     */
    userId: pulumi.Input<string>;
}
