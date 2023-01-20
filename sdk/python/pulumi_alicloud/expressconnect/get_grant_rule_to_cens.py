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
    'GetGrantRuleToCensResult',
    'AwaitableGetGrantRuleToCensResult',
    'get_grant_rule_to_cens',
    'get_grant_rule_to_cens_output',
]

@pulumi.output_type
class GetGrantRuleToCensResult:
    """
    A collection of values returned by getGrantRuleToCens.
    """
    def __init__(__self__, cens=None, id=None, ids=None, instance_id=None, output_file=None, page_number=None, page_size=None):
        if cens and not isinstance(cens, list):
            raise TypeError("Expected argument 'cens' to be a list")
        pulumi.set(__self__, "cens", cens)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
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
    def cens(self) -> Sequence['outputs.GetGrantRuleToCensCenResult']:
        """
        A list of Express Connect Grant Rule To Cens. Each element contains the following attributes:
        """
        return pulumi.get(self, "cens")

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
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        return pulumi.get(self, "instance_id")

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


class AwaitableGetGrantRuleToCensResult(GetGrantRuleToCensResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGrantRuleToCensResult(
            cens=self.cens,
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size)


def get_grant_rule_to_cens(ids: Optional[Sequence[str]] = None,
                           instance_id: Optional[str] = None,
                           output_file: Optional[str] = None,
                           page_number: Optional[int] = None,
                           page_size: Optional[int] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGrantRuleToCensResult:
    """
    This data source provides the Express Connect Grant Rule To Cens of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.196.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.expressconnect.get_grant_rule_to_cens(ids=["example_id"],
        instance_id="your_vbr_instance_id")
    pulumi.export("expressConnectGrantRuleToCenId0", ids.cens[0].id)
    ```


    :param Sequence[str] ids: A list of Grant Rule To Cen IDs.
    :param str instance_id: The ID of the VBR.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:expressconnect/getGrantRuleToCens:getGrantRuleToCens', __args__, opts=opts, typ=GetGrantRuleToCensResult).value

    return AwaitableGetGrantRuleToCensResult(
        cens=__ret__.cens,
        id=__ret__.id,
        ids=__ret__.ids,
        instance_id=__ret__.instance_id,
        output_file=__ret__.output_file,
        page_number=__ret__.page_number,
        page_size=__ret__.page_size)


@_utilities.lift_output_func(get_grant_rule_to_cens)
def get_grant_rule_to_cens_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                  instance_id: Optional[pulumi.Input[str]] = None,
                                  output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                  page_number: Optional[pulumi.Input[Optional[int]]] = None,
                                  page_size: Optional[pulumi.Input[Optional[int]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGrantRuleToCensResult]:
    """
    This data source provides the Express Connect Grant Rule To Cens of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.196.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.expressconnect.get_grant_rule_to_cens(ids=["example_id"],
        instance_id="your_vbr_instance_id")
    pulumi.export("expressConnectGrantRuleToCenId0", ids.cens[0].id)
    ```


    :param Sequence[str] ids: A list of Grant Rule To Cen IDs.
    :param str instance_id: The ID of the VBR.
    """
    ...
