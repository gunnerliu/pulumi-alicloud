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
    'GetHoneyPotsResult',
    'AwaitableGetHoneyPotsResult',
    'get_honey_pots',
    'get_honey_pots_output',
]

@pulumi.output_type
class GetHoneyPotsResult:
    """
    A collection of values returned by getHoneyPots.
    """
    def __init__(__self__, honeypot_id=None, honeypot_name=None, id=None, ids=None, name_regex=None, node_id=None, node_name=None, output_file=None, pots=None):
        if honeypot_id and not isinstance(honeypot_id, str):
            raise TypeError("Expected argument 'honeypot_id' to be a str")
        pulumi.set(__self__, "honeypot_id", honeypot_id)
        if honeypot_name and not isinstance(honeypot_name, str):
            raise TypeError("Expected argument 'honeypot_name' to be a str")
        pulumi.set(__self__, "honeypot_name", honeypot_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if node_id and not isinstance(node_id, str):
            raise TypeError("Expected argument 'node_id' to be a str")
        pulumi.set(__self__, "node_id", node_id)
        if node_name and not isinstance(node_name, str):
            raise TypeError("Expected argument 'node_name' to be a str")
        pulumi.set(__self__, "node_name", node_name)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if pots and not isinstance(pots, list):
            raise TypeError("Expected argument 'pots' to be a list")
        pulumi.set(__self__, "pots", pots)

    @property
    @pulumi.getter(name="honeypotId")
    def honeypot_id(self) -> Optional[str]:
        """
        Honeypot ID.
        """
        return pulumi.get(self, "honeypot_id")

    @property
    @pulumi.getter(name="honeypotName")
    def honeypot_name(self) -> Optional[str]:
        """
        Honeypot custom name.
        """
        return pulumi.get(self, "honeypot_name")

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
        A list of Honey Pot IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> Optional[str]:
        """
        The ID of the honeypot management node.
        """
        return pulumi.get(self, "node_id")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[str]:
        return pulumi.get(self, "node_name")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def pots(self) -> Sequence['outputs.GetHoneyPotsPotResult']:
        """
        A list of Honey Pot Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "pots")


class AwaitableGetHoneyPotsResult(GetHoneyPotsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHoneyPotsResult(
            honeypot_id=self.honeypot_id,
            honeypot_name=self.honeypot_name,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            node_id=self.node_id,
            node_name=self.node_name,
            output_file=self.output_file,
            pots=self.pots)


def get_honey_pots(honeypot_id: Optional[str] = None,
                   honeypot_name: Optional[str] = None,
                   ids: Optional[Sequence[str]] = None,
                   name_regex: Optional[str] = None,
                   node_id: Optional[str] = None,
                   node_name: Optional[str] = None,
                   output_file: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHoneyPotsResult:
    """
    This data source provides Threat Detection Honey Pot available to the user.[What is Honey Pot](https://www.alibabacloud.com/help/en/security-center/latest/api-doc-sas-2018-12-03-api-doc-createhoneypot)

    > **NOTE:** Available in 1.195.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.threatdetection.get_honey_pots(ids=["xxxx"],
        honeypot_name="tf-test",
        node_id="a44e1ab3-6945-444c-889d-5bacee7056e8")
    pulumi.export("alicloudThreatDetectionHoneyPotExampleId", default.pots[0].id)
    ```


    :param str honeypot_id: Honeypot ID.
    :param str honeypot_name: Honeypot custom name.
    :param Sequence[str] ids: A list of Honey Pot IDs.
    :param str name_regex: A regex string to filter results by honey pot name.
    :param str node_id: The ID of the honeypot management node.
    """
    __args__ = dict()
    __args__['honeypotId'] = honeypot_id
    __args__['honeypotName'] = honeypot_name
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['nodeId'] = node_id
    __args__['nodeName'] = node_name
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:threatdetection/getHoneyPots:getHoneyPots', __args__, opts=opts, typ=GetHoneyPotsResult).value

    return AwaitableGetHoneyPotsResult(
        honeypot_id=__ret__.honeypot_id,
        honeypot_name=__ret__.honeypot_name,
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        node_id=__ret__.node_id,
        node_name=__ret__.node_name,
        output_file=__ret__.output_file,
        pots=__ret__.pots)


@_utilities.lift_output_func(get_honey_pots)
def get_honey_pots_output(honeypot_id: Optional[pulumi.Input[Optional[str]]] = None,
                          honeypot_name: Optional[pulumi.Input[Optional[str]]] = None,
                          ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                          name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                          node_id: Optional[pulumi.Input[Optional[str]]] = None,
                          node_name: Optional[pulumi.Input[Optional[str]]] = None,
                          output_file: Optional[pulumi.Input[Optional[str]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetHoneyPotsResult]:
    """
    This data source provides Threat Detection Honey Pot available to the user.[What is Honey Pot](https://www.alibabacloud.com/help/en/security-center/latest/api-doc-sas-2018-12-03-api-doc-createhoneypot)

    > **NOTE:** Available in 1.195.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.threatdetection.get_honey_pots(ids=["xxxx"],
        honeypot_name="tf-test",
        node_id="a44e1ab3-6945-444c-889d-5bacee7056e8")
    pulumi.export("alicloudThreatDetectionHoneyPotExampleId", default.pots[0].id)
    ```


    :param str honeypot_id: Honeypot ID.
    :param str honeypot_name: Honeypot custom name.
    :param Sequence[str] ids: A list of Honey Pot IDs.
    :param str name_regex: A regex string to filter results by honey pot name.
    :param str node_id: The ID of the honeypot management node.
    """
    ...