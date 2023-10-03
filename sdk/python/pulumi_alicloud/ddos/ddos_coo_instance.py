# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DdosCooInstanceArgs', 'DdosCooInstance']

@pulumi.input_type
class DdosCooInstanceArgs:
    def __init__(__self__, *,
                 bandwidth: pulumi.Input[str],
                 base_bandwidth: pulumi.Input[str],
                 domain_count: pulumi.Input[str],
                 port_count: pulumi.Input[str],
                 service_bandwidth: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 product_type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DdosCooInstance resource.
        :param pulumi.Input[str] bandwidth: Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        :param pulumi.Input[str] base_bandwidth: Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        :param pulumi.Input[str] domain_count: Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        :param pulumi.Input[str] port_count: Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        :param pulumi.Input[str] service_bandwidth: Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
        :param pulumi.Input[str] name: Name of the instance. This name can have a string of 1 to 63 characters.
        :param pulumi.Input[int] period: The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
        :param pulumi.Input[str] product_type: The product type for purchasing DDOSCOO instances used to differ different account type. Valid values:
               - ddoscoo: Only supports domestic account.
               - ddoscoo_intl: Only supports to international account.
               Default to ddoscoo.
        """
        DdosCooInstanceArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            bandwidth=bandwidth,
            base_bandwidth=base_bandwidth,
            domain_count=domain_count,
            port_count=port_count,
            service_bandwidth=service_bandwidth,
            name=name,
            period=period,
            product_type=product_type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             bandwidth: pulumi.Input[str],
             base_bandwidth: pulumi.Input[str],
             domain_count: pulumi.Input[str],
             port_count: pulumi.Input[str],
             service_bandwidth: pulumi.Input[str],
             name: Optional[pulumi.Input[str]] = None,
             period: Optional[pulumi.Input[int]] = None,
             product_type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("bandwidth", bandwidth)
        _setter("base_bandwidth", base_bandwidth)
        _setter("domain_count", domain_count)
        _setter("port_count", port_count)
        _setter("service_bandwidth", service_bandwidth)
        if name is not None:
            _setter("name", name)
        if period is not None:
            _setter("period", period)
        if product_type is not None:
            _setter("product_type", product_type)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Input[str]:
        """
        Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        """
        return pulumi.get(self, "bandwidth")

    @bandwidth.setter
    def bandwidth(self, value: pulumi.Input[str]):
        pulumi.set(self, "bandwidth", value)

    @property
    @pulumi.getter(name="baseBandwidth")
    def base_bandwidth(self) -> pulumi.Input[str]:
        """
        Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        """
        return pulumi.get(self, "base_bandwidth")

    @base_bandwidth.setter
    def base_bandwidth(self, value: pulumi.Input[str]):
        pulumi.set(self, "base_bandwidth", value)

    @property
    @pulumi.getter(name="domainCount")
    def domain_count(self) -> pulumi.Input[str]:
        """
        Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        """
        return pulumi.get(self, "domain_count")

    @domain_count.setter
    def domain_count(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_count", value)

    @property
    @pulumi.getter(name="portCount")
    def port_count(self) -> pulumi.Input[str]:
        """
        Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        """
        return pulumi.get(self, "port_count")

    @port_count.setter
    def port_count(self, value: pulumi.Input[str]):
        pulumi.set(self, "port_count", value)

    @property
    @pulumi.getter(name="serviceBandwidth")
    def service_bandwidth(self) -> pulumi.Input[str]:
        """
        Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
        """
        return pulumi.get(self, "service_bandwidth")

    @service_bandwidth.setter
    def service_bandwidth(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_bandwidth", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the instance. This name can have a string of 1 to 63 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[int]]:
        """
        The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="productType")
    def product_type(self) -> Optional[pulumi.Input[str]]:
        """
        The product type for purchasing DDOSCOO instances used to differ different account type. Valid values:
        - ddoscoo: Only supports domestic account.
        - ddoscoo_intl: Only supports to international account.
        Default to ddoscoo.
        """
        return pulumi.get(self, "product_type")

    @product_type.setter
    def product_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_type", value)


@pulumi.input_type
class _DdosCooInstanceState:
    def __init__(__self__, *,
                 bandwidth: Optional[pulumi.Input[str]] = None,
                 base_bandwidth: Optional[pulumi.Input[str]] = None,
                 domain_count: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 port_count: Optional[pulumi.Input[str]] = None,
                 product_type: Optional[pulumi.Input[str]] = None,
                 service_bandwidth: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DdosCooInstance resources.
        :param pulumi.Input[str] bandwidth: Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        :param pulumi.Input[str] base_bandwidth: Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        :param pulumi.Input[str] domain_count: Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        :param pulumi.Input[str] name: Name of the instance. This name can have a string of 1 to 63 characters.
        :param pulumi.Input[int] period: The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
        :param pulumi.Input[str] port_count: Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        :param pulumi.Input[str] product_type: The product type for purchasing DDOSCOO instances used to differ different account type. Valid values:
               - ddoscoo: Only supports domestic account.
               - ddoscoo_intl: Only supports to international account.
               Default to ddoscoo.
        :param pulumi.Input[str] service_bandwidth: Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
        """
        _DdosCooInstanceState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            bandwidth=bandwidth,
            base_bandwidth=base_bandwidth,
            domain_count=domain_count,
            name=name,
            period=period,
            port_count=port_count,
            product_type=product_type,
            service_bandwidth=service_bandwidth,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             bandwidth: Optional[pulumi.Input[str]] = None,
             base_bandwidth: Optional[pulumi.Input[str]] = None,
             domain_count: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             period: Optional[pulumi.Input[int]] = None,
             port_count: Optional[pulumi.Input[str]] = None,
             product_type: Optional[pulumi.Input[str]] = None,
             service_bandwidth: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if bandwidth is not None:
            _setter("bandwidth", bandwidth)
        if base_bandwidth is not None:
            _setter("base_bandwidth", base_bandwidth)
        if domain_count is not None:
            _setter("domain_count", domain_count)
        if name is not None:
            _setter("name", name)
        if period is not None:
            _setter("period", period)
        if port_count is not None:
            _setter("port_count", port_count)
        if product_type is not None:
            _setter("product_type", product_type)
        if service_bandwidth is not None:
            _setter("service_bandwidth", service_bandwidth)

    @property
    @pulumi.getter
    def bandwidth(self) -> Optional[pulumi.Input[str]]:
        """
        Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        """
        return pulumi.get(self, "bandwidth")

    @bandwidth.setter
    def bandwidth(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bandwidth", value)

    @property
    @pulumi.getter(name="baseBandwidth")
    def base_bandwidth(self) -> Optional[pulumi.Input[str]]:
        """
        Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        """
        return pulumi.get(self, "base_bandwidth")

    @base_bandwidth.setter
    def base_bandwidth(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "base_bandwidth", value)

    @property
    @pulumi.getter(name="domainCount")
    def domain_count(self) -> Optional[pulumi.Input[str]]:
        """
        Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        """
        return pulumi.get(self, "domain_count")

    @domain_count.setter
    def domain_count(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_count", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the instance. This name can have a string of 1 to 63 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[int]]:
        """
        The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="portCount")
    def port_count(self) -> Optional[pulumi.Input[str]]:
        """
        Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        """
        return pulumi.get(self, "port_count")

    @port_count.setter
    def port_count(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "port_count", value)

    @property
    @pulumi.getter(name="productType")
    def product_type(self) -> Optional[pulumi.Input[str]]:
        """
        The product type for purchasing DDOSCOO instances used to differ different account type. Valid values:
        - ddoscoo: Only supports domestic account.
        - ddoscoo_intl: Only supports to international account.
        Default to ddoscoo.
        """
        return pulumi.get(self, "product_type")

    @product_type.setter
    def product_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_type", value)

    @property
    @pulumi.getter(name="serviceBandwidth")
    def service_bandwidth(self) -> Optional[pulumi.Input[str]]:
        """
        Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
        """
        return pulumi.get(self, "service_bandwidth")

    @service_bandwidth.setter
    def service_bandwidth(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_bandwidth", value)


class DdosCooInstance(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[str]] = None,
                 base_bandwidth: Optional[pulumi.Input[str]] = None,
                 domain_count: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 port_count: Optional[pulumi.Input[str]] = None,
                 product_type: Optional[pulumi.Input[str]] = None,
                 service_bandwidth: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        BGP-Line Anti-DDoS instance resource. "Ddoscoo" is the short term of this product. See [What is Anti-DDoS Pro](https://www.alibabacloud.com/help/en/ddos-protection/latest/api-ddoscoo-2020-01-01-describeinstances).

        > **NOTE:** The product region only support cn-hangzhou.

        > **NOTE:** The endpoint of bssopenapi used only support "business.aliyuncs.com" at present.

        > **NOTE:** Available since v1.37.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = alicloud.ddos.DdosCooInstance("default",
            bandwidth="30",
            base_bandwidth="30",
            service_bandwidth="100",
            port_count="50",
            domain_count="50",
            period=1,
            product_type="ddoscoo")
        ```

        ## Import

        Ddoscoo instance can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ddos/ddosCooInstance:DdosCooInstance example ddoscoo-cn-123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bandwidth: Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        :param pulumi.Input[str] base_bandwidth: Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        :param pulumi.Input[str] domain_count: Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        :param pulumi.Input[str] name: Name of the instance. This name can have a string of 1 to 63 characters.
        :param pulumi.Input[int] period: The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
        :param pulumi.Input[str] port_count: Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        :param pulumi.Input[str] product_type: The product type for purchasing DDOSCOO instances used to differ different account type. Valid values:
               - ddoscoo: Only supports domestic account.
               - ddoscoo_intl: Only supports to international account.
               Default to ddoscoo.
        :param pulumi.Input[str] service_bandwidth: Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DdosCooInstanceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        BGP-Line Anti-DDoS instance resource. "Ddoscoo" is the short term of this product. See [What is Anti-DDoS Pro](https://www.alibabacloud.com/help/en/ddos-protection/latest/api-ddoscoo-2020-01-01-describeinstances).

        > **NOTE:** The product region only support cn-hangzhou.

        > **NOTE:** The endpoint of bssopenapi used only support "business.aliyuncs.com" at present.

        > **NOTE:** Available since v1.37.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = alicloud.ddos.DdosCooInstance("default",
            bandwidth="30",
            base_bandwidth="30",
            service_bandwidth="100",
            port_count="50",
            domain_count="50",
            period=1,
            product_type="ddoscoo")
        ```

        ## Import

        Ddoscoo instance can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ddos/ddosCooInstance:DdosCooInstance example ddoscoo-cn-123456
        ```

        :param str resource_name: The name of the resource.
        :param DdosCooInstanceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DdosCooInstanceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DdosCooInstanceArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[str]] = None,
                 base_bandwidth: Optional[pulumi.Input[str]] = None,
                 domain_count: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 port_count: Optional[pulumi.Input[str]] = None,
                 product_type: Optional[pulumi.Input[str]] = None,
                 service_bandwidth: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DdosCooInstanceArgs.__new__(DdosCooInstanceArgs)

            if bandwidth is None and not opts.urn:
                raise TypeError("Missing required property 'bandwidth'")
            __props__.__dict__["bandwidth"] = bandwidth
            if base_bandwidth is None and not opts.urn:
                raise TypeError("Missing required property 'base_bandwidth'")
            __props__.__dict__["base_bandwidth"] = base_bandwidth
            if domain_count is None and not opts.urn:
                raise TypeError("Missing required property 'domain_count'")
            __props__.__dict__["domain_count"] = domain_count
            __props__.__dict__["name"] = name
            __props__.__dict__["period"] = period
            if port_count is None and not opts.urn:
                raise TypeError("Missing required property 'port_count'")
            __props__.__dict__["port_count"] = port_count
            __props__.__dict__["product_type"] = product_type
            if service_bandwidth is None and not opts.urn:
                raise TypeError("Missing required property 'service_bandwidth'")
            __props__.__dict__["service_bandwidth"] = service_bandwidth
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="alicloud:dns/ddosCooInstance:DdosCooInstance")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(DdosCooInstance, __self__).__init__(
            'alicloud:ddos/ddosCooInstance:DdosCooInstance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bandwidth: Optional[pulumi.Input[str]] = None,
            base_bandwidth: Optional[pulumi.Input[str]] = None,
            domain_count: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[int]] = None,
            port_count: Optional[pulumi.Input[str]] = None,
            product_type: Optional[pulumi.Input[str]] = None,
            service_bandwidth: Optional[pulumi.Input[str]] = None) -> 'DdosCooInstance':
        """
        Get an existing DdosCooInstance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bandwidth: Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        :param pulumi.Input[str] base_bandwidth: Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        :param pulumi.Input[str] domain_count: Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        :param pulumi.Input[str] name: Name of the instance. This name can have a string of 1 to 63 characters.
        :param pulumi.Input[int] period: The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
        :param pulumi.Input[str] port_count: Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        :param pulumi.Input[str] product_type: The product type for purchasing DDOSCOO instances used to differ different account type. Valid values:
               - ddoscoo: Only supports domestic account.
               - ddoscoo_intl: Only supports to international account.
               Default to ddoscoo.
        :param pulumi.Input[str] service_bandwidth: Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DdosCooInstanceState.__new__(_DdosCooInstanceState)

        __props__.__dict__["bandwidth"] = bandwidth
        __props__.__dict__["base_bandwidth"] = base_bandwidth
        __props__.__dict__["domain_count"] = domain_count
        __props__.__dict__["name"] = name
        __props__.__dict__["period"] = period
        __props__.__dict__["port_count"] = port_count
        __props__.__dict__["product_type"] = product_type
        __props__.__dict__["service_bandwidth"] = service_bandwidth
        return DdosCooInstance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Output[str]:
        """
        Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        """
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter(name="baseBandwidth")
    def base_bandwidth(self) -> pulumi.Output[str]:
        """
        Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        """
        return pulumi.get(self, "base_bandwidth")

    @property
    @pulumi.getter(name="domainCount")
    def domain_count(self) -> pulumi.Output[str]:
        """
        Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        """
        return pulumi.get(self, "domain_count")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the instance. This name can have a string of 1 to 63 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[Optional[int]]:
        """
        The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter(name="portCount")
    def port_count(self) -> pulumi.Output[str]:
        """
        Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        """
        return pulumi.get(self, "port_count")

    @property
    @pulumi.getter(name="productType")
    def product_type(self) -> pulumi.Output[Optional[str]]:
        """
        The product type for purchasing DDOSCOO instances used to differ different account type. Valid values:
        - ddoscoo: Only supports domestic account.
        - ddoscoo_intl: Only supports to international account.
        Default to ddoscoo.
        """
        return pulumi.get(self, "product_type")

    @property
    @pulumi.getter(name="serviceBandwidth")
    def service_bandwidth(self) -> pulumi.Output[str]:
        """
        Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
        """
        return pulumi.get(self, "service_bandwidth")

