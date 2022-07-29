// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cfg.AggregateDeliveryArgs;
import com.pulumi.alicloud.cfg.inputs.AggregateDeliveryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Config Aggregate Delivery resource.
 * 
 * For information about Cloud Config Aggregate Delivery and how to use it, see [What is Aggregate Delivery](https://www.alibabacloud.com/help/en/cloud-config/latest/delivery-destination-services-overview).
 * 
 * &gt; **NOTE:** Available in v1.172.0+.
 * 
 * ## Import
 * 
 * Cloud Config Aggregate Delivery can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cfg/aggregateDelivery:AggregateDelivery example &lt;aggregator_id&gt;:&lt;delivery_channel_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cfg/aggregateDelivery:AggregateDelivery")
public class AggregateDelivery extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Aggregator.
     * 
     */
    @Export(name="aggregatorId", type=String.class, parameters={})
    private Output<String> aggregatorId;

    /**
     * @return The ID of the Aggregator.
     * 
     */
    public Output<String> aggregatorId() {
        return this.aggregatorId;
    }
    /**
     * Open or close delivery configuration change history.
     * 
     */
    @Export(name="configurationItemChangeNotification", type=Boolean.class, parameters={})
    private Output<Boolean> configurationItemChangeNotification;

    /**
     * @return Open or close delivery configuration change history.
     * 
     */
    public Output<Boolean> configurationItemChangeNotification() {
        return this.configurationItemChangeNotification;
    }
    /**
     * Open or close timed snapshot of shipping resources. **NOTE:** The attribute is valid when the attribute `delivery_channel_type` is `OSS`.
     * 
     */
    @Export(name="configurationSnapshot", type=Boolean.class, parameters={})
    private Output<Boolean> configurationSnapshot;

    /**
     * @return Open or close timed snapshot of shipping resources. **NOTE:** The attribute is valid when the attribute `delivery_channel_type` is `OSS`.
     * 
     */
    public Output<Boolean> configurationSnapshot() {
        return this.configurationSnapshot;
    }
    /**
     * The rule attached to the delivery method. Please refer to api [CreateConfigDeliveryChannel](https://help.aliyun.com/document_detail/429798.html) for example format. **NOTE:** The attribute is valid when the attribute `delivery_channel_type` is `MNS`.
     * 
     */
    @Export(name="deliveryChannelCondition", type=String.class, parameters={})
    private Output</* @Nullable */ String> deliveryChannelCondition;

    /**
     * @return The rule attached to the delivery method. Please refer to api [CreateConfigDeliveryChannel](https://help.aliyun.com/document_detail/429798.html) for example format. **NOTE:** The attribute is valid when the attribute `delivery_channel_type` is `MNS`.
     * 
     */
    public Output<Optional<String>> deliveryChannelCondition() {
        return Codegen.optional(this.deliveryChannelCondition);
    }
    /**
     * The ID of the delivery method.
     * 
     */
    @Export(name="deliveryChannelId", type=String.class, parameters={})
    private Output<String> deliveryChannelId;

    /**
     * @return The ID of the delivery method.
     * 
     */
    public Output<String> deliveryChannelId() {
        return this.deliveryChannelId;
    }
    /**
     * The name of the delivery method.
     * 
     */
    @Export(name="deliveryChannelName", type=String.class, parameters={})
    private Output</* @Nullable */ String> deliveryChannelName;

    /**
     * @return The name of the delivery method.
     * 
     */
    public Output<Optional<String>> deliveryChannelName() {
        return Codegen.optional(this.deliveryChannelName);
    }
    /**
     * The ARN of the delivery destination. The value must be in one of the following formats:
     * * `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
     * * `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
     * * `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
     * 
     */
    @Export(name="deliveryChannelTargetArn", type=String.class, parameters={})
    private Output<String> deliveryChannelTargetArn;

    /**
     * @return The ARN of the delivery destination. The value must be in one of the following formats:
     * * `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
     * * `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
     * * `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
     * 
     */
    public Output<String> deliveryChannelTargetArn() {
        return this.deliveryChannelTargetArn;
    }
    /**
     * The type of the delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
     * 
     */
    @Export(name="deliveryChannelType", type=String.class, parameters={})
    private Output<String> deliveryChannelType;

    /**
     * @return The type of the delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
     * 
     */
    public Output<String> deliveryChannelType() {
        return this.deliveryChannelType;
    }
    /**
     * The description of the delivery method.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the delivery method.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Open or close non-compliance events of delivery resources. **NOTE:** The attribute is valid when the attribute `delivery_channel_type` is `SLS` or `MNS`.
     * 
     */
    @Export(name="nonCompliantNotification", type=Boolean.class, parameters={})
    private Output<Boolean> nonCompliantNotification;

    /**
     * @return Open or close non-compliance events of delivery resources. **NOTE:** The attribute is valid when the attribute `delivery_channel_type` is `SLS` or `MNS`.
     * 
     */
    public Output<Boolean> nonCompliantNotification() {
        return this.nonCompliantNotification;
    }
    /**
     * The oss ARN of the delivery channel when the value data oversized limit.
     * * The value must be in one of the following formats: `acs:oss:{RegionId}:{accountId}:{bucketName}`, if your delivery destination is an Object Storage Service (OSS) bucket.
     * * Only delivery channels `SLS` and `MNS` are supported. The delivery channel limit for Log Service SLS is 1 MB, and the delivery channel limit for Message Service MNS is 64 KB.
     * 
     */
    @Export(name="oversizedDataOssTargetArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> oversizedDataOssTargetArn;

    /**
     * @return The oss ARN of the delivery channel when the value data oversized limit.
     * * The value must be in one of the following formats: `acs:oss:{RegionId}:{accountId}:{bucketName}`, if your delivery destination is an Object Storage Service (OSS) bucket.
     * * Only delivery channels `SLS` and `MNS` are supported. The delivery channel limit for Log Service SLS is 1 MB, and the delivery channel limit for Message Service MNS is 64 KB.
     * 
     */
    public Output<Optional<String>> oversizedDataOssTargetArn() {
        return Codegen.optional(this.oversizedDataOssTargetArn);
    }
    /**
     * The status of the delivery method. Valid values: `0`: The delivery method is disabled. `1`: The delivery destination is enabled. This is the default value.
     * 
     */
    @Export(name="status", type=Integer.class, parameters={})
    private Output<Integer> status;

    /**
     * @return The status of the delivery method. Valid values: `0`: The delivery method is disabled. `1`: The delivery destination is enabled. This is the default value.
     * 
     */
    public Output<Integer> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AggregateDelivery(String name) {
        this(name, AggregateDeliveryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AggregateDelivery(String name, AggregateDeliveryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AggregateDelivery(String name, AggregateDeliveryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cfg/aggregateDelivery:AggregateDelivery", name, args == null ? AggregateDeliveryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AggregateDelivery(String name, Output<String> id, @Nullable AggregateDeliveryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cfg/aggregateDelivery:AggregateDelivery", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AggregateDelivery get(String name, Output<String> id, @Nullable AggregateDeliveryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AggregateDelivery(name, id, state, options);
    }
}
