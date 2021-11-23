// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetIpv6Addresses
    {
        /// <summary>
        /// This data source provides the Vpc Ipv6 Addresses of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.142.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var associatedInstanceId = Output.Create(AliCloud.Vpc.GetIpv6Addresses.InvokeAsync(new AliCloud.Vpc.GetIpv6AddressesArgs
        ///         {
        ///             AssociatedInstanceId = "example_value",
        ///         }));
        ///         this.VpcIpv6AddressId1 = associatedInstanceId.Apply(associatedInstanceId =&gt; associatedInstanceId.Addresses?[0]?.Id);
        ///         var vswitchId = Output.Create(AliCloud.Vpc.GetIpv6Addresses.InvokeAsync(new AliCloud.Vpc.GetIpv6AddressesArgs
        ///         {
        ///             VswitchId = "example_value",
        ///         }));
        ///         this.VpcIpv6AddressId2 = vswitchId.Apply(vswitchId =&gt; vswitchId.Addresses?[0]?.Id);
        ///         var vpcId = Output.Create(AliCloud.Vpc.GetIpv6Addresses.InvokeAsync(new AliCloud.Vpc.GetIpv6AddressesArgs
        ///         {
        ///             VpcId = "example_value",
        ///         }));
        ///         this.VpcIpv6AddressId3 = vpcId.Apply(vpcId =&gt; vpcId.Addresses?[0]?.Id);
        ///         var status = Output.Create(AliCloud.Vpc.GetIpv6Addresses.InvokeAsync(new AliCloud.Vpc.GetIpv6AddressesArgs
        ///         {
        ///             Status = "Available",
        ///         }));
        ///         this.VpcIpv6AddressId4 = status.Apply(status =&gt; status.Addresses?[0]?.Id);
        ///     }
        /// 
        ///     [Output("vpcIpv6AddressId1")]
        ///     public Output&lt;string&gt; VpcIpv6AddressId1 { get; set; }
        ///     [Output("vpcIpv6AddressId2")]
        ///     public Output&lt;string&gt; VpcIpv6AddressId2 { get; set; }
        ///     [Output("vpcIpv6AddressId3")]
        ///     public Output&lt;string&gt; VpcIpv6AddressId3 { get; set; }
        ///     [Output("vpcIpv6AddressId4")]
        ///     public Output&lt;string&gt; VpcIpv6AddressId4 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetIpv6AddressesResult> InvokeAsync(GetIpv6AddressesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetIpv6AddressesResult>("alicloud:vpc/getIpv6Addresses:getIpv6Addresses", args ?? new GetIpv6AddressesArgs(), options.WithVersion());

        /// <summary>
        /// This data source provides the Vpc Ipv6 Addresses of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.142.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var associatedInstanceId = Output.Create(AliCloud.Vpc.GetIpv6Addresses.InvokeAsync(new AliCloud.Vpc.GetIpv6AddressesArgs
        ///         {
        ///             AssociatedInstanceId = "example_value",
        ///         }));
        ///         this.VpcIpv6AddressId1 = associatedInstanceId.Apply(associatedInstanceId =&gt; associatedInstanceId.Addresses?[0]?.Id);
        ///         var vswitchId = Output.Create(AliCloud.Vpc.GetIpv6Addresses.InvokeAsync(new AliCloud.Vpc.GetIpv6AddressesArgs
        ///         {
        ///             VswitchId = "example_value",
        ///         }));
        ///         this.VpcIpv6AddressId2 = vswitchId.Apply(vswitchId =&gt; vswitchId.Addresses?[0]?.Id);
        ///         var vpcId = Output.Create(AliCloud.Vpc.GetIpv6Addresses.InvokeAsync(new AliCloud.Vpc.GetIpv6AddressesArgs
        ///         {
        ///             VpcId = "example_value",
        ///         }));
        ///         this.VpcIpv6AddressId3 = vpcId.Apply(vpcId =&gt; vpcId.Addresses?[0]?.Id);
        ///         var status = Output.Create(AliCloud.Vpc.GetIpv6Addresses.InvokeAsync(new AliCloud.Vpc.GetIpv6AddressesArgs
        ///         {
        ///             Status = "Available",
        ///         }));
        ///         this.VpcIpv6AddressId4 = status.Apply(status =&gt; status.Addresses?[0]?.Id);
        ///     }
        /// 
        ///     [Output("vpcIpv6AddressId1")]
        ///     public Output&lt;string&gt; VpcIpv6AddressId1 { get; set; }
        ///     [Output("vpcIpv6AddressId2")]
        ///     public Output&lt;string&gt; VpcIpv6AddressId2 { get; set; }
        ///     [Output("vpcIpv6AddressId3")]
        ///     public Output&lt;string&gt; VpcIpv6AddressId3 { get; set; }
        ///     [Output("vpcIpv6AddressId4")]
        ///     public Output&lt;string&gt; VpcIpv6AddressId4 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetIpv6AddressesResult> Invoke(GetIpv6AddressesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetIpv6AddressesResult>("alicloud:vpc/getIpv6Addresses:getIpv6Addresses", args ?? new GetIpv6AddressesInvokeArgs(), options.WithVersion());
    }


    public sealed class GetIpv6AddressesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the instance that is assigned the IPv6 address.
        /// </summary>
        [Input("associatedInstanceId")]
        public string? AssociatedInstanceId { get; set; }

        [Input("ids")]
        private List<string>? _ids;
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the IPv6 address. Valid values:`Pending` or `Available`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// The ID of the VPC to which the IPv6 address belongs.
        /// </summary>
        [Input("vpcId")]
        public string? VpcId { get; set; }

        /// <summary>
        /// The ID of the vSwitch to which the IPv6 address belongs.
        /// </summary>
        [Input("vswitchId")]
        public string? VswitchId { get; set; }

        public GetIpv6AddressesArgs()
        {
        }
    }

    public sealed class GetIpv6AddressesInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the instance that is assigned the IPv6 address.
        /// </summary>
        [Input("associatedInstanceId")]
        public Input<string>? AssociatedInstanceId { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the IPv6 address. Valid values:`Pending` or `Available`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the VPC to which the IPv6 address belongs.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The ID of the vSwitch to which the IPv6 address belongs.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public GetIpv6AddressesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetIpv6AddressesResult
    {
        public readonly ImmutableArray<Outputs.GetIpv6AddressesAddressResult> Addresses;
        public readonly string? AssociatedInstanceId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? Status;
        public readonly string? VpcId;
        public readonly string? VswitchId;

        [OutputConstructor]
        private GetIpv6AddressesResult(
            ImmutableArray<Outputs.GetIpv6AddressesAddressResult> addresses,

            string? associatedInstanceId,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<string> names,

            string? outputFile,

            string? status,

            string? vpcId,

            string? vswitchId)
        {
            Addresses = addresses;
            AssociatedInstanceId = associatedInstanceId;
            Id = id;
            Ids = ids;
            Names = names;
            OutputFile = outputFile;
            Status = status;
            VpcId = vpcId;
            VswitchId = vswitchId;
        }
    }
}
