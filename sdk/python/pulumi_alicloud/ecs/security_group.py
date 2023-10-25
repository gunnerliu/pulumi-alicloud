# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SecurityGroupArgs', 'SecurityGroup']

@pulumi.input_type
class SecurityGroupArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 inner_access: Optional[pulumi.Input[bool]] = None,
                 inner_access_policy: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_group_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SecurityGroup resource.
        :param pulumi.Input[str] description: The security group description. Defaults to null.
        :param pulumi.Input[bool] inner_access: Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
        :param pulumi.Input[str] inner_access_policy: Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
        :param pulumi.Input[str] name: The name of the security group. Defaults to null.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the security_group belongs.
        :param pulumi.Input[str] security_group_type: The type of the security group. Valid values:
               `normal`: basic security group.
               `enterprise`: advanced security group For more information.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
               
               Combining security group rules, the policy can define multiple application scenario. Default to true. It is valid from version `1.7.2`.
        :param pulumi.Input[str] vpc_id: The VPC ID.
        """
        SecurityGroupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            inner_access=inner_access,
            inner_access_policy=inner_access_policy,
            name=name,
            resource_group_id=resource_group_id,
            security_group_type=security_group_type,
            tags=tags,
            vpc_id=vpc_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             inner_access: Optional[pulumi.Input[bool]] = None,
             inner_access_policy: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             security_group_type: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             vpc_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if inner_access is None and 'innerAccess' in kwargs:
            inner_access = kwargs['innerAccess']
        if inner_access_policy is None and 'innerAccessPolicy' in kwargs:
            inner_access_policy = kwargs['innerAccessPolicy']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if security_group_type is None and 'securityGroupType' in kwargs:
            security_group_type = kwargs['securityGroupType']
        if vpc_id is None and 'vpcId' in kwargs:
            vpc_id = kwargs['vpcId']

        if description is not None:
            _setter("description", description)
        if inner_access is not None:
            warnings.warn("""Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.""", DeprecationWarning)
            pulumi.log.warn("""inner_access is deprecated: Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.""")
        if inner_access is not None:
            _setter("inner_access", inner_access)
        if inner_access_policy is not None:
            _setter("inner_access_policy", inner_access_policy)
        if name is not None:
            _setter("name", name)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if security_group_type is not None:
            _setter("security_group_type", security_group_type)
        if tags is not None:
            _setter("tags", tags)
        if vpc_id is not None:
            _setter("vpc_id", vpc_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The security group description. Defaults to null.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="innerAccess")
    def inner_access(self) -> Optional[pulumi.Input[bool]]:
        """
        Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
        """
        warnings.warn("""Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.""", DeprecationWarning)
        pulumi.log.warn("""inner_access is deprecated: Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.""")

        return pulumi.get(self, "inner_access")

    @inner_access.setter
    def inner_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inner_access", value)

    @property
    @pulumi.getter(name="innerAccessPolicy")
    def inner_access_policy(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
        """
        return pulumi.get(self, "inner_access_policy")

    @inner_access_policy.setter
    def inner_access_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "inner_access_policy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the security group. Defaults to null.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Id of resource group which the security_group belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="securityGroupType")
    def security_group_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the security group. Valid values:
        `normal`: basic security group.
        `enterprise`: advanced security group For more information.
        """
        return pulumi.get(self, "security_group_type")

    @security_group_type.setter
    def security_group_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_group_type", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.

        Combining security group rules, the policy can define multiple application scenario. Default to true. It is valid from version `1.7.2`.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC ID.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


@pulumi.input_type
class _SecurityGroupState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 inner_access: Optional[pulumi.Input[bool]] = None,
                 inner_access_policy: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_group_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SecurityGroup resources.
        :param pulumi.Input[str] description: The security group description. Defaults to null.
        :param pulumi.Input[bool] inner_access: Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
        :param pulumi.Input[str] inner_access_policy: Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
        :param pulumi.Input[str] name: The name of the security group. Defaults to null.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the security_group belongs.
        :param pulumi.Input[str] security_group_type: The type of the security group. Valid values:
               `normal`: basic security group.
               `enterprise`: advanced security group For more information.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
               
               Combining security group rules, the policy can define multiple application scenario. Default to true. It is valid from version `1.7.2`.
        :param pulumi.Input[str] vpc_id: The VPC ID.
        """
        _SecurityGroupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            inner_access=inner_access,
            inner_access_policy=inner_access_policy,
            name=name,
            resource_group_id=resource_group_id,
            security_group_type=security_group_type,
            tags=tags,
            vpc_id=vpc_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             inner_access: Optional[pulumi.Input[bool]] = None,
             inner_access_policy: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             security_group_type: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             vpc_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if inner_access is None and 'innerAccess' in kwargs:
            inner_access = kwargs['innerAccess']
        if inner_access_policy is None and 'innerAccessPolicy' in kwargs:
            inner_access_policy = kwargs['innerAccessPolicy']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if security_group_type is None and 'securityGroupType' in kwargs:
            security_group_type = kwargs['securityGroupType']
        if vpc_id is None and 'vpcId' in kwargs:
            vpc_id = kwargs['vpcId']

        if description is not None:
            _setter("description", description)
        if inner_access is not None:
            warnings.warn("""Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.""", DeprecationWarning)
            pulumi.log.warn("""inner_access is deprecated: Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.""")
        if inner_access is not None:
            _setter("inner_access", inner_access)
        if inner_access_policy is not None:
            _setter("inner_access_policy", inner_access_policy)
        if name is not None:
            _setter("name", name)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if security_group_type is not None:
            _setter("security_group_type", security_group_type)
        if tags is not None:
            _setter("tags", tags)
        if vpc_id is not None:
            _setter("vpc_id", vpc_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The security group description. Defaults to null.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="innerAccess")
    def inner_access(self) -> Optional[pulumi.Input[bool]]:
        """
        Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
        """
        warnings.warn("""Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.""", DeprecationWarning)
        pulumi.log.warn("""inner_access is deprecated: Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.""")

        return pulumi.get(self, "inner_access")

    @inner_access.setter
    def inner_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inner_access", value)

    @property
    @pulumi.getter(name="innerAccessPolicy")
    def inner_access_policy(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
        """
        return pulumi.get(self, "inner_access_policy")

    @inner_access_policy.setter
    def inner_access_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "inner_access_policy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the security group. Defaults to null.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Id of resource group which the security_group belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="securityGroupType")
    def security_group_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the security group. Valid values:
        `normal`: basic security group.
        `enterprise`: advanced security group For more information.
        """
        return pulumi.get(self, "security_group_type")

    @security_group_type.setter
    def security_group_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_group_type", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.

        Combining security group rules, the policy can define multiple application scenario. Default to true. It is valid from version `1.7.2`.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC ID.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class SecurityGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 inner_access: Optional[pulumi.Input[bool]] = None,
                 inner_access_policy: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_group_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a security group resource.

        > **NOTE:** `ecs.SecurityGroup` is used to build and manage a security group, and `ecs.SecurityGroupRule` can define ingress or egress rules for it.

        > **NOTE:** From version 1.7.2, `ecs.SecurityGroup` has supported to segregate different ECS instance in which the same security group.

        ## Module Support

        You can use the existing security-group module
        to create a security group and add several rules one-click.

        ## Import

        Security Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/securityGroup:SecurityGroup example sg-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The security group description. Defaults to null.
        :param pulumi.Input[bool] inner_access: Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
        :param pulumi.Input[str] inner_access_policy: Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
        :param pulumi.Input[str] name: The name of the security group. Defaults to null.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the security_group belongs.
        :param pulumi.Input[str] security_group_type: The type of the security group. Valid values:
               `normal`: basic security group.
               `enterprise`: advanced security group For more information.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
               
               Combining security group rules, the policy can define multiple application scenario. Default to true. It is valid from version `1.7.2`.
        :param pulumi.Input[str] vpc_id: The VPC ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SecurityGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a security group resource.

        > **NOTE:** `ecs.SecurityGroup` is used to build and manage a security group, and `ecs.SecurityGroupRule` can define ingress or egress rules for it.

        > **NOTE:** From version 1.7.2, `ecs.SecurityGroup` has supported to segregate different ECS instance in which the same security group.

        ## Module Support

        You can use the existing security-group module
        to create a security group and add several rules one-click.

        ## Import

        Security Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/securityGroup:SecurityGroup example sg-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param SecurityGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecurityGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            SecurityGroupArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 inner_access: Optional[pulumi.Input[bool]] = None,
                 inner_access_policy: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_group_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecurityGroupArgs.__new__(SecurityGroupArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["inner_access"] = inner_access
            __props__.__dict__["inner_access_policy"] = inner_access_policy
            __props__.__dict__["name"] = name
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["security_group_type"] = security_group_type
            __props__.__dict__["tags"] = tags
            __props__.__dict__["vpc_id"] = vpc_id
        super(SecurityGroup, __self__).__init__(
            'alicloud:ecs/securityGroup:SecurityGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            inner_access: Optional[pulumi.Input[bool]] = None,
            inner_access_policy: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            security_group_type: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'SecurityGroup':
        """
        Get an existing SecurityGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The security group description. Defaults to null.
        :param pulumi.Input[bool] inner_access: Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
        :param pulumi.Input[str] inner_access_policy: Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
        :param pulumi.Input[str] name: The name of the security group. Defaults to null.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the security_group belongs.
        :param pulumi.Input[str] security_group_type: The type of the security group. Valid values:
               `normal`: basic security group.
               `enterprise`: advanced security group For more information.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
               
               Combining security group rules, the policy can define multiple application scenario. Default to true. It is valid from version `1.7.2`.
        :param pulumi.Input[str] vpc_id: The VPC ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecurityGroupState.__new__(_SecurityGroupState)

        __props__.__dict__["description"] = description
        __props__.__dict__["inner_access"] = inner_access
        __props__.__dict__["inner_access_policy"] = inner_access_policy
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["security_group_type"] = security_group_type
        __props__.__dict__["tags"] = tags
        __props__.__dict__["vpc_id"] = vpc_id
        return SecurityGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The security group description. Defaults to null.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="innerAccess")
    def inner_access(self) -> pulumi.Output[bool]:
        """
        Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
        """
        warnings.warn("""Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.""", DeprecationWarning)
        pulumi.log.warn("""inner_access is deprecated: Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.""")

        return pulumi.get(self, "inner_access")

    @property
    @pulumi.getter(name="innerAccessPolicy")
    def inner_access_policy(self) -> pulumi.Output[str]:
        """
        Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
        """
        return pulumi.get(self, "inner_access_policy")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the security group. Defaults to null.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        The Id of resource group which the security_group belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="securityGroupType")
    def security_group_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of the security group. Valid values:
        `normal`: basic security group.
        `enterprise`: advanced security group For more information.
        """
        return pulumi.get(self, "security_group_type")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.

        Combining security group rules, the policy can define multiple application scenario. Default to true. It is valid from version `1.7.2`.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[Optional[str]]:
        """
        The VPC ID.
        """
        return pulumi.get(self, "vpc_id")

