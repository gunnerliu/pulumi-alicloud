// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MongoDB
{
    /// <summary>
    /// Provides a MongoDB Serverless Instance resource.
    /// 
    /// For information about MongoDB Serverless Instance and how to use it, see [What is Serverless Instance](https://www.alibabacloud.com/help/doc-detail/26558.html).
    /// 
    /// &gt; **NOTE:** Available in v1.148.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultZones = AliCloud.MongoDB.GetZones.Invoke();
    /// 
    ///     var defaultNetworks = AliCloud.Vpc.GetNetworks.Invoke(new()
    ///     {
    ///         NameRegex = "default-NODELETING",
    ///     });
    /// 
    ///     var defaultSwitches = AliCloud.Vpc.GetSwitches.Invoke(new()
    ///     {
    ///         VpcId = defaultNetworks.Apply(getNetworksResult =&gt; getNetworksResult.Ids[0]),
    ///         ZoneId = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///     });
    /// 
    ///     var defaultResourceGroups = AliCloud.ResourceManager.GetResourceGroups.Invoke();
    /// 
    ///     var example = new AliCloud.MongoDB.ServerlessInstance("example", new()
    ///     {
    ///         AccountPassword = "Abc12345",
    ///         DbInstanceDescription = "example_value",
    ///         DbInstanceStorage = 5,
    ///         StorageEngine = "WiredTiger",
    ///         CapacityUnit = 100,
    ///         Engine = "MongoDB",
    ///         ResourceGroupId = defaultResourceGroups.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Groups[0]?.Id),
    ///         EngineVersion = "4.2",
    ///         Period = 1,
    ///         PeriodPriceType = "Month",
    ///         VpcId = defaultNetworks.Apply(getNetworksResult =&gt; getNetworksResult.Ids[0]),
    ///         ZoneId = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         VswitchId = defaultSwitches.Apply(getSwitchesResult =&gt; getSwitchesResult.Ids[0]),
    ///         Tags = 
    ///         {
    ///             { "Created", "MongodbServerlessInstance" },
    ///             { "For", "TF" },
    ///         },
    ///         SecurityIpGroups = new[]
    ///         {
    ///             new AliCloud.MongoDB.Inputs.ServerlessInstanceSecurityIpGroupArgs
    ///             {
    ///                 SecurityIpGroupAttribute = "example_value",
    ///                 SecurityIpGroupName = "example_value",
    ///                 SecurityIpList = "192.168.0.1",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// MongoDB Serverless Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:mongodb/serverlessInstance:ServerlessInstance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:mongodb/serverlessInstance:ServerlessInstance")]
    public partial class ServerlessInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The password of the database logon account.
        /// * The password length is `8` to `32` bits.
        /// * The password consists of at least any three of uppercase letters, lowercase letters, numbers, and special characters. The special character is `!#$%^&amp;*()_+-=`. The MongoDB Serverless instance provides a default database login account. This account cannot be modified. You can only set or modify the password for this account.
        /// </summary>
        [Output("accountPassword")]
        public Output<string> AccountPassword { get; private set; } = null!;

        /// <summary>
        /// Set whether the instance is automatically renewed.
        /// </summary>
        [Output("autoRenew")]
        public Output<bool?> AutoRenew { get; private set; } = null!;

        /// <summary>
        /// The I/O throughput consumed by the instance. Valid values: `100` to `8000`.
        /// </summary>
        [Output("capacityUnit")]
        public Output<int> CapacityUnit { get; private set; } = null!;

        /// <summary>
        /// The db instance description.
        /// </summary>
        [Output("dbInstanceDescription")]
        public Output<string?> DbInstanceDescription { get; private set; } = null!;

        /// <summary>
        /// The db instance storage. Valid values: `1` to `100`.
        /// </summary>
        [Output("dbInstanceStorage")]
        public Output<int> DbInstanceStorage { get; private set; } = null!;

        /// <summary>
        /// The database engine of the instance. Valid values: `MongoDB`.
        /// </summary>
        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// The database version number. Valid values: `4.2`.
        /// </summary>
        [Output("engineVersion")]
        public Output<string> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// The end time of the maintenance window. Specify the time in the `HH:mmZ` format. The time must be in UTC. **NOTE:** The difference between the start time and end time must be one hour. For example, if `maintain_start_time` is `01:00Z`, `maintain_end_time` must be `02:00Z`.
        /// </summary>
        [Output("maintainEndTime")]
        public Output<string> MaintainEndTime { get; private set; } = null!;

        /// <summary>
        /// The start time of the maintenance window. Specify the time in the `HH:mmZ` format. The time must be in UTC.
        /// </summary>
        [Output("maintainStartTime")]
        public Output<string> MaintainStartTime { get; private set; } = null!;

        /// <summary>
        /// The purchase duration of the instance, in months. Valid values: `1` to `9`, `12`, `24`, `36`, `60`.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// The period price type. Valid values: `Day`, `Month`.
        /// </summary>
        [Output("periodPriceType")]
        public Output<string?> PeriodPriceType { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// An array that consists of the information of IP whitelists.
        /// </summary>
        [Output("securityIpGroups")]
        public Output<ImmutableArray<Outputs.ServerlessInstanceSecurityIpGroup>> SecurityIpGroups { get; private set; } = null!;

        /// <summary>
        /// The instance status. For more information, see the instance Status Table.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The storage engine used by the instance. Valid values: `WiredTiger`.
        /// </summary>
        [Output("storageEngine")]
        public Output<string> StorageEngine { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC network.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// The of the vswitch.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;

        /// <summary>
        /// The ID of the zone. Use this parameter to specify the zone created by the instance.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ServerlessInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServerlessInstance(string name, ServerlessInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:mongodb/serverlessInstance:ServerlessInstance", name, args ?? new ServerlessInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServerlessInstance(string name, Input<string> id, ServerlessInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:mongodb/serverlessInstance:ServerlessInstance", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "accountPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ServerlessInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServerlessInstance Get(string name, Input<string> id, ServerlessInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new ServerlessInstance(name, id, state, options);
        }
    }

    public sealed class ServerlessInstanceArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountPassword", required: true)]
        private Input<string>? _accountPassword;

        /// <summary>
        /// The password of the database logon account.
        /// * The password length is `8` to `32` bits.
        /// * The password consists of at least any three of uppercase letters, lowercase letters, numbers, and special characters. The special character is `!#$%^&amp;*()_+-=`. The MongoDB Serverless instance provides a default database login account. This account cannot be modified. You can only set or modify the password for this account.
        /// </summary>
        public Input<string>? AccountPassword
        {
            get => _accountPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Set whether the instance is automatically renewed.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// The I/O throughput consumed by the instance. Valid values: `100` to `8000`.
        /// </summary>
        [Input("capacityUnit", required: true)]
        public Input<int> CapacityUnit { get; set; } = null!;

        /// <summary>
        /// The db instance description.
        /// </summary>
        [Input("dbInstanceDescription")]
        public Input<string>? DbInstanceDescription { get; set; }

        /// <summary>
        /// The db instance storage. Valid values: `1` to `100`.
        /// </summary>
        [Input("dbInstanceStorage", required: true)]
        public Input<int> DbInstanceStorage { get; set; } = null!;

        /// <summary>
        /// The database engine of the instance. Valid values: `MongoDB`.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// The database version number. Valid values: `4.2`.
        /// </summary>
        [Input("engineVersion", required: true)]
        public Input<string> EngineVersion { get; set; } = null!;

        /// <summary>
        /// The end time of the maintenance window. Specify the time in the `HH:mmZ` format. The time must be in UTC. **NOTE:** The difference between the start time and end time must be one hour. For example, if `maintain_start_time` is `01:00Z`, `maintain_end_time` must be `02:00Z`.
        /// </summary>
        [Input("maintainEndTime")]
        public Input<string>? MaintainEndTime { get; set; }

        /// <summary>
        /// The start time of the maintenance window. Specify the time in the `HH:mmZ` format. The time must be in UTC.
        /// </summary>
        [Input("maintainStartTime")]
        public Input<string>? MaintainStartTime { get; set; }

        /// <summary>
        /// The purchase duration of the instance, in months. Valid values: `1` to `9`, `12`, `24`, `36`, `60`.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The period price type. Valid values: `Day`, `Month`.
        /// </summary>
        [Input("periodPriceType")]
        public Input<string>? PeriodPriceType { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("securityIpGroups")]
        private InputList<Inputs.ServerlessInstanceSecurityIpGroupArgs>? _securityIpGroups;

        /// <summary>
        /// An array that consists of the information of IP whitelists.
        /// </summary>
        public InputList<Inputs.ServerlessInstanceSecurityIpGroupArgs> SecurityIpGroups
        {
            get => _securityIpGroups ?? (_securityIpGroups = new InputList<Inputs.ServerlessInstanceSecurityIpGroupArgs>());
            set => _securityIpGroups = value;
        }

        /// <summary>
        /// The storage engine used by the instance. Valid values: `WiredTiger`.
        /// </summary>
        [Input("storageEngine")]
        public Input<string>? StorageEngine { get; set; }

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
        /// The ID of the VPC network.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// The of the vswitch.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        /// <summary>
        /// The ID of the zone. Use this parameter to specify the zone created by the instance.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ServerlessInstanceArgs()
        {
        }
        public static new ServerlessInstanceArgs Empty => new ServerlessInstanceArgs();
    }

    public sealed class ServerlessInstanceState : global::Pulumi.ResourceArgs
    {
        [Input("accountPassword")]
        private Input<string>? _accountPassword;

        /// <summary>
        /// The password of the database logon account.
        /// * The password length is `8` to `32` bits.
        /// * The password consists of at least any three of uppercase letters, lowercase letters, numbers, and special characters. The special character is `!#$%^&amp;*()_+-=`. The MongoDB Serverless instance provides a default database login account. This account cannot be modified. You can only set or modify the password for this account.
        /// </summary>
        public Input<string>? AccountPassword
        {
            get => _accountPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Set whether the instance is automatically renewed.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// The I/O throughput consumed by the instance. Valid values: `100` to `8000`.
        /// </summary>
        [Input("capacityUnit")]
        public Input<int>? CapacityUnit { get; set; }

        /// <summary>
        /// The db instance description.
        /// </summary>
        [Input("dbInstanceDescription")]
        public Input<string>? DbInstanceDescription { get; set; }

        /// <summary>
        /// The db instance storage. Valid values: `1` to `100`.
        /// </summary>
        [Input("dbInstanceStorage")]
        public Input<int>? DbInstanceStorage { get; set; }

        /// <summary>
        /// The database engine of the instance. Valid values: `MongoDB`.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// The database version number. Valid values: `4.2`.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// The end time of the maintenance window. Specify the time in the `HH:mmZ` format. The time must be in UTC. **NOTE:** The difference between the start time and end time must be one hour. For example, if `maintain_start_time` is `01:00Z`, `maintain_end_time` must be `02:00Z`.
        /// </summary>
        [Input("maintainEndTime")]
        public Input<string>? MaintainEndTime { get; set; }

        /// <summary>
        /// The start time of the maintenance window. Specify the time in the `HH:mmZ` format. The time must be in UTC.
        /// </summary>
        [Input("maintainStartTime")]
        public Input<string>? MaintainStartTime { get; set; }

        /// <summary>
        /// The purchase duration of the instance, in months. Valid values: `1` to `9`, `12`, `24`, `36`, `60`.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The period price type. Valid values: `Day`, `Month`.
        /// </summary>
        [Input("periodPriceType")]
        public Input<string>? PeriodPriceType { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("securityIpGroups")]
        private InputList<Inputs.ServerlessInstanceSecurityIpGroupGetArgs>? _securityIpGroups;

        /// <summary>
        /// An array that consists of the information of IP whitelists.
        /// </summary>
        public InputList<Inputs.ServerlessInstanceSecurityIpGroupGetArgs> SecurityIpGroups
        {
            get => _securityIpGroups ?? (_securityIpGroups = new InputList<Inputs.ServerlessInstanceSecurityIpGroupGetArgs>());
            set => _securityIpGroups = value;
        }

        /// <summary>
        /// The instance status. For more information, see the instance Status Table.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The storage engine used by the instance. Valid values: `WiredTiger`.
        /// </summary>
        [Input("storageEngine")]
        public Input<string>? StorageEngine { get; set; }

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
        /// The ID of the VPC network.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The of the vswitch.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The ID of the zone. Use this parameter to specify the zone created by the instance.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ServerlessInstanceState()
        {
        }
        public static new ServerlessInstanceState Empty => new ServerlessInstanceState();
    }
}
