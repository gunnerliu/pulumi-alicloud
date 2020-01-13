// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess
{
    /// <summary>
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/ess_scaling_rule.html.markdown.
    /// </summary>
    public partial class ScalingRule : Pulumi.CustomResource
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
        /// Adjusted value of a scaling rule. Value range:
        /// - QuantityChangeInCapacity：(0, 500] U (-500, 0]
        /// - PercentChangeInCapacity：[0, 10000] U [-100, 0]
        /// - TotalCapacity：[0, 1000]
        /// </summary>
        [Output("adjustmentValue")]
        public Output<int?> AdjustmentValue { get; private set; } = null!;

        [Output("ari")]
        public Output<string> Ari { get; private set; } = null!;

        /// <summary>
        /// Cool-down time of a scaling rule. Value range: [0, 86,400], in seconds. The default value is empty，if not set, the return value will be 0, which is the default value of integer.
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
        /// Steps for StepScalingRule. See Block stepAdjustment below for details.
        /// </summary>
        [Output("stepAdjustments")]
        public Output<ImmutableArray<Outputs.ScalingRuleStepAdjustments>> StepAdjustments { get; private set; } = null!;

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
            : base("alicloud:ess/scalingRule:ScalingRule", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
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

    public sealed class ScalingRuleArgs : Pulumi.ResourceArgs
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
        /// Adjusted value of a scaling rule. Value range:
        /// - QuantityChangeInCapacity：(0, 500] U (-500, 0]
        /// - PercentChangeInCapacity：[0, 10000] U [-100, 0]
        /// - TotalCapacity：[0, 1000]
        /// </summary>
        [Input("adjustmentValue")]
        public Input<int>? AdjustmentValue { get; set; }

        /// <summary>
        /// Cool-down time of a scaling rule. Value range: [0, 86,400], in seconds. The default value is empty，if not set, the return value will be 0, which is the default value of integer.
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
        private InputList<Inputs.ScalingRuleStepAdjustmentsArgs>? _stepAdjustments;

        /// <summary>
        /// Steps for StepScalingRule. See Block stepAdjustment below for details.
        /// </summary>
        public InputList<Inputs.ScalingRuleStepAdjustmentsArgs> StepAdjustments
        {
            get => _stepAdjustments ?? (_stepAdjustments = new InputList<Inputs.ScalingRuleStepAdjustmentsArgs>());
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
    }

    public sealed class ScalingRuleState : Pulumi.ResourceArgs
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
        /// Adjusted value of a scaling rule. Value range:
        /// - QuantityChangeInCapacity：(0, 500] U (-500, 0]
        /// - PercentChangeInCapacity：[0, 10000] U [-100, 0]
        /// - TotalCapacity：[0, 1000]
        /// </summary>
        [Input("adjustmentValue")]
        public Input<int>? AdjustmentValue { get; set; }

        [Input("ari")]
        public Input<string>? Ari { get; set; }

        /// <summary>
        /// Cool-down time of a scaling rule. Value range: [0, 86,400], in seconds. The default value is empty，if not set, the return value will be 0, which is the default value of integer.
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
        private InputList<Inputs.ScalingRuleStepAdjustmentsGetArgs>? _stepAdjustments;

        /// <summary>
        /// Steps for StepScalingRule. See Block stepAdjustment below for details.
        /// </summary>
        public InputList<Inputs.ScalingRuleStepAdjustmentsGetArgs> StepAdjustments
        {
            get => _stepAdjustments ?? (_stepAdjustments = new InputList<Inputs.ScalingRuleStepAdjustmentsGetArgs>());
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
    }

    namespace Inputs
    {

    public sealed class ScalingRuleStepAdjustmentsArgs : Pulumi.ResourceArgs
    {
        [Input("metricIntervalLowerBound")]
        public Input<string>? MetricIntervalLowerBound { get; set; }

        [Input("metricIntervalUpperBound")]
        public Input<string>? MetricIntervalUpperBound { get; set; }

        [Input("scalingAdjustment")]
        public Input<int>? ScalingAdjustment { get; set; }

        public ScalingRuleStepAdjustmentsArgs()
        {
        }
    }

    public sealed class ScalingRuleStepAdjustmentsGetArgs : Pulumi.ResourceArgs
    {
        [Input("metricIntervalLowerBound")]
        public Input<string>? MetricIntervalLowerBound { get; set; }

        [Input("metricIntervalUpperBound")]
        public Input<string>? MetricIntervalUpperBound { get; set; }

        [Input("scalingAdjustment")]
        public Input<int>? ScalingAdjustment { get; set; }

        public ScalingRuleStepAdjustmentsGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class ScalingRuleStepAdjustments
    {
        public readonly string? MetricIntervalLowerBound;
        public readonly string? MetricIntervalUpperBound;
        public readonly int? ScalingAdjustment;

        [OutputConstructor]
        private ScalingRuleStepAdjustments(
            string? metricIntervalLowerBound,
            string? metricIntervalUpperBound,
            int? scalingAdjustment)
        {
            MetricIntervalLowerBound = metricIntervalLowerBound;
            MetricIntervalUpperBound = metricIntervalUpperBound;
            ScalingAdjustment = scalingAdjustment;
        }
    }
    }
}