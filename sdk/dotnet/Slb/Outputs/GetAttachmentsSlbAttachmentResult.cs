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
    public sealed class GetAttachmentsSlbAttachmentResult
    {
        /// <summary>
        /// ID of the attached ECS instance.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// Weight associated to the ECS instance.
        /// </summary>
        public readonly int Weight;

        [OutputConstructor]
        private GetAttachmentsSlbAttachmentResult(
            string instanceId,

            int weight)
        {
            InstanceId = instanceId;
            Weight = weight;
        }
    }
}