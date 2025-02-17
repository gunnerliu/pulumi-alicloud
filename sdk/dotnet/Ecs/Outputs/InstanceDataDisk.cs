// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Outputs
{

    [OutputType]
    public sealed class InstanceDataDisk
    {
        /// <summary>
        /// The ID of the automatic snapshot policy applied to the system disk.
        /// </summary>
        public readonly string? AutoSnapshotPolicyId;
        /// <summary>
        /// The category of the disk:
        /// </summary>
        public readonly string? Category;
        /// <summary>
        /// Delete this data disk when the instance is destroyed. It only works on cloud, cloud_efficiency, cloud_essd, cloud_ssd disk. If the category of this data disk was ephemeral_ssd, please don't set this param. Default value: `true`.
        /// </summary>
        public readonly bool? DeleteWithInstance;
        /// <summary>
        /// The description of the data disk.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The mount point of the data disk.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// Encrypted the data in this disk. Default value: `false`.
        /// </summary>
        public readonly bool? Encrypted;
        /// <summary>
        /// The KMS key ID corresponding to the Nth data disk.
        /// </summary>
        public readonly string? KmsKeyId;
        /// <summary>
        /// The name of the data disk.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The performance level of the ESSD used as data disk:
        /// </summary>
        public readonly string? PerformanceLevel;
        /// <summary>
        /// The size of the data disk.
        /// - cloud：[5, 2000]
        /// - cloud_efficiency：[20, 32768]
        /// - cloud_ssd：[20, 32768]
        /// - cloud_essd：[20, 32768]
        /// - ephemeral_ssd: [5, 800]
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
        /// </summary>
        public readonly string? SnapshotId;

        [OutputConstructor]
        private InstanceDataDisk(
            string? autoSnapshotPolicyId,

            string? category,

            bool? deleteWithInstance,

            string? description,

            string? device,

            bool? encrypted,

            string? kmsKeyId,

            string? name,

            string? performanceLevel,

            int size,

            string? snapshotId)
        {
            AutoSnapshotPolicyId = autoSnapshotPolicyId;
            Category = category;
            DeleteWithInstance = deleteWithInstance;
            Description = description;
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
