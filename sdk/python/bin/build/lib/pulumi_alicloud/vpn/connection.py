# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class Connection(pulumi.CustomResource):
    """
    Provides a VPN connection resource.
    
    ~> **NOTE:** Terraform will auto build vpn connection while it uses `alicloud_vpn_connection` to build a vpn connection resource.
                 The vpn connection depends on VPN and VPN customer gateway.
    """
    def __init__(__self__, __name__, __opts__=None, customer_gateway_id=None, effect_immediately=None, ike_configs=None, ipsec_configs=None, local_subnets=None, name=None, remote_subnets=None, vpn_gateway_id=None):
        """Create a Connection resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, basestring):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if not customer_gateway_id:
            raise TypeError('Missing required property customer_gateway_id')
        elif not isinstance(customer_gateway_id, basestring):
            raise TypeError('Expected property customer_gateway_id to be a basestring')
        __self__.customer_gateway_id = customer_gateway_id
        """
        The ID of the customer gateway.
        """
        __props__['customerGatewayId'] = customer_gateway_id

        if effect_immediately and not isinstance(effect_immediately, bool):
            raise TypeError('Expected property effect_immediately to be a bool')
        __self__.effect_immediately = effect_immediately
        """
        Whether to delete a successfully negotiated IPsec tunnel and initiate a negotiation again. Valid value:true,false.
        """
        __props__['effectImmediately'] = effect_immediately

        if ike_configs and not isinstance(ike_configs, list):
            raise TypeError('Expected property ike_configs to be a list')
        __self__.ike_configs = ike_configs
        """
        The configurations of phase-one negotiation.
        """
        __props__['ikeConfigs'] = ike_configs

        if ipsec_configs and not isinstance(ipsec_configs, list):
            raise TypeError('Expected property ipsec_configs to be a list')
        __self__.ipsec_configs = ipsec_configs
        """
        The configurations of phase-two negotiation.
        """
        __props__['ipsecConfigs'] = ipsec_configs

        if not local_subnets:
            raise TypeError('Missing required property local_subnets')
        elif not isinstance(local_subnets, list):
            raise TypeError('Expected property local_subnets to be a list')
        __self__.local_subnets = local_subnets
        """
        The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
        """
        __props__['localSubnets'] = local_subnets

        if name and not isinstance(name, basestring):
            raise TypeError('Expected property name to be a basestring')
        __self__.name = name
        """
        The name of the IPsec connection.
        """
        __props__['name'] = name

        if not remote_subnets:
            raise TypeError('Missing required property remote_subnets')
        elif not isinstance(remote_subnets, list):
            raise TypeError('Expected property remote_subnets to be a list')
        __self__.remote_subnets = remote_subnets
        """
        The CIDR block of the local data center. This parameter is used for phase-two negotiation.
        """
        __props__['remoteSubnets'] = remote_subnets

        if not vpn_gateway_id:
            raise TypeError('Missing required property vpn_gateway_id')
        elif not isinstance(vpn_gateway_id, basestring):
            raise TypeError('Expected property vpn_gateway_id to be a basestring')
        __self__.vpn_gateway_id = vpn_gateway_id
        """
        The ID of the VPN gateway.
        """
        __props__['vpnGatewayId'] = vpn_gateway_id

        __self__.status = pulumi.runtime.UNKNOWN
        """
        The status of VPN connection.
        """

        super(Connection, __self__).__init__(
            'alicloud:vpn/connection:Connection',
            __name__,
            __props__,
            __opts__)

    def set_outputs(self, outs):
        if 'customerGatewayId' in outs:
            self.customer_gateway_id = outs['customerGatewayId']
        if 'effectImmediately' in outs:
            self.effect_immediately = outs['effectImmediately']
        if 'ikeConfigs' in outs:
            self.ike_configs = outs['ikeConfigs']
        if 'ipsecConfigs' in outs:
            self.ipsec_configs = outs['ipsecConfigs']
        if 'localSubnets' in outs:
            self.local_subnets = outs['localSubnets']
        if 'name' in outs:
            self.name = outs['name']
        if 'remoteSubnets' in outs:
            self.remote_subnets = outs['remoteSubnets']
        if 'status' in outs:
            self.status = outs['status']
        if 'vpnGatewayId' in outs:
            self.vpn_gateway_id = outs['vpnGatewayId']