# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InstanceArgs', 'Instance']

@pulumi.input_type
class InstanceArgs:
    def __init__(__self__, *,
                 dns_security: pulumi.Input[str],
                 domain_numbers: pulumi.Input[str],
                 version_code: pulumi.Input[str],
                 payment_type: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 renew_period: Optional[pulumi.Input[int]] = None,
                 renewal_status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Instance resource.
        :param pulumi.Input[str] dns_security: DNS security level. Valid values: `no`, `basic`, `advanced`.
        :param pulumi.Input[str] domain_numbers: Number of domain names bound.
        :param pulumi.Input[str] version_code: Paid package version. Valid values: `version_personal`, `version_enterprise_basic`, `version_enterprise_advanced`.
        :param pulumi.Input[int] period: Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
        :param pulumi.Input[int] renew_period: Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
        :param pulumi.Input[str] renewal_status: Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
        """
        InstanceArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            dns_security=dns_security,
            domain_numbers=domain_numbers,
            version_code=version_code,
            payment_type=payment_type,
            period=period,
            renew_period=renew_period,
            renewal_status=renewal_status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             dns_security: Optional[pulumi.Input[str]] = None,
             domain_numbers: Optional[pulumi.Input[str]] = None,
             version_code: Optional[pulumi.Input[str]] = None,
             payment_type: Optional[pulumi.Input[str]] = None,
             period: Optional[pulumi.Input[int]] = None,
             renew_period: Optional[pulumi.Input[int]] = None,
             renewal_status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if dns_security is None and 'dnsSecurity' in kwargs:
            dns_security = kwargs['dnsSecurity']
        if dns_security is None:
            raise TypeError("Missing 'dns_security' argument")
        if domain_numbers is None and 'domainNumbers' in kwargs:
            domain_numbers = kwargs['domainNumbers']
        if domain_numbers is None:
            raise TypeError("Missing 'domain_numbers' argument")
        if version_code is None and 'versionCode' in kwargs:
            version_code = kwargs['versionCode']
        if version_code is None:
            raise TypeError("Missing 'version_code' argument")
        if payment_type is None and 'paymentType' in kwargs:
            payment_type = kwargs['paymentType']
        if renew_period is None and 'renewPeriod' in kwargs:
            renew_period = kwargs['renewPeriod']
        if renewal_status is None and 'renewalStatus' in kwargs:
            renewal_status = kwargs['renewalStatus']

        _setter("dns_security", dns_security)
        _setter("domain_numbers", domain_numbers)
        _setter("version_code", version_code)
        if payment_type is not None:
            _setter("payment_type", payment_type)
        if period is not None:
            _setter("period", period)
        if renew_period is not None:
            _setter("renew_period", renew_period)
        if renewal_status is not None:
            _setter("renewal_status", renewal_status)

    @property
    @pulumi.getter(name="dnsSecurity")
    def dns_security(self) -> pulumi.Input[str]:
        """
        DNS security level. Valid values: `no`, `basic`, `advanced`.
        """
        return pulumi.get(self, "dns_security")

    @dns_security.setter
    def dns_security(self, value: pulumi.Input[str]):
        pulumi.set(self, "dns_security", value)

    @property
    @pulumi.getter(name="domainNumbers")
    def domain_numbers(self) -> pulumi.Input[str]:
        """
        Number of domain names bound.
        """
        return pulumi.get(self, "domain_numbers")

    @domain_numbers.setter
    def domain_numbers(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_numbers", value)

    @property
    @pulumi.getter(name="versionCode")
    def version_code(self) -> pulumi.Input[str]:
        """
        Paid package version. Valid values: `version_personal`, `version_enterprise_basic`, `version_enterprise_advanced`.
        """
        return pulumi.get(self, "version_code")

    @version_code.setter
    def version_code(self, value: pulumi.Input[str]):
        pulumi.set(self, "version_code", value)

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "payment_type")

    @payment_type.setter
    def payment_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "payment_type", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[int]]:
        """
        Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="renewPeriod")
    def renew_period(self) -> Optional[pulumi.Input[int]]:
        """
        Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
        """
        return pulumi.get(self, "renew_period")

    @renew_period.setter
    def renew_period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "renew_period", value)

    @property
    @pulumi.getter(name="renewalStatus")
    def renewal_status(self) -> Optional[pulumi.Input[str]]:
        """
        Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
        """
        return pulumi.get(self, "renewal_status")

    @renewal_status.setter
    def renewal_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "renewal_status", value)


@pulumi.input_type
class _InstanceState:
    def __init__(__self__, *,
                 dns_security: Optional[pulumi.Input[str]] = None,
                 domain_numbers: Optional[pulumi.Input[str]] = None,
                 payment_type: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 renew_period: Optional[pulumi.Input[int]] = None,
                 renewal_status: Optional[pulumi.Input[str]] = None,
                 version_code: Optional[pulumi.Input[str]] = None,
                 version_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Instance resources.
        :param pulumi.Input[str] dns_security: DNS security level. Valid values: `no`, `basic`, `advanced`.
        :param pulumi.Input[str] domain_numbers: Number of domain names bound.
        :param pulumi.Input[int] period: Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
        :param pulumi.Input[int] renew_period: Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
        :param pulumi.Input[str] renewal_status: Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
        :param pulumi.Input[str] version_code: Paid package version. Valid values: `version_personal`, `version_enterprise_basic`, `version_enterprise_advanced`.
        :param pulumi.Input[str] version_name: Paid package version name.
        """
        _InstanceState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            dns_security=dns_security,
            domain_numbers=domain_numbers,
            payment_type=payment_type,
            period=period,
            renew_period=renew_period,
            renewal_status=renewal_status,
            version_code=version_code,
            version_name=version_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             dns_security: Optional[pulumi.Input[str]] = None,
             domain_numbers: Optional[pulumi.Input[str]] = None,
             payment_type: Optional[pulumi.Input[str]] = None,
             period: Optional[pulumi.Input[int]] = None,
             renew_period: Optional[pulumi.Input[int]] = None,
             renewal_status: Optional[pulumi.Input[str]] = None,
             version_code: Optional[pulumi.Input[str]] = None,
             version_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if dns_security is None and 'dnsSecurity' in kwargs:
            dns_security = kwargs['dnsSecurity']
        if domain_numbers is None and 'domainNumbers' in kwargs:
            domain_numbers = kwargs['domainNumbers']
        if payment_type is None and 'paymentType' in kwargs:
            payment_type = kwargs['paymentType']
        if renew_period is None and 'renewPeriod' in kwargs:
            renew_period = kwargs['renewPeriod']
        if renewal_status is None and 'renewalStatus' in kwargs:
            renewal_status = kwargs['renewalStatus']
        if version_code is None and 'versionCode' in kwargs:
            version_code = kwargs['versionCode']
        if version_name is None and 'versionName' in kwargs:
            version_name = kwargs['versionName']

        if dns_security is not None:
            _setter("dns_security", dns_security)
        if domain_numbers is not None:
            _setter("domain_numbers", domain_numbers)
        if payment_type is not None:
            _setter("payment_type", payment_type)
        if period is not None:
            _setter("period", period)
        if renew_period is not None:
            _setter("renew_period", renew_period)
        if renewal_status is not None:
            _setter("renewal_status", renewal_status)
        if version_code is not None:
            _setter("version_code", version_code)
        if version_name is not None:
            _setter("version_name", version_name)

    @property
    @pulumi.getter(name="dnsSecurity")
    def dns_security(self) -> Optional[pulumi.Input[str]]:
        """
        DNS security level. Valid values: `no`, `basic`, `advanced`.
        """
        return pulumi.get(self, "dns_security")

    @dns_security.setter
    def dns_security(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dns_security", value)

    @property
    @pulumi.getter(name="domainNumbers")
    def domain_numbers(self) -> Optional[pulumi.Input[str]]:
        """
        Number of domain names bound.
        """
        return pulumi.get(self, "domain_numbers")

    @domain_numbers.setter
    def domain_numbers(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_numbers", value)

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "payment_type")

    @payment_type.setter
    def payment_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "payment_type", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[int]]:
        """
        Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="renewPeriod")
    def renew_period(self) -> Optional[pulumi.Input[int]]:
        """
        Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
        """
        return pulumi.get(self, "renew_period")

    @renew_period.setter
    def renew_period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "renew_period", value)

    @property
    @pulumi.getter(name="renewalStatus")
    def renewal_status(self) -> Optional[pulumi.Input[str]]:
        """
        Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
        """
        return pulumi.get(self, "renewal_status")

    @renewal_status.setter
    def renewal_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "renewal_status", value)

    @property
    @pulumi.getter(name="versionCode")
    def version_code(self) -> Optional[pulumi.Input[str]]:
        """
        Paid package version. Valid values: `version_personal`, `version_enterprise_basic`, `version_enterprise_advanced`.
        """
        return pulumi.get(self, "version_code")

    @version_code.setter
    def version_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version_code", value)

    @property
    @pulumi.getter(name="versionName")
    def version_name(self) -> Optional[pulumi.Input[str]]:
        """
        Paid package version name.
        """
        return pulumi.get(self, "version_name")

    @version_name.setter
    def version_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version_name", value)


class Instance(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dns_security: Optional[pulumi.Input[str]] = None,
                 domain_numbers: Optional[pulumi.Input[str]] = None,
                 payment_type: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 renew_period: Optional[pulumi.Input[int]] = None,
                 renewal_status: Optional[pulumi.Input[str]] = None,
                 version_code: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create an DNS Instance resource.

        > **DEPRECATED:** This resource has been renamed to dns.AlidnsInstance from version 1.95.0.

        > **NOTE:** Available in v1.80.0+.

        ## Import

        DNS instance be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dns/instance:Instance example dns-cn-v0h1ldjhfff
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dns_security: DNS security level. Valid values: `no`, `basic`, `advanced`.
        :param pulumi.Input[str] domain_numbers: Number of domain names bound.
        :param pulumi.Input[int] period: Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
        :param pulumi.Input[int] renew_period: Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
        :param pulumi.Input[str] renewal_status: Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
        :param pulumi.Input[str] version_code: Paid package version. Valid values: `version_personal`, `version_enterprise_basic`, `version_enterprise_advanced`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create an DNS Instance resource.

        > **DEPRECATED:** This resource has been renamed to dns.AlidnsInstance from version 1.95.0.

        > **NOTE:** Available in v1.80.0+.

        ## Import

        DNS instance be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dns/instance:Instance example dns-cn-v0h1ldjhfff
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
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            InstanceArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dns_security: Optional[pulumi.Input[str]] = None,
                 domain_numbers: Optional[pulumi.Input[str]] = None,
                 payment_type: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 renew_period: Optional[pulumi.Input[int]] = None,
                 renewal_status: Optional[pulumi.Input[str]] = None,
                 version_code: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceArgs.__new__(InstanceArgs)

            if dns_security is None and not opts.urn:
                raise TypeError("Missing required property 'dns_security'")
            __props__.__dict__["dns_security"] = dns_security
            if domain_numbers is None and not opts.urn:
                raise TypeError("Missing required property 'domain_numbers'")
            __props__.__dict__["domain_numbers"] = domain_numbers
            __props__.__dict__["payment_type"] = payment_type
            __props__.__dict__["period"] = period
            __props__.__dict__["renew_period"] = renew_period
            __props__.__dict__["renewal_status"] = renewal_status
            if version_code is None and not opts.urn:
                raise TypeError("Missing required property 'version_code'")
            __props__.__dict__["version_code"] = version_code
            __props__.__dict__["version_name"] = None
        super(Instance, __self__).__init__(
            'alicloud:dns/instance:Instance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dns_security: Optional[pulumi.Input[str]] = None,
            domain_numbers: Optional[pulumi.Input[str]] = None,
            payment_type: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[int]] = None,
            renew_period: Optional[pulumi.Input[int]] = None,
            renewal_status: Optional[pulumi.Input[str]] = None,
            version_code: Optional[pulumi.Input[str]] = None,
            version_name: Optional[pulumi.Input[str]] = None) -> 'Instance':
        """
        Get an existing Instance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dns_security: DNS security level. Valid values: `no`, `basic`, `advanced`.
        :param pulumi.Input[str] domain_numbers: Number of domain names bound.
        :param pulumi.Input[int] period: Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
        :param pulumi.Input[int] renew_period: Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
        :param pulumi.Input[str] renewal_status: Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
        :param pulumi.Input[str] version_code: Paid package version. Valid values: `version_personal`, `version_enterprise_basic`, `version_enterprise_advanced`.
        :param pulumi.Input[str] version_name: Paid package version name.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceState.__new__(_InstanceState)

        __props__.__dict__["dns_security"] = dns_security
        __props__.__dict__["domain_numbers"] = domain_numbers
        __props__.__dict__["payment_type"] = payment_type
        __props__.__dict__["period"] = period
        __props__.__dict__["renew_period"] = renew_period
        __props__.__dict__["renewal_status"] = renewal_status
        __props__.__dict__["version_code"] = version_code
        __props__.__dict__["version_name"] = version_name
        return Instance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dnsSecurity")
    def dns_security(self) -> pulumi.Output[str]:
        """
        DNS security level. Valid values: `no`, `basic`, `advanced`.
        """
        return pulumi.get(self, "dns_security")

    @property
    @pulumi.getter(name="domainNumbers")
    def domain_numbers(self) -> pulumi.Output[str]:
        """
        Number of domain names bound.
        """
        return pulumi.get(self, "domain_numbers")

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "payment_type")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[Optional[int]]:
        """
        Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter(name="renewPeriod")
    def renew_period(self) -> pulumi.Output[Optional[int]]:
        """
        Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
        """
        return pulumi.get(self, "renew_period")

    @property
    @pulumi.getter(name="renewalStatus")
    def renewal_status(self) -> pulumi.Output[str]:
        """
        Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
        """
        return pulumi.get(self, "renewal_status")

    @property
    @pulumi.getter(name="versionCode")
    def version_code(self) -> pulumi.Output[str]:
        """
        Paid package version. Valid values: `version_personal`, `version_enterprise_basic`, `version_enterprise_advanced`.
        """
        return pulumi.get(self, "version_code")

    @property
    @pulumi.getter(name="versionName")
    def version_name(self) -> pulumi.Output[str]:
        """
        Paid package version name.
        """
        return pulumi.get(self, "version_name")

