# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = ['GatewayArgs', 'Gateway']

@pulumi.input_type
class GatewayArgs:
    def __init__(__self__, *,
                 bandwidth: pulumi.Input[int],
                 vpc_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 enable_ipsec: Optional[pulumi.Input[bool]] = None,
                 enable_ssl: Optional[pulumi.Input[bool]] = None,
                 instance_charge_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 ssl_connections: Optional[pulumi.Input[int]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Gateway resource.
        :param pulumi.Input[str] vpc_id: The VPN belongs the vpc_id, the field can't be changed.
        :param pulumi.Input[str] description: The description of the VPN instance.
        :param pulumi.Input[bool] enable_ipsec: Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
        :param pulumi.Input[bool] enable_ssl: Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
        :param pulumi.Input[str] instance_charge_type: The charge type for instance. If it is an international site account, the valid value is PostPaid, otherwise PrePaid. 
               Default to PostPaid.
        :param pulumi.Input[str] name: The name of the VPN. Defaults to null.
        :param pulumi.Input[int] period: The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1.
        :param pulumi.Input[int] ssl_connections: The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different. 
               This field is ignored when enable_ssl is false.
        :param pulumi.Input[str] vswitch_id: The VPN belongs the vswitch_id, the field can't be changed.
        """
        pulumi.set(__self__, "bandwidth", bandwidth)
        pulumi.set(__self__, "vpc_id", vpc_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enable_ipsec is not None:
            pulumi.set(__self__, "enable_ipsec", enable_ipsec)
        if enable_ssl is not None:
            pulumi.set(__self__, "enable_ssl", enable_ssl)
        if instance_charge_type is not None:
            pulumi.set(__self__, "instance_charge_type", instance_charge_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if period is not None:
            pulumi.set(__self__, "period", period)
        if ssl_connections is not None:
            pulumi.set(__self__, "ssl_connections", ssl_connections)
        if vswitch_id is not None:
            pulumi.set(__self__, "vswitch_id", vswitch_id)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Input[int]:
        return pulumi.get(self, "bandwidth")

    @bandwidth.setter
    def bandwidth(self, value: pulumi.Input[int]):
        pulumi.set(self, "bandwidth", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        The VPN belongs the vpc_id, the field can't be changed.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the VPN instance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="enableIpsec")
    def enable_ipsec(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
        """
        return pulumi.get(self, "enable_ipsec")

    @enable_ipsec.setter
    def enable_ipsec(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_ipsec", value)

    @property
    @pulumi.getter(name="enableSsl")
    def enable_ssl(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
        """
        return pulumi.get(self, "enable_ssl")

    @enable_ssl.setter
    def enable_ssl(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_ssl", value)

    @property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> Optional[pulumi.Input[str]]:
        """
        The charge type for instance. If it is an international site account, the valid value is PostPaid, otherwise PrePaid. 
        Default to PostPaid.
        """
        return pulumi.get(self, "instance_charge_type")

    @instance_charge_type.setter
    def instance_charge_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_charge_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the VPN. Defaults to null.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[int]]:
        """
        The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="sslConnections")
    def ssl_connections(self) -> Optional[pulumi.Input[int]]:
        """
        The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different. 
        This field is ignored when enable_ssl is false.
        """
        return pulumi.get(self, "ssl_connections")

    @ssl_connections.setter
    def ssl_connections(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ssl_connections", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VPN belongs the vswitch_id, the field can't be changed.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)


class Gateway(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enable_ipsec: Optional[pulumi.Input[bool]] = None,
                 enable_ssl: Optional[pulumi.Input[bool]] = None,
                 instance_charge_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 ssl_connections: Optional[pulumi.Input[int]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        VPN gateway can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpn/gateway:Gateway example vpn-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the VPN instance.
        :param pulumi.Input[bool] enable_ipsec: Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
        :param pulumi.Input[bool] enable_ssl: Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
        :param pulumi.Input[str] instance_charge_type: The charge type for instance. If it is an international site account, the valid value is PostPaid, otherwise PrePaid. 
               Default to PostPaid.
        :param pulumi.Input[str] name: The name of the VPN. Defaults to null.
        :param pulumi.Input[int] period: The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1.
        :param pulumi.Input[int] ssl_connections: The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different. 
               This field is ignored when enable_ssl is false.
        :param pulumi.Input[str] vpc_id: The VPN belongs the vpc_id, the field can't be changed.
        :param pulumi.Input[str] vswitch_id: The VPN belongs the vswitch_id, the field can't be changed.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GatewayArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        VPN gateway can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpn/gateway:Gateway example vpn-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param GatewayArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GatewayArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enable_ipsec: Optional[pulumi.Input[bool]] = None,
                 enable_ssl: Optional[pulumi.Input[bool]] = None,
                 instance_charge_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 ssl_connections: Optional[pulumi.Input[int]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if bandwidth is None and not opts.urn:
                raise TypeError("Missing required property 'bandwidth'")
            __props__['bandwidth'] = bandwidth
            __props__['description'] = description
            __props__['enable_ipsec'] = enable_ipsec
            __props__['enable_ssl'] = enable_ssl
            __props__['instance_charge_type'] = instance_charge_type
            __props__['name'] = name
            __props__['period'] = period
            __props__['ssl_connections'] = ssl_connections
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__['vpc_id'] = vpc_id
            __props__['vswitch_id'] = vswitch_id
            __props__['business_status'] = None
            __props__['internet_ip'] = None
            __props__['status'] = None
        super(Gateway, __self__).__init__(
            'alicloud:vpn/gateway:Gateway',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bandwidth: Optional[pulumi.Input[int]] = None,
            business_status: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enable_ipsec: Optional[pulumi.Input[bool]] = None,
            enable_ssl: Optional[pulumi.Input[bool]] = None,
            instance_charge_type: Optional[pulumi.Input[str]] = None,
            internet_ip: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[int]] = None,
            ssl_connections: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None) -> 'Gateway':
        """
        Get an existing Gateway resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] business_status: The business status of the VPN gateway.
        :param pulumi.Input[str] description: The description of the VPN instance.
        :param pulumi.Input[bool] enable_ipsec: Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
        :param pulumi.Input[bool] enable_ssl: Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
        :param pulumi.Input[str] instance_charge_type: The charge type for instance. If it is an international site account, the valid value is PostPaid, otherwise PrePaid. 
               Default to PostPaid.
        :param pulumi.Input[str] internet_ip: The internet ip of the VPN.
        :param pulumi.Input[str] name: The name of the VPN. Defaults to null.
        :param pulumi.Input[int] period: The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1.
        :param pulumi.Input[int] ssl_connections: The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different. 
               This field is ignored when enable_ssl is false.
        :param pulumi.Input[str] status: The status of the VPN gateway.
        :param pulumi.Input[str] vpc_id: The VPN belongs the vpc_id, the field can't be changed.
        :param pulumi.Input[str] vswitch_id: The VPN belongs the vswitch_id, the field can't be changed.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["bandwidth"] = bandwidth
        __props__["business_status"] = business_status
        __props__["description"] = description
        __props__["enable_ipsec"] = enable_ipsec
        __props__["enable_ssl"] = enable_ssl
        __props__["instance_charge_type"] = instance_charge_type
        __props__["internet_ip"] = internet_ip
        __props__["name"] = name
        __props__["period"] = period
        __props__["ssl_connections"] = ssl_connections
        __props__["status"] = status
        __props__["vpc_id"] = vpc_id
        __props__["vswitch_id"] = vswitch_id
        return Gateway(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Output[int]:
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter(name="businessStatus")
    def business_status(self) -> pulumi.Output[str]:
        """
        The business status of the VPN gateway.
        """
        return pulumi.get(self, "business_status")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the VPN instance.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="enableIpsec")
    def enable_ipsec(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
        """
        return pulumi.get(self, "enable_ipsec")

    @property
    @pulumi.getter(name="enableSsl")
    def enable_ssl(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
        """
        return pulumi.get(self, "enable_ssl")

    @property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> pulumi.Output[Optional[str]]:
        """
        The charge type for instance. If it is an international site account, the valid value is PostPaid, otherwise PrePaid. 
        Default to PostPaid.
        """
        return pulumi.get(self, "instance_charge_type")

    @property
    @pulumi.getter(name="internetIp")
    def internet_ip(self) -> pulumi.Output[str]:
        """
        The internet ip of the VPN.
        """
        return pulumi.get(self, "internet_ip")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the VPN. Defaults to null.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[Optional[int]]:
        """
        The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter(name="sslConnections")
    def ssl_connections(self) -> pulumi.Output[Optional[int]]:
        """
        The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different. 
        This field is ignored when enable_ssl is false.
        """
        return pulumi.get(self, "ssl_connections")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the VPN gateway.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The VPN belongs the vpc_id, the field can't be changed.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        """
        The VPN belongs the vswitch_id, the field can't be changed.
        """
        return pulumi.get(self, "vswitch_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

