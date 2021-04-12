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
 *  $ pulumi import alicloud:ecs/snapshot:Snapshot snapshot s-abc1234567890000
 * ```
 */
export class Snapshot extends pulumi.CustomResource {
    /**
     * Get an existing Snapshot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnapshotState, opts?: pulumi.CustomResourceOptions): Snapshot {
        return new Snapshot(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/snapshot:Snapshot';

    /**
     * Returns true if the given object is an instance of Snapshot.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Snapshot {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Snapshot.__pulumiType;
    }

    public readonly category!: pulumi.Output<string | undefined>;
    /**
     * Description of the snapshot. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The source disk ID.
     */
    public readonly diskId!: pulumi.Output<string>;
    public readonly force!: pulumi.Output<boolean | undefined>;
    public readonly instantAccess!: pulumi.Output<boolean | undefined>;
    public readonly instantAccessRetentionDays!: pulumi.Output<number | undefined>;
    /**
     * The name of the snapshot to be created. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * It cannot start with auto, because snapshot names starting with auto are recognized as automatic snapshots.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the resource group.
     */
    public readonly resourceGroupId!: pulumi.Output<string | undefined>;
    public readonly retentionDays!: pulumi.Output<number | undefined>;
    public readonly snapshotName!: pulumi.Output<string>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;

    /**
     * Create a Snapshot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnapshotArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnapshotArgs | SnapshotState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnapshotState | undefined;
            inputs["category"] = state ? state.category : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["diskId"] = state ? state.diskId : undefined;
            inputs["force"] = state ? state.force : undefined;
            inputs["instantAccess"] = state ? state.instantAccess : undefined;
            inputs["instantAccessRetentionDays"] = state ? state.instantAccessRetentionDays : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            inputs["retentionDays"] = state ? state.retentionDays : undefined;
            inputs["snapshotName"] = state ? state.snapshotName : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as SnapshotArgs | undefined;
            if ((!args || args.diskId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'diskId'");
            }
            inputs["category"] = args ? args.category : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["diskId"] = args ? args.diskId : undefined;
            inputs["force"] = args ? args.force : undefined;
            inputs["instantAccess"] = args ? args.instantAccess : undefined;
            inputs["instantAccessRetentionDays"] = args ? args.instantAccessRetentionDays : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            inputs["retentionDays"] = args ? args.retentionDays : undefined;
            inputs["snapshotName"] = args ? args.snapshotName : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Snapshot.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Snapshot resources.
 */
export interface SnapshotState {
    readonly category?: pulumi.Input<string>;
    /**
     * Description of the snapshot. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The source disk ID.
     */
    readonly diskId?: pulumi.Input<string>;
    readonly force?: pulumi.Input<boolean>;
    readonly instantAccess?: pulumi.Input<boolean>;
    readonly instantAccessRetentionDays?: pulumi.Input<number>;
    /**
     * The name of the snapshot to be created. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * It cannot start with auto, because snapshot names starting with auto are recognized as automatic snapshots.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    readonly resourceGroupId?: pulumi.Input<string>;
    readonly retentionDays?: pulumi.Input<number>;
    readonly snapshotName?: pulumi.Input<string>;
    readonly status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a Snapshot resource.
 */
export interface SnapshotArgs {
    readonly category?: pulumi.Input<string>;
    /**
     * Description of the snapshot. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The source disk ID.
     */
    readonly diskId: pulumi.Input<string>;
    readonly force?: pulumi.Input<boolean>;
    readonly instantAccess?: pulumi.Input<boolean>;
    readonly instantAccessRetentionDays?: pulumi.Input<number>;
    /**
     * The name of the snapshot to be created. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * It cannot start with auto, because snapshot names starting with auto are recognized as automatic snapshots.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    readonly resourceGroupId?: pulumi.Input<string>;
    readonly retentionDays?: pulumi.Input<number>;
    readonly snapshotName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
}
