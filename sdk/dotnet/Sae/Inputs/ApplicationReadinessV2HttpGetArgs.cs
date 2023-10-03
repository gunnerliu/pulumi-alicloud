// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Inputs
{

    public sealed class ApplicationReadinessV2HttpGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether the response contains keywords. Valid values: `true` and `false`. If you do not set it, the advanced settings are not used.
        /// </summary>
        [Input("isContainKeyWord")]
        public Input<bool>? IsContainKeyWord { get; set; }

        /// <summary>
        /// The custom keywords.
        /// </summary>
        [Input("keyWord")]
        public Input<string>? KeyWord { get; set; }

        /// <summary>
        /// The request path.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The port.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The protocol that is used to perform the health check. Valid values: `HTTP` and `HTTPS`.
        /// </summary>
        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        public ApplicationReadinessV2HttpGetArgs()
        {
        }
        public static new ApplicationReadinessV2HttpGetArgs Empty => new ApplicationReadinessV2HttpGetArgs();
    }
}
