// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    public static class GetBasicAccelerateIpEndpointRelations
    {
        /// <summary>
        /// This data source provides the Global Accelerator (GA) Basic Accelerate Ip Endpoint Relations of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.194.0+.
        /// </summary>
        public static Task<GetBasicAccelerateIpEndpointRelationsResult> InvokeAsync(GetBasicAccelerateIpEndpointRelationsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBasicAccelerateIpEndpointRelationsResult>("alicloud:ga/getBasicAccelerateIpEndpointRelations:getBasicAccelerateIpEndpointRelations", args ?? new GetBasicAccelerateIpEndpointRelationsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Global Accelerator (GA) Basic Accelerate Ip Endpoint Relations of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.194.0+.
        /// </summary>
        public static Output<GetBasicAccelerateIpEndpointRelationsResult> Invoke(GetBasicAccelerateIpEndpointRelationsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBasicAccelerateIpEndpointRelationsResult>("alicloud:ga/getBasicAccelerateIpEndpointRelations:getBasicAccelerateIpEndpointRelations", args ?? new GetBasicAccelerateIpEndpointRelationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBasicAccelerateIpEndpointRelationsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Basic Accelerate IP.
        /// </summary>
        [Input("accelerateIpId")]
        public string? AccelerateIpId { get; set; }

        /// <summary>
        /// The ID of the Global Accelerator Basic Accelerator instance.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public string AcceleratorId { get; set; } = null!;

        /// <summary>
        /// The ID of the Basic Endpoint.
        /// </summary>
        [Input("endpointId")]
        public string? EndpointId { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Global Accelerator Basic Accelerate Ip Endpoint Relations IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the Global Accelerator Basic Accelerate Ip Endpoint Relation. Valid Value: `active`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetBasicAccelerateIpEndpointRelationsArgs()
        {
        }
        public static new GetBasicAccelerateIpEndpointRelationsArgs Empty => new GetBasicAccelerateIpEndpointRelationsArgs();
    }

    public sealed class GetBasicAccelerateIpEndpointRelationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Basic Accelerate IP.
        /// </summary>
        [Input("accelerateIpId")]
        public Input<string>? AccelerateIpId { get; set; }

        /// <summary>
        /// The ID of the Global Accelerator Basic Accelerator instance.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public Input<string> AcceleratorId { get; set; } = null!;

        /// <summary>
        /// The ID of the Basic Endpoint.
        /// </summary>
        [Input("endpointId")]
        public Input<string>? EndpointId { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Global Accelerator Basic Accelerate Ip Endpoint Relations IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the Global Accelerator Basic Accelerate Ip Endpoint Relation. Valid Value: `active`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetBasicAccelerateIpEndpointRelationsInvokeArgs()
        {
        }
        public static new GetBasicAccelerateIpEndpointRelationsInvokeArgs Empty => new GetBasicAccelerateIpEndpointRelationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetBasicAccelerateIpEndpointRelationsResult
    {
        /// <summary>
        /// The ID of the Basic Accelerate IP.
        /// </summary>
        public readonly string? AccelerateIpId;
        /// <summary>
        /// The ID of the Global Accelerator Basic Accelerator instance.
        /// </summary>
        public readonly string AcceleratorId;
        /// <summary>
        /// The ID of the Basic Endpoint.
        /// </summary>
        public readonly string? EndpointId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of Global Accelerator Basic Accelerate Ip Endpoint Relations. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBasicAccelerateIpEndpointRelationsRelationResult> Relations;
        /// <summary>
        /// The status of the Basic Accelerate Ip Endpoint Relation.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetBasicAccelerateIpEndpointRelationsResult(
            string? accelerateIpId,

            string acceleratorId,

            string? endpointId,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetBasicAccelerateIpEndpointRelationsRelationResult> relations,

            string? status)
        {
            AccelerateIpId = accelerateIpId;
            AcceleratorId = acceleratorId;
            EndpointId = endpointId;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Relations = relations;
            Status = status;
        }
    }
}
