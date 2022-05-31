// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Inputs
{

    public sealed class ServiceMeshExtraConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the Kubernetes API of clusters on the data plane is used to access Istio resources. A value of `true` indicates that the Kubernetes API is used.
        /// </summary>
        [Input("crAggregationEnabled")]
        public Input<bool>? CrAggregationEnabled { get; set; }

        public ServiceMeshExtraConfigurationArgs()
        {
        }
    }
}
