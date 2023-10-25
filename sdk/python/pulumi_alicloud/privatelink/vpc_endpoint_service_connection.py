# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VpcEndpointServiceConnectionArgs', 'VpcEndpointServiceConnection']

@pulumi.input_type
class VpcEndpointServiceConnectionArgs:
    def __init__(__self__, *,
                 endpoint_id: pulumi.Input[str],
                 service_id: pulumi.Input[str],
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a VpcEndpointServiceConnection resource.
        :param pulumi.Input[str] endpoint_id: The ID of the Vpc Endpoint.
        :param pulumi.Input[str] service_id: The ID of the Vpc Endpoint Service.
        :param pulumi.Input[int] bandwidth: The Bandwidth.
        :param pulumi.Input[bool] dry_run: The dry run.
        """
        VpcEndpointServiceConnectionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            endpoint_id=endpoint_id,
            service_id=service_id,
            bandwidth=bandwidth,
            dry_run=dry_run,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             endpoint_id: Optional[pulumi.Input[str]] = None,
             service_id: Optional[pulumi.Input[str]] = None,
             bandwidth: Optional[pulumi.Input[int]] = None,
             dry_run: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if endpoint_id is None and 'endpointId' in kwargs:
            endpoint_id = kwargs['endpointId']
        if endpoint_id is None:
            raise TypeError("Missing 'endpoint_id' argument")
        if service_id is None and 'serviceId' in kwargs:
            service_id = kwargs['serviceId']
        if service_id is None:
            raise TypeError("Missing 'service_id' argument")
        if dry_run is None and 'dryRun' in kwargs:
            dry_run = kwargs['dryRun']

        _setter("endpoint_id", endpoint_id)
        _setter("service_id", service_id)
        if bandwidth is not None:
            _setter("bandwidth", bandwidth)
        if dry_run is not None:
            _setter("dry_run", dry_run)

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> pulumi.Input[str]:
        """
        The ID of the Vpc Endpoint.
        """
        return pulumi.get(self, "endpoint_id")

    @endpoint_id.setter
    def endpoint_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "endpoint_id", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Input[str]:
        """
        The ID of the Vpc Endpoint Service.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_id", value)

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
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)


@pulumi.input_type
class _VpcEndpointServiceConnectionState:
    def __init__(__self__, *,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 endpoint_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VpcEndpointServiceConnection resources.
        :param pulumi.Input[int] bandwidth: The Bandwidth.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] endpoint_id: The ID of the Vpc Endpoint.
        :param pulumi.Input[str] service_id: The ID of the Vpc Endpoint Service.
        :param pulumi.Input[str] status: The status of Vpc Endpoint Connection.
        """
        _VpcEndpointServiceConnectionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            bandwidth=bandwidth,
            dry_run=dry_run,
            endpoint_id=endpoint_id,
            service_id=service_id,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             bandwidth: Optional[pulumi.Input[int]] = None,
             dry_run: Optional[pulumi.Input[bool]] = None,
             endpoint_id: Optional[pulumi.Input[str]] = None,
             service_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if dry_run is None and 'dryRun' in kwargs:
            dry_run = kwargs['dryRun']
        if endpoint_id is None and 'endpointId' in kwargs:
            endpoint_id = kwargs['endpointId']
        if service_id is None and 'serviceId' in kwargs:
            service_id = kwargs['serviceId']

        if bandwidth is not None:
            _setter("bandwidth", bandwidth)
        if dry_run is not None:
            _setter("dry_run", dry_run)
        if endpoint_id is not None:
            _setter("endpoint_id", endpoint_id)
        if service_id is not None:
            _setter("service_id", service_id)
        if status is not None:
            _setter("status", status)

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
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Vpc Endpoint.
        """
        return pulumi.get(self, "endpoint_id")

    @endpoint_id.setter
    def endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_id", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Vpc Endpoint Service.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of Vpc Endpoint Connection.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class VpcEndpointServiceConnection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 endpoint_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Private Link Vpc Endpoint Connection resource.

        For information about Private Link Vpc Endpoint Connection and how to use it, see [What is Vpc Endpoint Connection](https://www.alibabacloud.com/help/en/privatelink/latest/api-privatelink-2020-04-15-enablevpcendpointzoneconnection).

        > **NOTE:** Available since v1.110.0.

        ## Import

        Private Link Vpc Endpoint Connection can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:privatelink/vpcEndpointServiceConnection:VpcEndpointServiceConnection example <service_id>:<endpoint_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] bandwidth: The Bandwidth.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] endpoint_id: The ID of the Vpc Endpoint.
        :param pulumi.Input[str] service_id: The ID of the Vpc Endpoint Service.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpcEndpointServiceConnectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Private Link Vpc Endpoint Connection resource.

        For information about Private Link Vpc Endpoint Connection and how to use it, see [What is Vpc Endpoint Connection](https://www.alibabacloud.com/help/en/privatelink/latest/api-privatelink-2020-04-15-enablevpcendpointzoneconnection).

        > **NOTE:** Available since v1.110.0.

        ## Import

        Private Link Vpc Endpoint Connection can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:privatelink/vpcEndpointServiceConnection:VpcEndpointServiceConnection example <service_id>:<endpoint_id>
        ```

        :param str resource_name: The name of the resource.
        :param VpcEndpointServiceConnectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcEndpointServiceConnectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            VpcEndpointServiceConnectionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 endpoint_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcEndpointServiceConnectionArgs.__new__(VpcEndpointServiceConnectionArgs)

            __props__.__dict__["bandwidth"] = bandwidth
            __props__.__dict__["dry_run"] = dry_run
            if endpoint_id is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint_id'")
            __props__.__dict__["endpoint_id"] = endpoint_id
            if service_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_id'")
            __props__.__dict__["service_id"] = service_id
            __props__.__dict__["status"] = None
        super(VpcEndpointServiceConnection, __self__).__init__(
            'alicloud:privatelink/vpcEndpointServiceConnection:VpcEndpointServiceConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bandwidth: Optional[pulumi.Input[int]] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            endpoint_id: Optional[pulumi.Input[str]] = None,
            service_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'VpcEndpointServiceConnection':
        """
        Get an existing VpcEndpointServiceConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] bandwidth: The Bandwidth.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] endpoint_id: The ID of the Vpc Endpoint.
        :param pulumi.Input[str] service_id: The ID of the Vpc Endpoint Service.
        :param pulumi.Input[str] status: The status of Vpc Endpoint Connection.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcEndpointServiceConnectionState.__new__(_VpcEndpointServiceConnectionState)

        __props__.__dict__["bandwidth"] = bandwidth
        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["endpoint_id"] = endpoint_id
        __props__.__dict__["service_id"] = service_id
        __props__.__dict__["status"] = status
        return VpcEndpointServiceConnection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Output[int]:
        """
        The Bandwidth.
        """
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> pulumi.Output[str]:
        """
        The ID of the Vpc Endpoint.
        """
        return pulumi.get(self, "endpoint_id")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[str]:
        """
        The ID of the Vpc Endpoint Service.
        """
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of Vpc Endpoint Connection.
        """
        return pulumi.get(self, "status")

