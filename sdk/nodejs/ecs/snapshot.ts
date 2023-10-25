// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * > **DEPRECATED:** This resource has been renamed to alicloud.ecs.EcsSnapshot from version 1.120.0.
 *
 * Provides an ECS snapshot resource.
 *
 * For information about snapshot and how to use it, see [Snapshot](https://www.alibabacloud.com/help/doc-detail/25460.html).
 *
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnapshotState | undefined;
            resourceInputs["category"] = state ? state.category : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["diskId"] = state ? state.diskId : undefined;
            resourceInputs["force"] = state ? state.force : undefined;
            resourceInputs["instantAccess"] = state ? state.instantAccess : undefined;
            resourceInputs["instantAccessRetentionDays"] = state ? state.instantAccessRetentionDays : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["retentionDays"] = state ? state.retentionDays : undefined;
            resourceInputs["snapshotName"] = state ? state.snapshotName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as SnapshotArgs | undefined;
            if ((!args || args.diskId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'diskId'");
            }
            resourceInputs["category"] = args ? args.category : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["diskId"] = args ? args.diskId : undefined;
            resourceInputs["force"] = args ? args.force : undefined;
            resourceInputs["instantAccess"] = args ? args.instantAccess : undefined;
            resourceInputs["instantAccessRetentionDays"] = args ? args.instantAccessRetentionDays : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["retentionDays"] = args ? args.retentionDays : undefined;
            resourceInputs["snapshotName"] = args ? args.snapshotName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Snapshot.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Snapshot resources.
 */
export interface SnapshotState {
    category?: pulumi.Input<string>;
    /**
     * Description of the snapshot. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    description?: pulumi.Input<string>;
    /**
     * The source disk ID.
     */
    diskId?: pulumi.Input<string>;
    force?: pulumi.Input<boolean>;
    instantAccess?: pulumi.Input<boolean>;
    instantAccessRetentionDays?: pulumi.Input<number>;
    /**
     * The name of the snapshot to be created. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * It cannot start with auto, because snapshot names starting with auto are recognized as automatic snapshots.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    retentionDays?: pulumi.Input<number>;
    snapshotName?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a Snapshot resource.
 */
export interface SnapshotArgs {
    category?: pulumi.Input<string>;
    /**
     * Description of the snapshot. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
     */
    description?: pulumi.Input<string>;
    /**
     * The source disk ID.
     */
    diskId: pulumi.Input<string>;
    force?: pulumi.Input<boolean>;
    instantAccess?: pulumi.Input<boolean>;
    instantAccessRetentionDays?: pulumi.Input<number>;
    /**
     * The name of the snapshot to be created. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * It cannot start with auto, because snapshot names starting with auto are recognized as automatic snapshots.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    retentionDays?: pulumi.Input<number>;
    snapshotName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
