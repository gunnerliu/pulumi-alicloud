# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['RouterInterface']


class RouterInterface(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 health_check_source_ip: Optional[pulumi.Input[str]] = None,
                 health_check_target_ip: Optional[pulumi.Input[str]] = None,
                 instance_charge_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 opposite_access_point_id: Optional[pulumi.Input[str]] = None,
                 opposite_region: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[float]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 router_id: Optional[pulumi.Input[str]] = None,
                 router_type: Optional[pulumi.Input[str]] = None,
                 specification: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a RouterInterface resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
        :param pulumi.Input[str] health_check_source_ip: Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_target_ip` must be specified at the same time.
        :param pulumi.Input[str] health_check_target_ip: Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_source_ip` must be specified at the same time.
        :param pulumi.Input[str] instance_charge_type: The billing method of the router interface. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid". Router Interface doesn't support "PrePaid" when region and opposite_region are the same.
        :param pulumi.Input[str] name: Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
               If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
        :param pulumi.Input[str] opposite_access_point_id: It has been deprecated from version 1.11.0.
        :param pulumi.Input[str] opposite_region: The Region of peer side.
        :param pulumi.Input[float] period: The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
        :param pulumi.Input[str] role: The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
        :param pulumi.Input[str] router_id: The Router ID.
        :param pulumi.Input[str] router_type: Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
        :param pulumi.Input[str] specification: Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side's role is default to set as 'Negative'. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['description'] = description
            __props__['health_check_source_ip'] = health_check_source_ip
            __props__['health_check_target_ip'] = health_check_target_ip
            __props__['instance_charge_type'] = instance_charge_type
            __props__['name'] = name
            if opposite_access_point_id is not None:
                warnings.warn("Attribute 'opposite_access_point_id' has been deprecated from version 1.11.0.", DeprecationWarning)
                pulumi.log.warn("opposite_access_point_id is deprecated: Attribute 'opposite_access_point_id' has been deprecated from version 1.11.0.")
            __props__['opposite_access_point_id'] = opposite_access_point_id
            if opposite_region is None:
                raise TypeError("Missing required property 'opposite_region'")
            __props__['opposite_region'] = opposite_region
            __props__['period'] = period
            if role is None:
                raise TypeError("Missing required property 'role'")
            __props__['role'] = role
            if router_id is None:
                raise TypeError("Missing required property 'router_id'")
            __props__['router_id'] = router_id
            if router_type is None:
                raise TypeError("Missing required property 'router_type'")
            __props__['router_type'] = router_type
            __props__['specification'] = specification
            __props__['access_point_id'] = None
            __props__['opposite_interface_id'] = None
            __props__['opposite_interface_owner_id'] = None
            __props__['opposite_router_id'] = None
            __props__['opposite_router_type'] = None
        super(RouterInterface, __self__).__init__(
            'alicloud:vpc/routerInterface:RouterInterface',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_point_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            health_check_source_ip: Optional[pulumi.Input[str]] = None,
            health_check_target_ip: Optional[pulumi.Input[str]] = None,
            instance_charge_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            opposite_access_point_id: Optional[pulumi.Input[str]] = None,
            opposite_interface_id: Optional[pulumi.Input[str]] = None,
            opposite_interface_owner_id: Optional[pulumi.Input[str]] = None,
            opposite_region: Optional[pulumi.Input[str]] = None,
            opposite_router_id: Optional[pulumi.Input[str]] = None,
            opposite_router_type: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[float]] = None,
            role: Optional[pulumi.Input[str]] = None,
            router_id: Optional[pulumi.Input[str]] = None,
            router_type: Optional[pulumi.Input[str]] = None,
            specification: Optional[pulumi.Input[str]] = None) -> 'RouterInterface':
        """
        Get an existing RouterInterface resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_point_id: It has been deprecated from version 1.11.0.
        :param pulumi.Input[str] description: Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
        :param pulumi.Input[str] health_check_source_ip: Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_target_ip` must be specified at the same time.
        :param pulumi.Input[str] health_check_target_ip: Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_source_ip` must be specified at the same time.
        :param pulumi.Input[str] instance_charge_type: The billing method of the router interface. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid". Router Interface doesn't support "PrePaid" when region and opposite_region are the same.
        :param pulumi.Input[str] name: Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
               If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
        :param pulumi.Input[str] opposite_access_point_id: It has been deprecated from version 1.11.0.
        :param pulumi.Input[str] opposite_interface_id: It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
        :param pulumi.Input[str] opposite_interface_owner_id: It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_id' instead.
        :param pulumi.Input[str] opposite_region: The Region of peer side.
        :param pulumi.Input[str] opposite_router_id: It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
        :param pulumi.Input[str] opposite_router_type: It has been deprecated from version 1.11.0. resource alicloud_router_interface_connection's 'opposite_router_type' instead.
        :param pulumi.Input[float] period: The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
        :param pulumi.Input[str] role: The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
        :param pulumi.Input[str] router_id: The Router ID.
        :param pulumi.Input[str] router_type: Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
        :param pulumi.Input[str] specification: Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side's role is default to set as 'Negative'. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["access_point_id"] = access_point_id
        __props__["description"] = description
        __props__["health_check_source_ip"] = health_check_source_ip
        __props__["health_check_target_ip"] = health_check_target_ip
        __props__["instance_charge_type"] = instance_charge_type
        __props__["name"] = name
        __props__["opposite_access_point_id"] = opposite_access_point_id
        __props__["opposite_interface_id"] = opposite_interface_id
        __props__["opposite_interface_owner_id"] = opposite_interface_owner_id
        __props__["opposite_region"] = opposite_region
        __props__["opposite_router_id"] = opposite_router_id
        __props__["opposite_router_type"] = opposite_router_type
        __props__["period"] = period
        __props__["role"] = role
        __props__["router_id"] = router_id
        __props__["router_type"] = router_type
        __props__["specification"] = specification
        return RouterInterface(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessPointId")
    def access_point_id(self) -> str:
        """
        It has been deprecated from version 1.11.0.
        """
        return pulumi.get(self, "access_point_id")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="healthCheckSourceIp")
    def health_check_source_ip(self) -> Optional[str]:
        """
        Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_target_ip` must be specified at the same time.
        """
        return pulumi.get(self, "health_check_source_ip")

    @property
    @pulumi.getter(name="healthCheckTargetIp")
    def health_check_target_ip(self) -> Optional[str]:
        """
        Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `router_type` is `VBR`. The IP must be an unused IP in the local VPC. It and `health_check_source_ip` must be specified at the same time.
        """
        return pulumi.get(self, "health_check_target_ip")

    @property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> Optional[str]:
        """
        The billing method of the router interface. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid". Router Interface doesn't support "PrePaid" when region and opposite_region are the same.
        """
        return pulumi.get(self, "instance_charge_type")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
        If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="oppositeAccessPointId")
    def opposite_access_point_id(self) -> Optional[str]:
        """
        It has been deprecated from version 1.11.0.
        """
        return pulumi.get(self, "opposite_access_point_id")

    @property
    @pulumi.getter(name="oppositeInterfaceId")
    def opposite_interface_id(self) -> str:
        """
        It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
        """
        return pulumi.get(self, "opposite_interface_id")

    @property
    @pulumi.getter(name="oppositeInterfaceOwnerId")
    def opposite_interface_owner_id(self) -> str:
        """
        It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_id' instead.
        """
        return pulumi.get(self, "opposite_interface_owner_id")

    @property
    @pulumi.getter(name="oppositeRegion")
    def opposite_region(self) -> str:
        """
        The Region of peer side.
        """
        return pulumi.get(self, "opposite_region")

    @property
    @pulumi.getter(name="oppositeRouterId")
    def opposite_router_id(self) -> str:
        """
        It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
        """
        return pulumi.get(self, "opposite_router_id")

    @property
    @pulumi.getter(name="oppositeRouterType")
    def opposite_router_type(self) -> str:
        """
        It has been deprecated from version 1.11.0. resource alicloud_router_interface_connection's 'opposite_router_type' instead.
        """
        return pulumi.get(self, "opposite_router_type")

    @property
    @pulumi.getter
    def period(self) -> Optional[float]:
        """
        The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter
    def role(self) -> str:
        """
        The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter(name="routerId")
    def router_id(self) -> str:
        """
        The Router ID.
        """
        return pulumi.get(self, "router_id")

    @property
    @pulumi.getter(name="routerType")
    def router_type(self) -> str:
        """
        Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
        """
        return pulumi.get(self, "router_type")

    @property
    @pulumi.getter
    def specification(self) -> Optional[str]:
        """
        Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side's role is default to set as 'Negative'. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
        """
        return pulumi.get(self, "specification")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

