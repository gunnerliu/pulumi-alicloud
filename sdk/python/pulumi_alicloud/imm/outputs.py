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
    'GetProjectsProjectResult',
]

@pulumi.output_type
class GetProjectsProjectResult(dict):
    def __init__(__self__, *,
                 billing_type: str,
                 compute_unit: int,
                 create_time: str,
                 endpoint: str,
                 id: str,
                 modify_time: str,
                 project: str,
                 service_role: str,
                 type: str):
        """
        :param str billing_type: The billing type. **Note:** This parameter is deprecated from 2021-04-01.
        :param int compute_unit: The maximum number of requests that can be processed per second. **Note:** This parameter is deprecated from 2021-04-01.
        :param str create_time: The creation time of project.
        :param str endpoint: The service address of project.
        :param str id: The ID of project.
        :param str modify_time: The modification time of project.
        :param str project: The name of project.
        :param str service_role: The service role authorized to the Intelligent Media Management service to access other cloud resources.
        :param str type: The type of project.
        """
        pulumi.set(__self__, "billing_type", billing_type)
        pulumi.set(__self__, "compute_unit", compute_unit)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "endpoint", endpoint)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "modify_time", modify_time)
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "service_role", service_role)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="billingType")
    def billing_type(self) -> str:
        """
        The billing type. **Note:** This parameter is deprecated from 2021-04-01.
        """
        return pulumi.get(self, "billing_type")

    @property
    @pulumi.getter(name="computeUnit")
    def compute_unit(self) -> int:
        """
        The maximum number of requests that can be processed per second. **Note:** This parameter is deprecated from 2021-04-01.
        """
        return pulumi.get(self, "compute_unit")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The creation time of project.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def endpoint(self) -> str:
        """
        The service address of project.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of project.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="modifyTime")
    def modify_time(self) -> str:
        """
        The modification time of project.
        """
        return pulumi.get(self, "modify_time")

    @property
    @pulumi.getter
    def project(self) -> str:
        """
        The name of project.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="serviceRole")
    def service_role(self) -> str:
        """
        The service role authorized to the Intelligent Media Management service to access other cloud resources.
        """
        return pulumi.get(self, "service_role")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of project.
        """
        return pulumi.get(self, "type")


