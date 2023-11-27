// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    public static class GetEndpointGroupIpAddressCidrBlocks
    {
        /// <summary>
        /// This data source provides the Global Accelerator (GA) Endpoint Group Ip Address Cidr Blocks of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.213.0.
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
        ///     var @default = AliCloud.Ga.GetEndpointGroupIpAddressCidrBlocks.Invoke(new()
        ///     {
        ///         EndpointGroupRegion = "cn-hangzhou",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["gaEndpointGroupIpAddressCidrBlocksEndpointGroupRegion"] = @default.Apply(@default =&gt; @default.Apply(getEndpointGroupIpAddressCidrBlocksResult =&gt; getEndpointGroupIpAddressCidrBlocksResult.EndpointGroupIpAddressCidrBlocks[0]?.EndpointGroupRegion)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEndpointGroupIpAddressCidrBlocksResult> InvokeAsync(GetEndpointGroupIpAddressCidrBlocksArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEndpointGroupIpAddressCidrBlocksResult>("alicloud:ga/getEndpointGroupIpAddressCidrBlocks:getEndpointGroupIpAddressCidrBlocks", args ?? new GetEndpointGroupIpAddressCidrBlocksArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Global Accelerator (GA) Endpoint Group Ip Address Cidr Blocks of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.213.0.
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
        ///     var @default = AliCloud.Ga.GetEndpointGroupIpAddressCidrBlocks.Invoke(new()
        ///     {
        ///         EndpointGroupRegion = "cn-hangzhou",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["gaEndpointGroupIpAddressCidrBlocksEndpointGroupRegion"] = @default.Apply(@default =&gt; @default.Apply(getEndpointGroupIpAddressCidrBlocksResult =&gt; getEndpointGroupIpAddressCidrBlocksResult.EndpointGroupIpAddressCidrBlocks[0]?.EndpointGroupRegion)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEndpointGroupIpAddressCidrBlocksResult> Invoke(GetEndpointGroupIpAddressCidrBlocksInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEndpointGroupIpAddressCidrBlocksResult>("alicloud:ga/getEndpointGroupIpAddressCidrBlocks:getEndpointGroupIpAddressCidrBlocks", args ?? new GetEndpointGroupIpAddressCidrBlocksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEndpointGroupIpAddressCidrBlocksArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The region ID of the endpoint group.
        /// </summary>
        [Input("endpointGroupRegion", required: true)]
        public string EndpointGroupRegion { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetEndpointGroupIpAddressCidrBlocksArgs()
        {
        }
        public static new GetEndpointGroupIpAddressCidrBlocksArgs Empty => new GetEndpointGroupIpAddressCidrBlocksArgs();
    }

    public sealed class GetEndpointGroupIpAddressCidrBlocksInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The region ID of the endpoint group.
        /// </summary>
        [Input("endpointGroupRegion", required: true)]
        public Input<string> EndpointGroupRegion { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetEndpointGroupIpAddressCidrBlocksInvokeArgs()
        {
        }
        public static new GetEndpointGroupIpAddressCidrBlocksInvokeArgs Empty => new GetEndpointGroupIpAddressCidrBlocksInvokeArgs();
    }


    [OutputType]
    public sealed class GetEndpointGroupIpAddressCidrBlocksResult
    {
        /// <summary>
        /// A list of Endpoint Group Ip Address Cidr Blocks. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEndpointGroupIpAddressCidrBlocksEndpointGroupIpAddressCidrBlockResult> EndpointGroupIpAddressCidrBlocks;
        /// <summary>
        /// The region ID of the endpoint group.
        /// </summary>
        public readonly string EndpointGroupRegion;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetEndpointGroupIpAddressCidrBlocksResult(
            ImmutableArray<Outputs.GetEndpointGroupIpAddressCidrBlocksEndpointGroupIpAddressCidrBlockResult> endpointGroupIpAddressCidrBlocks,

            string endpointGroupRegion,

            string id,

            string? outputFile)
        {
            EndpointGroupIpAddressCidrBlocks = endpointGroupIpAddressCidrBlocks;
            EndpointGroupRegion = endpointGroupRegion;
            Id = id;
            OutputFile = outputFile;
        }
    }
}
