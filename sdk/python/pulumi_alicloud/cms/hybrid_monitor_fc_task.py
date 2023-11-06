# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['HybridMonitorFcTaskArgs', 'HybridMonitorFcTask']

@pulumi.input_type
class HybridMonitorFcTaskArgs:
    def __init__(__self__, *,
                 namespace: pulumi.Input[str],
                 yarm_config: pulumi.Input[str],
                 target_user_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a HybridMonitorFcTask resource.
        :param pulumi.Input[str] namespace: the namespace of the Alibaba Cloud service.
        :param pulumi.Input[str] yarm_config: The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
        :param pulumi.Input[str] target_user_id: The ID of the member account. If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.
        """
        HybridMonitorFcTaskArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            namespace=namespace,
            yarm_config=yarm_config,
            target_user_id=target_user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             namespace: Optional[pulumi.Input[str]] = None,
             yarm_config: Optional[pulumi.Input[str]] = None,
             target_user_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if namespace is None:
            raise TypeError("Missing 'namespace' argument")
        if yarm_config is None and 'yarmConfig' in kwargs:
            yarm_config = kwargs['yarmConfig']
        if yarm_config is None:
            raise TypeError("Missing 'yarm_config' argument")
        if target_user_id is None and 'targetUserId' in kwargs:
            target_user_id = kwargs['targetUserId']

        _setter("namespace", namespace)
        _setter("yarm_config", yarm_config)
        if target_user_id is not None:
            _setter("target_user_id", target_user_id)

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Input[str]:
        """
        the namespace of the Alibaba Cloud service.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: pulumi.Input[str]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter(name="yarmConfig")
    def yarm_config(self) -> pulumi.Input[str]:
        """
        The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
        """
        return pulumi.get(self, "yarm_config")

    @yarm_config.setter
    def yarm_config(self, value: pulumi.Input[str]):
        pulumi.set(self, "yarm_config", value)

    @property
    @pulumi.getter(name="targetUserId")
    def target_user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the member account. If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.
        """
        return pulumi.get(self, "target_user_id")

    @target_user_id.setter
    def target_user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target_user_id", value)


@pulumi.input_type
class _HybridMonitorFcTaskState:
    def __init__(__self__, *,
                 hybrid_monitor_fc_task_id: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 target_user_id: Optional[pulumi.Input[str]] = None,
                 yarm_config: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HybridMonitorFcTask resources.
        :param pulumi.Input[str] hybrid_monitor_fc_task_id: The ID of the monitoring task.
        :param pulumi.Input[str] namespace: the namespace of the Alibaba Cloud service.
        :param pulumi.Input[str] target_user_id: The ID of the member account. If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.
        :param pulumi.Input[str] yarm_config: The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
        """
        _HybridMonitorFcTaskState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            hybrid_monitor_fc_task_id=hybrid_monitor_fc_task_id,
            namespace=namespace,
            target_user_id=target_user_id,
            yarm_config=yarm_config,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             hybrid_monitor_fc_task_id: Optional[pulumi.Input[str]] = None,
             namespace: Optional[pulumi.Input[str]] = None,
             target_user_id: Optional[pulumi.Input[str]] = None,
             yarm_config: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if hybrid_monitor_fc_task_id is None and 'hybridMonitorFcTaskId' in kwargs:
            hybrid_monitor_fc_task_id = kwargs['hybridMonitorFcTaskId']
        if target_user_id is None and 'targetUserId' in kwargs:
            target_user_id = kwargs['targetUserId']
        if yarm_config is None and 'yarmConfig' in kwargs:
            yarm_config = kwargs['yarmConfig']

        if hybrid_monitor_fc_task_id is not None:
            _setter("hybrid_monitor_fc_task_id", hybrid_monitor_fc_task_id)
        if namespace is not None:
            _setter("namespace", namespace)
        if target_user_id is not None:
            _setter("target_user_id", target_user_id)
        if yarm_config is not None:
            _setter("yarm_config", yarm_config)

    @property
    @pulumi.getter(name="hybridMonitorFcTaskId")
    def hybrid_monitor_fc_task_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the monitoring task.
        """
        return pulumi.get(self, "hybrid_monitor_fc_task_id")

    @hybrid_monitor_fc_task_id.setter
    def hybrid_monitor_fc_task_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hybrid_monitor_fc_task_id", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        the namespace of the Alibaba Cloud service.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter(name="targetUserId")
    def target_user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the member account. If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.
        """
        return pulumi.get(self, "target_user_id")

    @target_user_id.setter
    def target_user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target_user_id", value)

    @property
    @pulumi.getter(name="yarmConfig")
    def yarm_config(self) -> Optional[pulumi.Input[str]]:
        """
        The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
        """
        return pulumi.get(self, "yarm_config")

    @yarm_config.setter
    def yarm_config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "yarm_config", value)


class HybridMonitorFcTask(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 target_user_id: Optional[pulumi.Input[str]] = None,
                 yarm_config: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloud Monitor Service Hybrid Monitor Fc Task resource.

        For information about Cloud Monitor Service Hybrid Monitor Fc Task and how to use it, see [What is Hybrid Monitor Fc Task](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createhybridmonitortask).

        > **NOTE:** Available since v1.179.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_account = alicloud.get_account()
        default_namespace = alicloud.cms.Namespace("defaultNamespace",
            description=name,
            namespace=name,
            specification="cms.s1.large")
        default_hybrid_monitor_fc_task = alicloud.cms.HybridMonitorFcTask("defaultHybridMonitorFcTask",
            namespace=default_namespace.id,
            yarm_config=\"\"\"products:
        - namespace: acs_ecs_dashboard
          metric_info:
          - metric_list:
            - cpu_total
            - cpu_idle
            - diskusage_utilization
            - CPUUtilization
            - DiskReadBPS
            - InternetOut
            - IntranetOut
            - cpu_system
        - namespace: acs_rds_dashboard
          metric_info:
          - metric_list:
            - MySQL_QPS
            - MySQL_TPS
        \"\"\",
            target_user_id=default_account.id)
        ```

        ## Import

        Cloud Monitor Service Hybrid Monitor Fc Task can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cms/hybridMonitorFcTask:HybridMonitorFcTask example <hybrid_monitor_fc_task_id>:<namespace>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] namespace: the namespace of the Alibaba Cloud service.
        :param pulumi.Input[str] target_user_id: The ID of the member account. If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.
        :param pulumi.Input[str] yarm_config: The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HybridMonitorFcTaskArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Monitor Service Hybrid Monitor Fc Task resource.

        For information about Cloud Monitor Service Hybrid Monitor Fc Task and how to use it, see [What is Hybrid Monitor Fc Task](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createhybridmonitortask).

        > **NOTE:** Available since v1.179.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_account = alicloud.get_account()
        default_namespace = alicloud.cms.Namespace("defaultNamespace",
            description=name,
            namespace=name,
            specification="cms.s1.large")
        default_hybrid_monitor_fc_task = alicloud.cms.HybridMonitorFcTask("defaultHybridMonitorFcTask",
            namespace=default_namespace.id,
            yarm_config=\"\"\"products:
        - namespace: acs_ecs_dashboard
          metric_info:
          - metric_list:
            - cpu_total
            - cpu_idle
            - diskusage_utilization
            - CPUUtilization
            - DiskReadBPS
            - InternetOut
            - IntranetOut
            - cpu_system
        - namespace: acs_rds_dashboard
          metric_info:
          - metric_list:
            - MySQL_QPS
            - MySQL_TPS
        \"\"\",
            target_user_id=default_account.id)
        ```

        ## Import

        Cloud Monitor Service Hybrid Monitor Fc Task can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cms/hybridMonitorFcTask:HybridMonitorFcTask example <hybrid_monitor_fc_task_id>:<namespace>
        ```

        :param str resource_name: The name of the resource.
        :param HybridMonitorFcTaskArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HybridMonitorFcTaskArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            HybridMonitorFcTaskArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 target_user_id: Optional[pulumi.Input[str]] = None,
                 yarm_config: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HybridMonitorFcTaskArgs.__new__(HybridMonitorFcTaskArgs)

            if namespace is None and not opts.urn:
                raise TypeError("Missing required property 'namespace'")
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["target_user_id"] = target_user_id
            if yarm_config is None and not opts.urn:
                raise TypeError("Missing required property 'yarm_config'")
            __props__.__dict__["yarm_config"] = yarm_config
            __props__.__dict__["hybrid_monitor_fc_task_id"] = None
        super(HybridMonitorFcTask, __self__).__init__(
            'alicloud:cms/hybridMonitorFcTask:HybridMonitorFcTask',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            hybrid_monitor_fc_task_id: Optional[pulumi.Input[str]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            target_user_id: Optional[pulumi.Input[str]] = None,
            yarm_config: Optional[pulumi.Input[str]] = None) -> 'HybridMonitorFcTask':
        """
        Get an existing HybridMonitorFcTask resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] hybrid_monitor_fc_task_id: The ID of the monitoring task.
        :param pulumi.Input[str] namespace: the namespace of the Alibaba Cloud service.
        :param pulumi.Input[str] target_user_id: The ID of the member account. If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.
        :param pulumi.Input[str] yarm_config: The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HybridMonitorFcTaskState.__new__(_HybridMonitorFcTaskState)

        __props__.__dict__["hybrid_monitor_fc_task_id"] = hybrid_monitor_fc_task_id
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["target_user_id"] = target_user_id
        __props__.__dict__["yarm_config"] = yarm_config
        return HybridMonitorFcTask(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="hybridMonitorFcTaskId")
    def hybrid_monitor_fc_task_id(self) -> pulumi.Output[str]:
        """
        The ID of the monitoring task.
        """
        return pulumi.get(self, "hybrid_monitor_fc_task_id")

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[str]:
        """
        the namespace of the Alibaba Cloud service.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="targetUserId")
    def target_user_id(self) -> pulumi.Output[str]:
        """
        The ID of the member account. If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.
        """
        return pulumi.get(self, "target_user_id")

    @property
    @pulumi.getter(name="yarmConfig")
    def yarm_config(self) -> pulumi.Output[str]:
        """
        The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
        """
        return pulumi.get(self, "yarm_config")

