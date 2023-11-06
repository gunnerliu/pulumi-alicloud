# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['IpSetArgs', 'IpSet']

@pulumi.input_type
class IpSetArgs:
    def __init__(__self__, *,
                 accelerate_region_id: pulumi.Input[str],
                 accelerator_id: pulumi.Input[str],
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 ip_version: Optional[pulumi.Input[str]] = None,
                 isp_type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a IpSet resource.
        :param pulumi.Input[str] accelerate_region_id: The ID of an acceleration region.
        :param pulumi.Input[str] accelerator_id: The ID of the Global Accelerator (GA) instance.
        :param pulumi.Input[int] bandwidth: The bandwidth allocated to the acceleration region.
               > **NOTE:** The minimum bandwidth of each accelerated region is 2Mbps. The total bandwidth of the acceleration region should be less than or equal to the bandwidth of the basic bandwidth package you purchased.
        :param pulumi.Input[str] ip_version: The IP protocol used by the GA instance. Valid values: `IPv4`, `IPv6`. Default value: `IPv4`.
        :param pulumi.Input[str] isp_type: The line type of the elastic IP address (EIP) in the acceleration region. Valid values: `BGP`, `BGP_PRO`.
        """
        IpSetArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            accelerate_region_id=accelerate_region_id,
            accelerator_id=accelerator_id,
            bandwidth=bandwidth,
            ip_version=ip_version,
            isp_type=isp_type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             accelerate_region_id: Optional[pulumi.Input[str]] = None,
             accelerator_id: Optional[pulumi.Input[str]] = None,
             bandwidth: Optional[pulumi.Input[int]] = None,
             ip_version: Optional[pulumi.Input[str]] = None,
             isp_type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if accelerate_region_id is None and 'accelerateRegionId' in kwargs:
            accelerate_region_id = kwargs['accelerateRegionId']
        if accelerate_region_id is None:
            raise TypeError("Missing 'accelerate_region_id' argument")
        if accelerator_id is None and 'acceleratorId' in kwargs:
            accelerator_id = kwargs['acceleratorId']
        if accelerator_id is None:
            raise TypeError("Missing 'accelerator_id' argument")
        if ip_version is None and 'ipVersion' in kwargs:
            ip_version = kwargs['ipVersion']
        if isp_type is None and 'ispType' in kwargs:
            isp_type = kwargs['ispType']

        _setter("accelerate_region_id", accelerate_region_id)
        _setter("accelerator_id", accelerator_id)
        if bandwidth is not None:
            _setter("bandwidth", bandwidth)
        if ip_version is not None:
            _setter("ip_version", ip_version)
        if isp_type is not None:
            _setter("isp_type", isp_type)

    @property
    @pulumi.getter(name="accelerateRegionId")
    def accelerate_region_id(self) -> pulumi.Input[str]:
        """
        The ID of an acceleration region.
        """
        return pulumi.get(self, "accelerate_region_id")

    @accelerate_region_id.setter
    def accelerate_region_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "accelerate_region_id", value)

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> pulumi.Input[str]:
        """
        The ID of the Global Accelerator (GA) instance.
        """
        return pulumi.get(self, "accelerator_id")

    @accelerator_id.setter
    def accelerator_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "accelerator_id", value)

    @property
    @pulumi.getter
    def bandwidth(self) -> Optional[pulumi.Input[int]]:
        """
        The bandwidth allocated to the acceleration region.
        > **NOTE:** The minimum bandwidth of each accelerated region is 2Mbps. The total bandwidth of the acceleration region should be less than or equal to the bandwidth of the basic bandwidth package you purchased.
        """
        return pulumi.get(self, "bandwidth")

    @bandwidth.setter
    def bandwidth(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "bandwidth", value)

    @property
    @pulumi.getter(name="ipVersion")
    def ip_version(self) -> Optional[pulumi.Input[str]]:
        """
        The IP protocol used by the GA instance. Valid values: `IPv4`, `IPv6`. Default value: `IPv4`.
        """
        return pulumi.get(self, "ip_version")

    @ip_version.setter
    def ip_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_version", value)

    @property
    @pulumi.getter(name="ispType")
    def isp_type(self) -> Optional[pulumi.Input[str]]:
        """
        The line type of the elastic IP address (EIP) in the acceleration region. Valid values: `BGP`, `BGP_PRO`.
        """
        return pulumi.get(self, "isp_type")

    @isp_type.setter
    def isp_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "isp_type", value)


@pulumi.input_type
class _IpSetState:
    def __init__(__self__, *,
                 accelerate_region_id: Optional[pulumi.Input[str]] = None,
                 accelerator_id: Optional[pulumi.Input[str]] = None,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 ip_address_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ip_version: Optional[pulumi.Input[str]] = None,
                 isp_type: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IpSet resources.
        :param pulumi.Input[str] accelerate_region_id: The ID of an acceleration region.
        :param pulumi.Input[str] accelerator_id: The ID of the Global Accelerator (GA) instance.
        :param pulumi.Input[int] bandwidth: The bandwidth allocated to the acceleration region.
               > **NOTE:** The minimum bandwidth of each accelerated region is 2Mbps. The total bandwidth of the acceleration region should be less than or equal to the bandwidth of the basic bandwidth package you purchased.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ip_address_lists: The list of accelerated IP addresses in the acceleration region.
        :param pulumi.Input[str] ip_version: The IP protocol used by the GA instance. Valid values: `IPv4`, `IPv6`. Default value: `IPv4`.
        :param pulumi.Input[str] isp_type: The line type of the elastic IP address (EIP) in the acceleration region. Valid values: `BGP`, `BGP_PRO`.
        :param pulumi.Input[str] status: The status of the acceleration region.
        """
        _IpSetState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            accelerate_region_id=accelerate_region_id,
            accelerator_id=accelerator_id,
            bandwidth=bandwidth,
            ip_address_lists=ip_address_lists,
            ip_version=ip_version,
            isp_type=isp_type,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             accelerate_region_id: Optional[pulumi.Input[str]] = None,
             accelerator_id: Optional[pulumi.Input[str]] = None,
             bandwidth: Optional[pulumi.Input[int]] = None,
             ip_address_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             ip_version: Optional[pulumi.Input[str]] = None,
             isp_type: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if accelerate_region_id is None and 'accelerateRegionId' in kwargs:
            accelerate_region_id = kwargs['accelerateRegionId']
        if accelerator_id is None and 'acceleratorId' in kwargs:
            accelerator_id = kwargs['acceleratorId']
        if ip_address_lists is None and 'ipAddressLists' in kwargs:
            ip_address_lists = kwargs['ipAddressLists']
        if ip_version is None and 'ipVersion' in kwargs:
            ip_version = kwargs['ipVersion']
        if isp_type is None and 'ispType' in kwargs:
            isp_type = kwargs['ispType']

        if accelerate_region_id is not None:
            _setter("accelerate_region_id", accelerate_region_id)
        if accelerator_id is not None:
            _setter("accelerator_id", accelerator_id)
        if bandwidth is not None:
            _setter("bandwidth", bandwidth)
        if ip_address_lists is not None:
            _setter("ip_address_lists", ip_address_lists)
        if ip_version is not None:
            _setter("ip_version", ip_version)
        if isp_type is not None:
            _setter("isp_type", isp_type)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="accelerateRegionId")
    def accelerate_region_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of an acceleration region.
        """
        return pulumi.get(self, "accelerate_region_id")

    @accelerate_region_id.setter
    def accelerate_region_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accelerate_region_id", value)

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Global Accelerator (GA) instance.
        """
        return pulumi.get(self, "accelerator_id")

    @accelerator_id.setter
    def accelerator_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accelerator_id", value)

    @property
    @pulumi.getter
    def bandwidth(self) -> Optional[pulumi.Input[int]]:
        """
        The bandwidth allocated to the acceleration region.
        > **NOTE:** The minimum bandwidth of each accelerated region is 2Mbps. The total bandwidth of the acceleration region should be less than or equal to the bandwidth of the basic bandwidth package you purchased.
        """
        return pulumi.get(self, "bandwidth")

    @bandwidth.setter
    def bandwidth(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "bandwidth", value)

    @property
    @pulumi.getter(name="ipAddressLists")
    def ip_address_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of accelerated IP addresses in the acceleration region.
        """
        return pulumi.get(self, "ip_address_lists")

    @ip_address_lists.setter
    def ip_address_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ip_address_lists", value)

    @property
    @pulumi.getter(name="ipVersion")
    def ip_version(self) -> Optional[pulumi.Input[str]]:
        """
        The IP protocol used by the GA instance. Valid values: `IPv4`, `IPv6`. Default value: `IPv4`.
        """
        return pulumi.get(self, "ip_version")

    @ip_version.setter
    def ip_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_version", value)

    @property
    @pulumi.getter(name="ispType")
    def isp_type(self) -> Optional[pulumi.Input[str]]:
        """
        The line type of the elastic IP address (EIP) in the acceleration region. Valid values: `BGP`, `BGP_PRO`.
        """
        return pulumi.get(self, "isp_type")

    @isp_type.setter
    def isp_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "isp_type", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the acceleration region.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class IpSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accelerate_region_id: Optional[pulumi.Input[str]] = None,
                 accelerator_id: Optional[pulumi.Input[str]] = None,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 ip_version: Optional[pulumi.Input[str]] = None,
                 isp_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Global Accelerator (GA) Ip Set resource.

        For information about Global Accelerator (GA) Ip Set and how to use it, see [What is Ip Set](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createipsets).

        > **NOTE:** Available since v1.113.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        region = config.get("region")
        if region is None:
            region = "cn-hangzhou"
        default_accelerator = alicloud.ga.Accelerator("defaultAccelerator",
            duration=1,
            auto_use_coupon=True,
            spec="1")
        default_bandwidth_package = alicloud.ga.BandwidthPackage("defaultBandwidthPackage",
            bandwidth=100,
            type="Basic",
            bandwidth_type="Basic",
            payment_type="PayAsYouGo",
            billing_type="PayBy95",
            ratio=30)
        default_bandwidth_package_attachment = alicloud.ga.BandwidthPackageAttachment("defaultBandwidthPackageAttachment",
            accelerator_id=default_accelerator.id,
            bandwidth_package_id=default_bandwidth_package.id)
        example = alicloud.ga.IpSet("example",
            accelerate_region_id=region,
            bandwidth=5,
            accelerator_id=default_bandwidth_package_attachment.accelerator_id)
        ```

        ## Import

        Ga Ip Set can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ga/ipSet:IpSet example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accelerate_region_id: The ID of an acceleration region.
        :param pulumi.Input[str] accelerator_id: The ID of the Global Accelerator (GA) instance.
        :param pulumi.Input[int] bandwidth: The bandwidth allocated to the acceleration region.
               > **NOTE:** The minimum bandwidth of each accelerated region is 2Mbps. The total bandwidth of the acceleration region should be less than or equal to the bandwidth of the basic bandwidth package you purchased.
        :param pulumi.Input[str] ip_version: The IP protocol used by the GA instance. Valid values: `IPv4`, `IPv6`. Default value: `IPv4`.
        :param pulumi.Input[str] isp_type: The line type of the elastic IP address (EIP) in the acceleration region. Valid values: `BGP`, `BGP_PRO`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IpSetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Global Accelerator (GA) Ip Set resource.

        For information about Global Accelerator (GA) Ip Set and how to use it, see [What is Ip Set](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createipsets).

        > **NOTE:** Available since v1.113.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        region = config.get("region")
        if region is None:
            region = "cn-hangzhou"
        default_accelerator = alicloud.ga.Accelerator("defaultAccelerator",
            duration=1,
            auto_use_coupon=True,
            spec="1")
        default_bandwidth_package = alicloud.ga.BandwidthPackage("defaultBandwidthPackage",
            bandwidth=100,
            type="Basic",
            bandwidth_type="Basic",
            payment_type="PayAsYouGo",
            billing_type="PayBy95",
            ratio=30)
        default_bandwidth_package_attachment = alicloud.ga.BandwidthPackageAttachment("defaultBandwidthPackageAttachment",
            accelerator_id=default_accelerator.id,
            bandwidth_package_id=default_bandwidth_package.id)
        example = alicloud.ga.IpSet("example",
            accelerate_region_id=region,
            bandwidth=5,
            accelerator_id=default_bandwidth_package_attachment.accelerator_id)
        ```

        ## Import

        Ga Ip Set can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ga/ipSet:IpSet example <id>
        ```

        :param str resource_name: The name of the resource.
        :param IpSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IpSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            IpSetArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accelerate_region_id: Optional[pulumi.Input[str]] = None,
                 accelerator_id: Optional[pulumi.Input[str]] = None,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 ip_version: Optional[pulumi.Input[str]] = None,
                 isp_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IpSetArgs.__new__(IpSetArgs)

            if accelerate_region_id is None and not opts.urn:
                raise TypeError("Missing required property 'accelerate_region_id'")
            __props__.__dict__["accelerate_region_id"] = accelerate_region_id
            if accelerator_id is None and not opts.urn:
                raise TypeError("Missing required property 'accelerator_id'")
            __props__.__dict__["accelerator_id"] = accelerator_id
            __props__.__dict__["bandwidth"] = bandwidth
            __props__.__dict__["ip_version"] = ip_version
            __props__.__dict__["isp_type"] = isp_type
            __props__.__dict__["ip_address_lists"] = None
            __props__.__dict__["status"] = None
        super(IpSet, __self__).__init__(
            'alicloud:ga/ipSet:IpSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accelerate_region_id: Optional[pulumi.Input[str]] = None,
            accelerator_id: Optional[pulumi.Input[str]] = None,
            bandwidth: Optional[pulumi.Input[int]] = None,
            ip_address_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            ip_version: Optional[pulumi.Input[str]] = None,
            isp_type: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'IpSet':
        """
        Get an existing IpSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accelerate_region_id: The ID of an acceleration region.
        :param pulumi.Input[str] accelerator_id: The ID of the Global Accelerator (GA) instance.
        :param pulumi.Input[int] bandwidth: The bandwidth allocated to the acceleration region.
               > **NOTE:** The minimum bandwidth of each accelerated region is 2Mbps. The total bandwidth of the acceleration region should be less than or equal to the bandwidth of the basic bandwidth package you purchased.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ip_address_lists: The list of accelerated IP addresses in the acceleration region.
        :param pulumi.Input[str] ip_version: The IP protocol used by the GA instance. Valid values: `IPv4`, `IPv6`. Default value: `IPv4`.
        :param pulumi.Input[str] isp_type: The line type of the elastic IP address (EIP) in the acceleration region. Valid values: `BGP`, `BGP_PRO`.
        :param pulumi.Input[str] status: The status of the acceleration region.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IpSetState.__new__(_IpSetState)

        __props__.__dict__["accelerate_region_id"] = accelerate_region_id
        __props__.__dict__["accelerator_id"] = accelerator_id
        __props__.__dict__["bandwidth"] = bandwidth
        __props__.__dict__["ip_address_lists"] = ip_address_lists
        __props__.__dict__["ip_version"] = ip_version
        __props__.__dict__["isp_type"] = isp_type
        __props__.__dict__["status"] = status
        return IpSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accelerateRegionId")
    def accelerate_region_id(self) -> pulumi.Output[str]:
        """
        The ID of an acceleration region.
        """
        return pulumi.get(self, "accelerate_region_id")

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> pulumi.Output[str]:
        """
        The ID of the Global Accelerator (GA) instance.
        """
        return pulumi.get(self, "accelerator_id")

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Output[Optional[int]]:
        """
        The bandwidth allocated to the acceleration region.
        > **NOTE:** The minimum bandwidth of each accelerated region is 2Mbps. The total bandwidth of the acceleration region should be less than or equal to the bandwidth of the basic bandwidth package you purchased.
        """
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter(name="ipAddressLists")
    def ip_address_lists(self) -> pulumi.Output[Sequence[str]]:
        """
        The list of accelerated IP addresses in the acceleration region.
        """
        return pulumi.get(self, "ip_address_lists")

    @property
    @pulumi.getter(name="ipVersion")
    def ip_version(self) -> pulumi.Output[str]:
        """
        The IP protocol used by the GA instance. Valid values: `IPv4`, `IPv6`. Default value: `IPv4`.
        """
        return pulumi.get(self, "ip_version")

    @property
    @pulumi.getter(name="ispType")
    def isp_type(self) -> pulumi.Output[Optional[str]]:
        """
        The line type of the elastic IP address (EIP) in the acceleration region. Valid values: `BGP`, `BGP_PRO`.
        """
        return pulumi.get(self, "isp_type")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the acceleration region.
        """
        return pulumi.get(self, "status")

