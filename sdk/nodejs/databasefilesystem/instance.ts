// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a DBFS Dbfs Instance resource. An instance of a database file system is equivalent to a file system and can store data of file types.
 *
 * For information about DBFS Dbfs Instance and how to use it, see [What is Dbfs Instance](https://next.api.alibabacloud.com/document/DBFS/2020-04-18/CreateDbfs).
 *
 * > **NOTE:** Available since v1.136.0.
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
 * const name = config.get("name") || "terraform-example";
 * const example = new alicloud.databasefilesystem.Instance("example", {
 *     category: "standard",
 *     zoneId: "cn-hangzhou-i",
 *     performanceLevel: "PL1",
 *     instanceName: name,
 *     size: 100,
 * });
 * ```
 *
 * ## Import
 *
 * DBFS Dbfs Instance can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:databasefilesystem/instance:Instance example <id>
 * ```
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:databasefilesystem/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    /**
     * The number of CPU cores and the upper limit of memory used by the database file storage instance.
     */
    public readonly advancedFeatures!: pulumi.Output<string>;
    /**
     * Category of database file system.
     */
    public readonly category!: pulumi.Output<string>;
    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Whether to delete the original snapshot after creating DBFS using the snapshot.
     */
    public readonly deleteSnapshot!: pulumi.Output<boolean | undefined>;
    /**
     * The collection of ECS instances mounted to the Database file system. See `ecsList` below.  **NOTE:** Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS. See `ecsList` below.
     *
     * @deprecated Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.
     */
    public readonly ecsLists!: pulumi.Output<outputs.databasefilesystem.InstanceEcsList[] | undefined>;
    /**
     * Whether to create DBFS in RAID mode. If created in RAID mode, the capacity is at least 66GB.Valid values: true or false. Default value: false.
     */
    public readonly enableRaid!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to encrypt DBFS.Valid values: true or false. Default value: false.
     */
    public readonly encryption!: pulumi.Output<boolean | undefined>;
    /**
     * Database file system name.
     */
    public readonly fsName!: pulumi.Output<string>;
    /**
     * . Field 'instance_name' has been deprecated from provider version 1.212.0. New field 'fs_name' instead.
     *
     * @deprecated Field 'instance_name' has been deprecated since provider version 1.212.0. New field 'fs_name' instead.
     */
    public readonly instanceName!: pulumi.Output<string>;
    /**
     * Instance type. Value range:
     * - dbfs.small
     * - dbfs.medium
     * - dbfs.large (default)
     */
    public readonly instanceType!: pulumi.Output<string | undefined>;
    /**
     * The ID of the KMS key used by DBFS.
     */
    public readonly kmsKeyId!: pulumi.Output<string | undefined>;
    /**
     * When you create a DBFS instance, set the performance level of the DBFS instance. Value range:
     * - PL0: single disk maximum random read-write IOPS 10000
     * - PL1: highest random read-write IOPS 50000 per disk (default)
     * - PL2: single disk maximum random read-write IOPS 100000
     * - PL3: single disk maximum random read-write IOPS 1 million.
     */
    public readonly performanceLevel!: pulumi.Output<string>;
    /**
     * Number of strips. Required when the EnableRaid parameter is true.Value range: Currently, only 8 stripes are supported.
     */
    public readonly raidStripeUnitNumber!: pulumi.Output<number | undefined>;
    /**
     * Size of database file system, unit GiB.
     */
    public readonly size!: pulumi.Output<number>;
    /**
     * The ID of the snapshot used to create the DBFS instance.
     */
    public readonly snapshotId!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The usage scenario of DBFS. Value range:
     * - MySQL 5.7
     * - PostgreSQL
     * - MongoDB.
     */
    public readonly usedScene!: pulumi.Output<string | undefined>;
    /**
     * The ID of the zone to which the database file system belongs.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceState | undefined;
            resourceInputs["advancedFeatures"] = state ? state.advancedFeatures : undefined;
            resourceInputs["category"] = state ? state.category : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["deleteSnapshot"] = state ? state.deleteSnapshot : undefined;
            resourceInputs["ecsLists"] = state ? state.ecsLists : undefined;
            resourceInputs["enableRaid"] = state ? state.enableRaid : undefined;
            resourceInputs["encryption"] = state ? state.encryption : undefined;
            resourceInputs["fsName"] = state ? state.fsName : undefined;
            resourceInputs["instanceName"] = state ? state.instanceName : undefined;
            resourceInputs["instanceType"] = state ? state.instanceType : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["performanceLevel"] = state ? state.performanceLevel : undefined;
            resourceInputs["raidStripeUnitNumber"] = state ? state.raidStripeUnitNumber : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["snapshotId"] = state ? state.snapshotId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["usedScene"] = state ? state.usedScene : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if ((!args || args.category === undefined) && !opts.urn) {
                throw new Error("Missing required property 'category'");
            }
            if ((!args || args.size === undefined) && !opts.urn) {
                throw new Error("Missing required property 'size'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["advancedFeatures"] = args ? args.advancedFeatures : undefined;
            resourceInputs["category"] = args ? args.category : undefined;
            resourceInputs["deleteSnapshot"] = args ? args.deleteSnapshot : undefined;
            resourceInputs["ecsLists"] = args ? args.ecsLists : undefined;
            resourceInputs["enableRaid"] = args ? args.enableRaid : undefined;
            resourceInputs["encryption"] = args ? args.encryption : undefined;
            resourceInputs["fsName"] = args ? args.fsName : undefined;
            resourceInputs["instanceName"] = args ? args.instanceName : undefined;
            resourceInputs["instanceType"] = args ? args.instanceType : undefined;
            resourceInputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            resourceInputs["performanceLevel"] = args ? args.performanceLevel : undefined;
            resourceInputs["raidStripeUnitNumber"] = args ? args.raidStripeUnitNumber : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["snapshotId"] = args ? args.snapshotId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["usedScene"] = args ? args.usedScene : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Instance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * The number of CPU cores and the upper limit of memory used by the database file storage instance.
     */
    advancedFeatures?: pulumi.Input<string>;
    /**
     * Category of database file system.
     */
    category?: pulumi.Input<string>;
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Whether to delete the original snapshot after creating DBFS using the snapshot.
     */
    deleteSnapshot?: pulumi.Input<boolean>;
    /**
     * The collection of ECS instances mounted to the Database file system. See `ecsList` below.  **NOTE:** Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS. See `ecsList` below.
     *
     * @deprecated Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.
     */
    ecsLists?: pulumi.Input<pulumi.Input<inputs.databasefilesystem.InstanceEcsList>[]>;
    /**
     * Whether to create DBFS in RAID mode. If created in RAID mode, the capacity is at least 66GB.Valid values: true or false. Default value: false.
     */
    enableRaid?: pulumi.Input<boolean>;
    /**
     * Whether to encrypt DBFS.Valid values: true or false. Default value: false.
     */
    encryption?: pulumi.Input<boolean>;
    /**
     * Database file system name.
     */
    fsName?: pulumi.Input<string>;
    /**
     * . Field 'instance_name' has been deprecated from provider version 1.212.0. New field 'fs_name' instead.
     *
     * @deprecated Field 'instance_name' has been deprecated since provider version 1.212.0. New field 'fs_name' instead.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * Instance type. Value range:
     * - dbfs.small
     * - dbfs.medium
     * - dbfs.large (default)
     */
    instanceType?: pulumi.Input<string>;
    /**
     * The ID of the KMS key used by DBFS.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * When you create a DBFS instance, set the performance level of the DBFS instance. Value range:
     * - PL0: single disk maximum random read-write IOPS 10000
     * - PL1: highest random read-write IOPS 50000 per disk (default)
     * - PL2: single disk maximum random read-write IOPS 100000
     * - PL3: single disk maximum random read-write IOPS 1 million.
     */
    performanceLevel?: pulumi.Input<string>;
    /**
     * Number of strips. Required when the EnableRaid parameter is true.Value range: Currently, only 8 stripes are supported.
     */
    raidStripeUnitNumber?: pulumi.Input<number>;
    /**
     * Size of database file system, unit GiB.
     */
    size?: pulumi.Input<number>;
    /**
     * The ID of the snapshot used to create the DBFS instance.
     */
    snapshotId?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The usage scenario of DBFS. Value range:
     * - MySQL 5.7
     * - PostgreSQL
     * - MongoDB.
     */
    usedScene?: pulumi.Input<string>;
    /**
     * The ID of the zone to which the database file system belongs.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * The number of CPU cores and the upper limit of memory used by the database file storage instance.
     */
    advancedFeatures?: pulumi.Input<string>;
    /**
     * Category of database file system.
     */
    category: pulumi.Input<string>;
    /**
     * Whether to delete the original snapshot after creating DBFS using the snapshot.
     */
    deleteSnapshot?: pulumi.Input<boolean>;
    /**
     * The collection of ECS instances mounted to the Database file system. See `ecsList` below.  **NOTE:** Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS. See `ecsList` below.
     *
     * @deprecated Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.
     */
    ecsLists?: pulumi.Input<pulumi.Input<inputs.databasefilesystem.InstanceEcsList>[]>;
    /**
     * Whether to create DBFS in RAID mode. If created in RAID mode, the capacity is at least 66GB.Valid values: true or false. Default value: false.
     */
    enableRaid?: pulumi.Input<boolean>;
    /**
     * Whether to encrypt DBFS.Valid values: true or false. Default value: false.
     */
    encryption?: pulumi.Input<boolean>;
    /**
     * Database file system name.
     */
    fsName?: pulumi.Input<string>;
    /**
     * . Field 'instance_name' has been deprecated from provider version 1.212.0. New field 'fs_name' instead.
     *
     * @deprecated Field 'instance_name' has been deprecated since provider version 1.212.0. New field 'fs_name' instead.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * Instance type. Value range:
     * - dbfs.small
     * - dbfs.medium
     * - dbfs.large (default)
     */
    instanceType?: pulumi.Input<string>;
    /**
     * The ID of the KMS key used by DBFS.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * When you create a DBFS instance, set the performance level of the DBFS instance. Value range:
     * - PL0: single disk maximum random read-write IOPS 10000
     * - PL1: highest random read-write IOPS 50000 per disk (default)
     * - PL2: single disk maximum random read-write IOPS 100000
     * - PL3: single disk maximum random read-write IOPS 1 million.
     */
    performanceLevel?: pulumi.Input<string>;
    /**
     * Number of strips. Required when the EnableRaid parameter is true.Value range: Currently, only 8 stripes are supported.
     */
    raidStripeUnitNumber?: pulumi.Input<number>;
    /**
     * Size of database file system, unit GiB.
     */
    size: pulumi.Input<number>;
    /**
     * The ID of the snapshot used to create the DBFS instance.
     */
    snapshotId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The usage scenario of DBFS. Value range:
     * - MySQL 5.7
     * - PostgreSQL
     * - MongoDB.
     */
    usedScene?: pulumi.Input<string>;
    /**
     * The ID of the zone to which the database file system belongs.
     */
    zoneId: pulumi.Input<string>;
}
