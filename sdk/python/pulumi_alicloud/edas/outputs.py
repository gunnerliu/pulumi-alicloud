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
    'K8sSlbAttachmentSlbConfig',
    'K8sSlbAttachmentSlbConfigPortMapping',
    'K8sSlbAttachmentSlbConfigPortMappingServicePort',
    'GetApplicationsApplicationResult',
    'GetClustersClusterResult',
    'GetDeployGroupsGroupResult',
    'GetNamespacesNamespaceResult',
]

@pulumi.output_type
class K8sSlbAttachmentSlbConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "portMappings":
            suggest = "port_mappings"
        elif key == "slbId":
            suggest = "slb_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in K8sSlbAttachmentSlbConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        K8sSlbAttachmentSlbConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        K8sSlbAttachmentSlbConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 port_mappings: Sequence['outputs.K8sSlbAttachmentSlbConfigPortMapping'],
                 scheduler: str,
                 type: str,
                 name: Optional[str] = None,
                 slb_id: Optional[str] = None,
                 specification: Optional[str] = None):
        """
        :param Sequence['K8sSlbAttachmentSlbConfigPortMappingArgs'] port_mappings: The port configuration for SLB instance, which is supported for multiple configurations. See `port_mappings` below.
        :param str scheduler: The scheduler policy of SLB configuration, values can be 'rr'(round-robin) or 'wrr'(weighted round-robin).
        :param str type: The type of SLB instance, values can be 'internet' or 'intranet'.
        :param str name: The name of this SLB configuration, empty for auto-generated by EDAS server.
        :param str slb_id: The ID of your SLB instance, if value is empty which means EDAS will purchase an SLB instance with 'specification' field.
        :param str specification: The instance specification of SLB, values can be found [here](https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer-2#t4182.html), empty for 'slb.s1.small'.
        """
        K8sSlbAttachmentSlbConfig._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            port_mappings=port_mappings,
            scheduler=scheduler,
            type=type,
            name=name,
            slb_id=slb_id,
            specification=specification,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             port_mappings: Sequence['outputs.K8sSlbAttachmentSlbConfigPortMapping'],
             scheduler: str,
             type: str,
             name: Optional[str] = None,
             slb_id: Optional[str] = None,
             specification: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("port_mappings", port_mappings)
        _setter("scheduler", scheduler)
        _setter("type", type)
        if name is not None:
            _setter("name", name)
        if slb_id is not None:
            _setter("slb_id", slb_id)
        if specification is not None:
            _setter("specification", specification)

    @property
    @pulumi.getter(name="portMappings")
    def port_mappings(self) -> Sequence['outputs.K8sSlbAttachmentSlbConfigPortMapping']:
        """
        The port configuration for SLB instance, which is supported for multiple configurations. See `port_mappings` below.
        """
        return pulumi.get(self, "port_mappings")

    @property
    @pulumi.getter
    def scheduler(self) -> str:
        """
        The scheduler policy of SLB configuration, values can be 'rr'(round-robin) or 'wrr'(weighted round-robin).
        """
        return pulumi.get(self, "scheduler")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of SLB instance, values can be 'internet' or 'intranet'.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The name of this SLB configuration, empty for auto-generated by EDAS server.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="slbId")
    def slb_id(self) -> Optional[str]:
        """
        The ID of your SLB instance, if value is empty which means EDAS will purchase an SLB instance with 'specification' field.
        """
        return pulumi.get(self, "slb_id")

    @property
    @pulumi.getter
    def specification(self) -> Optional[str]:
        """
        The instance specification of SLB, values can be found [here](https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer-2#t4182.html), empty for 'slb.s1.small'.
        """
        return pulumi.get(self, "specification")


@pulumi.output_type
class K8sSlbAttachmentSlbConfigPortMapping(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "loadbalancerProtocol":
            suggest = "loadbalancer_protocol"
        elif key == "servicePort":
            suggest = "service_port"
        elif key == "certId":
            suggest = "cert_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in K8sSlbAttachmentSlbConfigPortMapping. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        K8sSlbAttachmentSlbConfigPortMapping.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        K8sSlbAttachmentSlbConfigPortMapping.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 loadbalancer_protocol: str,
                 service_port: 'outputs.K8sSlbAttachmentSlbConfigPortMappingServicePort',
                 cert_id: Optional[str] = None):
        """
        :param str loadbalancer_protocol: The protocol of SLB instance configuration, values can be 'TCP', 'HTTP' or 'HTTPS'.
        :param 'K8sSlbAttachmentSlbConfigPortMappingServicePortArgs' service_port: The backend k8s service configuration for SLB instance, which is supported for multiple configurations. See `service_port` below.
        :param str cert_id: The ID of your tls certification, this is used for 'HTTPS' protocol only.
        """
        K8sSlbAttachmentSlbConfigPortMapping._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            loadbalancer_protocol=loadbalancer_protocol,
            service_port=service_port,
            cert_id=cert_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             loadbalancer_protocol: str,
             service_port: 'outputs.K8sSlbAttachmentSlbConfigPortMappingServicePort',
             cert_id: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("loadbalancer_protocol", loadbalancer_protocol)
        _setter("service_port", service_port)
        if cert_id is not None:
            _setter("cert_id", cert_id)

    @property
    @pulumi.getter(name="loadbalancerProtocol")
    def loadbalancer_protocol(self) -> str:
        """
        The protocol of SLB instance configuration, values can be 'TCP', 'HTTP' or 'HTTPS'.
        """
        return pulumi.get(self, "loadbalancer_protocol")

    @property
    @pulumi.getter(name="servicePort")
    def service_port(self) -> 'outputs.K8sSlbAttachmentSlbConfigPortMappingServicePort':
        """
        The backend k8s service configuration for SLB instance, which is supported for multiple configurations. See `service_port` below.
        """
        return pulumi.get(self, "service_port")

    @property
    @pulumi.getter(name="certId")
    def cert_id(self) -> Optional[str]:
        """
        The ID of your tls certification, this is used for 'HTTPS' protocol only.
        """
        return pulumi.get(self, "cert_id")


@pulumi.output_type
class K8sSlbAttachmentSlbConfigPortMappingServicePort(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "targetPort":
            suggest = "target_port"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in K8sSlbAttachmentSlbConfigPortMappingServicePort. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        K8sSlbAttachmentSlbConfigPortMappingServicePort.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        K8sSlbAttachmentSlbConfigPortMappingServicePort.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 port: int,
                 protocol: str,
                 target_port: int):
        """
        :param int port: The port of k8s service, values should be within range [1, 65535].
        :param str protocol: The protocol of k8s service, values can be 'TCP' or 'UDP'.
        :param int target_port: The port of k8s pod, values should be within range [1, 65535].
        """
        K8sSlbAttachmentSlbConfigPortMappingServicePort._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            port=port,
            protocol=protocol,
            target_port=target_port,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             port: int,
             protocol: str,
             target_port: int,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("port", port)
        _setter("protocol", protocol)
        _setter("target_port", target_port)

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        The port of k8s service, values should be within range [1, 65535].
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        """
        The protocol of k8s service, values can be 'TCP' or 'UDP'.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="targetPort")
    def target_port(self) -> int:
        """
        The port of k8s pod, values should be within range [1, 65535].
        """
        return pulumi.get(self, "target_port")


@pulumi.output_type
class GetApplicationsApplicationResult(dict):
    def __init__(__self__, *,
                 app_id: str,
                 app_name: str,
                 application_type: str,
                 build_package_id: int,
                 cluster_id: str,
                 cluster_type: int,
                 region_id: str):
        """
        :param str app_id: The ID of the application that you want to deploy.
        :param str app_name: The name of your EDAS application. Only letters '-' '_' and numbers are allowed. The length cannot exceed 36 characters.
        :param str application_type: The type of the package for the deployment of the application that you want to create. The valid values are: WAR and JAR. We strongly recommend you to set this parameter when creating the application.
        :param int build_package_id: The package ID of Enterprise Distributed Application Service (EDAS) Container.
        :param str cluster_id: The ID of the cluster that you want to create the application.
        :param int cluster_type: The type of the cluster that you want to create. Valid values: 1: Swarm cluster. 2: ECS cluster. 3: Kubernates cluster.
        :param str region_id: The ID of the namespace the application belongs to.
        """
        GetApplicationsApplicationResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            app_id=app_id,
            app_name=app_name,
            application_type=application_type,
            build_package_id=build_package_id,
            cluster_id=cluster_id,
            cluster_type=cluster_type,
            region_id=region_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             app_id: str,
             app_name: str,
             application_type: str,
             build_package_id: int,
             cluster_id: str,
             cluster_type: int,
             region_id: str,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("app_id", app_id)
        _setter("app_name", app_name)
        _setter("application_type", application_type)
        _setter("build_package_id", build_package_id)
        _setter("cluster_id", cluster_id)
        _setter("cluster_type", cluster_type)
        _setter("region_id", region_id)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> str:
        """
        The ID of the application that you want to deploy.
        """
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter(name="appName")
    def app_name(self) -> str:
        """
        The name of your EDAS application. Only letters '-' '_' and numbers are allowed. The length cannot exceed 36 characters.
        """
        return pulumi.get(self, "app_name")

    @property
    @pulumi.getter(name="applicationType")
    def application_type(self) -> str:
        """
        The type of the package for the deployment of the application that you want to create. The valid values are: WAR and JAR. We strongly recommend you to set this parameter when creating the application.
        """
        return pulumi.get(self, "application_type")

    @property
    @pulumi.getter(name="buildPackageId")
    def build_package_id(self) -> int:
        """
        The package ID of Enterprise Distributed Application Service (EDAS) Container.
        """
        return pulumi.get(self, "build_package_id")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        """
        The ID of the cluster that you want to create the application.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="clusterType")
    def cluster_type(self) -> int:
        """
        The type of the cluster that you want to create. Valid values: 1: Swarm cluster. 2: ECS cluster. 3: Kubernates cluster.
        """
        return pulumi.get(self, "cluster_type")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> str:
        """
        The ID of the namespace the application belongs to.
        """
        return pulumi.get(self, "region_id")


@pulumi.output_type
class GetClustersClusterResult(dict):
    def __init__(__self__, *,
                 cluster_id: str,
                 cluster_name: str,
                 cluster_type: int,
                 cpu: int,
                 cpu_used: int,
                 create_time: int,
                 mem: int,
                 mem_used: int,
                 network_mode: int,
                 node_num: int,
                 region_id: str,
                 update_time: int,
                 vpc_id: str):
        """
        :param str cluster_id: The ID of the cluster that you want to create the application.
        :param str cluster_name: The name of the cluster.
        :param int cluster_type: The type of the cluster, Valid values: 1: Swarm cluster. 2: ECS cluster. 3: Kubernates cluster.
        :param int cpu: The total number of CPUs in the cluster.
        :param int cpu_used: The number of used CPUs in the cluster.
        :param int create_time: Cluster's creation time.
        :param int mem: The total amount of memory in the cluser. Unit: MB.
        :param int mem_used: The amount of used memory in the cluser. Unit: MB.
        :param int network_mode: The network type of the cluster. Valid values: 1: classic network. 2: VPC.
        :param int node_num: The number of the Elastic Compute Service (ECS) instances that are deployed to the cluster.
        :param str region_id: The ID of the namespace the application belongs to.
        :param int update_time: The time when the cluster was last updated.
        :param str vpc_id: The ID of the Virtual Private Cloud (VPC) for the cluster.
        """
        GetClustersClusterResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_id=cluster_id,
            cluster_name=cluster_name,
            cluster_type=cluster_type,
            cpu=cpu,
            cpu_used=cpu_used,
            create_time=create_time,
            mem=mem,
            mem_used=mem_used,
            network_mode=network_mode,
            node_num=node_num,
            region_id=region_id,
            update_time=update_time,
            vpc_id=vpc_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_id: str,
             cluster_name: str,
             cluster_type: int,
             cpu: int,
             cpu_used: int,
             create_time: int,
             mem: int,
             mem_used: int,
             network_mode: int,
             node_num: int,
             region_id: str,
             update_time: int,
             vpc_id: str,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("cluster_id", cluster_id)
        _setter("cluster_name", cluster_name)
        _setter("cluster_type", cluster_type)
        _setter("cpu", cpu)
        _setter("cpu_used", cpu_used)
        _setter("create_time", create_time)
        _setter("mem", mem)
        _setter("mem_used", mem_used)
        _setter("network_mode", network_mode)
        _setter("node_num", node_num)
        _setter("region_id", region_id)
        _setter("update_time", update_time)
        _setter("vpc_id", vpc_id)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        """
        The ID of the cluster that you want to create the application.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        """
        The name of the cluster.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="clusterType")
    def cluster_type(self) -> int:
        """
        The type of the cluster, Valid values: 1: Swarm cluster. 2: ECS cluster. 3: Kubernates cluster.
        """
        return pulumi.get(self, "cluster_type")

    @property
    @pulumi.getter
    def cpu(self) -> int:
        """
        The total number of CPUs in the cluster.
        """
        return pulumi.get(self, "cpu")

    @property
    @pulumi.getter(name="cpuUsed")
    def cpu_used(self) -> int:
        """
        The number of used CPUs in the cluster.
        """
        return pulumi.get(self, "cpu_used")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> int:
        """
        Cluster's creation time.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def mem(self) -> int:
        """
        The total amount of memory in the cluser. Unit: MB.
        """
        return pulumi.get(self, "mem")

    @property
    @pulumi.getter(name="memUsed")
    def mem_used(self) -> int:
        """
        The amount of used memory in the cluser. Unit: MB.
        """
        return pulumi.get(self, "mem_used")

    @property
    @pulumi.getter(name="networkMode")
    def network_mode(self) -> int:
        """
        The network type of the cluster. Valid values: 1: classic network. 2: VPC.
        """
        return pulumi.get(self, "network_mode")

    @property
    @pulumi.getter(name="nodeNum")
    def node_num(self) -> int:
        """
        The number of the Elastic Compute Service (ECS) instances that are deployed to the cluster.
        """
        return pulumi.get(self, "node_num")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> str:
        """
        The ID of the namespace the application belongs to.
        """
        return pulumi.get(self, "region_id")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> int:
        """
        The time when the cluster was last updated.
        """
        return pulumi.get(self, "update_time")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        """
        The ID of the Virtual Private Cloud (VPC) for the cluster.
        """
        return pulumi.get(self, "vpc_id")


@pulumi.output_type
class GetDeployGroupsGroupResult(dict):
    def __init__(__self__, *,
                 app_id: str,
                 app_version_id: str,
                 cluster_id: str,
                 create_time: int,
                 group_id: str,
                 group_name: str,
                 group_type: int,
                 package_version_id: str,
                 update_time: int):
        """
        :param str app_id: ID of the EDAS application.
        :param str app_version_id: The version of the deployment package for the application.
        :param str cluster_id: The ID of the cluster that you want to create the application.
        :param int create_time: The time when the instance group was created.
        :param str group_id: The ID of the instance group.
        :param str group_name: The name of the instance group. The length cannot exceed 64 characters.
        :param int group_type: The type of the instance group. Valid values: 0: Default group. 1: Phased release is disabled for traffic management. 2: Phased release is enabled for traffic management.
        :param str package_version_id: The version of the deployment package for the instance group that was created.
        :param int update_time: The time when the instance group was updated.
        """
        GetDeployGroupsGroupResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            app_id=app_id,
            app_version_id=app_version_id,
            cluster_id=cluster_id,
            create_time=create_time,
            group_id=group_id,
            group_name=group_name,
            group_type=group_type,
            package_version_id=package_version_id,
            update_time=update_time,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             app_id: str,
             app_version_id: str,
             cluster_id: str,
             create_time: int,
             group_id: str,
             group_name: str,
             group_type: int,
             package_version_id: str,
             update_time: int,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("app_id", app_id)
        _setter("app_version_id", app_version_id)
        _setter("cluster_id", cluster_id)
        _setter("create_time", create_time)
        _setter("group_id", group_id)
        _setter("group_name", group_name)
        _setter("group_type", group_type)
        _setter("package_version_id", package_version_id)
        _setter("update_time", update_time)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> str:
        """
        ID of the EDAS application.
        """
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter(name="appVersionId")
    def app_version_id(self) -> str:
        """
        The version of the deployment package for the application.
        """
        return pulumi.get(self, "app_version_id")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        """
        The ID of the cluster that you want to create the application.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> int:
        """
        The time when the instance group was created.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        The ID of the instance group.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> str:
        """
        The name of the instance group. The length cannot exceed 64 characters.
        """
        return pulumi.get(self, "group_name")

    @property
    @pulumi.getter(name="groupType")
    def group_type(self) -> int:
        """
        The type of the instance group. Valid values: 0: Default group. 1: Phased release is disabled for traffic management. 2: Phased release is enabled for traffic management.
        """
        return pulumi.get(self, "group_type")

    @property
    @pulumi.getter(name="packageVersionId")
    def package_version_id(self) -> str:
        """
        The version of the deployment package for the instance group that was created.
        """
        return pulumi.get(self, "package_version_id")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> int:
        """
        The time when the instance group was updated.
        """
        return pulumi.get(self, "update_time")


@pulumi.output_type
class GetNamespacesNamespaceResult(dict):
    def __init__(__self__, *,
                 belong_region: str,
                 debug_enable: bool,
                 description: str,
                 id: str,
                 namespace_id: str,
                 namespace_logical_id: str,
                 namespace_name: str,
                 user_id: str):
        """
        :param str belong_region: The ID of the physical region to which the namespace belongs.
        :param bool debug_enable: Indicates whether remote debugging is allowed in this region.
        :param str description: The description of the namespace.
        :param str id: The ID of the resource.
        :param str namespace_id: The unique ID of the namespace generated by Enterprise Distributed Application Service (EDAS).
        :param str namespace_logical_id: The ID of the namespace. **Note:** The ID cannot be changed after the namespace is created. The ID is in the format of `Physical region ID:Logical region identifier`.
        :param str namespace_name: The name of the namespace.
        :param str user_id: The ID of the Alibaba Cloud account to which the namespace belongs.
        """
        GetNamespacesNamespaceResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            belong_region=belong_region,
            debug_enable=debug_enable,
            description=description,
            id=id,
            namespace_id=namespace_id,
            namespace_logical_id=namespace_logical_id,
            namespace_name=namespace_name,
            user_id=user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             belong_region: str,
             debug_enable: bool,
             description: str,
             id: str,
             namespace_id: str,
             namespace_logical_id: str,
             namespace_name: str,
             user_id: str,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("belong_region", belong_region)
        _setter("debug_enable", debug_enable)
        _setter("description", description)
        _setter("id", id)
        _setter("namespace_id", namespace_id)
        _setter("namespace_logical_id", namespace_logical_id)
        _setter("namespace_name", namespace_name)
        _setter("user_id", user_id)

    @property
    @pulumi.getter(name="belongRegion")
    def belong_region(self) -> str:
        """
        The ID of the physical region to which the namespace belongs.
        """
        return pulumi.get(self, "belong_region")

    @property
    @pulumi.getter(name="debugEnable")
    def debug_enable(self) -> bool:
        """
        Indicates whether remote debugging is allowed in this region.
        """
        return pulumi.get(self, "debug_enable")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the namespace.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> str:
        """
        The unique ID of the namespace generated by Enterprise Distributed Application Service (EDAS).
        """
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter(name="namespaceLogicalId")
    def namespace_logical_id(self) -> str:
        """
        The ID of the namespace. **Note:** The ID cannot be changed after the namespace is created. The ID is in the format of `Physical region ID:Logical region identifier`.
        """
        return pulumi.get(self, "namespace_logical_id")

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> str:
        """
        The name of the namespace.
        """
        return pulumi.get(self, "namespace_name")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> str:
        """
        The ID of the Alibaba Cloud account to which the namespace belongs.
        """
        return pulumi.get(self, "user_id")


