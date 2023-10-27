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
    'GetTrailsDeprecatedResult',
    'AwaitableGetTrailsDeprecatedResult',
    'get_trails_deprecated',
    'get_trails_deprecated_output',
]

warnings.warn("""DataSource has been renamed to `getTrails`""", DeprecationWarning)

@pulumi.output_type
class GetTrailsDeprecatedResult:
    """
    A collection of values returned by getTrailsDeprecated.
    """
    def __init__(__self__, actiontrails=None, id=None, ids=None, include_organization_trail=None, include_shadow_trails=None, name_regex=None, names=None, output_file=None, status=None, trails=None):
        if actiontrails and not isinstance(actiontrails, list):
            raise TypeError("Expected argument 'actiontrails' to be a list")
        pulumi.set(__self__, "actiontrails", actiontrails)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if include_organization_trail and not isinstance(include_organization_trail, bool):
            raise TypeError("Expected argument 'include_organization_trail' to be a bool")
        pulumi.set(__self__, "include_organization_trail", include_organization_trail)
        if include_shadow_trails and not isinstance(include_shadow_trails, bool):
            raise TypeError("Expected argument 'include_shadow_trails' to be a bool")
        pulumi.set(__self__, "include_shadow_trails", include_shadow_trails)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if trails and not isinstance(trails, list):
            raise TypeError("Expected argument 'trails' to be a list")
        pulumi.set(__self__, "trails", trails)

    @property
    @pulumi.getter
    def actiontrails(self) -> Sequence['outputs.GetTrailsDeprecatedActiontrailResult']:
        """
        A list of actiontrails. Each element contains the following attributes:
        """
        warnings.warn("""Field 'actiontrails' has been deprecated from version 1.95.0. Use 'trails' instead.""", DeprecationWarning)
        pulumi.log.warn("""actiontrails is deprecated: Field 'actiontrails' has been deprecated from version 1.95.0. Use 'trails' instead.""")

        return pulumi.get(self, "actiontrails")

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
    @pulumi.getter(name="includeOrganizationTrail")
    def include_organization_trail(self) -> Optional[bool]:
        return pulumi.get(self, "include_organization_trail")

    @property
    @pulumi.getter(name="includeShadowTrails")
    def include_shadow_trails(self) -> Optional[bool]:
        return pulumi.get(self, "include_shadow_trails")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of trail names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def trails(self) -> Sequence['outputs.GetTrailsDeprecatedTrailResult']:
        return pulumi.get(self, "trails")


class AwaitableGetTrailsDeprecatedResult(GetTrailsDeprecatedResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTrailsDeprecatedResult(
            actiontrails=self.actiontrails,
            id=self.id,
            ids=self.ids,
            include_organization_trail=self.include_organization_trail,
            include_shadow_trails=self.include_shadow_trails,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status,
            trails=self.trails)


def get_trails_deprecated(ids: Optional[Sequence[str]] = None,
                          include_organization_trail: Optional[bool] = None,
                          include_shadow_trails: Optional[bool] = None,
                          name_regex: Optional[str] = None,
                          output_file: Optional[str] = None,
                          status: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTrailsDeprecatedResult:
    """
    > **DEPRECATED:**  This datasource has been renamed to actiontrail_get_trails from version 1.95.0.

    This data source provides a list of action trail of the current Alibaba Cloud user.


    :param str name_regex: A regex string to filter results action trail name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    pulumi.log.warn("""get_trails_deprecated is deprecated: DataSource has been renamed to `getTrails`""")
    __args__ = dict()
    __args__['ids'] = ids
    __args__['includeOrganizationTrail'] = include_organization_trail
    __args__['includeShadowTrails'] = include_shadow_trails
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:actiontrail/getTrailsDeprecated:getTrailsDeprecated', __args__, opts=opts, typ=GetTrailsDeprecatedResult).value

    return AwaitableGetTrailsDeprecatedResult(
        actiontrails=pulumi.get(__ret__, 'actiontrails'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        include_organization_trail=pulumi.get(__ret__, 'include_organization_trail'),
        include_shadow_trails=pulumi.get(__ret__, 'include_shadow_trails'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        trails=pulumi.get(__ret__, 'trails'))


@_utilities.lift_output_func(get_trails_deprecated)
def get_trails_deprecated_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                 include_organization_trail: Optional[pulumi.Input[Optional[bool]]] = None,
                                 include_shadow_trails: Optional[pulumi.Input[Optional[bool]]] = None,
                                 name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                 output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                 status: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTrailsDeprecatedResult]:
    """
    > **DEPRECATED:**  This datasource has been renamed to actiontrail_get_trails from version 1.95.0.

    This data source provides a list of action trail of the current Alibaba Cloud user.


    :param str name_regex: A regex string to filter results action trail name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    pulumi.log.warn("""get_trails_deprecated is deprecated: DataSource has been renamed to `getTrails`""")
    ...
