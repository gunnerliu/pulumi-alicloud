// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess.Outputs
{

    [OutputType]
    public sealed class ScalingGroupVServerGroupsVserverGroup
    {
        public readonly string LoadbalancerId;
        public readonly ImmutableArray<Outputs.ScalingGroupVServerGroupsVserverGroupVserverAttribute> VserverAttributes;

        [OutputConstructor]
        private ScalingGroupVServerGroupsVserverGroup(
            string loadbalancerId,

            ImmutableArray<Outputs.ScalingGroupVServerGroupsVserverGroupVserverAttribute> vserverAttributes)
        {
            LoadbalancerId = loadbalancerId;
            VserverAttributes = vserverAttributes;
        }
    }
}
