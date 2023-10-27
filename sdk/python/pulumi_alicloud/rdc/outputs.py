# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetOrganizationsOrganizationResult',
]

@pulumi.output_type
class GetOrganizationsOrganizationResult(dict):
    def __init__(__self__, *,
                 id: str,
                 organization_id: str,
                 organization_name: str):
        """
        :param str id: The ID of the Organization.
        :param str organization_id: The first ID of the resource.
        :param str organization_name: Company name.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "organization_id", organization_id)
        pulumi.set(__self__, "organization_name", organization_name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Organization.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> str:
        """
        The first ID of the resource.
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="organizationName")
    def organization_name(self) -> str:
        """
        Company name.
        """
        return pulumi.get(self, "organization_name")


