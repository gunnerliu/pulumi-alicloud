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

__all__ = [
    'GetTransitRouterRouteTableAssociationsResult',
    'AwaitableGetTransitRouterRouteTableAssociationsResult',
    'get_transit_router_route_table_associations',
    'get_transit_router_route_table_associations_output',
]

@pulumi.output_type
class GetTransitRouterRouteTableAssociationsResult:
    """
    A collection of values returned by getTransitRouterRouteTableAssociations.
    """
    def __init__(__self__, associations=None, id=None, ids=None, output_file=None, status=None, transit_router_attachment_id=None, transit_router_attachment_resource_id=None, transit_router_attachment_resource_type=None, transit_router_route_table_id=None):
        if associations and not isinstance(associations, list):
            raise TypeError("Expected argument 'associations' to be a list")
        pulumi.set(__self__, "associations", associations)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if transit_router_attachment_id and not isinstance(transit_router_attachment_id, str):
            raise TypeError("Expected argument 'transit_router_attachment_id' to be a str")
        pulumi.set(__self__, "transit_router_attachment_id", transit_router_attachment_id)
        if transit_router_attachment_resource_id and not isinstance(transit_router_attachment_resource_id, str):
            raise TypeError("Expected argument 'transit_router_attachment_resource_id' to be a str")
        pulumi.set(__self__, "transit_router_attachment_resource_id", transit_router_attachment_resource_id)
        if transit_router_attachment_resource_type and not isinstance(transit_router_attachment_resource_type, str):
            raise TypeError("Expected argument 'transit_router_attachment_resource_type' to be a str")
        pulumi.set(__self__, "transit_router_attachment_resource_type", transit_router_attachment_resource_type)
        if transit_router_route_table_id and not isinstance(transit_router_route_table_id, str):
            raise TypeError("Expected argument 'transit_router_route_table_id' to be a str")
        pulumi.set(__self__, "transit_router_route_table_id", transit_router_route_table_id)

    @property
    @pulumi.getter
    def associations(self) -> Sequence['outputs.GetTransitRouterRouteTableAssociationsAssociationResult']:
        """
        A list of CEN Transit Router Route Table Associations. Each element contains the following attributes:
        """
        return pulumi.get(self, "associations")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        """
        A list of CEN Transit Router Route Table Association IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The status of the route table.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="transitRouterAttachmentId")
    def transit_router_attachment_id(self) -> Optional[str]:
        """
        ID of the transit router attachment.
        """
        return pulumi.get(self, "transit_router_attachment_id")

    @property
    @pulumi.getter(name="transitRouterAttachmentResourceId")
    def transit_router_attachment_resource_id(self) -> Optional[str]:
        return pulumi.get(self, "transit_router_attachment_resource_id")

    @property
    @pulumi.getter(name="transitRouterAttachmentResourceType")
    def transit_router_attachment_resource_type(self) -> Optional[str]:
        return pulumi.get(self, "transit_router_attachment_resource_type")

    @property
    @pulumi.getter(name="transitRouterRouteTableId")
    def transit_router_route_table_id(self) -> Optional[str]:
        """
        ID of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_id")


class AwaitableGetTransitRouterRouteTableAssociationsResult(GetTransitRouterRouteTableAssociationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTransitRouterRouteTableAssociationsResult(
            associations=self.associations,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            status=self.status,
            transit_router_attachment_id=self.transit_router_attachment_id,
            transit_router_attachment_resource_id=self.transit_router_attachment_resource_id,
            transit_router_attachment_resource_type=self.transit_router_attachment_resource_type,
            transit_router_route_table_id=self.transit_router_route_table_id)


def get_transit_router_route_table_associations(ids: Optional[Sequence[str]] = None,
                                                output_file: Optional[str] = None,
                                                status: Optional[str] = None,
                                                transit_router_attachment_id: Optional[str] = None,
                                                transit_router_attachment_resource_id: Optional[str] = None,
                                                transit_router_attachment_resource_type: Optional[str] = None,
                                                transit_router_route_table_id: Optional[str] = None,
                                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTransitRouterRouteTableAssociationsResult:
    """
    This data source provides CEN Transit Router Route Table Associations available to the user.[What is Cen Transit Router Route Table Associations](https://help.aliyun.com/document_detail/261243.html)

    > **NOTE:** Available in 1.126.0+


    :param Sequence[str] ids: A list of CEN Transit Router Route Table Association IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the route table, including `Active`, `Associating`, `Dissociating`.
    :param str transit_router_attachment_id: The ID of the network instance connection.
    :param str transit_router_attachment_resource_id: The ID of the next hop.
    :param str transit_router_attachment_resource_type: The type of next hop. Valid values:
    :param str transit_router_route_table_id: The ID of the route table of the Enterprise Edition transit router.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['transitRouterAttachmentId'] = transit_router_attachment_id
    __args__['transitRouterAttachmentResourceId'] = transit_router_attachment_resource_id
    __args__['transitRouterAttachmentResourceType'] = transit_router_attachment_resource_type
    __args__['transitRouterRouteTableId'] = transit_router_route_table_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getTransitRouterRouteTableAssociations:getTransitRouterRouteTableAssociations', __args__, opts=opts, typ=GetTransitRouterRouteTableAssociationsResult).value

    return AwaitableGetTransitRouterRouteTableAssociationsResult(
        associations=pulumi.get(__ret__, 'associations'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        transit_router_attachment_id=pulumi.get(__ret__, 'transit_router_attachment_id'),
        transit_router_attachment_resource_id=pulumi.get(__ret__, 'transit_router_attachment_resource_id'),
        transit_router_attachment_resource_type=pulumi.get(__ret__, 'transit_router_attachment_resource_type'),
        transit_router_route_table_id=pulumi.get(__ret__, 'transit_router_route_table_id'))


@_utilities.lift_output_func(get_transit_router_route_table_associations)
def get_transit_router_route_table_associations_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                                       output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                                       status: Optional[pulumi.Input[Optional[str]]] = None,
                                                       transit_router_attachment_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                       transit_router_attachment_resource_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                       transit_router_attachment_resource_type: Optional[pulumi.Input[Optional[str]]] = None,
                                                       transit_router_route_table_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTransitRouterRouteTableAssociationsResult]:
    """
    This data source provides CEN Transit Router Route Table Associations available to the user.[What is Cen Transit Router Route Table Associations](https://help.aliyun.com/document_detail/261243.html)

    > **NOTE:** Available in 1.126.0+


    :param Sequence[str] ids: A list of CEN Transit Router Route Table Association IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the route table, including `Active`, `Associating`, `Dissociating`.
    :param str transit_router_attachment_id: The ID of the network instance connection.
    :param str transit_router_attachment_resource_id: The ID of the next hop.
    :param str transit_router_attachment_resource_type: The type of next hop. Valid values:
    :param str transit_router_route_table_id: The ID of the route table of the Enterprise Edition transit router.
    """
    ...
