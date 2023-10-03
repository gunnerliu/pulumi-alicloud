# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VpcEndpointArgs', 'VpcEndpoint']

@pulumi.input_type
class VpcEndpointArgs:
    def __init__(__self__, *,
                 security_group_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 vpc_id: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 endpoint_description: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 vpc_endpoint_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a VpcEndpoint resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The security group associated with the terminal node network card.
        :param pulumi.Input[str] vpc_id: The private network to which the terminal node belongs.
        :param pulumi.Input[bool] dry_run: The dry run. Default to: `false`.
        :param pulumi.Input[str] endpoint_description: The description of Vpc Endpoint. The length is 2~256 characters and cannot start with `http://` and `https://`.
        :param pulumi.Input[str] service_id: The terminal node service associated with the terminal node.
        :param pulumi.Input[str] service_name: The name of the terminal node service associated with the terminal node.
        :param pulumi.Input[str] vpc_endpoint_name: The name of Vpc Endpoint. The length is between 2 and 128 characters, starting with English letters or Chinese, and can include numbers, hyphens (-) and underscores (_).
        """
        VpcEndpointArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            security_group_ids=security_group_ids,
            vpc_id=vpc_id,
            dry_run=dry_run,
            endpoint_description=endpoint_description,
            service_id=service_id,
            service_name=service_name,
            vpc_endpoint_name=vpc_endpoint_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             security_group_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
             vpc_id: pulumi.Input[str],
             dry_run: Optional[pulumi.Input[bool]] = None,
             endpoint_description: Optional[pulumi.Input[str]] = None,
             service_id: Optional[pulumi.Input[str]] = None,
             service_name: Optional[pulumi.Input[str]] = None,
             vpc_endpoint_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("security_group_ids", security_group_ids)
        _setter("vpc_id", vpc_id)
        if dry_run is not None:
            _setter("dry_run", dry_run)
        if endpoint_description is not None:
            _setter("endpoint_description", endpoint_description)
        if service_id is not None:
            _setter("service_id", service_id)
        if service_name is not None:
            _setter("service_name", service_name)
        if vpc_endpoint_name is not None:
            _setter("vpc_endpoint_name", vpc_endpoint_name)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The security group associated with the terminal node network card.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        The private network to which the terminal node belongs.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run. Default to: `false`.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="endpointDescription")
    def endpoint_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of Vpc Endpoint. The length is 2~256 characters and cannot start with `http://` and `https://`.
        """
        return pulumi.get(self, "endpoint_description")

    @endpoint_description.setter
    def endpoint_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_description", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        """
        The terminal node service associated with the terminal node.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the terminal node service associated with the terminal node.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter(name="vpcEndpointName")
    def vpc_endpoint_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of Vpc Endpoint. The length is between 2 and 128 characters, starting with English letters or Chinese, and can include numbers, hyphens (-) and underscores (_).
        """
        return pulumi.get(self, "vpc_endpoint_name")

    @vpc_endpoint_name.setter
    def vpc_endpoint_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_endpoint_name", value)


@pulumi.input_type
class _VpcEndpointState:
    def __init__(__self__, *,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 connection_status: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 endpoint_business_status: Optional[pulumi.Input[str]] = None,
                 endpoint_description: Optional[pulumi.Input[str]] = None,
                 endpoint_domain: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 vpc_endpoint_name: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VpcEndpoint resources.
        :param pulumi.Input[int] bandwidth: The Bandwidth.
        :param pulumi.Input[str] connection_status: The status of Connection.
        :param pulumi.Input[bool] dry_run: The dry run. Default to: `false`.
        :param pulumi.Input[str] endpoint_business_status: The status of Endpoint Business.
        :param pulumi.Input[str] endpoint_description: The description of Vpc Endpoint. The length is 2~256 characters and cannot start with `http://` and `https://`.
        :param pulumi.Input[str] endpoint_domain: The Endpoint Domain.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The security group associated with the terminal node network card.
        :param pulumi.Input[str] service_id: The terminal node service associated with the terminal node.
        :param pulumi.Input[str] service_name: The name of the terminal node service associated with the terminal node.
        :param pulumi.Input[str] status: The status of Vpc Endpoint.
        :param pulumi.Input[str] vpc_endpoint_name: The name of Vpc Endpoint. The length is between 2 and 128 characters, starting with English letters or Chinese, and can include numbers, hyphens (-) and underscores (_).
        :param pulumi.Input[str] vpc_id: The private network to which the terminal node belongs.
        """
        _VpcEndpointState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            bandwidth=bandwidth,
            connection_status=connection_status,
            dry_run=dry_run,
            endpoint_business_status=endpoint_business_status,
            endpoint_description=endpoint_description,
            endpoint_domain=endpoint_domain,
            security_group_ids=security_group_ids,
            service_id=service_id,
            service_name=service_name,
            status=status,
            vpc_endpoint_name=vpc_endpoint_name,
            vpc_id=vpc_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             bandwidth: Optional[pulumi.Input[int]] = None,
             connection_status: Optional[pulumi.Input[str]] = None,
             dry_run: Optional[pulumi.Input[bool]] = None,
             endpoint_business_status: Optional[pulumi.Input[str]] = None,
             endpoint_description: Optional[pulumi.Input[str]] = None,
             endpoint_domain: Optional[pulumi.Input[str]] = None,
             security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             service_id: Optional[pulumi.Input[str]] = None,
             service_name: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             vpc_endpoint_name: Optional[pulumi.Input[str]] = None,
             vpc_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if bandwidth is not None:
            _setter("bandwidth", bandwidth)
        if connection_status is not None:
            _setter("connection_status", connection_status)
        if dry_run is not None:
            _setter("dry_run", dry_run)
        if endpoint_business_status is not None:
            _setter("endpoint_business_status", endpoint_business_status)
        if endpoint_description is not None:
            _setter("endpoint_description", endpoint_description)
        if endpoint_domain is not None:
            _setter("endpoint_domain", endpoint_domain)
        if security_group_ids is not None:
            _setter("security_group_ids", security_group_ids)
        if service_id is not None:
            _setter("service_id", service_id)
        if service_name is not None:
            _setter("service_name", service_name)
        if status is not None:
            _setter("status", status)
        if vpc_endpoint_name is not None:
            _setter("vpc_endpoint_name", vpc_endpoint_name)
        if vpc_id is not None:
            _setter("vpc_id", vpc_id)

    @property
    @pulumi.getter
    def bandwidth(self) -> Optional[pulumi.Input[int]]:
        """
        The Bandwidth.
        """
        return pulumi.get(self, "bandwidth")

    @bandwidth.setter
    def bandwidth(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "bandwidth", value)

    @property
    @pulumi.getter(name="connectionStatus")
    def connection_status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of Connection.
        """
        return pulumi.get(self, "connection_status")

    @connection_status.setter
    def connection_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_status", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run. Default to: `false`.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="endpointBusinessStatus")
    def endpoint_business_status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of Endpoint Business.
        """
        return pulumi.get(self, "endpoint_business_status")

    @endpoint_business_status.setter
    def endpoint_business_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_business_status", value)

    @property
    @pulumi.getter(name="endpointDescription")
    def endpoint_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of Vpc Endpoint. The length is 2~256 characters and cannot start with `http://` and `https://`.
        """
        return pulumi.get(self, "endpoint_description")

    @endpoint_description.setter
    def endpoint_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_description", value)

    @property
    @pulumi.getter(name="endpointDomain")
    def endpoint_domain(self) -> Optional[pulumi.Input[str]]:
        """
        The Endpoint Domain.
        """
        return pulumi.get(self, "endpoint_domain")

    @endpoint_domain.setter
    def endpoint_domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_domain", value)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The security group associated with the terminal node network card.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        """
        The terminal node service associated with the terminal node.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the terminal node service associated with the terminal node.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of Vpc Endpoint.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="vpcEndpointName")
    def vpc_endpoint_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of Vpc Endpoint. The length is between 2 and 128 characters, starting with English letters or Chinese, and can include numbers, hyphens (-) and underscores (_).
        """
        return pulumi.get(self, "vpc_endpoint_name")

    @vpc_endpoint_name.setter
    def vpc_endpoint_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_endpoint_name", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The private network to which the terminal node belongs.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class VpcEndpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 endpoint_description: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 vpc_endpoint_name: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Private Link Vpc Endpoint resource.

        For information about Private Link Vpc Endpoint and how to use it, see [What is Vpc Endpoint](https://www.alibabacloud.com/help/en/privatelink/latest/api-privatelink-2020-04-15-createvpcendpoint).

        > **NOTE:** Available since v1.109.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        example_vpc_endpoint_service = alicloud.privatelink.VpcEndpointService("exampleVpcEndpointService",
            service_description=name,
            connect_bandwidth=103,
            auto_accept_connection=False)
        example_network = alicloud.vpc.Network("exampleNetwork",
            vpc_name=name,
            cidr_block="10.0.0.0/8")
        example_security_group = alicloud.ecs.SecurityGroup("exampleSecurityGroup", vpc_id=example_network.id)
        example_vpc_endpoint = alicloud.privatelink.VpcEndpoint("exampleVpcEndpoint",
            service_id=example_vpc_endpoint_service.id,
            security_group_ids=[example_security_group.id],
            vpc_id=example_network.id,
            vpc_endpoint_name=name)
        ```

        ## Import

        Private Link Vpc Endpoint can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:privatelink/vpcEndpoint:VpcEndpoint example <endpoint_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: The dry run. Default to: `false`.
        :param pulumi.Input[str] endpoint_description: The description of Vpc Endpoint. The length is 2~256 characters and cannot start with `http://` and `https://`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The security group associated with the terminal node network card.
        :param pulumi.Input[str] service_id: The terminal node service associated with the terminal node.
        :param pulumi.Input[str] service_name: The name of the terminal node service associated with the terminal node.
        :param pulumi.Input[str] vpc_endpoint_name: The name of Vpc Endpoint. The length is between 2 and 128 characters, starting with English letters or Chinese, and can include numbers, hyphens (-) and underscores (_).
        :param pulumi.Input[str] vpc_id: The private network to which the terminal node belongs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpcEndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Private Link Vpc Endpoint resource.

        For information about Private Link Vpc Endpoint and how to use it, see [What is Vpc Endpoint](https://www.alibabacloud.com/help/en/privatelink/latest/api-privatelink-2020-04-15-createvpcendpoint).

        > **NOTE:** Available since v1.109.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        example_vpc_endpoint_service = alicloud.privatelink.VpcEndpointService("exampleVpcEndpointService",
            service_description=name,
            connect_bandwidth=103,
            auto_accept_connection=False)
        example_network = alicloud.vpc.Network("exampleNetwork",
            vpc_name=name,
            cidr_block="10.0.0.0/8")
        example_security_group = alicloud.ecs.SecurityGroup("exampleSecurityGroup", vpc_id=example_network.id)
        example_vpc_endpoint = alicloud.privatelink.VpcEndpoint("exampleVpcEndpoint",
            service_id=example_vpc_endpoint_service.id,
            security_group_ids=[example_security_group.id],
            vpc_id=example_network.id,
            vpc_endpoint_name=name)
        ```

        ## Import

        Private Link Vpc Endpoint can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:privatelink/vpcEndpoint:VpcEndpoint example <endpoint_id>
        ```

        :param str resource_name: The name of the resource.
        :param VpcEndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcEndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            VpcEndpointArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 endpoint_description: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 vpc_endpoint_name: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcEndpointArgs.__new__(VpcEndpointArgs)

            __props__.__dict__["dry_run"] = dry_run
            __props__.__dict__["endpoint_description"] = endpoint_description
            if security_group_ids is None and not opts.urn:
                raise TypeError("Missing required property 'security_group_ids'")
            __props__.__dict__["security_group_ids"] = security_group_ids
            __props__.__dict__["service_id"] = service_id
            __props__.__dict__["service_name"] = service_name
            __props__.__dict__["vpc_endpoint_name"] = vpc_endpoint_name
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["bandwidth"] = None
            __props__.__dict__["connection_status"] = None
            __props__.__dict__["endpoint_business_status"] = None
            __props__.__dict__["endpoint_domain"] = None
            __props__.__dict__["status"] = None
        super(VpcEndpoint, __self__).__init__(
            'alicloud:privatelink/vpcEndpoint:VpcEndpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bandwidth: Optional[pulumi.Input[int]] = None,
            connection_status: Optional[pulumi.Input[str]] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            endpoint_business_status: Optional[pulumi.Input[str]] = None,
            endpoint_description: Optional[pulumi.Input[str]] = None,
            endpoint_domain: Optional[pulumi.Input[str]] = None,
            security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            service_id: Optional[pulumi.Input[str]] = None,
            service_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            vpc_endpoint_name: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'VpcEndpoint':
        """
        Get an existing VpcEndpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] bandwidth: The Bandwidth.
        :param pulumi.Input[str] connection_status: The status of Connection.
        :param pulumi.Input[bool] dry_run: The dry run. Default to: `false`.
        :param pulumi.Input[str] endpoint_business_status: The status of Endpoint Business.
        :param pulumi.Input[str] endpoint_description: The description of Vpc Endpoint. The length is 2~256 characters and cannot start with `http://` and `https://`.
        :param pulumi.Input[str] endpoint_domain: The Endpoint Domain.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: The security group associated with the terminal node network card.
        :param pulumi.Input[str] service_id: The terminal node service associated with the terminal node.
        :param pulumi.Input[str] service_name: The name of the terminal node service associated with the terminal node.
        :param pulumi.Input[str] status: The status of Vpc Endpoint.
        :param pulumi.Input[str] vpc_endpoint_name: The name of Vpc Endpoint. The length is between 2 and 128 characters, starting with English letters or Chinese, and can include numbers, hyphens (-) and underscores (_).
        :param pulumi.Input[str] vpc_id: The private network to which the terminal node belongs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcEndpointState.__new__(_VpcEndpointState)

        __props__.__dict__["bandwidth"] = bandwidth
        __props__.__dict__["connection_status"] = connection_status
        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["endpoint_business_status"] = endpoint_business_status
        __props__.__dict__["endpoint_description"] = endpoint_description
        __props__.__dict__["endpoint_domain"] = endpoint_domain
        __props__.__dict__["security_group_ids"] = security_group_ids
        __props__.__dict__["service_id"] = service_id
        __props__.__dict__["service_name"] = service_name
        __props__.__dict__["status"] = status
        __props__.__dict__["vpc_endpoint_name"] = vpc_endpoint_name
        __props__.__dict__["vpc_id"] = vpc_id
        return VpcEndpoint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Output[int]:
        """
        The Bandwidth.
        """
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter(name="connectionStatus")
    def connection_status(self) -> pulumi.Output[str]:
        """
        The status of Connection.
        """
        return pulumi.get(self, "connection_status")

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        The dry run. Default to: `false`.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="endpointBusinessStatus")
    def endpoint_business_status(self) -> pulumi.Output[str]:
        """
        The status of Endpoint Business.
        """
        return pulumi.get(self, "endpoint_business_status")

    @property
    @pulumi.getter(name="endpointDescription")
    def endpoint_description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of Vpc Endpoint. The length is 2~256 characters and cannot start with `http://` and `https://`.
        """
        return pulumi.get(self, "endpoint_description")

    @property
    @pulumi.getter(name="endpointDomain")
    def endpoint_domain(self) -> pulumi.Output[str]:
        """
        The Endpoint Domain.
        """
        return pulumi.get(self, "endpoint_domain")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        The security group associated with the terminal node network card.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[Optional[str]]:
        """
        The terminal node service associated with the terminal node.
        """
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[str]:
        """
        The name of the terminal node service associated with the terminal node.
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of Vpc Endpoint.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vpcEndpointName")
    def vpc_endpoint_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of Vpc Endpoint. The length is between 2 and 128 characters, starting with English letters or Chinese, and can include numbers, hyphens (-) and underscores (_).
        """
        return pulumi.get(self, "vpc_endpoint_name")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The private network to which the terminal node belongs.
        """
        return pulumi.get(self, "vpc_id")

