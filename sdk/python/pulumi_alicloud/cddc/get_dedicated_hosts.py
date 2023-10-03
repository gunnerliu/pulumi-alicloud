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
    'GetDedicatedHostsResult',
    'AwaitableGetDedicatedHostsResult',
    'get_dedicated_hosts',
    'get_dedicated_hosts_output',
]

@pulumi.output_type
class GetDedicatedHostsResult:
    """
    A collection of values returned by getDedicatedHosts.
    """
    def __init__(__self__, allocation_status=None, dedicated_host_group_id=None, enable_details=None, host_type=None, hosts=None, id=None, ids=None, order_id=None, output_file=None, status=None, tags=None, zone_id=None):
        if allocation_status and not isinstance(allocation_status, str):
            raise TypeError("Expected argument 'allocation_status' to be a str")
        pulumi.set(__self__, "allocation_status", allocation_status)
        if dedicated_host_group_id and not isinstance(dedicated_host_group_id, str):
            raise TypeError("Expected argument 'dedicated_host_group_id' to be a str")
        pulumi.set(__self__, "dedicated_host_group_id", dedicated_host_group_id)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if host_type and not isinstance(host_type, str):
            raise TypeError("Expected argument 'host_type' to be a str")
        pulumi.set(__self__, "host_type", host_type)
        if hosts and not isinstance(hosts, list):
            raise TypeError("Expected argument 'hosts' to be a list")
        pulumi.set(__self__, "hosts", hosts)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if order_id and not isinstance(order_id, str):
            raise TypeError("Expected argument 'order_id' to be a str")
        pulumi.set(__self__, "order_id", order_id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="allocationStatus")
    def allocation_status(self) -> Optional[str]:
        return pulumi.get(self, "allocation_status")

    @property
    @pulumi.getter(name="dedicatedHostGroupId")
    def dedicated_host_group_id(self) -> str:
        return pulumi.get(self, "dedicated_host_group_id")

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

    @property
    @pulumi.getter(name="hostType")
    def host_type(self) -> Optional[str]:
        return pulumi.get(self, "host_type")

    @property
    @pulumi.getter
    def hosts(self) -> Sequence['outputs.GetDedicatedHostsHostResult']:
        return pulumi.get(self, "hosts")

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
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="orderId")
    def order_id(self) -> Optional[str]:
        return pulumi.get(self, "order_id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, Any]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[str]:
        return pulumi.get(self, "zone_id")


class AwaitableGetDedicatedHostsResult(GetDedicatedHostsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDedicatedHostsResult(
            allocation_status=self.allocation_status,
            dedicated_host_group_id=self.dedicated_host_group_id,
            enable_details=self.enable_details,
            host_type=self.host_type,
            hosts=self.hosts,
            id=self.id,
            ids=self.ids,
            order_id=self.order_id,
            output_file=self.output_file,
            status=self.status,
            tags=self.tags,
            zone_id=self.zone_id)


def get_dedicated_hosts(allocation_status: Optional[str] = None,
                        dedicated_host_group_id: Optional[str] = None,
                        enable_details: Optional[bool] = None,
                        host_type: Optional[str] = None,
                        ids: Optional[Sequence[str]] = None,
                        order_id: Optional[str] = None,
                        output_file: Optional[str] = None,
                        status: Optional[str] = None,
                        tags: Optional[Mapping[str, Any]] = None,
                        zone_id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDedicatedHostsResult:
    """
    This data source provides the Cddc Dedicated Hosts of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.147.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("cddcDedicatedHostId1", ids.hosts[0].id)
    status = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        status="1")
    pulumi.export("cddcDedicatedHostId2", status.hosts[0].id)
    zone_id = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        zone_id="example_value")
    pulumi.export("cddcDedicatedHostId3", zone_id.hosts[0].id)
    allocation_status = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        allocation_status="Allocatable")
    pulumi.export("cddcDedicatedHostId4", allocation_status.hosts[0].id)
    host_type = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        host_type="dhg_cloud_ssd")
    pulumi.export("cddcDedicatedHostId5", host_type.hosts[0].id)
    ```


    :param str allocation_status: Specifies whether instances can be created on the host. Valid values: `1` or `0`. `1`: Instances can be created on the host. `0`: Instances cannot be created on the host.
    :param str dedicated_host_group_id: The ID of the dedicated cluster in which the host is created.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param str host_type: The storage type of the host.
    :param Sequence[str] ids: A list of Dedicated Host IDs.
    :param str order_id: The ID of the order.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The state of the host.
    :param Mapping[str, Any] tags: The tag of the resource.
    :param str zone_id: The zone ID of the host.
    """
    __args__ = dict()
    __args__['allocationStatus'] = allocation_status
    __args__['dedicatedHostGroupId'] = dedicated_host_group_id
    __args__['enableDetails'] = enable_details
    __args__['hostType'] = host_type
    __args__['ids'] = ids
    __args__['orderId'] = order_id
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['tags'] = tags
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cddc/getDedicatedHosts:getDedicatedHosts', __args__, opts=opts, typ=GetDedicatedHostsResult).value

    return AwaitableGetDedicatedHostsResult(
        allocation_status=pulumi.get(__ret__, 'allocation_status'),
        dedicated_host_group_id=pulumi.get(__ret__, 'dedicated_host_group_id'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        host_type=pulumi.get(__ret__, 'host_type'),
        hosts=pulumi.get(__ret__, 'hosts'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        order_id=pulumi.get(__ret__, 'order_id'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        zone_id=pulumi.get(__ret__, 'zone_id'))


@_utilities.lift_output_func(get_dedicated_hosts)
def get_dedicated_hosts_output(allocation_status: Optional[pulumi.Input[Optional[str]]] = None,
                               dedicated_host_group_id: Optional[pulumi.Input[str]] = None,
                               enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                               host_type: Optional[pulumi.Input[Optional[str]]] = None,
                               ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               order_id: Optional[pulumi.Input[Optional[str]]] = None,
                               output_file: Optional[pulumi.Input[Optional[str]]] = None,
                               status: Optional[pulumi.Input[Optional[str]]] = None,
                               tags: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                               zone_id: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDedicatedHostsResult]:
    """
    This data source provides the Cddc Dedicated Hosts of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.147.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("cddcDedicatedHostId1", ids.hosts[0].id)
    status = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        status="1")
    pulumi.export("cddcDedicatedHostId2", status.hosts[0].id)
    zone_id = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        zone_id="example_value")
    pulumi.export("cddcDedicatedHostId3", zone_id.hosts[0].id)
    allocation_status = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        allocation_status="Allocatable")
    pulumi.export("cddcDedicatedHostId4", allocation_status.hosts[0].id)
    host_type = alicloud.cddc.get_dedicated_hosts(dedicated_host_group_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ],
        host_type="dhg_cloud_ssd")
    pulumi.export("cddcDedicatedHostId5", host_type.hosts[0].id)
    ```


    :param str allocation_status: Specifies whether instances can be created on the host. Valid values: `1` or `0`. `1`: Instances can be created on the host. `0`: Instances cannot be created on the host.
    :param str dedicated_host_group_id: The ID of the dedicated cluster in which the host is created.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param str host_type: The storage type of the host.
    :param Sequence[str] ids: A list of Dedicated Host IDs.
    :param str order_id: The ID of the order.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The state of the host.
    :param Mapping[str, Any] tags: The tag of the resource.
    :param str zone_id: The zone ID of the host.
    """
    ...
