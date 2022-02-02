// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb
{
    public static class GetListeners
    {
        /// <summary>
        /// This data source provides the Application Load Balancer (ALB) Listeners of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
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
        ///         var ids = Output.Create(AliCloud.Alb.GetListeners.InvokeAsync(new AliCloud.Alb.GetListenersArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.AlbListenerId1 = ids.Apply(ids =&gt; ids.Listeners?[0]?.Id);
        ///     }
        /// 
        ///     [Output("albListenerId1")]
        ///     public Output&lt;string&gt; AlbListenerId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetListenersResult> InvokeAsync(GetListenersArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetListenersResult>("alicloud:alb/getListeners:getListeners", args ?? new GetListenersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Application Load Balancer (ALB) Listeners of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
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
        ///         var ids = Output.Create(AliCloud.Alb.GetListeners.InvokeAsync(new AliCloud.Alb.GetListenersArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.AlbListenerId1 = ids.Apply(ids =&gt; ids.Listeners?[0]?.Id);
        ///     }
        /// 
        ///     [Output("albListenerId1")]
        ///     public Output&lt;string&gt; AlbListenerId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetListenersResult> Invoke(GetListenersInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetListenersResult>("alicloud:alb/getListeners:getListeners", args ?? new GetListenersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetListenersArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Listener IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("listenerIds")]
        private List<string>? _listenerIds;

        /// <summary>
        /// The listener ids.
        /// </summary>
        public List<string> ListenerIds
        {
            get => _listenerIds ?? (_listenerIds = new List<string>());
            set => _listenerIds = value;
        }

        /// <summary>
        /// Snooping Protocols. Valid Values: `HTTP`, `HTTPS` Or `QUIC`.
        /// </summary>
        [Input("listenerProtocol")]
        public string? ListenerProtocol { get; set; }

        [Input("loadBalancerIds")]
        private List<string>? _loadBalancerIds;

        /// <summary>
        /// The load balancer ids.
        /// </summary>
        public List<string> LoadBalancerIds
        {
            get => _loadBalancerIds ?? (_loadBalancerIds = new List<string>());
            set => _loadBalancerIds = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The association status between the ACL and the listener.  Valid values: `Associating`, `Associated` Or `Dissociating`. `Associating`: The ACL is being associated with the listener. `Associated`: The ACL is associated with the listener. `Dissociating`: The ACL is being disassociated from the listener.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetListenersArgs()
        {
        }
    }

    public sealed class GetListenersInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Listener IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("listenerIds")]
        private InputList<string>? _listenerIds;

        /// <summary>
        /// The listener ids.
        /// </summary>
        public InputList<string> ListenerIds
        {
            get => _listenerIds ?? (_listenerIds = new InputList<string>());
            set => _listenerIds = value;
        }

        /// <summary>
        /// Snooping Protocols. Valid Values: `HTTP`, `HTTPS` Or `QUIC`.
        /// </summary>
        [Input("listenerProtocol")]
        public Input<string>? ListenerProtocol { get; set; }

        [Input("loadBalancerIds")]
        private InputList<string>? _loadBalancerIds;

        /// <summary>
        /// The load balancer ids.
        /// </summary>
        public InputList<string> LoadBalancerIds
        {
            get => _loadBalancerIds ?? (_loadBalancerIds = new InputList<string>());
            set => _loadBalancerIds = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The association status between the ACL and the listener.  Valid values: `Associating`, `Associated` Or `Dissociating`. `Associating`: The ACL is being associated with the listener. `Associated`: The ACL is associated with the listener. `Dissociating`: The ACL is being disassociated from the listener.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetListenersInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetListenersResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<string> ListenerIds;
        public readonly string? ListenerProtocol;
        public readonly ImmutableArray<Outputs.GetListenersListenerResult> Listeners;
        public readonly ImmutableArray<string> LoadBalancerIds;
        public readonly string? OutputFile;
        public readonly string? Status;

        [OutputConstructor]
        private GetListenersResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<string> listenerIds,

            string? listenerProtocol,

            ImmutableArray<Outputs.GetListenersListenerResult> listeners,

            ImmutableArray<string> loadBalancerIds,

            string? outputFile,

            string? status)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            ListenerIds = listenerIds;
            ListenerProtocol = listenerProtocol;
            Listeners = listeners;
            LoadBalancerIds = loadBalancerIds;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
