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
    'GetFlowsResult',
    'AwaitableGetFlowsResult',
    'get_flows',
    'get_flows_output',
]

@pulumi.output_type
class GetFlowsResult:
    """
    A collection of values returned by getFlows.
    """
    def __init__(__self__, flows=None, id=None, ids=None, limit=None, name_regex=None, names=None, output_file=None):
        if flows and not isinstance(flows, list):
            raise TypeError("Expected argument 'flows' to be a list")
        pulumi.set(__self__, "flows", flows)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if limit and not isinstance(limit, int):
            raise TypeError("Expected argument 'limit' to be a int")
        pulumi.set(__self__, "limit", limit)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @property
    @pulumi.getter
    def flows(self) -> Sequence['outputs.GetFlowsFlowResult']:
        return pulumi.get(self, "flows")

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
    @pulumi.getter
    def limit(self) -> Optional[int]:
        return pulumi.get(self, "limit")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetFlowsResult(GetFlowsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFlowsResult(
            flows=self.flows,
            id=self.id,
            ids=self.ids,
            limit=self.limit,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file)


def get_flows(ids: Optional[Sequence[str]] = None,
              limit: Optional[int] = None,
              name_regex: Optional[str] = None,
              output_file: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFlowsResult:
    """
    This data source provides the Fnf Flows of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.105.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.fnf.get_flows(ids=["example_value"],
        name_regex="the_resource_name")
    pulumi.export("firstFnfFlowId", example.flows[0].id)
    ```


    :param Sequence[str] ids: A list of Flow IDs.
    :param int limit: The number of resource queries.
    :param str name_regex: A regex string to filter results by Flow name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['limit'] = limit
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:fnf/getFlows:getFlows', __args__, opts=opts, typ=GetFlowsResult).value

    return AwaitableGetFlowsResult(
        flows=pulumi.get(__ret__, 'flows'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        limit=pulumi.get(__ret__, 'limit'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'))


@_utilities.lift_output_func(get_flows)
def get_flows_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                     limit: Optional[pulumi.Input[Optional[int]]] = None,
                     name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                     output_file: Optional[pulumi.Input[Optional[str]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFlowsResult]:
    """
    This data source provides the Fnf Flows of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.105.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.fnf.get_flows(ids=["example_value"],
        name_regex="the_resource_name")
    pulumi.export("firstFnfFlowId", example.flows[0].id)
    ```


    :param Sequence[str] ids: A list of Flow IDs.
    :param int limit: The number of resource queries.
    :param str name_regex: A regex string to filter results by Flow name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
