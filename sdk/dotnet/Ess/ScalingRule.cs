// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess
{
    /// <summary>
    /// Provides a ESS scaling rule resource.
    /// 
    /// For information about ess scaling rule, see [CreateScalingRule](https://www.alibabacloud.com/help/en/auto-scaling/latest/createscalingrule).
    /// 
    /// &gt; **NOTE:** Available since v1.39.0.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// using Random = Pulumi.Random;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var defaultRandomInteger = new Random.RandomInteger("defaultRandomInteger", new()
    ///     {
    ///         Min = 10000,
    ///         Max = 99999,
    ///     });
    /// 
    ///     var myName = defaultRandomInteger.Result.Apply(result =&gt; $"{name}-{result}");
    /// 
    ///     var defaultZones = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableDiskCategory = "cloud_efficiency",
    ///         AvailableResourceCreation = "VSwitch",
    ///     });
    /// 
    ///     var defaultInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
    ///     {
    ///         AvailabilityZone = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         CpuCoreCount = 2,
    ///         MemorySize = 4,
    ///     });
    /// 
    ///     var defaultImages = AliCloud.Ecs.GetImages.Invoke(new()
    ///     {
    ///         NameRegex = "^ubuntu_18.*64",
    ///         MostRecent = true,
    ///         Owners = "system",
    ///     });
    /// 
    ///     var defaultNetwork = new AliCloud.Vpc.Network("defaultNetwork", new()
    ///     {
    ///         VpcName = myName,
    ///         CidrBlock = "172.16.0.0/16",
    ///     });
    /// 
    ///     var defaultSwitch = new AliCloud.Vpc.Switch("defaultSwitch", new()
    ///     {
    ///         VpcId = defaultNetwork.Id,
    ///         CidrBlock = "172.16.0.0/24",
    ///         ZoneId = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         VswitchName = myName,
    ///     });
    /// 
    ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("defaultSecurityGroup", new()
    ///     {
    ///         VpcId = defaultNetwork.Id,
    ///     });
    /// 
    ///     var defaultSecurityGroupRule = new AliCloud.Ecs.SecurityGroupRule("defaultSecurityGroupRule", new()
    ///     {
    ///         Type = "ingress",
    ///         IpProtocol = "tcp",
    ///         NicType = "intranet",
    ///         Policy = "accept",
    ///         PortRange = "22/22",
    ///         Priority = 1,
    ///         SecurityGroupId = defaultSecurityGroup.Id,
    ///         CidrIp = "172.16.0.0/24",
    ///     });
    /// 
    ///     var defaultScalingGroup = new AliCloud.Ess.ScalingGroup("defaultScalingGroup", new()
    ///     {
    ///         MinSize = 1,
    ///         MaxSize = 1,
    ///         ScalingGroupName = myName,
    ///         VswitchIds = new[]
    ///         {
    ///             defaultSwitch.Id,
    ///         },
    ///         RemovalPolicies = new[]
    ///         {
    ///             "OldestInstance",
    ///             "NewestInstance",
    ///         },
    ///     });
    /// 
    ///     var defaultScalingConfiguration = new AliCloud.Ess.ScalingConfiguration("defaultScalingConfiguration", new()
    ///     {
    ///         ScalingGroupId = defaultScalingGroup.Id,
    ///         ImageId = defaultImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
    ///         InstanceType = defaultInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
    ///         SecurityGroupId = defaultSecurityGroup.Id,
    ///         ForceDelete = true,
    ///     });
    /// 
    ///     var defaultScalingRule = new AliCloud.Ess.ScalingRule("defaultScalingRule", new()
    ///     {
    ///         ScalingGroupId = defaultScalingGroup.Id,
    ///         AdjustmentType = "TotalCapacity",
    ///         AdjustmentValue = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// ## Module Support
    /// 
    /// You can use to the existing autoscaling-rule module
    /// to create different type rules, alarm task and scheduled task one-click.
    /// 
    /// ## Import
    /// 
    /// ESS scaling rule can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ess/scalingRule:ScalingRule example abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ess/scalingRule:ScalingRule")]
    public partial class ScalingRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Adjustment mode of a scaling rule. Optional values:
        /// - QuantityChangeInCapacity: It is used to increase or decrease a specified number of ECS instances.
        /// - PercentChangeInCapacity: It is used to increase or decrease a specified proportion of ECS instances.
        /// - TotalCapacity: It is used to adjust the quantity of ECS instances in the current scaling group to a specified value.
        /// </summary>
        [Output("adjustmentType")]
        public Output<string?> AdjustmentType { get; private set; } = null!;

        /// <summary>
        /// The number of ECS instances to be adjusted in the scaling rule. This parameter is required and applicable only to simple scaling rules. The number of ECS instances to be adjusted in a single scaling activity cannot exceed 500. Value range:
        /// - QuantityChangeInCapacity：(0, 500] U (-500, 0]
        /// - PercentChangeInCapacity：[0, 10000] U [-100, 0]
        /// - TotalCapacity：[0, 1000]
        /// </summary>
        [Output("adjustmentValue")]
        public Output<int?> AdjustmentValue { get; private set; } = null!;

        /// <summary>
        /// AlarmDimension for StepScalingRule. See `alarm_dimension` below.
        /// </summary>
        [Output("alarmDimension")]
        public Output<Outputs.ScalingRuleAlarmDimension?> AlarmDimension { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of the scaling rule.
        /// </summary>
        [Output("ari")]
        public Output<string> Ari { get; private set; } = null!;

        /// <summary>
        /// The cooldown time of the scaling rule. This parameter is applicable only to simple scaling rules. Value range: [0, 86,400], in seconds. The default value is empty，if not set, the return value will be 0, which is the default value of integer.
        /// </summary>
        [Output("cooldown")]
        public Output<int?> Cooldown { get; private set; } = null!;

        /// <summary>
        /// Indicates whether scale in by the target tracking policy is disabled. Default to false.
        /// </summary>
        [Output("disableScaleIn")]
        public Output<bool?> DisableScaleIn { get; private set; } = null!;

        /// <summary>
        /// The estimated time, in seconds, until a newly launched instance will contribute CloudMonitor metrics. Default to 300.
        /// </summary>
        [Output("estimatedInstanceWarmup")]
        public Output<int> EstimatedInstanceWarmup { get; private set; } = null!;

        /// <summary>
        /// A CloudMonitor metric name.
        /// </summary>
        [Output("metricName")]
        public Output<string?> MetricName { get; private set; } = null!;

        /// <summary>
        /// ID of the scaling group of a scaling rule.
        /// </summary>
        [Output("scalingGroupId")]
        public Output<string> ScalingGroupId { get; private set; } = null!;

        /// <summary>
        /// Name shown for the scaling rule, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is scaling rule id.
        /// </summary>
        [Output("scalingRuleName")]
        public Output<string> ScalingRuleName { get; private set; } = null!;

        /// <summary>
        /// The scaling rule type, either "SimpleScalingRule", "TargetTrackingScalingRule", "StepScalingRule". Default to "SimpleScalingRule".
        /// </summary>
        [Output("scalingRuleType")]
        public Output<string?> ScalingRuleType { get; private set; } = null!;

        /// <summary>
        /// Steps for StepScalingRule. See `step_adjustment` below.
        /// </summary>
        [Output("stepAdjustments")]
        public Output<ImmutableArray<Outputs.ScalingRuleStepAdjustment>> StepAdjustments { get; private set; } = null!;

        /// <summary>
        /// The target value for the metric.
        /// </summary>
        [Output("targetValue")]
        public Output<double?> TargetValue { get; private set; } = null!;


        /// <summary>
        /// Create a ScalingRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ScalingRule(string name, ScalingRuleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ess/scalingRule:ScalingRule", name, args ?? new ScalingRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ScalingRule(string name, Input<string> id, ScalingRuleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ess/scalingRule:ScalingRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ScalingRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ScalingRule Get(string name, Input<string> id, ScalingRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new ScalingRule(name, id, state, options);
        }
    }

    public sealed class ScalingRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Adjustment mode of a scaling rule. Optional values:
        /// - QuantityChangeInCapacity: It is used to increase or decrease a specified number of ECS instances.
        /// - PercentChangeInCapacity: It is used to increase or decrease a specified proportion of ECS instances.
        /// - TotalCapacity: It is used to adjust the quantity of ECS instances in the current scaling group to a specified value.
        /// </summary>
        [Input("adjustmentType")]
        public Input<string>? AdjustmentType { get; set; }

        /// <summary>
        /// The number of ECS instances to be adjusted in the scaling rule. This parameter is required and applicable only to simple scaling rules. The number of ECS instances to be adjusted in a single scaling activity cannot exceed 500. Value range:
        /// - QuantityChangeInCapacity：(0, 500] U (-500, 0]
        /// - PercentChangeInCapacity：[0, 10000] U [-100, 0]
        /// - TotalCapacity：[0, 1000]
        /// </summary>
        [Input("adjustmentValue")]
        public Input<int>? AdjustmentValue { get; set; }

        /// <summary>
        /// AlarmDimension for StepScalingRule. See `alarm_dimension` below.
        /// </summary>
        [Input("alarmDimension")]
        public Input<Inputs.ScalingRuleAlarmDimensionArgs>? AlarmDimension { get; set; }

        /// <summary>
        /// The cooldown time of the scaling rule. This parameter is applicable only to simple scaling rules. Value range: [0, 86,400], in seconds. The default value is empty，if not set, the return value will be 0, which is the default value of integer.
        /// </summary>
        [Input("cooldown")]
        public Input<int>? Cooldown { get; set; }

        /// <summary>
        /// Indicates whether scale in by the target tracking policy is disabled. Default to false.
        /// </summary>
        [Input("disableScaleIn")]
        public Input<bool>? DisableScaleIn { get; set; }

        /// <summary>
        /// The estimated time, in seconds, until a newly launched instance will contribute CloudMonitor metrics. Default to 300.
        /// </summary>
        [Input("estimatedInstanceWarmup")]
        public Input<int>? EstimatedInstanceWarmup { get; set; }

        /// <summary>
        /// A CloudMonitor metric name.
        /// </summary>
        [Input("metricName")]
        public Input<string>? MetricName { get; set; }

        /// <summary>
        /// ID of the scaling group of a scaling rule.
        /// </summary>
        [Input("scalingGroupId", required: true)]
        public Input<string> ScalingGroupId { get; set; } = null!;

        /// <summary>
        /// Name shown for the scaling rule, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is scaling rule id.
        /// </summary>
        [Input("scalingRuleName")]
        public Input<string>? ScalingRuleName { get; set; }

        /// <summary>
        /// The scaling rule type, either "SimpleScalingRule", "TargetTrackingScalingRule", "StepScalingRule". Default to "SimpleScalingRule".
        /// </summary>
        [Input("scalingRuleType")]
        public Input<string>? ScalingRuleType { get; set; }

        [Input("stepAdjustments")]
        private InputList<Inputs.ScalingRuleStepAdjustmentArgs>? _stepAdjustments;

        /// <summary>
        /// Steps for StepScalingRule. See `step_adjustment` below.
        /// </summary>
        public InputList<Inputs.ScalingRuleStepAdjustmentArgs> StepAdjustments
        {
            get => _stepAdjustments ?? (_stepAdjustments = new InputList<Inputs.ScalingRuleStepAdjustmentArgs>());
            set => _stepAdjustments = value;
        }

        /// <summary>
        /// The target value for the metric.
        /// </summary>
        [Input("targetValue")]
        public Input<double>? TargetValue { get; set; }

        public ScalingRuleArgs()
        {
        }
        public static new ScalingRuleArgs Empty => new ScalingRuleArgs();
    }

    public sealed class ScalingRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Adjustment mode of a scaling rule. Optional values:
        /// - QuantityChangeInCapacity: It is used to increase or decrease a specified number of ECS instances.
        /// - PercentChangeInCapacity: It is used to increase or decrease a specified proportion of ECS instances.
        /// - TotalCapacity: It is used to adjust the quantity of ECS instances in the current scaling group to a specified value.
        /// </summary>
        [Input("adjustmentType")]
        public Input<string>? AdjustmentType { get; set; }

        /// <summary>
        /// The number of ECS instances to be adjusted in the scaling rule. This parameter is required and applicable only to simple scaling rules. The number of ECS instances to be adjusted in a single scaling activity cannot exceed 500. Value range:
        /// - QuantityChangeInCapacity：(0, 500] U (-500, 0]
        /// - PercentChangeInCapacity：[0, 10000] U [-100, 0]
        /// - TotalCapacity：[0, 1000]
        /// </summary>
        [Input("adjustmentValue")]
        public Input<int>? AdjustmentValue { get; set; }

        /// <summary>
        /// AlarmDimension for StepScalingRule. See `alarm_dimension` below.
        /// </summary>
        [Input("alarmDimension")]
        public Input<Inputs.ScalingRuleAlarmDimensionGetArgs>? AlarmDimension { get; set; }

        /// <summary>
        /// The unique identifier of the scaling rule.
        /// </summary>
        [Input("ari")]
        public Input<string>? Ari { get; set; }

        /// <summary>
        /// The cooldown time of the scaling rule. This parameter is applicable only to simple scaling rules. Value range: [0, 86,400], in seconds. The default value is empty，if not set, the return value will be 0, which is the default value of integer.
        /// </summary>
        [Input("cooldown")]
        public Input<int>? Cooldown { get; set; }

        /// <summary>
        /// Indicates whether scale in by the target tracking policy is disabled. Default to false.
        /// </summary>
        [Input("disableScaleIn")]
        public Input<bool>? DisableScaleIn { get; set; }

        /// <summary>
        /// The estimated time, in seconds, until a newly launched instance will contribute CloudMonitor metrics. Default to 300.
        /// </summary>
        [Input("estimatedInstanceWarmup")]
        public Input<int>? EstimatedInstanceWarmup { get; set; }

        /// <summary>
        /// A CloudMonitor metric name.
        /// </summary>
        [Input("metricName")]
        public Input<string>? MetricName { get; set; }

        /// <summary>
        /// ID of the scaling group of a scaling rule.
        /// </summary>
        [Input("scalingGroupId")]
        public Input<string>? ScalingGroupId { get; set; }

        /// <summary>
        /// Name shown for the scaling rule, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is scaling rule id.
        /// </summary>
        [Input("scalingRuleName")]
        public Input<string>? ScalingRuleName { get; set; }

        /// <summary>
        /// The scaling rule type, either "SimpleScalingRule", "TargetTrackingScalingRule", "StepScalingRule". Default to "SimpleScalingRule".
        /// </summary>
        [Input("scalingRuleType")]
        public Input<string>? ScalingRuleType { get; set; }

        [Input("stepAdjustments")]
        private InputList<Inputs.ScalingRuleStepAdjustmentGetArgs>? _stepAdjustments;

        /// <summary>
        /// Steps for StepScalingRule. See `step_adjustment` below.
        /// </summary>
        public InputList<Inputs.ScalingRuleStepAdjustmentGetArgs> StepAdjustments
        {
            get => _stepAdjustments ?? (_stepAdjustments = new InputList<Inputs.ScalingRuleStepAdjustmentGetArgs>());
            set => _stepAdjustments = value;
        }

        /// <summary>
        /// The target value for the metric.
        /// </summary>
        [Input("targetValue")]
        public Input<double>? TargetValue { get; set; }

        public ScalingRuleState()
        {
        }
        public static new ScalingRuleState Empty => new ScalingRuleState();
    }
}
