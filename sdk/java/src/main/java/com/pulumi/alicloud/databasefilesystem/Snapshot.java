// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.databasefilesystem;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.databasefilesystem.SnapshotArgs;
import com.pulumi.alicloud.databasefilesystem.inputs.SnapshotState;
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
 * Provides a DBFS Snapshot resource.
 * 
 * For information about DBFS Snapshot and how to use it.
 * 
 * &gt; **NOTE:** Available since v1.156.0.
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
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetInstanceTypesArgs;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.databasefilesystem.Instance;
 * import com.pulumi.alicloud.databasefilesystem.InstanceArgs;
 * import com.pulumi.alicloud.databasefilesystem.InstanceAttachment;
 * import com.pulumi.alicloud.databasefilesystem.InstanceAttachmentArgs;
 * import com.pulumi.alicloud.databasefilesystem.Snapshot;
 * import com.pulumi.alicloud.databasefilesystem.SnapshotArgs;
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
 *         final var config = ctx.config();
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-example&#34;);
 *         final var zoneId = &#34;cn-hangzhou-i&#34;;
 * 
 *         final var exampleInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .availabilityZone(zoneId)
 *             .instanceTypeFamily(&#34;ecs.g7se&#34;)
 *             .build());
 * 
 *         final var exampleImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .instanceType(exampleInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes())[exampleInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes()).length() - 1].id())
 *             .nameRegex(&#34;^aliyun_2&#34;)
 *             .owners(&#34;system&#34;)
 *             .build());
 * 
 *         var exampleNetwork = new Network(&#34;exampleNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;10.4.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSwitch = new Switch(&#34;exampleSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(name)
 *             .cidrBlock(&#34;10.4.0.0/24&#34;)
 *             .vpcId(exampleNetwork.id())
 *             .zoneId(zoneId)
 *             .build());
 * 
 *         var exampleSecurityGroup = new SecurityGroup(&#34;exampleSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(exampleNetwork.id())
 *             .build());
 * 
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .availabilityZone(zoneId)
 *             .instanceName(name)
 *             .imageId(exampleImages.applyValue(getImagesResult -&gt; getImagesResult.images()[1].id()))
 *             .instanceType(exampleInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes())[exampleInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes()).length() - 1].id())
 *             .securityGroups(exampleSecurityGroup.id())
 *             .vswitchId(exampleSwitch.id())
 *             .systemDiskCategory(&#34;cloud_essd&#34;)
 *             .build());
 * 
 *         var exampleDatabasefilesystem_instanceInstance = new Instance(&#34;exampleDatabasefilesystem/instanceInstance&#34;, InstanceArgs.builder()        
 *             .category(&#34;standard&#34;)
 *             .zoneId(zoneId)
 *             .performanceLevel(&#34;PL1&#34;)
 *             .instanceName(name)
 *             .size(100)
 *             .build());
 * 
 *         var exampleInstanceAttachment = new InstanceAttachment(&#34;exampleInstanceAttachment&#34;, InstanceAttachmentArgs.builder()        
 *             .ecsId(exampleInstance.id())
 *             .instanceId(exampleDatabasefilesystem / instanceInstance.id())
 *             .build());
 * 
 *         var exampleSnapshot = new Snapshot(&#34;exampleSnapshot&#34;, SnapshotArgs.builder()        
 *             .instanceId(exampleInstanceAttachment.instanceId())
 *             .snapshotName(name)
 *             .description(name)
 *             .retentionDays(30)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * DBFS Snapshot can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:databasefilesystem/snapshot:Snapshot example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:databasefilesystem/snapshot:Snapshot")
public class Snapshot extends com.pulumi.resources.CustomResource {
    /**
     * Description of the snapshot. The description must be `2` to `256` characters in length. It must start with a letter, and cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the snapshot. The description must be `2` to `256` characters in length. It must start with a letter, and cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether to force deletion of snapshots.
     * 
     */
    @Export(name="force", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return Whether to force deletion of snapshots.
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * The ID of the database file system.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The ID of the database file system.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The retention time of the snapshot. Unit: days. Snapshots are automatically released after the retention time expires. Valid values: `1` to `65536`.
     * 
     */
    @Export(name="retentionDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> retentionDays;

    /**
     * @return The retention time of the snapshot. Unit: days. Snapshots are automatically released after the retention time expires. Valid values: `1` to `65536`.
     * 
     */
    public Output<Optional<Integer>> retentionDays() {
        return Codegen.optional(this.retentionDays);
    }
    /**
     * The display name of the snapshot. The length is `2` to `128` characters. It must start with a large or small letter or Chinese, and cannot start with `http://` and `https://`. It can contain numbers, colons (:), underscores (_), or hyphens (-). To prevent name conflicts with automatic snapshots, you cannot start with `auto`.
     * 
     */
    @Export(name="snapshotName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> snapshotName;

    /**
     * @return The display name of the snapshot. The length is `2` to `128` characters. It must start with a large or small letter or Chinese, and cannot start with `http://` and `https://`. It can contain numbers, colons (:), underscores (_), or hyphens (-). To prevent name conflicts with automatic snapshots, you cannot start with `auto`.
     * 
     */
    public Output<Optional<String>> snapshotName() {
        return Codegen.optional(this.snapshotName);
    }
    /**
     * The status of the Snapshot.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Snapshot.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Snapshot(String name) {
        this(name, SnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snapshot(String name, SnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, SnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:databasefilesystem/snapshot:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Snapshot(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:databasefilesystem/snapshot:Snapshot", name, state, makeResourceOptions(options, id));
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
    public static Snapshot get(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, state, options);
    }
}
