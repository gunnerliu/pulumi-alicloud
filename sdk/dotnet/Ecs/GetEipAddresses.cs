// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetEipAddresses
    {
        /// <summary>
        /// This data source provides the Eip Addresses of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.126.0+.
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
        ///         var example = Output.Create(AliCloud.Ecs.GetEipAddresses.InvokeAsync(new AliCloud.Ecs.GetEipAddressesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "eip-bp1jvx5ki6c********",
        ///             },
        ///             NameRegex = "the_resource_name",
        ///         }));
        ///         this.FirstEipAddressId = example.Apply(example =&gt; example.Addresses[0].Id);
        ///     }
        /// 
        ///     [Output("firstEipAddressId")]
        ///     public Output&lt;string&gt; FirstEipAddressId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEipAddressesResult> InvokeAsync(GetEipAddressesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetEipAddressesResult>("alicloud:ecs/getEipAddresses:getEipAddresses", args ?? new GetEipAddressesArgs(), options.WithVersion());
    }


    public sealed class GetEipAddressesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the EIP.
        /// </summary>
        [Input("addressName")]
        public string? AddressName { get; set; }

        /// <summary>
        /// The associated instance id.
        /// </summary>
        [Input("associatedInstanceId")]
        public string? AssociatedInstanceId { get; set; }

        /// <summary>
        /// The associated instance type.
        /// </summary>
        [Input("associatedInstanceType")]
        public string? AssociatedInstanceType { get; set; }

        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public bool? DryRun { get; set; }

        /// <summary>
        /// Default to `tue`. Set it to `false` can hidden the `tags` to output.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Address IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The include reservation data. Valid values: `BGP` and `BGP_PRO`.
        /// </summary>
        [Input("includeReservationData")]
        public bool? IncludeReservationData { get; set; }

        /// <summary>
        /// The IP address of the EIP.
        /// </summary>
        [Input("ipAddress")]
        public string? IpAddress { get; set; }

        [Input("ipAddresses")]
        private List<string>? _ipAddresses;
        [Obsolete(@"Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'ip_address' instead.")]
        public List<string> IpAddresses
        {
            get => _ipAddresses ?? (_ipAddresses = new List<string>());
            set => _ipAddresses = value;
        }

        /// <summary>
        /// The Internet service provider (ISP).
        /// </summary>
        [Input("isp")]
        public string? Isp { get; set; }

        /// <summary>
        /// The lock reason.
        /// </summary>
        [Input("lockReason")]
        public string? LockReason { get; set; }

        /// <summary>
        /// A regex string to filter results by Address name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The billing method of the EIP.
        /// </summary>
        [Input("paymentType")]
        public string? PaymentType { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The IDs of the contiguous EIPs.
        /// </summary>
        [Input("segmentInstanceId")]
        public string? SegmentInstanceId { get; set; }

        /// <summary>
        /// The status of the EIP.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        public GetEipAddressesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetEipAddressesResult
    {
        public readonly string? AddressName;
        public readonly ImmutableArray<Outputs.GetEipAddressesAddressResult> Addresses;
        public readonly string? AssociatedInstanceId;
        public readonly string? AssociatedInstanceType;
        public readonly bool? DryRun;
        public readonly ImmutableArray<Outputs.GetEipAddressesEipResult> Eips;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly bool? IncludeReservationData;
        public readonly string? IpAddress;
        public readonly ImmutableArray<string> IpAddresses;
        public readonly string? Isp;
        public readonly string? LockReason;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? PaymentType;
        public readonly string? ResourceGroupId;
        public readonly string? SegmentInstanceId;
        public readonly string? Status;
        public readonly ImmutableDictionary<string, object>? Tags;

        [OutputConstructor]
        private GetEipAddressesResult(
            string? addressName,

            ImmutableArray<Outputs.GetEipAddressesAddressResult> addresses,

            string? associatedInstanceId,

            string? associatedInstanceType,

            bool? dryRun,

            ImmutableArray<Outputs.GetEipAddressesEipResult> eips,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            bool? includeReservationData,

            string? ipAddress,

            ImmutableArray<string> ipAddresses,

            string? isp,

            string? lockReason,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? paymentType,

            string? resourceGroupId,

            string? segmentInstanceId,

            string? status,

            ImmutableDictionary<string, object>? tags)
        {
            AddressName = addressName;
            Addresses = addresses;
            AssociatedInstanceId = associatedInstanceId;
            AssociatedInstanceType = associatedInstanceType;
            DryRun = dryRun;
            Eips = eips;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            IncludeReservationData = includeReservationData;
            IpAddress = ipAddress;
            IpAddresses = ipAddresses;
            Isp = isp;
            LockReason = lockReason;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PaymentType = paymentType;
            ResourceGroupId = resourceGroupId;
            SegmentInstanceId = segmentInstanceId;
            Status = status;
            Tags = tags;
        }
    }
}
