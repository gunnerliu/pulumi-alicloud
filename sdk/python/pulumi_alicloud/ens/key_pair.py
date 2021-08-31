# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['KeyPairArgs', 'KeyPair']

@pulumi.input_type
class KeyPairArgs:
    def __init__(__self__, *,
                 key_pair_name: pulumi.Input[str],
                 version: pulumi.Input[str]):
        """
        The set of arguments for constructing a KeyPair resource.
        :param pulumi.Input[str] key_pair_name: The name of the key pair.
        :param pulumi.Input[str] version: The version number.
        """
        pulumi.set(__self__, "key_pair_name", key_pair_name)
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="keyPairName")
    def key_pair_name(self) -> pulumi.Input[str]:
        """
        The name of the key pair.
        """
        return pulumi.get(self, "key_pair_name")

    @key_pair_name.setter
    def key_pair_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_pair_name", value)

    @property
    @pulumi.getter
    def version(self) -> pulumi.Input[str]:
        """
        The version number.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: pulumi.Input[str]):
        pulumi.set(self, "version", value)


@pulumi.input_type
class _KeyPairState:
    def __init__(__self__, *,
                 key_pair_name: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering KeyPair resources.
        :param pulumi.Input[str] key_pair_name: The name of the key pair.
        :param pulumi.Input[str] version: The version number.
        """
        if key_pair_name is not None:
            pulumi.set(__self__, "key_pair_name", key_pair_name)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="keyPairName")
    def key_pair_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the key pair.
        """
        return pulumi.get(self, "key_pair_name")

    @key_pair_name.setter
    def key_pair_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_pair_name", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        The version number.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)


class KeyPair(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key_pair_name: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a ENS Key Pair resource.

        For information about ENS Key Pair and how to use it, see [What is Key Pair](https://help.aliyun.com/product/62684.html).

        > **NOTE:** Available in v1.133.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.ens.KeyPair("example",
            key_pair_name="example_value",
            version="example_value")
        ```

        ## Import

        ENS Key Pair can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ens/keyPair:KeyPair example <key_pair_name>:<version>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key_pair_name: The name of the key pair.
        :param pulumi.Input[str] version: The version number.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KeyPairArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ENS Key Pair resource.

        For information about ENS Key Pair and how to use it, see [What is Key Pair](https://help.aliyun.com/product/62684.html).

        > **NOTE:** Available in v1.133.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.ens.KeyPair("example",
            key_pair_name="example_value",
            version="example_value")
        ```

        ## Import

        ENS Key Pair can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ens/keyPair:KeyPair example <key_pair_name>:<version>
        ```

        :param str resource_name: The name of the resource.
        :param KeyPairArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KeyPairArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key_pair_name: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
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
            __props__ = KeyPairArgs.__new__(KeyPairArgs)

            if key_pair_name is None and not opts.urn:
                raise TypeError("Missing required property 'key_pair_name'")
            __props__.__dict__["key_pair_name"] = key_pair_name
            if version is None and not opts.urn:
                raise TypeError("Missing required property 'version'")
            __props__.__dict__["version"] = version
        super(KeyPair, __self__).__init__(
            'alicloud:ens/keyPair:KeyPair',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            key_pair_name: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[str]] = None) -> 'KeyPair':
        """
        Get an existing KeyPair resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key_pair_name: The name of the key pair.
        :param pulumi.Input[str] version: The version number.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KeyPairState.__new__(_KeyPairState)

        __props__.__dict__["key_pair_name"] = key_pair_name
        __props__.__dict__["version"] = version
        return KeyPair(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="keyPairName")
    def key_pair_name(self) -> pulumi.Output[str]:
        """
        The name of the key pair.
        """
        return pulumi.get(self, "key_pair_name")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        The version number.
        """
        return pulumi.get(self, "version")

