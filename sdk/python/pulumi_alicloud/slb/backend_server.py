# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['BackendServerArgs', 'BackendServer']

@pulumi.input_type
class BackendServerArgs:
    def __init__(__self__, *,
                 load_balancer_id: pulumi.Input[str],
                 backend_servers: Optional[pulumi.Input[Sequence[pulumi.Input['BackendServerBackendServerArgs']]]] = None,
                 delete_protection_validation: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a BackendServer resource.
        :param pulumi.Input[str] load_balancer_id: ID of the load balancer.
        :param pulumi.Input[Sequence[pulumi.Input['BackendServerBackendServerArgs']]] backend_servers: A list of instances to added backend server in the SLB. It contains three sub-fields as `Block server` follows.
        :param pulumi.Input[bool] delete_protection_validation: Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        """
        pulumi.set(__self__, "load_balancer_id", load_balancer_id)
        if backend_servers is not None:
            pulumi.set(__self__, "backend_servers", backend_servers)
        if delete_protection_validation is not None:
            pulumi.set(__self__, "delete_protection_validation", delete_protection_validation)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Input[str]:
        """
        ID of the load balancer.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "load_balancer_id", value)

    @property
    @pulumi.getter(name="backendServers")
    def backend_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BackendServerBackendServerArgs']]]]:
        """
        A list of instances to added backend server in the SLB. It contains three sub-fields as `Block server` follows.
        """
        return pulumi.get(self, "backend_servers")

    @backend_servers.setter
    def backend_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BackendServerBackendServerArgs']]]]):
        pulumi.set(self, "backend_servers", value)

    @property
    @pulumi.getter(name="deleteProtectionValidation")
    def delete_protection_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        """
        return pulumi.get(self, "delete_protection_validation")

    @delete_protection_validation.setter
    def delete_protection_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_protection_validation", value)


@pulumi.input_type
class _BackendServerState:
    def __init__(__self__, *,
                 backend_servers: Optional[pulumi.Input[Sequence[pulumi.Input['BackendServerBackendServerArgs']]]] = None,
                 delete_protection_validation: Optional[pulumi.Input[bool]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BackendServer resources.
        :param pulumi.Input[Sequence[pulumi.Input['BackendServerBackendServerArgs']]] backend_servers: A list of instances to added backend server in the SLB. It contains three sub-fields as `Block server` follows.
        :param pulumi.Input[bool] delete_protection_validation: Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        :param pulumi.Input[str] load_balancer_id: ID of the load balancer.
        """
        if backend_servers is not None:
            pulumi.set(__self__, "backend_servers", backend_servers)
        if delete_protection_validation is not None:
            pulumi.set(__self__, "delete_protection_validation", delete_protection_validation)
        if load_balancer_id is not None:
            pulumi.set(__self__, "load_balancer_id", load_balancer_id)

    @property
    @pulumi.getter(name="backendServers")
    def backend_servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BackendServerBackendServerArgs']]]]:
        """
        A list of instances to added backend server in the SLB. It contains three sub-fields as `Block server` follows.
        """
        return pulumi.get(self, "backend_servers")

    @backend_servers.setter
    def backend_servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BackendServerBackendServerArgs']]]]):
        pulumi.set(self, "backend_servers", value)

    @property
    @pulumi.getter(name="deleteProtectionValidation")
    def delete_protection_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        """
        return pulumi.get(self, "delete_protection_validation")

    @delete_protection_validation.setter
    def delete_protection_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_protection_validation", value)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the load balancer.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "load_balancer_id", value)


class BackendServer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backend_servers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BackendServerBackendServerArgs']]]]] = None,
                 delete_protection_validation: Optional[pulumi.Input[bool]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Add a group of backend servers (ECS or ENI instance) to the Server Load Balancer or remove them from it.

        > **NOTE:** Available in 1.53.0+

        ## Block servers

        The servers mapping supports the following:

        * `server_id` - (Required) A list backend server ID (ECS instance ID).
        * `weight` - (Optional) Weight of the backend server. Valid value range: [0-100].
        * `type` - (Optional) Type of the backend server. Valid value `ecs`, `eni`, `eci`. Default to `ecs`. **NOTE:** From 1.170.0+, The `eci` is valid.
        * `server_ip` - (Optional, Computed, Available in 1.93.0+) ServerIp of the backend server. This parameter can be specified when the type is `eni`. `ecs` type currently does not support adding `server_ip` parameter.

        ## Import

        Load balancer backend server can be imported using the load balancer id.

        ```sh
         $ pulumi import alicloud:slb/backendServer:BackendServer example <load_balancer_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BackendServerBackendServerArgs']]]] backend_servers: A list of instances to added backend server in the SLB. It contains three sub-fields as `Block server` follows.
        :param pulumi.Input[bool] delete_protection_validation: Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        :param pulumi.Input[str] load_balancer_id: ID of the load balancer.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackendServerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Add a group of backend servers (ECS or ENI instance) to the Server Load Balancer or remove them from it.

        > **NOTE:** Available in 1.53.0+

        ## Block servers

        The servers mapping supports the following:

        * `server_id` - (Required) A list backend server ID (ECS instance ID).
        * `weight` - (Optional) Weight of the backend server. Valid value range: [0-100].
        * `type` - (Optional) Type of the backend server. Valid value `ecs`, `eni`, `eci`. Default to `ecs`. **NOTE:** From 1.170.0+, The `eci` is valid.
        * `server_ip` - (Optional, Computed, Available in 1.93.0+) ServerIp of the backend server. This parameter can be specified when the type is `eni`. `ecs` type currently does not support adding `server_ip` parameter.

        ## Import

        Load balancer backend server can be imported using the load balancer id.

        ```sh
         $ pulumi import alicloud:slb/backendServer:BackendServer example <load_balancer_id>
        ```

        :param str resource_name: The name of the resource.
        :param BackendServerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BackendServerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backend_servers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BackendServerBackendServerArgs']]]]] = None,
                 delete_protection_validation: Optional[pulumi.Input[bool]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BackendServerArgs.__new__(BackendServerArgs)

            __props__.__dict__["backend_servers"] = backend_servers
            __props__.__dict__["delete_protection_validation"] = delete_protection_validation
            if load_balancer_id is None and not opts.urn:
                raise TypeError("Missing required property 'load_balancer_id'")
            __props__.__dict__["load_balancer_id"] = load_balancer_id
        super(BackendServer, __self__).__init__(
            'alicloud:slb/backendServer:BackendServer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backend_servers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BackendServerBackendServerArgs']]]]] = None,
            delete_protection_validation: Optional[pulumi.Input[bool]] = None,
            load_balancer_id: Optional[pulumi.Input[str]] = None) -> 'BackendServer':
        """
        Get an existing BackendServer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BackendServerBackendServerArgs']]]] backend_servers: A list of instances to added backend server in the SLB. It contains three sub-fields as `Block server` follows.
        :param pulumi.Input[bool] delete_protection_validation: Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        :param pulumi.Input[str] load_balancer_id: ID of the load balancer.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BackendServerState.__new__(_BackendServerState)

        __props__.__dict__["backend_servers"] = backend_servers
        __props__.__dict__["delete_protection_validation"] = delete_protection_validation
        __props__.__dict__["load_balancer_id"] = load_balancer_id
        return BackendServer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="backendServers")
    def backend_servers(self) -> pulumi.Output[Optional[Sequence['outputs.BackendServerBackendServer']]]:
        """
        A list of instances to added backend server in the SLB. It contains three sub-fields as `Block server` follows.
        """
        return pulumi.get(self, "backend_servers")

    @property
    @pulumi.getter(name="deleteProtectionValidation")
    def delete_protection_validation(self) -> pulumi.Output[Optional[bool]]:
        """
        Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        """
        return pulumi.get(self, "delete_protection_validation")

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Output[str]:
        """
        ID of the load balancer.
        """
        return pulumi.get(self, "load_balancer_id")

