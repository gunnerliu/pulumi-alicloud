// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager
{
    public static class GetSharedResources
    {
        /// <summary>
        /// This data source provides the Resource Manager Shared Resources of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.111.0+.
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
        ///         var @this = Output.Create(AliCloud.ResourceManager.GetSharedResources.InvokeAsync(new AliCloud.ResourceManager.GetSharedResourcesArgs
        ///         {
        ///             ResourceShareId = "rs-V2NV******",
        ///             Ids = 
        ///             {
        ///                 "vsw-bp1mzouzpmvie********:VSwitch",
        ///             },
        ///         }));
        ///         this.FirstResourceManagerSharedResourceId = data.Alicloud_resource_manager_shared_resources.Example.Resources[0].Id;
        ///     }
        /// 
        ///     [Output("firstResourceManagerSharedResourceId")]
        ///     public Output&lt;string&gt; FirstResourceManagerSharedResourceId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSharedResourcesResult> InvokeAsync(GetSharedResourcesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSharedResourcesResult>("alicloud:resourcemanager/getSharedResources:getSharedResources", args ?? new GetSharedResourcesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Resource Manager Shared Resources of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.111.0+.
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
        ///         var @this = Output.Create(AliCloud.ResourceManager.GetSharedResources.InvokeAsync(new AliCloud.ResourceManager.GetSharedResourcesArgs
        ///         {
        ///             ResourceShareId = "rs-V2NV******",
        ///             Ids = 
        ///             {
        ///                 "vsw-bp1mzouzpmvie********:VSwitch",
        ///             },
        ///         }));
        ///         this.FirstResourceManagerSharedResourceId = data.Alicloud_resource_manager_shared_resources.Example.Resources[0].Id;
        ///     }
        /// 
        ///     [Output("firstResourceManagerSharedResourceId")]
        ///     public Output&lt;string&gt; FirstResourceManagerSharedResourceId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSharedResourcesResult> Invoke(GetSharedResourcesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetSharedResourcesResult>("alicloud:resourcemanager/getSharedResources:getSharedResources", args ?? new GetSharedResourcesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSharedResourcesArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of shared resource ID.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The resource share ID of resource manager.
        /// </summary>
        [Input("resourceShareId")]
        public string? ResourceShareId { get; set; }

        /// <summary>
        /// The status of shared resource.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetSharedResourcesArgs()
        {
        }
    }

    public sealed class GetSharedResourcesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of shared resource ID.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The resource share ID of resource manager.
        /// </summary>
        [Input("resourceShareId")]
        public Input<string>? ResourceShareId { get; set; }

        /// <summary>
        /// The status of shared resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetSharedResourcesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetSharedResourcesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly string? ResourceShareId;
        public readonly ImmutableArray<Outputs.GetSharedResourcesResourceResult> Resources;
        public readonly string? Status;

        [OutputConstructor]
        private GetSharedResourcesResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string? resourceShareId,

            ImmutableArray<Outputs.GetSharedResourcesResourceResult> resources,

            string? status)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            ResourceShareId = resourceShareId;
            Resources = resources;
            Status = status;
        }
    }
}
