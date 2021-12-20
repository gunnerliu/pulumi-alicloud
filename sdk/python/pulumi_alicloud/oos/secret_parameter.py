# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SecretParameterArgs', 'SecretParameter']

@pulumi.input_type
class SecretParameterArgs:
    def __init__(__self__, *,
                 secret_parameter_name: pulumi.Input[str],
                 value: pulumi.Input[str],
                 constraints: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 key_id: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SecretParameter resource.
        :param pulumi.Input[str] secret_parameter_name: The name of the encryption parameter.  The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
        :param pulumi.Input[str] value: The value of the encryption parameter. The value must be `1` to `4096` characters in length.
        :param pulumi.Input[str] constraints: The constraints of the encryption parameter. By default, this parameter is null. Valid values:
               * `AllowedValues`: The value that is allowed for the encryption parameter. It must be an array string.
               * `AllowedPattern`: The pattern that is allowed for the encryption parameter. It must be a regular expression.
               * `MinLength`: The minimum length of the encryption parameter.
               * `MaxLength`: The maximum length of the encryption parameter.
        :param pulumi.Input[str] description: The description of the encryption parameter. The description must be `1` to `200` characters in length.
        :param pulumi.Input[str] key_id: The Customer Master Key (CMK) of Key Management Service (KMS) that is used to encrypt the parameter.
        :param pulumi.Input[str] resource_group_id: The ID of the Resource Group.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] type: The data type of the encryption parameter. Valid values: `Secret`.
        """
        pulumi.set(__self__, "secret_parameter_name", secret_parameter_name)
        pulumi.set(__self__, "value", value)
        if constraints is not None:
            pulumi.set(__self__, "constraints", constraints)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if key_id is not None:
            pulumi.set(__self__, "key_id", key_id)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="secretParameterName")
    def secret_parameter_name(self) -> pulumi.Input[str]:
        """
        The name of the encryption parameter.  The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
        """
        return pulumi.get(self, "secret_parameter_name")

    @secret_parameter_name.setter
    def secret_parameter_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "secret_parameter_name", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        The value of the encryption parameter. The value must be `1` to `4096` characters in length.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter
    def constraints(self) -> Optional[pulumi.Input[str]]:
        """
        The constraints of the encryption parameter. By default, this parameter is null. Valid values:
        * `AllowedValues`: The value that is allowed for the encryption parameter. It must be an array string.
        * `AllowedPattern`: The pattern that is allowed for the encryption parameter. It must be a regular expression.
        * `MinLength`: The minimum length of the encryption parameter.
        * `MaxLength`: The maximum length of the encryption parameter.
        """
        return pulumi.get(self, "constraints")

    @constraints.setter
    def constraints(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "constraints", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the encryption parameter. The description must be `1` to `200` characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Customer Master Key (CMK) of Key Management Service (KMS) that is used to encrypt the parameter.
        """
        return pulumi.get(self, "key_id")

    @key_id.setter
    def key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_id", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Resource Group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The data type of the encryption parameter. Valid values: `Secret`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _SecretParameterState:
    def __init__(__self__, *,
                 constraints: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 key_id: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 secret_parameter_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SecretParameter resources.
        :param pulumi.Input[str] constraints: The constraints of the encryption parameter. By default, this parameter is null. Valid values:
               * `AllowedValues`: The value that is allowed for the encryption parameter. It must be an array string.
               * `AllowedPattern`: The pattern that is allowed for the encryption parameter. It must be a regular expression.
               * `MinLength`: The minimum length of the encryption parameter.
               * `MaxLength`: The maximum length of the encryption parameter.
        :param pulumi.Input[str] description: The description of the encryption parameter. The description must be `1` to `200` characters in length.
        :param pulumi.Input[str] key_id: The Customer Master Key (CMK) of Key Management Service (KMS) that is used to encrypt the parameter.
        :param pulumi.Input[str] resource_group_id: The ID of the Resource Group.
        :param pulumi.Input[str] secret_parameter_name: The name of the encryption parameter.  The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] type: The data type of the encryption parameter. Valid values: `Secret`.
        :param pulumi.Input[str] value: The value of the encryption parameter. The value must be `1` to `4096` characters in length.
        """
        if constraints is not None:
            pulumi.set(__self__, "constraints", constraints)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if key_id is not None:
            pulumi.set(__self__, "key_id", key_id)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if secret_parameter_name is not None:
            pulumi.set(__self__, "secret_parameter_name", secret_parameter_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def constraints(self) -> Optional[pulumi.Input[str]]:
        """
        The constraints of the encryption parameter. By default, this parameter is null. Valid values:
        * `AllowedValues`: The value that is allowed for the encryption parameter. It must be an array string.
        * `AllowedPattern`: The pattern that is allowed for the encryption parameter. It must be a regular expression.
        * `MinLength`: The minimum length of the encryption parameter.
        * `MaxLength`: The maximum length of the encryption parameter.
        """
        return pulumi.get(self, "constraints")

    @constraints.setter
    def constraints(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "constraints", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the encryption parameter. The description must be `1` to `200` characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Customer Master Key (CMK) of Key Management Service (KMS) that is used to encrypt the parameter.
        """
        return pulumi.get(self, "key_id")

    @key_id.setter
    def key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_id", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Resource Group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="secretParameterName")
    def secret_parameter_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the encryption parameter.  The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
        """
        return pulumi.get(self, "secret_parameter_name")

    @secret_parameter_name.setter
    def secret_parameter_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_parameter_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The data type of the encryption parameter. Valid values: `Secret`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        The value of the encryption parameter. The value must be `1` to `4096` characters in length.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


class SecretParameter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 constraints: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 key_id: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 secret_parameter_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a OOS Secret Parameter resource.

        For information about OOS Secret Parameter and how to use it, see [What is Secret Parameter](https://www.alibabacloud.com/help/en/doc-detail/183418.html).

        > **NOTE:** Available in v1.147.0+.

        ## Import

        OOS Secret Parameter can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:oos/secretParameter:SecretParameter example <secret_parameter_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] constraints: The constraints of the encryption parameter. By default, this parameter is null. Valid values:
               * `AllowedValues`: The value that is allowed for the encryption parameter. It must be an array string.
               * `AllowedPattern`: The pattern that is allowed for the encryption parameter. It must be a regular expression.
               * `MinLength`: The minimum length of the encryption parameter.
               * `MaxLength`: The maximum length of the encryption parameter.
        :param pulumi.Input[str] description: The description of the encryption parameter. The description must be `1` to `200` characters in length.
        :param pulumi.Input[str] key_id: The Customer Master Key (CMK) of Key Management Service (KMS) that is used to encrypt the parameter.
        :param pulumi.Input[str] resource_group_id: The ID of the Resource Group.
        :param pulumi.Input[str] secret_parameter_name: The name of the encryption parameter.  The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] type: The data type of the encryption parameter. Valid values: `Secret`.
        :param pulumi.Input[str] value: The value of the encryption parameter. The value must be `1` to `4096` characters in length.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecretParameterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a OOS Secret Parameter resource.

        For information about OOS Secret Parameter and how to use it, see [What is Secret Parameter](https://www.alibabacloud.com/help/en/doc-detail/183418.html).

        > **NOTE:** Available in v1.147.0+.

        ## Import

        OOS Secret Parameter can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:oos/secretParameter:SecretParameter example <secret_parameter_name>
        ```

        :param str resource_name: The name of the resource.
        :param SecretParameterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecretParameterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 constraints: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 key_id: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 secret_parameter_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecretParameterArgs.__new__(SecretParameterArgs)

            __props__.__dict__["constraints"] = constraints
            __props__.__dict__["description"] = description
            __props__.__dict__["key_id"] = key_id
            __props__.__dict__["resource_group_id"] = resource_group_id
            if secret_parameter_name is None and not opts.urn:
                raise TypeError("Missing required property 'secret_parameter_name'")
            __props__.__dict__["secret_parameter_name"] = secret_parameter_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["type"] = type
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
        super(SecretParameter, __self__).__init__(
            'alicloud:oos/secretParameter:SecretParameter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            constraints: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            key_id: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            secret_parameter_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            value: Optional[pulumi.Input[str]] = None) -> 'SecretParameter':
        """
        Get an existing SecretParameter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] constraints: The constraints of the encryption parameter. By default, this parameter is null. Valid values:
               * `AllowedValues`: The value that is allowed for the encryption parameter. It must be an array string.
               * `AllowedPattern`: The pattern that is allowed for the encryption parameter. It must be a regular expression.
               * `MinLength`: The minimum length of the encryption parameter.
               * `MaxLength`: The maximum length of the encryption parameter.
        :param pulumi.Input[str] description: The description of the encryption parameter. The description must be `1` to `200` characters in length.
        :param pulumi.Input[str] key_id: The Customer Master Key (CMK) of Key Management Service (KMS) that is used to encrypt the parameter.
        :param pulumi.Input[str] resource_group_id: The ID of the Resource Group.
        :param pulumi.Input[str] secret_parameter_name: The name of the encryption parameter.  The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] type: The data type of the encryption parameter. Valid values: `Secret`.
        :param pulumi.Input[str] value: The value of the encryption parameter. The value must be `1` to `4096` characters in length.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecretParameterState.__new__(_SecretParameterState)

        __props__.__dict__["constraints"] = constraints
        __props__.__dict__["description"] = description
        __props__.__dict__["key_id"] = key_id
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["secret_parameter_name"] = secret_parameter_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["type"] = type
        __props__.__dict__["value"] = value
        return SecretParameter(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def constraints(self) -> pulumi.Output[Optional[str]]:
        """
        The constraints of the encryption parameter. By default, this parameter is null. Valid values:
        * `AllowedValues`: The value that is allowed for the encryption parameter. It must be an array string.
        * `AllowedPattern`: The pattern that is allowed for the encryption parameter. It must be a regular expression.
        * `MinLength`: The minimum length of the encryption parameter.
        * `MaxLength`: The maximum length of the encryption parameter.
        """
        return pulumi.get(self, "constraints")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the encryption parameter. The description must be `1` to `200` characters in length.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> pulumi.Output[Optional[str]]:
        """
        The Customer Master Key (CMK) of Key Management Service (KMS) that is used to encrypt the parameter.
        """
        return pulumi.get(self, "key_id")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the Resource Group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="secretParameterName")
    def secret_parameter_name(self) -> pulumi.Output[str]:
        """
        The name of the encryption parameter.  The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
        """
        return pulumi.get(self, "secret_parameter_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The data type of the encryption parameter. Valid values: `Secret`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        The value of the encryption parameter. The value must be `1` to `4096` characters in length.
        """
        return pulumi.get(self, "value")

