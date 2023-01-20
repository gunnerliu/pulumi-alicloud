// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CR
{
    public static class GetEndpointAclService
    {
        /// <summary>
        /// This data source provides the CR Endpoint Acl Service of the current Alibaba Cloud user.
        /// 
        /// For information about Event Bridge and how to use it, see [What is CR Endpoint Acl](https://www.alibabacloud.com/help/en/doc-detail/142246.htm).
        /// 
        /// &gt; **NOTE:** Available in v1.139.0+.
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
        ///     var example = AliCloud.CR.GetEndpointAclService.Invoke(new()
        ///     {
        ///         Enable = true,
        ///         EndpointType = "internet",
        ///         InstanceId = "example_id",
        ///         ModuleName = "Registry",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEndpointAclServiceResult> InvokeAsync(GetEndpointAclServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEndpointAclServiceResult>("alicloud:cr/getEndpointAclService:getEndpointAclService", args ?? new GetEndpointAclServiceArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the CR Endpoint Acl Service of the current Alibaba Cloud user.
        /// 
        /// For information about Event Bridge and how to use it, see [What is CR Endpoint Acl](https://www.alibabacloud.com/help/en/doc-detail/142246.htm).
        /// 
        /// &gt; **NOTE:** Available in v1.139.0+.
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
        ///     var example = AliCloud.CR.GetEndpointAclService.Invoke(new()
        ///     {
        ///         Enable = true,
        ///         EndpointType = "internet",
        ///         InstanceId = "example_id",
        ///         ModuleName = "Registry",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEndpointAclServiceResult> Invoke(GetEndpointAclServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEndpointAclServiceResult>("alicloud:cr/getEndpointAclService:getEndpointAclService", args ?? new GetEndpointAclServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEndpointAclServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether to enable Acl Service.  Valid values: `true` and `false`.
        /// </summary>
        [Input("enable", required: true)]
        public bool Enable { get; set; }

        /// <summary>
        /// The type of endpoint. Valid values: `internet`.
        /// </summary>
        [Input("endpointType", required: true)]
        public string EndpointType { get; set; } = null!;

        /// <summary>
        /// The ID of the CR Instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// The ModuleName. Valid values: `Registry`.
        /// </summary>
        [Input("moduleName")]
        public string? ModuleName { get; set; }

        public GetEndpointAclServiceArgs()
        {
        }
        public static new GetEndpointAclServiceArgs Empty => new GetEndpointAclServiceArgs();
    }

    public sealed class GetEndpointAclServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether to enable Acl Service.  Valid values: `true` and `false`.
        /// </summary>
        [Input("enable", required: true)]
        public Input<bool> Enable { get; set; } = null!;

        /// <summary>
        /// The type of endpoint. Valid values: `internet`.
        /// </summary>
        [Input("endpointType", required: true)]
        public Input<string> EndpointType { get; set; } = null!;

        /// <summary>
        /// The ID of the CR Instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// The ModuleName. Valid values: `Registry`.
        /// </summary>
        [Input("moduleName")]
        public Input<string>? ModuleName { get; set; }

        public GetEndpointAclServiceInvokeArgs()
        {
        }
        public static new GetEndpointAclServiceInvokeArgs Empty => new GetEndpointAclServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetEndpointAclServiceResult
    {
        public readonly bool Enable;
        public readonly string EndpointType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string InstanceId;
        public readonly string? ModuleName;
        public readonly string Status;

        [OutputConstructor]
        private GetEndpointAclServiceResult(
            bool enable,

            string endpointType,

            string id,

            string instanceId,

            string? moduleName,

            string status)
        {
            Enable = enable;
            EndpointType = endpointType;
            Id = id;
            InstanceId = instanceId;
            ModuleName = moduleName;
            Status = status;
        }
    }
}
