// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Iot
{
    public static class GetDeviceGroups
    {
        /// <summary>
        /// This data source provides the Iot Device Groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
        /// </summary>
        public static Task<GetDeviceGroupsResult> InvokeAsync(GetDeviceGroupsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDeviceGroupsResult>("alicloud:iot/getDeviceGroups:getDeviceGroups", args ?? new GetDeviceGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Iot Device Groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
        /// </summary>
        public static Output<GetDeviceGroupsResult> Invoke(GetDeviceGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeviceGroupsResult>("alicloud:iot/getDeviceGroups:getDeviceGroups", args ?? new GetDeviceGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeviceGroupsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        /// <summary>
        /// The GroupName of the device group.
        /// </summary>
        [Input("groupName")]
        public string? GroupName { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of device group IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The id of the Iot Instance.
        /// </summary>
        [Input("iotInstanceId")]
        public string? IotInstanceId { get; set; }

        /// <summary>
        /// A regex string to filter CEN instances by name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The id of the SuperGroup.
        /// </summary>
        [Input("superGroupId")]
        public string? SuperGroupId { get; set; }

        public GetDeviceGroupsArgs()
        {
        }
        public static new GetDeviceGroupsArgs Empty => new GetDeviceGroupsArgs();
    }

    public sealed class GetDeviceGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        /// <summary>
        /// The GroupName of the device group.
        /// </summary>
        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of device group IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The id of the Iot Instance.
        /// </summary>
        [Input("iotInstanceId")]
        public Input<string>? IotInstanceId { get; set; }

        /// <summary>
        /// A regex string to filter CEN instances by name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The id of the SuperGroup.
        /// </summary>
        [Input("superGroupId")]
        public Input<string>? SuperGroupId { get; set; }

        public GetDeviceGroupsInvokeArgs()
        {
        }
        public static new GetDeviceGroupsInvokeArgs Empty => new GetDeviceGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDeviceGroupsResult
    {
        public readonly bool? EnableDetails;
        public readonly string? GroupName;
        public readonly ImmutableArray<Outputs.GetDeviceGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? IotInstanceId;
        public readonly string? NameRegex;
        public readonly string? OutputFile;
        public readonly string? SuperGroupId;

        [OutputConstructor]
        private GetDeviceGroupsResult(
            bool? enableDetails,

            string? groupName,

            ImmutableArray<Outputs.GetDeviceGroupsGroupResult> groups,

            string id,

            ImmutableArray<string> ids,

            string? iotInstanceId,

            string? nameRegex,

            string? outputFile,

            string? superGroupId)
        {
            EnableDetails = enableDetails;
            GroupName = groupName;
            Groups = groups;
            Id = id;
            Ids = ids;
            IotInstanceId = iotInstanceId;
            NameRegex = nameRegex;
            OutputFile = outputFile;
            SuperGroupId = superGroupId;
        }
    }
}
