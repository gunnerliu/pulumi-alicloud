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
    'GetSecretsResult',
    'AwaitableGetSecretsResult',
    'get_secrets',
    'get_secrets_output',
]

@pulumi.output_type
class GetSecretsResult:
    """
    A collection of values returned by getSecrets.
    """
    def __init__(__self__, enable_details=None, fetch_tags=None, filters=None, id=None, ids=None, name_regex=None, names=None, output_file=None, secrets=None, tags=None):
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if fetch_tags and not isinstance(fetch_tags, bool):
            raise TypeError("Expected argument 'fetch_tags' to be a bool")
        pulumi.set(__self__, "fetch_tags", fetch_tags)
        if filters and not isinstance(filters, str):
            raise TypeError("Expected argument 'filters' to be a str")
        pulumi.set(__self__, "filters", filters)
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
        if secrets and not isinstance(secrets, list):
            raise TypeError("Expected argument 'secrets' to be a list")
        pulumi.set(__self__, "secrets", secrets)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

    @property
    @pulumi.getter(name="fetchTags")
    def fetch_tags(self) -> Optional[bool]:
        return pulumi.get(self, "fetch_tags")

    @property
    @pulumi.getter
    def filters(self) -> Optional[str]:
        return pulumi.get(self, "filters")

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
        A list of Kms Secret ids. The value is same as KMS secret_name.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of KMS Secret names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def secrets(self) -> Sequence['outputs.GetSecretsSecretResult']:
        """
        A list of KMS Secrets. Each element contains the following attributes:
        """
        return pulumi.get(self, "secrets")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, Any]]:
        """
        (Optional) A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")


class AwaitableGetSecretsResult(GetSecretsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSecretsResult(
            enable_details=self.enable_details,
            fetch_tags=self.fetch_tags,
            filters=self.filters,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            secrets=self.secrets,
            tags=self.tags)


def get_secrets(enable_details: Optional[bool] = None,
                fetch_tags: Optional[bool] = None,
                filters: Optional[str] = None,
                ids: Optional[Sequence[str]] = None,
                name_regex: Optional[str] = None,
                output_file: Optional[str] = None,
                tags: Optional[Mapping[str, Any]] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSecretsResult:
    """
    This data source provides a list of KMS Secrets in an Alibaba Cloud account according to the specified filters.

    > **NOTE:** Available in v1.86.0+.


    :param bool enable_details: Default to `false`. Set it to true can output more details.
    :param bool fetch_tags: Whether to include the predetermined resource tag in the return value. Default to `false`.
    :param str filters: The secret filter. The filter consists of one or more key-value pairs. 
           More details see API [ListSecrets](https://www.alibabacloud.com/help/en/key-management-service/latest/listsecrets).
    :param Sequence[str] ids: A list of KMS Secret ids. The value is same as KMS secret_name.
    :param str name_regex: A regex string to filter the results by the KMS secret_name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param Mapping[str, Any] tags: A mapping of tags to assign to the resource.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['fetchTags'] = fetch_tags
    __args__['filters'] = filters
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:kms/getSecrets:getSecrets', __args__, opts=opts, typ=GetSecretsResult).value

    return AwaitableGetSecretsResult(
        enable_details=pulumi.get(__ret__, 'enable_details'),
        fetch_tags=pulumi.get(__ret__, 'fetch_tags'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        secrets=pulumi.get(__ret__, 'secrets'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_secrets)
def get_secrets_output(enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                       fetch_tags: Optional[pulumi.Input[Optional[bool]]] = None,
                       filters: Optional[pulumi.Input[Optional[str]]] = None,
                       ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                       name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                       output_file: Optional[pulumi.Input[Optional[str]]] = None,
                       tags: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSecretsResult]:
    """
    This data source provides a list of KMS Secrets in an Alibaba Cloud account according to the specified filters.

    > **NOTE:** Available in v1.86.0+.


    :param bool enable_details: Default to `false`. Set it to true can output more details.
    :param bool fetch_tags: Whether to include the predetermined resource tag in the return value. Default to `false`.
    :param str filters: The secret filter. The filter consists of one or more key-value pairs. 
           More details see API [ListSecrets](https://www.alibabacloud.com/help/en/key-management-service/latest/listsecrets).
    :param Sequence[str] ids: A list of KMS Secret ids. The value is same as KMS secret_name.
    :param str name_regex: A regex string to filter the results by the KMS secret_name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param Mapping[str, Any] tags: A mapping of tags to assign to the resource.
    """
    ...
