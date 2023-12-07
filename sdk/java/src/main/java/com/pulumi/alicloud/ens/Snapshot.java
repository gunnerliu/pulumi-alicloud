// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ens.SnapshotArgs;
import com.pulumi.alicloud.ens.inputs.SnapshotState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ENS Snapshot resource. Snapshot. When you use it for the first time, please contact the product classmates to add a resource whitelist.
 * 
 * For information about ENS Snapshot and how to use it, see [What is Snapshot](https://www.alibabacloud.com/help/en/ens/developer-reference/api-createsnapshot).
 * 
 * &gt; **NOTE:** Available since v1.213.0.
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
 * import com.pulumi.alicloud.ens.Disk;
 * import com.pulumi.alicloud.ens.DiskArgs;
 * import com.pulumi.alicloud.ens.Snapshot;
 * import com.pulumi.alicloud.ens.SnapshotArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .category(&#34;cloud_efficiency&#34;)
 *             .size(&#34;20&#34;)
 *             .paymentType(&#34;PayAsYouGo&#34;)
 *             .ensRegionId(&#34;ch-zurich-1&#34;)
 *             .build());
 * 
 *         var default_ = new Snapshot(&#34;default&#34;, SnapshotArgs.builder()        
 *             .description(name)
 *             .ensRegionId(&#34;ch-zurich-1&#34;)
 *             .snapshotName(name)
 *             .diskId(disk.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ENS Snapshot can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ens/snapshot:Snapshot example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ens/snapshot:Snapshot")
public class Snapshot extends com.pulumi.resources.CustomResource {
    /**
     * Instance creation timeIt is expressed in accordance with the ISO8601 standard and uses UTC +0 time in the format of yyyy-MM-ddTHH:mm:ssZ.Example value: 2020-08-20 T14:52:28Z.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Instance creation timeIt is expressed in accordance with the ISO8601 standard and uses UTC +0 time in the format of yyyy-MM-ddTHH:mm:ssZ.Example value: 2020-08-20 T14:52:28Z.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Snapshot Description Information.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Snapshot Description Information.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Cloud Disk ID.
     * 
     */
    @Export(name="diskId", refs={String.class}, tree="[0]")
    private Output<String> diskId;

    /**
     * @return Cloud Disk ID.
     * 
     */
    public Output<String> diskId() {
        return this.diskId;
    }
    /**
     * The node ID of ENS.
     * 
     */
    @Export(name="ensRegionId", refs={String.class}, tree="[0]")
    private Output<String> ensRegionId;

    /**
     * @return The node ID of ENS.
     * 
     */
    public Output<String> ensRegionId() {
        return this.ensRegionId;
    }
    /**
     * Name of the snapshot instance.
     * 
     */
    @Export(name="snapshotName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> snapshotName;

    /**
     * @return Name of the snapshot instance.
     * 
     */
    public Output<Optional<String>> snapshotName() {
        return Codegen.optional(this.snapshotName);
    }
    /**
     * Snapshot Status. Valid values: creating, available, deleting, error.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Snapshot Status. Valid values: creating, available, deleting, error.
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
        super("alicloud:ens/snapshot:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Snapshot(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ens/snapshot:Snapshot", name, state, makeResourceOptions(options, id));
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