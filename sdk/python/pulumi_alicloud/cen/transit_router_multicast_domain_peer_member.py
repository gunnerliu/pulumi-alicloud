# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TransitRouterMulticastDomainPeerMemberArgs', 'TransitRouterMulticastDomainPeerMember']

@pulumi.input_type
class TransitRouterMulticastDomainPeerMemberArgs:
    def __init__(__self__, *,
                 group_ip_address: pulumi.Input[str],
                 peer_transit_router_multicast_domain_id: pulumi.Input[str],
                 transit_router_multicast_domain_id: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a TransitRouterMulticastDomainPeerMember resource.
        :param pulumi.Input[str] group_ip_address: The IP address of the multicast group to which the multicast member belongs. Value range: **224.0.0.1** to **239.255.255.254**.If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        :param pulumi.Input[str] peer_transit_router_multicast_domain_id: The IDs of the inter-region multicast domains.
        :param pulumi.Input[str] transit_router_multicast_domain_id: The ID of the multicast domain to which the multicast member belongs.
        :param pulumi.Input[bool] dry_run: Specifies whether only to precheck the request.
        """
        pulumi.set(__self__, "group_ip_address", group_ip_address)
        pulumi.set(__self__, "peer_transit_router_multicast_domain_id", peer_transit_router_multicast_domain_id)
        pulumi.set(__self__, "transit_router_multicast_domain_id", transit_router_multicast_domain_id)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)

    @property
    @pulumi.getter(name="groupIpAddress")
    def group_ip_address(self) -> pulumi.Input[str]:
        """
        The IP address of the multicast group to which the multicast member belongs. Value range: **224.0.0.1** to **239.255.255.254**.If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        """
        return pulumi.get(self, "group_ip_address")

    @group_ip_address.setter
    def group_ip_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_ip_address", value)

    @property
    @pulumi.getter(name="peerTransitRouterMulticastDomainId")
    def peer_transit_router_multicast_domain_id(self) -> pulumi.Input[str]:
        """
        The IDs of the inter-region multicast domains.
        """
        return pulumi.get(self, "peer_transit_router_multicast_domain_id")

    @peer_transit_router_multicast_domain_id.setter
    def peer_transit_router_multicast_domain_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "peer_transit_router_multicast_domain_id", value)

    @property
    @pulumi.getter(name="transitRouterMulticastDomainId")
    def transit_router_multicast_domain_id(self) -> pulumi.Input[str]:
        """
        The ID of the multicast domain to which the multicast member belongs.
        """
        return pulumi.get(self, "transit_router_multicast_domain_id")

    @transit_router_multicast_domain_id.setter
    def transit_router_multicast_domain_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_router_multicast_domain_id", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether only to precheck the request.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)


@pulumi.input_type
class _TransitRouterMulticastDomainPeerMemberState:
    def __init__(__self__, *,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 group_ip_address: Optional[pulumi.Input[str]] = None,
                 peer_transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TransitRouterMulticastDomainPeerMember resources.
        :param pulumi.Input[bool] dry_run: Specifies whether only to precheck the request.
        :param pulumi.Input[str] group_ip_address: The IP address of the multicast group to which the multicast member belongs. Value range: **224.0.0.1** to **239.255.255.254**.If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        :param pulumi.Input[str] peer_transit_router_multicast_domain_id: The IDs of the inter-region multicast domains.
        :param pulumi.Input[str] status: The status of the multicast resource. Valid values:
               - Registering: being created
               - Registered: available
               - Deregistering: being deleted
        :param pulumi.Input[str] transit_router_multicast_domain_id: The ID of the multicast domain to which the multicast member belongs.
        """
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if group_ip_address is not None:
            pulumi.set(__self__, "group_ip_address", group_ip_address)
        if peer_transit_router_multicast_domain_id is not None:
            pulumi.set(__self__, "peer_transit_router_multicast_domain_id", peer_transit_router_multicast_domain_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if transit_router_multicast_domain_id is not None:
            pulumi.set(__self__, "transit_router_multicast_domain_id", transit_router_multicast_domain_id)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether only to precheck the request.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="groupIpAddress")
    def group_ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address of the multicast group to which the multicast member belongs. Value range: **224.0.0.1** to **239.255.255.254**.If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        """
        return pulumi.get(self, "group_ip_address")

    @group_ip_address.setter
    def group_ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_ip_address", value)

    @property
    @pulumi.getter(name="peerTransitRouterMulticastDomainId")
    def peer_transit_router_multicast_domain_id(self) -> Optional[pulumi.Input[str]]:
        """
        The IDs of the inter-region multicast domains.
        """
        return pulumi.get(self, "peer_transit_router_multicast_domain_id")

    @peer_transit_router_multicast_domain_id.setter
    def peer_transit_router_multicast_domain_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "peer_transit_router_multicast_domain_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the multicast resource. Valid values:
        - Registering: being created
        - Registered: available
        - Deregistering: being deleted
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="transitRouterMulticastDomainId")
    def transit_router_multicast_domain_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the multicast domain to which the multicast member belongs.
        """
        return pulumi.get(self, "transit_router_multicast_domain_id")

    @transit_router_multicast_domain_id.setter
    def transit_router_multicast_domain_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_multicast_domain_id", value)


class TransitRouterMulticastDomainPeerMember(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 group_ip_address: Optional[pulumi.Input[str]] = None,
                 peer_transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None,
                 transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cen Transit Router Multicast Domain Peer Member resource.

        For information about Cen Transit Router Multicast Domain Peer Member and how to use it, see [What is Transit Router Multicast Domain Peer Member](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-deregistertransitroutermulticastgroupmembers).

        > **NOTE:** Available since v1.195.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_region = config.get("defaultRegion")
        if default_region is None:
            default_region = "cn-hangzhou"
        peer_region = config.get("peerRegion")
        if peer_region is None:
            peer_region = "cn-beijing"
        hz = alicloud.Provider("hz", region=default_region)
        bj = alicloud.Provider("bj", region=peer_region)
        default_instance = alicloud.cen.Instance("defaultInstance",
            cen_instance_name=name,
            protection_level="REDUCED")
        default_transit_router = alicloud.cen.TransitRouter("defaultTransitRouter", cen_id=default_instance.id,
        opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        peer_transit_router = alicloud.cen.TransitRouter("peerTransitRouter", cen_id=default_transit_router.cen_id,
        opts=pulumi.ResourceOptions(provider=alicloud["bj"]))
        default_transit_router_multicast_domain = alicloud.cen.TransitRouterMulticastDomain("defaultTransitRouterMulticastDomain",
            transit_router_id=default_transit_router.transit_router_id,
            transit_router_multicast_domain_name=name,
            opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        peer_transit_router_multicast_domain = alicloud.cen.TransitRouterMulticastDomain("peerTransitRouterMulticastDomain",
            transit_router_id=peer_transit_router.transit_router_id,
            transit_router_multicast_domain_name=name,
            opts=pulumi.ResourceOptions(provider=alicloud["bj"]))
        default_transit_router_multicast_domain_peer_member = alicloud.cen.TransitRouterMulticastDomainPeerMember("defaultTransitRouterMulticastDomainPeerMember",
            peer_transit_router_multicast_domain_id=peer_transit_router_multicast_domain.id,
            transit_router_multicast_domain_id=default_transit_router_multicast_domain.id,
            group_ip_address="239.1.1.1",
            opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        ```

        ## Import

        Cen Transit Router Multicast Domain Peer Member can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouterMulticastDomainPeerMember:TransitRouterMulticastDomainPeerMember example <transit_router_multicast_domain_id>:<group_ip_address>:<peer_transit_router_multicast_domain_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: Specifies whether only to precheck the request.
        :param pulumi.Input[str] group_ip_address: The IP address of the multicast group to which the multicast member belongs. Value range: **224.0.0.1** to **239.255.255.254**.If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        :param pulumi.Input[str] peer_transit_router_multicast_domain_id: The IDs of the inter-region multicast domains.
        :param pulumi.Input[str] transit_router_multicast_domain_id: The ID of the multicast domain to which the multicast member belongs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TransitRouterMulticastDomainPeerMemberArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cen Transit Router Multicast Domain Peer Member resource.

        For information about Cen Transit Router Multicast Domain Peer Member and how to use it, see [What is Transit Router Multicast Domain Peer Member](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-deregistertransitroutermulticastgroupmembers).

        > **NOTE:** Available since v1.195.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_region = config.get("defaultRegion")
        if default_region is None:
            default_region = "cn-hangzhou"
        peer_region = config.get("peerRegion")
        if peer_region is None:
            peer_region = "cn-beijing"
        hz = alicloud.Provider("hz", region=default_region)
        bj = alicloud.Provider("bj", region=peer_region)
        default_instance = alicloud.cen.Instance("defaultInstance",
            cen_instance_name=name,
            protection_level="REDUCED")
        default_transit_router = alicloud.cen.TransitRouter("defaultTransitRouter", cen_id=default_instance.id,
        opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        peer_transit_router = alicloud.cen.TransitRouter("peerTransitRouter", cen_id=default_transit_router.cen_id,
        opts=pulumi.ResourceOptions(provider=alicloud["bj"]))
        default_transit_router_multicast_domain = alicloud.cen.TransitRouterMulticastDomain("defaultTransitRouterMulticastDomain",
            transit_router_id=default_transit_router.transit_router_id,
            transit_router_multicast_domain_name=name,
            opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        peer_transit_router_multicast_domain = alicloud.cen.TransitRouterMulticastDomain("peerTransitRouterMulticastDomain",
            transit_router_id=peer_transit_router.transit_router_id,
            transit_router_multicast_domain_name=name,
            opts=pulumi.ResourceOptions(provider=alicloud["bj"]))
        default_transit_router_multicast_domain_peer_member = alicloud.cen.TransitRouterMulticastDomainPeerMember("defaultTransitRouterMulticastDomainPeerMember",
            peer_transit_router_multicast_domain_id=peer_transit_router_multicast_domain.id,
            transit_router_multicast_domain_id=default_transit_router_multicast_domain.id,
            group_ip_address="239.1.1.1",
            opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        ```

        ## Import

        Cen Transit Router Multicast Domain Peer Member can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouterMulticastDomainPeerMember:TransitRouterMulticastDomainPeerMember example <transit_router_multicast_domain_id>:<group_ip_address>:<peer_transit_router_multicast_domain_id>
        ```

        :param str resource_name: The name of the resource.
        :param TransitRouterMulticastDomainPeerMemberArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TransitRouterMulticastDomainPeerMemberArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 group_ip_address: Optional[pulumi.Input[str]] = None,
                 peer_transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None,
                 transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransitRouterMulticastDomainPeerMemberArgs.__new__(TransitRouterMulticastDomainPeerMemberArgs)

            __props__.__dict__["dry_run"] = dry_run
            if group_ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'group_ip_address'")
            __props__.__dict__["group_ip_address"] = group_ip_address
            if peer_transit_router_multicast_domain_id is None and not opts.urn:
                raise TypeError("Missing required property 'peer_transit_router_multicast_domain_id'")
            __props__.__dict__["peer_transit_router_multicast_domain_id"] = peer_transit_router_multicast_domain_id
            if transit_router_multicast_domain_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_router_multicast_domain_id'")
            __props__.__dict__["transit_router_multicast_domain_id"] = transit_router_multicast_domain_id
            __props__.__dict__["status"] = None
        super(TransitRouterMulticastDomainPeerMember, __self__).__init__(
            'alicloud:cen/transitRouterMulticastDomainPeerMember:TransitRouterMulticastDomainPeerMember',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            group_ip_address: Optional[pulumi.Input[str]] = None,
            peer_transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None) -> 'TransitRouterMulticastDomainPeerMember':
        """
        Get an existing TransitRouterMulticastDomainPeerMember resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: Specifies whether only to precheck the request.
        :param pulumi.Input[str] group_ip_address: The IP address of the multicast group to which the multicast member belongs. Value range: **224.0.0.1** to **239.255.255.254**.If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        :param pulumi.Input[str] peer_transit_router_multicast_domain_id: The IDs of the inter-region multicast domains.
        :param pulumi.Input[str] status: The status of the multicast resource. Valid values:
               - Registering: being created
               - Registered: available
               - Deregistering: being deleted
        :param pulumi.Input[str] transit_router_multicast_domain_id: The ID of the multicast domain to which the multicast member belongs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransitRouterMulticastDomainPeerMemberState.__new__(_TransitRouterMulticastDomainPeerMemberState)

        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["group_ip_address"] = group_ip_address
        __props__.__dict__["peer_transit_router_multicast_domain_id"] = peer_transit_router_multicast_domain_id
        __props__.__dict__["status"] = status
        __props__.__dict__["transit_router_multicast_domain_id"] = transit_router_multicast_domain_id
        return TransitRouterMulticastDomainPeerMember(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether only to precheck the request.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="groupIpAddress")
    def group_ip_address(self) -> pulumi.Output[str]:
        """
        The IP address of the multicast group to which the multicast member belongs. Value range: **224.0.0.1** to **239.255.255.254**.If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        """
        return pulumi.get(self, "group_ip_address")

    @property
    @pulumi.getter(name="peerTransitRouterMulticastDomainId")
    def peer_transit_router_multicast_domain_id(self) -> pulumi.Output[str]:
        """
        The IDs of the inter-region multicast domains.
        """
        return pulumi.get(self, "peer_transit_router_multicast_domain_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the multicast resource. Valid values:
        - Registering: being created
        - Registered: available
        - Deregistering: being deleted
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="transitRouterMulticastDomainId")
    def transit_router_multicast_domain_id(self) -> pulumi.Output[str]:
        """
        The ID of the multicast domain to which the multicast member belongs.
        """
        return pulumi.get(self, "transit_router_multicast_domain_id")

