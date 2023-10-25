// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetNatIpCidrs
    {
        /// <summary>
        /// This data source provides the Vpc Nat Ip Cidrs of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.136.0+.
        /// </summary>
        public static Task<GetNatIpCidrsResult> InvokeAsync(GetNatIpCidrsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNatIpCidrsResult>("alicloud:vpc/getNatIpCidrs:getNatIpCidrs", args ?? new GetNatIpCidrsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Vpc Nat Ip Cidrs of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.136.0+.
        /// </summary>
        public static Output<GetNatIpCidrsResult> Invoke(GetNatIpCidrsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNatIpCidrsResult>("alicloud:vpc/getNatIpCidrs:getNatIpCidrs", args ?? new GetNatIpCidrsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNatIpCidrsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Nat Ip Cidr IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Nat Ip Cidr name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// The ID of the VPC NAT gateway.
        /// </summary>
        [Input("natGatewayId", required: true)]
        public string NatGatewayId { get; set; } = null!;

        [Input("natIpCidrNames")]
        private List<string>? _natIpCidrNames;

        /// <summary>
        /// NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
        /// </summary>
        public List<string> NatIpCidrNames
        {
            get => _natIpCidrNames ?? (_natIpCidrNames = new List<string>());
            set => _natIpCidrNames = value;
        }

        [Input("natIpCidrs")]
        private List<string>? _natIpCidrs;

        /// <summary>
        /// The NAT CIDR block to be created. Support up to `20`. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
        /// </summary>
        public List<string> NatIpCidrs
        {
            get => _natIpCidrs ?? (_natIpCidrs = new List<string>());
            set => _natIpCidrs = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the CIDR block of the NAT gateway. If the value is `Available`, the CIDR block is available.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetNatIpCidrsArgs()
        {
        }
        public static new GetNatIpCidrsArgs Empty => new GetNatIpCidrsArgs();
    }

    public sealed class GetNatIpCidrsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Nat Ip Cidr IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Nat Ip Cidr name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// The ID of the VPC NAT gateway.
        /// </summary>
        [Input("natGatewayId", required: true)]
        public Input<string> NatGatewayId { get; set; } = null!;

        [Input("natIpCidrNames")]
        private InputList<string>? _natIpCidrNames;

        /// <summary>
        /// NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
        /// </summary>
        public InputList<string> NatIpCidrNames
        {
            get => _natIpCidrNames ?? (_natIpCidrNames = new InputList<string>());
            set => _natIpCidrNames = value;
        }

        [Input("natIpCidrs")]
        private InputList<string>? _natIpCidrs;

        /// <summary>
        /// The NAT CIDR block to be created. Support up to `20`. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
        /// </summary>
        public InputList<string> NatIpCidrs
        {
            get => _natIpCidrs ?? (_natIpCidrs = new InputList<string>());
            set => _natIpCidrs = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the CIDR block of the NAT gateway. If the value is `Available`, the CIDR block is available.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetNatIpCidrsInvokeArgs()
        {
        }
        public static new GetNatIpCidrsInvokeArgs Empty => new GetNatIpCidrsInvokeArgs();
    }


    [OutputType]
    public sealed class GetNatIpCidrsResult
    {
        public readonly ImmutableArray<Outputs.GetNatIpCidrsCidrResult> Cidrs;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string NatGatewayId;
        public readonly ImmutableArray<string> NatIpCidrNames;
        public readonly ImmutableArray<string> NatIpCidrs;
        public readonly string? OutputFile;
        public readonly string? Status;

        [OutputConstructor]
        private GetNatIpCidrsResult(
            ImmutableArray<Outputs.GetNatIpCidrsCidrResult> cidrs,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string natGatewayId,

            ImmutableArray<string> natIpCidrNames,

            ImmutableArray<string> natIpCidrs,

            string? outputFile,

            string? status)
        {
            Cidrs = cidrs;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            NatGatewayId = natGatewayId;
            NatIpCidrNames = natIpCidrNames;
            NatIpCidrs = natIpCidrs;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
