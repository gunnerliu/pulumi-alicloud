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
    'GetHoneypotImagesResult',
    'AwaitableGetHoneypotImagesResult',
    'get_honeypot_images',
    'get_honeypot_images_output',
]

@pulumi.output_type
class GetHoneypotImagesResult:
    """
    A collection of values returned by getHoneypotImages.
    """
    def __init__(__self__, id=None, ids=None, images=None, name_regex=None, names=None, node_id=None, output_file=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if images and not isinstance(images, list):
            raise TypeError("Expected argument 'images' to be a list")
        pulumi.set(__self__, "images", images)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if node_id and not isinstance(node_id, str):
            raise TypeError("Expected argument 'node_id' to be a str")
        pulumi.set(__self__, "node_id", node_id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

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
        A list of Honeypot Image IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter
    def images(self) -> Sequence['outputs.GetHoneypotImagesImageResult']:
        """
        A list of Honeypot Image Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "images")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of name of Honeypot Images.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> Optional[str]:
        return pulumi.get(self, "node_id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetHoneypotImagesResult(GetHoneypotImagesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHoneypotImagesResult(
            id=self.id,
            ids=self.ids,
            images=self.images,
            name_regex=self.name_regex,
            names=self.names,
            node_id=self.node_id,
            output_file=self.output_file)


def get_honeypot_images(ids: Optional[Sequence[str]] = None,
                        name_regex: Optional[str] = None,
                        node_id: Optional[str] = None,
                        output_file: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHoneypotImagesResult:
    """
    This data source provides Threat Detection Honeypot Image available to the user.[What is Honeypot Image](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-listavailablehoneypot)

    > **NOTE:** Available in 1.195.0+


    :param Sequence[str] ids: A list of Honeypot Image IDs.
    :param str name_regex: A regex string to filter results by Honeypot mirror nam.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['nodeId'] = node_id
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:threatdetection/getHoneypotImages:getHoneypotImages', __args__, opts=opts, typ=GetHoneypotImagesResult).value

    return AwaitableGetHoneypotImagesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        images=pulumi.get(__ret__, 'images'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        node_id=pulumi.get(__ret__, 'node_id'),
        output_file=pulumi.get(__ret__, 'output_file'))


@_utilities.lift_output_func(get_honeypot_images)
def get_honeypot_images_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                               node_id: Optional[pulumi.Input[Optional[str]]] = None,
                               output_file: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetHoneypotImagesResult]:
    """
    This data source provides Threat Detection Honeypot Image available to the user.[What is Honeypot Image](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-listavailablehoneypot)

    > **NOTE:** Available in 1.195.0+


    :param Sequence[str] ids: A list of Honeypot Image IDs.
    :param str name_regex: A regex string to filter results by Honeypot mirror nam.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
