# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['KeyVersionArgs', 'KeyVersion']

@pulumi.input_type
class KeyVersionArgs:
    def __init__(__self__, *,
                 key_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a KeyVersion resource.
        :param pulumi.Input[str] key_id: The id of the master key (CMK).
               
               > **NOTE:** The minimum interval for creating a Alikms key version is 7 days.
        """
        KeyVersionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key_id=key_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if key_id is None and 'keyId' in kwargs:
            key_id = kwargs['keyId']
        if key_id is None:
            raise TypeError("Missing 'key_id' argument")

        _setter("key_id", key_id)

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> pulumi.Input[str]:
        """
        The id of the master key (CMK).

        > **NOTE:** The minimum interval for creating a Alikms key version is 7 days.
        """
        return pulumi.get(self, "key_id")

    @key_id.setter
    def key_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_id", value)


@pulumi.input_type
class _KeyVersionState:
    def __init__(__self__, *,
                 key_id: Optional[pulumi.Input[str]] = None,
                 key_version_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering KeyVersion resources.
        :param pulumi.Input[str] key_id: The id of the master key (CMK).
               
               > **NOTE:** The minimum interval for creating a Alikms key version is 7 days.
        :param pulumi.Input[str] key_version_id: The id of the Alikms key version.
        """
        _KeyVersionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key_id=key_id,
            key_version_id=key_version_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key_id: Optional[pulumi.Input[str]] = None,
             key_version_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if key_id is None and 'keyId' in kwargs:
            key_id = kwargs['keyId']
        if key_version_id is None and 'keyVersionId' in kwargs:
            key_version_id = kwargs['keyVersionId']

        if key_id is not None:
            _setter("key_id", key_id)
        if key_version_id is not None:
            _setter("key_version_id", key_version_id)

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the master key (CMK).

        > **NOTE:** The minimum interval for creating a Alikms key version is 7 days.
        """
        return pulumi.get(self, "key_id")

    @key_id.setter
    def key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_id", value)

    @property
    @pulumi.getter(name="keyVersionId")
    def key_version_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the Alikms key version.
        """
        return pulumi.get(self, "key_version_id")

    @key_version_id.setter
    def key_version_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_version_id", value)


class KeyVersion(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Alikms Key Version resource. For information about Alikms Key Version and how to use it, see [What is Resource Alikms Key Version](https://www.alibabacloud.com/help/doc-detail/133838.htm).

        > **NOTE:** Available in v1.85.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        this = alicloud.kms.Key("this")
        keyversion = alicloud.kms.KeyVersion("keyversion", key_id=this.id)
        ```

        ## Import

        Alikms key version can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:kms/keyVersion:KeyVersion example 72da539a-2fa8-4f2d-b854-*****	
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key_id: The id of the master key (CMK).
               
               > **NOTE:** The minimum interval for creating a Alikms key version is 7 days.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KeyVersionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Alikms Key Version resource. For information about Alikms Key Version and how to use it, see [What is Resource Alikms Key Version](https://www.alibabacloud.com/help/doc-detail/133838.htm).

        > **NOTE:** Available in v1.85.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        this = alicloud.kms.Key("this")
        keyversion = alicloud.kms.KeyVersion("keyversion", key_id=this.id)
        ```

        ## Import

        Alikms key version can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:kms/keyVersion:KeyVersion example 72da539a-2fa8-4f2d-b854-*****	
        ```

        :param str resource_name: The name of the resource.
        :param KeyVersionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KeyVersionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            KeyVersionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KeyVersionArgs.__new__(KeyVersionArgs)

            if key_id is None and not opts.urn:
                raise TypeError("Missing required property 'key_id'")
            __props__.__dict__["key_id"] = key_id
            __props__.__dict__["key_version_id"] = None
        super(KeyVersion, __self__).__init__(
            'alicloud:kms/keyVersion:KeyVersion',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            key_id: Optional[pulumi.Input[str]] = None,
            key_version_id: Optional[pulumi.Input[str]] = None) -> 'KeyVersion':
        """
        Get an existing KeyVersion resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key_id: The id of the master key (CMK).
               
               > **NOTE:** The minimum interval for creating a Alikms key version is 7 days.
        :param pulumi.Input[str] key_version_id: The id of the Alikms key version.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KeyVersionState.__new__(_KeyVersionState)

        __props__.__dict__["key_id"] = key_id
        __props__.__dict__["key_version_id"] = key_version_id
        return KeyVersion(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> pulumi.Output[str]:
        """
        The id of the master key (CMK).

        > **NOTE:** The minimum interval for creating a Alikms key version is 7 days.
        """
        return pulumi.get(self, "key_id")

    @property
    @pulumi.getter(name="keyVersionId")
    def key_version_id(self) -> pulumi.Output[str]:
        """
        The id of the Alikms key version.
        """
        return pulumi.get(self, "key_version_id")

