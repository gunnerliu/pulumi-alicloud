# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetAccessConfigurationsResult',
    'AwaitableGetAccessConfigurationsResult',
    'get_access_configurations',
    'get_access_configurations_output',
]

@pulumi.output_type
class GetAccessConfigurationsResult:
    """
    A collection of values returned by getAccessConfigurations.
    """
    def __init__(__self__, configurations=None, directory_id=None, enable_details=None, id=None, ids=None, name_regex=None, names=None, output_file=None):
        if configurations and not isinstance(configurations, list):
            raise TypeError("Expected argument 'configurations' to be a list")
        pulumi.set(__self__, "configurations", configurations)
        if directory_id and not isinstance(directory_id, str):
            raise TypeError("Expected argument 'directory_id' to be a str")
        pulumi.set(__self__, "directory_id", directory_id)
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

    @property
    @pulumi.getter
    def configurations(self) -> Sequence['outputs.GetAccessConfigurationsConfigurationResult']:
        return pulumi.get(self, "configurations")

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> str:
        return pulumi.get(self, "directory_id")

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


class AwaitableGetAccessConfigurationsResult(GetAccessConfigurationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccessConfigurationsResult(
            configurations=self.configurations,
            directory_id=self.directory_id,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file)


def get_access_configurations(directory_id: Optional[str] = None,
                              enable_details: Optional[bool] = None,
                              ids: Optional[Sequence[str]] = None,
                              name_regex: Optional[str] = None,
                              output_file: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccessConfigurationsResult:
    """
    This data source provides the Cloud Sso Access Configurations of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.140.0+.

    > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cloudsso.get_access_configurations(directory_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("cloudSsoAccessConfigurationId1", ids.configurations[0].id)
    name_regex = alicloud.cloudsso.get_access_configurations(directory_id="example_value",
        name_regex="^my-AccessConfiguration")
    pulumi.export("cloudSsoAccessConfigurationId2", name_regex.configurations[0].id)
    ```


    :param str directory_id: The ID of the Directory.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Access Configuration IDs.
    :param str name_regex: A regex string to filter results by Access Configuration name.
    """
    __args__ = dict()
    __args__['directoryId'] = directory_id
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:cloudsso/getAccessConfigurations:getAccessConfigurations', __args__, opts=opts, typ=GetAccessConfigurationsResult).value

    return AwaitableGetAccessConfigurationsResult(
        configurations=__ret__.configurations,
        directory_id=__ret__.directory_id,
        enable_details=__ret__.enable_details,
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file)


@_utilities.lift_output_func(get_access_configurations)
def get_access_configurations_output(directory_id: Optional[pulumi.Input[str]] = None,
                                     enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                                     ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                     name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                     output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccessConfigurationsResult]:
    """
    This data source provides the Cloud Sso Access Configurations of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.140.0+.

    > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cloudsso.get_access_configurations(directory_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("cloudSsoAccessConfigurationId1", ids.configurations[0].id)
    name_regex = alicloud.cloudsso.get_access_configurations(directory_id="example_value",
        name_regex="^my-AccessConfiguration")
    pulumi.export("cloudSsoAccessConfigurationId2", name_regex.configurations[0].id)
    ```


    :param str directory_id: The ID of the Directory.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Access Configuration IDs.
    :param str name_regex: A regex string to filter results by Access Configuration name.
    """
    ...