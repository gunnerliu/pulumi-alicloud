# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
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
        GetProjectsProjectResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            billing_type=billing_type,
            compute_unit=compute_unit,
            create_time=create_time,
            endpoint=endpoint,
            id=id,
            modify_time=modify_time,
            project=project,
            service_role=service_role,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             billing_type: Optional[str] = None,
             compute_unit: Optional[int] = None,
             create_time: Optional[str] = None,
             endpoint: Optional[str] = None,
             id: Optional[str] = None,
             modify_time: Optional[str] = None,
             project: Optional[str] = None,
             service_role: Optional[str] = None,
             type: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if billing_type is None and 'billingType' in kwargs:
            billing_type = kwargs['billingType']
        if billing_type is None:
            raise TypeError("Missing 'billing_type' argument")
        if compute_unit is None and 'computeUnit' in kwargs:
            compute_unit = kwargs['computeUnit']
        if compute_unit is None:
            raise TypeError("Missing 'compute_unit' argument")
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if create_time is None:
            raise TypeError("Missing 'create_time' argument")
        if endpoint is None:
            raise TypeError("Missing 'endpoint' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if modify_time is None and 'modifyTime' in kwargs:
            modify_time = kwargs['modifyTime']
        if modify_time is None:
            raise TypeError("Missing 'modify_time' argument")
        if project is None:
            raise TypeError("Missing 'project' argument")
        if service_role is None and 'serviceRole' in kwargs:
            service_role = kwargs['serviceRole']
        if service_role is None:
            raise TypeError("Missing 'service_role' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")

        _setter("billing_type", billing_type)
        _setter("compute_unit", compute_unit)
        _setter("create_time", create_time)
        _setter("endpoint", endpoint)
        _setter("id", id)
        _setter("modify_time", modify_time)
        _setter("project", project)
        _setter("service_role", service_role)
        _setter("type", type)

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


