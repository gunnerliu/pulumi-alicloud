# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class QosPolicy(pulumi.CustomResource):
    description: pulumi.Output[str]
    """
    The description of the QoS policy.
    """
    dest_cidr: pulumi.Output[str]
    """
    The destination CIDR block.
    """
    dest_port_range: pulumi.Output[str]
    """
    The destination port range.
    """
    end_time: pulumi.Output[str]
    """
    The expiration time of the quintuple rule. 
    """
    ip_protocol: pulumi.Output[str]
    """
    The transport layer protocol.
    """
    name: pulumi.Output[str]
    """
    The name of the QoS policy.
    """
    priority: pulumi.Output[float]
    """
    The priority of the quintuple rule. A smaller value indicates a higher priority. If the priorities of two quintuple rules are the same, the rule created earlier is applied first.Value range: 1 to 7.
    """
    qos_id: pulumi.Output[str]
    """
    The instance ID of the QoS policy to which the quintuple rule is created.
    """
    source_cidr: pulumi.Output[str]
    """
    The source CIDR block.
    """
    source_port_range: pulumi.Output[str]
    """
    The source port range of the transport layer.
    """
    start_time: pulumi.Output[str]
    """
    The time when the quintuple rule takes effect.
    """
    def __init__(__self__, resource_name, opts=None, description=None, dest_cidr=None, dest_port_range=None, end_time=None, ip_protocol=None, name=None, priority=None, qos_id=None, source_cidr=None, source_port_range=None, start_time=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Sag qos policy resource. 
        You need to create a QoS policy to set priorities, rate limits, and quintuple rules for different messages.

        For information about Sag Qos Policy and how to use it, see [What is Qos Policy](https://www.alibabacloud.com/help/doc-detail/140065.htm).

        > **NOTE:** Available in 1.60.0+

        > **NOTE:** Only the following regions support. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]

        ## Example Usage



        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_qos = alicloud.rocketmq.Qos("defaultQos")
        default_qos_policy = alicloud.rocketmq.QosPolicy("defaultQosPolicy",
            description="tf-testSagQosPolicyDescription",
            dest_cidr="10.10.0.0/24",
            dest_port_range="-1/-1",
            end_time="2019-10-26T16:41:33+0800",
            ip_protocol="ALL",
            priority="1",
            qos_id=default_qos.id,
            source_cidr="192.168.0.0/24",
            source_port_range="-1/-1",
            start_time="2019-10-25T16:41:33+0800")
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the QoS policy.
        :param pulumi.Input[str] dest_cidr: The destination CIDR block.
        :param pulumi.Input[str] dest_port_range: The destination port range.
        :param pulumi.Input[str] end_time: The expiration time of the quintuple rule. 
        :param pulumi.Input[str] ip_protocol: The transport layer protocol.
        :param pulumi.Input[str] name: The name of the QoS policy.
        :param pulumi.Input[float] priority: The priority of the quintuple rule. A smaller value indicates a higher priority. If the priorities of two quintuple rules are the same, the rule created earlier is applied first.Value range: 1 to 7.
        :param pulumi.Input[str] qos_id: The instance ID of the QoS policy to which the quintuple rule is created.
        :param pulumi.Input[str] source_cidr: The source CIDR block.
        :param pulumi.Input[str] source_port_range: The source port range of the transport layer.
        :param pulumi.Input[str] start_time: The time when the quintuple rule takes effect.
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['description'] = description
            if dest_cidr is None:
                raise TypeError("Missing required property 'dest_cidr'")
            __props__['dest_cidr'] = dest_cidr
            if dest_port_range is None:
                raise TypeError("Missing required property 'dest_port_range'")
            __props__['dest_port_range'] = dest_port_range
            __props__['end_time'] = end_time
            if ip_protocol is None:
                raise TypeError("Missing required property 'ip_protocol'")
            __props__['ip_protocol'] = ip_protocol
            __props__['name'] = name
            if priority is None:
                raise TypeError("Missing required property 'priority'")
            __props__['priority'] = priority
            if qos_id is None:
                raise TypeError("Missing required property 'qos_id'")
            __props__['qos_id'] = qos_id
            if source_cidr is None:
                raise TypeError("Missing required property 'source_cidr'")
            __props__['source_cidr'] = source_cidr
            if source_port_range is None:
                raise TypeError("Missing required property 'source_port_range'")
            __props__['source_port_range'] = source_port_range
            __props__['start_time'] = start_time
        super(QosPolicy, __self__).__init__(
            'alicloud:rocketmq/qosPolicy:QosPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, description=None, dest_cidr=None, dest_port_range=None, end_time=None, ip_protocol=None, name=None, priority=None, qos_id=None, source_cidr=None, source_port_range=None, start_time=None):
        """
        Get an existing QosPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the QoS policy.
        :param pulumi.Input[str] dest_cidr: The destination CIDR block.
        :param pulumi.Input[str] dest_port_range: The destination port range.
        :param pulumi.Input[str] end_time: The expiration time of the quintuple rule. 
        :param pulumi.Input[str] ip_protocol: The transport layer protocol.
        :param pulumi.Input[str] name: The name of the QoS policy.
        :param pulumi.Input[float] priority: The priority of the quintuple rule. A smaller value indicates a higher priority. If the priorities of two quintuple rules are the same, the rule created earlier is applied first.Value range: 1 to 7.
        :param pulumi.Input[str] qos_id: The instance ID of the QoS policy to which the quintuple rule is created.
        :param pulumi.Input[str] source_cidr: The source CIDR block.
        :param pulumi.Input[str] source_port_range: The source port range of the transport layer.
        :param pulumi.Input[str] start_time: The time when the quintuple rule takes effect.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["description"] = description
        __props__["dest_cidr"] = dest_cidr
        __props__["dest_port_range"] = dest_port_range
        __props__["end_time"] = end_time
        __props__["ip_protocol"] = ip_protocol
        __props__["name"] = name
        __props__["priority"] = priority
        __props__["qos_id"] = qos_id
        __props__["source_cidr"] = source_cidr
        __props__["source_port_range"] = source_port_range
        __props__["start_time"] = start_time
        return QosPolicy(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

