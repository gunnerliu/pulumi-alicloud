// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ExpressConnect
{
    public static class GetRouterInterfaces
    {
        /// <summary>
        /// This data source provides Router Interface available to the user.[What is Router Interface](https://www.alibabacloud.com/help/en/express-connect/developer-reference/api-vpc-2016-04-28-describerouterinterfaces-efficiency-channels)
        /// 
        /// &gt; **NOTE:** Available in 1.199.0+
        /// </summary>
        public static Task<GetRouterInterfacesResult> InvokeAsync(GetRouterInterfacesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRouterInterfacesResult>("alicloud:expressconnect/getRouterInterfaces:getRouterInterfaces", args ?? new GetRouterInterfacesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Router Interface available to the user.[What is Router Interface](https://www.alibabacloud.com/help/en/express-connect/developer-reference/api-vpc-2016-04-28-describerouterinterfaces-efficiency-channels)
        /// 
        /// &gt; **NOTE:** Available in 1.199.0+
        /// </summary>
        public static Output<GetRouterInterfacesResult> Invoke(GetRouterInterfacesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRouterInterfacesResult>("alicloud:expressconnect/getRouterInterfaces:getRouterInterfaces", args ?? new GetRouterInterfacesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRouterInterfacesArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetRouterInterfacesFilterArgs>? _filters;
        public List<Inputs.GetRouterInterfacesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetRouterInterfacesFilterArgs>());
            set => _filters = value;
        }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Router Interface IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Does it contain renewal data. Valid values: `true`, `false`.
        /// </summary>
        [Input("includeReservationData")]
        public string? IncludeReservationData { get; set; }

        /// <summary>
        /// A regex string to filter results by Group Metric Rule name.
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

        public GetRouterInterfacesArgs()
        {
        }
        public static new GetRouterInterfacesArgs Empty => new GetRouterInterfacesArgs();
    }

    public sealed class GetRouterInterfacesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetRouterInterfacesFilterInputArgs>? _filters;
        public InputList<Inputs.GetRouterInterfacesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetRouterInterfacesFilterInputArgs>());
            set => _filters = value;
        }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Router Interface IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Does it contain renewal data. Valid values: `true`, `false`.
        /// </summary>
        [Input("includeReservationData")]
        public Input<string>? IncludeReservationData { get; set; }

        /// <summary>
        /// A regex string to filter results by Group Metric Rule name.
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

        public GetRouterInterfacesInvokeArgs()
        {
        }
        public static new GetRouterInterfacesInvokeArgs Empty => new GetRouterInterfacesInvokeArgs();
    }


    [OutputType]
    public sealed class GetRouterInterfacesResult
    {
        public readonly ImmutableArray<Outputs.GetRouterInterfacesFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Router Interface IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? IncludeReservationData;
        /// <summary>
        /// A list of Router Interface Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRouterInterfacesInterfaceResult> Interfaces;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of name of Router Interfaces.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;

        [OutputConstructor]
        private GetRouterInterfacesResult(
            ImmutableArray<Outputs.GetRouterInterfacesFilterResult> filters,

            string id,

            ImmutableArray<string> ids,

            string? includeReservationData,

            ImmutableArray<Outputs.GetRouterInterfacesInterfaceResult> interfaces,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? pageNumber,

            int? pageSize)
        {
            Filters = filters;
            Id = id;
            Ids = ids;
            IncludeReservationData = includeReservationData;
            Interfaces = interfaces;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
        }
    }
}
