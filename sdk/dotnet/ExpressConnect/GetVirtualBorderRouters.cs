// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ExpressConnect
{
    public static class GetVirtualBorderRouters
    {
        /// <summary>
        /// This data source provides the Express Connect Virtual Border Routers of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///         var ids = Output.Create(AliCloud.ExpressConnect.GetVirtualBorderRouters.InvokeAsync());
        ///         this.ExpressConnectVirtualBorderRouterId1 = ids.Apply(ids =&gt; ids.Routers?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.ExpressConnect.GetVirtualBorderRouters.InvokeAsync(new AliCloud.ExpressConnect.GetVirtualBorderRoutersArgs
        ///         {
        ///             NameRegex = "^my-VirtualBorderRouter",
        ///         }));
        ///         this.ExpressConnectVirtualBorderRouterId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Routers?[0]?.Id);
        ///         var filter = Output.Create(AliCloud.ExpressConnect.GetVirtualBorderRouters.InvokeAsync(new AliCloud.ExpressConnect.GetVirtualBorderRoutersArgs
        ///         {
        ///             Filters = 
        ///             {
        ///                 new AliCloud.ExpressConnect.Inputs.GetVirtualBorderRoutersFilterArgs
        ///                 {
        ///                     Key = "PhysicalConnectionId",
        ///                     Values = 
        ///                     {
        ///                         "pc-xxxx1",
        ///                     },
        ///                 },
        ///                 new AliCloud.ExpressConnect.Inputs.GetVirtualBorderRoutersFilterArgs
        ///                 {
        ///                     Key = "VbrId",
        ///                     Values = 
        ///                     {
        ///                         "vbr-xxxx1",
        ///                         "vbr-xxxx2",
        ///                     },
        ///                 },
        ///             },
        ///         }));
        ///         this.ExpressConnectVirtualBorderRouterId3 = filter.Apply(filter =&gt; filter.Routers?[0]?.Id);
        ///     }
        /// 
        ///     [Output("expressConnectVirtualBorderRouterId1")]
        ///     public Output&lt;string&gt; ExpressConnectVirtualBorderRouterId1 { get; set; }
        ///     [Output("expressConnectVirtualBorderRouterId2")]
        ///     public Output&lt;string&gt; ExpressConnectVirtualBorderRouterId2 { get; set; }
        ///     [Output("expressConnectVirtualBorderRouterId3")]
        ///     public Output&lt;string&gt; ExpressConnectVirtualBorderRouterId3 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVirtualBorderRoutersResult> InvokeAsync(GetVirtualBorderRoutersArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetVirtualBorderRoutersResult>("alicloud:expressconnect/getVirtualBorderRouters:getVirtualBorderRouters", args ?? new GetVirtualBorderRoutersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Express Connect Virtual Border Routers of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///         var ids = Output.Create(AliCloud.ExpressConnect.GetVirtualBorderRouters.InvokeAsync());
        ///         this.ExpressConnectVirtualBorderRouterId1 = ids.Apply(ids =&gt; ids.Routers?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.ExpressConnect.GetVirtualBorderRouters.InvokeAsync(new AliCloud.ExpressConnect.GetVirtualBorderRoutersArgs
        ///         {
        ///             NameRegex = "^my-VirtualBorderRouter",
        ///         }));
        ///         this.ExpressConnectVirtualBorderRouterId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Routers?[0]?.Id);
        ///         var filter = Output.Create(AliCloud.ExpressConnect.GetVirtualBorderRouters.InvokeAsync(new AliCloud.ExpressConnect.GetVirtualBorderRoutersArgs
        ///         {
        ///             Filters = 
        ///             {
        ///                 new AliCloud.ExpressConnect.Inputs.GetVirtualBorderRoutersFilterArgs
        ///                 {
        ///                     Key = "PhysicalConnectionId",
        ///                     Values = 
        ///                     {
        ///                         "pc-xxxx1",
        ///                     },
        ///                 },
        ///                 new AliCloud.ExpressConnect.Inputs.GetVirtualBorderRoutersFilterArgs
        ///                 {
        ///                     Key = "VbrId",
        ///                     Values = 
        ///                     {
        ///                         "vbr-xxxx1",
        ///                         "vbr-xxxx2",
        ///                     },
        ///                 },
        ///             },
        ///         }));
        ///         this.ExpressConnectVirtualBorderRouterId3 = filter.Apply(filter =&gt; filter.Routers?[0]?.Id);
        ///     }
        /// 
        ///     [Output("expressConnectVirtualBorderRouterId1")]
        ///     public Output&lt;string&gt; ExpressConnectVirtualBorderRouterId1 { get; set; }
        ///     [Output("expressConnectVirtualBorderRouterId2")]
        ///     public Output&lt;string&gt; ExpressConnectVirtualBorderRouterId2 { get; set; }
        ///     [Output("expressConnectVirtualBorderRouterId3")]
        ///     public Output&lt;string&gt; ExpressConnectVirtualBorderRouterId3 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVirtualBorderRoutersResult> Invoke(GetVirtualBorderRoutersInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetVirtualBorderRoutersResult>("alicloud:expressconnect/getVirtualBorderRouters:getVirtualBorderRouters", args ?? new GetVirtualBorderRoutersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVirtualBorderRoutersArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetVirtualBorderRoutersFilterArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public List<Inputs.GetVirtualBorderRoutersFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetVirtualBorderRoutersFilterArgs>());
            set => _filters = value;
        }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Virtual Border Router IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Virtual Border Router name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The VBR state.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetVirtualBorderRoutersArgs()
        {
        }
    }

    public sealed class GetVirtualBorderRoutersInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetVirtualBorderRoutersFilterInputArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public InputList<Inputs.GetVirtualBorderRoutersFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetVirtualBorderRoutersFilterInputArgs>());
            set => _filters = value;
        }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Virtual Border Router IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Virtual Border Router name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The VBR state.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetVirtualBorderRoutersInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetVirtualBorderRoutersResult
    {
        public readonly ImmutableArray<Outputs.GetVirtualBorderRoutersFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetVirtualBorderRoutersRouterResult> Routers;
        public readonly string? Status;

        [OutputConstructor]
        private GetVirtualBorderRoutersResult(
            ImmutableArray<Outputs.GetVirtualBorderRoutersFilterResult> filters,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetVirtualBorderRoutersRouterResult> routers,

            string? status)
        {
            Filters = filters;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Routers = routers;
            Status = status;
        }
    }
}
