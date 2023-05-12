// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a HBR Nas Backup Plan resource.
 *
 * For information about HBR Nas Backup Plan and how to use it, see [What is Nas Backup Plan](https://www.alibabacloud.com/help/doc-detail/132248.htm).
 *
 * > **NOTE:** Available in v1.132.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-testAccHBRNas";
 * const defaultVault = new alicloud.hbr.Vault("defaultVault", {vaultName: name});
 * const defaultFileSystem = new alicloud.nas.FileSystem("defaultFileSystem", {
 *     protocolType: "NFS",
 *     storageType: "Performance",
 *     description: name,
 *     encryptType: 1,
 * });
 * const defaultFileSystems = defaultFileSystem.description.apply(description => alicloud.nas.getFileSystemsOutput({
 *     protocolType: "NFS",
 *     descriptionRegex: description,
 * }));
 * const defaultNasBackupPlan = new alicloud.hbr.NasBackupPlan("defaultNasBackupPlan", {
 *     nasBackupPlanName: name,
 *     fileSystemId: defaultFileSystem.id,
 *     schedule: "I|1602673264|PT2H",
 *     backupType: "COMPLETE",
 *     vaultId: defaultVault.id,
 *     createTime: defaultFileSystems.apply(defaultFileSystems => defaultFileSystems.systems?.[0]?.createTime),
 *     retention: "2",
 *     paths: ["/"],
 * }, {
 *     dependsOn: ["alicloud_nas_file_system.default"],
 * });
 * ```
 *
 * ## Import
 *
 * HBR Nas Backup Plan can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:hbr/nasBackupPlan:NasBackupPlan example <id>
 * ```
 */
export class NasBackupPlan extends pulumi.CustomResource {
    /**
     * Get an existing NasBackupPlan resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NasBackupPlanState, opts?: pulumi.CustomResourceOptions): NasBackupPlan {
        return new NasBackupPlan(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:hbr/nasBackupPlan:NasBackupPlan';

    /**
     * Returns true if the given object is an instance of NasBackupPlan.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NasBackupPlan {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NasBackupPlan.__pulumiType;
    }

    /**
     * Backup type. Valid values: `COMPLETE`.
     */
    public readonly backupType!: pulumi.Output<string>;
    /**
     * This field has been deprecated from provider version 1.153.0+. The creation time of NAS file system. **Note** The time format of the API adopts the ISO 8601, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
     *
     * @deprecated Field 'create_time' has been deprecated from provider version 1.153.0.
     */
    public readonly createTime!: pulumi.Output<string>;
    /**
     * The role name created in the original account RAM backup by the cross account managed by the current account.
     *
     * > **Note** `alicloud.hbr.NasBackupPlan` depends on the `alicloud.nas.FileSystem` and creates a mount point on the file system. If this dependency has not declared, the file system may not be deleted correctly.
     */
    public readonly crossAccountRoleName!: pulumi.Output<string | undefined>;
    /**
     * The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
     */
    public readonly crossAccountType!: pulumi.Output<string>;
    /**
     * The original account ID of the cross account backup managed by the current account.
     */
    public readonly crossAccountUserId!: pulumi.Output<number | undefined>;
    /**
     * Whether to disable the backup task. Valid values: `true`, `false`.
     */
    public readonly disabled!: pulumi.Output<boolean>;
    /**
     * The File System ID of Nas.
     */
    public readonly fileSystemId!: pulumi.Output<string>;
    /**
     * The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     */
    public readonly nasBackupPlanName!: pulumi.Output<string>;
    /**
     * This parameter specifies whether to use Windows VSS to define a backup path.
     */
    public readonly options!: pulumi.Output<string | undefined>;
    /**
     * List of backup path. Up to 65536 characters. e.g.`["/home", "/var"]`. **Note** You should at least specify a backup path, empty array not allowed here.
     */
    public readonly paths!: pulumi.Output<string[]>;
    /**
     * Backup retention days, the minimum is 1.
     */
    public readonly retention!: pulumi.Output<string>;
    /**
     * Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     */
    public readonly schedule!: pulumi.Output<string>;
    /**
     * The ID of Backup vault.
     */
    public readonly vaultId!: pulumi.Output<string>;

    /**
     * Create a NasBackupPlan resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NasBackupPlanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NasBackupPlanArgs | NasBackupPlanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NasBackupPlanState | undefined;
            resourceInputs["backupType"] = state ? state.backupType : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["crossAccountRoleName"] = state ? state.crossAccountRoleName : undefined;
            resourceInputs["crossAccountType"] = state ? state.crossAccountType : undefined;
            resourceInputs["crossAccountUserId"] = state ? state.crossAccountUserId : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["fileSystemId"] = state ? state.fileSystemId : undefined;
            resourceInputs["nasBackupPlanName"] = state ? state.nasBackupPlanName : undefined;
            resourceInputs["options"] = state ? state.options : undefined;
            resourceInputs["paths"] = state ? state.paths : undefined;
            resourceInputs["retention"] = state ? state.retention : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["vaultId"] = state ? state.vaultId : undefined;
        } else {
            const args = argsOrState as NasBackupPlanArgs | undefined;
            if ((!args || args.backupType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'backupType'");
            }
            if ((!args || args.fileSystemId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fileSystemId'");
            }
            if ((!args || args.nasBackupPlanName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nasBackupPlanName'");
            }
            if ((!args || args.paths === undefined) && !opts.urn) {
                throw new Error("Missing required property 'paths'");
            }
            if ((!args || args.retention === undefined) && !opts.urn) {
                throw new Error("Missing required property 'retention'");
            }
            if ((!args || args.schedule === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schedule'");
            }
            if ((!args || args.vaultId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vaultId'");
            }
            resourceInputs["backupType"] = args ? args.backupType : undefined;
            resourceInputs["createTime"] = args ? args.createTime : undefined;
            resourceInputs["crossAccountRoleName"] = args ? args.crossAccountRoleName : undefined;
            resourceInputs["crossAccountType"] = args ? args.crossAccountType : undefined;
            resourceInputs["crossAccountUserId"] = args ? args.crossAccountUserId : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["fileSystemId"] = args ? args.fileSystemId : undefined;
            resourceInputs["nasBackupPlanName"] = args ? args.nasBackupPlanName : undefined;
            resourceInputs["options"] = args ? args.options : undefined;
            resourceInputs["paths"] = args ? args.paths : undefined;
            resourceInputs["retention"] = args ? args.retention : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["vaultId"] = args ? args.vaultId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NasBackupPlan.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NasBackupPlan resources.
 */
export interface NasBackupPlanState {
    /**
     * Backup type. Valid values: `COMPLETE`.
     */
    backupType?: pulumi.Input<string>;
    /**
     * This field has been deprecated from provider version 1.153.0+. The creation time of NAS file system. **Note** The time format of the API adopts the ISO 8601, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
     *
     * @deprecated Field 'create_time' has been deprecated from provider version 1.153.0.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The role name created in the original account RAM backup by the cross account managed by the current account.
     *
     * > **Note** `alicloud.hbr.NasBackupPlan` depends on the `alicloud.nas.FileSystem` and creates a mount point on the file system. If this dependency has not declared, the file system may not be deleted correctly.
     */
    crossAccountRoleName?: pulumi.Input<string>;
    /**
     * The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
     */
    crossAccountType?: pulumi.Input<string>;
    /**
     * The original account ID of the cross account backup managed by the current account.
     */
    crossAccountUserId?: pulumi.Input<number>;
    /**
     * Whether to disable the backup task. Valid values: `true`, `false`.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The File System ID of Nas.
     */
    fileSystemId?: pulumi.Input<string>;
    /**
     * The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     */
    nasBackupPlanName?: pulumi.Input<string>;
    /**
     * This parameter specifies whether to use Windows VSS to define a backup path.
     */
    options?: pulumi.Input<string>;
    /**
     * List of backup path. Up to 65536 characters. e.g.`["/home", "/var"]`. **Note** You should at least specify a backup path, empty array not allowed here.
     */
    paths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Backup retention days, the minimum is 1.
     */
    retention?: pulumi.Input<string>;
    /**
     * Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     */
    schedule?: pulumi.Input<string>;
    /**
     * The ID of Backup vault.
     */
    vaultId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NasBackupPlan resource.
 */
export interface NasBackupPlanArgs {
    /**
     * Backup type. Valid values: `COMPLETE`.
     */
    backupType: pulumi.Input<string>;
    /**
     * This field has been deprecated from provider version 1.153.0+. The creation time of NAS file system. **Note** The time format of the API adopts the ISO 8601, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
     *
     * @deprecated Field 'create_time' has been deprecated from provider version 1.153.0.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The role name created in the original account RAM backup by the cross account managed by the current account.
     *
     * > **Note** `alicloud.hbr.NasBackupPlan` depends on the `alicloud.nas.FileSystem` and creates a mount point on the file system. If this dependency has not declared, the file system may not be deleted correctly.
     */
    crossAccountRoleName?: pulumi.Input<string>;
    /**
     * The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
     */
    crossAccountType?: pulumi.Input<string>;
    /**
     * The original account ID of the cross account backup managed by the current account.
     */
    crossAccountUserId?: pulumi.Input<number>;
    /**
     * Whether to disable the backup task. Valid values: `true`, `false`.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The File System ID of Nas.
     */
    fileSystemId: pulumi.Input<string>;
    /**
     * The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     */
    nasBackupPlanName: pulumi.Input<string>;
    /**
     * This parameter specifies whether to use Windows VSS to define a backup path.
     */
    options?: pulumi.Input<string>;
    /**
     * List of backup path. Up to 65536 characters. e.g.`["/home", "/var"]`. **Note** You should at least specify a backup path, empty array not allowed here.
     */
    paths: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Backup retention days, the minimum is 1.
     */
    retention: pulumi.Input<string>;
    /**
     * Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     */
    schedule: pulumi.Input<string>;
    /**
     * The ID of Backup vault.
     */
    vaultId: pulumi.Input<string>;
}
