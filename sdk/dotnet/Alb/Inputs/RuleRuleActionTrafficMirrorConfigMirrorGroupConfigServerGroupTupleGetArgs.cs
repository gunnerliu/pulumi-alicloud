// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTupleGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the destination server group to which requests are forwarded.
        /// </summary>
        [Input("serverGroupId")]
        public Input<string>? ServerGroupId { get; set; }

        public RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTupleGetArgs()
        {
        }
    }
}
