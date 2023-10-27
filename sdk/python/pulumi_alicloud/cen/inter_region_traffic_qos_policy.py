# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InterRegionTrafficQosPolicyArgs', 'InterRegionTrafficQosPolicy']

@pulumi.input_type
class InterRegionTrafficQosPolicyArgs:
    def __init__(__self__, *,
                 transit_router_attachment_id: pulumi.Input[str],
                 transit_router_id: pulumi.Input[str],
                 inter_region_traffic_qos_policy_description: Optional[pulumi.Input[str]] = None,
                 inter_region_traffic_qos_policy_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a InterRegionTrafficQosPolicy resource.
        :param pulumi.Input[str] transit_router_attachment_id: The ID of the inter-region connection.
        :param pulumi.Input[str] transit_router_id: The ID of the transit router.
        :param pulumi.Input[str] inter_region_traffic_qos_policy_description: The description of the QoS policy. The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.
        :param pulumi.Input[str] inter_region_traffic_qos_policy_name: The name of the QoS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
        """
        pulumi.set(__self__, "transit_router_attachment_id", transit_router_attachment_id)
        pulumi.set(__self__, "transit_router_id", transit_router_id)
        if inter_region_traffic_qos_policy_description is not None:
            pulumi.set(__self__, "inter_region_traffic_qos_policy_description", inter_region_traffic_qos_policy_description)
        if inter_region_traffic_qos_policy_name is not None:
            pulumi.set(__self__, "inter_region_traffic_qos_policy_name", inter_region_traffic_qos_policy_name)

    @property
    @pulumi.getter(name="transitRouterAttachmentId")
    def transit_router_attachment_id(self) -> pulumi.Input[str]:
        """
        The ID of the inter-region connection.
        """
        return pulumi.get(self, "transit_router_attachment_id")

    @transit_router_attachment_id.setter
    def transit_router_attachment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_router_attachment_id", value)

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Input[str]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_router_id", value)

    @property
    @pulumi.getter(name="interRegionTrafficQosPolicyDescription")
    def inter_region_traffic_qos_policy_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the QoS policy. The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.
        """
        return pulumi.get(self, "inter_region_traffic_qos_policy_description")

    @inter_region_traffic_qos_policy_description.setter
    def inter_region_traffic_qos_policy_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "inter_region_traffic_qos_policy_description", value)

    @property
    @pulumi.getter(name="interRegionTrafficQosPolicyName")
    def inter_region_traffic_qos_policy_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the QoS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
        """
        return pulumi.get(self, "inter_region_traffic_qos_policy_name")

    @inter_region_traffic_qos_policy_name.setter
    def inter_region_traffic_qos_policy_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "inter_region_traffic_qos_policy_name", value)


@pulumi.input_type
class _InterRegionTrafficQosPolicyState:
    def __init__(__self__, *,
                 inter_region_traffic_qos_policy_description: Optional[pulumi.Input[str]] = None,
                 inter_region_traffic_qos_policy_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 transit_router_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering InterRegionTrafficQosPolicy resources.
        :param pulumi.Input[str] inter_region_traffic_qos_policy_description: The description of the QoS policy. The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.
        :param pulumi.Input[str] inter_region_traffic_qos_policy_name: The name of the QoS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
        :param pulumi.Input[str] status: The status of the Inter Region Traffic Qos Policy.
        :param pulumi.Input[str] transit_router_attachment_id: The ID of the inter-region connection.
        :param pulumi.Input[str] transit_router_id: The ID of the transit router.
        """
        if inter_region_traffic_qos_policy_description is not None:
            pulumi.set(__self__, "inter_region_traffic_qos_policy_description", inter_region_traffic_qos_policy_description)
        if inter_region_traffic_qos_policy_name is not None:
            pulumi.set(__self__, "inter_region_traffic_qos_policy_name", inter_region_traffic_qos_policy_name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if transit_router_attachment_id is not None:
            pulumi.set(__self__, "transit_router_attachment_id", transit_router_attachment_id)
        if transit_router_id is not None:
            pulumi.set(__self__, "transit_router_id", transit_router_id)

    @property
    @pulumi.getter(name="interRegionTrafficQosPolicyDescription")
    def inter_region_traffic_qos_policy_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the QoS policy. The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.
        """
        return pulumi.get(self, "inter_region_traffic_qos_policy_description")

    @inter_region_traffic_qos_policy_description.setter
    def inter_region_traffic_qos_policy_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "inter_region_traffic_qos_policy_description", value)

    @property
    @pulumi.getter(name="interRegionTrafficQosPolicyName")
    def inter_region_traffic_qos_policy_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the QoS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
        """
        return pulumi.get(self, "inter_region_traffic_qos_policy_name")

    @inter_region_traffic_qos_policy_name.setter
    def inter_region_traffic_qos_policy_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "inter_region_traffic_qos_policy_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the Inter Region Traffic Qos Policy.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="transitRouterAttachmentId")
    def transit_router_attachment_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the inter-region connection.
        """
        return pulumi.get(self, "transit_router_attachment_id")

    @transit_router_attachment_id.setter
    def transit_router_attachment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_attachment_id", value)

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_id", value)


class InterRegionTrafficQosPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 inter_region_traffic_qos_policy_description: Optional[pulumi.Input[str]] = None,
                 inter_region_traffic_qos_policy_name: Optional[pulumi.Input[str]] = None,
                 transit_router_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloud Enterprise Network (CEN) Inter Region Traffic Qos Policy resource.

        For information about Cloud Enterprise Network (CEN) Inter Region Traffic Qos Policy and how to use it, see [What is Inter Region Traffic Qos Policy](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createceninterregiontrafficqospolicy).

        > **NOTE:** Available since v1.195.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        bj = alicloud.Provider("bj", region="cn-beijing")
        hz = alicloud.Provider("hz", region="cn-hangzhou")
        default_instance = alicloud.cen.Instance("defaultInstance", cen_instance_name="tf-example",
        opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        default_bandwidth_package = alicloud.cen.BandwidthPackage("defaultBandwidthPackage",
            bandwidth=5,
            geographic_region_a_id="China",
            geographic_region_b_id="China",
            opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        default_bandwidth_package_attachment = alicloud.cen.BandwidthPackageAttachment("defaultBandwidthPackageAttachment",
            instance_id=default_instance.id,
            bandwidth_package_id=default_bandwidth_package.id,
            opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        hz_transit_router = alicloud.cen.TransitRouter("hzTransitRouter", cen_id=default_bandwidth_package_attachment.instance_id,
        opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        bj_transit_router = alicloud.cen.TransitRouter("bjTransitRouter", cen_id=hz_transit_router.cen_id,
        opts=pulumi.ResourceOptions(provider=alicloud["bj"]))
        default_transit_router_peer_attachment = alicloud.cen.TransitRouterPeerAttachment("defaultTransitRouterPeerAttachment",
            cen_id=default_instance.id,
            transit_router_id=hz_transit_router.transit_router_id,
            peer_transit_router_region_id="cn-beijing",
            peer_transit_router_id=bj_transit_router.transit_router_id,
            cen_bandwidth_package_id=default_bandwidth_package_attachment.bandwidth_package_id,
            bandwidth=5,
            opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        default_inter_region_traffic_qos_policy = alicloud.cen.InterRegionTrafficQosPolicy("defaultInterRegionTrafficQosPolicy",
            transit_router_id=hz_transit_router.transit_router_id,
            transit_router_attachment_id=default_transit_router_peer_attachment.transit_router_attachment_id,
            inter_region_traffic_qos_policy_name="tf-example-name",
            inter_region_traffic_qos_policy_description="tf-example-description",
            opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        ```

        ## Import

        Cloud Enterprise Network (CEN) Inter Region Traffic Qos Policy can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/interRegionTrafficQosPolicy:InterRegionTrafficQosPolicy example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] inter_region_traffic_qos_policy_description: The description of the QoS policy. The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.
        :param pulumi.Input[str] inter_region_traffic_qos_policy_name: The name of the QoS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
        :param pulumi.Input[str] transit_router_attachment_id: The ID of the inter-region connection.
        :param pulumi.Input[str] transit_router_id: The ID of the transit router.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InterRegionTrafficQosPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Enterprise Network (CEN) Inter Region Traffic Qos Policy resource.

        For information about Cloud Enterprise Network (CEN) Inter Region Traffic Qos Policy and how to use it, see [What is Inter Region Traffic Qos Policy](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createceninterregiontrafficqospolicy).

        > **NOTE:** Available since v1.195.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        bj = alicloud.Provider("bj", region="cn-beijing")
        hz = alicloud.Provider("hz", region="cn-hangzhou")
        default_instance = alicloud.cen.Instance("defaultInstance", cen_instance_name="tf-example",
        opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        default_bandwidth_package = alicloud.cen.BandwidthPackage("defaultBandwidthPackage",
            bandwidth=5,
            geographic_region_a_id="China",
            geographic_region_b_id="China",
            opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        default_bandwidth_package_attachment = alicloud.cen.BandwidthPackageAttachment("defaultBandwidthPackageAttachment",
            instance_id=default_instance.id,
            bandwidth_package_id=default_bandwidth_package.id,
            opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        hz_transit_router = alicloud.cen.TransitRouter("hzTransitRouter", cen_id=default_bandwidth_package_attachment.instance_id,
        opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        bj_transit_router = alicloud.cen.TransitRouter("bjTransitRouter", cen_id=hz_transit_router.cen_id,
        opts=pulumi.ResourceOptions(provider=alicloud["bj"]))
        default_transit_router_peer_attachment = alicloud.cen.TransitRouterPeerAttachment("defaultTransitRouterPeerAttachment",
            cen_id=default_instance.id,
            transit_router_id=hz_transit_router.transit_router_id,
            peer_transit_router_region_id="cn-beijing",
            peer_transit_router_id=bj_transit_router.transit_router_id,
            cen_bandwidth_package_id=default_bandwidth_package_attachment.bandwidth_package_id,
            bandwidth=5,
            opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        default_inter_region_traffic_qos_policy = alicloud.cen.InterRegionTrafficQosPolicy("defaultInterRegionTrafficQosPolicy",
            transit_router_id=hz_transit_router.transit_router_id,
            transit_router_attachment_id=default_transit_router_peer_attachment.transit_router_attachment_id,
            inter_region_traffic_qos_policy_name="tf-example-name",
            inter_region_traffic_qos_policy_description="tf-example-description",
            opts=pulumi.ResourceOptions(provider=alicloud["hz"]))
        ```

        ## Import

        Cloud Enterprise Network (CEN) Inter Region Traffic Qos Policy can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/interRegionTrafficQosPolicy:InterRegionTrafficQosPolicy example <id>
        ```

        :param str resource_name: The name of the resource.
        :param InterRegionTrafficQosPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InterRegionTrafficQosPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 inter_region_traffic_qos_policy_description: Optional[pulumi.Input[str]] = None,
                 inter_region_traffic_qos_policy_name: Optional[pulumi.Input[str]] = None,
                 transit_router_attachment_id: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InterRegionTrafficQosPolicyArgs.__new__(InterRegionTrafficQosPolicyArgs)

            __props__.__dict__["inter_region_traffic_qos_policy_description"] = inter_region_traffic_qos_policy_description
            __props__.__dict__["inter_region_traffic_qos_policy_name"] = inter_region_traffic_qos_policy_name
            if transit_router_attachment_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_router_attachment_id'")
            __props__.__dict__["transit_router_attachment_id"] = transit_router_attachment_id
            if transit_router_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_router_id'")
            __props__.__dict__["transit_router_id"] = transit_router_id
            __props__.__dict__["status"] = None
        super(InterRegionTrafficQosPolicy, __self__).__init__(
            'alicloud:cen/interRegionTrafficQosPolicy:InterRegionTrafficQosPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            inter_region_traffic_qos_policy_description: Optional[pulumi.Input[str]] = None,
            inter_region_traffic_qos_policy_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            transit_router_attachment_id: Optional[pulumi.Input[str]] = None,
            transit_router_id: Optional[pulumi.Input[str]] = None) -> 'InterRegionTrafficQosPolicy':
        """
        Get an existing InterRegionTrafficQosPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] inter_region_traffic_qos_policy_description: The description of the QoS policy. The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.
        :param pulumi.Input[str] inter_region_traffic_qos_policy_name: The name of the QoS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
        :param pulumi.Input[str] status: The status of the Inter Region Traffic Qos Policy.
        :param pulumi.Input[str] transit_router_attachment_id: The ID of the inter-region connection.
        :param pulumi.Input[str] transit_router_id: The ID of the transit router.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InterRegionTrafficQosPolicyState.__new__(_InterRegionTrafficQosPolicyState)

        __props__.__dict__["inter_region_traffic_qos_policy_description"] = inter_region_traffic_qos_policy_description
        __props__.__dict__["inter_region_traffic_qos_policy_name"] = inter_region_traffic_qos_policy_name
        __props__.__dict__["status"] = status
        __props__.__dict__["transit_router_attachment_id"] = transit_router_attachment_id
        __props__.__dict__["transit_router_id"] = transit_router_id
        return InterRegionTrafficQosPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="interRegionTrafficQosPolicyDescription")
    def inter_region_traffic_qos_policy_description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the QoS policy. The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.
        """
        return pulumi.get(self, "inter_region_traffic_qos_policy_description")

    @property
    @pulumi.getter(name="interRegionTrafficQosPolicyName")
    def inter_region_traffic_qos_policy_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the QoS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
        """
        return pulumi.get(self, "inter_region_traffic_qos_policy_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the Inter Region Traffic Qos Policy.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="transitRouterAttachmentId")
    def transit_router_attachment_id(self) -> pulumi.Output[str]:
        """
        The ID of the inter-region connection.
        """
        return pulumi.get(self, "transit_router_attachment_id")

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Output[str]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

