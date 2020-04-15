// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ApiGateway.Inputs
{

    public sealed class ApiHttpServiceConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The address of backend service.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        [Input("aoneName")]
        public Input<string>? AoneName { get; set; }

        /// <summary>
        /// The http method of backend service.
        /// </summary>
        [Input("method", required: true)]
        public Input<string> Method { get; set; } = null!;

        /// <summary>
        /// The path of backend service.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// Backend service time-out time; unit: millisecond.
        /// </summary>
        [Input("timeout", required: true)]
        public Input<int> Timeout { get; set; } = null!;

        public ApiHttpServiceConfigArgs()
        {
        }
    }
}
