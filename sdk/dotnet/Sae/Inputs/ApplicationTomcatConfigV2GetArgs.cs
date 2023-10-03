// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Inputs
{

    public sealed class ApplicationTomcatConfigV2GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The path.
        /// </summary>
        [Input("contextPath")]
        public Input<string>? ContextPath { get; set; }

        /// <summary>
        /// The maximum number of connections in the connection pool.
        /// </summary>
        [Input("maxThreads")]
        public Input<int>? MaxThreads { get; set; }

        /// <summary>
        /// The port.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The URI encoding scheme in the Tomcat container.
        /// </summary>
        [Input("uriEncoding")]
        public Input<string>? UriEncoding { get; set; }

        /// <summary>
        /// Specifies whether to use the encoding scheme that is specified by BodyEncoding for URL.
        /// </summary>
        [Input("useBodyEncodingForUri")]
        public Input<string>? UseBodyEncodingForUri { get; set; }

        public ApplicationTomcatConfigV2GetArgs()
        {
        }
        public static new ApplicationTomcatConfigV2GetArgs Empty => new ApplicationTomcatConfigV2GetArgs();
    }
}
