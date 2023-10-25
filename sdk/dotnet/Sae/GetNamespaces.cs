// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae
{
    public static class GetNamespaces
    {
        /// <summary>
        /// This data source provides the Sae Namespaces of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.129.0+.
        /// </summary>
        public static Task<GetNamespacesResult> InvokeAsync(GetNamespacesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNamespacesResult>("alicloud:sae/getNamespaces:getNamespaces", args ?? new GetNamespacesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Sae Namespaces of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.129.0+.
        /// </summary>
        public static Output<GetNamespacesResult> Invoke(GetNamespacesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNamespacesResult>("alicloud:sae/getNamespaces:getNamespaces", args ?? new GetNamespacesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNamespacesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Namespace IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Namespace name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetNamespacesArgs()
        {
        }
        public static new GetNamespacesArgs Empty => new GetNamespacesArgs();
    }

    public sealed class GetNamespacesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Namespace IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Namespace name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetNamespacesInvokeArgs()
        {
        }
        public static new GetNamespacesInvokeArgs Empty => new GetNamespacesInvokeArgs();
    }


    [OutputType]
    public sealed class GetNamespacesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly ImmutableArray<Outputs.GetNamespacesNamespaceResult> Namespaces;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetNamespacesResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            ImmutableArray<Outputs.GetNamespacesNamespaceResult> namespaces,

            string? outputFile)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            Namespaces = namespaces;
            OutputFile = outputFile;
        }
    }
}
