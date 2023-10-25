// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Mse
{
    public static class GetZnodes
    {
        /// <summary>
        /// This data source provides the Mse Znodes of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.162.0+.
        /// </summary>
        public static Task<GetZnodesResult> InvokeAsync(GetZnodesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZnodesResult>("alicloud:mse/getZnodes:getZnodes", args ?? new GetZnodesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Mse Znodes of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.162.0+.
        /// </summary>
        public static Output<GetZnodesResult> Invoke(GetZnodesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZnodesResult>("alicloud:mse/getZnodes:getZnodes", args ?? new GetZnodesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZnodesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The language type of the returned information. Valid values: `zh` or `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public string? AcceptLanguage { get; set; }

        /// <summary>
        /// The ID of the Cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Znode IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Znode name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Node path.
        /// </summary>
        [Input("path", required: true)]
        public string Path { get; set; } = null!;

        public GetZnodesArgs()
        {
        }
        public static new GetZnodesArgs Empty => new GetZnodesArgs();
    }

    public sealed class GetZnodesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The language type of the returned information. Valid values: `zh` or `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// The ID of the Cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Znode IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Znode name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The Node path.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        public GetZnodesInvokeArgs()
        {
        }
        public static new GetZnodesInvokeArgs Empty => new GetZnodesInvokeArgs();
    }


    [OutputType]
    public sealed class GetZnodesResult
    {
        public readonly string? AcceptLanguage;
        public readonly string ClusterId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string Path;
        public readonly ImmutableArray<Outputs.GetZnodesZnodeResult> Znodes;

        [OutputConstructor]
        private GetZnodesResult(
            string? acceptLanguage,

            string clusterId,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string path,

            ImmutableArray<Outputs.GetZnodesZnodeResult> znodes)
        {
            AcceptLanguage = acceptLanguage;
            ClusterId = clusterId;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Path = path;
            Znodes = znodes;
        }
    }
}
