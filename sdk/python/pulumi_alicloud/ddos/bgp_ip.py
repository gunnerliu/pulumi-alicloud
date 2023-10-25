# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BgpIpArgs', 'BgpIp']

@pulumi.input_type
class BgpIpArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 ip: pulumi.Input[str],
                 resource_group_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BgpIp resource.
        :param pulumi.Input[str] instance_id: The ID of the native protection enterprise instance to be operated.
        :param pulumi.Input[str] ip: The IP address.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        """
        BgpIpArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            instance_id=instance_id,
            ip=ip,
            resource_group_id=resource_group_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             instance_id: Optional[pulumi.Input[str]] = None,
             ip: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if instance_id is None and 'instanceId' in kwargs:
            instance_id = kwargs['instanceId']
        if instance_id is None:
            raise TypeError("Missing 'instance_id' argument")
        if ip is None:
            raise TypeError("Missing 'ip' argument")
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']

        _setter("instance_id", instance_id)
        _setter("ip", ip)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the native protection enterprise instance to be operated.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Input[str]:
        """
        The IP address.
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: pulumi.Input[str]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)


@pulumi.input_type
class _BgpIpState:
    def __init__(__self__, *,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BgpIp resources.
        :param pulumi.Input[str] instance_id: The ID of the native protection enterprise instance to be operated.
        :param pulumi.Input[str] ip: The IP address.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] status: The current state of the IP address. Valid Value: `normal`, `hole_begin`.
        """
        _BgpIpState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            instance_id=instance_id,
            ip=ip,
            resource_group_id=resource_group_id,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             instance_id: Optional[pulumi.Input[str]] = None,
             ip: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if instance_id is None and 'instanceId' in kwargs:
            instance_id = kwargs['instanceId']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']

        if instance_id is not None:
            _setter("instance_id", instance_id)
        if ip is not None:
            _setter("ip", ip)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the native protection enterprise instance to be operated.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address.
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The current state of the IP address. Valid Value: `normal`, `hole_begin`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class BgpIp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Ddos Bgp Ip resource.

        For information about Ddos Bgp Ip and how to use it, see [What is Ip](https://www.alibabacloud.com/help/en/ddos-protection/latest/addip).

        > **NOTE:** Available since v1.180.0.

        ## Import

        Ddos Bgp Ip can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ddos/bgpIp:BgpIp example <instance_id>:<ip>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: The ID of the native protection enterprise instance to be operated.
        :param pulumi.Input[str] ip: The IP address.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BgpIpArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Ddos Bgp Ip resource.

        For information about Ddos Bgp Ip and how to use it, see [What is Ip](https://www.alibabacloud.com/help/en/ddos-protection/latest/addip).

        > **NOTE:** Available since v1.180.0.

        ## Import

        Ddos Bgp Ip can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ddos/bgpIp:BgpIp example <instance_id>:<ip>
        ```

        :param str resource_name: The name of the resource.
        :param BgpIpArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BgpIpArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            BgpIpArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BgpIpArgs.__new__(BgpIpArgs)

            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if ip is None and not opts.urn:
                raise TypeError("Missing required property 'ip'")
            __props__.__dict__["ip"] = ip
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["status"] = None
        super(BgpIp, __self__).__init__(
            'alicloud:ddos/bgpIp:BgpIp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            ip: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'BgpIp':
        """
        Get an existing BgpIp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: The ID of the native protection enterprise instance to be operated.
        :param pulumi.Input[str] ip: The IP address.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] status: The current state of the IP address. Valid Value: `normal`, `hole_begin`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BgpIpState.__new__(_BgpIpState)

        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["ip"] = ip
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["status"] = status
        return BgpIp(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the native protection enterprise instance to be operated.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Output[str]:
        """
        The IP address.
        """
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The current state of the IP address. Valid Value: `normal`, `hole_begin`.
        """
        return pulumi.get(self, "status")

