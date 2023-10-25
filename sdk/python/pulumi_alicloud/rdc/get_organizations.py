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
    'GetOrganizationsResult',
    'AwaitableGetOrganizationsResult',
    'get_organizations',
    'get_organizations_output',
]

@pulumi.output_type
class GetOrganizationsResult:
    """
    A collection of values returned by getOrganizations.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, organizations=None, output_file=None, real_pk=None):
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
        if organizations and not isinstance(organizations, list):
            raise TypeError("Expected argument 'organizations' to be a list")
        pulumi.set(__self__, "organizations", organizations)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if real_pk and not isinstance(real_pk, str):
            raise TypeError("Expected argument 'real_pk' to be a str")
        pulumi.set(__self__, "real_pk", real_pk)

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
    @pulumi.getter
    def organizations(self) -> Sequence['outputs.GetOrganizationsOrganizationResult']:
        return pulumi.get(self, "organizations")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="realPk")
    def real_pk(self) -> Optional[str]:
        return pulumi.get(self, "real_pk")


class AwaitableGetOrganizationsResult(GetOrganizationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOrganizationsResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            organizations=self.organizations,
            output_file=self.output_file,
            real_pk=self.real_pk)


def get_organizations(ids: Optional[Sequence[str]] = None,
                      name_regex: Optional[str] = None,
                      output_file: Optional[str] = None,
                      real_pk: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOrganizationsResult:
    """
    This data source provides the Rdc Organizations of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.137.0+.


    :param Sequence[str] ids: A list of Organization IDs.
    :param str name_regex: A regex string to filter results by Organization name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str real_pk: User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['realPk'] = real_pk
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:rdc/getOrganizations:getOrganizations', __args__, opts=opts, typ=GetOrganizationsResult).value

    return AwaitableGetOrganizationsResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        organizations=pulumi.get(__ret__, 'organizations'),
        output_file=pulumi.get(__ret__, 'output_file'),
        real_pk=pulumi.get(__ret__, 'real_pk'))


@_utilities.lift_output_func(get_organizations)
def get_organizations_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                             name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                             output_file: Optional[pulumi.Input[Optional[str]]] = None,
                             real_pk: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOrganizationsResult]:
    """
    This data source provides the Rdc Organizations of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.137.0+.


    :param Sequence[str] ids: A list of Organization IDs.
    :param str name_regex: A regex string to filter results by Organization name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str real_pk: User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
    """
    ...
