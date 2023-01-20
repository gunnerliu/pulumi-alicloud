// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Edas
{
    public static class GetDeployGroups
    {
        /// <summary>
        /// This data source provides a list of EDAS deploy groups in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.82.0+
        /// </summary>
        public static Task<GetDeployGroupsResult> InvokeAsync(GetDeployGroupsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDeployGroupsResult>("alicloud:edas/getDeployGroups:getDeployGroups", args ?? new GetDeployGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of EDAS deploy groups in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.82.0+
        /// </summary>
        public static Output<GetDeployGroupsResult> Invoke(GetDeployGroupsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeployGroupsResult>("alicloud:edas/getDeployGroups:getDeployGroups", args ?? new GetDeployGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeployGroupsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the EDAS application.
        /// </summary>
        [Input("appId", required: true)]
        public string AppId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by the deploy group name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetDeployGroupsArgs()
        {
        }
        public static new GetDeployGroupsArgs Empty => new GetDeployGroupsArgs();
    }

    public sealed class GetDeployGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the EDAS application.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by the deploy group name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetDeployGroupsInvokeArgs()
        {
        }
        public static new GetDeployGroupsInvokeArgs Empty => new GetDeployGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDeployGroupsResult
    {
        /// <summary>
        /// The ID of the application that you want to deploy.
        /// </summary>
        public readonly string AppId;
        /// <summary>
        /// A list of consumer group ids.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeployGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of deploy group names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetDeployGroupsResult(
            string appId,

            ImmutableArray<Outputs.GetDeployGroupsGroupResult> groups,

            string id,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            AppId = appId;
            Groups = groups;
            Id = id;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
