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
    'GetPrivateZonesResult',
    'AwaitableGetPrivateZonesResult',
    'get_private_zones',
    'get_private_zones_output',
]

@pulumi.output_type
class GetPrivateZonesResult:
    """
    A collection of values returned by getPrivateZones.
    """
    def __init__(__self__, cen_id=None, host_region_id=None, id=None, ids=None, output_file=None, status=None, zones=None):
        if cen_id and not isinstance(cen_id, str):
            raise TypeError("Expected argument 'cen_id' to be a str")
        pulumi.set(__self__, "cen_id", cen_id)
        if host_region_id and not isinstance(host_region_id, str):
            raise TypeError("Expected argument 'host_region_id' to be a str")
        pulumi.set(__self__, "host_region_id", host_region_id)
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
        if zones and not isinstance(zones, list):
            raise TypeError("Expected argument 'zones' to be a list")
        pulumi.set(__self__, "zones", zones)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> str:
        """
        The ID of the CEN instance.
        """
        return pulumi.get(self, "cen_id")

    @property
    @pulumi.getter(name="hostRegionId")
    def host_region_id(self) -> Optional[str]:
        """
        The service region. The service region is the target region of the PrivateZone service accessed through CEN.
        """
        return pulumi.get(self, "host_region_id")

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
        A list of CEN private zone IDs. Each element format as `<cen_id>:<access_region_id>`.
        **NOTE:** Before 1.162.0, each element same as `access_region_id`.
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
        The status of the PrivateZone service.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def zones(self) -> Sequence['outputs.GetPrivateZonesZoneResult']:
        """
        A list of CEN private zones. Each element contains the following attributes:
        """
        return pulumi.get(self, "zones")


class AwaitableGetPrivateZonesResult(GetPrivateZonesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrivateZonesResult(
            cen_id=self.cen_id,
            host_region_id=self.host_region_id,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            status=self.status,
            zones=self.zones)


def get_private_zones(cen_id: Optional[str] = None,
                      host_region_id: Optional[str] = None,
                      ids: Optional[Sequence[str]] = None,
                      output_file: Optional[str] = None,
                      status: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrivateZonesResult:
    """
    This data source provides CEN Private Zones available to the user.

    > **NOTE:** Available in v1.88.0+.


    :param str cen_id: The ID of the CEN instance.
    :param str host_region_id: The service region. The service region is the target region of the PrivateZone service accessed through CEN.
    :param Sequence[str] ids: A list of CEN private zone IDs. Each element format as `<cen_id>:<access_region_id>`. 
           **NOTE:** Before 1.162.0, each element same as `access_region_id`.
           * `host_region_id ` - (Optional) The service region is the target region of the PrivateZone service accessed through CEN.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the PrivateZone service, including `Creating`, `Active` and `Deleting`.
    """
    __args__ = dict()
    __args__['cenId'] = cen_id
    __args__['hostRegionId'] = host_region_id
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getPrivateZones:getPrivateZones', __args__, opts=opts, typ=GetPrivateZonesResult).value

    return AwaitableGetPrivateZonesResult(
        cen_id=pulumi.get(__ret__, 'cen_id'),
        host_region_id=pulumi.get(__ret__, 'host_region_id'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        zones=pulumi.get(__ret__, 'zones'))


@_utilities.lift_output_func(get_private_zones)
def get_private_zones_output(cen_id: Optional[pulumi.Input[str]] = None,
                             host_region_id: Optional[pulumi.Input[Optional[str]]] = None,
                             ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                             output_file: Optional[pulumi.Input[Optional[str]]] = None,
                             status: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrivateZonesResult]:
    """
    This data source provides CEN Private Zones available to the user.

    > **NOTE:** Available in v1.88.0+.


    :param str cen_id: The ID of the CEN instance.
    :param str host_region_id: The service region. The service region is the target region of the PrivateZone service accessed through CEN.
    :param Sequence[str] ids: A list of CEN private zone IDs. Each element format as `<cen_id>:<access_region_id>`. 
           **NOTE:** Before 1.162.0, each element same as `access_region_id`.
           * `host_region_id ` - (Optional) The service region is the target region of the PrivateZone service accessed through CEN.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the PrivateZone service, including `Creating`, `Active` and `Deleting`.
    """
    ...
