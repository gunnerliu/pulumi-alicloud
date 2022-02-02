// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Snapshot can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ecs/snapshotPolicy:SnapshotPolicy snapshot sp-abc1234567890000
 * ```
 */
export class SnapshotPolicy extends pulumi.CustomResource {
    /**
     * Get an existing SnapshotPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnapshotPolicyState, opts?: pulumi.CustomResourceOptions): SnapshotPolicy {
        return new SnapshotPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/snapshotPolicy:SnapshotPolicy';

    /**
     * Returns true if the given object is an instance of SnapshotPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SnapshotPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SnapshotPolicy.__pulumiType;
    }

    public readonly copiedSnapshotsRetentionDays!: pulumi.Output<number | undefined>;
    public readonly enableCrossRegionCopy!: pulumi.Output<boolean | undefined>;
    /**
     * The snapshot policy name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
     * - A maximum of seven time points can be selected.
     * - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
     */
    public readonly repeatWeekdays!: pulumi.Output<string[]>;
    /**
     * The snapshot retention time, and the unit of measurement is day. Optional values:
     * - -1: The automatic snapshots are retained permanently.
     * - [1, 65536]: The number of days retained.
     */
    public readonly retentionDays!: pulumi.Output<number>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    public readonly targetCopyRegions!: pulumi.Output<string[] | undefined>;
    /**
     * The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
     * - A maximum of 24 time points can be selected.
     * - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
     */
    public readonly timePoints!: pulumi.Output<string[]>;

    /**
     * Create a SnapshotPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnapshotPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnapshotPolicyArgs | SnapshotPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnapshotPolicyState | undefined;
            resourceInputs["copiedSnapshotsRetentionDays"] = state ? state.copiedSnapshotsRetentionDays : undefined;
            resourceInputs["enableCrossRegionCopy"] = state ? state.enableCrossRegionCopy : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["repeatWeekdays"] = state ? state.repeatWeekdays : undefined;
            resourceInputs["retentionDays"] = state ? state.retentionDays : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["targetCopyRegions"] = state ? state.targetCopyRegions : undefined;
            resourceInputs["timePoints"] = state ? state.timePoints : undefined;
        } else {
            const args = argsOrState as SnapshotPolicyArgs | undefined;
            if ((!args || args.repeatWeekdays === undefined) && !opts.urn) {
                throw new Error("Missing required property 'repeatWeekdays'");
            }
            if ((!args || args.retentionDays === undefined) && !opts.urn) {
                throw new Error("Missing required property 'retentionDays'");
            }
            if ((!args || args.timePoints === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timePoints'");
            }
            resourceInputs["copiedSnapshotsRetentionDays"] = args ? args.copiedSnapshotsRetentionDays : undefined;
            resourceInputs["enableCrossRegionCopy"] = args ? args.enableCrossRegionCopy : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["repeatWeekdays"] = args ? args.repeatWeekdays : undefined;
            resourceInputs["retentionDays"] = args ? args.retentionDays : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["targetCopyRegions"] = args ? args.targetCopyRegions : undefined;
            resourceInputs["timePoints"] = args ? args.timePoints : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SnapshotPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SnapshotPolicy resources.
 */
export interface SnapshotPolicyState {
    copiedSnapshotsRetentionDays?: pulumi.Input<number>;
    enableCrossRegionCopy?: pulumi.Input<boolean>;
    /**
     * The snapshot policy name.
     */
    name?: pulumi.Input<string>;
    /**
     * The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
     * - A maximum of seven time points can be selected.
     * - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
     */
    repeatWeekdays?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The snapshot retention time, and the unit of measurement is day. Optional values:
     * - -1: The automatic snapshots are retained permanently.
     * - [1, 65536]: The number of days retained.
     */
    retentionDays?: pulumi.Input<number>;
    status?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: any}>;
    targetCopyRegions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
     * - A maximum of 24 time points can be selected.
     * - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
     */
    timePoints?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a SnapshotPolicy resource.
 */
export interface SnapshotPolicyArgs {
    copiedSnapshotsRetentionDays?: pulumi.Input<number>;
    enableCrossRegionCopy?: pulumi.Input<boolean>;
    /**
     * The snapshot policy name.
     */
    name?: pulumi.Input<string>;
    /**
     * The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
     * - A maximum of seven time points can be selected.
     * - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
     */
    repeatWeekdays: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The snapshot retention time, and the unit of measurement is day. Optional values:
     * - -1: The automatic snapshots are retained permanently.
     * - [1, 65536]: The number of days retained.
     */
    retentionDays: pulumi.Input<number>;
    tags?: pulumi.Input<{[key: string]: any}>;
    targetCopyRegions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
     * - A maximum of 24 time points can be selected.
     * - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
     */
    timePoints: pulumi.Input<pulumi.Input<string>[]>;
}
