// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc.Outputs
{

    [OutputType]
    public sealed class GetIpv6InternetBandwidthsBandwidthResult
    {
        /// <summary>
        /// The amount of Internet bandwidth resources of the IPv6 address, Unit: `Mbit/s`.
        /// </summary>
        public readonly int Bandwidth;
        /// <summary>
        /// The ID of the Ipv6 Internet Bandwidth.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The metering method of the Internet bandwidth resources of the IPv6 gateway.
        /// </summary>
        public readonly string InternetChargeType;
        /// <summary>
        /// The ID of the IPv6 address.
        /// </summary>
        public readonly string Ipv6AddressId;
        /// <summary>
        /// The ID of the IPv6 gateway.
        /// </summary>
        public readonly string Ipv6GatewayId;
        /// <summary>
        /// The ID of the Ipv6 Internet Bandwidth.
        /// </summary>
        public readonly string Ipv6InternetBandwidthId;
        /// <summary>
        /// The payment type of the resource.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// The status of the resource. Valid values: `Normal`, `FinancialLocked` and `SecurityLocked`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetIpv6InternetBandwidthsBandwidthResult(
            int bandwidth,

            string id,

            string internetChargeType,

            string ipv6AddressId,

            string ipv6GatewayId,

            string ipv6InternetBandwidthId,

            string paymentType,

            string status)
        {
            Bandwidth = bandwidth;
            Id = id;
            InternetChargeType = internetChargeType;
            Ipv6AddressId = ipv6AddressId;
            Ipv6GatewayId = ipv6GatewayId;
            Ipv6InternetBandwidthId = ipv6InternetBandwidthId;
            PaymentType = paymentType;
            Status = status;
        }
    }
}