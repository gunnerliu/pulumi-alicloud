# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetEipsResult',
    'AwaitableGetEipsResult',
    'get_eips',
]

@pulumi.output_type
class GetEipsResult:
    """
    A collection of values returned by getEips.
    """
    def __init__(__self__, eips=None, id=None, ids=None, in_use=None, ip_addresses=None, names=None, output_file=None, resource_group_id=None, tags=None):
        if eips and not isinstance(eips, list):
            raise TypeError("Expected argument 'eips' to be a list")
        pulumi.set(__self__, "eips", eips)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if in_use and not isinstance(in_use, bool):
            raise TypeError("Expected argument 'in_use' to be a bool")
        if in_use is not None:
            warnings.warn("""Field 'in_use' has been deprecated from provider version 1.8.0.""", DeprecationWarning)
            pulumi.log.warn("in_use is deprecated: Field 'in_use' has been deprecated from provider version 1.8.0.")

        pulumi.set(__self__, "in_use", in_use)
        if ip_addresses and not isinstance(ip_addresses, list):
            raise TypeError("Expected argument 'ip_addresses' to be a list")
        pulumi.set(__self__, "ip_addresses", ip_addresses)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def eips(self) -> Sequence['outputs.GetEipsEipResult']:
        """
        A list of EIPs. Each element contains the following attributes:
        """
        return pulumi.get(self, "eips")

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
        (Optional) A list of EIP IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="inUse")
    def in_use(self) -> Optional[bool]:
        return pulumi.get(self, "in_use")

    @property
    @pulumi.getter(name="ipAddresses")
    def ip_addresses(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "ip_addresses")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        (Optional) A list of EIP names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[str]:
        """
        The Id of resource group which the eips belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, Any]]:
        return pulumi.get(self, "tags")


class AwaitableGetEipsResult(GetEipsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEipsResult(
            eips=self.eips,
            id=self.id,
            ids=self.ids,
            in_use=self.in_use,
            ip_addresses=self.ip_addresses,
            names=self.names,
            output_file=self.output_file,
            resource_group_id=self.resource_group_id,
            tags=self.tags)


def get_eips(ids: Optional[Sequence[str]] = None,
             in_use: Optional[bool] = None,
             ip_addresses: Optional[Sequence[str]] = None,
             output_file: Optional[str] = None,
             resource_group_id: Optional[str] = None,
             tags: Optional[Mapping[str, Any]] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEipsResult:
    """
    This data source provides a list of EIPs (Elastic IP address) owned by an Alibaba Cloud account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    eips_ds = alicloud.ecs.get_eips()
    pulumi.export("firstEipId", eips_ds.eips[0].id)
    ```


    :param Sequence[str] ids: A list of EIP IDs.
    :param bool in_use: Deprecated since the version 1.8.0 of this provider.
    :param Sequence[str] ip_addresses: A list of EIP public IP addresses.
    :param str resource_group_id: The Id of resource group which the eips belongs.
    :param Mapping[str, Any] tags: A mapping of tags to assign to the resource.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['inUse'] = in_use
    __args__['ipAddresses'] = ip_addresses
    __args__['outputFile'] = output_file
    __args__['resourceGroupId'] = resource_group_id
    __args__['tags'] = tags
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:ecs/getEips:getEips', __args__, opts=opts, typ=GetEipsResult).value

    return AwaitableGetEipsResult(
        eips=__ret__.eips,
        id=__ret__.id,
        ids=__ret__.ids,
        in_use=__ret__.in_use,
        ip_addresses=__ret__.ip_addresses,
        names=__ret__.names,
        output_file=__ret__.output_file,
        resource_group_id=__ret__.resource_group_id,
        tags=__ret__.tags)
