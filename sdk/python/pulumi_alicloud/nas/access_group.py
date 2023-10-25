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
                 access_group_name: Optional[pulumi.Input[str]] = None,
                 access_group_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 file_system_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessGroup resource.
        :param pulumi.Input[str] access_group_name: A Name of one Access Group.
        :param pulumi.Input[str] access_group_type: A Type of one Access Group. Valid values: `Vpc` and `Classic`.
        :param pulumi.Input[str] description: The Access Group description.
        :param pulumi.Input[str] file_system_type: The type of file system. Valid values: `standard` and `extreme`. Default to `standard`. Note that the extreme only support Vpc Network.
        :param pulumi.Input[str] name: Replaced by `access_group_name` after version 1.92.0.
        :param pulumi.Input[str] type: Replaced by `access_group_type` after version 1.92.0.
        """
        AccessGroupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            access_group_name=access_group_name,
            access_group_type=access_group_type,
            description=description,
            file_system_type=file_system_type,
            name=name,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             access_group_name: Optional[pulumi.Input[str]] = None,
             access_group_type: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             file_system_type: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if access_group_name is None and 'accessGroupName' in kwargs:
            access_group_name = kwargs['accessGroupName']
        if access_group_type is None and 'accessGroupType' in kwargs:
            access_group_type = kwargs['accessGroupType']
        if file_system_type is None and 'fileSystemType' in kwargs:
            file_system_type = kwargs['fileSystemType']

        if access_group_name is not None:
            _setter("access_group_name", access_group_name)
        if access_group_type is not None:
            _setter("access_group_type", access_group_type)
        if description is not None:
            _setter("description", description)
        if file_system_type is not None:
            _setter("file_system_type", file_system_type)
        if name is not None:
            _setter("name", name)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        A Name of one Access Group.
        """
        return pulumi.get(self, "access_group_name")

    @access_group_name.setter
    def access_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_group_name", value)

    @property
    @pulumi.getter(name="accessGroupType")
    def access_group_type(self) -> Optional[pulumi.Input[str]]:
        """
        A Type of one Access Group. Valid values: `Vpc` and `Classic`.
        """
        return pulumi.get(self, "access_group_type")

    @access_group_type.setter
    def access_group_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_group_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The Access Group description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="fileSystemType")
    def file_system_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of file system. Valid values: `standard` and `extreme`. Default to `standard`. Note that the extreme only support Vpc Network.
        """
        return pulumi.get(self, "file_system_type")

    @file_system_type.setter
    def file_system_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_system_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Replaced by `access_group_name` after version 1.92.0.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Replaced by `access_group_type` after version 1.92.0.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _AccessGroupState:
    def __init__(__self__, *,
                 access_group_name: Optional[pulumi.Input[str]] = None,
                 access_group_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 file_system_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessGroup resources.
        :param pulumi.Input[str] access_group_name: A Name of one Access Group.
        :param pulumi.Input[str] access_group_type: A Type of one Access Group. Valid values: `Vpc` and `Classic`.
        :param pulumi.Input[str] description: The Access Group description.
        :param pulumi.Input[str] file_system_type: The type of file system. Valid values: `standard` and `extreme`. Default to `standard`. Note that the extreme only support Vpc Network.
        :param pulumi.Input[str] name: Replaced by `access_group_name` after version 1.92.0.
        :param pulumi.Input[str] type: Replaced by `access_group_type` after version 1.92.0.
        """
        _AccessGroupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            access_group_name=access_group_name,
            access_group_type=access_group_type,
            description=description,
            file_system_type=file_system_type,
            name=name,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             access_group_name: Optional[pulumi.Input[str]] = None,
             access_group_type: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             file_system_type: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if access_group_name is None and 'accessGroupName' in kwargs:
            access_group_name = kwargs['accessGroupName']
        if access_group_type is None and 'accessGroupType' in kwargs:
            access_group_type = kwargs['accessGroupType']
        if file_system_type is None and 'fileSystemType' in kwargs:
            file_system_type = kwargs['fileSystemType']

        if access_group_name is not None:
            _setter("access_group_name", access_group_name)
        if access_group_type is not None:
            _setter("access_group_type", access_group_type)
        if description is not None:
            _setter("description", description)
        if file_system_type is not None:
            _setter("file_system_type", file_system_type)
        if name is not None:
            _setter("name", name)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        A Name of one Access Group.
        """
        return pulumi.get(self, "access_group_name")

    @access_group_name.setter
    def access_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_group_name", value)

    @property
    @pulumi.getter(name="accessGroupType")
    def access_group_type(self) -> Optional[pulumi.Input[str]]:
        """
        A Type of one Access Group. Valid values: `Vpc` and `Classic`.
        """
        return pulumi.get(self, "access_group_type")

    @access_group_type.setter
    def access_group_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_group_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The Access Group description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="fileSystemType")
    def file_system_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of file system. Valid values: `standard` and `extreme`. Default to `standard`. Note that the extreme only support Vpc Network.
        """
        return pulumi.get(self, "file_system_type")

    @file_system_type.setter
    def file_system_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_system_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Replaced by `access_group_name` after version 1.92.0.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Replaced by `access_group_type` after version 1.92.0.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class AccessGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_group_name: Optional[pulumi.Input[str]] = None,
                 access_group_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 file_system_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a NAS Access Group resource.

        In NAS, the permission group acts as a whitelist that allows you to restrict file system access. You can allow specified IP addresses or CIDR blocks to access the file system, and assign different levels of access permission to different IP addresses or CIDR blocks by adding rules to the permission group.
        For information about NAS Access Group and how to use it, see [What is NAS Access Group](https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createaccessgroup)

        > **NOTE:** Available in v1.33.0+.

        ## Import

        NAS Access Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:nas/accessGroup:AccessGroup foo tf_testAccNasConfig:standard
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_group_name: A Name of one Access Group.
        :param pulumi.Input[str] access_group_type: A Type of one Access Group. Valid values: `Vpc` and `Classic`.
        :param pulumi.Input[str] description: The Access Group description.
        :param pulumi.Input[str] file_system_type: The type of file system. Valid values: `standard` and `extreme`. Default to `standard`. Note that the extreme only support Vpc Network.
        :param pulumi.Input[str] name: Replaced by `access_group_name` after version 1.92.0.
        :param pulumi.Input[str] type: Replaced by `access_group_type` after version 1.92.0.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AccessGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a NAS Access Group resource.

        In NAS, the permission group acts as a whitelist that allows you to restrict file system access. You can allow specified IP addresses or CIDR blocks to access the file system, and assign different levels of access permission to different IP addresses or CIDR blocks by adding rules to the permission group.
        For information about NAS Access Group and how to use it, see [What is NAS Access Group](https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createaccessgroup)

        > **NOTE:** Available in v1.33.0+.

        ## Import

        NAS Access Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:nas/accessGroup:AccessGroup foo tf_testAccNasConfig:standard
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
                 access_group_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 file_system_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessGroupArgs.__new__(AccessGroupArgs)

            __props__.__dict__["access_group_name"] = access_group_name
            __props__.__dict__["access_group_type"] = access_group_type
            __props__.__dict__["description"] = description
            __props__.__dict__["file_system_type"] = file_system_type
            __props__.__dict__["name"] = name
            __props__.__dict__["type"] = type
        super(AccessGroup, __self__).__init__(
            'alicloud:nas/accessGroup:AccessGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_group_name: Optional[pulumi.Input[str]] = None,
            access_group_type: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            file_system_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'AccessGroup':
        """
        Get an existing AccessGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_group_name: A Name of one Access Group.
        :param pulumi.Input[str] access_group_type: A Type of one Access Group. Valid values: `Vpc` and `Classic`.
        :param pulumi.Input[str] description: The Access Group description.
        :param pulumi.Input[str] file_system_type: The type of file system. Valid values: `standard` and `extreme`. Default to `standard`. Note that the extreme only support Vpc Network.
        :param pulumi.Input[str] name: Replaced by `access_group_name` after version 1.92.0.
        :param pulumi.Input[str] type: Replaced by `access_group_type` after version 1.92.0.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessGroupState.__new__(_AccessGroupState)

        __props__.__dict__["access_group_name"] = access_group_name
        __props__.__dict__["access_group_type"] = access_group_type
        __props__.__dict__["description"] = description
        __props__.__dict__["file_system_type"] = file_system_type
        __props__.__dict__["name"] = name
        __props__.__dict__["type"] = type
        return AccessGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> pulumi.Output[str]:
        """
        A Name of one Access Group.
        """
        return pulumi.get(self, "access_group_name")

    @property
    @pulumi.getter(name="accessGroupType")
    def access_group_type(self) -> pulumi.Output[str]:
        """
        A Type of one Access Group. Valid values: `Vpc` and `Classic`.
        """
        return pulumi.get(self, "access_group_type")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The Access Group description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="fileSystemType")
    def file_system_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of file system. Valid values: `standard` and `extreme`. Default to `standard`. Note that the extreme only support Vpc Network.
        """
        return pulumi.get(self, "file_system_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Replaced by `access_group_name` after version 1.92.0.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Replaced by `access_group_type` after version 1.92.0.
        """
        return pulumi.get(self, "type")

