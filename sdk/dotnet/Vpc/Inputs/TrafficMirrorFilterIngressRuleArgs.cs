// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc.Inputs
{

    public sealed class TrafficMirrorFilterIngressRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Collection strategy for outbound rules. Value:
        /// - accept: collects network traffic.
        /// - drop: No network traffic is collected.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// DestinationCidrBlock.
        /// </summary>
        [Input("destinationCidrBlock")]
        public Input<string>? DestinationCidrBlock { get; set; }

        /// <summary>
        /// The destination port range of the outbound rule network traffic. The port range is 1 to 65535. Use a forward slash (/) to separate the start port and the end Port. The format is 1/200 and 80/80. Among them, - 1/-1 cannot be set separately, which means that the port is not limited.
        /// &gt; **NOTE:**  When egresrules. N.Protocol is set to ALL or ICMP, this parameter does not need to be configured, indicating that the port is not restricted.
        /// </summary>
        [Input("destinationPortRange")]
        public Input<string>? DestinationPortRange { get; set; }

        /// <summary>
        /// Priority.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The type of protocol used by the outbound network traffic to be mirrored. Value:
        /// - ALL: ALL agreements.
        /// - ICMP: Network Control Message Protocol.
        /// - TCP: Transmission Control Protocol.
        /// - UDP: User Datagram Protocol.
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        /// <summary>
        /// The source address of the outbound rule network traffic.
        /// </summary>
        [Input("sourceCidrBlock")]
        public Input<string>? SourceCidrBlock { get; set; }

        /// <summary>
        /// The source port range of the outbound rule network traffic. The port range is 1 to 65535. Use a forward slash (/) to separate the start port and the end Port. The format is 1/200 and 80/80. Among them, - 1/-1 cannot be set separately, which means that the port is not limited.
        /// &gt; **NOTE:**  When egresrules. N.Protocol is set to ALL or ICMP, this parameter does not need to be configured, indicating that the port is not restricted.
        /// </summary>
        [Input("sourcePortRange")]
        public Input<string>? SourcePortRange { get; set; }

        [Input("trafficMirrorFilterRuleStatus")]
        public Input<string>? TrafficMirrorFilterRuleStatus { get; set; }

        public TrafficMirrorFilterIngressRuleArgs()
        {
        }
        public static new TrafficMirrorFilterIngressRuleArgs Empty => new TrafficMirrorFilterIngressRuleArgs();
    }
}
