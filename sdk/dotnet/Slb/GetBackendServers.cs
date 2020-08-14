// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    public static class GetBackendServers
    {
        /// <summary>
        /// This data source provides the server load balancer backend servers related to a server load balancer..
        /// 
        /// &gt; **NOTE:** Available in 1.53.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var sampleDs = Output.Create(AliCloud.Slb.GetBackendServers.InvokeAsync(new AliCloud.Slb.GetBackendServersArgs
        ///         {
        ///             LoadBalancerId = alicloud_slb.Sample_slb.Id,
        ///         }));
        ///         this.FirstSlbBackendServerId = sampleDs.Apply(sampleDs =&gt; sampleDs.BackendServers[0].Id);
        ///     }
        /// 
        ///     [Output("firstSlbBackendServerId")]
        ///     public Output&lt;string&gt; FirstSlbBackendServerId { get; set; }
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetBackendServersResult> InvokeAsync(GetBackendServersArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetBackendServersResult>("alicloud:slb/getBackendServers:getBackendServers", args ?? new GetBackendServersArgs(), options.WithVersion());
    }


    public sealed class GetBackendServersArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// List of attached ECS instance IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of the SLB with attachments.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public string LoadBalancerId { get; set; } = null!;

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetBackendServersArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetBackendServersResult
    {
        public readonly ImmutableArray<Outputs.GetBackendServersBackendServerResult> BackendServers;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string LoadBalancerId;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetBackendServersResult(
            ImmutableArray<Outputs.GetBackendServersBackendServerResult> backendServers,

            string id,

            ImmutableArray<string> ids,

            string loadBalancerId,

            string? outputFile)
        {
            BackendServers = backendServers;
            Id = id;
            Ids = ids;
            LoadBalancerId = loadBalancerId;
            OutputFile = outputFile;
        }
    }
}
