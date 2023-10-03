# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BandwidthLimitArgs', 'BandwidthLimit']

@pulumi.input_type
class BandwidthLimitArgs:
    def __init__(__self__, *,
                 bandwidth_limit: pulumi.Input[int],
                 instance_id: pulumi.Input[str],
                 region_ids: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        The set of arguments for constructing a BandwidthLimit resource.
        :param pulumi.Input[int] bandwidth_limit: The bandwidth configured for the interconnected regions communication.
               
               ->**NOTE:** The "alicloud_cen_bandwidthlimit" resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
        :param pulumi.Input[str] instance_id: The ID of the CEN.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] region_ids: List of the two regions to interconnect. Must be two different regions.
        """
        BandwidthLimitArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            bandwidth_limit=bandwidth_limit,
            instance_id=instance_id,
            region_ids=region_ids,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             bandwidth_limit: pulumi.Input[int],
             instance_id: pulumi.Input[str],
             region_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("bandwidth_limit", bandwidth_limit)
        _setter("instance_id", instance_id)
        _setter("region_ids", region_ids)

    @property
    @pulumi.getter(name="bandwidthLimit")
    def bandwidth_limit(self) -> pulumi.Input[int]:
        """
        The bandwidth configured for the interconnected regions communication.

        ->**NOTE:** The "alicloud_cen_bandwidthlimit" resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
        """
        return pulumi.get(self, "bandwidth_limit")

    @bandwidth_limit.setter
    def bandwidth_limit(self, value: pulumi.Input[int]):
        pulumi.set(self, "bandwidth_limit", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the CEN.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="regionIds")
    def region_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        List of the two regions to interconnect. Must be two different regions.
        """
        return pulumi.get(self, "region_ids")

    @region_ids.setter
    def region_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "region_ids", value)


@pulumi.input_type
class _BandwidthLimitState:
    def __init__(__self__, *,
                 bandwidth_limit: Optional[pulumi.Input[int]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 region_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering BandwidthLimit resources.
        :param pulumi.Input[int] bandwidth_limit: The bandwidth configured for the interconnected regions communication.
               
               ->**NOTE:** The "alicloud_cen_bandwidthlimit" resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
        :param pulumi.Input[str] instance_id: The ID of the CEN.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] region_ids: List of the two regions to interconnect. Must be two different regions.
        """
        _BandwidthLimitState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            bandwidth_limit=bandwidth_limit,
            instance_id=instance_id,
            region_ids=region_ids,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             bandwidth_limit: Optional[pulumi.Input[int]] = None,
             instance_id: Optional[pulumi.Input[str]] = None,
             region_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if bandwidth_limit is not None:
            _setter("bandwidth_limit", bandwidth_limit)
        if instance_id is not None:
            _setter("instance_id", instance_id)
        if region_ids is not None:
            _setter("region_ids", region_ids)

    @property
    @pulumi.getter(name="bandwidthLimit")
    def bandwidth_limit(self) -> Optional[pulumi.Input[int]]:
        """
        The bandwidth configured for the interconnected regions communication.

        ->**NOTE:** The "alicloud_cen_bandwidthlimit" resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
        """
        return pulumi.get(self, "bandwidth_limit")

    @bandwidth_limit.setter
    def bandwidth_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "bandwidth_limit", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the CEN.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="regionIds")
    def region_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of the two regions to interconnect. Must be two different regions.
        """
        return pulumi.get(self, "region_ids")

    @region_ids.setter
    def region_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "region_ids", value)


class BandwidthLimit(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth_limit: Optional[pulumi.Input[int]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 region_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a CEN cross-regional interconnection bandwidth resource. To connect networks in different regions, you must set cross-region interconnection bandwidth after buying a bandwidth package. The total bandwidth set for all the interconnected regions of a bandwidth package cannot exceed the bandwidth of the bandwidth package. By default, 1 Kbps bandwidth is provided for connectivity test. To run normal business, you must buy a bandwidth package and set a proper interconnection bandwidth.

        For example, a CEN instance is bound to a bandwidth package of 20 Mbps and  the interconnection areas are Mainland China and North America. You can set the cross-region interconnection bandwidth between US West 1 and China East 1, China East 2, China South 1, and so on. However, the total bandwidth set for all the interconnected regions cannot exceed 20  Mbps.

        For information about CEN and how to use it, see [Cross-region interconnection bandwidth](https://www.alibabacloud.com/help/doc-detail/65983.htm)

        > **NOTE:** Available since v1.18.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        region1 = config.get("region1")
        if region1 is None:
            region1 = "eu-central-1"
        region2 = config.get("region2")
        if region2 is None:
            region2 = "ap-southeast-1"
        ec = alicloud.Provider("ec", region=region1)
        as_ = alicloud.Provider("as", region=region2)
        vpc1 = alicloud.vpc.Network("vpc1",
            vpc_name="tf-example",
            cidr_block="192.168.0.0/16",
            opts=pulumi.ResourceOptions(provider=alicloud["ec"]))
        vpc2 = alicloud.vpc.Network("vpc2",
            vpc_name="tf-example",
            cidr_block="172.16.0.0/12",
            opts=pulumi.ResourceOptions(provider=alicloud["as"]))
        example_instance = alicloud.cen.Instance("exampleInstance",
            cen_instance_name="tf_example",
            description="an example for cen")
        example1 = alicloud.cen.InstanceAttachment("example1",
            instance_id=example_instance.id,
            child_instance_id=vpc1.id,
            child_instance_type="VPC",
            child_instance_region_id=region1)
        example2 = alicloud.cen.InstanceAttachment("example2",
            instance_id=example_instance.id,
            child_instance_id=vpc2.id,
            child_instance_type="VPC",
            child_instance_region_id=region2)
        example_bandwidth_package = alicloud.cen.BandwidthPackage("exampleBandwidthPackage",
            bandwidth=5,
            cen_bandwidth_package_name="tf_example",
            geographic_region_a_id="Europe",
            geographic_region_b_id="Asia-Pacific")
        example_bandwidth_package_attachment = alicloud.cen.BandwidthPackageAttachment("exampleBandwidthPackageAttachment",
            instance_id=example_instance.id,
            bandwidth_package_id=example_bandwidth_package.id)
        example_bandwidth_limit = alicloud.cen.BandwidthLimit("exampleBandwidthLimit",
            instance_id=example_bandwidth_package_attachment.instance_id,
            region_ids=[
                example1.child_instance_region_id,
                example2.child_instance_region_id,
            ],
            bandwidth_limit=4)
        ```

        ## Import

        CEN bandwidth limit can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/bandwidthLimit:BandwidthLimit example cen-abc123456:cn-beijing:eu-west-1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] bandwidth_limit: The bandwidth configured for the interconnected regions communication.
               
               ->**NOTE:** The "alicloud_cen_bandwidthlimit" resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
        :param pulumi.Input[str] instance_id: The ID of the CEN.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] region_ids: List of the two regions to interconnect. Must be two different regions.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BandwidthLimitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CEN cross-regional interconnection bandwidth resource. To connect networks in different regions, you must set cross-region interconnection bandwidth after buying a bandwidth package. The total bandwidth set for all the interconnected regions of a bandwidth package cannot exceed the bandwidth of the bandwidth package. By default, 1 Kbps bandwidth is provided for connectivity test. To run normal business, you must buy a bandwidth package and set a proper interconnection bandwidth.

        For example, a CEN instance is bound to a bandwidth package of 20 Mbps and  the interconnection areas are Mainland China and North America. You can set the cross-region interconnection bandwidth between US West 1 and China East 1, China East 2, China South 1, and so on. However, the total bandwidth set for all the interconnected regions cannot exceed 20  Mbps.

        For information about CEN and how to use it, see [Cross-region interconnection bandwidth](https://www.alibabacloud.com/help/doc-detail/65983.htm)

        > **NOTE:** Available since v1.18.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        region1 = config.get("region1")
        if region1 is None:
            region1 = "eu-central-1"
        region2 = config.get("region2")
        if region2 is None:
            region2 = "ap-southeast-1"
        ec = alicloud.Provider("ec", region=region1)
        as_ = alicloud.Provider("as", region=region2)
        vpc1 = alicloud.vpc.Network("vpc1",
            vpc_name="tf-example",
            cidr_block="192.168.0.0/16",
            opts=pulumi.ResourceOptions(provider=alicloud["ec"]))
        vpc2 = alicloud.vpc.Network("vpc2",
            vpc_name="tf-example",
            cidr_block="172.16.0.0/12",
            opts=pulumi.ResourceOptions(provider=alicloud["as"]))
        example_instance = alicloud.cen.Instance("exampleInstance",
            cen_instance_name="tf_example",
            description="an example for cen")
        example1 = alicloud.cen.InstanceAttachment("example1",
            instance_id=example_instance.id,
            child_instance_id=vpc1.id,
            child_instance_type="VPC",
            child_instance_region_id=region1)
        example2 = alicloud.cen.InstanceAttachment("example2",
            instance_id=example_instance.id,
            child_instance_id=vpc2.id,
            child_instance_type="VPC",
            child_instance_region_id=region2)
        example_bandwidth_package = alicloud.cen.BandwidthPackage("exampleBandwidthPackage",
            bandwidth=5,
            cen_bandwidth_package_name="tf_example",
            geographic_region_a_id="Europe",
            geographic_region_b_id="Asia-Pacific")
        example_bandwidth_package_attachment = alicloud.cen.BandwidthPackageAttachment("exampleBandwidthPackageAttachment",
            instance_id=example_instance.id,
            bandwidth_package_id=example_bandwidth_package.id)
        example_bandwidth_limit = alicloud.cen.BandwidthLimit("exampleBandwidthLimit",
            instance_id=example_bandwidth_package_attachment.instance_id,
            region_ids=[
                example1.child_instance_region_id,
                example2.child_instance_region_id,
            ],
            bandwidth_limit=4)
        ```

        ## Import

        CEN bandwidth limit can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/bandwidthLimit:BandwidthLimit example cen-abc123456:cn-beijing:eu-west-1
        ```

        :param str resource_name: The name of the resource.
        :param BandwidthLimitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BandwidthLimitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            BandwidthLimitArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth_limit: Optional[pulumi.Input[int]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 region_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BandwidthLimitArgs.__new__(BandwidthLimitArgs)

            if bandwidth_limit is None and not opts.urn:
                raise TypeError("Missing required property 'bandwidth_limit'")
            __props__.__dict__["bandwidth_limit"] = bandwidth_limit
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if region_ids is None and not opts.urn:
                raise TypeError("Missing required property 'region_ids'")
            __props__.__dict__["region_ids"] = region_ids
        super(BandwidthLimit, __self__).__init__(
            'alicloud:cen/bandwidthLimit:BandwidthLimit',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bandwidth_limit: Optional[pulumi.Input[int]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            region_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'BandwidthLimit':
        """
        Get an existing BandwidthLimit resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] bandwidth_limit: The bandwidth configured for the interconnected regions communication.
               
               ->**NOTE:** The "alicloud_cen_bandwidthlimit" resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
        :param pulumi.Input[str] instance_id: The ID of the CEN.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] region_ids: List of the two regions to interconnect. Must be two different regions.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BandwidthLimitState.__new__(_BandwidthLimitState)

        __props__.__dict__["bandwidth_limit"] = bandwidth_limit
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["region_ids"] = region_ids
        return BandwidthLimit(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="bandwidthLimit")
    def bandwidth_limit(self) -> pulumi.Output[int]:
        """
        The bandwidth configured for the interconnected regions communication.

        ->**NOTE:** The "alicloud_cen_bandwidthlimit" resource depends on the related "cen.BandwidthPackageAttachment" resource and "cen.InstanceAttachment" resource.
        """
        return pulumi.get(self, "bandwidth_limit")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the CEN.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="regionIds")
    def region_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        List of the two regions to interconnect. Must be two different regions.
        """
        return pulumi.get(self, "region_ids")

