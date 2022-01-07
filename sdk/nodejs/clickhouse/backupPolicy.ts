// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Click House Backup Policy resource.
 *
 * For information about Click House Backup Policy and how to use it, see [What is Backup Policy](https://www.alibabacloud.com/help/doc-detail/208840.html).
 *
 * > **NOTE:** Available in v1.147.0+.
 *
 * > **NOTE:** Only the cloud database ClickHouse cluster version `20.3` supports data backup.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultRegions = alicloud.clickhouse.getRegions({
 *     current: true,
 * });
 * const defaultNetworks = alicloud.vpc.getNetworks({
 *     nameRegex: "default-NODELETING",
 * });
 * const defaultSwitches = Promise.all([defaultNetworks, defaultRegions]).then(([defaultNetworks, defaultRegions]) => alicloud.vpc.getSwitches({
 *     vpcId: defaultNetworks.ids?[0],
 *     zoneId: defaultRegions.regions?[0]?.zoneIds?[0]?.zoneId,
 * }));
 * const defaultDbCluster = new alicloud.clickhouse.DbCluster("defaultDbCluster", {
 *     dbClusterVersion: "20.3.10.75",
 *     status: "Running",
 *     category: "Basic",
 *     dbClusterClass: "S8",
 *     dbClusterNetworkType: "vpc",
 *     dbClusterDescription: _var.name,
 *     dbNodeGroupCount: "1",
 *     paymentType: "PayAsYouGo",
 *     dbNodeStorage: "500",
 *     storageType: "cloud_essd",
 *     vswitchId: defaultSwitches.then(defaultSwitches => defaultSwitches.vswitches?[0]?.id),
 * });
 * const example = new alicloud.clickhouse.BackupPolicy("example", {
 *     dbClusterId: defaultDbCluster.id,
 *     preferredBackupPeriods: [
 *         "Monday",
 *         "Friday",
 *     ],
 *     preferredBackupTime: "00:00Z-01:00Z",
 *     backupRetentionPeriod: 7,
 * });
 * ```
 *
 * ## Import
 *
 * Click House Backup Policy can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:clickhouse/backupPolicy:BackupPolicy example <db_cluster_id>
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
    public static readonly __pulumiType = 'alicloud:clickhouse/backupPolicy:BackupPolicy';

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
     * Data backup days. Valid values: `7` to `730`.
     */
    public readonly backupRetentionPeriod!: pulumi.Output<number | undefined>;
    /**
     * The id of the DBCluster.
     */
    public readonly dbClusterId!: pulumi.Output<string>;
    /**
     * DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
     */
    public readonly preferredBackupPeriods!: pulumi.Output<string[]>;
    /**
     * DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
     */
    public readonly preferredBackupTime!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

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
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BackupPolicyState | undefined;
            inputs["backupRetentionPeriod"] = state ? state.backupRetentionPeriod : undefined;
            inputs["dbClusterId"] = state ? state.dbClusterId : undefined;
            inputs["preferredBackupPeriods"] = state ? state.preferredBackupPeriods : undefined;
            inputs["preferredBackupTime"] = state ? state.preferredBackupTime : undefined;
            inputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as BackupPolicyArgs | undefined;
            if ((!args || args.dbClusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbClusterId'");
            }
            if ((!args || args.preferredBackupPeriods === undefined) && !opts.urn) {
                throw new Error("Missing required property 'preferredBackupPeriods'");
            }
            if ((!args || args.preferredBackupTime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'preferredBackupTime'");
            }
            inputs["backupRetentionPeriod"] = args ? args.backupRetentionPeriod : undefined;
            inputs["dbClusterId"] = args ? args.dbClusterId : undefined;
            inputs["preferredBackupPeriods"] = args ? args.preferredBackupPeriods : undefined;
            inputs["preferredBackupTime"] = args ? args.preferredBackupTime : undefined;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(BackupPolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BackupPolicy resources.
 */
export interface BackupPolicyState {
    /**
     * Data backup days. Valid values: `7` to `730`.
     */
    backupRetentionPeriod?: pulumi.Input<number>;
    /**
     * The id of the DBCluster.
     */
    dbClusterId?: pulumi.Input<string>;
    /**
     * DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
     */
    preferredBackupPeriods?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
     */
    preferredBackupTime?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BackupPolicy resource.
 */
export interface BackupPolicyArgs {
    /**
     * Data backup days. Valid values: `7` to `730`.
     */
    backupRetentionPeriod?: pulumi.Input<number>;
    /**
     * The id of the DBCluster.
     */
    dbClusterId: pulumi.Input<string>;
    /**
     * DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
     */
    preferredBackupPeriods: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
     */
    preferredBackupTime: pulumi.Input<string>;
}