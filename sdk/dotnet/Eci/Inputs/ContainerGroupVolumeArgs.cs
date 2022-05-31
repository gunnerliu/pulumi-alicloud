// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Inputs
{

    public sealed class ContainerGroupVolumeArgs : Pulumi.ResourceArgs
    {
        [Input("configFileVolumeConfigFileToPaths")]
        private InputList<Inputs.ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs>? _configFileVolumeConfigFileToPaths;

        /// <summary>
        /// ConfigFileVolumeConfigFileToPaths.
        /// </summary>
        public InputList<Inputs.ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs> ConfigFileVolumeConfigFileToPaths
        {
            get => _configFileVolumeConfigFileToPaths ?? (_configFileVolumeConfigFileToPaths = new InputList<Inputs.ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs>());
            set => _configFileVolumeConfigFileToPaths = value;
        }

        /// <summary>
        /// The ID of DiskVolume.
        /// </summary>
        [Input("diskVolumeDiskId")]
        public Input<string>? DiskVolumeDiskId { get; set; }

        /// <summary>
        /// The system type of DiskVolume.
        /// </summary>
        [Input("diskVolumeFsType")]
        public Input<string>? DiskVolumeFsType { get; set; }

        /// <summary>
        /// The name of the FlexVolume driver.
        /// </summary>
        [Input("flexVolumeDriver")]
        public Input<string>? FlexVolumeDriver { get; set; }

        /// <summary>
        /// The type of the mounted file system. The default value is determined by the script of FlexVolume.
        /// </summary>
        [Input("flexVolumeFsType")]
        public Input<string>? FlexVolumeFsType { get; set; }

        /// <summary>
        /// The list of FlexVolume objects. Each object is a key-value pair contained in a JSON string.
        /// </summary>
        [Input("flexVolumeOptions")]
        public Input<string>? FlexVolumeOptions { get; set; }

        /// <summary>
        /// The name of the security context that the container group runs.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The path to the NFS volume.
        /// </summary>
        [Input("nfsVolumePath")]
        public Input<string>? NfsVolumePath { get; set; }

        /// <summary>
        /// The nfs volume read only. Default to `false`.
        /// </summary>
        [Input("nfsVolumeReadOnly")]
        public Input<bool>? NfsVolumeReadOnly { get; set; }

        /// <summary>
        /// The address of the NFS server.
        /// </summary>
        [Input("nfsVolumeServer")]
        public Input<string>? NfsVolumeServer { get; set; }

        /// <summary>
        /// The type of the volume.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ContainerGroupVolumeArgs()
        {
        }
    }
}
