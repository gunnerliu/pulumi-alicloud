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

__all__ = ['KubernetesPermissionArgs', 'KubernetesPermission']

@pulumi.input_type
class KubernetesPermissionArgs:
    def __init__(__self__, *,
                 uid: pulumi.Input[str],
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesPermissionPermissionArgs']]]] = None):
        """
        The set of arguments for constructing a KubernetesPermission resource.
        :param pulumi.Input[str] uid: The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `is_ram_role` to `true` during authorization.
        :param pulumi.Input[Sequence[pulumi.Input['KubernetesPermissionPermissionArgs']]] permissions: A list of user permission. See `permissions` below.
        """
        KubernetesPermissionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            uid=uid,
            permissions=permissions,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             uid: pulumi.Input[str],
             permissions: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesPermissionPermissionArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("uid", uid)
        if permissions is not None:
            _setter("permissions", permissions)

    @property
    @pulumi.getter
    def uid(self) -> pulumi.Input[str]:
        """
        The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `is_ram_role` to `true` during authorization.
        """
        return pulumi.get(self, "uid")

    @uid.setter
    def uid(self, value: pulumi.Input[str]):
        pulumi.set(self, "uid", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesPermissionPermissionArgs']]]]:
        """
        A list of user permission. See `permissions` below.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesPermissionPermissionArgs']]]]):
        pulumi.set(self, "permissions", value)


@pulumi.input_type
class _KubernetesPermissionState:
    def __init__(__self__, *,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesPermissionPermissionArgs']]]] = None,
                 uid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering KubernetesPermission resources.
        :param pulumi.Input[Sequence[pulumi.Input['KubernetesPermissionPermissionArgs']]] permissions: A list of user permission. See `permissions` below.
        :param pulumi.Input[str] uid: The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `is_ram_role` to `true` during authorization.
        """
        _KubernetesPermissionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            permissions=permissions,
            uid=uid,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             permissions: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesPermissionPermissionArgs']]]] = None,
             uid: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if permissions is not None:
            _setter("permissions", permissions)
        if uid is not None:
            _setter("uid", uid)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesPermissionPermissionArgs']]]]:
        """
        A list of user permission. See `permissions` below.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['KubernetesPermissionPermissionArgs']]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter
    def uid(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `is_ram_role` to `true` during authorization.
        """
        return pulumi.get(self, "uid")

    @uid.setter
    def uid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uid", value)


class KubernetesPermission(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesPermissionPermissionArgs']]]]] = None,
                 uid: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource will help you implement RBAC authorization for the kubernetes cluster, see [What is kubernetes permissions](https://www.alibabacloud.com/help/en/ack/ack-managed-and-ack-dedicated/developer-reference/api-grantpermissions).

        > **NOTE:** Please make sure that the target RAM user has been granted a RAM policy with at least read-only permission of the target cluster in the RAM console. Otherwise, the `ErrorRamPolicyConfig` error will be returned.
        For more information about how to authorize a RAM user by attaching RAM policies, see [Create a custom RAM policy](https://www.alibabacloud.com/help/doc-detail/86485.htm).

        > **NOTE:** If you call this operation as a RAM user, make sure that this RAM user has the permissions to grant other RAM users the permissions to manage ACK clusters. Otherwise, the `StatusForbidden` or `ForbiddenGrantPermissions` errors will be returned. For more information, see [Use a RAM user to grant RBAC permissions to other RAM users](https://www.alibabacloud.com/help/faq-detail/119035.htm).

        > **NOTE:** This operation overwrites the permissions that have been granted to the specified RAM user. When you call this operation, make sure that the required permissions are included.

        > **NOTE:** Available since v1.122.0.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesPermissionPermissionArgs']]]] permissions: A list of user permission. See `permissions` below.
        :param pulumi.Input[str] uid: The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `is_ram_role` to `true` during authorization.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KubernetesPermissionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource will help you implement RBAC authorization for the kubernetes cluster, see [What is kubernetes permissions](https://www.alibabacloud.com/help/en/ack/ack-managed-and-ack-dedicated/developer-reference/api-grantpermissions).

        > **NOTE:** Please make sure that the target RAM user has been granted a RAM policy with at least read-only permission of the target cluster in the RAM console. Otherwise, the `ErrorRamPolicyConfig` error will be returned.
        For more information about how to authorize a RAM user by attaching RAM policies, see [Create a custom RAM policy](https://www.alibabacloud.com/help/doc-detail/86485.htm).

        > **NOTE:** If you call this operation as a RAM user, make sure that this RAM user has the permissions to grant other RAM users the permissions to manage ACK clusters. Otherwise, the `StatusForbidden` or `ForbiddenGrantPermissions` errors will be returned. For more information, see [Use a RAM user to grant RBAC permissions to other RAM users](https://www.alibabacloud.com/help/faq-detail/119035.htm).

        > **NOTE:** This operation overwrites the permissions that have been granted to the specified RAM user. When you call this operation, make sure that the required permissions are included.

        > **NOTE:** Available since v1.122.0.

        :param str resource_name: The name of the resource.
        :param KubernetesPermissionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KubernetesPermissionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            KubernetesPermissionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesPermissionPermissionArgs']]]]] = None,
                 uid: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KubernetesPermissionArgs.__new__(KubernetesPermissionArgs)

            __props__.__dict__["permissions"] = permissions
            if uid is None and not opts.urn:
                raise TypeError("Missing required property 'uid'")
            __props__.__dict__["uid"] = uid
        super(KubernetesPermission, __self__).__init__(
            'alicloud:cs/kubernetesPermission:KubernetesPermission',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesPermissionPermissionArgs']]]]] = None,
            uid: Optional[pulumi.Input[str]] = None) -> 'KubernetesPermission':
        """
        Get an existing KubernetesPermission resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['KubernetesPermissionPermissionArgs']]]] permissions: A list of user permission. See `permissions` below.
        :param pulumi.Input[str] uid: The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `is_ram_role` to `true` during authorization.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KubernetesPermissionState.__new__(_KubernetesPermissionState)

        __props__.__dict__["permissions"] = permissions
        __props__.__dict__["uid"] = uid
        return KubernetesPermission(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Optional[Sequence['outputs.KubernetesPermissionPermission']]]:
        """
        A list of user permission. See `permissions` below.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter
    def uid(self) -> pulumi.Output[str]:
        """
        The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `is_ram_role` to `true` during authorization.
        """
        return pulumi.get(self, "uid")

