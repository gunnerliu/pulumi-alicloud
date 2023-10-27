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
    'GetAppsResult',
    'AwaitableGetAppsResult',
    'get_apps',
    'get_apps_output',
]

@pulumi.output_type
class GetAppsResult:
    """
    A collection of values returned by getApps.
    """
    def __init__(__self__, apps=None, enable_details=None, id=None, ids=None, name_regex=None, names=None, os_type=None, output_file=None, product_id=None):
        if apps and not isinstance(apps, list):
            raise TypeError("Expected argument 'apps' to be a list")
        pulumi.set(__self__, "apps", apps)
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
        if os_type and not isinstance(os_type, str):
            raise TypeError("Expected argument 'os_type' to be a str")
        pulumi.set(__self__, "os_type", os_type)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if product_id and not isinstance(product_id, str):
            raise TypeError("Expected argument 'product_id' to be a str")
        pulumi.set(__self__, "product_id", product_id)

    @property
    @pulumi.getter
    def apps(self) -> Sequence['outputs.GetAppsAppResult']:
        return pulumi.get(self, "apps")

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
    @pulumi.getter(name="osType")
    def os_type(self) -> Optional[str]:
        return pulumi.get(self, "os_type")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> str:
        return pulumi.get(self, "product_id")


class AwaitableGetAppsResult(GetAppsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppsResult(
            apps=self.apps,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            os_type=self.os_type,
            output_file=self.output_file,
            product_id=self.product_id)


def get_apps(enable_details: Optional[bool] = None,
             ids: Optional[Sequence[str]] = None,
             name_regex: Optional[str] = None,
             os_type: Optional[str] = None,
             output_file: Optional[str] = None,
             product_id: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppsResult:
    """
    This data source provides the Mhub Apps of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.138.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "example_value"
    default = alicloud.mhub.App("default",
        app_name=name,
        product_id=alicloud_mhub_product["default"]["id"],
        package_name="com.test.android",
        type="2")
    ids = alicloud.mhub.get_apps()
    pulumi.export("mhubAppId1", ids.apps[0].id)
    name_regex = alicloud.mhub.get_apps(name_regex="^my-App")
    pulumi.export("mhubAppId2", name_regex.apps[0].id)
    ```


    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of App IDs. The value formats as `<product_id>:<app_key>`
    :param str name_regex: A regex string to filter results by App name.
    :param str os_type: The os type. Valid values: `Android` and `iOS`.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str product_id: The ID of the Product.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['osType'] = os_type
    __args__['outputFile'] = output_file
    __args__['productId'] = product_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:mhub/getApps:getApps', __args__, opts=opts, typ=GetAppsResult).value

    return AwaitableGetAppsResult(
        apps=pulumi.get(__ret__, 'apps'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        os_type=pulumi.get(__ret__, 'os_type'),
        output_file=pulumi.get(__ret__, 'output_file'),
        product_id=pulumi.get(__ret__, 'product_id'))


@_utilities.lift_output_func(get_apps)
def get_apps_output(enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                    ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                    name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                    os_type: Optional[pulumi.Input[Optional[str]]] = None,
                    output_file: Optional[pulumi.Input[Optional[str]]] = None,
                    product_id: Optional[pulumi.Input[str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAppsResult]:
    """
    This data source provides the Mhub Apps of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.138.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "example_value"
    default = alicloud.mhub.App("default",
        app_name=name,
        product_id=alicloud_mhub_product["default"]["id"],
        package_name="com.test.android",
        type="2")
    ids = alicloud.mhub.get_apps()
    pulumi.export("mhubAppId1", ids.apps[0].id)
    name_regex = alicloud.mhub.get_apps(name_regex="^my-App")
    pulumi.export("mhubAppId2", name_regex.apps[0].id)
    ```


    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of App IDs. The value formats as `<product_id>:<app_key>`
    :param str name_regex: A regex string to filter results by App name.
    :param str os_type: The os type. Valid values: `Android` and `iOS`.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str product_id: The ID of the Product.
    """
    ...
