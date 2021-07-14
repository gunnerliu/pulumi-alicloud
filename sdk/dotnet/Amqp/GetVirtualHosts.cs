// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Amqp
{
    public static class GetVirtualHosts
    {
        /// <summary>
        /// This data source provides the Amqp Virtual Hosts of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.126.0+.
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
        ///         var ids = Output.Create(AliCloud.Amqp.GetVirtualHosts.InvokeAsync(new AliCloud.Amqp.GetVirtualHostsArgs
        ///         {
        ///             InstanceId = "amqp-abc12345",
        ///             Ids = 
        ///             {
        ///                 "my-VirtualHost-1",
        ///                 "my-VirtualHost-2",
        ///             },
        ///         }));
        ///         this.AmqpVirtualHostId1 = ids.Apply(ids =&gt; ids.Hosts[0].Id);
        ///         var nameRegex = Output.Create(AliCloud.Amqp.GetVirtualHosts.InvokeAsync(new AliCloud.Amqp.GetVirtualHostsArgs
        ///         {
        ///             InstanceId = "amqp-abc12345",
        ///             NameRegex = "^my-VirtualHost",
        ///         }));
        ///         this.AmqpVirtualHostId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Hosts[0].Id);
        ///     }
        /// 
        ///     [Output("amqpVirtualHostId1")]
        ///     public Output&lt;string&gt; AmqpVirtualHostId1 { get; set; }
        ///     [Output("amqpVirtualHostId2")]
        ///     public Output&lt;string&gt; AmqpVirtualHostId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVirtualHostsResult> InvokeAsync(GetVirtualHostsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetVirtualHostsResult>("alicloud:amqp/getVirtualHosts:getVirtualHosts", args ?? new GetVirtualHostsArgs(), options.WithVersion());
    }


    public sealed class GetVirtualHostsArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Virtual Host IDs. Its element value is same as Virtual Host Name.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// InstanceId.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Virtual Host name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetVirtualHostsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetVirtualHostsResult
    {
        public readonly ImmutableArray<Outputs.GetVirtualHostsHostResult> Hosts;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string InstanceId;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetVirtualHostsResult(
            ImmutableArray<Outputs.GetVirtualHostsHostResult> hosts,

            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Hosts = hosts;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
