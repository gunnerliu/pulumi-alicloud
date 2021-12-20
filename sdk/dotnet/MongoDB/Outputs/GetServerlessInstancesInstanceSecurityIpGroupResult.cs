// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MongoDB.Outputs
{

    [OutputType]
    public sealed class GetServerlessInstancesInstanceSecurityIpGroupResult
    {
        /// <summary>
        /// The attribute of the IP whitelist. This parameter is empty by default.
        /// </summary>
        public readonly string SecurityIpGroupAttribute;
        /// <summary>
        /// The name of the IP whitelist.
        /// </summary>
        public readonly string SecurityIpGroupName;
        /// <summary>
        /// The IP addresses in the whitelist.
        /// </summary>
        public readonly string SecurityIpList;

        [OutputConstructor]
        private GetServerlessInstancesInstanceSecurityIpGroupResult(
            string securityIpGroupAttribute,

            string securityIpGroupName,

            string securityIpList)
        {
            SecurityIpGroupAttribute = securityIpGroupAttribute;
            SecurityIpGroupName = securityIpGroupName;
            SecurityIpList = securityIpList;
        }
    }
}
