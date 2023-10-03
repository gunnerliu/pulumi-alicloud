# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ApiDestinationArgs', 'ApiDestination']

@pulumi.input_type
class ApiDestinationArgs:
    def __init__(__self__, *,
                 api_destination_name: pulumi.Input[str],
                 connection_name: pulumi.Input[str],
                 http_api_parameters: pulumi.Input['ApiDestinationHttpApiParametersArgs'],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ApiDestination resource.
        :param pulumi.Input[str] api_destination_name: The name of the API destination.
        :param pulumi.Input[str] connection_name: The name of the connection.
        :param pulumi.Input['ApiDestinationHttpApiParametersArgs'] http_api_parameters: The parameters that are configured for the API destination. See `http_api_parameters` below.
        :param pulumi.Input[str] description: The description of the API destination.
        """
        ApiDestinationArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            api_destination_name=api_destination_name,
            connection_name=connection_name,
            http_api_parameters=http_api_parameters,
            description=description,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             api_destination_name: pulumi.Input[str],
             connection_name: pulumi.Input[str],
             http_api_parameters: pulumi.Input['ApiDestinationHttpApiParametersArgs'],
             description: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("api_destination_name", api_destination_name)
        _setter("connection_name", connection_name)
        _setter("http_api_parameters", http_api_parameters)
        if description is not None:
            _setter("description", description)

    @property
    @pulumi.getter(name="apiDestinationName")
    def api_destination_name(self) -> pulumi.Input[str]:
        """
        The name of the API destination.
        """
        return pulumi.get(self, "api_destination_name")

    @api_destination_name.setter
    def api_destination_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "api_destination_name", value)

    @property
    @pulumi.getter(name="connectionName")
    def connection_name(self) -> pulumi.Input[str]:
        """
        The name of the connection.
        """
        return pulumi.get(self, "connection_name")

    @connection_name.setter
    def connection_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "connection_name", value)

    @property
    @pulumi.getter(name="httpApiParameters")
    def http_api_parameters(self) -> pulumi.Input['ApiDestinationHttpApiParametersArgs']:
        """
        The parameters that are configured for the API destination. See `http_api_parameters` below.
        """
        return pulumi.get(self, "http_api_parameters")

    @http_api_parameters.setter
    def http_api_parameters(self, value: pulumi.Input['ApiDestinationHttpApiParametersArgs']):
        pulumi.set(self, "http_api_parameters", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the API destination.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _ApiDestinationState:
    def __init__(__self__, *,
                 api_destination_name: Optional[pulumi.Input[str]] = None,
                 connection_name: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 http_api_parameters: Optional[pulumi.Input['ApiDestinationHttpApiParametersArgs']] = None):
        """
        Input properties used for looking up and filtering ApiDestination resources.
        :param pulumi.Input[str] api_destination_name: The name of the API destination.
        :param pulumi.Input[str] connection_name: The name of the connection.
        :param pulumi.Input[int] create_time: The creation time of the Api Destination.
        :param pulumi.Input[str] description: The description of the API destination.
        :param pulumi.Input['ApiDestinationHttpApiParametersArgs'] http_api_parameters: The parameters that are configured for the API destination. See `http_api_parameters` below.
        """
        _ApiDestinationState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            api_destination_name=api_destination_name,
            connection_name=connection_name,
            create_time=create_time,
            description=description,
            http_api_parameters=http_api_parameters,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             api_destination_name: Optional[pulumi.Input[str]] = None,
             connection_name: Optional[pulumi.Input[str]] = None,
             create_time: Optional[pulumi.Input[int]] = None,
             description: Optional[pulumi.Input[str]] = None,
             http_api_parameters: Optional[pulumi.Input['ApiDestinationHttpApiParametersArgs']] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if api_destination_name is not None:
            _setter("api_destination_name", api_destination_name)
        if connection_name is not None:
            _setter("connection_name", connection_name)
        if create_time is not None:
            _setter("create_time", create_time)
        if description is not None:
            _setter("description", description)
        if http_api_parameters is not None:
            _setter("http_api_parameters", http_api_parameters)

    @property
    @pulumi.getter(name="apiDestinationName")
    def api_destination_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the API destination.
        """
        return pulumi.get(self, "api_destination_name")

    @api_destination_name.setter
    def api_destination_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_destination_name", value)

    @property
    @pulumi.getter(name="connectionName")
    def connection_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the connection.
        """
        return pulumi.get(self, "connection_name")

    @connection_name.setter
    def connection_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_name", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[int]]:
        """
        The creation time of the Api Destination.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the API destination.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="httpApiParameters")
    def http_api_parameters(self) -> Optional[pulumi.Input['ApiDestinationHttpApiParametersArgs']]:
        """
        The parameters that are configured for the API destination. See `http_api_parameters` below.
        """
        return pulumi.get(self, "http_api_parameters")

    @http_api_parameters.setter
    def http_api_parameters(self, value: Optional[pulumi.Input['ApiDestinationHttpApiParametersArgs']]):
        pulumi.set(self, "http_api_parameters", value)


class ApiDestination(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_destination_name: Optional[pulumi.Input[str]] = None,
                 connection_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 http_api_parameters: Optional[pulumi.Input[pulumi.InputType['ApiDestinationHttpApiParametersArgs']]] = None,
                 __props__=None):
        """
        Provides a Event Bridge Api Destination resource.

        For information about Event Bridge Api Destination and how to use it, see [What is Api Destination](https://www.alibabacloud.com/help/en/eventbridge/latest/api-eventbridge-2020-04-01-createapidestination).

        > **NOTE:** Available since v1.211.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        region = config.get("region")
        if region is None:
            region = "cn-chengdu"
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_connection = alicloud.eventbridge.Connection("defaultConnection",
            connection_name=name,
            network_parameters=alicloud.eventbridge.ConnectionNetworkParametersArgs(
                network_type="PublicNetwork",
            ))
        default_api_destination = alicloud.eventbridge.ApiDestination("defaultApiDestination",
            connection_name=default_connection.connection_name,
            api_destination_name=name,
            description="test-api-destination-connection",
            http_api_parameters=alicloud.eventbridge.ApiDestinationHttpApiParametersArgs(
                endpoint="http://127.0.0.1:8001",
                method="POST",
            ))
        ```

        ## Import

        Event Bridge Api Destination can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:eventbridge/apiDestination:ApiDestination example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_destination_name: The name of the API destination.
        :param pulumi.Input[str] connection_name: The name of the connection.
        :param pulumi.Input[str] description: The description of the API destination.
        :param pulumi.Input[pulumi.InputType['ApiDestinationHttpApiParametersArgs']] http_api_parameters: The parameters that are configured for the API destination. See `http_api_parameters` below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApiDestinationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Event Bridge Api Destination resource.

        For information about Event Bridge Api Destination and how to use it, see [What is Api Destination](https://www.alibabacloud.com/help/en/eventbridge/latest/api-eventbridge-2020-04-01-createapidestination).

        > **NOTE:** Available since v1.211.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        region = config.get("region")
        if region is None:
            region = "cn-chengdu"
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_connection = alicloud.eventbridge.Connection("defaultConnection",
            connection_name=name,
            network_parameters=alicloud.eventbridge.ConnectionNetworkParametersArgs(
                network_type="PublicNetwork",
            ))
        default_api_destination = alicloud.eventbridge.ApiDestination("defaultApiDestination",
            connection_name=default_connection.connection_name,
            api_destination_name=name,
            description="test-api-destination-connection",
            http_api_parameters=alicloud.eventbridge.ApiDestinationHttpApiParametersArgs(
                endpoint="http://127.0.0.1:8001",
                method="POST",
            ))
        ```

        ## Import

        Event Bridge Api Destination can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:eventbridge/apiDestination:ApiDestination example <id>
        ```

        :param str resource_name: The name of the resource.
        :param ApiDestinationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApiDestinationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ApiDestinationArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_destination_name: Optional[pulumi.Input[str]] = None,
                 connection_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 http_api_parameters: Optional[pulumi.Input[pulumi.InputType['ApiDestinationHttpApiParametersArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApiDestinationArgs.__new__(ApiDestinationArgs)

            if api_destination_name is None and not opts.urn:
                raise TypeError("Missing required property 'api_destination_name'")
            __props__.__dict__["api_destination_name"] = api_destination_name
            if connection_name is None and not opts.urn:
                raise TypeError("Missing required property 'connection_name'")
            __props__.__dict__["connection_name"] = connection_name
            __props__.__dict__["description"] = description
            if http_api_parameters is not None and not isinstance(http_api_parameters, ApiDestinationHttpApiParametersArgs):
                http_api_parameters = http_api_parameters or {}
                def _setter(key, value):
                    http_api_parameters[key] = value
                ApiDestinationHttpApiParametersArgs._configure(_setter, **http_api_parameters)
            if http_api_parameters is None and not opts.urn:
                raise TypeError("Missing required property 'http_api_parameters'")
            __props__.__dict__["http_api_parameters"] = http_api_parameters
            __props__.__dict__["create_time"] = None
        super(ApiDestination, __self__).__init__(
            'alicloud:eventbridge/apiDestination:ApiDestination',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_destination_name: Optional[pulumi.Input[str]] = None,
            connection_name: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[int]] = None,
            description: Optional[pulumi.Input[str]] = None,
            http_api_parameters: Optional[pulumi.Input[pulumi.InputType['ApiDestinationHttpApiParametersArgs']]] = None) -> 'ApiDestination':
        """
        Get an existing ApiDestination resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_destination_name: The name of the API destination.
        :param pulumi.Input[str] connection_name: The name of the connection.
        :param pulumi.Input[int] create_time: The creation time of the Api Destination.
        :param pulumi.Input[str] description: The description of the API destination.
        :param pulumi.Input[pulumi.InputType['ApiDestinationHttpApiParametersArgs']] http_api_parameters: The parameters that are configured for the API destination. See `http_api_parameters` below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApiDestinationState.__new__(_ApiDestinationState)

        __props__.__dict__["api_destination_name"] = api_destination_name
        __props__.__dict__["connection_name"] = connection_name
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["http_api_parameters"] = http_api_parameters
        return ApiDestination(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiDestinationName")
    def api_destination_name(self) -> pulumi.Output[str]:
        """
        The name of the API destination.
        """
        return pulumi.get(self, "api_destination_name")

    @property
    @pulumi.getter(name="connectionName")
    def connection_name(self) -> pulumi.Output[str]:
        """
        The name of the connection.
        """
        return pulumi.get(self, "connection_name")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[int]:
        """
        The creation time of the Api Destination.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the API destination.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="httpApiParameters")
    def http_api_parameters(self) -> pulumi.Output['outputs.ApiDestinationHttpApiParameters']:
        """
        The parameters that are configured for the API destination. See `http_api_parameters` below.
        """
        return pulumi.get(self, "http_api_parameters")

