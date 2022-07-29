// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.databasefilesystem;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.databasefilesystem.InstanceArgs;
import com.pulumi.alicloud.databasefilesystem.inputs.InstanceState;
import com.pulumi.alicloud.databasefilesystem.outputs.InstanceEcsList;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DBFS Instance resource.
 * 
 * For information about DBFS Instance and how to use it, see [What is Instance](https://help.aliyun.com/document_detail/149726.html).
 * 
 * &gt; **NOTE:** Available in v1.136.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DBFS Instance can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:databasefilesystem/instance:Instance example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:databasefilesystem/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * The type of the Database file system. Valid values: `standard`.
     * 
     */
    @Export(name="category", type=String.class, parameters={})
    private Output<String> category;

    /**
     * @return The type of the Database file system. Valid values: `standard`.
     * 
     */
    public Output<String> category() {
        return this.category;
    }
    /**
     * Whether to delete the original snapshot after the DBFS is created using the snapshot. Valid values : `true` anf `false`.
     * 
     */
    @Export(name="deleteSnapshot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteSnapshot;

    /**
     * @return Whether to delete the original snapshot after the DBFS is created using the snapshot. Valid values : `true` anf `false`.
     * 
     */
    public Output<Optional<Boolean>> deleteSnapshot() {
        return Codegen.optional(this.deleteSnapshot);
    }
    /**
     * The collection of ECS instances mounted to the Database file system. See the following `Block ecs_list`. **NOTE:** Field &#39;ecs_list&#39; has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_dbfs_instance_attachment&#39; to attach ECS and DBFS.
     * 
     * @deprecated
     * Field &#39;ecs_list&#39; has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_dbfs_instance_attachment&#39; to attach ECS and DBFS.
     * 
     */
    @Deprecated /* Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS. */
    @Export(name="ecsLists", type=List.class, parameters={InstanceEcsList.class})
    private Output</* @Nullable */ List<InstanceEcsList>> ecsLists;

    /**
     * @return The collection of ECS instances mounted to the Database file system. See the following `Block ecs_list`. **NOTE:** Field &#39;ecs_list&#39; has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_dbfs_instance_attachment&#39; to attach ECS and DBFS.
     * 
     */
    public Output<Optional<List<InstanceEcsList>>> ecsLists() {
        return Codegen.optional(this.ecsLists);
    }
    /**
     * Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
     * 
     */
    @Export(name="enableRaid", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableRaid;

    /**
     * @return Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
     * 
     */
    public Output<Optional<Boolean>> enableRaid() {
        return Codegen.optional(this.enableRaid);
    }
    /**
     * Whether to encrypt the database file system. Valid values: `true` and `false`.
     * 
     */
    @Export(name="encryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> encryption;

    /**
     * @return Whether to encrypt the database file system. Valid values: `true` and `false`.
     * 
     */
    public Output<Optional<Boolean>> encryption() {
        return Codegen.optional(this.encryption);
    }
    /**
     * The name of the Database file system.
     * 
     */
    @Export(name="instanceName", type=String.class, parameters={})
    private Output<String> instanceName;

    /**
     * @return The name of the Database file system.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }
    /**
     * The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
     * 
     */
    public Output<Optional<String>> kmsKeyId() {
        return Codegen.optional(this.kmsKeyId);
    }
    /**
     * The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
     * 
     */
    @Export(name="performanceLevel", type=String.class, parameters={})
    private Output<String> performanceLevel;

    /**
     * @return The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
     * 
     */
    public Output<String> performanceLevel() {
        return this.performanceLevel;
    }
    /**
     * The number of strip. This parameter is valid When `enable_raid` parameter is set to `true`.
     * 
     */
    @Export(name="raidStripeUnitNumber", type=String.class, parameters={})
    private Output</* @Nullable */ String> raidStripeUnitNumber;

    /**
     * @return The number of strip. This parameter is valid When `enable_raid` parameter is set to `true`.
     * 
     */
    public Output<Optional<String>> raidStripeUnitNumber() {
        return Codegen.optional(this.raidStripeUnitNumber);
    }
    /**
     * The size Of the Database file system. Unit: GiB.
     * 
     */
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return The size Of the Database file system. Unit: GiB.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * The snapshot id of the Database file system.
     * 
     */
    @Export(name="snapshotId", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotId;

    /**
     * @return The snapshot id of the Database file system.
     * 
     */
    public Output<Optional<String>> snapshotId() {
        return Codegen.optional(this.snapshotId);
    }
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> status() {
        return this.status;
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
     * The Zone ID of the Database file system.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The Zone ID of the Database file system.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:databasefilesystem/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:databasefilesystem/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
