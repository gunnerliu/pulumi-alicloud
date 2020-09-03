// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an RDS instance backup policy resource and used to configure instance backup policy.
 *
 * > **NOTE:** Each DB instance has a backup policy and it will be set default values when destroying the resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const creation = config.get("creation") || "Rds";
 * const name = config.get("name") || "dbbackuppolicybasic";
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: creation,
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {cidrBlock: "172.16.0.0/16"});
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     availabilityZone: defaultZones.then(defaultZones => defaultZones.zones[0].id),
 * });
 * const instance = new alicloud.rds.Instance("instance", {
 *     engine: "MySQL",
 *     engineVersion: "5.6",
 *     instanceType: "rds.mysql.s1.small",
 *     instanceStorage: "10",
 *     vswitchId: defaultSwitch.id,
 *     instanceName: name,
 * });
 * const policy = new alicloud.rds.BackupPolicy("policy", {instanceId: instance.id});
 * ```
 */
export class BackupPolicy extends pulumi.CustomResource {
    /**
     * Get an existing BackupPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BackupPolicyState, opts?: pulumi.CustomResourceOptions): BackupPolicy {
        return new BackupPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:rds/backupPolicy:BackupPolicy';

    /**
     * Returns true if the given object is an instance of BackupPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BackupPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BackupPolicy.__pulumiType;
    }

    /**
     * Instance archive backup keep count. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. When `archiveBackupKeepPolicy` is `ByMonth` Valid values: [1-31]. When `archiveBackupKeepPolicy` is `ByWeek` Valid values: [1-7].
     */
    public readonly archiveBackupKeepCount!: pulumi.Output<number>;
    /**
     * Instance archive backup keep policy. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values are `ByMonth`, `Disable`, `KeepAll`.
     */
    public readonly archiveBackupKeepPolicy!: pulumi.Output<string>;
    /**
     * Instance archive backup retention days. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values: [30-1095], and `archiveBackupRetentionPeriod` must larger than `backupRetentionPeriod` 730.
     */
    public readonly archiveBackupRetentionPeriod!: pulumi.Output<number>;
    /**
     * It has been deprecated from version 1.69.0, and use field 'preferred_backup_period' instead.
     *
     * @deprecated Attribute 'backup_period' has been deprecated from version 1.69.0. Use `preferred_backup_period` instead
     */
    public readonly backupPeriods!: pulumi.Output<string[]>;
    /**
     * Instance backup retention days. Valid values: [7-730]. Default to 7. But mysql local disk is unlimited.
     */
    public readonly backupRetentionPeriod!: pulumi.Output<number | undefined>;
    /**
     * It has been deprecated from version 1.69.0, and use field 'preferred_backup_time' instead.
     *
     * @deprecated Attribute 'backup_time' has been deprecated from version 1.69.0. Use `preferred_backup_time` instead
     */
    public readonly backupTime!: pulumi.Output<string>;
    /**
     * The compress type of instance policy. Valid values are `1`, `4`, `8`.
     */
    public readonly compressType!: pulumi.Output<string>;
    /**
     * Whether to backup instance log. Valid values are `true`, `false`, Default to `true`. Note: The 'Basic Edition' category Rds instance does not support setting log backup. [What is Basic Edition](https://www.alibabacloud.com/help/doc-detail/48980.htm).
     */
    public readonly enableBackupLog!: pulumi.Output<boolean>;
    /**
     * Instance high space usage protection policy. Valid when the `enableBackupLog` is `true`. Valid values are `Enable`, `Disable`.
     */
    public readonly highSpaceUsageProtection!: pulumi.Output<string | undefined>;
    /**
     * The Id of instance that can run database.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * Instance log backup local retention hours. Valid when the `enableBackupLog` is `true`. Valid values: [0-7*24].
     */
    public readonly localLogRetentionHours!: pulumi.Output<number>;
    /**
     * Instance log backup local retention space. Valid when the `enableBackupLog` is `true`. Valid values: [5-50].
     */
    public readonly localLogRetentionSpace!: pulumi.Output<number>;
    /**
     * It has been deprecated from version 1.68.0, and use field 'enable_backup_log' instead.
     *
     * @deprecated Attribute 'log_backup' has been deprecated from version 1.68.0. Use `enable_backup_log` instead
     */
    public readonly logBackup!: pulumi.Output<boolean>;
    /**
     * Instance log backup frequency. Valid when the instance engine is `SQLServer`. Valid values are `LogInterval`.
     */
    public readonly logBackupFrequency!: pulumi.Output<string>;
    /**
     * Instance log backup retention days. Valid when the `enableBackupLog` is `1`. Valid values: [7-730]. Default to 7. It cannot be larger than `backupRetentionPeriod`.
     */
    public readonly logBackupRetentionPeriod!: pulumi.Output<number>;
    /**
     * It has been deprecated from version 1.69.0, and use field 'log_backup_retention_period' instead.
     *
     * @deprecated Attribute 'log_retention_period' has been deprecated from version 1.69.0. Use `log_backup_retention_period` instead
     */
    public readonly logRetentionPeriod!: pulumi.Output<number>;
    /**
     * DB Instance backup period. Please set at least two days to ensure backing up at least twice a week. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
     */
    public readonly preferredBackupPeriods!: pulumi.Output<string[]>;
    /**
     * DB instance backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
     */
    public readonly preferredBackupTime!: pulumi.Output<string | undefined>;
    /**
     * It has been deprecated from version 1.69.0, and use field 'backup_retention_period' instead.
     *
     * @deprecated Attribute 'retention_period' has been deprecated from version 1.69.0. Use `backup_retention_period` instead
     */
    public readonly retentionPeriod!: pulumi.Output<number>;

    /**
     * Create a BackupPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BackupPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BackupPolicyArgs | BackupPolicyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as BackupPolicyState | undefined;
            inputs["archiveBackupKeepCount"] = state ? state.archiveBackupKeepCount : undefined;
            inputs["archiveBackupKeepPolicy"] = state ? state.archiveBackupKeepPolicy : undefined;
            inputs["archiveBackupRetentionPeriod"] = state ? state.archiveBackupRetentionPeriod : undefined;
            inputs["backupPeriods"] = state ? state.backupPeriods : undefined;
            inputs["backupRetentionPeriod"] = state ? state.backupRetentionPeriod : undefined;
            inputs["backupTime"] = state ? state.backupTime : undefined;
            inputs["compressType"] = state ? state.compressType : undefined;
            inputs["enableBackupLog"] = state ? state.enableBackupLog : undefined;
            inputs["highSpaceUsageProtection"] = state ? state.highSpaceUsageProtection : undefined;
            inputs["instanceId"] = state ? state.instanceId : undefined;
            inputs["localLogRetentionHours"] = state ? state.localLogRetentionHours : undefined;
            inputs["localLogRetentionSpace"] = state ? state.localLogRetentionSpace : undefined;
            inputs["logBackup"] = state ? state.logBackup : undefined;
            inputs["logBackupFrequency"] = state ? state.logBackupFrequency : undefined;
            inputs["logBackupRetentionPeriod"] = state ? state.logBackupRetentionPeriod : undefined;
            inputs["logRetentionPeriod"] = state ? state.logRetentionPeriod : undefined;
            inputs["preferredBackupPeriods"] = state ? state.preferredBackupPeriods : undefined;
            inputs["preferredBackupTime"] = state ? state.preferredBackupTime : undefined;
            inputs["retentionPeriod"] = state ? state.retentionPeriod : undefined;
        } else {
            const args = argsOrState as BackupPolicyArgs | undefined;
            if (!args || args.instanceId === undefined) {
                throw new Error("Missing required property 'instanceId'");
            }
            inputs["archiveBackupKeepCount"] = args ? args.archiveBackupKeepCount : undefined;
            inputs["archiveBackupKeepPolicy"] = args ? args.archiveBackupKeepPolicy : undefined;
            inputs["archiveBackupRetentionPeriod"] = args ? args.archiveBackupRetentionPeriod : undefined;
            inputs["backupPeriods"] = args ? args.backupPeriods : undefined;
            inputs["backupRetentionPeriod"] = args ? args.backupRetentionPeriod : undefined;
            inputs["backupTime"] = args ? args.backupTime : undefined;
            inputs["compressType"] = args ? args.compressType : undefined;
            inputs["enableBackupLog"] = args ? args.enableBackupLog : undefined;
            inputs["highSpaceUsageProtection"] = args ? args.highSpaceUsageProtection : undefined;
            inputs["instanceId"] = args ? args.instanceId : undefined;
            inputs["localLogRetentionHours"] = args ? args.localLogRetentionHours : undefined;
            inputs["localLogRetentionSpace"] = args ? args.localLogRetentionSpace : undefined;
            inputs["logBackup"] = args ? args.logBackup : undefined;
            inputs["logBackupFrequency"] = args ? args.logBackupFrequency : undefined;
            inputs["logBackupRetentionPeriod"] = args ? args.logBackupRetentionPeriod : undefined;
            inputs["logRetentionPeriod"] = args ? args.logRetentionPeriod : undefined;
            inputs["preferredBackupPeriods"] = args ? args.preferredBackupPeriods : undefined;
            inputs["preferredBackupTime"] = args ? args.preferredBackupTime : undefined;
            inputs["retentionPeriod"] = args ? args.retentionPeriod : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(BackupPolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BackupPolicy resources.
 */
export interface BackupPolicyState {
    /**
     * Instance archive backup keep count. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. When `archiveBackupKeepPolicy` is `ByMonth` Valid values: [1-31]. When `archiveBackupKeepPolicy` is `ByWeek` Valid values: [1-7].
     */
    readonly archiveBackupKeepCount?: pulumi.Input<number>;
    /**
     * Instance archive backup keep policy. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values are `ByMonth`, `Disable`, `KeepAll`.
     */
    readonly archiveBackupKeepPolicy?: pulumi.Input<string>;
    /**
     * Instance archive backup retention days. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values: [30-1095], and `archiveBackupRetentionPeriod` must larger than `backupRetentionPeriod` 730.
     */
    readonly archiveBackupRetentionPeriod?: pulumi.Input<number>;
    /**
     * It has been deprecated from version 1.69.0, and use field 'preferred_backup_period' instead.
     *
     * @deprecated Attribute 'backup_period' has been deprecated from version 1.69.0. Use `preferred_backup_period` instead
     */
    readonly backupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Instance backup retention days. Valid values: [7-730]. Default to 7. But mysql local disk is unlimited.
     */
    readonly backupRetentionPeriod?: pulumi.Input<number>;
    /**
     * It has been deprecated from version 1.69.0, and use field 'preferred_backup_time' instead.
     *
     * @deprecated Attribute 'backup_time' has been deprecated from version 1.69.0. Use `preferred_backup_time` instead
     */
    readonly backupTime?: pulumi.Input<string>;
    /**
     * The compress type of instance policy. Valid values are `1`, `4`, `8`.
     */
    readonly compressType?: pulumi.Input<string>;
    /**
     * Whether to backup instance log. Valid values are `true`, `false`, Default to `true`. Note: The 'Basic Edition' category Rds instance does not support setting log backup. [What is Basic Edition](https://www.alibabacloud.com/help/doc-detail/48980.htm).
     */
    readonly enableBackupLog?: pulumi.Input<boolean>;
    /**
     * Instance high space usage protection policy. Valid when the `enableBackupLog` is `true`. Valid values are `Enable`, `Disable`.
     */
    readonly highSpaceUsageProtection?: pulumi.Input<string>;
    /**
     * The Id of instance that can run database.
     */
    readonly instanceId?: pulumi.Input<string>;
    /**
     * Instance log backup local retention hours. Valid when the `enableBackupLog` is `true`. Valid values: [0-7*24].
     */
    readonly localLogRetentionHours?: pulumi.Input<number>;
    /**
     * Instance log backup local retention space. Valid when the `enableBackupLog` is `true`. Valid values: [5-50].
     */
    readonly localLogRetentionSpace?: pulumi.Input<number>;
    /**
     * It has been deprecated from version 1.68.0, and use field 'enable_backup_log' instead.
     *
     * @deprecated Attribute 'log_backup' has been deprecated from version 1.68.0. Use `enable_backup_log` instead
     */
    readonly logBackup?: pulumi.Input<boolean>;
    /**
     * Instance log backup frequency. Valid when the instance engine is `SQLServer`. Valid values are `LogInterval`.
     */
    readonly logBackupFrequency?: pulumi.Input<string>;
    /**
     * Instance log backup retention days. Valid when the `enableBackupLog` is `1`. Valid values: [7-730]. Default to 7. It cannot be larger than `backupRetentionPeriod`.
     */
    readonly logBackupRetentionPeriod?: pulumi.Input<number>;
    /**
     * It has been deprecated from version 1.69.0, and use field 'log_backup_retention_period' instead.
     *
     * @deprecated Attribute 'log_retention_period' has been deprecated from version 1.69.0. Use `log_backup_retention_period` instead
     */
    readonly logRetentionPeriod?: pulumi.Input<number>;
    /**
     * DB Instance backup period. Please set at least two days to ensure backing up at least twice a week. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
     */
    readonly preferredBackupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * DB instance backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
     */
    readonly preferredBackupTime?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.69.0, and use field 'backup_retention_period' instead.
     *
     * @deprecated Attribute 'retention_period' has been deprecated from version 1.69.0. Use `backup_retention_period` instead
     */
    readonly retentionPeriod?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a BackupPolicy resource.
 */
export interface BackupPolicyArgs {
    /**
     * Instance archive backup keep count. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. When `archiveBackupKeepPolicy` is `ByMonth` Valid values: [1-31]. When `archiveBackupKeepPolicy` is `ByWeek` Valid values: [1-7].
     */
    readonly archiveBackupKeepCount?: pulumi.Input<number>;
    /**
     * Instance archive backup keep policy. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values are `ByMonth`, `Disable`, `KeepAll`.
     */
    readonly archiveBackupKeepPolicy?: pulumi.Input<string>;
    /**
     * Instance archive backup retention days. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values: [30-1095], and `archiveBackupRetentionPeriod` must larger than `backupRetentionPeriod` 730.
     */
    readonly archiveBackupRetentionPeriod?: pulumi.Input<number>;
    /**
     * It has been deprecated from version 1.69.0, and use field 'preferred_backup_period' instead.
     *
     * @deprecated Attribute 'backup_period' has been deprecated from version 1.69.0. Use `preferred_backup_period` instead
     */
    readonly backupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Instance backup retention days. Valid values: [7-730]. Default to 7. But mysql local disk is unlimited.
     */
    readonly backupRetentionPeriod?: pulumi.Input<number>;
    /**
     * It has been deprecated from version 1.69.0, and use field 'preferred_backup_time' instead.
     *
     * @deprecated Attribute 'backup_time' has been deprecated from version 1.69.0. Use `preferred_backup_time` instead
     */
    readonly backupTime?: pulumi.Input<string>;
    /**
     * The compress type of instance policy. Valid values are `1`, `4`, `8`.
     */
    readonly compressType?: pulumi.Input<string>;
    /**
     * Whether to backup instance log. Valid values are `true`, `false`, Default to `true`. Note: The 'Basic Edition' category Rds instance does not support setting log backup. [What is Basic Edition](https://www.alibabacloud.com/help/doc-detail/48980.htm).
     */
    readonly enableBackupLog?: pulumi.Input<boolean>;
    /**
     * Instance high space usage protection policy. Valid when the `enableBackupLog` is `true`. Valid values are `Enable`, `Disable`.
     */
    readonly highSpaceUsageProtection?: pulumi.Input<string>;
    /**
     * The Id of instance that can run database.
     */
    readonly instanceId: pulumi.Input<string>;
    /**
     * Instance log backup local retention hours. Valid when the `enableBackupLog` is `true`. Valid values: [0-7*24].
     */
    readonly localLogRetentionHours?: pulumi.Input<number>;
    /**
     * Instance log backup local retention space. Valid when the `enableBackupLog` is `true`. Valid values: [5-50].
     */
    readonly localLogRetentionSpace?: pulumi.Input<number>;
    /**
     * It has been deprecated from version 1.68.0, and use field 'enable_backup_log' instead.
     *
     * @deprecated Attribute 'log_backup' has been deprecated from version 1.68.0. Use `enable_backup_log` instead
     */
    readonly logBackup?: pulumi.Input<boolean>;
    /**
     * Instance log backup frequency. Valid when the instance engine is `SQLServer`. Valid values are `LogInterval`.
     */
    readonly logBackupFrequency?: pulumi.Input<string>;
    /**
     * Instance log backup retention days. Valid when the `enableBackupLog` is `1`. Valid values: [7-730]. Default to 7. It cannot be larger than `backupRetentionPeriod`.
     */
    readonly logBackupRetentionPeriod?: pulumi.Input<number>;
    /**
     * It has been deprecated from version 1.69.0, and use field 'log_backup_retention_period' instead.
     *
     * @deprecated Attribute 'log_retention_period' has been deprecated from version 1.69.0. Use `log_backup_retention_period` instead
     */
    readonly logRetentionPeriod?: pulumi.Input<number>;
    /**
     * DB Instance backup period. Please set at least two days to ensure backing up at least twice a week. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
     */
    readonly preferredBackupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * DB instance backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
     */
    readonly preferredBackupTime?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.69.0, and use field 'backup_retention_period' instead.
     *
     * @deprecated Attribute 'retention_period' has been deprecated from version 1.69.0. Use `backup_retention_period` instead
     */
    readonly retentionPeriod?: pulumi.Input<number>;
}
