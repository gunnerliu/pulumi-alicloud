# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TransitRouterMulticastDomainMemberArgs', 'TransitRouterMulticastDomainMember']

@pulumi.input_type
class TransitRouterMulticastDomainMemberArgs:
    def __init__(__self__, *,
                 group_ip_address: pulumi.Input[str],
                 network_interface_id: pulumi.Input[str],
                 transit_router_multicast_domain_id: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TransitRouterMulticastDomainMember resource.
        :param pulumi.Input[str] group_ip_address: The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        :param pulumi.Input[str] network_interface_id: The ID of the ENI.
        :param pulumi.Input[str] transit_router_multicast_domain_id: The ID of the multicast domain to which the multicast member belongs.
        :param pulumi.Input[bool] dry_run: Specifies whether only to precheck the request.
        :param pulumi.Input[str] vpc_id: The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
        """
        TransitRouterMulticastDomainMemberArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            group_ip_address=group_ip_address,
            network_interface_id=network_interface_id,
            transit_router_multicast_domain_id=transit_router_multicast_domain_id,
            dry_run=dry_run,
            vpc_id=vpc_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             group_ip_address: Optional[pulumi.Input[str]] = None,
             network_interface_id: Optional[pulumi.Input[str]] = None,
             transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None,
             dry_run: Optional[pulumi.Input[bool]] = None,
             vpc_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if group_ip_address is None and 'groupIpAddress' in kwargs:
            group_ip_address = kwargs['groupIpAddress']
        if group_ip_address is None:
            raise TypeError("Missing 'group_ip_address' argument")
        if network_interface_id is None and 'networkInterfaceId' in kwargs:
            network_interface_id = kwargs['networkInterfaceId']
        if network_interface_id is None:
            raise TypeError("Missing 'network_interface_id' argument")
        if transit_router_multicast_domain_id is None and 'transitRouterMulticastDomainId' in kwargs:
            transit_router_multicast_domain_id = kwargs['transitRouterMulticastDomainId']
        if transit_router_multicast_domain_id is None:
            raise TypeError("Missing 'transit_router_multicast_domain_id' argument")
        if dry_run is None and 'dryRun' in kwargs:
            dry_run = kwargs['dryRun']
        if vpc_id is None and 'vpcId' in kwargs:
            vpc_id = kwargs['vpcId']

        _setter("group_ip_address", group_ip_address)
        _setter("network_interface_id", network_interface_id)
        _setter("transit_router_multicast_domain_id", transit_router_multicast_domain_id)
        if dry_run is not None:
            _setter("dry_run", dry_run)
        if vpc_id is not None:
            _setter("vpc_id", vpc_id)

    @property
    @pulumi.getter(name="groupIpAddress")
    def group_ip_address(self) -> pulumi.Input[str]:
        """
        The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        """
        return pulumi.get(self, "group_ip_address")

    @group_ip_address.setter
    def group_ip_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_ip_address", value)

    @property
    @pulumi.getter(name="networkInterfaceId")
    def network_interface_id(self) -> pulumi.Input[str]:
        """
        The ID of the ENI.
        """
        return pulumi.get(self, "network_interface_id")

    @network_interface_id.setter
    def network_interface_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "network_interface_id", value)

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

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


@pulumi.input_type
class _TransitRouterMulticastDomainMemberState:
    def __init__(__self__, *,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 group_ip_address: Optional[pulumi.Input[str]] = None,
                 network_interface_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TransitRouterMulticastDomainMember resources.
        :param pulumi.Input[bool] dry_run: Specifies whether only to precheck the request.
        :param pulumi.Input[str] group_ip_address: The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        :param pulumi.Input[str] network_interface_id: The ID of the ENI.
        :param pulumi.Input[str] status: The status of the resource
        :param pulumi.Input[str] transit_router_multicast_domain_id: The ID of the multicast domain to which the multicast member belongs.
        :param pulumi.Input[str] vpc_id: The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
        """
        _TransitRouterMulticastDomainMemberState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            dry_run=dry_run,
            group_ip_address=group_ip_address,
            network_interface_id=network_interface_id,
            status=status,
            transit_router_multicast_domain_id=transit_router_multicast_domain_id,
            vpc_id=vpc_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             dry_run: Optional[pulumi.Input[bool]] = None,
             group_ip_address: Optional[pulumi.Input[str]] = None,
             network_interface_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None,
             vpc_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if dry_run is None and 'dryRun' in kwargs:
            dry_run = kwargs['dryRun']
        if group_ip_address is None and 'groupIpAddress' in kwargs:
            group_ip_address = kwargs['groupIpAddress']
        if network_interface_id is None and 'networkInterfaceId' in kwargs:
            network_interface_id = kwargs['networkInterfaceId']
        if transit_router_multicast_domain_id is None and 'transitRouterMulticastDomainId' in kwargs:
            transit_router_multicast_domain_id = kwargs['transitRouterMulticastDomainId']
        if vpc_id is None and 'vpcId' in kwargs:
            vpc_id = kwargs['vpcId']

        if dry_run is not None:
            _setter("dry_run", dry_run)
        if group_ip_address is not None:
            _setter("group_ip_address", group_ip_address)
        if network_interface_id is not None:
            _setter("network_interface_id", network_interface_id)
        if status is not None:
            _setter("status", status)
        if transit_router_multicast_domain_id is not None:
            _setter("transit_router_multicast_domain_id", transit_router_multicast_domain_id)
        if vpc_id is not None:
            _setter("vpc_id", vpc_id)

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
        The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        """
        return pulumi.get(self, "group_ip_address")

    @group_ip_address.setter
    def group_ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_ip_address", value)

    @property
    @pulumi.getter(name="networkInterfaceId")
    def network_interface_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the ENI.
        """
        return pulumi.get(self, "network_interface_id")

    @network_interface_id.setter
    def network_interface_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_interface_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource
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

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class TransitRouterMulticastDomainMember(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 group_ip_address: Optional[pulumi.Input[str]] = None,
                 network_interface_id: Optional[pulumi.Input[str]] = None,
                 transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cen Transit Router Multicast Domain Member resource.

        For information about Cen Transit Router Multicast Domain Member and how to use it, see [What is Transit Router Multicast Domain Member](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-registertransitroutermulticastgroupmembers).

        > **NOTE:** Available since v1.195.0.

        ## Import

        Cen Transit Router Multicast Domain Member can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouterMulticastDomainMember:TransitRouterMulticastDomainMember example <transit_router_multicast_domain_id>:<group_ip_address>:<network_interface_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: Specifies whether only to precheck the request.
        :param pulumi.Input[str] group_ip_address: The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        :param pulumi.Input[str] network_interface_id: The ID of the ENI.
        :param pulumi.Input[str] transit_router_multicast_domain_id: The ID of the multicast domain to which the multicast member belongs.
        :param pulumi.Input[str] vpc_id: The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TransitRouterMulticastDomainMemberArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cen Transit Router Multicast Domain Member resource.

        For information about Cen Transit Router Multicast Domain Member and how to use it, see [What is Transit Router Multicast Domain Member](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-registertransitroutermulticastgroupmembers).

        > **NOTE:** Available since v1.195.0.

        ## Import

        Cen Transit Router Multicast Domain Member can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouterMulticastDomainMember:TransitRouterMulticastDomainMember example <transit_router_multicast_domain_id>:<group_ip_address>:<network_interface_id>
        ```

        :param str resource_name: The name of the resource.
        :param TransitRouterMulticastDomainMemberArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TransitRouterMulticastDomainMemberArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TransitRouterMulticastDomainMemberArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 group_ip_address: Optional[pulumi.Input[str]] = None,
                 network_interface_id: Optional[pulumi.Input[str]] = None,
                 transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransitRouterMulticastDomainMemberArgs.__new__(TransitRouterMulticastDomainMemberArgs)

            __props__.__dict__["dry_run"] = dry_run
            if group_ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'group_ip_address'")
            __props__.__dict__["group_ip_address"] = group_ip_address
            if network_interface_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_interface_id'")
            __props__.__dict__["network_interface_id"] = network_interface_id
            if transit_router_multicast_domain_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_router_multicast_domain_id'")
            __props__.__dict__["transit_router_multicast_domain_id"] = transit_router_multicast_domain_id
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["status"] = None
        super(TransitRouterMulticastDomainMember, __self__).__init__(
            'alicloud:cen/transitRouterMulticastDomainMember:TransitRouterMulticastDomainMember',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            group_ip_address: Optional[pulumi.Input[str]] = None,
            network_interface_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            transit_router_multicast_domain_id: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'TransitRouterMulticastDomainMember':
        """
        Get an existing TransitRouterMulticastDomainMember resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: Specifies whether only to precheck the request.
        :param pulumi.Input[str] group_ip_address: The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        :param pulumi.Input[str] network_interface_id: The ID of the ENI.
        :param pulumi.Input[str] status: The status of the resource
        :param pulumi.Input[str] transit_router_multicast_domain_id: The ID of the multicast domain to which the multicast member belongs.
        :param pulumi.Input[str] vpc_id: The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransitRouterMulticastDomainMemberState.__new__(_TransitRouterMulticastDomainMemberState)

        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["group_ip_address"] = group_ip_address
        __props__.__dict__["network_interface_id"] = network_interface_id
        __props__.__dict__["status"] = status
        __props__.__dict__["transit_router_multicast_domain_id"] = transit_router_multicast_domain_id
        __props__.__dict__["vpc_id"] = vpc_id
        return TransitRouterMulticastDomainMember(resource_name, opts=opts, __props__=__props__)

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
        The IP address of the multicast group to which the multicast member belongs. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you in the current multicast domain.
        """
        return pulumi.get(self, "group_ip_address")

    @property
    @pulumi.getter(name="networkInterfaceId")
    def network_interface_id(self) -> pulumi.Output[str]:
        """
        The ID of the ENI.
        """
        return pulumi.get(self, "network_interface_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="transitRouterMulticastDomainId")
    def transit_router_multicast_domain_id(self) -> pulumi.Output[str]:
        """
        The ID of the multicast domain to which the multicast member belongs.
        """
        return pulumi.get(self, "transit_router_multicast_domain_id")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[Optional[str]]:
        """
        The VPC to which the ENI of the multicast member belongs. This field is mandatory for VPCs owned by another accounts.
        """
        return pulumi.get(self, "vpc_id")

