// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsDiskArgs;
import com.pulumi.alicloud.ecs.inputs.EcsDiskState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECS Disk resource.
 * 
 * For information about ECS Disk and how to use it, see [What is Disk](https://www.alibabacloud.com/help/en/doc-detail/25513.htm).
 * 
 * &gt; **NOTE:** Available in v1.122.0+.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.ecs.EcsDisk;
 * import com.pulumi.alicloud.ecs.EcsDiskArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new EcsDisk(&#34;example&#34;, EcsDiskArgs.builder()        
 *             .category(&#34;cloud_efficiency&#34;)
 *             .description(&#34;Hello ecs disk.&#34;)
 *             .diskName(&#34;tf-test&#34;)
 *             .encrypted(true)
 *             .kmsKeyId(&#34;2a6767f0-a16c-4679-a60f-13bf*****&#34;)
 *             .size(&#34;30&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;TerraformTest&#34;))
 *             .zoneId(&#34;cn-beijing-b&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECS Disk can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/ecsDisk:EcsDisk example d-abcd12345
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsDisk:EcsDisk")
public class EcsDisk extends com.pulumi.resources.CustomResource {
    @Export(name="advancedFeatures", type=String.class, parameters={})
    private Output</* @Nullable */ String> advancedFeatures;

    public Output<Optional<String>> advancedFeatures() {
        return Codegen.optional(this.advancedFeatures);
    }
    /**
     * Field `availability_zone` has been deprecated from provider version 1.122.0. New field `zone_id` instead.
     * 
     * @deprecated
     * Field &#39;availability_zone&#39; has been deprecated from provider version 1.122.0. New field &#39;zone_id&#39; instead
     * 
     */
    @Deprecated /* Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return Field `availability_zone` has been deprecated from provider version 1.122.0. New field `zone_id` instead.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * Category of the disk. Valid values are `cloud`, `cloud_efficiency`, `cloud_ssd`, `cloud_essd`, `cloud_auto`. Default is `cloud_efficiency`.
     * 
     */
    @Export(name="category", type=String.class, parameters={})
    private Output</* @Nullable */ String> category;

    /**
     * @return Category of the disk. Valid values are `cloud`, `cloud_efficiency`, `cloud_ssd`, `cloud_essd`, `cloud_auto`. Default is `cloud_efficiency`.
     * 
     */
    public Output<Optional<String>> category() {
        return Codegen.optional(this.category);
    }
    @Export(name="dedicatedBlockStorageClusterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> dedicatedBlockStorageClusterId;

    public Output<Optional<String>> dedicatedBlockStorageClusterId() {
        return Codegen.optional(this.dedicatedBlockStorageClusterId);
    }
    /**
     * Indicates whether the automatic snapshot is deleted when the disk is released. Default value: `false`.
     * 
     */
    @Export(name="deleteAutoSnapshot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteAutoSnapshot;

    /**
     * @return Indicates whether the automatic snapshot is deleted when the disk is released. Default value: `false`.
     * 
     */
    public Output<Optional<Boolean>> deleteAutoSnapshot() {
        return Codegen.optional(this.deleteAutoSnapshot);
    }
    /**
     * Indicates whether the disk is released together with the instance. Default value: `false`.
     * 
     */
    @Export(name="deleteWithInstance", type=Boolean.class, parameters={})
    private Output<Boolean> deleteWithInstance;

    /**
     * @return Indicates whether the disk is released together with the instance. Default value: `false`.
     * 
     */
    public Output<Boolean> deleteWithInstance() {
        return this.deleteWithInstance;
    }
    /**
     * Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin or end with a hyphen, and must not begin with `http://` or `https://`. Default value is `null`.
     * 
     */
    @Export(name="diskName", type=String.class, parameters={})
    private Output<String> diskName;

    /**
     * @return Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin or end with a hyphen, and must not begin with `http://` or `https://`. Default value is `null`.
     * 
     */
    public Output<String> diskName() {
        return this.diskName;
    }
    /**
     * Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
     * 
     */
    @Export(name="dryRun", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * Indicates whether to enable creating snapshot automatically.
     * 
     */
    @Export(name="enableAutoSnapshot", type=Boolean.class, parameters={})
    private Output<Boolean> enableAutoSnapshot;

    /**
     * @return Indicates whether to enable creating snapshot automatically.
     * 
     */
    public Output<Boolean> enableAutoSnapshot() {
        return this.enableAutoSnapshot;
    }
    @Export(name="encryptAlgorithm", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptAlgorithm;

    public Output<Optional<String>> encryptAlgorithm() {
        return Codegen.optional(this.encryptAlgorithm);
    }
    /**
     * If true, the disk will be encrypted, conflict with `snapshot_id`.
     * 
     */
    @Export(name="encrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> encrypted;

    /**
     * @return If true, the disk will be encrypted, conflict with `snapshot_id`.
     * 
     */
    public Output<Optional<Boolean>> encrypted() {
        return Codegen.optional(this.encrypted);
    }
    /**
     * The ID of the instance to which the created subscription disk is automatically attached.
     * * After you specify the instance ID, the specified `resource_group_id`, `tags`, and `kms_key_id` parameters are ignored.
     * * One of the `zone_id` and `instance_id` must be set but can not be set at the same time.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The ID of the instance to which the created subscription disk is automatically attached.
     * * After you specify the instance ID, the specified `resource_group_id`, `tags`, and `kms_key_id` parameters are ignored.
     * * One of the `zone_id` and `instance_id` must be set but can not be set at the same time.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The ID of the KMS key corresponding to the data disk, The specified parameter `Encrypted` must be `true` when KmsKeyId is not empty.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return The ID of the KMS key corresponding to the data disk, The specified parameter `Encrypted` must be `true` when KmsKeyId is not empty.
     * 
     */
    public Output<Optional<String>> kmsKeyId() {
        return Codegen.optional(this.kmsKeyId);
    }
    /**
     * Field `name` has been deprecated from provider version 1.122.0. New field `disk_name` instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.122.0. New field &#39;disk_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.122.0. New field 'disk_name' instead. */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Field `name` has been deprecated from provider version 1.122.0. New field `disk_name` instead.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Payment method for disk. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`. If you want to change the disk payment type, the `instance_id` is required.
     * 
     */
    @Export(name="paymentType", type=String.class, parameters={})
    private Output<String> paymentType;

    /**
     * @return Payment method for disk. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`. If you want to change the disk payment type, the `instance_id` is required.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * Specifies the performance level of an ESSD when you create the ESSD. Valid values:
     * 
     */
    @Export(name="performanceLevel", type=String.class, parameters={})
    private Output<String> performanceLevel;

    /**
     * @return Specifies the performance level of an ESSD when you create the ESSD. Valid values:
     * 
     */
    public Output<String> performanceLevel() {
        return this.performanceLevel;
    }
    /**
     * The Id of resource group which the disk belongs.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The Id of resource group which the disk belongs.
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    /**
     * The size of the disk in GiBs. When resize the disk, the new size must be greater than the former value, or you would get an error `InvalidDiskSize.TooSmall`.
     * 
     */
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return The size of the disk in GiBs. When resize the disk, the new size must be greater than the former value, or you would get an error `InvalidDiskSize.TooSmall`.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * A snapshot to base the disk off of. If the disk size required by snapshot is greater than `size`, the `size` will be ignored, conflict with `encrypted`.
     * 
     */
    @Export(name="snapshotId", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotId;

    /**
     * @return A snapshot to base the disk off of. If the disk size required by snapshot is greater than `size`, the `size` will be ignored, conflict with `encrypted`.
     * 
     */
    public Output<Optional<String>> snapshotId() {
        return Codegen.optional(this.snapshotId);
    }
    /**
     * The disk status.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The disk status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The ID of the storage set.
     * 
     */
    @Export(name="storageSetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageSetId;

    /**
     * @return The ID of the storage set.
     * 
     */
    public Output<Optional<String>> storageSetId() {
        return Codegen.optional(this.storageSetId);
    }
    /**
     * The number of partitions in the storage set.
     * 
     */
    @Export(name="storageSetPartitionNumber", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> storageSetPartitionNumber;

    /**
     * @return The number of partitions in the storage set.
     * 
     */
    public Output<Optional<Integer>> storageSetPartitionNumber() {
        return Codegen.optional(this.storageSetPartitionNumber);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type to expand cloud disks. Valid Values: `online`, `offline`. Default to `offline`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type to expand cloud disks. Valid Values: `online`, `offline`. Default to `offline`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * ID of the free zone to which the disk belongs. One of the `zone_id` and `instance_id` must be set but can not be set at the same time.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return ID of the free zone to which the disk belongs. One of the `zone_id` and `instance_id` must be set but can not be set at the same time.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsDisk(String name) {
        this(name, EcsDiskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsDisk(String name, @Nullable EcsDiskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsDisk(String name, @Nullable EcsDiskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsDisk:EcsDisk", name, args == null ? EcsDiskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EcsDisk(String name, Output<String> id, @Nullable EcsDiskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsDisk:EcsDisk", name, state, makeResourceOptions(options, id));
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
    public static EcsDisk get(String name, Output<String> id, @Nullable EcsDiskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsDisk(name, id, state, options);
    }
}
