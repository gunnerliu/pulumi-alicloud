// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.SnapshotArgs;
import com.pulumi.alicloud.ecs.inputs.SnapshotState;
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
 * &gt; **DEPRECATED:** This resource has been renamed to alicloud.ecs.EcsSnapshot from version 1.120.0.
 * 
 * Provides an ECS snapshot resource.
 * 
 * For information about snapshot and how to use it, see [Snapshot](https://www.alibabacloud.com/help/doc-detail/25460.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.ecs.Snapshot;
 * import com.pulumi.alicloud.ecs.SnapshotArgs;
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
 *         var snapshot = new Snapshot(&#34;snapshot&#34;, SnapshotArgs.builder()        
 *             .diskId(alicloud_disk_attachment.instance-attachment().disk_id())
 *             .description(&#34;this snapshot is created for testing&#34;)
 *             .tags(Map.of(&#34;version&#34;, &#34;1.2&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Snapshot can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/snapshot:Snapshot snapshot s-abc1234567890000
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/snapshot:Snapshot")
public class Snapshot extends com.pulumi.resources.CustomResource {
    @Export(name="category", type=String.class, parameters={})
    private Output</* @Nullable */ String> category;

    public Output<Optional<String>> category() {
        return Codegen.optional(this.category);
    }
    /**
     * Description of the snapshot. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the snapshot. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The source disk ID.
     * 
     */
    @Export(name="diskId", type=String.class, parameters={})
    private Output<String> diskId;

    /**
     * @return The source disk ID.
     * 
     */
    public Output<String> diskId() {
        return this.diskId;
    }
    @Export(name="force", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> force;

    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    @Export(name="instantAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> instantAccess;

    public Output<Optional<Boolean>> instantAccess() {
        return Codegen.optional(this.instantAccess);
    }
    @Export(name="instantAccessRetentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> instantAccessRetentionDays;

    public Output<Optional<Integer>> instantAccessRetentionDays() {
        return Codegen.optional(this.instantAccessRetentionDays);
    }
    /**
     * The name of the snapshot to be created. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * It cannot start with auto, because snapshot names starting with auto are recognized as automatic snapshots.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from provider version 1.120.0. New field &#39;snapshot_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead. */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the snapshot to be created. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * It cannot start with auto, because snapshot names starting with auto are recognized as automatic snapshots.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    @Export(name="retentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionDays;

    public Output<Optional<Integer>> retentionDays() {
        return Codegen.optional(this.retentionDays);
    }
    @Export(name="snapshotName", type=String.class, parameters={})
    private Output<String> snapshotName;

    public Output<String> snapshotName() {
        return this.snapshotName;
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
        super("alicloud:ecs/snapshot:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Snapshot(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/snapshot:Snapshot", name, state, makeResourceOptions(options, id));
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
