// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gpdb.Outputs
{

    [OutputType]
    public sealed class InstanceIpWhitelist
    {
        /// <summary>
        /// The value of this parameter is empty by default. The attribute of the whitelist group. The console does not display the whitelist group whose value of this parameter is hidden.
        /// </summary>
        public readonly string? IpGroupAttribute;
        /// <summary>
        /// IP whitelist group name
        /// </summary>
        public readonly string? IpGroupName;
        /// <summary>
        /// Field `security_ip_list` has been deprecated from provider version 1.187.0. New field `ip_whitelist` instead.
        /// </summary>
        public readonly string SecurityIpList;

        [OutputConstructor]
        private InstanceIpWhitelist(
            string? ipGroupAttribute,

            string? ipGroupName,

            string securityIpList)
        {
            IpGroupAttribute = ipGroupAttribute;
            IpGroupName = ipGroupName;
            SecurityIpList = securityIpList;
        }
    }
}
