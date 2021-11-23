// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Inputs
{

    public sealed class ServiceMeshMeshConfigProxyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CPU resource  of the limitsOPA proxy container.
        /// </summary>
        [Input("limitCpu")]
        public Input<string>? LimitCpu { get; set; }

        /// <summary>
        /// The memory resource limit of the OPA proxy container.
        /// </summary>
        [Input("limitMemory")]
        public Input<string>? LimitMemory { get; set; }

        /// <summary>
        /// The CPU resource request of the OPA proxy container.
        /// </summary>
        [Input("requestCpu")]
        public Input<string>? RequestCpu { get; set; }

        /// <summary>
        /// The memory resource request of the OPA proxy container.
        /// </summary>
        [Input("requestMemory")]
        public Input<string>? RequestMemory { get; set; }

        public ServiceMeshMeshConfigProxyArgs()
        {
        }
    }
}