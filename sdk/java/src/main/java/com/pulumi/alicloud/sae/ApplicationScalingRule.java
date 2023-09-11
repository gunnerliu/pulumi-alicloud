// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.sae.ApplicationScalingRuleArgs;
import com.pulumi.alicloud.sae.inputs.ApplicationScalingRuleState;
import com.pulumi.alicloud.sae.outputs.ApplicationScalingRuleScalingRuleMetric;
import com.pulumi.alicloud.sae.outputs.ApplicationScalingRuleScalingRuleTimer;
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
 * Provides a Serverless App Engine (SAE) Application Scaling Rule resource.
 * 
 * For information about Serverless App Engine (SAE) Application Scaling Rule and how to use it, see [What is Application Scaling Rule](https://www.alibabacloud.com/help/en/sae/latest/create-application-scaling-rule).
 * 
 * &gt; **NOTE:** Available since v1.159.0.
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
 * import com.pulumi.alicloud.inputs.GetRegionsArgs;
 * import com.pulumi.random.RandomInteger;
 * import com.pulumi.random.RandomIntegerArgs;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.sae.Namespace;
 * import com.pulumi.alicloud.sae.NamespaceArgs;
 * import com.pulumi.alicloud.sae.Application;
 * import com.pulumi.alicloud.sae.ApplicationArgs;
 * import com.pulumi.alicloud.sae.ApplicationScalingRule;
 * import com.pulumi.alicloud.sae.ApplicationScalingRuleArgs;
 * import com.pulumi.alicloud.sae.inputs.ApplicationScalingRuleScalingRuleTimerArgs;
 * import com.pulumi.alicloud.sae.inputs.ApplicationScalingRuleScalingRuleMetricArgs;
 * import com.pulumi.alicloud.sae.inputs.ApplicationScalingRuleScalingRuleMetricScaleUpRulesArgs;
 * import com.pulumi.alicloud.sae.inputs.ApplicationScalingRuleScalingRuleMetricScaleDownRulesArgs;
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
 *         final var defaultRegions = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         var defaultRandomInteger = new RandomInteger(&#34;defaultRandomInteger&#34;, RandomIntegerArgs.builder()        
 *             .max(99999)
 *             .min(10000)
 *             .build());
 * 
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;10.4.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(name)
 *             .cidrBlock(&#34;10.4.0.0/24&#34;)
 *             .vpcId(defaultNetwork.id())
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup(&#34;defaultSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultNamespace = new Namespace(&#34;defaultNamespace&#34;, NamespaceArgs.builder()        
 *             .namespaceId(defaultRandomInteger.result().applyValue(result -&gt; String.format(&#34;%s:example%s&#34;, defaultRegions.applyValue(getRegionsResult -&gt; getRegionsResult.regions()[0].id()),result)))
 *             .namespaceName(name)
 *             .namespaceDescription(name)
 *             .enableMicroRegistration(false)
 *             .build());
 * 
 *         var defaultApplication = new Application(&#34;defaultApplication&#34;, ApplicationArgs.builder()        
 *             .appDescription(name)
 *             .appName(name)
 *             .namespaceId(defaultNamespace.id())
 *             .imageUrl(String.format(&#34;registry-vpc.%s.aliyuncs.com/sae-demo-image/consumer:1.0&#34;, defaultRegions.applyValue(getRegionsResult -&gt; getRegionsResult.regions()[0].id())))
 *             .packageType(&#34;Image&#34;)
 *             .securityGroupId(defaultSecurityGroup.id())
 *             .vpcId(defaultNetwork.id())
 *             .vswitchId(defaultSwitch.id())
 *             .timezone(&#34;Asia/Beijing&#34;)
 *             .replicas(&#34;5&#34;)
 *             .cpu(&#34;500&#34;)
 *             .memory(&#34;2048&#34;)
 *             .build());
 * 
 *         var defaultApplicationScalingRule = new ApplicationScalingRule(&#34;defaultApplicationScalingRule&#34;, ApplicationScalingRuleArgs.builder()        
 *             .appId(defaultApplication.id())
 *             .scalingRuleName(name)
 *             .scalingRuleEnable(true)
 *             .scalingRuleType(&#34;mix&#34;)
 *             .minReadyInstances(&#34;3&#34;)
 *             .minReadyInstanceRatio(&#34;-1&#34;)
 *             .scalingRuleTimer(ApplicationScalingRuleScalingRuleTimerArgs.builder()
 *                 .period(&#34;* * *&#34;)
 *                 .schedules(                
 *                     ApplicationScalingRuleScalingRuleTimerScheduleArgs.builder()
 *                         .atTime(&#34;08:00&#34;)
 *                         .maxReplicas(10)
 *                         .minReplicas(3)
 *                         .build(),
 *                     ApplicationScalingRuleScalingRuleTimerScheduleArgs.builder()
 *                         .atTime(&#34;20:00&#34;)
 *                         .maxReplicas(50)
 *                         .minReplicas(3)
 *                         .build())
 *                 .build())
 *             .scalingRuleMetric(ApplicationScalingRuleScalingRuleMetricArgs.builder()
 *                 .maxReplicas(50)
 *                 .minReplicas(3)
 *                 .metrics(                
 *                     ApplicationScalingRuleScalingRuleMetricMetricArgs.builder()
 *                         .metricType(&#34;CPU&#34;)
 *                         .metricTargetAverageUtilization(20)
 *                         .build(),
 *                     ApplicationScalingRuleScalingRuleMetricMetricArgs.builder()
 *                         .metricType(&#34;MEMORY&#34;)
 *                         .metricTargetAverageUtilization(30)
 *                         .build(),
 *                     ApplicationScalingRuleScalingRuleMetricMetricArgs.builder()
 *                         .metricType(&#34;tcpActiveConn&#34;)
 *                         .metricTargetAverageUtilization(20)
 *                         .build())
 *                 .scaleUpRules(ApplicationScalingRuleScalingRuleMetricScaleUpRulesArgs.builder()
 *                     .step(10)
 *                     .disabled(false)
 *                     .stabilizationWindowSeconds(0)
 *                     .build())
 *                 .scaleDownRules(ApplicationScalingRuleScalingRuleMetricScaleDownRulesArgs.builder()
 *                     .step(10)
 *                     .disabled(false)
 *                     .stabilizationWindowSeconds(10)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Serverless App Engine (SAE) Application Scaling Rule can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:sae/applicationScalingRule:ApplicationScalingRule example &lt;app_id&gt;:&lt;scaling_rule_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:sae/applicationScalingRule:ApplicationScalingRule")
public class ApplicationScalingRule extends com.pulumi.resources.CustomResource {
    /**
     * Application ID.
     * 
     */
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return Application ID.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The min ready instance ratio.
     * 
     */
    @Export(name="minReadyInstanceRatio", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minReadyInstanceRatio;

    /**
     * @return The min ready instance ratio.
     * 
     */
    public Output<Optional<Integer>> minReadyInstanceRatio() {
        return Codegen.optional(this.minReadyInstanceRatio);
    }
    /**
     * The min ready instances.
     * 
     */
    @Export(name="minReadyInstances", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minReadyInstances;

    /**
     * @return The min ready instances.
     * 
     */
    public Output<Optional<Integer>> minReadyInstances() {
        return Codegen.optional(this.minReadyInstances);
    }
    /**
     * True whether the auto scaling policy is enabled. The value description is as follows: true: enabled state. false: disabled status. Valid values: `false`, `true`.
     * 
     */
    @Export(name="scalingRuleEnable", type=Boolean.class, parameters={})
    private Output<Boolean> scalingRuleEnable;

    /**
     * @return True whether the auto scaling policy is enabled. The value description is as follows: true: enabled state. false: disabled status. Valid values: `false`, `true`.
     * 
     */
    public Output<Boolean> scalingRuleEnable() {
        return this.scalingRuleEnable;
    }
    /**
     * Monitor the configuration of the indicator elasticity strategy. See `scaling_rule_metric` below.
     * 
     */
    @Export(name="scalingRuleMetric", type=ApplicationScalingRuleScalingRuleMetric.class, parameters={})
    private Output</* @Nullable */ ApplicationScalingRuleScalingRuleMetric> scalingRuleMetric;

    /**
     * @return Monitor the configuration of the indicator elasticity strategy. See `scaling_rule_metric` below.
     * 
     */
    public Output<Optional<ApplicationScalingRuleScalingRuleMetric>> scalingRuleMetric() {
        return Codegen.optional(this.scalingRuleMetric);
    }
    /**
     * The name of a custom elastic scaling policy. In the application, the policy name cannot be repeated. It must start with a lowercase letter, and can only contain lowercase letters, numbers, and dashes (-), and no more than 32 characters. After the scaling policy is successfully created, the policy name cannot be modified.
     * 
     */
    @Export(name="scalingRuleName", type=String.class, parameters={})
    private Output<String> scalingRuleName;

    /**
     * @return The name of a custom elastic scaling policy. In the application, the policy name cannot be repeated. It must start with a lowercase letter, and can only contain lowercase letters, numbers, and dashes (-), and no more than 32 characters. After the scaling policy is successfully created, the policy name cannot be modified.
     * 
     */
    public Output<String> scalingRuleName() {
        return this.scalingRuleName;
    }
    /**
     * Configuration of Timing Resilient Policies. See `scaling_rule_timer` below.
     * 
     */
    @Export(name="scalingRuleTimer", type=ApplicationScalingRuleScalingRuleTimer.class, parameters={})
    private Output</* @Nullable */ ApplicationScalingRuleScalingRuleTimer> scalingRuleTimer;

    /**
     * @return Configuration of Timing Resilient Policies. See `scaling_rule_timer` below.
     * 
     */
    public Output<Optional<ApplicationScalingRuleScalingRuleTimer>> scalingRuleTimer() {
        return Codegen.optional(this.scalingRuleTimer);
    }
    /**
     * Flexible strategy type. Valid values: `mix`, `timing` and `metric`.
     * 
     */
    @Export(name="scalingRuleType", type=String.class, parameters={})
    private Output<String> scalingRuleType;

    /**
     * @return Flexible strategy type. Valid values: `mix`, `timing` and `metric`.
     * 
     */
    public Output<String> scalingRuleType() {
        return this.scalingRuleType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplicationScalingRule(String name) {
        this(name, ApplicationScalingRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplicationScalingRule(String name, ApplicationScalingRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationScalingRule(String name, ApplicationScalingRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:sae/applicationScalingRule:ApplicationScalingRule", name, args == null ? ApplicationScalingRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplicationScalingRule(String name, Output<String> id, @Nullable ApplicationScalingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:sae/applicationScalingRule:ApplicationScalingRule", name, state, makeResourceOptions(options, id));
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
    public static ApplicationScalingRule get(String name, Output<String> id, @Nullable ApplicationScalingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationScalingRule(name, id, state, options);
    }
}
