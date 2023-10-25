# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PrometheusMonitoringArgs', 'PrometheusMonitoring']

@pulumi.input_type
class PrometheusMonitoringArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 config_yaml: pulumi.Input[str],
                 type: pulumi.Input[str],
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PrometheusMonitoring resource.
        :param pulumi.Input[str] cluster_id: The ID of the prometheus instance.
        :param pulumi.Input[str] config_yaml: Yaml configuration for monitoring.
        :param pulumi.Input[str] type: Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
        :param pulumi.Input[str] status: Valid values: `stop`, `run`.
        """
        PrometheusMonitoringArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_id=cluster_id,
            config_yaml=config_yaml,
            type=type,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_id: Optional[pulumi.Input[str]] = None,
             config_yaml: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cluster_id is None and 'clusterId' in kwargs:
            cluster_id = kwargs['clusterId']
        if cluster_id is None:
            raise TypeError("Missing 'cluster_id' argument")
        if config_yaml is None and 'configYaml' in kwargs:
            config_yaml = kwargs['configYaml']
        if config_yaml is None:
            raise TypeError("Missing 'config_yaml' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")

        _setter("cluster_id", cluster_id)
        _setter("config_yaml", config_yaml)
        _setter("type", type)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The ID of the prometheus instance.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="configYaml")
    def config_yaml(self) -> pulumi.Input[str]:
        """
        Yaml configuration for monitoring.
        """
        return pulumi.get(self, "config_yaml")

    @config_yaml.setter
    def config_yaml(self, value: pulumi.Input[str]):
        pulumi.set(self, "config_yaml", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Valid values: `stop`, `run`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _PrometheusMonitoringState:
    def __init__(__self__, *,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 config_yaml: Optional[pulumi.Input[str]] = None,
                 monitoring_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PrometheusMonitoring resources.
        :param pulumi.Input[str] cluster_id: The ID of the prometheus instance.
        :param pulumi.Input[str] config_yaml: Yaml configuration for monitoring.
        :param pulumi.Input[str] monitoring_name: The name of the resource.
        :param pulumi.Input[str] status: Valid values: `stop`, `run`.
        :param pulumi.Input[str] type: Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
        """
        _PrometheusMonitoringState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_id=cluster_id,
            config_yaml=config_yaml,
            monitoring_name=monitoring_name,
            status=status,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_id: Optional[pulumi.Input[str]] = None,
             config_yaml: Optional[pulumi.Input[str]] = None,
             monitoring_name: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cluster_id is None and 'clusterId' in kwargs:
            cluster_id = kwargs['clusterId']
        if config_yaml is None and 'configYaml' in kwargs:
            config_yaml = kwargs['configYaml']
        if monitoring_name is None and 'monitoringName' in kwargs:
            monitoring_name = kwargs['monitoringName']

        if cluster_id is not None:
            _setter("cluster_id", cluster_id)
        if config_yaml is not None:
            _setter("config_yaml", config_yaml)
        if monitoring_name is not None:
            _setter("monitoring_name", monitoring_name)
        if status is not None:
            _setter("status", status)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the prometheus instance.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="configYaml")
    def config_yaml(self) -> Optional[pulumi.Input[str]]:
        """
        Yaml configuration for monitoring.
        """
        return pulumi.get(self, "config_yaml")

    @config_yaml.setter
    def config_yaml(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_yaml", value)

    @property
    @pulumi.getter(name="monitoringName")
    def monitoring_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "monitoring_name")

    @monitoring_name.setter
    def monitoring_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "monitoring_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Valid values: `stop`, `run`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class PrometheusMonitoring(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 config_yaml: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a ARMS Prometheus Monitoring resource. Including serviceMonitor, podMonitor, customJob, probe and other four types of monitoring.

        For information about ARMS Prometheus Monitoring and how to use it, see [What is Prometheus Monitoring](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-dir-managed-service-for-prometheus/).

        > **NOTE:** Available since v1.209.0.

        ## Import

        ARMS Prometheus Monitoring can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:arms/prometheusMonitoring:PrometheusMonitoring example <cluster_id>:<monitoring_name>:<type>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the prometheus instance.
        :param pulumi.Input[str] config_yaml: Yaml configuration for monitoring.
        :param pulumi.Input[str] status: Valid values: `stop`, `run`.
        :param pulumi.Input[str] type: Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrometheusMonitoringArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ARMS Prometheus Monitoring resource. Including serviceMonitor, podMonitor, customJob, probe and other four types of monitoring.

        For information about ARMS Prometheus Monitoring and how to use it, see [What is Prometheus Monitoring](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-dir-managed-service-for-prometheus/).

        > **NOTE:** Available since v1.209.0.

        ## Import

        ARMS Prometheus Monitoring can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:arms/prometheusMonitoring:PrometheusMonitoring example <cluster_id>:<monitoring_name>:<type>
        ```

        :param str resource_name: The name of the resource.
        :param PrometheusMonitoringArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrometheusMonitoringArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            PrometheusMonitoringArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 config_yaml: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrometheusMonitoringArgs.__new__(PrometheusMonitoringArgs)

            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            if config_yaml is None and not opts.urn:
                raise TypeError("Missing required property 'config_yaml'")
            __props__.__dict__["config_yaml"] = config_yaml
            __props__.__dict__["status"] = status
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["monitoring_name"] = None
        super(PrometheusMonitoring, __self__).__init__(
            'alicloud:arms/prometheusMonitoring:PrometheusMonitoring',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            config_yaml: Optional[pulumi.Input[str]] = None,
            monitoring_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'PrometheusMonitoring':
        """
        Get an existing PrometheusMonitoring resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the prometheus instance.
        :param pulumi.Input[str] config_yaml: Yaml configuration for monitoring.
        :param pulumi.Input[str] monitoring_name: The name of the resource.
        :param pulumi.Input[str] status: Valid values: `stop`, `run`.
        :param pulumi.Input[str] type: Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrometheusMonitoringState.__new__(_PrometheusMonitoringState)

        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["config_yaml"] = config_yaml
        __props__.__dict__["monitoring_name"] = monitoring_name
        __props__.__dict__["status"] = status
        __props__.__dict__["type"] = type
        return PrometheusMonitoring(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The ID of the prometheus instance.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="configYaml")
    def config_yaml(self) -> pulumi.Output[str]:
        """
        Yaml configuration for monitoring.
        """
        return pulumi.get(self, "config_yaml")

    @property
    @pulumi.getter(name="monitoringName")
    def monitoring_name(self) -> pulumi.Output[str]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "monitoring_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Valid values: `stop`, `run`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
        """
        return pulumi.get(self, "type")

