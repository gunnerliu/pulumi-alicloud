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
    'GetKubernetesAddonsResult',
    'AwaitableGetKubernetesAddonsResult',
    'get_kubernetes_addons',
    'get_kubernetes_addons_output',
]

@pulumi.output_type
class GetKubernetesAddonsResult:
    """
    A collection of values returned by getKubernetesAddons.
    """
    def __init__(__self__, addons=None, cluster_id=None, id=None, ids=None, name_regex=None, names=None):
        if addons and not isinstance(addons, list):
            raise TypeError("Expected argument 'addons' to be a list")
        pulumi.set(__self__, "addons", addons)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
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

    @property
    @pulumi.getter
    def addons(self) -> Sequence['outputs.GetKubernetesAddonsAddonResult']:
        """
        A list of addons.
        """
        return pulumi.get(self, "addons")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        """
        The id of kubernetes cluster.
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
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of addon names.
        """
        return pulumi.get(self, "names")


class AwaitableGetKubernetesAddonsResult(GetKubernetesAddonsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKubernetesAddonsResult(
            addons=self.addons,
            cluster_id=self.cluster_id,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names)


def get_kubernetes_addons(cluster_id: Optional[str] = None,
                          ids: Optional[Sequence[str]] = None,
                          name_regex: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKubernetesAddonsResult:
    """
    This data source provides a list of available addons that the cluster can install.

    > **NOTE:** Available since v1.150.0.
    **NOTE:** From version v1.166.0, support for returning custom configuration of kubernetes cluster addon.


    :param str cluster_id: The id of kubernetes cluster.
    :param Sequence[str] ids: A list of addon IDs. The id of addon consists of the cluster id and the addon name, with the structure <cluster_ud>:<addon_name>.
    :param str name_regex: A regex string to filter results by addon name.
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cs/getKubernetesAddons:getKubernetesAddons', __args__, opts=opts, typ=GetKubernetesAddonsResult).value

    return AwaitableGetKubernetesAddonsResult(
        addons=pulumi.get(__ret__, 'addons'),
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'))


@_utilities.lift_output_func(get_kubernetes_addons)
def get_kubernetes_addons_output(cluster_id: Optional[pulumi.Input[str]] = None,
                                 ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                 name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetKubernetesAddonsResult]:
    """
    This data source provides a list of available addons that the cluster can install.

    > **NOTE:** Available since v1.150.0.
    **NOTE:** From version v1.166.0, support for returning custom configuration of kubernetes cluster addon.


    :param str cluster_id: The id of kubernetes cluster.
    :param Sequence[str] ids: A list of addon IDs. The id of addon consists of the cluster id and the addon name, with the structure <cluster_ud>:<addon_name>.
    :param str name_regex: A regex string to filter results by addon name.
    """
    ...
