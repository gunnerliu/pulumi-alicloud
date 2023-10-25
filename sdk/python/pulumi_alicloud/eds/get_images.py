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
    'GetImagesResult',
    'AwaitableGetImagesResult',
    'get_images',
    'get_images_output',
]

@pulumi.output_type
class GetImagesResult:
    """
    A collection of values returned by getImages.
    """
    def __init__(__self__, desktop_instance_type=None, id=None, ids=None, image_type=None, images=None, name_regex=None, names=None, os_type=None, output_file=None, status=None):
        if desktop_instance_type and not isinstance(desktop_instance_type, str):
            raise TypeError("Expected argument 'desktop_instance_type' to be a str")
        pulumi.set(__self__, "desktop_instance_type", desktop_instance_type)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if image_type and not isinstance(image_type, str):
            raise TypeError("Expected argument 'image_type' to be a str")
        pulumi.set(__self__, "image_type", image_type)
        if images and not isinstance(images, list):
            raise TypeError("Expected argument 'images' to be a list")
        pulumi.set(__self__, "images", images)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if os_type and not isinstance(os_type, str):
            raise TypeError("Expected argument 'os_type' to be a str")
        pulumi.set(__self__, "os_type", os_type)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="desktopInstanceType")
    def desktop_instance_type(self) -> Optional[str]:
        return pulumi.get(self, "desktop_instance_type")

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
    @pulumi.getter(name="imageType")
    def image_type(self) -> Optional[str]:
        return pulumi.get(self, "image_type")

    @property
    @pulumi.getter
    def images(self) -> Sequence['outputs.GetImagesImageResult']:
        return pulumi.get(self, "images")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="osType")
    def os_type(self) -> Optional[str]:
        return pulumi.get(self, "os_type")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetImagesResult(GetImagesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetImagesResult(
            desktop_instance_type=self.desktop_instance_type,
            id=self.id,
            ids=self.ids,
            image_type=self.image_type,
            images=self.images,
            name_regex=self.name_regex,
            names=self.names,
            os_type=self.os_type,
            output_file=self.output_file,
            status=self.status)


def get_images(desktop_instance_type: Optional[str] = None,
               ids: Optional[Sequence[str]] = None,
               image_type: Optional[str] = None,
               name_regex: Optional[str] = None,
               os_type: Optional[str] = None,
               output_file: Optional[str] = None,
               status: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetImagesResult:
    """
    This data source provides the Ecd Images of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.146.0+.


    :param str desktop_instance_type: The desktop type of the image.
    :param Sequence[str] ids: A list of Image IDs.
    :param str image_type: The image type of the image. Valid values: `SYSTEM`, `CUSTOM`.
    :param str name_regex: A regex string to filter results by Image name.
    :param str os_type: The os type of the image.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the image. Valid values: `Creating`, `Available`, `CreateFailed`.
    """
    __args__ = dict()
    __args__['desktopInstanceType'] = desktop_instance_type
    __args__['ids'] = ids
    __args__['imageType'] = image_type
    __args__['nameRegex'] = name_regex
    __args__['osType'] = os_type
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:eds/getImages:getImages', __args__, opts=opts, typ=GetImagesResult).value

    return AwaitableGetImagesResult(
        desktop_instance_type=pulumi.get(__ret__, 'desktop_instance_type'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        image_type=pulumi.get(__ret__, 'image_type'),
        images=pulumi.get(__ret__, 'images'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        os_type=pulumi.get(__ret__, 'os_type'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_images)
def get_images_output(desktop_instance_type: Optional[pulumi.Input[Optional[str]]] = None,
                      ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                      image_type: Optional[pulumi.Input[Optional[str]]] = None,
                      name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                      os_type: Optional[pulumi.Input[Optional[str]]] = None,
                      output_file: Optional[pulumi.Input[Optional[str]]] = None,
                      status: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetImagesResult]:
    """
    This data source provides the Ecd Images of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.146.0+.


    :param str desktop_instance_type: The desktop type of the image.
    :param Sequence[str] ids: A list of Image IDs.
    :param str image_type: The image type of the image. Valid values: `SYSTEM`, `CUSTOM`.
    :param str name_regex: A regex string to filter results by Image name.
    :param str os_type: The os type of the image.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the image. Valid values: `Creating`, `Available`, `CreateFailed`.
    """
    ...
