// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    public static class GetCustomRoutingEndpointGroups
    {
        /// <summary>
        /// This data source provides the Global Accelerator (GA) Custom Routing Endpoint Groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in 1.197.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Ga.GetCustomRoutingEndpointGroups.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         AcceleratorId = "your_accelerator_id",
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Ga.GetCustomRoutingEndpointGroups.Invoke(new()
        ///     {
        ///         NameRegex = "tf-example",
        ///         AcceleratorId = "your_accelerator_id",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["gaCustomRoutingEndpointGroupsId1"] = ids.Apply(getCustomRoutingEndpointGroupsResult =&gt; getCustomRoutingEndpointGroupsResult.Groups[0]?.Id),
        ///         ["gaCustomRoutingEndpointGroupsId2"] = nameRegex.Apply(getCustomRoutingEndpointGroupsResult =&gt; getCustomRoutingEndpointGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCustomRoutingEndpointGroupsResult> InvokeAsync(GetCustomRoutingEndpointGroupsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCustomRoutingEndpointGroupsResult>("alicloud:ga/getCustomRoutingEndpointGroups:getCustomRoutingEndpointGroups", args ?? new GetCustomRoutingEndpointGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Global Accelerator (GA) Custom Routing Endpoint Groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in 1.197.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Ga.GetCustomRoutingEndpointGroups.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         AcceleratorId = "your_accelerator_id",
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Ga.GetCustomRoutingEndpointGroups.Invoke(new()
        ///     {
        ///         NameRegex = "tf-example",
        ///         AcceleratorId = "your_accelerator_id",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["gaCustomRoutingEndpointGroupsId1"] = ids.Apply(getCustomRoutingEndpointGroupsResult =&gt; getCustomRoutingEndpointGroupsResult.Groups[0]?.Id),
        ///         ["gaCustomRoutingEndpointGroupsId2"] = nameRegex.Apply(getCustomRoutingEndpointGroupsResult =&gt; getCustomRoutingEndpointGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCustomRoutingEndpointGroupsResult> Invoke(GetCustomRoutingEndpointGroupsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomRoutingEndpointGroupsResult>("alicloud:ga/getCustomRoutingEndpointGroups:getCustomRoutingEndpointGroups", args ?? new GetCustomRoutingEndpointGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCustomRoutingEndpointGroupsArgs : global::Pulumi.InvokeArgs
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
        /// A list of Custom Routing Endpoint Group IDs.
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
        /// A regex string to filter results by Custom Routing Endpoint Group name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        /// <summary>
        /// The status of the endpoint group. Valid Values: `init`, `active`, `updating`, `deleting`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetCustomRoutingEndpointGroupsArgs()
        {
        }
        public static new GetCustomRoutingEndpointGroupsArgs Empty => new GetCustomRoutingEndpointGroupsArgs();
    }

    public sealed class GetCustomRoutingEndpointGroupsInvokeArgs : global::Pulumi.InvokeArgs
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
        /// A list of Custom Routing Endpoint Group IDs.
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
        /// A regex string to filter results by Custom Routing Endpoint Group name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        /// <summary>
        /// The status of the endpoint group. Valid Values: `init`, `active`, `updating`, `deleting`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetCustomRoutingEndpointGroupsInvokeArgs()
        {
        }
        public static new GetCustomRoutingEndpointGroupsInvokeArgs Empty => new GetCustomRoutingEndpointGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetCustomRoutingEndpointGroupsResult
    {
        /// <summary>
        /// The ID of the GA instance.
        /// </summary>
        public readonly string AcceleratorId;
        /// <summary>
        /// The ID of the Custom Routing Endpoint Group.
        /// </summary>
        public readonly string? EndpointGroupId;
        /// <summary>
        /// A list of Custom Routing Endpoint Groups. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCustomRoutingEndpointGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The ID of the custom routing listener.
        /// </summary>
        public readonly string? ListenerId;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Custom Routing Endpoint Group names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        /// <summary>
        /// The status of the endpoint group.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetCustomRoutingEndpointGroupsResult(
            string acceleratorId,

            string? endpointGroupId,

            ImmutableArray<Outputs.GetCustomRoutingEndpointGroupsGroupResult> groups,

            string id,

            ImmutableArray<string> ids,

            string? listenerId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? status)
        {
            AcceleratorId = acceleratorId;
            EndpointGroupId = endpointGroupId;
            Groups = groups;
            Id = id;
            Ids = ids;
            ListenerId = listenerId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            Status = status;
        }
    }
}
