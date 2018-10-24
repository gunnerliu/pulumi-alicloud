# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class Gateway(pulumi.CustomResource):
    """
    Provides a VPN gateway resource.
    
    ~> **NOTE:** Terraform will auto build vpn instance  while it uses `alicloud_vpn_gateway` to build a vpn resource.
    """
    def __init__(__self__, __name__, __opts__=None, bandwidth=None, description=None, enable_ipsec=None, enable_ssl=None, instance_charge_type=None, name=None, period=None, ssl_connections=None, vpc_id=None):
        """Create a Gateway resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, basestring):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if not bandwidth:
            raise TypeError('Missing required property bandwidth')
        elif not isinstance(bandwidth, int):
            raise TypeError('Expected property bandwidth to be a int')
        __self__.bandwidth = bandwidth
        """
        The value should be 10 or 100 if the user is postpaid, otherwise it can be 5, 10, 20, 50, 100.
        It can't be changed by terraform.
        """
        __props__['bandwidth'] = bandwidth

        if description and not isinstance(description, basestring):
            raise TypeError('Expected property description to be a basestring')
        __self__.description = description
        """
        The description of the VPN instance.
        """
        __props__['description'] = description

        if enable_ipsec and not isinstance(enable_ipsec, bool):
            raise TypeError('Expected property enable_ipsec to be a bool')
        __self__.enable_ipsec = enable_ipsec
        """
        Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
        """
        __props__['enableIpsec'] = enable_ipsec

        if enable_ssl and not isinstance(enable_ssl, bool):
            raise TypeError('Expected property enable_ssl to be a bool')
        __self__.enable_ssl = enable_ssl
        """
        Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
        """
        __props__['enableSsl'] = enable_ssl

        if instance_charge_type and not isinstance(instance_charge_type, basestring):
            raise TypeError('Expected property instance_charge_type to be a basestring')
        __self__.instance_charge_type = instance_charge_type
        """
        The charge type for instance.
        """
        __props__['instanceChargeType'] = instance_charge_type

        if name and not isinstance(name, basestring):
            raise TypeError('Expected property name to be a basestring')
        __self__.name = name
        """
        The name of the VPN. Defaults to null.
        """
        __props__['name'] = name

        if period and not isinstance(period, int):
            raise TypeError('Expected property period to be a int')
        __self__.period = period
        """
        The filed is only required while the InstanceChargeType is prepaid.
        """
        __props__['period'] = period

        if ssl_connections and not isinstance(ssl_connections, int):
            raise TypeError('Expected property ssl_connections to be a int')
        __self__.ssl_connections = ssl_connections
        """
        The max connections of SSL VPN.
        """
        __props__['sslConnections'] = ssl_connections

        if not vpc_id:
            raise TypeError('Missing required property vpc_id')
        elif not isinstance(vpc_id, basestring):
            raise TypeError('Expected property vpc_id to be a basestring')
        __self__.vpc_id = vpc_id
        """
        The VPN belongs the vpc_id, the field can't be changed.
        """
        __props__['vpcId'] = vpc_id

        __self__.business_status = pulumi.runtime.UNKNOWN
        """
        The business status of the VPN gateway.
        """
        __self__.internet_ip = pulumi.runtime.UNKNOWN
        """
        The internet ip of the VPN.
        """
        __self__.status = pulumi.runtime.UNKNOWN
        """
        The status of the VPN gateway.
        """

        super(Gateway, __self__).__init__(
            'alicloud:vpn/gateway:Gateway',
            __name__,
            __props__,
            __opts__)

    def set_outputs(self, outs):
        if 'bandwidth' in outs:
            self.bandwidth = outs['bandwidth']
        if 'businessStatus' in outs:
            self.business_status = outs['businessStatus']
        if 'description' in outs:
            self.description = outs['description']
        if 'enableIpsec' in outs:
            self.enable_ipsec = outs['enableIpsec']
        if 'enableSsl' in outs:
            self.enable_ssl = outs['enableSsl']
        if 'instanceChargeType' in outs:
            self.instance_charge_type = outs['instanceChargeType']
        if 'internetIp' in outs:
            self.internet_ip = outs['internetIp']
        if 'name' in outs:
            self.name = outs['name']
        if 'period' in outs:
            self.period = outs['period']
        if 'sslConnections' in outs:
            self.ssl_connections = outs['sslConnections']
        if 'status' in outs:
            self.status = outs['status']
        if 'vpcId' in outs:
            self.vpc_id = outs['vpcId']