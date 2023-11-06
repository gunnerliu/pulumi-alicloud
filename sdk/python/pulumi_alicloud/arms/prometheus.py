# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PrometheusArgs', 'Prometheus']

@pulumi.input_type
class PrometheusArgs:
    def __init__(__self__, *,
                 cluster_type: pulumi.Input[str],
                 grafana_instance_id: pulumi.Input[str],
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 sub_clusters_json: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Prometheus resource.
        :param pulumi.Input[str] cluster_type: The type of the Prometheus instance. Valid values: `remote-write`, `ecs`, `global-view`, `aliyun-cs`.
        :param pulumi.Input[str] grafana_instance_id: The ID of the Grafana dedicated instance. When using the shared version of Grafana, you can set `grafana_instance_id` to `free`.
        :param pulumi.Input[str] cluster_id: The ID of the Kubernetes cluster. This parameter is required, if you set `cluster_type` to `aliyun-cs`.
        :param pulumi.Input[str] cluster_name: The name of the created cluster. This parameter is required, if you set `cluster_type` to `remote-write`, `ecs` or `global-view`.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] security_group_id: The ID of the security group. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        :param pulumi.Input[str] sub_clusters_json: The child instance json string of the globalView instance.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: The ID of the VPC. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        :param pulumi.Input[str] vswitch_id: The ID of the VSwitch. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        PrometheusArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_type=cluster_type,
            grafana_instance_id=grafana_instance_id,
            cluster_id=cluster_id,
            cluster_name=cluster_name,
            resource_group_id=resource_group_id,
            security_group_id=security_group_id,
            sub_clusters_json=sub_clusters_json,
            tags=tags,
            vpc_id=vpc_id,
            vswitch_id=vswitch_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_type: Optional[pulumi.Input[str]] = None,
             grafana_instance_id: Optional[pulumi.Input[str]] = None,
             cluster_id: Optional[pulumi.Input[str]] = None,
             cluster_name: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             security_group_id: Optional[pulumi.Input[str]] = None,
             sub_clusters_json: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             vpc_id: Optional[pulumi.Input[str]] = None,
             vswitch_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if cluster_type is None and 'clusterType' in kwargs:
            cluster_type = kwargs['clusterType']
        if cluster_type is None:
            raise TypeError("Missing 'cluster_type' argument")
        if grafana_instance_id is None and 'grafanaInstanceId' in kwargs:
            grafana_instance_id = kwargs['grafanaInstanceId']
        if grafana_instance_id is None:
            raise TypeError("Missing 'grafana_instance_id' argument")
        if cluster_id is None and 'clusterId' in kwargs:
            cluster_id = kwargs['clusterId']
        if cluster_name is None and 'clusterName' in kwargs:
            cluster_name = kwargs['clusterName']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if security_group_id is None and 'securityGroupId' in kwargs:
            security_group_id = kwargs['securityGroupId']
        if sub_clusters_json is None and 'subClustersJson' in kwargs:
            sub_clusters_json = kwargs['subClustersJson']
        if vpc_id is None and 'vpcId' in kwargs:
            vpc_id = kwargs['vpcId']
        if vswitch_id is None and 'vswitchId' in kwargs:
            vswitch_id = kwargs['vswitchId']

        _setter("cluster_type", cluster_type)
        _setter("grafana_instance_id", grafana_instance_id)
        if cluster_id is not None:
            _setter("cluster_id", cluster_id)
        if cluster_name is not None:
            _setter("cluster_name", cluster_name)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if security_group_id is not None:
            _setter("security_group_id", security_group_id)
        if sub_clusters_json is not None:
            _setter("sub_clusters_json", sub_clusters_json)
        if tags is not None:
            _setter("tags", tags)
        if vpc_id is not None:
            _setter("vpc_id", vpc_id)
        if vswitch_id is not None:
            _setter("vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="clusterType")
    def cluster_type(self) -> pulumi.Input[str]:
        """
        The type of the Prometheus instance. Valid values: `remote-write`, `ecs`, `global-view`, `aliyun-cs`.
        """
        return pulumi.get(self, "cluster_type")

    @cluster_type.setter
    def cluster_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_type", value)

    @property
    @pulumi.getter(name="grafanaInstanceId")
    def grafana_instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the Grafana dedicated instance. When using the shared version of Grafana, you can set `grafana_instance_id` to `free`.
        """
        return pulumi.get(self, "grafana_instance_id")

    @grafana_instance_id.setter
    def grafana_instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "grafana_instance_id", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Kubernetes cluster. This parameter is required, if you set `cluster_type` to `aliyun-cs`.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the created cluster. This parameter is required, if you set `cluster_type` to `remote-write`, `ecs` or `global-view`.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the security group. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        return pulumi.get(self, "security_group_id")

    @security_group_id.setter
    def security_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_group_id", value)

    @property
    @pulumi.getter(name="subClustersJson")
    def sub_clusters_json(self) -> Optional[pulumi.Input[str]]:
        """
        The child instance json string of the globalView instance.
        """
        return pulumi.get(self, "sub_clusters_json")

    @sub_clusters_json.setter
    def sub_clusters_json(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sub_clusters_json", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VSwitch. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)


@pulumi.input_type
class _PrometheusState:
    def __init__(__self__, *,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 cluster_type: Optional[pulumi.Input[str]] = None,
                 grafana_instance_id: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 sub_clusters_json: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Prometheus resources.
        :param pulumi.Input[str] cluster_id: The ID of the Kubernetes cluster. This parameter is required, if you set `cluster_type` to `aliyun-cs`.
        :param pulumi.Input[str] cluster_name: The name of the created cluster. This parameter is required, if you set `cluster_type` to `remote-write`, `ecs` or `global-view`.
        :param pulumi.Input[str] cluster_type: The type of the Prometheus instance. Valid values: `remote-write`, `ecs`, `global-view`, `aliyun-cs`.
        :param pulumi.Input[str] grafana_instance_id: The ID of the Grafana dedicated instance. When using the shared version of Grafana, you can set `grafana_instance_id` to `free`.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] security_group_id: The ID of the security group. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        :param pulumi.Input[str] sub_clusters_json: The child instance json string of the globalView instance.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: The ID of the VPC. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        :param pulumi.Input[str] vswitch_id: The ID of the VSwitch. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        _PrometheusState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_id=cluster_id,
            cluster_name=cluster_name,
            cluster_type=cluster_type,
            grafana_instance_id=grafana_instance_id,
            resource_group_id=resource_group_id,
            security_group_id=security_group_id,
            sub_clusters_json=sub_clusters_json,
            tags=tags,
            vpc_id=vpc_id,
            vswitch_id=vswitch_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_id: Optional[pulumi.Input[str]] = None,
             cluster_name: Optional[pulumi.Input[str]] = None,
             cluster_type: Optional[pulumi.Input[str]] = None,
             grafana_instance_id: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             security_group_id: Optional[pulumi.Input[str]] = None,
             sub_clusters_json: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             vpc_id: Optional[pulumi.Input[str]] = None,
             vswitch_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if cluster_id is None and 'clusterId' in kwargs:
            cluster_id = kwargs['clusterId']
        if cluster_name is None and 'clusterName' in kwargs:
            cluster_name = kwargs['clusterName']
        if cluster_type is None and 'clusterType' in kwargs:
            cluster_type = kwargs['clusterType']
        if grafana_instance_id is None and 'grafanaInstanceId' in kwargs:
            grafana_instance_id = kwargs['grafanaInstanceId']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if security_group_id is None and 'securityGroupId' in kwargs:
            security_group_id = kwargs['securityGroupId']
        if sub_clusters_json is None and 'subClustersJson' in kwargs:
            sub_clusters_json = kwargs['subClustersJson']
        if vpc_id is None and 'vpcId' in kwargs:
            vpc_id = kwargs['vpcId']
        if vswitch_id is None and 'vswitchId' in kwargs:
            vswitch_id = kwargs['vswitchId']

        if cluster_id is not None:
            _setter("cluster_id", cluster_id)
        if cluster_name is not None:
            _setter("cluster_name", cluster_name)
        if cluster_type is not None:
            _setter("cluster_type", cluster_type)
        if grafana_instance_id is not None:
            _setter("grafana_instance_id", grafana_instance_id)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if security_group_id is not None:
            _setter("security_group_id", security_group_id)
        if sub_clusters_json is not None:
            _setter("sub_clusters_json", sub_clusters_json)
        if tags is not None:
            _setter("tags", tags)
        if vpc_id is not None:
            _setter("vpc_id", vpc_id)
        if vswitch_id is not None:
            _setter("vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Kubernetes cluster. This parameter is required, if you set `cluster_type` to `aliyun-cs`.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the created cluster. This parameter is required, if you set `cluster_type` to `remote-write`, `ecs` or `global-view`.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="clusterType")
    def cluster_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the Prometheus instance. Valid values: `remote-write`, `ecs`, `global-view`, `aliyun-cs`.
        """
        return pulumi.get(self, "cluster_type")

    @cluster_type.setter
    def cluster_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_type", value)

    @property
    @pulumi.getter(name="grafanaInstanceId")
    def grafana_instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Grafana dedicated instance. When using the shared version of Grafana, you can set `grafana_instance_id` to `free`.
        """
        return pulumi.get(self, "grafana_instance_id")

    @grafana_instance_id.setter
    def grafana_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "grafana_instance_id", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the security group. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        return pulumi.get(self, "security_group_id")

    @security_group_id.setter
    def security_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_group_id", value)

    @property
    @pulumi.getter(name="subClustersJson")
    def sub_clusters_json(self) -> Optional[pulumi.Input[str]]:
        """
        The child instance json string of the globalView instance.
        """
        return pulumi.get(self, "sub_clusters_json")

    @sub_clusters_json.setter
    def sub_clusters_json(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sub_clusters_json", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VSwitch. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)


class Prometheus(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 cluster_type: Optional[pulumi.Input[str]] = None,
                 grafana_instance_id: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 sub_clusters_json: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Application Real-Time Monitoring Service (ARMS) Prometheus resource.

        For information about Application Real-Time Monitoring Service (ARMS) Prometheus and how to use it, see [What is Prometheus](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-createprometheusinstance).

        > **NOTE:** Available since v1.203.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[len(default_zones.zones) - 1].id)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default_prometheus = alicloud.arms.Prometheus("defaultPrometheus",
            cluster_type="ecs",
            grafana_instance_id="free",
            vpc_id=default_network.id,
            vswitch_id=default_switch.id,
            security_group_id=default_security_group.id,
            cluster_name=default_network.id.apply(lambda id: f"{name}-{id}"),
            resource_group_id=default_resource_groups.groups[0].id,
            tags={
                "Created": "TF",
                "For": "Prometheus",
            })
        ```

        ## Import

        Application Real-Time Monitoring Service (ARMS) Prometheus can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:arms/prometheus:Prometheus example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the Kubernetes cluster. This parameter is required, if you set `cluster_type` to `aliyun-cs`.
        :param pulumi.Input[str] cluster_name: The name of the created cluster. This parameter is required, if you set `cluster_type` to `remote-write`, `ecs` or `global-view`.
        :param pulumi.Input[str] cluster_type: The type of the Prometheus instance. Valid values: `remote-write`, `ecs`, `global-view`, `aliyun-cs`.
        :param pulumi.Input[str] grafana_instance_id: The ID of the Grafana dedicated instance. When using the shared version of Grafana, you can set `grafana_instance_id` to `free`.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] security_group_id: The ID of the security group. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        :param pulumi.Input[str] sub_clusters_json: The child instance json string of the globalView instance.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: The ID of the VPC. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        :param pulumi.Input[str] vswitch_id: The ID of the VSwitch. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrometheusArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Application Real-Time Monitoring Service (ARMS) Prometheus resource.

        For information about Application Real-Time Monitoring Service (ARMS) Prometheus and how to use it, see [What is Prometheus](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-createprometheusinstance).

        > **NOTE:** Available since v1.203.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[len(default_zones.zones) - 1].id)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default_prometheus = alicloud.arms.Prometheus("defaultPrometheus",
            cluster_type="ecs",
            grafana_instance_id="free",
            vpc_id=default_network.id,
            vswitch_id=default_switch.id,
            security_group_id=default_security_group.id,
            cluster_name=default_network.id.apply(lambda id: f"{name}-{id}"),
            resource_group_id=default_resource_groups.groups[0].id,
            tags={
                "Created": "TF",
                "For": "Prometheus",
            })
        ```

        ## Import

        Application Real-Time Monitoring Service (ARMS) Prometheus can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:arms/prometheus:Prometheus example <id>
        ```

        :param str resource_name: The name of the resource.
        :param PrometheusArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrometheusArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            PrometheusArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 cluster_type: Optional[pulumi.Input[str]] = None,
                 grafana_instance_id: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 sub_clusters_json: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrometheusArgs.__new__(PrometheusArgs)

            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["cluster_name"] = cluster_name
            if cluster_type is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_type'")
            __props__.__dict__["cluster_type"] = cluster_type
            if grafana_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'grafana_instance_id'")
            __props__.__dict__["grafana_instance_id"] = grafana_instance_id
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["security_group_id"] = security_group_id
            __props__.__dict__["sub_clusters_json"] = sub_clusters_json
            __props__.__dict__["tags"] = tags
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["vswitch_id"] = vswitch_id
        super(Prometheus, __self__).__init__(
            'alicloud:arms/prometheus:Prometheus',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            cluster_type: Optional[pulumi.Input[str]] = None,
            grafana_instance_id: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            security_group_id: Optional[pulumi.Input[str]] = None,
            sub_clusters_json: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None) -> 'Prometheus':
        """
        Get an existing Prometheus resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the Kubernetes cluster. This parameter is required, if you set `cluster_type` to `aliyun-cs`.
        :param pulumi.Input[str] cluster_name: The name of the created cluster. This parameter is required, if you set `cluster_type` to `remote-write`, `ecs` or `global-view`.
        :param pulumi.Input[str] cluster_type: The type of the Prometheus instance. Valid values: `remote-write`, `ecs`, `global-view`, `aliyun-cs`.
        :param pulumi.Input[str] grafana_instance_id: The ID of the Grafana dedicated instance. When using the shared version of Grafana, you can set `grafana_instance_id` to `free`.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] security_group_id: The ID of the security group. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        :param pulumi.Input[str] sub_clusters_json: The child instance json string of the globalView instance.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: The ID of the VPC. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        :param pulumi.Input[str] vswitch_id: The ID of the VSwitch. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrometheusState.__new__(_PrometheusState)

        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["cluster_name"] = cluster_name
        __props__.__dict__["cluster_type"] = cluster_type
        __props__.__dict__["grafana_instance_id"] = grafana_instance_id
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["security_group_id"] = security_group_id
        __props__.__dict__["sub_clusters_json"] = sub_clusters_json
        __props__.__dict__["tags"] = tags
        __props__.__dict__["vpc_id"] = vpc_id
        __props__.__dict__["vswitch_id"] = vswitch_id
        return Prometheus(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The ID of the Kubernetes cluster. This parameter is required, if you set `cluster_type` to `aliyun-cs`.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Output[str]:
        """
        The name of the created cluster. This parameter is required, if you set `cluster_type` to `remote-write`, `ecs` or `global-view`.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="clusterType")
    def cluster_type(self) -> pulumi.Output[str]:
        """
        The type of the Prometheus instance. Valid values: `remote-write`, `ecs`, `global-view`, `aliyun-cs`.
        """
        return pulumi.get(self, "cluster_type")

    @property
    @pulumi.getter(name="grafanaInstanceId")
    def grafana_instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the Grafana dedicated instance. When using the shared version of Grafana, you can set `grafana_instance_id` to `free`.
        """
        return pulumi.get(self, "grafana_instance_id")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the security group. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        return pulumi.get(self, "security_group_id")

    @property
    @pulumi.getter(name="subClustersJson")
    def sub_clusters_json(self) -> pulumi.Output[Optional[str]]:
        """
        The child instance json string of the globalView instance.
        """
        return pulumi.get(self, "sub_clusters_json")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the VPC. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the VSwitch. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        """
        return pulumi.get(self, "vswitch_id")

