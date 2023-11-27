// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.databasefilesystem;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.databasefilesystem.AutoSnapShotPolicyArgs;
import com.pulumi.alicloud.databasefilesystem.inputs.AutoSnapShotPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Dbfs Auto Snap Shot Policy resource.
 * 
 * For information about Dbfs Auto Snap Shot Policy and how to use it.
 * 
 * &gt; **NOTE:** Available since v1.202.0.
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
 * import com.pulumi.alicloud.databasefilesystem.AutoSnapShotPolicy;
 * import com.pulumi.alicloud.databasefilesystem.AutoSnapShotPolicyArgs;
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
 *         var default_ = new AutoSnapShotPolicy(&#34;default&#34;, AutoSnapShotPolicyArgs.builder()        
 *             .policyName(&#34;tf-example&#34;)
 *             .repeatWeekdays(&#34;2&#34;)
 *             .retentionDays(1)
 *             .timePoints(&#34;01&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Dbfs Auto Snap Shot Policy can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:databasefilesystem/autoSnapShotPolicy:AutoSnapShotPolicy example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:databasefilesystem/autoSnapShotPolicy:AutoSnapShotPolicy")
public class AutoSnapShotPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The number of database file systems set by the automatic snapshot policy.
     * 
     */
    @Export(name="appliedDbfsNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> appliedDbfsNumber;

    /**
     * @return The number of database file systems set by the automatic snapshot policy.
     * 
     */
    public Output<Integer> appliedDbfsNumber() {
        return this.appliedDbfsNumber;
    }
    /**
     * The creation time of the resource
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the resource
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Last modification time of automatic snapshot policy
     * 
     */
    @Export(name="lastModified", refs={String.class}, tree="[0]")
    private Output<String> lastModified;

    /**
     * @return Last modification time of automatic snapshot policy
     * 
     */
    public Output<String> lastModified() {
        return this.lastModified;
    }
    /**
     * Automatic snapshot policy ID
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output<String> policyId;

    /**
     * @return Automatic snapshot policy ID
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }
    /**
     * Automatic snapshot policy name
     * 
     */
    @Export(name="policyName", refs={String.class}, tree="[0]")
    private Output<String> policyName;

    /**
     * @return Automatic snapshot policy name
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }
    /**
     * A collection of automatic snapshots performed on several days of the week. Value range: 1~7, for example, `1` means Monday.
     * 
     */
    @Export(name="repeatWeekdays", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> repeatWeekdays;

    /**
     * @return A collection of automatic snapshots performed on several days of the week. Value range: 1~7, for example, `1` means Monday.
     * 
     */
    public Output<List<String>> repeatWeekdays() {
        return this.repeatWeekdays;
    }
    /**
     * Automatic snapshot retention days.
     * 
     */
    @Export(name="retentionDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> retentionDays;

    /**
     * @return Automatic snapshot retention days.
     * 
     */
    public Output<Integer> retentionDays() {
        return this.retentionDays;
    }
    /**
     * Automatic snapshot policy status
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Automatic snapshot policy status
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Automatic snapshot policy status details
     * 
     */
    @Export(name="statusDetail", refs={String.class}, tree="[0]")
    private Output<String> statusDetail;

    /**
     * @return Automatic snapshot policy status details
     * 
     */
    public Output<String> statusDetail() {
        return this.statusDetail;
    }
    /**
     * The set of times at which the snapshot is taken on the day the automatic snapshot is executed. Value range: `00` to `23`, representing 24 time points from 00:00 to 23:00, for example, `01` indicates 01:00.
     * 
     */
    @Export(name="timePoints", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> timePoints;

    /**
     * @return The set of times at which the snapshot is taken on the day the automatic snapshot is executed. Value range: `00` to `23`, representing 24 time points from 00:00 to 23:00, for example, `01` indicates 01:00.
     * 
     */
    public Output<List<String>> timePoints() {
        return this.timePoints;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutoSnapShotPolicy(String name) {
        this(name, AutoSnapShotPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoSnapShotPolicy(String name, AutoSnapShotPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoSnapShotPolicy(String name, AutoSnapShotPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:databasefilesystem/autoSnapShotPolicy:AutoSnapShotPolicy", name, args == null ? AutoSnapShotPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutoSnapShotPolicy(String name, Output<String> id, @Nullable AutoSnapShotPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:databasefilesystem/autoSnapShotPolicy:AutoSnapShotPolicy", name, state, makeResourceOptions(options, id));
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
    public static AutoSnapShotPolicy get(String name, Output<String> id, @Nullable AutoSnapShotPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutoSnapShotPolicy(name, id, state, options);
    }
}
