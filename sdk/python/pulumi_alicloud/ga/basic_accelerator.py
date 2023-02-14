# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BasicAcceleratorArgs', 'BasicAccelerator']

@pulumi.input_type
class BasicAcceleratorArgs:
    def __init__(__self__, *,
                 auto_pay: Optional[pulumi.Input[bool]] = None,
                 auto_renew: Optional[pulumi.Input[bool]] = None,
                 auto_renew_duration: Optional[pulumi.Input[int]] = None,
                 auto_use_coupon: Optional[pulumi.Input[str]] = None,
                 bandwidth_billing_type: Optional[pulumi.Input[str]] = None,
                 basic_accelerator_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 duration: Optional[pulumi.Input[int]] = None,
                 pricing_cycle: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BasicAccelerator resource.
        :param pulumi.Input[bool] auto_pay: Specifies whether to enable automatic payment. Default value: `false`. Valid values:
        :param pulumi.Input[bool] auto_renew: Specifies whether to enable auto-renewal for the GA Basic Accelerator instance. Default value: `false`. Valid values:
        :param pulumi.Input[int] auto_renew_duration: The auto-renewal period. Unit: months. Valid values: `1` to `12`. Default value: `1`. **NOTE:** This parameter is required only if `auto_renew` is set to `true`.
        :param pulumi.Input[str] auto_use_coupon: Specifies whether to automatically pay bills by using coupons. Default value: `false`. **NOTE:** This parameter is required only if `auto_pay` is set to `true`.
        :param pulumi.Input[str] bandwidth_billing_type: The bandwidth billing method. Valid values: `BandwidthPackage`, `CDT`, `CDT95`.
        :param pulumi.Input[str] basic_accelerator_name: The name of the Global Accelerator Basic Accelerator instance.
        :param pulumi.Input[str] description: The description of the Global Accelerator Basic Accelerator instance.
        :param pulumi.Input[int] duration: The subscription duration. Default value: `1`.
               * If the `pricing_cycle` parameter is set to `Month`, the valid values for the `duration` parameter are `1` to `9`.
               * If the `pricing_cycle` parameter is set to `Year`, the valid values for the `duration` parameter are `1` to `3`.
        :param pulumi.Input[str] pricing_cycle: The billing cycle. Default value: `Month`. Valid values: `Month`, `Year`.
        """
        if auto_pay is not None:
            pulumi.set(__self__, "auto_pay", auto_pay)
        if auto_renew is not None:
            pulumi.set(__self__, "auto_renew", auto_renew)
        if auto_renew_duration is not None:
            pulumi.set(__self__, "auto_renew_duration", auto_renew_duration)
        if auto_use_coupon is not None:
            pulumi.set(__self__, "auto_use_coupon", auto_use_coupon)
        if bandwidth_billing_type is not None:
            pulumi.set(__self__, "bandwidth_billing_type", bandwidth_billing_type)
        if basic_accelerator_name is not None:
            pulumi.set(__self__, "basic_accelerator_name", basic_accelerator_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if duration is not None:
            pulumi.set(__self__, "duration", duration)
        if pricing_cycle is not None:
            pulumi.set(__self__, "pricing_cycle", pricing_cycle)

    @property
    @pulumi.getter(name="autoPay")
    def auto_pay(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable automatic payment. Default value: `false`. Valid values:
        """
        return pulumi.get(self, "auto_pay")

    @auto_pay.setter
    def auto_pay(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_pay", value)

    @property
    @pulumi.getter(name="autoRenew")
    def auto_renew(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable auto-renewal for the GA Basic Accelerator instance. Default value: `false`. Valid values:
        """
        return pulumi.get(self, "auto_renew")

    @auto_renew.setter
    def auto_renew(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_renew", value)

    @property
    @pulumi.getter(name="autoRenewDuration")
    def auto_renew_duration(self) -> Optional[pulumi.Input[int]]:
        """
        The auto-renewal period. Unit: months. Valid values: `1` to `12`. Default value: `1`. **NOTE:** This parameter is required only if `auto_renew` is set to `true`.
        """
        return pulumi.get(self, "auto_renew_duration")

    @auto_renew_duration.setter
    def auto_renew_duration(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "auto_renew_duration", value)

    @property
    @pulumi.getter(name="autoUseCoupon")
    def auto_use_coupon(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies whether to automatically pay bills by using coupons. Default value: `false`. **NOTE:** This parameter is required only if `auto_pay` is set to `true`.
        """
        return pulumi.get(self, "auto_use_coupon")

    @auto_use_coupon.setter
    def auto_use_coupon(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auto_use_coupon", value)

    @property
    @pulumi.getter(name="bandwidthBillingType")
    def bandwidth_billing_type(self) -> Optional[pulumi.Input[str]]:
        """
        The bandwidth billing method. Valid values: `BandwidthPackage`, `CDT`, `CDT95`.
        """
        return pulumi.get(self, "bandwidth_billing_type")

    @bandwidth_billing_type.setter
    def bandwidth_billing_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bandwidth_billing_type", value)

    @property
    @pulumi.getter(name="basicAcceleratorName")
    def basic_accelerator_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Global Accelerator Basic Accelerator instance.
        """
        return pulumi.get(self, "basic_accelerator_name")

    @basic_accelerator_name.setter
    def basic_accelerator_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "basic_accelerator_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Global Accelerator Basic Accelerator instance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def duration(self) -> Optional[pulumi.Input[int]]:
        """
        The subscription duration. Default value: `1`.
        * If the `pricing_cycle` parameter is set to `Month`, the valid values for the `duration` parameter are `1` to `9`.
        * If the `pricing_cycle` parameter is set to `Year`, the valid values for the `duration` parameter are `1` to `3`.
        """
        return pulumi.get(self, "duration")

    @duration.setter
    def duration(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "duration", value)

    @property
    @pulumi.getter(name="pricingCycle")
    def pricing_cycle(self) -> Optional[pulumi.Input[str]]:
        """
        The billing cycle. Default value: `Month`. Valid values: `Month`, `Year`.
        """
        return pulumi.get(self, "pricing_cycle")

    @pricing_cycle.setter
    def pricing_cycle(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pricing_cycle", value)


@pulumi.input_type
class _BasicAcceleratorState:
    def __init__(__self__, *,
                 auto_pay: Optional[pulumi.Input[bool]] = None,
                 auto_renew: Optional[pulumi.Input[bool]] = None,
                 auto_renew_duration: Optional[pulumi.Input[int]] = None,
                 auto_use_coupon: Optional[pulumi.Input[str]] = None,
                 bandwidth_billing_type: Optional[pulumi.Input[str]] = None,
                 basic_accelerator_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 duration: Optional[pulumi.Input[int]] = None,
                 pricing_cycle: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BasicAccelerator resources.
        :param pulumi.Input[bool] auto_pay: Specifies whether to enable automatic payment. Default value: `false`. Valid values:
        :param pulumi.Input[bool] auto_renew: Specifies whether to enable auto-renewal for the GA Basic Accelerator instance. Default value: `false`. Valid values:
        :param pulumi.Input[int] auto_renew_duration: The auto-renewal period. Unit: months. Valid values: `1` to `12`. Default value: `1`. **NOTE:** This parameter is required only if `auto_renew` is set to `true`.
        :param pulumi.Input[str] auto_use_coupon: Specifies whether to automatically pay bills by using coupons. Default value: `false`. **NOTE:** This parameter is required only if `auto_pay` is set to `true`.
        :param pulumi.Input[str] bandwidth_billing_type: The bandwidth billing method. Valid values: `BandwidthPackage`, `CDT`, `CDT95`.
        :param pulumi.Input[str] basic_accelerator_name: The name of the Global Accelerator Basic Accelerator instance.
        :param pulumi.Input[str] description: The description of the Global Accelerator Basic Accelerator instance.
        :param pulumi.Input[int] duration: The subscription duration. Default value: `1`.
               * If the `pricing_cycle` parameter is set to `Month`, the valid values for the `duration` parameter are `1` to `9`.
               * If the `pricing_cycle` parameter is set to `Year`, the valid values for the `duration` parameter are `1` to `3`.
        :param pulumi.Input[str] pricing_cycle: The billing cycle. Default value: `Month`. Valid values: `Month`, `Year`.
        :param pulumi.Input[str] status: The status of the Basic Accelerator instance.
        """
        if auto_pay is not None:
            pulumi.set(__self__, "auto_pay", auto_pay)
        if auto_renew is not None:
            pulumi.set(__self__, "auto_renew", auto_renew)
        if auto_renew_duration is not None:
            pulumi.set(__self__, "auto_renew_duration", auto_renew_duration)
        if auto_use_coupon is not None:
            pulumi.set(__self__, "auto_use_coupon", auto_use_coupon)
        if bandwidth_billing_type is not None:
            pulumi.set(__self__, "bandwidth_billing_type", bandwidth_billing_type)
        if basic_accelerator_name is not None:
            pulumi.set(__self__, "basic_accelerator_name", basic_accelerator_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if duration is not None:
            pulumi.set(__self__, "duration", duration)
        if pricing_cycle is not None:
            pulumi.set(__self__, "pricing_cycle", pricing_cycle)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="autoPay")
    def auto_pay(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable automatic payment. Default value: `false`. Valid values:
        """
        return pulumi.get(self, "auto_pay")

    @auto_pay.setter
    def auto_pay(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_pay", value)

    @property
    @pulumi.getter(name="autoRenew")
    def auto_renew(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable auto-renewal for the GA Basic Accelerator instance. Default value: `false`. Valid values:
        """
        return pulumi.get(self, "auto_renew")

    @auto_renew.setter
    def auto_renew(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_renew", value)

    @property
    @pulumi.getter(name="autoRenewDuration")
    def auto_renew_duration(self) -> Optional[pulumi.Input[int]]:
        """
        The auto-renewal period. Unit: months. Valid values: `1` to `12`. Default value: `1`. **NOTE:** This parameter is required only if `auto_renew` is set to `true`.
        """
        return pulumi.get(self, "auto_renew_duration")

    @auto_renew_duration.setter
    def auto_renew_duration(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "auto_renew_duration", value)

    @property
    @pulumi.getter(name="autoUseCoupon")
    def auto_use_coupon(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies whether to automatically pay bills by using coupons. Default value: `false`. **NOTE:** This parameter is required only if `auto_pay` is set to `true`.
        """
        return pulumi.get(self, "auto_use_coupon")

    @auto_use_coupon.setter
    def auto_use_coupon(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auto_use_coupon", value)

    @property
    @pulumi.getter(name="bandwidthBillingType")
    def bandwidth_billing_type(self) -> Optional[pulumi.Input[str]]:
        """
        The bandwidth billing method. Valid values: `BandwidthPackage`, `CDT`, `CDT95`.
        """
        return pulumi.get(self, "bandwidth_billing_type")

    @bandwidth_billing_type.setter
    def bandwidth_billing_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bandwidth_billing_type", value)

    @property
    @pulumi.getter(name="basicAcceleratorName")
    def basic_accelerator_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Global Accelerator Basic Accelerator instance.
        """
        return pulumi.get(self, "basic_accelerator_name")

    @basic_accelerator_name.setter
    def basic_accelerator_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "basic_accelerator_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Global Accelerator Basic Accelerator instance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def duration(self) -> Optional[pulumi.Input[int]]:
        """
        The subscription duration. Default value: `1`.
        * If the `pricing_cycle` parameter is set to `Month`, the valid values for the `duration` parameter are `1` to `9`.
        * If the `pricing_cycle` parameter is set to `Year`, the valid values for the `duration` parameter are `1` to `3`.
        """
        return pulumi.get(self, "duration")

    @duration.setter
    def duration(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "duration", value)

    @property
    @pulumi.getter(name="pricingCycle")
    def pricing_cycle(self) -> Optional[pulumi.Input[str]]:
        """
        The billing cycle. Default value: `Month`. Valid values: `Month`, `Year`.
        """
        return pulumi.get(self, "pricing_cycle")

    @pricing_cycle.setter
    def pricing_cycle(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pricing_cycle", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the Basic Accelerator instance.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class BasicAccelerator(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_pay: Optional[pulumi.Input[bool]] = None,
                 auto_renew: Optional[pulumi.Input[bool]] = None,
                 auto_renew_duration: Optional[pulumi.Input[int]] = None,
                 auto_use_coupon: Optional[pulumi.Input[str]] = None,
                 bandwidth_billing_type: Optional[pulumi.Input[str]] = None,
                 basic_accelerator_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 duration: Optional[pulumi.Input[int]] = None,
                 pricing_cycle: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Global Accelerator (GA) Basic Accelerator resource.

        For information about Global Accelerator (GA) Basic Accelerator and how to use it, see [What is Basic Accelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/createbasicaccelerator).

        > **NOTE:** Available in v1.194.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.ga.BasicAccelerator("default",
            auto_pay=True,
            auto_use_coupon="true",
            bandwidth_billing_type="BandwidthPackage",
            basic_accelerator_name="tf-example-value",
            description="tf-example-value",
            duration=1,
            pricing_cycle="Month")
        ```

        ## Import

        Global Accelerator (GA) Basic Accelerator can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ga/basicAccelerator:BasicAccelerator example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_pay: Specifies whether to enable automatic payment. Default value: `false`. Valid values:
        :param pulumi.Input[bool] auto_renew: Specifies whether to enable auto-renewal for the GA Basic Accelerator instance. Default value: `false`. Valid values:
        :param pulumi.Input[int] auto_renew_duration: The auto-renewal period. Unit: months. Valid values: `1` to `12`. Default value: `1`. **NOTE:** This parameter is required only if `auto_renew` is set to `true`.
        :param pulumi.Input[str] auto_use_coupon: Specifies whether to automatically pay bills by using coupons. Default value: `false`. **NOTE:** This parameter is required only if `auto_pay` is set to `true`.
        :param pulumi.Input[str] bandwidth_billing_type: The bandwidth billing method. Valid values: `BandwidthPackage`, `CDT`, `CDT95`.
        :param pulumi.Input[str] basic_accelerator_name: The name of the Global Accelerator Basic Accelerator instance.
        :param pulumi.Input[str] description: The description of the Global Accelerator Basic Accelerator instance.
        :param pulumi.Input[int] duration: The subscription duration. Default value: `1`.
               * If the `pricing_cycle` parameter is set to `Month`, the valid values for the `duration` parameter are `1` to `9`.
               * If the `pricing_cycle` parameter is set to `Year`, the valid values for the `duration` parameter are `1` to `3`.
        :param pulumi.Input[str] pricing_cycle: The billing cycle. Default value: `Month`. Valid values: `Month`, `Year`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[BasicAcceleratorArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Global Accelerator (GA) Basic Accelerator resource.

        For information about Global Accelerator (GA) Basic Accelerator and how to use it, see [What is Basic Accelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/createbasicaccelerator).

        > **NOTE:** Available in v1.194.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.ga.BasicAccelerator("default",
            auto_pay=True,
            auto_use_coupon="true",
            bandwidth_billing_type="BandwidthPackage",
            basic_accelerator_name="tf-example-value",
            description="tf-example-value",
            duration=1,
            pricing_cycle="Month")
        ```

        ## Import

        Global Accelerator (GA) Basic Accelerator can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ga/basicAccelerator:BasicAccelerator example <id>
        ```

        :param str resource_name: The name of the resource.
        :param BasicAcceleratorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BasicAcceleratorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_pay: Optional[pulumi.Input[bool]] = None,
                 auto_renew: Optional[pulumi.Input[bool]] = None,
                 auto_renew_duration: Optional[pulumi.Input[int]] = None,
                 auto_use_coupon: Optional[pulumi.Input[str]] = None,
                 bandwidth_billing_type: Optional[pulumi.Input[str]] = None,
                 basic_accelerator_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 duration: Optional[pulumi.Input[int]] = None,
                 pricing_cycle: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BasicAcceleratorArgs.__new__(BasicAcceleratorArgs)

            __props__.__dict__["auto_pay"] = auto_pay
            __props__.__dict__["auto_renew"] = auto_renew
            __props__.__dict__["auto_renew_duration"] = auto_renew_duration
            __props__.__dict__["auto_use_coupon"] = auto_use_coupon
            __props__.__dict__["bandwidth_billing_type"] = bandwidth_billing_type
            __props__.__dict__["basic_accelerator_name"] = basic_accelerator_name
            __props__.__dict__["description"] = description
            __props__.__dict__["duration"] = duration
            __props__.__dict__["pricing_cycle"] = pricing_cycle
            __props__.__dict__["status"] = None
        super(BasicAccelerator, __self__).__init__(
            'alicloud:ga/basicAccelerator:BasicAccelerator',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_pay: Optional[pulumi.Input[bool]] = None,
            auto_renew: Optional[pulumi.Input[bool]] = None,
            auto_renew_duration: Optional[pulumi.Input[int]] = None,
            auto_use_coupon: Optional[pulumi.Input[str]] = None,
            bandwidth_billing_type: Optional[pulumi.Input[str]] = None,
            basic_accelerator_name: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            duration: Optional[pulumi.Input[int]] = None,
            pricing_cycle: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'BasicAccelerator':
        """
        Get an existing BasicAccelerator resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_pay: Specifies whether to enable automatic payment. Default value: `false`. Valid values:
        :param pulumi.Input[bool] auto_renew: Specifies whether to enable auto-renewal for the GA Basic Accelerator instance. Default value: `false`. Valid values:
        :param pulumi.Input[int] auto_renew_duration: The auto-renewal period. Unit: months. Valid values: `1` to `12`. Default value: `1`. **NOTE:** This parameter is required only if `auto_renew` is set to `true`.
        :param pulumi.Input[str] auto_use_coupon: Specifies whether to automatically pay bills by using coupons. Default value: `false`. **NOTE:** This parameter is required only if `auto_pay` is set to `true`.
        :param pulumi.Input[str] bandwidth_billing_type: The bandwidth billing method. Valid values: `BandwidthPackage`, `CDT`, `CDT95`.
        :param pulumi.Input[str] basic_accelerator_name: The name of the Global Accelerator Basic Accelerator instance.
        :param pulumi.Input[str] description: The description of the Global Accelerator Basic Accelerator instance.
        :param pulumi.Input[int] duration: The subscription duration. Default value: `1`.
               * If the `pricing_cycle` parameter is set to `Month`, the valid values for the `duration` parameter are `1` to `9`.
               * If the `pricing_cycle` parameter is set to `Year`, the valid values for the `duration` parameter are `1` to `3`.
        :param pulumi.Input[str] pricing_cycle: The billing cycle. Default value: `Month`. Valid values: `Month`, `Year`.
        :param pulumi.Input[str] status: The status of the Basic Accelerator instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BasicAcceleratorState.__new__(_BasicAcceleratorState)

        __props__.__dict__["auto_pay"] = auto_pay
        __props__.__dict__["auto_renew"] = auto_renew
        __props__.__dict__["auto_renew_duration"] = auto_renew_duration
        __props__.__dict__["auto_use_coupon"] = auto_use_coupon
        __props__.__dict__["bandwidth_billing_type"] = bandwidth_billing_type
        __props__.__dict__["basic_accelerator_name"] = basic_accelerator_name
        __props__.__dict__["description"] = description
        __props__.__dict__["duration"] = duration
        __props__.__dict__["pricing_cycle"] = pricing_cycle
        __props__.__dict__["status"] = status
        return BasicAccelerator(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoPay")
    def auto_pay(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to enable automatic payment. Default value: `false`. Valid values:
        """
        return pulumi.get(self, "auto_pay")

    @property
    @pulumi.getter(name="autoRenew")
    def auto_renew(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to enable auto-renewal for the GA Basic Accelerator instance. Default value: `false`. Valid values:
        """
        return pulumi.get(self, "auto_renew")

    @property
    @pulumi.getter(name="autoRenewDuration")
    def auto_renew_duration(self) -> pulumi.Output[Optional[int]]:
        """
        The auto-renewal period. Unit: months. Valid values: `1` to `12`. Default value: `1`. **NOTE:** This parameter is required only if `auto_renew` is set to `true`.
        """
        return pulumi.get(self, "auto_renew_duration")

    @property
    @pulumi.getter(name="autoUseCoupon")
    def auto_use_coupon(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies whether to automatically pay bills by using coupons. Default value: `false`. **NOTE:** This parameter is required only if `auto_pay` is set to `true`.
        """
        return pulumi.get(self, "auto_use_coupon")

    @property
    @pulumi.getter(name="bandwidthBillingType")
    def bandwidth_billing_type(self) -> pulumi.Output[Optional[str]]:
        """
        The bandwidth billing method. Valid values: `BandwidthPackage`, `CDT`, `CDT95`.
        """
        return pulumi.get(self, "bandwidth_billing_type")

    @property
    @pulumi.getter(name="basicAcceleratorName")
    def basic_accelerator_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the Global Accelerator Basic Accelerator instance.
        """
        return pulumi.get(self, "basic_accelerator_name")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the Global Accelerator Basic Accelerator instance.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def duration(self) -> pulumi.Output[Optional[int]]:
        """
        The subscription duration. Default value: `1`.
        * If the `pricing_cycle` parameter is set to `Month`, the valid values for the `duration` parameter are `1` to `9`.
        * If the `pricing_cycle` parameter is set to `Year`, the valid values for the `duration` parameter are `1` to `3`.
        """
        return pulumi.get(self, "duration")

    @property
    @pulumi.getter(name="pricingCycle")
    def pricing_cycle(self) -> pulumi.Output[Optional[str]]:
        """
        The billing cycle. Default value: `Month`. Valid values: `Month`, `Year`.
        """
        return pulumi.get(self, "pricing_cycle")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the Basic Accelerator instance.
        """
        return pulumi.get(self, "status")
