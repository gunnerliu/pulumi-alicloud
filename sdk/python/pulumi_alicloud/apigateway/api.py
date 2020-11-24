# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Api']


class Api(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auth_type: Optional[pulumi.Input[str]] = None,
                 constant_parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiConstantParameterArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 fc_service_config: Optional[pulumi.Input[pulumi.InputType['ApiFcServiceConfigArgs']]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 http_service_config: Optional[pulumi.Input[pulumi.InputType['ApiHttpServiceConfigArgs']]] = None,
                 http_vpc_service_config: Optional[pulumi.Input[pulumi.InputType['ApiHttpVpcServiceConfigArgs']]] = None,
                 mock_service_config: Optional[pulumi.Input[pulumi.InputType['ApiMockServiceConfigArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 request_config: Optional[pulumi.Input[pulumi.InputType['ApiRequestConfigArgs']]] = None,
                 request_parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiRequestParameterArgs']]]]] = None,
                 service_type: Optional[pulumi.Input[str]] = None,
                 stage_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 system_parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiSystemParameterArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        Api gateway api can be imported using the id.Format to `<API Group Id>:<API Id>` e.g.

        ```sh
         $ pulumi import alicloud:apigateway/api:Api example "ab2351f2ce904edaa8d92a0510832b91:e4f728fca5a94148b023b99a3e5d0b62"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] auth_type: The authorization Type including APP and ANONYMOUS. Defaults to null.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiConstantParameterArgs']]]] constant_parameters: constant_parameters defines the constant parameters of the api.
        :param pulumi.Input[str] description: The description of Constant parameter.
        :param pulumi.Input[pulumi.InputType['ApiFcServiceConfigArgs']] fc_service_config: fc_service_config defines the config when service_type selected 'FunctionCompute'.
        :param pulumi.Input[str] group_id: The api gateway that the api belongs to. Defaults to null.
        :param pulumi.Input[pulumi.InputType['ApiHttpServiceConfigArgs']] http_service_config: http_service_config defines the config when service_type selected 'HTTP'.
        :param pulumi.Input[pulumi.InputType['ApiHttpVpcServiceConfigArgs']] http_vpc_service_config: http_vpc_service_config defines the config when service_type selected 'HTTP-VPC'.
        :param pulumi.Input[pulumi.InputType['ApiMockServiceConfigArgs']] mock_service_config: http_service_config defines the config when service_type selected 'MOCK'.
        :param pulumi.Input[str] name: System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html)
        :param pulumi.Input[pulumi.InputType['ApiRequestConfigArgs']] request_config: Request_config defines how users can send requests to your API.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiRequestParameterArgs']]]] request_parameters: request_parameters defines the request parameters of the api.
        :param pulumi.Input[str] service_type: The type of backend service. Type including HTTP,VPC and MOCK. Defaults to null.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] stage_names: Stages that the api need to be deployed. Valid value: RELEASE | PRE | TEST.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiSystemParameterArgs']]]] system_parameters: system_parameters defines the system parameters of the api.
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

            if auth_type is None:
                raise TypeError("Missing required property 'auth_type'")
            __props__['auth_type'] = auth_type
            __props__['constant_parameters'] = constant_parameters
            if description is None:
                raise TypeError("Missing required property 'description'")
            __props__['description'] = description
            __props__['fc_service_config'] = fc_service_config
            if group_id is None:
                raise TypeError("Missing required property 'group_id'")
            __props__['group_id'] = group_id
            __props__['http_service_config'] = http_service_config
            __props__['http_vpc_service_config'] = http_vpc_service_config
            __props__['mock_service_config'] = mock_service_config
            __props__['name'] = name
            if request_config is None:
                raise TypeError("Missing required property 'request_config'")
            __props__['request_config'] = request_config
            __props__['request_parameters'] = request_parameters
            if service_type is None:
                raise TypeError("Missing required property 'service_type'")
            __props__['service_type'] = service_type
            __props__['stage_names'] = stage_names
            __props__['system_parameters'] = system_parameters
            __props__['api_id'] = None
        super(Api, __self__).__init__(
            'alicloud:apigateway/api:Api',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_id: Optional[pulumi.Input[str]] = None,
            auth_type: Optional[pulumi.Input[str]] = None,
            constant_parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiConstantParameterArgs']]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            fc_service_config: Optional[pulumi.Input[pulumi.InputType['ApiFcServiceConfigArgs']]] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            http_service_config: Optional[pulumi.Input[pulumi.InputType['ApiHttpServiceConfigArgs']]] = None,
            http_vpc_service_config: Optional[pulumi.Input[pulumi.InputType['ApiHttpVpcServiceConfigArgs']]] = None,
            mock_service_config: Optional[pulumi.Input[pulumi.InputType['ApiMockServiceConfigArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            request_config: Optional[pulumi.Input[pulumi.InputType['ApiRequestConfigArgs']]] = None,
            request_parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiRequestParameterArgs']]]]] = None,
            service_type: Optional[pulumi.Input[str]] = None,
            stage_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            system_parameters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiSystemParameterArgs']]]]] = None) -> 'Api':
        """
        Get an existing Api resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_id: The ID of the api of api gateway.
        :param pulumi.Input[str] auth_type: The authorization Type including APP and ANONYMOUS. Defaults to null.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiConstantParameterArgs']]]] constant_parameters: constant_parameters defines the constant parameters of the api.
        :param pulumi.Input[str] description: The description of Constant parameter.
        :param pulumi.Input[pulumi.InputType['ApiFcServiceConfigArgs']] fc_service_config: fc_service_config defines the config when service_type selected 'FunctionCompute'.
        :param pulumi.Input[str] group_id: The api gateway that the api belongs to. Defaults to null.
        :param pulumi.Input[pulumi.InputType['ApiHttpServiceConfigArgs']] http_service_config: http_service_config defines the config when service_type selected 'HTTP'.
        :param pulumi.Input[pulumi.InputType['ApiHttpVpcServiceConfigArgs']] http_vpc_service_config: http_vpc_service_config defines the config when service_type selected 'HTTP-VPC'.
        :param pulumi.Input[pulumi.InputType['ApiMockServiceConfigArgs']] mock_service_config: http_service_config defines the config when service_type selected 'MOCK'.
        :param pulumi.Input[str] name: System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html)
        :param pulumi.Input[pulumi.InputType['ApiRequestConfigArgs']] request_config: Request_config defines how users can send requests to your API.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiRequestParameterArgs']]]] request_parameters: request_parameters defines the request parameters of the api.
        :param pulumi.Input[str] service_type: The type of backend service. Type including HTTP,VPC and MOCK. Defaults to null.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] stage_names: Stages that the api need to be deployed. Valid value: RELEASE | PRE | TEST.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiSystemParameterArgs']]]] system_parameters: system_parameters defines the system parameters of the api.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["api_id"] = api_id
        __props__["auth_type"] = auth_type
        __props__["constant_parameters"] = constant_parameters
        __props__["description"] = description
        __props__["fc_service_config"] = fc_service_config
        __props__["group_id"] = group_id
        __props__["http_service_config"] = http_service_config
        __props__["http_vpc_service_config"] = http_vpc_service_config
        __props__["mock_service_config"] = mock_service_config
        __props__["name"] = name
        __props__["request_config"] = request_config
        __props__["request_parameters"] = request_parameters
        __props__["service_type"] = service_type
        __props__["stage_names"] = stage_names
        __props__["system_parameters"] = system_parameters
        return Api(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiId")
    def api_id(self) -> pulumi.Output[str]:
        """
        The ID of the api of api gateway.
        """
        return pulumi.get(self, "api_id")

    @property
    @pulumi.getter(name="authType")
    def auth_type(self) -> pulumi.Output[str]:
        """
        The authorization Type including APP and ANONYMOUS. Defaults to null.
        """
        return pulumi.get(self, "auth_type")

    @property
    @pulumi.getter(name="constantParameters")
    def constant_parameters(self) -> pulumi.Output[Optional[Sequence['outputs.ApiConstantParameter']]]:
        """
        constant_parameters defines the constant parameters of the api.
        """
        return pulumi.get(self, "constant_parameters")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of Constant parameter.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="fcServiceConfig")
    def fc_service_config(self) -> pulumi.Output[Optional['outputs.ApiFcServiceConfig']]:
        """
        fc_service_config defines the config when service_type selected 'FunctionCompute'.
        """
        return pulumi.get(self, "fc_service_config")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        The api gateway that the api belongs to. Defaults to null.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="httpServiceConfig")
    def http_service_config(self) -> pulumi.Output[Optional['outputs.ApiHttpServiceConfig']]:
        """
        http_service_config defines the config when service_type selected 'HTTP'.
        """
        return pulumi.get(self, "http_service_config")

    @property
    @pulumi.getter(name="httpVpcServiceConfig")
    def http_vpc_service_config(self) -> pulumi.Output[Optional['outputs.ApiHttpVpcServiceConfig']]:
        """
        http_vpc_service_config defines the config when service_type selected 'HTTP-VPC'.
        """
        return pulumi.get(self, "http_vpc_service_config")

    @property
    @pulumi.getter(name="mockServiceConfig")
    def mock_service_config(self) -> pulumi.Output[Optional['outputs.ApiMockServiceConfig']]:
        """
        http_service_config defines the config when service_type selected 'MOCK'.
        """
        return pulumi.get(self, "mock_service_config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="requestConfig")
    def request_config(self) -> pulumi.Output['outputs.ApiRequestConfig']:
        """
        Request_config defines how users can send requests to your API.
        """
        return pulumi.get(self, "request_config")

    @property
    @pulumi.getter(name="requestParameters")
    def request_parameters(self) -> pulumi.Output[Optional[Sequence['outputs.ApiRequestParameter']]]:
        """
        request_parameters defines the request parameters of the api.
        """
        return pulumi.get(self, "request_parameters")

    @property
    @pulumi.getter(name="serviceType")
    def service_type(self) -> pulumi.Output[str]:
        """
        The type of backend service. Type including HTTP,VPC and MOCK. Defaults to null.
        """
        return pulumi.get(self, "service_type")

    @property
    @pulumi.getter(name="stageNames")
    def stage_names(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Stages that the api need to be deployed. Valid value: RELEASE | PRE | TEST.
        """
        return pulumi.get(self, "stage_names")

    @property
    @pulumi.getter(name="systemParameters")
    def system_parameters(self) -> pulumi.Output[Optional[Sequence['outputs.ApiSystemParameter']]]:
        """
        system_parameters defines the system parameters of the api.
        """
        return pulumi.get(self, "system_parameters")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

