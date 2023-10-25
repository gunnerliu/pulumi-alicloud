// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetTransitRouterAvailableResources
    {
        /// <summary>
        /// This data source provides the Cen Transit Router Available Resources of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.163.0+.
        /// </summary>
        public static Task<GetTransitRouterAvailableResourcesResult> InvokeAsync(GetTransitRouterAvailableResourcesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTransitRouterAvailableResourcesResult>("alicloud:cen/getTransitRouterAvailableResources:getTransitRouterAvailableResources", args ?? new GetTransitRouterAvailableResourcesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cen Transit Router Available Resources of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.163.0+.
        /// </summary>
        public static Output<GetTransitRouterAvailableResourcesResult> Invoke(GetTransitRouterAvailableResourcesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTransitRouterAvailableResourcesResult>("alicloud:cen/getTransitRouterAvailableResources:getTransitRouterAvailableResources", args ?? new GetTransitRouterAvailableResourcesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTransitRouterAvailableResourcesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetTransitRouterAvailableResourcesArgs()
        {
        }
        public static new GetTransitRouterAvailableResourcesArgs Empty => new GetTransitRouterAvailableResourcesArgs();
    }

    public sealed class GetTransitRouterAvailableResourcesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetTransitRouterAvailableResourcesInvokeArgs()
        {
        }
        public static new GetTransitRouterAvailableResourcesInvokeArgs Empty => new GetTransitRouterAvailableResourcesInvokeArgs();
    }


    [OutputType]
    public sealed class GetTransitRouterAvailableResourcesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetTransitRouterAvailableResourcesResourceResult> Resources;

        [OutputConstructor]
        private GetTransitRouterAvailableResourcesResult(
            string id,

            string? outputFile,

            ImmutableArray<Outputs.GetTransitRouterAvailableResourcesResourceResult> resources)
        {
            Id = id;
            OutputFile = outputFile;
            Resources = resources;
        }
    }
}
