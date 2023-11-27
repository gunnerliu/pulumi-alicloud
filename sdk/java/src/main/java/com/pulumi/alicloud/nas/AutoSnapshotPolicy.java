// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.nas.AutoSnapshotPolicyArgs;
import com.pulumi.alicloud.nas.inputs.AutoSnapshotPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Network Attached Storage (NAS) Auto Snapshot Policy resource.
 * 
 * For information about Network Attached Storage (NAS) Auto Snapshot Policy and how to use it, see [What is Auto Snapshot Policy](https://www.alibabacloud.com/help/en/doc-detail/135662.html).
 * 
 * &gt; **NOTE:** Available in v1.153.0+.
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
 * import com.pulumi.alicloud.nas.AutoSnapshotPolicy;
 * import com.pulumi.alicloud.nas.AutoSnapshotPolicyArgs;
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
 *         var example = new AutoSnapshotPolicy(&#34;example&#34;, AutoSnapshotPolicyArgs.builder()        
 *             .autoSnapshotPolicyName(&#34;example_value&#34;)
 *             .repeatWeekdays(            
 *                 &#34;3&#34;,
 *                 &#34;4&#34;,
 *                 &#34;5&#34;)
 *             .retentionDays(30)
 *             .timePoints(            
 *                 &#34;3&#34;,
 *                 &#34;4&#34;,
 *                 &#34;5&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Network Attached Storage (NAS) Auto Snapshot Policy can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:nas/autoSnapshotPolicy:AutoSnapshotPolicy example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:nas/autoSnapshotPolicy:AutoSnapshotPolicy")
public class AutoSnapshotPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The name of the automatic snapshot policy. Limits:
     * - The name must be `2` to `128` characters in length,
     * - The name must start with a letter.
     * - The name can contain digits, colons (:), underscores (_), and hyphens (-). The name cannot start with `http://` or `https://`.
     * - The value of this parameter is empty by default.
     * 
     */
    @Export(name="autoSnapshotPolicyName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> autoSnapshotPolicyName;

    /**
     * @return The name of the automatic snapshot policy. Limits:
     * - The name must be `2` to `128` characters in length,
     * - The name must start with a letter.
     * - The name can contain digits, colons (:), underscores (_), and hyphens (-). The name cannot start with `http://` or `https://`.
     * - The value of this parameter is empty by default.
     * 
     */
    public Output<Optional<String>> autoSnapshotPolicyName() {
        return Codegen.optional(this.autoSnapshotPolicyName);
    }
    /**
     * The day on which an auto snapshot is created.
     * - A maximum of 7 time points can be selected.
     * - The format is  an JSON array of [&#34;1&#34;, &#34;2&#34;, … &#34;7&#34;]  and the time points are separated by commas (,).
     * 
     */
    @Export(name="repeatWeekdays", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> repeatWeekdays;

    /**
     * @return The day on which an auto snapshot is created.
     * - A maximum of 7 time points can be selected.
     * - The format is  an JSON array of [&#34;1&#34;, &#34;2&#34;, … &#34;7&#34;]  and the time points are separated by commas (,).
     * 
     */
    public Output<List<String>> repeatWeekdays() {
        return this.repeatWeekdays;
    }
    /**
     * The number of days for which you want to retain auto snapshots. Unit: days. Valid values:
     * - `-1`: the default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
     * 
     */
    @Export(name="retentionDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> retentionDays;

    /**
     * @return The number of days for which you want to retain auto snapshots. Unit: days. Valid values:
     * - `-1`: the default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
     * 
     */
    public Output<Integer> retentionDays() {
        return this.retentionDays;
    }
    /**
     * The status of the automatic snapshot policy.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the automatic snapshot policy.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The point in time at which an auto snapshot is created.
     * - A maximum of 24 time points can be selected.
     * - The format is  an JSON array of [&#34;0&#34;, &#34;1&#34;, … &#34;23&#34;] and the time points are separated by commas (,).
     * 
     */
    @Export(name="timePoints", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> timePoints;

    /**
     * @return The point in time at which an auto snapshot is created.
     * - A maximum of 24 time points can be selected.
     * - The format is  an JSON array of [&#34;0&#34;, &#34;1&#34;, … &#34;23&#34;] and the time points are separated by commas (,).
     * 
     */
    public Output<List<String>> timePoints() {
        return this.timePoints;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutoSnapshotPolicy(String name) {
        this(name, AutoSnapshotPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoSnapshotPolicy(String name, AutoSnapshotPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoSnapshotPolicy(String name, AutoSnapshotPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nas/autoSnapshotPolicy:AutoSnapshotPolicy", name, args == null ? AutoSnapshotPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutoSnapshotPolicy(String name, Output<String> id, @Nullable AutoSnapshotPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nas/autoSnapshotPolicy:AutoSnapshotPolicy", name, state, makeResourceOptions(options, id));
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
    public static AutoSnapshotPolicy get(String name, Output<String> id, @Nullable AutoSnapshotPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutoSnapshotPolicy(name, id, state, options);
    }
}
