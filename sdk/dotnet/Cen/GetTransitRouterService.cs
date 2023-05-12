// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetTransitRouterService
    {
        /// <summary>
        /// Using this data source can open CEN Transit Router Service automatically. If the service has been opened, it will return opened.
        /// 
        /// For information about CEN and how to use it, see [What is CEN](https://www.alibabacloud.com/help/en/doc-detail/59870.htm).
        /// 
        /// &gt; **NOTE:** Available in v1.139.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var open = AliCloud.Cen.GetTransitRouterService.Invoke(new()
        ///     {
        ///         Enable = "On",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTransitRouterServiceResult> InvokeAsync(GetTransitRouterServiceArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTransitRouterServiceResult>("alicloud:cen/getTransitRouterService:getTransitRouterService", args ?? new GetTransitRouterServiceArgs(), options.WithDefaults());

        /// <summary>
        /// Using this data source can open CEN Transit Router Service automatically. If the service has been opened, it will return opened.
        /// 
        /// For information about CEN and how to use it, see [What is CEN](https://www.alibabacloud.com/help/en/doc-detail/59870.htm).
        /// 
        /// &gt; **NOTE:** Available in v1.139.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var open = AliCloud.Cen.GetTransitRouterService.Invoke(new()
        ///     {
        ///         Enable = "On",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetTransitRouterServiceResult> Invoke(GetTransitRouterServiceInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransitRouterServiceResult>("alicloud:cen/getTransitRouterService:getTransitRouterService", args ?? new GetTransitRouterServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTransitRouterServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
        /// 
        /// &gt; **NOTE:** Setting `enable = "On"` to open the CEN Transit Router Service that means you have read and agreed the [CEN Terms of Service](https://help.aliyun.com/document_detail/66667.html). The service can not closed once it is opened.
        /// </summary>
        [Input("enable")]
        public string? Enable { get; set; }

        public GetTransitRouterServiceArgs()
        {
        }
        public static new GetTransitRouterServiceArgs Empty => new GetTransitRouterServiceArgs();
    }

    public sealed class GetTransitRouterServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
        /// 
        /// &gt; **NOTE:** Setting `enable = "On"` to open the CEN Transit Router Service that means you have read and agreed the [CEN Terms of Service](https://help.aliyun.com/document_detail/66667.html). The service can not closed once it is opened.
        /// </summary>
        [Input("enable")]
        public Input<string>? Enable { get; set; }

        public GetTransitRouterServiceInvokeArgs()
        {
        }
        public static new GetTransitRouterServiceInvokeArgs Empty => new GetTransitRouterServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetTransitRouterServiceResult
    {
        public readonly string? Enable;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The current service enable status.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetTransitRouterServiceResult(
            string? enable,

            string id,

            string status)
        {
            Enable = enable;
            Id = id;
            Status = status;
        }
    }
}
