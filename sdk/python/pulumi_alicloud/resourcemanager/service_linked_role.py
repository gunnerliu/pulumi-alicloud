# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ServiceLinkedRoleArgs', 'ServiceLinkedRole']

@pulumi.input_type
class ServiceLinkedRoleArgs:
    def __init__(__self__, *,
                 service_name: pulumi.Input[str],
                 custom_suffix: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ServiceLinkedRole resource.
        :param pulumi.Input[str] service_name: The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
        :param pulumi.Input[str] custom_suffix: The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
        :param pulumi.Input[str] description: The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
        """
        ServiceLinkedRoleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            service_name=service_name,
            custom_suffix=custom_suffix,
            description=description,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             service_name: Optional[pulumi.Input[str]] = None,
             custom_suffix: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if service_name is None and 'serviceName' in kwargs:
            service_name = kwargs['serviceName']
        if service_name is None:
            raise TypeError("Missing 'service_name' argument")
        if custom_suffix is None and 'customSuffix' in kwargs:
            custom_suffix = kwargs['customSuffix']

        _setter("service_name", service_name)
        if custom_suffix is not None:
            _setter("custom_suffix", custom_suffix)
        if description is not None:
            _setter("description", description)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[str]:
        """
        The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter(name="customSuffix")
    def custom_suffix(self) -> Optional[pulumi.Input[str]]:
        """
        The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
        """
        return pulumi.get(self, "custom_suffix")

    @custom_suffix.setter
    def custom_suffix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_suffix", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _ServiceLinkedRoleState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 custom_suffix: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 role_id: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceLinkedRole resources.
        :param pulumi.Input[str] arn: The Alibaba Cloud Resource Name (ARN) of the role.
        :param pulumi.Input[str] custom_suffix: The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
        :param pulumi.Input[str] description: The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
        :param pulumi.Input[str] role_id: The ID of the role.
        :param pulumi.Input[str] role_name: The name of the role.
        :param pulumi.Input[str] service_name: The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
        """
        _ServiceLinkedRoleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            arn=arn,
            custom_suffix=custom_suffix,
            description=description,
            role_id=role_id,
            role_name=role_name,
            service_name=service_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             arn: Optional[pulumi.Input[str]] = None,
             custom_suffix: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             role_id: Optional[pulumi.Input[str]] = None,
             role_name: Optional[pulumi.Input[str]] = None,
             service_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if custom_suffix is None and 'customSuffix' in kwargs:
            custom_suffix = kwargs['customSuffix']
        if role_id is None and 'roleId' in kwargs:
            role_id = kwargs['roleId']
        if role_name is None and 'roleName' in kwargs:
            role_name = kwargs['roleName']
        if service_name is None and 'serviceName' in kwargs:
            service_name = kwargs['serviceName']

        if arn is not None:
            _setter("arn", arn)
        if custom_suffix is not None:
            _setter("custom_suffix", custom_suffix)
        if description is not None:
            _setter("description", description)
        if role_id is not None:
            _setter("role_id", role_id)
        if role_name is not None:
            _setter("role_name", role_name)
        if service_name is not None:
            _setter("service_name", service_name)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Alibaba Cloud Resource Name (ARN) of the role.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="customSuffix")
    def custom_suffix(self) -> Optional[pulumi.Input[str]]:
        """
        The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
        """
        return pulumi.get(self, "custom_suffix")

    @custom_suffix.setter
    def custom_suffix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_suffix", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the role.
        """
        return pulumi.get(self, "role_id")

    @role_id.setter
    def role_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_id", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the role.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_name", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[str]]:
        """
        The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_name", value)


class ServiceLinkedRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_suffix: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Resource Manager Service Linked Role.

        For information about Resource Manager Service Linked Role and how to use it, see [What is Service Linked Role.](https://www.alibabacloud.com/help/en/doc-detail/171226.htm).

        > **NOTE:** Available since v1.157.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.resourcemanager.ServiceLinkedRole("default", service_name="ops.elasticsearch.aliyuncs.com")
        ```

        ## Import

        Resource Manager Service Linked Role can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:resourcemanager/serviceLinkedRole:ServiceLinkedRole default <service_name>:<role_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] custom_suffix: The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
        :param pulumi.Input[str] description: The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
        :param pulumi.Input[str] service_name: The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceLinkedRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Resource Manager Service Linked Role.

        For information about Resource Manager Service Linked Role and how to use it, see [What is Service Linked Role.](https://www.alibabacloud.com/help/en/doc-detail/171226.htm).

        > **NOTE:** Available since v1.157.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.resourcemanager.ServiceLinkedRole("default", service_name="ops.elasticsearch.aliyuncs.com")
        ```

        ## Import

        Resource Manager Service Linked Role can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:resourcemanager/serviceLinkedRole:ServiceLinkedRole default <service_name>:<role_name>
        ```

        :param str resource_name: The name of the resource.
        :param ServiceLinkedRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceLinkedRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ServiceLinkedRoleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_suffix: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceLinkedRoleArgs.__new__(ServiceLinkedRoleArgs)

            __props__.__dict__["custom_suffix"] = custom_suffix
            __props__.__dict__["description"] = description
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            __props__.__dict__["arn"] = None
            __props__.__dict__["role_id"] = None
            __props__.__dict__["role_name"] = None
        super(ServiceLinkedRole, __self__).__init__(
            'alicloud:resourcemanager/serviceLinkedRole:ServiceLinkedRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            custom_suffix: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            role_id: Optional[pulumi.Input[str]] = None,
            role_name: Optional[pulumi.Input[str]] = None,
            service_name: Optional[pulumi.Input[str]] = None) -> 'ServiceLinkedRole':
        """
        Get an existing ServiceLinkedRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Alibaba Cloud Resource Name (ARN) of the role.
        :param pulumi.Input[str] custom_suffix: The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
        :param pulumi.Input[str] description: The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
        :param pulumi.Input[str] role_id: The ID of the role.
        :param pulumi.Input[str] role_name: The name of the role.
        :param pulumi.Input[str] service_name: The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceLinkedRoleState.__new__(_ServiceLinkedRoleState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["custom_suffix"] = custom_suffix
        __props__.__dict__["description"] = description
        __props__.__dict__["role_id"] = role_id
        __props__.__dict__["role_name"] = role_name
        __props__.__dict__["service_name"] = service_name
        return ServiceLinkedRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Alibaba Cloud Resource Name (ARN) of the role.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="customSuffix")
    def custom_suffix(self) -> pulumi.Output[Optional[str]]:
        """
        The suffix of the role name. Only a few service linked roles support custom suffixes. The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-). For example, if the suffix is Example, the role name is ServiceLinkedRoleName_Example.
        """
        return pulumi.get(self, "custom_suffix")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the service linked role.  This parameter must be specified for only the service linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified. The description must be 1 to 1,024 characters in length.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> pulumi.Output[str]:
        """
        The ID of the role.
        """
        return pulumi.get(self, "role_id")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Output[str]:
        """
        The name of the role.
        """
        return pulumi.get(self, "role_name")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[str]:
        """
        The service name. For more information about the service name, see [Cloud services that support service linked roles](https://www.alibabacloud.com/help/en/doc-detail/160674.htm)
        """
        return pulumi.get(self, "service_name")

