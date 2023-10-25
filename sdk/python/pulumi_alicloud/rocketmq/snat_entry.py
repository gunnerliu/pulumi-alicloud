# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SnatEntryArgs', 'SnatEntry']

@pulumi.input_type
class SnatEntryArgs:
    def __init__(__self__, *,
                 cidr_block: pulumi.Input[str],
                 sag_id: pulumi.Input[str],
                 snat_ip: pulumi.Input[str]):
        """
        The set of arguments for constructing a SnatEntry resource.
        :param pulumi.Input[str] cidr_block: The destination CIDR block.
        :param pulumi.Input[str] sag_id: The ID of the SAG instance.
        :param pulumi.Input[str] snat_ip: The public IP address.
        """
        SnatEntryArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cidr_block=cidr_block,
            sag_id=sag_id,
            snat_ip=snat_ip,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cidr_block: Optional[pulumi.Input[str]] = None,
             sag_id: Optional[pulumi.Input[str]] = None,
             snat_ip: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cidr_block is None and 'cidrBlock' in kwargs:
            cidr_block = kwargs['cidrBlock']
        if cidr_block is None:
            raise TypeError("Missing 'cidr_block' argument")
        if sag_id is None and 'sagId' in kwargs:
            sag_id = kwargs['sagId']
        if sag_id is None:
            raise TypeError("Missing 'sag_id' argument")
        if snat_ip is None and 'snatIp' in kwargs:
            snat_ip = kwargs['snatIp']
        if snat_ip is None:
            raise TypeError("Missing 'snat_ip' argument")

        _setter("cidr_block", cidr_block)
        _setter("sag_id", sag_id)
        _setter("snat_ip", snat_ip)

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> pulumi.Input[str]:
        """
        The destination CIDR block.
        """
        return pulumi.get(self, "cidr_block")

    @cidr_block.setter
    def cidr_block(self, value: pulumi.Input[str]):
        pulumi.set(self, "cidr_block", value)

    @property
    @pulumi.getter(name="sagId")
    def sag_id(self) -> pulumi.Input[str]:
        """
        The ID of the SAG instance.
        """
        return pulumi.get(self, "sag_id")

    @sag_id.setter
    def sag_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "sag_id", value)

    @property
    @pulumi.getter(name="snatIp")
    def snat_ip(self) -> pulumi.Input[str]:
        """
        The public IP address.
        """
        return pulumi.get(self, "snat_ip")

    @snat_ip.setter
    def snat_ip(self, value: pulumi.Input[str]):
        pulumi.set(self, "snat_ip", value)


@pulumi.input_type
class _SnatEntryState:
    def __init__(__self__, *,
                 cidr_block: Optional[pulumi.Input[str]] = None,
                 sag_id: Optional[pulumi.Input[str]] = None,
                 snat_ip: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SnatEntry resources.
        :param pulumi.Input[str] cidr_block: The destination CIDR block.
        :param pulumi.Input[str] sag_id: The ID of the SAG instance.
        :param pulumi.Input[str] snat_ip: The public IP address.
        """
        _SnatEntryState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cidr_block=cidr_block,
            sag_id=sag_id,
            snat_ip=snat_ip,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cidr_block: Optional[pulumi.Input[str]] = None,
             sag_id: Optional[pulumi.Input[str]] = None,
             snat_ip: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cidr_block is None and 'cidrBlock' in kwargs:
            cidr_block = kwargs['cidrBlock']
        if sag_id is None and 'sagId' in kwargs:
            sag_id = kwargs['sagId']
        if snat_ip is None and 'snatIp' in kwargs:
            snat_ip = kwargs['snatIp']

        if cidr_block is not None:
            _setter("cidr_block", cidr_block)
        if sag_id is not None:
            _setter("sag_id", sag_id)
        if snat_ip is not None:
            _setter("snat_ip", snat_ip)

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> Optional[pulumi.Input[str]]:
        """
        The destination CIDR block.
        """
        return pulumi.get(self, "cidr_block")

    @cidr_block.setter
    def cidr_block(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cidr_block", value)

    @property
    @pulumi.getter(name="sagId")
    def sag_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the SAG instance.
        """
        return pulumi.get(self, "sag_id")

    @sag_id.setter
    def sag_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sag_id", value)

    @property
    @pulumi.getter(name="snatIp")
    def snat_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The public IP address.
        """
        return pulumi.get(self, "snat_ip")

    @snat_ip.setter
    def snat_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snat_ip", value)


class SnatEntry(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidr_block: Optional[pulumi.Input[str]] = None,
                 sag_id: Optional[pulumi.Input[str]] = None,
                 snat_ip: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Sag SnatEntry resource. This topic describes how to add a SNAT entry to enable the SNAT function. The SNAT function can hide internal IP addresses and resolve private IP address conflicts. With this function, on-premises sites can access internal IP addresses, but cannot be accessed by internal IP addresses. If you do not add a SNAT entry, on-premises sites can access each other only when all related IP addresses do not conflict.

        For information about Sag SnatEntry and how to use it, see [What is Sag SnatEntry](https://www.alibabacloud.com/help/en/smart-access-gateway/latest/addsnatentry).

        > **NOTE:** Available since v1.61.0.

        > **NOTE:** Only the following regions support. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]

        ## Import

        The Sag SnatEntry can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:rocketmq/snatEntry:SnatEntry example sag-abc123456:snat-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cidr_block: The destination CIDR block.
        :param pulumi.Input[str] sag_id: The ID of the SAG instance.
        :param pulumi.Input[str] snat_ip: The public IP address.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SnatEntryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Sag SnatEntry resource. This topic describes how to add a SNAT entry to enable the SNAT function. The SNAT function can hide internal IP addresses and resolve private IP address conflicts. With this function, on-premises sites can access internal IP addresses, but cannot be accessed by internal IP addresses. If you do not add a SNAT entry, on-premises sites can access each other only when all related IP addresses do not conflict.

        For information about Sag SnatEntry and how to use it, see [What is Sag SnatEntry](https://www.alibabacloud.com/help/en/smart-access-gateway/latest/addsnatentry).

        > **NOTE:** Available since v1.61.0.

        > **NOTE:** Only the following regions support. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]

        ## Import

        The Sag SnatEntry can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:rocketmq/snatEntry:SnatEntry example sag-abc123456:snat-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param SnatEntryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SnatEntryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            SnatEntryArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidr_block: Optional[pulumi.Input[str]] = None,
                 sag_id: Optional[pulumi.Input[str]] = None,
                 snat_ip: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SnatEntryArgs.__new__(SnatEntryArgs)

            if cidr_block is None and not opts.urn:
                raise TypeError("Missing required property 'cidr_block'")
            __props__.__dict__["cidr_block"] = cidr_block
            if sag_id is None and not opts.urn:
                raise TypeError("Missing required property 'sag_id'")
            __props__.__dict__["sag_id"] = sag_id
            if snat_ip is None and not opts.urn:
                raise TypeError("Missing required property 'snat_ip'")
            __props__.__dict__["snat_ip"] = snat_ip
        super(SnatEntry, __self__).__init__(
            'alicloud:rocketmq/snatEntry:SnatEntry',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cidr_block: Optional[pulumi.Input[str]] = None,
            sag_id: Optional[pulumi.Input[str]] = None,
            snat_ip: Optional[pulumi.Input[str]] = None) -> 'SnatEntry':
        """
        Get an existing SnatEntry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cidr_block: The destination CIDR block.
        :param pulumi.Input[str] sag_id: The ID of the SAG instance.
        :param pulumi.Input[str] snat_ip: The public IP address.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SnatEntryState.__new__(_SnatEntryState)

        __props__.__dict__["cidr_block"] = cidr_block
        __props__.__dict__["sag_id"] = sag_id
        __props__.__dict__["snat_ip"] = snat_ip
        return SnatEntry(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> pulumi.Output[str]:
        """
        The destination CIDR block.
        """
        return pulumi.get(self, "cidr_block")

    @property
    @pulumi.getter(name="sagId")
    def sag_id(self) -> pulumi.Output[str]:
        """
        The ID of the SAG instance.
        """
        return pulumi.get(self, "sag_id")

    @property
    @pulumi.getter(name="snatIp")
    def snat_ip(self) -> pulumi.Output[str]:
        """
        The public IP address.
        """
        return pulumi.get(self, "snat_ip")

