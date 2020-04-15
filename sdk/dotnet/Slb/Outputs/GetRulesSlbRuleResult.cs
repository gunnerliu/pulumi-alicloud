// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb.Outputs
{

    [OutputType]
    public sealed class GetRulesSlbRuleResult
    {
        /// <summary>
        /// Domain name in the HTTP request where the rule applies (e.g. "*.aliyun.com").
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// Rule ID.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Rule name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// ID of the linked VServer group.
        /// </summary>
        public readonly string ServerGroupId;
        /// <summary>
        /// Path in the HTTP request where the rule applies (e.g. "/image").
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetRulesSlbRuleResult(
            string domain,

            string id,

            string name,

            string serverGroupId,

            string url)
        {
            Domain = domain;
            Id = id;
            Name = name;
            ServerGroupId = serverGroupId;
            Url = url;
        }
    }
}
