import * as pulumi from "@pulumi/pulumi";
/**
 * The topic is the basic unit of Datahub data source and is used to define one kind of data or stream. It contains a set of subscriptions. You can manage the datahub source of an application by using topics. [Refer to details](https://help.aliyun.com/document_detail/47440.html).
 */
export declare class Topic extends pulumi.CustomResource {
    /**
     * Get an existing Topic resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TopicState): Topic;
    /**
     * Comment of the datahub topic. It cannot be longer than 255 characters.
     */
    readonly comment: pulumi.Output<string | undefined>;
    /**
     * Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
     */
    readonly createTime: pulumi.Output<string>;
    /**
     * Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     */
    readonly lastModifyTime: pulumi.Output<string>;
    /**
     * How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
     */
    readonly lifeCycle: pulumi.Output<number | undefined>;
    /**
     * The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The name of the datahub project that this topic belongs to. It is case-insensitive.
     */
    readonly projectName: pulumi.Output<string>;
    /**
     * Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
     * - BIGINT
     * - STRING
     * - BOOLEAN
     * - DOUBLE
     * - TIMESTAMP
     */
    readonly recordSchema: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    /**
     * The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
     */
    readonly recordType: pulumi.Output<string | undefined>;
    /**
     * The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
     */
    readonly shardCount: pulumi.Output<number | undefined>;
    /**
     * Create a Topic resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TopicArgs, opts?: pulumi.CustomResourceOptions);
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
    readonly recordSchema?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
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
    readonly recordSchema?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
     */
    readonly recordType?: pulumi.Input<string>;
    /**
     * The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
     */
    readonly shardCount?: pulumi.Input<number>;
}