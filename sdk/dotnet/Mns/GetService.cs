// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.AliCloud.Mns
{
    public static class GetService
    {
        /// <summary>
        /// Using this data source can open MNS service automatically. If the service has been opened, it will return opened.
        /// 
        /// For information about MNS and how to use it, see [What is MNS](https://www.alibabacloud.com/help/en/product/27412.htm).
        /// 
        /// &gt; **NOTE:** Available in v1.118.0+
        /// 
        /// &gt; **NOTE:** The MNS service is not support in the international site.
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
        ///         var open = Output.Create(AliCloud.Mns.GetService.InvokeAsync(new AliCloud.Mns.GetServiceArgs
        ///         {
        ///             Enable = "On",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetServiceResult> InvokeAsync(GetServiceArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServiceResult>("alicloud:mns/getService:getService", args ?? new GetServiceArgs(), options.WithVersion());

        /// <summary>
        /// Using this data source can open MNS service automatically. If the service has been opened, it will return opened.
        /// 
        /// For information about MNS and how to use it, see [What is MNS](https://www.alibabacloud.com/help/en/product/27412.htm).
        /// 
        /// &gt; **NOTE:** Available in v1.118.0+
        /// 
        /// &gt; **NOTE:** The MNS service is not support in the international site.
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
        ///         var open = Output.Create(AliCloud.Mns.GetService.InvokeAsync(new AliCloud.Mns.GetServiceArgs
        ///         {
        ///             Enable = "On",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetServiceResult> Invoke(GetServiceInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetServiceResult>("alicloud:mns/getService:getService", args ?? new GetServiceInvokeArgs(), options.WithVersion());
    }


    public sealed class GetServiceArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: "On" or "Off". Default to "Off".
        /// </summary>
        [Input("enable")]
        public string? Enable { get; set; }

        public GetServiceArgs()
        {
        }
    }

    public sealed class GetServiceInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: "On" or "Off". Default to "Off".
        /// </summary>
        [Input("enable")]
        public Input<string>? Enable { get; set; }

        public GetServiceInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetServiceResult
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
        private GetServiceResult(
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
