// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Inputs
{

    public sealed class ContainerGroupInitContainerPortGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The port number. Valid values: 1 to 65535.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Valid values: TCP and UDP.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        public ContainerGroupInitContainerPortGetArgs()
        {
        }
        public static new ContainerGroupInitContainerPortGetArgs Empty => new ContainerGroupInitContainerPortGetArgs();
    }
}
