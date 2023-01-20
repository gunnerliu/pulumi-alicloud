// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cdn
{
    public static class GetIpInfo
    {
        /// <summary>
        /// This data source provides the function of verifying whether an IP is a CDN node.
        /// 
        /// &gt; **NOTE:** Available in v1.153.0+.
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
        ///     var ipTest = AliCloud.Cdn.GetIpInfo.Invoke(new()
        ///     {
        ///         Ip = "114.114.114.114",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetIpInfoResult> InvokeAsync(GetIpInfoArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIpInfoResult>("alicloud:cdn/getIpInfo:getIpInfo", args ?? new GetIpInfoArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the function of verifying whether an IP is a CDN node.
        /// 
        /// &gt; **NOTE:** Available in v1.153.0+.
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
        ///     var ipTest = AliCloud.Cdn.GetIpInfo.Invoke(new()
        ///     {
        ///         Ip = "114.114.114.114",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetIpInfoResult> Invoke(GetIpInfoInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpInfoResult>("alicloud:cdn/getIpInfo:getIpInfo", args ?? new GetIpInfoInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIpInfoArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specify IP address.
        /// </summary>
        [Input("ip", required: true)]
        public string Ip { get; set; } = null!;

        public GetIpInfoArgs()
        {
        }
        public static new GetIpInfoArgs Empty => new GetIpInfoArgs();
    }

    public sealed class GetIpInfoInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specify IP address.
        /// </summary>
        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        public GetIpInfoInvokeArgs()
        {
        }
        public static new GetIpInfoInvokeArgs Empty => new GetIpInfoInvokeArgs();
    }


    [OutputType]
    public sealed class GetIpInfoResult
    {
        public readonly string CdnIp;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Ip;
        public readonly string Isp;
        public readonly string IspEname;
        public readonly string Region;
        public readonly string RegionEname;

        [OutputConstructor]
        private GetIpInfoResult(
            string cdnIp,

            string id,

            string ip,

            string isp,

            string ispEname,

            string region,

            string regionEname)
        {
            CdnIp = cdnIp;
            Id = id;
            Ip = ip;
            Isp = isp;
            IspEname = ispEname;
            Region = region;
            RegionEname = regionEname;
        }
    }
}
