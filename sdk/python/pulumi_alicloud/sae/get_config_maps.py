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
    'GetConfigMapsResult',
    'AwaitableGetConfigMapsResult',
    'get_config_maps',
    'get_config_maps_output',
]

@pulumi.output_type
class GetConfigMapsResult:
    """
    A collection of values returned by getConfigMaps.
    """
    def __init__(__self__, id=None, ids=None, maps=None, name_regex=None, names=None, namespace_id=None, output_file=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if maps and not isinstance(maps, list):
            raise TypeError("Expected argument 'maps' to be a list")
        pulumi.set(__self__, "maps", maps)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if namespace_id and not isinstance(namespace_id, str):
            raise TypeError("Expected argument 'namespace_id' to be a str")
        pulumi.set(__self__, "namespace_id", namespace_id)
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
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter
    def maps(self) -> Sequence['outputs.GetConfigMapsMapResult']:
        return pulumi.get(self, "maps")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> str:
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetConfigMapsResult(GetConfigMapsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConfigMapsResult(
            id=self.id,
            ids=self.ids,
            maps=self.maps,
            name_regex=self.name_regex,
            names=self.names,
            namespace_id=self.namespace_id,
            output_file=self.output_file)


def get_config_maps(ids: Optional[Sequence[str]] = None,
                    name_regex: Optional[str] = None,
                    namespace_id: Optional[str] = None,
                    output_file: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConfigMapsResult:
    """
    This data source provides the Sae Config Maps of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.130.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import json
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    config_map_name = config.get("configMapName")
    if config_map_name is None:
        config_map_name = "examplename"
    example_namespace = alicloud.sae.Namespace("exampleNamespace",
        namespace_id="cn-hangzhou:yourname",
        namespace_name="example_value",
        namespace_description="your_description")
    example_config_map = alicloud.sae.ConfigMap("exampleConfigMap",
        data=json.dumps({
            "env.home": "/root",
            "env.shell": "/bin/sh",
        }),
        namespace_id=example_namespace.namespace_id)
    name_regex = alicloud.sae.get_config_maps_output(namespace_id=example_namespace.namespace_id,
        name_regex="^example")
    pulumi.export("saeConfigMapId", name_regex.maps[0].id)
    ```


    :param Sequence[str] ids: A list of Config Map IDs.
    :param str name_regex: A regex string to filter results by Config Map name.
    :param str namespace_id: The NamespaceId of Config Maps.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['namespaceId'] = namespace_id
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:sae/getConfigMaps:getConfigMaps', __args__, opts=opts, typ=GetConfigMapsResult).value

    return AwaitableGetConfigMapsResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        maps=pulumi.get(__ret__, 'maps'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        namespace_id=pulumi.get(__ret__, 'namespace_id'),
        output_file=pulumi.get(__ret__, 'output_file'))


@_utilities.lift_output_func(get_config_maps)
def get_config_maps_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                           namespace_id: Optional[pulumi.Input[str]] = None,
                           output_file: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConfigMapsResult]:
    """
    This data source provides the Sae Config Maps of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.130.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import json
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    config_map_name = config.get("configMapName")
    if config_map_name is None:
        config_map_name = "examplename"
    example_namespace = alicloud.sae.Namespace("exampleNamespace",
        namespace_id="cn-hangzhou:yourname",
        namespace_name="example_value",
        namespace_description="your_description")
    example_config_map = alicloud.sae.ConfigMap("exampleConfigMap",
        data=json.dumps({
            "env.home": "/root",
            "env.shell": "/bin/sh",
        }),
        namespace_id=example_namespace.namespace_id)
    name_regex = alicloud.sae.get_config_maps_output(namespace_id=example_namespace.namespace_id,
        name_regex="^example")
    pulumi.export("saeConfigMapId", name_regex.maps[0].id)
    ```


    :param Sequence[str] ids: A list of Config Map IDs.
    :param str name_regex: A regex string to filter results by Config Map name.
    :param str namespace_id: The NamespaceId of Config Maps.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
