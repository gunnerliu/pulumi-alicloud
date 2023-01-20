// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Inputs
{

    public sealed class ContainerGroupContainerLivenessProbeHttpGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The relative file path.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The port number. Valid values: 1 to 65535.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The protocol type corresponding to the HTTP Get request when using the HTTP request method for health checks. Valid values: `HTTP`, `HTTPS`.
        /// </summary>
        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        public ContainerGroupContainerLivenessProbeHttpGetArgs()
        {
        }
        public static new ContainerGroupContainerLivenessProbeHttpGetArgs Empty => new ContainerGroupContainerLivenessProbeHttpGetArgs();
    }
}
