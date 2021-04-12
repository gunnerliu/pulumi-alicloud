# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetVpcEndpointConnectionsResult',
    'AwaitableGetVpcEndpointConnectionsResult',
    'get_vpc_endpoint_connections',
]

@pulumi.output_type
class GetVpcEndpointConnectionsResult:
    """
    A collection of values returned by getVpcEndpointConnections.
    """
    def __init__(__self__, connections=None, endpoint_id=None, endpoint_owner_id=None, id=None, ids=None, output_file=None, service_id=None, status=None):
        if connections and not isinstance(connections, list):
            raise TypeError("Expected argument 'connections' to be a list")
        pulumi.set(__self__, "connections", connections)
        if endpoint_id and not isinstance(endpoint_id, str):
            raise TypeError("Expected argument 'endpoint_id' to be a str")
        pulumi.set(__self__, "endpoint_id", endpoint_id)
        if endpoint_owner_id and not isinstance(endpoint_owner_id, int):
            raise TypeError("Expected argument 'endpoint_owner_id' to be a int")
        pulumi.set(__self__, "endpoint_owner_id", endpoint_owner_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if service_id and not isinstance(service_id, str):
            raise TypeError("Expected argument 'service_id' to be a str")
        pulumi.set(__self__, "service_id", service_id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def connections(self) -> Sequence['outputs.GetVpcEndpointConnectionsConnectionResult']:
        return pulumi.get(self, "connections")

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> Optional[str]:
        return pulumi.get(self, "endpoint_id")

    @property
    @pulumi.getter(name="endpointOwnerId")
    def endpoint_owner_id(self) -> Optional[int]:
        return pulumi.get(self, "endpoint_owner_id")

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
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> str:
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetVpcEndpointConnectionsResult(GetVpcEndpointConnectionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVpcEndpointConnectionsResult(
            connections=self.connections,
            endpoint_id=self.endpoint_id,
            endpoint_owner_id=self.endpoint_owner_id,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            service_id=self.service_id,
            status=self.status)


def get_vpc_endpoint_connections(endpoint_id: Optional[str] = None,
                                 endpoint_owner_id: Optional[int] = None,
                                 output_file: Optional[str] = None,
                                 service_id: Optional[str] = None,
                                 status: Optional[str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVpcEndpointConnectionsResult:
    """
    This data source provides the Privatelink Vpc Endpoint Connections of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.110.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.privatelink.get_vpc_endpoint_connections(service_id="example_value",
        status="Connected")
    pulumi.export("firstPrivatelinkVpcEndpointConnectionId", example.connections[0].id)
    ```


    :param str endpoint_id: The ID of the Vpc Endpoint.
    :param int endpoint_owner_id: The endpoint owner id.
    :param str service_id: The ID of the Vpc Endpoint Service.
    :param str status: The status of Vpc Endpoint Connection.
    """
    __args__ = dict()
    __args__['endpointId'] = endpoint_id
    __args__['endpointOwnerId'] = endpoint_owner_id
    __args__['outputFile'] = output_file
    __args__['serviceId'] = service_id
    __args__['status'] = status
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:privatelink/getVpcEndpointConnections:getVpcEndpointConnections', __args__, opts=opts, typ=GetVpcEndpointConnectionsResult).value

    return AwaitableGetVpcEndpointConnectionsResult(
        connections=__ret__.connections,
        endpoint_id=__ret__.endpoint_id,
        endpoint_owner_id=__ret__.endpoint_owner_id,
        id=__ret__.id,
        ids=__ret__.ids,
        output_file=__ret__.output_file,
        service_id=__ret__.service_id,
        status=__ret__.status)
