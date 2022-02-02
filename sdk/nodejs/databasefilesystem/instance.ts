// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a DBFS Instance resource.
 *
 * For information about DBFS Instance and how to use it, see [What is Instance](https://help.aliyun.com/document_detail/149726.html).
 *
 * > **NOTE:** Available in v1.136.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.databasefilesystem.Instance("example", {
 *     category: "standard",
 *     instanceName: "example_value",
 *     size: 1,
 *     zoneId: "example_value",
 * });
 * ```
 *
 * ## Import
 *
 * DBFS Instance can be imported using the id, e.g.
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

    public readonly attachMode!: pulumi.Output<string | undefined>;
    public readonly attachPoint!: pulumi.Output<string | undefined>;
    /**
     * The type of the Database file system. Valid values: `standard`.
     */
    public readonly category!: pulumi.Output<string>;
    /**
     * Whether to delete the original snapshot after the DBFS is created using the snapshot. Valid values : `true` anf `false`.
     */
    public readonly deleteSnapshot!: pulumi.Output<boolean | undefined>;
    /**
     * The collection of ECS instances mounted to the Database file system. See the following `Block ecsList`.
     */
    public readonly ecsLists!: pulumi.Output<outputs.databasefilesystem.InstanceEcsList[] | undefined>;
    /**
     * Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
     */
    public readonly enableRaid!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to encrypt the database file system. Valid values: `true` and `false`.
     */
    public readonly encryption!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the Database file system.
     */
    public readonly instanceName!: pulumi.Output<string>;
    /**
     * The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
     */
    public readonly kmsKeyId!: pulumi.Output<string | undefined>;
    /**
     * The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
     */
    public readonly performanceLevel!: pulumi.Output<string>;
    /**
     * The number of strip. This parameter is valid When `enableRaid` parameter is set to `true`.
     */
    public readonly raidStripeUnitNumber!: pulumi.Output<string | undefined>;
    /**
     * The size Of the Database file system. Unit: GiB.
     */
    public readonly size!: pulumi.Output<number>;
    /**
     * The snapshot id of the Database file system.
     */
    public readonly snapshotId!: pulumi.Output<string | undefined>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    public readonly usedScene!: pulumi.Output<string | undefined>;
    /**
     * The Zone ID of the Database file system.
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
            resourceInputs["attachMode"] = state ? state.attachMode : undefined;
            resourceInputs["attachPoint"] = state ? state.attachPoint : undefined;
            resourceInputs["category"] = state ? state.category : undefined;
            resourceInputs["deleteSnapshot"] = state ? state.deleteSnapshot : undefined;
            resourceInputs["ecsLists"] = state ? state.ecsLists : undefined;
            resourceInputs["enableRaid"] = state ? state.enableRaid : undefined;
            resourceInputs["encryption"] = state ? state.encryption : undefined;
            resourceInputs["instanceName"] = state ? state.instanceName : undefined;
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
            if ((!args || args.instanceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceName'");
            }
            if ((!args || args.size === undefined) && !opts.urn) {
                throw new Error("Missing required property 'size'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["attachMode"] = args ? args.attachMode : undefined;
            resourceInputs["attachPoint"] = args ? args.attachPoint : undefined;
            resourceInputs["category"] = args ? args.category : undefined;
            resourceInputs["deleteSnapshot"] = args ? args.deleteSnapshot : undefined;
            resourceInputs["ecsLists"] = args ? args.ecsLists : undefined;
            resourceInputs["enableRaid"] = args ? args.enableRaid : undefined;
            resourceInputs["encryption"] = args ? args.encryption : undefined;
            resourceInputs["instanceName"] = args ? args.instanceName : undefined;
            resourceInputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            resourceInputs["performanceLevel"] = args ? args.performanceLevel : undefined;
            resourceInputs["raidStripeUnitNumber"] = args ? args.raidStripeUnitNumber : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["snapshotId"] = args ? args.snapshotId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["usedScene"] = args ? args.usedScene : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
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
    attachMode?: pulumi.Input<string>;
    attachPoint?: pulumi.Input<string>;
    /**
     * The type of the Database file system. Valid values: `standard`.
     */
    category?: pulumi.Input<string>;
    /**
     * Whether to delete the original snapshot after the DBFS is created using the snapshot. Valid values : `true` anf `false`.
     */
    deleteSnapshot?: pulumi.Input<boolean>;
    /**
     * The collection of ECS instances mounted to the Database file system. See the following `Block ecsList`.
     */
    ecsLists?: pulumi.Input<pulumi.Input<inputs.databasefilesystem.InstanceEcsList>[]>;
    /**
     * Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
     */
    enableRaid?: pulumi.Input<boolean>;
    /**
     * Whether to encrypt the database file system. Valid values: `true` and `false`.
     */
    encryption?: pulumi.Input<boolean>;
    /**
     * The name of the Database file system.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
     */
    performanceLevel?: pulumi.Input<string>;
    /**
     * The number of strip. This parameter is valid When `enableRaid` parameter is set to `true`.
     */
    raidStripeUnitNumber?: pulumi.Input<string>;
    /**
     * The size Of the Database file system. Unit: GiB.
     */
    size?: pulumi.Input<number>;
    /**
     * The snapshot id of the Database file system.
     */
    snapshotId?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: any}>;
    usedScene?: pulumi.Input<string>;
    /**
     * The Zone ID of the Database file system.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    attachMode?: pulumi.Input<string>;
    attachPoint?: pulumi.Input<string>;
    /**
     * The type of the Database file system. Valid values: `standard`.
     */
    category?: pulumi.Input<string>;
    /**
     * Whether to delete the original snapshot after the DBFS is created using the snapshot. Valid values : `true` anf `false`.
     */
    deleteSnapshot?: pulumi.Input<boolean>;
    /**
     * The collection of ECS instances mounted to the Database file system. See the following `Block ecsList`.
     */
    ecsLists?: pulumi.Input<pulumi.Input<inputs.databasefilesystem.InstanceEcsList>[]>;
    /**
     * Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
     */
    enableRaid?: pulumi.Input<boolean>;
    /**
     * Whether to encrypt the database file system. Valid values: `true` and `false`.
     */
    encryption?: pulumi.Input<boolean>;
    /**
     * The name of the Database file system.
     */
    instanceName: pulumi.Input<string>;
    /**
     * The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
     */
    performanceLevel?: pulumi.Input<string>;
    /**
     * The number of strip. This parameter is valid When `enableRaid` parameter is set to `true`.
     */
    raidStripeUnitNumber?: pulumi.Input<string>;
    /**
     * The size Of the Database file system. Unit: GiB.
     */
    size: pulumi.Input<number>;
    /**
     * The snapshot id of the Database file system.
     */
    snapshotId?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: any}>;
    usedScene?: pulumi.Input<string>;
    /**
     * The Zone ID of the Database file system.
     */
    zoneId: pulumi.Input<string>;
}
