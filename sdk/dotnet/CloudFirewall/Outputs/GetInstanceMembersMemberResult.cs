// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Outputs
{

    [OutputType]
    public sealed class GetInstanceMembersMemberResult
    {
        /// <summary>
        /// When the cloud firewall member account was added.&gt; use second-level timestamp format.
        /// </summary>
        public readonly int CreateTime;
        public readonly string Id;
        /// <summary>
        /// Remarks of cloud firewall member accounts.
        /// </summary>
        public readonly string MemberDesc;
        /// <summary>
        /// The name of the cloud firewall member account.
        /// </summary>
        public readonly string MemberDisplayName;
        /// <summary>
        /// The UID of the cloud firewall member account.
        /// </summary>
        public readonly string MemberUid;
        /// <summary>
        /// The last modification time of the cloud firewall member account.&gt; use second-level timestamp format.
        /// </summary>
        public readonly int ModifyTime;
        /// <summary>
        /// The resource attribute field that represents the resource status.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetInstanceMembersMemberResult(
            int createTime,

            string id,

            string memberDesc,

            string memberDisplayName,

            string memberUid,

            int modifyTime,

            string status)
        {
            CreateTime = createTime;
            Id = id;
            MemberDesc = memberDesc;
            MemberDisplayName = memberDisplayName;
            MemberUid = memberUid;
            ModifyTime = modifyTime;
            Status = status;
        }
    }
}