// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Outputs
{

    [OutputType]
    public sealed class KubernetesWorkerDataDisk
    {
        /// <summary>
        /// (Optional, Available in 1.120.0+) Worker node data disk auto snapshot policy.
        /// </summary>
        public readonly string? AutoSnapshotPolicyId;
        /// <summary>
        /// The type of the data disks. Valid values: `cloud`, `cloud_efficiency`, `cloud_ssd` and `cloud_essd`. Default to `cloud_efficiency`.
        /// </summary>
        public readonly string? Category;
        public readonly string? Device;
        /// <summary>
        /// Specifies whether to encrypt data disks. Valid values: true and false.
        /// </summary>
        public readonly string? Encrypted;
        public readonly string? KmsKeyId;
        /// <summary>
        /// The kubernetes cluster's name. It is unique in one Alicloud account.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// (Optional, Available in 1.120.0+) Worker node data disk performance level, when `category` values `cloud_essd`, the optional values are `PL0`, `PL1`, `PL2` or `PL3`, but the specific performance level is related to the disk capacity. For more information, see [Enhanced SSDs](https://www.alibabacloud.com/help/doc-detail/122389.htm). Default is `PL1`.
        /// </summary>
        public readonly string? PerformanceLevel;
        /// <summary>
        /// The size of a data disk, Its valid value range [40~32768] in GB. Unit: GiB.
        /// </summary>
        public readonly string? Size;
        public readonly string? SnapshotId;

        [OutputConstructor]
        private KubernetesWorkerDataDisk(
            string? autoSnapshotPolicyId,

            string? category,

            string? device,

            string? encrypted,

            string? kmsKeyId,

            string? name,

            string? performanceLevel,

            string? size,

            string? snapshotId)
        {
            AutoSnapshotPolicyId = autoSnapshotPolicyId;
            Category = category;
            Device = device;
            Encrypted = encrypted;
            KmsKeyId = kmsKeyId;
            Name = name;
            PerformanceLevel = performanceLevel;
            Size = size;
            SnapshotId = snapshotId;
        }
    }
}
