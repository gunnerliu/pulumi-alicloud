// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ess.ScheduledTaskArgs;
import com.pulumi.alicloud.ess.inputs.ScheduledTaskState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ESS schedule task can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ess/scheduledTask:ScheduledTask example abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:ess/scheduledTask:ScheduledTask")
public class ScheduledTask extends com.pulumi.resources.CustomResource {
    /**
     * Description of the scheduled task, which is 2-200 characters (English or Chinese) long.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the scheduled task, which is 2-200 characters (English or Chinese) long.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The expected number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group. **NOTE:** You must specify the `DesiredCapacity` parameter when you create the scaling group.
     * 
     */
    @Export(name="desiredCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> desiredCapacity;

    /**
     * @return The expected number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group. **NOTE:** You must specify the `DesiredCapacity` parameter when you create the scaling group.
     * 
     */
    public Output<Optional<Integer>> desiredCapacity() {
        return Codegen.optional(this.desiredCapacity);
    }
    /**
     * The time period during which a failed scheduled task is retried. Unit: seconds. Valid values: 0 to 21600. Default value: 600
     * 
     */
    @Export(name="launchExpirationTime", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> launchExpirationTime;

    /**
     * @return The time period during which a failed scheduled task is retried. Unit: seconds. Valid values: 0 to 21600. Default value: 600
     * 
     */
    public Output<Optional<Integer>> launchExpirationTime() {
        return Codegen.optional(this.launchExpirationTime);
    }
    /**
     * The time at which the scheduled task is triggered. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format.
     * The time must be in UTC. You cannot enter a time point later than 90 days from the date of scheduled task creation.
     * If the `recurrence_type` parameter is specified, the task is executed repeatedly at the time specified by LaunchTime.
     * Otherwise, the task is only executed once at the date and time specified by LaunchTime.
     * 
     */
    @Export(name="launchTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> launchTime;

    /**
     * @return The time at which the scheduled task is triggered. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format.
     * The time must be in UTC. You cannot enter a time point later than 90 days from the date of scheduled task creation.
     * If the `recurrence_type` parameter is specified, the task is executed repeatedly at the time specified by LaunchTime.
     * Otherwise, the task is only executed once at the date and time specified by LaunchTime.
     * 
     */
    public Output<Optional<String>> launchTime() {
        return Codegen.optional(this.launchTime);
    }
    /**
     * The maximum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
     * 
     */
    @Export(name="maxValue", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxValue;

    /**
     * @return The maximum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
     * 
     */
    public Output<Optional<Integer>> maxValue() {
        return Codegen.optional(this.maxValue);
    }
    /**
     * The minimum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
     * 
     */
    @Export(name="minValue", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minValue;

    /**
     * @return The minimum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
     * 
     */
    public Output<Optional<Integer>> minValue() {
        return Codegen.optional(this.minValue);
    }
    /**
     * Specifies the end time after which the scheduled task is no longer repeated. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.
     * The time must be in UTC. You cannot enter a time point later than 365 days from the date of scheduled task creation. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time.
     * 
     */
    @Export(name="recurrenceEndTime", type=String.class, parameters={})
    private Output<String> recurrenceEndTime;

    /**
     * @return Specifies the end time after which the scheduled task is no longer repeated. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.
     * The time must be in UTC. You cannot enter a time point later than 365 days from the date of scheduled task creation. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time.
     * 
     */
    public Output<String> recurrenceEndTime() {
        return this.recurrenceEndTime;
    }
    /**
     * Specifies the recurrence type of the scheduled task. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time. Valid values:
     * - Daily: The scheduled task is executed once every specified number of days.
     * - Weekly: The scheduled task is executed on each specified day of a week.
     * - Monthly: The scheduled task is executed on each specified day of a month.
     * - Cron: (Available in 1.60.0+) The scheduled task is executed based on the specified cron expression.
     * 
     */
    @Export(name="recurrenceType", type=String.class, parameters={})
    private Output<String> recurrenceType;

    /**
     * @return Specifies the recurrence type of the scheduled task. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time. Valid values:
     * - Daily: The scheduled task is executed once every specified number of days.
     * - Weekly: The scheduled task is executed on each specified day of a week.
     * - Monthly: The scheduled task is executed on each specified day of a month.
     * - Cron: (Available in 1.60.0+) The scheduled task is executed based on the specified cron expression.
     * 
     */
    public Output<String> recurrenceType() {
        return this.recurrenceType;
    }
    /**
     * Specifies how often a scheduled task recurs. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time. The valid value depends on `recurrence_type`
     * - Daily: You can enter one value. Valid values: 1 to 31.
     * - Weekly: You can enter multiple values and separate them with commas (,). For example, the values 0 to 6 correspond to the days of the week in sequence from Sunday to Saturday.
     * - Monthly: You can enter two values in A-B format. Valid values of A and B: 1 to 31. The value of B must be greater than or equal to the value of A.
     * - Cron: You can enter a cron expression which is written in UTC and consists of five fields: minute, hour, day of month (date), month, and day of week. The expression can contain wildcard characters including commas (,), question marks (?), hyphens (-), asterisks (*), number signs (#), forward slashes (/), and the L and W letters.
     * 
     */
    @Export(name="recurrenceValue", type=String.class, parameters={})
    private Output<String> recurrenceValue;

    /**
     * @return Specifies how often a scheduled task recurs. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time. The valid value depends on `recurrence_type`
     * - Daily: You can enter one value. Valid values: 1 to 31.
     * - Weekly: You can enter multiple values and separate them with commas (,). For example, the values 0 to 6 correspond to the days of the week in sequence from Sunday to Saturday.
     * - Monthly: You can enter two values in A-B format. Valid values of A and B: 1 to 31. The value of B must be greater than or equal to the value of A.
     * - Cron: You can enter a cron expression which is written in UTC and consists of five fields: minute, hour, day of month (date), month, and day of week. The expression can contain wildcard characters including commas (,), question marks (?), hyphens (-), asterisks (*), number signs (#), forward slashes (/), and the L and W letters.
     * 
     */
    public Output<String> recurrenceValue() {
        return this.recurrenceValue;
    }
    /**
     * The ID of the scaling group where the number of instances is modified when the scheduled task is triggered. After the `ScalingGroupId` parameter is specified, the scaling method of the scheduled task is to specify the number of instances in a scaling group. You must specify at least one of the following parameters: `MinValue`, `MaxValue`, and `DesiredCapacity`. **NOTE:** You cannot specify `scheduled_action` and `scaling_group_id` at the same time.
     * 
     */
    @Export(name="scalingGroupId", type=String.class, parameters={})
    private Output<String> scalingGroupId;

    /**
     * @return The ID of the scaling group where the number of instances is modified when the scheduled task is triggered. After the `ScalingGroupId` parameter is specified, the scaling method of the scheduled task is to specify the number of instances in a scaling group. You must specify at least one of the following parameters: `MinValue`, `MaxValue`, and `DesiredCapacity`. **NOTE:** You cannot specify `scheduled_action` and `scaling_group_id` at the same time.
     * 
     */
    public Output<String> scalingGroupId() {
        return this.scalingGroupId;
    }
    /**
     * The operation to be performed when a scheduled task is triggered. Enter the unique identifier of a scaling rule. **NOTE:** You cannot specify `scheduled_action` and `scaling_group_id` at the same time.
     * 
     */
    @Export(name="scheduledAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> scheduledAction;

    /**
     * @return The operation to be performed when a scheduled task is triggered. Enter the unique identifier of a scaling rule. **NOTE:** You cannot specify `scheduled_action` and `scaling_group_id` at the same time.
     * 
     */
    public Output<Optional<String>> scheduledAction() {
        return Codegen.optional(this.scheduledAction);
    }
    /**
     * Display name of the scheduled task, which must be 2-40 characters (English or Chinese) long.
     * 
     */
    @Export(name="scheduledTaskName", type=String.class, parameters={})
    private Output</* @Nullable */ String> scheduledTaskName;

    /**
     * @return Display name of the scheduled task, which must be 2-40 characters (English or Chinese) long.
     * 
     */
    public Output<Optional<String>> scheduledTaskName() {
        return Codegen.optional(this.scheduledTaskName);
    }
    /**
     * Specifies whether to start the scheduled task. Default to true.
     * 
     */
    @Export(name="taskEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> taskEnabled;

    /**
     * @return Specifies whether to start the scheduled task. Default to true.
     * 
     */
    public Output<Optional<Boolean>> taskEnabled() {
        return Codegen.optional(this.taskEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScheduledTask(String name) {
        this(name, ScheduledTaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScheduledTask(String name, @Nullable ScheduledTaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduledTask(String name, @Nullable ScheduledTaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/scheduledTask:ScheduledTask", name, args == null ? ScheduledTaskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScheduledTask(String name, Output<String> id, @Nullable ScheduledTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/scheduledTask:ScheduledTask", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ScheduledTask get(String name, Output<String> id, @Nullable ScheduledTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScheduledTask(name, id, state, options);
    }
}
