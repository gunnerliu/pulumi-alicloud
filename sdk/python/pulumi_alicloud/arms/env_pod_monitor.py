# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['EnvPodMonitorArgs', 'EnvPodMonitor']

@pulumi.input_type
class EnvPodMonitorArgs:
    def __init__(__self__, *,
                 config_yaml: pulumi.Input[str],
                 environment_id: pulumi.Input[str],
                 aliyun_lang: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EnvPodMonitor resource.
        :param pulumi.Input[str] config_yaml: Yaml configuration string.
        :param pulumi.Input[str] environment_id: Environment id.
        :param pulumi.Input[str] aliyun_lang: Language environment, default is Chinese zh | en.
        """
        pulumi.set(__self__, "config_yaml", config_yaml)
        pulumi.set(__self__, "environment_id", environment_id)
        if aliyun_lang is not None:
            pulumi.set(__self__, "aliyun_lang", aliyun_lang)

    @property
    @pulumi.getter(name="configYaml")
    def config_yaml(self) -> pulumi.Input[str]:
        """
        Yaml configuration string.
        """
        return pulumi.get(self, "config_yaml")

    @config_yaml.setter
    def config_yaml(self, value: pulumi.Input[str]):
        pulumi.set(self, "config_yaml", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Input[str]:
        """
        Environment id.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter(name="aliyunLang")
    def aliyun_lang(self) -> Optional[pulumi.Input[str]]:
        """
        Language environment, default is Chinese zh | en.
        """
        return pulumi.get(self, "aliyun_lang")

    @aliyun_lang.setter
    def aliyun_lang(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aliyun_lang", value)


@pulumi.input_type
class _EnvPodMonitorState:
    def __init__(__self__, *,
                 aliyun_lang: Optional[pulumi.Input[str]] = None,
                 config_yaml: Optional[pulumi.Input[str]] = None,
                 env_pod_monitor_name: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EnvPodMonitor resources.
        :param pulumi.Input[str] aliyun_lang: Language environment, default is Chinese zh | en.
        :param pulumi.Input[str] config_yaml: Yaml configuration string.
        :param pulumi.Input[str] env_pod_monitor_name: The name of the resource.
        :param pulumi.Input[str] environment_id: Environment id.
        :param pulumi.Input[str] namespace: Resource namespace.
        :param pulumi.Input[str] status: PodMonitor status.
        """
        if aliyun_lang is not None:
            pulumi.set(__self__, "aliyun_lang", aliyun_lang)
        if config_yaml is not None:
            pulumi.set(__self__, "config_yaml", config_yaml)
        if env_pod_monitor_name is not None:
            pulumi.set(__self__, "env_pod_monitor_name", env_pod_monitor_name)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="aliyunLang")
    def aliyun_lang(self) -> Optional[pulumi.Input[str]]:
        """
        Language environment, default is Chinese zh | en.
        """
        return pulumi.get(self, "aliyun_lang")

    @aliyun_lang.setter
    def aliyun_lang(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aliyun_lang", value)

    @property
    @pulumi.getter(name="configYaml")
    def config_yaml(self) -> Optional[pulumi.Input[str]]:
        """
        Yaml configuration string.
        """
        return pulumi.get(self, "config_yaml")

    @config_yaml.setter
    def config_yaml(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_yaml", value)

    @property
    @pulumi.getter(name="envPodMonitorName")
    def env_pod_monitor_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "env_pod_monitor_name")

    @env_pod_monitor_name.setter
    def env_pod_monitor_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "env_pod_monitor_name", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        Environment id.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        Resource namespace.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        PodMonitor status.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class EnvPodMonitor(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aliyun_lang: Optional[pulumi.Input[str]] = None,
                 config_yaml: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a ARMS Env Pod Monitor resource. PodMonitor for the arms environment.

        For information about ARMS Env Pod Monitor and how to use it, see [What is Env Pod Monitor](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-createenvpodmonitor).

        > **NOTE:** Available since v1.212.0.

        ## Import

        ARMS Env Pod Monitor can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:arms/envPodMonitor:EnvPodMonitor example <environment_id>:<namespace>:<env_pod_monitor_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] aliyun_lang: Language environment, default is Chinese zh | en.
        :param pulumi.Input[str] config_yaml: Yaml configuration string.
        :param pulumi.Input[str] environment_id: Environment id.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EnvPodMonitorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ARMS Env Pod Monitor resource. PodMonitor for the arms environment.

        For information about ARMS Env Pod Monitor and how to use it, see [What is Env Pod Monitor](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-createenvpodmonitor).

        > **NOTE:** Available since v1.212.0.

        ## Import

        ARMS Env Pod Monitor can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:arms/envPodMonitor:EnvPodMonitor example <environment_id>:<namespace>:<env_pod_monitor_name>
        ```

        :param str resource_name: The name of the resource.
        :param EnvPodMonitorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EnvPodMonitorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aliyun_lang: Optional[pulumi.Input[str]] = None,
                 config_yaml: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EnvPodMonitorArgs.__new__(EnvPodMonitorArgs)

            __props__.__dict__["aliyun_lang"] = aliyun_lang
            if config_yaml is None and not opts.urn:
                raise TypeError("Missing required property 'config_yaml'")
            __props__.__dict__["config_yaml"] = config_yaml
            if environment_id is None and not opts.urn:
                raise TypeError("Missing required property 'environment_id'")
            __props__.__dict__["environment_id"] = environment_id
            __props__.__dict__["env_pod_monitor_name"] = None
            __props__.__dict__["namespace"] = None
            __props__.__dict__["status"] = None
        super(EnvPodMonitor, __self__).__init__(
            'alicloud:arms/envPodMonitor:EnvPodMonitor',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aliyun_lang: Optional[pulumi.Input[str]] = None,
            config_yaml: Optional[pulumi.Input[str]] = None,
            env_pod_monitor_name: Optional[pulumi.Input[str]] = None,
            environment_id: Optional[pulumi.Input[str]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'EnvPodMonitor':
        """
        Get an existing EnvPodMonitor resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] aliyun_lang: Language environment, default is Chinese zh | en.
        :param pulumi.Input[str] config_yaml: Yaml configuration string.
        :param pulumi.Input[str] env_pod_monitor_name: The name of the resource.
        :param pulumi.Input[str] environment_id: Environment id.
        :param pulumi.Input[str] namespace: Resource namespace.
        :param pulumi.Input[str] status: PodMonitor status.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EnvPodMonitorState.__new__(_EnvPodMonitorState)

        __props__.__dict__["aliyun_lang"] = aliyun_lang
        __props__.__dict__["config_yaml"] = config_yaml
        __props__.__dict__["env_pod_monitor_name"] = env_pod_monitor_name
        __props__.__dict__["environment_id"] = environment_id
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["status"] = status
        return EnvPodMonitor(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="aliyunLang")
    def aliyun_lang(self) -> pulumi.Output[Optional[str]]:
        """
        Language environment, default is Chinese zh | en.
        """
        return pulumi.get(self, "aliyun_lang")

    @property
    @pulumi.getter(name="configYaml")
    def config_yaml(self) -> pulumi.Output[str]:
        """
        Yaml configuration string.
        """
        return pulumi.get(self, "config_yaml")

    @property
    @pulumi.getter(name="envPodMonitorName")
    def env_pod_monitor_name(self) -> pulumi.Output[str]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "env_pod_monitor_name")

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Output[str]:
        """
        Environment id.
        """
        return pulumi.get(self, "environment_id")

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[str]:
        """
        Resource namespace.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        PodMonitor status.
        """
        return pulumi.get(self, "status")

