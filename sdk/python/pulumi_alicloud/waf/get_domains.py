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
    'GetDomainsResult',
    'AwaitableGetDomainsResult',
    'get_domains',
    'get_domains_output',
]

@pulumi.output_type
class GetDomainsResult:
    """
    A collection of values returned by getDomains.
    """
    def __init__(__self__, domains=None, enable_details=None, id=None, ids=None, instance_id=None, name_regex=None, names=None, output_file=None, resource_group_id=None):
        if domains and not isinstance(domains, list):
            raise TypeError("Expected argument 'domains' to be a list")
        pulumi.set(__self__, "domains", domains)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        pulumi.set(__self__, "resource_group_id", resource_group_id)

    @property
    @pulumi.getter
    def domains(self) -> Sequence['outputs.GetDomainsDomainResult']:
        """
        A list of Domains. Each element contains the following attributes:
        """
        return pulumi.get(self, "domains")

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
        """
        A list of WAF domain self ID, value as `domain_name`.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of WAF domain names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[str]:
        """
        The ID of the resource group to which the queried domain belongs in Resource Management.
        """
        return pulumi.get(self, "resource_group_id")


class AwaitableGetDomainsResult(GetDomainsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDomainsResult(
            domains=self.domains,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            resource_group_id=self.resource_group_id)


def get_domains(enable_details: Optional[bool] = None,
                ids: Optional[Sequence[str]] = None,
                instance_id: Optional[str] = None,
                name_regex: Optional[str] = None,
                output_file: Optional[str] = None,
                resource_group_id: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDomainsResult:
    """
    Provides a WAF datasource to retrieve domains.

    For information about WAF and how to use it, see [What is Alibaba Cloud WAF](https://www.alibabacloud.com/help/doc-detail/28517.htm).

    > **NOTE:** Available in 1.86.0+ .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.waf.get_domains(instance_id="waf-cf-xxxxx")
    ```


    :param bool enable_details: Default to false and only output `id`, `domain_name`. Set it to true can output more details.
    :param Sequence[str] ids: A list of WAF domain names. Each item is domain name.
    :param str instance_id: The Id of waf instance to which waf domain belongs.
    :param str name_regex: A regex string to filter results by domain name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_group_id: The ID of the resource group to which the queried domain belongs in Resource Management.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['resourceGroupId'] = resource_group_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:waf/getDomains:getDomains', __args__, opts=opts, typ=GetDomainsResult).value

    return AwaitableGetDomainsResult(
        domains=pulumi.get(__ret__, 'domains'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        resource_group_id=pulumi.get(__ret__, 'resource_group_id'))


@_utilities.lift_output_func(get_domains)
def get_domains_output(enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                       ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                       instance_id: Optional[pulumi.Input[str]] = None,
                       name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                       output_file: Optional[pulumi.Input[Optional[str]]] = None,
                       resource_group_id: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDomainsResult]:
    """
    Provides a WAF datasource to retrieve domains.

    For information about WAF and how to use it, see [What is Alibaba Cloud WAF](https://www.alibabacloud.com/help/doc-detail/28517.htm).

    > **NOTE:** Available in 1.86.0+ .

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.waf.get_domains(instance_id="waf-cf-xxxxx")
    ```


    :param bool enable_details: Default to false and only output `id`, `domain_name`. Set it to true can output more details.
    :param Sequence[str] ids: A list of WAF domain names. Each item is domain name.
    :param str instance_id: The Id of waf instance to which waf domain belongs.
    :param str name_regex: A regex string to filter results by domain name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_group_id: The ID of the resource group to which the queried domain belongs in Resource Management.
    """
    ...
