// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn
{
    public static class GetCustomerGateways
    {
        /// <summary>
        /// The VPN customers gateways data source lists a number of VPN customer gateways resource information owned by an Alicloud account.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCustomerGatewaysResult> InvokeAsync(GetCustomerGatewaysArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCustomerGatewaysResult>("alicloud:vpn/getCustomerGateways:getCustomerGateways", args ?? new GetCustomerGatewaysArgs(), options.WithVersion());
    }


    public sealed class GetCustomerGatewaysArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// ID of the VPN customer gateways.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string of VPN customer gateways name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// Save the result to the file.
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetCustomerGatewaysArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetCustomerGatewaysResult
    {
        /// <summary>
        /// A list of VPN customer gateways. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCustomerGatewaysGatewayResult> Gateways;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetCustomerGatewaysResult(
            ImmutableArray<Outputs.GetCustomerGatewaysGatewayResult> gateways,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Gateways = gateways;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
