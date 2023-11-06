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
    'GetBasicAccelerateIpEndpointRelationsResult',
    'AwaitableGetBasicAccelerateIpEndpointRelationsResult',
    'get_basic_accelerate_ip_endpoint_relations',
    'get_basic_accelerate_ip_endpoint_relations_output',
]

@pulumi.output_type
class GetBasicAccelerateIpEndpointRelationsResult:
    """
    A collection of values returned by getBasicAccelerateIpEndpointRelations.
    """
    def __init__(__self__, accelerate_ip_id=None, accelerator_id=None, endpoint_id=None, id=None, ids=None, output_file=None, relations=None, status=None):
        if accelerate_ip_id and not isinstance(accelerate_ip_id, str):
            raise TypeError("Expected argument 'accelerate_ip_id' to be a str")
        pulumi.set(__self__, "accelerate_ip_id", accelerate_ip_id)
        if accelerator_id and not isinstance(accelerator_id, str):
            raise TypeError("Expected argument 'accelerator_id' to be a str")
        pulumi.set(__self__, "accelerator_id", accelerator_id)
        if endpoint_id and not isinstance(endpoint_id, str):
            raise TypeError("Expected argument 'endpoint_id' to be a str")
        pulumi.set(__self__, "endpoint_id", endpoint_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if relations and not isinstance(relations, list):
            raise TypeError("Expected argument 'relations' to be a list")
        pulumi.set(__self__, "relations", relations)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="accelerateIpId")
    def accelerate_ip_id(self) -> Optional[str]:
        """
        The ID of the Basic Accelerate IP.
        """
        return pulumi.get(self, "accelerate_ip_id")

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> str:
        """
        The ID of the Global Accelerator Basic Accelerator instance.
        """
        return pulumi.get(self, "accelerator_id")

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> Optional[str]:
        """
        The ID of the Basic Endpoint.
        """
        return pulumi.get(self, "endpoint_id")

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
    @pulumi.getter
    def relations(self) -> Sequence['outputs.GetBasicAccelerateIpEndpointRelationsRelationResult']:
        """
        A list of Global Accelerator Basic Accelerate Ip Endpoint Relations. Each element contains the following attributes:
        """
        return pulumi.get(self, "relations")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The status of the Basic Accelerate Ip Endpoint Relation.
        """
        return pulumi.get(self, "status")


class AwaitableGetBasicAccelerateIpEndpointRelationsResult(GetBasicAccelerateIpEndpointRelationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBasicAccelerateIpEndpointRelationsResult(
            accelerate_ip_id=self.accelerate_ip_id,
            accelerator_id=self.accelerator_id,
            endpoint_id=self.endpoint_id,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            relations=self.relations,
            status=self.status)


def get_basic_accelerate_ip_endpoint_relations(accelerate_ip_id: Optional[str] = None,
                                               accelerator_id: Optional[str] = None,
                                               endpoint_id: Optional[str] = None,
                                               ids: Optional[Sequence[str]] = None,
                                               output_file: Optional[str] = None,
                                               status: Optional[str] = None,
                                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBasicAccelerateIpEndpointRelationsResult:
    """
    This data source provides the Global Accelerator (GA) Basic Accelerate Ip Endpoint Relations of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.194.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.ga.get_basic_accelerate_ip_endpoint_relations(ids=["example_id"],
        accelerator_id="example_id")
    pulumi.export("gaBasicAccelerateIpEndpointRelationsId1", ids.relations[0].id)
    ```


    :param str accelerate_ip_id: The ID of the Basic Accelerate IP.
    :param str accelerator_id: The ID of the Global Accelerator Basic Accelerator instance.
    :param str endpoint_id: The ID of the Basic Endpoint.
    :param Sequence[str] ids: A list of Global Accelerator Basic Accelerate Ip Endpoint Relations IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the Global Accelerator Basic Accelerate Ip Endpoint Relation. Valid Value: `active`.
    """
    __args__ = dict()
    __args__['accelerateIpId'] = accelerate_ip_id
    __args__['acceleratorId'] = accelerator_id
    __args__['endpointId'] = endpoint_id
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ga/getBasicAccelerateIpEndpointRelations:getBasicAccelerateIpEndpointRelations', __args__, opts=opts, typ=GetBasicAccelerateIpEndpointRelationsResult).value

    return AwaitableGetBasicAccelerateIpEndpointRelationsResult(
        accelerate_ip_id=pulumi.get(__ret__, 'accelerate_ip_id'),
        accelerator_id=pulumi.get(__ret__, 'accelerator_id'),
        endpoint_id=pulumi.get(__ret__, 'endpoint_id'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        relations=pulumi.get(__ret__, 'relations'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_basic_accelerate_ip_endpoint_relations)
def get_basic_accelerate_ip_endpoint_relations_output(accelerate_ip_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                      accelerator_id: Optional[pulumi.Input[str]] = None,
                                                      endpoint_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                      ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                                      output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                                      status: Optional[pulumi.Input[Optional[str]]] = None,
                                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBasicAccelerateIpEndpointRelationsResult]:
    """
    This data source provides the Global Accelerator (GA) Basic Accelerate Ip Endpoint Relations of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.194.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.ga.get_basic_accelerate_ip_endpoint_relations(ids=["example_id"],
        accelerator_id="example_id")
    pulumi.export("gaBasicAccelerateIpEndpointRelationsId1", ids.relations[0].id)
    ```


    :param str accelerate_ip_id: The ID of the Basic Accelerate IP.
    :param str accelerator_id: The ID of the Global Accelerator Basic Accelerator instance.
    :param str endpoint_id: The ID of the Basic Endpoint.
    :param Sequence[str] ids: A list of Global Accelerator Basic Accelerate Ip Endpoint Relations IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the Global Accelerator Basic Accelerate Ip Endpoint Relation. Valid Value: `active`.
    """
    ...
