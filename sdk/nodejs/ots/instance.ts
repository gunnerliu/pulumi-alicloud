// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource will help you to manager a [Table Store](https://www.alibabacloud.com/help/doc-detail/27280.htm) Instance.
 * It is foundation of creating data table.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Create an OTS instance
 * const foo = new alicloud.ots.Instance("foo", {
 *     accessedBy: "Vpc",
 *     description: "for table",
 *     tags: {
 *         Created: "TF",
 *         For: "Building table",
 *     },
 * });
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
    public static readonly __pulumiType = 'alicloud:ots/instance:Instance';

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
     * The network limitation of accessing instance. Valid values:
     */
    public readonly accessedBy!: pulumi.Output<string | undefined>;
    /**
     * The description of the instance. Currently, it does not support modifying.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
     */
    public readonly instanceType!: pulumi.Output<string | undefined>;
    /**
     * The name of the instance.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the instance.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as InstanceState | undefined;
            inputs["accessedBy"] = state ? state.accessedBy : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["instanceType"] = state ? state.instanceType : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            inputs["accessedBy"] = args ? args.accessedBy : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["instanceType"] = args ? args.instanceType : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["tags"] = args ? args.tags : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Instance.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * The network limitation of accessing instance. Valid values:
     */
    readonly accessedBy?: pulumi.Input<string>;
    /**
     * The description of the instance. Currently, it does not support modifying.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * The name of the instance.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the instance.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * The network limitation of accessing instance. Valid values:
     */
    readonly accessedBy?: pulumi.Input<string>;
    /**
     * The description of the instance. Currently, it does not support modifying.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * The name of the instance.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the instance.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
}
