// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cdn
{
    public static class GetService
    {
        /// <summary>
        /// Using this data source can enable CDN service automatically. If the service has been enabled, it will return `Opened`.
        /// 
        /// For information about CDN and how to use it, see [What is CDN](https://www.alibabacloud.com/help/product/27099.htm).
        /// 
        /// &gt; **NOTE:** Available in v1.98.0+
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
        ///         var open = Output.Create(AliCloud.Cdn.GetService.InvokeAsync(new AliCloud.Cdn.GetServiceArgs
        ///         {
        ///             Enable = "On",
        ///             InternetChargeType = "PayByTraffic",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetServiceResult> InvokeAsync(GetServiceArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServiceResult>("alicloud:cdn/getService:getService", args ?? new GetServiceArgs(), options.WithVersion());
    }


    public sealed class GetServiceArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: "On" or "Off".
        /// </summary>
        [Input("enable")]
        public string? Enable { get; set; }

        /// <summary>
        /// The new billing method. Valid values: `PayByTraffic` and `PayByBandwidth`. Default value: `PayByTraffic`.
        /// It is required when `enable = on`. If the CDN service has been opened and you can update its internet charge type by modifying the filed `internet_charge_type`.
        /// As a note, the updated internet charge type will be effective in the next day zero time.
        /// </summary>
        [Input("internetChargeType")]
        public string? InternetChargeType { get; set; }

        public GetServiceArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetServiceResult
    {
        /// <summary>
        /// The time when the change of the billing method starts to take effect. The time is displayed in GMT.
        /// </summary>
        public readonly string ChangingAffectTime;
        /// <summary>
        /// The billing method to be effective.
        /// </summary>
        public readonly string ChangingChargeType;
        public readonly string? Enable;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? InternetChargeType;
        /// <summary>
        /// The time when the CDN service was activated. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format.
        /// </summary>
        public readonly string OpeningTime;
        /// <summary>
        /// The current service enable status.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetServiceResult(
            string changingAffectTime,

            string changingChargeType,

            string? enable,

            string id,

            string? internetChargeType,

            string openingTime,

            string status)
        {
            ChangingAffectTime = changingAffectTime;
            ChangingChargeType = changingChargeType;
            Enable = enable;
            Id = id;
            InternetChargeType = internetChargeType;
            OpeningTime = openingTime;
            Status = status;
        }
    }
}