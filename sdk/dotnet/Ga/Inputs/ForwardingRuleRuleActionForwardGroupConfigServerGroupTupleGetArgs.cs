// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga.Inputs
{

    public sealed class ForwardingRuleRuleActionForwardGroupConfigServerGroupTupleGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Terminal node group ID.
        /// </summary>
        [Input("endpointGroupId", required: true)]
        public Input<string> EndpointGroupId { get; set; } = null!;

        public ForwardingRuleRuleActionForwardGroupConfigServerGroupTupleGetArgs()
        {
        }
    }
}
