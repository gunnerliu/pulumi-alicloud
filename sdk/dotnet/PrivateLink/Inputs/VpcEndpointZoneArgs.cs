// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PrivateLink.Inputs
{

    public sealed class VpcEndpointZoneArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// To create the vswitch of the terminal node network card in the available zone.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// Availability zone corresponding to terminal node service.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public VpcEndpointZoneArgs()
        {
        }
    }
}