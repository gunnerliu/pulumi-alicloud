# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetTransitRoutersResult',
    'AwaitableGetTransitRoutersResult',
    'get_transit_routers',
    'get_transit_routers_output',
]

@pulumi.output_type
class GetTransitRoutersResult:
    """
    A collection of values returned by getTransitRouters.
    """
    def __init__(__self__, cen_id=None, id=None, ids=None, name_regex=None, names=None, output_file=None, status=None, transit_router_id=None, transit_router_ids=None, transit_routers=None):
        if cen_id and not isinstance(cen_id, str):
            raise TypeError("Expected argument 'cen_id' to be a str")
        pulumi.set(__self__, "cen_id", cen_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if transit_router_id and not isinstance(transit_router_id, str):
            raise TypeError("Expected argument 'transit_router_id' to be a str")
        pulumi.set(__self__, "transit_router_id", transit_router_id)
        if transit_router_ids and not isinstance(transit_router_ids, list):
            raise TypeError("Expected argument 'transit_router_ids' to be a list")
        pulumi.set(__self__, "transit_router_ids", transit_router_ids)
        if transit_routers and not isinstance(transit_routers, list):
            raise TypeError("Expected argument 'transit_routers' to be a list")
        pulumi.set(__self__, "transit_routers", transit_routers)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> str:
        """
        The ID of the CEN instance.
        """
        return pulumi.get(self, "cen_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of  CEN Transit Routers names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The status of the transit router attachment.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[str]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @property
    @pulumi.getter(name="transitRouterIds")
    def transit_router_ids(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "transit_router_ids")

    @property
    @pulumi.getter(name="transitRouters")
    def transit_routers(self) -> Sequence['outputs.GetTransitRoutersTransitRouterResult']:
        """
        A list of CEN Transit Routers. Each element contains the following attributes:
        """
        return pulumi.get(self, "transit_routers")


class AwaitableGetTransitRoutersResult(GetTransitRoutersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTransitRoutersResult(
            cen_id=self.cen_id,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status,
            transit_router_id=self.transit_router_id,
            transit_router_ids=self.transit_router_ids,
            transit_routers=self.transit_routers)


def get_transit_routers(cen_id: Optional[str] = None,
                        ids: Optional[Sequence[str]] = None,
                        name_regex: Optional[str] = None,
                        output_file: Optional[str] = None,
                        status: Optional[str] = None,
                        transit_router_id: Optional[str] = None,
                        transit_router_ids: Optional[Sequence[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTransitRoutersResult:
    """
    This data source provides CEN Transit Routers available to the user.[What is Cen Transit Routers](https://help.aliyun.com/document_detail/261219.html)

    > **NOTE:** Available in 1.126.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.cen.get_transit_routers(cen_id="cen-id1")
    pulumi.export("firstTransitRoutersType", default.transit_routers[0].type)
    ```


    :param str cen_id: The ID of the CEN instance.
    :param Sequence[str] ids: A list of resource id. The element value is same as <cen_id>:<transit_router_id>`.
    :param str name_regex: A regex string to filter CEN Transit Routers by name.
    :param str status: The status of the resource. Valid values `Active`, `Creating`, `Deleting` and `Updating`.
    :param str transit_router_id: The ID of the transit router.
    :param Sequence[str] transit_router_ids: A list of ID of the transit router.
    """
    __args__ = dict()
    __args__['cenId'] = cen_id
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['transitRouterId'] = transit_router_id
    __args__['transitRouterIds'] = transit_router_ids
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getTransitRouters:getTransitRouters', __args__, opts=opts, typ=GetTransitRoutersResult).value

    return AwaitableGetTransitRoutersResult(
        cen_id=__ret__.cen_id,
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        status=__ret__.status,
        transit_router_id=__ret__.transit_router_id,
        transit_router_ids=__ret__.transit_router_ids,
        transit_routers=__ret__.transit_routers)


@_utilities.lift_output_func(get_transit_routers)
def get_transit_routers_output(cen_id: Optional[pulumi.Input[str]] = None,
                               ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                               output_file: Optional[pulumi.Input[Optional[str]]] = None,
                               status: Optional[pulumi.Input[Optional[str]]] = None,
                               transit_router_id: Optional[pulumi.Input[Optional[str]]] = None,
                               transit_router_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTransitRoutersResult]:
    """
    This data source provides CEN Transit Routers available to the user.[What is Cen Transit Routers](https://help.aliyun.com/document_detail/261219.html)

    > **NOTE:** Available in 1.126.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.cen.get_transit_routers(cen_id="cen-id1")
    pulumi.export("firstTransitRoutersType", default.transit_routers[0].type)
    ```


    :param str cen_id: The ID of the CEN instance.
    :param Sequence[str] ids: A list of resource id. The element value is same as <cen_id>:<transit_router_id>`.
    :param str name_regex: A regex string to filter CEN Transit Routers by name.
    :param str status: The status of the resource. Valid values `Active`, `Creating`, `Deleting` and `Updating`.
    :param str transit_router_id: The ID of the transit router.
    :param Sequence[str] transit_router_ids: A list of ID of the transit router.
    """
    ...
