// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CR
{
    public static class GetEndpointAclPolicies
    {
        /// <summary>
        /// This data source provides the Cr Endpoint Acl Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.139.0+.
        /// </summary>
        public static Task<GetEndpointAclPoliciesResult> InvokeAsync(GetEndpointAclPoliciesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEndpointAclPoliciesResult>("alicloud:cr/getEndpointAclPolicies:getEndpointAclPolicies", args ?? new GetEndpointAclPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cr Endpoint Acl Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.139.0+.
        /// </summary>
        public static Output<GetEndpointAclPoliciesResult> Invoke(GetEndpointAclPoliciesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEndpointAclPoliciesResult>("alicloud:cr/getEndpointAclPolicies:getEndpointAclPolicies", args ?? new GetEndpointAclPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEndpointAclPoliciesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of endpoint.
        /// </summary>
        [Input("endpointType", required: true)]
        public string EndpointType { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Endpoint Acl Policy IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the CR Instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetEndpointAclPoliciesArgs()
        {
        }
        public static new GetEndpointAclPoliciesArgs Empty => new GetEndpointAclPoliciesArgs();
    }

    public sealed class GetEndpointAclPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of endpoint.
        /// </summary>
        [Input("endpointType", required: true)]
        public Input<string> EndpointType { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Endpoint Acl Policy IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the CR Instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetEndpointAclPoliciesInvokeArgs()
        {
        }
        public static new GetEndpointAclPoliciesInvokeArgs Empty => new GetEndpointAclPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetEndpointAclPoliciesResult
    {
        public readonly string EndpointType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string InstanceId;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetEndpointAclPoliciesPolicyResult> Policies;

        [OutputConstructor]
        private GetEndpointAclPoliciesResult(
            string endpointType,

            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? outputFile,

            ImmutableArray<Outputs.GetEndpointAclPoliciesPolicyResult> policies)
        {
            EndpointType = endpointType;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            OutputFile = outputFile;
            Policies = policies;
        }
    }
}
