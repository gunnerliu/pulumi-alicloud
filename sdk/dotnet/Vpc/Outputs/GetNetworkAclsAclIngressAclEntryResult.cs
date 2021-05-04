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
    public sealed class GetNetworkAclsAclIngressAclEntryResult
    {
        /// <summary>
        /// Description of the entry direction rule.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The name of the entry direction rule entry.
        /// </summary>
        public readonly string NetworkAclEntryName;
        /// <summary>
        /// The authorization policy.
        /// </summary>
        public readonly string Policy;
        /// <summary>
        /// Source port range.
        /// </summary>
        public readonly string Port;
        /// <summary>
        /// Transport layer protocol.
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// The source address field.
        /// </summary>
        public readonly string SourceCidrIp;

        [OutputConstructor]
        private GetNetworkAclsAclIngressAclEntryResult(
            string description,

            string networkAclEntryName,

            string policy,

            string port,

            string protocol,

            string sourceCidrIp)
        {
            Description = description;
            NetworkAclEntryName = networkAclEntryName;
            Policy = policy;
            Port = port;
            Protocol = protocol;
            SourceCidrIp = sourceCidrIp;
        }
    }
}
