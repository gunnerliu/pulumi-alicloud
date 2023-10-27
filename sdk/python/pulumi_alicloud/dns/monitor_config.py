# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['MonitorConfigArgs', 'MonitorConfig']

@pulumi.input_type
class MonitorConfigArgs:
    def __init__(__self__, *,
                 addr_pool_id: pulumi.Input[str],
                 evaluation_count: pulumi.Input[int],
                 interval: pulumi.Input[int],
                 isp_city_nodes: pulumi.Input[Sequence[pulumi.Input['MonitorConfigIspCityNodeArgs']]],
                 monitor_extend_info: pulumi.Input[str],
                 protocol_type: pulumi.Input[str],
                 timeout: pulumi.Input[int],
                 lang: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MonitorConfig resource.
        :param pulumi.Input[str] addr_pool_id: The ID of the address pool.
        :param pulumi.Input[int] evaluation_count: The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
        :param pulumi.Input[int] interval: The health check interval. Unit: seconds. Valid values: `60`.
        :param pulumi.Input[Sequence[pulumi.Input['MonitorConfigIspCityNodeArgs']]] isp_city_nodes: The Monitoring node. See `isp_city_node` below for details.
        :param pulumi.Input[str] monitor_extend_info: The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
        :param pulumi.Input[str] protocol_type: The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
        :param pulumi.Input[int] timeout: The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
        :param pulumi.Input[str] lang: The lang.
        """
        pulumi.set(__self__, "addr_pool_id", addr_pool_id)
        pulumi.set(__self__, "evaluation_count", evaluation_count)
        pulumi.set(__self__, "interval", interval)
        pulumi.set(__self__, "isp_city_nodes", isp_city_nodes)
        pulumi.set(__self__, "monitor_extend_info", monitor_extend_info)
        pulumi.set(__self__, "protocol_type", protocol_type)
        pulumi.set(__self__, "timeout", timeout)
        if lang is not None:
            pulumi.set(__self__, "lang", lang)

    @property
    @pulumi.getter(name="addrPoolId")
    def addr_pool_id(self) -> pulumi.Input[str]:
        """
        The ID of the address pool.
        """
        return pulumi.get(self, "addr_pool_id")

    @addr_pool_id.setter
    def addr_pool_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "addr_pool_id", value)

    @property
    @pulumi.getter(name="evaluationCount")
    def evaluation_count(self) -> pulumi.Input[int]:
        """
        The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
        """
        return pulumi.get(self, "evaluation_count")

    @evaluation_count.setter
    def evaluation_count(self, value: pulumi.Input[int]):
        pulumi.set(self, "evaluation_count", value)

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Input[int]:
        """
        The health check interval. Unit: seconds. Valid values: `60`.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: pulumi.Input[int]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter(name="ispCityNodes")
    def isp_city_nodes(self) -> pulumi.Input[Sequence[pulumi.Input['MonitorConfigIspCityNodeArgs']]]:
        """
        The Monitoring node. See `isp_city_node` below for details.
        """
        return pulumi.get(self, "isp_city_nodes")

    @isp_city_nodes.setter
    def isp_city_nodes(self, value: pulumi.Input[Sequence[pulumi.Input['MonitorConfigIspCityNodeArgs']]]):
        pulumi.set(self, "isp_city_nodes", value)

    @property
    @pulumi.getter(name="monitorExtendInfo")
    def monitor_extend_info(self) -> pulumi.Input[str]:
        """
        The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
        """
        return pulumi.get(self, "monitor_extend_info")

    @monitor_extend_info.setter
    def monitor_extend_info(self, value: pulumi.Input[str]):
        pulumi.set(self, "monitor_extend_info", value)

    @property
    @pulumi.getter(name="protocolType")
    def protocol_type(self) -> pulumi.Input[str]:
        """
        The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
        """
        return pulumi.get(self, "protocol_type")

    @protocol_type.setter
    def protocol_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "protocol_type", value)

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Input[int]:
        """
        The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: pulumi.Input[int]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter
    def lang(self) -> Optional[pulumi.Input[str]]:
        """
        The lang.
        """
        return pulumi.get(self, "lang")

    @lang.setter
    def lang(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lang", value)


@pulumi.input_type
class _MonitorConfigState:
    def __init__(__self__, *,
                 addr_pool_id: Optional[pulumi.Input[str]] = None,
                 evaluation_count: Optional[pulumi.Input[int]] = None,
                 interval: Optional[pulumi.Input[int]] = None,
                 isp_city_nodes: Optional[pulumi.Input[Sequence[pulumi.Input['MonitorConfigIspCityNodeArgs']]]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 monitor_extend_info: Optional[pulumi.Input[str]] = None,
                 protocol_type: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering MonitorConfig resources.
        :param pulumi.Input[str] addr_pool_id: The ID of the address pool.
        :param pulumi.Input[int] evaluation_count: The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
        :param pulumi.Input[int] interval: The health check interval. Unit: seconds. Valid values: `60`.
        :param pulumi.Input[Sequence[pulumi.Input['MonitorConfigIspCityNodeArgs']]] isp_city_nodes: The Monitoring node. See `isp_city_node` below for details.
        :param pulumi.Input[str] lang: The lang.
        :param pulumi.Input[str] monitor_extend_info: The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
        :param pulumi.Input[str] protocol_type: The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
        :param pulumi.Input[int] timeout: The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
        """
        if addr_pool_id is not None:
            pulumi.set(__self__, "addr_pool_id", addr_pool_id)
        if evaluation_count is not None:
            pulumi.set(__self__, "evaluation_count", evaluation_count)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)
        if isp_city_nodes is not None:
            pulumi.set(__self__, "isp_city_nodes", isp_city_nodes)
        if lang is not None:
            pulumi.set(__self__, "lang", lang)
        if monitor_extend_info is not None:
            pulumi.set(__self__, "monitor_extend_info", monitor_extend_info)
        if protocol_type is not None:
            pulumi.set(__self__, "protocol_type", protocol_type)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter(name="addrPoolId")
    def addr_pool_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the address pool.
        """
        return pulumi.get(self, "addr_pool_id")

    @addr_pool_id.setter
    def addr_pool_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "addr_pool_id", value)

    @property
    @pulumi.getter(name="evaluationCount")
    def evaluation_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
        """
        return pulumi.get(self, "evaluation_count")

    @evaluation_count.setter
    def evaluation_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "evaluation_count", value)

    @property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[int]]:
        """
        The health check interval. Unit: seconds. Valid values: `60`.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter(name="ispCityNodes")
    def isp_city_nodes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MonitorConfigIspCityNodeArgs']]]]:
        """
        The Monitoring node. See `isp_city_node` below for details.
        """
        return pulumi.get(self, "isp_city_nodes")

    @isp_city_nodes.setter
    def isp_city_nodes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MonitorConfigIspCityNodeArgs']]]]):
        pulumi.set(self, "isp_city_nodes", value)

    @property
    @pulumi.getter
    def lang(self) -> Optional[pulumi.Input[str]]:
        """
        The lang.
        """
        return pulumi.get(self, "lang")

    @lang.setter
    def lang(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lang", value)

    @property
    @pulumi.getter(name="monitorExtendInfo")
    def monitor_extend_info(self) -> Optional[pulumi.Input[str]]:
        """
        The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
        """
        return pulumi.get(self, "monitor_extend_info")

    @monitor_extend_info.setter
    def monitor_extend_info(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "monitor_extend_info", value)

    @property
    @pulumi.getter(name="protocolType")
    def protocol_type(self) -> Optional[pulumi.Input[str]]:
        """
        The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
        """
        return pulumi.get(self, "protocol_type")

    @protocol_type.setter
    def protocol_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "protocol_type", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[int]]:
        """
        The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timeout", value)


class MonitorConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 addr_pool_id: Optional[pulumi.Input[str]] = None,
                 evaluation_count: Optional[pulumi.Input[int]] = None,
                 interval: Optional[pulumi.Input[int]] = None,
                 isp_city_nodes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MonitorConfigIspCityNodeArgs']]]]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 monitor_extend_info: Optional[pulumi.Input[str]] = None,
                 protocol_type: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a DNS Monitor Config resource.

        For information about DNS Monitor Config and how to use it, see [What is Monitor Config](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).

        > **NOTE:** Available since v1.153.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        domain_name = config.get("domainName")
        if domain_name is None:
            domain_name = "alicloud-provider.com"
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default_alarm_contact_group = alicloud.cms.AlarmContactGroup("defaultAlarmContactGroup", alarm_contact_group_name=name)
        default_gtm_instance = alicloud.dns.GtmInstance("defaultGtmInstance",
            instance_name=name,
            payment_type="Subscription",
            period=1,
            renewal_status="ManualRenewal",
            package_edition="standard",
            health_check_task_count=100,
            sms_notification_count=1000,
            public_cname_mode="SYSTEM_ASSIGN",
            ttl=60,
            cname_type="PUBLIC",
            resource_group_id=default_resource_groups.groups[0].id,
            alert_groups=[default_alarm_contact_group.alarm_contact_group_name],
            public_user_domain_name=domain_name,
            alert_configs=[alicloud.dns.GtmInstanceAlertConfigArgs(
                sms_notice=True,
                notice_type="ADDR_ALERT",
                email_notice=True,
                dingtalk_notice=True,
            )])
        default_address_pool = alicloud.dns.AddressPool("defaultAddressPool",
            address_pool_name=name,
            instance_id=default_gtm_instance.id,
            lba_strategy="RATIO",
            type="IPV4",
            addresses=[alicloud.dns.AddressPoolAddressArgs(
                attribute_info="{\\"lineCodeRectifyType\\":\\"RECTIFIED\\",\\"lineCodes\\":[\\"os_namerica_us\\"]}",
                remark="address_remark",
                address="1.1.1.1",
                mode="SMART",
                lba_weight=1,
            )])
        default_monitor_config = alicloud.dns.MonitorConfig("defaultMonitorConfig",
            addr_pool_id=default_address_pool.id,
            evaluation_count=1,
            interval=60,
            timeout=5000,
            protocol_type="TCP",
            monitor_extend_info="{\\"failureRate\\":50,\\"port\\":80}",
            isp_city_nodes=[alicloud.dns.MonitorConfigIspCityNodeArgs(
                city_code="503",
                isp_code="465",
            )])
        ```

        ## Import

        DNS Monitor Config can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dns/monitorConfig:MonitorConfig example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] addr_pool_id: The ID of the address pool.
        :param pulumi.Input[int] evaluation_count: The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
        :param pulumi.Input[int] interval: The health check interval. Unit: seconds. Valid values: `60`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MonitorConfigIspCityNodeArgs']]]] isp_city_nodes: The Monitoring node. See `isp_city_node` below for details.
        :param pulumi.Input[str] lang: The lang.
        :param pulumi.Input[str] monitor_extend_info: The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
        :param pulumi.Input[str] protocol_type: The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
        :param pulumi.Input[int] timeout: The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MonitorConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DNS Monitor Config resource.

        For information about DNS Monitor Config and how to use it, see [What is Monitor Config](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).

        > **NOTE:** Available since v1.153.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        domain_name = config.get("domainName")
        if domain_name is None:
            domain_name = "alicloud-provider.com"
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default_alarm_contact_group = alicloud.cms.AlarmContactGroup("defaultAlarmContactGroup", alarm_contact_group_name=name)
        default_gtm_instance = alicloud.dns.GtmInstance("defaultGtmInstance",
            instance_name=name,
            payment_type="Subscription",
            period=1,
            renewal_status="ManualRenewal",
            package_edition="standard",
            health_check_task_count=100,
            sms_notification_count=1000,
            public_cname_mode="SYSTEM_ASSIGN",
            ttl=60,
            cname_type="PUBLIC",
            resource_group_id=default_resource_groups.groups[0].id,
            alert_groups=[default_alarm_contact_group.alarm_contact_group_name],
            public_user_domain_name=domain_name,
            alert_configs=[alicloud.dns.GtmInstanceAlertConfigArgs(
                sms_notice=True,
                notice_type="ADDR_ALERT",
                email_notice=True,
                dingtalk_notice=True,
            )])
        default_address_pool = alicloud.dns.AddressPool("defaultAddressPool",
            address_pool_name=name,
            instance_id=default_gtm_instance.id,
            lba_strategy="RATIO",
            type="IPV4",
            addresses=[alicloud.dns.AddressPoolAddressArgs(
                attribute_info="{\\"lineCodeRectifyType\\":\\"RECTIFIED\\",\\"lineCodes\\":[\\"os_namerica_us\\"]}",
                remark="address_remark",
                address="1.1.1.1",
                mode="SMART",
                lba_weight=1,
            )])
        default_monitor_config = alicloud.dns.MonitorConfig("defaultMonitorConfig",
            addr_pool_id=default_address_pool.id,
            evaluation_count=1,
            interval=60,
            timeout=5000,
            protocol_type="TCP",
            monitor_extend_info="{\\"failureRate\\":50,\\"port\\":80}",
            isp_city_nodes=[alicloud.dns.MonitorConfigIspCityNodeArgs(
                city_code="503",
                isp_code="465",
            )])
        ```

        ## Import

        DNS Monitor Config can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dns/monitorConfig:MonitorConfig example <id>
        ```

        :param str resource_name: The name of the resource.
        :param MonitorConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MonitorConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 addr_pool_id: Optional[pulumi.Input[str]] = None,
                 evaluation_count: Optional[pulumi.Input[int]] = None,
                 interval: Optional[pulumi.Input[int]] = None,
                 isp_city_nodes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MonitorConfigIspCityNodeArgs']]]]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 monitor_extend_info: Optional[pulumi.Input[str]] = None,
                 protocol_type: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MonitorConfigArgs.__new__(MonitorConfigArgs)

            if addr_pool_id is None and not opts.urn:
                raise TypeError("Missing required property 'addr_pool_id'")
            __props__.__dict__["addr_pool_id"] = addr_pool_id
            if evaluation_count is None and not opts.urn:
                raise TypeError("Missing required property 'evaluation_count'")
            __props__.__dict__["evaluation_count"] = evaluation_count
            if interval is None and not opts.urn:
                raise TypeError("Missing required property 'interval'")
            __props__.__dict__["interval"] = interval
            if isp_city_nodes is None and not opts.urn:
                raise TypeError("Missing required property 'isp_city_nodes'")
            __props__.__dict__["isp_city_nodes"] = isp_city_nodes
            __props__.__dict__["lang"] = lang
            if monitor_extend_info is None and not opts.urn:
                raise TypeError("Missing required property 'monitor_extend_info'")
            __props__.__dict__["monitor_extend_info"] = monitor_extend_info
            if protocol_type is None and not opts.urn:
                raise TypeError("Missing required property 'protocol_type'")
            __props__.__dict__["protocol_type"] = protocol_type
            if timeout is None and not opts.urn:
                raise TypeError("Missing required property 'timeout'")
            __props__.__dict__["timeout"] = timeout
        super(MonitorConfig, __self__).__init__(
            'alicloud:dns/monitorConfig:MonitorConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            addr_pool_id: Optional[pulumi.Input[str]] = None,
            evaluation_count: Optional[pulumi.Input[int]] = None,
            interval: Optional[pulumi.Input[int]] = None,
            isp_city_nodes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MonitorConfigIspCityNodeArgs']]]]] = None,
            lang: Optional[pulumi.Input[str]] = None,
            monitor_extend_info: Optional[pulumi.Input[str]] = None,
            protocol_type: Optional[pulumi.Input[str]] = None,
            timeout: Optional[pulumi.Input[int]] = None) -> 'MonitorConfig':
        """
        Get an existing MonitorConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] addr_pool_id: The ID of the address pool.
        :param pulumi.Input[int] evaluation_count: The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
        :param pulumi.Input[int] interval: The health check interval. Unit: seconds. Valid values: `60`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MonitorConfigIspCityNodeArgs']]]] isp_city_nodes: The Monitoring node. See `isp_city_node` below for details.
        :param pulumi.Input[str] lang: The lang.
        :param pulumi.Input[str] monitor_extend_info: The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
        :param pulumi.Input[str] protocol_type: The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
        :param pulumi.Input[int] timeout: The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MonitorConfigState.__new__(_MonitorConfigState)

        __props__.__dict__["addr_pool_id"] = addr_pool_id
        __props__.__dict__["evaluation_count"] = evaluation_count
        __props__.__dict__["interval"] = interval
        __props__.__dict__["isp_city_nodes"] = isp_city_nodes
        __props__.__dict__["lang"] = lang
        __props__.__dict__["monitor_extend_info"] = monitor_extend_info
        __props__.__dict__["protocol_type"] = protocol_type
        __props__.__dict__["timeout"] = timeout
        return MonitorConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="addrPoolId")
    def addr_pool_id(self) -> pulumi.Output[str]:
        """
        The ID of the address pool.
        """
        return pulumi.get(self, "addr_pool_id")

    @property
    @pulumi.getter(name="evaluationCount")
    def evaluation_count(self) -> pulumi.Output[int]:
        """
        The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
        """
        return pulumi.get(self, "evaluation_count")

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Output[int]:
        """
        The health check interval. Unit: seconds. Valid values: `60`.
        """
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter(name="ispCityNodes")
    def isp_city_nodes(self) -> pulumi.Output[Sequence['outputs.MonitorConfigIspCityNode']]:
        """
        The Monitoring node. See `isp_city_node` below for details.
        """
        return pulumi.get(self, "isp_city_nodes")

    @property
    @pulumi.getter
    def lang(self) -> pulumi.Output[Optional[str]]:
        """
        The lang.
        """
        return pulumi.get(self, "lang")

    @property
    @pulumi.getter(name="monitorExtendInfo")
    def monitor_extend_info(self) -> pulumi.Output[str]:
        """
        The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/api-alidns-2015-01-09-adddnsgtmmonitor).
        """
        return pulumi.get(self, "monitor_extend_info")

    @property
    @pulumi.getter(name="protocolType")
    def protocol_type(self) -> pulumi.Output[str]:
        """
        The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
        """
        return pulumi.get(self, "protocol_type")

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Output[int]:
        """
        The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
        """
        return pulumi.get(self, "timeout")

