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
    'GetShardingNetworkPrivateAddressesResult',
    'AwaitableGetShardingNetworkPrivateAddressesResult',
    'get_sharding_network_private_addresses',
    'get_sharding_network_private_addresses_output',
]

@pulumi.output_type
class GetShardingNetworkPrivateAddressesResult:
    """
    A collection of values returned by getShardingNetworkPrivateAddresses.
    """
    def __init__(__self__, addresses=None, db_instance_id=None, id=None, node_id=None, output_file=None, role=None):
        if addresses and not isinstance(addresses, list):
            raise TypeError("Expected argument 'addresses' to be a list")
        pulumi.set(__self__, "addresses", addresses)
        if db_instance_id and not isinstance(db_instance_id, str):
            raise TypeError("Expected argument 'db_instance_id' to be a str")
        pulumi.set(__self__, "db_instance_id", db_instance_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if node_id and not isinstance(node_id, str):
            raise TypeError("Expected argument 'node_id' to be a str")
        pulumi.set(__self__, "node_id", node_id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if role and not isinstance(role, str):
            raise TypeError("Expected argument 'role' to be a str")
        pulumi.set(__self__, "role", role)

    @property
    @pulumi.getter
    def addresses(self) -> Sequence['outputs.GetShardingNetworkPrivateAddressesAddressResult']:
        return pulumi.get(self, "addresses")

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> str:
        return pulumi.get(self, "db_instance_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> Optional[str]:
        return pulumi.get(self, "node_id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def role(self) -> Optional[str]:
        return pulumi.get(self, "role")


class AwaitableGetShardingNetworkPrivateAddressesResult(GetShardingNetworkPrivateAddressesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetShardingNetworkPrivateAddressesResult(
            addresses=self.addresses,
            db_instance_id=self.db_instance_id,
            id=self.id,
            node_id=self.node_id,
            output_file=self.output_file,
            role=self.role)


def get_sharding_network_private_addresses(db_instance_id: Optional[str] = None,
                                           node_id: Optional[str] = None,
                                           output_file: Optional[str] = None,
                                           role: Optional[str] = None,
                                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetShardingNetworkPrivateAddressesResult:
    """
    This data source provides the Mongodb Sharding Network Private Addresses of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.157.0+.


    :param str db_instance_id: The db instance id.
    :param str node_id: The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str role: The role of the node.
    """
    __args__ = dict()
    __args__['dbInstanceId'] = db_instance_id
    __args__['nodeId'] = node_id
    __args__['outputFile'] = output_file
    __args__['role'] = role
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:mongodb/getShardingNetworkPrivateAddresses:getShardingNetworkPrivateAddresses', __args__, opts=opts, typ=GetShardingNetworkPrivateAddressesResult).value

    return AwaitableGetShardingNetworkPrivateAddressesResult(
        addresses=pulumi.get(__ret__, 'addresses'),
        db_instance_id=pulumi.get(__ret__, 'db_instance_id'),
        id=pulumi.get(__ret__, 'id'),
        node_id=pulumi.get(__ret__, 'node_id'),
        output_file=pulumi.get(__ret__, 'output_file'),
        role=pulumi.get(__ret__, 'role'))


@_utilities.lift_output_func(get_sharding_network_private_addresses)
def get_sharding_network_private_addresses_output(db_instance_id: Optional[pulumi.Input[str]] = None,
                                                  node_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                  output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                                  role: Optional[pulumi.Input[Optional[str]]] = None,
                                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetShardingNetworkPrivateAddressesResult]:
    """
    This data source provides the Mongodb Sharding Network Private Addresses of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.157.0+.


    :param str db_instance_id: The db instance id.
    :param str node_id: The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str role: The role of the node.
    """
    ...
