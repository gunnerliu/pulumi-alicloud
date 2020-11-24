// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a OOS Execution resource. For information about Alicloud OOS Execution and how to use it, see [What is Resource Alicloud OOS Execution](https://www.alibabacloud.com/help/doc-detail/120771.htm).
 *
 * > **NOTE:** Available in 1.93.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.oos.Template("default", {
 *     content: `  {
 *     "FormatVersion": "OOS-2019-06-01",
 *     "Description": "Update Describe instances of given status",
 *     "Parameters":{
 *       "Status":{
 *         "Type": "String",
 *         "Description": "(Required) The status of the Ecs instance."
 *       }
 *     },
 *     "Tasks": [
 *       {
 *         "Properties" :{
 *           "Parameters":{
 *             "Status": "{{ Status }}"
 *           },
 *           "API": "DescribeInstances",
 *           "Service": "Ecs"
 *         },
 *         "Name": "foo",
 *         "Action": "ACS::ExecuteApi"
 *       }]
 *   }
 * `,
 *     templateName: "test-name",
 *     versionName: "test",
 *     tags: {
 *         Created: "TF",
 *         For: "acceptance Test",
 *     },
 * });
 * const example = new alicloud.oos.Execution("example", {
 *     templateName: _default.templateName,
 *     description: "From TF Test",
 *     parameters: "				{\"Status\":\"Running\"}\n",
 * });
 * ```
 *
 * ## Import
 *
 * OOS Execution can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:oos/execution:Execution example exec-ef6xxxx
 * ```
 */
export class Execution extends pulumi.CustomResource {
    /**
     * Get an existing Execution resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ExecutionState, opts?: pulumi.CustomResourceOptions): Execution {
        return new Execution(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:oos/execution:Execution';

    /**
     * Returns true if the given object is an instance of Execution.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Execution {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Execution.__pulumiType;
    }

    /**
     * The counters of OOS Execution.
     */
    public /*out*/ readonly counters!: pulumi.Output<string>;
    /**
     * The time when the execution was created.
     */
    public /*out*/ readonly createDate!: pulumi.Output<string>;
    /**
     * The description of OOS Execution.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The time when the execution was ended.
     */
    public /*out*/ readonly endDate!: pulumi.Output<string>;
    /**
     * The user who execute the template.
     */
    public /*out*/ readonly executedBy!: pulumi.Output<string>;
    /**
     * Whether to include subtasks.
     */
    public /*out*/ readonly isParent!: pulumi.Output<boolean>;
    /**
     * The loop mode of OOS Execution.
     */
    public readonly loopMode!: pulumi.Output<string | undefined>;
    /**
     * The mode of OOS Execution. Valid: `Automatic`, `Debug`. Default to `Automatic`.
     */
    public readonly mode!: pulumi.Output<string | undefined>;
    /**
     * The outputs of OOS Execution.
     */
    public /*out*/ readonly outputs!: pulumi.Output<string>;
    /**
     * The parameters required by the template. Default to `{}`.
     */
    public readonly parameters!: pulumi.Output<string | undefined>;
    /**
     * The id of parent execution.
     */
    public readonly parentExecutionId!: pulumi.Output<string | undefined>;
    /**
     * The role that executes the current template.
     */
    public /*out*/ readonly ramRole!: pulumi.Output<string>;
    /**
     * The mode of safety check.
     */
    public readonly safetyCheck!: pulumi.Output<string | undefined>;
    /**
     * The time when the execution was started.
     */
    public /*out*/ readonly startDate!: pulumi.Output<string>;
    /**
     * The status of OOS Execution.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The message of status.
     */
    public /*out*/ readonly statusMessage!: pulumi.Output<string>;
    /**
     * The id of template.
     */
    public /*out*/ readonly templateId!: pulumi.Output<string>;
    /**
     * The name of execution template.
     */
    public readonly templateName!: pulumi.Output<string>;
    /**
     * The version of execution template.
     */
    public readonly templateVersion!: pulumi.Output<string>;
    /**
     * The time when the execution was updated.
     */
    public /*out*/ readonly updateDate!: pulumi.Output<string>;

    /**
     * Create a Execution resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ExecutionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ExecutionArgs | ExecutionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ExecutionState | undefined;
            inputs["counters"] = state ? state.counters : undefined;
            inputs["createDate"] = state ? state.createDate : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["endDate"] = state ? state.endDate : undefined;
            inputs["executedBy"] = state ? state.executedBy : undefined;
            inputs["isParent"] = state ? state.isParent : undefined;
            inputs["loopMode"] = state ? state.loopMode : undefined;
            inputs["mode"] = state ? state.mode : undefined;
            inputs["outputs"] = state ? state.outputs : undefined;
            inputs["parameters"] = state ? state.parameters : undefined;
            inputs["parentExecutionId"] = state ? state.parentExecutionId : undefined;
            inputs["ramRole"] = state ? state.ramRole : undefined;
            inputs["safetyCheck"] = state ? state.safetyCheck : undefined;
            inputs["startDate"] = state ? state.startDate : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["statusMessage"] = state ? state.statusMessage : undefined;
            inputs["templateId"] = state ? state.templateId : undefined;
            inputs["templateName"] = state ? state.templateName : undefined;
            inputs["templateVersion"] = state ? state.templateVersion : undefined;
            inputs["updateDate"] = state ? state.updateDate : undefined;
        } else {
            const args = argsOrState as ExecutionArgs | undefined;
            if (!args || args.templateName === undefined) {
                throw new Error("Missing required property 'templateName'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["loopMode"] = args ? args.loopMode : undefined;
            inputs["mode"] = args ? args.mode : undefined;
            inputs["parameters"] = args ? args.parameters : undefined;
            inputs["parentExecutionId"] = args ? args.parentExecutionId : undefined;
            inputs["safetyCheck"] = args ? args.safetyCheck : undefined;
            inputs["templateName"] = args ? args.templateName : undefined;
            inputs["templateVersion"] = args ? args.templateVersion : undefined;
            inputs["counters"] = undefined /*out*/;
            inputs["createDate"] = undefined /*out*/;
            inputs["endDate"] = undefined /*out*/;
            inputs["executedBy"] = undefined /*out*/;
            inputs["isParent"] = undefined /*out*/;
            inputs["outputs"] = undefined /*out*/;
            inputs["ramRole"] = undefined /*out*/;
            inputs["startDate"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
            inputs["statusMessage"] = undefined /*out*/;
            inputs["templateId"] = undefined /*out*/;
            inputs["updateDate"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Execution.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Execution resources.
 */
export interface ExecutionState {
    /**
     * The counters of OOS Execution.
     */
    readonly counters?: pulumi.Input<string>;
    /**
     * The time when the execution was created.
     */
    readonly createDate?: pulumi.Input<string>;
    /**
     * The description of OOS Execution.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The time when the execution was ended.
     */
    readonly endDate?: pulumi.Input<string>;
    /**
     * The user who execute the template.
     */
    readonly executedBy?: pulumi.Input<string>;
    /**
     * Whether to include subtasks.
     */
    readonly isParent?: pulumi.Input<boolean>;
    /**
     * The loop mode of OOS Execution.
     */
    readonly loopMode?: pulumi.Input<string>;
    /**
     * The mode of OOS Execution. Valid: `Automatic`, `Debug`. Default to `Automatic`.
     */
    readonly mode?: pulumi.Input<string>;
    /**
     * The outputs of OOS Execution.
     */
    readonly outputs?: pulumi.Input<string>;
    /**
     * The parameters required by the template. Default to `{}`.
     */
    readonly parameters?: pulumi.Input<string>;
    /**
     * The id of parent execution.
     */
    readonly parentExecutionId?: pulumi.Input<string>;
    /**
     * The role that executes the current template.
     */
    readonly ramRole?: pulumi.Input<string>;
    /**
     * The mode of safety check.
     */
    readonly safetyCheck?: pulumi.Input<string>;
    /**
     * The time when the execution was started.
     */
    readonly startDate?: pulumi.Input<string>;
    /**
     * The status of OOS Execution.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The message of status.
     */
    readonly statusMessage?: pulumi.Input<string>;
    /**
     * The id of template.
     */
    readonly templateId?: pulumi.Input<string>;
    /**
     * The name of execution template.
     */
    readonly templateName?: pulumi.Input<string>;
    /**
     * The version of execution template.
     */
    readonly templateVersion?: pulumi.Input<string>;
    /**
     * The time when the execution was updated.
     */
    readonly updateDate?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Execution resource.
 */
export interface ExecutionArgs {
    /**
     * The description of OOS Execution.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The loop mode of OOS Execution.
     */
    readonly loopMode?: pulumi.Input<string>;
    /**
     * The mode of OOS Execution. Valid: `Automatic`, `Debug`. Default to `Automatic`.
     */
    readonly mode?: pulumi.Input<string>;
    /**
     * The parameters required by the template. Default to `{}`.
     */
    readonly parameters?: pulumi.Input<string>;
    /**
     * The id of parent execution.
     */
    readonly parentExecutionId?: pulumi.Input<string>;
    /**
     * The mode of safety check.
     */
    readonly safetyCheck?: pulumi.Input<string>;
    /**
     * The name of execution template.
     */
    readonly templateName: pulumi.Input<string>;
    /**
     * The version of execution template.
     */
    readonly templateVersion?: pulumi.Input<string>;
}
