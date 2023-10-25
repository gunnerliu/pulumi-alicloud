// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CR
{
    public static class GetNamespaces
    {
        /// <summary>
        /// This data source provides a list Container Registry namespaces on Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.35.0+
        /// </summary>
        public static Task<GetNamespacesResult> InvokeAsync(GetNamespacesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNamespacesResult>("alicloud:cr/getNamespaces:getNamespaces", args ?? new GetNamespacesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list Container Registry namespaces on Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.35.0+
        /// </summary>
        public static Output<GetNamespacesResult> Invoke(GetNamespacesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNamespacesResult>("alicloud:cr/getNamespaces:getNamespaces", args ?? new GetNamespacesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNamespacesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A regex string to filter results by namespace name.
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
        /// <summary>
        /// A regex string to filter results by namespace name.
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
        /// <summary>
        /// A list of matched Container Registry namespaces. Its element is a namespace name.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of namespace names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        /// <summary>
        /// A list of matched Container Registry namespaces. Each element contains the following attributes:
        /// </summary>
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
