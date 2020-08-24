# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['Gateway']


class Gateway(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[float]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enable_ipsec: Optional[pulumi.Input[bool]] = None,
                 enable_ssl: Optional[pulumi.Input[bool]] = None,
                 instance_charge_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[float]] = None,
                 ssl_connections: Optional[pulumi.Input[float]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a Gateway resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the VPN instance.
        :param pulumi.Input[bool] enable_ipsec: Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
        :param pulumi.Input[bool] enable_ssl: Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
        :param pulumi.Input[str] instance_charge_type: The charge type for instance. If it is an international site account, the valid value is PostPaid, otherwise PrePaid. 
               Default to PostPaid.
        :param pulumi.Input[str] name: The name of the VPN. Defaults to null.
        :param pulumi.Input[float] period: The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1.
        :param pulumi.Input[float] ssl_connections: The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different. 
               This field is ignored when enable_ssl is false.
        :param pulumi.Input[str] vpc_id: The VPN belongs the vpc_id, the field can't be changed.
        :param pulumi.Input[str] vswitch_id: The VPN belongs the vswitch_id, the field can't be changed.
        """
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

            if bandwidth is None:
                raise TypeError("Missing required property 'bandwidth'")
            __props__['bandwidth'] = bandwidth
            __props__['description'] = description
            __props__['enable_ipsec'] = enable_ipsec
            __props__['enable_ssl'] = enable_ssl
            __props__['instance_charge_type'] = instance_charge_type
            __props__['name'] = name
            __props__['period'] = period
            __props__['ssl_connections'] = ssl_connections
            if vpc_id is None:
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
            bandwidth: Optional[pulumi.Input[float]] = None,
            business_status: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enable_ipsec: Optional[pulumi.Input[bool]] = None,
            enable_ssl: Optional[pulumi.Input[bool]] = None,
            instance_charge_type: Optional[pulumi.Input[str]] = None,
            internet_ip: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[float]] = None,
            ssl_connections: Optional[pulumi.Input[float]] = None,
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
        :param pulumi.Input[float] period: The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1.
        :param pulumi.Input[float] ssl_connections: The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different. 
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
    def bandwidth(self) -> float:
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter(name="businessStatus")
    def business_status(self) -> str:
        """
        The business status of the VPN gateway.
        """
        return pulumi.get(self, "business_status")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        The description of the VPN instance.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="enableIpsec")
    def enable_ipsec(self) -> Optional[bool]:
        """
        Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
        """
        return pulumi.get(self, "enable_ipsec")

    @property
    @pulumi.getter(name="enableSsl")
    def enable_ssl(self) -> Optional[bool]:
        """
        Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
        """
        return pulumi.get(self, "enable_ssl")

    @property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> Optional[str]:
        """
        The charge type for instance. If it is an international site account, the valid value is PostPaid, otherwise PrePaid. 
        Default to PostPaid.
        """
        return pulumi.get(self, "instance_charge_type")

    @property
    @pulumi.getter(name="internetIp")
    def internet_ip(self) -> str:
        """
        The internet ip of the VPN.
        """
        return pulumi.get(self, "internet_ip")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the VPN. Defaults to null.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def period(self) -> Optional[float]:
        """
        The filed is only required while the InstanceChargeType is PrePaid. Valid values: [1-9, 12, 24, 36]. Default to 1.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter(name="sslConnections")
    def ssl_connections(self) -> Optional[float]:
        """
        The max connections of SSL VPN. Default to 5. The number of connections supported by each account is different. 
        This field is ignored when enable_ssl is false.
        """
        return pulumi.get(self, "ssl_connections")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the VPN gateway.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        """
        The VPN belongs the vpc_id, the field can't be changed.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> str:
        """
        The VPN belongs the vswitch_id, the field can't be changed.
        """
        return pulumi.get(self, "vswitch_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

