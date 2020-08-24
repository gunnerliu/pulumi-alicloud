// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an ONS topic resource.
 *
 * For more information about how to use it, see [RocketMQ Topic Management API](https://www.alibabacloud.com/help/doc-detail/29591.html).
 *
 * > **NOTE:** Available in 1.53.0+
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "onsInstanceName";
 * const topic = config.get("topic") || "onsTopicName";
 *
 * const defaultInstance = new alicloud.rocketmq.Instance("default", {
 *     remark: "default_ons_instance_remark",
 * });
 * const defaultTopic = new alicloud.rocketmq.Topic("default", {
 *     instanceId: defaultInstance.id,
 *     messageType: 0,
 *     remark: "dafault_ons_topic_remark",
 *     topic: topic,
 * });
 * ```
 */
export class Topic extends pulumi.CustomResource {
    /**
     * Get an existing Topic resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TopicState, opts?: pulumi.CustomResourceOptions): Topic {
        return new Topic(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:rocketmq/topic:Topic';

    /**
     * Returns true if the given object is an instance of Topic.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Topic {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Topic.__pulumiType;
    }

    /**
     * ID of the ONS Instance that owns the topics.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The type of the message. Read [Ons Topic Create](https://www.alibabacloud.com/help/doc-detail/29591.html) for further details.
     */
    public readonly messageType!: pulumi.Output<number>;
    /**
     * This attribute is used to set the read-write mode for the topic. Read [Request parameters](https://www.alibabacloud.com/help/doc-detail/56880.html) for further details.
     */
    public readonly perm!: pulumi.Output<number | undefined>;
    /**
     * This attribute is a concise description of topic. The length cannot exceed 128.
     */
    public readonly remark!: pulumi.Output<string | undefined>;
    /**
     * Name of the topic. Two topics on a single instance cannot have the same name and the name cannot start with 'GID' or 'CID'. The length cannot exceed 64 characters.
     */
    public readonly topic!: pulumi.Output<string>;

    /**
     * Create a Topic resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TopicArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TopicArgs | TopicState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as TopicState | undefined;
            inputs["instanceId"] = state ? state.instanceId : undefined;
            inputs["messageType"] = state ? state.messageType : undefined;
            inputs["perm"] = state ? state.perm : undefined;
            inputs["remark"] = state ? state.remark : undefined;
            inputs["topic"] = state ? state.topic : undefined;
        } else {
            const args = argsOrState as TopicArgs | undefined;
            if (!args || args.instanceId === undefined) {
                throw new Error("Missing required property 'instanceId'");
            }
            if (!args || args.messageType === undefined) {
                throw new Error("Missing required property 'messageType'");
            }
            if (!args || args.topic === undefined) {
                throw new Error("Missing required property 'topic'");
            }
            inputs["instanceId"] = args ? args.instanceId : undefined;
            inputs["messageType"] = args ? args.messageType : undefined;
            inputs["perm"] = args ? args.perm : undefined;
            inputs["remark"] = args ? args.remark : undefined;
            inputs["topic"] = args ? args.topic : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Topic.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Topic resources.
 */
export interface TopicState {
    /**
     * ID of the ONS Instance that owns the topics.
     */
    readonly instanceId?: pulumi.Input<string>;
    /**
     * The type of the message. Read [Ons Topic Create](https://www.alibabacloud.com/help/doc-detail/29591.html) for further details.
     */
    readonly messageType?: pulumi.Input<number>;
    /**
     * This attribute is used to set the read-write mode for the topic. Read [Request parameters](https://www.alibabacloud.com/help/doc-detail/56880.html) for further details.
     */
    readonly perm?: pulumi.Input<number>;
    /**
     * This attribute is a concise description of topic. The length cannot exceed 128.
     */
    readonly remark?: pulumi.Input<string>;
    /**
     * Name of the topic. Two topics on a single instance cannot have the same name and the name cannot start with 'GID' or 'CID'. The length cannot exceed 64 characters.
     */
    readonly topic?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Topic resource.
 */
export interface TopicArgs {
    /**
     * ID of the ONS Instance that owns the topics.
     */
    readonly instanceId: pulumi.Input<string>;
    /**
     * The type of the message. Read [Ons Topic Create](https://www.alibabacloud.com/help/doc-detail/29591.html) for further details.
     */
    readonly messageType: pulumi.Input<number>;
    /**
     * This attribute is used to set the read-write mode for the topic. Read [Request parameters](https://www.alibabacloud.com/help/doc-detail/56880.html) for further details.
     */
    readonly perm?: pulumi.Input<number>;
    /**
     * This attribute is a concise description of topic. The length cannot exceed 128.
     */
    readonly remark?: pulumi.Input<string>;
    /**
     * Name of the topic. Two topics on a single instance cannot have the same name and the name cannot start with 'GID' or 'CID'. The length cannot exceed 64 characters.
     */
    readonly topic: pulumi.Input<string>;
}
