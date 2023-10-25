// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a RDS Backup resource.
 *
 * For information about RDS Backup and how to use it, see [What is Backup](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-createbackup).
 *
 * > **NOTE:** Available since v1.149.0.
 *
 * ## Import
 *
 * RDS Backup can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:rds/rdsBackup:RdsBackup example <db_instance_id>:<backup_id>
 * ```
 */
export class RdsBackup extends pulumi.CustomResource {
    /**
     * Get an existing RdsBackup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RdsBackupState, opts?: pulumi.CustomResourceOptions): RdsBackup {
        return new RdsBackup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:rds/rdsBackup:RdsBackup';

    /**
     * Returns true if the given object is an instance of RdsBackup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RdsBackup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RdsBackup.__pulumiType;
    }

    /**
     * The backup id.
     */
    public /*out*/ readonly backupId!: pulumi.Output<string>;
    /**
     * The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
     */
    public readonly backupMethod!: pulumi.Output<string>;
    /**
     * The policy that you want to use for the backup task. Valid values:
     * * **db**: specifies to perform a database-level backup.
     * * **instance**: specifies to perform an instance-level backup.
     */
    public readonly backupStrategy!: pulumi.Output<string | undefined>;
    /**
     * The method that you want to use for the backup task. Default value: `Auto`. Valid values:
     * * **Auto**: specifies to automatically perform a full or incremental backup.
     * * **FullBackup**: specifies to perform a full backup.
     */
    public readonly backupType!: pulumi.Output<string>;
    /**
     * The db instance id.
     */
    public readonly dbInstanceId!: pulumi.Output<string>;
    /**
     * The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
     */
    public readonly dbName!: pulumi.Output<string | undefined>;
    /**
     * Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
     */
    public readonly removeFromState!: pulumi.Output<boolean | undefined>;
    /**
     * Indicates whether the data backup file can be deleted. Valid values: `Enabled` and `Disabled`.
     */
    public /*out*/ readonly storeStatus!: pulumi.Output<string>;

    /**
     * Create a RdsBackup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RdsBackupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RdsBackupArgs | RdsBackupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RdsBackupState | undefined;
            resourceInputs["backupId"] = state ? state.backupId : undefined;
            resourceInputs["backupMethod"] = state ? state.backupMethod : undefined;
            resourceInputs["backupStrategy"] = state ? state.backupStrategy : undefined;
            resourceInputs["backupType"] = state ? state.backupType : undefined;
            resourceInputs["dbInstanceId"] = state ? state.dbInstanceId : undefined;
            resourceInputs["dbName"] = state ? state.dbName : undefined;
            resourceInputs["removeFromState"] = state ? state.removeFromState : undefined;
            resourceInputs["storeStatus"] = state ? state.storeStatus : undefined;
        } else {
            const args = argsOrState as RdsBackupArgs | undefined;
            if ((!args || args.dbInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbInstanceId'");
            }
            resourceInputs["backupMethod"] = args ? args.backupMethod : undefined;
            resourceInputs["backupStrategy"] = args ? args.backupStrategy : undefined;
            resourceInputs["backupType"] = args ? args.backupType : undefined;
            resourceInputs["dbInstanceId"] = args ? args.dbInstanceId : undefined;
            resourceInputs["dbName"] = args ? args.dbName : undefined;
            resourceInputs["removeFromState"] = args ? args.removeFromState : undefined;
            resourceInputs["backupId"] = undefined /*out*/;
            resourceInputs["storeStatus"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RdsBackup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RdsBackup resources.
 */
export interface RdsBackupState {
    /**
     * The backup id.
     */
    backupId?: pulumi.Input<string>;
    /**
     * The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
     */
    backupMethod?: pulumi.Input<string>;
    /**
     * The policy that you want to use for the backup task. Valid values:
     * * **db**: specifies to perform a database-level backup.
     * * **instance**: specifies to perform an instance-level backup.
     */
    backupStrategy?: pulumi.Input<string>;
    /**
     * The method that you want to use for the backup task. Default value: `Auto`. Valid values:
     * * **Auto**: specifies to automatically perform a full or incremental backup.
     * * **FullBackup**: specifies to perform a full backup.
     */
    backupType?: pulumi.Input<string>;
    /**
     * The db instance id.
     */
    dbInstanceId?: pulumi.Input<string>;
    /**
     * The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
     */
    dbName?: pulumi.Input<string>;
    /**
     * Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
     */
    removeFromState?: pulumi.Input<boolean>;
    /**
     * Indicates whether the data backup file can be deleted. Valid values: `Enabled` and `Disabled`.
     */
    storeStatus?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RdsBackup resource.
 */
export interface RdsBackupArgs {
    /**
     * The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
     */
    backupMethod?: pulumi.Input<string>;
    /**
     * The policy that you want to use for the backup task. Valid values:
     * * **db**: specifies to perform a database-level backup.
     * * **instance**: specifies to perform an instance-level backup.
     */
    backupStrategy?: pulumi.Input<string>;
    /**
     * The method that you want to use for the backup task. Default value: `Auto`. Valid values:
     * * **Auto**: specifies to automatically perform a full or incremental backup.
     * * **FullBackup**: specifies to perform a full backup.
     */
    backupType?: pulumi.Input<string>;
    /**
     * The db instance id.
     */
    dbInstanceId: pulumi.Input<string>;
    /**
     * The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
     */
    dbName?: pulumi.Input<string>;
    /**
     * Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
     */
    removeFromState?: pulumi.Input<boolean>;
}
