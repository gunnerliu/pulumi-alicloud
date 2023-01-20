// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud
{
    public static class GetMscSubSubscriptions
    {
        /// <summary>
        /// This data source provides the Message Center Subscriptions of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.135.0+.
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
        ///     var @default = AliCloud.GetMscSubSubscriptions.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mscSubSubscriptionId1"] = @default.Apply(getMscSubSubscriptionsResult =&gt; getMscSubSubscriptionsResult).Apply(@default =&gt; @default.Apply(getMscSubSubscriptionsResult =&gt; getMscSubSubscriptionsResult.Subscriptions[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetMscSubSubscriptionsResult> InvokeAsync(GetMscSubSubscriptionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMscSubSubscriptionsResult>("alicloud:index/getMscSubSubscriptions:getMscSubSubscriptions", args ?? new GetMscSubSubscriptionsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Message Center Subscriptions of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.135.0+.
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
        ///     var @default = AliCloud.GetMscSubSubscriptions.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mscSubSubscriptionId1"] = @default.Apply(getMscSubSubscriptionsResult =&gt; getMscSubSubscriptionsResult).Apply(@default =&gt; @default.Apply(getMscSubSubscriptionsResult =&gt; getMscSubSubscriptionsResult.Subscriptions[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetMscSubSubscriptionsResult> Invoke(GetMscSubSubscriptionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMscSubSubscriptionsResult>("alicloud:index/getMscSubSubscriptions:getMscSubSubscriptions", args ?? new GetMscSubSubscriptionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMscSubSubscriptionsArgs : global::Pulumi.InvokeArgs
    {
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetMscSubSubscriptionsArgs()
        {
        }
        public static new GetMscSubSubscriptionsArgs Empty => new GetMscSubSubscriptionsArgs();
    }

    public sealed class GetMscSubSubscriptionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetMscSubSubscriptionsInvokeArgs()
        {
        }
        public static new GetMscSubSubscriptionsInvokeArgs Empty => new GetMscSubSubscriptionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetMscSubSubscriptionsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetMscSubSubscriptionsSubscriptionResult> Subscriptions;

        [OutputConstructor]
        private GetMscSubSubscriptionsResult(
            string id,

            string? outputFile,

            ImmutableArray<Outputs.GetMscSubSubscriptionsSubscriptionResult> subscriptions)
        {
            Id = id;
            OutputFile = outputFile;
            Subscriptions = subscriptions;
        }
    }
}
