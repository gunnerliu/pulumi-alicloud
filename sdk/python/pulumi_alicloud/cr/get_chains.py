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
    'GetChainsResult',
    'AwaitableGetChainsResult',
    'get_chains',
    'get_chains_output',
]

@pulumi.output_type
class GetChainsResult:
    """
    A collection of values returned by getChains.
    """
    def __init__(__self__, chains=None, enable_details=None, id=None, ids=None, instance_id=None, name_regex=None, names=None, output_file=None, repo_name=None, repo_namespace_name=None):
        if chains and not isinstance(chains, list):
            raise TypeError("Expected argument 'chains' to be a list")
        pulumi.set(__self__, "chains", chains)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if repo_name and not isinstance(repo_name, str):
            raise TypeError("Expected argument 'repo_name' to be a str")
        pulumi.set(__self__, "repo_name", repo_name)
        if repo_namespace_name and not isinstance(repo_namespace_name, str):
            raise TypeError("Expected argument 'repo_namespace_name' to be a str")
        pulumi.set(__self__, "repo_namespace_name", repo_namespace_name)

    @property
    @pulumi.getter
    def chains(self) -> Sequence['outputs.GetChainsChainResult']:
        """
        A list of Cr Chains. Each element contains the following attributes:
        """
        return pulumi.get(self, "chains")

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

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
        A list of Chain IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        The ID of CR Enterprise Edition instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of Chain names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="repoName")
    def repo_name(self) -> Optional[str]:
        return pulumi.get(self, "repo_name")

    @property
    @pulumi.getter(name="repoNamespaceName")
    def repo_namespace_name(self) -> Optional[str]:
        return pulumi.get(self, "repo_namespace_name")


class AwaitableGetChainsResult(GetChainsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetChainsResult(
            chains=self.chains,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            repo_name=self.repo_name,
            repo_namespace_name=self.repo_namespace_name)


def get_chains(enable_details: Optional[bool] = None,
               ids: Optional[Sequence[str]] = None,
               instance_id: Optional[str] = None,
               name_regex: Optional[str] = None,
               output_file: Optional[str] = None,
               repo_name: Optional[str] = None,
               repo_namespace_name: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetChainsResult:
    """
    This data source provides the Cr Chains of the current Alibaba Cloud user.

    For information about CR Chains and how to use it, see [What is Chain](https://www.alibabacloud.com/help/en/doc-detail/357821.html).

    > **NOTE:** Available in v1.161.0+.


    :param Sequence[str] ids: A list of Chain IDs.
    :param str instance_id: The ID of CR Enterprise Edition instance.
    :param str name_regex: A regex string to filter results by Chain name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str repo_name: The name of CR Enterprise Edition repository.
    :param str repo_namespace_name: The name of CR Enterprise Edition namespace.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['repoName'] = repo_name
    __args__['repoNamespaceName'] = repo_namespace_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cr/getChains:getChains', __args__, opts=opts, typ=GetChainsResult).value

    return AwaitableGetChainsResult(
        chains=pulumi.get(__ret__, 'chains'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        repo_name=pulumi.get(__ret__, 'repo_name'),
        repo_namespace_name=pulumi.get(__ret__, 'repo_namespace_name'))


@_utilities.lift_output_func(get_chains)
def get_chains_output(enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                      ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                      instance_id: Optional[pulumi.Input[str]] = None,
                      name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                      output_file: Optional[pulumi.Input[Optional[str]]] = None,
                      repo_name: Optional[pulumi.Input[Optional[str]]] = None,
                      repo_namespace_name: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetChainsResult]:
    """
    This data source provides the Cr Chains of the current Alibaba Cloud user.

    For information about CR Chains and how to use it, see [What is Chain](https://www.alibabacloud.com/help/en/doc-detail/357821.html).

    > **NOTE:** Available in v1.161.0+.


    :param Sequence[str] ids: A list of Chain IDs.
    :param str instance_id: The ID of CR Enterprise Edition instance.
    :param str name_regex: A regex string to filter results by Chain name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str repo_name: The name of CR Enterprise Edition repository.
    :param str repo_namespace_name: The name of CR Enterprise Edition namespace.
    """
    ...
