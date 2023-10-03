# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['HybridMonitorSlsTaskArgs', 'HybridMonitorSlsTask']

@pulumi.input_type
class HybridMonitorSlsTaskArgs:
    def __init__(__self__, *,
                 collect_target_type: pulumi.Input[str],
                 namespace: pulumi.Input[str],
                 sls_process_config: pulumi.Input['HybridMonitorSlsTaskSlsProcessConfigArgs'],
                 task_name: pulumi.Input[str],
                 attach_labels: Optional[pulumi.Input[Sequence[pulumi.Input['HybridMonitorSlsTaskAttachLabelArgs']]]] = None,
                 collect_interval: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a HybridMonitorSlsTask resource.
        :param pulumi.Input[str] collect_target_type: The type of the collection target, enter the name of the Logstore group.
        :param pulumi.Input[str] namespace: The name of the namespace.
        :param pulumi.Input['HybridMonitorSlsTaskSlsProcessConfigArgs'] sls_process_config: The configurations of the logs that are imported from Log Service. See `sls_process_config` below.
        :param pulumi.Input[str] task_name: The name of the metric import task, enter the name of the metric for logs imported from Log Service.
        :param pulumi.Input[Sequence[pulumi.Input['HybridMonitorSlsTaskAttachLabelArgs']]] attach_labels: The label of the monitoring task. See `attach_labels` below.
        :param pulumi.Input[int] collect_interval: The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
        :param pulumi.Input[str] description: The description of the metric import task.
        """
        HybridMonitorSlsTaskArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            collect_target_type=collect_target_type,
            namespace=namespace,
            sls_process_config=sls_process_config,
            task_name=task_name,
            attach_labels=attach_labels,
            collect_interval=collect_interval,
            description=description,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             collect_target_type: pulumi.Input[str],
             namespace: pulumi.Input[str],
             sls_process_config: pulumi.Input['HybridMonitorSlsTaskSlsProcessConfigArgs'],
             task_name: pulumi.Input[str],
             attach_labels: Optional[pulumi.Input[Sequence[pulumi.Input['HybridMonitorSlsTaskAttachLabelArgs']]]] = None,
             collect_interval: Optional[pulumi.Input[int]] = None,
             description: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("collect_target_type", collect_target_type)
        _setter("namespace", namespace)
        _setter("sls_process_config", sls_process_config)
        _setter("task_name", task_name)
        if attach_labels is not None:
            _setter("attach_labels", attach_labels)
        if collect_interval is not None:
            _setter("collect_interval", collect_interval)
        if description is not None:
            _setter("description", description)

    @property
    @pulumi.getter(name="collectTargetType")
    def collect_target_type(self) -> pulumi.Input[str]:
        """
        The type of the collection target, enter the name of the Logstore group.
        """
        return pulumi.get(self, "collect_target_type")

    @collect_target_type.setter
    def collect_target_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "collect_target_type", value)

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Input[str]:
        """
        The name of the namespace.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: pulumi.Input[str]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter(name="slsProcessConfig")
    def sls_process_config(self) -> pulumi.Input['HybridMonitorSlsTaskSlsProcessConfigArgs']:
        """
        The configurations of the logs that are imported from Log Service. See `sls_process_config` below.
        """
        return pulumi.get(self, "sls_process_config")

    @sls_process_config.setter
    def sls_process_config(self, value: pulumi.Input['HybridMonitorSlsTaskSlsProcessConfigArgs']):
        pulumi.set(self, "sls_process_config", value)

    @property
    @pulumi.getter(name="taskName")
    def task_name(self) -> pulumi.Input[str]:
        """
        The name of the metric import task, enter the name of the metric for logs imported from Log Service.
        """
        return pulumi.get(self, "task_name")

    @task_name.setter
    def task_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "task_name", value)

    @property
    @pulumi.getter(name="attachLabels")
    def attach_labels(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['HybridMonitorSlsTaskAttachLabelArgs']]]]:
        """
        The label of the monitoring task. See `attach_labels` below.
        """
        return pulumi.get(self, "attach_labels")

    @attach_labels.setter
    def attach_labels(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['HybridMonitorSlsTaskAttachLabelArgs']]]]):
        pulumi.set(self, "attach_labels", value)

    @property
    @pulumi.getter(name="collectInterval")
    def collect_interval(self) -> Optional[pulumi.Input[int]]:
        """
        The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
        """
        return pulumi.get(self, "collect_interval")

    @collect_interval.setter
    def collect_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "collect_interval", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the metric import task.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _HybridMonitorSlsTaskState:
    def __init__(__self__, *,
                 attach_labels: Optional[pulumi.Input[Sequence[pulumi.Input['HybridMonitorSlsTaskAttachLabelArgs']]]] = None,
                 collect_interval: Optional[pulumi.Input[int]] = None,
                 collect_target_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 sls_process_config: Optional[pulumi.Input['HybridMonitorSlsTaskSlsProcessConfigArgs']] = None,
                 task_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HybridMonitorSlsTask resources.
        :param pulumi.Input[Sequence[pulumi.Input['HybridMonitorSlsTaskAttachLabelArgs']]] attach_labels: The label of the monitoring task. See `attach_labels` below.
        :param pulumi.Input[int] collect_interval: The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
        :param pulumi.Input[str] collect_target_type: The type of the collection target, enter the name of the Logstore group.
        :param pulumi.Input[str] description: The description of the metric import task.
        :param pulumi.Input[str] namespace: The name of the namespace.
        :param pulumi.Input['HybridMonitorSlsTaskSlsProcessConfigArgs'] sls_process_config: The configurations of the logs that are imported from Log Service. See `sls_process_config` below.
        :param pulumi.Input[str] task_name: The name of the metric import task, enter the name of the metric for logs imported from Log Service.
        """
        _HybridMonitorSlsTaskState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            attach_labels=attach_labels,
            collect_interval=collect_interval,
            collect_target_type=collect_target_type,
            description=description,
            namespace=namespace,
            sls_process_config=sls_process_config,
            task_name=task_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             attach_labels: Optional[pulumi.Input[Sequence[pulumi.Input['HybridMonitorSlsTaskAttachLabelArgs']]]] = None,
             collect_interval: Optional[pulumi.Input[int]] = None,
             collect_target_type: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             namespace: Optional[pulumi.Input[str]] = None,
             sls_process_config: Optional[pulumi.Input['HybridMonitorSlsTaskSlsProcessConfigArgs']] = None,
             task_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if attach_labels is not None:
            _setter("attach_labels", attach_labels)
        if collect_interval is not None:
            _setter("collect_interval", collect_interval)
        if collect_target_type is not None:
            _setter("collect_target_type", collect_target_type)
        if description is not None:
            _setter("description", description)
        if namespace is not None:
            _setter("namespace", namespace)
        if sls_process_config is not None:
            _setter("sls_process_config", sls_process_config)
        if task_name is not None:
            _setter("task_name", task_name)

    @property
    @pulumi.getter(name="attachLabels")
    def attach_labels(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['HybridMonitorSlsTaskAttachLabelArgs']]]]:
        """
        The label of the monitoring task. See `attach_labels` below.
        """
        return pulumi.get(self, "attach_labels")

    @attach_labels.setter
    def attach_labels(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['HybridMonitorSlsTaskAttachLabelArgs']]]]):
        pulumi.set(self, "attach_labels", value)

    @property
    @pulumi.getter(name="collectInterval")
    def collect_interval(self) -> Optional[pulumi.Input[int]]:
        """
        The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
        """
        return pulumi.get(self, "collect_interval")

    @collect_interval.setter
    def collect_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "collect_interval", value)

    @property
    @pulumi.getter(name="collectTargetType")
    def collect_target_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the collection target, enter the name of the Logstore group.
        """
        return pulumi.get(self, "collect_target_type")

    @collect_target_type.setter
    def collect_target_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "collect_target_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the metric import task.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the namespace.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter(name="slsProcessConfig")
    def sls_process_config(self) -> Optional[pulumi.Input['HybridMonitorSlsTaskSlsProcessConfigArgs']]:
        """
        The configurations of the logs that are imported from Log Service. See `sls_process_config` below.
        """
        return pulumi.get(self, "sls_process_config")

    @sls_process_config.setter
    def sls_process_config(self, value: Optional[pulumi.Input['HybridMonitorSlsTaskSlsProcessConfigArgs']]):
        pulumi.set(self, "sls_process_config", value)

    @property
    @pulumi.getter(name="taskName")
    def task_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the metric import task, enter the name of the metric for logs imported from Log Service.
        """
        return pulumi.get(self, "task_name")

    @task_name.setter
    def task_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "task_name", value)


class HybridMonitorSlsTask(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attach_labels: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['HybridMonitorSlsTaskAttachLabelArgs']]]]] = None,
                 collect_interval: Optional[pulumi.Input[int]] = None,
                 collect_target_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 sls_process_config: Optional[pulumi.Input[pulumi.InputType['HybridMonitorSlsTaskSlsProcessConfigArgs']]] = None,
                 task_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloud Monitor Service Hybrid Monitor Sls Task resource.

        For information about Cloud Monitor Service Hybrid Monitor Sls Task and how to use it, see [What is Hybrid Monitor Sls Task](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createhybridmonitortask).

        > **NOTE:** Available since v1.179.0.

        ## Import

        Cloud Monitor Service Hybrid Monitor Sls Task can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cms/hybridMonitorSlsTask:HybridMonitorSlsTask example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['HybridMonitorSlsTaskAttachLabelArgs']]]] attach_labels: The label of the monitoring task. See `attach_labels` below.
        :param pulumi.Input[int] collect_interval: The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
        :param pulumi.Input[str] collect_target_type: The type of the collection target, enter the name of the Logstore group.
        :param pulumi.Input[str] description: The description of the metric import task.
        :param pulumi.Input[str] namespace: The name of the namespace.
        :param pulumi.Input[pulumi.InputType['HybridMonitorSlsTaskSlsProcessConfigArgs']] sls_process_config: The configurations of the logs that are imported from Log Service. See `sls_process_config` below.
        :param pulumi.Input[str] task_name: The name of the metric import task, enter the name of the metric for logs imported from Log Service.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HybridMonitorSlsTaskArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Monitor Service Hybrid Monitor Sls Task resource.

        For information about Cloud Monitor Service Hybrid Monitor Sls Task and how to use it, see [What is Hybrid Monitor Sls Task](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createhybridmonitortask).

        > **NOTE:** Available since v1.179.0.

        ## Import

        Cloud Monitor Service Hybrid Monitor Sls Task can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cms/hybridMonitorSlsTask:HybridMonitorSlsTask example <id>
        ```

        :param str resource_name: The name of the resource.
        :param HybridMonitorSlsTaskArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HybridMonitorSlsTaskArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            HybridMonitorSlsTaskArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attach_labels: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['HybridMonitorSlsTaskAttachLabelArgs']]]]] = None,
                 collect_interval: Optional[pulumi.Input[int]] = None,
                 collect_target_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 sls_process_config: Optional[pulumi.Input[pulumi.InputType['HybridMonitorSlsTaskSlsProcessConfigArgs']]] = None,
                 task_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HybridMonitorSlsTaskArgs.__new__(HybridMonitorSlsTaskArgs)

            __props__.__dict__["attach_labels"] = attach_labels
            __props__.__dict__["collect_interval"] = collect_interval
            if collect_target_type is None and not opts.urn:
                raise TypeError("Missing required property 'collect_target_type'")
            __props__.__dict__["collect_target_type"] = collect_target_type
            __props__.__dict__["description"] = description
            if namespace is None and not opts.urn:
                raise TypeError("Missing required property 'namespace'")
            __props__.__dict__["namespace"] = namespace
            if sls_process_config is not None and not isinstance(sls_process_config, HybridMonitorSlsTaskSlsProcessConfigArgs):
                sls_process_config = sls_process_config or {}
                def _setter(key, value):
                    sls_process_config[key] = value
                HybridMonitorSlsTaskSlsProcessConfigArgs._configure(_setter, **sls_process_config)
            if sls_process_config is None and not opts.urn:
                raise TypeError("Missing required property 'sls_process_config'")
            __props__.__dict__["sls_process_config"] = sls_process_config
            if task_name is None and not opts.urn:
                raise TypeError("Missing required property 'task_name'")
            __props__.__dict__["task_name"] = task_name
        super(HybridMonitorSlsTask, __self__).__init__(
            'alicloud:cms/hybridMonitorSlsTask:HybridMonitorSlsTask',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            attach_labels: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['HybridMonitorSlsTaskAttachLabelArgs']]]]] = None,
            collect_interval: Optional[pulumi.Input[int]] = None,
            collect_target_type: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            sls_process_config: Optional[pulumi.Input[pulumi.InputType['HybridMonitorSlsTaskSlsProcessConfigArgs']]] = None,
            task_name: Optional[pulumi.Input[str]] = None) -> 'HybridMonitorSlsTask':
        """
        Get an existing HybridMonitorSlsTask resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['HybridMonitorSlsTaskAttachLabelArgs']]]] attach_labels: The label of the monitoring task. See `attach_labels` below.
        :param pulumi.Input[int] collect_interval: The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
        :param pulumi.Input[str] collect_target_type: The type of the collection target, enter the name of the Logstore group.
        :param pulumi.Input[str] description: The description of the metric import task.
        :param pulumi.Input[str] namespace: The name of the namespace.
        :param pulumi.Input[pulumi.InputType['HybridMonitorSlsTaskSlsProcessConfigArgs']] sls_process_config: The configurations of the logs that are imported from Log Service. See `sls_process_config` below.
        :param pulumi.Input[str] task_name: The name of the metric import task, enter the name of the metric for logs imported from Log Service.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HybridMonitorSlsTaskState.__new__(_HybridMonitorSlsTaskState)

        __props__.__dict__["attach_labels"] = attach_labels
        __props__.__dict__["collect_interval"] = collect_interval
        __props__.__dict__["collect_target_type"] = collect_target_type
        __props__.__dict__["description"] = description
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["sls_process_config"] = sls_process_config
        __props__.__dict__["task_name"] = task_name
        return HybridMonitorSlsTask(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="attachLabels")
    def attach_labels(self) -> pulumi.Output[Optional[Sequence['outputs.HybridMonitorSlsTaskAttachLabel']]]:
        """
        The label of the monitoring task. See `attach_labels` below.
        """
        return pulumi.get(self, "attach_labels")

    @property
    @pulumi.getter(name="collectInterval")
    def collect_interval(self) -> pulumi.Output[int]:
        """
        The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
        """
        return pulumi.get(self, "collect_interval")

    @property
    @pulumi.getter(name="collectTargetType")
    def collect_target_type(self) -> pulumi.Output[str]:
        """
        The type of the collection target, enter the name of the Logstore group.
        """
        return pulumi.get(self, "collect_target_type")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the metric import task.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[str]:
        """
        The name of the namespace.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="slsProcessConfig")
    def sls_process_config(self) -> pulumi.Output['outputs.HybridMonitorSlsTaskSlsProcessConfig']:
        """
        The configurations of the logs that are imported from Log Service. See `sls_process_config` below.
        """
        return pulumi.get(self, "sls_process_config")

    @property
    @pulumi.getter(name="taskName")
    def task_name(self) -> pulumi.Output[str]:
        """
        The name of the metric import task, enter the name of the metric for logs imported from Log Service.
        """
        return pulumi.get(self, "task_name")

