// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class NodePoolDataDiskGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoSnapshotPolicyId")]
        public Input<string>? AutoSnapshotPolicyId { get; set; }

        /// <summary>
        /// The type of the data disks. Valid values:`cloud`, `cloud_efficiency`, `cloud_ssd` and `cloud_essd`.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// Specifies whether to encrypt data disks. Valid values: true and false. Default to `false`.
        /// </summary>
        [Input("encrypted")]
        public Input<string>? Encrypted { get; set; }

        /// <summary>
        /// The kms key id used to encrypt the data disk. It takes effect when `encrypted` is true.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The name of node pool.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Worker node data disk performance level, when `category` values `cloud_essd`, the optional values are `PL0`, `PL1`, `PL2` or `PL3`, but the specific performance level is related to the disk capacity. For more information, see [Enhanced SSDs](https://www.alibabacloud.com/help/doc-detail/122389.htm). Default is `PL1`.
        /// </summary>
        [Input("performanceLevel")]
        public Input<string>? PerformanceLevel { get; set; }

        /// <summary>
        /// The size of a data disk, Its valid value range [40~32768] in GB. Default to `40`.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        public NodePoolDataDiskGetArgs()
        {
        }
        public static new NodePoolDataDiskGetArgs Empty => new NodePoolDataDiskGetArgs();
    }
}
