// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cms.HybridMonitorSlsTaskArgs;
import com.pulumi.alicloud.cms.inputs.HybridMonitorSlsTaskState;
import com.pulumi.alicloud.cms.outputs.HybridMonitorSlsTaskAttachLabel;
import com.pulumi.alicloud.cms.outputs.HybridMonitorSlsTaskSlsProcessConfig;
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
 * Provides a Cloud Monitor Service Hybrid Monitor Sls Task resource.
 * 
 * For information about Cloud Monitor Service Hybrid Monitor Sls Task and how to use it, see [What is Hybrid Monitor Sls Task](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createhybridmonitortask).
 * 
 * &gt; **NOTE:** Available in v1.179.0+.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.cms.SlsGroup;
 * import com.pulumi.alicloud.cms.SlsGroupArgs;
 * import com.pulumi.alicloud.cms.inputs.SlsGroupSlsGroupConfigArgs;
 * import com.pulumi.alicloud.cms.Namespace;
 * import com.pulumi.alicloud.cms.NamespaceArgs;
 * import com.pulumi.alicloud.cms.HybridMonitorSlsTask;
 * import com.pulumi.alicloud.cms.HybridMonitorSlsTaskArgs;
 * import com.pulumi.alicloud.cms.inputs.HybridMonitorSlsTaskSlsProcessConfigArgs;
 * import com.pulumi.alicloud.cms.inputs.HybridMonitorSlsTaskSlsProcessConfigFilterArgs;
 * import com.pulumi.alicloud.cms.inputs.HybridMonitorSlsTaskAttachLabelArgs;
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
 *         final var this = AlicloudFunctions.getAccount();
 * 
 *         var defaultSlsGroup = new SlsGroup(&#34;defaultSlsGroup&#34;, SlsGroupArgs.builder()        
 *             .slsGroupConfigs(SlsGroupSlsGroupConfigArgs.builder()
 *                 .slsUserId(this_.id())
 *                 .slsLogstore(&#34;Logstore-ECS&#34;)
 *                 .slsProject(&#34;aliyun-project&#34;)
 *                 .slsRegion(&#34;cn-hangzhou&#34;)
 *                 .build())
 *             .slsGroupDescription(&#34;example_value&#34;)
 *             .slsGroupName(&#34;example_value&#34;)
 *             .build());
 * 
 *         var defaultNamespace = new Namespace(&#34;defaultNamespace&#34;, NamespaceArgs.builder()        
 *             .description(var_.name())
 *             .namespace(&#34;example-value&#34;)
 *             .specification(&#34;cms.s1.large&#34;)
 *             .build());
 * 
 *         var defaultHybridMonitorSlsTask = new HybridMonitorSlsTask(&#34;defaultHybridMonitorSlsTask&#34;, HybridMonitorSlsTaskArgs.builder()        
 *             .slsProcessConfig(HybridMonitorSlsTaskSlsProcessConfigArgs.builder()
 *                 .filter(HybridMonitorSlsTaskSlsProcessConfigFilterArgs.builder()
 *                     .relation(&#34;and&#34;)
 *                     .filters(HybridMonitorSlsTaskSlsProcessConfigFilterFilterArgs.builder()
 *                         .operator(&#34;=&#34;)
 *                         .value(&#34;200&#34;)
 *                         .slsKeyName(&#34;code&#34;)
 *                         .build())
 *                     .build())
 *                 .statistics(HybridMonitorSlsTaskSlsProcessConfigStatisticArgs.builder()
 *                     .function(&#34;count&#34;)
 *                     .alias(&#34;level_count&#34;)
 *                     .slsKeyName(&#34;name&#34;)
 *                     .parameterOne(&#34;200&#34;)
 *                     .parameterTwo(&#34;299&#34;)
 *                     .build())
 *                 .groupBies(HybridMonitorSlsTaskSlsProcessConfigGroupByArgs.builder()
 *                     .alias(&#34;code&#34;)
 *                     .slsKeyName(&#34;ApiResult&#34;)
 *                     .build())
 *                 .expresses(HybridMonitorSlsTaskSlsProcessConfigExpressArgs.builder()
 *                     .express(&#34;success_count&#34;)
 *                     .alias(&#34;SuccRate&#34;)
 *                     .build())
 *                 .build())
 *             .taskName(&#34;example_value&#34;)
 *             .namespace(defaultNamespace.id())
 *             .description(&#34;example_value&#34;)
 *             .collectInterval(60)
 *             .collectTargetType(defaultSlsGroup.id())
 *             .attachLabels(HybridMonitorSlsTaskAttachLabelArgs.builder()
 *                 .name(&#34;app_service&#34;)
 *                 .value(&#34;testValue&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Monitor Service Hybrid Monitor Sls Task can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cms/hybridMonitorSlsTask:HybridMonitorSlsTask example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cms/hybridMonitorSlsTask:HybridMonitorSlsTask")
public class HybridMonitorSlsTask extends com.pulumi.resources.CustomResource {
    /**
     * The label of the monitoring task. See the following `Block attach_labels`.
     * 
     */
    @Export(name="attachLabels", type=List.class, parameters={HybridMonitorSlsTaskAttachLabel.class})
    private Output</* @Nullable */ List<HybridMonitorSlsTaskAttachLabel>> attachLabels;

    /**
     * @return The label of the monitoring task. See the following `Block attach_labels`.
     * 
     */
    public Output<Optional<List<HybridMonitorSlsTaskAttachLabel>>> attachLabels() {
        return Codegen.optional(this.attachLabels);
    }
    /**
     * The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
     * 
     */
    @Export(name="collectInterval", type=Integer.class, parameters={})
    private Output<Integer> collectInterval;

    /**
     * @return The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
     * 
     */
    public Output<Integer> collectInterval() {
        return this.collectInterval;
    }
    /**
     * The type of the collection target, enter the name of the Logstore group.
     * 
     */
    @Export(name="collectTargetType", type=String.class, parameters={})
    private Output<String> collectTargetType;

    /**
     * @return The type of the collection target, enter the name of the Logstore group.
     * 
     */
    public Output<String> collectTargetType() {
        return this.collectTargetType;
    }
    /**
     * The description of the metric import task.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the metric import task.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the namespace.
     * 
     */
    @Export(name="namespace", type=String.class, parameters={})
    private Output<String> namespace;

    /**
     * @return The name of the namespace.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }
    /**
     * The configurations of the logs that are imported from Log Service. See the following `Block sls_process_config`.
     * 
     */
    @Export(name="slsProcessConfig", type=HybridMonitorSlsTaskSlsProcessConfig.class, parameters={})
    private Output<HybridMonitorSlsTaskSlsProcessConfig> slsProcessConfig;

    /**
     * @return The configurations of the logs that are imported from Log Service. See the following `Block sls_process_config`.
     * 
     */
    public Output<HybridMonitorSlsTaskSlsProcessConfig> slsProcessConfig() {
        return this.slsProcessConfig;
    }
    /**
     * The name of the metric import task, enter the name of the metric for logs imported from Log Service.
     * 
     */
    @Export(name="taskName", type=String.class, parameters={})
    private Output<String> taskName;

    /**
     * @return The name of the metric import task, enter the name of the metric for logs imported from Log Service.
     * 
     */
    public Output<String> taskName() {
        return this.taskName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HybridMonitorSlsTask(String name) {
        this(name, HybridMonitorSlsTaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HybridMonitorSlsTask(String name, HybridMonitorSlsTaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HybridMonitorSlsTask(String name, HybridMonitorSlsTaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/hybridMonitorSlsTask:HybridMonitorSlsTask", name, args == null ? HybridMonitorSlsTaskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HybridMonitorSlsTask(String name, Output<String> id, @Nullable HybridMonitorSlsTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/hybridMonitorSlsTask:HybridMonitorSlsTask", name, state, makeResourceOptions(options, id));
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
    public static HybridMonitorSlsTask get(String name, Output<String> id, @Nullable HybridMonitorSlsTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HybridMonitorSlsTask(name, id, state, options);
    }
}
