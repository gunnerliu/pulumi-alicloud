# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InstanceMemberArgs', 'InstanceMember']

@pulumi.input_type
class InstanceMemberArgs:
    def __init__(__self__, *,
                 member_uid: pulumi.Input[str],
                 member_desc: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a InstanceMember resource.
        :param pulumi.Input[str] member_uid: The UID of the cloud firewall member account.
        :param pulumi.Input[str] member_desc: Remarks of cloud firewall member accounts.
        """
        InstanceMemberArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            member_uid=member_uid,
            member_desc=member_desc,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             member_uid: Optional[pulumi.Input[str]] = None,
             member_desc: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if member_uid is None and 'memberUid' in kwargs:
            member_uid = kwargs['memberUid']
        if member_uid is None:
            raise TypeError("Missing 'member_uid' argument")
        if member_desc is None and 'memberDesc' in kwargs:
            member_desc = kwargs['memberDesc']

        _setter("member_uid", member_uid)
        if member_desc is not None:
            _setter("member_desc", member_desc)

    @property
    @pulumi.getter(name="memberUid")
    def member_uid(self) -> pulumi.Input[str]:
        """
        The UID of the cloud firewall member account.
        """
        return pulumi.get(self, "member_uid")

    @member_uid.setter
    def member_uid(self, value: pulumi.Input[str]):
        pulumi.set(self, "member_uid", value)

    @property
    @pulumi.getter(name="memberDesc")
    def member_desc(self) -> Optional[pulumi.Input[str]]:
        """
        Remarks of cloud firewall member accounts.
        """
        return pulumi.get(self, "member_desc")

    @member_desc.setter
    def member_desc(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "member_desc", value)


@pulumi.input_type
class _InstanceMemberState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[int]] = None,
                 member_desc: Optional[pulumi.Input[str]] = None,
                 member_display_name: Optional[pulumi.Input[str]] = None,
                 member_uid: Optional[pulumi.Input[str]] = None,
                 modify_time: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering InstanceMember resources.
        :param pulumi.Input[int] create_time: When the cloud firewall member account was added.> use second-level timestamp format.
        :param pulumi.Input[str] member_desc: Remarks of cloud firewall member accounts.
        :param pulumi.Input[str] member_display_name: The name of the cloud firewall member account.
        :param pulumi.Input[str] member_uid: The UID of the cloud firewall member account.
        :param pulumi.Input[int] modify_time: The last modification time of the cloud firewall member account.> use second-level timestamp format.
        :param pulumi.Input[str] status: The resource attribute field that represents the resource status.
        """
        _InstanceMemberState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            create_time=create_time,
            member_desc=member_desc,
            member_display_name=member_display_name,
            member_uid=member_uid,
            modify_time=modify_time,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             create_time: Optional[pulumi.Input[int]] = None,
             member_desc: Optional[pulumi.Input[str]] = None,
             member_display_name: Optional[pulumi.Input[str]] = None,
             member_uid: Optional[pulumi.Input[str]] = None,
             modify_time: Optional[pulumi.Input[int]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if member_desc is None and 'memberDesc' in kwargs:
            member_desc = kwargs['memberDesc']
        if member_display_name is None and 'memberDisplayName' in kwargs:
            member_display_name = kwargs['memberDisplayName']
        if member_uid is None and 'memberUid' in kwargs:
            member_uid = kwargs['memberUid']
        if modify_time is None and 'modifyTime' in kwargs:
            modify_time = kwargs['modifyTime']

        if create_time is not None:
            _setter("create_time", create_time)
        if member_desc is not None:
            _setter("member_desc", member_desc)
        if member_display_name is not None:
            _setter("member_display_name", member_display_name)
        if member_uid is not None:
            _setter("member_uid", member_uid)
        if modify_time is not None:
            _setter("modify_time", modify_time)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[int]]:
        """
        When the cloud firewall member account was added.> use second-level timestamp format.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="memberDesc")
    def member_desc(self) -> Optional[pulumi.Input[str]]:
        """
        Remarks of cloud firewall member accounts.
        """
        return pulumi.get(self, "member_desc")

    @member_desc.setter
    def member_desc(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "member_desc", value)

    @property
    @pulumi.getter(name="memberDisplayName")
    def member_display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the cloud firewall member account.
        """
        return pulumi.get(self, "member_display_name")

    @member_display_name.setter
    def member_display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "member_display_name", value)

    @property
    @pulumi.getter(name="memberUid")
    def member_uid(self) -> Optional[pulumi.Input[str]]:
        """
        The UID of the cloud firewall member account.
        """
        return pulumi.get(self, "member_uid")

    @member_uid.setter
    def member_uid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "member_uid", value)

    @property
    @pulumi.getter(name="modifyTime")
    def modify_time(self) -> Optional[pulumi.Input[int]]:
        """
        The last modification time of the cloud firewall member account.> use second-level timestamp format.
        """
        return pulumi.get(self, "modify_time")

    @modify_time.setter
    def modify_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "modify_time", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The resource attribute field that represents the resource status.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class InstanceMember(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 member_desc: Optional[pulumi.Input[str]] = None,
                 member_uid: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloud Firewall Instance Member resource.

        For information about Cloud Firewall Instance Member and how to use it, see [What is Instance Member](https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer).

        > **NOTE:** Available in v1.194.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "AliyunTerraform"
        default_account = alicloud.resourcemanager.Account("defaultAccount", display_name=name)
        default_instance_member = alicloud.cloudfirewall.InstanceMember("defaultInstanceMember",
            member_desc=name,
            member_uid=default_account.id)
        ```

        ## Import

        Cloud Firewall Instance Member can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cloudfirewall/instanceMember:InstanceMember example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] member_desc: Remarks of cloud firewall member accounts.
        :param pulumi.Input[str] member_uid: The UID of the cloud firewall member account.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceMemberArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Firewall Instance Member resource.

        For information about Cloud Firewall Instance Member and how to use it, see [What is Instance Member](https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer).

        > **NOTE:** Available in v1.194.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "AliyunTerraform"
        default_account = alicloud.resourcemanager.Account("defaultAccount", display_name=name)
        default_instance_member = alicloud.cloudfirewall.InstanceMember("defaultInstanceMember",
            member_desc=name,
            member_uid=default_account.id)
        ```

        ## Import

        Cloud Firewall Instance Member can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cloudfirewall/instanceMember:InstanceMember example <id>
        ```

        :param str resource_name: The name of the resource.
        :param InstanceMemberArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceMemberArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            InstanceMemberArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 member_desc: Optional[pulumi.Input[str]] = None,
                 member_uid: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceMemberArgs.__new__(InstanceMemberArgs)

            __props__.__dict__["member_desc"] = member_desc
            if member_uid is None and not opts.urn:
                raise TypeError("Missing required property 'member_uid'")
            __props__.__dict__["member_uid"] = member_uid
            __props__.__dict__["create_time"] = None
            __props__.__dict__["member_display_name"] = None
            __props__.__dict__["modify_time"] = None
            __props__.__dict__["status"] = None
        super(InstanceMember, __self__).__init__(
            'alicloud:cloudfirewall/instanceMember:InstanceMember',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[int]] = None,
            member_desc: Optional[pulumi.Input[str]] = None,
            member_display_name: Optional[pulumi.Input[str]] = None,
            member_uid: Optional[pulumi.Input[str]] = None,
            modify_time: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'InstanceMember':
        """
        Get an existing InstanceMember resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] create_time: When the cloud firewall member account was added.> use second-level timestamp format.
        :param pulumi.Input[str] member_desc: Remarks of cloud firewall member accounts.
        :param pulumi.Input[str] member_display_name: The name of the cloud firewall member account.
        :param pulumi.Input[str] member_uid: The UID of the cloud firewall member account.
        :param pulumi.Input[int] modify_time: The last modification time of the cloud firewall member account.> use second-level timestamp format.
        :param pulumi.Input[str] status: The resource attribute field that represents the resource status.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceMemberState.__new__(_InstanceMemberState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["member_desc"] = member_desc
        __props__.__dict__["member_display_name"] = member_display_name
        __props__.__dict__["member_uid"] = member_uid
        __props__.__dict__["modify_time"] = modify_time
        __props__.__dict__["status"] = status
        return InstanceMember(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[int]:
        """
        When the cloud firewall member account was added.> use second-level timestamp format.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="memberDesc")
    def member_desc(self) -> pulumi.Output[Optional[str]]:
        """
        Remarks of cloud firewall member accounts.
        """
        return pulumi.get(self, "member_desc")

    @property
    @pulumi.getter(name="memberDisplayName")
    def member_display_name(self) -> pulumi.Output[str]:
        """
        The name of the cloud firewall member account.
        """
        return pulumi.get(self, "member_display_name")

    @property
    @pulumi.getter(name="memberUid")
    def member_uid(self) -> pulumi.Output[str]:
        """
        The UID of the cloud firewall member account.
        """
        return pulumi.get(self, "member_uid")

    @property
    @pulumi.getter(name="modifyTime")
    def modify_time(self) -> pulumi.Output[int]:
        """
        The last modification time of the cloud firewall member account.> use second-level timestamp format.
        """
        return pulumi.get(self, "modify_time")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The resource attribute field that represents the resource status.
        """
        return pulumi.get(self, "status")

