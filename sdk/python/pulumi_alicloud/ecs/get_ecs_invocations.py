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
    'GetEcsInvocationsResult',
    'AwaitableGetEcsInvocationsResult',
    'get_ecs_invocations',
    'get_ecs_invocations_output',
]

@pulumi.output_type
class GetEcsInvocationsResult:
    """
    A collection of values returned by getEcsInvocations.
    """
    def __init__(__self__, command_id=None, content_encoding=None, id=None, ids=None, invocations=None, invoke_status=None, output_file=None, page_number=None, page_size=None):
        if command_id and not isinstance(command_id, str):
            raise TypeError("Expected argument 'command_id' to be a str")
        pulumi.set(__self__, "command_id", command_id)
        if content_encoding and not isinstance(content_encoding, str):
            raise TypeError("Expected argument 'content_encoding' to be a str")
        pulumi.set(__self__, "content_encoding", content_encoding)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if invocations and not isinstance(invocations, list):
            raise TypeError("Expected argument 'invocations' to be a list")
        pulumi.set(__self__, "invocations", invocations)
        if invoke_status and not isinstance(invoke_status, str):
            raise TypeError("Expected argument 'invoke_status' to be a str")
        pulumi.set(__self__, "invoke_status", invoke_status)
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
    @pulumi.getter(name="commandId")
    def command_id(self) -> Optional[str]:
        return pulumi.get(self, "command_id")

    @property
    @pulumi.getter(name="contentEncoding")
    def content_encoding(self) -> Optional[str]:
        return pulumi.get(self, "content_encoding")

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
    def invocations(self) -> Sequence['outputs.GetEcsInvocationsInvocationResult']:
        return pulumi.get(self, "invocations")

    @property
    @pulumi.getter(name="invokeStatus")
    def invoke_status(self) -> Optional[str]:
        return pulumi.get(self, "invoke_status")

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


class AwaitableGetEcsInvocationsResult(GetEcsInvocationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEcsInvocationsResult(
            command_id=self.command_id,
            content_encoding=self.content_encoding,
            id=self.id,
            ids=self.ids,
            invocations=self.invocations,
            invoke_status=self.invoke_status,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size)


def get_ecs_invocations(command_id: Optional[str] = None,
                        content_encoding: Optional[str] = None,
                        ids: Optional[Sequence[str]] = None,
                        invoke_status: Optional[str] = None,
                        output_file: Optional[str] = None,
                        page_number: Optional[int] = None,
                        page_size: Optional[int] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEcsInvocationsResult:
    """
    This data source provides the Ecs Invocations of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.168.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.ecs.get_ecs_invocations(ids=["example-id"])
    pulumi.export("ecsInvocationId1", ids.invocations[0].id)
    ```


    :param str command_id: The ID of the command.
    :param str content_encoding: The encoding mode of the CommandContent and Output response parameters. Valid values: `PlainText`, `Base64`.
    :param Sequence[str] ids: A list of Invocation IDs.
    :param str invoke_status: The overall execution state of the command. **Note:** We recommend that you ignore this parameter and check the value of the `invocation_status` response parameter for the overall execution state.
    """
    __args__ = dict()
    __args__['commandId'] = command_id
    __args__['contentEncoding'] = content_encoding
    __args__['ids'] = ids
    __args__['invokeStatus'] = invoke_status
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ecs/getEcsInvocations:getEcsInvocations', __args__, opts=opts, typ=GetEcsInvocationsResult).value

    return AwaitableGetEcsInvocationsResult(
        command_id=__ret__.command_id,
        content_encoding=__ret__.content_encoding,
        id=__ret__.id,
        ids=__ret__.ids,
        invocations=__ret__.invocations,
        invoke_status=__ret__.invoke_status,
        output_file=__ret__.output_file,
        page_number=__ret__.page_number,
        page_size=__ret__.page_size)


@_utilities.lift_output_func(get_ecs_invocations)
def get_ecs_invocations_output(command_id: Optional[pulumi.Input[Optional[str]]] = None,
                               content_encoding: Optional[pulumi.Input[Optional[str]]] = None,
                               ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               invoke_status: Optional[pulumi.Input[Optional[str]]] = None,
                               output_file: Optional[pulumi.Input[Optional[str]]] = None,
                               page_number: Optional[pulumi.Input[Optional[int]]] = None,
                               page_size: Optional[pulumi.Input[Optional[int]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEcsInvocationsResult]:
    """
    This data source provides the Ecs Invocations of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.168.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.ecs.get_ecs_invocations(ids=["example-id"])
    pulumi.export("ecsInvocationId1", ids.invocations[0].id)
    ```


    :param str command_id: The ID of the command.
    :param str content_encoding: The encoding mode of the CommandContent and Output response parameters. Valid values: `PlainText`, `Base64`.
    :param Sequence[str] ids: A list of Invocation IDs.
    :param str invoke_status: The overall execution state of the command. **Note:** We recommend that you ignore this parameter and check the value of the `invocation_status` response parameter for the overall execution state.
    """
    ...
