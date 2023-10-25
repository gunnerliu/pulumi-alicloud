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
    'GetDdosCooDomainResourcesResult',
    'AwaitableGetDdosCooDomainResourcesResult',
    'get_ddos_coo_domain_resources',
    'get_ddos_coo_domain_resources_output',
]

@pulumi.output_type
class GetDdosCooDomainResourcesResult:
    """
    A collection of values returned by getDdosCooDomainResources.
    """
    def __init__(__self__, id=None, ids=None, instance_ids=None, output_file=None, query_domain_pattern=None, resources=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_ids and not isinstance(instance_ids, list):
            raise TypeError("Expected argument 'instance_ids' to be a list")
        pulumi.set(__self__, "instance_ids", instance_ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if query_domain_pattern and not isinstance(query_domain_pattern, str):
            raise TypeError("Expected argument 'query_domain_pattern' to be a str")
        pulumi.set(__self__, "query_domain_pattern", query_domain_pattern)
        if resources and not isinstance(resources, list):
            raise TypeError("Expected argument 'resources' to be a list")
        pulumi.set(__self__, "resources", resources)

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
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "instance_ids")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="queryDomainPattern")
    def query_domain_pattern(self) -> Optional[str]:
        return pulumi.get(self, "query_domain_pattern")

    @property
    @pulumi.getter
    def resources(self) -> Sequence['outputs.GetDdosCooDomainResourcesResourceResult']:
        return pulumi.get(self, "resources")


class AwaitableGetDdosCooDomainResourcesResult(GetDdosCooDomainResourcesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDdosCooDomainResourcesResult(
            id=self.id,
            ids=self.ids,
            instance_ids=self.instance_ids,
            output_file=self.output_file,
            query_domain_pattern=self.query_domain_pattern,
            resources=self.resources)


def get_ddos_coo_domain_resources(ids: Optional[Sequence[str]] = None,
                                  instance_ids: Optional[Sequence[str]] = None,
                                  output_file: Optional[str] = None,
                                  query_domain_pattern: Optional[str] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDdosCooDomainResourcesResult:
    """
    This data source provides the Ddoscoo Domain Resources of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.123.0+.


    :param Sequence[str] ids: A list of Domain Resource IDs.
    :param Sequence[str] instance_ids: A list ID of instance that you want to associate.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str query_domain_pattern: Match the pattern.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['instanceIds'] = instance_ids
    __args__['outputFile'] = output_file
    __args__['queryDomainPattern'] = query_domain_pattern
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ddos/getDdosCooDomainResources:getDdosCooDomainResources', __args__, opts=opts, typ=GetDdosCooDomainResourcesResult).value

    return AwaitableGetDdosCooDomainResourcesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_ids=pulumi.get(__ret__, 'instance_ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        query_domain_pattern=pulumi.get(__ret__, 'query_domain_pattern'),
        resources=pulumi.get(__ret__, 'resources'))


@_utilities.lift_output_func(get_ddos_coo_domain_resources)
def get_ddos_coo_domain_resources_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                         instance_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                         output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                         query_domain_pattern: Optional[pulumi.Input[Optional[str]]] = None,
                                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDdosCooDomainResourcesResult]:
    """
    This data source provides the Ddoscoo Domain Resources of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.123.0+.


    :param Sequence[str] ids: A list of Domain Resource IDs.
    :param Sequence[str] instance_ids: A list ID of instance that you want to associate.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str query_domain_pattern: Match the pattern.
    """
    ...
