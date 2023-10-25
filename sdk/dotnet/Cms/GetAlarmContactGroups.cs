// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms
{
    public static class GetAlarmContactGroups
    {
        /// <summary>
        /// This data source provides the CMS Groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.101.0+.
        /// </summary>
        public static Task<GetAlarmContactGroupsResult> InvokeAsync(GetAlarmContactGroupsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAlarmContactGroupsResult>("alicloud:cms/getAlarmContactGroups:getAlarmContactGroups", args ?? new GetAlarmContactGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the CMS Groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.101.0+.
        /// </summary>
        public static Output<GetAlarmContactGroupsResult> Invoke(GetAlarmContactGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlarmContactGroupsResult>("alicloud:cms/getAlarmContactGroups:getAlarmContactGroups", args ?? new GetAlarmContactGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAlarmContactGroupsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Alarm Contact Group IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Alarm Contact Group name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetAlarmContactGroupsArgs()
        {
        }
        public static new GetAlarmContactGroupsArgs Empty => new GetAlarmContactGroupsArgs();
    }

    public sealed class GetAlarmContactGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Alarm Contact Group IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Alarm Contact Group name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetAlarmContactGroupsInvokeArgs()
        {
        }
        public static new GetAlarmContactGroupsInvokeArgs Empty => new GetAlarmContactGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAlarmContactGroupsResult
    {
        public readonly ImmutableArray<Outputs.GetAlarmContactGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetAlarmContactGroupsResult(
            ImmutableArray<Outputs.GetAlarmContactGroupsGroupResult> groups,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Groups = groups;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
