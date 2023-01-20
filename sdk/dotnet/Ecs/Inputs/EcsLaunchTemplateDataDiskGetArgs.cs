// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Inputs
{

    public sealed class EcsLaunchTemplateDataDiskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The category of the system disk. System disk type. Valid values: `all`, `cloud`, `ephemeral_ssd`, `cloud_essd`, `cloud_efficiency`, `cloud_ssd`, `local_disk`.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Specifies whether to release the system disk when the instance is released. Default to `true`.
        /// </summary>
        [Input("deleteWithInstance")]
        public Input<bool>? DeleteWithInstance { get; set; }

        /// <summary>
        /// Description of instance launch template version 1. It can be [2, 256] characters in length. It cannot start with "http://" or "https://". The default value is null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Encrypted the data in this disk.
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// It has been deprecated from version 1.120.0, and use field `launch_template_name` instead.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The performance level of the ESSD used as the system disk. Valid Values: `PL0`, `PL1`, `PL2`, and `PL3`. Default to: `PL0`.
        /// </summary>
        [Input("performanceLevel")]
        public Input<string>? PerformanceLevel { get; set; }

        /// <summary>
        /// Size of the system disk, measured in GB. Value range: [20, 500].
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        /// <summary>
        /// The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        public EcsLaunchTemplateDataDiskGetArgs()
        {
        }
        public static new EcsLaunchTemplateDataDiskGetArgs Empty => new EcsLaunchTemplateDataDiskGetArgs();
    }
}
