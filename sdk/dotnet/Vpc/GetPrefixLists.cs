// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetPrefixLists
    {
        /// <summary>
        /// This data source provides the Vpc Prefix Lists of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.182.0+.
        /// </summary>
        public static Task<GetPrefixListsResult> InvokeAsync(GetPrefixListsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrefixListsResult>("alicloud:vpc/getPrefixLists:getPrefixLists", args ?? new GetPrefixListsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Vpc Prefix Lists of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.182.0+.
        /// </summary>
        public static Output<GetPrefixListsResult> Invoke(GetPrefixListsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrefixListsResult>("alicloud:vpc/getPrefixLists:getPrefixLists", args ?? new GetPrefixListsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrefixListsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `true`. Set it to `false` can hide the `entrys` to output.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Prefix List IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Prefix List name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The name of the prefix list.
        /// </summary>
        [Input("prefixListName")]
        public string? PrefixListName { get; set; }

        public GetPrefixListsArgs()
        {
        }
        public static new GetPrefixListsArgs Empty => new GetPrefixListsArgs();
    }

    public sealed class GetPrefixListsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `true`. Set it to `false` can hide the `entrys` to output.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Prefix List IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Prefix List name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The name of the prefix list.
        /// </summary>
        [Input("prefixListName")]
        public Input<string>? PrefixListName { get; set; }

        public GetPrefixListsInvokeArgs()
        {
        }
        public static new GetPrefixListsInvokeArgs Empty => new GetPrefixListsInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrefixListsResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<Outputs.GetPrefixListsListResult> Lists;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? PrefixListName;

        [OutputConstructor]
        private GetPrefixListsResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetPrefixListsListResult> lists,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? prefixListName)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            Lists = lists;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PrefixListName = prefixListName;
        }
    }
}
