// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms
{
    public static class GetRemoteWrites
    {
        /// <summary>
        /// This data source provides the Arms Remote Writes of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.204.0+.
        /// </summary>
        public static Task<GetRemoteWritesResult> InvokeAsync(GetRemoteWritesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRemoteWritesResult>("alicloud:arms/getRemoteWrites:getRemoteWrites", args ?? new GetRemoteWritesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Arms Remote Writes of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.204.0+.
        /// </summary>
        public static Output<GetRemoteWritesResult> Invoke(GetRemoteWritesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRemoteWritesResult>("alicloud:arms/getRemoteWrites:getRemoteWrites", args ?? new GetRemoteWritesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRemoteWritesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Prometheus instance.
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Remote Write IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Remote Write name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetRemoteWritesArgs()
        {
        }
        public static new GetRemoteWritesArgs Empty => new GetRemoteWritesArgs();
    }

    public sealed class GetRemoteWritesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Prometheus instance.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Remote Write IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Remote Write name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetRemoteWritesInvokeArgs()
        {
        }
        public static new GetRemoteWritesInvokeArgs Empty => new GetRemoteWritesInvokeArgs();
    }


    [OutputType]
    public sealed class GetRemoteWritesResult
    {
        /// <summary>
        /// The ID of the Prometheus instance.
        /// </summary>
        public readonly string ClusterId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Remote Write names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of Remote Writes. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRemoteWritesRemoteWriteResult> RemoteWrites;

        [OutputConstructor]
        private GetRemoteWritesResult(
            string clusterId,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetRemoteWritesRemoteWriteResult> remoteWrites)
        {
            ClusterId = clusterId;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            RemoteWrites = remoteWrites;
        }
    }
}
