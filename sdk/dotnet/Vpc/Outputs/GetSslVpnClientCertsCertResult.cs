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
    public sealed class GetSslVpnClientCertsCertResult
    {
        /// <summary>
        /// The time of creation.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The expiration time of the client certificate.
        /// </summary>
        public readonly int EndTime;
        /// <summary>
        /// ID of the SSL-VPN client certificate.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the SSL-VPN client certificate.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Use the SSL-VPN server ID as the search key.
        /// </summary>
        public readonly string SslVpnServerId;
        /// <summary>
        /// The status of the client certificate. valid value:expiring-soon, normal, expired.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetSslVpnClientCertsCertResult(
            string createTime,

            int endTime,

            string id,

            string name,

            string sslVpnServerId,

            string status)
        {
            CreateTime = createTime;
            EndTime = endTime;
            Id = id;
            Name = name;
            SslVpnServerId = sslVpnServerId;
            Status = status;
        }
    }
}
