// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Inputs
{

    public sealed class CustomDomainRouteConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Function Compute function that requests are routed to.
        /// </summary>
        [Input("functionName", required: true)]
        public Input<string> FunctionName { get; set; } = null!;

        [Input("methods")]
        private InputList<string>? _methods;

        /// <summary>
        /// The requests of the specified HTTP methos are routed from. Valid method: GET, POST, DELETE, HEAD, PUT and PATCH. For example, "GET, HEAD" methods indicate that only requests from GET and HEAD methods are routed.
        /// 
        /// **cert_config** includes the following arguments:
        /// </summary>
        public InputList<string> Methods
        {
            get => _methods ?? (_methods = new InputList<string>());
            set => _methods = value;
        }

        /// <summary>
        /// The path that requests are routed from.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// The version or alias of the Function Compute service that requests are routed to. For example, qualifier v1 indicates that the requests are routed to the version 1 Function Compute service. For detail information about version and alias, please refer to the [developer guide](https://www.alibabacloud.com/help/doc-detail/96464.htm).
        /// </summary>
        [Input("qualifier")]
        public Input<string>? Qualifier { get; set; }

        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public CustomDomainRouteConfigArgs()
        {
        }
        public static new CustomDomainRouteConfigArgs Empty => new CustomDomainRouteConfigArgs();
    }
}
