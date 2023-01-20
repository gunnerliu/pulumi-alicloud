// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Inputs
{

    public sealed class ServiceMeshNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// The list of Virtual Switch.
        /// </summary>
        [Input("vswitcheList", required: true)]
        public Input<string> VswitcheList { get; set; } = null!;

        public ServiceMeshNetworkArgs()
        {
        }
        public static new ServiceMeshNetworkArgs Empty => new ServiceMeshNetworkArgs();
    }
}
