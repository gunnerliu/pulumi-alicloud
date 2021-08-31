// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class RuleRuleActionForwardGroupConfigArgs : Pulumi.ResourceArgs
    {
        [Input("serverGroupTuples")]
        private InputList<Inputs.RuleRuleActionForwardGroupConfigServerGroupTupleArgs>? _serverGroupTuples;

        /// <summary>
        /// The destination server group to which requests are forwarded.
        /// </summary>
        public InputList<Inputs.RuleRuleActionForwardGroupConfigServerGroupTupleArgs> ServerGroupTuples
        {
            get => _serverGroupTuples ?? (_serverGroupTuples = new InputList<Inputs.RuleRuleActionForwardGroupConfigServerGroupTupleArgs>());
            set => _serverGroupTuples = value;
        }

        public RuleRuleActionForwardGroupConfigArgs()
        {
        }
    }
}
