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
    'GetHoneypotPresetsResult',
    'AwaitableGetHoneypotPresetsResult',
    'get_honeypot_presets',
    'get_honeypot_presets_output',
]

@pulumi.output_type
class GetHoneypotPresetsResult:
    """
    A collection of values returned by getHoneypotPresets.
    """
    def __init__(__self__, current_page=None, enable_details=None, honeypot_image_name=None, id=None, ids=None, lang=None, node_id=None, node_name=None, output_file=None, page_number=None, page_size=None, preset_name=None, presets=None):
        if current_page and not isinstance(current_page, int):
            raise TypeError("Expected argument 'current_page' to be a int")
        pulumi.set(__self__, "current_page", current_page)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if honeypot_image_name and not isinstance(honeypot_image_name, str):
            raise TypeError("Expected argument 'honeypot_image_name' to be a str")
        pulumi.set(__self__, "honeypot_image_name", honeypot_image_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if lang and not isinstance(lang, str):
            raise TypeError("Expected argument 'lang' to be a str")
        pulumi.set(__self__, "lang", lang)
        if node_id and not isinstance(node_id, str):
            raise TypeError("Expected argument 'node_id' to be a str")
        pulumi.set(__self__, "node_id", node_id)
        if node_name and not isinstance(node_name, str):
            raise TypeError("Expected argument 'node_name' to be a str")
        pulumi.set(__self__, "node_name", node_name)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)
        if preset_name and not isinstance(preset_name, str):
            raise TypeError("Expected argument 'preset_name' to be a str")
        pulumi.set(__self__, "preset_name", preset_name)
        if presets and not isinstance(presets, list):
            raise TypeError("Expected argument 'presets' to be a list")
        pulumi.set(__self__, "presets", presets)

    @property
    @pulumi.getter(name="currentPage")
    def current_page(self) -> Optional[int]:
        return pulumi.get(self, "current_page")

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

    @property
    @pulumi.getter(name="honeypotImageName")
    def honeypot_image_name(self) -> Optional[str]:
        """
        Honeypot mirror name.
        """
        return pulumi.get(self, "honeypot_image_name")

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
        A list of Honeypot Preset IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter
    def lang(self) -> Optional[str]:
        return pulumi.get(self, "lang")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> Optional[str]:
        """
        Unique id of management node.
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
    @pulumi.getter(name="pageNumber")
    def page_number(self) -> Optional[int]:
        return pulumi.get(self, "page_number")

    @property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[int]:
        return pulumi.get(self, "page_size")

    @property
    @pulumi.getter(name="presetName")
    def preset_name(self) -> Optional[str]:
        """
        Honeypot template custom name.
        """
        return pulumi.get(self, "preset_name")

    @property
    @pulumi.getter
    def presets(self) -> Sequence['outputs.GetHoneypotPresetsPresetResult']:
        """
        A list of Honeypot Preset Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "presets")


class AwaitableGetHoneypotPresetsResult(GetHoneypotPresetsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHoneypotPresetsResult(
            current_page=self.current_page,
            enable_details=self.enable_details,
            honeypot_image_name=self.honeypot_image_name,
            id=self.id,
            ids=self.ids,
            lang=self.lang,
            node_id=self.node_id,
            node_name=self.node_name,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            preset_name=self.preset_name,
            presets=self.presets)


def get_honeypot_presets(current_page: Optional[int] = None,
                         enable_details: Optional[bool] = None,
                         honeypot_image_name: Optional[str] = None,
                         ids: Optional[Sequence[str]] = None,
                         lang: Optional[str] = None,
                         node_id: Optional[str] = None,
                         node_name: Optional[str] = None,
                         output_file: Optional[str] = None,
                         page_number: Optional[int] = None,
                         page_size: Optional[int] = None,
                         preset_name: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHoneypotPresetsResult:
    """
    This data source provides Threat Detection Honeypot Preset available to the user.

    > **NOTE:** Available in 1.195.0+


    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param str honeypot_image_name: Honeypot mirror name
    :param Sequence[str] ids: A list of Honeypot Preset IDs.
    :param str node_id: Unique id of management node
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str preset_name: Honeypot template custom name
    """
    __args__ = dict()
    __args__['currentPage'] = current_page
    __args__['enableDetails'] = enable_details
    __args__['honeypotImageName'] = honeypot_image_name
    __args__['ids'] = ids
    __args__['lang'] = lang
    __args__['nodeId'] = node_id
    __args__['nodeName'] = node_name
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['presetName'] = preset_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:threatdetection/getHoneypotPresets:getHoneypotPresets', __args__, opts=opts, typ=GetHoneypotPresetsResult).value

    return AwaitableGetHoneypotPresetsResult(
        current_page=pulumi.get(__ret__, 'current_page'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        honeypot_image_name=pulumi.get(__ret__, 'honeypot_image_name'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        lang=pulumi.get(__ret__, 'lang'),
        node_id=pulumi.get(__ret__, 'node_id'),
        node_name=pulumi.get(__ret__, 'node_name'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'),
        preset_name=pulumi.get(__ret__, 'preset_name'),
        presets=pulumi.get(__ret__, 'presets'))


@_utilities.lift_output_func(get_honeypot_presets)
def get_honeypot_presets_output(current_page: Optional[pulumi.Input[Optional[int]]] = None,
                                enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                                honeypot_image_name: Optional[pulumi.Input[Optional[str]]] = None,
                                ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                lang: Optional[pulumi.Input[Optional[str]]] = None,
                                node_id: Optional[pulumi.Input[Optional[str]]] = None,
                                node_name: Optional[pulumi.Input[Optional[str]]] = None,
                                output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                page_number: Optional[pulumi.Input[Optional[int]]] = None,
                                page_size: Optional[pulumi.Input[Optional[int]]] = None,
                                preset_name: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetHoneypotPresetsResult]:
    """
    This data source provides Threat Detection Honeypot Preset available to the user.

    > **NOTE:** Available in 1.195.0+


    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param str honeypot_image_name: Honeypot mirror name
    :param Sequence[str] ids: A list of Honeypot Preset IDs.
    :param str node_id: Unique id of management node
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str preset_name: Honeypot template custom name
    """
    ...
