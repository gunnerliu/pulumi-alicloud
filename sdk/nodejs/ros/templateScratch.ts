// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a ROS Template Scratch resource.
 *
 * For information about ROS Template Scratch and how to use it, see [What is Template Scratch](https://www.alibabacloud.com/help/zh/doc-detail/352074.html).
 *
 * > **NOTE:** Available in v1.151.0+.
 *
 * ## Import
 *
 * ROS Template Scratch can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ros/templateScratch:TemplateScratch example <id>
 * ```
 */
export class TemplateScratch extends pulumi.CustomResource {
    /**
     * Get an existing TemplateScratch resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TemplateScratchState, opts?: pulumi.CustomResourceOptions): TemplateScratch {
        return new TemplateScratch(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ros/templateScratch:TemplateScratch';

    /**
     * Returns true if the given object is an instance of TemplateScratch.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TemplateScratch {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TemplateScratch.__pulumiType;
    }

    /**
     * The Description of the Template Scratch.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The execution mode. Valid Values: `Async` or `Sync`.
     */
    public readonly executionMode!: pulumi.Output<string | undefined>;
    /**
     * Logical ID generation strategy. Valid Values: `LongTypePrefixAndIndexSuffix`, `LongTypePrefixAndHashSuffix` and `ShortTypePrefixAndHashSuffix`.
     */
    public readonly logicalIdStrategy!: pulumi.Output<string>;
    /**
     * Priority parameter. See the following `Block preferenceParameters`.
     */
    public readonly preferenceParameters!: pulumi.Output<outputs.ros.TemplateScratchPreferenceParameter[]>;
    /**
     * Source resource grouping. See the following `Block sourceResourceGroup`.
     */
    public readonly sourceResourceGroup!: pulumi.Output<outputs.ros.TemplateScratchSourceResourceGroup | undefined>;
    /**
     * Source resource. See the following `Block sourceResources`.
     */
    public readonly sourceResources!: pulumi.Output<outputs.ros.TemplateScratchSourceResource[] | undefined>;
    /**
     * Source tag. See the following `Block sourceTag`.
     */
    public readonly sourceTag!: pulumi.Output<outputs.ros.TemplateScratchSourceTag | undefined>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The type of the Template scan. Valid Values: `ResourceImport` or `ArchitectureReplication`.
     */
    public readonly templateScratchType!: pulumi.Output<string>;

    /**
     * Create a TemplateScratch resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TemplateScratchArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TemplateScratchArgs | TemplateScratchState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TemplateScratchState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["executionMode"] = state ? state.executionMode : undefined;
            resourceInputs["logicalIdStrategy"] = state ? state.logicalIdStrategy : undefined;
            resourceInputs["preferenceParameters"] = state ? state.preferenceParameters : undefined;
            resourceInputs["sourceResourceGroup"] = state ? state.sourceResourceGroup : undefined;
            resourceInputs["sourceResources"] = state ? state.sourceResources : undefined;
            resourceInputs["sourceTag"] = state ? state.sourceTag : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["templateScratchType"] = state ? state.templateScratchType : undefined;
        } else {
            const args = argsOrState as TemplateScratchArgs | undefined;
            if ((!args || args.templateScratchType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'templateScratchType'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["executionMode"] = args ? args.executionMode : undefined;
            resourceInputs["logicalIdStrategy"] = args ? args.logicalIdStrategy : undefined;
            resourceInputs["preferenceParameters"] = args ? args.preferenceParameters : undefined;
            resourceInputs["sourceResourceGroup"] = args ? args.sourceResourceGroup : undefined;
            resourceInputs["sourceResources"] = args ? args.sourceResources : undefined;
            resourceInputs["sourceTag"] = args ? args.sourceTag : undefined;
            resourceInputs["templateScratchType"] = args ? args.templateScratchType : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TemplateScratch.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TemplateScratch resources.
 */
export interface TemplateScratchState {
    /**
     * The Description of the Template Scratch.
     */
    description?: pulumi.Input<string>;
    /**
     * The execution mode. Valid Values: `Async` or `Sync`.
     */
    executionMode?: pulumi.Input<string>;
    /**
     * Logical ID generation strategy. Valid Values: `LongTypePrefixAndIndexSuffix`, `LongTypePrefixAndHashSuffix` and `ShortTypePrefixAndHashSuffix`.
     */
    logicalIdStrategy?: pulumi.Input<string>;
    /**
     * Priority parameter. See the following `Block preferenceParameters`.
     */
    preferenceParameters?: pulumi.Input<pulumi.Input<inputs.ros.TemplateScratchPreferenceParameter>[]>;
    /**
     * Source resource grouping. See the following `Block sourceResourceGroup`.
     */
    sourceResourceGroup?: pulumi.Input<inputs.ros.TemplateScratchSourceResourceGroup>;
    /**
     * Source resource. See the following `Block sourceResources`.
     */
    sourceResources?: pulumi.Input<pulumi.Input<inputs.ros.TemplateScratchSourceResource>[]>;
    /**
     * Source tag. See the following `Block sourceTag`.
     */
    sourceTag?: pulumi.Input<inputs.ros.TemplateScratchSourceTag>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * The type of the Template scan. Valid Values: `ResourceImport` or `ArchitectureReplication`.
     */
    templateScratchType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TemplateScratch resource.
 */
export interface TemplateScratchArgs {
    /**
     * The Description of the Template Scratch.
     */
    description?: pulumi.Input<string>;
    /**
     * The execution mode. Valid Values: `Async` or `Sync`.
     */
    executionMode?: pulumi.Input<string>;
    /**
     * Logical ID generation strategy. Valid Values: `LongTypePrefixAndIndexSuffix`, `LongTypePrefixAndHashSuffix` and `ShortTypePrefixAndHashSuffix`.
     */
    logicalIdStrategy?: pulumi.Input<string>;
    /**
     * Priority parameter. See the following `Block preferenceParameters`.
     */
    preferenceParameters?: pulumi.Input<pulumi.Input<inputs.ros.TemplateScratchPreferenceParameter>[]>;
    /**
     * Source resource grouping. See the following `Block sourceResourceGroup`.
     */
    sourceResourceGroup?: pulumi.Input<inputs.ros.TemplateScratchSourceResourceGroup>;
    /**
     * Source resource. See the following `Block sourceResources`.
     */
    sourceResources?: pulumi.Input<pulumi.Input<inputs.ros.TemplateScratchSourceResource>[]>;
    /**
     * Source tag. See the following `Block sourceTag`.
     */
    sourceTag?: pulumi.Input<inputs.ros.TemplateScratchSourceTag>;
    /**
     * The type of the Template scan. Valid Values: `ResourceImport` or `ArchitectureReplication`.
     */
    templateScratchType: pulumi.Input<string>;
}
