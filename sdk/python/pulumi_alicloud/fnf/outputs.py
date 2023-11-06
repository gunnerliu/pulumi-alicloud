# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetExecutionsExecutionResult',
    'GetFlowsFlowResult',
    'GetSchedulesScheduleResult',
]

@pulumi.output_type
class GetExecutionsExecutionResult(dict):
    def __init__(__self__, *,
                 execution_name: str,
                 flow_name: str,
                 id: str,
                 input: str,
                 output: str,
                 started_time: str,
                 status: str,
                 stopped_time: str):
        """
        :param str execution_name: The name of the execution.
        :param str flow_name: The name of the flow.
        :param str id: The ID of the Execution. The value formats as `<flow_name>:<execution_name>`.
        :param str input: The Input information for this execution.
        :param str output: The output of the execution.
        :param str started_time: The started time of the execution.
        :param str status: The status of the resource.
        :param str stopped_time: The stopped time of the execution.
        """
        GetExecutionsExecutionResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            execution_name=execution_name,
            flow_name=flow_name,
            id=id,
            input=input,
            output=output,
            started_time=started_time,
            status=status,
            stopped_time=stopped_time,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             execution_name: Optional[str] = None,
             flow_name: Optional[str] = None,
             id: Optional[str] = None,
             input: Optional[str] = None,
             output: Optional[str] = None,
             started_time: Optional[str] = None,
             status: Optional[str] = None,
             stopped_time: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if execution_name is None and 'executionName' in kwargs:
            execution_name = kwargs['executionName']
        if execution_name is None:
            raise TypeError("Missing 'execution_name' argument")
        if flow_name is None and 'flowName' in kwargs:
            flow_name = kwargs['flowName']
        if flow_name is None:
            raise TypeError("Missing 'flow_name' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if input is None:
            raise TypeError("Missing 'input' argument")
        if output is None:
            raise TypeError("Missing 'output' argument")
        if started_time is None and 'startedTime' in kwargs:
            started_time = kwargs['startedTime']
        if started_time is None:
            raise TypeError("Missing 'started_time' argument")
        if status is None:
            raise TypeError("Missing 'status' argument")
        if stopped_time is None and 'stoppedTime' in kwargs:
            stopped_time = kwargs['stoppedTime']
        if stopped_time is None:
            raise TypeError("Missing 'stopped_time' argument")

        _setter("execution_name", execution_name)
        _setter("flow_name", flow_name)
        _setter("id", id)
        _setter("input", input)
        _setter("output", output)
        _setter("started_time", started_time)
        _setter("status", status)
        _setter("stopped_time", stopped_time)

    @property
    @pulumi.getter(name="executionName")
    def execution_name(self) -> str:
        """
        The name of the execution.
        """
        return pulumi.get(self, "execution_name")

    @property
    @pulumi.getter(name="flowName")
    def flow_name(self) -> str:
        """
        The name of the flow.
        """
        return pulumi.get(self, "flow_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Execution. The value formats as `<flow_name>:<execution_name>`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def input(self) -> str:
        """
        The Input information for this execution.
        """
        return pulumi.get(self, "input")

    @property
    @pulumi.getter
    def output(self) -> str:
        """
        The output of the execution.
        """
        return pulumi.get(self, "output")

    @property
    @pulumi.getter(name="startedTime")
    def started_time(self) -> str:
        """
        The started time of the execution.
        """
        return pulumi.get(self, "started_time")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="stoppedTime")
    def stopped_time(self) -> str:
        """
        The stopped time of the execution.
        """
        return pulumi.get(self, "stopped_time")


@pulumi.output_type
class GetFlowsFlowResult(dict):
    def __init__(__self__, *,
                 definition: str,
                 description: str,
                 flow_id: str,
                 id: str,
                 last_modified_time: str,
                 name: str,
                 role_arn: str,
                 type: str):
        """
        :param str definition: The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
        :param str description: The description of the flow.
        :param str flow_id: The unique ID of the flow.
        :param str id: The ID of the Flow.
        :param str last_modified_time: The time when the flow was last modified.
        :param str name: The name of the flow. The name must be unique in an Alibaba Cloud account.
        :param str role_arn: The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
        :param str type: The type of the flow. Set the value to `FDL`.
        """
        GetFlowsFlowResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            definition=definition,
            description=description,
            flow_id=flow_id,
            id=id,
            last_modified_time=last_modified_time,
            name=name,
            role_arn=role_arn,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             definition: Optional[str] = None,
             description: Optional[str] = None,
             flow_id: Optional[str] = None,
             id: Optional[str] = None,
             last_modified_time: Optional[str] = None,
             name: Optional[str] = None,
             role_arn: Optional[str] = None,
             type: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if definition is None:
            raise TypeError("Missing 'definition' argument")
        if description is None:
            raise TypeError("Missing 'description' argument")
        if flow_id is None and 'flowId' in kwargs:
            flow_id = kwargs['flowId']
        if flow_id is None:
            raise TypeError("Missing 'flow_id' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if last_modified_time is None and 'lastModifiedTime' in kwargs:
            last_modified_time = kwargs['lastModifiedTime']
        if last_modified_time is None:
            raise TypeError("Missing 'last_modified_time' argument")
        if name is None:
            raise TypeError("Missing 'name' argument")
        if role_arn is None and 'roleArn' in kwargs:
            role_arn = kwargs['roleArn']
        if role_arn is None:
            raise TypeError("Missing 'role_arn' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")

        _setter("definition", definition)
        _setter("description", description)
        _setter("flow_id", flow_id)
        _setter("id", id)
        _setter("last_modified_time", last_modified_time)
        _setter("name", name)
        _setter("role_arn", role_arn)
        _setter("type", type)

    @property
    @pulumi.getter
    def definition(self) -> str:
        """
        The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
        """
        return pulumi.get(self, "definition")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the flow.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="flowId")
    def flow_id(self) -> str:
        """
        The unique ID of the flow.
        """
        return pulumi.get(self, "flow_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Flow.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastModifiedTime")
    def last_modified_time(self) -> str:
        """
        The time when the flow was last modified.
        """
        return pulumi.get(self, "last_modified_time")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the flow. The name must be unique in an Alibaba Cloud account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> str:
        """
        The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
        """
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of the flow. Set the value to `FDL`.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetSchedulesScheduleResult(dict):
    def __init__(__self__, *,
                 cron_expression: str,
                 description: str,
                 enable: bool,
                 id: str,
                 last_modified_time: str,
                 payload: str,
                 schedule_id: str,
                 schedule_name: str):
        """
        :param str cron_expression: The CRON expression of the time-based schedule to be created.
        :param str description: The description of the time-based schedule to be created.
        :param bool enable: Specifies whether to enable the time-based schedule you want to create.
        :param str id: The ID of the Schedule.
        :param str last_modified_time: The time when the time-based schedule was last updated.
        :param str payload: The trigger message of the time-based schedule to be created. It must be in JSON object format.
        :param str schedule_id: The ID of the time-based schedule.
        :param str schedule_name: The name of the time-based schedule to be created.
        """
        GetSchedulesScheduleResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cron_expression=cron_expression,
            description=description,
            enable=enable,
            id=id,
            last_modified_time=last_modified_time,
            payload=payload,
            schedule_id=schedule_id,
            schedule_name=schedule_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cron_expression: Optional[str] = None,
             description: Optional[str] = None,
             enable: Optional[bool] = None,
             id: Optional[str] = None,
             last_modified_time: Optional[str] = None,
             payload: Optional[str] = None,
             schedule_id: Optional[str] = None,
             schedule_name: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if cron_expression is None and 'cronExpression' in kwargs:
            cron_expression = kwargs['cronExpression']
        if cron_expression is None:
            raise TypeError("Missing 'cron_expression' argument")
        if description is None:
            raise TypeError("Missing 'description' argument")
        if enable is None:
            raise TypeError("Missing 'enable' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if last_modified_time is None and 'lastModifiedTime' in kwargs:
            last_modified_time = kwargs['lastModifiedTime']
        if last_modified_time is None:
            raise TypeError("Missing 'last_modified_time' argument")
        if payload is None:
            raise TypeError("Missing 'payload' argument")
        if schedule_id is None and 'scheduleId' in kwargs:
            schedule_id = kwargs['scheduleId']
        if schedule_id is None:
            raise TypeError("Missing 'schedule_id' argument")
        if schedule_name is None and 'scheduleName' in kwargs:
            schedule_name = kwargs['scheduleName']
        if schedule_name is None:
            raise TypeError("Missing 'schedule_name' argument")

        _setter("cron_expression", cron_expression)
        _setter("description", description)
        _setter("enable", enable)
        _setter("id", id)
        _setter("last_modified_time", last_modified_time)
        _setter("payload", payload)
        _setter("schedule_id", schedule_id)
        _setter("schedule_name", schedule_name)

    @property
    @pulumi.getter(name="cronExpression")
    def cron_expression(self) -> str:
        """
        The CRON expression of the time-based schedule to be created.
        """
        return pulumi.get(self, "cron_expression")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the time-based schedule to be created.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enable(self) -> bool:
        """
        Specifies whether to enable the time-based schedule you want to create.
        """
        return pulumi.get(self, "enable")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Schedule.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastModifiedTime")
    def last_modified_time(self) -> str:
        """
        The time when the time-based schedule was last updated.
        """
        return pulumi.get(self, "last_modified_time")

    @property
    @pulumi.getter
    def payload(self) -> str:
        """
        The trigger message of the time-based schedule to be created. It must be in JSON object format.
        """
        return pulumi.get(self, "payload")

    @property
    @pulumi.getter(name="scheduleId")
    def schedule_id(self) -> str:
        """
        The ID of the time-based schedule.
        """
        return pulumi.get(self, "schedule_id")

    @property
    @pulumi.getter(name="scheduleName")
    def schedule_name(self) -> str:
        """
        The name of the time-based schedule to be created.
        """
        return pulumi.get(self, "schedule_name")


