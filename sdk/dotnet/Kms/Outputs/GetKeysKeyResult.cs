// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Kms.Outputs
{

    [OutputType]
    public sealed class GetKeysKeyResult
    {
        /// <summary>
        /// The Alibaba Cloud Resource Name (ARN) of the key.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Creation date of key.
        /// </summary>
        public readonly string CreationDate;
        /// <summary>
        /// The owner of the key.
        /// </summary>
        public readonly string Creator;
        /// <summary>
        /// Deletion date of key.
        /// </summary>
        public readonly string DeleteDate;
        /// <summary>
        /// Description of the key.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// ID of the key.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Filter the results by status of the KMS keys. Valid values: `Enabled`, `Disabled`, `PendingDeletion`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetKeysKeyResult(
            string arn,

            string creationDate,

            string creator,

            string deleteDate,

            string description,

            string id,

            string status)
        {
            Arn = arn;
            CreationDate = creationDate;
            Creator = creator;
            DeleteDate = deleteDate;
            Description = description;
            Id = id;
            Status = status;
        }
    }
}