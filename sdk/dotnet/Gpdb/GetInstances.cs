// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gpdb
{
    public static class GetInstances
    {
        /// <summary>
        /// This data source provides the AnalyticDB for PostgreSQL instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:**  Available in 1.47.0+
        /// </summary>
        public static Task<GetInstancesResult> InvokeAsync(GetInstancesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstancesResult>("alicloud:gpdb/getInstances:getInstances", args ?? new GetInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the AnalyticDB for PostgreSQL instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:**  Available in 1.47.0+
        /// </summary>
        public static Output<GetInstancesResult> Invoke(GetInstancesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstancesResult>("alicloud:gpdb/getInstances:getInstances", args ?? new GetInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstancesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Instance availability zone.
        /// </summary>
        [Input("availabilityZone")]
        public string? AvailabilityZone { get; set; }

        /// <summary>
        /// The db instance categories.
        /// </summary>
        [Input("dbInstanceCategories")]
        public string? DbInstanceCategories { get; set; }

        /// <summary>
        /// The db instance modes.
        /// </summary>
        [Input("dbInstanceModes")]
        public string? DbInstanceModes { get; set; }

        /// <summary>
        /// The description of the instance.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// The ids list of AnalyticDB for PostgreSQL instances.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The network type of the instance.
        /// </summary>
        [Input("instanceNetworkType")]
        public string? InstanceNetworkType { get; set; }

        /// <summary>
        /// A regex string to apply to the instance name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the enterprise resource group to which the instance belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of the instance. Valid values: `Creating`, `DBInstanceClassChanging`, `DBInstanceNetTypeChanging`, `Deleting`, `EngineVersionUpgrading`, `GuardDBInstanceCreating`, `GuardSwitching`, `Importing`, `ImportingFromOtherInstance`, `Rebooting`, `Restoring`, `Running`, `Transfering`, `TransferingToOtherInstance`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// The tags of the instance.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        /// <summary>
        /// The vswitch id.
        /// </summary>
        [Input("vswitchId")]
        public string? VswitchId { get; set; }

        public GetInstancesArgs()
        {
        }
        public static new GetInstancesArgs Empty => new GetInstancesArgs();
    }

    public sealed class GetInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Instance availability zone.
        /// </summary>
        [Input("availabilityZone")]
        public Input<string>? AvailabilityZone { get; set; }

        /// <summary>
        /// The db instance categories.
        /// </summary>
        [Input("dbInstanceCategories")]
        public Input<string>? DbInstanceCategories { get; set; }

        /// <summary>
        /// The db instance modes.
        /// </summary>
        [Input("dbInstanceModes")]
        public Input<string>? DbInstanceModes { get; set; }

        /// <summary>
        /// The description of the instance.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// The ids list of AnalyticDB for PostgreSQL instances.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The network type of the instance.
        /// </summary>
        [Input("instanceNetworkType")]
        public Input<string>? InstanceNetworkType { get; set; }

        /// <summary>
        /// A regex string to apply to the instance name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the enterprise resource group to which the instance belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of the instance. Valid values: `Creating`, `DBInstanceClassChanging`, `DBInstanceNetTypeChanging`, `Deleting`, `EngineVersionUpgrading`, `GuardDBInstanceCreating`, `GuardSwitching`, `Importing`, `ImportingFromOtherInstance`, `Rebooting`, `Restoring`, `Running`, `Transfering`, `TransferingToOtherInstance`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// The tags of the instance.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The vswitch id.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public GetInstancesInvokeArgs()
        {
        }
        public static new GetInstancesInvokeArgs Empty => new GetInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstancesResult
    {
        public readonly string? AvailabilityZone;
        public readonly string? DbInstanceCategories;
        public readonly string? DbInstanceModes;
        public readonly string? Description;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? InstanceNetworkType;
        public readonly ImmutableArray<Outputs.GetInstancesInstanceResult> Instances;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? ResourceGroupId;
        public readonly string? Status;
        public readonly ImmutableDictionary<string, object>? Tags;
        public readonly string? VswitchId;

        [OutputConstructor]
        private GetInstancesResult(
            string? availabilityZone,

            string? dbInstanceCategories,

            string? dbInstanceModes,

            string? description,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? instanceNetworkType,

            ImmutableArray<Outputs.GetInstancesInstanceResult> instances,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? resourceGroupId,

            string? status,

            ImmutableDictionary<string, object>? tags,

            string? vswitchId)
        {
            AvailabilityZone = availabilityZone;
            DbInstanceCategories = dbInstanceCategories;
            DbInstanceModes = dbInstanceModes;
            Description = description;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            InstanceNetworkType = instanceNetworkType;
            Instances = instances;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            Status = status;
            Tags = tags;
            VswitchId = vswitchId;
        }
    }
}
