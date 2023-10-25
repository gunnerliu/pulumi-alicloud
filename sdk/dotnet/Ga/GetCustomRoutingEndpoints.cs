// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    public static class GetCustomRoutingEndpoints
    {
        /// <summary>
        /// This data source provides the Global Accelerator (GA) Custom Routing Endpoints of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in 1.197.0+
        /// </summary>
        public static Task<GetCustomRoutingEndpointsResult> InvokeAsync(GetCustomRoutingEndpointsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCustomRoutingEndpointsResult>("alicloud:ga/getCustomRoutingEndpoints:getCustomRoutingEndpoints", args ?? new GetCustomRoutingEndpointsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Global Accelerator (GA) Custom Routing Endpoints of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in 1.197.0+
        /// </summary>
        public static Output<GetCustomRoutingEndpointsResult> Invoke(GetCustomRoutingEndpointsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomRoutingEndpointsResult>("alicloud:ga/getCustomRoutingEndpoints:getCustomRoutingEndpoints", args ?? new GetCustomRoutingEndpointsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCustomRoutingEndpointsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the GA instance.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public string AcceleratorId { get; set; } = null!;

        /// <summary>
        /// The ID of the endpoint group.
        /// </summary>
        [Input("endpointGroupId")]
        public string? EndpointGroupId { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Custom Routing Endpoint IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the custom routing listener.
        /// </summary>
        [Input("listenerId")]
        public string? ListenerId { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        public GetCustomRoutingEndpointsArgs()
        {
        }
        public static new GetCustomRoutingEndpointsArgs Empty => new GetCustomRoutingEndpointsArgs();
    }

    public sealed class GetCustomRoutingEndpointsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the GA instance.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public Input<string> AcceleratorId { get; set; } = null!;

        /// <summary>
        /// The ID of the endpoint group.
        /// </summary>
        [Input("endpointGroupId")]
        public Input<string>? EndpointGroupId { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Custom Routing Endpoint IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the custom routing listener.
        /// </summary>
        [Input("listenerId")]
        public Input<string>? ListenerId { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        public GetCustomRoutingEndpointsInvokeArgs()
        {
        }
        public static new GetCustomRoutingEndpointsInvokeArgs Empty => new GetCustomRoutingEndpointsInvokeArgs();
    }


    [OutputType]
    public sealed class GetCustomRoutingEndpointsResult
    {
        /// <summary>
        /// The ID of the GA instance with which the endpoint is associated.
        /// </summary>
        public readonly string AcceleratorId;
        /// <summary>
        /// A list of Custom Routing Endpoints. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCustomRoutingEndpointsCustomRoutingEndpointResult> CustomRoutingEndpoints;
        /// <summary>
        /// The ID of the Custom Routing Endpoint Group.
        /// </summary>
        public readonly string? EndpointGroupId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The ID of the listener with which the endpoint is associated.
        /// </summary>
        public readonly string? ListenerId;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;

        [OutputConstructor]
        private GetCustomRoutingEndpointsResult(
            string acceleratorId,

            ImmutableArray<Outputs.GetCustomRoutingEndpointsCustomRoutingEndpointResult> customRoutingEndpoints,

            string? endpointGroupId,

            string id,

            ImmutableArray<string> ids,

            string? listenerId,

            string? outputFile,

            int? pageNumber,

            int? pageSize)
        {
            AcceleratorId = acceleratorId;
            CustomRoutingEndpoints = customRoutingEndpoints;
            EndpointGroupId = endpointGroupId;
            Id = id;
            Ids = ids;
            ListenerId = listenerId;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
        }
    }
}
