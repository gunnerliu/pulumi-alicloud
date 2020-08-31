# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['ScheduledTask']


class ScheduledTask(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[float]] = None,
                 launch_expiration_time: Optional[pulumi.Input[float]] = None,
                 launch_time: Optional[pulumi.Input[str]] = None,
                 max_value: Optional[pulumi.Input[float]] = None,
                 min_value: Optional[pulumi.Input[float]] = None,
                 recurrence_end_time: Optional[pulumi.Input[str]] = None,
                 recurrence_type: Optional[pulumi.Input[str]] = None,
                 recurrence_value: Optional[pulumi.Input[str]] = None,
                 scaling_group_id: Optional[pulumi.Input[str]] = None,
                 scheduled_action: Optional[pulumi.Input[str]] = None,
                 scheduled_task_name: Optional[pulumi.Input[str]] = None,
                 task_enabled: Optional[pulumi.Input[bool]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a ScheduledTask resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the scheduled task, which is 2-200 characters (English or Chinese) long.
        :param pulumi.Input[float] desired_capacity: The expected number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group. **NOTE:** You must specify the `DesiredCapacity` parameter when you create the scaling group.
        :param pulumi.Input[float] launch_expiration_time: The time period during which a failed scheduled task is retried. Unit: seconds. Valid values: 0 to 21600. Default value: 600
        :param pulumi.Input[str] launch_time: The time at which the scheduled task is triggered. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. 
               The time must be in UTC. You cannot enter a time point later than 90 days from the date of scheduled task creation.
               If the `recurrence_type` parameter is specified, the task is executed repeatedly at the time specified by LaunchTime.
               Otherwise, the task is only executed once at the date and time specified by LaunchTime.
        :param pulumi.Input[float] max_value: The maximum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
        :param pulumi.Input[float] min_value: The minimum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
        :param pulumi.Input[str] recurrence_end_time: Specifies the end time after which the scheduled task is no longer repeated. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. 
               The time must be in UTC. You cannot enter a time point later than 365 days from the date of scheduled task creation. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time.
        :param pulumi.Input[str] recurrence_type: Specifies the recurrence type of the scheduled task. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time. Valid values:
               - Daily: The scheduled task is executed once every specified number of days.
               - Weekly: The scheduled task is executed on each specified day of a week.
               - Monthly: The scheduled task is executed on each specified day of a month.
               - Cron: (Available in 1.60.0+) The scheduled task is executed based on the specified cron expression.
        :param pulumi.Input[str] recurrence_value: Specifies how often a scheduled task recurs. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time. The valid value depends on `recurrence_type`
               - Daily: You can enter one value. Valid values: 1 to 31.
               - Weekly: You can enter multiple values and separate them with commas (,). For example, the values 0 to 6 correspond to the days of the week in sequence from Sunday to Saturday.
               - Monthly: You can enter two values in A-B format. Valid values of A and B: 1 to 31. The value of B must be greater than or equal to the value of A.
               - Cron: You can enter a cron expression which is written in UTC and consists of five fields: minute, hour, day of month (date), month, and day of week. The expression can contain wildcard characters including commas (,), question marks (?), hyphens (-), asterisks (*), number signs (#), forward slashes (/), and the L and W letters.
        :param pulumi.Input[str] scaling_group_id: The ID of the scaling group where the number of instances is modified when the scheduled task is triggered. After the `ScalingGroupId` parameter is specified, the scaling method of the scheduled task is to specify the number of instances in a scaling group. You must specify at least one of the following parameters: `MinValue`, `MaxValue`, and `DesiredCapacity`. **NOTE:** You cannot specify `scheduled_action` and `scaling_group_id` at the same time.
        :param pulumi.Input[str] scheduled_action: The operation to be performed when a scheduled task is triggered. Enter the unique identifier of a scaling rule. **NOTE:** You cannot specify `scheduled_action` and `scaling_group_id` at the same time.
        :param pulumi.Input[str] scheduled_task_name: Display name of the scheduled task, which must be 2-40 characters (English or Chinese) long.
        :param pulumi.Input[bool] task_enabled: Specifies whether to start the scheduled task. Default to true.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['description'] = description
            __props__['desired_capacity'] = desired_capacity
            __props__['launch_expiration_time'] = launch_expiration_time
            __props__['launch_time'] = launch_time
            __props__['max_value'] = max_value
            __props__['min_value'] = min_value
            __props__['recurrence_end_time'] = recurrence_end_time
            __props__['recurrence_type'] = recurrence_type
            __props__['recurrence_value'] = recurrence_value
            __props__['scaling_group_id'] = scaling_group_id
            __props__['scheduled_action'] = scheduled_action
            __props__['scheduled_task_name'] = scheduled_task_name
            __props__['task_enabled'] = task_enabled
        super(ScheduledTask, __self__).__init__(
            'alicloud:ess/scheduledTask:ScheduledTask',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            desired_capacity: Optional[pulumi.Input[float]] = None,
            launch_expiration_time: Optional[pulumi.Input[float]] = None,
            launch_time: Optional[pulumi.Input[str]] = None,
            max_value: Optional[pulumi.Input[float]] = None,
            min_value: Optional[pulumi.Input[float]] = None,
            recurrence_end_time: Optional[pulumi.Input[str]] = None,
            recurrence_type: Optional[pulumi.Input[str]] = None,
            recurrence_value: Optional[pulumi.Input[str]] = None,
            scaling_group_id: Optional[pulumi.Input[str]] = None,
            scheduled_action: Optional[pulumi.Input[str]] = None,
            scheduled_task_name: Optional[pulumi.Input[str]] = None,
            task_enabled: Optional[pulumi.Input[bool]] = None) -> 'ScheduledTask':
        """
        Get an existing ScheduledTask resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the scheduled task, which is 2-200 characters (English or Chinese) long.
        :param pulumi.Input[float] desired_capacity: The expected number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group. **NOTE:** You must specify the `DesiredCapacity` parameter when you create the scaling group.
        :param pulumi.Input[float] launch_expiration_time: The time period during which a failed scheduled task is retried. Unit: seconds. Valid values: 0 to 21600. Default value: 600
        :param pulumi.Input[str] launch_time: The time at which the scheduled task is triggered. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. 
               The time must be in UTC. You cannot enter a time point later than 90 days from the date of scheduled task creation.
               If the `recurrence_type` parameter is specified, the task is executed repeatedly at the time specified by LaunchTime.
               Otherwise, the task is only executed once at the date and time specified by LaunchTime.
        :param pulumi.Input[float] max_value: The maximum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
        :param pulumi.Input[float] min_value: The minimum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
        :param pulumi.Input[str] recurrence_end_time: Specifies the end time after which the scheduled task is no longer repeated. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. 
               The time must be in UTC. You cannot enter a time point later than 365 days from the date of scheduled task creation. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time.
        :param pulumi.Input[str] recurrence_type: Specifies the recurrence type of the scheduled task. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time. Valid values:
               - Daily: The scheduled task is executed once every specified number of days.
               - Weekly: The scheduled task is executed on each specified day of a week.
               - Monthly: The scheduled task is executed on each specified day of a month.
               - Cron: (Available in 1.60.0+) The scheduled task is executed based on the specified cron expression.
        :param pulumi.Input[str] recurrence_value: Specifies how often a scheduled task recurs. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time. The valid value depends on `recurrence_type`
               - Daily: You can enter one value. Valid values: 1 to 31.
               - Weekly: You can enter multiple values and separate them with commas (,). For example, the values 0 to 6 correspond to the days of the week in sequence from Sunday to Saturday.
               - Monthly: You can enter two values in A-B format. Valid values of A and B: 1 to 31. The value of B must be greater than or equal to the value of A.
               - Cron: You can enter a cron expression which is written in UTC and consists of five fields: minute, hour, day of month (date), month, and day of week. The expression can contain wildcard characters including commas (,), question marks (?), hyphens (-), asterisks (*), number signs (#), forward slashes (/), and the L and W letters.
        :param pulumi.Input[str] scaling_group_id: The ID of the scaling group where the number of instances is modified when the scheduled task is triggered. After the `ScalingGroupId` parameter is specified, the scaling method of the scheduled task is to specify the number of instances in a scaling group. You must specify at least one of the following parameters: `MinValue`, `MaxValue`, and `DesiredCapacity`. **NOTE:** You cannot specify `scheduled_action` and `scaling_group_id` at the same time.
        :param pulumi.Input[str] scheduled_action: The operation to be performed when a scheduled task is triggered. Enter the unique identifier of a scaling rule. **NOTE:** You cannot specify `scheduled_action` and `scaling_group_id` at the same time.
        :param pulumi.Input[str] scheduled_task_name: Display name of the scheduled task, which must be 2-40 characters (English or Chinese) long.
        :param pulumi.Input[bool] task_enabled: Specifies whether to start the scheduled task. Default to true.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["description"] = description
        __props__["desired_capacity"] = desired_capacity
        __props__["launch_expiration_time"] = launch_expiration_time
        __props__["launch_time"] = launch_time
        __props__["max_value"] = max_value
        __props__["min_value"] = min_value
        __props__["recurrence_end_time"] = recurrence_end_time
        __props__["recurrence_type"] = recurrence_type
        __props__["recurrence_value"] = recurrence_value
        __props__["scaling_group_id"] = scaling_group_id
        __props__["scheduled_action"] = scheduled_action
        __props__["scheduled_task_name"] = scheduled_task_name
        __props__["task_enabled"] = task_enabled
        return ScheduledTask(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of the scheduled task, which is 2-200 characters (English or Chinese) long.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> pulumi.Output[Optional[float]]:
        """
        The expected number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group. **NOTE:** You must specify the `DesiredCapacity` parameter when you create the scaling group.
        """
        return pulumi.get(self, "desired_capacity")

    @property
    @pulumi.getter(name="launchExpirationTime")
    def launch_expiration_time(self) -> pulumi.Output[Optional[float]]:
        """
        The time period during which a failed scheduled task is retried. Unit: seconds. Valid values: 0 to 21600. Default value: 600
        """
        return pulumi.get(self, "launch_expiration_time")

    @property
    @pulumi.getter(name="launchTime")
    def launch_time(self) -> pulumi.Output[Optional[str]]:
        """
        The time at which the scheduled task is triggered. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. 
        The time must be in UTC. You cannot enter a time point later than 90 days from the date of scheduled task creation.
        If the `recurrence_type` parameter is specified, the task is executed repeatedly at the time specified by LaunchTime.
        Otherwise, the task is only executed once at the date and time specified by LaunchTime.
        """
        return pulumi.get(self, "launch_time")

    @property
    @pulumi.getter(name="maxValue")
    def max_value(self) -> pulumi.Output[Optional[float]]:
        """
        The maximum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
        """
        return pulumi.get(self, "max_value")

    @property
    @pulumi.getter(name="minValue")
    def min_value(self) -> pulumi.Output[Optional[float]]:
        """
        The minimum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
        """
        return pulumi.get(self, "min_value")

    @property
    @pulumi.getter(name="recurrenceEndTime")
    def recurrence_end_time(self) -> pulumi.Output[str]:
        """
        Specifies the end time after which the scheduled task is no longer repeated. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. 
        The time must be in UTC. You cannot enter a time point later than 365 days from the date of scheduled task creation. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time.
        """
        return pulumi.get(self, "recurrence_end_time")

    @property
    @pulumi.getter(name="recurrenceType")
    def recurrence_type(self) -> pulumi.Output[str]:
        """
        Specifies the recurrence type of the scheduled task. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time. Valid values:
        - Daily: The scheduled task is executed once every specified number of days.
        - Weekly: The scheduled task is executed on each specified day of a week.
        - Monthly: The scheduled task is executed on each specified day of a month.
        - Cron: (Available in 1.60.0+) The scheduled task is executed based on the specified cron expression.
        """
        return pulumi.get(self, "recurrence_type")

    @property
    @pulumi.getter(name="recurrenceValue")
    def recurrence_value(self) -> pulumi.Output[str]:
        """
        Specifies how often a scheduled task recurs. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time. The valid value depends on `recurrence_type`
        - Daily: You can enter one value. Valid values: 1 to 31.
        - Weekly: You can enter multiple values and separate them with commas (,). For example, the values 0 to 6 correspond to the days of the week in sequence from Sunday to Saturday.
        - Monthly: You can enter two values in A-B format. Valid values of A and B: 1 to 31. The value of B must be greater than or equal to the value of A.
        - Cron: You can enter a cron expression which is written in UTC and consists of five fields: minute, hour, day of month (date), month, and day of week. The expression can contain wildcard characters including commas (,), question marks (?), hyphens (-), asterisks (*), number signs (#), forward slashes (/), and the L and W letters.
        """
        return pulumi.get(self, "recurrence_value")

    @property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the scaling group where the number of instances is modified when the scheduled task is triggered. After the `ScalingGroupId` parameter is specified, the scaling method of the scheduled task is to specify the number of instances in a scaling group. You must specify at least one of the following parameters: `MinValue`, `MaxValue`, and `DesiredCapacity`. **NOTE:** You cannot specify `scheduled_action` and `scaling_group_id` at the same time.
        """
        return pulumi.get(self, "scaling_group_id")

    @property
    @pulumi.getter(name="scheduledAction")
    def scheduled_action(self) -> pulumi.Output[Optional[str]]:
        """
        The operation to be performed when a scheduled task is triggered. Enter the unique identifier of a scaling rule. **NOTE:** You cannot specify `scheduled_action` and `scaling_group_id` at the same time.
        """
        return pulumi.get(self, "scheduled_action")

    @property
    @pulumi.getter(name="scheduledTaskName")
    def scheduled_task_name(self) -> pulumi.Output[Optional[str]]:
        """
        Display name of the scheduled task, which must be 2-40 characters (English or Chinese) long.
        """
        return pulumi.get(self, "scheduled_task_name")

    @property
    @pulumi.getter(name="taskEnabled")
    def task_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to start the scheduled task. Default to true.
        """
        return pulumi.get(self, "task_enabled")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

