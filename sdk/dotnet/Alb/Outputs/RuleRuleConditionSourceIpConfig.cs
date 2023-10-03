// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class RuleRuleConditionSourceIpConfig
    {
        /// <summary>
        /// Add one or more IP addresses or IP address segments. You can add up to 5 forwarding rules in a SourceIp.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private RuleRuleConditionSourceIpConfig(ImmutableArray<string> values)
        {
            Values = values;
        }
    }
}
