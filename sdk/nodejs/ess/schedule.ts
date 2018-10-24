// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ESS schedule resource.
 */
export class Schedule extends pulumi.CustomResource {
    /**
     * Get an existing Schedule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScheduleState): Schedule {
        return new Schedule(name, <any>state, { id });
    }

    /**
     * Description of the scheduled task, which is 2-200 characters (English or Chinese) long.
     */
    public readonly description: pulumi.Output<string>;
    /**
     * Time period within which the failed scheduled task is retried. The default value is 600s. Value range: [0, 21600]
     */
    public readonly launchExpirationTime: pulumi.Output<number | undefined>;
    /**
     * Operations performed when the scheduled task is triggered. Fill in the unique identifier of the scaling rule.
     */
    public readonly launchTime: pulumi.Output<string>;
    /**
     * End time of the scheduled task to be repeated. The date format follows the ISO8601 standard and uses UTC time. It is in the format of YYYY-MM-DDThh:mmZ. A time point 90 days after creation or modification cannot be entered. RecurrenceType, RecurrenceValue and RecurrenceEndTime must be specified.                                  
     */
    public readonly recurrenceEndTime: pulumi.Output<string>;
    /**
     * Type of the scheduled task to be repeated. RecurrenceType, RecurrenceValue and RecurrenceEndTime must be specified. Optional values:
     * - Daily: Recurrence interval by day for a scheduled task.
     * - Weekly: Recurrence interval by week for a scheduled task.
     * - Monthly: Recurrence interval by month for a scheduled task.
     */
    public readonly recurrenceType: pulumi.Output<string>;
    /**
     * Value of the scheduled task to be repeated. RecurrenceType, RecurrenceValue and RecurrenceEndTime must be specified.
     * - Daily: Only one value in the range [1,31] can be filled.
     * - Weekly: Multiple values can be filled. The values of Sunday to Saturday are 0 to 6 in sequence. Multiple values shall be separated by a comma “,”.
     * - Monthly: In the format of A-B. The value range of A and B is 1 to 31, and the B value must be greater than the A value.
     */
    public readonly recurrenceValue: pulumi.Output<string>;
    /**
     * Operations performed when the scheduled task is triggered. Fill in the unique identifier of the scaling rule.
     */
    public readonly scheduledAction: pulumi.Output<string>;
    /**
     * Display name of the scheduled task, which must be 2-40 characters (English or Chinese) long.
     */
    public readonly scheduledTaskName: pulumi.Output<string | undefined>;
    /**
     * Whether to enable the scheduled task. The default value is true.
     */
    public readonly taskEnabled: pulumi.Output<boolean | undefined>;

    /**
     * Create a Schedule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScheduleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScheduleArgs | ScheduleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state: ScheduleState = argsOrState as ScheduleState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["launchExpirationTime"] = state ? state.launchExpirationTime : undefined;
            inputs["launchTime"] = state ? state.launchTime : undefined;
            inputs["recurrenceEndTime"] = state ? state.recurrenceEndTime : undefined;
            inputs["recurrenceType"] = state ? state.recurrenceType : undefined;
            inputs["recurrenceValue"] = state ? state.recurrenceValue : undefined;
            inputs["scheduledAction"] = state ? state.scheduledAction : undefined;
            inputs["scheduledTaskName"] = state ? state.scheduledTaskName : undefined;
            inputs["taskEnabled"] = state ? state.taskEnabled : undefined;
        } else {
            const args = argsOrState as ScheduleArgs | undefined;
            if (!args || args.launchTime === undefined) {
                throw new Error("Missing required property 'launchTime'");
            }
            if (!args || args.scheduledAction === undefined) {
                throw new Error("Missing required property 'scheduledAction'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["launchExpirationTime"] = args ? args.launchExpirationTime : undefined;
            inputs["launchTime"] = args ? args.launchTime : undefined;
            inputs["recurrenceEndTime"] = args ? args.recurrenceEndTime : undefined;
            inputs["recurrenceType"] = args ? args.recurrenceType : undefined;
            inputs["recurrenceValue"] = args ? args.recurrenceValue : undefined;
            inputs["scheduledAction"] = args ? args.scheduledAction : undefined;
            inputs["scheduledTaskName"] = args ? args.scheduledTaskName : undefined;
            inputs["taskEnabled"] = args ? args.taskEnabled : undefined;
        }
        super("alicloud:ess/schedule:Schedule", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Schedule resources.
 */
export interface ScheduleState {
    /**
     * Description of the scheduled task, which is 2-200 characters (English or Chinese) long.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Time period within which the failed scheduled task is retried. The default value is 600s. Value range: [0, 21600]
     */
    readonly launchExpirationTime?: pulumi.Input<number>;
    /**
     * Operations performed when the scheduled task is triggered. Fill in the unique identifier of the scaling rule.
     */
    readonly launchTime?: pulumi.Input<string>;
    /**
     * End time of the scheduled task to be repeated. The date format follows the ISO8601 standard and uses UTC time. It is in the format of YYYY-MM-DDThh:mmZ. A time point 90 days after creation or modification cannot be entered. RecurrenceType, RecurrenceValue and RecurrenceEndTime must be specified.                                  
     */
    readonly recurrenceEndTime?: pulumi.Input<string>;
    /**
     * Type of the scheduled task to be repeated. RecurrenceType, RecurrenceValue and RecurrenceEndTime must be specified. Optional values:
     * - Daily: Recurrence interval by day for a scheduled task.
     * - Weekly: Recurrence interval by week for a scheduled task.
     * - Monthly: Recurrence interval by month for a scheduled task.
     */
    readonly recurrenceType?: pulumi.Input<string>;
    /**
     * Value of the scheduled task to be repeated. RecurrenceType, RecurrenceValue and RecurrenceEndTime must be specified.
     * - Daily: Only one value in the range [1,31] can be filled.
     * - Weekly: Multiple values can be filled. The values of Sunday to Saturday are 0 to 6 in sequence. Multiple values shall be separated by a comma “,”.
     * - Monthly: In the format of A-B. The value range of A and B is 1 to 31, and the B value must be greater than the A value.
     */
    readonly recurrenceValue?: pulumi.Input<string>;
    /**
     * Operations performed when the scheduled task is triggered. Fill in the unique identifier of the scaling rule.
     */
    readonly scheduledAction?: pulumi.Input<string>;
    /**
     * Display name of the scheduled task, which must be 2-40 characters (English or Chinese) long.
     */
    readonly scheduledTaskName?: pulumi.Input<string>;
    /**
     * Whether to enable the scheduled task. The default value is true.
     */
    readonly taskEnabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Schedule resource.
 */
export interface ScheduleArgs {
    /**
     * Description of the scheduled task, which is 2-200 characters (English or Chinese) long.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Time period within which the failed scheduled task is retried. The default value is 600s. Value range: [0, 21600]
     */
    readonly launchExpirationTime?: pulumi.Input<number>;
    /**
     * Operations performed when the scheduled task is triggered. Fill in the unique identifier of the scaling rule.
     */
    readonly launchTime: pulumi.Input<string>;
    /**
     * End time of the scheduled task to be repeated. The date format follows the ISO8601 standard and uses UTC time. It is in the format of YYYY-MM-DDThh:mmZ. A time point 90 days after creation or modification cannot be entered. RecurrenceType, RecurrenceValue and RecurrenceEndTime must be specified.                                  
     */
    readonly recurrenceEndTime?: pulumi.Input<string>;
    /**
     * Type of the scheduled task to be repeated. RecurrenceType, RecurrenceValue and RecurrenceEndTime must be specified. Optional values:
     * - Daily: Recurrence interval by day for a scheduled task.
     * - Weekly: Recurrence interval by week for a scheduled task.
     * - Monthly: Recurrence interval by month for a scheduled task.
     */
    readonly recurrenceType?: pulumi.Input<string>;
    /**
     * Value of the scheduled task to be repeated. RecurrenceType, RecurrenceValue and RecurrenceEndTime must be specified.
     * - Daily: Only one value in the range [1,31] can be filled.
     * - Weekly: Multiple values can be filled. The values of Sunday to Saturday are 0 to 6 in sequence. Multiple values shall be separated by a comma “,”.
     * - Monthly: In the format of A-B. The value range of A and B is 1 to 31, and the B value must be greater than the A value.
     */
    readonly recurrenceValue?: pulumi.Input<string>;
    /**
     * Operations performed when the scheduled task is triggered. Fill in the unique identifier of the scaling rule.
     */
    readonly scheduledAction: pulumi.Input<string>;
    /**
     * Display name of the scheduled task, which must be 2-40 characters (English or Chinese) long.
     */
    readonly scheduledTaskName?: pulumi.Input<string>;
    /**
     * Whether to enable the scheduled task. The default value is true.
     */
    readonly taskEnabled?: pulumi.Input<boolean>;
}