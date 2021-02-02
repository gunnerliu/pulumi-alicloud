// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager.Outputs
{

    [OutputType]
    public sealed class GetHandshakesHandshakeResult
    {
        /// <summary>
        /// The time when the invitation expires.
        /// </summary>
        public readonly string ExpireTime;
        public readonly string HandshakeId;
        /// <summary>
        /// The ID of the resource.
        /// * `handshake_id`- The ID of the invitation.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Available in v1.114.0+) The real name of the invited account.
        /// </summary>
        public readonly string InvitedAccountRealName;
        /// <summary>
        /// The ID of the master account of the resource directory.
        /// </summary>
        public readonly string MasterAccountId;
        /// <summary>
        /// The name of the master account of the resource directory.
        /// </summary>
        public readonly string MasterAccountName;
        /// <summary>
        /// (Available in v1.114.0+) The real name of the master account of the resource directory.
        /// </summary>
        public readonly string MasterAccountRealName;
        /// <summary>
        /// The time when the invitation was modified.
        /// </summary>
        public readonly string ModifyTime;
        /// <summary>
        /// The invitation note.
        /// </summary>
        public readonly string Note;
        /// <summary>
        /// The ID of the resource directory.
        /// </summary>
        public readonly string ResourceDirectoryId;
        /// <summary>
        /// The status of handshake, valid values: `Accepted`, `Cancelled`, `Declined`, `Deleted`, `Expired` and `Pending`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The ID or logon email address of the invited account.
        /// </summary>
        public readonly string TargetEntity;
        /// <summary>
        /// The type of the invited account.
        /// </summary>
        public readonly string TargetType;

        [OutputConstructor]
        private GetHandshakesHandshakeResult(
            string expireTime,

            string handshakeId,

            string id,

            string invitedAccountRealName,

            string masterAccountId,

            string masterAccountName,

            string masterAccountRealName,

            string modifyTime,

            string note,

            string resourceDirectoryId,

            string status,

            string targetEntity,

            string targetType)
        {
            ExpireTime = expireTime;
            HandshakeId = handshakeId;
            Id = id;
            InvitedAccountRealName = invitedAccountRealName;
            MasterAccountId = masterAccountId;
            MasterAccountName = masterAccountName;
            MasterAccountRealName = masterAccountRealName;
            ModifyTime = modifyTime;
            Note = note;
            ResourceDirectoryId = resourceDirectoryId;
            Status = status;
            TargetEntity = targetEntity;
            TargetType = targetType;
        }
    }
}
