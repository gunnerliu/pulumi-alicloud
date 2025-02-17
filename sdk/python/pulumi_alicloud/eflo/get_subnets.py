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
    'GetSubnetsResult',
    'AwaitableGetSubnetsResult',
    'get_subnets',
    'get_subnets_output',
]

@pulumi.output_type
class GetSubnetsResult:
    """
    A collection of values returned by getSubnets.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, output_file=None, page_number=None, page_size=None, resource_group_id=None, status=None, subnet_id=None, subnet_name=None, subnets=None, type=None, vpd_id=None, zone_id=None):
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
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if subnet_id and not isinstance(subnet_id, str):
            raise TypeError("Expected argument 'subnet_id' to be a str")
        pulumi.set(__self__, "subnet_id", subnet_id)
        if subnet_name and not isinstance(subnet_name, str):
            raise TypeError("Expected argument 'subnet_name' to be a str")
        pulumi.set(__self__, "subnet_name", subnet_name)
        if subnets and not isinstance(subnets, list):
            raise TypeError("Expected argument 'subnets' to be a list")
        pulumi.set(__self__, "subnets", subnets)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if vpd_id and not isinstance(vpd_id, str):
            raise TypeError("Expected argument 'vpd_id' to be a str")
        pulumi.set(__self__, "vpd_id", vpd_id)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

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
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of name of Subnets.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="pageNumber")
    def page_number(self) -> Optional[int]:
        return pulumi.get(self, "page_number")

    @property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[int]:
        return pulumi.get(self, "page_size")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[str]:
        """
        Resource Group ID.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> Optional[str]:
        """
        The Eflo subnet ID.
        """
        return pulumi.get(self, "subnet_id")

    @property
    @pulumi.getter(name="subnetName")
    def subnet_name(self) -> Optional[str]:
        """
        The Subnet name.
        """
        return pulumi.get(self, "subnet_name")

    @property
    @pulumi.getter
    def subnets(self) -> Sequence['outputs.GetSubnetsSubnetResult']:
        """
        A list of Subnet Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "subnets")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Eflo subnet usage type.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="vpdId")
    def vpd_id(self) -> Optional[str]:
        """
        Eflo VPD ID.
        """
        return pulumi.get(self, "vpd_id")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[str]:
        """
        The zone ID of the resource.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetSubnetsResult(GetSubnetsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSubnetsResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            resource_group_id=self.resource_group_id,
            status=self.status,
            subnet_id=self.subnet_id,
            subnet_name=self.subnet_name,
            subnets=self.subnets,
            type=self.type,
            vpd_id=self.vpd_id,
            zone_id=self.zone_id)


def get_subnets(ids: Optional[Sequence[str]] = None,
                name_regex: Optional[str] = None,
                output_file: Optional[str] = None,
                page_number: Optional[int] = None,
                page_size: Optional[int] = None,
                resource_group_id: Optional[str] = None,
                status: Optional[str] = None,
                subnet_id: Optional[str] = None,
                subnet_name: Optional[str] = None,
                type: Optional[str] = None,
                vpd_id: Optional[str] = None,
                zone_id: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSubnetsResult:
    """
    This data source provides Eflo Subnet available to the user.[What is Subnet](https://help.aliyun.com/document_detail/604977.html)

    > **NOTE:** Available in 1.204.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.eflo.get_subnets(name_regex=alicloud_eflo_subnet["default"]["name"],
        subnet_name="SubnetTestForTerraform",
        vpd_id=var["vpdId"],
        zone_id=var["zoneId"])
    pulumi.export("alicloudEfloSubnetExampleId", default.subnets[0].id)
    ```


    :param str name_regex: A regex string to filter results by Group Metric Rule name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_group_id: Resource Group ID.
    :param str status: The status of the resource.
    :param str subnet_id: Primary key ID.
    :param str subnet_name: The Subnet name.
    :param str type: Eflo subnet usage type, optional value: 
           - General type is not filled in
           - OOB:OOB type
           - LB: LB type
    :param str vpd_id: The Eflo VPD ID.
    :param str zone_id: The zone ID of the resource.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['resourceGroupId'] = resource_group_id
    __args__['status'] = status
    __args__['subnetId'] = subnet_id
    __args__['subnetName'] = subnet_name
    __args__['type'] = type
    __args__['vpdId'] = vpd_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:eflo/getSubnets:getSubnets', __args__, opts=opts, typ=GetSubnetsResult).value

    return AwaitableGetSubnetsResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'),
        resource_group_id=pulumi.get(__ret__, 'resource_group_id'),
        status=pulumi.get(__ret__, 'status'),
        subnet_id=pulumi.get(__ret__, 'subnet_id'),
        subnet_name=pulumi.get(__ret__, 'subnet_name'),
        subnets=pulumi.get(__ret__, 'subnets'),
        type=pulumi.get(__ret__, 'type'),
        vpd_id=pulumi.get(__ret__, 'vpd_id'),
        zone_id=pulumi.get(__ret__, 'zone_id'))


@_utilities.lift_output_func(get_subnets)
def get_subnets_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                       name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                       output_file: Optional[pulumi.Input[Optional[str]]] = None,
                       page_number: Optional[pulumi.Input[Optional[int]]] = None,
                       page_size: Optional[pulumi.Input[Optional[int]]] = None,
                       resource_group_id: Optional[pulumi.Input[Optional[str]]] = None,
                       status: Optional[pulumi.Input[Optional[str]]] = None,
                       subnet_id: Optional[pulumi.Input[Optional[str]]] = None,
                       subnet_name: Optional[pulumi.Input[Optional[str]]] = None,
                       type: Optional[pulumi.Input[Optional[str]]] = None,
                       vpd_id: Optional[pulumi.Input[Optional[str]]] = None,
                       zone_id: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSubnetsResult]:
    """
    This data source provides Eflo Subnet available to the user.[What is Subnet](https://help.aliyun.com/document_detail/604977.html)

    > **NOTE:** Available in 1.204.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.eflo.get_subnets(name_regex=alicloud_eflo_subnet["default"]["name"],
        subnet_name="SubnetTestForTerraform",
        vpd_id=var["vpdId"],
        zone_id=var["zoneId"])
    pulumi.export("alicloudEfloSubnetExampleId", default.subnets[0].id)
    ```


    :param str name_regex: A regex string to filter results by Group Metric Rule name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_group_id: Resource Group ID.
    :param str status: The status of the resource.
    :param str subnet_id: Primary key ID.
    :param str subnet_name: The Subnet name.
    :param str type: Eflo subnet usage type, optional value: 
           - General type is not filled in
           - OOB:OOB type
           - LB: LB type
    :param str vpd_id: The Eflo VPD ID.
    :param str zone_id: The zone ID of the resource.
    """
    ...
