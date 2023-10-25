// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetNatIps
    {
        /// <summary>
        /// This data source provides the Vpc Nat Ips of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.136.0+.
        /// </summary>
        public static Task<GetNatIpsResult> InvokeAsync(GetNatIpsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNatIpsResult>("alicloud:vpc/getNatIps:getNatIps", args ?? new GetNatIpsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Vpc Nat Ips of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.136.0+.
        /// </summary>
        public static Output<GetNatIpsResult> Invoke(GetNatIpsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNatIpsResult>("alicloud:vpc/getNatIps:getNatIps", args ?? new GetNatIpsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNatIpsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Nat Ip IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Nat Ip name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// The ID of the Virtual Private Cloud (VPC) NAT gateway to which the NAT IP address belongs.
        /// </summary>
        [Input("natGatewayId", required: true)]
        public string NatGatewayId { get; set; } = null!;

        /// <summary>
        /// The CIDR block to which the NAT IP address belongs.
        /// </summary>
        [Input("natIpCidr")]
        public string? NatIpCidr { get; set; }

        [Input("natIpIds")]
        private List<string>? _natIpIds;
        public List<string> NatIpIds
        {
            get => _natIpIds ?? (_natIpIds = new List<string>());
            set => _natIpIds = value;
        }

        [Input("natIpNames")]
        private List<string>? _natIpNames;

        /// <summary>
        /// The name of the NAT IP address.
        /// </summary>
        public List<string> NatIpNames
        {
            get => _natIpNames ?? (_natIpNames = new List<string>());
            set => _natIpNames = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the NAT IP address. Valid values: `Available`, `Deleting` and `Creating`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetNatIpsArgs()
        {
        }
        public static new GetNatIpsArgs Empty => new GetNatIpsArgs();
    }

    public sealed class GetNatIpsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Nat Ip IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Nat Ip name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// The ID of the Virtual Private Cloud (VPC) NAT gateway to which the NAT IP address belongs.
        /// </summary>
        [Input("natGatewayId", required: true)]
        public Input<string> NatGatewayId { get; set; } = null!;

        /// <summary>
        /// The CIDR block to which the NAT IP address belongs.
        /// </summary>
        [Input("natIpCidr")]
        public Input<string>? NatIpCidr { get; set; }

        [Input("natIpIds")]
        private InputList<string>? _natIpIds;
        public InputList<string> NatIpIds
        {
            get => _natIpIds ?? (_natIpIds = new InputList<string>());
            set => _natIpIds = value;
        }

        [Input("natIpNames")]
        private InputList<string>? _natIpNames;

        /// <summary>
        /// The name of the NAT IP address.
        /// </summary>
        public InputList<string> NatIpNames
        {
            get => _natIpNames ?? (_natIpNames = new InputList<string>());
            set => _natIpNames = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the NAT IP address. Valid values: `Available`, `Deleting` and `Creating`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetNatIpsInvokeArgs()
        {
        }
        public static new GetNatIpsInvokeArgs Empty => new GetNatIpsInvokeArgs();
    }


    [OutputType]
    public sealed class GetNatIpsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<Outputs.GetNatIpsIpResult> Ips;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string NatGatewayId;
        public readonly string? NatIpCidr;
        public readonly ImmutableArray<string> NatIpIds;
        public readonly ImmutableArray<string> NatIpNames;
        public readonly string? OutputFile;
        public readonly string? Status;

        [OutputConstructor]
        private GetNatIpsResult(
            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetNatIpsIpResult> ips,

            string? nameRegex,

            ImmutableArray<string> names,

            string natGatewayId,

            string? natIpCidr,

            ImmutableArray<string> natIpIds,

            ImmutableArray<string> natIpNames,

            string? outputFile,

            string? status)
        {
            Id = id;
            Ids = ids;
            Ips = ips;
            NameRegex = nameRegex;
            Names = names;
            NatGatewayId = natGatewayId;
            NatIpCidr = natIpCidr;
            NatIpIds = natIpIds;
            NatIpNames = natIpNames;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
