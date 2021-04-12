# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetChangeSetsResult',
    'AwaitableGetChangeSetsResult',
    'get_change_sets',
]

@pulumi.output_type
class GetChangeSetsResult:
    """
    A collection of values returned by getChangeSets.
    """
    def __init__(__self__, change_set_name=None, enable_details=None, id=None, ids=None, name_regex=None, names=None, output_file=None, sets=None, stack_id=None, status=None):
        if change_set_name and not isinstance(change_set_name, str):
            raise TypeError("Expected argument 'change_set_name' to be a str")
        pulumi.set(__self__, "change_set_name", change_set_name)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
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
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if sets and not isinstance(sets, list):
            raise TypeError("Expected argument 'sets' to be a list")
        pulumi.set(__self__, "sets", sets)
        if stack_id and not isinstance(stack_id, str):
            raise TypeError("Expected argument 'stack_id' to be a str")
        pulumi.set(__self__, "stack_id", stack_id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="changeSetName")
    def change_set_name(self) -> Optional[str]:
        return pulumi.get(self, "change_set_name")

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
        return pulumi.get(self, "ids")

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

    @property
    @pulumi.getter
    def sets(self) -> Sequence['outputs.GetChangeSetsSetResult']:
        return pulumi.get(self, "sets")

    @property
    @pulumi.getter(name="stackId")
    def stack_id(self) -> str:
        return pulumi.get(self, "stack_id")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetChangeSetsResult(GetChangeSetsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetChangeSetsResult(
            change_set_name=self.change_set_name,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            sets=self.sets,
            stack_id=self.stack_id,
            status=self.status)


def get_change_sets(change_set_name: Optional[str] = None,
                    enable_details: Optional[bool] = None,
                    ids: Optional[Sequence[str]] = None,
                    name_regex: Optional[str] = None,
                    output_file: Optional[str] = None,
                    stack_id: Optional[str] = None,
                    status: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetChangeSetsResult:
    """
    This data source provides the Ros Change Sets of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.105.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.ros.get_change_sets(stack_id="example_value",
        ids=["example_value"],
        name_regex="the_resource_name")
    pulumi.export("firstRosChangeSetId", example.sets[0].id)
    ```


    :param str change_set_name: The name of the change set.  The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Change Set IDs.
    :param str name_regex: A regex string to filter results by Change Set name.
    :param str stack_id: The ID of the stack for which you want to create the change set. ROS generates the change set by comparing the stack information with the information that you submit, such as a modified template or different inputs.
    :param str status: The status of the change set.
    """
    __args__ = dict()
    __args__['changeSetName'] = change_set_name
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['stackId'] = stack_id
    __args__['status'] = status
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:ros/getChangeSets:getChangeSets', __args__, opts=opts, typ=GetChangeSetsResult).value

    return AwaitableGetChangeSetsResult(
        change_set_name=__ret__.change_set_name,
        enable_details=__ret__.enable_details,
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        sets=__ret__.sets,
        stack_id=__ret__.stack_id,
        status=__ret__.status)
