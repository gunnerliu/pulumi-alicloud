# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'ApiConstantParameterArgs',
    'ApiFcServiceConfigArgs',
    'ApiHttpServiceConfigArgs',
    'ApiHttpVpcServiceConfigArgs',
    'ApiMockServiceConfigArgs',
    'ApiRequestConfigArgs',
    'ApiRequestParameterArgs',
    'ApiSystemParameterArgs',
]

@pulumi.input_type
class ApiConstantParameterArgs:
    def __init__(__self__, *,
                 in_: pulumi.Input[str],
                 name: pulumi.Input[str],
                 value: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] in_: Constant parameter location; values: 'HEAD' and 'QUERY'.
        :param pulumi.Input[str] name: Constant parameter name.
        :param pulumi.Input[str] value: Constant parameter value.
        :param pulumi.Input[str] description: The description of Constant parameter.
        """
        ApiConstantParameterArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            in_=in_,
            name=name,
            value=value,
            description=description,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             in_: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             value: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if in_ is None and 'in' in kwargs:
            in_ = kwargs['in']
        if in_ is None:
            raise TypeError("Missing 'in_' argument")
        if name is None:
            raise TypeError("Missing 'name' argument")
        if value is None:
            raise TypeError("Missing 'value' argument")

        _setter("in_", in_)
        _setter("name", name)
        _setter("value", value)
        if description is not None:
            _setter("description", description)

    @property
    @pulumi.getter(name="in")
    def in_(self) -> pulumi.Input[str]:
        """
        Constant parameter location; values: 'HEAD' and 'QUERY'.
        """
        return pulumi.get(self, "in_")

    @in_.setter
    def in_(self, value: pulumi.Input[str]):
        pulumi.set(self, "in_", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Constant parameter name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        Constant parameter value.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of Constant parameter.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class ApiFcServiceConfigArgs:
    def __init__(__self__, *,
                 function_name: pulumi.Input[str],
                 region: pulumi.Input[str],
                 service_name: pulumi.Input[str],
                 timeout: pulumi.Input[int],
                 arn_role: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] function_name: The function name of function compute service.
        :param pulumi.Input[str] region: The region that the function compute service belongs to.
        :param pulumi.Input[str] service_name: The service name of function compute service.
        :param pulumi.Input[int] timeout: Backend service time-out time; unit: millisecond.
        :param pulumi.Input[str] arn_role: RAM role arn attached to the Function Compute service. This governs both who / what can invoke your Function, as well as what resources our Function has access to. See [User Permissions](https://www.alibabacloud.com/help/doc-detail/52885.htm) for more details.
        """
        ApiFcServiceConfigArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            function_name=function_name,
            region=region,
            service_name=service_name,
            timeout=timeout,
            arn_role=arn_role,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             function_name: Optional[pulumi.Input[str]] = None,
             region: Optional[pulumi.Input[str]] = None,
             service_name: Optional[pulumi.Input[str]] = None,
             timeout: Optional[pulumi.Input[int]] = None,
             arn_role: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if function_name is None and 'functionName' in kwargs:
            function_name = kwargs['functionName']
        if function_name is None:
            raise TypeError("Missing 'function_name' argument")
        if region is None:
            raise TypeError("Missing 'region' argument")
        if service_name is None and 'serviceName' in kwargs:
            service_name = kwargs['serviceName']
        if service_name is None:
            raise TypeError("Missing 'service_name' argument")
        if timeout is None:
            raise TypeError("Missing 'timeout' argument")
        if arn_role is None and 'arnRole' in kwargs:
            arn_role = kwargs['arnRole']

        _setter("function_name", function_name)
        _setter("region", region)
        _setter("service_name", service_name)
        _setter("timeout", timeout)
        if arn_role is not None:
            _setter("arn_role", arn_role)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> pulumi.Input[str]:
        """
        The function name of function compute service.
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "function_name", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        The region that the function compute service belongs to.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[str]:
        """
        The service name of function compute service.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Input[int]:
        """
        Backend service time-out time; unit: millisecond.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: pulumi.Input[int]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter(name="arnRole")
    def arn_role(self) -> Optional[pulumi.Input[str]]:
        """
        RAM role arn attached to the Function Compute service. This governs both who / what can invoke your Function, as well as what resources our Function has access to. See [User Permissions](https://www.alibabacloud.com/help/doc-detail/52885.htm) for more details.
        """
        return pulumi.get(self, "arn_role")

    @arn_role.setter
    def arn_role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn_role", value)


@pulumi.input_type
class ApiHttpServiceConfigArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[str],
                 method: pulumi.Input[str],
                 path: pulumi.Input[str],
                 timeout: pulumi.Input[int],
                 aone_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] address: The address of backend service.
        :param pulumi.Input[str] method: The http method of backend service.
        :param pulumi.Input[str] path: The path of backend service.
        :param pulumi.Input[int] timeout: Backend service time-out time; unit: millisecond.
        :param pulumi.Input[str] aone_name: The name of aone.
        """
        ApiHttpServiceConfigArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            address=address,
            method=method,
            path=path,
            timeout=timeout,
            aone_name=aone_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             address: Optional[pulumi.Input[str]] = None,
             method: Optional[pulumi.Input[str]] = None,
             path: Optional[pulumi.Input[str]] = None,
             timeout: Optional[pulumi.Input[int]] = None,
             aone_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if address is None:
            raise TypeError("Missing 'address' argument")
        if method is None:
            raise TypeError("Missing 'method' argument")
        if path is None:
            raise TypeError("Missing 'path' argument")
        if timeout is None:
            raise TypeError("Missing 'timeout' argument")
        if aone_name is None and 'aoneName' in kwargs:
            aone_name = kwargs['aoneName']

        _setter("address", address)
        _setter("method", method)
        _setter("path", path)
        _setter("timeout", timeout)
        if aone_name is not None:
            _setter("aone_name", aone_name)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Input[str]:
        """
        The address of backend service.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[str]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def method(self) -> pulumi.Input[str]:
        """
        The http method of backend service.
        """
        return pulumi.get(self, "method")

    @method.setter
    def method(self, value: pulumi.Input[str]):
        pulumi.set(self, "method", value)

    @property
    @pulumi.getter
    def path(self) -> pulumi.Input[str]:
        """
        The path of backend service.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: pulumi.Input[str]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Input[int]:
        """
        Backend service time-out time; unit: millisecond.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: pulumi.Input[int]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter(name="aoneName")
    def aone_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of aone.
        """
        return pulumi.get(self, "aone_name")

    @aone_name.setter
    def aone_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aone_name", value)


@pulumi.input_type
class ApiHttpVpcServiceConfigArgs:
    def __init__(__self__, *,
                 method: pulumi.Input[str],
                 name: pulumi.Input[str],
                 path: pulumi.Input[str],
                 timeout: pulumi.Input[int],
                 aone_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] method: The http method of backend service.
        :param pulumi.Input[str] name: The name of vpc instance.
        :param pulumi.Input[str] path: The path of backend service.
        :param pulumi.Input[int] timeout: Backend service time-out time. Unit: millisecond.
        :param pulumi.Input[str] aone_name: The name of aone.
        """
        ApiHttpVpcServiceConfigArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            method=method,
            name=name,
            path=path,
            timeout=timeout,
            aone_name=aone_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             method: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             path: Optional[pulumi.Input[str]] = None,
             timeout: Optional[pulumi.Input[int]] = None,
             aone_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if method is None:
            raise TypeError("Missing 'method' argument")
        if name is None:
            raise TypeError("Missing 'name' argument")
        if path is None:
            raise TypeError("Missing 'path' argument")
        if timeout is None:
            raise TypeError("Missing 'timeout' argument")
        if aone_name is None and 'aoneName' in kwargs:
            aone_name = kwargs['aoneName']

        _setter("method", method)
        _setter("name", name)
        _setter("path", path)
        _setter("timeout", timeout)
        if aone_name is not None:
            _setter("aone_name", aone_name)

    @property
    @pulumi.getter
    def method(self) -> pulumi.Input[str]:
        """
        The http method of backend service.
        """
        return pulumi.get(self, "method")

    @method.setter
    def method(self, value: pulumi.Input[str]):
        pulumi.set(self, "method", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of vpc instance.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def path(self) -> pulumi.Input[str]:
        """
        The path of backend service.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: pulumi.Input[str]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Input[int]:
        """
        Backend service time-out time. Unit: millisecond.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: pulumi.Input[int]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter(name="aoneName")
    def aone_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of aone.
        """
        return pulumi.get(self, "aone_name")

    @aone_name.setter
    def aone_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aone_name", value)


@pulumi.input_type
class ApiMockServiceConfigArgs:
    def __init__(__self__, *,
                 result: pulumi.Input[str],
                 aone_name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] result: The result of the mock service.
        :param pulumi.Input[str] aone_name: The name of aone.
        """
        ApiMockServiceConfigArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            result=result,
            aone_name=aone_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             result: Optional[pulumi.Input[str]] = None,
             aone_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if result is None:
            raise TypeError("Missing 'result' argument")
        if aone_name is None and 'aoneName' in kwargs:
            aone_name = kwargs['aoneName']

        _setter("result", result)
        if aone_name is not None:
            _setter("aone_name", aone_name)

    @property
    @pulumi.getter
    def result(self) -> pulumi.Input[str]:
        """
        The result of the mock service.
        """
        return pulumi.get(self, "result")

    @result.setter
    def result(self, value: pulumi.Input[str]):
        pulumi.set(self, "result", value)

    @property
    @pulumi.getter(name="aoneName")
    def aone_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of aone.
        """
        return pulumi.get(self, "aone_name")

    @aone_name.setter
    def aone_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aone_name", value)


@pulumi.input_type
class ApiRequestConfigArgs:
    def __init__(__self__, *,
                 method: pulumi.Input[str],
                 mode: pulumi.Input[str],
                 path: pulumi.Input[str],
                 protocol: pulumi.Input[str],
                 body_format: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] method: The method of the api, including 'GET','POST','PUT' etc.
        :param pulumi.Input[str] mode: The mode of the parameters between request parameters and service parameters, which support the values of 'MAPPING' and 'PASSTHROUGH'.
        :param pulumi.Input[str] path: The request path of the api.
        :param pulumi.Input[str] protocol: The protocol of api which supports values of 'HTTP','HTTPS' or 'HTTP,HTTPS'.
        :param pulumi.Input[str] body_format: The body format of the api, which support the values of 'STREAM' and 'FORM'.
        """
        ApiRequestConfigArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            method=method,
            mode=mode,
            path=path,
            protocol=protocol,
            body_format=body_format,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             method: Optional[pulumi.Input[str]] = None,
             mode: Optional[pulumi.Input[str]] = None,
             path: Optional[pulumi.Input[str]] = None,
             protocol: Optional[pulumi.Input[str]] = None,
             body_format: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if method is None:
            raise TypeError("Missing 'method' argument")
        if mode is None:
            raise TypeError("Missing 'mode' argument")
        if path is None:
            raise TypeError("Missing 'path' argument")
        if protocol is None:
            raise TypeError("Missing 'protocol' argument")
        if body_format is None and 'bodyFormat' in kwargs:
            body_format = kwargs['bodyFormat']

        _setter("method", method)
        _setter("mode", mode)
        _setter("path", path)
        _setter("protocol", protocol)
        if body_format is not None:
            _setter("body_format", body_format)

    @property
    @pulumi.getter
    def method(self) -> pulumi.Input[str]:
        """
        The method of the api, including 'GET','POST','PUT' etc.
        """
        return pulumi.get(self, "method")

    @method.setter
    def method(self, value: pulumi.Input[str]):
        pulumi.set(self, "method", value)

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Input[str]:
        """
        The mode of the parameters between request parameters and service parameters, which support the values of 'MAPPING' and 'PASSTHROUGH'.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def path(self) -> pulumi.Input[str]:
        """
        The request path of the api.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: pulumi.Input[str]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Input[str]:
        """
        The protocol of api which supports values of 'HTTP','HTTPS' or 'HTTP,HTTPS'.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: pulumi.Input[str]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="bodyFormat")
    def body_format(self) -> Optional[pulumi.Input[str]]:
        """
        The body format of the api, which support the values of 'STREAM' and 'FORM'.
        """
        return pulumi.get(self, "body_format")

    @body_format.setter
    def body_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "body_format", value)


@pulumi.input_type
class ApiRequestParameterArgs:
    def __init__(__self__, *,
                 in_: pulumi.Input[str],
                 in_service: pulumi.Input[str],
                 name: pulumi.Input[str],
                 name_service: pulumi.Input[str],
                 required: pulumi.Input[str],
                 type: pulumi.Input[str],
                 default_value: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] in_: Request's parameter location; values: BODY, HEAD, QUERY, and PATH.
        :param pulumi.Input[str] in_service: Backend service's parameter location; values: BODY, HEAD, QUERY, and PATH.
        :param pulumi.Input[str] name: Request's parameter name.
        :param pulumi.Input[str] name_service: Backend service's parameter name.
        :param pulumi.Input[str] required: Parameter required or not; values: REQUIRED and OPTIONAL.
        :param pulumi.Input[str] type: Parameter type which supports values of 'STRING','INT','BOOLEAN','LONG',"FLOAT" and "DOUBLE".
        :param pulumi.Input[str] default_value: The default value of the parameter.
        :param pulumi.Input[str] description: The description of parameter.
        """
        ApiRequestParameterArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            in_=in_,
            in_service=in_service,
            name=name,
            name_service=name_service,
            required=required,
            type=type,
            default_value=default_value,
            description=description,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             in_: Optional[pulumi.Input[str]] = None,
             in_service: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             name_service: Optional[pulumi.Input[str]] = None,
             required: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             default_value: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if in_ is None and 'in' in kwargs:
            in_ = kwargs['in']
        if in_ is None:
            raise TypeError("Missing 'in_' argument")
        if in_service is None and 'inService' in kwargs:
            in_service = kwargs['inService']
        if in_service is None:
            raise TypeError("Missing 'in_service' argument")
        if name is None:
            raise TypeError("Missing 'name' argument")
        if name_service is None and 'nameService' in kwargs:
            name_service = kwargs['nameService']
        if name_service is None:
            raise TypeError("Missing 'name_service' argument")
        if required is None:
            raise TypeError("Missing 'required' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")
        if default_value is None and 'defaultValue' in kwargs:
            default_value = kwargs['defaultValue']

        _setter("in_", in_)
        _setter("in_service", in_service)
        _setter("name", name)
        _setter("name_service", name_service)
        _setter("required", required)
        _setter("type", type)
        if default_value is not None:
            _setter("default_value", default_value)
        if description is not None:
            _setter("description", description)

    @property
    @pulumi.getter(name="in")
    def in_(self) -> pulumi.Input[str]:
        """
        Request's parameter location; values: BODY, HEAD, QUERY, and PATH.
        """
        return pulumi.get(self, "in_")

    @in_.setter
    def in_(self, value: pulumi.Input[str]):
        pulumi.set(self, "in_", value)

    @property
    @pulumi.getter(name="inService")
    def in_service(self) -> pulumi.Input[str]:
        """
        Backend service's parameter location; values: BODY, HEAD, QUERY, and PATH.
        """
        return pulumi.get(self, "in_service")

    @in_service.setter
    def in_service(self, value: pulumi.Input[str]):
        pulumi.set(self, "in_service", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Request's parameter name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nameService")
    def name_service(self) -> pulumi.Input[str]:
        """
        Backend service's parameter name.
        """
        return pulumi.get(self, "name_service")

    @name_service.setter
    def name_service(self, value: pulumi.Input[str]):
        pulumi.set(self, "name_service", value)

    @property
    @pulumi.getter
    def required(self) -> pulumi.Input[str]:
        """
        Parameter required or not; values: REQUIRED and OPTIONAL.
        """
        return pulumi.get(self, "required")

    @required.setter
    def required(self, value: pulumi.Input[str]):
        pulumi.set(self, "required", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Parameter type which supports values of 'STRING','INT','BOOLEAN','LONG',"FLOAT" and "DOUBLE".
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="defaultValue")
    def default_value(self) -> Optional[pulumi.Input[str]]:
        """
        The default value of the parameter.
        """
        return pulumi.get(self, "default_value")

    @default_value.setter
    def default_value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_value", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of parameter.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class ApiSystemParameterArgs:
    def __init__(__self__, *,
                 in_: pulumi.Input[str],
                 name: pulumi.Input[str],
                 name_service: pulumi.Input[str]):
        """
        :param pulumi.Input[str] in_: System parameter location; values: 'HEAD' and 'QUERY'.
        :param pulumi.Input[str] name: System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html).
        :param pulumi.Input[str] name_service: Backend service's parameter name.
        """
        ApiSystemParameterArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            in_=in_,
            name=name,
            name_service=name_service,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             in_: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             name_service: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if in_ is None and 'in' in kwargs:
            in_ = kwargs['in']
        if in_ is None:
            raise TypeError("Missing 'in_' argument")
        if name is None:
            raise TypeError("Missing 'name' argument")
        if name_service is None and 'nameService' in kwargs:
            name_service = kwargs['nameService']
        if name_service is None:
            raise TypeError("Missing 'name_service' argument")

        _setter("in_", in_)
        _setter("name", name)
        _setter("name_service", name_service)

    @property
    @pulumi.getter(name="in")
    def in_(self) -> pulumi.Input[str]:
        """
        System parameter location; values: 'HEAD' and 'QUERY'.
        """
        return pulumi.get(self, "in_")

    @in_.setter
    def in_(self, value: pulumi.Input[str]):
        pulumi.set(self, "in_", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html).
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nameService")
    def name_service(self) -> pulumi.Input[str]:
        """
        Backend service's parameter name.
        """
        return pulumi.get(self, "name_service")

    @name_service.setter
    def name_service(self, value: pulumi.Input[str]):
        pulumi.set(self, "name_service", value)


