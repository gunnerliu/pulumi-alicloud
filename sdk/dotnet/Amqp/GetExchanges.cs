// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Amqp
{
    public static class GetExchanges
    {
        /// <summary>
        /// This data source provides the Amqp Exchanges of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.128.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Amqp.GetExchanges.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         VirtualHostName = "my-VirtualHost",
        ///         Ids = new[]
        ///         {
        ///             "my-Exchange-1",
        ///             "my-Exchange-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Amqp.GetExchanges.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         VirtualHostName = "my-VirtualHost",
        ///         NameRegex = "^my-Exchange",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["amqpExchangeId1"] = ids.Apply(getExchangesResult =&gt; getExchangesResult.Exchanges[0]?.Id),
        ///         ["amqpExchangeId2"] = nameRegex.Apply(getExchangesResult =&gt; getExchangesResult.Exchanges[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetExchangesResult> InvokeAsync(GetExchangesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetExchangesResult>("alicloud:amqp/getExchanges:getExchanges", args ?? new GetExchangesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Amqp Exchanges of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.128.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Amqp.GetExchanges.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         VirtualHostName = "my-VirtualHost",
        ///         Ids = new[]
        ///         {
        ///             "my-Exchange-1",
        ///             "my-Exchange-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Amqp.GetExchanges.Invoke(new()
        ///     {
        ///         InstanceId = "amqp-abc12345",
        ///         VirtualHostName = "my-VirtualHost",
        ///         NameRegex = "^my-Exchange",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["amqpExchangeId1"] = ids.Apply(getExchangesResult =&gt; getExchangesResult.Exchanges[0]?.Id),
        ///         ["amqpExchangeId2"] = nameRegex.Apply(getExchangesResult =&gt; getExchangesResult.Exchanges[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetExchangesResult> Invoke(GetExchangesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetExchangesResult>("alicloud:amqp/getExchanges:getExchanges", args ?? new GetExchangesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetExchangesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Exchange IDs. Its element value is same as Exchange Name.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Exchange name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The name of virtual host where an exchange resides.
        /// </summary>
        [Input("virtualHostName", required: true)]
        public string VirtualHostName { get; set; } = null!;

        public GetExchangesArgs()
        {
        }
        public static new GetExchangesArgs Empty => new GetExchangesArgs();
    }

    public sealed class GetExchangesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Exchange IDs. Its element value is same as Exchange Name.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Exchange name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The name of virtual host where an exchange resides.
        /// </summary>
        [Input("virtualHostName", required: true)]
        public Input<string> VirtualHostName { get; set; } = null!;

        public GetExchangesInvokeArgs()
        {
        }
        public static new GetExchangesInvokeArgs Empty => new GetExchangesInvokeArgs();
    }


    [OutputType]
    public sealed class GetExchangesResult
    {
        public readonly ImmutableArray<Outputs.GetExchangesExchangeResult> Exchanges;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string InstanceId;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string VirtualHostName;

        [OutputConstructor]
        private GetExchangesResult(
            ImmutableArray<Outputs.GetExchangesExchangeResult> exchanges,

            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string virtualHostName)
        {
            Exchanges = exchanges;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            VirtualHostName = virtualHostName;
        }
    }
}
