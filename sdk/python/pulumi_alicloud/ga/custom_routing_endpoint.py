# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['CustomRoutingEndpointArgs', 'CustomRoutingEndpoint']

@pulumi.input_type
class CustomRoutingEndpointArgs:
    def __init__(__self__, *,
                 endpoint: pulumi.Input[str],
                 endpoint_group_id: pulumi.Input[str],
                 type: pulumi.Input[str],
                 traffic_to_endpoint_policy: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a CustomRoutingEndpoint resource.
        :param pulumi.Input[str] endpoint: The ID of the endpoint (vSwitch).
        :param pulumi.Input[str] endpoint_group_id: The ID of the endpoint group in which to create endpoints.
        :param pulumi.Input[str] type: The backend service type of the endpoint. Valid values: `PrivateSubNet`.
        :param pulumi.Input[str] traffic_to_endpoint_policy: The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
        """
        CustomRoutingEndpointArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            endpoint=endpoint,
            endpoint_group_id=endpoint_group_id,
            type=type,
            traffic_to_endpoint_policy=traffic_to_endpoint_policy,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             endpoint: Optional[pulumi.Input[str]] = None,
             endpoint_group_id: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             traffic_to_endpoint_policy: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if endpoint is None:
            raise TypeError("Missing 'endpoint' argument")
        if endpoint_group_id is None and 'endpointGroupId' in kwargs:
            endpoint_group_id = kwargs['endpointGroupId']
        if endpoint_group_id is None:
            raise TypeError("Missing 'endpoint_group_id' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")
        if traffic_to_endpoint_policy is None and 'trafficToEndpointPolicy' in kwargs:
            traffic_to_endpoint_policy = kwargs['trafficToEndpointPolicy']

        _setter("endpoint", endpoint)
        _setter("endpoint_group_id", endpoint_group_id)
        _setter("type", type)
        if traffic_to_endpoint_policy is not None:
            _setter("traffic_to_endpoint_policy", traffic_to_endpoint_policy)

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Input[str]:
        """
        The ID of the endpoint (vSwitch).
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: pulumi.Input[str]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter(name="endpointGroupId")
    def endpoint_group_id(self) -> pulumi.Input[str]:
        """
        The ID of the endpoint group in which to create endpoints.
        """
        return pulumi.get(self, "endpoint_group_id")

    @endpoint_group_id.setter
    def endpoint_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "endpoint_group_id", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The backend service type of the endpoint. Valid values: `PrivateSubNet`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="trafficToEndpointPolicy")
    def traffic_to_endpoint_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
        """
        return pulumi.get(self, "traffic_to_endpoint_policy")

    @traffic_to_endpoint_policy.setter
    def traffic_to_endpoint_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_to_endpoint_policy", value)


@pulumi.input_type
class _CustomRoutingEndpointState:
    def __init__(__self__, *,
                 accelerator_id: Optional[pulumi.Input[str]] = None,
                 custom_routing_endpoint_id: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 endpoint_group_id: Optional[pulumi.Input[str]] = None,
                 listener_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 traffic_to_endpoint_policy: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CustomRoutingEndpoint resources.
        :param pulumi.Input[str] accelerator_id: The ID of the GA instance with which the endpoint is associated.
        :param pulumi.Input[str] custom_routing_endpoint_id: The ID of the Custom Routing Endpoint.
        :param pulumi.Input[str] endpoint: The ID of the endpoint (vSwitch).
        :param pulumi.Input[str] endpoint_group_id: The ID of the endpoint group in which to create endpoints.
        :param pulumi.Input[str] listener_id: The ID of the listener with which the endpoint is associated.
        :param pulumi.Input[str] status: The status of the Custom Routing Endpoint.
        :param pulumi.Input[str] traffic_to_endpoint_policy: The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
        :param pulumi.Input[str] type: The backend service type of the endpoint. Valid values: `PrivateSubNet`.
        """
        _CustomRoutingEndpointState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            accelerator_id=accelerator_id,
            custom_routing_endpoint_id=custom_routing_endpoint_id,
            endpoint=endpoint,
            endpoint_group_id=endpoint_group_id,
            listener_id=listener_id,
            status=status,
            traffic_to_endpoint_policy=traffic_to_endpoint_policy,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             accelerator_id: Optional[pulumi.Input[str]] = None,
             custom_routing_endpoint_id: Optional[pulumi.Input[str]] = None,
             endpoint: Optional[pulumi.Input[str]] = None,
             endpoint_group_id: Optional[pulumi.Input[str]] = None,
             listener_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             traffic_to_endpoint_policy: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if accelerator_id is None and 'acceleratorId' in kwargs:
            accelerator_id = kwargs['acceleratorId']
        if custom_routing_endpoint_id is None and 'customRoutingEndpointId' in kwargs:
            custom_routing_endpoint_id = kwargs['customRoutingEndpointId']
        if endpoint_group_id is None and 'endpointGroupId' in kwargs:
            endpoint_group_id = kwargs['endpointGroupId']
        if listener_id is None and 'listenerId' in kwargs:
            listener_id = kwargs['listenerId']
        if traffic_to_endpoint_policy is None and 'trafficToEndpointPolicy' in kwargs:
            traffic_to_endpoint_policy = kwargs['trafficToEndpointPolicy']

        if accelerator_id is not None:
            _setter("accelerator_id", accelerator_id)
        if custom_routing_endpoint_id is not None:
            _setter("custom_routing_endpoint_id", custom_routing_endpoint_id)
        if endpoint is not None:
            _setter("endpoint", endpoint)
        if endpoint_group_id is not None:
            _setter("endpoint_group_id", endpoint_group_id)
        if listener_id is not None:
            _setter("listener_id", listener_id)
        if status is not None:
            _setter("status", status)
        if traffic_to_endpoint_policy is not None:
            _setter("traffic_to_endpoint_policy", traffic_to_endpoint_policy)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the GA instance with which the endpoint is associated.
        """
        return pulumi.get(self, "accelerator_id")

    @accelerator_id.setter
    def accelerator_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accelerator_id", value)

    @property
    @pulumi.getter(name="customRoutingEndpointId")
    def custom_routing_endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Custom Routing Endpoint.
        """
        return pulumi.get(self, "custom_routing_endpoint_id")

    @custom_routing_endpoint_id.setter
    def custom_routing_endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_routing_endpoint_id", value)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the endpoint (vSwitch).
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter(name="endpointGroupId")
    def endpoint_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the endpoint group in which to create endpoints.
        """
        return pulumi.get(self, "endpoint_group_id")

    @endpoint_group_id.setter
    def endpoint_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_group_id", value)

    @property
    @pulumi.getter(name="listenerId")
    def listener_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the listener with which the endpoint is associated.
        """
        return pulumi.get(self, "listener_id")

    @listener_id.setter
    def listener_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "listener_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the Custom Routing Endpoint.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="trafficToEndpointPolicy")
    def traffic_to_endpoint_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
        """
        return pulumi.get(self, "traffic_to_endpoint_policy")

    @traffic_to_endpoint_policy.setter
    def traffic_to_endpoint_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_to_endpoint_policy", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The backend service type of the endpoint. Valid values: `PrivateSubNet`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class CustomRoutingEndpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 endpoint_group_id: Optional[pulumi.Input[str]] = None,
                 traffic_to_endpoint_policy: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Global Accelerator (GA) Custom Routing Endpoint resource.

        For information about Global Accelerator (GA) Custom Routing Endpoint and how to use it, see [What is Custom Routing Endpoint](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createcustomroutingendpoints).

        > **NOTE:** Available since v1.197.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        region = config.get("region")
        if region is None:
            region = "cn-hangzhou"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name="terraform-example",
            cidr_block="172.17.3.0/24")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vswitch_name="terraform-example",
            cidr_block="172.17.3.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[0].id)
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
        default_listener = alicloud.ga.Listener("defaultListener",
            accelerator_id=default_bandwidth_package_attachment.accelerator_id,
            listener_type="CustomRouting",
            port_ranges=[alicloud.ga.ListenerPortRangeArgs(
                from_port=10000,
                to_port=16000,
            )])
        default_custom_routing_endpoint_group = alicloud.ga.CustomRoutingEndpointGroup("defaultCustomRoutingEndpointGroup",
            accelerator_id=default_listener.accelerator_id,
            listener_id=default_listener.id,
            endpoint_group_region=region,
            custom_routing_endpoint_group_name="terraform-example",
            description="terraform-example")
        default_custom_routing_endpoint = alicloud.ga.CustomRoutingEndpoint("defaultCustomRoutingEndpoint",
            endpoint_group_id=default_custom_routing_endpoint_group.id,
            endpoint=default_switch.id,
            type="PrivateSubNet",
            traffic_to_endpoint_policy="DenyAll")
        ```

        ## Import

        Global Accelerator (GA) Custom Routing Endpoint can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ga/customRoutingEndpoint:CustomRoutingEndpoint example <endpoint_group_id>:<custom_routing_endpoint_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] endpoint: The ID of the endpoint (vSwitch).
        :param pulumi.Input[str] endpoint_group_id: The ID of the endpoint group in which to create endpoints.
        :param pulumi.Input[str] traffic_to_endpoint_policy: The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
        :param pulumi.Input[str] type: The backend service type of the endpoint. Valid values: `PrivateSubNet`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CustomRoutingEndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Global Accelerator (GA) Custom Routing Endpoint resource.

        For information about Global Accelerator (GA) Custom Routing Endpoint and how to use it, see [What is Custom Routing Endpoint](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createcustomroutingendpoints).

        > **NOTE:** Available since v1.197.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        region = config.get("region")
        if region is None:
            region = "cn-hangzhou"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name="terraform-example",
            cidr_block="172.17.3.0/24")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vswitch_name="terraform-example",
            cidr_block="172.17.3.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[0].id)
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
        default_listener = alicloud.ga.Listener("defaultListener",
            accelerator_id=default_bandwidth_package_attachment.accelerator_id,
            listener_type="CustomRouting",
            port_ranges=[alicloud.ga.ListenerPortRangeArgs(
                from_port=10000,
                to_port=16000,
            )])
        default_custom_routing_endpoint_group = alicloud.ga.CustomRoutingEndpointGroup("defaultCustomRoutingEndpointGroup",
            accelerator_id=default_listener.accelerator_id,
            listener_id=default_listener.id,
            endpoint_group_region=region,
            custom_routing_endpoint_group_name="terraform-example",
            description="terraform-example")
        default_custom_routing_endpoint = alicloud.ga.CustomRoutingEndpoint("defaultCustomRoutingEndpoint",
            endpoint_group_id=default_custom_routing_endpoint_group.id,
            endpoint=default_switch.id,
            type="PrivateSubNet",
            traffic_to_endpoint_policy="DenyAll")
        ```

        ## Import

        Global Accelerator (GA) Custom Routing Endpoint can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ga/customRoutingEndpoint:CustomRoutingEndpoint example <endpoint_group_id>:<custom_routing_endpoint_id>
        ```

        :param str resource_name: The name of the resource.
        :param CustomRoutingEndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CustomRoutingEndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            CustomRoutingEndpointArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 endpoint_group_id: Optional[pulumi.Input[str]] = None,
                 traffic_to_endpoint_policy: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CustomRoutingEndpointArgs.__new__(CustomRoutingEndpointArgs)

            if endpoint is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint'")
            __props__.__dict__["endpoint"] = endpoint
            if endpoint_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint_group_id'")
            __props__.__dict__["endpoint_group_id"] = endpoint_group_id
            __props__.__dict__["traffic_to_endpoint_policy"] = traffic_to_endpoint_policy
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["accelerator_id"] = None
            __props__.__dict__["custom_routing_endpoint_id"] = None
            __props__.__dict__["listener_id"] = None
            __props__.__dict__["status"] = None
        super(CustomRoutingEndpoint, __self__).__init__(
            'alicloud:ga/customRoutingEndpoint:CustomRoutingEndpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accelerator_id: Optional[pulumi.Input[str]] = None,
            custom_routing_endpoint_id: Optional[pulumi.Input[str]] = None,
            endpoint: Optional[pulumi.Input[str]] = None,
            endpoint_group_id: Optional[pulumi.Input[str]] = None,
            listener_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            traffic_to_endpoint_policy: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'CustomRoutingEndpoint':
        """
        Get an existing CustomRoutingEndpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accelerator_id: The ID of the GA instance with which the endpoint is associated.
        :param pulumi.Input[str] custom_routing_endpoint_id: The ID of the Custom Routing Endpoint.
        :param pulumi.Input[str] endpoint: The ID of the endpoint (vSwitch).
        :param pulumi.Input[str] endpoint_group_id: The ID of the endpoint group in which to create endpoints.
        :param pulumi.Input[str] listener_id: The ID of the listener with which the endpoint is associated.
        :param pulumi.Input[str] status: The status of the Custom Routing Endpoint.
        :param pulumi.Input[str] traffic_to_endpoint_policy: The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
        :param pulumi.Input[str] type: The backend service type of the endpoint. Valid values: `PrivateSubNet`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CustomRoutingEndpointState.__new__(_CustomRoutingEndpointState)

        __props__.__dict__["accelerator_id"] = accelerator_id
        __props__.__dict__["custom_routing_endpoint_id"] = custom_routing_endpoint_id
        __props__.__dict__["endpoint"] = endpoint
        __props__.__dict__["endpoint_group_id"] = endpoint_group_id
        __props__.__dict__["listener_id"] = listener_id
        __props__.__dict__["status"] = status
        __props__.__dict__["traffic_to_endpoint_policy"] = traffic_to_endpoint_policy
        __props__.__dict__["type"] = type
        return CustomRoutingEndpoint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> pulumi.Output[str]:
        """
        The ID of the GA instance with which the endpoint is associated.
        """
        return pulumi.get(self, "accelerator_id")

    @property
    @pulumi.getter(name="customRoutingEndpointId")
    def custom_routing_endpoint_id(self) -> pulumi.Output[str]:
        """
        The ID of the Custom Routing Endpoint.
        """
        return pulumi.get(self, "custom_routing_endpoint_id")

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[str]:
        """
        The ID of the endpoint (vSwitch).
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter(name="endpointGroupId")
    def endpoint_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the endpoint group in which to create endpoints.
        """
        return pulumi.get(self, "endpoint_group_id")

    @property
    @pulumi.getter(name="listenerId")
    def listener_id(self) -> pulumi.Output[str]:
        """
        The ID of the listener with which the endpoint is associated.
        """
        return pulumi.get(self, "listener_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the Custom Routing Endpoint.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="trafficToEndpointPolicy")
    def traffic_to_endpoint_policy(self) -> pulumi.Output[str]:
        """
        The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
        """
        return pulumi.get(self, "traffic_to_endpoint_policy")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The backend service type of the endpoint. Valid values: `PrivateSubNet`.
        """
        return pulumi.get(self, "type")

