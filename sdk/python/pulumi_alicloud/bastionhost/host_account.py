# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['HostAccountArgs', 'HostAccount']

@pulumi.input_type
class HostAccountArgs:
    def __init__(__self__, *,
                 host_account_name: pulumi.Input[str],
                 host_id: pulumi.Input[str],
                 instance_id: pulumi.Input[str],
                 protocol_name: pulumi.Input[str],
                 pass_phrase: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a HostAccount resource.
        :param pulumi.Input[str] host_account_name: The name of the host account. The name can be up to 128 characters in length.
        :param pulumi.Input[str] host_id: The ID of the host for which you want to create an account.
        :param pulumi.Input[str] instance_id: The ID of the Bastionhost instance where you want to create an account for the host.
        :param pulumi.Input[str] protocol_name: The protocol used by the host account. Valid values: SSH,RDP
        :param pulumi.Input[str] pass_phrase: The passphrase of the private key for the host account. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`.
        :param pulumi.Input[str] password: The password of the host account.
        :param pulumi.Input[str] private_key: The private key of the host account. The value is a Base64-encoded string. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`
        """
        pulumi.set(__self__, "host_account_name", host_account_name)
        pulumi.set(__self__, "host_id", host_id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "protocol_name", protocol_name)
        if pass_phrase is not None:
            pulumi.set(__self__, "pass_phrase", pass_phrase)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)

    @property
    @pulumi.getter(name="hostAccountName")
    def host_account_name(self) -> pulumi.Input[str]:
        """
        The name of the host account. The name can be up to 128 characters in length.
        """
        return pulumi.get(self, "host_account_name")

    @host_account_name.setter
    def host_account_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "host_account_name", value)

    @property
    @pulumi.getter(name="hostId")
    def host_id(self) -> pulumi.Input[str]:
        """
        The ID of the host for which you want to create an account.
        """
        return pulumi.get(self, "host_id")

    @host_id.setter
    def host_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "host_id", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the Bastionhost instance where you want to create an account for the host.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="protocolName")
    def protocol_name(self) -> pulumi.Input[str]:
        """
        The protocol used by the host account. Valid values: SSH,RDP
        """
        return pulumi.get(self, "protocol_name")

    @protocol_name.setter
    def protocol_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "protocol_name", value)

    @property
    @pulumi.getter(name="passPhrase")
    def pass_phrase(self) -> Optional[pulumi.Input[str]]:
        """
        The passphrase of the private key for the host account. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`.
        """
        return pulumi.get(self, "pass_phrase")

    @pass_phrase.setter
    def pass_phrase(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pass_phrase", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password of the host account.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The private key of the host account. The value is a Base64-encoded string. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)


@pulumi.input_type
class _HostAccountState:
    def __init__(__self__, *,
                 host_account_id: Optional[pulumi.Input[str]] = None,
                 host_account_name: Optional[pulumi.Input[str]] = None,
                 host_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 pass_phrase: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 protocol_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HostAccount resources.
        :param pulumi.Input[str] host_account_id: Hosting account ID.
        :param pulumi.Input[str] host_account_name: The name of the host account. The name can be up to 128 characters in length.
        :param pulumi.Input[str] host_id: The ID of the host for which you want to create an account.
        :param pulumi.Input[str] instance_id: The ID of the Bastionhost instance where you want to create an account for the host.
        :param pulumi.Input[str] pass_phrase: The passphrase of the private key for the host account. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`.
        :param pulumi.Input[str] password: The password of the host account.
        :param pulumi.Input[str] private_key: The private key of the host account. The value is a Base64-encoded string. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`
        :param pulumi.Input[str] protocol_name: The protocol used by the host account. Valid values: SSH,RDP
        """
        if host_account_id is not None:
            pulumi.set(__self__, "host_account_id", host_account_id)
        if host_account_name is not None:
            pulumi.set(__self__, "host_account_name", host_account_name)
        if host_id is not None:
            pulumi.set(__self__, "host_id", host_id)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if pass_phrase is not None:
            pulumi.set(__self__, "pass_phrase", pass_phrase)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if protocol_name is not None:
            pulumi.set(__self__, "protocol_name", protocol_name)

    @property
    @pulumi.getter(name="hostAccountId")
    def host_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Hosting account ID.
        """
        return pulumi.get(self, "host_account_id")

    @host_account_id.setter
    def host_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_account_id", value)

    @property
    @pulumi.getter(name="hostAccountName")
    def host_account_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the host account. The name can be up to 128 characters in length.
        """
        return pulumi.get(self, "host_account_name")

    @host_account_name.setter
    def host_account_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_account_name", value)

    @property
    @pulumi.getter(name="hostId")
    def host_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the host for which you want to create an account.
        """
        return pulumi.get(self, "host_id")

    @host_id.setter
    def host_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_id", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Bastionhost instance where you want to create an account for the host.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="passPhrase")
    def pass_phrase(self) -> Optional[pulumi.Input[str]]:
        """
        The passphrase of the private key for the host account. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`.
        """
        return pulumi.get(self, "pass_phrase")

    @pass_phrase.setter
    def pass_phrase(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pass_phrase", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password of the host account.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The private key of the host account. The value is a Base64-encoded string. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter(name="protocolName")
    def protocol_name(self) -> Optional[pulumi.Input[str]]:
        """
        The protocol used by the host account. Valid values: SSH,RDP
        """
        return pulumi.get(self, "protocol_name")

    @protocol_name.setter
    def protocol_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "protocol_name", value)


class HostAccount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 host_account_name: Optional[pulumi.Input[str]] = None,
                 host_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 pass_phrase: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 protocol_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Bastion Host Host Account resource.

        For information about Bastion Host Host Account and how to use it, see [What is Host Account](https://www.alibabacloud.com/help/en/doc-detail/204377.htm).

        > **NOTE:** Available in v1.135.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.bastionhost.HostAccount("example",
            host_account_name="example_value",
            host_id="15",
            instance_id="bastionhost-cn-tl32bh0no30",
            password="YourPassword12345",
            protocol_name="SSH")
        ```

        ## Import

        Bastion Host Host Account can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:bastionhost/hostAccount:HostAccount example <instance_id>:<host_account_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] host_account_name: The name of the host account. The name can be up to 128 characters in length.
        :param pulumi.Input[str] host_id: The ID of the host for which you want to create an account.
        :param pulumi.Input[str] instance_id: The ID of the Bastionhost instance where you want to create an account for the host.
        :param pulumi.Input[str] pass_phrase: The passphrase of the private key for the host account. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`.
        :param pulumi.Input[str] password: The password of the host account.
        :param pulumi.Input[str] private_key: The private key of the host account. The value is a Base64-encoded string. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`
        :param pulumi.Input[str] protocol_name: The protocol used by the host account. Valid values: SSH,RDP
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HostAccountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Bastion Host Host Account resource.

        For information about Bastion Host Host Account and how to use it, see [What is Host Account](https://www.alibabacloud.com/help/en/doc-detail/204377.htm).

        > **NOTE:** Available in v1.135.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.bastionhost.HostAccount("example",
            host_account_name="example_value",
            host_id="15",
            instance_id="bastionhost-cn-tl32bh0no30",
            password="YourPassword12345",
            protocol_name="SSH")
        ```

        ## Import

        Bastion Host Host Account can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:bastionhost/hostAccount:HostAccount example <instance_id>:<host_account_id>
        ```

        :param str resource_name: The name of the resource.
        :param HostAccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HostAccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 host_account_name: Optional[pulumi.Input[str]] = None,
                 host_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 pass_phrase: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 protocol_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HostAccountArgs.__new__(HostAccountArgs)

            if host_account_name is None and not opts.urn:
                raise TypeError("Missing required property 'host_account_name'")
            __props__.__dict__["host_account_name"] = host_account_name
            if host_id is None and not opts.urn:
                raise TypeError("Missing required property 'host_id'")
            __props__.__dict__["host_id"] = host_id
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["pass_phrase"] = pass_phrase
            __props__.__dict__["password"] = password
            __props__.__dict__["private_key"] = private_key
            if protocol_name is None and not opts.urn:
                raise TypeError("Missing required property 'protocol_name'")
            __props__.__dict__["protocol_name"] = protocol_name
            __props__.__dict__["host_account_id"] = None
        super(HostAccount, __self__).__init__(
            'alicloud:bastionhost/hostAccount:HostAccount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            host_account_id: Optional[pulumi.Input[str]] = None,
            host_account_name: Optional[pulumi.Input[str]] = None,
            host_id: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            pass_phrase: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            protocol_name: Optional[pulumi.Input[str]] = None) -> 'HostAccount':
        """
        Get an existing HostAccount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] host_account_id: Hosting account ID.
        :param pulumi.Input[str] host_account_name: The name of the host account. The name can be up to 128 characters in length.
        :param pulumi.Input[str] host_id: The ID of the host for which you want to create an account.
        :param pulumi.Input[str] instance_id: The ID of the Bastionhost instance where you want to create an account for the host.
        :param pulumi.Input[str] pass_phrase: The passphrase of the private key for the host account. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`.
        :param pulumi.Input[str] password: The password of the host account.
        :param pulumi.Input[str] private_key: The private key of the host account. The value is a Base64-encoded string. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`
        :param pulumi.Input[str] protocol_name: The protocol used by the host account. Valid values: SSH,RDP
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HostAccountState.__new__(_HostAccountState)

        __props__.__dict__["host_account_id"] = host_account_id
        __props__.__dict__["host_account_name"] = host_account_name
        __props__.__dict__["host_id"] = host_id
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["pass_phrase"] = pass_phrase
        __props__.__dict__["password"] = password
        __props__.__dict__["private_key"] = private_key
        __props__.__dict__["protocol_name"] = protocol_name
        return HostAccount(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="hostAccountId")
    def host_account_id(self) -> pulumi.Output[str]:
        """
        Hosting account ID.
        """
        return pulumi.get(self, "host_account_id")

    @property
    @pulumi.getter(name="hostAccountName")
    def host_account_name(self) -> pulumi.Output[str]:
        """
        The name of the host account. The name can be up to 128 characters in length.
        """
        return pulumi.get(self, "host_account_name")

    @property
    @pulumi.getter(name="hostId")
    def host_id(self) -> pulumi.Output[str]:
        """
        The ID of the host for which you want to create an account.
        """
        return pulumi.get(self, "host_id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the Bastionhost instance where you want to create an account for the host.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="passPhrase")
    def pass_phrase(self) -> pulumi.Output[Optional[str]]:
        """
        The passphrase of the private key for the host account. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`.
        """
        return pulumi.get(self, "pass_phrase")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[str]]:
        """
        The password of the host account.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[Optional[str]]:
        """
        The private key of the host account. The value is a Base64-encoded string. **NOTE:** It is valid when the attribute `protocol_name` is `SSH`
        """
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter(name="protocolName")
    def protocol_name(self) -> pulumi.Output[str]:
        """
        The protocol used by the host account. Valid values: SSH,RDP
        """
        return pulumi.get(self, "protocol_name")

