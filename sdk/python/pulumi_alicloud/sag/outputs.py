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
    'GetAclsAclResult',
    'GetSmartagFlowLogsLogResult',
]

@pulumi.output_type
class GetAclsAclResult(dict):
    def __init__(__self__, *,
                 id: str,
                 name: str):
        """
        :param str id: The ID of the ACL. For example "acl-xxx".
        :param str name: The name of the Acl.
        """
        GetAclsAclResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            id=id,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             id: Optional[str] = None,
             name: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if id is None:
            raise TypeError("Missing 'id' argument")
        if name is None:
            raise TypeError("Missing 'name' argument")

        _setter("id", id)
        _setter("name", name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the ACL. For example "acl-xxx".
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the Acl.
        """
        return pulumi.get(self, "name")


@pulumi.output_type
class GetSmartagFlowLogsLogResult(dict):
    def __init__(__self__, *,
                 active_aging: int,
                 description: str,
                 flow_log_id: str,
                 flow_log_name: str,
                 id: str,
                 inactive_aging: int,
                 logstore_name: str,
                 netflow_server_ip: str,
                 netflow_server_port: int,
                 netflow_version: str,
                 output_type: str,
                 project_name: str,
                 resource_group_id: str,
                 sls_region_id: str,
                 status: str,
                 total_sag_num: int):
        """
        :param int active_aging: The time interval at which log data of active connections is collected. Valid values: 60 to 6000. Default value: 300. Unit: second.
        :param str description: The description of the flow log.
        :param str flow_log_id: The ID of the flow log.
        :param str flow_log_name: The name of the flow log.
        :param str id: The ID of the Flow Log.
        :param int inactive_aging: The time interval at which log data of inactive connections is connected. Valid values: 10 to 600. Default value: 15. Unit: second.
        :param str logstore_name: The name of the Log Service Logstore.
        :param str netflow_server_ip: The IP address of the NetFlow collector where the flow log is stored.
        :param int netflow_server_port: The port of the NetFlow collector. Default value: 9995.
        :param str netflow_version: The NetFlow version. Default value: V9.
        :param str output_type: The location where the flow log is stored. Valid values:  sls: The flow log is stored in Log Service. netflow: The flow log is stored on a NetFlow collector. all: The flow log is stored both in Log Service and on a NetFlow collector.
        :param str project_name: The name of the Log Service project.
        :param str resource_group_id: The ID of the resource group.
        :param str sls_region_id: The ID of the region where Log Service is deployed.
        :param str status: The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
        :param int total_sag_num: The number of Smart Access gateway (SAG) instances with which the flow log is associated.
        """
        GetSmartagFlowLogsLogResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            active_aging=active_aging,
            description=description,
            flow_log_id=flow_log_id,
            flow_log_name=flow_log_name,
            id=id,
            inactive_aging=inactive_aging,
            logstore_name=logstore_name,
            netflow_server_ip=netflow_server_ip,
            netflow_server_port=netflow_server_port,
            netflow_version=netflow_version,
            output_type=output_type,
            project_name=project_name,
            resource_group_id=resource_group_id,
            sls_region_id=sls_region_id,
            status=status,
            total_sag_num=total_sag_num,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             active_aging: Optional[int] = None,
             description: Optional[str] = None,
             flow_log_id: Optional[str] = None,
             flow_log_name: Optional[str] = None,
             id: Optional[str] = None,
             inactive_aging: Optional[int] = None,
             logstore_name: Optional[str] = None,
             netflow_server_ip: Optional[str] = None,
             netflow_server_port: Optional[int] = None,
             netflow_version: Optional[str] = None,
             output_type: Optional[str] = None,
             project_name: Optional[str] = None,
             resource_group_id: Optional[str] = None,
             sls_region_id: Optional[str] = None,
             status: Optional[str] = None,
             total_sag_num: Optional[int] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if active_aging is None and 'activeAging' in kwargs:
            active_aging = kwargs['activeAging']
        if active_aging is None:
            raise TypeError("Missing 'active_aging' argument")
        if description is None:
            raise TypeError("Missing 'description' argument")
        if flow_log_id is None and 'flowLogId' in kwargs:
            flow_log_id = kwargs['flowLogId']
        if flow_log_id is None:
            raise TypeError("Missing 'flow_log_id' argument")
        if flow_log_name is None and 'flowLogName' in kwargs:
            flow_log_name = kwargs['flowLogName']
        if flow_log_name is None:
            raise TypeError("Missing 'flow_log_name' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if inactive_aging is None and 'inactiveAging' in kwargs:
            inactive_aging = kwargs['inactiveAging']
        if inactive_aging is None:
            raise TypeError("Missing 'inactive_aging' argument")
        if logstore_name is None and 'logstoreName' in kwargs:
            logstore_name = kwargs['logstoreName']
        if logstore_name is None:
            raise TypeError("Missing 'logstore_name' argument")
        if netflow_server_ip is None and 'netflowServerIp' in kwargs:
            netflow_server_ip = kwargs['netflowServerIp']
        if netflow_server_ip is None:
            raise TypeError("Missing 'netflow_server_ip' argument")
        if netflow_server_port is None and 'netflowServerPort' in kwargs:
            netflow_server_port = kwargs['netflowServerPort']
        if netflow_server_port is None:
            raise TypeError("Missing 'netflow_server_port' argument")
        if netflow_version is None and 'netflowVersion' in kwargs:
            netflow_version = kwargs['netflowVersion']
        if netflow_version is None:
            raise TypeError("Missing 'netflow_version' argument")
        if output_type is None and 'outputType' in kwargs:
            output_type = kwargs['outputType']
        if output_type is None:
            raise TypeError("Missing 'output_type' argument")
        if project_name is None and 'projectName' in kwargs:
            project_name = kwargs['projectName']
        if project_name is None:
            raise TypeError("Missing 'project_name' argument")
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if resource_group_id is None:
            raise TypeError("Missing 'resource_group_id' argument")
        if sls_region_id is None and 'slsRegionId' in kwargs:
            sls_region_id = kwargs['slsRegionId']
        if sls_region_id is None:
            raise TypeError("Missing 'sls_region_id' argument")
        if status is None:
            raise TypeError("Missing 'status' argument")
        if total_sag_num is None and 'totalSagNum' in kwargs:
            total_sag_num = kwargs['totalSagNum']
        if total_sag_num is None:
            raise TypeError("Missing 'total_sag_num' argument")

        _setter("active_aging", active_aging)
        _setter("description", description)
        _setter("flow_log_id", flow_log_id)
        _setter("flow_log_name", flow_log_name)
        _setter("id", id)
        _setter("inactive_aging", inactive_aging)
        _setter("logstore_name", logstore_name)
        _setter("netflow_server_ip", netflow_server_ip)
        _setter("netflow_server_port", netflow_server_port)
        _setter("netflow_version", netflow_version)
        _setter("output_type", output_type)
        _setter("project_name", project_name)
        _setter("resource_group_id", resource_group_id)
        _setter("sls_region_id", sls_region_id)
        _setter("status", status)
        _setter("total_sag_num", total_sag_num)

    @property
    @pulumi.getter(name="activeAging")
    def active_aging(self) -> int:
        """
        The time interval at which log data of active connections is collected. Valid values: 60 to 6000. Default value: 300. Unit: second.
        """
        return pulumi.get(self, "active_aging")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the flow log.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="flowLogId")
    def flow_log_id(self) -> str:
        """
        The ID of the flow log.
        """
        return pulumi.get(self, "flow_log_id")

    @property
    @pulumi.getter(name="flowLogName")
    def flow_log_name(self) -> str:
        """
        The name of the flow log.
        """
        return pulumi.get(self, "flow_log_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Flow Log.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="inactiveAging")
    def inactive_aging(self) -> int:
        """
        The time interval at which log data of inactive connections is connected. Valid values: 10 to 600. Default value: 15. Unit: second.
        """
        return pulumi.get(self, "inactive_aging")

    @property
    @pulumi.getter(name="logstoreName")
    def logstore_name(self) -> str:
        """
        The name of the Log Service Logstore.
        """
        return pulumi.get(self, "logstore_name")

    @property
    @pulumi.getter(name="netflowServerIp")
    def netflow_server_ip(self) -> str:
        """
        The IP address of the NetFlow collector where the flow log is stored.
        """
        return pulumi.get(self, "netflow_server_ip")

    @property
    @pulumi.getter(name="netflowServerPort")
    def netflow_server_port(self) -> int:
        """
        The port of the NetFlow collector. Default value: 9995.
        """
        return pulumi.get(self, "netflow_server_port")

    @property
    @pulumi.getter(name="netflowVersion")
    def netflow_version(self) -> str:
        """
        The NetFlow version. Default value: V9.
        """
        return pulumi.get(self, "netflow_version")

    @property
    @pulumi.getter(name="outputType")
    def output_type(self) -> str:
        """
        The location where the flow log is stored. Valid values:  sls: The flow log is stored in Log Service. netflow: The flow log is stored on a NetFlow collector. all: The flow log is stored both in Log Service and on a NetFlow collector.
        """
        return pulumi.get(self, "output_type")

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> str:
        """
        The name of the Log Service project.
        """
        return pulumi.get(self, "project_name")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> str:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="slsRegionId")
    def sls_region_id(self) -> str:
        """
        The ID of the region where Log Service is deployed.
        """
        return pulumi.get(self, "sls_region_id")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="totalSagNum")
    def total_sag_num(self) -> int:
        """
        The number of Smart Access gateway (SAG) instances with which the flow log is associated.
        """
        return pulumi.get(self, "total_sag_num")


