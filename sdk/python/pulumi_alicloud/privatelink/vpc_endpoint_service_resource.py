# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VpcEndpointServiceResourceArgs', 'VpcEndpointServiceResource']

@pulumi.input_type
class VpcEndpointServiceResourceArgs:
    def __init__(__self__, *,
                 resource_id: pulumi.Input[str],
                 resource_type: pulumi.Input[str],
                 service_id: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a VpcEndpointServiceResource resource.
        :param pulumi.Input[str] resource_id: The service resource ID.
        :param pulumi.Input[str] resource_type: Service resource type, value:
               - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
               - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
               - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
        :param pulumi.Input[str] service_id: The endpoint service ID.
        :param pulumi.Input[bool] dry_run: Specifies whether to perform only a dry run, without performing the actual request. Valid values:
               - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
               - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        :param pulumi.Input[str] zone_id: The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
        """
        pulumi.set(__self__, "resource_id", resource_id)
        pulumi.set(__self__, "resource_type", resource_type)
        pulumi.set(__self__, "service_id", service_id)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Input[str]:
        """
        The service resource ID.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> pulumi.Input[str]:
        """
        Service resource type, value:
        - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
        - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
        - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
        """
        return pulumi.get(self, "resource_type")

    @resource_type.setter
    def resource_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_type", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Input[str]:
        """
        The endpoint service ID.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to perform only a dry run, without performing the actual request. Valid values:
        - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
        - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _VpcEndpointServiceResourceState:
    def __init__(__self__, *,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 resource_type: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VpcEndpointServiceResource resources.
        :param pulumi.Input[bool] dry_run: Specifies whether to perform only a dry run, without performing the actual request. Valid values:
               - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
               - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        :param pulumi.Input[str] resource_id: The service resource ID.
        :param pulumi.Input[str] resource_type: Service resource type, value:
               - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
               - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
               - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
        :param pulumi.Input[str] service_id: The endpoint service ID.
        :param pulumi.Input[str] zone_id: The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
        """
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if resource_id is not None:
            pulumi.set(__self__, "resource_id", resource_id)
        if resource_type is not None:
            pulumi.set(__self__, "resource_type", resource_type)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to perform only a dry run, without performing the actual request. Valid values:
        - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
        - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        The service resource ID.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> Optional[pulumi.Input[str]]:
        """
        Service resource type, value:
        - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
        - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
        - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
        """
        return pulumi.get(self, "resource_type")

    @resource_type.setter
    def resource_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_type", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        """
        The endpoint service ID.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class VpcEndpointServiceResource(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 resource_type: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Private Link Vpc Endpoint Service Resource resource. Endpoint service resource.

        For information about Private Link Vpc Endpoint Service Resource and how to use it, see [What is Vpc Endpoint Service Resource](https://www.alibabacloud.com/help/en/privatelink/latest/api-privatelink-2020-04-15-attachresourcetovpcendpointservice).

        > **NOTE:** Available since v1.110.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        example_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        example_vpc_endpoint_service = alicloud.privatelink.VpcEndpointService("exampleVpcEndpointService",
            service_description=name,
            connect_bandwidth=103,
            auto_accept_connection=False)
        example_network = alicloud.vpc.Network("exampleNetwork",
            vpc_name=name,
            cidr_block="10.0.0.0/8")
        example_switch = alicloud.vpc.Switch("exampleSwitch",
            vswitch_name=name,
            cidr_block="10.1.0.0/16",
            vpc_id=example_network.id,
            zone_id=example_zones.zones[0].id)
        example_security_group = alicloud.ecs.SecurityGroup("exampleSecurityGroup", vpc_id=example_network.id)
        example_application_load_balancer = alicloud.slb.ApplicationLoadBalancer("exampleApplicationLoadBalancer",
            load_balancer_name=name,
            vswitch_id=example_switch.id,
            load_balancer_spec="slb.s2.small",
            address_type="intranet")
        example_vpc_endpoint = alicloud.privatelink.VpcEndpoint("exampleVpcEndpoint",
            service_id=example_vpc_endpoint_service.id,
            security_group_ids=[example_security_group.id],
            vpc_id=example_network.id,
            vpc_endpoint_name=name)
        example_vpc_endpoint_service_resource = alicloud.privatelink.VpcEndpointServiceResource("exampleVpcEndpointServiceResource",
            service_id=example_vpc_endpoint_service.id,
            resource_id=example_application_load_balancer.id,
            resource_type="slb")
        ```

        ## Import

        Private Link Vpc Endpoint Service Resource can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource example <service_id>:<resource_id>:<zone_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: Specifies whether to perform only a dry run, without performing the actual request. Valid values:
               - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
               - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        :param pulumi.Input[str] resource_id: The service resource ID.
        :param pulumi.Input[str] resource_type: Service resource type, value:
               - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
               - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
               - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
        :param pulumi.Input[str] service_id: The endpoint service ID.
        :param pulumi.Input[str] zone_id: The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpcEndpointServiceResourceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Private Link Vpc Endpoint Service Resource resource. Endpoint service resource.

        For information about Private Link Vpc Endpoint Service Resource and how to use it, see [What is Vpc Endpoint Service Resource](https://www.alibabacloud.com/help/en/privatelink/latest/api-privatelink-2020-04-15-attachresourcetovpcendpointservice).

        > **NOTE:** Available since v1.110.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        example_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        example_vpc_endpoint_service = alicloud.privatelink.VpcEndpointService("exampleVpcEndpointService",
            service_description=name,
            connect_bandwidth=103,
            auto_accept_connection=False)
        example_network = alicloud.vpc.Network("exampleNetwork",
            vpc_name=name,
            cidr_block="10.0.0.0/8")
        example_switch = alicloud.vpc.Switch("exampleSwitch",
            vswitch_name=name,
            cidr_block="10.1.0.0/16",
            vpc_id=example_network.id,
            zone_id=example_zones.zones[0].id)
        example_security_group = alicloud.ecs.SecurityGroup("exampleSecurityGroup", vpc_id=example_network.id)
        example_application_load_balancer = alicloud.slb.ApplicationLoadBalancer("exampleApplicationLoadBalancer",
            load_balancer_name=name,
            vswitch_id=example_switch.id,
            load_balancer_spec="slb.s2.small",
            address_type="intranet")
        example_vpc_endpoint = alicloud.privatelink.VpcEndpoint("exampleVpcEndpoint",
            service_id=example_vpc_endpoint_service.id,
            security_group_ids=[example_security_group.id],
            vpc_id=example_network.id,
            vpc_endpoint_name=name)
        example_vpc_endpoint_service_resource = alicloud.privatelink.VpcEndpointServiceResource("exampleVpcEndpointServiceResource",
            service_id=example_vpc_endpoint_service.id,
            resource_id=example_application_load_balancer.id,
            resource_type="slb")
        ```

        ## Import

        Private Link Vpc Endpoint Service Resource can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource example <service_id>:<resource_id>:<zone_id>
        ```

        :param str resource_name: The name of the resource.
        :param VpcEndpointServiceResourceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcEndpointServiceResourceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 resource_type: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcEndpointServiceResourceArgs.__new__(VpcEndpointServiceResourceArgs)

            __props__.__dict__["dry_run"] = dry_run
            if resource_id is None and not opts.urn:
                raise TypeError("Missing required property 'resource_id'")
            __props__.__dict__["resource_id"] = resource_id
            if resource_type is None and not opts.urn:
                raise TypeError("Missing required property 'resource_type'")
            __props__.__dict__["resource_type"] = resource_type
            if service_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_id'")
            __props__.__dict__["service_id"] = service_id
            __props__.__dict__["zone_id"] = zone_id
        super(VpcEndpointServiceResource, __self__).__init__(
            'alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            resource_id: Optional[pulumi.Input[str]] = None,
            resource_type: Optional[pulumi.Input[str]] = None,
            service_id: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'VpcEndpointServiceResource':
        """
        Get an existing VpcEndpointServiceResource resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: Specifies whether to perform only a dry run, without performing the actual request. Valid values:
               - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
               - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        :param pulumi.Input[str] resource_id: The service resource ID.
        :param pulumi.Input[str] resource_type: Service resource type, value:
               - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
               - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
               - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
        :param pulumi.Input[str] service_id: The endpoint service ID.
        :param pulumi.Input[str] zone_id: The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcEndpointServiceResourceState.__new__(_VpcEndpointServiceResourceState)

        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["resource_id"] = resource_id
        __props__.__dict__["resource_type"] = resource_type
        __props__.__dict__["service_id"] = service_id
        __props__.__dict__["zone_id"] = zone_id
        return VpcEndpointServiceResource(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to perform only a dry run, without performing the actual request. Valid values:
        - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
        - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Output[str]:
        """
        The service resource ID.
        """
        return pulumi.get(self, "resource_id")

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> pulumi.Output[str]:
        """
        Service resource type, value:
        - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
        - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
        - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
        """
        return pulumi.get(self, "resource_type")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[str]:
        """
        The endpoint service ID.
        """
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
        """
        return pulumi.get(self, "zone_id")

