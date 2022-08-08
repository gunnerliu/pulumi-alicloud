# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetScheduledTasksResult',
    'AwaitableGetScheduledTasksResult',
    'get_scheduled_tasks',
    'get_scheduled_tasks_output',
]

@pulumi.output_type
class GetScheduledTasksResult:
    """
    A collection of values returned by getScheduledTasks.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, output_file=None, scheduled_action=None, scheduled_task_id=None, tasks=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if scheduled_action and not isinstance(scheduled_action, str):
            raise TypeError("Expected argument 'scheduled_action' to be a str")
        pulumi.set(__self__, "scheduled_action", scheduled_action)
        if scheduled_task_id and not isinstance(scheduled_task_id, str):
            raise TypeError("Expected argument 'scheduled_task_id' to be a str")
        pulumi.set(__self__, "scheduled_task_id", scheduled_task_id)
        if tasks and not isinstance(tasks, list):
            raise TypeError("Expected argument 'tasks' to be a list")
        pulumi.set(__self__, "tasks", tasks)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        """
        A list of scheduled task ids.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of scheduled task names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="scheduledAction")
    def scheduled_action(self) -> Optional[str]:
        """
        The operation to be performed when a scheduled task is triggered.
        """
        return pulumi.get(self, "scheduled_action")

    @property
    @pulumi.getter(name="scheduledTaskId")
    def scheduled_task_id(self) -> Optional[str]:
        return pulumi.get(self, "scheduled_task_id")

    @property
    @pulumi.getter
    def tasks(self) -> Sequence['outputs.GetScheduledTasksTaskResult']:
        """
        A list of scheduled tasks. Each element contains the following attributes:
        """
        return pulumi.get(self, "tasks")


class AwaitableGetScheduledTasksResult(GetScheduledTasksResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetScheduledTasksResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            scheduled_action=self.scheduled_action,
            scheduled_task_id=self.scheduled_task_id,
            tasks=self.tasks)


def get_scheduled_tasks(ids: Optional[Sequence[str]] = None,
                        name_regex: Optional[str] = None,
                        output_file: Optional[str] = None,
                        scheduled_action: Optional[str] = None,
                        scheduled_task_id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetScheduledTasksResult:
    """
    This data source provides available scheduled task resources.

    > **NOTE:** Available in 1.72.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ds = alicloud.ess.get_scheduled_tasks(name_regex="scheduled_task_name",
        scheduled_task_id="scheduled_task_id")
    pulumi.export("firstScheduledTask", ds.tasks[0].id)
    ```


    :param Sequence[str] ids: A list of scheduled task IDs.
    :param str name_regex: A regex string to filter resulting scheduled tasks by name.
    :param str scheduled_action: The operation to be performed when a scheduled task is triggered.
    :param str scheduled_task_id: The id of the scheduled task.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['scheduledAction'] = scheduled_action
    __args__['scheduledTaskId'] = scheduled_task_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ess/getScheduledTasks:getScheduledTasks', __args__, opts=opts, typ=GetScheduledTasksResult).value

    return AwaitableGetScheduledTasksResult(
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        scheduled_action=__ret__.scheduled_action,
        scheduled_task_id=__ret__.scheduled_task_id,
        tasks=__ret__.tasks)


@_utilities.lift_output_func(get_scheduled_tasks)
def get_scheduled_tasks_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                               output_file: Optional[pulumi.Input[Optional[str]]] = None,
                               scheduled_action: Optional[pulumi.Input[Optional[str]]] = None,
                               scheduled_task_id: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetScheduledTasksResult]:
    """
    This data source provides available scheduled task resources.

    > **NOTE:** Available in 1.72.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ds = alicloud.ess.get_scheduled_tasks(name_regex="scheduled_task_name",
        scheduled_task_id="scheduled_task_id")
    pulumi.export("firstScheduledTask", ds.tasks[0].id)
    ```


    :param Sequence[str] ids: A list of scheduled task IDs.
    :param str name_regex: A regex string to filter resulting scheduled tasks by name.
    :param str scheduled_action: The operation to be performed when a scheduled task is triggered.
    :param str scheduled_task_id: The id of the scheduled task.
    """
    ...
