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
    'GetTemplateScratchesResult',
    'AwaitableGetTemplateScratchesResult',
    'get_template_scratches',
    'get_template_scratches_output',
]

@pulumi.output_type
class GetTemplateScratchesResult:
    """
    A collection of values returned by getTemplateScratches.
    """
    def __init__(__self__, enable_details=None, id=None, ids=None, output_file=None, scratches=None, status=None, template_scratch_type=None):
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if scratches and not isinstance(scratches, list):
            raise TypeError("Expected argument 'scratches' to be a list")
        pulumi.set(__self__, "scratches", scratches)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if template_scratch_type and not isinstance(template_scratch_type, str):
            raise TypeError("Expected argument 'template_scratch_type' to be a str")
        pulumi.set(__self__, "template_scratch_type", template_scratch_type)

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
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def scratches(self) -> Sequence['outputs.GetTemplateScratchesScratchResult']:
        return pulumi.get(self, "scratches")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="templateScratchType")
    def template_scratch_type(self) -> Optional[str]:
        return pulumi.get(self, "template_scratch_type")


class AwaitableGetTemplateScratchesResult(GetTemplateScratchesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTemplateScratchesResult(
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            scratches=self.scratches,
            status=self.status,
            template_scratch_type=self.template_scratch_type)


def get_template_scratches(enable_details: Optional[bool] = None,
                           ids: Optional[Sequence[str]] = None,
                           output_file: Optional[str] = None,
                           status: Optional[str] = None,
                           template_scratch_type: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTemplateScratchesResult:
    """
    This data source provides the Ros Template Scratches of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.151.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.ros.get_template_scratches(ids=["example_value"])
    pulumi.export("rosTemplateScratchId1", ids.scratches[0].id)
    status = alicloud.ros.get_template_scratches(status="GENERATE_COMPLETE")
    pulumi.export("rosTemplateScratchId2", status.scratches[0].id)
    template_scratch_type = alicloud.ros.get_template_scratches(template_scratch_type="ResourceImport")
    pulumi.export("rosTemplateScratchId3", template_scratch_type.scratches[0].id)
    ```


    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Template Scratch IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the resource.
    :param str template_scratch_type: The type of the Template Scratch.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['templateScratchType'] = template_scratch_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ros/getTemplateScratches:getTemplateScratches', __args__, opts=opts, typ=GetTemplateScratchesResult).value

    return AwaitableGetTemplateScratchesResult(
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        scratches=pulumi.get(__ret__, 'scratches'),
        status=pulumi.get(__ret__, 'status'),
        template_scratch_type=pulumi.get(__ret__, 'template_scratch_type'))


@_utilities.lift_output_func(get_template_scratches)
def get_template_scratches_output(enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                                  ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                  output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                  status: Optional[pulumi.Input[Optional[str]]] = None,
                                  template_scratch_type: Optional[pulumi.Input[Optional[str]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTemplateScratchesResult]:
    """
    This data source provides the Ros Template Scratches of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.151.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.ros.get_template_scratches(ids=["example_value"])
    pulumi.export("rosTemplateScratchId1", ids.scratches[0].id)
    status = alicloud.ros.get_template_scratches(status="GENERATE_COMPLETE")
    pulumi.export("rosTemplateScratchId2", status.scratches[0].id)
    template_scratch_type = alicloud.ros.get_template_scratches(template_scratch_type="ResourceImport")
    pulumi.export("rosTemplateScratchId3", template_scratch_type.scratches[0].id)
    ```


    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Template Scratch IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the resource.
    :param str template_scratch_type: The type of the Template Scratch.
    """
    ...
