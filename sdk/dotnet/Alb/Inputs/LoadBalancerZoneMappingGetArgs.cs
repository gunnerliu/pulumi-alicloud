// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class LoadBalancerZoneMappingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the vSwitch that corresponds to the zone. Each zone can use only one vSwitch and subnet.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        /// <summary>
        /// The ID of the zone to which the ALB instance belongs.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public LoadBalancerZoneMappingGetArgs()
        {
        }
        public static new LoadBalancerZoneMappingGetArgs Empty => new LoadBalancerZoneMappingGetArgs();
    }
}
