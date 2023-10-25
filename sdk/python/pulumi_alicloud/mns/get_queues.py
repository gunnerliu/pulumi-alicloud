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
    'GetQueuesResult',
    'AwaitableGetQueuesResult',
    'get_queues',
    'get_queues_output',
]

@pulumi.output_type
class GetQueuesResult:
    """
    A collection of values returned by getQueues.
    """
    def __init__(__self__, id=None, name_prefix=None, names=None, output_file=None, queues=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name_prefix and not isinstance(name_prefix, str):
            raise TypeError("Expected argument 'name_prefix' to be a str")
        pulumi.set(__self__, "name_prefix", name_prefix)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if queues and not isinstance(queues, list):
            raise TypeError("Expected argument 'queues' to be a list")
        pulumi.set(__self__, "queues", queues)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[str]:
        return pulumi.get(self, "name_prefix")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of queue names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def queues(self) -> Sequence['outputs.GetQueuesQueueResult']:
        """
        A list of queues. Each element contains the following attributes:
        """
        return pulumi.get(self, "queues")


class AwaitableGetQueuesResult(GetQueuesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetQueuesResult(
            id=self.id,
            name_prefix=self.name_prefix,
            names=self.names,
            output_file=self.output_file,
            queues=self.queues)


def get_queues(name_prefix: Optional[str] = None,
               output_file: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetQueuesResult:
    """
    This data source provides a list of MNS queues in an Alibaba Cloud account according to the specified parameters.

    > **DEPRECATED:**  This datasource has been deprecated from version `1.188.0`. Please use new datasource message_service_queues.


    :param str name_prefix: A string to filter resulting queues by their name prefixs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['namePrefix'] = name_prefix
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:mns/getQueues:getQueues', __args__, opts=opts, typ=GetQueuesResult).value

    return AwaitableGetQueuesResult(
        id=pulumi.get(__ret__, 'id'),
        name_prefix=pulumi.get(__ret__, 'name_prefix'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        queues=pulumi.get(__ret__, 'queues'))


@_utilities.lift_output_func(get_queues)
def get_queues_output(name_prefix: Optional[pulumi.Input[Optional[str]]] = None,
                      output_file: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetQueuesResult]:
    """
    This data source provides a list of MNS queues in an Alibaba Cloud account according to the specified parameters.

    > **DEPRECATED:**  This datasource has been deprecated from version `1.188.0`. Please use new datasource message_service_queues.


    :param str name_prefix: A string to filter resulting queues by their name prefixs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
