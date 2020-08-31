# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['ServerlessKubernetes']


class ServerlessKubernetes(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 addons: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['ServerlessKubernetesAddonArgs']]]]] = None,
                 client_cert: Optional[pulumi.Input[str]] = None,
                 client_key: Optional[pulumi.Input[str]] = None,
                 cluster_ca_cert: Optional[pulumi.Input[str]] = None,
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 endpoint_public_access_enabled: Optional[pulumi.Input[bool]] = None,
                 force_update: Optional[pulumi.Input[bool]] = None,
                 kube_config: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 new_nat_gateway: Optional[pulumi.Input[bool]] = None,
                 private_zone: Optional[pulumi.Input[bool]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 vswitch_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a ServerlessKubernetes resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] client_cert: The path of client certificate, like `~/.kube/client-cert.pem`.
        :param pulumi.Input[str] client_key: The path of client key, like `~/.kube/client-key.pem`.
        :param pulumi.Input[str] cluster_ca_cert: The path of cluster ca certificate, like `~/.kube/cluster-ca-cert.pem`
        :param pulumi.Input[bool] deletion_protection: Whether enable the deletion protection or not.
               - true: Enable deletion protection.
               - false: Disable deletion protection.
        :param pulumi.Input[bool] endpoint_public_access_enabled: Whether to create internet  eip for API Server. Default to false.
        :param pulumi.Input[bool] force_update: Default false, when you want to change `vpc_id` and `vswitch_id`, you have to set this field to true, then the cluster will be recreated.
        :param pulumi.Input[str] kube_config: The path of kube config, like `~/.kube/config`.
        :param pulumi.Input[str] name: The kubernetes cluster's name. It is the only in one Alicloud account.
        :param pulumi.Input[bool] new_nat_gateway: Whether to create a new nat gateway while creating kubernetes cluster. Default to true.
        :param pulumi.Input[bool] private_zone: Enable Privatezone if you need to use the service discovery feature within the serverless cluster. Default to false.
        :param pulumi.Input[str] security_group_id: The ID of the security group to which the ECS instances in the cluster belong. If it is not specified, a new Security group will be built.
        :param pulumi.Input[Mapping[str, Any]] tags: Default nil, A map of tags assigned to the kubernetes cluster .
        :param pulumi.Input[str] vpc_id: The vpc where new kubernetes cluster will be located. Specify one vpc's id, if it is not specified, a new VPC  will be built.
        :param pulumi.Input[str] vswitch_id: (Required, ForceNew) The vswitch where new kubernetes cluster will be located. Specify one vswitch's id, if it is not specified, a new VPC and VSwicth will be built. It must be in the zone which `availability_zone` specified.
        :param pulumi.Input[List[pulumi.Input[str]]] vswitch_ids: The vswitches where new kubernetes cluster will be located.
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

            __props__['addons'] = addons
            __props__['client_cert'] = client_cert
            __props__['client_key'] = client_key
            __props__['cluster_ca_cert'] = cluster_ca_cert
            __props__['deletion_protection'] = deletion_protection
            __props__['endpoint_public_access_enabled'] = endpoint_public_access_enabled
            __props__['force_update'] = force_update
            __props__['kube_config'] = kube_config
            __props__['name'] = name
            __props__['name_prefix'] = name_prefix
            __props__['new_nat_gateway'] = new_nat_gateway
            __props__['private_zone'] = private_zone
            __props__['security_group_id'] = security_group_id
            __props__['tags'] = tags
            if vpc_id is None:
                raise TypeError("Missing required property 'vpc_id'")
            __props__['vpc_id'] = vpc_id
            if vswitch_id is not None:
                warnings.warn("Field 'vswitch_id' has been deprecated from provider version 1.91.0. New field 'vswitch_ids' replace it.", DeprecationWarning)
                pulumi.log.warn("vswitch_id is deprecated: Field 'vswitch_id' has been deprecated from provider version 1.91.0. New field 'vswitch_ids' replace it.")
            __props__['vswitch_id'] = vswitch_id
            __props__['vswitch_ids'] = vswitch_ids
        super(ServerlessKubernetes, __self__).__init__(
            'alicloud:cs/serverlessKubernetes:ServerlessKubernetes',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            addons: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['ServerlessKubernetesAddonArgs']]]]] = None,
            client_cert: Optional[pulumi.Input[str]] = None,
            client_key: Optional[pulumi.Input[str]] = None,
            cluster_ca_cert: Optional[pulumi.Input[str]] = None,
            deletion_protection: Optional[pulumi.Input[bool]] = None,
            endpoint_public_access_enabled: Optional[pulumi.Input[bool]] = None,
            force_update: Optional[pulumi.Input[bool]] = None,
            kube_config: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            name_prefix: Optional[pulumi.Input[str]] = None,
            new_nat_gateway: Optional[pulumi.Input[bool]] = None,
            private_zone: Optional[pulumi.Input[bool]] = None,
            security_group_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None,
            vswitch_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None) -> 'ServerlessKubernetes':
        """
        Get an existing ServerlessKubernetes resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] client_cert: The path of client certificate, like `~/.kube/client-cert.pem`.
        :param pulumi.Input[str] client_key: The path of client key, like `~/.kube/client-key.pem`.
        :param pulumi.Input[str] cluster_ca_cert: The path of cluster ca certificate, like `~/.kube/cluster-ca-cert.pem`
        :param pulumi.Input[bool] deletion_protection: Whether enable the deletion protection or not.
               - true: Enable deletion protection.
               - false: Disable deletion protection.
        :param pulumi.Input[bool] endpoint_public_access_enabled: Whether to create internet  eip for API Server. Default to false.
        :param pulumi.Input[bool] force_update: Default false, when you want to change `vpc_id` and `vswitch_id`, you have to set this field to true, then the cluster will be recreated.
        :param pulumi.Input[str] kube_config: The path of kube config, like `~/.kube/config`.
        :param pulumi.Input[str] name: The kubernetes cluster's name. It is the only in one Alicloud account.
        :param pulumi.Input[bool] new_nat_gateway: Whether to create a new nat gateway while creating kubernetes cluster. Default to true.
        :param pulumi.Input[bool] private_zone: Enable Privatezone if you need to use the service discovery feature within the serverless cluster. Default to false.
        :param pulumi.Input[str] security_group_id: The ID of the security group to which the ECS instances in the cluster belong. If it is not specified, a new Security group will be built.
        :param pulumi.Input[Mapping[str, Any]] tags: Default nil, A map of tags assigned to the kubernetes cluster .
        :param pulumi.Input[str] vpc_id: The vpc where new kubernetes cluster will be located. Specify one vpc's id, if it is not specified, a new VPC  will be built.
        :param pulumi.Input[str] vswitch_id: (Required, ForceNew) The vswitch where new kubernetes cluster will be located. Specify one vswitch's id, if it is not specified, a new VPC and VSwicth will be built. It must be in the zone which `availability_zone` specified.
        :param pulumi.Input[List[pulumi.Input[str]]] vswitch_ids: The vswitches where new kubernetes cluster will be located.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["addons"] = addons
        __props__["client_cert"] = client_cert
        __props__["client_key"] = client_key
        __props__["cluster_ca_cert"] = cluster_ca_cert
        __props__["deletion_protection"] = deletion_protection
        __props__["endpoint_public_access_enabled"] = endpoint_public_access_enabled
        __props__["force_update"] = force_update
        __props__["kube_config"] = kube_config
        __props__["name"] = name
        __props__["name_prefix"] = name_prefix
        __props__["new_nat_gateway"] = new_nat_gateway
        __props__["private_zone"] = private_zone
        __props__["security_group_id"] = security_group_id
        __props__["tags"] = tags
        __props__["vpc_id"] = vpc_id
        __props__["vswitch_id"] = vswitch_id
        __props__["vswitch_ids"] = vswitch_ids
        return ServerlessKubernetes(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def addons(self) -> pulumi.Output[List['outputs.ServerlessKubernetesAddon']]:
        return pulumi.get(self, "addons")

    @property
    @pulumi.getter(name="clientCert")
    def client_cert(self) -> pulumi.Output[Optional[str]]:
        """
        The path of client certificate, like `~/.kube/client-cert.pem`.
        """
        return pulumi.get(self, "client_cert")

    @property
    @pulumi.getter(name="clientKey")
    def client_key(self) -> pulumi.Output[Optional[str]]:
        """
        The path of client key, like `~/.kube/client-key.pem`.
        """
        return pulumi.get(self, "client_key")

    @property
    @pulumi.getter(name="clusterCaCert")
    def cluster_ca_cert(self) -> pulumi.Output[Optional[str]]:
        """
        The path of cluster ca certificate, like `~/.kube/cluster-ca-cert.pem`
        """
        return pulumi.get(self, "cluster_ca_cert")

    @property
    @pulumi.getter(name="deletionProtection")
    def deletion_protection(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether enable the deletion protection or not.
        - true: Enable deletion protection.
        - false: Disable deletion protection.
        """
        return pulumi.get(self, "deletion_protection")

    @property
    @pulumi.getter(name="endpointPublicAccessEnabled")
    def endpoint_public_access_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to create internet  eip for API Server. Default to false.
        """
        return pulumi.get(self, "endpoint_public_access_enabled")

    @property
    @pulumi.getter(name="forceUpdate")
    def force_update(self) -> pulumi.Output[Optional[bool]]:
        """
        Default false, when you want to change `vpc_id` and `vswitch_id`, you have to set this field to true, then the cluster will be recreated.
        """
        return pulumi.get(self, "force_update")

    @property
    @pulumi.getter(name="kubeConfig")
    def kube_config(self) -> pulumi.Output[Optional[str]]:
        """
        The path of kube config, like `~/.kube/config`.
        """
        return pulumi.get(self, "kube_config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The kubernetes cluster's name. It is the only in one Alicloud account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "name_prefix")

    @property
    @pulumi.getter(name="newNatGateway")
    def new_nat_gateway(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to create a new nat gateway while creating kubernetes cluster. Default to true.
        """
        return pulumi.get(self, "new_nat_gateway")

    @property
    @pulumi.getter(name="privateZone")
    def private_zone(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable Privatezone if you need to use the service discovery feature within the serverless cluster. Default to false.
        """
        return pulumi.get(self, "private_zone")

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the security group to which the ECS instances in the cluster belong. If it is not specified, a new Security group will be built.
        """
        return pulumi.get(self, "security_group_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        Default nil, A map of tags assigned to the kubernetes cluster .
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The vpc where new kubernetes cluster will be located. Specify one vpc's id, if it is not specified, a new VPC  will be built.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[Optional[str]]:
        """
        (Required, ForceNew) The vswitch where new kubernetes cluster will be located. Specify one vswitch's id, if it is not specified, a new VPC and VSwicth will be built. It must be in the zone which `availability_zone` specified.
        """
        return pulumi.get(self, "vswitch_id")

    @property
    @pulumi.getter(name="vswitchIds")
    def vswitch_ids(self) -> pulumi.Output[List[str]]:
        """
        The vswitches where new kubernetes cluster will be located.
        """
        return pulumi.get(self, "vswitch_ids")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

