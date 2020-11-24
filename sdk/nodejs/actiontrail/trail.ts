// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ActionTrail Trail resource. For information about alicloud actiontrail trail and how to use it, see [What is Resource Alicloud ActionTrail Trail](https://www.alibabacloud.com/help/doc-detail/28804.htm).
 *
 * > **NOTE:** Available in 1.95.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Create a new actiontrail trail.
 * const defaultTrail = new alicloud.actiontrail.Trail("default", {
 *     eventRw: "All",
 *     ossBucketName: "bucket_name",
 *     roleName: "aliyunserviceroleforactiontrail",
 *     trailName: "action-trail",
 *     trailRegion: "cn-hangzhou",
 * });
 * ```
 *
 * ## Import
 *
 * Action trail can be imported using the id or trail_name, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:actiontrail/trail:Trail default abc12345678
 * ```
 */
export class Trail extends pulumi.CustomResource {
    /**
     * Get an existing Trail resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TrailState, opts?: pulumi.CustomResourceOptions): Trail {
        return new Trail(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:actiontrail/trail:Trail';

    /**
     * Returns true if the given object is an instance of Trail.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Trail {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Trail.__pulumiType;
    }

    /**
     * Indicates whether the event is a read or a write event. Valid values: `Read`, `Write`, and `All`. Default to `Write`.
     */
    public readonly eventRw!: pulumi.Output<string | undefined>;
    public readonly isOrganizationTrail!: pulumi.Output<boolean | undefined>;
    /**
     * The ARN of the Message Service (MNS) topic to which ActionTrail sends messages. If the ARN is specified, a message is generated and delivered to the MNS topic whenever an event is delivered to OSS.
     */
    public readonly mnsTopicArn!: pulumi.Output<string | undefined>;
    /**
     * Field `name` has been deprecated from version 1.95.0. Use `trailName` instead.
     *
     * @deprecated Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The OSS bucket to which the trail delivers logs. Ensure that this is an existing OSS bucket.
     */
    public readonly ossBucketName!: pulumi.Output<string | undefined>;
    /**
     * The prefix of the specified OSS bucket name. This parameter can be left empty.
     */
    public readonly ossKeyPrefix!: pulumi.Output<string | undefined>;
    /**
     * The RAM role in ActionTrail permitted by the user.
     */
    public readonly roleName!: pulumi.Output<string>;
    /**
     * The unique ARN of the Log Service project.
     */
    public readonly slsProjectArn!: pulumi.Output<string | undefined>;
    /**
     * The unique ARN of the Log Service role.
     */
    public readonly slsWriteRoleArn!: pulumi.Output<string | undefined>;
    /**
     * The status of ActionTrail Trail. After creation, tracking is turned on by default, and you can set the status value to `Disable` to turn off tracking. Valid values: `Enable`, `Disable`. Default to `Enable`.
     */
    public readonly status!: pulumi.Output<string | undefined>;
    /**
     * The name of the trail to be created, which must be unique for an account.
     */
    public readonly trailName!: pulumi.Output<string>;
    /**
     * The regions to which the trail is applied. Valid values: `cn-beijing`, `cn-hangzhou`, and `All`. Default to `All`.
     */
    public readonly trailRegion!: pulumi.Output<string | undefined>;

    /**
     * Create a Trail resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TrailArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TrailArgs | TrailState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as TrailState | undefined;
            inputs["eventRw"] = state ? state.eventRw : undefined;
            inputs["isOrganizationTrail"] = state ? state.isOrganizationTrail : undefined;
            inputs["mnsTopicArn"] = state ? state.mnsTopicArn : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["ossBucketName"] = state ? state.ossBucketName : undefined;
            inputs["ossKeyPrefix"] = state ? state.ossKeyPrefix : undefined;
            inputs["roleName"] = state ? state.roleName : undefined;
            inputs["slsProjectArn"] = state ? state.slsProjectArn : undefined;
            inputs["slsWriteRoleArn"] = state ? state.slsWriteRoleArn : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["trailName"] = state ? state.trailName : undefined;
            inputs["trailRegion"] = state ? state.trailRegion : undefined;
        } else {
            const args = argsOrState as TrailArgs | undefined;
            inputs["eventRw"] = args ? args.eventRw : undefined;
            inputs["isOrganizationTrail"] = args ? args.isOrganizationTrail : undefined;
            inputs["mnsTopicArn"] = args ? args.mnsTopicArn : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["ossBucketName"] = args ? args.ossBucketName : undefined;
            inputs["ossKeyPrefix"] = args ? args.ossKeyPrefix : undefined;
            inputs["roleName"] = args ? args.roleName : undefined;
            inputs["slsProjectArn"] = args ? args.slsProjectArn : undefined;
            inputs["slsWriteRoleArn"] = args ? args.slsWriteRoleArn : undefined;
            inputs["status"] = args ? args.status : undefined;
            inputs["trailName"] = args ? args.trailName : undefined;
            inputs["trailRegion"] = args ? args.trailRegion : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Trail.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Trail resources.
 */
export interface TrailState {
    /**
     * Indicates whether the event is a read or a write event. Valid values: `Read`, `Write`, and `All`. Default to `Write`.
     */
    readonly eventRw?: pulumi.Input<string>;
    readonly isOrganizationTrail?: pulumi.Input<boolean>;
    /**
     * The ARN of the Message Service (MNS) topic to which ActionTrail sends messages. If the ARN is specified, a message is generated and delivered to the MNS topic whenever an event is delivered to OSS.
     */
    readonly mnsTopicArn?: pulumi.Input<string>;
    /**
     * Field `name` has been deprecated from version 1.95.0. Use `trailName` instead.
     *
     * @deprecated Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The OSS bucket to which the trail delivers logs. Ensure that this is an existing OSS bucket.
     */
    readonly ossBucketName?: pulumi.Input<string>;
    /**
     * The prefix of the specified OSS bucket name. This parameter can be left empty.
     */
    readonly ossKeyPrefix?: pulumi.Input<string>;
    /**
     * The RAM role in ActionTrail permitted by the user.
     */
    readonly roleName?: pulumi.Input<string>;
    /**
     * The unique ARN of the Log Service project.
     */
    readonly slsProjectArn?: pulumi.Input<string>;
    /**
     * The unique ARN of the Log Service role.
     */
    readonly slsWriteRoleArn?: pulumi.Input<string>;
    /**
     * The status of ActionTrail Trail. After creation, tracking is turned on by default, and you can set the status value to `Disable` to turn off tracking. Valid values: `Enable`, `Disable`. Default to `Enable`.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The name of the trail to be created, which must be unique for an account.
     */
    readonly trailName?: pulumi.Input<string>;
    /**
     * The regions to which the trail is applied. Valid values: `cn-beijing`, `cn-hangzhou`, and `All`. Default to `All`.
     */
    readonly trailRegion?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Trail resource.
 */
export interface TrailArgs {
    /**
     * Indicates whether the event is a read or a write event. Valid values: `Read`, `Write`, and `All`. Default to `Write`.
     */
    readonly eventRw?: pulumi.Input<string>;
    readonly isOrganizationTrail?: pulumi.Input<boolean>;
    /**
     * The ARN of the Message Service (MNS) topic to which ActionTrail sends messages. If the ARN is specified, a message is generated and delivered to the MNS topic whenever an event is delivered to OSS.
     */
    readonly mnsTopicArn?: pulumi.Input<string>;
    /**
     * Field `name` has been deprecated from version 1.95.0. Use `trailName` instead.
     *
     * @deprecated Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The OSS bucket to which the trail delivers logs. Ensure that this is an existing OSS bucket.
     */
    readonly ossBucketName?: pulumi.Input<string>;
    /**
     * The prefix of the specified OSS bucket name. This parameter can be left empty.
     */
    readonly ossKeyPrefix?: pulumi.Input<string>;
    /**
     * The RAM role in ActionTrail permitted by the user.
     */
    readonly roleName?: pulumi.Input<string>;
    /**
     * The unique ARN of the Log Service project.
     */
    readonly slsProjectArn?: pulumi.Input<string>;
    /**
     * The unique ARN of the Log Service role.
     */
    readonly slsWriteRoleArn?: pulumi.Input<string>;
    /**
     * The status of ActionTrail Trail. After creation, tracking is turned on by default, and you can set the status value to `Disable` to turn off tracking. Valid values: `Enable`, `Disable`. Default to `Enable`.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The name of the trail to be created, which must be unique for an account.
     */
    readonly trailName?: pulumi.Input<string>;
    /**
     * The regions to which the trail is applied. Valid values: `cn-beijing`, `cn-hangzhou`, and `All`. Default to `All`.
     */
    readonly trailRegion?: pulumi.Input<string>;
}
