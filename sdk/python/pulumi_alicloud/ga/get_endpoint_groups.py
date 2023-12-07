# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetEndpointGroupsResult',
    'AwaitableGetEndpointGroupsResult',
    'get_endpoint_groups',
    'get_endpoint_groups_output',
]

@pulumi.output_type
class GetEndpointGroupsResult:
    """
    A collection of values returned by getEndpointGroups.
    """
    def __init__(__self__, accelerator_id=None, endpoint_group_type=None, groups=None, id=None, ids=None, listener_id=None, name_regex=None, names=None, output_file=None, status=None):
        if accelerator_id and not isinstance(accelerator_id, str):
            raise TypeError("Expected argument 'accelerator_id' to be a str")
        pulumi.set(__self__, "accelerator_id", accelerator_id)
        if endpoint_group_type and not isinstance(endpoint_group_type, str):
            raise TypeError("Expected argument 'endpoint_group_type' to be a str")
        pulumi.set(__self__, "endpoint_group_type", endpoint_group_type)
        if groups and not isinstance(groups, list):
            raise TypeError("Expected argument 'groups' to be a list")
        pulumi.set(__self__, "groups", groups)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if listener_id and not isinstance(listener_id, str):
            raise TypeError("Expected argument 'listener_id' to be a str")
        pulumi.set(__self__, "listener_id", listener_id)
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

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> str:
        return pulumi.get(self, "accelerator_id")

    @property
    @pulumi.getter(name="endpointGroupType")
    def endpoint_group_type(self) -> Optional[str]:
        return pulumi.get(self, "endpoint_group_type")

    @property
    @pulumi.getter
    def groups(self) -> Sequence['outputs.GetEndpointGroupsGroupResult']:
        """
        A list of Ga Endpoint Groups. Each element contains the following attributes:
        """
        return pulumi.get(self, "groups")

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
    @pulumi.getter(name="listenerId")
    def listener_id(self) -> Optional[str]:
        """
        The ID of the listener that is associated with the endpoint group.
        """
        return pulumi.get(self, "listener_id")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of Endpoint Group names.
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
        The status of the endpoint group.
        """
        return pulumi.get(self, "status")


class AwaitableGetEndpointGroupsResult(GetEndpointGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEndpointGroupsResult(
            accelerator_id=self.accelerator_id,
            endpoint_group_type=self.endpoint_group_type,
            groups=self.groups,
            id=self.id,
            ids=self.ids,
            listener_id=self.listener_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status)


def get_endpoint_groups(accelerator_id: Optional[str] = None,
                        endpoint_group_type: Optional[str] = None,
                        ids: Optional[Sequence[str]] = None,
                        listener_id: Optional[str] = None,
                        name_regex: Optional[str] = None,
                        output_file: Optional[str] = None,
                        status: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEndpointGroupsResult:
    """
    This data source provides the Global Accelerator (GA) Endpoint Groups of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.113.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    region = config.get("region")
    if region is None:
        region = "cn-hangzhou"
    name = config.get("name")
    if name is None:
        name = "tf-example"
    default_accelerators = alicloud.ga.get_accelerators(status="active")
    default_bandwidth_package = alicloud.ga.BandwidthPackage("defaultBandwidthPackage",
        bandwidth=100,
        type="Basic",
        bandwidth_type="Basic",
        payment_type="PayAsYouGo",
        billing_type="PayBy95",
        ratio=30,
        bandwidth_package_name=name,
        auto_pay=True,
        auto_use_coupon=True)
    default_bandwidth_package_attachment = alicloud.ga.BandwidthPackageAttachment("defaultBandwidthPackageAttachment",
        accelerator_id=default_accelerators.ids[0],
        bandwidth_package_id=default_bandwidth_package.id)
    default_listener = alicloud.ga.Listener("defaultListener",
        accelerator_id=default_bandwidth_package_attachment.accelerator_id,
        client_affinity="SOURCE_IP",
        protocol="UDP",
        port_ranges=[alicloud.ga.ListenerPortRangeArgs(
            from_port=60,
            to_port=70,
        )])
    default_eip_address = alicloud.ecs.EipAddress("defaultEipAddress",
        bandwidth="10",
        internet_charge_type="PayByBandwidth",
        address_name=name)
    default_endpoint_group = alicloud.ga.EndpointGroup("defaultEndpointGroup",
        accelerator_id=default_listener.accelerator_id,
        listener_id=default_listener.id,
        description=name,
        threshold_count=4,
        traffic_percentage=20,
        endpoint_group_region="cn-hangzhou",
        health_check_interval_seconds=3,
        health_check_path="/healthcheck",
        health_check_port=9999,
        health_check_protocol="http",
        port_overrides=alicloud.ga.EndpointGroupPortOverridesArgs(
            endpoint_port=10,
            listener_port=60,
        ),
        endpoint_configurations=[alicloud.ga.EndpointGroupEndpointConfigurationArgs(
            endpoint=default_eip_address.ip_address,
            type="PublicIp",
            weight=20,
        )])
    default_endpoint_groups = alicloud.ga.get_endpoint_groups_output(accelerator_id=default_endpoint_group.accelerator_id,
        ids=[default_endpoint_group.id])
    pulumi.export("firstGaEndpointGroupId", default_endpoint_groups.groups[0].id)
    ```


    :param str accelerator_id: The ID of the Global Accelerator instance to which the endpoint group will be added.
    :param str endpoint_group_type: The endpoint group type. Default value: `default`. Valid values: `default`, `virtual`.
    :param Sequence[str] ids: A list of Endpoint Group IDs.
    :param str listener_id: The ID of the listener that is associated with the endpoint group.
    :param str name_regex: A regex string to filter results by Endpoint Group name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the endpoint group. Valid values: `active`, `configuring`, `creating`, `init`.
    """
    __args__ = dict()
    __args__['acceleratorId'] = accelerator_id
    __args__['endpointGroupType'] = endpoint_group_type
    __args__['ids'] = ids
    __args__['listenerId'] = listener_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ga/getEndpointGroups:getEndpointGroups', __args__, opts=opts, typ=GetEndpointGroupsResult).value

    return AwaitableGetEndpointGroupsResult(
        accelerator_id=pulumi.get(__ret__, 'accelerator_id'),
        endpoint_group_type=pulumi.get(__ret__, 'endpoint_group_type'),
        groups=pulumi.get(__ret__, 'groups'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        listener_id=pulumi.get(__ret__, 'listener_id'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_endpoint_groups)
def get_endpoint_groups_output(accelerator_id: Optional[pulumi.Input[str]] = None,
                               endpoint_group_type: Optional[pulumi.Input[Optional[str]]] = None,
                               ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               listener_id: Optional[pulumi.Input[Optional[str]]] = None,
                               name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                               output_file: Optional[pulumi.Input[Optional[str]]] = None,
                               status: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEndpointGroupsResult]:
    """
    This data source provides the Global Accelerator (GA) Endpoint Groups of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.113.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    region = config.get("region")
    if region is None:
        region = "cn-hangzhou"
    name = config.get("name")
    if name is None:
        name = "tf-example"
    default_accelerators = alicloud.ga.get_accelerators(status="active")
    default_bandwidth_package = alicloud.ga.BandwidthPackage("defaultBandwidthPackage",
        bandwidth=100,
        type="Basic",
        bandwidth_type="Basic",
        payment_type="PayAsYouGo",
        billing_type="PayBy95",
        ratio=30,
        bandwidth_package_name=name,
        auto_pay=True,
        auto_use_coupon=True)
    default_bandwidth_package_attachment = alicloud.ga.BandwidthPackageAttachment("defaultBandwidthPackageAttachment",
        accelerator_id=default_accelerators.ids[0],
        bandwidth_package_id=default_bandwidth_package.id)
    default_listener = alicloud.ga.Listener("defaultListener",
        accelerator_id=default_bandwidth_package_attachment.accelerator_id,
        client_affinity="SOURCE_IP",
        protocol="UDP",
        port_ranges=[alicloud.ga.ListenerPortRangeArgs(
            from_port=60,
            to_port=70,
        )])
    default_eip_address = alicloud.ecs.EipAddress("defaultEipAddress",
        bandwidth="10",
        internet_charge_type="PayByBandwidth",
        address_name=name)
    default_endpoint_group = alicloud.ga.EndpointGroup("defaultEndpointGroup",
        accelerator_id=default_listener.accelerator_id,
        listener_id=default_listener.id,
        description=name,
        threshold_count=4,
        traffic_percentage=20,
        endpoint_group_region="cn-hangzhou",
        health_check_interval_seconds=3,
        health_check_path="/healthcheck",
        health_check_port=9999,
        health_check_protocol="http",
        port_overrides=alicloud.ga.EndpointGroupPortOverridesArgs(
            endpoint_port=10,
            listener_port=60,
        ),
        endpoint_configurations=[alicloud.ga.EndpointGroupEndpointConfigurationArgs(
            endpoint=default_eip_address.ip_address,
            type="PublicIp",
            weight=20,
        )])
    default_endpoint_groups = alicloud.ga.get_endpoint_groups_output(accelerator_id=default_endpoint_group.accelerator_id,
        ids=[default_endpoint_group.id])
    pulumi.export("firstGaEndpointGroupId", default_endpoint_groups.groups[0].id)
    ```


    :param str accelerator_id: The ID of the Global Accelerator instance to which the endpoint group will be added.
    :param str endpoint_group_type: The endpoint group type. Default value: `default`. Valid values: `default`, `virtual`.
    :param Sequence[str] ids: A list of Endpoint Group IDs.
    :param str listener_id: The ID of the listener that is associated with the endpoint group.
    :param str name_regex: A regex string to filter results by Endpoint Group name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the endpoint group. Valid values: `active`, `configuring`, `creating`, `init`.
    """
    ...
