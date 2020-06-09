// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

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
    public static readonly __pulumiType = 'alicloud:datahub/topic:Topic';

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
     * Comment of the datahub topic. It cannot be longer than 255 characters.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     */
    public /*out*/ readonly lastModifyTime!: pulumi.Output<string>;
    /**
     * How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
     */
    public readonly lifeCycle!: pulumi.Output<number | undefined>;
    /**
     * The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the datahub project that this topic belongs to. It is case-insensitive.
     */
    public readonly projectName!: pulumi.Output<string>;
    /**
     * Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
     * - BIGINT
     * - STRING
     * - BOOLEAN
     * - DOUBLE
     * - TIMESTAMP
     */
    public readonly recordSchema!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
     */
    public readonly recordType!: pulumi.Output<string | undefined>;
    /**
     * The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
     */
    public readonly shardCount!: pulumi.Output<number | undefined>;

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
            inputs["comment"] = state ? state.comment : undefined;
            inputs["createTime"] = state ? state.createTime : undefined;
            inputs["lastModifyTime"] = state ? state.lastModifyTime : undefined;
            inputs["lifeCycle"] = state ? state.lifeCycle : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["projectName"] = state ? state.projectName : undefined;
            inputs["recordSchema"] = state ? state.recordSchema : undefined;
            inputs["recordType"] = state ? state.recordType : undefined;
            inputs["shardCount"] = state ? state.shardCount : undefined;
        } else {
            const args = argsOrState as TopicArgs | undefined;
            if (!args || args.projectName === undefined) {
                throw new Error("Missing required property 'projectName'");
            }
            inputs["comment"] = args ? args.comment : undefined;
            inputs["lifeCycle"] = args ? args.lifeCycle : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["projectName"] = args ? args.projectName : undefined;
            inputs["recordSchema"] = args ? args.recordSchema : undefined;
            inputs["recordType"] = args ? args.recordType : undefined;
            inputs["shardCount"] = args ? args.shardCount : undefined;
            inputs["createTime"] = undefined /*out*/;
            inputs["lastModifyTime"] = undefined /*out*/;
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
     * Comment of the datahub topic. It cannot be longer than 255 characters.
     */
    readonly comment?: pulumi.Input<string>;
    /**
     * Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
     */
    readonly createTime?: pulumi.Input<string>;
    /**
     * Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     */
    readonly lastModifyTime?: pulumi.Input<string>;
    /**
     * How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
     */
    readonly lifeCycle?: pulumi.Input<number>;
    /**
     * The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The name of the datahub project that this topic belongs to. It is case-insensitive.
     */
    readonly projectName?: pulumi.Input<string>;
    /**
     * Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
     * - BIGINT
     * - STRING
     * - BOOLEAN
     * - DOUBLE
     * - TIMESTAMP
     */
    readonly recordSchema?: pulumi.Input<{[key: string]: any}>;
    /**
     * The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
     */
    readonly recordType?: pulumi.Input<string>;
    /**
     * The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
     */
    readonly shardCount?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Topic resource.
 */
export interface TopicArgs {
    /**
     * Comment of the datahub topic. It cannot be longer than 255 characters.
     */
    readonly comment?: pulumi.Input<string>;
    /**
     * How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
     */
    readonly lifeCycle?: pulumi.Input<number>;
    /**
     * The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The name of the datahub project that this topic belongs to. It is case-insensitive.
     */
    readonly projectName: pulumi.Input<string>;
    /**
     * Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
     * - BIGINT
     * - STRING
     * - BOOLEAN
     * - DOUBLE
     * - TIMESTAMP
     */
    readonly recordSchema?: pulumi.Input<{[key: string]: any}>;
    /**
     * The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
     */
    readonly recordType?: pulumi.Input<string>;
    /**
     * The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
     */
    readonly shardCount?: pulumi.Input<number>;
}
