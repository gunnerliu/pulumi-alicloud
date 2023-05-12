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
    'GetStoresResult',
    'AwaitableGetStoresResult',
    'get_stores',
    'get_stores_output',
]

@pulumi.output_type
class GetStoresResult:
    """
    A collection of values returned by getStores.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, output_file=None, project=None, stores=None):
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
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if stores and not isinstance(stores, list):
            raise TypeError("Expected argument 'stores' to be a list")
        pulumi.set(__self__, "stores", stores)

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
    def project(self) -> str:
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def stores(self) -> Sequence['outputs.GetStoresStoreResult']:
        return pulumi.get(self, "stores")


class AwaitableGetStoresResult(GetStoresResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStoresResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            project=self.project,
            stores=self.stores)


def get_stores(ids: Optional[Sequence[str]] = None,
               name_regex: Optional[str] = None,
               output_file: Optional[str] = None,
               project: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStoresResult:
    """
    This data source provides the Log Stores of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.126.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.log.get_stores(project="the_project_name",
        ids=["the_store_name"])
    pulumi.export("firstLogStoreId", example.stores[0].id)
    ```


    :param Sequence[str] ids: A list of store IDs.
    :param str name_regex: A regex string to filter results by store name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:log/getStores:getStores', __args__, opts=opts, typ=GetStoresResult).value

    return AwaitableGetStoresResult(
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        project=__ret__.project,
        stores=__ret__.stores)


@_utilities.lift_output_func(get_stores)
def get_stores_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                      name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                      output_file: Optional[pulumi.Input[Optional[str]]] = None,
                      project: Optional[pulumi.Input[str]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStoresResult]:
    """
    This data source provides the Log Stores of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.126.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.log.get_stores(project="the_project_name",
        ids=["the_store_name"])
    pulumi.export("firstLogStoreId", example.stores[0].id)
    ```


    :param Sequence[str] ids: A list of store IDs.
    :param str name_regex: A regex string to filter results by store name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
