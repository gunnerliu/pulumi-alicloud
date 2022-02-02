// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Serverless Workflow Schedule resource.
 *
 * For information about Serverless Workflow Schedule and how to use it, see [What is Schedule](https://www.alibabacloud.com/help/en/doc-detail/168934.htm).
 *
 * > **NOTE:** Available in v1.105.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const exampleFlow = new alicloud.fnf.Flow("exampleFlow", {
 *     definition: `  version: v1beta1
 *   type: flow
 *   steps:
 *     - type: pass
 *       name: helloworld
 * `,
 *     description: "tf-testaccFnFFlow983041",
 *     type: "FDL",
 * });
 * const exampleSchedule = new alicloud.fnf.Schedule("exampleSchedule", {
 *     cronExpression: "30 9 * * * *",
 *     description: "tf-testaccFnFSchedule983041",
 *     enable: "true",
 *     flowName: exampleFlow.name,
 *     payload: "{\"tf-test\": \"test success\"}",
 *     scheduleName: "tf-testaccFnFSchedule983041",
 * });
 * ```
 *
 * ## Import
 *
 * Serverless Workflow Schedule can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:fnf/schedule:Schedule example <schedule_name>:<flow_name>
 * ```
 */
export class Schedule extends pulumi.CustomResource {
    /**
     * Get an existing Schedule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScheduleState, opts?: pulumi.CustomResourceOptions): Schedule {
        return new Schedule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:fnf/schedule:Schedule';

    /**
     * Returns true if the given object is an instance of Schedule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Schedule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Schedule.__pulumiType;
    }

    /**
     * The CRON expression of the time-based schedule to be created.
     */
    public readonly cronExpression!: pulumi.Output<string>;
    /**
     * The description of the time-based schedule to be created.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether to enable the time-based schedule you want to create. Valid values: `false`, `true`.
     */
    public readonly enable!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the flow bound to the time-based schedule you want to create.
     */
    public readonly flowName!: pulumi.Output<string>;
    /**
     * The time when the time-based schedule was last updated.
     */
    public /*out*/ readonly lastModifiedTime!: pulumi.Output<string>;
    /**
     * The trigger message of the time-based schedule to be created. It must be in JSON object format.
     */
    public readonly payload!: pulumi.Output<string | undefined>;
    /**
     * The ID of the time-based schedule.
     */
    public /*out*/ readonly scheduleId!: pulumi.Output<string>;
    /**
     * The name of the time-based schedule to be created.
     */
    public readonly scheduleName!: pulumi.Output<string>;

    /**
     * Create a Schedule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScheduleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScheduleArgs | ScheduleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ScheduleState | undefined;
            resourceInputs["cronExpression"] = state ? state.cronExpression : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enable"] = state ? state.enable : undefined;
            resourceInputs["flowName"] = state ? state.flowName : undefined;
            resourceInputs["lastModifiedTime"] = state ? state.lastModifiedTime : undefined;
            resourceInputs["payload"] = state ? state.payload : undefined;
            resourceInputs["scheduleId"] = state ? state.scheduleId : undefined;
            resourceInputs["scheduleName"] = state ? state.scheduleName : undefined;
        } else {
            const args = argsOrState as ScheduleArgs | undefined;
            if ((!args || args.cronExpression === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cronExpression'");
            }
            if ((!args || args.flowName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'flowName'");
            }
            if ((!args || args.scheduleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scheduleName'");
            }
            resourceInputs["cronExpression"] = args ? args.cronExpression : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enable"] = args ? args.enable : undefined;
            resourceInputs["flowName"] = args ? args.flowName : undefined;
            resourceInputs["payload"] = args ? args.payload : undefined;
            resourceInputs["scheduleName"] = args ? args.scheduleName : undefined;
            resourceInputs["lastModifiedTime"] = undefined /*out*/;
            resourceInputs["scheduleId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Schedule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Schedule resources.
 */
export interface ScheduleState {
    /**
     * The CRON expression of the time-based schedule to be created.
     */
    cronExpression?: pulumi.Input<string>;
    /**
     * The description of the time-based schedule to be created.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies whether to enable the time-based schedule you want to create. Valid values: `false`, `true`.
     */
    enable?: pulumi.Input<boolean>;
    /**
     * The name of the flow bound to the time-based schedule you want to create.
     */
    flowName?: pulumi.Input<string>;
    /**
     * The time when the time-based schedule was last updated.
     */
    lastModifiedTime?: pulumi.Input<string>;
    /**
     * The trigger message of the time-based schedule to be created. It must be in JSON object format.
     */
    payload?: pulumi.Input<string>;
    /**
     * The ID of the time-based schedule.
     */
    scheduleId?: pulumi.Input<string>;
    /**
     * The name of the time-based schedule to be created.
     */
    scheduleName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Schedule resource.
 */
export interface ScheduleArgs {
    /**
     * The CRON expression of the time-based schedule to be created.
     */
    cronExpression: pulumi.Input<string>;
    /**
     * The description of the time-based schedule to be created.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies whether to enable the time-based schedule you want to create. Valid values: `false`, `true`.
     */
    enable?: pulumi.Input<boolean>;
    /**
     * The name of the flow bound to the time-based schedule you want to create.
     */
    flowName: pulumi.Input<string>;
    /**
     * The trigger message of the time-based schedule to be created. It must be in JSON object format.
     */
    payload?: pulumi.Input<string>;
    /**
     * The name of the time-based schedule to be created.
     */
    scheduleName: pulumi.Input<string>;
}
