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
    'GetBundlesResult',
    'AwaitableGetBundlesResult',
    'get_bundles',
    'get_bundles_output',
]

@pulumi.output_type
class GetBundlesResult:
    """
    A collection of values returned by getBundles.
    """
    def __init__(__self__, bundle_ids=None, bundle_type=None, bundles=None, id=None, ids=None, name_regex=None, names=None, output_file=None):
        if bundle_ids and not isinstance(bundle_ids, list):
            raise TypeError("Expected argument 'bundle_ids' to be a list")
        pulumi.set(__self__, "bundle_ids", bundle_ids)
        if bundle_type and not isinstance(bundle_type, str):
            raise TypeError("Expected argument 'bundle_type' to be a str")
        pulumi.set(__self__, "bundle_type", bundle_type)
        if bundles and not isinstance(bundles, list):
            raise TypeError("Expected argument 'bundles' to be a list")
        pulumi.set(__self__, "bundles", bundles)
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

    @property
    @pulumi.getter(name="bundleIds")
    def bundle_ids(self) -> Sequence[str]:
        return pulumi.get(self, "bundle_ids")

    @property
    @pulumi.getter(name="bundleType")
    def bundle_type(self) -> Optional[str]:
        return pulumi.get(self, "bundle_type")

    @property
    @pulumi.getter
    def bundles(self) -> Sequence['outputs.GetBundlesBundleResult']:
        return pulumi.get(self, "bundles")

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


class AwaitableGetBundlesResult(GetBundlesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBundlesResult(
            bundle_ids=self.bundle_ids,
            bundle_type=self.bundle_type,
            bundles=self.bundles,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file)


def get_bundles(bundle_ids: Optional[Sequence[str]] = None,
                bundle_type: Optional[str] = None,
                ids: Optional[Sequence[str]] = None,
                name_regex: Optional[str] = None,
                output_file: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBundlesResult:
    """
    This data source provides the Ecd bundles of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.143.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.eds.get_bundles(bundle_type="SYSTEM")
    ```


    :param Sequence[str] bundle_ids: The bundle id of the bundle.
    :param str bundle_type: The bundle type of  the bundle. Valid values: `SYSTEM`,`CUSTOM`.
    :param Sequence[str] ids: A list of Bundle IDs.
    :param str name_regex: A regex string to filter results by Bundle name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['bundleIds'] = bundle_ids
    __args__['bundleType'] = bundle_type
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:eds/getBundles:getBundles', __args__, opts=opts, typ=GetBundlesResult).value

    return AwaitableGetBundlesResult(
        bundle_ids=__ret__.bundle_ids,
        bundle_type=__ret__.bundle_type,
        bundles=__ret__.bundles,
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file)


@_utilities.lift_output_func(get_bundles)
def get_bundles_output(bundle_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                       bundle_type: Optional[pulumi.Input[Optional[str]]] = None,
                       ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                       name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                       output_file: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBundlesResult]:
    """
    This data source provides the Ecd bundles of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.143.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.eds.get_bundles(bundle_type="SYSTEM")
    ```


    :param Sequence[str] bundle_ids: The bundle id of the bundle.
    :param str bundle_type: The bundle type of  the bundle. Valid values: `SYSTEM`,`CUSTOM`.
    :param Sequence[str] ids: A list of Bundle IDs.
    :param str name_regex: A regex string to filter results by Bundle name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
