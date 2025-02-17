// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RocketMQ.Inputs
{

    public sealed class RocketMQInstanceNetworkInfoVpcInfoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Proprietary Network.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// VPC network switch.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        public RocketMQInstanceNetworkInfoVpcInfoArgs()
        {
        }
        public static new RocketMQInstanceNetworkInfoVpcInfoArgs Empty => new RocketMQInstanceNetworkInfoVpcInfoArgs();
    }
}
