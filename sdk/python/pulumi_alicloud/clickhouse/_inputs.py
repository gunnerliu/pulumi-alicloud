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
    'DbClusterDbClusterAccessWhiteListArgs',
]

@pulumi.input_type
class DbClusterDbClusterAccessWhiteListArgs:
    def __init__(__self__, *,
                 db_cluster_ip_array_attribute: Optional[pulumi.Input[str]] = None,
                 db_cluster_ip_array_name: Optional[pulumi.Input[str]] = None,
                 security_ip_list: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] db_cluster_ip_array_attribute: Field `db_cluster_ip_array_attribute` has been removed from provider.
        :param pulumi.Input[str] db_cluster_ip_array_name: Whitelist group name.
        :param pulumi.Input[str] security_ip_list: The IP address list under the whitelist group.
        """
        if db_cluster_ip_array_attribute is not None:
            pulumi.set(__self__, "db_cluster_ip_array_attribute", db_cluster_ip_array_attribute)
        if db_cluster_ip_array_name is not None:
            pulumi.set(__self__, "db_cluster_ip_array_name", db_cluster_ip_array_name)
        if security_ip_list is not None:
            pulumi.set(__self__, "security_ip_list", security_ip_list)

    @property
    @pulumi.getter(name="dbClusterIpArrayAttribute")
    def db_cluster_ip_array_attribute(self) -> Optional[pulumi.Input[str]]:
        """
        Field `db_cluster_ip_array_attribute` has been removed from provider.
        """
        return pulumi.get(self, "db_cluster_ip_array_attribute")

    @db_cluster_ip_array_attribute.setter
    def db_cluster_ip_array_attribute(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_cluster_ip_array_attribute", value)

    @property
    @pulumi.getter(name="dbClusterIpArrayName")
    def db_cluster_ip_array_name(self) -> Optional[pulumi.Input[str]]:
        """
        Whitelist group name.
        """
        return pulumi.get(self, "db_cluster_ip_array_name")

    @db_cluster_ip_array_name.setter
    def db_cluster_ip_array_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_cluster_ip_array_name", value)

    @property
    @pulumi.getter(name="securityIpList")
    def security_ip_list(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address list under the whitelist group.
        """
        return pulumi.get(self, "security_ip_list")

    @security_ip_list.setter
    def security_ip_list(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_ip_list", value)


