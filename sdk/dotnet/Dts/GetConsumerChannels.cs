// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dts
{
    public static class GetConsumerChannels
    {
        /// <summary>
        /// This data source provides the Dts Consumer Channels of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.146.0+.
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
        ///     var ids = AliCloud.Dts.GetConsumerChannels.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dtsConsumerChannelId1"] = ids.Apply(getConsumerChannelsResult =&gt; getConsumerChannelsResult.Channels[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetConsumerChannelsResult> InvokeAsync(GetConsumerChannelsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConsumerChannelsResult>("alicloud:dts/getConsumerChannels:getConsumerChannels", args ?? new GetConsumerChannelsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Dts Consumer Channels of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.146.0+.
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
        ///     var ids = AliCloud.Dts.GetConsumerChannels.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dtsConsumerChannelId1"] = ids.Apply(getConsumerChannelsResult =&gt; getConsumerChannelsResult.Channels[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetConsumerChannelsResult> Invoke(GetConsumerChannelsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConsumerChannelsResult>("alicloud:dts/getConsumerChannels:getConsumerChannels", args ?? new GetConsumerChannelsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConsumerChannelsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Subscription instance ID.
        /// </summary>
        [Input("dtsInstanceId", required: true)]
        public string DtsInstanceId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Consumer Channel IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetConsumerChannelsArgs()
        {
        }
        public static new GetConsumerChannelsArgs Empty => new GetConsumerChannelsArgs();
    }

    public sealed class GetConsumerChannelsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Subscription instance ID.
        /// </summary>
        [Input("dtsInstanceId", required: true)]
        public Input<string> DtsInstanceId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Consumer Channel IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetConsumerChannelsInvokeArgs()
        {
        }
        public static new GetConsumerChannelsInvokeArgs Empty => new GetConsumerChannelsInvokeArgs();
    }


    [OutputType]
    public sealed class GetConsumerChannelsResult
    {
        public readonly ImmutableArray<Outputs.GetConsumerChannelsChannelResult> Channels;
        public readonly string DtsInstanceId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetConsumerChannelsResult(
            ImmutableArray<Outputs.GetConsumerChannelsChannelResult> channels,

            string dtsInstanceId,

            string id,

            ImmutableArray<string> ids,

            string? outputFile)
        {
            Channels = channels;
            DtsInstanceId = dtsInstanceId;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
        }
    }
}
