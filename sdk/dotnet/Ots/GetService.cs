// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ots
{
    public static class GetService
    {
        /// <summary>
        /// Using this data source can enable Table Staore service automatically. If the service has been enabled, it will return `Opened`.
        /// 
        /// For information about Table Staore and how to use it, see [What is Table Staore](https://www.alibabacloud.com/help/product/27278.htm).
        /// 
        /// &gt; **NOTE:** Available in v1.97.0+
        /// </summary>
        public static Task<GetServiceResult> InvokeAsync(GetServiceArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceResult>("alicloud:ots/getService:getService", args ?? new GetServiceArgs(), options.WithDefaults());

        /// <summary>
        /// Using this data source can enable Table Staore service automatically. If the service has been enabled, it will return `Opened`.
        /// 
        /// For information about Table Staore and how to use it, see [What is Table Staore](https://www.alibabacloud.com/help/product/27278.htm).
        /// 
        /// &gt; **NOTE:** Available in v1.97.0+
        /// </summary>
        public static Output<GetServiceResult> Invoke(GetServiceInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceResult>("alicloud:ots/getService:getService", args ?? new GetServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: "On" or "Off". Default to "Off".
        /// 
        /// &gt; **NOTE:** Setting `enable = "On"` to open the Table Staore service that means you have read and agreed the [Table Staore Terms of Service](https://help.aliyun.com/document_detail/34908.html). The service can not closed once it is opened.
        /// </summary>
        [Input("enable")]
        public string? Enable { get; set; }

        public GetServiceArgs()
        {
        }
        public static new GetServiceArgs Empty => new GetServiceArgs();
    }

    public sealed class GetServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: "On" or "Off". Default to "Off".
        /// 
        /// &gt; **NOTE:** Setting `enable = "On"` to open the Table Staore service that means you have read and agreed the [Table Staore Terms of Service](https://help.aliyun.com/document_detail/34908.html). The service can not closed once it is opened.
        /// </summary>
        [Input("enable")]
        public Input<string>? Enable { get; set; }

        public GetServiceInvokeArgs()
        {
        }
        public static new GetServiceInvokeArgs Empty => new GetServiceInvokeArgs();
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
