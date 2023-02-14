// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Config Delivery resource.
 *
 * For information about Cloud Config Delivery and how to use it, see [What is Delivery](https://help.aliyun.com/document_detail/429798.html).
 *
 * > **NOTE:** Available in v1.171.0+.
 *
 * ## Import
 *
 * Cloud Config Delivery can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cfg/delivery:Delivery example <id>
 * ```
 */
export class Delivery extends pulumi.CustomResource {
    /**
     * Get an existing Delivery resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeliveryState, opts?: pulumi.CustomResourceOptions): Delivery {
        return new Delivery(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cfg/delivery:Delivery';

    /**
     * Returns true if the given object is an instance of Delivery.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Delivery {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Delivery.__pulumiType;
    }

    /**
     * Open or close delivery configuration change history. true: open, false: close.
     */
    public readonly configurationItemChangeNotification!: pulumi.Output<boolean>;
    /**
     * Open or close timed snapshot of shipping resources. **NOTE:** The attribute is valid when the attribute `deliveryChannelType` is `OSS`.
     */
    public readonly configurationSnapshot!: pulumi.Output<boolean>;
    /**
     * The rule attached to the delivery method. Please refer to api [CreateConfigDeliveryChannel](https://help.aliyun.com/document_detail/429798.html) for example format. **NOTE:** The attribute is valid when the attribute `deliveryChannelType` is `MNS`.
     */
    public readonly deliveryChannelCondition!: pulumi.Output<string | undefined>;
    /**
     * The name of the delivery method.
     */
    public readonly deliveryChannelName!: pulumi.Output<string | undefined>;
    /**
     * The ARN of the delivery destination. The value must be in one of the following formats:
     * * `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
     * * `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
     * * `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
     */
    public readonly deliveryChannelTargetArn!: pulumi.Output<string>;
    /**
     * The type of the delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
     */
    public readonly deliveryChannelType!: pulumi.Output<string>;
    /**
     * The description of the delivery method.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Open or close non-compliance events of delivery resources. **NOTE:** The attribute is valid when the attribute `deliveryChannelType` is `SLS` or `MNS`.
     */
    public readonly nonCompliantNotification!: pulumi.Output<boolean>;
    /**
     * The oss ARN of the delivery channel when the value data oversized limit. 
     * * The value must be in one of the following formats: `acs:oss:{RegionId}:{accountId}:{bucketName}`, if your delivery destination is an Object Storage Service (OSS) bucket.
     * * Only delivery channels `SLS` and `MNS` are supported. The delivery channel limit for Log Service SLS is 1 MB, and the delivery channel limit for Message Service MNS is 64 KB.
     */
    public readonly oversizedDataOssTargetArn!: pulumi.Output<string | undefined>;
    /**
     * The status of the delivery method. Valid values: `0`: The delivery method is disabled. `1`: The delivery destination is enabled. This is the default value.
     */
    public readonly status!: pulumi.Output<number>;

    /**
     * Create a Delivery resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeliveryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeliveryArgs | DeliveryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeliveryState | undefined;
            resourceInputs["configurationItemChangeNotification"] = state ? state.configurationItemChangeNotification : undefined;
            resourceInputs["configurationSnapshot"] = state ? state.configurationSnapshot : undefined;
            resourceInputs["deliveryChannelCondition"] = state ? state.deliveryChannelCondition : undefined;
            resourceInputs["deliveryChannelName"] = state ? state.deliveryChannelName : undefined;
            resourceInputs["deliveryChannelTargetArn"] = state ? state.deliveryChannelTargetArn : undefined;
            resourceInputs["deliveryChannelType"] = state ? state.deliveryChannelType : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["nonCompliantNotification"] = state ? state.nonCompliantNotification : undefined;
            resourceInputs["oversizedDataOssTargetArn"] = state ? state.oversizedDataOssTargetArn : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as DeliveryArgs | undefined;
            if ((!args || args.deliveryChannelTargetArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deliveryChannelTargetArn'");
            }
            if ((!args || args.deliveryChannelType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deliveryChannelType'");
            }
            resourceInputs["configurationItemChangeNotification"] = args ? args.configurationItemChangeNotification : undefined;
            resourceInputs["configurationSnapshot"] = args ? args.configurationSnapshot : undefined;
            resourceInputs["deliveryChannelCondition"] = args ? args.deliveryChannelCondition : undefined;
            resourceInputs["deliveryChannelName"] = args ? args.deliveryChannelName : undefined;
            resourceInputs["deliveryChannelTargetArn"] = args ? args.deliveryChannelTargetArn : undefined;
            resourceInputs["deliveryChannelType"] = args ? args.deliveryChannelType : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["nonCompliantNotification"] = args ? args.nonCompliantNotification : undefined;
            resourceInputs["oversizedDataOssTargetArn"] = args ? args.oversizedDataOssTargetArn : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Delivery.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Delivery resources.
 */
export interface DeliveryState {
    /**
     * Open or close delivery configuration change history. true: open, false: close.
     */
    configurationItemChangeNotification?: pulumi.Input<boolean>;
    /**
     * Open or close timed snapshot of shipping resources. **NOTE:** The attribute is valid when the attribute `deliveryChannelType` is `OSS`.
     */
    configurationSnapshot?: pulumi.Input<boolean>;
    /**
     * The rule attached to the delivery method. Please refer to api [CreateConfigDeliveryChannel](https://help.aliyun.com/document_detail/429798.html) for example format. **NOTE:** The attribute is valid when the attribute `deliveryChannelType` is `MNS`.
     */
    deliveryChannelCondition?: pulumi.Input<string>;
    /**
     * The name of the delivery method.
     */
    deliveryChannelName?: pulumi.Input<string>;
    /**
     * The ARN of the delivery destination. The value must be in one of the following formats:
     * * `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
     * * `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
     * * `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
     */
    deliveryChannelTargetArn?: pulumi.Input<string>;
    /**
     * The type of the delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
     */
    deliveryChannelType?: pulumi.Input<string>;
    /**
     * The description of the delivery method.
     */
    description?: pulumi.Input<string>;
    /**
     * Open or close non-compliance events of delivery resources. **NOTE:** The attribute is valid when the attribute `deliveryChannelType` is `SLS` or `MNS`.
     */
    nonCompliantNotification?: pulumi.Input<boolean>;
    /**
     * The oss ARN of the delivery channel when the value data oversized limit. 
     * * The value must be in one of the following formats: `acs:oss:{RegionId}:{accountId}:{bucketName}`, if your delivery destination is an Object Storage Service (OSS) bucket.
     * * Only delivery channels `SLS` and `MNS` are supported. The delivery channel limit for Log Service SLS is 1 MB, and the delivery channel limit for Message Service MNS is 64 KB.
     */
    oversizedDataOssTargetArn?: pulumi.Input<string>;
    /**
     * The status of the delivery method. Valid values: `0`: The delivery method is disabled. `1`: The delivery destination is enabled. This is the default value.
     */
    status?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Delivery resource.
 */
export interface DeliveryArgs {
    /**
     * Open or close delivery configuration change history. true: open, false: close.
     */
    configurationItemChangeNotification?: pulumi.Input<boolean>;
    /**
     * Open or close timed snapshot of shipping resources. **NOTE:** The attribute is valid when the attribute `deliveryChannelType` is `OSS`.
     */
    configurationSnapshot?: pulumi.Input<boolean>;
    /**
     * The rule attached to the delivery method. Please refer to api [CreateConfigDeliveryChannel](https://help.aliyun.com/document_detail/429798.html) for example format. **NOTE:** The attribute is valid when the attribute `deliveryChannelType` is `MNS`.
     */
    deliveryChannelCondition?: pulumi.Input<string>;
    /**
     * The name of the delivery method.
     */
    deliveryChannelName?: pulumi.Input<string>;
    /**
     * The ARN of the delivery destination. The value must be in one of the following formats:
     * * `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
     * * `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
     * * `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
     */
    deliveryChannelTargetArn: pulumi.Input<string>;
    /**
     * The type of the delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
     */
    deliveryChannelType: pulumi.Input<string>;
    /**
     * The description of the delivery method.
     */
    description?: pulumi.Input<string>;
    /**
     * Open or close non-compliance events of delivery resources. **NOTE:** The attribute is valid when the attribute `deliveryChannelType` is `SLS` or `MNS`.
     */
    nonCompliantNotification?: pulumi.Input<boolean>;
    /**
     * The oss ARN of the delivery channel when the value data oversized limit. 
     * * The value must be in one of the following formats: `acs:oss:{RegionId}:{accountId}:{bucketName}`, if your delivery destination is an Object Storage Service (OSS) bucket.
     * * Only delivery channels `SLS` and `MNS` are supported. The delivery channel limit for Log Service SLS is 1 MB, and the delivery channel limit for Message Service MNS is 64 KB.
     */
    oversizedDataOssTargetArn?: pulumi.Input<string>;
    /**
     * The status of the delivery method. Valid values: `0`: The delivery method is disabled. `1`: The delivery destination is enabled. This is the default value.
     */
    status?: pulumi.Input<number>;
}