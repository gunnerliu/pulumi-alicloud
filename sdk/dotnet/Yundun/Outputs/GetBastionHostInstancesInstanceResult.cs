// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Yundun.Outputs
{

    [OutputType]
    public sealed class GetBastionHostInstancesInstanceResult
    {
        /// <summary>
        /// The instance's remark.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The instance's id.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The instance's status.
        /// </summary>
        public readonly string InstanceStatus;
        public readonly string LicenseCode;
        /// <summary>
        /// The instance's private domain name.
        /// </summary>
        public readonly string PrivateDomain;
        /// <summary>
        /// The instance's public domain name.
        /// </summary>
        public readonly string PublicDomain;
        /// <summary>
        /// The instance's public network access configuration.
        /// </summary>
        public readonly bool PublicNetworkAccess;
        /// <summary>
        /// The instance's security group configuration.
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroupIds;
        /// <summary>
        /// A map of tags assigned to the bastionhost instance. It must be in the format:
        /// ```
        /// data "alicloud.yundun.getBastionHostInstances" "instance" {
        /// tags = {
        /// tagKey1 = "tagValue1"
        /// }
        /// }
        /// ```
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Tags;
        /// <summary>
        /// The instance's vSwitch ID.
        /// </summary>
        public readonly string UserVswitchId;

        [OutputConstructor]
        private GetBastionHostInstancesInstanceResult(
            string description,

            string id,

            string instanceStatus,

            string licenseCode,

            string privateDomain,

            string publicDomain,

            bool publicNetworkAccess,

            ImmutableArray<string> securityGroupIds,

            ImmutableDictionary<string, object>? tags,

            string userVswitchId)
        {
            Description = description;
            Id = id;
            InstanceStatus = instanceStatus;
            LicenseCode = licenseCode;
            PrivateDomain = privateDomain;
            PublicDomain = publicDomain;
            PublicNetworkAccess = publicNetworkAccess;
            SecurityGroupIds = securityGroupIds;
            Tags = tags;
            UserVswitchId = userVswitchId;
        }
    }
}
