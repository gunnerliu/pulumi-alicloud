// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga.Outputs
{

    [OutputType]
    public sealed class GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigResult
    {
        public readonly ImmutableArray<Outputs.GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTupleResult> ServerGroupTuples;

        [OutputConstructor]
        private GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigResult(ImmutableArray<Outputs.GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTupleResult> serverGroupTuples)
        {
            ServerGroupTuples = serverGroupTuples;
        }
    }
}
