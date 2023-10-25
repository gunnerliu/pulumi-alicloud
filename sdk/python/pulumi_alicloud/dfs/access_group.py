# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AccessGroupArgs', 'AccessGroup']

@pulumi.input_type
class AccessGroupArgs:
    def __init__(__self__, *,
                 access_group_name: pulumi.Input[str],
                 network_type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessGroup resource.
        :param pulumi.Input[str] access_group_name: The Name of Access Group.The length of `access_group_name` does not exceed 100 bytes.
        :param pulumi.Input[str] network_type: The NetworkType of Access Group. Valid values: `VPC`.
        :param pulumi.Input[str] description: The Description of Access Group. The length of `description` does not exceed 100 bytes.
        """
        AccessGroupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            access_group_name=access_group_name,
            network_type=network_type,
            description=description,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             access_group_name: Optional[pulumi.Input[str]] = None,
             network_type: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if access_group_name is None and 'accessGroupName' in kwargs:
            access_group_name = kwargs['accessGroupName']
        if access_group_name is None:
            raise TypeError("Missing 'access_group_name' argument")
        if network_type is None and 'networkType' in kwargs:
            network_type = kwargs['networkType']
        if network_type is None:
            raise TypeError("Missing 'network_type' argument")

        _setter("access_group_name", access_group_name)
        _setter("network_type", network_type)
        if description is not None:
            _setter("description", description)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> pulumi.Input[str]:
        """
        The Name of Access Group.The length of `access_group_name` does not exceed 100 bytes.
        """
        return pulumi.get(self, "access_group_name")

    @access_group_name.setter
    def access_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "access_group_name", value)

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> pulumi.Input[str]:
        """
        The NetworkType of Access Group. Valid values: `VPC`.
        """
        return pulumi.get(self, "network_type")

    @network_type.setter
    def network_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "network_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The Description of Access Group. The length of `description` does not exceed 100 bytes.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _AccessGroupState:
    def __init__(__self__, *,
                 access_group_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 network_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessGroup resources.
        :param pulumi.Input[str] access_group_name: The Name of Access Group.The length of `access_group_name` does not exceed 100 bytes.
        :param pulumi.Input[str] description: The Description of Access Group. The length of `description` does not exceed 100 bytes.
        :param pulumi.Input[str] network_type: The NetworkType of Access Group. Valid values: `VPC`.
        """
        _AccessGroupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            access_group_name=access_group_name,
            description=description,
            network_type=network_type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             access_group_name: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             network_type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if access_group_name is None and 'accessGroupName' in kwargs:
            access_group_name = kwargs['accessGroupName']
        if network_type is None and 'networkType' in kwargs:
            network_type = kwargs['networkType']

        if access_group_name is not None:
            _setter("access_group_name", access_group_name)
        if description is not None:
            _setter("description", description)
        if network_type is not None:
            _setter("network_type", network_type)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Name of Access Group.The length of `access_group_name` does not exceed 100 bytes.
        """
        return pulumi.get(self, "access_group_name")

    @access_group_name.setter
    def access_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_group_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The Description of Access Group. The length of `description` does not exceed 100 bytes.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> Optional[pulumi.Input[str]]:
        """
        The NetworkType of Access Group. Valid values: `VPC`.
        """
        return pulumi.get(self, "network_type")

    @network_type.setter
    def network_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_type", value)


class AccessGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_group_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 network_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a DFS Access Group resource.

        For information about DFS Access Group and how to use it, see [What is Access Group](https://www.alibabacloud.com/help/doc-detail/207144.htm).

        > **NOTE:** Available since v1.133.0.

        ## Import

        DFS Access Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dfs/accessGroup:AccessGroup example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_group_name: The Name of Access Group.The length of `access_group_name` does not exceed 100 bytes.
        :param pulumi.Input[str] description: The Description of Access Group. The length of `description` does not exceed 100 bytes.
        :param pulumi.Input[str] network_type: The NetworkType of Access Group. Valid values: `VPC`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DFS Access Group resource.

        For information about DFS Access Group and how to use it, see [What is Access Group](https://www.alibabacloud.com/help/doc-detail/207144.htm).

        > **NOTE:** Available since v1.133.0.

        ## Import

        DFS Access Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dfs/accessGroup:AccessGroup example <id>
        ```

        :param str resource_name: The name of the resource.
        :param AccessGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AccessGroupArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_group_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 network_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessGroupArgs.__new__(AccessGroupArgs)

            if access_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'access_group_name'")
            __props__.__dict__["access_group_name"] = access_group_name
            __props__.__dict__["description"] = description
            if network_type is None and not opts.urn:
                raise TypeError("Missing required property 'network_type'")
            __props__.__dict__["network_type"] = network_type
        super(AccessGroup, __self__).__init__(
            'alicloud:dfs/accessGroup:AccessGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_group_name: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            network_type: Optional[pulumi.Input[str]] = None) -> 'AccessGroup':
        """
        Get an existing AccessGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_group_name: The Name of Access Group.The length of `access_group_name` does not exceed 100 bytes.
        :param pulumi.Input[str] description: The Description of Access Group. The length of `description` does not exceed 100 bytes.
        :param pulumi.Input[str] network_type: The NetworkType of Access Group. Valid values: `VPC`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessGroupState.__new__(_AccessGroupState)

        __props__.__dict__["access_group_name"] = access_group_name
        __props__.__dict__["description"] = description
        __props__.__dict__["network_type"] = network_type
        return AccessGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> pulumi.Output[str]:
        """
        The Name of Access Group.The length of `access_group_name` does not exceed 100 bytes.
        """
        return pulumi.get(self, "access_group_name")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The Description of Access Group. The length of `description` does not exceed 100 bytes.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> pulumi.Output[str]:
        """
        The NetworkType of Access Group. Valid values: `VPC`.
        """
        return pulumi.get(self, "network_type")

