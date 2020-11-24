// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds
{
    /// <summary>
    /// Provides an RDS readonly instance resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var config = new Config();
    ///         var creation = config.Get("creation") ?? "Rds";
    ///         var name = config.Get("name") ?? "dbInstancevpc";
    ///         var defaultZones = Output.Create(AliCloud.GetZones.InvokeAsync(new AliCloud.GetZonesArgs
    ///         {
    ///             AvailableResourceCreation = creation,
    ///         }));
    ///         var defaultNetwork = new AliCloud.Vpc.Network("defaultNetwork", new AliCloud.Vpc.NetworkArgs
    ///         {
    ///             CidrBlock = "172.16.0.0/16",
    ///         });
    ///         var defaultSwitch = new AliCloud.Vpc.Switch("defaultSwitch", new AliCloud.Vpc.SwitchArgs
    ///         {
    ///             VpcId = defaultNetwork.Id,
    ///             CidrBlock = "172.16.0.0/24",
    ///             AvailabilityZone = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones[0].Id),
    ///         });
    ///         var defaultInstance = new AliCloud.Rds.Instance("defaultInstance", new AliCloud.Rds.InstanceArgs
    ///         {
    ///             Engine = "MySQL",
    ///             EngineVersion = "5.6",
    ///             InstanceType = "rds.mysql.t1.small",
    ///             InstanceStorage = 20,
    ///             InstanceChargeType = "Postpaid",
    ///             InstanceName = name,
    ///             VswitchId = defaultSwitch.Id,
    ///             SecurityIps = 
    ///             {
    ///                 "10.168.1.12",
    ///                 "100.69.7.112",
    ///             },
    ///         });
    ///         var defaultReadOnlyInstance = new AliCloud.Rds.ReadOnlyInstance("defaultReadOnlyInstance", new AliCloud.Rds.ReadOnlyInstanceArgs
    ///         {
    ///             MasterDbInstanceId = defaultInstance.Id,
    ///             ZoneId = defaultInstance.ZoneId,
    ///             EngineVersion = defaultInstance.EngineVersion,
    ///             InstanceType = defaultInstance.InstanceType,
    ///             InstanceStorage = 30,
    ///             InstanceName = $"{name}ro",
    ///             VswitchId = defaultSwitch.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// RDS readonly instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:rds/readOnlyInstance:ReadOnlyInstance example rm-abc12345678
    /// ```
    /// </summary>
    public partial class ReadOnlyInstance : Pulumi.CustomResource
    {
        /// <summary>
        /// RDS database connection string.
        /// </summary>
        [Output("connectionString")]
        public Output<string> ConnectionString { get; private set; } = null!;

        /// <summary>
        /// Database type.
        /// </summary>
        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
        /// </summary>
        [Output("engineVersion")]
        public Output<string> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// The name of DB instance. It a string of 2 to 256 characters.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// User-defined DB instance storage space. Value range: [5, 2000] for MySQL/SQL Server HA dual node edition. Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
        /// </summary>
        [Output("instanceStorage")]
        public Output<int> InstanceStorage { get; private set; } = null!;

        /// <summary>
        /// DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
        /// </summary>
        [Output("instanceType")]
        public Output<string> InstanceType { get; private set; } = null!;

        /// <summary>
        /// ID of the master instance.
        /// </summary>
        [Output("masterDbInstanceId")]
        public Output<string> MasterDbInstanceId { get; private set; } = null!;

        /// <summary>
        /// Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm).
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.ReadOnlyInstanceParameter>> Parameters { get; private set; } = null!;

        /// <summary>
        /// RDS database connection port.
        /// </summary>
        [Output("port")]
        public Output<string> Port { get; private set; } = null!;

        /// <summary>
        /// The ID of resource group which the DB read-only instance belongs.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
        /// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The virtual switch ID to launch DB instances in one VPC.
        /// </summary>
        [Output("vswitchId")]
        public Output<string?> VswitchId { get; private set; } = null!;

        /// <summary>
        /// The Zone to launch the DB instance.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ReadOnlyInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ReadOnlyInstance(string name, ReadOnlyInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:rds/readOnlyInstance:ReadOnlyInstance", name, args ?? new ReadOnlyInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ReadOnlyInstance(string name, Input<string> id, ReadOnlyInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:rds/readOnlyInstance:ReadOnlyInstance", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ReadOnlyInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ReadOnlyInstance Get(string name, Input<string> id, ReadOnlyInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new ReadOnlyInstance(name, id, state, options);
        }
    }

    public sealed class ReadOnlyInstanceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
        /// </summary>
        [Input("engineVersion", required: true)]
        public Input<string> EngineVersion { get; set; } = null!;

        /// <summary>
        /// The name of DB instance. It a string of 2 to 256 characters.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// User-defined DB instance storage space. Value range: [5, 2000] for MySQL/SQL Server HA dual node edition. Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
        /// </summary>
        [Input("instanceStorage", required: true)]
        public Input<int> InstanceStorage { get; set; } = null!;

        /// <summary>
        /// DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
        /// </summary>
        [Input("instanceType", required: true)]
        public Input<string> InstanceType { get; set; } = null!;

        /// <summary>
        /// ID of the master instance.
        /// </summary>
        [Input("masterDbInstanceId", required: true)]
        public Input<string> MasterDbInstanceId { get; set; } = null!;

        [Input("parameters")]
        private InputList<Inputs.ReadOnlyInstanceParameterArgs>? _parameters;

        /// <summary>
        /// Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm).
        /// </summary>
        public InputList<Inputs.ReadOnlyInstanceParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.ReadOnlyInstanceParameterArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// The ID of resource group which the DB read-only instance belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
        /// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The virtual switch ID to launch DB instances in one VPC.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The Zone to launch the DB instance.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ReadOnlyInstanceArgs()
        {
        }
    }

    public sealed class ReadOnlyInstanceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// RDS database connection string.
        /// </summary>
        [Input("connectionString")]
        public Input<string>? ConnectionString { get; set; }

        /// <summary>
        /// Database type.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// The name of DB instance. It a string of 2 to 256 characters.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// User-defined DB instance storage space. Value range: [5, 2000] for MySQL/SQL Server HA dual node edition. Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
        /// </summary>
        [Input("instanceStorage")]
        public Input<int>? InstanceStorage { get; set; }

        /// <summary>
        /// DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// ID of the master instance.
        /// </summary>
        [Input("masterDbInstanceId")]
        public Input<string>? MasterDbInstanceId { get; set; }

        [Input("parameters")]
        private InputList<Inputs.ReadOnlyInstanceParameterGetArgs>? _parameters;

        /// <summary>
        /// Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm).
        /// </summary>
        public InputList<Inputs.ReadOnlyInstanceParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.ReadOnlyInstanceParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// RDS database connection port.
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// The ID of resource group which the DB read-only instance belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
        /// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The virtual switch ID to launch DB instances in one VPC.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The Zone to launch the DB instance.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ReadOnlyInstanceState()
        {
        }
    }
}
