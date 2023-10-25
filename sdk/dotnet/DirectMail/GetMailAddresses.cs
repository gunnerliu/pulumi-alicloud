// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DirectMail
{
    public static class GetMailAddresses
    {
        /// <summary>
        /// This data source provides the Direct Mail Mail Addresses of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
        /// </summary>
        public static Task<GetMailAddressesResult> InvokeAsync(GetMailAddressesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMailAddressesResult>("alicloud:directmail/getMailAddresses:getMailAddresses", args ?? new GetMailAddressesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Direct Mail Mail Addresses of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
        /// </summary>
        public static Output<GetMailAddressesResult> Invoke(GetMailAddressesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMailAddressesResult>("alicloud:directmail/getMailAddresses:getMailAddresses", args ?? new GetMailAddressesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMailAddressesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Mail Address IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The key word about account email address.
        /// </summary>
        [Input("keyWord")]
        public string? KeyWord { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Account type.
        /// </summary>
        [Input("sendtype")]
        public string? Sendtype { get; set; }

        /// <summary>
        /// Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetMailAddressesArgs()
        {
        }
        public static new GetMailAddressesArgs Empty => new GetMailAddressesArgs();
    }

    public sealed class GetMailAddressesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Mail Address IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The key word about account email address.
        /// </summary>
        [Input("keyWord")]
        public Input<string>? KeyWord { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Account type.
        /// </summary>
        [Input("sendtype")]
        public Input<string>? Sendtype { get; set; }

        /// <summary>
        /// Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetMailAddressesInvokeArgs()
        {
        }
        public static new GetMailAddressesInvokeArgs Empty => new GetMailAddressesInvokeArgs();
    }


    [OutputType]
    public sealed class GetMailAddressesResult
    {
        public readonly ImmutableArray<Outputs.GetMailAddressesAddressResult> Addresses;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? KeyWord;
        public readonly string? OutputFile;
        public readonly string? Sendtype;
        public readonly string? Status;

        [OutputConstructor]
        private GetMailAddressesResult(
            ImmutableArray<Outputs.GetMailAddressesAddressResult> addresses,

            string id,

            ImmutableArray<string> ids,

            string? keyWord,

            string? outputFile,

            string? sendtype,

            string? status)
        {
            Addresses = addresses;
            Id = id;
            Ids = ids;
            KeyWord = keyWord;
            OutputFile = outputFile;
            Sendtype = sendtype;
            Status = status;
        }
    }
}
