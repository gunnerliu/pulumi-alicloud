// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PolarDB
{
    /// <summary>
    /// Provides a PolarDB cluster resource. A PolarDB cluster is an isolated database
    /// environment in the cloud. A PolarDB cluster can contain multiple user-created
    /// databases.
    /// 
    /// &gt; **NOTE:** Available in v1.66.0+.
    /// 
    /// ## Example Usage
    /// ### Create a PolarDB MySQL cluster
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
    ///         var name = config.Get("name") ?? "polardbClusterconfig";
    ///         var creation = config.Get("creation") ?? "PolarDB";
    ///         var defaultZones = Output.Create(AliCloud.GetZones.InvokeAsync(new AliCloud.GetZonesArgs
    ///         {
    ///             AvailableResourceCreation = creation,
    ///         }));
    ///         var defaultNetwork = new AliCloud.Vpc.Network("defaultNetwork", new AliCloud.Vpc.NetworkArgs
    ///         {
    ///             VpcName = name,
    ///             CidrBlock = "172.16.0.0/16",
    ///         });
    ///         var defaultSwitch = new AliCloud.Vpc.Switch("defaultSwitch", new AliCloud.Vpc.SwitchArgs
    ///         {
    ///             VpcId = defaultNetwork.Id,
    ///             CidrBlock = "172.16.0.0/24",
    ///             ZoneId = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones?[0]?.Id),
    ///             VswitchName = name,
    ///         });
    ///         var defaultCluster = new AliCloud.PolarDB.Cluster("defaultCluster", new AliCloud.PolarDB.ClusterArgs
    ///         {
    ///             DbType = "MySQL",
    ///             DbVersion = "5.6",
    ///             DbNodeClass = "polar.mysql.x4.medium",
    ///             PayType = "PostPaid",
    ///             Description = name,
    ///             VswitchId = defaultSwitch.Id,
    ///             DbClusterIpArrays = 
    ///             {
    ///                 new AliCloud.PolarDB.Inputs.ClusterDbClusterIpArrayArgs
    ///                 {
    ///                     DbClusterIpArrayName = "default",
    ///                     SecurityIps = 
    ///                     {
    ///                         "1.2.3.4",
    ///                         "1.2.3.5",
    ///                     },
    ///                 },
    ///                 new AliCloud.PolarDB.Inputs.ClusterDbClusterIpArrayArgs
    ///                 {
    ///                     DbClusterIpArrayName = "test_ips1",
    ///                     SecurityIps = 
    ///                     {
    ///                         "1.2.3.6",
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// PolarDB cluster can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:polardb/cluster:Cluster example pc-abc12345678
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:polardb/cluster:Cluster")]
    public partial class Cluster : Pulumi.CustomResource
    {
        /// <summary>
        /// Auto-renewal period of an cluster, in the unit of the month. It is valid when pay_type is `PrePaid`. Valid value:1, 2, 3, 6, 12, 24, 36, Default to 1.
        /// </summary>
        [Output("autoRenewPeriod")]
        public Output<int?> AutoRenewPeriod { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable or disable SQL data collector. Valid values are `Enable`, `Disabled`.
        /// </summary>
        [Output("collectorStatus")]
        public Output<string> CollectorStatus { get; private set; } = null!;

        /// <summary>
        /// (Available in 1.81.0+) PolarDB cluster connection string. When security_ips is configured, the address of cluster type endpoint will be returned, and if only "127.0.0.1" is configured, it will also be an empty string.
        /// </summary>
        [Output("connectionString")]
        public Output<string> ConnectionString { get; private set; } = null!;

        /// <summary>
        /// db_cluster_ip_array defines how users can send requests to your API.
        /// </summary>
        [Output("dbClusterIpArrays")]
        public Output<ImmutableArray<Outputs.ClusterDbClusterIpArray>> DbClusterIpArrays { get; private set; } = null!;

        /// <summary>
        /// The db_node_class of cluster node.
        /// &gt; **NOTE:** Node specifications are divided into cluster version, single node version and History Library version. They can't change each other, but the general specification and exclusive specification of cluster version can be changed.
        /// </summary>
        [Output("dbNodeClass")]
        public Output<string> DbNodeClass { get; private set; } = null!;

        /// <summary>
        /// Number of the PolarDB cluster nodes, default is 2(Each cluster must contain at least a primary node and a read-only node). Add/remove nodes by modifying this parameter, valid values: [2~16].  
        /// &gt; **NOTE:** To avoid adding or removing multiple read-only nodes by mistake, the system allows you to add or remove one read-only node at a time.
        /// </summary>
        [Output("dbNodeCount")]
        public Output<int?> DbNodeCount { get; private set; } = null!;

        /// <summary>
        /// Database type. Value options: MySQL, Oracle, PostgreSQL.
        /// </summary>
        [Output("dbType")]
        public Output<string> DbType { get; private set; } = null!;

        /// <summary>
        /// Database version. Value options can refer to the latest docs [CreateDBCluster](https://help.aliyun.com/document_detail/98169.html) `DBVersion`.
        /// </summary>
        [Output("dbVersion")]
        public Output<string> DbVersion { get; private set; } = null!;

        /// <summary>
        /// turn on table deletion_lock. Valid values are 0, 1. 1 means to open the cluster protection lock, 0 means to close the cluster protection lock
        /// &gt; **NOTE:**  Cannot modify after created when `pay_type` is `Prepaid` .`deletion_lock` the cluster protection lock can be turned on or off when `pay_type` is `Postpaid`.
        /// </summary>
        [Output("deletionLock")]
        public Output<int?> DeletionLock { get; private set; } = null!;

        /// <summary>
        /// The description of cluster.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// turn on table auto encryption. Valid values are `ON`, `OFF`. Only MySQL 8.0 supports. 
        /// &gt; **NOTE:** `encrypt_new_tables` Polardb MySQL 8.0 cluster, after TDE and Automatic Encryption are enabled, all newly created tables are automatically encrypted in the cluster.
        /// </summary>
        [Output("encryptNewTables")]
        public Output<string?> EncryptNewTables { get; private set; } = null!;

        /// <summary>
        /// Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
        /// </summary>
        [Output("maintainTime")]
        public Output<string> MaintainTime { get; private set; } = null!;

        /// <summary>
        /// Use as `db_node_class` change class, define upgrade or downgrade. Valid values are `Upgrade`, `Downgrade`, Default to `Upgrade`.
        /// </summary>
        [Output("modifyType")]
        public Output<string?> ModifyType { get; private set; } = null!;

        /// <summary>
        /// Set of parameters needs to be set after DB cluster was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/98122.htm) .
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.ClusterParameter>> Parameters { get; private set; } = null!;

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        /// </summary>
        [Output("payType")]
        public Output<string?> PayType { get; private set; } = null!;

        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
        /// </summary>
        [Output("renewalStatus")]
        public Output<string?> RenewalStatus { get; private set; } = null!;

        /// <summary>
        /// The ID of resource group which the PolarDB cluster belongs. If not specified, then it belongs to the default resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The ID of the security group. Separate multiple security groups with commas (,). You can add a maximum of three security groups to a cluster.
        /// &gt; **NOTE:** Because of data backup and migration, change DB cluster type and storage would cost 15~20 minutes. Please make full preparation before changing them.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// List of IP addresses allowed to access all databases of a cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        /// </summary>
        [Output("securityIps")]
        public Output<ImmutableArray<string>> SecurityIps { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
        /// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// turn on TDE encryption. Valid values are `Enabled`, `Disabled`. Default to `Disabled`. TDE cannot be closed after it is turned on. 
        /// &gt; **NOTE:** `tde_status` Cannot modify after created when `db_type` is `PostgreSQL` or `Oracle`.`tde_status` only support modification from `Disabled` to `Enabled` when `db_type` is `MySQL`.
        /// </summary>
        [Output("tdeStatus")]
        public Output<string?> TdeStatus { get; private set; } = null!;

        /// <summary>
        /// The virtual switch ID to launch DB instances in one VPC.
        /// &gt; **NOTE:** If vswitch_id is not specified, system will get a vswitch belongs to the user automatically.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;

        /// <summary>
        /// The Zone to launch the DB cluster. it supports multiple zone.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a Cluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Cluster(string name, ClusterArgs args, CustomResourceOptions? options = null)
            : base("alicloud:polardb/cluster:Cluster", name, args ?? new ClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Cluster(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:polardb/cluster:Cluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Cluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Cluster Get(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new Cluster(name, id, state, options);
        }
    }

    public sealed class ClusterArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Auto-renewal period of an cluster, in the unit of the month. It is valid when pay_type is `PrePaid`. Valid value:1, 2, 3, 6, 12, 24, 36, Default to 1.
        /// </summary>
        [Input("autoRenewPeriod")]
        public Input<int>? AutoRenewPeriod { get; set; }

        /// <summary>
        /// Specifies whether to enable or disable SQL data collector. Valid values are `Enable`, `Disabled`.
        /// </summary>
        [Input("collectorStatus")]
        public Input<string>? CollectorStatus { get; set; }

        [Input("dbClusterIpArrays")]
        private InputList<Inputs.ClusterDbClusterIpArrayArgs>? _dbClusterIpArrays;

        /// <summary>
        /// db_cluster_ip_array defines how users can send requests to your API.
        /// </summary>
        public InputList<Inputs.ClusterDbClusterIpArrayArgs> DbClusterIpArrays
        {
            get => _dbClusterIpArrays ?? (_dbClusterIpArrays = new InputList<Inputs.ClusterDbClusterIpArrayArgs>());
            set => _dbClusterIpArrays = value;
        }

        /// <summary>
        /// The db_node_class of cluster node.
        /// &gt; **NOTE:** Node specifications are divided into cluster version, single node version and History Library version. They can't change each other, but the general specification and exclusive specification of cluster version can be changed.
        /// </summary>
        [Input("dbNodeClass", required: true)]
        public Input<string> DbNodeClass { get; set; } = null!;

        /// <summary>
        /// Number of the PolarDB cluster nodes, default is 2(Each cluster must contain at least a primary node and a read-only node). Add/remove nodes by modifying this parameter, valid values: [2~16].  
        /// &gt; **NOTE:** To avoid adding or removing multiple read-only nodes by mistake, the system allows you to add or remove one read-only node at a time.
        /// </summary>
        [Input("dbNodeCount")]
        public Input<int>? DbNodeCount { get; set; }

        /// <summary>
        /// Database type. Value options: MySQL, Oracle, PostgreSQL.
        /// </summary>
        [Input("dbType", required: true)]
        public Input<string> DbType { get; set; } = null!;

        /// <summary>
        /// Database version. Value options can refer to the latest docs [CreateDBCluster](https://help.aliyun.com/document_detail/98169.html) `DBVersion`.
        /// </summary>
        [Input("dbVersion", required: true)]
        public Input<string> DbVersion { get; set; } = null!;

        /// <summary>
        /// turn on table deletion_lock. Valid values are 0, 1. 1 means to open the cluster protection lock, 0 means to close the cluster protection lock
        /// &gt; **NOTE:**  Cannot modify after created when `pay_type` is `Prepaid` .`deletion_lock` the cluster protection lock can be turned on or off when `pay_type` is `Postpaid`.
        /// </summary>
        [Input("deletionLock")]
        public Input<int>? DeletionLock { get; set; }

        /// <summary>
        /// The description of cluster.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// turn on table auto encryption. Valid values are `ON`, `OFF`. Only MySQL 8.0 supports. 
        /// &gt; **NOTE:** `encrypt_new_tables` Polardb MySQL 8.0 cluster, after TDE and Automatic Encryption are enabled, all newly created tables are automatically encrypted in the cluster.
        /// </summary>
        [Input("encryptNewTables")]
        public Input<string>? EncryptNewTables { get; set; }

        /// <summary>
        /// Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
        /// </summary>
        [Input("maintainTime")]
        public Input<string>? MaintainTime { get; set; }

        /// <summary>
        /// Use as `db_node_class` change class, define upgrade or downgrade. Valid values are `Upgrade`, `Downgrade`, Default to `Upgrade`.
        /// </summary>
        [Input("modifyType")]
        public Input<string>? ModifyType { get; set; }

        [Input("parameters")]
        private InputList<Inputs.ClusterParameterArgs>? _parameters;

        /// <summary>
        /// Set of parameters needs to be set after DB cluster was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/98122.htm) .
        /// </summary>
        public InputList<Inputs.ClusterParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.ClusterParameterArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        /// </summary>
        [Input("payType")]
        public Input<string>? PayType { get; set; }

        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// The ID of resource group which the PolarDB cluster belongs. If not specified, then it belongs to the default resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// The ID of the security group. Separate multiple security groups with commas (,). You can add a maximum of three security groups to a cluster.
        /// &gt; **NOTE:** Because of data backup and migration, change DB cluster type and storage would cost 15~20 minutes. Please make full preparation before changing them.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("securityIps")]
        private InputList<string>? _securityIps;

        /// <summary>
        /// List of IP addresses allowed to access all databases of a cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        /// </summary>
        public InputList<string> SecurityIps
        {
            get => _securityIps ?? (_securityIps = new InputList<string>());
            set => _securityIps = value;
        }

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
        /// turn on TDE encryption. Valid values are `Enabled`, `Disabled`. Default to `Disabled`. TDE cannot be closed after it is turned on. 
        /// &gt; **NOTE:** `tde_status` Cannot modify after created when `db_type` is `PostgreSQL` or `Oracle`.`tde_status` only support modification from `Disabled` to `Enabled` when `db_type` is `MySQL`.
        /// </summary>
        [Input("tdeStatus")]
        public Input<string>? TdeStatus { get; set; }

        /// <summary>
        /// The virtual switch ID to launch DB instances in one VPC.
        /// &gt; **NOTE:** If vswitch_id is not specified, system will get a vswitch belongs to the user automatically.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The Zone to launch the DB cluster. it supports multiple zone.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ClusterArgs()
        {
        }
    }

    public sealed class ClusterState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Auto-renewal period of an cluster, in the unit of the month. It is valid when pay_type is `PrePaid`. Valid value:1, 2, 3, 6, 12, 24, 36, Default to 1.
        /// </summary>
        [Input("autoRenewPeriod")]
        public Input<int>? AutoRenewPeriod { get; set; }

        /// <summary>
        /// Specifies whether to enable or disable SQL data collector. Valid values are `Enable`, `Disabled`.
        /// </summary>
        [Input("collectorStatus")]
        public Input<string>? CollectorStatus { get; set; }

        /// <summary>
        /// (Available in 1.81.0+) PolarDB cluster connection string. When security_ips is configured, the address of cluster type endpoint will be returned, and if only "127.0.0.1" is configured, it will also be an empty string.
        /// </summary>
        [Input("connectionString")]
        public Input<string>? ConnectionString { get; set; }

        [Input("dbClusterIpArrays")]
        private InputList<Inputs.ClusterDbClusterIpArrayGetArgs>? _dbClusterIpArrays;

        /// <summary>
        /// db_cluster_ip_array defines how users can send requests to your API.
        /// </summary>
        public InputList<Inputs.ClusterDbClusterIpArrayGetArgs> DbClusterIpArrays
        {
            get => _dbClusterIpArrays ?? (_dbClusterIpArrays = new InputList<Inputs.ClusterDbClusterIpArrayGetArgs>());
            set => _dbClusterIpArrays = value;
        }

        /// <summary>
        /// The db_node_class of cluster node.
        /// &gt; **NOTE:** Node specifications are divided into cluster version, single node version and History Library version. They can't change each other, but the general specification and exclusive specification of cluster version can be changed.
        /// </summary>
        [Input("dbNodeClass")]
        public Input<string>? DbNodeClass { get; set; }

        /// <summary>
        /// Number of the PolarDB cluster nodes, default is 2(Each cluster must contain at least a primary node and a read-only node). Add/remove nodes by modifying this parameter, valid values: [2~16].  
        /// &gt; **NOTE:** To avoid adding or removing multiple read-only nodes by mistake, the system allows you to add or remove one read-only node at a time.
        /// </summary>
        [Input("dbNodeCount")]
        public Input<int>? DbNodeCount { get; set; }

        /// <summary>
        /// Database type. Value options: MySQL, Oracle, PostgreSQL.
        /// </summary>
        [Input("dbType")]
        public Input<string>? DbType { get; set; }

        /// <summary>
        /// Database version. Value options can refer to the latest docs [CreateDBCluster](https://help.aliyun.com/document_detail/98169.html) `DBVersion`.
        /// </summary>
        [Input("dbVersion")]
        public Input<string>? DbVersion { get; set; }

        /// <summary>
        /// turn on table deletion_lock. Valid values are 0, 1. 1 means to open the cluster protection lock, 0 means to close the cluster protection lock
        /// &gt; **NOTE:**  Cannot modify after created when `pay_type` is `Prepaid` .`deletion_lock` the cluster protection lock can be turned on or off when `pay_type` is `Postpaid`.
        /// </summary>
        [Input("deletionLock")]
        public Input<int>? DeletionLock { get; set; }

        /// <summary>
        /// The description of cluster.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// turn on table auto encryption. Valid values are `ON`, `OFF`. Only MySQL 8.0 supports. 
        /// &gt; **NOTE:** `encrypt_new_tables` Polardb MySQL 8.0 cluster, after TDE and Automatic Encryption are enabled, all newly created tables are automatically encrypted in the cluster.
        /// </summary>
        [Input("encryptNewTables")]
        public Input<string>? EncryptNewTables { get; set; }

        /// <summary>
        /// Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
        /// </summary>
        [Input("maintainTime")]
        public Input<string>? MaintainTime { get; set; }

        /// <summary>
        /// Use as `db_node_class` change class, define upgrade or downgrade. Valid values are `Upgrade`, `Downgrade`, Default to `Upgrade`.
        /// </summary>
        [Input("modifyType")]
        public Input<string>? ModifyType { get; set; }

        [Input("parameters")]
        private InputList<Inputs.ClusterParameterGetArgs>? _parameters;

        /// <summary>
        /// Set of parameters needs to be set after DB cluster was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/98122.htm) .
        /// </summary>
        public InputList<Inputs.ClusterParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.ClusterParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        /// </summary>
        [Input("payType")]
        public Input<string>? PayType { get; set; }

        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
        /// </summary>
        [Input("renewalStatus")]
        public Input<string>? RenewalStatus { get; set; }

        /// <summary>
        /// The ID of resource group which the PolarDB cluster belongs. If not specified, then it belongs to the default resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// The ID of the security group. Separate multiple security groups with commas (,). You can add a maximum of three security groups to a cluster.
        /// &gt; **NOTE:** Because of data backup and migration, change DB cluster type and storage would cost 15~20 minutes. Please make full preparation before changing them.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("securityIps")]
        private InputList<string>? _securityIps;

        /// <summary>
        /// List of IP addresses allowed to access all databases of a cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        /// </summary>
        public InputList<string> SecurityIps
        {
            get => _securityIps ?? (_securityIps = new InputList<string>());
            set => _securityIps = value;
        }

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
        /// turn on TDE encryption. Valid values are `Enabled`, `Disabled`. Default to `Disabled`. TDE cannot be closed after it is turned on. 
        /// &gt; **NOTE:** `tde_status` Cannot modify after created when `db_type` is `PostgreSQL` or `Oracle`.`tde_status` only support modification from `Disabled` to `Enabled` when `db_type` is `MySQL`.
        /// </summary>
        [Input("tdeStatus")]
        public Input<string>? TdeStatus { get; set; }

        /// <summary>
        /// The virtual switch ID to launch DB instances in one VPC.
        /// &gt; **NOTE:** If vswitch_id is not specified, system will get a vswitch belongs to the user automatically.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The Zone to launch the DB cluster. it supports multiple zone.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ClusterState()
        {
        }
    }
}
