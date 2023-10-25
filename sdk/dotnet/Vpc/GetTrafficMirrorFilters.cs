// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetTrafficMirrorFilters
    {
        /// <summary>
        /// This data source provides the Vpc Traffic Mirror Filters of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
        /// </summary>
        public static Task<GetTrafficMirrorFiltersResult> InvokeAsync(GetTrafficMirrorFiltersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTrafficMirrorFiltersResult>("alicloud:vpc/getTrafficMirrorFilters:getTrafficMirrorFilters", args ?? new GetTrafficMirrorFiltersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Vpc Traffic Mirror Filters of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
        /// </summary>
        public static Output<GetTrafficMirrorFiltersResult> Invoke(GetTrafficMirrorFiltersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTrafficMirrorFiltersResult>("alicloud:vpc/getTrafficMirrorFilters:getTrafficMirrorFilters", args ?? new GetTrafficMirrorFiltersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTrafficMirrorFiltersArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Traffic Mirror Filter IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Traffic Mirror Filter name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The state of the filter. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`. `Creating`: The filter is being created. `Created`: The filter is created. `Modifying`: The filter is being modified. `Deleting`: The filter is being deleted.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// The name of the filter.
        /// </summary>
        [Input("trafficMirrorFilterName")]
        public string? TrafficMirrorFilterName { get; set; }

        public GetTrafficMirrorFiltersArgs()
        {
        }
        public static new GetTrafficMirrorFiltersArgs Empty => new GetTrafficMirrorFiltersArgs();
    }

    public sealed class GetTrafficMirrorFiltersInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Traffic Mirror Filter IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Traffic Mirror Filter name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The state of the filter. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`. `Creating`: The filter is being created. `Created`: The filter is created. `Modifying`: The filter is being modified. `Deleting`: The filter is being deleted.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The name of the filter.
        /// </summary>
        [Input("trafficMirrorFilterName")]
        public Input<string>? TrafficMirrorFilterName { get; set; }

        public GetTrafficMirrorFiltersInvokeArgs()
        {
        }
        public static new GetTrafficMirrorFiltersInvokeArgs Empty => new GetTrafficMirrorFiltersInvokeArgs();
    }


    [OutputType]
    public sealed class GetTrafficMirrorFiltersResult
    {
        public readonly ImmutableArray<Outputs.GetTrafficMirrorFiltersFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? Status;
        public readonly string? TrafficMirrorFilterName;

        [OutputConstructor]
        private GetTrafficMirrorFiltersResult(
            ImmutableArray<Outputs.GetTrafficMirrorFiltersFilterResult> filters,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status,

            string? trafficMirrorFilterName)
        {
            Filters = filters;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
            TrafficMirrorFilterName = trafficMirrorFilterName;
        }
    }
}
