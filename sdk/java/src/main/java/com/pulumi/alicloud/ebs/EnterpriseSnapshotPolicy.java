// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ebs.EnterpriseSnapshotPolicyArgs;
import com.pulumi.alicloud.ebs.inputs.EnterpriseSnapshotPolicyState;
import com.pulumi.alicloud.ebs.outputs.EnterpriseSnapshotPolicyCrossRegionCopyInfo;
import com.pulumi.alicloud.ebs.outputs.EnterpriseSnapshotPolicyRetainRule;
import com.pulumi.alicloud.ebs.outputs.EnterpriseSnapshotPolicySchedule;
import com.pulumi.alicloud.ebs.outputs.EnterpriseSnapshotPolicySpecialRetainRules;
import com.pulumi.alicloud.ebs.outputs.EnterpriseSnapshotPolicyStorageRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a EBS Enterprise Snapshot Policy resource. enterprise snapshot policy.
 * 
 * For information about EBS Enterprise Snapshot Policy and how to use it, see [What is Enterprise Snapshot Policy](https://www.alibabacloud.com/help/en/).
 * 
 * &gt; **NOTE:** Available since v1.215.0.
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
 * import com.pulumi.alicloud.ebs.EnterpriseSnapshotPolicy;
 * import com.pulumi.alicloud.ebs.EnterpriseSnapshotPolicyArgs;
 * import com.pulumi.alicloud.ebs.inputs.EnterpriseSnapshotPolicyScheduleArgs;
 * import com.pulumi.alicloud.ebs.inputs.EnterpriseSnapshotPolicyRetainRuleArgs;
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
 *         var defaultJkW46o = new EcsDisk(&#34;defaultJkW46o&#34;, EcsDiskArgs.builder()        
 *             .category(&#34;cloud_essd&#34;)
 *             .description(&#34;esp-attachment-test&#34;)
 *             .zoneId(&#34;cn-hangzhou-i&#34;)
 *             .performanceLevel(&#34;PL1&#34;)
 *             .size(&#34;20&#34;)
 *             .diskName(name)
 *             .build());
 * 
 *         var defaultPE3jjR = new EnterpriseSnapshotPolicy(&#34;defaultPE3jjR&#34;, EnterpriseSnapshotPolicyArgs.builder()        
 *             .status(&#34;DISABLED&#34;)
 *             .desc(&#34;DESC&#34;)
 *             .schedule(EnterpriseSnapshotPolicyScheduleArgs.builder()
 *                 .cronExpression(&#34;0 0 0 1 * ?&#34;)
 *                 .build())
 *             .enterpriseSnapshotPolicyName(name)
 *             .targetType(&#34;DISK&#34;)
 *             .retainRule(EnterpriseSnapshotPolicyRetainRuleArgs.builder()
 *                 .timeInterval(&#34;120&#34;)
 *                 .timeUnit(&#34;DAYS&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * EBS Enterprise Snapshot Policy can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ebs/enterpriseSnapshotPolicy:EnterpriseSnapshotPolicy example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ebs/enterpriseSnapshotPolicy:EnterpriseSnapshotPolicy")
public class EnterpriseSnapshotPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The creation time of the resource.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Snapshot replication information. See `cross_region_copy_info` below.
     * 
     */
    @Export(name="crossRegionCopyInfo", refs={EnterpriseSnapshotPolicyCrossRegionCopyInfo.class}, tree="[0]")
    private Output<EnterpriseSnapshotPolicyCrossRegionCopyInfo> crossRegionCopyInfo;

    /**
     * @return Snapshot replication information. See `cross_region_copy_info` below.
     * 
     */
    public Output<EnterpriseSnapshotPolicyCrossRegionCopyInfo> crossRegionCopyInfo() {
        return this.crossRegionCopyInfo;
    }
    /**
     * Description information representing the resource.
     * 
     */
    @Export(name="desc", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> desc;

    /**
     * @return Description information representing the resource.
     * 
     */
    public Output<Optional<String>> desc() {
        return Codegen.optional(this.desc);
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="enterpriseSnapshotPolicyName", refs={String.class}, tree="[0]")
    private Output<String> enterpriseSnapshotPolicyName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> enterpriseSnapshotPolicyName() {
        return this.enterpriseSnapshotPolicyName;
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * Snapshot retention policy representing resources. See `retain_rule` below.
     * 
     */
    @Export(name="retainRule", refs={EnterpriseSnapshotPolicyRetainRule.class}, tree="[0]")
    private Output<EnterpriseSnapshotPolicyRetainRule> retainRule;

    /**
     * @return Snapshot retention policy representing resources. See `retain_rule` below.
     * 
     */
    public Output<EnterpriseSnapshotPolicyRetainRule> retainRule() {
        return this.retainRule;
    }
    /**
     * The scheduling plan that represents the resource. See `schedule` below.
     * 
     */
    @Export(name="schedule", refs={EnterpriseSnapshotPolicySchedule.class}, tree="[0]")
    private Output<EnterpriseSnapshotPolicySchedule> schedule;

    /**
     * @return The scheduling plan that represents the resource. See `schedule` below.
     * 
     */
    public Output<EnterpriseSnapshotPolicySchedule> schedule() {
        return this.schedule;
    }
    /**
     * Snapshot special retention rules. See `special_retain_rules` below.
     * 
     */
    @Export(name="specialRetainRules", refs={EnterpriseSnapshotPolicySpecialRetainRules.class}, tree="[0]")
    private Output<EnterpriseSnapshotPolicySpecialRetainRules> specialRetainRules;

    /**
     * @return Snapshot special retention rules. See `special_retain_rules` below.
     * 
     */
    public Output<EnterpriseSnapshotPolicySpecialRetainRules> specialRetainRules() {
        return this.specialRetainRules;
    }
    /**
     * The status of the resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Snapshot storage policy. See `storage_rule` below.
     * 
     */
    @Export(name="storageRule", refs={EnterpriseSnapshotPolicyStorageRule.class}, tree="[0]")
    private Output</* @Nullable */ EnterpriseSnapshotPolicyStorageRule> storageRule;

    /**
     * @return Snapshot storage policy. See `storage_rule` below.
     * 
     */
    public Output<Optional<EnterpriseSnapshotPolicyStorageRule>> storageRule() {
        return Codegen.optional(this.storageRule);
    }
    /**
     * The tag of the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return The tag of the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Represents the target type of resource binding.
     * 
     */
    @Export(name="targetType", refs={String.class}, tree="[0]")
    private Output<String> targetType;

    /**
     * @return Represents the target type of resource binding.
     * 
     */
    public Output<String> targetType() {
        return this.targetType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnterpriseSnapshotPolicy(String name) {
        this(name, EnterpriseSnapshotPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnterpriseSnapshotPolicy(String name, EnterpriseSnapshotPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnterpriseSnapshotPolicy(String name, EnterpriseSnapshotPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ebs/enterpriseSnapshotPolicy:EnterpriseSnapshotPolicy", name, args == null ? EnterpriseSnapshotPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EnterpriseSnapshotPolicy(String name, Output<String> id, @Nullable EnterpriseSnapshotPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ebs/enterpriseSnapshotPolicy:EnterpriseSnapshotPolicy", name, state, makeResourceOptions(options, id));
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
    public static EnterpriseSnapshotPolicy get(String name, Output<String> id, @Nullable EnterpriseSnapshotPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnterpriseSnapshotPolicy(name, id, state, options);
    }
}
