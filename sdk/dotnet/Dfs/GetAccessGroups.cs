// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dfs
{
    public static class GetAccessGroups
    {
        /// <summary>
        /// This data source provides the Apsara File Storage for HDFS Access Groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
        /// </summary>
        public static Task<GetAccessGroupsResult> InvokeAsync(GetAccessGroupsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccessGroupsResult>("alicloud:dfs/getAccessGroups:getAccessGroups", args ?? new GetAccessGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Apsara File Storage for HDFS Access Groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
        /// </summary>
        public static Output<GetAccessGroupsResult> Invoke(GetAccessGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccessGroupsResult>("alicloud:dfs/getAccessGroups:getAccessGroups", args ?? new GetAccessGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccessGroupsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Access Group IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("limit")]
        public int? Limit { get; set; }

        /// <summary>
        /// A regex string to filter results by Access Group name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("orderBy")]
        public string? OrderBy { get; set; }

        [Input("orderType")]
        public string? OrderType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("startOffset")]
        public int? StartOffset { get; set; }

        public GetAccessGroupsArgs()
        {
        }
        public static new GetAccessGroupsArgs Empty => new GetAccessGroupsArgs();
    }

    public sealed class GetAccessGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Access Group IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// A regex string to filter results by Access Group name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("orderBy")]
        public Input<string>? OrderBy { get; set; }

        [Input("orderType")]
        public Input<string>? OrderType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("startOffset")]
        public Input<int>? StartOffset { get; set; }

        public GetAccessGroupsInvokeArgs()
        {
        }
        public static new GetAccessGroupsInvokeArgs Empty => new GetAccessGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccessGroupsResult
    {
        public readonly ImmutableArray<Outputs.GetAccessGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly int? Limit;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OrderBy;
        public readonly string? OrderType;
        public readonly string? OutputFile;
        public readonly int? StartOffset;

        [OutputConstructor]
        private GetAccessGroupsResult(
            ImmutableArray<Outputs.GetAccessGroupsGroupResult> groups,

            string id,

            ImmutableArray<string> ids,

            int? limit,

            string? nameRegex,

            ImmutableArray<string> names,

            string? orderBy,

            string? orderType,

            string? outputFile,

            int? startOffset)
        {
            Groups = groups;
            Id = id;
            Ids = ids;
            Limit = limit;
            NameRegex = nameRegex;
            Names = names;
            OrderBy = orderBy;
            OrderType = orderType;
            OutputFile = outputFile;
            StartOffset = startOffset;
        }
    }
}
