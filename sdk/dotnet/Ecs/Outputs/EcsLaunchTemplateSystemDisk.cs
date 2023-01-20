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
    public sealed class EcsLaunchTemplateSystemDisk
    {
        /// <summary>
        /// The category of the system disk. System disk type. Valid values: `all`, `cloud`, `ephemeral_ssd`, `cloud_essd`, `cloud_efficiency`, `cloud_ssd`, `local_disk`.
        /// </summary>
        public readonly string? Category;
        /// <summary>
        /// Specifies whether to release the system disk when the instance is released. Default to `true`.
        /// </summary>
        public readonly bool? DeleteWithInstance;
        /// <summary>
        /// Description of instance launch template version 1. It can be [2, 256] characters in length. It cannot start with "http://" or "https://". The default value is null.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The Iops.
        /// </summary>
        public readonly string? Iops;
        /// <summary>
        /// It has been deprecated from version 1.120.0, and use field `launch_template_name` instead.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The performance level of the ESSD used as the system disk. Valid Values: `PL0`, `PL1`, `PL2`, and `PL3`. Default to: `PL0`.
        /// </summary>
        public readonly string? PerformanceLevel;
        /// <summary>
        /// Size of the system disk, measured in GB. Value range: [20, 500].
        /// </summary>
        public readonly int? Size;

        [OutputConstructor]
        private EcsLaunchTemplateSystemDisk(
            string? category,

            bool? deleteWithInstance,

            string? description,

            string? iops,

            string? name,

            string? performanceLevel,

            int? size)
        {
            Category = category;
            DeleteWithInstance = deleteWithInstance;
            Description = description;
            Iops = iops;
            Name = name;
            PerformanceLevel = performanceLevel;
            Size = size;
        }
    }
}
