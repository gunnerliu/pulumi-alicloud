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

__all__ = ['StudioApplicationArgs', 'StudioApplication']

@pulumi.input_type
class StudioApplicationArgs:
    def __init__(__self__, *,
                 application_name: pulumi.Input[str],
                 template_id: pulumi.Input[str],
                 area_id: Optional[pulumi.Input[str]] = None,
                 configuration: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 instances: Optional[pulumi.Input[Sequence[pulumi.Input['StudioApplicationInstanceArgs']]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 variables: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a StudioApplication resource.
        :param pulumi.Input[str] application_name: The name of the application.
        :param pulumi.Input[str] template_id: The id of the template.
        :param pulumi.Input[str] area_id: The id of the area.
        :param pulumi.Input[Mapping[str, Any]] configuration: The configuration of the application.
        :param pulumi.Input[Sequence[pulumi.Input['StudioApplicationInstanceArgs']]] instances: The instance list. Support the creation of instances in the existing vpc under the application. See the following `Block instances`.
        :param pulumi.Input[str] resource_group_id: The id of the resource group.
        :param pulumi.Input[Mapping[str, Any]] variables: The variables of the application.
        """
        StudioApplicationArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            application_name=application_name,
            template_id=template_id,
            area_id=area_id,
            configuration=configuration,
            instances=instances,
            resource_group_id=resource_group_id,
            variables=variables,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             application_name: Optional[pulumi.Input[str]] = None,
             template_id: Optional[pulumi.Input[str]] = None,
             area_id: Optional[pulumi.Input[str]] = None,
             configuration: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             instances: Optional[pulumi.Input[Sequence[pulumi.Input['StudioApplicationInstanceArgs']]]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             variables: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if application_name is None and 'applicationName' in kwargs:
            application_name = kwargs['applicationName']
        if application_name is None:
            raise TypeError("Missing 'application_name' argument")
        if template_id is None and 'templateId' in kwargs:
            template_id = kwargs['templateId']
        if template_id is None:
            raise TypeError("Missing 'template_id' argument")
        if area_id is None and 'areaId' in kwargs:
            area_id = kwargs['areaId']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']

        _setter("application_name", application_name)
        _setter("template_id", template_id)
        if area_id is not None:
            _setter("area_id", area_id)
        if configuration is not None:
            _setter("configuration", configuration)
        if instances is not None:
            _setter("instances", instances)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if variables is not None:
            _setter("variables", variables)

    @property
    @pulumi.getter(name="applicationName")
    def application_name(self) -> pulumi.Input[str]:
        """
        The name of the application.
        """
        return pulumi.get(self, "application_name")

    @application_name.setter
    def application_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "application_name", value)

    @property
    @pulumi.getter(name="templateId")
    def template_id(self) -> pulumi.Input[str]:
        """
        The id of the template.
        """
        return pulumi.get(self, "template_id")

    @template_id.setter
    def template_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "template_id", value)

    @property
    @pulumi.getter(name="areaId")
    def area_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the area.
        """
        return pulumi.get(self, "area_id")

    @area_id.setter
    def area_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "area_id", value)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The configuration of the application.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter
    def instances(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StudioApplicationInstanceArgs']]]]:
        """
        The instance list. Support the creation of instances in the existing vpc under the application. See the following `Block instances`.
        """
        return pulumi.get(self, "instances")

    @instances.setter
    def instances(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StudioApplicationInstanceArgs']]]]):
        pulumi.set(self, "instances", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def variables(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The variables of the application.
        """
        return pulumi.get(self, "variables")

    @variables.setter
    def variables(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "variables", value)


@pulumi.input_type
class _StudioApplicationState:
    def __init__(__self__, *,
                 application_name: Optional[pulumi.Input[str]] = None,
                 area_id: Optional[pulumi.Input[str]] = None,
                 configuration: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 instances: Optional[pulumi.Input[Sequence[pulumi.Input['StudioApplicationInstanceArgs']]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 template_id: Optional[pulumi.Input[str]] = None,
                 variables: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        Input properties used for looking up and filtering StudioApplication resources.
        :param pulumi.Input[str] application_name: The name of the application.
        :param pulumi.Input[str] area_id: The id of the area.
        :param pulumi.Input[Mapping[str, Any]] configuration: The configuration of the application.
        :param pulumi.Input[Sequence[pulumi.Input['StudioApplicationInstanceArgs']]] instances: The instance list. Support the creation of instances in the existing vpc under the application. See the following `Block instances`.
        :param pulumi.Input[str] resource_group_id: The id of the resource group.
        :param pulumi.Input[str] status: The status of the Application.
        :param pulumi.Input[str] template_id: The id of the template.
        :param pulumi.Input[Mapping[str, Any]] variables: The variables of the application.
        """
        _StudioApplicationState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            application_name=application_name,
            area_id=area_id,
            configuration=configuration,
            instances=instances,
            resource_group_id=resource_group_id,
            status=status,
            template_id=template_id,
            variables=variables,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             application_name: Optional[pulumi.Input[str]] = None,
             area_id: Optional[pulumi.Input[str]] = None,
             configuration: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             instances: Optional[pulumi.Input[Sequence[pulumi.Input['StudioApplicationInstanceArgs']]]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             template_id: Optional[pulumi.Input[str]] = None,
             variables: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if application_name is None and 'applicationName' in kwargs:
            application_name = kwargs['applicationName']
        if area_id is None and 'areaId' in kwargs:
            area_id = kwargs['areaId']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if template_id is None and 'templateId' in kwargs:
            template_id = kwargs['templateId']

        if application_name is not None:
            _setter("application_name", application_name)
        if area_id is not None:
            _setter("area_id", area_id)
        if configuration is not None:
            _setter("configuration", configuration)
        if instances is not None:
            _setter("instances", instances)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if status is not None:
            _setter("status", status)
        if template_id is not None:
            _setter("template_id", template_id)
        if variables is not None:
            _setter("variables", variables)

    @property
    @pulumi.getter(name="applicationName")
    def application_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the application.
        """
        return pulumi.get(self, "application_name")

    @application_name.setter
    def application_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_name", value)

    @property
    @pulumi.getter(name="areaId")
    def area_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the area.
        """
        return pulumi.get(self, "area_id")

    @area_id.setter
    def area_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "area_id", value)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The configuration of the application.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter
    def instances(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StudioApplicationInstanceArgs']]]]:
        """
        The instance list. Support the creation of instances in the existing vpc under the application. See the following `Block instances`.
        """
        return pulumi.get(self, "instances")

    @instances.setter
    def instances(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StudioApplicationInstanceArgs']]]]):
        pulumi.set(self, "instances", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the Application.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="templateId")
    def template_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the template.
        """
        return pulumi.get(self, "template_id")

    @template_id.setter
    def template_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "template_id", value)

    @property
    @pulumi.getter
    def variables(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The variables of the application.
        """
        return pulumi.get(self, "variables")

    @variables.setter
    def variables(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "variables", value)


class StudioApplication(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_name: Optional[pulumi.Input[str]] = None,
                 area_id: Optional[pulumi.Input[str]] = None,
                 configuration: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 instances: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StudioApplicationInstanceArgs']]]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 template_id: Optional[pulumi.Input[str]] = None,
                 variables: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        """
        Provides a Cloud Architect Design Tools Application resource.

        For information about Cloud Architect Design Tools Application and how to use it, see [What is Application](https://help.aliyun.com/document_detail/428263.html).

        > **NOTE:** Available in v1.192.0+.

        ## Import

        Cloud Architect Design Tools Application can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:bp/studioApplication:StudioApplication example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_name: The name of the application.
        :param pulumi.Input[str] area_id: The id of the area.
        :param pulumi.Input[Mapping[str, Any]] configuration: The configuration of the application.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StudioApplicationInstanceArgs']]]] instances: The instance list. Support the creation of instances in the existing vpc under the application. See the following `Block instances`.
        :param pulumi.Input[str] resource_group_id: The id of the resource group.
        :param pulumi.Input[str] template_id: The id of the template.
        :param pulumi.Input[Mapping[str, Any]] variables: The variables of the application.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StudioApplicationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Architect Design Tools Application resource.

        For information about Cloud Architect Design Tools Application and how to use it, see [What is Application](https://help.aliyun.com/document_detail/428263.html).

        > **NOTE:** Available in v1.192.0+.

        ## Import

        Cloud Architect Design Tools Application can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:bp/studioApplication:StudioApplication example <id>
        ```

        :param str resource_name: The name of the resource.
        :param StudioApplicationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StudioApplicationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            StudioApplicationArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_name: Optional[pulumi.Input[str]] = None,
                 area_id: Optional[pulumi.Input[str]] = None,
                 configuration: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 instances: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StudioApplicationInstanceArgs']]]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 template_id: Optional[pulumi.Input[str]] = None,
                 variables: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StudioApplicationArgs.__new__(StudioApplicationArgs)

            if application_name is None and not opts.urn:
                raise TypeError("Missing required property 'application_name'")
            __props__.__dict__["application_name"] = application_name
            __props__.__dict__["area_id"] = area_id
            __props__.__dict__["configuration"] = configuration
            __props__.__dict__["instances"] = instances
            __props__.__dict__["resource_group_id"] = resource_group_id
            if template_id is None and not opts.urn:
                raise TypeError("Missing required property 'template_id'")
            __props__.__dict__["template_id"] = template_id
            __props__.__dict__["variables"] = variables
            __props__.__dict__["status"] = None
        super(StudioApplication, __self__).__init__(
            'alicloud:bp/studioApplication:StudioApplication',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            application_name: Optional[pulumi.Input[str]] = None,
            area_id: Optional[pulumi.Input[str]] = None,
            configuration: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            instances: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StudioApplicationInstanceArgs']]]]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            template_id: Optional[pulumi.Input[str]] = None,
            variables: Optional[pulumi.Input[Mapping[str, Any]]] = None) -> 'StudioApplication':
        """
        Get an existing StudioApplication resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_name: The name of the application.
        :param pulumi.Input[str] area_id: The id of the area.
        :param pulumi.Input[Mapping[str, Any]] configuration: The configuration of the application.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StudioApplicationInstanceArgs']]]] instances: The instance list. Support the creation of instances in the existing vpc under the application. See the following `Block instances`.
        :param pulumi.Input[str] resource_group_id: The id of the resource group.
        :param pulumi.Input[str] status: The status of the Application.
        :param pulumi.Input[str] template_id: The id of the template.
        :param pulumi.Input[Mapping[str, Any]] variables: The variables of the application.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StudioApplicationState.__new__(_StudioApplicationState)

        __props__.__dict__["application_name"] = application_name
        __props__.__dict__["area_id"] = area_id
        __props__.__dict__["configuration"] = configuration
        __props__.__dict__["instances"] = instances
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["status"] = status
        __props__.__dict__["template_id"] = template_id
        __props__.__dict__["variables"] = variables
        return StudioApplication(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="applicationName")
    def application_name(self) -> pulumi.Output[str]:
        """
        The name of the application.
        """
        return pulumi.get(self, "application_name")

    @property
    @pulumi.getter(name="areaId")
    def area_id(self) -> pulumi.Output[Optional[str]]:
        """
        The id of the area.
        """
        return pulumi.get(self, "area_id")

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        The configuration of the application.
        """
        return pulumi.get(self, "configuration")

    @property
    @pulumi.getter
    def instances(self) -> pulumi.Output[Optional[Sequence['outputs.StudioApplicationInstance']]]:
        """
        The instance list. Support the creation of instances in the existing vpc under the application. See the following `Block instances`.
        """
        return pulumi.get(self, "instances")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The id of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the Application.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="templateId")
    def template_id(self) -> pulumi.Output[str]:
        """
        The id of the template.
        """
        return pulumi.get(self, "template_id")

    @property
    @pulumi.getter
    def variables(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        The variables of the application.
        """
        return pulumi.get(self, "variables")

