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
    public sealed class GetEcsDisksDiskResult
    {
        /// <summary>
        /// A mount of time.
        /// </summary>
        public readonly string AttachedTime;
        /// <summary>
        /// Query cloud disks based on the automatic snapshot policy ID.
        /// </summary>
        public readonly string AutoSnapshotPolicyId;
        /// <summary>
        /// Availability zone of the disk.
        /// </summary>
        public readonly string AvailabilityZone;
        /// <summary>
        /// Disk category.
        /// </summary>
        public readonly string Category;
        /// <summary>
        /// Disk creation time.
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// Indicates whether the automatic snapshot is deleted when the disk is released.
        /// </summary>
        public readonly bool DeleteAutoSnapshot;
        /// <summary>
        /// Indicates whether the disk is released together with the instance.
        /// </summary>
        public readonly bool DeleteWithInstance;
        /// <summary>
        /// Disk description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Disk detachment time.
        /// </summary>
        public readonly string DetachedTime;
        /// <summary>
        /// The mount point of the disk.
        /// </summary>
        public readonly string Device;
        /// <summary>
        /// ID of the disk.
        /// </summary>
        public readonly string DiskId;
        /// <summary>
        /// The disk name.
        /// </summary>
        public readonly string DiskName;
        /// <summary>
        /// The disk type.
        /// </summary>
        public readonly string DiskType;
        /// <summary>
        /// Whether the disk implements an automatic snapshot policy.
        /// </summary>
        public readonly bool EnableAutoSnapshot;
        /// <summary>
        /// Whether the disk implements an automatic snapshot policy.
        /// </summary>
        public readonly bool EnableAutomatedSnapshotPolicy;
        /// <summary>
        /// Indicate whether the disk is encrypted or not.
        /// </summary>
        public readonly string Encrypted;
        public readonly string ExpiredTime;
        /// <summary>
        /// ID of the disk.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// ID of the image from which the disk is created. It is null unless the disk is created using an image.
        /// </summary>
        public readonly string ImageId;
        /// <summary>
        /// The instance ID of the disk mount.
        /// </summary>
        public readonly string InstanceId;
        public readonly int Iops;
        public readonly int IopsRead;
        public readonly int IopsWrite;
        /// <summary>
        /// The kms key id.
        /// </summary>
        public readonly string KmsKeyId;
        /// <summary>
        /// Number of instances mounted on shared storage.
        /// </summary>
        public readonly int MountInstanceNum;
        /// <summary>
        /// Disk mount instances.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEcsDisksDiskMountInstanceResult> MountInstances;
        /// <summary>
        /// Disk name.
        /// </summary>
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetEcsDisksDiskOperationLockResult> OperationLocks;
        /// <summary>
        /// Payment method for disk.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// Performance levels of ESSD cloud disk.
        /// </summary>
        public readonly string PerformanceLevel;
        /// <summary>
        /// Whether the disk is unmountable.
        /// </summary>
        public readonly bool Portable;
        /// <summary>
        /// The product logo of the cloud market.
        /// </summary>
        public readonly string ProductCode;
        /// <summary>
        /// Region ID the disk belongs to.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// The Id of resource group.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// Disk size in GiB.
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
        /// </summary>
        public readonly string SnapshotId;
        /// <summary>
        /// Current status.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A map of tags assigned to the disk.
        /// </summary>
        public readonly ImmutableDictionary<string, object> Tags;
        /// <summary>
        /// Disk type.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The zone id.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetEcsDisksDiskResult(
            string attachedTime,

            string autoSnapshotPolicyId,

            string availabilityZone,

            string category,

            string creationTime,

            bool deleteAutoSnapshot,

            bool deleteWithInstance,

            string description,

            string detachedTime,

            string device,

            string diskId,

            string diskName,

            string diskType,

            bool enableAutoSnapshot,

            bool enableAutomatedSnapshotPolicy,

            string encrypted,

            string expiredTime,

            string id,

            string imageId,

            string instanceId,

            int iops,

            int iopsRead,

            int iopsWrite,

            string kmsKeyId,

            int mountInstanceNum,

            ImmutableArray<Outputs.GetEcsDisksDiskMountInstanceResult> mountInstances,

            string name,

            ImmutableArray<Outputs.GetEcsDisksDiskOperationLockResult> operationLocks,

            string paymentType,

            string performanceLevel,

            bool portable,

            string productCode,

            string regionId,

            string resourceGroupId,

            int size,

            string snapshotId,

            string status,

            ImmutableDictionary<string, object> tags,

            string type,

            string zoneId)
        {
            AttachedTime = attachedTime;
            AutoSnapshotPolicyId = autoSnapshotPolicyId;
            AvailabilityZone = availabilityZone;
            Category = category;
            CreationTime = creationTime;
            DeleteAutoSnapshot = deleteAutoSnapshot;
            DeleteWithInstance = deleteWithInstance;
            Description = description;
            DetachedTime = detachedTime;
            Device = device;
            DiskId = diskId;
            DiskName = diskName;
            DiskType = diskType;
            EnableAutoSnapshot = enableAutoSnapshot;
            EnableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            Encrypted = encrypted;
            ExpiredTime = expiredTime;
            Id = id;
            ImageId = imageId;
            InstanceId = instanceId;
            Iops = iops;
            IopsRead = iopsRead;
            IopsWrite = iopsWrite;
            KmsKeyId = kmsKeyId;
            MountInstanceNum = mountInstanceNum;
            MountInstances = mountInstances;
            Name = name;
            OperationLocks = operationLocks;
            PaymentType = paymentType;
            PerformanceLevel = performanceLevel;
            Portable = portable;
            ProductCode = productCode;
            RegionId = regionId;
            ResourceGroupId = resourceGroupId;
            Size = size;
            SnapshotId = snapshotId;
            Status = status;
            Tags = tags;
            Type = type;
            ZoneId = zoneId;
        }
    }
}
