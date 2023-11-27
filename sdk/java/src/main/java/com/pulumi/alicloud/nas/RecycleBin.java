// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.nas.RecycleBinArgs;
import com.pulumi.alicloud.nas.inputs.RecycleBinState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Network Attached Storage (NAS) Recycle Bin resource.
 * 
 * For information about Network Attached Storage (NAS) Recycle Bin and how to use it, see [What is Recycle Bin](https://www.alibabacloud.com/help/en/doc-detail/264185.html).
 * 
 * &gt; **NOTE:** Available in v1.155.0+.
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
 * import com.pulumi.alicloud.nas.NasFunctions;
 * import com.pulumi.alicloud.nas.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.nas.FileSystem;
 * import com.pulumi.alicloud.nas.FileSystemArgs;
 * import com.pulumi.alicloud.nas.RecycleBin;
 * import com.pulumi.alicloud.nas.RecycleBinArgs;
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
 *         final var exampleZones = NasFunctions.getZones(GetZonesArgs.builder()
 *             .fileSystemType(&#34;standard&#34;)
 *             .build());
 * 
 *         var exampleFileSystem = new FileSystem(&#34;exampleFileSystem&#34;, FileSystemArgs.builder()        
 *             .protocolType(&#34;NFS&#34;)
 *             .storageType(&#34;Performance&#34;)
 *             .description(&#34;terraform-example&#34;)
 *             .encryptType(&#34;1&#34;)
 *             .zoneId(exampleZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].zoneId()))
 *             .build());
 * 
 *         var exampleRecycleBin = new RecycleBin(&#34;exampleRecycleBin&#34;, RecycleBinArgs.builder()        
 *             .fileSystemId(exampleFileSystem.id())
 *             .reservedDays(3)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Network Attached Storage (NAS) Recycle Bin can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:nas/recycleBin:RecycleBin example &lt;file_system_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:nas/recycleBin:RecycleBin")
public class RecycleBin extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the file system for which you want to enable the recycle bin feature.
     * 
     */
    @Export(name="fileSystemId", refs={String.class}, tree="[0]")
    private Output<String> fileSystemId;

    /**
     * @return The ID of the file system for which you want to enable the recycle bin feature.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }
    /**
     * The period for which the files in the recycle bin are retained. Unit: days. Valid values: `1` to `180`.
     * 
     */
    @Export(name="reservedDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> reservedDays;

    /**
     * @return The period for which the files in the recycle bin are retained. Unit: days. Valid values: `1` to `180`.
     * 
     */
    public Output<Integer> reservedDays() {
        return this.reservedDays;
    }
    /**
     * The status of the recycle bin.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the recycle bin.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RecycleBin(String name) {
        this(name, RecycleBinArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RecycleBin(String name, RecycleBinArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RecycleBin(String name, RecycleBinArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nas/recycleBin:RecycleBin", name, args == null ? RecycleBinArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RecycleBin(String name, Output<String> id, @Nullable RecycleBinState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nas/recycleBin:RecycleBin", name, state, makeResourceOptions(options, id));
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
    public static RecycleBin get(String name, Output<String> id, @Nullable RecycleBinState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RecycleBin(name, id, state, options);
    }
}
