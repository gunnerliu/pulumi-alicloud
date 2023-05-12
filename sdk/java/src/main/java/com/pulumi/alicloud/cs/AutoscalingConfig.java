// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cs.AutoscalingConfigArgs;
import com.pulumi.alicloud.cs.inputs.AutoscalingConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource will help you configure auto scaling for the kubernetes cluster.
 * 
 * &gt; **NOTE:** Available in v1.127.0+.
 * **NOTE:** From version 1.164.0, support for specifying whether to allow the scale-in of nodes by parameter `scale_down_enabled`.
 * **NOTE:** From version 1.164.0, support for selecting the policy for selecting which node pool to scale by parameter `expander`.
 * 
 * ## Example Usage
 * 
 * If you do not have an existing cluster, you need to create an ACK cluster through alicloud.cs.ManagedKubernetes first, and then configure automatic scaling.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.cs.AutoscalingConfig;
 * import com.pulumi.alicloud.cs.AutoscalingConfigArgs;
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
 *         var default_ = new AutoscalingConfig(&#34;default&#34;, AutoscalingConfigArgs.builder()        
 *             .clusterId(alicloud_cs_managed_kubernetes.default()[0].id())
 *             .coolDownDuration(&#34;10m&#34;)
 *             .unneededDuration(&#34;10m&#34;)
 *             .utilizationThreshold(&#34;0.5&#34;)
 *             .gpuUtilizationThreshold(&#34;0.5&#34;)
 *             .scanInterval(&#34;30s&#34;)
 *             .scaleDownEnabled(true)
 *             .expander(&#34;least-waste&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="alicloud:cs/autoscalingConfig:AutoscalingConfig")
public class AutoscalingConfig extends com.pulumi.resources.CustomResource {
    /**
     * The id of kubernetes cluster.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterId;

    /**
     * @return The id of kubernetes cluster.
     * 
     */
    public Output<Optional<String>> clusterId() {
        return Codegen.optional(this.clusterId);
    }
    /**
     * The cool down duration. Default is `10m`. If the delay (cooldown) value is set too long, there could be complaints that the Horizontal Pod Autoscaler is not responsive to workload changes. However, if the delay value is set too short, the scale of the replicas set may keep thrashing as usual.
     * 
     */
    @Export(name="coolDownDuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> coolDownDuration;

    /**
     * @return The cool down duration. Default is `10m`. If the delay (cooldown) value is set too long, there could be complaints that the Horizontal Pod Autoscaler is not responsive to workload changes. However, if the delay value is set too short, the scale of the replicas set may keep thrashing as usual.
     * 
     */
    public Output<Optional<String>> coolDownDuration() {
        return Codegen.optional(this.coolDownDuration);
    }
    /**
     * The policy for selecting which node pool to scale. Valid values: `least-waste`, `random`, `priority`. For more information on these policies, see [Configure auto scaling](https://www.alibabacloud.com/help/en/container-service-for-kubernetes/latest/auto-scaling-of-nodes#section-3bg-2ko-inl)
     * 
     */
    @Export(name="expander", type=String.class, parameters={})
    private Output</* @Nullable */ String> expander;

    /**
     * @return The policy for selecting which node pool to scale. Valid values: `least-waste`, `random`, `priority`. For more information on these policies, see [Configure auto scaling](https://www.alibabacloud.com/help/en/container-service-for-kubernetes/latest/auto-scaling-of-nodes#section-3bg-2ko-inl)
     * 
     */
    public Output<Optional<String>> expander() {
        return Codegen.optional(this.expander);
    }
    /**
     * The scale-in threshold for GPU instance. Default is `0.5`.
     * 
     */
    @Export(name="gpuUtilizationThreshold", type=String.class, parameters={})
    private Output</* @Nullable */ String> gpuUtilizationThreshold;

    /**
     * @return The scale-in threshold for GPU instance. Default is `0.5`.
     * 
     */
    public Output<Optional<String>> gpuUtilizationThreshold() {
        return Codegen.optional(this.gpuUtilizationThreshold);
    }
    /**
     * Specify whether to allow the scale-in of nodes. Default is `true`.
     * 
     */
    @Export(name="scaleDownEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> scaleDownEnabled;

    /**
     * @return Specify whether to allow the scale-in of nodes. Default is `true`.
     * 
     */
    public Output<Optional<Boolean>> scaleDownEnabled() {
        return Codegen.optional(this.scaleDownEnabled);
    }
    /**
     * The interval at which the cluster is reevaluated for scaling. Default is `30s`.
     * 
     */
    @Export(name="scanInterval", type=String.class, parameters={})
    private Output</* @Nullable */ String> scanInterval;

    /**
     * @return The interval at which the cluster is reevaluated for scaling. Default is `30s`.
     * 
     */
    public Output<Optional<String>> scanInterval() {
        return Codegen.optional(this.scanInterval);
    }
    /**
     * The unneeded duration. Default is `10m`.
     * 
     */
    @Export(name="unneededDuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> unneededDuration;

    /**
     * @return The unneeded duration. Default is `10m`.
     * 
     */
    public Output<Optional<String>> unneededDuration() {
        return Codegen.optional(this.unneededDuration);
    }
    /**
     * The scale-in threshold. Default is `0.5`.
     * 
     */
    @Export(name="utilizationThreshold", type=String.class, parameters={})
    private Output</* @Nullable */ String> utilizationThreshold;

    /**
     * @return The scale-in threshold. Default is `0.5`.
     * 
     */
    public Output<Optional<String>> utilizationThreshold() {
        return Codegen.optional(this.utilizationThreshold);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutoscalingConfig(String name) {
        this(name, AutoscalingConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoscalingConfig(String name, @Nullable AutoscalingConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoscalingConfig(String name, @Nullable AutoscalingConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cs/autoscalingConfig:AutoscalingConfig", name, args == null ? AutoscalingConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutoscalingConfig(String name, Output<String> id, @Nullable AutoscalingConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cs/autoscalingConfig:AutoscalingConfig", name, state, makeResourceOptions(options, id));
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
    public static AutoscalingConfig get(String name, Output<String> id, @Nullable AutoscalingConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutoscalingConfig(name, id, state, options);
    }
}
