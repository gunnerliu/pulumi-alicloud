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
    'GetSystemSecurityPoliciesResult',
    'AwaitableGetSystemSecurityPoliciesResult',
    'get_system_security_policies',
    'get_system_security_policies_output',
]

@pulumi.output_type
class GetSystemSecurityPoliciesResult:
    """
    A collection of values returned by getSystemSecurityPolicies.
    """
    def __init__(__self__, id=None, ids=None, output_file=None, policies=None, tags=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if policies and not isinstance(policies, list):
            raise TypeError("Expected argument 'policies' to be a list")
        pulumi.set(__self__, "policies", policies)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

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
        A list of System Security Policy IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def policies(self) -> Sequence['outputs.GetSystemSecurityPoliciesPolicyResult']:
        """
        A list of ALB Security Policies. Each element contains the following attributes:
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, Any]]:
        return pulumi.get(self, "tags")


class AwaitableGetSystemSecurityPoliciesResult(GetSystemSecurityPoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSystemSecurityPoliciesResult(
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            policies=self.policies,
            tags=self.tags)


def get_system_security_policies(ids: Optional[Sequence[str]] = None,
                                 output_file: Optional[str] = None,
                                 tags: Optional[Mapping[str, Any]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSystemSecurityPoliciesResult:
    """
    This data source provides the ALB System Security Policies of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.183.0+.


    :param Sequence[str] ids: A list of System Security Policy IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:alb/getSystemSecurityPolicies:getSystemSecurityPolicies', __args__, opts=opts, typ=GetSystemSecurityPoliciesResult).value

    return AwaitableGetSystemSecurityPoliciesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        policies=pulumi.get(__ret__, 'policies'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_system_security_policies)
def get_system_security_policies_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                        output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                        tags: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSystemSecurityPoliciesResult]:
    """
    This data source provides the ALB System Security Policies of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.183.0+.


    :param Sequence[str] ids: A list of System Security Policy IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
