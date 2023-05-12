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
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Amqp.GetVirtualHosts.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         Ids = new[]
        ///         {
        ///             "my-VirtualHost-1",
        ///             "my-VirtualHost-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Amqp.GetVirtualHosts.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         NameRegex = "^my-VirtualHost",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["amqpVirtualHostId1"] = ids.Apply(getVirtualHostsResult =&gt; getVirtualHostsResult.Hosts[0]?.Id),
        ///         ["amqpVirtualHostId2"] = nameRegex.Apply(getVirtualHostsResult =&gt; getVirtualHostsResult.Hosts[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVirtualHostsResult> InvokeAsync(GetVirtualHostsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVirtualHostsResult>("alicloud:amqp/getVirtualHosts:getVirtualHosts", args ?? new GetVirtualHostsArgs(), options.WithDefaults());

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
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Amqp.GetVirtualHosts.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         Ids = new[]
        ///         {
        ///             "my-VirtualHost-1",
        ///             "my-VirtualHost-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Amqp.GetVirtualHosts.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         NameRegex = "^my-VirtualHost",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["amqpVirtualHostId1"] = ids.Apply(getVirtualHostsResult =&gt; getVirtualHostsResult.Hosts[0]?.Id),
        ///         ["amqpVirtualHostId2"] = nameRegex.Apply(getVirtualHostsResult =&gt; getVirtualHostsResult.Hosts[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVirtualHostsResult> Invoke(GetVirtualHostsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVirtualHostsResult>("alicloud:amqp/getVirtualHosts:getVirtualHosts", args ?? new GetVirtualHostsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVirtualHostsArgs : global::Pulumi.InvokeArgs
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

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetVirtualHostsArgs()
        {
        }
        public static new GetVirtualHostsArgs Empty => new GetVirtualHostsArgs();
    }

    public sealed class GetVirtualHostsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Virtual Host IDs. Its element value is same as Virtual Host Name.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// InstanceId.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Virtual Host name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetVirtualHostsInvokeArgs()
        {
        }
        public static new GetVirtualHostsInvokeArgs Empty => new GetVirtualHostsInvokeArgs();
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
