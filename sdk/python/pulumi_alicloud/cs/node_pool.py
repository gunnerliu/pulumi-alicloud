# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['NodePool']


class NodePool(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_renew: Optional[pulumi.Input[bool]] = None,
                 auto_renew_period: Optional[pulumi.Input[int]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 data_disks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodePoolDataDiskArgs']]]]] = None,
                 image_id: Optional[pulumi.Input[str]] = None,
                 install_cloud_monitor: Optional[pulumi.Input[bool]] = None,
                 instance_charge_type: Optional[pulumi.Input[str]] = None,
                 instance_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 key_name: Optional[pulumi.Input[str]] = None,
                 kms_encrypted_password: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodePoolLabelArgs']]]]] = None,
                 management: Optional[pulumi.Input[pulumi.InputType['NodePoolManagementArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_count: Optional[pulumi.Input[int]] = None,
                 node_name_mode: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 period_unit: Optional[pulumi.Input[str]] = None,
                 scaling_config: Optional[pulumi.Input[pulumi.InputType['NodePoolScalingConfigArgs']]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 system_disk_category: Optional[pulumi.Input[str]] = None,
                 system_disk_size: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 taints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodePoolTaintArgs']]]]] = None,
                 unschedulable: Optional[pulumi.Input[bool]] = None,
                 user_data: Optional[pulumi.Input[str]] = None,
                 vswitch_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        Cluster nodepool can be imported using the id, e.g. Then complete the nodepool.tf accords to the result of `terraform plan`.

        ```sh
         $ pulumi import alicloud:cs/nodePool:NodePool alicloud_cs_node_pool.custom_nodepool cluster_id:nodepool_id
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_renew: Enable Node payment auto-renew, default is `false`.
        :param pulumi.Input[int] auto_renew_period: Node payment auto-renew period, one of `1`, `2`, `3`,`6`, `12`.
        :param pulumi.Input[str] cluster_id: The id of kubernetes cluster.
        :param pulumi.Input[str] image_id: Custom Image support. Must based on CentOS7 or AliyunLinux2.
        :param pulumi.Input[bool] install_cloud_monitor: Install the cloud monitoring plug-in on the node, and you can view the monitoring information of the instance through the cloud monitoring console. Default is `false`.
        :param pulumi.Input[str] instance_charge_type: Node payment type. Valid values: `PostPaid`, `PrePaid`, default is `PostPaid`. If value is `PrePaid`, the arguments `period`, `period_unit`, `auto_renew` and `auto_renew_period` are required.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types: The instance type of worker node.
        :param pulumi.Input[str] key_name: The keypair of ssh login cluster node, you have to create it first. You have to specify one of `password` `key_name` `kms_encrypted_password` fields. Only `key_name` is supported in the management node pool.
        :param pulumi.Input[str] kms_encrypted_password: An KMS encrypts password used to a cs kubernetes. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodePoolLabelArgs']]]] labels: A List of Kubernetes labels to assign to the nodes . Only labels that are applied with the ACK API are managed by this argument.
               * key: The label key.
               * value: The label value.
        :param pulumi.Input[pulumi.InputType['NodePoolManagementArgs']] management: Managed node pool configuration. When using a managed node pool, the node key must use `key_name`. Detailed below.
        :param pulumi.Input[str] name: The name of node pool.
        :param pulumi.Input[int] node_count: The worker node number of the node pool. From version 1.111.0, `node_count` is not required.
        :param pulumi.Input[str] node_name_mode: Each node name consists of a prefix, an IP substring, and a suffix. For example "customized,aliyun.com,5,test", if the node IP address is 192.168.0.55, the prefix is aliyun.com, IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.
        :param pulumi.Input[str] password: The password of ssh login cluster node. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        :param pulumi.Input[int] period: Node payment period. Its valid value is one of {1, 2, 3, 6, 12, 24, 36, 48, 60}.
        :param pulumi.Input[str] period_unit: Node payment period unit, valid value: `Month`. Default is `Month`.
        :param pulumi.Input[pulumi.InputType['NodePoolScalingConfigArgs']] scaling_config: Auto scaling node pool configuration. For more details, see `scaling_config`.
        :param pulumi.Input[str] security_group_id: The system disk size of worker node.
        :param pulumi.Input[str] system_disk_category: The system disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
        :param pulumi.Input[int] system_disk_size: The system disk category of worker node. Its valid value range [40~500] in GB. Default to `120`.
        :param pulumi.Input[Mapping[str, Any]] tags: A List of tags to assign to the resource. It will be applied for ECS instances finally.
               * key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot be a null string.
               * value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be a null string.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodePoolTaintArgs']]]] taints: A List of Kubernetes taints to assign to the nodes.
        :param pulumi.Input[bool] unschedulable: Set the newly added node as unschedulable. If you want to open the scheduling option, you can open it in the node list of the console. If you are using an auto-scaling node pool, the setting will not take effect. Default is `false`.
        :param pulumi.Input[str] user_data: Windows instances support batch and PowerShell scripts. If your script file is larger than 1 KB, we recommend that you upload the script to Object Storage Service (OSS) and pull it through the internal endpoint of your OSS bucket.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vswitch_ids: The vswitches used by node pool workers.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['auto_renew'] = auto_renew
            __props__['auto_renew_period'] = auto_renew_period
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__['cluster_id'] = cluster_id
            __props__['data_disks'] = data_disks
            __props__['image_id'] = image_id
            __props__['install_cloud_monitor'] = install_cloud_monitor
            __props__['instance_charge_type'] = instance_charge_type
            if instance_types is None and not opts.urn:
                raise TypeError("Missing required property 'instance_types'")
            __props__['instance_types'] = instance_types
            __props__['key_name'] = key_name
            __props__['kms_encrypted_password'] = kms_encrypted_password
            __props__['labels'] = labels
            __props__['management'] = management
            __props__['name'] = name
            __props__['node_count'] = node_count
            __props__['node_name_mode'] = node_name_mode
            __props__['password'] = password
            __props__['period'] = period
            __props__['period_unit'] = period_unit
            __props__['scaling_config'] = scaling_config
            __props__['security_group_id'] = security_group_id
            __props__['system_disk_category'] = system_disk_category
            __props__['system_disk_size'] = system_disk_size
            __props__['tags'] = tags
            __props__['taints'] = taints
            __props__['unschedulable'] = unschedulable
            __props__['user_data'] = user_data
            if vswitch_ids is None and not opts.urn:
                raise TypeError("Missing required property 'vswitch_ids'")
            __props__['vswitch_ids'] = vswitch_ids
            __props__['scaling_group_id'] = None
            __props__['vpc_id'] = None
        super(NodePool, __self__).__init__(
            'alicloud:cs/nodePool:NodePool',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_renew: Optional[pulumi.Input[bool]] = None,
            auto_renew_period: Optional[pulumi.Input[int]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            data_disks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodePoolDataDiskArgs']]]]] = None,
            image_id: Optional[pulumi.Input[str]] = None,
            install_cloud_monitor: Optional[pulumi.Input[bool]] = None,
            instance_charge_type: Optional[pulumi.Input[str]] = None,
            instance_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            key_name: Optional[pulumi.Input[str]] = None,
            kms_encrypted_password: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodePoolLabelArgs']]]]] = None,
            management: Optional[pulumi.Input[pulumi.InputType['NodePoolManagementArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            node_count: Optional[pulumi.Input[int]] = None,
            node_name_mode: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[int]] = None,
            period_unit: Optional[pulumi.Input[str]] = None,
            scaling_config: Optional[pulumi.Input[pulumi.InputType['NodePoolScalingConfigArgs']]] = None,
            scaling_group_id: Optional[pulumi.Input[str]] = None,
            security_group_id: Optional[pulumi.Input[str]] = None,
            system_disk_category: Optional[pulumi.Input[str]] = None,
            system_disk_size: Optional[pulumi.Input[int]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            taints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodePoolTaintArgs']]]]] = None,
            unschedulable: Optional[pulumi.Input[bool]] = None,
            user_data: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            vswitch_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'NodePool':
        """
        Get an existing NodePool resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_renew: Enable Node payment auto-renew, default is `false`.
        :param pulumi.Input[int] auto_renew_period: Node payment auto-renew period, one of `1`, `2`, `3`,`6`, `12`.
        :param pulumi.Input[str] cluster_id: The id of kubernetes cluster.
        :param pulumi.Input[str] image_id: Custom Image support. Must based on CentOS7 or AliyunLinux2.
        :param pulumi.Input[bool] install_cloud_monitor: Install the cloud monitoring plug-in on the node, and you can view the monitoring information of the instance through the cloud monitoring console. Default is `false`.
        :param pulumi.Input[str] instance_charge_type: Node payment type. Valid values: `PostPaid`, `PrePaid`, default is `PostPaid`. If value is `PrePaid`, the arguments `period`, `period_unit`, `auto_renew` and `auto_renew_period` are required.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types: The instance type of worker node.
        :param pulumi.Input[str] key_name: The keypair of ssh login cluster node, you have to create it first. You have to specify one of `password` `key_name` `kms_encrypted_password` fields. Only `key_name` is supported in the management node pool.
        :param pulumi.Input[str] kms_encrypted_password: An KMS encrypts password used to a cs kubernetes. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodePoolLabelArgs']]]] labels: A List of Kubernetes labels to assign to the nodes . Only labels that are applied with the ACK API are managed by this argument.
               * key: The label key.
               * value: The label value.
        :param pulumi.Input[pulumi.InputType['NodePoolManagementArgs']] management: Managed node pool configuration. When using a managed node pool, the node key must use `key_name`. Detailed below.
        :param pulumi.Input[str] name: The name of node pool.
        :param pulumi.Input[int] node_count: The worker node number of the node pool. From version 1.111.0, `node_count` is not required.
        :param pulumi.Input[str] node_name_mode: Each node name consists of a prefix, an IP substring, and a suffix. For example "customized,aliyun.com,5,test", if the node IP address is 192.168.0.55, the prefix is aliyun.com, IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.
        :param pulumi.Input[str] password: The password of ssh login cluster node. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        :param pulumi.Input[int] period: Node payment period. Its valid value is one of {1, 2, 3, 6, 12, 24, 36, 48, 60}.
        :param pulumi.Input[str] period_unit: Node payment period unit, valid value: `Month`. Default is `Month`.
        :param pulumi.Input[pulumi.InputType['NodePoolScalingConfigArgs']] scaling_config: Auto scaling node pool configuration. For more details, see `scaling_config`.
        :param pulumi.Input[str] scaling_group_id: (Available in 1.105.0+) Id of the Scaling Group.
        :param pulumi.Input[str] security_group_id: The system disk size of worker node.
        :param pulumi.Input[str] system_disk_category: The system disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
        :param pulumi.Input[int] system_disk_size: The system disk category of worker node. Its valid value range [40~500] in GB. Default to `120`.
        :param pulumi.Input[Mapping[str, Any]] tags: A List of tags to assign to the resource. It will be applied for ECS instances finally.
               * key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot be a null string.
               * value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be a null string.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NodePoolTaintArgs']]]] taints: A List of Kubernetes taints to assign to the nodes.
        :param pulumi.Input[bool] unschedulable: Set the newly added node as unschedulable. If you want to open the scheduling option, you can open it in the node list of the console. If you are using an auto-scaling node pool, the setting will not take effect. Default is `false`.
        :param pulumi.Input[str] user_data: Windows instances support batch and PowerShell scripts. If your script file is larger than 1 KB, we recommend that you upload the script to Object Storage Service (OSS) and pull it through the internal endpoint of your OSS bucket.
        :param pulumi.Input[str] vpc_id: The ID of VPC where the current cluster is located.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vswitch_ids: The vswitches used by node pool workers.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["auto_renew"] = auto_renew
        __props__["auto_renew_period"] = auto_renew_period
        __props__["cluster_id"] = cluster_id
        __props__["data_disks"] = data_disks
        __props__["image_id"] = image_id
        __props__["install_cloud_monitor"] = install_cloud_monitor
        __props__["instance_charge_type"] = instance_charge_type
        __props__["instance_types"] = instance_types
        __props__["key_name"] = key_name
        __props__["kms_encrypted_password"] = kms_encrypted_password
        __props__["labels"] = labels
        __props__["management"] = management
        __props__["name"] = name
        __props__["node_count"] = node_count
        __props__["node_name_mode"] = node_name_mode
        __props__["password"] = password
        __props__["period"] = period
        __props__["period_unit"] = period_unit
        __props__["scaling_config"] = scaling_config
        __props__["scaling_group_id"] = scaling_group_id
        __props__["security_group_id"] = security_group_id
        __props__["system_disk_category"] = system_disk_category
        __props__["system_disk_size"] = system_disk_size
        __props__["tags"] = tags
        __props__["taints"] = taints
        __props__["unschedulable"] = unschedulable
        __props__["user_data"] = user_data
        __props__["vpc_id"] = vpc_id
        __props__["vswitch_ids"] = vswitch_ids
        return NodePool(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoRenew")
    def auto_renew(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable Node payment auto-renew, default is `false`.
        """
        return pulumi.get(self, "auto_renew")

    @property
    @pulumi.getter(name="autoRenewPeriod")
    def auto_renew_period(self) -> pulumi.Output[Optional[int]]:
        """
        Node payment auto-renew period, one of `1`, `2`, `3`,`6`, `12`.
        """
        return pulumi.get(self, "auto_renew_period")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The id of kubernetes cluster.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="dataDisks")
    def data_disks(self) -> pulumi.Output[Optional[Sequence['outputs.NodePoolDataDisk']]]:
        return pulumi.get(self, "data_disks")

    @property
    @pulumi.getter(name="imageId")
    def image_id(self) -> pulumi.Output[str]:
        """
        Custom Image support. Must based on CentOS7 or AliyunLinux2.
        """
        return pulumi.get(self, "image_id")

    @property
    @pulumi.getter(name="installCloudMonitor")
    def install_cloud_monitor(self) -> pulumi.Output[Optional[bool]]:
        """
        Install the cloud monitoring plug-in on the node, and you can view the monitoring information of the instance through the cloud monitoring console. Default is `false`.
        """
        return pulumi.get(self, "install_cloud_monitor")

    @property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> pulumi.Output[Optional[str]]:
        """
        Node payment type. Valid values: `PostPaid`, `PrePaid`, default is `PostPaid`. If value is `PrePaid`, the arguments `period`, `period_unit`, `auto_renew` and `auto_renew_period` are required.
        """
        return pulumi.get(self, "instance_charge_type")

    @property
    @pulumi.getter(name="instanceTypes")
    def instance_types(self) -> pulumi.Output[Sequence[str]]:
        """
        The instance type of worker node.
        """
        return pulumi.get(self, "instance_types")

    @property
    @pulumi.getter(name="keyName")
    def key_name(self) -> pulumi.Output[Optional[str]]:
        """
        The keypair of ssh login cluster node, you have to create it first. You have to specify one of `password` `key_name` `kms_encrypted_password` fields. Only `key_name` is supported in the management node pool.
        """
        return pulumi.get(self, "key_name")

    @property
    @pulumi.getter(name="kmsEncryptedPassword")
    def kms_encrypted_password(self) -> pulumi.Output[Optional[str]]:
        """
        An KMS encrypts password used to a cs kubernetes. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        """
        return pulumi.get(self, "kms_encrypted_password")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Sequence['outputs.NodePoolLabel']]]:
        """
        A List of Kubernetes labels to assign to the nodes . Only labels that are applied with the ACK API are managed by this argument.
        * key: The label key.
        * value: The label value.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def management(self) -> pulumi.Output[Optional['outputs.NodePoolManagement']]:
        """
        Managed node pool configuration. When using a managed node pool, the node key must use `key_name`. Detailed below.
        """
        return pulumi.get(self, "management")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of node pool.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeCount")
    def node_count(self) -> pulumi.Output[int]:
        """
        The worker node number of the node pool. From version 1.111.0, `node_count` is not required.
        """
        return pulumi.get(self, "node_count")

    @property
    @pulumi.getter(name="nodeNameMode")
    def node_name_mode(self) -> pulumi.Output[str]:
        """
        Each node name consists of a prefix, an IP substring, and a suffix. For example "customized,aliyun.com,5,test", if the node IP address is 192.168.0.55, the prefix is aliyun.com, IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.
        """
        return pulumi.get(self, "node_name_mode")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[str]]:
        """
        The password of ssh login cluster node. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[Optional[int]]:
        """
        Node payment period. Its valid value is one of {1, 2, 3, 6, 12, 24, 36, 48, 60}.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter(name="periodUnit")
    def period_unit(self) -> pulumi.Output[Optional[str]]:
        """
        Node payment period unit, valid value: `Month`. Default is `Month`.
        """
        return pulumi.get(self, "period_unit")

    @property
    @pulumi.getter(name="scalingConfig")
    def scaling_config(self) -> pulumi.Output['outputs.NodePoolScalingConfig']:
        """
        Auto scaling node pool configuration. For more details, see `scaling_config`.
        """
        return pulumi.get(self, "scaling_config")

    @property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> pulumi.Output[str]:
        """
        (Available in 1.105.0+) Id of the Scaling Group.
        """
        return pulumi.get(self, "scaling_group_id")

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> pulumi.Output[str]:
        """
        The system disk size of worker node.
        """
        return pulumi.get(self, "security_group_id")

    @property
    @pulumi.getter(name="systemDiskCategory")
    def system_disk_category(self) -> pulumi.Output[Optional[str]]:
        """
        The system disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
        """
        return pulumi.get(self, "system_disk_category")

    @property
    @pulumi.getter(name="systemDiskSize")
    def system_disk_size(self) -> pulumi.Output[Optional[int]]:
        """
        The system disk category of worker node. Its valid value range [40~500] in GB. Default to `120`.
        """
        return pulumi.get(self, "system_disk_size")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A List of tags to assign to the resource. It will be applied for ECS instances finally.
        * key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot be a null string.
        * value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be a null string.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def taints(self) -> pulumi.Output[Optional[Sequence['outputs.NodePoolTaint']]]:
        """
        A List of Kubernetes taints to assign to the nodes.
        """
        return pulumi.get(self, "taints")

    @property
    @pulumi.getter
    def unschedulable(self) -> pulumi.Output[Optional[bool]]:
        """
        Set the newly added node as unschedulable. If you want to open the scheduling option, you can open it in the node list of the console. If you are using an auto-scaling node pool, the setting will not take effect. Default is `false`.
        """
        return pulumi.get(self, "unschedulable")

    @property
    @pulumi.getter(name="userData")
    def user_data(self) -> pulumi.Output[Optional[str]]:
        """
        Windows instances support batch and PowerShell scripts. If your script file is larger than 1 KB, we recommend that you upload the script to Object Storage Service (OSS) and pull it through the internal endpoint of your OSS bucket.
        """
        return pulumi.get(self, "user_data")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The ID of VPC where the current cluster is located.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchIds")
    def vswitch_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        The vswitches used by node pool workers.
        """
        return pulumi.get(self, "vswitch_ids")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

