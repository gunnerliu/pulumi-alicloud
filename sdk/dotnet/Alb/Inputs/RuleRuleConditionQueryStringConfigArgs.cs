// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class RuleRuleConditionQueryStringConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("values")]
        private InputList<Inputs.RuleRuleConditionQueryStringConfigValueArgs>? _values;

        /// <summary>
        /// Add one or more IP addresses or IP address segments. You can add up to 5 forwarding rules in a SourceIp.
        /// </summary>
        public InputList<Inputs.RuleRuleConditionQueryStringConfigValueArgs> Values
        {
            get => _values ?? (_values = new InputList<Inputs.RuleRuleConditionQueryStringConfigValueArgs>());
            set => _values = value;
        }

        public RuleRuleConditionQueryStringConfigArgs()
        {
        }
        public static new RuleRuleConditionQueryStringConfigArgs Empty => new RuleRuleConditionQueryStringConfigArgs();
    }
}
