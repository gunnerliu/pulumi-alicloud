// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms
{
    public static class GetNamespaces
    {
        /// <summary>
        /// This data source provides the Cms Namespaces of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.171.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ids = Output.Create(AliCloud.Cms.GetNamespaces.InvokeAsync(new AliCloud.Cms.GetNamespacesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.CmsNamespaceId1 = ids.Apply(ids =&gt; ids.Namespaces?[0]?.Id);
        ///     }
        /// 
        ///     [Output("cmsNamespaceId1")]
        ///     public Output&lt;string&gt; CmsNamespaceId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNamespacesResult> InvokeAsync(GetNamespacesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNamespacesResult>("alicloud:cms/getNamespaces:getNamespaces", args ?? new GetNamespacesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cms Namespaces of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.171.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ids = Output.Create(AliCloud.Cms.GetNamespaces.InvokeAsync(new AliCloud.Cms.GetNamespacesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.CmsNamespaceId1 = ids.Apply(ids =&gt; ids.Namespaces?[0]?.Id);
        ///     }
        /// 
        ///     [Output("cmsNamespaceId1")]
        ///     public Output&lt;string&gt; CmsNamespaceId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetNamespacesResult> Invoke(GetNamespacesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetNamespacesResult>("alicloud:cms/getNamespaces:getNamespaces", args ?? new GetNamespacesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNamespacesArgs : Pulumi.InvokeArgs
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
        /// The keywords of the `namespace` or `description` of the namespace.
        /// </summary>
        [Input("keyword")]
        public string? Keyword { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        public GetNamespacesArgs()
        {
        }
    }

    public sealed class GetNamespacesInvokeArgs : Pulumi.InvokeArgs
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
        /// The keywords of the `namespace` or `description` of the namespace.
        /// </summary>
        [Input("keyword")]
        public Input<string>? Keyword { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        public GetNamespacesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetNamespacesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? Keyword;
        public readonly ImmutableArray<Outputs.GetNamespacesNamespaceResult> Namespaces;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;

        [OutputConstructor]
        private GetNamespacesResult(
            string id,

            ImmutableArray<string> ids,

            string? keyword,

            ImmutableArray<Outputs.GetNamespacesNamespaceResult> namespaces,

            string? outputFile,

            int? pageNumber,

            int? pageSize)
        {
            Id = id;
            Ids = ids;
            Keyword = keyword;
            Namespaces = namespaces;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
        }
    }
}
