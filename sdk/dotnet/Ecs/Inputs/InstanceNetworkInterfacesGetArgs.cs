// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Inputs
{

    public sealed class InstanceNetworkInterfacesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the secondary ENI.
        /// </summary>
        [Input("networkInterfaceId")]
        public Input<string>? NetworkInterfaceId { get; set; }

        public InstanceNetworkInterfacesGetArgs()
        {
        }
        public static new InstanceNetworkInterfacesGetArgs Empty => new InstanceNetworkInterfacesGetArgs();
    }
}
