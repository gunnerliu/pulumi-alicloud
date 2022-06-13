// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a PolarDB cluster resource. A PolarDB cluster is an isolated database
 * environment in the cloud. A PolarDB cluster can contain multiple user-created
 * databases.
 *
 * > **NOTE:** Available in v1.66.0+.
 *
 * ## Example Usage
 * ### Create a PolarDB MySQL cluster
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "polardbClusterconfig";
 * const creation = config.get("creation") || "PolarDB";
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: creation,
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {
 *     vpcName: name,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: defaultZones.then(defaultZones => defaultZones.zones?[0]?.id),
 *     vswitchName: name,
 * });
 * const defaultCluster = new alicloud.polardb.Cluster("defaultCluster", {
 *     dbType: "MySQL",
 *     dbVersion: "5.6",
 *     dbNodeClass: "polar.mysql.x4.medium",
 *     payType: "PostPaid",
 *     description: name,
 *     vswitchId: defaultSwitch.id,
 *     dbClusterIpArrays: [
 *         {
 *             dbClusterIpArrayName: "default",
 *             securityIps: [
 *                 "1.2.3.4",
 *                 "1.2.3.5",
 *             ],
 *         },
 *         {
 *             dbClusterIpArrayName: "test_ips1",
 *             securityIps: ["1.2.3.6"],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * PolarDB cluster can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:polardb/cluster:Cluster example pc-abc12345678
 * ```
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:polardb/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    /**
     * Auto-renewal period of an cluster, in the unit of the month. It is valid when payType is `PrePaid`. Valid value:1, 2, 3, 6, 12, 24, 36, Default to 1.
     */
    public readonly autoRenewPeriod!: pulumi.Output<number | undefined>;
    /**
     * The retention policy for the backup sets when you delete the cluster.  Valid values are `ALL`, `LATEST`, `NONE`. Value options can refer to the latest docs [DeleteDBCluster](https://help.aliyun.com/document_detail/98170.html)
     */
    public readonly backupRetentionPolicyOnClusterDeletion!: pulumi.Output<string>;
    /**
     * Specifies whether to enable or disable SQL data collector. Valid values are `Enable`, `Disabled`.
     */
    public readonly collectorStatus!: pulumi.Output<string>;
    /**
     * (Available in 1.81.0+) PolarDB cluster connection string. When securityIps is configured, the address of cluster type endpoint will be returned, and if only "127.0.0.1" is configured, it will also be an empty string.
     */
    public /*out*/ readonly connectionString!: pulumi.Output<string>;
    /**
     * db_cluster_ip_array defines how users can send requests to your API.
     */
    public readonly dbClusterIpArrays!: pulumi.Output<outputs.polardb.ClusterDbClusterIpArray[]>;
    /**
     * The dbNodeClass of cluster node.
     * > **NOTE:** Node specifications are divided into cluster version, single node version and History Library version. They can't change each other, but the general specification and exclusive specification of cluster version can be changed.
     */
    public readonly dbNodeClass!: pulumi.Output<string>;
    /**
     * Number of the PolarDB cluster nodes, default is 2(Each cluster must contain at least a primary node and a read-only node). Add/remove nodes by modifying this parameter, valid values: [2~16].  
     * > **NOTE:** To avoid adding or removing multiple read-only nodes by mistake, the system allows you to add or remove one read-only node at a time.
     */
    public readonly dbNodeCount!: pulumi.Output<number | undefined>;
    /**
     * Database type. Value options: MySQL, Oracle, PostgreSQL.
     */
    public readonly dbType!: pulumi.Output<string>;
    /**
     * Database version. Value options can refer to the latest docs [CreateDBCluster](https://help.aliyun.com/document_detail/98169.html) `DBVersion`.
     */
    public readonly dbVersion!: pulumi.Output<string>;
    /**
     * turn on table deletion_lock. Valid values are 0, 1. 1 means to open the cluster protection lock, 0 means to close the cluster protection lock
     * > **NOTE:**  Cannot modify after created when `payType` is `Prepaid` .`deletionLock` the cluster protection lock can be turned on or off when `payType` is `Postpaid`.
     */
    public readonly deletionLock!: pulumi.Output<number | undefined>;
    /**
     * The description of cluster.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * turn on table auto encryption. Valid values are `ON`, `OFF`. Only MySQL 8.0 supports. 
     * > **NOTE:** `encryptNewTables` Polardb MySQL 8.0 cluster, after TDE and Automatic Encryption are enabled, all newly created tables are automatically encrypted in the cluster.
     */
    public readonly encryptNewTables!: pulumi.Output<string | undefined>;
    /**
     * Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
     */
    public readonly maintainTime!: pulumi.Output<string>;
    /**
     * Use as `dbNodeClass` change class, define upgrade or downgrade. Valid values are `Upgrade`, `Downgrade`, Default to `Upgrade`.
     */
    public readonly modifyType!: pulumi.Output<string | undefined>;
    /**
     * Set of parameters needs to be set after DB cluster was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/98122.htm) .
     */
    public readonly parameters!: pulumi.Output<outputs.polardb.ClusterParameter[]>;
    /**
     * Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
     */
    public readonly payType!: pulumi.Output<string | undefined>;
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
     */
    public readonly renewalStatus!: pulumi.Output<string | undefined>;
    /**
     * The ID of resource group which the PolarDB cluster belongs. If not specified, then it belongs to the default resource group.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The ID of the security group. Separate multiple security groups with commas (,). You can add a maximum of three security groups to a cluster.
     * > **NOTE:** Because of data backup and migration, change DB cluster type and storage would cost 15~20 minutes. Please make full preparation before changing them.
     */
    public readonly securityGroupIds!: pulumi.Output<string[]>;
    /**
     * List of IP addresses allowed to access all databases of a cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     */
    public readonly securityIps!: pulumi.Output<string[]>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * turn on TDE encryption. Valid values are `Enabled`, `Disabled`. Default to `Disabled`. TDE cannot be closed after it is turned on. 
     * > **NOTE:** `tdeStatus` Cannot modify after created when `dbType` is `PostgreSQL` or `Oracle`.`tdeStatus` only support modification from `Disabled` to `Enabled` when `dbType` is `MySQL`.
     */
    public readonly tdeStatus!: pulumi.Output<string | undefined>;
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     * > **NOTE:** If vswitchId is not specified, system will get a vswitch belongs to the user automatically.
     */
    public readonly vswitchId!: pulumi.Output<string>;
    /**
     * The Zone to launch the DB cluster. it supports multiple zone.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["autoRenewPeriod"] = state ? state.autoRenewPeriod : undefined;
            resourceInputs["backupRetentionPolicyOnClusterDeletion"] = state ? state.backupRetentionPolicyOnClusterDeletion : undefined;
            resourceInputs["collectorStatus"] = state ? state.collectorStatus : undefined;
            resourceInputs["connectionString"] = state ? state.connectionString : undefined;
            resourceInputs["dbClusterIpArrays"] = state ? state.dbClusterIpArrays : undefined;
            resourceInputs["dbNodeClass"] = state ? state.dbNodeClass : undefined;
            resourceInputs["dbNodeCount"] = state ? state.dbNodeCount : undefined;
            resourceInputs["dbType"] = state ? state.dbType : undefined;
            resourceInputs["dbVersion"] = state ? state.dbVersion : undefined;
            resourceInputs["deletionLock"] = state ? state.deletionLock : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["encryptNewTables"] = state ? state.encryptNewTables : undefined;
            resourceInputs["maintainTime"] = state ? state.maintainTime : undefined;
            resourceInputs["modifyType"] = state ? state.modifyType : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["payType"] = state ? state.payType : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["renewalStatus"] = state ? state.renewalStatus : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            resourceInputs["securityIps"] = state ? state.securityIps : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tdeStatus"] = state ? state.tdeStatus : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            if ((!args || args.dbNodeClass === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbNodeClass'");
            }
            if ((!args || args.dbType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbType'");
            }
            if ((!args || args.dbVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbVersion'");
            }
            resourceInputs["autoRenewPeriod"] = args ? args.autoRenewPeriod : undefined;
            resourceInputs["backupRetentionPolicyOnClusterDeletion"] = args ? args.backupRetentionPolicyOnClusterDeletion : undefined;
            resourceInputs["collectorStatus"] = args ? args.collectorStatus : undefined;
            resourceInputs["dbClusterIpArrays"] = args ? args.dbClusterIpArrays : undefined;
            resourceInputs["dbNodeClass"] = args ? args.dbNodeClass : undefined;
            resourceInputs["dbNodeCount"] = args ? args.dbNodeCount : undefined;
            resourceInputs["dbType"] = args ? args.dbType : undefined;
            resourceInputs["dbVersion"] = args ? args.dbVersion : undefined;
            resourceInputs["deletionLock"] = args ? args.deletionLock : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["encryptNewTables"] = args ? args.encryptNewTables : undefined;
            resourceInputs["maintainTime"] = args ? args.maintainTime : undefined;
            resourceInputs["modifyType"] = args ? args.modifyType : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["payType"] = args ? args.payType : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["renewalStatus"] = args ? args.renewalStatus : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            resourceInputs["securityIps"] = args ? args.securityIps : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["tdeStatus"] = args ? args.tdeStatus : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["connectionString"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Cluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * Auto-renewal period of an cluster, in the unit of the month. It is valid when payType is `PrePaid`. Valid value:1, 2, 3, 6, 12, 24, 36, Default to 1.
     */
    autoRenewPeriod?: pulumi.Input<number>;
    /**
     * The retention policy for the backup sets when you delete the cluster.  Valid values are `ALL`, `LATEST`, `NONE`. Value options can refer to the latest docs [DeleteDBCluster](https://help.aliyun.com/document_detail/98170.html)
     */
    backupRetentionPolicyOnClusterDeletion?: pulumi.Input<string>;
    /**
     * Specifies whether to enable or disable SQL data collector. Valid values are `Enable`, `Disabled`.
     */
    collectorStatus?: pulumi.Input<string>;
    /**
     * (Available in 1.81.0+) PolarDB cluster connection string. When securityIps is configured, the address of cluster type endpoint will be returned, and if only "127.0.0.1" is configured, it will also be an empty string.
     */
    connectionString?: pulumi.Input<string>;
    /**
     * db_cluster_ip_array defines how users can send requests to your API.
     */
    dbClusterIpArrays?: pulumi.Input<pulumi.Input<inputs.polardb.ClusterDbClusterIpArray>[]>;
    /**
     * The dbNodeClass of cluster node.
     * > **NOTE:** Node specifications are divided into cluster version, single node version and History Library version. They can't change each other, but the general specification and exclusive specification of cluster version can be changed.
     */
    dbNodeClass?: pulumi.Input<string>;
    /**
     * Number of the PolarDB cluster nodes, default is 2(Each cluster must contain at least a primary node and a read-only node). Add/remove nodes by modifying this parameter, valid values: [2~16].  
     * > **NOTE:** To avoid adding or removing multiple read-only nodes by mistake, the system allows you to add or remove one read-only node at a time.
     */
    dbNodeCount?: pulumi.Input<number>;
    /**
     * Database type. Value options: MySQL, Oracle, PostgreSQL.
     */
    dbType?: pulumi.Input<string>;
    /**
     * Database version. Value options can refer to the latest docs [CreateDBCluster](https://help.aliyun.com/document_detail/98169.html) `DBVersion`.
     */
    dbVersion?: pulumi.Input<string>;
    /**
     * turn on table deletion_lock. Valid values are 0, 1. 1 means to open the cluster protection lock, 0 means to close the cluster protection lock
     * > **NOTE:**  Cannot modify after created when `payType` is `Prepaid` .`deletionLock` the cluster protection lock can be turned on or off when `payType` is `Postpaid`.
     */
    deletionLock?: pulumi.Input<number>;
    /**
     * The description of cluster.
     */
    description?: pulumi.Input<string>;
    /**
     * turn on table auto encryption. Valid values are `ON`, `OFF`. Only MySQL 8.0 supports. 
     * > **NOTE:** `encryptNewTables` Polardb MySQL 8.0 cluster, after TDE and Automatic Encryption are enabled, all newly created tables are automatically encrypted in the cluster.
     */
    encryptNewTables?: pulumi.Input<string>;
    /**
     * Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
     */
    maintainTime?: pulumi.Input<string>;
    /**
     * Use as `dbNodeClass` change class, define upgrade or downgrade. Valid values are `Upgrade`, `Downgrade`, Default to `Upgrade`.
     */
    modifyType?: pulumi.Input<string>;
    /**
     * Set of parameters needs to be set after DB cluster was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/98122.htm) .
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.polardb.ClusterParameter>[]>;
    /**
     * Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
     */
    payType?: pulumi.Input<string>;
    period?: pulumi.Input<number>;
    /**
     * Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
     */
    renewalStatus?: pulumi.Input<string>;
    /**
     * The ID of resource group which the PolarDB cluster belongs. If not specified, then it belongs to the default resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The ID of the security group. Separate multiple security groups with commas (,). You can add a maximum of three security groups to a cluster.
     * > **NOTE:** Because of data backup and migration, change DB cluster type and storage would cost 15~20 minutes. Please make full preparation before changing them.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of IP addresses allowed to access all databases of a cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     */
    securityIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * turn on TDE encryption. Valid values are `Enabled`, `Disabled`. Default to `Disabled`. TDE cannot be closed after it is turned on. 
     * > **NOTE:** `tdeStatus` Cannot modify after created when `dbType` is `PostgreSQL` or `Oracle`.`tdeStatus` only support modification from `Disabled` to `Enabled` when `dbType` is `MySQL`.
     */
    tdeStatus?: pulumi.Input<string>;
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     * > **NOTE:** If vswitchId is not specified, system will get a vswitch belongs to the user automatically.
     */
    vswitchId?: pulumi.Input<string>;
    /**
     * The Zone to launch the DB cluster. it supports multiple zone.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * Auto-renewal period of an cluster, in the unit of the month. It is valid when payType is `PrePaid`. Valid value:1, 2, 3, 6, 12, 24, 36, Default to 1.
     */
    autoRenewPeriod?: pulumi.Input<number>;
    /**
     * The retention policy for the backup sets when you delete the cluster.  Valid values are `ALL`, `LATEST`, `NONE`. Value options can refer to the latest docs [DeleteDBCluster](https://help.aliyun.com/document_detail/98170.html)
     */
    backupRetentionPolicyOnClusterDeletion?: pulumi.Input<string>;
    /**
     * Specifies whether to enable or disable SQL data collector. Valid values are `Enable`, `Disabled`.
     */
    collectorStatus?: pulumi.Input<string>;
    /**
     * db_cluster_ip_array defines how users can send requests to your API.
     */
    dbClusterIpArrays?: pulumi.Input<pulumi.Input<inputs.polardb.ClusterDbClusterIpArray>[]>;
    /**
     * The dbNodeClass of cluster node.
     * > **NOTE:** Node specifications are divided into cluster version, single node version and History Library version. They can't change each other, but the general specification and exclusive specification of cluster version can be changed.
     */
    dbNodeClass: pulumi.Input<string>;
    /**
     * Number of the PolarDB cluster nodes, default is 2(Each cluster must contain at least a primary node and a read-only node). Add/remove nodes by modifying this parameter, valid values: [2~16].  
     * > **NOTE:** To avoid adding or removing multiple read-only nodes by mistake, the system allows you to add or remove one read-only node at a time.
     */
    dbNodeCount?: pulumi.Input<number>;
    /**
     * Database type. Value options: MySQL, Oracle, PostgreSQL.
     */
    dbType: pulumi.Input<string>;
    /**
     * Database version. Value options can refer to the latest docs [CreateDBCluster](https://help.aliyun.com/document_detail/98169.html) `DBVersion`.
     */
    dbVersion: pulumi.Input<string>;
    /**
     * turn on table deletion_lock. Valid values are 0, 1. 1 means to open the cluster protection lock, 0 means to close the cluster protection lock
     * > **NOTE:**  Cannot modify after created when `payType` is `Prepaid` .`deletionLock` the cluster protection lock can be turned on or off when `payType` is `Postpaid`.
     */
    deletionLock?: pulumi.Input<number>;
    /**
     * The description of cluster.
     */
    description?: pulumi.Input<string>;
    /**
     * turn on table auto encryption. Valid values are `ON`, `OFF`. Only MySQL 8.0 supports. 
     * > **NOTE:** `encryptNewTables` Polardb MySQL 8.0 cluster, after TDE and Automatic Encryption are enabled, all newly created tables are automatically encrypted in the cluster.
     */
    encryptNewTables?: pulumi.Input<string>;
    /**
     * Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
     */
    maintainTime?: pulumi.Input<string>;
    /**
     * Use as `dbNodeClass` change class, define upgrade or downgrade. Valid values are `Upgrade`, `Downgrade`, Default to `Upgrade`.
     */
    modifyType?: pulumi.Input<string>;
    /**
     * Set of parameters needs to be set after DB cluster was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/98122.htm) .
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.polardb.ClusterParameter>[]>;
    /**
     * Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
     */
    payType?: pulumi.Input<string>;
    period?: pulumi.Input<number>;
    /**
     * Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
     */
    renewalStatus?: pulumi.Input<string>;
    /**
     * The ID of resource group which the PolarDB cluster belongs. If not specified, then it belongs to the default resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The ID of the security group. Separate multiple security groups with commas (,). You can add a maximum of three security groups to a cluster.
     * > **NOTE:** Because of data backup and migration, change DB cluster type and storage would cost 15~20 minutes. Please make full preparation before changing them.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of IP addresses allowed to access all databases of a cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     */
    securityIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * turn on TDE encryption. Valid values are `Enabled`, `Disabled`. Default to `Disabled`. TDE cannot be closed after it is turned on. 
     * > **NOTE:** `tdeStatus` Cannot modify after created when `dbType` is `PostgreSQL` or `Oracle`.`tdeStatus` only support modification from `Disabled` to `Enabled` when `dbType` is `MySQL`.
     */
    tdeStatus?: pulumi.Input<string>;
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     * > **NOTE:** If vswitchId is not specified, system will get a vswitch belongs to the user automatically.
     */
    vswitchId?: pulumi.Input<string>;
    /**
     * The Zone to launch the DB cluster. it supports multiple zone.
     */
    zoneId?: pulumi.Input<string>;
}
