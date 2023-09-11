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
from ._inputs import *

__all__ = ['ServiceArgs', 'Service']

@pulumi.input_type
class ServiceArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 internet_access: Optional[pulumi.Input[bool]] = None,
                 log_config: Optional[pulumi.Input['ServiceLogConfigArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 nas_config: Optional[pulumi.Input['ServiceNasConfigArgs']] = None,
                 publish: Optional[pulumi.Input[bool]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 tracing_config: Optional[pulumi.Input['ServiceTracingConfigArgs']] = None,
                 vpc_config: Optional[pulumi.Input['ServiceVpcConfigArgs']] = None):
        """
        The set of arguments for constructing a Service resource.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if internet_access is not None:
            pulumi.set(__self__, "internet_access", internet_access)
        if log_config is not None:
            pulumi.set(__self__, "log_config", log_config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if nas_config is not None:
            pulumi.set(__self__, "nas_config", nas_config)
        if publish is not None:
            pulumi.set(__self__, "publish", publish)
        if role is not None:
            pulumi.set(__self__, "role", role)
        if tracing_config is not None:
            pulumi.set(__self__, "tracing_config", tracing_config)
        if vpc_config is not None:
            pulumi.set(__self__, "vpc_config", vpc_config)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="internetAccess")
    def internet_access(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "internet_access")

    @internet_access.setter
    def internet_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "internet_access", value)

    @property
    @pulumi.getter(name="logConfig")
    def log_config(self) -> Optional[pulumi.Input['ServiceLogConfigArgs']]:
        return pulumi.get(self, "log_config")

    @log_config.setter
    def log_config(self, value: Optional[pulumi.Input['ServiceLogConfigArgs']]):
        pulumi.set(self, "log_config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter(name="nasConfig")
    def nas_config(self) -> Optional[pulumi.Input['ServiceNasConfigArgs']]:
        return pulumi.get(self, "nas_config")

    @nas_config.setter
    def nas_config(self, value: Optional[pulumi.Input['ServiceNasConfigArgs']]):
        pulumi.set(self, "nas_config", value)

    @property
    @pulumi.getter
    def publish(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "publish")

    @publish.setter
    def publish(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "publish", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter(name="tracingConfig")
    def tracing_config(self) -> Optional[pulumi.Input['ServiceTracingConfigArgs']]:
        return pulumi.get(self, "tracing_config")

    @tracing_config.setter
    def tracing_config(self, value: Optional[pulumi.Input['ServiceTracingConfigArgs']]):
        pulumi.set(self, "tracing_config", value)

    @property
    @pulumi.getter(name="vpcConfig")
    def vpc_config(self) -> Optional[pulumi.Input['ServiceVpcConfigArgs']]:
        return pulumi.get(self, "vpc_config")

    @vpc_config.setter
    def vpc_config(self, value: Optional[pulumi.Input['ServiceVpcConfigArgs']]):
        pulumi.set(self, "vpc_config", value)


@pulumi.input_type
class _ServiceState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 internet_access: Optional[pulumi.Input[bool]] = None,
                 last_modified: Optional[pulumi.Input[str]] = None,
                 log_config: Optional[pulumi.Input['ServiceLogConfigArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 nas_config: Optional[pulumi.Input['ServiceNasConfigArgs']] = None,
                 publish: Optional[pulumi.Input[bool]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 tracing_config: Optional[pulumi.Input['ServiceTracingConfigArgs']] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 vpc_config: Optional[pulumi.Input['ServiceVpcConfigArgs']] = None):
        """
        Input properties used for looking up and filtering Service resources.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if internet_access is not None:
            pulumi.set(__self__, "internet_access", internet_access)
        if last_modified is not None:
            pulumi.set(__self__, "last_modified", last_modified)
        if log_config is not None:
            pulumi.set(__self__, "log_config", log_config)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if nas_config is not None:
            pulumi.set(__self__, "nas_config", nas_config)
        if publish is not None:
            pulumi.set(__self__, "publish", publish)
        if role is not None:
            pulumi.set(__self__, "role", role)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)
        if tracing_config is not None:
            pulumi.set(__self__, "tracing_config", tracing_config)
        if version is not None:
            pulumi.set(__self__, "version", version)
        if vpc_config is not None:
            pulumi.set(__self__, "vpc_config", vpc_config)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="internetAccess")
    def internet_access(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "internet_access")

    @internet_access.setter
    def internet_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "internet_access", value)

    @property
    @pulumi.getter(name="lastModified")
    def last_modified(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "last_modified")

    @last_modified.setter
    def last_modified(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modified", value)

    @property
    @pulumi.getter(name="logConfig")
    def log_config(self) -> Optional[pulumi.Input['ServiceLogConfigArgs']]:
        return pulumi.get(self, "log_config")

    @log_config.setter
    def log_config(self, value: Optional[pulumi.Input['ServiceLogConfigArgs']]):
        pulumi.set(self, "log_config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter(name="nasConfig")
    def nas_config(self) -> Optional[pulumi.Input['ServiceNasConfigArgs']]:
        return pulumi.get(self, "nas_config")

    @nas_config.setter
    def nas_config(self, value: Optional[pulumi.Input['ServiceNasConfigArgs']]):
        pulumi.set(self, "nas_config", value)

    @property
    @pulumi.getter
    def publish(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "publish")

    @publish.setter
    def publish(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "publish", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter(name="tracingConfig")
    def tracing_config(self) -> Optional[pulumi.Input['ServiceTracingConfigArgs']]:
        return pulumi.get(self, "tracing_config")

    @tracing_config.setter
    def tracing_config(self, value: Optional[pulumi.Input['ServiceTracingConfigArgs']]):
        pulumi.set(self, "tracing_config", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter(name="vpcConfig")
    def vpc_config(self) -> Optional[pulumi.Input['ServiceVpcConfigArgs']]:
        return pulumi.get(self, "vpc_config")

    @vpc_config.setter
    def vpc_config(self, value: Optional[pulumi.Input['ServiceVpcConfigArgs']]):
        pulumi.set(self, "vpc_config", value)


class Service(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 internet_access: Optional[pulumi.Input[bool]] = None,
                 log_config: Optional[pulumi.Input[pulumi.InputType['ServiceLogConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 nas_config: Optional[pulumi.Input[pulumi.InputType['ServiceNasConfigArgs']]] = None,
                 publish: Optional[pulumi.Input[bool]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 tracing_config: Optional[pulumi.Input[pulumi.InputType['ServiceTracingConfigArgs']]] = None,
                 vpc_config: Optional[pulumi.Input[pulumi.InputType['ServiceVpcConfigArgs']]] = None,
                 __props__=None):
        """
        Create a Service resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ServiceArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a Service resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param ServiceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 internet_access: Optional[pulumi.Input[bool]] = None,
                 log_config: Optional[pulumi.Input[pulumi.InputType['ServiceLogConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 nas_config: Optional[pulumi.Input[pulumi.InputType['ServiceNasConfigArgs']]] = None,
                 publish: Optional[pulumi.Input[bool]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 tracing_config: Optional[pulumi.Input[pulumi.InputType['ServiceTracingConfigArgs']]] = None,
                 vpc_config: Optional[pulumi.Input[pulumi.InputType['ServiceVpcConfigArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceArgs.__new__(ServiceArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["internet_access"] = internet_access
            __props__.__dict__["log_config"] = log_config
            __props__.__dict__["name"] = name
            __props__.__dict__["name_prefix"] = name_prefix
            __props__.__dict__["nas_config"] = nas_config
            __props__.__dict__["publish"] = publish
            __props__.__dict__["role"] = role
            __props__.__dict__["tracing_config"] = tracing_config
            __props__.__dict__["vpc_config"] = vpc_config
            __props__.__dict__["last_modified"] = None
            __props__.__dict__["service_id"] = None
            __props__.__dict__["version"] = None
        super(Service, __self__).__init__(
            'alicloud:fc/service:Service',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            internet_access: Optional[pulumi.Input[bool]] = None,
            last_modified: Optional[pulumi.Input[str]] = None,
            log_config: Optional[pulumi.Input[pulumi.InputType['ServiceLogConfigArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            name_prefix: Optional[pulumi.Input[str]] = None,
            nas_config: Optional[pulumi.Input[pulumi.InputType['ServiceNasConfigArgs']]] = None,
            publish: Optional[pulumi.Input[bool]] = None,
            role: Optional[pulumi.Input[str]] = None,
            service_id: Optional[pulumi.Input[str]] = None,
            tracing_config: Optional[pulumi.Input[pulumi.InputType['ServiceTracingConfigArgs']]] = None,
            version: Optional[pulumi.Input[str]] = None,
            vpc_config: Optional[pulumi.Input[pulumi.InputType['ServiceVpcConfigArgs']]] = None) -> 'Service':
        """
        Get an existing Service resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceState.__new__(_ServiceState)

        __props__.__dict__["description"] = description
        __props__.__dict__["internet_access"] = internet_access
        __props__.__dict__["last_modified"] = last_modified
        __props__.__dict__["log_config"] = log_config
        __props__.__dict__["name"] = name
        __props__.__dict__["name_prefix"] = name_prefix
        __props__.__dict__["nas_config"] = nas_config
        __props__.__dict__["publish"] = publish
        __props__.__dict__["role"] = role
        __props__.__dict__["service_id"] = service_id
        __props__.__dict__["tracing_config"] = tracing_config
        __props__.__dict__["version"] = version
        __props__.__dict__["vpc_config"] = vpc_config
        return Service(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="internetAccess")
    def internet_access(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "internet_access")

    @property
    @pulumi.getter(name="lastModified")
    def last_modified(self) -> pulumi.Output[str]:
        return pulumi.get(self, "last_modified")

    @property
    @pulumi.getter(name="logConfig")
    def log_config(self) -> pulumi.Output[Optional['outputs.ServiceLogConfig']]:
        return pulumi.get(self, "log_config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "name_prefix")

    @property
    @pulumi.getter(name="nasConfig")
    def nas_config(self) -> pulumi.Output[Optional['outputs.ServiceNasConfig']]:
        return pulumi.get(self, "nas_config")

    @property
    @pulumi.getter
    def publish(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "publish")

    @property
    @pulumi.getter
    def role(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "role")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter(name="tracingConfig")
    def tracing_config(self) -> pulumi.Output[Optional['outputs.ServiceTracingConfig']]:
        return pulumi.get(self, "tracing_config")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="vpcConfig")
    def vpc_config(self) -> pulumi.Output[Optional['outputs.ServiceVpcConfig']]:
        return pulumi.get(self, "vpc_config")

