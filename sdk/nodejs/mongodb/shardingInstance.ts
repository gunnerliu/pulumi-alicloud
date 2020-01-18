// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/mongodb_sharding_instance.html.markdown.
 */
export class ShardingInstance extends pulumi.CustomResource {
    /**
     * Get an existing ShardingInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ShardingInstanceState, opts?: pulumi.CustomResourceOptions): ShardingInstance {
        return new ShardingInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:mongodb/shardingInstance:ShardingInstance';

    /**
     * Returns true if the given object is an instance of ShardingInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ShardingInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ShardingInstance.__pulumiType;
    }

    /**
     * Password of the root account. It is a string of 6 to 32 characters and is composed of letters, numbers, and underlines.
     */
    public readonly accountPassword!: pulumi.Output<string | undefined>;
    /**
     * MongoDB Instance backup period. It is required when `backupTime` was existed. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
     */
    public readonly backupPeriods!: pulumi.Output<string[]>;
    /**
     * MongoDB instance backup time. It is required when `backupPeriod` was existed. In the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. If not set, the system will return a default, like "23:00Z-24:00Z".
     */
    public readonly backupTime!: pulumi.Output<string>;
    /**
     * Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/zh/doc-detail/61884.htm) `EngineVersion`. 
     * * `storageEngine` (Optional, ForceNew) Storage engine: WiredTiger or RocksDB. System Default value: WiredTiger.
     */
    public readonly engineVersion!: pulumi.Output<string>;
    /**
     * Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
     */
    public readonly instanceChargeType!: pulumi.Output<string>;
    /**
     * An KMS encrypts password used to a instance. If the `accountPassword` is filled in, this field will be ignored.
     */
    public readonly kmsEncryptedPassword!: pulumi.Output<string | undefined>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating instance with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    public readonly kmsEncryptionContext!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The mongo-node count can be purchased is in range of [2, 32].
     * * `nodeClass` -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
     */
    public readonly mongoLists!: pulumi.Output<outputs.mongodb.ShardingInstanceMongoList[]>;
    /**
     * The name of DB instance. It a string of 2 to 256 characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The duration that you will buy DB instance (in month). It is valid when instanceChargeType is `PrePaid`. Valid values: [1~9], 12, 24, 36. System default to 1.
     */
    public readonly period!: pulumi.Output<number>;
    /**
     * Instance log backup retention days. Available in 1.42.0+.
     */
    public /*out*/ readonly retentionPeriod!: pulumi.Output<number>;
    /**
     * List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]). System default to `["127.0.0.1"]`.
     */
    public readonly securityIpLists!: pulumi.Output<string[]>;
    /**
     * the shard-node count can be purchased is in range of [2, 32].
     * * `nodeClass` -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
     */
    public readonly shardLists!: pulumi.Output<outputs.mongodb.ShardingInstanceShardList[]>;
    public readonly storageEngine!: pulumi.Output<string>;
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     */
    public readonly vswitchId!: pulumi.Output<string | undefined>;
    /**
     * The Zone to launch the DB instance. MongoDB sharding instance does not support multiple-zone.
     * If it is a multi-zone and `vswitchId` is specified, the vswitch must in one of them.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a ShardingInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ShardingInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ShardingInstanceArgs | ShardingInstanceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ShardingInstanceState | undefined;
            inputs["accountPassword"] = state ? state.accountPassword : undefined;
            inputs["backupPeriods"] = state ? state.backupPeriods : undefined;
            inputs["backupTime"] = state ? state.backupTime : undefined;
            inputs["engineVersion"] = state ? state.engineVersion : undefined;
            inputs["instanceChargeType"] = state ? state.instanceChargeType : undefined;
            inputs["kmsEncryptedPassword"] = state ? state.kmsEncryptedPassword : undefined;
            inputs["kmsEncryptionContext"] = state ? state.kmsEncryptionContext : undefined;
            inputs["mongoLists"] = state ? state.mongoLists : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["period"] = state ? state.period : undefined;
            inputs["retentionPeriod"] = state ? state.retentionPeriod : undefined;
            inputs["securityIpLists"] = state ? state.securityIpLists : undefined;
            inputs["shardLists"] = state ? state.shardLists : undefined;
            inputs["storageEngine"] = state ? state.storageEngine : undefined;
            inputs["vswitchId"] = state ? state.vswitchId : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ShardingInstanceArgs | undefined;
            if (!args || args.engineVersion === undefined) {
                throw new Error("Missing required property 'engineVersion'");
            }
            if (!args || args.mongoLists === undefined) {
                throw new Error("Missing required property 'mongoLists'");
            }
            if (!args || args.shardLists === undefined) {
                throw new Error("Missing required property 'shardLists'");
            }
            inputs["accountPassword"] = args ? args.accountPassword : undefined;
            inputs["backupPeriods"] = args ? args.backupPeriods : undefined;
            inputs["backupTime"] = args ? args.backupTime : undefined;
            inputs["engineVersion"] = args ? args.engineVersion : undefined;
            inputs["instanceChargeType"] = args ? args.instanceChargeType : undefined;
            inputs["kmsEncryptedPassword"] = args ? args.kmsEncryptedPassword : undefined;
            inputs["kmsEncryptionContext"] = args ? args.kmsEncryptionContext : undefined;
            inputs["mongoLists"] = args ? args.mongoLists : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["period"] = args ? args.period : undefined;
            inputs["securityIpLists"] = args ? args.securityIpLists : undefined;
            inputs["shardLists"] = args ? args.shardLists : undefined;
            inputs["storageEngine"] = args ? args.storageEngine : undefined;
            inputs["vswitchId"] = args ? args.vswitchId : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
            inputs["retentionPeriod"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ShardingInstance.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ShardingInstance resources.
 */
export interface ShardingInstanceState {
    /**
     * Password of the root account. It is a string of 6 to 32 characters and is composed of letters, numbers, and underlines.
     */
    readonly accountPassword?: pulumi.Input<string>;
    /**
     * MongoDB Instance backup period. It is required when `backupTime` was existed. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
     */
    readonly backupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * MongoDB instance backup time. It is required when `backupPeriod` was existed. In the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. If not set, the system will return a default, like "23:00Z-24:00Z".
     */
    readonly backupTime?: pulumi.Input<string>;
    /**
     * Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/zh/doc-detail/61884.htm) `EngineVersion`. 
     * * `storageEngine` (Optional, ForceNew) Storage engine: WiredTiger or RocksDB. System Default value: WiredTiger.
     */
    readonly engineVersion?: pulumi.Input<string>;
    /**
     * Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * An KMS encrypts password used to a instance. If the `accountPassword` is filled in, this field will be ignored.
     */
    readonly kmsEncryptedPassword?: pulumi.Input<string>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating instance with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    readonly kmsEncryptionContext?: pulumi.Input<{[key: string]: any}>;
    /**
     * The mongo-node count can be purchased is in range of [2, 32].
     * * `nodeClass` -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
     */
    readonly mongoLists?: pulumi.Input<pulumi.Input<inputs.mongodb.ShardingInstanceMongoList>[]>;
    /**
     * The name of DB instance. It a string of 2 to 256 characters.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The duration that you will buy DB instance (in month). It is valid when instanceChargeType is `PrePaid`. Valid values: [1~9], 12, 24, 36. System default to 1.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * Instance log backup retention days. Available in 1.42.0+.
     */
    readonly retentionPeriod?: pulumi.Input<number>;
    /**
     * List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]). System default to `["127.0.0.1"]`.
     */
    readonly securityIpLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * the shard-node count can be purchased is in range of [2, 32].
     * * `nodeClass` -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
     */
    readonly shardLists?: pulumi.Input<pulumi.Input<inputs.mongodb.ShardingInstanceShardList>[]>;
    readonly storageEngine?: pulumi.Input<string>;
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The Zone to launch the DB instance. MongoDB sharding instance does not support multiple-zone.
     * If it is a multi-zone and `vswitchId` is specified, the vswitch must in one of them.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ShardingInstance resource.
 */
export interface ShardingInstanceArgs {
    /**
     * Password of the root account. It is a string of 6 to 32 characters and is composed of letters, numbers, and underlines.
     */
    readonly accountPassword?: pulumi.Input<string>;
    /**
     * MongoDB Instance backup period. It is required when `backupTime` was existed. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
     */
    readonly backupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * MongoDB instance backup time. It is required when `backupPeriod` was existed. In the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. If not set, the system will return a default, like "23:00Z-24:00Z".
     */
    readonly backupTime?: pulumi.Input<string>;
    /**
     * Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/zh/doc-detail/61884.htm) `EngineVersion`. 
     * * `storageEngine` (Optional, ForceNew) Storage engine: WiredTiger or RocksDB. System Default value: WiredTiger.
     */
    readonly engineVersion: pulumi.Input<string>;
    /**
     * Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * An KMS encrypts password used to a instance. If the `accountPassword` is filled in, this field will be ignored.
     */
    readonly kmsEncryptedPassword?: pulumi.Input<string>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating instance with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    readonly kmsEncryptionContext?: pulumi.Input<{[key: string]: any}>;
    /**
     * The mongo-node count can be purchased is in range of [2, 32].
     * * `nodeClass` -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
     */
    readonly mongoLists: pulumi.Input<pulumi.Input<inputs.mongodb.ShardingInstanceMongoList>[]>;
    /**
     * The name of DB instance. It a string of 2 to 256 characters.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The duration that you will buy DB instance (in month). It is valid when instanceChargeType is `PrePaid`. Valid values: [1~9], 12, 24, 36. System default to 1.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]). System default to `["127.0.0.1"]`.
     */
    readonly securityIpLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * the shard-node count can be purchased is in range of [2, 32].
     * * `nodeClass` -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
     */
    readonly shardLists: pulumi.Input<pulumi.Input<inputs.mongodb.ShardingInstanceShardList>[]>;
    readonly storageEngine?: pulumi.Input<string>;
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The Zone to launch the DB instance. MongoDB sharding instance does not support multiple-zone.
     * If it is a multi-zone and `vswitchId` is specified, the vswitch must in one of them.
     */
    readonly zoneId?: pulumi.Input<string>;
}
