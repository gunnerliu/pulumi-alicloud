# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['Instance']


class Instance(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_node_amount: Optional[pulumi.Input[int]] = None,
                 client_node_spec: Optional[pulumi.Input[str]] = None,
                 data_node_amount: Optional[pulumi.Input[int]] = None,
                 data_node_disk_encrypted: Optional[pulumi.Input[bool]] = None,
                 data_node_disk_size: Optional[pulumi.Input[int]] = None,
                 data_node_disk_type: Optional[pulumi.Input[str]] = None,
                 data_node_spec: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enable_kibana_private_network: Optional[pulumi.Input[bool]] = None,
                 enable_kibana_public_network: Optional[pulumi.Input[bool]] = None,
                 enable_public: Optional[pulumi.Input[bool]] = None,
                 instance_charge_type: Optional[pulumi.Input[str]] = None,
                 kibana_private_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 kibana_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 kms_encrypted_password: Optional[pulumi.Input[str]] = None,
                 kms_encryption_context: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 master_node_spec: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 private_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 public_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 zone_count: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Elasticsearch instance resource. It contains data nodes, dedicated master node(optional) and etc. It can be associated with private IP whitelists and kibana IP whitelist.

        > **NOTE:** Only one operation is supported in a request. So if `data_node_spec` and `data_node_disk_size` are both changed, system will respond error.

        > **NOTE:** At present, `version` can not be modified once instance has been created.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        instance = alicloud.elasticsearch.Instance("instance",
            client_node_amount=2,
            client_node_spec="elasticsearch.sn2ne.large",
            data_node_amount=2,
            data_node_disk_size=20,
            data_node_disk_type="cloud_ssd",
            data_node_spec="elasticsearch.sn2ne.large",
            description="description",
            instance_charge_type="PostPaid",
            password="Your password",
            protocol="HTTPS",
            tags={
                "key1": "value1",
                "key2": "value2",
            },
            version="5.5.3_with_X-Pack",
            vswitch_id="some vswitch id",
            zone_count=2)
        ```

        ## Import

        Elasticsearch can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:elasticsearch/instance:Instance example es-cn-abcde123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] client_node_amount: The Elasticsearch cluster's client node quantity, between 2 and 25.
        :param pulumi.Input[str] client_node_spec: The client node spec. If specified, client node will be created.
        :param pulumi.Input[int] data_node_amount: The Elasticsearch cluster's data node quantity, between 2 and 50.
        :param pulumi.Input[bool] data_node_disk_encrypted: If encrypt the data node disk. Valid values are `true`, `false`. Default to `false`.
        :param pulumi.Input[int] data_node_disk_size: The single data node storage space.
               - `cloud_ssd`: An SSD disk, supports a maximum of 2048 GiB (2 TB).
        :param pulumi.Input[str] data_node_disk_type: The data node disk type. Supported values: cloud_ssd, cloud_efficiency.
        :param pulumi.Input[str] data_node_spec: The data node specifications of the Elasticsearch instance.
        :param pulumi.Input[str] description: The description of instance. It a string of 0 to 30 characters.
        :param pulumi.Input[bool] enable_kibana_private_network: Bool, default to false. When it set to true, the instance can close kibana private network access。
        :param pulumi.Input[bool] enable_kibana_public_network: Bool, default to true. When it set to false, the instance can enable kibana public network access。
        :param pulumi.Input[bool] enable_public: Bool, default to false. When it set to true, the instance can enable public network access。
        :param pulumi.Input[str] instance_charge_type: Valid values are `PrePaid`, `PostPaid`. Default to `PostPaid`. From version 1.69.0, the Elasticsearch cluster allows you to update your instance_charge_ype from `PostPaid` to `PrePaid`, the following attributes are required: `period`. But, updating from `PostPaid` to `PrePaid` is not supported.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] kibana_private_whitelists: Set the Kibana's IP whitelist in private network.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] kibana_whitelists: Set the Kibana's IP whitelist in internet network.
        :param pulumi.Input[str] kms_encrypted_password: An KMS encrypts password used to a instance. If the `password` is filled in, this field will be ignored, but you have to specify one of `password` and `kms_encrypted_password` fields.
        :param pulumi.Input[Mapping[str, Any]] kms_encryption_context: An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        :param pulumi.Input[str] master_node_spec: The dedicated master node spec. If specified, dedicated master node will be created.
        :param pulumi.Input[str] password: The password of the instance. The password can be 8 to 30 characters in length and must contain three of the following conditions: uppercase letters, lowercase letters, numbers, and special characters (`!@#$%^&*()_+-=`).
        :param pulumi.Input[int] period: The duration that you will buy Elasticsearch instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1. From version 1.69.2, when to modify this value, the resource can renewal a `PrePaid` instance.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] private_whitelists: Set the instance's IP whitelist in VPC network.
        :param pulumi.Input[str] protocol: Elasticsearch protocol. Supported values: `HTTP`, `HTTPS`.default is `HTTP`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] public_whitelists: Set the instance's IP whitelist in internet network.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the Elasticsearch instance belongs.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource. 
               - key: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:". It cannot contain "http://" and "https://". It cannot be a null string.
               - value: It can be up to 128 characters in length. It cannot contain "http://" and "https://". It can be a null string.
        :param pulumi.Input[str] version: Elasticsearch version. Supported values: `5.5.3_with_X-Pack`, `6.3_with_X-Pack`, `6.7_with_X-Pack`, `6.8_with_X-Pack`, `7.4_with_X-Pack` and `7.7_with_X-Pack`.
        :param pulumi.Input[str] vswitch_id: The ID of VSwitch.
        :param pulumi.Input[int] zone_count: The Multi-AZ supported for Elasticsearch, between 1 and 3. The `data_node_amount` value must be an integral multiple of the `zone_count` value.
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

            __props__['client_node_amount'] = client_node_amount
            __props__['client_node_spec'] = client_node_spec
            if data_node_amount is None:
                raise TypeError("Missing required property 'data_node_amount'")
            __props__['data_node_amount'] = data_node_amount
            __props__['data_node_disk_encrypted'] = data_node_disk_encrypted
            if data_node_disk_size is None:
                raise TypeError("Missing required property 'data_node_disk_size'")
            __props__['data_node_disk_size'] = data_node_disk_size
            if data_node_disk_type is None:
                raise TypeError("Missing required property 'data_node_disk_type'")
            __props__['data_node_disk_type'] = data_node_disk_type
            if data_node_spec is None:
                raise TypeError("Missing required property 'data_node_spec'")
            __props__['data_node_spec'] = data_node_spec
            __props__['description'] = description
            __props__['enable_kibana_private_network'] = enable_kibana_private_network
            __props__['enable_kibana_public_network'] = enable_kibana_public_network
            __props__['enable_public'] = enable_public
            __props__['instance_charge_type'] = instance_charge_type
            __props__['kibana_private_whitelists'] = kibana_private_whitelists
            __props__['kibana_whitelists'] = kibana_whitelists
            __props__['kms_encrypted_password'] = kms_encrypted_password
            __props__['kms_encryption_context'] = kms_encryption_context
            __props__['master_node_spec'] = master_node_spec
            __props__['password'] = password
            __props__['period'] = period
            __props__['private_whitelists'] = private_whitelists
            __props__['protocol'] = protocol
            __props__['public_whitelists'] = public_whitelists
            __props__['resource_group_id'] = resource_group_id
            __props__['tags'] = tags
            if version is None:
                raise TypeError("Missing required property 'version'")
            __props__['version'] = version
            if vswitch_id is None:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__['vswitch_id'] = vswitch_id
            __props__['zone_count'] = zone_count
            __props__['domain'] = None
            __props__['kibana_domain'] = None
            __props__['kibana_port'] = None
            __props__['port'] = None
            __props__['status'] = None
        super(Instance, __self__).__init__(
            'alicloud:elasticsearch/instance:Instance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            client_node_amount: Optional[pulumi.Input[int]] = None,
            client_node_spec: Optional[pulumi.Input[str]] = None,
            data_node_amount: Optional[pulumi.Input[int]] = None,
            data_node_disk_encrypted: Optional[pulumi.Input[bool]] = None,
            data_node_disk_size: Optional[pulumi.Input[int]] = None,
            data_node_disk_type: Optional[pulumi.Input[str]] = None,
            data_node_spec: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            domain: Optional[pulumi.Input[str]] = None,
            enable_kibana_private_network: Optional[pulumi.Input[bool]] = None,
            enable_kibana_public_network: Optional[pulumi.Input[bool]] = None,
            enable_public: Optional[pulumi.Input[bool]] = None,
            instance_charge_type: Optional[pulumi.Input[str]] = None,
            kibana_domain: Optional[pulumi.Input[str]] = None,
            kibana_port: Optional[pulumi.Input[int]] = None,
            kibana_private_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            kibana_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            kms_encrypted_password: Optional[pulumi.Input[str]] = None,
            kms_encryption_context: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            master_node_spec: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[int]] = None,
            port: Optional[pulumi.Input[int]] = None,
            private_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            protocol: Optional[pulumi.Input[str]] = None,
            public_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            version: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None,
            zone_count: Optional[pulumi.Input[int]] = None) -> 'Instance':
        """
        Get an existing Instance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] client_node_amount: The Elasticsearch cluster's client node quantity, between 2 and 25.
        :param pulumi.Input[str] client_node_spec: The client node spec. If specified, client node will be created.
        :param pulumi.Input[int] data_node_amount: The Elasticsearch cluster's data node quantity, between 2 and 50.
        :param pulumi.Input[bool] data_node_disk_encrypted: If encrypt the data node disk. Valid values are `true`, `false`. Default to `false`.
        :param pulumi.Input[int] data_node_disk_size: The single data node storage space.
               - `cloud_ssd`: An SSD disk, supports a maximum of 2048 GiB (2 TB).
        :param pulumi.Input[str] data_node_disk_type: The data node disk type. Supported values: cloud_ssd, cloud_efficiency.
        :param pulumi.Input[str] data_node_spec: The data node specifications of the Elasticsearch instance.
        :param pulumi.Input[str] description: The description of instance. It a string of 0 to 30 characters.
        :param pulumi.Input[str] domain: Instance connection domain (only VPC network access supported).
        :param pulumi.Input[bool] enable_kibana_private_network: Bool, default to false. When it set to true, the instance can close kibana private network access。
        :param pulumi.Input[bool] enable_kibana_public_network: Bool, default to true. When it set to false, the instance can enable kibana public network access。
        :param pulumi.Input[bool] enable_public: Bool, default to false. When it set to true, the instance can enable public network access。
        :param pulumi.Input[str] instance_charge_type: Valid values are `PrePaid`, `PostPaid`. Default to `PostPaid`. From version 1.69.0, the Elasticsearch cluster allows you to update your instance_charge_ype from `PostPaid` to `PrePaid`, the following attributes are required: `period`. But, updating from `PostPaid` to `PrePaid` is not supported.
        :param pulumi.Input[str] kibana_domain: Kibana console domain (Internet access supported).
        :param pulumi.Input[int] kibana_port: Kibana console port.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] kibana_private_whitelists: Set the Kibana's IP whitelist in private network.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] kibana_whitelists: Set the Kibana's IP whitelist in internet network.
        :param pulumi.Input[str] kms_encrypted_password: An KMS encrypts password used to a instance. If the `password` is filled in, this field will be ignored, but you have to specify one of `password` and `kms_encrypted_password` fields.
        :param pulumi.Input[Mapping[str, Any]] kms_encryption_context: An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        :param pulumi.Input[str] master_node_spec: The dedicated master node spec. If specified, dedicated master node will be created.
        :param pulumi.Input[str] password: The password of the instance. The password can be 8 to 30 characters in length and must contain three of the following conditions: uppercase letters, lowercase letters, numbers, and special characters (`!@#$%^&*()_+-=`).
        :param pulumi.Input[int] period: The duration that you will buy Elasticsearch instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1. From version 1.69.2, when to modify this value, the resource can renewal a `PrePaid` instance.
        :param pulumi.Input[int] port: Instance connection port.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] private_whitelists: Set the instance's IP whitelist in VPC network.
        :param pulumi.Input[str] protocol: Elasticsearch protocol. Supported values: `HTTP`, `HTTPS`.default is `HTTP`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] public_whitelists: Set the instance's IP whitelist in internet network.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the Elasticsearch instance belongs.
        :param pulumi.Input[str] status: The Elasticsearch instance status. Includes `active`, `activating`, `inactive`. Some operations are denied when status is not `active`.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource. 
               - key: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:". It cannot contain "http://" and "https://". It cannot be a null string.
               - value: It can be up to 128 characters in length. It cannot contain "http://" and "https://". It can be a null string.
        :param pulumi.Input[str] version: Elasticsearch version. Supported values: `5.5.3_with_X-Pack`, `6.3_with_X-Pack`, `6.7_with_X-Pack`, `6.8_with_X-Pack`, `7.4_with_X-Pack` and `7.7_with_X-Pack`.
        :param pulumi.Input[str] vswitch_id: The ID of VSwitch.
        :param pulumi.Input[int] zone_count: The Multi-AZ supported for Elasticsearch, between 1 and 3. The `data_node_amount` value must be an integral multiple of the `zone_count` value.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["client_node_amount"] = client_node_amount
        __props__["client_node_spec"] = client_node_spec
        __props__["data_node_amount"] = data_node_amount
        __props__["data_node_disk_encrypted"] = data_node_disk_encrypted
        __props__["data_node_disk_size"] = data_node_disk_size
        __props__["data_node_disk_type"] = data_node_disk_type
        __props__["data_node_spec"] = data_node_spec
        __props__["description"] = description
        __props__["domain"] = domain
        __props__["enable_kibana_private_network"] = enable_kibana_private_network
        __props__["enable_kibana_public_network"] = enable_kibana_public_network
        __props__["enable_public"] = enable_public
        __props__["instance_charge_type"] = instance_charge_type
        __props__["kibana_domain"] = kibana_domain
        __props__["kibana_port"] = kibana_port
        __props__["kibana_private_whitelists"] = kibana_private_whitelists
        __props__["kibana_whitelists"] = kibana_whitelists
        __props__["kms_encrypted_password"] = kms_encrypted_password
        __props__["kms_encryption_context"] = kms_encryption_context
        __props__["master_node_spec"] = master_node_spec
        __props__["password"] = password
        __props__["period"] = period
        __props__["port"] = port
        __props__["private_whitelists"] = private_whitelists
        __props__["protocol"] = protocol
        __props__["public_whitelists"] = public_whitelists
        __props__["resource_group_id"] = resource_group_id
        __props__["status"] = status
        __props__["tags"] = tags
        __props__["version"] = version
        __props__["vswitch_id"] = vswitch_id
        __props__["zone_count"] = zone_count
        return Instance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clientNodeAmount")
    def client_node_amount(self) -> pulumi.Output[Optional[int]]:
        """
        The Elasticsearch cluster's client node quantity, between 2 and 25.
        """
        return pulumi.get(self, "client_node_amount")

    @property
    @pulumi.getter(name="clientNodeSpec")
    def client_node_spec(self) -> pulumi.Output[Optional[str]]:
        """
        The client node spec. If specified, client node will be created.
        """
        return pulumi.get(self, "client_node_spec")

    @property
    @pulumi.getter(name="dataNodeAmount")
    def data_node_amount(self) -> pulumi.Output[int]:
        """
        The Elasticsearch cluster's data node quantity, between 2 and 50.
        """
        return pulumi.get(self, "data_node_amount")

    @property
    @pulumi.getter(name="dataNodeDiskEncrypted")
    def data_node_disk_encrypted(self) -> pulumi.Output[Optional[bool]]:
        """
        If encrypt the data node disk. Valid values are `true`, `false`. Default to `false`.
        """
        return pulumi.get(self, "data_node_disk_encrypted")

    @property
    @pulumi.getter(name="dataNodeDiskSize")
    def data_node_disk_size(self) -> pulumi.Output[int]:
        """
        The single data node storage space.
        - `cloud_ssd`: An SSD disk, supports a maximum of 2048 GiB (2 TB).
        """
        return pulumi.get(self, "data_node_disk_size")

    @property
    @pulumi.getter(name="dataNodeDiskType")
    def data_node_disk_type(self) -> pulumi.Output[str]:
        """
        The data node disk type. Supported values: cloud_ssd, cloud_efficiency.
        """
        return pulumi.get(self, "data_node_disk_type")

    @property
    @pulumi.getter(name="dataNodeSpec")
    def data_node_spec(self) -> pulumi.Output[str]:
        """
        The data node specifications of the Elasticsearch instance.
        """
        return pulumi.get(self, "data_node_spec")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of instance. It a string of 0 to 30 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        Instance connection domain (only VPC network access supported).
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="enableKibanaPrivateNetwork")
    def enable_kibana_private_network(self) -> pulumi.Output[Optional[bool]]:
        """
        Bool, default to false. When it set to true, the instance can close kibana private network access。
        """
        return pulumi.get(self, "enable_kibana_private_network")

    @property
    @pulumi.getter(name="enableKibanaPublicNetwork")
    def enable_kibana_public_network(self) -> pulumi.Output[Optional[bool]]:
        """
        Bool, default to true. When it set to false, the instance can enable kibana public network access。
        """
        return pulumi.get(self, "enable_kibana_public_network")

    @property
    @pulumi.getter(name="enablePublic")
    def enable_public(self) -> pulumi.Output[Optional[bool]]:
        """
        Bool, default to false. When it set to true, the instance can enable public network access。
        """
        return pulumi.get(self, "enable_public")

    @property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> pulumi.Output[Optional[str]]:
        """
        Valid values are `PrePaid`, `PostPaid`. Default to `PostPaid`. From version 1.69.0, the Elasticsearch cluster allows you to update your instance_charge_ype from `PostPaid` to `PrePaid`, the following attributes are required: `period`. But, updating from `PostPaid` to `PrePaid` is not supported.
        """
        return pulumi.get(self, "instance_charge_type")

    @property
    @pulumi.getter(name="kibanaDomain")
    def kibana_domain(self) -> pulumi.Output[str]:
        """
        Kibana console domain (Internet access supported).
        """
        return pulumi.get(self, "kibana_domain")

    @property
    @pulumi.getter(name="kibanaPort")
    def kibana_port(self) -> pulumi.Output[int]:
        """
        Kibana console port.
        """
        return pulumi.get(self, "kibana_port")

    @property
    @pulumi.getter(name="kibanaPrivateWhitelists")
    def kibana_private_whitelists(self) -> pulumi.Output[Sequence[str]]:
        """
        Set the Kibana's IP whitelist in private network.
        """
        return pulumi.get(self, "kibana_private_whitelists")

    @property
    @pulumi.getter(name="kibanaWhitelists")
    def kibana_whitelists(self) -> pulumi.Output[Sequence[str]]:
        """
        Set the Kibana's IP whitelist in internet network.
        """
        return pulumi.get(self, "kibana_whitelists")

    @property
    @pulumi.getter(name="kmsEncryptedPassword")
    def kms_encrypted_password(self) -> pulumi.Output[Optional[str]]:
        """
        An KMS encrypts password used to a instance. If the `password` is filled in, this field will be ignored, but you have to specify one of `password` and `kms_encrypted_password` fields.
        """
        return pulumi.get(self, "kms_encrypted_password")

    @property
    @pulumi.getter(name="kmsEncryptionContext")
    def kms_encryption_context(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        """
        return pulumi.get(self, "kms_encryption_context")

    @property
    @pulumi.getter(name="masterNodeSpec")
    def master_node_spec(self) -> pulumi.Output[Optional[str]]:
        """
        The dedicated master node spec. If specified, dedicated master node will be created.
        """
        return pulumi.get(self, "master_node_spec")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[str]]:
        """
        The password of the instance. The password can be 8 to 30 characters in length and must contain three of the following conditions: uppercase letters, lowercase letters, numbers, and special characters (`!@#$%^&*()_+-=`).
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[Optional[int]]:
        """
        The duration that you will buy Elasticsearch instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1. From version 1.69.2, when to modify this value, the resource can renewal a `PrePaid` instance.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[int]:
        """
        Instance connection port.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="privateWhitelists")
    def private_whitelists(self) -> pulumi.Output[Sequence[str]]:
        """
        Set the instance's IP whitelist in VPC network.
        """
        return pulumi.get(self, "private_whitelists")

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Output[Optional[str]]:
        """
        Elasticsearch protocol. Supported values: `HTTP`, `HTTPS`.default is `HTTP`.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="publicWhitelists")
    def public_whitelists(self) -> pulumi.Output[Sequence[str]]:
        """
        Set the instance's IP whitelist in internet network.
        """
        return pulumi.get(self, "public_whitelists")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The Id of resource group which the Elasticsearch instance belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The Elasticsearch instance status. Includes `active`, `activating`, `inactive`. Some operations are denied when status is not `active`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource. 
        - key: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:". It cannot contain "http://" and "https://". It cannot be a null string.
        - value: It can be up to 128 characters in length. It cannot contain "http://" and "https://". It can be a null string.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        Elasticsearch version. Supported values: `5.5.3_with_X-Pack`, `6.3_with_X-Pack`, `6.7_with_X-Pack`, `6.8_with_X-Pack`, `7.4_with_X-Pack` and `7.7_with_X-Pack`.
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        """
        The ID of VSwitch.
        """
        return pulumi.get(self, "vswitch_id")

    @property
    @pulumi.getter(name="zoneCount")
    def zone_count(self) -> pulumi.Output[Optional[int]]:
        """
        The Multi-AZ supported for Elasticsearch, between 1 and 3. The `data_node_amount` value must be an integral multiple of the `zone_count` value.
        """
        return pulumi.get(self, "zone_count")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

