# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = ['InstanceArgs', 'Instance']

@pulumi.input_type
class InstanceArgs:
    def __init__(__self__, *,
                 deploy_type: pulumi.Input[int],
                 disk_size: pulumi.Input[int],
                 disk_type: pulumi.Input[int],
                 io_max: pulumi.Input[int],
                 topic_quota: pulumi.Input[int],
                 vswitch_id: pulumi.Input[str],
                 config: Optional[pulumi.Input[str]] = None,
                 eip_max: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 paid_type: Optional[pulumi.Input[str]] = None,
                 security_group: Optional[pulumi.Input[str]] = None,
                 service_version: Optional[pulumi.Input[str]] = None,
                 spec_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a Instance resource.
        :param pulumi.Input[int] deploy_type: The deploy type of the instance. Currently only support two deploy type, 4: eip/vpc instance, 5: vpc instance.
        :param pulumi.Input[int] disk_size: The disk size of the instance. When modify this value, it only support adjust to a greater value.
        :param pulumi.Input[int] disk_type: The disk type of the instance. 0: efficient cloud disk , 1: SSD.
        :param pulumi.Input[int] io_max: The max value of io of the instance. When modify this value, it only support adjust to a greater value.
        :param pulumi.Input[int] topic_quota: The max num of topic can be create of the instance. When modify this value, it only adjust to a greater value.
        :param pulumi.Input[str] vswitch_id: The ID of attaching vswitch to instance.
        :param pulumi.Input[str] config: （Optional, Available in v1.112.0+） The basic config for this instance. The input should be json type, only the following key allowed: enable.acl, enable.vpc_sasl_ssl, kafka.log.retention.hours, kafka.message.max.bytes.
        :param pulumi.Input[int] eip_max: The max bandwidth of the instance. When modify this value, it only support adjust to a greater value.
        :param pulumi.Input[str] name: Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
        :param pulumi.Input[str] paid_type: The paid type of the instance. Support two type, "PrePaid": pre paid type instance, "PostPaid": post paid type instance. Default is PostPaid. When modify this value, it only support adjust from post pay to pre pay.
        :param pulumi.Input[str] security_group: （Optional, ForceNew, Available in v1.93.0+） The ID of security group for this instance. If the security group is empty, system will create a default one.
        :param pulumi.Input[str] service_version: （Optional, Available in v1.112.0+） The kafka openSource version for this instance. Only 0.10.2 or 2.2.0 is allowed, default is 0.10.2.
        :param pulumi.Input[str] spec_type: The spec type of the instance. Support two type, "normal": normal version instance, "professional": professional version instance. Default is normal. When modify this value, it only support adjust from normal to professional. Note only pre paid type instance support professional specific type.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "deploy_type", deploy_type)
        pulumi.set(__self__, "disk_size", disk_size)
        pulumi.set(__self__, "disk_type", disk_type)
        pulumi.set(__self__, "io_max", io_max)
        pulumi.set(__self__, "topic_quota", topic_quota)
        pulumi.set(__self__, "vswitch_id", vswitch_id)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if eip_max is not None:
            pulumi.set(__self__, "eip_max", eip_max)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if paid_type is not None:
            pulumi.set(__self__, "paid_type", paid_type)
        if security_group is not None:
            pulumi.set(__self__, "security_group", security_group)
        if service_version is not None:
            pulumi.set(__self__, "service_version", service_version)
        if spec_type is not None:
            pulumi.set(__self__, "spec_type", spec_type)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="deployType")
    def deploy_type(self) -> pulumi.Input[int]:
        """
        The deploy type of the instance. Currently only support two deploy type, 4: eip/vpc instance, 5: vpc instance.
        """
        return pulumi.get(self, "deploy_type")

    @deploy_type.setter
    def deploy_type(self, value: pulumi.Input[int]):
        pulumi.set(self, "deploy_type", value)

    @property
    @pulumi.getter(name="diskSize")
    def disk_size(self) -> pulumi.Input[int]:
        """
        The disk size of the instance. When modify this value, it only support adjust to a greater value.
        """
        return pulumi.get(self, "disk_size")

    @disk_size.setter
    def disk_size(self, value: pulumi.Input[int]):
        pulumi.set(self, "disk_size", value)

    @property
    @pulumi.getter(name="diskType")
    def disk_type(self) -> pulumi.Input[int]:
        """
        The disk type of the instance. 0: efficient cloud disk , 1: SSD.
        """
        return pulumi.get(self, "disk_type")

    @disk_type.setter
    def disk_type(self, value: pulumi.Input[int]):
        pulumi.set(self, "disk_type", value)

    @property
    @pulumi.getter(name="ioMax")
    def io_max(self) -> pulumi.Input[int]:
        """
        The max value of io of the instance. When modify this value, it only support adjust to a greater value.
        """
        return pulumi.get(self, "io_max")

    @io_max.setter
    def io_max(self, value: pulumi.Input[int]):
        pulumi.set(self, "io_max", value)

    @property
    @pulumi.getter(name="topicQuota")
    def topic_quota(self) -> pulumi.Input[int]:
        """
        The max num of topic can be create of the instance. When modify this value, it only adjust to a greater value.
        """
        return pulumi.get(self, "topic_quota")

    @topic_quota.setter
    def topic_quota(self, value: pulumi.Input[int]):
        pulumi.set(self, "topic_quota", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Input[str]:
        """
        The ID of attaching vswitch to instance.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[str]]:
        """
        （Optional, Available in v1.112.0+） The basic config for this instance. The input should be json type, only the following key allowed: enable.acl, enable.vpc_sasl_ssl, kafka.log.retention.hours, kafka.message.max.bytes.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="eipMax")
    def eip_max(self) -> Optional[pulumi.Input[int]]:
        """
        The max bandwidth of the instance. When modify this value, it only support adjust to a greater value.
        """
        return pulumi.get(self, "eip_max")

    @eip_max.setter
    def eip_max(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "eip_max", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="paidType")
    def paid_type(self) -> Optional[pulumi.Input[str]]:
        """
        The paid type of the instance. Support two type, "PrePaid": pre paid type instance, "PostPaid": post paid type instance. Default is PostPaid. When modify this value, it only support adjust from post pay to pre pay.
        """
        return pulumi.get(self, "paid_type")

    @paid_type.setter
    def paid_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "paid_type", value)

    @property
    @pulumi.getter(name="securityGroup")
    def security_group(self) -> Optional[pulumi.Input[str]]:
        """
        （Optional, ForceNew, Available in v1.93.0+） The ID of security group for this instance. If the security group is empty, system will create a default one.
        """
        return pulumi.get(self, "security_group")

    @security_group.setter
    def security_group(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_group", value)

    @property
    @pulumi.getter(name="serviceVersion")
    def service_version(self) -> Optional[pulumi.Input[str]]:
        """
        （Optional, Available in v1.112.0+） The kafka openSource version for this instance. Only 0.10.2 or 2.2.0 is allowed, default is 0.10.2.
        """
        return pulumi.get(self, "service_version")

    @service_version.setter
    def service_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_version", value)

    @property
    @pulumi.getter(name="specType")
    def spec_type(self) -> Optional[pulumi.Input[str]]:
        """
        The spec type of the instance. Support two type, "normal": normal version instance, "professional": professional version instance. Default is normal. When modify this value, it only support adjust from normal to professional. Note only pre paid type instance support professional specific type.
        """
        return pulumi.get(self, "spec_type")

    @spec_type.setter
    def spec_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "spec_type", value)

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


class Instance(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[str]] = None,
                 deploy_type: Optional[pulumi.Input[int]] = None,
                 disk_size: Optional[pulumi.Input[int]] = None,
                 disk_type: Optional[pulumi.Input[int]] = None,
                 eip_max: Optional[pulumi.Input[int]] = None,
                 io_max: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 paid_type: Optional[pulumi.Input[str]] = None,
                 security_group: Optional[pulumi.Input[str]] = None,
                 service_version: Optional[pulumi.Input[str]] = None,
                 spec_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 topic_quota: Optional[pulumi.Input[int]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides an ALIKAFKA instance resource.

        > **NOTE:** Available in 1.59.0+

        > **NOTE:** Creation or modification may took about 10-40 minutes.

        > **NOTE:** Only the following regions support create alikafka pre paid instance.
        [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`cn-chengdu`,`cn-heyuan`,`ap-southeast-1`,`ap-southeast-3`,`ap-southeast-5`,`ap-south-1`,`ap-northeast-1`,`eu-central-1`,`eu-west-1`,`us-west-1`,`us-east-1`]

        > **NOTE:** Only the following regions support create alikafka post paid instance(International account is not support to buy post paid instance currently).
        [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`cn-chengdu`,`cn-heyuan`,`ap-southeast-1`,`ap-southeast-3`,`ap-northeast-1`,`eu-central-1`,`eu-west-1`,`us-west-1`,`us-east-1`]
        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        instance_name = config.get("instanceName")
        if instance_name is None:
            instance_name = "alikafkaInstanceName"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/12")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            availability_zone=default_zones.zones[0].id)
        default_instance = alicloud.alikafka.Instance("defaultInstance",
            topic_quota=50,
            disk_type=1,
            disk_size=500,
            deploy_type=4,
            io_max=20,
            vswitch_id=default_switch.id)
        ```

        ## Import

        ALIKAFKA TOPIC can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:alikafka/instance:Instance instance alikafka_post-cn-123455abc
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config: （Optional, Available in v1.112.0+） The basic config for this instance. The input should be json type, only the following key allowed: enable.acl, enable.vpc_sasl_ssl, kafka.log.retention.hours, kafka.message.max.bytes.
        :param pulumi.Input[int] deploy_type: The deploy type of the instance. Currently only support two deploy type, 4: eip/vpc instance, 5: vpc instance.
        :param pulumi.Input[int] disk_size: The disk size of the instance. When modify this value, it only support adjust to a greater value.
        :param pulumi.Input[int] disk_type: The disk type of the instance. 0: efficient cloud disk , 1: SSD.
        :param pulumi.Input[int] eip_max: The max bandwidth of the instance. When modify this value, it only support adjust to a greater value.
        :param pulumi.Input[int] io_max: The max value of io of the instance. When modify this value, it only support adjust to a greater value.
        :param pulumi.Input[str] name: Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
        :param pulumi.Input[str] paid_type: The paid type of the instance. Support two type, "PrePaid": pre paid type instance, "PostPaid": post paid type instance. Default is PostPaid. When modify this value, it only support adjust from post pay to pre pay.
        :param pulumi.Input[str] security_group: （Optional, ForceNew, Available in v1.93.0+） The ID of security group for this instance. If the security group is empty, system will create a default one.
        :param pulumi.Input[str] service_version: （Optional, Available in v1.112.0+） The kafka openSource version for this instance. Only 0.10.2 or 2.2.0 is allowed, default is 0.10.2.
        :param pulumi.Input[str] spec_type: The spec type of the instance. Support two type, "normal": normal version instance, "professional": professional version instance. Default is normal. When modify this value, it only support adjust from normal to professional. Note only pre paid type instance support professional specific type.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[int] topic_quota: The max num of topic can be create of the instance. When modify this value, it only adjust to a greater value.
        :param pulumi.Input[str] vswitch_id: The ID of attaching vswitch to instance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an ALIKAFKA instance resource.

        > **NOTE:** Available in 1.59.0+

        > **NOTE:** Creation or modification may took about 10-40 minutes.

        > **NOTE:** Only the following regions support create alikafka pre paid instance.
        [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`cn-chengdu`,`cn-heyuan`,`ap-southeast-1`,`ap-southeast-3`,`ap-southeast-5`,`ap-south-1`,`ap-northeast-1`,`eu-central-1`,`eu-west-1`,`us-west-1`,`us-east-1`]

        > **NOTE:** Only the following regions support create alikafka post paid instance(International account is not support to buy post paid instance currently).
        [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`cn-chengdu`,`cn-heyuan`,`ap-southeast-1`,`ap-southeast-3`,`ap-northeast-1`,`eu-central-1`,`eu-west-1`,`us-west-1`,`us-east-1`]
        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        instance_name = config.get("instanceName")
        if instance_name is None:
            instance_name = "alikafkaInstanceName"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/12")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            availability_zone=default_zones.zones[0].id)
        default_instance = alicloud.alikafka.Instance("defaultInstance",
            topic_quota=50,
            disk_type=1,
            disk_size=500,
            deploy_type=4,
            io_max=20,
            vswitch_id=default_switch.id)
        ```

        ## Import

        ALIKAFKA TOPIC can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:alikafka/instance:Instance instance alikafka_post-cn-123455abc
        ```

        :param str resource_name: The name of the resource.
        :param InstanceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[str]] = None,
                 deploy_type: Optional[pulumi.Input[int]] = None,
                 disk_size: Optional[pulumi.Input[int]] = None,
                 disk_type: Optional[pulumi.Input[int]] = None,
                 eip_max: Optional[pulumi.Input[int]] = None,
                 io_max: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 paid_type: Optional[pulumi.Input[str]] = None,
                 security_group: Optional[pulumi.Input[str]] = None,
                 service_version: Optional[pulumi.Input[str]] = None,
                 spec_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 topic_quota: Optional[pulumi.Input[int]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

            __props__['config'] = config
            if deploy_type is None and not opts.urn:
                raise TypeError("Missing required property 'deploy_type'")
            __props__['deploy_type'] = deploy_type
            if disk_size is None and not opts.urn:
                raise TypeError("Missing required property 'disk_size'")
            __props__['disk_size'] = disk_size
            if disk_type is None and not opts.urn:
                raise TypeError("Missing required property 'disk_type'")
            __props__['disk_type'] = disk_type
            __props__['eip_max'] = eip_max
            if io_max is None and not opts.urn:
                raise TypeError("Missing required property 'io_max'")
            __props__['io_max'] = io_max
            __props__['name'] = name
            __props__['paid_type'] = paid_type
            __props__['security_group'] = security_group
            __props__['service_version'] = service_version
            __props__['spec_type'] = spec_type
            __props__['tags'] = tags
            if topic_quota is None and not opts.urn:
                raise TypeError("Missing required property 'topic_quota'")
            __props__['topic_quota'] = topic_quota
            if vswitch_id is None and not opts.urn:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__['vswitch_id'] = vswitch_id
            __props__['end_point'] = None
            __props__['vpc_id'] = None
            __props__['zone_id'] = None
        super(Instance, __self__).__init__(
            'alicloud:alikafka/instance:Instance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[str]] = None,
            deploy_type: Optional[pulumi.Input[int]] = None,
            disk_size: Optional[pulumi.Input[int]] = None,
            disk_type: Optional[pulumi.Input[int]] = None,
            eip_max: Optional[pulumi.Input[int]] = None,
            end_point: Optional[pulumi.Input[str]] = None,
            io_max: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            paid_type: Optional[pulumi.Input[str]] = None,
            security_group: Optional[pulumi.Input[str]] = None,
            service_version: Optional[pulumi.Input[str]] = None,
            spec_type: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            topic_quota: Optional[pulumi.Input[int]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'Instance':
        """
        Get an existing Instance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config: （Optional, Available in v1.112.0+） The basic config for this instance. The input should be json type, only the following key allowed: enable.acl, enable.vpc_sasl_ssl, kafka.log.retention.hours, kafka.message.max.bytes.
        :param pulumi.Input[int] deploy_type: The deploy type of the instance. Currently only support two deploy type, 4: eip/vpc instance, 5: vpc instance.
        :param pulumi.Input[int] disk_size: The disk size of the instance. When modify this value, it only support adjust to a greater value.
        :param pulumi.Input[int] disk_type: The disk type of the instance. 0: efficient cloud disk , 1: SSD.
        :param pulumi.Input[int] eip_max: The max bandwidth of the instance. When modify this value, it only support adjust to a greater value.
        :param pulumi.Input[str] end_point: The EndPoint to access the kafka instance.
        :param pulumi.Input[int] io_max: The max value of io of the instance. When modify this value, it only support adjust to a greater value.
        :param pulumi.Input[str] name: Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
        :param pulumi.Input[str] paid_type: The paid type of the instance. Support two type, "PrePaid": pre paid type instance, "PostPaid": post paid type instance. Default is PostPaid. When modify this value, it only support adjust from post pay to pre pay.
        :param pulumi.Input[str] security_group: （Optional, ForceNew, Available in v1.93.0+） The ID of security group for this instance. If the security group is empty, system will create a default one.
        :param pulumi.Input[str] service_version: （Optional, Available in v1.112.0+） The kafka openSource version for this instance. Only 0.10.2 or 2.2.0 is allowed, default is 0.10.2.
        :param pulumi.Input[str] spec_type: The spec type of the instance. Support two type, "normal": normal version instance, "professional": professional version instance. Default is normal. When modify this value, it only support adjust from normal to professional. Note only pre paid type instance support professional specific type.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[int] topic_quota: The max num of topic can be create of the instance. When modify this value, it only adjust to a greater value.
        :param pulumi.Input[str] vpc_id: The ID of attaching VPC to instance.
        :param pulumi.Input[str] vswitch_id: The ID of attaching vswitch to instance.
        :param pulumi.Input[str] zone_id: The Zone to launch the kafka instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["config"] = config
        __props__["deploy_type"] = deploy_type
        __props__["disk_size"] = disk_size
        __props__["disk_type"] = disk_type
        __props__["eip_max"] = eip_max
        __props__["end_point"] = end_point
        __props__["io_max"] = io_max
        __props__["name"] = name
        __props__["paid_type"] = paid_type
        __props__["security_group"] = security_group
        __props__["service_version"] = service_version
        __props__["spec_type"] = spec_type
        __props__["tags"] = tags
        __props__["topic_quota"] = topic_quota
        __props__["vpc_id"] = vpc_id
        __props__["vswitch_id"] = vswitch_id
        __props__["zone_id"] = zone_id
        return Instance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[str]:
        """
        （Optional, Available in v1.112.0+） The basic config for this instance. The input should be json type, only the following key allowed: enable.acl, enable.vpc_sasl_ssl, kafka.log.retention.hours, kafka.message.max.bytes.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter(name="deployType")
    def deploy_type(self) -> pulumi.Output[int]:
        """
        The deploy type of the instance. Currently only support two deploy type, 4: eip/vpc instance, 5: vpc instance.
        """
        return pulumi.get(self, "deploy_type")

    @property
    @pulumi.getter(name="diskSize")
    def disk_size(self) -> pulumi.Output[int]:
        """
        The disk size of the instance. When modify this value, it only support adjust to a greater value.
        """
        return pulumi.get(self, "disk_size")

    @property
    @pulumi.getter(name="diskType")
    def disk_type(self) -> pulumi.Output[int]:
        """
        The disk type of the instance. 0: efficient cloud disk , 1: SSD.
        """
        return pulumi.get(self, "disk_type")

    @property
    @pulumi.getter(name="eipMax")
    def eip_max(self) -> pulumi.Output[Optional[int]]:
        """
        The max bandwidth of the instance. When modify this value, it only support adjust to a greater value.
        """
        return pulumi.get(self, "eip_max")

    @property
    @pulumi.getter(name="endPoint")
    def end_point(self) -> pulumi.Output[str]:
        """
        The EndPoint to access the kafka instance.
        """
        return pulumi.get(self, "end_point")

    @property
    @pulumi.getter(name="ioMax")
    def io_max(self) -> pulumi.Output[int]:
        """
        The max value of io of the instance. When modify this value, it only support adjust to a greater value.
        """
        return pulumi.get(self, "io_max")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="paidType")
    def paid_type(self) -> pulumi.Output[Optional[str]]:
        """
        The paid type of the instance. Support two type, "PrePaid": pre paid type instance, "PostPaid": post paid type instance. Default is PostPaid. When modify this value, it only support adjust from post pay to pre pay.
        """
        return pulumi.get(self, "paid_type")

    @property
    @pulumi.getter(name="securityGroup")
    def security_group(self) -> pulumi.Output[Optional[str]]:
        """
        （Optional, ForceNew, Available in v1.93.0+） The ID of security group for this instance. If the security group is empty, system will create a default one.
        """
        return pulumi.get(self, "security_group")

    @property
    @pulumi.getter(name="serviceVersion")
    def service_version(self) -> pulumi.Output[str]:
        """
        （Optional, Available in v1.112.0+） The kafka openSource version for this instance. Only 0.10.2 or 2.2.0 is allowed, default is 0.10.2.
        """
        return pulumi.get(self, "service_version")

    @property
    @pulumi.getter(name="specType")
    def spec_type(self) -> pulumi.Output[Optional[str]]:
        """
        The spec type of the instance. Support two type, "normal": normal version instance, "professional": professional version instance. Default is normal. When modify this value, it only support adjust from normal to professional. Note only pre paid type instance support professional specific type.
        """
        return pulumi.get(self, "spec_type")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="topicQuota")
    def topic_quota(self) -> pulumi.Output[int]:
        """
        The max num of topic can be create of the instance. When modify this value, it only adjust to a greater value.
        """
        return pulumi.get(self, "topic_quota")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The ID of attaching VPC to instance.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        """
        The ID of attaching vswitch to instance.
        """
        return pulumi.get(self, "vswitch_id")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The Zone to launch the kafka instance.
        """
        return pulumi.get(self, "zone_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

