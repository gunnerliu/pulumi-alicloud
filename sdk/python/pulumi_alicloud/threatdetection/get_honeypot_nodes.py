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
    'GetHoneypotNodesResult',
    'AwaitableGetHoneypotNodesResult',
    'get_honeypot_nodes',
    'get_honeypot_nodes_output',
]

@pulumi.output_type
class GetHoneypotNodesResult:
    """
    A collection of values returned by getHoneypotNodes.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, node_id=None, node_name=None, nodes=None, output_file=None, page_number=None, page_size=None):
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
        if node_id and not isinstance(node_id, str):
            raise TypeError("Expected argument 'node_id' to be a str")
        pulumi.set(__self__, "node_id", node_id)
        if node_name and not isinstance(node_name, str):
            raise TypeError("Expected argument 'node_name' to be a str")
        pulumi.set(__self__, "node_name", node_name)
        if nodes and not isinstance(nodes, list):
            raise TypeError("Expected argument 'nodes' to be a list")
        pulumi.set(__self__, "nodes", nodes)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)

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
        A list of Honeypot Node IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of Honeypot Node names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> Optional[str]:
        """
        Honeypot management node id.
        """
        return pulumi.get(self, "node_id")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[str]:
        """
        Management node name.
        """
        return pulumi.get(self, "node_name")

    @property
    @pulumi.getter
    def nodes(self) -> Sequence['outputs.GetHoneypotNodesNodeResult']:
        """
        A list of Honeypot Node Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "nodes")

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


class AwaitableGetHoneypotNodesResult(GetHoneypotNodesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHoneypotNodesResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            node_id=self.node_id,
            node_name=self.node_name,
            nodes=self.nodes,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size)


def get_honeypot_nodes(ids: Optional[Sequence[str]] = None,
                       name_regex: Optional[str] = None,
                       node_id: Optional[str] = None,
                       node_name: Optional[str] = None,
                       output_file: Optional[str] = None,
                       page_number: Optional[int] = None,
                       page_size: Optional[int] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHoneypotNodesResult:
    """
    This data source provides Threat Detection Honeypot Node available to the user.[What is Honeypot Node](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypotnode)

    > **NOTE:** Available in 1.195.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.threatdetection.get_honeypot_nodes(ids=[alicloud_threat_detection_honeypot_node["default"]["id"]])
    pulumi.export("alicloudThreatDetectionHoneypotNodeExampleId", default.nodes[0].id)
    ```


    :param Sequence[str] ids: A list of Honeypot Node IDs.
    :param str name_regex: A regex string to filter results by Honeypot Node name.
    :param str node_id: Honeypot management node id.
    :param str node_name: The name of the management node.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['nodeId'] = node_id
    __args__['nodeName'] = node_name
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:threatdetection/getHoneypotNodes:getHoneypotNodes', __args__, opts=opts, typ=GetHoneypotNodesResult).value

    return AwaitableGetHoneypotNodesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        node_id=pulumi.get(__ret__, 'node_id'),
        node_name=pulumi.get(__ret__, 'node_name'),
        nodes=pulumi.get(__ret__, 'nodes'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'))


@_utilities.lift_output_func(get_honeypot_nodes)
def get_honeypot_nodes_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                              name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                              node_id: Optional[pulumi.Input[Optional[str]]] = None,
                              node_name: Optional[pulumi.Input[Optional[str]]] = None,
                              output_file: Optional[pulumi.Input[Optional[str]]] = None,
                              page_number: Optional[pulumi.Input[Optional[int]]] = None,
                              page_size: Optional[pulumi.Input[Optional[int]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetHoneypotNodesResult]:
    """
    This data source provides Threat Detection Honeypot Node available to the user.[What is Honeypot Node](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypotnode)

    > **NOTE:** Available in 1.195.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.threatdetection.get_honeypot_nodes(ids=[alicloud_threat_detection_honeypot_node["default"]["id"]])
    pulumi.export("alicloudThreatDetectionHoneypotNodeExampleId", default.nodes[0].id)
    ```


    :param Sequence[str] ids: A list of Honeypot Node IDs.
    :param str name_regex: A regex string to filter results by Honeypot Node name.
    :param str node_id: Honeypot management node id.
    :param str node_name: The name of the management node.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
