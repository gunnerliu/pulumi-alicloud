// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Inputs
{

    public sealed class InstanceDataDiskGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the automatic snapshot policy applied to the system disk.
        /// </summary>
        [Input("autoSnapshotPolicyId")]
        public Input<string>? AutoSnapshotPolicyId { get; set; }

        /// <summary>
        /// The category of the disk:
        /// - `cloud`: The general cloud disk.
        /// - `cloud_efficiency`: The efficiency cloud disk.
        /// - `cloud_ssd`: The SSD cloud disk.
        /// - `cloud_essd`: The ESSD cloud disk.
        /// - `ephemeral_ssd`: The local SSD disk.
        /// Default to `cloud_efficiency`.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Delete this data disk when the instance is destroyed. It only works on cloud, cloud_efficiency, cloud_essd, cloud_ssd disk. If the category of this data disk was ephemeral_ssd, please don't set this param. Default value: `true`.
        /// </summary>
        [Input("deleteWithInstance")]
        public Input<bool>? DeleteWithInstance { get; set; }

        /// <summary>
        /// The description of the data disk.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// -(Optional, Bool, ForceNew) Encrypted the data in this disk. Default value: `false`.
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// The KMS key ID corresponding to the Nth data disk.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The name of the data disk.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The performance level of the ESSD used as data disk:
        /// - `PL0`: A single ESSD can deliver up to 10,000 random read/write IOPS.
        /// - `PL1`: A single ESSD can deliver up to 50,000 random read/write IOPS.
        /// - `PL2`: A single ESSD can deliver up to 100,000 random read/write IOPS.
        /// - `PL3`: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
        /// Default to `PL1`.
        /// </summary>
        [Input("performanceLevel")]
        public Input<string>? PerformanceLevel { get; set; }

        /// <summary>
        /// The size of the data disk.
        /// - cloud：[5, 2000]
        /// - cloud_efficiency：[20, 32768]
        /// - cloud_ssd：[20, 32768]
        /// - cloud_essd：[20, 32768]
        /// - ephemeral_ssd: [5, 800]
        /// </summary>
        [Input("size", required: true)]
        public Input<int> Size { get; set; } = null!;

        /// <summary>
        /// The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        public InstanceDataDiskGetArgs()
        {
        }
    }
}
