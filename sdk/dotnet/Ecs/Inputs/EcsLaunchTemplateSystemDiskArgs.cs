// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Inputs
{

    public sealed class EcsLaunchTemplateSystemDiskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The category of the disk.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Indicates whether the data disk is released with the instance.
        /// </summary>
        [Input("deleteWithInstance")]
        public Input<bool>? DeleteWithInstance { get; set; }

        /// <summary>
        /// Description of instance launch template version 1. It can be [2, 256] characters in length. It cannot start with "http://" or "https://". The default value is null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Iops.
        /// </summary>
        [Input("iops")]
        public Input<string>? Iops { get; set; }

        /// <summary>
        /// It has been deprecated from version 1.120.0, and use field `launch_template_name` instead.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The performance level of the ESSD used as the data disk.
        /// </summary>
        [Input("performanceLevel")]
        public Input<string>? PerformanceLevel { get; set; }

        /// <summary>
        /// The size of the data disk.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        public EcsLaunchTemplateSystemDiskArgs()
        {
        }
        public static new EcsLaunchTemplateSystemDiskArgs Empty => new EcsLaunchTemplateSystemDiskArgs();
    }
}
