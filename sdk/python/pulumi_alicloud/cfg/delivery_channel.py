# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DeliveryChannelArgs', 'DeliveryChannel']

@pulumi.input_type
class DeliveryChannelArgs:
    def __init__(__self__, *,
                 delivery_channel_assume_role_arn: pulumi.Input[str],
                 delivery_channel_target_arn: pulumi.Input[str],
                 delivery_channel_type: pulumi.Input[str],
                 delivery_channel_condition: Optional[pulumi.Input[str]] = None,
                 delivery_channel_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a DeliveryChannel resource.
        :param pulumi.Input[str] delivery_channel_assume_role_arn: The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
        :param pulumi.Input[str] delivery_channel_target_arn: The ARN of the delivery destination. This parameter is required when you create a delivery method. The value must be in one of the following formats:
               - `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
               - `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
               - `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
        :param pulumi.Input[str] delivery_channel_type: The type of the delivery method. This parameter is required when you create a delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
        :param pulumi.Input[str] delivery_channel_condition: The rule attached to the delivery method. This parameter is applicable only to delivery methods of the MNS type. Please refer to api [PutDeliveryChannel](https://www.alibabacloud.com/help/en/doc-detail/174253.htm) for example format.
        :param pulumi.Input[str] delivery_channel_name: The name of the delivery channel.
        :param pulumi.Input[str] description: The description of the delivery method.
        :param pulumi.Input[int] status: The status of the delivery method. Valid values: `0`: The delivery method is disabled., `1`: The delivery destination is enabled. This is the default value.
        """
        DeliveryChannelArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            delivery_channel_assume_role_arn=delivery_channel_assume_role_arn,
            delivery_channel_target_arn=delivery_channel_target_arn,
            delivery_channel_type=delivery_channel_type,
            delivery_channel_condition=delivery_channel_condition,
            delivery_channel_name=delivery_channel_name,
            description=description,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             delivery_channel_assume_role_arn: Optional[pulumi.Input[str]] = None,
             delivery_channel_target_arn: Optional[pulumi.Input[str]] = None,
             delivery_channel_type: Optional[pulumi.Input[str]] = None,
             delivery_channel_condition: Optional[pulumi.Input[str]] = None,
             delivery_channel_name: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if delivery_channel_assume_role_arn is None and 'deliveryChannelAssumeRoleArn' in kwargs:
            delivery_channel_assume_role_arn = kwargs['deliveryChannelAssumeRoleArn']
        if delivery_channel_assume_role_arn is None:
            raise TypeError("Missing 'delivery_channel_assume_role_arn' argument")
        if delivery_channel_target_arn is None and 'deliveryChannelTargetArn' in kwargs:
            delivery_channel_target_arn = kwargs['deliveryChannelTargetArn']
        if delivery_channel_target_arn is None:
            raise TypeError("Missing 'delivery_channel_target_arn' argument")
        if delivery_channel_type is None and 'deliveryChannelType' in kwargs:
            delivery_channel_type = kwargs['deliveryChannelType']
        if delivery_channel_type is None:
            raise TypeError("Missing 'delivery_channel_type' argument")
        if delivery_channel_condition is None and 'deliveryChannelCondition' in kwargs:
            delivery_channel_condition = kwargs['deliveryChannelCondition']
        if delivery_channel_name is None and 'deliveryChannelName' in kwargs:
            delivery_channel_name = kwargs['deliveryChannelName']

        _setter("delivery_channel_assume_role_arn", delivery_channel_assume_role_arn)
        _setter("delivery_channel_target_arn", delivery_channel_target_arn)
        _setter("delivery_channel_type", delivery_channel_type)
        if delivery_channel_condition is not None:
            _setter("delivery_channel_condition", delivery_channel_condition)
        if delivery_channel_name is not None:
            _setter("delivery_channel_name", delivery_channel_name)
        if description is not None:
            _setter("description", description)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="deliveryChannelAssumeRoleArn")
    def delivery_channel_assume_role_arn(self) -> pulumi.Input[str]:
        """
        The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
        """
        return pulumi.get(self, "delivery_channel_assume_role_arn")

    @delivery_channel_assume_role_arn.setter
    def delivery_channel_assume_role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "delivery_channel_assume_role_arn", value)

    @property
    @pulumi.getter(name="deliveryChannelTargetArn")
    def delivery_channel_target_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the delivery destination. This parameter is required when you create a delivery method. The value must be in one of the following formats:
        - `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
        - `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
        - `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
        """
        return pulumi.get(self, "delivery_channel_target_arn")

    @delivery_channel_target_arn.setter
    def delivery_channel_target_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "delivery_channel_target_arn", value)

    @property
    @pulumi.getter(name="deliveryChannelType")
    def delivery_channel_type(self) -> pulumi.Input[str]:
        """
        The type of the delivery method. This parameter is required when you create a delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
        """
        return pulumi.get(self, "delivery_channel_type")

    @delivery_channel_type.setter
    def delivery_channel_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "delivery_channel_type", value)

    @property
    @pulumi.getter(name="deliveryChannelCondition")
    def delivery_channel_condition(self) -> Optional[pulumi.Input[str]]:
        """
        The rule attached to the delivery method. This parameter is applicable only to delivery methods of the MNS type. Please refer to api [PutDeliveryChannel](https://www.alibabacloud.com/help/en/doc-detail/174253.htm) for example format.
        """
        return pulumi.get(self, "delivery_channel_condition")

    @delivery_channel_condition.setter
    def delivery_channel_condition(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delivery_channel_condition", value)

    @property
    @pulumi.getter(name="deliveryChannelName")
    def delivery_channel_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the delivery channel.
        """
        return pulumi.get(self, "delivery_channel_name")

    @delivery_channel_name.setter
    def delivery_channel_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delivery_channel_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the delivery method.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[int]]:
        """
        The status of the delivery method. Valid values: `0`: The delivery method is disabled., `1`: The delivery destination is enabled. This is the default value.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _DeliveryChannelState:
    def __init__(__self__, *,
                 delivery_channel_assume_role_arn: Optional[pulumi.Input[str]] = None,
                 delivery_channel_condition: Optional[pulumi.Input[str]] = None,
                 delivery_channel_name: Optional[pulumi.Input[str]] = None,
                 delivery_channel_target_arn: Optional[pulumi.Input[str]] = None,
                 delivery_channel_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering DeliveryChannel resources.
        :param pulumi.Input[str] delivery_channel_assume_role_arn: The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
        :param pulumi.Input[str] delivery_channel_condition: The rule attached to the delivery method. This parameter is applicable only to delivery methods of the MNS type. Please refer to api [PutDeliveryChannel](https://www.alibabacloud.com/help/en/doc-detail/174253.htm) for example format.
        :param pulumi.Input[str] delivery_channel_name: The name of the delivery channel.
        :param pulumi.Input[str] delivery_channel_target_arn: The ARN of the delivery destination. This parameter is required when you create a delivery method. The value must be in one of the following formats:
               - `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
               - `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
               - `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
        :param pulumi.Input[str] delivery_channel_type: The type of the delivery method. This parameter is required when you create a delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
        :param pulumi.Input[str] description: The description of the delivery method.
        :param pulumi.Input[int] status: The status of the delivery method. Valid values: `0`: The delivery method is disabled., `1`: The delivery destination is enabled. This is the default value.
        """
        _DeliveryChannelState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            delivery_channel_assume_role_arn=delivery_channel_assume_role_arn,
            delivery_channel_condition=delivery_channel_condition,
            delivery_channel_name=delivery_channel_name,
            delivery_channel_target_arn=delivery_channel_target_arn,
            delivery_channel_type=delivery_channel_type,
            description=description,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             delivery_channel_assume_role_arn: Optional[pulumi.Input[str]] = None,
             delivery_channel_condition: Optional[pulumi.Input[str]] = None,
             delivery_channel_name: Optional[pulumi.Input[str]] = None,
             delivery_channel_target_arn: Optional[pulumi.Input[str]] = None,
             delivery_channel_type: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if delivery_channel_assume_role_arn is None and 'deliveryChannelAssumeRoleArn' in kwargs:
            delivery_channel_assume_role_arn = kwargs['deliveryChannelAssumeRoleArn']
        if delivery_channel_condition is None and 'deliveryChannelCondition' in kwargs:
            delivery_channel_condition = kwargs['deliveryChannelCondition']
        if delivery_channel_name is None and 'deliveryChannelName' in kwargs:
            delivery_channel_name = kwargs['deliveryChannelName']
        if delivery_channel_target_arn is None and 'deliveryChannelTargetArn' in kwargs:
            delivery_channel_target_arn = kwargs['deliveryChannelTargetArn']
        if delivery_channel_type is None and 'deliveryChannelType' in kwargs:
            delivery_channel_type = kwargs['deliveryChannelType']

        if delivery_channel_assume_role_arn is not None:
            _setter("delivery_channel_assume_role_arn", delivery_channel_assume_role_arn)
        if delivery_channel_condition is not None:
            _setter("delivery_channel_condition", delivery_channel_condition)
        if delivery_channel_name is not None:
            _setter("delivery_channel_name", delivery_channel_name)
        if delivery_channel_target_arn is not None:
            _setter("delivery_channel_target_arn", delivery_channel_target_arn)
        if delivery_channel_type is not None:
            _setter("delivery_channel_type", delivery_channel_type)
        if description is not None:
            _setter("description", description)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="deliveryChannelAssumeRoleArn")
    def delivery_channel_assume_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
        """
        return pulumi.get(self, "delivery_channel_assume_role_arn")

    @delivery_channel_assume_role_arn.setter
    def delivery_channel_assume_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delivery_channel_assume_role_arn", value)

    @property
    @pulumi.getter(name="deliveryChannelCondition")
    def delivery_channel_condition(self) -> Optional[pulumi.Input[str]]:
        """
        The rule attached to the delivery method. This parameter is applicable only to delivery methods of the MNS type. Please refer to api [PutDeliveryChannel](https://www.alibabacloud.com/help/en/doc-detail/174253.htm) for example format.
        """
        return pulumi.get(self, "delivery_channel_condition")

    @delivery_channel_condition.setter
    def delivery_channel_condition(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delivery_channel_condition", value)

    @property
    @pulumi.getter(name="deliveryChannelName")
    def delivery_channel_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the delivery channel.
        """
        return pulumi.get(self, "delivery_channel_name")

    @delivery_channel_name.setter
    def delivery_channel_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delivery_channel_name", value)

    @property
    @pulumi.getter(name="deliveryChannelTargetArn")
    def delivery_channel_target_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the delivery destination. This parameter is required when you create a delivery method. The value must be in one of the following formats:
        - `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
        - `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
        - `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
        """
        return pulumi.get(self, "delivery_channel_target_arn")

    @delivery_channel_target_arn.setter
    def delivery_channel_target_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delivery_channel_target_arn", value)

    @property
    @pulumi.getter(name="deliveryChannelType")
    def delivery_channel_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the delivery method. This parameter is required when you create a delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
        """
        return pulumi.get(self, "delivery_channel_type")

    @delivery_channel_type.setter
    def delivery_channel_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delivery_channel_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the delivery method.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[int]]:
        """
        The status of the delivery method. Valid values: `0`: The delivery method is disabled., `1`: The delivery destination is enabled. This is the default value.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "status", value)


class DeliveryChannel(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delivery_channel_assume_role_arn: Optional[pulumi.Input[str]] = None,
                 delivery_channel_condition: Optional[pulumi.Input[str]] = None,
                 delivery_channel_name: Optional[pulumi.Input[str]] = None,
                 delivery_channel_target_arn: Optional[pulumi.Input[str]] = None,
                 delivery_channel_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        ## Import

        Alicloud Config Delivery Channel can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cfg/deliveryChannel:DeliveryChannel example cdc-49a2ad756057********
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delivery_channel_assume_role_arn: The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
        :param pulumi.Input[str] delivery_channel_condition: The rule attached to the delivery method. This parameter is applicable only to delivery methods of the MNS type. Please refer to api [PutDeliveryChannel](https://www.alibabacloud.com/help/en/doc-detail/174253.htm) for example format.
        :param pulumi.Input[str] delivery_channel_name: The name of the delivery channel.
        :param pulumi.Input[str] delivery_channel_target_arn: The ARN of the delivery destination. This parameter is required when you create a delivery method. The value must be in one of the following formats:
               - `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
               - `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
               - `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
        :param pulumi.Input[str] delivery_channel_type: The type of the delivery method. This parameter is required when you create a delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
        :param pulumi.Input[str] description: The description of the delivery method.
        :param pulumi.Input[int] status: The status of the delivery method. Valid values: `0`: The delivery method is disabled., `1`: The delivery destination is enabled. This is the default value.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DeliveryChannelArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Alicloud Config Delivery Channel can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cfg/deliveryChannel:DeliveryChannel example cdc-49a2ad756057********
        ```

        :param str resource_name: The name of the resource.
        :param DeliveryChannelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DeliveryChannelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DeliveryChannelArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delivery_channel_assume_role_arn: Optional[pulumi.Input[str]] = None,
                 delivery_channel_condition: Optional[pulumi.Input[str]] = None,
                 delivery_channel_name: Optional[pulumi.Input[str]] = None,
                 delivery_channel_target_arn: Optional[pulumi.Input[str]] = None,
                 delivery_channel_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DeliveryChannelArgs.__new__(DeliveryChannelArgs)

            if delivery_channel_assume_role_arn is None and not opts.urn:
                raise TypeError("Missing required property 'delivery_channel_assume_role_arn'")
            __props__.__dict__["delivery_channel_assume_role_arn"] = delivery_channel_assume_role_arn
            __props__.__dict__["delivery_channel_condition"] = delivery_channel_condition
            __props__.__dict__["delivery_channel_name"] = delivery_channel_name
            if delivery_channel_target_arn is None and not opts.urn:
                raise TypeError("Missing required property 'delivery_channel_target_arn'")
            __props__.__dict__["delivery_channel_target_arn"] = delivery_channel_target_arn
            if delivery_channel_type is None and not opts.urn:
                raise TypeError("Missing required property 'delivery_channel_type'")
            __props__.__dict__["delivery_channel_type"] = delivery_channel_type
            __props__.__dict__["description"] = description
            __props__.__dict__["status"] = status
        super(DeliveryChannel, __self__).__init__(
            'alicloud:cfg/deliveryChannel:DeliveryChannel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delivery_channel_assume_role_arn: Optional[pulumi.Input[str]] = None,
            delivery_channel_condition: Optional[pulumi.Input[str]] = None,
            delivery_channel_name: Optional[pulumi.Input[str]] = None,
            delivery_channel_target_arn: Optional[pulumi.Input[str]] = None,
            delivery_channel_type: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[int]] = None) -> 'DeliveryChannel':
        """
        Get an existing DeliveryChannel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delivery_channel_assume_role_arn: The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
        :param pulumi.Input[str] delivery_channel_condition: The rule attached to the delivery method. This parameter is applicable only to delivery methods of the MNS type. Please refer to api [PutDeliveryChannel](https://www.alibabacloud.com/help/en/doc-detail/174253.htm) for example format.
        :param pulumi.Input[str] delivery_channel_name: The name of the delivery channel.
        :param pulumi.Input[str] delivery_channel_target_arn: The ARN of the delivery destination. This parameter is required when you create a delivery method. The value must be in one of the following formats:
               - `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
               - `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
               - `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
        :param pulumi.Input[str] delivery_channel_type: The type of the delivery method. This parameter is required when you create a delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
        :param pulumi.Input[str] description: The description of the delivery method.
        :param pulumi.Input[int] status: The status of the delivery method. Valid values: `0`: The delivery method is disabled., `1`: The delivery destination is enabled. This is the default value.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DeliveryChannelState.__new__(_DeliveryChannelState)

        __props__.__dict__["delivery_channel_assume_role_arn"] = delivery_channel_assume_role_arn
        __props__.__dict__["delivery_channel_condition"] = delivery_channel_condition
        __props__.__dict__["delivery_channel_name"] = delivery_channel_name
        __props__.__dict__["delivery_channel_target_arn"] = delivery_channel_target_arn
        __props__.__dict__["delivery_channel_type"] = delivery_channel_type
        __props__.__dict__["description"] = description
        __props__.__dict__["status"] = status
        return DeliveryChannel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="deliveryChannelAssumeRoleArn")
    def delivery_channel_assume_role_arn(self) -> pulumi.Output[str]:
        """
        The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
        """
        return pulumi.get(self, "delivery_channel_assume_role_arn")

    @property
    @pulumi.getter(name="deliveryChannelCondition")
    def delivery_channel_condition(self) -> pulumi.Output[str]:
        """
        The rule attached to the delivery method. This parameter is applicable only to delivery methods of the MNS type. Please refer to api [PutDeliveryChannel](https://www.alibabacloud.com/help/en/doc-detail/174253.htm) for example format.
        """
        return pulumi.get(self, "delivery_channel_condition")

    @property
    @pulumi.getter(name="deliveryChannelName")
    def delivery_channel_name(self) -> pulumi.Output[str]:
        """
        The name of the delivery channel.
        """
        return pulumi.get(self, "delivery_channel_name")

    @property
    @pulumi.getter(name="deliveryChannelTargetArn")
    def delivery_channel_target_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the delivery destination. This parameter is required when you create a delivery method. The value must be in one of the following formats:
        - `acs:oss:{RegionId}:{Aliuid}:{bucketName}`: if your delivery destination is an Object Storage Service (OSS) bucket.
        - `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}`: if your delivery destination is a Message Service (MNS) topic.
        - `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}`: if your delivery destination is a Log Service Logstore.
        """
        return pulumi.get(self, "delivery_channel_target_arn")

    @property
    @pulumi.getter(name="deliveryChannelType")
    def delivery_channel_type(self) -> pulumi.Output[str]:
        """
        The type of the delivery method. This parameter is required when you create a delivery method. Valid values: `OSS`: Object Storage, `MNS`: Message Service, `SLS`: Log Service.
        """
        return pulumi.get(self, "delivery_channel_type")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of the delivery method.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[int]:
        """
        The status of the delivery method. Valid values: `0`: The delivery method is disabled., `1`: The delivery destination is enabled. This is the default value.
        """
        return pulumi.get(self, "status")

