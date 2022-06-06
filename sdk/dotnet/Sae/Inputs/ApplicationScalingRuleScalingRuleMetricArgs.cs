// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Inputs
{

    public sealed class ApplicationScalingRuleScalingRuleMetricArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum number of instances applied.
        /// </summary>
        [Input("maxReplicas")]
        public Input<int>? MaxReplicas { get; set; }

        [Input("metrics")]
        private InputList<Inputs.ApplicationScalingRuleScalingRuleMetricMetricArgs>? _metrics;

        /// <summary>
        /// Indicator rule configuration. See the following `Block metrics`.
        /// </summary>
        public InputList<Inputs.ApplicationScalingRuleScalingRuleMetricMetricArgs> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<Inputs.ApplicationScalingRuleScalingRuleMetricMetricArgs>());
            set => _metrics = value;
        }

        /// <summary>
        /// Minimum number of instances applied.
        /// </summary>
        [Input("minReplicas")]
        public Input<int>? MinReplicas { get; set; }

        /// <summary>
        /// Apply shrink rules. See the following `Block scale_down_rules`.
        /// </summary>
        [Input("scaleDownRules")]
        public Input<Inputs.ApplicationScalingRuleScalingRuleMetricScaleDownRulesArgs>? ScaleDownRules { get; set; }

        /// <summary>
        /// Apply expansion rules. See the following `Block scale_up_rules`.
        /// </summary>
        [Input("scaleUpRules")]
        public Input<Inputs.ApplicationScalingRuleScalingRuleMetricScaleUpRulesArgs>? ScaleUpRules { get; set; }

        public ApplicationScalingRuleScalingRuleMetricArgs()
        {
        }
    }
}