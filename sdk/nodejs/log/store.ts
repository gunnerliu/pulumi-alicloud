// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Log store can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:log/store:Store example tf-log:tf-log-store
 * ```
 */
export class Store extends pulumi.CustomResource {
    /**
     * Get an existing Store resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StoreState, opts?: pulumi.CustomResourceOptions): Store {
        return new Store(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:log/store:Store';

    /**
     * Returns true if the given object is an instance of Store.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Store {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Store.__pulumiType;
    }

    /**
     * Determines whether to append log meta automatically. The meta includes log receive time and client IP address. Default to true.
     */
    public readonly appendMeta!: pulumi.Output<boolean | undefined>;
    /**
     * Determines whether to automatically split a shard. Default to true.
     */
    public readonly autoSplit!: pulumi.Output<boolean | undefined>;
    /**
     * Determines whether to enable Web Tracking. Default false.
     */
    public readonly enableWebTracking!: pulumi.Output<boolean | undefined>;
    /**
     * The maximum number of shards for automatic split, which is in the range of 1 to 64. You must specify this parameter when autoSplit is true.
     */
    public readonly maxSplitShardCount!: pulumi.Output<number | undefined>;
    /**
     * The log store, which is unique in the same project.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The project name to the log store belongs.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The data retention time (in days). Valid values: [1-3650]. Default to 30. Log store data will be stored permanently when the value is "3650".
     */
    public readonly retentionPeriod!: pulumi.Output<number | undefined>;
    /**
     * The number of shards in this log store. Default to 2. You can modify it by "Split" or "Merge" operations. [Refer to details](https://www.alibabacloud.com/help/doc-detail/28976.htm)
     */
    public readonly shardCount!: pulumi.Output<number | undefined>;
    public /*out*/ readonly shards!: pulumi.Output<outputs.log.StoreShard[]>;

    /**
     * Create a Store resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StoreArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StoreArgs | StoreState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as StoreState | undefined;
            inputs["appendMeta"] = state ? state.appendMeta : undefined;
            inputs["autoSplit"] = state ? state.autoSplit : undefined;
            inputs["enableWebTracking"] = state ? state.enableWebTracking : undefined;
            inputs["maxSplitShardCount"] = state ? state.maxSplitShardCount : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["project"] = state ? state.project : undefined;
            inputs["retentionPeriod"] = state ? state.retentionPeriod : undefined;
            inputs["shardCount"] = state ? state.shardCount : undefined;
            inputs["shards"] = state ? state.shards : undefined;
        } else {
            const args = argsOrState as StoreArgs | undefined;
            if (!args || args.project === undefined) {
                throw new Error("Missing required property 'project'");
            }
            inputs["appendMeta"] = args ? args.appendMeta : undefined;
            inputs["autoSplit"] = args ? args.autoSplit : undefined;
            inputs["enableWebTracking"] = args ? args.enableWebTracking : undefined;
            inputs["maxSplitShardCount"] = args ? args.maxSplitShardCount : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["project"] = args ? args.project : undefined;
            inputs["retentionPeriod"] = args ? args.retentionPeriod : undefined;
            inputs["shardCount"] = args ? args.shardCount : undefined;
            inputs["shards"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Store.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Store resources.
 */
export interface StoreState {
    /**
     * Determines whether to append log meta automatically. The meta includes log receive time and client IP address. Default to true.
     */
    readonly appendMeta?: pulumi.Input<boolean>;
    /**
     * Determines whether to automatically split a shard. Default to true.
     */
    readonly autoSplit?: pulumi.Input<boolean>;
    /**
     * Determines whether to enable Web Tracking. Default false.
     */
    readonly enableWebTracking?: pulumi.Input<boolean>;
    /**
     * The maximum number of shards for automatic split, which is in the range of 1 to 64. You must specify this parameter when autoSplit is true.
     */
    readonly maxSplitShardCount?: pulumi.Input<number>;
    /**
     * The log store, which is unique in the same project.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project name to the log store belongs.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The data retention time (in days). Valid values: [1-3650]. Default to 30. Log store data will be stored permanently when the value is "3650".
     */
    readonly retentionPeriod?: pulumi.Input<number>;
    /**
     * The number of shards in this log store. Default to 2. You can modify it by "Split" or "Merge" operations. [Refer to details](https://www.alibabacloud.com/help/doc-detail/28976.htm)
     */
    readonly shardCount?: pulumi.Input<number>;
    readonly shards?: pulumi.Input<pulumi.Input<inputs.log.StoreShard>[]>;
}

/**
 * The set of arguments for constructing a Store resource.
 */
export interface StoreArgs {
    /**
     * Determines whether to append log meta automatically. The meta includes log receive time and client IP address. Default to true.
     */
    readonly appendMeta?: pulumi.Input<boolean>;
    /**
     * Determines whether to automatically split a shard. Default to true.
     */
    readonly autoSplit?: pulumi.Input<boolean>;
    /**
     * Determines whether to enable Web Tracking. Default false.
     */
    readonly enableWebTracking?: pulumi.Input<boolean>;
    /**
     * The maximum number of shards for automatic split, which is in the range of 1 to 64. You must specify this parameter when autoSplit is true.
     */
    readonly maxSplitShardCount?: pulumi.Input<number>;
    /**
     * The log store, which is unique in the same project.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project name to the log store belongs.
     */
    readonly project: pulumi.Input<string>;
    /**
     * The data retention time (in days). Valid values: [1-3650]. Default to 30. Log store data will be stored permanently when the value is "3650".
     */
    readonly retentionPeriod?: pulumi.Input<number>;
    /**
     * The number of shards in this log store. Default to 2. You can modify it by "Split" or "Merge" operations. [Refer to details](https://www.alibabacloud.com/help/doc-detail/28976.htm)
     */
    readonly shardCount?: pulumi.Input<number>;
}
