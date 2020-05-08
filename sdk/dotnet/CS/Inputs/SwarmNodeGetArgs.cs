// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class SwarmNodeGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Elastic IP address of node.
        /// </summary>
        [Input("eip")]
        public Input<string>? Eip { get; set; }

        /// <summary>
        /// ID of the node.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The container cluster's name. It is the only in one Alicloud account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The private IP address of node.
        /// </summary>
        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        /// <summary>
        /// The node current status. It is different with instance status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public SwarmNodeGetArgs()
        {
        }
    }
}