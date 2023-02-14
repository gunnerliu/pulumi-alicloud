// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn.Outputs
{

    [OutputType]
    public sealed class GetGatewayVpnAttachmentsAttachmentHealthCheckConfigResult
    {
        /// <summary>
        /// The destination IP address.
        /// </summary>
        public readonly string Dip;
        /// <summary>
        /// Specifies whether to enable health checks.
        /// </summary>
        public readonly bool Enable;
        /// <summary>
        /// The interval between two consecutive health checks. Unit: seconds.
        /// </summary>
        public readonly int Interval;
        /// <summary>
        /// Whether to revoke the published route when the health check fails.
        /// </summary>
        public readonly string Policy;
        /// <summary>
        /// The maximum number of health check retries.
        /// </summary>
        public readonly int Retry;
        /// <summary>
        /// The source IP address.
        /// </summary>
        public readonly string Sip;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetGatewayVpnAttachmentsAttachmentHealthCheckConfigResult(
            string dip,

            bool enable,

            int interval,

            string policy,

            int retry,

            string sip,

            string status)
        {
            Dip = dip;
            Enable = enable;
            Interval = interval;
            Policy = policy;
            Retry = retry;
            Sip = sip;
            Status = status;
        }
    }
}