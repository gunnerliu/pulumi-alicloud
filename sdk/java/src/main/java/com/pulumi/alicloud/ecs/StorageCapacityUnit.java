// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.StorageCapacityUnitArgs;
import com.pulumi.alicloud.ecs.inputs.StorageCapacityUnitState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECS Storage Capacity Unit resource.
 * 
 * For information about ECS Storage Capacity Unit and how to use it, see [What is Storage Capacity Unit](https://www.alibabacloud.com/help/en/doc-detail/161157.html).
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
 * import com.pulumi.alicloud.ecs.StorageCapacityUnit;
 * import com.pulumi.alicloud.ecs.StorageCapacityUnitArgs;
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
 *         var default_ = new StorageCapacityUnit(&#34;default&#34;, StorageCapacityUnitArgs.builder()        
 *             .capacity(20)
 *             .description(&#34;tftestdescription&#34;)
 *             .storageCapacityUnitName(&#34;tftestname&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECS Storage Capacity Unit can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/storageCapacityUnit:StorageCapacityUnit example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/storageCapacityUnit:StorageCapacityUnit")
public class StorageCapacityUnit extends com.pulumi.resources.CustomResource {
    /**
     * The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
     * 
     */
    @Export(name="capacity", refs={Integer.class}, tree="[0]")
    private Output<Integer> capacity;

    /**
     * @return The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
     * 
     */
    public Output<Integer> capacity() {
        return this.capacity;
    }
    /**
     * The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The validity period of the Storage Capacity Unit. Default value: `1`.
     * * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
     * * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
     * 
     */
    @Export(name="period", refs={Integer.class}, tree="[0]")
    private Output<Integer> period;

    /**
     * @return The validity period of the Storage Capacity Unit. Default value: `1`.
     * * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
     * * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
     * 
     */
    public Output<Integer> period() {
        return this.period;
    }
    /**
     * The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
     * 
     */
    @Export(name="periodUnit", refs={String.class}, tree="[0]")
    private Output<String> periodUnit;

    /**
     * @return The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
     * 
     */
    public Output<String> periodUnit() {
        return this.periodUnit;
    }
    /**
     * The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
     * 
     */
    @Export(name="startTime", refs={String.class}, tree="[0]")
    private Output<String> startTime;

    /**
     * @return The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }
    /**
     * The status of Storage Capacity Unit.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of Storage Capacity Unit.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The name of the Storage Capacity Unit.
     * 
     */
    @Export(name="storageCapacityUnitName", refs={String.class}, tree="[0]")
    private Output<String> storageCapacityUnitName;

    /**
     * @return The name of the Storage Capacity Unit.
     * 
     */
    public Output<String> storageCapacityUnitName() {
        return this.storageCapacityUnitName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StorageCapacityUnit(String name) {
        this(name, StorageCapacityUnitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StorageCapacityUnit(String name, StorageCapacityUnitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StorageCapacityUnit(String name, StorageCapacityUnitArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/storageCapacityUnit:StorageCapacityUnit", name, args == null ? StorageCapacityUnitArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StorageCapacityUnit(String name, Output<String> id, @Nullable StorageCapacityUnitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/storageCapacityUnit:StorageCapacityUnit", name, state, makeResourceOptions(options, id));
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
    public static StorageCapacityUnit get(String name, Output<String> id, @Nullable StorageCapacityUnitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StorageCapacityUnit(name, id, state, options);
    }
}
