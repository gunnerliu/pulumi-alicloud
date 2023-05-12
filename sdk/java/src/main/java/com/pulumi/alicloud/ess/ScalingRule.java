// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ess.ScalingRuleArgs;
import com.pulumi.alicloud.ess.inputs.ScalingRuleState;
import com.pulumi.alicloud.ess.outputs.ScalingRuleStepAdjustment;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ESS scaling rule resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetInstanceTypesArgs;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroupRule;
 * import com.pulumi.alicloud.ecs.SecurityGroupRuleArgs;
 * import com.pulumi.alicloud.ess.ScalingGroup;
 * import com.pulumi.alicloud.ess.ScalingGroupArgs;
 * import com.pulumi.alicloud.ess.ScalingConfiguration;
 * import com.pulumi.alicloud.ess.ScalingConfigurationArgs;
 * import com.pulumi.alicloud.ess.ScalingRule;
 * import com.pulumi.alicloud.ess.ScalingRuleArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;essscalingruleconfig&#34;);
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableDiskCategory(&#34;cloud_efficiency&#34;)
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         final var defaultInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .availabilityZone(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .cpuCoreCount(2)
 *             .memorySize(4)
 *             .build());
 * 
 *         final var defaultImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex(&#34;^ubuntu_18.*64&#34;)
 *             .mostRecent(true)
 *             .owners(&#34;system&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .cidrBlock(&#34;172.16.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/24&#34;)
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vswitchName(name)
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup(&#34;defaultSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultSecurityGroupRule = new SecurityGroupRule(&#34;defaultSecurityGroupRule&#34;, SecurityGroupRuleArgs.builder()        
 *             .type(&#34;ingress&#34;)
 *             .ipProtocol(&#34;tcp&#34;)
 *             .nicType(&#34;intranet&#34;)
 *             .policy(&#34;accept&#34;)
 *             .portRange(&#34;22/22&#34;)
 *             .priority(1)
 *             .securityGroupId(defaultSecurityGroup.id())
 *             .cidrIp(&#34;172.16.0.0/24&#34;)
 *             .build());
 * 
 *         var defaultScalingGroup = new ScalingGroup(&#34;defaultScalingGroup&#34;, ScalingGroupArgs.builder()        
 *             .minSize(1)
 *             .maxSize(1)
 *             .scalingGroupName(name)
 *             .vswitchIds(defaultSwitch.id())
 *             .removalPolicies(            
 *                 &#34;OldestInstance&#34;,
 *                 &#34;NewestInstance&#34;)
 *             .build());
 * 
 *         var defaultScalingConfiguration = new ScalingConfiguration(&#34;defaultScalingConfiguration&#34;, ScalingConfigurationArgs.builder()        
 *             .scalingGroupId(defaultScalingGroup.id())
 *             .imageId(defaultImages.applyValue(getImagesResult -&gt; getImagesResult.images()[0].id()))
 *             .instanceType(defaultInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes()[0].id()))
 *             .securityGroupId(defaultSecurityGroup.id())
 *             .forceDelete(&#34;true&#34;)
 *             .build());
 * 
 *         var defaultScalingRule = new ScalingRule(&#34;defaultScalingRule&#34;, ScalingRuleArgs.builder()        
 *             .scalingGroupId(defaultScalingGroup.id())
 *             .adjustmentType(&#34;TotalCapacity&#34;)
 *             .adjustmentValue(1)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Module Support
 * 
 * You can use to the existing autoscaling-rule module
 * to create different type rules, alarm task and scheduled task one-click.
 * 
 * ## Block stepAdjustment
 * 
 * The stepAdjustment mapping supports the following:
 * 
 * * `metric_interval_lower_bound` - (Optional) The lower bound of step.
 * * `metric_interval_upper_bound` - (Optional) The upper bound of step.
 * * `scaling_adjustment` - (Optional) The adjust value of step.
 * 
 * ## Import
 * 
 * ESS scaling rule can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ess/scalingRule:ScalingRule example abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:ess/scalingRule:ScalingRule")
public class ScalingRule extends com.pulumi.resources.CustomResource {
    /**
     * Adjustment mode of a scaling rule. Optional values:
     * - QuantityChangeInCapacity: It is used to increase or decrease a specified number of ECS instances.
     * - PercentChangeInCapacity: It is used to increase or decrease a specified proportion of ECS instances.
     * - TotalCapacity: It is used to adjust the quantity of ECS instances in the current scaling group to a specified value.
     * 
     */
    @Export(name="adjustmentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> adjustmentType;

    /**
     * @return Adjustment mode of a scaling rule. Optional values:
     * - QuantityChangeInCapacity: It is used to increase or decrease a specified number of ECS instances.
     * - PercentChangeInCapacity: It is used to increase or decrease a specified proportion of ECS instances.
     * - TotalCapacity: It is used to adjust the quantity of ECS instances in the current scaling group to a specified value.
     * 
     */
    public Output<Optional<String>> adjustmentType() {
        return Codegen.optional(this.adjustmentType);
    }
    /**
     * The number of ECS instances to be adjusted in the scaling rule. This parameter is required and applicable only to simple scaling rules. The number of ECS instances to be adjusted in a single scaling activity cannot exceed 500. Value range:
     * - QuantityChangeInCapacity：(0, 500] U (-500, 0]
     * - PercentChangeInCapacity：[0, 10000] U [-100, 0]
     * - TotalCapacity：[0, 1000]
     * 
     */
    @Export(name="adjustmentValue", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> adjustmentValue;

    /**
     * @return The number of ECS instances to be adjusted in the scaling rule. This parameter is required and applicable only to simple scaling rules. The number of ECS instances to be adjusted in a single scaling activity cannot exceed 500. Value range:
     * - QuantityChangeInCapacity：(0, 500] U (-500, 0]
     * - PercentChangeInCapacity：[0, 10000] U [-100, 0]
     * - TotalCapacity：[0, 1000]
     * 
     */
    public Output<Optional<Integer>> adjustmentValue() {
        return Codegen.optional(this.adjustmentValue);
    }
    @Export(name="ari", type=String.class, parameters={})
    private Output<String> ari;

    public Output<String> ari() {
        return this.ari;
    }
    /**
     * The cooldown time of the scaling rule. This parameter is applicable only to simple scaling rules. Value range: [0, 86,400], in seconds. The default value is empty，if not set, the return value will be 0, which is the default value of integer.
     * 
     */
    @Export(name="cooldown", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cooldown;

    /**
     * @return The cooldown time of the scaling rule. This parameter is applicable only to simple scaling rules. Value range: [0, 86,400], in seconds. The default value is empty，if not set, the return value will be 0, which is the default value of integer.
     * 
     */
    public Output<Optional<Integer>> cooldown() {
        return Codegen.optional(this.cooldown);
    }
    /**
     * Indicates whether scale in by the target tracking policy is disabled. Default to false.
     * 
     */
    @Export(name="disableScaleIn", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableScaleIn;

    /**
     * @return Indicates whether scale in by the target tracking policy is disabled. Default to false.
     * 
     */
    public Output<Optional<Boolean>> disableScaleIn() {
        return Codegen.optional(this.disableScaleIn);
    }
    /**
     * The estimated time, in seconds, until a newly launched instance will contribute CloudMonitor metrics. Default to 300.
     * 
     */
    @Export(name="estimatedInstanceWarmup", type=Integer.class, parameters={})
    private Output<Integer> estimatedInstanceWarmup;

    /**
     * @return The estimated time, in seconds, until a newly launched instance will contribute CloudMonitor metrics. Default to 300.
     * 
     */
    public Output<Integer> estimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup;
    }
    /**
     * A CloudMonitor metric name.
     * 
     */
    @Export(name="metricName", type=String.class, parameters={})
    private Output</* @Nullable */ String> metricName;

    /**
     * @return A CloudMonitor metric name.
     * 
     */
    public Output<Optional<String>> metricName() {
        return Codegen.optional(this.metricName);
    }
    /**
     * ID of the scaling group of a scaling rule.
     * 
     */
    @Export(name="scalingGroupId", type=String.class, parameters={})
    private Output<String> scalingGroupId;

    /**
     * @return ID of the scaling group of a scaling rule.
     * 
     */
    public Output<String> scalingGroupId() {
        return this.scalingGroupId;
    }
    /**
     * Name shown for the scaling rule, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is scaling rule id.
     * 
     */
    @Export(name="scalingRuleName", type=String.class, parameters={})
    private Output<String> scalingRuleName;

    /**
     * @return Name shown for the scaling rule, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is scaling rule id.
     * 
     */
    public Output<String> scalingRuleName() {
        return this.scalingRuleName;
    }
    /**
     * The scaling rule type, either &#34;SimpleScalingRule&#34;, &#34;TargetTrackingScalingRule&#34;, &#34;StepScalingRule&#34;. Default to &#34;SimpleScalingRule&#34;.
     * 
     */
    @Export(name="scalingRuleType", type=String.class, parameters={})
    private Output</* @Nullable */ String> scalingRuleType;

    /**
     * @return The scaling rule type, either &#34;SimpleScalingRule&#34;, &#34;TargetTrackingScalingRule&#34;, &#34;StepScalingRule&#34;. Default to &#34;SimpleScalingRule&#34;.
     * 
     */
    public Output<Optional<String>> scalingRuleType() {
        return Codegen.optional(this.scalingRuleType);
    }
    /**
     * Steps for StepScalingRule. See Block stepAdjustment below for details.
     * 
     */
    @Export(name="stepAdjustments", type=List.class, parameters={ScalingRuleStepAdjustment.class})
    private Output</* @Nullable */ List<ScalingRuleStepAdjustment>> stepAdjustments;

    /**
     * @return Steps for StepScalingRule. See Block stepAdjustment below for details.
     * 
     */
    public Output<Optional<List<ScalingRuleStepAdjustment>>> stepAdjustments() {
        return Codegen.optional(this.stepAdjustments);
    }
    /**
     * The target value for the metric.
     * 
     */
    @Export(name="targetValue", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> targetValue;

    /**
     * @return The target value for the metric.
     * 
     */
    public Output<Optional<Double>> targetValue() {
        return Codegen.optional(this.targetValue);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScalingRule(String name) {
        this(name, ScalingRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScalingRule(String name, ScalingRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScalingRule(String name, ScalingRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/scalingRule:ScalingRule", name, args == null ? ScalingRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScalingRule(String name, Output<String> id, @Nullable ScalingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/scalingRule:ScalingRule", name, state, makeResourceOptions(options, id));
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
    public static ScalingRule get(String name, Output<String> id, @Nullable ScalingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScalingRule(name, id, state, options);
    }
}
