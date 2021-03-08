// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class NodePoolScalingConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Peak EIP bandwidth. Its valid value range [1~500] in Mbps. Default to `5`.
        /// </summary>
        [Input("eipBandwidth")]
        public Input<int>? EipBandwidth { get; set; }

        /// <summary>
        /// EIP billing type. `PayByBandwidth`: Charged at fixed bandwidth. `PayByTraffic`: Billed as used traffic. Default: `PayByBandwidth`.
        /// </summary>
        [Input("eipInternetChargeType")]
        public Input<string>? EipInternetChargeType { get; set; }

        /// <summary>
        /// Whether to bind EIP for an instance. Default: `false`.
        /// </summary>
        [Input("isBondEip")]
        public Input<bool>? IsBondEip { get; set; }

        /// <summary>
        /// Max number of instances in a auto scaling group, its valid value range [0~1000]. `max_size` has to be greater than `min_size`.
        /// </summary>
        [Input("maxSize", required: true)]
        public Input<int> MaxSize { get; set; } = null!;

        /// <summary>
        /// Min number of instances in a auto scaling group, its valid value range [0~1000].
        /// </summary>
        [Input("minSize", required: true)]
        public Input<int> MinSize { get; set; } = null!;

        /// <summary>
        /// Instance classification, not required. Vaild value: `cpu`, `gpu`, `gpushare` and `spot`. Default: `cpu`. The actual instance type is determined by `instance_types`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public NodePoolScalingConfigGetArgs()
        {
        }
    }
}
