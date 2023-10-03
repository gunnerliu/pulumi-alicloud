// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess.Inputs
{

    public sealed class EciScalingConfigurationInitContainerVolumeMountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The directory of the mounted volume. Data under this directory will be overwritten by the
        /// data in the volume.
        /// </summary>
        [Input("mountPath")]
        public Input<string>? MountPath { get; set; }

        /// <summary>
        /// The name of the mounted volume.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Default to `false`.
        /// </summary>
        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        public EciScalingConfigurationInitContainerVolumeMountArgs()
        {
        }
        public static new EciScalingConfigurationInitContainerVolumeMountArgs Empty => new EciScalingConfigurationInitContainerVolumeMountArgs();
    }
}
