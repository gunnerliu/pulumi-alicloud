// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dms
{
    public static class GetEnterpriseProxyAccesses
    {
        /// <summary>
        /// This data source provides DMS Enterprise Proxy Access available to the user.[What is Proxy Access](https://next.api.alibabacloud.com/document/dms-enterprise/2018-11-01/CreateProxyAccess)
        /// 
        /// &gt; **NOTE:** Available since v1.195.0.
        /// </summary>
        public static Task<GetEnterpriseProxyAccessesResult> InvokeAsync(GetEnterpriseProxyAccessesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEnterpriseProxyAccessesResult>("alicloud:dms/getEnterpriseProxyAccesses:getEnterpriseProxyAccesses", args ?? new GetEnterpriseProxyAccessesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides DMS Enterprise Proxy Access available to the user.[What is Proxy Access](https://next.api.alibabacloud.com/document/dms-enterprise/2018-11-01/CreateProxyAccess)
        /// 
        /// &gt; **NOTE:** Available since v1.195.0.
        /// </summary>
        public static Output<GetEnterpriseProxyAccessesResult> Invoke(GetEnterpriseProxyAccessesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEnterpriseProxyAccessesResult>("alicloud:dms/getEnterpriseProxyAccesses:getEnterpriseProxyAccesses", args ?? new GetEnterpriseProxyAccessesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEnterpriseProxyAccessesArgs : global::Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Proxy Access IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the security agent.
        /// </summary>
        [Input("proxyId", required: true)]
        public string ProxyId { get; set; } = null!;

        public GetEnterpriseProxyAccessesArgs()
        {
        }
        public static new GetEnterpriseProxyAccessesArgs Empty => new GetEnterpriseProxyAccessesArgs();
    }

    public sealed class GetEnterpriseProxyAccessesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Proxy Access IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the security agent.
        /// </summary>
        [Input("proxyId", required: true)]
        public Input<string> ProxyId { get; set; } = null!;

        public GetEnterpriseProxyAccessesInvokeArgs()
        {
        }
        public static new GetEnterpriseProxyAccessesInvokeArgs Empty => new GetEnterpriseProxyAccessesInvokeArgs();
    }


    [OutputType]
    public sealed class GetEnterpriseProxyAccessesResult
    {
        /// <summary>
        /// A list of Proxy Access Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnterpriseProxyAccessesAccessResult> Accesses;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Proxy Access IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        /// <summary>
        /// The ID of the security agent.
        /// </summary>
        public readonly string ProxyId;

        [OutputConstructor]
        private GetEnterpriseProxyAccessesResult(
            ImmutableArray<Outputs.GetEnterpriseProxyAccessesAccessResult> accesses,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string proxyId)
        {
            Accesses = accesses;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            ProxyId = proxyId;
        }
    }
}
