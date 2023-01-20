// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess.Inputs
{

    public sealed class EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPathGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The content of the configuration file. Maximum size: 32 KB.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// The relative file path.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        public EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPathGetArgs()
        {
        }
        public static new EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPathGetArgs Empty => new EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPathGetArgs();
    }
}
