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
    /// ## Import
    /// 
    /// MongoDB can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:mongodb/shardingInstance:ShardingInstance example dds-bp1291daeda44195
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:mongodb/shardingInstance:ShardingInstance")]
    public partial class ShardingInstance : Pulumi.CustomResource
    {
        /// <summary>
        /// Password of the root account. It is a string of 6 to 32 characters and is composed of letters, numbers, and underlines.
        /// </summary>
        [Output("accountPassword")]
        public Output<string?> AccountPassword { get; private set; } = null!;

        /// <summary>
        /// Auto renew for prepaid, true of false. Default is false.
        /// </summary>
        [Output("autoRenew")]
        public Output<bool?> AutoRenew { get; private set; } = null!;

        /// <summary>
        /// MongoDB Instance backup period. It is required when `backup_time` was existed. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
        /// </summary>
        [Output("backupPeriods")]
        public Output<ImmutableArray<string>> BackupPeriods { get; private set; } = null!;

        /// <summary>
        /// MongoDB instance backup time. It is required when `backup_period` was existed. In the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. If not set, the system will return a default, like "23:00Z-24:00Z".
        /// </summary>
        [Output("backupTime")]
        public Output<string> BackupTime { get; private set; } = null!;

        /// <summary>
        /// The node information list of config server. The details see Block `config_server_list`. **NOTE:** Available in v1.140+.
        /// </summary>
        [Output("configServerLists")]
        public Output<ImmutableArray<Outputs.ShardingInstanceConfigServerList>> ConfigServerLists { get; private set; } = null!;

        /// <summary>
        /// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/zh/doc-detail/61884.htm) `EngineVersion`.
        /// </summary>
        [Output("engineVersion")]
        public Output<string> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`. **NOTE:** It can be modified from `PostPaid` to `PrePaid` after version v1.141.0.
        /// </summary>
        [Output("instanceChargeType")]
        public Output<string> InstanceChargeType { get; private set; } = null!;

        /// <summary>
        /// An KMS encrypts password used to a instance. If the `account_password` is filled in, this field will be ignored.
        /// </summary>
        [Output("kmsEncryptedPassword")]
        public Output<string?> KmsEncryptedPassword { get; private set; } = null!;

        /// <summary>
        /// An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        /// </summary>
        [Output("kmsEncryptionContext")]
        public Output<ImmutableDictionary<string, object>?> KmsEncryptionContext { get; private set; } = null!;

        /// <summary>
        /// The mongo-node count can be purchased is in range of [2, 32].
        /// </summary>
        [Output("mongoLists")]
        public Output<ImmutableArray<Outputs.ShardingInstanceMongoList>> MongoLists { get; private set; } = null!;

        /// <summary>
        /// The name of DB instance. It a string of 2 to 256 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The type of configuration changes performed. Default value: DOWNGRADE. Valid values:
        /// * UPGRADE: The specifications are upgraded.
        /// * DOWNGRADE: The specifications are downgraded.
        /// Note: This parameter is only applicable to instances when `instance_charge_type` is PrePaid.
        /// </summary>
        [Output("orderType")]
        public Output<string?> OrderType { get; private set; } = null!;

        /// <summary>
        /// The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. System default to 1.
        /// </summary>
        [Output("period")]
        public Output<int> Period { get; private set; } = null!;

        /// <summary>
        /// Instance log backup retention days. **NOTE:** Available in 1.42.0+.
        /// </summary>
        [Output("retentionPeriod")]
        public Output<int> RetentionPeriod { get; private set; } = null!;

        /// <summary>
        /// The Security Group ID of ECS.
        /// </summary>
        [Output("securityGroupId")]
        public Output<string> SecurityGroupId { get; private set; } = null!;

        /// <summary>
        /// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]). System default to `["127.0.0.1"]`.
        /// </summary>
        [Output("securityIpLists")]
        public Output<ImmutableArray<string>> SecurityIpLists { get; private set; } = null!;

        /// <summary>
        /// the shard-node count can be purchased is in range of [2, 32].
        /// </summary>
        [Output("shardLists")]
        public Output<ImmutableArray<Outputs.ShardingInstanceShardList>> ShardLists { get; private set; } = null!;

        /// <summary>
        /// Storage engine: WiredTiger or RocksDB. System Default value: WiredTiger.
        /// </summary>
        [Output("storageEngine")]
        public Output<string> StorageEngine { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The TDE(Transparent Data Encryption) status.
        /// </summary>
        [Output("tdeStatus")]
        public Output<string?> TdeStatus { get; private set; } = null!;

        /// <summary>
        /// The virtual switch ID to launch DB instances in one VPC.
        /// </summary>
        [Output("vswitchId")]
        public Output<string?> VswitchId { get; private set; } = null!;

        /// <summary>
        /// The Zone to launch the DB instance. MongoDB sharding instance does not support multiple-zone.
        /// If it is a multi-zone and `vswitch_id` is specified, the vswitch must in one of them.
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ShardingInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ShardingInstance(string name, ShardingInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:mongodb/shardingInstance:ShardingInstance", name, args ?? new ShardingInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ShardingInstance(string name, Input<string> id, ShardingInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:mongodb/shardingInstance:ShardingInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ShardingInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ShardingInstance Get(string name, Input<string> id, ShardingInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new ShardingInstance(name, id, state, options);
        }
    }

    public sealed class ShardingInstanceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Password of the root account. It is a string of 6 to 32 characters and is composed of letters, numbers, and underlines.
        /// </summary>
        [Input("accountPassword")]
        public Input<string>? AccountPassword { get; set; }

        /// <summary>
        /// Auto renew for prepaid, true of false. Default is false.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        [Input("backupPeriods")]
        private InputList<string>? _backupPeriods;

        /// <summary>
        /// MongoDB Instance backup period. It is required when `backup_time` was existed. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
        /// </summary>
        public InputList<string> BackupPeriods
        {
            get => _backupPeriods ?? (_backupPeriods = new InputList<string>());
            set => _backupPeriods = value;
        }

        /// <summary>
        /// MongoDB instance backup time. It is required when `backup_period` was existed. In the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. If not set, the system will return a default, like "23:00Z-24:00Z".
        /// </summary>
        [Input("backupTime")]
        public Input<string>? BackupTime { get; set; }

        /// <summary>
        /// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/zh/doc-detail/61884.htm) `EngineVersion`.
        /// </summary>
        [Input("engineVersion", required: true)]
        public Input<string> EngineVersion { get; set; } = null!;

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`. **NOTE:** It can be modified from `PostPaid` to `PrePaid` after version v1.141.0.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// An KMS encrypts password used to a instance. If the `account_password` is filled in, this field will be ignored.
        /// </summary>
        [Input("kmsEncryptedPassword")]
        public Input<string>? KmsEncryptedPassword { get; set; }

        [Input("kmsEncryptionContext")]
        private InputMap<object>? _kmsEncryptionContext;

        /// <summary>
        /// An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        /// </summary>
        public InputMap<object> KmsEncryptionContext
        {
            get => _kmsEncryptionContext ?? (_kmsEncryptionContext = new InputMap<object>());
            set => _kmsEncryptionContext = value;
        }

        [Input("mongoLists", required: true)]
        private InputList<Inputs.ShardingInstanceMongoListArgs>? _mongoLists;

        /// <summary>
        /// The mongo-node count can be purchased is in range of [2, 32].
        /// </summary>
        public InputList<Inputs.ShardingInstanceMongoListArgs> MongoLists
        {
            get => _mongoLists ?? (_mongoLists = new InputList<Inputs.ShardingInstanceMongoListArgs>());
            set => _mongoLists = value;
        }

        /// <summary>
        /// The name of DB instance. It a string of 2 to 256 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of configuration changes performed. Default value: DOWNGRADE. Valid values:
        /// * UPGRADE: The specifications are upgraded.
        /// * DOWNGRADE: The specifications are downgraded.
        /// Note: This parameter is only applicable to instances when `instance_charge_type` is PrePaid.
        /// </summary>
        [Input("orderType")]
        public Input<string>? OrderType { get; set; }

        /// <summary>
        /// The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. System default to 1.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The Security Group ID of ECS.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        [Input("securityIpLists")]
        private InputList<string>? _securityIpLists;

        /// <summary>
        /// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]). System default to `["127.0.0.1"]`.
        /// </summary>
        public InputList<string> SecurityIpLists
        {
            get => _securityIpLists ?? (_securityIpLists = new InputList<string>());
            set => _securityIpLists = value;
        }

        [Input("shardLists", required: true)]
        private InputList<Inputs.ShardingInstanceShardListArgs>? _shardLists;

        /// <summary>
        /// the shard-node count can be purchased is in range of [2, 32].
        /// </summary>
        public InputList<Inputs.ShardingInstanceShardListArgs> ShardLists
        {
            get => _shardLists ?? (_shardLists = new InputList<Inputs.ShardingInstanceShardListArgs>());
            set => _shardLists = value;
        }

        /// <summary>
        /// Storage engine: WiredTiger or RocksDB. System Default value: WiredTiger.
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
        /// The TDE(Transparent Data Encryption) status.
        /// </summary>
        [Input("tdeStatus")]
        public Input<string>? TdeStatus { get; set; }

        /// <summary>
        /// The virtual switch ID to launch DB instances in one VPC.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The Zone to launch the DB instance. MongoDB sharding instance does not support multiple-zone.
        /// If it is a multi-zone and `vswitch_id` is specified, the vswitch must in one of them.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ShardingInstanceArgs()
        {
        }
    }

    public sealed class ShardingInstanceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Password of the root account. It is a string of 6 to 32 characters and is composed of letters, numbers, and underlines.
        /// </summary>
        [Input("accountPassword")]
        public Input<string>? AccountPassword { get; set; }

        /// <summary>
        /// Auto renew for prepaid, true of false. Default is false.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        [Input("backupPeriods")]
        private InputList<string>? _backupPeriods;

        /// <summary>
        /// MongoDB Instance backup period. It is required when `backup_time` was existed. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
        /// </summary>
        public InputList<string> BackupPeriods
        {
            get => _backupPeriods ?? (_backupPeriods = new InputList<string>());
            set => _backupPeriods = value;
        }

        /// <summary>
        /// MongoDB instance backup time. It is required when `backup_period` was existed. In the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. If not set, the system will return a default, like "23:00Z-24:00Z".
        /// </summary>
        [Input("backupTime")]
        public Input<string>? BackupTime { get; set; }

        [Input("configServerLists")]
        private InputList<Inputs.ShardingInstanceConfigServerListGetArgs>? _configServerLists;

        /// <summary>
        /// The node information list of config server. The details see Block `config_server_list`. **NOTE:** Available in v1.140+.
        /// </summary>
        public InputList<Inputs.ShardingInstanceConfigServerListGetArgs> ConfigServerLists
        {
            get => _configServerLists ?? (_configServerLists = new InputList<Inputs.ShardingInstanceConfigServerListGetArgs>());
            set => _configServerLists = value;
        }

        /// <summary>
        /// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/zh/doc-detail/61884.htm) `EngineVersion`.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`. **NOTE:** It can be modified from `PostPaid` to `PrePaid` after version v1.141.0.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// An KMS encrypts password used to a instance. If the `account_password` is filled in, this field will be ignored.
        /// </summary>
        [Input("kmsEncryptedPassword")]
        public Input<string>? KmsEncryptedPassword { get; set; }

        [Input("kmsEncryptionContext")]
        private InputMap<object>? _kmsEncryptionContext;

        /// <summary>
        /// An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        /// </summary>
        public InputMap<object> KmsEncryptionContext
        {
            get => _kmsEncryptionContext ?? (_kmsEncryptionContext = new InputMap<object>());
            set => _kmsEncryptionContext = value;
        }

        [Input("mongoLists")]
        private InputList<Inputs.ShardingInstanceMongoListGetArgs>? _mongoLists;

        /// <summary>
        /// The mongo-node count can be purchased is in range of [2, 32].
        /// </summary>
        public InputList<Inputs.ShardingInstanceMongoListGetArgs> MongoLists
        {
            get => _mongoLists ?? (_mongoLists = new InputList<Inputs.ShardingInstanceMongoListGetArgs>());
            set => _mongoLists = value;
        }

        /// <summary>
        /// The name of DB instance. It a string of 2 to 256 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of configuration changes performed. Default value: DOWNGRADE. Valid values:
        /// * UPGRADE: The specifications are upgraded.
        /// * DOWNGRADE: The specifications are downgraded.
        /// Note: This parameter is only applicable to instances when `instance_charge_type` is PrePaid.
        /// </summary>
        [Input("orderType")]
        public Input<string>? OrderType { get; set; }

        /// <summary>
        /// The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. System default to 1.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Instance log backup retention days. **NOTE:** Available in 1.42.0+.
        /// </summary>
        [Input("retentionPeriod")]
        public Input<int>? RetentionPeriod { get; set; }

        /// <summary>
        /// The Security Group ID of ECS.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        [Input("securityIpLists")]
        private InputList<string>? _securityIpLists;

        /// <summary>
        /// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]). System default to `["127.0.0.1"]`.
        /// </summary>
        public InputList<string> SecurityIpLists
        {
            get => _securityIpLists ?? (_securityIpLists = new InputList<string>());
            set => _securityIpLists = value;
        }

        [Input("shardLists")]
        private InputList<Inputs.ShardingInstanceShardListGetArgs>? _shardLists;

        /// <summary>
        /// the shard-node count can be purchased is in range of [2, 32].
        /// </summary>
        public InputList<Inputs.ShardingInstanceShardListGetArgs> ShardLists
        {
            get => _shardLists ?? (_shardLists = new InputList<Inputs.ShardingInstanceShardListGetArgs>());
            set => _shardLists = value;
        }

        /// <summary>
        /// Storage engine: WiredTiger or RocksDB. System Default value: WiredTiger.
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
        /// The TDE(Transparent Data Encryption) status.
        /// </summary>
        [Input("tdeStatus")]
        public Input<string>? TdeStatus { get; set; }

        /// <summary>
        /// The virtual switch ID to launch DB instances in one VPC.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The Zone to launch the DB instance. MongoDB sharding instance does not support multiple-zone.
        /// If it is a multi-zone and `vswitch_id` is specified, the vswitch must in one of them.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ShardingInstanceState()
        {
        }
    }
}
