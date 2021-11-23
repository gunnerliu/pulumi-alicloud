// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Outputs
{

    [OutputType]
    public sealed class GetEipAddressesEipResult
    {
        /// <summary>
        /// The maximum bandwidth of the EIP. Unit: Mbit/s.
        /// </summary>
        public readonly string Bandwidth;
        public readonly string CreationTime;
        /// <summary>
        /// Indicates whether deletion protection is enabled.
        /// </summary>
        public readonly bool DeletionProtection;
        /// <summary>
        /// The ID of the Address.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the instance with which the EIP is associated.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The type of the instance with which the EIP is associated.
        /// </summary>
        public readonly string InstanceType;
        /// <summary>
        /// The metering method of the EIP.
        /// </summary>
        public readonly string InternetChargeType;
        /// <summary>
        /// The IP address of the EIP.
        /// </summary>
        public readonly string IpAddress;
        /// <summary>
        /// The status of the EIP.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetEipAddressesEipResult(
            string bandwidth,

            string creationTime,

            bool deletionProtection,

            string id,

            string instanceId,

            string instanceType,

            string internetChargeType,

            string ipAddress,

            string status)
        {
            Bandwidth = bandwidth;
            CreationTime = creationTime;
            DeletionProtection = deletionProtection;
            Id = id;
            InstanceId = instanceId;
            InstanceType = instanceType;
            InternetChargeType = internetChargeType;
            IpAddress = ipAddress;
            Status = status;
        }
    }
}