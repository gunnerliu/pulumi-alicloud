// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetRouterInterfaces
    {
        /// <summary>
        /// This data source provides information about [router interfaces](https://www.alibabacloud.com/help/doc-detail/52412.htm)
        /// that connect VPCs together.
        /// 
        /// &gt; **DEPRECATED:**  This datasource has been deprecated from version `1.199.0`. Please use new resource alicloud_express_connect_router_interfaces.
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
        ///     var routerInterfacesDs = AliCloud.Vpc.GetRouterInterfaces.Invoke(new()
        ///     {
        ///         NameRegex = "^testenv",
        ///         Status = "Active",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstRouterInterfaceId"] = routerInterfacesDs.Apply(getRouterInterfacesResult =&gt; getRouterInterfacesResult.Interfaces[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRouterInterfacesResult> InvokeAsync(GetRouterInterfacesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRouterInterfacesResult>("alicloud:vpc/getRouterInterfaces:getRouterInterfaces", args ?? new GetRouterInterfacesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides information about [router interfaces](https://www.alibabacloud.com/help/doc-detail/52412.htm)
        /// that connect VPCs together.
        /// 
        /// &gt; **DEPRECATED:**  This datasource has been deprecated from version `1.199.0`. Please use new resource alicloud_express_connect_router_interfaces.
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
        ///     var routerInterfacesDs = AliCloud.Vpc.GetRouterInterfaces.Invoke(new()
        ///     {
        ///         NameRegex = "^testenv",
        ///         Status = "Active",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstRouterInterfaceId"] = routerInterfacesDs.Apply(getRouterInterfacesResult =&gt; getRouterInterfacesResult.Interfaces[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRouterInterfacesResult> Invoke(GetRouterInterfacesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRouterInterfacesResult>("alicloud:vpc/getRouterInterfaces:getRouterInterfaces", args ?? new GetRouterInterfacesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRouterInterfacesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of router interface IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string used to filter by router interface name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// ID of the peer router interface.
        /// </summary>
        [Input("oppositeInterfaceId")]
        public string? OppositeInterfaceId { get; set; }

        /// <summary>
        /// Account ID of the owner of the peer router interface.
        /// </summary>
        [Input("oppositeInterfaceOwnerId")]
        public string? OppositeInterfaceOwnerId { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Role of the router interface. Valid values are `InitiatingSide` (connection initiator) and 
        /// `AcceptingSide` (connection receiver). The value of this parameter must be `InitiatingSide` if the `router_type` is set to `VBR`.
        /// </summary>
        [Input("role")]
        public string? Role { get; set; }

        /// <summary>
        /// ID of the VRouter located in the local region.
        /// </summary>
        [Input("routerId")]
        public string? RouterId { get; set; }

        /// <summary>
        /// Router type in the local region. Valid values are `VRouter` and `VBR` (physical connection).
        /// </summary>
        [Input("routerType")]
        public string? RouterType { get; set; }

        /// <summary>
        /// Specification of the link, such as `Small.1` (10Mb), `Middle.1` (100Mb), `Large.2` (2Gb), ...etc.
        /// </summary>
        [Input("specification")]
        public string? Specification { get; set; }

        /// <summary>
        /// Expected status. Valid values are `Active`, `Inactive` and `Idle`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetRouterInterfacesArgs()
        {
        }
        public static new GetRouterInterfacesArgs Empty => new GetRouterInterfacesArgs();
    }

    public sealed class GetRouterInterfacesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of router interface IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string used to filter by router interface name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// ID of the peer router interface.
        /// </summary>
        [Input("oppositeInterfaceId")]
        public Input<string>? OppositeInterfaceId { get; set; }

        /// <summary>
        /// Account ID of the owner of the peer router interface.
        /// </summary>
        [Input("oppositeInterfaceOwnerId")]
        public Input<string>? OppositeInterfaceOwnerId { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Role of the router interface. Valid values are `InitiatingSide` (connection initiator) and 
        /// `AcceptingSide` (connection receiver). The value of this parameter must be `InitiatingSide` if the `router_type` is set to `VBR`.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// ID of the VRouter located in the local region.
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        /// <summary>
        /// Router type in the local region. Valid values are `VRouter` and `VBR` (physical connection).
        /// </summary>
        [Input("routerType")]
        public Input<string>? RouterType { get; set; }

        /// <summary>
        /// Specification of the link, such as `Small.1` (10Mb), `Middle.1` (100Mb), `Large.2` (2Gb), ...etc.
        /// </summary>
        [Input("specification")]
        public Input<string>? Specification { get; set; }

        /// <summary>
        /// Expected status. Valid values are `Active`, `Inactive` and `Idle`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetRouterInterfacesInvokeArgs()
        {
        }
        public static new GetRouterInterfacesInvokeArgs Empty => new GetRouterInterfacesInvokeArgs();
    }


    [OutputType]
    public sealed class GetRouterInterfacesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of router interface IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// A list of router interfaces. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRouterInterfacesInterfaceResult> Interfaces;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of router interface names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        /// <summary>
        /// Peer router interface ID.
        /// </summary>
        public readonly string? OppositeInterfaceId;
        /// <summary>
        /// Account ID of the owner of the peer router interface.
        /// </summary>
        public readonly string? OppositeInterfaceOwnerId;
        public readonly string? OutputFile;
        /// <summary>
        /// Router interface role. Possible values: `InitiatingSide` and `AcceptingSide`.
        /// </summary>
        public readonly string? Role;
        /// <summary>
        /// ID of the VRouter located in the local region.
        /// </summary>
        public readonly string? RouterId;
        /// <summary>
        /// Router type in the local region. Possible values: `VRouter` and `VBR`.
        /// </summary>
        public readonly string? RouterType;
        /// <summary>
        /// Router interface specification. Possible values: `Small.1`, `Middle.1`, `Large.2`, ...etc.
        /// </summary>
        public readonly string? Specification;
        /// <summary>
        /// Router interface status. Possible values: `Active`, `Inactive` and `Idle`.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetRouterInterfacesResult(
            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetRouterInterfacesInterfaceResult> interfaces,

            string? nameRegex,

            ImmutableArray<string> names,

            string? oppositeInterfaceId,

            string? oppositeInterfaceOwnerId,

            string? outputFile,

            string? role,

            string? routerId,

            string? routerType,

            string? specification,

            string? status)
        {
            Id = id;
            Ids = ids;
            Interfaces = interfaces;
            NameRegex = nameRegex;
            Names = names;
            OppositeInterfaceId = oppositeInterfaceId;
            OppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            OutputFile = outputFile;
            Role = role;
            RouterId = routerId;
            RouterType = routerType;
            Specification = specification;
            Status = status;
        }
    }
}
