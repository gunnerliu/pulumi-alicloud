// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sag.Outputs
{

    [OutputType]
    public sealed class GetAclsAclResult
    {
        /// <summary>
        /// The ID of the ACL. For example "acl-xxx".
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the Acl.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetAclsAclResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}
