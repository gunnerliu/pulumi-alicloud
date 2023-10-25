// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    public static class GetDomainExtensions
    {
        /// <summary>
        /// This data source provides the domain extensions associated with a server load balancer listener.
        /// 
        /// &gt; **NOTE:** Available in 1.60.0+
        /// </summary>
        public static Task<GetDomainExtensionsResult> InvokeAsync(GetDomainExtensionsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDomainExtensionsResult>("alicloud:slb/getDomainExtensions:getDomainExtensions", args ?? new GetDomainExtensionsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the domain extensions associated with a server load balancer listener.
        /// 
        /// &gt; **NOTE:** Available in 1.60.0+
        /// </summary>
        public static Output<GetDomainExtensionsResult> Invoke(GetDomainExtensionsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainExtensionsResult>("alicloud:slb/getDomainExtensions:getDomainExtensions", args ?? new GetDomainExtensionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDomainExtensionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
        /// </summary>
        [Input("frontendPort", required: true)]
        public int FrontendPort { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// IDs of the SLB domain extensions.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the SLB instance.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public string LoadBalancerId { get; set; } = null!;

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetDomainExtensionsArgs()
        {
        }
        public static new GetDomainExtensionsArgs Empty => new GetDomainExtensionsArgs();
    }

    public sealed class GetDomainExtensionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
        /// </summary>
        [Input("frontendPort", required: true)]
        public Input<int> FrontendPort { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// IDs of the SLB domain extensions.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the SLB instance.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public Input<string> LoadBalancerId { get; set; } = null!;

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetDomainExtensionsInvokeArgs()
        {
        }
        public static new GetDomainExtensionsInvokeArgs Empty => new GetDomainExtensionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDomainExtensionsResult
    {
        /// <summary>
        /// A list of SLB domain extension. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainExtensionsExtensionResult> Extensions;
        public readonly int FrontendPort;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string LoadBalancerId;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetDomainExtensionsResult(
            ImmutableArray<Outputs.GetDomainExtensionsExtensionResult> extensions,

            int frontendPort,

            string id,

            ImmutableArray<string> ids,

            string loadBalancerId,

            string? outputFile)
        {
            Extensions = extensions;
            FrontendPort = frontendPort;
            Id = id;
            Ids = ids;
            LoadBalancerId = loadBalancerId;
            OutputFile = outputFile;
        }
    }
}
