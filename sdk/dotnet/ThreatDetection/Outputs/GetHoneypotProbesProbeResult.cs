// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ThreatDetection.Outputs
{

    [OutputType]
    public sealed class GetHoneypotProbesProbeResult
    {
        /// <summary>
        /// ARP spoofing detection.-**true**: Enable-**false**: Disabled. Available when `enable_details` is on.
        /// </summary>
        public readonly bool Arp;
        /// <summary>
        /// The ID of the management node.
        /// </summary>
        public readonly string ControlNodeId;
        /// <summary>
        /// Probe name
        /// </summary>
        public readonly string DisplayName;
        public readonly ImmutableArray<Outputs.GetHoneypotProbesProbeHoneypotBindListResult> HoneypotBindLists;
        /// <summary>
        /// The first ID of the resource
        /// </summary>
        public readonly string HoneypotProbeId;
        /// <summary>
        /// The ID of the honeypot probe. Its value is the same as `honeypot_probe_id`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Ping scan detection. Value:**true**: Enable **false**: Disabled. Available when `enable_details` is on.
        /// </summary>
        public readonly bool Ping;
        /// <summary>
        /// Probe type
        /// </summary>
        public readonly string ProbeType;
        /// <summary>
        /// Listen to the IP address list. Available when `enable_details` is on.
        /// </summary>
        public readonly ImmutableArray<string> ServiceIpLists;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Machine uuid. Has a value when the type is `host_probe`.
        /// </summary>
        public readonly string Uuid;
        /// <summary>
        /// The ID of the VPC. Has a value when the type is `vpc_black_hole_probe`.
        /// </summary>
        public readonly string VpcId;

        [OutputConstructor]
        private GetHoneypotProbesProbeResult(
            bool arp,

            string controlNodeId,

            string displayName,

            ImmutableArray<Outputs.GetHoneypotProbesProbeHoneypotBindListResult> honeypotBindLists,

            string honeypotProbeId,

            string id,

            bool ping,

            string probeType,

            ImmutableArray<string> serviceIpLists,

            string status,

            string uuid,

            string vpcId)
        {
            Arp = arp;
            ControlNodeId = controlNodeId;
            DisplayName = displayName;
            HoneypotBindLists = honeypotBindLists;
            HoneypotProbeId = honeypotProbeId;
            Id = id;
            Ping = ping;
            ProbeType = probeType;
            ServiceIpLists = serviceIpLists;
            Status = status;
            Uuid = uuid;
            VpcId = vpcId;
        }
    }
}
