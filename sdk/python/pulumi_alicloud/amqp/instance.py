# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InstanceArgs', 'Instance']

@pulumi.input_type
class InstanceArgs:
    def __init__(__self__, *,
                 instance_type: pulumi.Input[str],
                 max_tps: pulumi.Input[str],
                 payment_type: pulumi.Input[str],
                 queue_capacity: pulumi.Input[str],
                 support_eip: pulumi.Input[bool],
                 instance_name: Optional[pulumi.Input[str]] = None,
                 logistics: Optional[pulumi.Input[str]] = None,
                 max_eip_tps: Optional[pulumi.Input[str]] = None,
                 modify_type: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 renewal_duration: Optional[pulumi.Input[int]] = None,
                 renewal_duration_unit: Optional[pulumi.Input[str]] = None,
                 renewal_status: Optional[pulumi.Input[str]] = None,
                 storage_size: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Instance resource.
        :param pulumi.Input[str] instance_type: The Instance Type. Valid values: `professional`, `vip`.
        :param pulumi.Input[str] max_tps: The peak TPS traffic. The smallest valid value is 1000 and the largest value is 100,000.
        :param pulumi.Input[str] payment_type: The payment type. Valid values: `Subscription`.
        :param pulumi.Input[str] queue_capacity: The queue capacity. The smallest value is 50 and the step size 5.
        :param pulumi.Input[bool] support_eip: Whether to support EIP.
        :param pulumi.Input[str] instance_name: The instance name.
        :param pulumi.Input[str] max_eip_tps: The max eip tps. It is valid when `support_eip` is true. The valid value is [128, 45000] with the step size 128.
        :param pulumi.Input[str] modify_type: The modify type. Valid values: `Downgrade`, `Upgrade`. It is required when updating other attributes.
        :param pulumi.Input[int] period: The period. Valid values: `1`, `12`, `2`, `24`, `3`, `6`.
        :param pulumi.Input[int] renewal_duration: RenewalDuration. Valid values: `1`, `12`, `2`, `3`, `6`.
        :param pulumi.Input[str] renewal_duration_unit: Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years. Valid values: `Month`, `Year`.
        :param pulumi.Input[str] renewal_status: Whether to renew an instance automatically or not. Default to "ManualRenewal".
               - `AutoRenewal`: Auto renewal.
               - `ManualRenewal`: Manual renewal.
               - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
        :param pulumi.Input[str] storage_size: The storage size. It is valid when `instance_type` is vip.
        """
        pulumi.set(__self__, "instance_type", instance_type)
        pulumi.set(__self__, "max_tps", max_tps)
        pulumi.set(__self__, "payment_type", payment_type)
        pulumi.set(__self__, "queue_capacity", queue_capacity)
        pulumi.set(__self__, "support_eip", support_eip)
        if instance_name is not None:
            pulumi.set(__self__, "instance_name", instance_name)
        if logistics is not None:
            pulumi.set(__self__, "logistics", logistics)
        if max_eip_tps is not None:
            pulumi.set(__self__, "max_eip_tps", max_eip_tps)
        if modify_type is not None:
            pulumi.set(__self__, "modify_type", modify_type)
        if period is not None:
            pulumi.set(__self__, "period", period)
        if renewal_duration is not None:
            pulumi.set(__self__, "renewal_duration", renewal_duration)
        if renewal_duration_unit is not None:
            pulumi.set(__self__, "renewal_duration_unit", renewal_duration_unit)
        if renewal_status is not None:
            pulumi.set(__self__, "renewal_status", renewal_status)
        if storage_size is not None:
            pulumi.set(__self__, "storage_size", storage_size)

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> pulumi.Input[str]:
        """
        The Instance Type. Valid values: `professional`, `vip`.
        """
        return pulumi.get(self, "instance_type")

    @instance_type.setter
    def instance_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_type", value)

    @property
    @pulumi.getter(name="maxTps")
    def max_tps(self) -> pulumi.Input[str]:
        """
        The peak TPS traffic. The smallest valid value is 1000 and the largest value is 100,000.
        """
        return pulumi.get(self, "max_tps")

    @max_tps.setter
    def max_tps(self, value: pulumi.Input[str]):
        pulumi.set(self, "max_tps", value)

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> pulumi.Input[str]:
        """
        The payment type. Valid values: `Subscription`.
        """
        return pulumi.get(self, "payment_type")

    @payment_type.setter
    def payment_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "payment_type", value)

    @property
    @pulumi.getter(name="queueCapacity")
    def queue_capacity(self) -> pulumi.Input[str]:
        """
        The queue capacity. The smallest value is 50 and the step size 5.
        """
        return pulumi.get(self, "queue_capacity")

    @queue_capacity.setter
    def queue_capacity(self, value: pulumi.Input[str]):
        pulumi.set(self, "queue_capacity", value)

    @property
    @pulumi.getter(name="supportEip")
    def support_eip(self) -> pulumi.Input[bool]:
        """
        Whether to support EIP.
        """
        return pulumi.get(self, "support_eip")

    @support_eip.setter
    def support_eip(self, value: pulumi.Input[bool]):
        pulumi.set(self, "support_eip", value)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> Optional[pulumi.Input[str]]:
        """
        The instance name.
        """
        return pulumi.get(self, "instance_name")

    @instance_name.setter
    def instance_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_name", value)

    @property
    @pulumi.getter
    def logistics(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "logistics")

    @logistics.setter
    def logistics(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "logistics", value)

    @property
    @pulumi.getter(name="maxEipTps")
    def max_eip_tps(self) -> Optional[pulumi.Input[str]]:
        """
        The max eip tps. It is valid when `support_eip` is true. The valid value is [128, 45000] with the step size 128.
        """
        return pulumi.get(self, "max_eip_tps")

    @max_eip_tps.setter
    def max_eip_tps(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "max_eip_tps", value)

    @property
    @pulumi.getter(name="modifyType")
    def modify_type(self) -> Optional[pulumi.Input[str]]:
        """
        The modify type. Valid values: `Downgrade`, `Upgrade`. It is required when updating other attributes.
        """
        return pulumi.get(self, "modify_type")

    @modify_type.setter
    def modify_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modify_type", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[int]]:
        """
        The period. Valid values: `1`, `12`, `2`, `24`, `3`, `6`.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="renewalDuration")
    def renewal_duration(self) -> Optional[pulumi.Input[int]]:
        """
        RenewalDuration. Valid values: `1`, `12`, `2`, `3`, `6`.
        """
        return pulumi.get(self, "renewal_duration")

    @renewal_duration.setter
    def renewal_duration(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "renewal_duration", value)

    @property
    @pulumi.getter(name="renewalDurationUnit")
    def renewal_duration_unit(self) -> Optional[pulumi.Input[str]]:
        """
        Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years. Valid values: `Month`, `Year`.
        """
        return pulumi.get(self, "renewal_duration_unit")

    @renewal_duration_unit.setter
    def renewal_duration_unit(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "renewal_duration_unit", value)

    @property
    @pulumi.getter(name="renewalStatus")
    def renewal_status(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to renew an instance automatically or not. Default to "ManualRenewal".
        - `AutoRenewal`: Auto renewal.
        - `ManualRenewal`: Manual renewal.
        - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
        """
        return pulumi.get(self, "renewal_status")

    @renewal_status.setter
    def renewal_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "renewal_status", value)

    @property
    @pulumi.getter(name="storageSize")
    def storage_size(self) -> Optional[pulumi.Input[str]]:
        """
        The storage size. It is valid when `instance_type` is vip.
        """
        return pulumi.get(self, "storage_size")

    @storage_size.setter
    def storage_size(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_size", value)


@pulumi.input_type
class _InstanceState:
    def __init__(__self__, *,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 instance_type: Optional[pulumi.Input[str]] = None,
                 logistics: Optional[pulumi.Input[str]] = None,
                 max_eip_tps: Optional[pulumi.Input[str]] = None,
                 max_tps: Optional[pulumi.Input[str]] = None,
                 modify_type: Optional[pulumi.Input[str]] = None,
                 payment_type: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 queue_capacity: Optional[pulumi.Input[str]] = None,
                 renewal_duration: Optional[pulumi.Input[int]] = None,
                 renewal_duration_unit: Optional[pulumi.Input[str]] = None,
                 renewal_status: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 storage_size: Optional[pulumi.Input[str]] = None,
                 support_eip: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering Instance resources.
        :param pulumi.Input[str] instance_name: The instance name.
        :param pulumi.Input[str] instance_type: The Instance Type. Valid values: `professional`, `vip`.
        :param pulumi.Input[str] max_eip_tps: The max eip tps. It is valid when `support_eip` is true. The valid value is [128, 45000] with the step size 128.
        :param pulumi.Input[str] max_tps: The peak TPS traffic. The smallest valid value is 1000 and the largest value is 100,000.
        :param pulumi.Input[str] modify_type: The modify type. Valid values: `Downgrade`, `Upgrade`. It is required when updating other attributes.
        :param pulumi.Input[str] payment_type: The payment type. Valid values: `Subscription`.
        :param pulumi.Input[int] period: The period. Valid values: `1`, `12`, `2`, `24`, `3`, `6`.
        :param pulumi.Input[str] queue_capacity: The queue capacity. The smallest value is 50 and the step size 5.
        :param pulumi.Input[int] renewal_duration: RenewalDuration. Valid values: `1`, `12`, `2`, `3`, `6`.
        :param pulumi.Input[str] renewal_duration_unit: Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years. Valid values: `Month`, `Year`.
        :param pulumi.Input[str] renewal_status: Whether to renew an instance automatically or not. Default to "ManualRenewal".
               - `AutoRenewal`: Auto renewal.
               - `ManualRenewal`: Manual renewal.
               - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[str] storage_size: The storage size. It is valid when `instance_type` is vip.
        :param pulumi.Input[bool] support_eip: Whether to support EIP.
        """
        if instance_name is not None:
            pulumi.set(__self__, "instance_name", instance_name)
        if instance_type is not None:
            pulumi.set(__self__, "instance_type", instance_type)
        if logistics is not None:
            pulumi.set(__self__, "logistics", logistics)
        if max_eip_tps is not None:
            pulumi.set(__self__, "max_eip_tps", max_eip_tps)
        if max_tps is not None:
            pulumi.set(__self__, "max_tps", max_tps)
        if modify_type is not None:
            pulumi.set(__self__, "modify_type", modify_type)
        if payment_type is not None:
            pulumi.set(__self__, "payment_type", payment_type)
        if period is not None:
            pulumi.set(__self__, "period", period)
        if queue_capacity is not None:
            pulumi.set(__self__, "queue_capacity", queue_capacity)
        if renewal_duration is not None:
            pulumi.set(__self__, "renewal_duration", renewal_duration)
        if renewal_duration_unit is not None:
            pulumi.set(__self__, "renewal_duration_unit", renewal_duration_unit)
        if renewal_status is not None:
            pulumi.set(__self__, "renewal_status", renewal_status)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if storage_size is not None:
            pulumi.set(__self__, "storage_size", storage_size)
        if support_eip is not None:
            pulumi.set(__self__, "support_eip", support_eip)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> Optional[pulumi.Input[str]]:
        """
        The instance name.
        """
        return pulumi.get(self, "instance_name")

    @instance_name.setter
    def instance_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_name", value)

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> Optional[pulumi.Input[str]]:
        """
        The Instance Type. Valid values: `professional`, `vip`.
        """
        return pulumi.get(self, "instance_type")

    @instance_type.setter
    def instance_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_type", value)

    @property
    @pulumi.getter
    def logistics(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "logistics")

    @logistics.setter
    def logistics(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "logistics", value)

    @property
    @pulumi.getter(name="maxEipTps")
    def max_eip_tps(self) -> Optional[pulumi.Input[str]]:
        """
        The max eip tps. It is valid when `support_eip` is true. The valid value is [128, 45000] with the step size 128.
        """
        return pulumi.get(self, "max_eip_tps")

    @max_eip_tps.setter
    def max_eip_tps(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "max_eip_tps", value)

    @property
    @pulumi.getter(name="maxTps")
    def max_tps(self) -> Optional[pulumi.Input[str]]:
        """
        The peak TPS traffic. The smallest valid value is 1000 and the largest value is 100,000.
        """
        return pulumi.get(self, "max_tps")

    @max_tps.setter
    def max_tps(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "max_tps", value)

    @property
    @pulumi.getter(name="modifyType")
    def modify_type(self) -> Optional[pulumi.Input[str]]:
        """
        The modify type. Valid values: `Downgrade`, `Upgrade`. It is required when updating other attributes.
        """
        return pulumi.get(self, "modify_type")

    @modify_type.setter
    def modify_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modify_type", value)

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> Optional[pulumi.Input[str]]:
        """
        The payment type. Valid values: `Subscription`.
        """
        return pulumi.get(self, "payment_type")

    @payment_type.setter
    def payment_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "payment_type", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[int]]:
        """
        The period. Valid values: `1`, `12`, `2`, `24`, `3`, `6`.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="queueCapacity")
    def queue_capacity(self) -> Optional[pulumi.Input[str]]:
        """
        The queue capacity. The smallest value is 50 and the step size 5.
        """
        return pulumi.get(self, "queue_capacity")

    @queue_capacity.setter
    def queue_capacity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "queue_capacity", value)

    @property
    @pulumi.getter(name="renewalDuration")
    def renewal_duration(self) -> Optional[pulumi.Input[int]]:
        """
        RenewalDuration. Valid values: `1`, `12`, `2`, `3`, `6`.
        """
        return pulumi.get(self, "renewal_duration")

    @renewal_duration.setter
    def renewal_duration(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "renewal_duration", value)

    @property
    @pulumi.getter(name="renewalDurationUnit")
    def renewal_duration_unit(self) -> Optional[pulumi.Input[str]]:
        """
        Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years. Valid values: `Month`, `Year`.
        """
        return pulumi.get(self, "renewal_duration_unit")

    @renewal_duration_unit.setter
    def renewal_duration_unit(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "renewal_duration_unit", value)

    @property
    @pulumi.getter(name="renewalStatus")
    def renewal_status(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to renew an instance automatically or not. Default to "ManualRenewal".
        - `AutoRenewal`: Auto renewal.
        - `ManualRenewal`: Manual renewal.
        - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
        """
        return pulumi.get(self, "renewal_status")

    @renewal_status.setter
    def renewal_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "renewal_status", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="storageSize")
    def storage_size(self) -> Optional[pulumi.Input[str]]:
        """
        The storage size. It is valid when `instance_type` is vip.
        """
        return pulumi.get(self, "storage_size")

    @storage_size.setter
    def storage_size(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_size", value)

    @property
    @pulumi.getter(name="supportEip")
    def support_eip(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to support EIP.
        """
        return pulumi.get(self, "support_eip")

    @support_eip.setter
    def support_eip(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "support_eip", value)


class Instance(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 instance_type: Optional[pulumi.Input[str]] = None,
                 logistics: Optional[pulumi.Input[str]] = None,
                 max_eip_tps: Optional[pulumi.Input[str]] = None,
                 max_tps: Optional[pulumi.Input[str]] = None,
                 modify_type: Optional[pulumi.Input[str]] = None,
                 payment_type: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 queue_capacity: Optional[pulumi.Input[str]] = None,
                 renewal_duration: Optional[pulumi.Input[int]] = None,
                 renewal_duration_unit: Optional[pulumi.Input[str]] = None,
                 renewal_status: Optional[pulumi.Input[str]] = None,
                 storage_size: Optional[pulumi.Input[str]] = None,
                 support_eip: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Provides a RabbitMQ (AMQP) Instance resource.

        For information about RabbitMQ (AMQP) Instance and how to use it, see [What is Instance](https://www.alibabacloud.com/help/doc-detail/101631.htm).

        > **NOTE:** Available in v1.128.0+.

        > **NOTE:** The AMQP Instance is not support to be purchase automatically in the international site.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        professional = alicloud.amqp.Instance("professional",
            instance_type="professional",
            max_eip_tps="128",
            max_tps="1000",
            payment_type="Subscription",
            period=1,
            queue_capacity="50",
            support_eip=True)
        vip = alicloud.amqp.Instance("vip",
            instance_type="vip",
            max_eip_tps="128",
            max_tps="5000",
            payment_type="Subscription",
            period=1,
            queue_capacity="50",
            storage_size="700",
            support_eip=True)
        ```

        ## Import

        RabbitMQ (AMQP) Instance can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:amqp/instance:Instance example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_name: The instance name.
        :param pulumi.Input[str] instance_type: The Instance Type. Valid values: `professional`, `vip`.
        :param pulumi.Input[str] max_eip_tps: The max eip tps. It is valid when `support_eip` is true. The valid value is [128, 45000] with the step size 128.
        :param pulumi.Input[str] max_tps: The peak TPS traffic. The smallest valid value is 1000 and the largest value is 100,000.
        :param pulumi.Input[str] modify_type: The modify type. Valid values: `Downgrade`, `Upgrade`. It is required when updating other attributes.
        :param pulumi.Input[str] payment_type: The payment type. Valid values: `Subscription`.
        :param pulumi.Input[int] period: The period. Valid values: `1`, `12`, `2`, `24`, `3`, `6`.
        :param pulumi.Input[str] queue_capacity: The queue capacity. The smallest value is 50 and the step size 5.
        :param pulumi.Input[int] renewal_duration: RenewalDuration. Valid values: `1`, `12`, `2`, `3`, `6`.
        :param pulumi.Input[str] renewal_duration_unit: Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years. Valid values: `Month`, `Year`.
        :param pulumi.Input[str] renewal_status: Whether to renew an instance automatically or not. Default to "ManualRenewal".
               - `AutoRenewal`: Auto renewal.
               - `ManualRenewal`: Manual renewal.
               - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
        :param pulumi.Input[str] storage_size: The storage size. It is valid when `instance_type` is vip.
        :param pulumi.Input[bool] support_eip: Whether to support EIP.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a RabbitMQ (AMQP) Instance resource.

        For information about RabbitMQ (AMQP) Instance and how to use it, see [What is Instance](https://www.alibabacloud.com/help/doc-detail/101631.htm).

        > **NOTE:** Available in v1.128.0+.

        > **NOTE:** The AMQP Instance is not support to be purchase automatically in the international site.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        professional = alicloud.amqp.Instance("professional",
            instance_type="professional",
            max_eip_tps="128",
            max_tps="1000",
            payment_type="Subscription",
            period=1,
            queue_capacity="50",
            support_eip=True)
        vip = alicloud.amqp.Instance("vip",
            instance_type="vip",
            max_eip_tps="128",
            max_tps="5000",
            payment_type="Subscription",
            period=1,
            queue_capacity="50",
            storage_size="700",
            support_eip=True)
        ```

        ## Import

        RabbitMQ (AMQP) Instance can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:amqp/instance:Instance example <id>
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
                 instance_name: Optional[pulumi.Input[str]] = None,
                 instance_type: Optional[pulumi.Input[str]] = None,
                 logistics: Optional[pulumi.Input[str]] = None,
                 max_eip_tps: Optional[pulumi.Input[str]] = None,
                 max_tps: Optional[pulumi.Input[str]] = None,
                 modify_type: Optional[pulumi.Input[str]] = None,
                 payment_type: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 queue_capacity: Optional[pulumi.Input[str]] = None,
                 renewal_duration: Optional[pulumi.Input[int]] = None,
                 renewal_duration_unit: Optional[pulumi.Input[str]] = None,
                 renewal_status: Optional[pulumi.Input[str]] = None,
                 storage_size: Optional[pulumi.Input[str]] = None,
                 support_eip: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceArgs.__new__(InstanceArgs)

            __props__.__dict__["instance_name"] = instance_name
            if instance_type is None and not opts.urn:
                raise TypeError("Missing required property 'instance_type'")
            __props__.__dict__["instance_type"] = instance_type
            __props__.__dict__["logistics"] = logistics
            __props__.__dict__["max_eip_tps"] = max_eip_tps
            if max_tps is None and not opts.urn:
                raise TypeError("Missing required property 'max_tps'")
            __props__.__dict__["max_tps"] = max_tps
            __props__.__dict__["modify_type"] = modify_type
            if payment_type is None and not opts.urn:
                raise TypeError("Missing required property 'payment_type'")
            __props__.__dict__["payment_type"] = payment_type
            __props__.__dict__["period"] = period
            if queue_capacity is None and not opts.urn:
                raise TypeError("Missing required property 'queue_capacity'")
            __props__.__dict__["queue_capacity"] = queue_capacity
            __props__.__dict__["renewal_duration"] = renewal_duration
            __props__.__dict__["renewal_duration_unit"] = renewal_duration_unit
            __props__.__dict__["renewal_status"] = renewal_status
            __props__.__dict__["storage_size"] = storage_size
            if support_eip is None and not opts.urn:
                raise TypeError("Missing required property 'support_eip'")
            __props__.__dict__["support_eip"] = support_eip
            __props__.__dict__["status"] = None
        super(Instance, __self__).__init__(
            'alicloud:amqp/instance:Instance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_name: Optional[pulumi.Input[str]] = None,
            instance_type: Optional[pulumi.Input[str]] = None,
            logistics: Optional[pulumi.Input[str]] = None,
            max_eip_tps: Optional[pulumi.Input[str]] = None,
            max_tps: Optional[pulumi.Input[str]] = None,
            modify_type: Optional[pulumi.Input[str]] = None,
            payment_type: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[int]] = None,
            queue_capacity: Optional[pulumi.Input[str]] = None,
            renewal_duration: Optional[pulumi.Input[int]] = None,
            renewal_duration_unit: Optional[pulumi.Input[str]] = None,
            renewal_status: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            storage_size: Optional[pulumi.Input[str]] = None,
            support_eip: Optional[pulumi.Input[bool]] = None) -> 'Instance':
        """
        Get an existing Instance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_name: The instance name.
        :param pulumi.Input[str] instance_type: The Instance Type. Valid values: `professional`, `vip`.
        :param pulumi.Input[str] max_eip_tps: The max eip tps. It is valid when `support_eip` is true. The valid value is [128, 45000] with the step size 128.
        :param pulumi.Input[str] max_tps: The peak TPS traffic. The smallest valid value is 1000 and the largest value is 100,000.
        :param pulumi.Input[str] modify_type: The modify type. Valid values: `Downgrade`, `Upgrade`. It is required when updating other attributes.
        :param pulumi.Input[str] payment_type: The payment type. Valid values: `Subscription`.
        :param pulumi.Input[int] period: The period. Valid values: `1`, `12`, `2`, `24`, `3`, `6`.
        :param pulumi.Input[str] queue_capacity: The queue capacity. The smallest value is 50 and the step size 5.
        :param pulumi.Input[int] renewal_duration: RenewalDuration. Valid values: `1`, `12`, `2`, `3`, `6`.
        :param pulumi.Input[str] renewal_duration_unit: Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years. Valid values: `Month`, `Year`.
        :param pulumi.Input[str] renewal_status: Whether to renew an instance automatically or not. Default to "ManualRenewal".
               - `AutoRenewal`: Auto renewal.
               - `ManualRenewal`: Manual renewal.
               - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[str] storage_size: The storage size. It is valid when `instance_type` is vip.
        :param pulumi.Input[bool] support_eip: Whether to support EIP.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceState.__new__(_InstanceState)

        __props__.__dict__["instance_name"] = instance_name
        __props__.__dict__["instance_type"] = instance_type
        __props__.__dict__["logistics"] = logistics
        __props__.__dict__["max_eip_tps"] = max_eip_tps
        __props__.__dict__["max_tps"] = max_tps
        __props__.__dict__["modify_type"] = modify_type
        __props__.__dict__["payment_type"] = payment_type
        __props__.__dict__["period"] = period
        __props__.__dict__["queue_capacity"] = queue_capacity
        __props__.__dict__["renewal_duration"] = renewal_duration
        __props__.__dict__["renewal_duration_unit"] = renewal_duration_unit
        __props__.__dict__["renewal_status"] = renewal_status
        __props__.__dict__["status"] = status
        __props__.__dict__["storage_size"] = storage_size
        __props__.__dict__["support_eip"] = support_eip
        return Instance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Output[Optional[str]]:
        """
        The instance name.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> pulumi.Output[str]:
        """
        The Instance Type. Valid values: `professional`, `vip`.
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter
    def logistics(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "logistics")

    @property
    @pulumi.getter(name="maxEipTps")
    def max_eip_tps(self) -> pulumi.Output[Optional[str]]:
        """
        The max eip tps. It is valid when `support_eip` is true. The valid value is [128, 45000] with the step size 128.
        """
        return pulumi.get(self, "max_eip_tps")

    @property
    @pulumi.getter(name="maxTps")
    def max_tps(self) -> pulumi.Output[str]:
        """
        The peak TPS traffic. The smallest valid value is 1000 and the largest value is 100,000.
        """
        return pulumi.get(self, "max_tps")

    @property
    @pulumi.getter(name="modifyType")
    def modify_type(self) -> pulumi.Output[Optional[str]]:
        """
        The modify type. Valid values: `Downgrade`, `Upgrade`. It is required when updating other attributes.
        """
        return pulumi.get(self, "modify_type")

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> pulumi.Output[str]:
        """
        The payment type. Valid values: `Subscription`.
        """
        return pulumi.get(self, "payment_type")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[Optional[int]]:
        """
        The period. Valid values: `1`, `12`, `2`, `24`, `3`, `6`.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter(name="queueCapacity")
    def queue_capacity(self) -> pulumi.Output[str]:
        """
        The queue capacity. The smallest value is 50 and the step size 5.
        """
        return pulumi.get(self, "queue_capacity")

    @property
    @pulumi.getter(name="renewalDuration")
    def renewal_duration(self) -> pulumi.Output[Optional[int]]:
        """
        RenewalDuration. Valid values: `1`, `12`, `2`, `3`, `6`.
        """
        return pulumi.get(self, "renewal_duration")

    @property
    @pulumi.getter(name="renewalDurationUnit")
    def renewal_duration_unit(self) -> pulumi.Output[Optional[str]]:
        """
        Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years. Valid values: `Month`, `Year`.
        """
        return pulumi.get(self, "renewal_duration_unit")

    @property
    @pulumi.getter(name="renewalStatus")
    def renewal_status(self) -> pulumi.Output[str]:
        """
        Whether to renew an instance automatically or not. Default to "ManualRenewal".
        - `AutoRenewal`: Auto renewal.
        - `ManualRenewal`: Manual renewal.
        - `NotRenewal`: No renewal any longer. After you specify this value, Alibaba Cloud stop sending notification of instance expiry, and only gives a brief reminder on the third day before the instance expiry.
        """
        return pulumi.get(self, "renewal_status")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="storageSize")
    def storage_size(self) -> pulumi.Output[Optional[str]]:
        """
        The storage size. It is valid when `instance_type` is vip.
        """
        return pulumi.get(self, "storage_size")

    @property
    @pulumi.getter(name="supportEip")
    def support_eip(self) -> pulumi.Output[bool]:
        """
        Whether to support EIP.
        """
        return pulumi.get(self, "support_eip")

