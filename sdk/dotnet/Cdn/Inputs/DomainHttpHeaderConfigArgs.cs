// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cdn.Inputs
{

    public sealed class DomainHttpHeaderConfigArgs : Pulumi.ResourceArgs
    {
        [Input("headerId")]
        public Input<string>? HeaderId { get; set; }

        /// <summary>
        /// Header key of the http header. Valid values are `Content-Type`, `Cache-Control`, `Content-Disposition`, `Content-Language`，`Expires`, `Access-Control-Allow-Origin`, `Access-Control-Allow-Methods` and `Access-Control-Max-Age`.
        /// </summary>
        [Input("headerKey", required: true)]
        public Input<string> HeaderKey { get; set; } = null!;

        /// <summary>
        /// Header value of the http header.
        /// </summary>
        [Input("headerValue", required: true)]
        public Input<string> HeaderValue { get; set; } = null!;

        public DomainHttpHeaderConfigArgs()
        {
        }
    }
}
