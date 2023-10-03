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
from ._inputs import *

__all__ = ['AddressPoolArgs', 'AddressPool']

@pulumi.input_type
class AddressPoolArgs:
    def __init__(__self__, *,
                 address_pool_name: pulumi.Input[str],
                 addresses: pulumi.Input[Sequence[pulumi.Input['AddressPoolAddressArgs']]],
                 instance_id: pulumi.Input[str],
                 lba_strategy: pulumi.Input[str],
                 type: pulumi.Input[str]):
        """
        The set of arguments for constructing a AddressPool resource.
        :param pulumi.Input[str] address_pool_name: The name of the address pool.
        :param pulumi.Input[Sequence[pulumi.Input['AddressPoolAddressArgs']]] addresses: The address lists of the Address Pool. See `address` below for details.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] lba_strategy: The load balancing policy of the address pool. Valid values:`ALL_RR` or `RATIO`. `ALL_RR`: returns all addresses. `RATIO`: returns addresses by weight.
        :param pulumi.Input[str] type: The type of the address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        """
        AddressPoolArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            address_pool_name=address_pool_name,
            addresses=addresses,
            instance_id=instance_id,
            lba_strategy=lba_strategy,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             address_pool_name: pulumi.Input[str],
             addresses: pulumi.Input[Sequence[pulumi.Input['AddressPoolAddressArgs']]],
             instance_id: pulumi.Input[str],
             lba_strategy: pulumi.Input[str],
             type: pulumi.Input[str],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("address_pool_name", address_pool_name)
        _setter("addresses", addresses)
        _setter("instance_id", instance_id)
        _setter("lba_strategy", lba_strategy)
        _setter("type", type)

    @property
    @pulumi.getter(name="addressPoolName")
    def address_pool_name(self) -> pulumi.Input[str]:
        """
        The name of the address pool.
        """
        return pulumi.get(self, "address_pool_name")

    @address_pool_name.setter
    def address_pool_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "address_pool_name", value)

    @property
    @pulumi.getter
    def addresses(self) -> pulumi.Input[Sequence[pulumi.Input['AddressPoolAddressArgs']]]:
        """
        The address lists of the Address Pool. See `address` below for details.
        """
        return pulumi.get(self, "addresses")

    @addresses.setter
    def addresses(self, value: pulumi.Input[Sequence[pulumi.Input['AddressPoolAddressArgs']]]):
        pulumi.set(self, "addresses", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="lbaStrategy")
    def lba_strategy(self) -> pulumi.Input[str]:
        """
        The load balancing policy of the address pool. Valid values:`ALL_RR` or `RATIO`. `ALL_RR`: returns all addresses. `RATIO`: returns addresses by weight.
        """
        return pulumi.get(self, "lba_strategy")

    @lba_strategy.setter
    def lba_strategy(self, value: pulumi.Input[str]):
        pulumi.set(self, "lba_strategy", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of the address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _AddressPoolState:
    def __init__(__self__, *,
                 address_pool_name: Optional[pulumi.Input[str]] = None,
                 addresses: Optional[pulumi.Input[Sequence[pulumi.Input['AddressPoolAddressArgs']]]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 lba_strategy: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AddressPool resources.
        :param pulumi.Input[str] address_pool_name: The name of the address pool.
        :param pulumi.Input[Sequence[pulumi.Input['AddressPoolAddressArgs']]] addresses: The address lists of the Address Pool. See `address` below for details.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] lba_strategy: The load balancing policy of the address pool. Valid values:`ALL_RR` or `RATIO`. `ALL_RR`: returns all addresses. `RATIO`: returns addresses by weight.
        :param pulumi.Input[str] type: The type of the address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        """
        _AddressPoolState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            address_pool_name=address_pool_name,
            addresses=addresses,
            instance_id=instance_id,
            lba_strategy=lba_strategy,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             address_pool_name: Optional[pulumi.Input[str]] = None,
             addresses: Optional[pulumi.Input[Sequence[pulumi.Input['AddressPoolAddressArgs']]]] = None,
             instance_id: Optional[pulumi.Input[str]] = None,
             lba_strategy: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if address_pool_name is not None:
            _setter("address_pool_name", address_pool_name)
        if addresses is not None:
            _setter("addresses", addresses)
        if instance_id is not None:
            _setter("instance_id", instance_id)
        if lba_strategy is not None:
            _setter("lba_strategy", lba_strategy)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="addressPoolName")
    def address_pool_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the address pool.
        """
        return pulumi.get(self, "address_pool_name")

    @address_pool_name.setter
    def address_pool_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address_pool_name", value)

    @property
    @pulumi.getter
    def addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AddressPoolAddressArgs']]]]:
        """
        The address lists of the Address Pool. See `address` below for details.
        """
        return pulumi.get(self, "addresses")

    @addresses.setter
    def addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AddressPoolAddressArgs']]]]):
        pulumi.set(self, "addresses", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="lbaStrategy")
    def lba_strategy(self) -> Optional[pulumi.Input[str]]:
        """
        The load balancing policy of the address pool. Valid values:`ALL_RR` or `RATIO`. `ALL_RR`: returns all addresses. `RATIO`: returns addresses by weight.
        """
        return pulumi.get(self, "lba_strategy")

    @lba_strategy.setter
    def lba_strategy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lba_strategy", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class AddressPool(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address_pool_name: Optional[pulumi.Input[str]] = None,
                 addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AddressPoolAddressArgs']]]]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 lba_strategy: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Alidns Address Pool resource.

        For information about Alidns Address Pool and how to use it, see [What is Address Pool](https://www.alibabacloud.com/help/doc-detail/189621.html).

        > **NOTE:** Available since v1.152.0.

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
        ```

        ## Import

        Alidns Address Pool can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dns/addressPool:AddressPool example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address_pool_name: The name of the address pool.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AddressPoolAddressArgs']]]] addresses: The address lists of the Address Pool. See `address` below for details.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] lba_strategy: The load balancing policy of the address pool. Valid values:`ALL_RR` or `RATIO`. `ALL_RR`: returns all addresses. `RATIO`: returns addresses by weight.
        :param pulumi.Input[str] type: The type of the address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AddressPoolArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Alidns Address Pool resource.

        For information about Alidns Address Pool and how to use it, see [What is Address Pool](https://www.alibabacloud.com/help/doc-detail/189621.html).

        > **NOTE:** Available since v1.152.0.

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
        ```

        ## Import

        Alidns Address Pool can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dns/addressPool:AddressPool example <id>
        ```

        :param str resource_name: The name of the resource.
        :param AddressPoolArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AddressPoolArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AddressPoolArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address_pool_name: Optional[pulumi.Input[str]] = None,
                 addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AddressPoolAddressArgs']]]]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 lba_strategy: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AddressPoolArgs.__new__(AddressPoolArgs)

            if address_pool_name is None and not opts.urn:
                raise TypeError("Missing required property 'address_pool_name'")
            __props__.__dict__["address_pool_name"] = address_pool_name
            if addresses is None and not opts.urn:
                raise TypeError("Missing required property 'addresses'")
            __props__.__dict__["addresses"] = addresses
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if lba_strategy is None and not opts.urn:
                raise TypeError("Missing required property 'lba_strategy'")
            __props__.__dict__["lba_strategy"] = lba_strategy
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(AddressPool, __self__).__init__(
            'alicloud:dns/addressPool:AddressPool',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address_pool_name: Optional[pulumi.Input[str]] = None,
            addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AddressPoolAddressArgs']]]]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            lba_strategy: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'AddressPool':
        """
        Get an existing AddressPool resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address_pool_name: The name of the address pool.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AddressPoolAddressArgs']]]] addresses: The address lists of the Address Pool. See `address` below for details.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] lba_strategy: The load balancing policy of the address pool. Valid values:`ALL_RR` or `RATIO`. `ALL_RR`: returns all addresses. `RATIO`: returns addresses by weight.
        :param pulumi.Input[str] type: The type of the address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AddressPoolState.__new__(_AddressPoolState)

        __props__.__dict__["address_pool_name"] = address_pool_name
        __props__.__dict__["addresses"] = addresses
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["lba_strategy"] = lba_strategy
        __props__.__dict__["type"] = type
        return AddressPool(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="addressPoolName")
    def address_pool_name(self) -> pulumi.Output[str]:
        """
        The name of the address pool.
        """
        return pulumi.get(self, "address_pool_name")

    @property
    @pulumi.getter
    def addresses(self) -> pulumi.Output[Sequence['outputs.AddressPoolAddress']]:
        """
        The address lists of the Address Pool. See `address` below for details.
        """
        return pulumi.get(self, "addresses")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="lbaStrategy")
    def lba_strategy(self) -> pulumi.Output[str]:
        """
        The load balancing policy of the address pool. Valid values:`ALL_RR` or `RATIO`. `ALL_RR`: returns all addresses. `RATIO`: returns addresses by weight.
        """
        return pulumi.get(self, "lba_strategy")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        """
        return pulumi.get(self, "type")

