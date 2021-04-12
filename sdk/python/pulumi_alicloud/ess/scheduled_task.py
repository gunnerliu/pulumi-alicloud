# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = ['ScheduledTaskArgs', 'ScheduledTask']

@pulumi.input_type
class ScheduledTaskArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 launch_expiration_time: Optional[pulumi.Input[int]] = None,
                 launch_time: Optional[pulumi.Input[str]] = None,
                 max_value: Optional[pulumi.Input[int]] = None,
                 min_value: Optional[pulumi.Input[int]] = None,
                 recurrence_end_time: Optional[pulumi.Input[str]] = None,
                 recurrence_type: Optional[pulumi.Input[str]] = None,
                 recurrence_value: Optional[pulumi.Input[str]] = None,
                 scaling_group_id: Optional[pulumi.Input[str]] = None,
                 scheduled_action: Optional[pulumi.Input[str]] = None,
                 scheduled_task_name: Optional[pulumi.Input[str]] = None,
                 task_enabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a ScheduledTask resource.
        :param pulumi.Input[str] description: Description of the scheduled task, which is 2-200 characters (English or Chinese) long.
        :param pulumi.Input[int] desired_capacity: The expected number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group. **NOTE:** You must specify the `DesiredCapacity` parameter when you create the scaling group.
        :param pulumi.Input[int] launch_expiration_time: The time period during which a failed scheduled task is retried. Unit: seconds. Valid values: 0 to 21600. Default value: 600
        :param pulumi.Input[str] launch_time: The time at which the scheduled task is triggered. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. 
               The time must be in UTC. You cannot enter a time point later than 90 days from the date of scheduled task creation.
               If the `recurrence_type` parameter is specified, the task is executed repeatedly at the time specified by LaunchTime.
               Otherwise, the task is only executed once at the date and time specified by LaunchTime.
        :param pulumi.Input[int] max_value: The maximum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
        :param pulumi.Input[int] min_value: The minimum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
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
        if description is not None:
            pulumi.set(__self__, "description", description)
        if desired_capacity is not None:
            pulumi.set(__self__, "desired_capacity", desired_capacity)
        if launch_expiration_time is not None:
            pulumi.set(__self__, "launch_expiration_time", launch_expiration_time)
        if launch_time is not None:
            pulumi.set(__self__, "launch_time", launch_time)
        if max_value is not None:
            pulumi.set(__self__, "max_value", max_value)
        if min_value is not None:
            pulumi.set(__self__, "min_value", min_value)
        if recurrence_end_time is not None:
            pulumi.set(__self__, "recurrence_end_time", recurrence_end_time)
        if recurrence_type is not None:
            pulumi.set(__self__, "recurrence_type", recurrence_type)
        if recurrence_value is not None:
            pulumi.set(__self__, "recurrence_value", recurrence_value)
        if scaling_group_id is not None:
            pulumi.set(__self__, "scaling_group_id", scaling_group_id)
        if scheduled_action is not None:
            pulumi.set(__self__, "scheduled_action", scheduled_action)
        if scheduled_task_name is not None:
            pulumi.set(__self__, "scheduled_task_name", scheduled_task_name)
        if task_enabled is not None:
            pulumi.set(__self__, "task_enabled", task_enabled)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the scheduled task, which is 2-200 characters (English or Chinese) long.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> Optional[pulumi.Input[int]]:
        """
        The expected number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group. **NOTE:** You must specify the `DesiredCapacity` parameter when you create the scaling group.
        """
        return pulumi.get(self, "desired_capacity")

    @desired_capacity.setter
    def desired_capacity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "desired_capacity", value)

    @property
    @pulumi.getter(name="launchExpirationTime")
    def launch_expiration_time(self) -> Optional[pulumi.Input[int]]:
        """
        The time period during which a failed scheduled task is retried. Unit: seconds. Valid values: 0 to 21600. Default value: 600
        """
        return pulumi.get(self, "launch_expiration_time")

    @launch_expiration_time.setter
    def launch_expiration_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "launch_expiration_time", value)

    @property
    @pulumi.getter(name="launchTime")
    def launch_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time at which the scheduled task is triggered. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. 
        The time must be in UTC. You cannot enter a time point later than 90 days from the date of scheduled task creation.
        If the `recurrence_type` parameter is specified, the task is executed repeatedly at the time specified by LaunchTime.
        Otherwise, the task is only executed once at the date and time specified by LaunchTime.
        """
        return pulumi.get(self, "launch_time")

    @launch_time.setter
    def launch_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "launch_time", value)

    @property
    @pulumi.getter(name="maxValue")
    def max_value(self) -> Optional[pulumi.Input[int]]:
        """
        The maximum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
        """
        return pulumi.get(self, "max_value")

    @max_value.setter
    def max_value(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_value", value)

    @property
    @pulumi.getter(name="minValue")
    def min_value(self) -> Optional[pulumi.Input[int]]:
        """
        The minimum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
        """
        return pulumi.get(self, "min_value")

    @min_value.setter
    def min_value(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_value", value)

    @property
    @pulumi.getter(name="recurrenceEndTime")
    def recurrence_end_time(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the end time after which the scheduled task is no longer repeated. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. 
        The time must be in UTC. You cannot enter a time point later than 365 days from the date of scheduled task creation. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time.
        """
        return pulumi.get(self, "recurrence_end_time")

    @recurrence_end_time.setter
    def recurrence_end_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "recurrence_end_time", value)

    @property
    @pulumi.getter(name="recurrenceType")
    def recurrence_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the recurrence type of the scheduled task. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time. Valid values:
        - Daily: The scheduled task is executed once every specified number of days.
        - Weekly: The scheduled task is executed on each specified day of a week.
        - Monthly: The scheduled task is executed on each specified day of a month.
        - Cron: (Available in 1.60.0+) The scheduled task is executed based on the specified cron expression.
        """
        return pulumi.get(self, "recurrence_type")

    @recurrence_type.setter
    def recurrence_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "recurrence_type", value)

    @property
    @pulumi.getter(name="recurrenceValue")
    def recurrence_value(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies how often a scheduled task recurs. **NOTE:** You must specify `RecurrenceType`, `RecurrenceValue`, and `RecurrenceEndTime` at the same time. The valid value depends on `recurrence_type`
        - Daily: You can enter one value. Valid values: 1 to 31.
        - Weekly: You can enter multiple values and separate them with commas (,). For example, the values 0 to 6 correspond to the days of the week in sequence from Sunday to Saturday.
        - Monthly: You can enter two values in A-B format. Valid values of A and B: 1 to 31. The value of B must be greater than or equal to the value of A.
        - Cron: You can enter a cron expression which is written in UTC and consists of five fields: minute, hour, day of month (date), month, and day of week. The expression can contain wildcard characters including commas (,), question marks (?), hyphens (-), asterisks (*), number signs (#), forward slashes (/), and the L and W letters.
        """
        return pulumi.get(self, "recurrence_value")

    @recurrence_value.setter
    def recurrence_value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "recurrence_value", value)

    @property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the scaling group where the number of instances is modified when the scheduled task is triggered. After the `ScalingGroupId` parameter is specified, the scaling method of the scheduled task is to specify the number of instances in a scaling group. You must specify at least one of the following parameters: `MinValue`, `MaxValue`, and `DesiredCapacity`. **NOTE:** You cannot specify `scheduled_action` and `scaling_group_id` at the same time.
        """
        return pulumi.get(self, "scaling_group_id")

    @scaling_group_id.setter
    def scaling_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scaling_group_id", value)

    @property
    @pulumi.getter(name="scheduledAction")
    def scheduled_action(self) -> Optional[pulumi.Input[str]]:
        """
        The operation to be performed when a scheduled task is triggered. Enter the unique identifier of a scaling rule. **NOTE:** You cannot specify `scheduled_action` and `scaling_group_id` at the same time.
        """
        return pulumi.get(self, "scheduled_action")

    @scheduled_action.setter
    def scheduled_action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scheduled_action", value)

    @property
    @pulumi.getter(name="scheduledTaskName")
    def scheduled_task_name(self) -> Optional[pulumi.Input[str]]:
        """
        Display name of the scheduled task, which must be 2-40 characters (English or Chinese) long.
        """
        return pulumi.get(self, "scheduled_task_name")

    @scheduled_task_name.setter
    def scheduled_task_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scheduled_task_name", value)

    @property
    @pulumi.getter(name="taskEnabled")
    def task_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to start the scheduled task. Default to true.
        """
        return pulumi.get(self, "task_enabled")

    @task_enabled.setter
    def task_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "task_enabled", value)


class ScheduledTask(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 launch_expiration_time: Optional[pulumi.Input[int]] = None,
                 launch_time: Optional[pulumi.Input[str]] = None,
                 max_value: Optional[pulumi.Input[int]] = None,
                 min_value: Optional[pulumi.Input[int]] = None,
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
        ## Import

        ESS schedule task can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ess/scheduledTask:ScheduledTask example abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the scheduled task, which is 2-200 characters (English or Chinese) long.
        :param pulumi.Input[int] desired_capacity: The expected number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group. **NOTE:** You must specify the `DesiredCapacity` parameter when you create the scaling group.
        :param pulumi.Input[int] launch_expiration_time: The time period during which a failed scheduled task is retried. Unit: seconds. Valid values: 0 to 21600. Default value: 600
        :param pulumi.Input[str] launch_time: The time at which the scheduled task is triggered. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. 
               The time must be in UTC. You cannot enter a time point later than 90 days from the date of scheduled task creation.
               If the `recurrence_type` parameter is specified, the task is executed repeatedly at the time specified by LaunchTime.
               Otherwise, the task is only executed once at the date and time specified by LaunchTime.
        :param pulumi.Input[int] max_value: The maximum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
        :param pulumi.Input[int] min_value: The minimum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
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
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ScheduledTaskArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ESS schedule task can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ess/scheduledTask:ScheduledTask example abc123456
        ```

        :param str resource_name: The name of the resource.
        :param ScheduledTaskArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ScheduledTaskArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 launch_expiration_time: Optional[pulumi.Input[int]] = None,
                 launch_time: Optional[pulumi.Input[str]] = None,
                 max_value: Optional[pulumi.Input[int]] = None,
                 min_value: Optional[pulumi.Input[int]] = None,
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
            desired_capacity: Optional[pulumi.Input[int]] = None,
            launch_expiration_time: Optional[pulumi.Input[int]] = None,
            launch_time: Optional[pulumi.Input[str]] = None,
            max_value: Optional[pulumi.Input[int]] = None,
            min_value: Optional[pulumi.Input[int]] = None,
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
        :param pulumi.Input[int] desired_capacity: The expected number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group. **NOTE:** You must specify the `DesiredCapacity` parameter when you create the scaling group.
        :param pulumi.Input[int] launch_expiration_time: The time period during which a failed scheduled task is retried. Unit: seconds. Valid values: 0 to 21600. Default value: 600
        :param pulumi.Input[str] launch_time: The time at which the scheduled task is triggered. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. 
               The time must be in UTC. You cannot enter a time point later than 90 days from the date of scheduled task creation.
               If the `recurrence_type` parameter is specified, the task is executed repeatedly at the time specified by LaunchTime.
               Otherwise, the task is only executed once at the date and time specified by LaunchTime.
        :param pulumi.Input[int] max_value: The maximum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
        :param pulumi.Input[int] min_value: The minimum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
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
    def desired_capacity(self) -> pulumi.Output[Optional[int]]:
        """
        The expected number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group. **NOTE:** You must specify the `DesiredCapacity` parameter when you create the scaling group.
        """
        return pulumi.get(self, "desired_capacity")

    @property
    @pulumi.getter(name="launchExpirationTime")
    def launch_expiration_time(self) -> pulumi.Output[Optional[int]]:
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
    def max_value(self) -> pulumi.Output[Optional[int]]:
        """
        The maximum number of instances in a scaling group when the scaling method of the scheduled task is to specify the number of instances in a scaling group.
        """
        return pulumi.get(self, "max_value")

    @property
    @pulumi.getter(name="minValue")
    def min_value(self) -> pulumi.Output[Optional[int]]:
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

