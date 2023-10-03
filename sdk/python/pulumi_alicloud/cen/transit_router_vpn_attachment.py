# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TransitRouterVpnAttachmentArgs', 'TransitRouterVpnAttachment']

@pulumi.input_type
class TransitRouterVpnAttachmentArgs:
    def __init__(__self__, *,
                 transit_router_id: pulumi.Input[str],
                 vpn_id: pulumi.Input[str],
                 zones: pulumi.Input[Sequence[pulumi.Input['TransitRouterVpnAttachmentZoneArgs']]],
                 auto_publish_route_enabled: Optional[pulumi.Input[bool]] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_attachment_description: Optional[pulumi.Input[str]] = None,
                 transit_router_attachment_name: Optional[pulumi.Input[str]] = None,
                 vpn_owner_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TransitRouterVpnAttachment resource.
        :param pulumi.Input[str] transit_router_id: The ID of the forwarding router instance.
        :param pulumi.Input[str] vpn_id: The id of the vpn.
        :param pulumi.Input[Sequence[pulumi.Input['TransitRouterVpnAttachmentZoneArgs']]] zones: The list of zone mapping. See `zone` below.
        :param pulumi.Input[bool] auto_publish_route_enabled: Whether to allow the forwarding router instance to automatically publish routing entries to IPsec connections.
        :param pulumi.Input[str] cen_id: The id of the cen.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] transit_router_attachment_description: The description of the VPN connection. The description can contain `2` to `256` characters. The description must start with English letters, but cannot start with `http://` or `https://`.
        :param pulumi.Input[str] transit_router_attachment_name: The name of the VPN connection. The name must be `2` to `128` characters in length, and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        :param pulumi.Input[str] vpn_owner_id: The owner id of vpn. **NOTE:** You must set `vpn_owner_id`, if you want to connect the transit router to an IPsec-VPN connection that belongs to another Alibaba Cloud account.
        """
        TransitRouterVpnAttachmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            transit_router_id=transit_router_id,
            vpn_id=vpn_id,
            zones=zones,
            auto_publish_route_enabled=auto_publish_route_enabled,
            cen_id=cen_id,
            tags=tags,
            transit_router_attachment_description=transit_router_attachment_description,
            transit_router_attachment_name=transit_router_attachment_name,
            vpn_owner_id=vpn_owner_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             transit_router_id: pulumi.Input[str],
             vpn_id: pulumi.Input[str],
             zones: pulumi.Input[Sequence[pulumi.Input['TransitRouterVpnAttachmentZoneArgs']]],
             auto_publish_route_enabled: Optional[pulumi.Input[bool]] = None,
             cen_id: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             transit_router_attachment_description: Optional[pulumi.Input[str]] = None,
             transit_router_attachment_name: Optional[pulumi.Input[str]] = None,
             vpn_owner_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("transit_router_id", transit_router_id)
        _setter("vpn_id", vpn_id)
        _setter("zones", zones)
        if auto_publish_route_enabled is not None:
            _setter("auto_publish_route_enabled", auto_publish_route_enabled)
        if cen_id is not None:
            _setter("cen_id", cen_id)
        if tags is not None:
            _setter("tags", tags)
        if transit_router_attachment_description is not None:
            _setter("transit_router_attachment_description", transit_router_attachment_description)
        if transit_router_attachment_name is not None:
            _setter("transit_router_attachment_name", transit_router_attachment_name)
        if vpn_owner_id is not None:
            _setter("vpn_owner_id", vpn_owner_id)

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Input[str]:
        """
        The ID of the forwarding router instance.
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_router_id", value)

    @property
    @pulumi.getter(name="vpnId")
    def vpn_id(self) -> pulumi.Input[str]:
        """
        The id of the vpn.
        """
        return pulumi.get(self, "vpn_id")

    @vpn_id.setter
    def vpn_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpn_id", value)

    @property
    @pulumi.getter
    def zones(self) -> pulumi.Input[Sequence[pulumi.Input['TransitRouterVpnAttachmentZoneArgs']]]:
        """
        The list of zone mapping. See `zone` below.
        """
        return pulumi.get(self, "zones")

    @zones.setter
    def zones(self, value: pulumi.Input[Sequence[pulumi.Input['TransitRouterVpnAttachmentZoneArgs']]]):
        pulumi.set(self, "zones", value)

    @property
    @pulumi.getter(name="autoPublishRouteEnabled")
    def auto_publish_route_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to allow the forwarding router instance to automatically publish routing entries to IPsec connections.
        """
        return pulumi.get(self, "auto_publish_route_enabled")

    @auto_publish_route_enabled.setter
    def auto_publish_route_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_publish_route_enabled", value)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the cen.
        """
        return pulumi.get(self, "cen_id")

    @cen_id.setter
    def cen_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cen_id", value)

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
    @pulumi.getter(name="transitRouterAttachmentDescription")
    def transit_router_attachment_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the VPN connection. The description can contain `2` to `256` characters. The description must start with English letters, but cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "transit_router_attachment_description")

    @transit_router_attachment_description.setter
    def transit_router_attachment_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_attachment_description", value)

    @property
    @pulumi.getter(name="transitRouterAttachmentName")
    def transit_router_attachment_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the VPN connection. The name must be `2` to `128` characters in length, and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        """
        return pulumi.get(self, "transit_router_attachment_name")

    @transit_router_attachment_name.setter
    def transit_router_attachment_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_attachment_name", value)

    @property
    @pulumi.getter(name="vpnOwnerId")
    def vpn_owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        The owner id of vpn. **NOTE:** You must set `vpn_owner_id`, if you want to connect the transit router to an IPsec-VPN connection that belongs to another Alibaba Cloud account.
        """
        return pulumi.get(self, "vpn_owner_id")

    @vpn_owner_id.setter
    def vpn_owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpn_owner_id", value)


@pulumi.input_type
class _TransitRouterVpnAttachmentState:
    def __init__(__self__, *,
                 auto_publish_route_enabled: Optional[pulumi.Input[bool]] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_attachment_description: Optional[pulumi.Input[str]] = None,
                 transit_router_attachment_name: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 vpn_id: Optional[pulumi.Input[str]] = None,
                 vpn_owner_id: Optional[pulumi.Input[str]] = None,
                 zones: Optional[pulumi.Input[Sequence[pulumi.Input['TransitRouterVpnAttachmentZoneArgs']]]] = None):
        """
        Input properties used for looking up and filtering TransitRouterVpnAttachment resources.
        :param pulumi.Input[bool] auto_publish_route_enabled: Whether to allow the forwarding router instance to automatically publish routing entries to IPsec connections.
        :param pulumi.Input[str] cen_id: The id of the cen.
        :param pulumi.Input[str] status: The associating status of the network.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] transit_router_attachment_description: The description of the VPN connection. The description can contain `2` to `256` characters. The description must start with English letters, but cannot start with `http://` or `https://`.
        :param pulumi.Input[str] transit_router_attachment_name: The name of the VPN connection. The name must be `2` to `128` characters in length, and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        :param pulumi.Input[str] transit_router_id: The ID of the forwarding router instance.
        :param pulumi.Input[str] vpn_id: The id of the vpn.
        :param pulumi.Input[str] vpn_owner_id: The owner id of vpn. **NOTE:** You must set `vpn_owner_id`, if you want to connect the transit router to an IPsec-VPN connection that belongs to another Alibaba Cloud account.
        :param pulumi.Input[Sequence[pulumi.Input['TransitRouterVpnAttachmentZoneArgs']]] zones: The list of zone mapping. See `zone` below.
        """
        _TransitRouterVpnAttachmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            auto_publish_route_enabled=auto_publish_route_enabled,
            cen_id=cen_id,
            status=status,
            tags=tags,
            transit_router_attachment_description=transit_router_attachment_description,
            transit_router_attachment_name=transit_router_attachment_name,
            transit_router_id=transit_router_id,
            vpn_id=vpn_id,
            vpn_owner_id=vpn_owner_id,
            zones=zones,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             auto_publish_route_enabled: Optional[pulumi.Input[bool]] = None,
             cen_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             transit_router_attachment_description: Optional[pulumi.Input[str]] = None,
             transit_router_attachment_name: Optional[pulumi.Input[str]] = None,
             transit_router_id: Optional[pulumi.Input[str]] = None,
             vpn_id: Optional[pulumi.Input[str]] = None,
             vpn_owner_id: Optional[pulumi.Input[str]] = None,
             zones: Optional[pulumi.Input[Sequence[pulumi.Input['TransitRouterVpnAttachmentZoneArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if auto_publish_route_enabled is not None:
            _setter("auto_publish_route_enabled", auto_publish_route_enabled)
        if cen_id is not None:
            _setter("cen_id", cen_id)
        if status is not None:
            _setter("status", status)
        if tags is not None:
            _setter("tags", tags)
        if transit_router_attachment_description is not None:
            _setter("transit_router_attachment_description", transit_router_attachment_description)
        if transit_router_attachment_name is not None:
            _setter("transit_router_attachment_name", transit_router_attachment_name)
        if transit_router_id is not None:
            _setter("transit_router_id", transit_router_id)
        if vpn_id is not None:
            _setter("vpn_id", vpn_id)
        if vpn_owner_id is not None:
            _setter("vpn_owner_id", vpn_owner_id)
        if zones is not None:
            _setter("zones", zones)

    @property
    @pulumi.getter(name="autoPublishRouteEnabled")
    def auto_publish_route_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to allow the forwarding router instance to automatically publish routing entries to IPsec connections.
        """
        return pulumi.get(self, "auto_publish_route_enabled")

    @auto_publish_route_enabled.setter
    def auto_publish_route_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_publish_route_enabled", value)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the cen.
        """
        return pulumi.get(self, "cen_id")

    @cen_id.setter
    def cen_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cen_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The associating status of the network.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

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
    @pulumi.getter(name="transitRouterAttachmentDescription")
    def transit_router_attachment_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the VPN connection. The description can contain `2` to `256` characters. The description must start with English letters, but cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "transit_router_attachment_description")

    @transit_router_attachment_description.setter
    def transit_router_attachment_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_attachment_description", value)

    @property
    @pulumi.getter(name="transitRouterAttachmentName")
    def transit_router_attachment_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the VPN connection. The name must be `2` to `128` characters in length, and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        """
        return pulumi.get(self, "transit_router_attachment_name")

    @transit_router_attachment_name.setter
    def transit_router_attachment_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_attachment_name", value)

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the forwarding router instance.
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_id", value)

    @property
    @pulumi.getter(name="vpnId")
    def vpn_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the vpn.
        """
        return pulumi.get(self, "vpn_id")

    @vpn_id.setter
    def vpn_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpn_id", value)

    @property
    @pulumi.getter(name="vpnOwnerId")
    def vpn_owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        The owner id of vpn. **NOTE:** You must set `vpn_owner_id`, if you want to connect the transit router to an IPsec-VPN connection that belongs to another Alibaba Cloud account.
        """
        return pulumi.get(self, "vpn_owner_id")

    @vpn_owner_id.setter
    def vpn_owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpn_owner_id", value)

    @property
    @pulumi.getter
    def zones(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TransitRouterVpnAttachmentZoneArgs']]]]:
        """
        The list of zone mapping. See `zone` below.
        """
        return pulumi.get(self, "zones")

    @zones.setter
    def zones(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TransitRouterVpnAttachmentZoneArgs']]]]):
        pulumi.set(self, "zones", value)


class TransitRouterVpnAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_publish_route_enabled: Optional[pulumi.Input[bool]] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_attachment_description: Optional[pulumi.Input[str]] = None,
                 transit_router_attachment_name: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 vpn_id: Optional[pulumi.Input[str]] = None,
                 vpn_owner_id: Optional[pulumi.Input[str]] = None,
                 zones: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TransitRouterVpnAttachmentZoneArgs']]]]] = None,
                 __props__=None):
        """
        Provides a Cloud Enterprise Network (CEN) Transit Router Vpn Attachment resource.

        For information about Cloud Enterprise Network (CEN) Transit Router Vpn Attachment and how to use it, see [What is Transit Router Vpn Attachment](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-createtransitroutervpnattachment).

        > **NOTE:** Available since v1.183.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default = alicloud.cen.get_transit_router_available_resources()
        example_instance = alicloud.cen.Instance("exampleInstance", cen_instance_name=name)
        example_transit_router = alicloud.cen.TransitRouter("exampleTransitRouter",
            cen_id=example_instance.id,
            transit_router_description=name,
            transit_router_name=name)
        example_customer_gateway = alicloud.vpn.CustomerGateway("exampleCustomerGateway",
            ip_address="42.104.22.210",
            asn="45014",
            description=name)
        example_gateway_vpn_attachment = alicloud.vpn.GatewayVpnAttachment("exampleGatewayVpnAttachment",
            customer_gateway_id=example_customer_gateway.id,
            network_type="public",
            local_subnet="0.0.0.0/0",
            remote_subnet="0.0.0.0/0",
            effect_immediately=False,
            ike_config=alicloud.vpn.GatewayVpnAttachmentIkeConfigArgs(
                ike_auth_alg="md5",
                ike_enc_alg="des",
                ike_version="ikev2",
                ike_mode="main",
                ike_lifetime=86400,
                psk="tf-testvpn2",
                ike_pfs="group1",
                remote_id="testbob2",
                local_id="testalice2",
            ),
            ipsec_config=alicloud.vpn.GatewayVpnAttachmentIpsecConfigArgs(
                ipsec_pfs="group5",
                ipsec_enc_alg="des",
                ipsec_auth_alg="md5",
                ipsec_lifetime=86400,
            ),
            bgp_config=alicloud.vpn.GatewayVpnAttachmentBgpConfigArgs(
                enable=True,
                local_asn=45014,
                tunnel_cidr="169.254.11.0/30",
                local_bgp_ip="169.254.11.1",
            ),
            health_check_config=alicloud.vpn.GatewayVpnAttachmentHealthCheckConfigArgs(
                enable=True,
                sip="192.168.1.1",
                dip="10.0.0.1",
                interval=10,
                retry=10,
                policy="revoke_route",
            ),
            enable_dpd=True,
            enable_nat_traversal=True,
            vpn_attachment_name=name)
        example_transit_router_cidr = alicloud.cen.TransitRouterCidr("exampleTransitRouterCidr",
            transit_router_id=example_transit_router.transit_router_id,
            cidr="192.168.0.0/16",
            transit_router_cidr_name=name,
            description=name,
            publish_cidr_route=True)
        example_transit_router_vpn_attachment = alicloud.cen.TransitRouterVpnAttachment("exampleTransitRouterVpnAttachment",
            auto_publish_route_enabled=False,
            transit_router_attachment_description=name,
            transit_router_attachment_name=name,
            cen_id=example_transit_router.cen_id,
            transit_router_id=example_transit_router_cidr.transit_router_id,
            vpn_id=example_gateway_vpn_attachment.id,
            zones=[alicloud.cen.TransitRouterVpnAttachmentZoneArgs(
                zone_id=default.resources[0].master_zones[0],
            )])
        ```

        ## Import

        Cloud Enterprise Network (CEN) Transit Router Vpn Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouterVpnAttachment:TransitRouterVpnAttachment example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_publish_route_enabled: Whether to allow the forwarding router instance to automatically publish routing entries to IPsec connections.
        :param pulumi.Input[str] cen_id: The id of the cen.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] transit_router_attachment_description: The description of the VPN connection. The description can contain `2` to `256` characters. The description must start with English letters, but cannot start with `http://` or `https://`.
        :param pulumi.Input[str] transit_router_attachment_name: The name of the VPN connection. The name must be `2` to `128` characters in length, and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        :param pulumi.Input[str] transit_router_id: The ID of the forwarding router instance.
        :param pulumi.Input[str] vpn_id: The id of the vpn.
        :param pulumi.Input[str] vpn_owner_id: The owner id of vpn. **NOTE:** You must set `vpn_owner_id`, if you want to connect the transit router to an IPsec-VPN connection that belongs to another Alibaba Cloud account.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TransitRouterVpnAttachmentZoneArgs']]]] zones: The list of zone mapping. See `zone` below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TransitRouterVpnAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Enterprise Network (CEN) Transit Router Vpn Attachment resource.

        For information about Cloud Enterprise Network (CEN) Transit Router Vpn Attachment and how to use it, see [What is Transit Router Vpn Attachment](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-createtransitroutervpnattachment).

        > **NOTE:** Available since v1.183.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default = alicloud.cen.get_transit_router_available_resources()
        example_instance = alicloud.cen.Instance("exampleInstance", cen_instance_name=name)
        example_transit_router = alicloud.cen.TransitRouter("exampleTransitRouter",
            cen_id=example_instance.id,
            transit_router_description=name,
            transit_router_name=name)
        example_customer_gateway = alicloud.vpn.CustomerGateway("exampleCustomerGateway",
            ip_address="42.104.22.210",
            asn="45014",
            description=name)
        example_gateway_vpn_attachment = alicloud.vpn.GatewayVpnAttachment("exampleGatewayVpnAttachment",
            customer_gateway_id=example_customer_gateway.id,
            network_type="public",
            local_subnet="0.0.0.0/0",
            remote_subnet="0.0.0.0/0",
            effect_immediately=False,
            ike_config=alicloud.vpn.GatewayVpnAttachmentIkeConfigArgs(
                ike_auth_alg="md5",
                ike_enc_alg="des",
                ike_version="ikev2",
                ike_mode="main",
                ike_lifetime=86400,
                psk="tf-testvpn2",
                ike_pfs="group1",
                remote_id="testbob2",
                local_id="testalice2",
            ),
            ipsec_config=alicloud.vpn.GatewayVpnAttachmentIpsecConfigArgs(
                ipsec_pfs="group5",
                ipsec_enc_alg="des",
                ipsec_auth_alg="md5",
                ipsec_lifetime=86400,
            ),
            bgp_config=alicloud.vpn.GatewayVpnAttachmentBgpConfigArgs(
                enable=True,
                local_asn=45014,
                tunnel_cidr="169.254.11.0/30",
                local_bgp_ip="169.254.11.1",
            ),
            health_check_config=alicloud.vpn.GatewayVpnAttachmentHealthCheckConfigArgs(
                enable=True,
                sip="192.168.1.1",
                dip="10.0.0.1",
                interval=10,
                retry=10,
                policy="revoke_route",
            ),
            enable_dpd=True,
            enable_nat_traversal=True,
            vpn_attachment_name=name)
        example_transit_router_cidr = alicloud.cen.TransitRouterCidr("exampleTransitRouterCidr",
            transit_router_id=example_transit_router.transit_router_id,
            cidr="192.168.0.0/16",
            transit_router_cidr_name=name,
            description=name,
            publish_cidr_route=True)
        example_transit_router_vpn_attachment = alicloud.cen.TransitRouterVpnAttachment("exampleTransitRouterVpnAttachment",
            auto_publish_route_enabled=False,
            transit_router_attachment_description=name,
            transit_router_attachment_name=name,
            cen_id=example_transit_router.cen_id,
            transit_router_id=example_transit_router_cidr.transit_router_id,
            vpn_id=example_gateway_vpn_attachment.id,
            zones=[alicloud.cen.TransitRouterVpnAttachmentZoneArgs(
                zone_id=default.resources[0].master_zones[0],
            )])
        ```

        ## Import

        Cloud Enterprise Network (CEN) Transit Router Vpn Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouterVpnAttachment:TransitRouterVpnAttachment example <id>
        ```

        :param str resource_name: The name of the resource.
        :param TransitRouterVpnAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TransitRouterVpnAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TransitRouterVpnAttachmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_publish_route_enabled: Optional[pulumi.Input[bool]] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_attachment_description: Optional[pulumi.Input[str]] = None,
                 transit_router_attachment_name: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 vpn_id: Optional[pulumi.Input[str]] = None,
                 vpn_owner_id: Optional[pulumi.Input[str]] = None,
                 zones: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TransitRouterVpnAttachmentZoneArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransitRouterVpnAttachmentArgs.__new__(TransitRouterVpnAttachmentArgs)

            __props__.__dict__["auto_publish_route_enabled"] = auto_publish_route_enabled
            __props__.__dict__["cen_id"] = cen_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["transit_router_attachment_description"] = transit_router_attachment_description
            __props__.__dict__["transit_router_attachment_name"] = transit_router_attachment_name
            if transit_router_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_router_id'")
            __props__.__dict__["transit_router_id"] = transit_router_id
            if vpn_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpn_id'")
            __props__.__dict__["vpn_id"] = vpn_id
            __props__.__dict__["vpn_owner_id"] = vpn_owner_id
            if zones is None and not opts.urn:
                raise TypeError("Missing required property 'zones'")
            __props__.__dict__["zones"] = zones
            __props__.__dict__["status"] = None
        super(TransitRouterVpnAttachment, __self__).__init__(
            'alicloud:cen/transitRouterVpnAttachment:TransitRouterVpnAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_publish_route_enabled: Optional[pulumi.Input[bool]] = None,
            cen_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            transit_router_attachment_description: Optional[pulumi.Input[str]] = None,
            transit_router_attachment_name: Optional[pulumi.Input[str]] = None,
            transit_router_id: Optional[pulumi.Input[str]] = None,
            vpn_id: Optional[pulumi.Input[str]] = None,
            vpn_owner_id: Optional[pulumi.Input[str]] = None,
            zones: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TransitRouterVpnAttachmentZoneArgs']]]]] = None) -> 'TransitRouterVpnAttachment':
        """
        Get an existing TransitRouterVpnAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_publish_route_enabled: Whether to allow the forwarding router instance to automatically publish routing entries to IPsec connections.
        :param pulumi.Input[str] cen_id: The id of the cen.
        :param pulumi.Input[str] status: The associating status of the network.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] transit_router_attachment_description: The description of the VPN connection. The description can contain `2` to `256` characters. The description must start with English letters, but cannot start with `http://` or `https://`.
        :param pulumi.Input[str] transit_router_attachment_name: The name of the VPN connection. The name must be `2` to `128` characters in length, and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        :param pulumi.Input[str] transit_router_id: The ID of the forwarding router instance.
        :param pulumi.Input[str] vpn_id: The id of the vpn.
        :param pulumi.Input[str] vpn_owner_id: The owner id of vpn. **NOTE:** You must set `vpn_owner_id`, if you want to connect the transit router to an IPsec-VPN connection that belongs to another Alibaba Cloud account.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TransitRouterVpnAttachmentZoneArgs']]]] zones: The list of zone mapping. See `zone` below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransitRouterVpnAttachmentState.__new__(_TransitRouterVpnAttachmentState)

        __props__.__dict__["auto_publish_route_enabled"] = auto_publish_route_enabled
        __props__.__dict__["cen_id"] = cen_id
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["transit_router_attachment_description"] = transit_router_attachment_description
        __props__.__dict__["transit_router_attachment_name"] = transit_router_attachment_name
        __props__.__dict__["transit_router_id"] = transit_router_id
        __props__.__dict__["vpn_id"] = vpn_id
        __props__.__dict__["vpn_owner_id"] = vpn_owner_id
        __props__.__dict__["zones"] = zones
        return TransitRouterVpnAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoPublishRouteEnabled")
    def auto_publish_route_enabled(self) -> pulumi.Output[bool]:
        """
        Whether to allow the forwarding router instance to automatically publish routing entries to IPsec connections.
        """
        return pulumi.get(self, "auto_publish_route_enabled")

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> pulumi.Output[Optional[str]]:
        """
        The id of the cen.
        """
        return pulumi.get(self, "cen_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The associating status of the network.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="transitRouterAttachmentDescription")
    def transit_router_attachment_description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the VPN connection. The description can contain `2` to `256` characters. The description must start with English letters, but cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "transit_router_attachment_description")

    @property
    @pulumi.getter(name="transitRouterAttachmentName")
    def transit_router_attachment_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the VPN connection. The name must be `2` to `128` characters in length, and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        """
        return pulumi.get(self, "transit_router_attachment_name")

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Output[str]:
        """
        The ID of the forwarding router instance.
        """
        return pulumi.get(self, "transit_router_id")

    @property
    @pulumi.getter(name="vpnId")
    def vpn_id(self) -> pulumi.Output[str]:
        """
        The id of the vpn.
        """
        return pulumi.get(self, "vpn_id")

    @property
    @pulumi.getter(name="vpnOwnerId")
    def vpn_owner_id(self) -> pulumi.Output[str]:
        """
        The owner id of vpn. **NOTE:** You must set `vpn_owner_id`, if you want to connect the transit router to an IPsec-VPN connection that belongs to another Alibaba Cloud account.
        """
        return pulumi.get(self, "vpn_owner_id")

    @property
    @pulumi.getter
    def zones(self) -> pulumi.Output[Sequence['outputs.TransitRouterVpnAttachmentZone']]:
        """
        The list of zone mapping. See `zone` below.
        """
        return pulumi.get(self, "zones")

