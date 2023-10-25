// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.EipAnycast
{
    public static class GetAnycastEipAddresses
    {
        /// <summary>
        /// This data source provides the Eipanycast Anycast Eip Addresses of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.113.0+.
        /// </summary>
        public static Task<GetAnycastEipAddressesResult> InvokeAsync(GetAnycastEipAddressesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAnycastEipAddressesResult>("alicloud:eipanycast/getAnycastEipAddresses:getAnycastEipAddresses", args ?? new GetAnycastEipAddressesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Eipanycast Anycast Eip Addresses of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.113.0+.
        /// </summary>
        public static Output<GetAnycastEipAddressesResult> Invoke(GetAnycastEipAddressesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAnycastEipAddressesResult>("alicloud:eipanycast/getAnycastEipAddresses:getAnycastEipAddresses", args ?? new GetAnycastEipAddressesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAnycastEipAddressesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Anycast EIP instance name.
        /// </summary>
        [Input("anycastEipAddressName")]
        public string? AnycastEipAddressName { get; set; }

        [Input("bindInstanceIds")]
        private List<string>? _bindInstanceIds;

        /// <summary>
        /// The bind instance ids.
        /// </summary>
        public List<string> BindInstanceIds
        {
            get => _bindInstanceIds ?? (_bindInstanceIds = new List<string>());
            set => _bindInstanceIds = value;
        }

        /// <summary>
        /// The business status of the Anycast EIP instance. -`Normal`: Normal state. -`FinancialLocked`: The status of arrears locked.
        /// </summary>
        [Input("businessStatus")]
        public string? BusinessStatus { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Anycast Eip Address IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The billing method of Anycast EIP instance. `PayByBandwidth`: refers to the method of billing based on traffic.
        /// </summary>
        [Input("internetChargeType")]
        public string? InternetChargeType { get; set; }

        /// <summary>
        /// Anycast EIP instance IP address.
        /// </summary>
        [Input("ipAddress")]
        public string? IpAddress { get; set; }

        /// <summary>
        /// A regex string to filter results by Anycast Eip Address name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The payment model of Anycast EIP instance. "PostPaid": Refers to the post-paid mode.
        /// </summary>
        [Input("paymentType")]
        public string? PaymentType { get; set; }

        /// <summary>
        /// Anycast EIP instance access area. "international": Refers to areas outside of Mainland China.
        /// </summary>
        [Input("serviceLocation")]
        public string? ServiceLocation { get; set; }

        /// <summary>
        /// IP status。- `Associating`, `Unassociating`, `Allocated`, `Associated`, `Modifying`, `Releasing`, `Released`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetAnycastEipAddressesArgs()
        {
        }
        public static new GetAnycastEipAddressesArgs Empty => new GetAnycastEipAddressesArgs();
    }

    public sealed class GetAnycastEipAddressesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Anycast EIP instance name.
        /// </summary>
        [Input("anycastEipAddressName")]
        public Input<string>? AnycastEipAddressName { get; set; }

        [Input("bindInstanceIds")]
        private InputList<string>? _bindInstanceIds;

        /// <summary>
        /// The bind instance ids.
        /// </summary>
        public InputList<string> BindInstanceIds
        {
            get => _bindInstanceIds ?? (_bindInstanceIds = new InputList<string>());
            set => _bindInstanceIds = value;
        }

        /// <summary>
        /// The business status of the Anycast EIP instance. -`Normal`: Normal state. -`FinancialLocked`: The status of arrears locked.
        /// </summary>
        [Input("businessStatus")]
        public Input<string>? BusinessStatus { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Anycast Eip Address IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The billing method of Anycast EIP instance. `PayByBandwidth`: refers to the method of billing based on traffic.
        /// </summary>
        [Input("internetChargeType")]
        public Input<string>? InternetChargeType { get; set; }

        /// <summary>
        /// Anycast EIP instance IP address.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// A regex string to filter results by Anycast Eip Address name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The payment model of Anycast EIP instance. "PostPaid": Refers to the post-paid mode.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// Anycast EIP instance access area. "international": Refers to areas outside of Mainland China.
        /// </summary>
        [Input("serviceLocation")]
        public Input<string>? ServiceLocation { get; set; }

        /// <summary>
        /// IP status。- `Associating`, `Unassociating`, `Allocated`, `Associated`, `Modifying`, `Releasing`, `Released`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetAnycastEipAddressesInvokeArgs()
        {
        }
        public static new GetAnycastEipAddressesInvokeArgs Empty => new GetAnycastEipAddressesInvokeArgs();
    }


    [OutputType]
    public sealed class GetAnycastEipAddressesResult
    {
        public readonly ImmutableArray<Outputs.GetAnycastEipAddressesAddressResult> Addresses;
        public readonly string? AnycastEipAddressName;
        public readonly ImmutableArray<string> BindInstanceIds;
        public readonly string? BusinessStatus;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? InternetChargeType;
        public readonly string? IpAddress;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? PaymentType;
        public readonly string? ServiceLocation;
        public readonly string? Status;

        [OutputConstructor]
        private GetAnycastEipAddressesResult(
            ImmutableArray<Outputs.GetAnycastEipAddressesAddressResult> addresses,

            string? anycastEipAddressName,

            ImmutableArray<string> bindInstanceIds,

            string? businessStatus,

            string id,

            ImmutableArray<string> ids,

            string? internetChargeType,

            string? ipAddress,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? paymentType,

            string? serviceLocation,

            string? status)
        {
            Addresses = addresses;
            AnycastEipAddressName = anycastEipAddressName;
            BindInstanceIds = bindInstanceIds;
            BusinessStatus = businessStatus;
            Id = id;
            Ids = ids;
            InternetChargeType = internetChargeType;
            IpAddress = ipAddress;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PaymentType = paymentType;
            ServiceLocation = serviceLocation;
            Status = status;
        }
    }
}
