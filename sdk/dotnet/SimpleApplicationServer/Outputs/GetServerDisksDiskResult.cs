// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.SimpleApplicationServer.Outputs
{

    [OutputType]
    public sealed class GetServerDisksDiskResult
    {
        /// <summary>
        /// Disk type. Possible values: `ESSD`, `SSD`.
        /// </summary>
        public readonly string Category;
        /// <summary>
        /// The time when the disk was created. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The device name of the disk on the simple application server.
        /// </summary>
        public readonly string Device;
        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        public readonly string DiskId;
        /// <summary>
        /// The name of the resource.
        /// </summary>
        public readonly string DiskName;
        /// <summary>
        /// The type of the disk. Possible values: `System`, `Data`.
        /// </summary>
        public readonly string DiskType;
        /// <summary>
        /// The ID of the Disk.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Alibaba Cloud simple application server instance ID.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The payment type of the resource. Valid values: `PayAsYouGo`, `Subscription`.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// The size of the disk. Unit: `GB`.
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// The status of the disk. Valid values: `ReIniting`, `Creating`, `In_Use`, `Available`, `Attaching`, `Detaching`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetServerDisksDiskResult(
            string category,

            string createTime,

            string device,

            string diskId,

            string diskName,

            string diskType,

            string id,

            string instanceId,

            string paymentType,

            int size,

            string status)
        {
            Category = category;
            CreateTime = createTime;
            Device = device;
            DiskId = diskId;
            DiskName = diskName;
            DiskType = diskType;
            Id = id;
            InstanceId = instanceId;
            PaymentType = paymentType;
            Size = size;
            Status = status;
        }
    }
}
