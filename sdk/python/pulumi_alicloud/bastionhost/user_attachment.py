# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['UserAttachmentArgs', 'UserAttachment']

@pulumi.input_type
class UserAttachmentArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 user_group_id: pulumi.Input[str],
                 user_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a UserAttachment resource.
        :param pulumi.Input[str] instance_id: Specifies the user group to add the user's bastion host ID of.
        :param pulumi.Input[str] user_group_id: Specifies the user group to which you want to add the user ID.
        :param pulumi.Input[str] user_id: Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "user_group_id", user_group_id)
        pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        Specifies the user group to add the user's bastion host ID of.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="userGroupId")
    def user_group_id(self) -> pulumi.Input[str]:
        """
        Specifies the user group to which you want to add the user ID.
        """
        return pulumi.get(self, "user_group_id")

    @user_group_id.setter
    def user_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_group_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[str]:
        """
        Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _UserAttachmentState:
    def __init__(__self__, *,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 user_group_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UserAttachment resources.
        :param pulumi.Input[str] instance_id: Specifies the user group to add the user's bastion host ID of.
        :param pulumi.Input[str] user_group_id: Specifies the user group to which you want to add the user ID.
        :param pulumi.Input[str] user_id: Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
        """
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if user_group_id is not None:
            pulumi.set(__self__, "user_group_id", user_group_id)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the user group to add the user's bastion host ID of.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="userGroupId")
    def user_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the user group to which you want to add the user ID.
        """
        return pulumi.get(self, "user_group_id")

    @user_group_id.setter
    def user_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_group_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class UserAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 user_group_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Bastion Host User Attachment resource to add user to one user group.

        > **NOTE:** Available since v1.134.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[0].id)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        default_instance = alicloud.bastionhost.Instance("defaultInstance",
            description=name,
            license_code="bhah_ent_50_asset",
            plan_code="cloudbastion",
            storage="5",
            bandwidth="5",
            period=1,
            vswitch_id=default_switch.id,
            security_group_ids=[default_security_group.id])
        default_user_group = alicloud.bastionhost.UserGroup("defaultUserGroup",
            instance_id=default_instance.id,
            user_group_name=name)
        local_user = alicloud.bastionhost.User("localUser",
            instance_id=default_instance.id,
            mobile_country_code="CN",
            mobile="13312345678",
            password="YourPassword-123",
            source="Local",
            user_name=f"{name}_local_user")
        default_user_attachment = alicloud.bastionhost.UserAttachment("defaultUserAttachment",
            instance_id=default_instance.id,
            user_group_id=default_user_group.user_group_id,
            user_id=local_user.user_id)
        ```

        ## Import

        Bastion Host User Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:bastionhost/userAttachment:UserAttachment example <instance_id>:<user_group_id>:<user_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: Specifies the user group to add the user's bastion host ID of.
        :param pulumi.Input[str] user_group_id: Specifies the user group to which you want to add the user ID.
        :param pulumi.Input[str] user_id: Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Bastion Host User Attachment resource to add user to one user group.

        > **NOTE:** Available since v1.134.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[0].id)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        default_instance = alicloud.bastionhost.Instance("defaultInstance",
            description=name,
            license_code="bhah_ent_50_asset",
            plan_code="cloudbastion",
            storage="5",
            bandwidth="5",
            period=1,
            vswitch_id=default_switch.id,
            security_group_ids=[default_security_group.id])
        default_user_group = alicloud.bastionhost.UserGroup("defaultUserGroup",
            instance_id=default_instance.id,
            user_group_name=name)
        local_user = alicloud.bastionhost.User("localUser",
            instance_id=default_instance.id,
            mobile_country_code="CN",
            mobile="13312345678",
            password="YourPassword-123",
            source="Local",
            user_name=f"{name}_local_user")
        default_user_attachment = alicloud.bastionhost.UserAttachment("defaultUserAttachment",
            instance_id=default_instance.id,
            user_group_id=default_user_group.user_group_id,
            user_id=local_user.user_id)
        ```

        ## Import

        Bastion Host User Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:bastionhost/userAttachment:UserAttachment example <instance_id>:<user_group_id>:<user_id>
        ```

        :param str resource_name: The name of the resource.
        :param UserAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 user_group_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserAttachmentArgs.__new__(UserAttachmentArgs)

            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if user_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_group_id'")
            __props__.__dict__["user_group_id"] = user_group_id
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
        super(UserAttachment, __self__).__init__(
            'alicloud:bastionhost/userAttachment:UserAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            user_group_id: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'UserAttachment':
        """
        Get an existing UserAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: Specifies the user group to add the user's bastion host ID of.
        :param pulumi.Input[str] user_group_id: Specifies the user group to which you want to add the user ID.
        :param pulumi.Input[str] user_id: Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserAttachmentState.__new__(_UserAttachmentState)

        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["user_group_id"] = user_group_id
        __props__.__dict__["user_id"] = user_id
        return UserAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        Specifies the user group to add the user's bastion host ID of.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="userGroupId")
    def user_group_id(self) -> pulumi.Output[str]:
        """
        Specifies the user group to which you want to add the user ID.
        """
        return pulumi.get(self, "user_group_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
        """
        return pulumi.get(self, "user_id")

