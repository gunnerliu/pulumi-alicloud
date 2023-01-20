// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetSwitches
    {
        /// <summary>
        /// This data source provides a list of VSwitches owned by an Alibaba Cloud account.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "vswitchDatasourceName";
        ///     var defaultZones = AliCloud.GetZones.Invoke();
        /// 
        ///     var vpc = new AliCloud.Vpc.Network("vpc", new()
        ///     {
        ///         CidrBlock = "172.16.0.0/16",
        ///         VpcName = name,
        ///     });
        /// 
        ///     var vswitch = new AliCloud.Vpc.Switch("vswitch", new()
        ///     {
        ///         AvailabilityZone = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///         CidrBlock = "172.16.0.0/24",
        ///         VpcId = vpc.Id,
        ///         VswitchName = name,
        ///     });
        /// 
        ///     var defaultSwitches = AliCloud.Vpc.GetSwitches.Invoke(new()
        ///     {
        ///         NameRegex = vswitch.VswitchName,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSwitchesResult> InvokeAsync(GetSwitchesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSwitchesResult>("alicloud:vpc/getSwitches:getSwitches", args ?? new GetSwitchesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of VSwitches owned by an Alibaba Cloud account.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "vswitchDatasourceName";
        ///     var defaultZones = AliCloud.GetZones.Invoke();
        /// 
        ///     var vpc = new AliCloud.Vpc.Network("vpc", new()
        ///     {
        ///         CidrBlock = "172.16.0.0/16",
        ///         VpcName = name,
        ///     });
        /// 
        ///     var vswitch = new AliCloud.Vpc.Switch("vswitch", new()
        ///     {
        ///         AvailabilityZone = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///         CidrBlock = "172.16.0.0/24",
        ///         VpcId = vpc.Id,
        ///         VswitchName = name,
        ///     });
        /// 
        ///     var defaultSwitches = AliCloud.Vpc.GetSwitches.Invoke(new()
        ///     {
        ///         NameRegex = vswitch.VswitchName,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSwitchesResult> Invoke(GetSwitchesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSwitchesResult>("alicloud:vpc/getSwitches:getSwitches", args ?? new GetSwitchesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSwitchesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter results by a specific CIDR block. For example: "172.16.0.0/12".
        /// </summary>
        [Input("cidrBlock")]
        public string? CidrBlock { get; set; }

        /// <summary>
        /// Specifies whether to precheck this request only. Valid values: `true` and `false`.
        /// </summary>
        [Input("dryRun")]
        public bool? DryRun { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of VSwitch IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Indicate whether the VSwitch is created by the system.
        /// </summary>
        [Input("isDefault")]
        public bool? IsDefault { get; set; }

        /// <summary>
        /// A regex string to filter results by name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Id of resource group which VSWitch belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The route table ID of the VSwitch.
        /// </summary>
        [Input("routeTableId")]
        public string? RouteTableId { get; set; }

        /// <summary>
        /// The status of the VSwitch. Valid values: `Available` and `Pending`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        /// <summary>
        /// ID of the VPC that owns the VSwitch.
        /// </summary>
        [Input("vpcId")]
        public string? VpcId { get; set; }

        /// <summary>
        /// The name of the VSwitch.
        /// </summary>
        [Input("vswitchName")]
        public string? VswitchName { get; set; }

        /// <summary>
        /// The VSwitch owner id.
        /// </summary>
        [Input("vswitchOwnerId")]
        public int? VswitchOwnerId { get; set; }

        /// <summary>
        /// The availability zone of the VSwitch.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetSwitchesArgs()
        {
        }
        public static new GetSwitchesArgs Empty => new GetSwitchesArgs();
    }

    public sealed class GetSwitchesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter results by a specific CIDR block. For example: "172.16.0.0/12".
        /// </summary>
        [Input("cidrBlock")]
        public Input<string>? CidrBlock { get; set; }

        /// <summary>
        /// Specifies whether to precheck this request only. Valid values: `true` and `false`.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of VSwitch IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Indicate whether the VSwitch is created by the system.
        /// </summary>
        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        /// <summary>
        /// A regex string to filter results by name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The Id of resource group which VSWitch belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The route table ID of the VSwitch.
        /// </summary>
        [Input("routeTableId")]
        public Input<string>? RouteTableId { get; set; }

        /// <summary>
        /// The status of the VSwitch. Valid values: `Available` and `Pending`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// ID of the VPC that owns the VSwitch.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The name of the VSwitch.
        /// </summary>
        [Input("vswitchName")]
        public Input<string>? VswitchName { get; set; }

        /// <summary>
        /// The VSwitch owner id.
        /// </summary>
        [Input("vswitchOwnerId")]
        public Input<int>? VswitchOwnerId { get; set; }

        /// <summary>
        /// The availability zone of the VSwitch.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetSwitchesInvokeArgs()
        {
        }
        public static new GetSwitchesInvokeArgs Empty => new GetSwitchesInvokeArgs();
    }


    [OutputType]
    public sealed class GetSwitchesResult
    {
        /// <summary>
        /// CIDR block of the VSwitch.
        /// </summary>
        public readonly string? CidrBlock;
        public readonly bool? DryRun;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of VSwitch IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// Whether the VSwitch is the default one in the region.
        /// </summary>
        public readonly bool? IsDefault;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of VSwitch names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The resource group ID of the VSwitch.
        /// </summary>
        public readonly string? ResourceGroupId;
        /// <summary>
        /// The route table ID of the VSwitch.
        /// </summary>
        public readonly string? RouteTableId;
        /// <summary>
        /// The status of the VSwitch.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// The Tags of the VSwitch.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Tags;
        /// <summary>
        /// ID of the VPC that owns the VSwitch.
        /// </summary>
        public readonly string? VpcId;
        /// <summary>
        /// Name of the VSwitch.
        /// </summary>
        public readonly string? VswitchName;
        public readonly int? VswitchOwnerId;
        /// <summary>
        /// A list of VSwitches. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchesVswitchResult> Vswitches;
        /// <summary>
        /// ID of the availability zone where the VSwitch is located.
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetSwitchesResult(
            string? cidrBlock,

            bool? dryRun,

            string id,

            ImmutableArray<string> ids,

            bool? isDefault,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? resourceGroupId,

            string? routeTableId,

            string? status,

            ImmutableDictionary<string, object>? tags,

            string? vpcId,

            string? vswitchName,

            int? vswitchOwnerId,

            ImmutableArray<Outputs.GetSwitchesVswitchResult> vswitches,

            string? zoneId)
        {
            CidrBlock = cidrBlock;
            DryRun = dryRun;
            Id = id;
            Ids = ids;
            IsDefault = isDefault;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            RouteTableId = routeTableId;
            Status = status;
            Tags = tags;
            VpcId = vpcId;
            VswitchName = vswitchName;
            VswitchOwnerId = vswitchOwnerId;
            Vswitches = vswitches;
            ZoneId = zoneId;
        }
    }
}
