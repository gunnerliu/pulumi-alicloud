# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DeployGroupArgs', 'DeployGroup']

@pulumi.input_type
class DeployGroupArgs:
    def __init__(__self__, *,
                 app_id: pulumi.Input[str],
                 group_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a DeployGroup resource.
        :param pulumi.Input[str] app_id: The ID of the application that you want to deploy.
        :param pulumi.Input[str] group_name: The name of the instance group that you want to create.
        """
        DeployGroupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            app_id=app_id,
            group_name=group_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             app_id: Optional[pulumi.Input[str]] = None,
             group_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if app_id is None and 'appId' in kwargs:
            app_id = kwargs['appId']
        if app_id is None:
            raise TypeError("Missing 'app_id' argument")
        if group_name is None and 'groupName' in kwargs:
            group_name = kwargs['groupName']
        if group_name is None:
            raise TypeError("Missing 'group_name' argument")

        _setter("app_id", app_id)
        _setter("group_name", group_name)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Input[str]:
        """
        The ID of the application that you want to deploy.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> pulumi.Input[str]:
        """
        The name of the instance group that you want to create.
        """
        return pulumi.get(self, "group_name")

    @group_name.setter
    def group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_name", value)


@pulumi.input_type
class _DeployGroupState:
    def __init__(__self__, *,
                 app_id: Optional[pulumi.Input[str]] = None,
                 group_name: Optional[pulumi.Input[str]] = None,
                 group_type: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering DeployGroup resources.
        :param pulumi.Input[str] app_id: The ID of the application that you want to deploy.
        :param pulumi.Input[str] group_name: The name of the instance group that you want to create.
        :param pulumi.Input[int] group_type: The type of the instance group that you want to create. Valid values: 0: Default group. 1: Phased release is disabled for traffic management. 2: Phased release is enabled for traffic management.
        """
        _DeployGroupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            app_id=app_id,
            group_name=group_name,
            group_type=group_type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             app_id: Optional[pulumi.Input[str]] = None,
             group_name: Optional[pulumi.Input[str]] = None,
             group_type: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if app_id is None and 'appId' in kwargs:
            app_id = kwargs['appId']
        if group_name is None and 'groupName' in kwargs:
            group_name = kwargs['groupName']
        if group_type is None and 'groupType' in kwargs:
            group_type = kwargs['groupType']

        if app_id is not None:
            _setter("app_id", app_id)
        if group_name is not None:
            _setter("group_name", group_name)
        if group_type is not None:
            _setter("group_type", group_type)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the application that you want to deploy.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the instance group that you want to create.
        """
        return pulumi.get(self, "group_name")

    @group_name.setter
    def group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_name", value)

    @property
    @pulumi.getter(name="groupType")
    def group_type(self) -> Optional[pulumi.Input[int]]:
        """
        The type of the instance group that you want to create. Valid values: 0: Default group. 1: Phased release is disabled for traffic management. 2: Phased release is enabled for traffic management.
        """
        return pulumi.get(self, "group_type")

    @group_type.setter
    def group_type(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "group_type", value)


class DeployGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 group_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an EDAS deploy group resource, see [What is EDAS Deploy Group](https://www.alibabacloud.com/help/en/edas/developer-reference/api-edas-2017-08-01-insertdeploygroup).

        > **NOTE:** Available since v1.82.0.

        ## Import

        EDAS deploy group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:edas/deployGroup:DeployGroup group app_id:group_name:group_id
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: The ID of the application that you want to deploy.
        :param pulumi.Input[str] group_name: The name of the instance group that you want to create.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DeployGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an EDAS deploy group resource, see [What is EDAS Deploy Group](https://www.alibabacloud.com/help/en/edas/developer-reference/api-edas-2017-08-01-insertdeploygroup).

        > **NOTE:** Available since v1.82.0.

        ## Import

        EDAS deploy group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:edas/deployGroup:DeployGroup group app_id:group_name:group_id
        ```

        :param str resource_name: The name of the resource.
        :param DeployGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DeployGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DeployGroupArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 group_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DeployGroupArgs.__new__(DeployGroupArgs)

            if app_id is None and not opts.urn:
                raise TypeError("Missing required property 'app_id'")
            __props__.__dict__["app_id"] = app_id
            if group_name is None and not opts.urn:
                raise TypeError("Missing required property 'group_name'")
            __props__.__dict__["group_name"] = group_name
            __props__.__dict__["group_type"] = None
        super(DeployGroup, __self__).__init__(
            'alicloud:edas/deployGroup:DeployGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_id: Optional[pulumi.Input[str]] = None,
            group_name: Optional[pulumi.Input[str]] = None,
            group_type: Optional[pulumi.Input[int]] = None) -> 'DeployGroup':
        """
        Get an existing DeployGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: The ID of the application that you want to deploy.
        :param pulumi.Input[str] group_name: The name of the instance group that you want to create.
        :param pulumi.Input[int] group_type: The type of the instance group that you want to create. Valid values: 0: Default group. 1: Phased release is disabled for traffic management. 2: Phased release is enabled for traffic management.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DeployGroupState.__new__(_DeployGroupState)

        __props__.__dict__["app_id"] = app_id
        __props__.__dict__["group_name"] = group_name
        __props__.__dict__["group_type"] = group_type
        return DeployGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Output[str]:
        """
        The ID of the application that you want to deploy.
        """
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> pulumi.Output[str]:
        """
        The name of the instance group that you want to create.
        """
        return pulumi.get(self, "group_name")

    @property
    @pulumi.getter(name="groupType")
    def group_type(self) -> pulumi.Output[int]:
        """
        The type of the instance group that you want to create. Valid values: 0: Default group. 1: Phased release is disabled for traffic management. 2: Phased release is enabled for traffic management.
        """
        return pulumi.get(self, "group_type")

