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
    public sealed class NetworkAclEntriesEgress
    {
        /// <summary>
        /// The description of the egress entry.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The destination ip of the egress entry.
        /// </summary>
        public readonly string? DestinationCidrIp;
        /// <summary>
        /// The entry type of the egress entry. It must be `custom` or `system`. Default value is `custom`.
        /// </summary>
        public readonly string? EntryType;
        /// <summary>
        /// The name of the egress entry.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The policy of the egress entry. It must be `accept` or `drop`.
        /// </summary>
        public readonly string? Policy;
        /// <summary>
        /// The port of the egress entry.
        /// </summary>
        public readonly string? Port;
        /// <summary>
        /// The protocol of the egress entry.
        /// </summary>
        public readonly string? Protocol;

        [OutputConstructor]
        private NetworkAclEntriesEgress(
            string? description,

            string? destinationCidrIp,

            string? entryType,

            string? name,

            string? policy,

            string? port,

            string? protocol)
        {
            Description = description;
            DestinationCidrIp = destinationCidrIp;
            EntryType = entryType;
            Name = name;
            Policy = policy;
            Port = port;
            Protocol = protocol;
        }
    }
}
