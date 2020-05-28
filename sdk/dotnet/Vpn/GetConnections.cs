// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn
{
    public static class GetConnections
    {
        /// <summary>
        /// The VPN connections data source lists lots of VPN connections resource information owned by an Alicloud account.
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
        ///         var foo = Output.Create(AliCloud.Vpn.GetConnections.InvokeAsync(new AliCloud.Vpn.GetConnectionsArgs
        ///         {
        ///             CustomerGatewayId = "fake-cgw-id",
        ///             Ids = 
        ///             {
        ///                 "fake-conn-id",
        ///             },
        ///             OutputFile = "/tmp/vpnconn",
        ///             VpnGatewayId = "fake-vpn-id",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetConnectionsResult> InvokeAsync(GetConnectionsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetConnectionsResult>("alicloud:vpn/getConnections:getConnections", args ?? new GetConnectionsArgs(), options.WithVersion());
    }


    public sealed class GetConnectionsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Use the VPN customer gateway ID as the search key.
        /// </summary>
        [Input("customerGatewayId")]
        public string? CustomerGatewayId { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// IDs of the VPN connections.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string of VPN connection name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// Save the result to the file.
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Use the VPN gateway ID as the search key.
        /// </summary>
        [Input("vpnGatewayId")]
        public string? VpnGatewayId { get; set; }

        public GetConnectionsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetConnectionsResult
    {
        /// <summary>
        /// A list of VPN connections. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionsConnectionResult> Connections;
        /// <summary>
        /// ID of the VPN customer gateway.
        /// </summary>
        public readonly string? CustomerGatewayId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Optional) IDs of the VPN connections.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// (Optional) names of the VPN connections.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// ID of the VPN gateway.
        /// </summary>
        public readonly string? VpnGatewayId;

        [OutputConstructor]
        private GetConnectionsResult(
            ImmutableArray<Outputs.GetConnectionsConnectionResult> connections,

            string? customerGatewayId,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? vpnGatewayId)
        {
            Connections = connections;
            CustomerGatewayId = customerGatewayId;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            VpnGatewayId = vpnGatewayId;
        }
    }
}
