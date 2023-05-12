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
    'GetIntegrationExportersResult',
    'AwaitableGetIntegrationExportersResult',
    'get_integration_exporters',
    'get_integration_exporters_output',
]

@pulumi.output_type
class GetIntegrationExportersResult:
    """
    A collection of values returned by getIntegrationExporters.
    """
    def __init__(__self__, cluster_id=None, id=None, ids=None, integration_exporters=None, integration_type=None, output_file=None):
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if integration_exporters and not isinstance(integration_exporters, list):
            raise TypeError("Expected argument 'integration_exporters' to be a list")
        pulumi.set(__self__, "integration_exporters", integration_exporters)
        if integration_type and not isinstance(integration_type, str):
            raise TypeError("Expected argument 'integration_type' to be a str")
        pulumi.set(__self__, "integration_type", integration_type)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        """
        The ID of the Prometheus instance.
        """
        return pulumi.get(self, "cluster_id")

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
    @pulumi.getter(name="integrationExporters")
    def integration_exporters(self) -> Sequence['outputs.GetIntegrationExportersIntegrationExporterResult']:
        """
        A list of Integration Exporters. Each element contains the following attributes:
        """
        return pulumi.get(self, "integration_exporters")

    @property
    @pulumi.getter(name="integrationType")
    def integration_type(self) -> str:
        """
        The type of prometheus integration.
        """
        return pulumi.get(self, "integration_type")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetIntegrationExportersResult(GetIntegrationExportersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIntegrationExportersResult(
            cluster_id=self.cluster_id,
            id=self.id,
            ids=self.ids,
            integration_exporters=self.integration_exporters,
            integration_type=self.integration_type,
            output_file=self.output_file)


def get_integration_exporters(cluster_id: Optional[str] = None,
                              ids: Optional[Sequence[str]] = None,
                              integration_type: Optional[str] = None,
                              output_file: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIntegrationExportersResult:
    """
    This data source provides the Arms Integration Exporters of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.203.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.arms.get_integration_exporters(ids=["example_id"],
        cluster_id="your_cluster_id",
        integration_type="kafka")
    pulumi.export("armsIntegrationExportersId1", ids.integration_exporters[0].id)
    ```


    :param str cluster_id: The ID of the Prometheus instance.
    :param Sequence[str] ids: A list of Integration Exporter IDs.
    :param str integration_type: The type of prometheus integration.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['ids'] = ids
    __args__['integrationType'] = integration_type
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:arms/getIntegrationExporters:getIntegrationExporters', __args__, opts=opts, typ=GetIntegrationExportersResult).value

    return AwaitableGetIntegrationExportersResult(
        cluster_id=__ret__.cluster_id,
        id=__ret__.id,
        ids=__ret__.ids,
        integration_exporters=__ret__.integration_exporters,
        integration_type=__ret__.integration_type,
        output_file=__ret__.output_file)


@_utilities.lift_output_func(get_integration_exporters)
def get_integration_exporters_output(cluster_id: Optional[pulumi.Input[str]] = None,
                                     ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                     integration_type: Optional[pulumi.Input[str]] = None,
                                     output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetIntegrationExportersResult]:
    """
    This data source provides the Arms Integration Exporters of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.203.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.arms.get_integration_exporters(ids=["example_id"],
        cluster_id="your_cluster_id",
        integration_type="kafka")
    pulumi.export("armsIntegrationExportersId1", ids.integration_exporters[0].id)
    ```


    :param str cluster_id: The ID of the Prometheus instance.
    :param Sequence[str] ids: A list of Integration Exporter IDs.
    :param str integration_type: The type of prometheus integration.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
