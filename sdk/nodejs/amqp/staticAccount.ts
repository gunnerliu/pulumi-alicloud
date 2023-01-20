// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Amqp Static Account resource.
 *
 * For information about Amqp Static Account and how to use it, see [What is Static Account](https://help.aliyun.com/document_detail/184399.html).
 *
 * > **NOTE:** Available in v1.195.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.amqp.StaticAccount("default", {
 *     accessKey: "LTAI5t8beMmVM1eRZtEJ6vfo",
 *     instanceId: "amqp-cn-0ju2y01zs001",
 *     secretKey: "sample-secret-key",
 * });
 * ```
 *
 * ## Import
 *
 * Amqp Static Account can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:amqp/staticAccount:StaticAccount example <instance_id>:<access_key>
 * ```
 */
export class StaticAccount extends pulumi.CustomResource {
    /**
     * Get an existing StaticAccount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StaticAccountState, opts?: pulumi.CustomResourceOptions): StaticAccount {
        return new StaticAccount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:amqp/staticAccount:StaticAccount';

    /**
     * Returns true if the given object is an instance of StaticAccount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StaticAccount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StaticAccount.__pulumiType;
    }

    /**
     * Access key.
     */
    public readonly accessKey!: pulumi.Output<string>;
    /**
     * Create time stamp. Unix timestamp, to millisecond level.
     */
    public /*out*/ readonly createTime!: pulumi.Output<number>;
    /**
     * Amqp instance ID.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The ID of the user's primary account.
     */
    public /*out*/ readonly masterUid!: pulumi.Output<string>;
    /**
     * Static password.
     */
    public /*out*/ readonly password!: pulumi.Output<string>;
    /**
     * Secret key.
     */
    public readonly secretKey!: pulumi.Output<string>;
    public /*out*/ readonly userName!: pulumi.Output<string>;

    /**
     * Create a StaticAccount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StaticAccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StaticAccountArgs | StaticAccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StaticAccountState | undefined;
            resourceInputs["accessKey"] = state ? state.accessKey : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["masterUid"] = state ? state.masterUid : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["secretKey"] = state ? state.secretKey : undefined;
            resourceInputs["userName"] = state ? state.userName : undefined;
        } else {
            const args = argsOrState as StaticAccountArgs | undefined;
            if ((!args || args.accessKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessKey'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.secretKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'secretKey'");
            }
            resourceInputs["accessKey"] = args ? args.accessKey : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["secretKey"] = args?.secretKey ? pulumi.secret(args.secretKey) : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["masterUid"] = undefined /*out*/;
            resourceInputs["password"] = undefined /*out*/;
            resourceInputs["userName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secretKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(StaticAccount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StaticAccount resources.
 */
export interface StaticAccountState {
    /**
     * Access key.
     */
    accessKey?: pulumi.Input<string>;
    /**
     * Create time stamp. Unix timestamp, to millisecond level.
     */
    createTime?: pulumi.Input<number>;
    /**
     * Amqp instance ID.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The ID of the user's primary account.
     */
    masterUid?: pulumi.Input<string>;
    /**
     * Static password.
     */
    password?: pulumi.Input<string>;
    /**
     * Secret key.
     */
    secretKey?: pulumi.Input<string>;
    userName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StaticAccount resource.
 */
export interface StaticAccountArgs {
    /**
     * Access key.
     */
    accessKey: pulumi.Input<string>;
    /**
     * Amqp instance ID.
     */
    instanceId: pulumi.Input<string>;
    /**
     * Secret key.
     */
    secretKey: pulumi.Input<string>;
}
