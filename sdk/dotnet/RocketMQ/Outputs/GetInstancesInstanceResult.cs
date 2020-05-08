// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RocketMQ.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceResult
    {
        /// <summary>
        /// ID of the instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// ID of the instance.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// Name of the instance.
        /// </summary>
        public readonly string InstanceName;
        /// <summary>
        /// The status of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
        /// </summary>
        public readonly int InstanceStatus;
        /// <summary>
        /// The type of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
        /// </summary>
        public readonly int InstanceType;
        /// <summary>
        /// The automatic release time of an Enterprise Platinum Edition instance.
        /// </summary>
        public readonly int ReleaseTime;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            string id,

            string instanceId,

            string instanceName,

            int instanceStatus,

            int instanceType,

            int releaseTime)
        {
            Id = id;
            InstanceId = instanceId;
            InstanceName = instanceName;
            InstanceStatus = instanceStatus;
            InstanceType = instanceType;
            ReleaseTime = releaseTime;
        }
    }
}