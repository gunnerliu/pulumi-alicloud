// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class ListenerAclConfigAclRelation
    {
        /// <summary>
        /// Snooping Binding of the Access Policy Group ID List.
        /// </summary>
        public readonly string? AclId;
        /// <summary>
        /// The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private ListenerAclConfigAclRelation(
            string? aclId,

            string? status)
        {
            AclId = aclId;
            Status = status;
        }
    }
}