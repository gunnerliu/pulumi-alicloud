// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class RuleRuleConditionPathConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// Add one or more IP addresses or IP address segments. You can add up to 5 forwarding rules in a SourceIp.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public RuleRuleConditionPathConfigGetArgs()
        {
        }
        public static new RuleRuleConditionPathConfigGetArgs Empty => new RuleRuleConditionPathConfigGetArgs();
    }
}
