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

__all__ = ['IpsecServerArgs', 'IpsecServer']

@pulumi.input_type
class IpsecServerArgs:
    def __init__(__self__, *,
                 client_ip_pool: pulumi.Input[str],
                 local_subnet: pulumi.Input[str],
                 vpn_gateway_id: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 effect_immediately: Optional[pulumi.Input[bool]] = None,
                 ike_configs: Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIkeConfigArgs']]]] = None,
                 ipsec_configs: Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIpsecConfigArgs']]]] = None,
                 ipsec_server_name: Optional[pulumi.Input[str]] = None,
                 psk: Optional[pulumi.Input[str]] = None,
                 psk_enabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a IpsecServer resource.
        :param pulumi.Input[str] client_ip_pool: The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
        :param pulumi.Input[str] local_subnet: The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
        :param pulumi.Input[str] vpn_gateway_id: The ID of the VPN gateway.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[bool] effect_immediately: Specifies whether you want the configuration to immediately take effect.
        :param pulumi.Input[Sequence[pulumi.Input['IpsecServerIkeConfigArgs']]] ike_configs: The configuration of Phase 1 negotiations. See the following `Block ike_config`.
        :param pulumi.Input[Sequence[pulumi.Input['IpsecServerIpsecConfigArgs']]] ipsec_configs: The configuration of Phase 2 negotiations. See the following `Block ipsec_config`.
        :param pulumi.Input[str] ipsec_server_name: The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
        :param pulumi.Input[str] psk: The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
        :param pulumi.Input[bool] psk_enabled: Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
        """
        IpsecServerArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            client_ip_pool=client_ip_pool,
            local_subnet=local_subnet,
            vpn_gateway_id=vpn_gateway_id,
            dry_run=dry_run,
            effect_immediately=effect_immediately,
            ike_configs=ike_configs,
            ipsec_configs=ipsec_configs,
            ipsec_server_name=ipsec_server_name,
            psk=psk,
            psk_enabled=psk_enabled,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             client_ip_pool: Optional[pulumi.Input[str]] = None,
             local_subnet: Optional[pulumi.Input[str]] = None,
             vpn_gateway_id: Optional[pulumi.Input[str]] = None,
             dry_run: Optional[pulumi.Input[bool]] = None,
             effect_immediately: Optional[pulumi.Input[bool]] = None,
             ike_configs: Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIkeConfigArgs']]]] = None,
             ipsec_configs: Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIpsecConfigArgs']]]] = None,
             ipsec_server_name: Optional[pulumi.Input[str]] = None,
             psk: Optional[pulumi.Input[str]] = None,
             psk_enabled: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if client_ip_pool is None and 'clientIpPool' in kwargs:
            client_ip_pool = kwargs['clientIpPool']
        if client_ip_pool is None:
            raise TypeError("Missing 'client_ip_pool' argument")
        if local_subnet is None and 'localSubnet' in kwargs:
            local_subnet = kwargs['localSubnet']
        if local_subnet is None:
            raise TypeError("Missing 'local_subnet' argument")
        if vpn_gateway_id is None and 'vpnGatewayId' in kwargs:
            vpn_gateway_id = kwargs['vpnGatewayId']
        if vpn_gateway_id is None:
            raise TypeError("Missing 'vpn_gateway_id' argument")
        if dry_run is None and 'dryRun' in kwargs:
            dry_run = kwargs['dryRun']
        if effect_immediately is None and 'effectImmediately' in kwargs:
            effect_immediately = kwargs['effectImmediately']
        if ike_configs is None and 'ikeConfigs' in kwargs:
            ike_configs = kwargs['ikeConfigs']
        if ipsec_configs is None and 'ipsecConfigs' in kwargs:
            ipsec_configs = kwargs['ipsecConfigs']
        if ipsec_server_name is None and 'ipsecServerName' in kwargs:
            ipsec_server_name = kwargs['ipsecServerName']
        if psk_enabled is None and 'pskEnabled' in kwargs:
            psk_enabled = kwargs['pskEnabled']

        _setter("client_ip_pool", client_ip_pool)
        _setter("local_subnet", local_subnet)
        _setter("vpn_gateway_id", vpn_gateway_id)
        if dry_run is not None:
            _setter("dry_run", dry_run)
        if effect_immediately is not None:
            _setter("effect_immediately", effect_immediately)
        if ike_configs is not None:
            _setter("ike_configs", ike_configs)
        if ipsec_configs is not None:
            _setter("ipsec_configs", ipsec_configs)
        if ipsec_server_name is not None:
            _setter("ipsec_server_name", ipsec_server_name)
        if psk is not None:
            _setter("psk", psk)
        if psk_enabled is not None:
            _setter("psk_enabled", psk_enabled)

    @property
    @pulumi.getter(name="clientIpPool")
    def client_ip_pool(self) -> pulumi.Input[str]:
        """
        The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
        """
        return pulumi.get(self, "client_ip_pool")

    @client_ip_pool.setter
    def client_ip_pool(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_ip_pool", value)

    @property
    @pulumi.getter(name="localSubnet")
    def local_subnet(self) -> pulumi.Input[str]:
        """
        The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
        """
        return pulumi.get(self, "local_subnet")

    @local_subnet.setter
    def local_subnet(self, value: pulumi.Input[str]):
        pulumi.set(self, "local_subnet", value)

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> pulumi.Input[str]:
        """
        The ID of the VPN gateway.
        """
        return pulumi.get(self, "vpn_gateway_id")

    @vpn_gateway_id.setter
    def vpn_gateway_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpn_gateway_id", value)

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
    @pulumi.getter(name="effectImmediately")
    def effect_immediately(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether you want the configuration to immediately take effect.
        """
        return pulumi.get(self, "effect_immediately")

    @effect_immediately.setter
    def effect_immediately(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "effect_immediately", value)

    @property
    @pulumi.getter(name="ikeConfigs")
    def ike_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIkeConfigArgs']]]]:
        """
        The configuration of Phase 1 negotiations. See the following `Block ike_config`.
        """
        return pulumi.get(self, "ike_configs")

    @ike_configs.setter
    def ike_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIkeConfigArgs']]]]):
        pulumi.set(self, "ike_configs", value)

    @property
    @pulumi.getter(name="ipsecConfigs")
    def ipsec_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIpsecConfigArgs']]]]:
        """
        The configuration of Phase 2 negotiations. See the following `Block ipsec_config`.
        """
        return pulumi.get(self, "ipsec_configs")

    @ipsec_configs.setter
    def ipsec_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIpsecConfigArgs']]]]):
        pulumi.set(self, "ipsec_configs", value)

    @property
    @pulumi.getter(name="ipsecServerName")
    def ipsec_server_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
        """
        return pulumi.get(self, "ipsec_server_name")

    @ipsec_server_name.setter
    def ipsec_server_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipsec_server_name", value)

    @property
    @pulumi.getter
    def psk(self) -> Optional[pulumi.Input[str]]:
        """
        The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
        """
        return pulumi.get(self, "psk")

    @psk.setter
    def psk(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "psk", value)

    @property
    @pulumi.getter(name="pskEnabled")
    def psk_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
        """
        return pulumi.get(self, "psk_enabled")

    @psk_enabled.setter
    def psk_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "psk_enabled", value)


@pulumi.input_type
class _IpsecServerState:
    def __init__(__self__, *,
                 client_ip_pool: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 effect_immediately: Optional[pulumi.Input[bool]] = None,
                 ike_configs: Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIkeConfigArgs']]]] = None,
                 ipsec_configs: Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIpsecConfigArgs']]]] = None,
                 ipsec_server_name: Optional[pulumi.Input[str]] = None,
                 local_subnet: Optional[pulumi.Input[str]] = None,
                 psk: Optional[pulumi.Input[str]] = None,
                 psk_enabled: Optional[pulumi.Input[bool]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IpsecServer resources.
        :param pulumi.Input[str] client_ip_pool: The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[bool] effect_immediately: Specifies whether you want the configuration to immediately take effect.
        :param pulumi.Input[Sequence[pulumi.Input['IpsecServerIkeConfigArgs']]] ike_configs: The configuration of Phase 1 negotiations. See the following `Block ike_config`.
        :param pulumi.Input[Sequence[pulumi.Input['IpsecServerIpsecConfigArgs']]] ipsec_configs: The configuration of Phase 2 negotiations. See the following `Block ipsec_config`.
        :param pulumi.Input[str] ipsec_server_name: The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
        :param pulumi.Input[str] local_subnet: The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
        :param pulumi.Input[str] psk: The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
        :param pulumi.Input[bool] psk_enabled: Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
        :param pulumi.Input[str] vpn_gateway_id: The ID of the VPN gateway.
        """
        _IpsecServerState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            client_ip_pool=client_ip_pool,
            dry_run=dry_run,
            effect_immediately=effect_immediately,
            ike_configs=ike_configs,
            ipsec_configs=ipsec_configs,
            ipsec_server_name=ipsec_server_name,
            local_subnet=local_subnet,
            psk=psk,
            psk_enabled=psk_enabled,
            vpn_gateway_id=vpn_gateway_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             client_ip_pool: Optional[pulumi.Input[str]] = None,
             dry_run: Optional[pulumi.Input[bool]] = None,
             effect_immediately: Optional[pulumi.Input[bool]] = None,
             ike_configs: Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIkeConfigArgs']]]] = None,
             ipsec_configs: Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIpsecConfigArgs']]]] = None,
             ipsec_server_name: Optional[pulumi.Input[str]] = None,
             local_subnet: Optional[pulumi.Input[str]] = None,
             psk: Optional[pulumi.Input[str]] = None,
             psk_enabled: Optional[pulumi.Input[bool]] = None,
             vpn_gateway_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if client_ip_pool is None and 'clientIpPool' in kwargs:
            client_ip_pool = kwargs['clientIpPool']
        if dry_run is None and 'dryRun' in kwargs:
            dry_run = kwargs['dryRun']
        if effect_immediately is None and 'effectImmediately' in kwargs:
            effect_immediately = kwargs['effectImmediately']
        if ike_configs is None and 'ikeConfigs' in kwargs:
            ike_configs = kwargs['ikeConfigs']
        if ipsec_configs is None and 'ipsecConfigs' in kwargs:
            ipsec_configs = kwargs['ipsecConfigs']
        if ipsec_server_name is None and 'ipsecServerName' in kwargs:
            ipsec_server_name = kwargs['ipsecServerName']
        if local_subnet is None and 'localSubnet' in kwargs:
            local_subnet = kwargs['localSubnet']
        if psk_enabled is None and 'pskEnabled' in kwargs:
            psk_enabled = kwargs['pskEnabled']
        if vpn_gateway_id is None and 'vpnGatewayId' in kwargs:
            vpn_gateway_id = kwargs['vpnGatewayId']

        if client_ip_pool is not None:
            _setter("client_ip_pool", client_ip_pool)
        if dry_run is not None:
            _setter("dry_run", dry_run)
        if effect_immediately is not None:
            _setter("effect_immediately", effect_immediately)
        if ike_configs is not None:
            _setter("ike_configs", ike_configs)
        if ipsec_configs is not None:
            _setter("ipsec_configs", ipsec_configs)
        if ipsec_server_name is not None:
            _setter("ipsec_server_name", ipsec_server_name)
        if local_subnet is not None:
            _setter("local_subnet", local_subnet)
        if psk is not None:
            _setter("psk", psk)
        if psk_enabled is not None:
            _setter("psk_enabled", psk_enabled)
        if vpn_gateway_id is not None:
            _setter("vpn_gateway_id", vpn_gateway_id)

    @property
    @pulumi.getter(name="clientIpPool")
    def client_ip_pool(self) -> Optional[pulumi.Input[str]]:
        """
        The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
        """
        return pulumi.get(self, "client_ip_pool")

    @client_ip_pool.setter
    def client_ip_pool(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_ip_pool", value)

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
    @pulumi.getter(name="effectImmediately")
    def effect_immediately(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether you want the configuration to immediately take effect.
        """
        return pulumi.get(self, "effect_immediately")

    @effect_immediately.setter
    def effect_immediately(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "effect_immediately", value)

    @property
    @pulumi.getter(name="ikeConfigs")
    def ike_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIkeConfigArgs']]]]:
        """
        The configuration of Phase 1 negotiations. See the following `Block ike_config`.
        """
        return pulumi.get(self, "ike_configs")

    @ike_configs.setter
    def ike_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIkeConfigArgs']]]]):
        pulumi.set(self, "ike_configs", value)

    @property
    @pulumi.getter(name="ipsecConfigs")
    def ipsec_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIpsecConfigArgs']]]]:
        """
        The configuration of Phase 2 negotiations. See the following `Block ipsec_config`.
        """
        return pulumi.get(self, "ipsec_configs")

    @ipsec_configs.setter
    def ipsec_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IpsecServerIpsecConfigArgs']]]]):
        pulumi.set(self, "ipsec_configs", value)

    @property
    @pulumi.getter(name="ipsecServerName")
    def ipsec_server_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
        """
        return pulumi.get(self, "ipsec_server_name")

    @ipsec_server_name.setter
    def ipsec_server_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipsec_server_name", value)

    @property
    @pulumi.getter(name="localSubnet")
    def local_subnet(self) -> Optional[pulumi.Input[str]]:
        """
        The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
        """
        return pulumi.get(self, "local_subnet")

    @local_subnet.setter
    def local_subnet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "local_subnet", value)

    @property
    @pulumi.getter
    def psk(self) -> Optional[pulumi.Input[str]]:
        """
        The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
        """
        return pulumi.get(self, "psk")

    @psk.setter
    def psk(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "psk", value)

    @property
    @pulumi.getter(name="pskEnabled")
    def psk_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
        """
        return pulumi.get(self, "psk_enabled")

    @psk_enabled.setter
    def psk_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "psk_enabled", value)

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPN gateway.
        """
        return pulumi.get(self, "vpn_gateway_id")

    @vpn_gateway_id.setter
    def vpn_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpn_gateway_id", value)


class IpsecServer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_ip_pool: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 effect_immediately: Optional[pulumi.Input[bool]] = None,
                 ike_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IpsecServerIkeConfigArgs']]]]] = None,
                 ipsec_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IpsecServerIpsecConfigArgs']]]]] = None,
                 ipsec_server_name: Optional[pulumi.Input[str]] = None,
                 local_subnet: Optional[pulumi.Input[str]] = None,
                 psk: Optional[pulumi.Input[str]] = None,
                 psk_enabled: Optional[pulumi.Input[bool]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a VPN Ipsec Server resource.

        For information about VPN Ipsec Server and how to use it, see [What is Ipsec Server](https://www.alibabacloud.com/help/en/doc-detail/205454.html).

        > **NOTE:** Available in v1.161.0+.

        ## Import

        VPN Ipsec Server can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpn/ipsecServer:IpsecServer example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] client_ip_pool: The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[bool] effect_immediately: Specifies whether you want the configuration to immediately take effect.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IpsecServerIkeConfigArgs']]]] ike_configs: The configuration of Phase 1 negotiations. See the following `Block ike_config`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IpsecServerIpsecConfigArgs']]]] ipsec_configs: The configuration of Phase 2 negotiations. See the following `Block ipsec_config`.
        :param pulumi.Input[str] ipsec_server_name: The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
        :param pulumi.Input[str] local_subnet: The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
        :param pulumi.Input[str] psk: The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
        :param pulumi.Input[bool] psk_enabled: Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
        :param pulumi.Input[str] vpn_gateway_id: The ID of the VPN gateway.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IpsecServerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a VPN Ipsec Server resource.

        For information about VPN Ipsec Server and how to use it, see [What is Ipsec Server](https://www.alibabacloud.com/help/en/doc-detail/205454.html).

        > **NOTE:** Available in v1.161.0+.

        ## Import

        VPN Ipsec Server can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpn/ipsecServer:IpsecServer example <id>
        ```

        :param str resource_name: The name of the resource.
        :param IpsecServerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IpsecServerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            IpsecServerArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_ip_pool: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 effect_immediately: Optional[pulumi.Input[bool]] = None,
                 ike_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IpsecServerIkeConfigArgs']]]]] = None,
                 ipsec_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IpsecServerIpsecConfigArgs']]]]] = None,
                 ipsec_server_name: Optional[pulumi.Input[str]] = None,
                 local_subnet: Optional[pulumi.Input[str]] = None,
                 psk: Optional[pulumi.Input[str]] = None,
                 psk_enabled: Optional[pulumi.Input[bool]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IpsecServerArgs.__new__(IpsecServerArgs)

            if client_ip_pool is None and not opts.urn:
                raise TypeError("Missing required property 'client_ip_pool'")
            __props__.__dict__["client_ip_pool"] = client_ip_pool
            __props__.__dict__["dry_run"] = dry_run
            __props__.__dict__["effect_immediately"] = effect_immediately
            __props__.__dict__["ike_configs"] = ike_configs
            __props__.__dict__["ipsec_configs"] = ipsec_configs
            __props__.__dict__["ipsec_server_name"] = ipsec_server_name
            if local_subnet is None and not opts.urn:
                raise TypeError("Missing required property 'local_subnet'")
            __props__.__dict__["local_subnet"] = local_subnet
            __props__.__dict__["psk"] = psk
            __props__.__dict__["psk_enabled"] = psk_enabled
            if vpn_gateway_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpn_gateway_id'")
            __props__.__dict__["vpn_gateway_id"] = vpn_gateway_id
        super(IpsecServer, __self__).__init__(
            'alicloud:vpn/ipsecServer:IpsecServer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            client_ip_pool: Optional[pulumi.Input[str]] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            effect_immediately: Optional[pulumi.Input[bool]] = None,
            ike_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IpsecServerIkeConfigArgs']]]]] = None,
            ipsec_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IpsecServerIpsecConfigArgs']]]]] = None,
            ipsec_server_name: Optional[pulumi.Input[str]] = None,
            local_subnet: Optional[pulumi.Input[str]] = None,
            psk: Optional[pulumi.Input[str]] = None,
            psk_enabled: Optional[pulumi.Input[bool]] = None,
            vpn_gateway_id: Optional[pulumi.Input[str]] = None) -> 'IpsecServer':
        """
        Get an existing IpsecServer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] client_ip_pool: The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[bool] effect_immediately: Specifies whether you want the configuration to immediately take effect.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IpsecServerIkeConfigArgs']]]] ike_configs: The configuration of Phase 1 negotiations. See the following `Block ike_config`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IpsecServerIpsecConfigArgs']]]] ipsec_configs: The configuration of Phase 2 negotiations. See the following `Block ipsec_config`.
        :param pulumi.Input[str] ipsec_server_name: The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
        :param pulumi.Input[str] local_subnet: The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
        :param pulumi.Input[str] psk: The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
        :param pulumi.Input[bool] psk_enabled: Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
        :param pulumi.Input[str] vpn_gateway_id: The ID of the VPN gateway.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IpsecServerState.__new__(_IpsecServerState)

        __props__.__dict__["client_ip_pool"] = client_ip_pool
        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["effect_immediately"] = effect_immediately
        __props__.__dict__["ike_configs"] = ike_configs
        __props__.__dict__["ipsec_configs"] = ipsec_configs
        __props__.__dict__["ipsec_server_name"] = ipsec_server_name
        __props__.__dict__["local_subnet"] = local_subnet
        __props__.__dict__["psk"] = psk
        __props__.__dict__["psk_enabled"] = psk_enabled
        __props__.__dict__["vpn_gateway_id"] = vpn_gateway_id
        return IpsecServer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clientIpPool")
    def client_ip_pool(self) -> pulumi.Output[str]:
        """
        The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
        """
        return pulumi.get(self, "client_ip_pool")

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="effectImmediately")
    def effect_immediately(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether you want the configuration to immediately take effect.
        """
        return pulumi.get(self, "effect_immediately")

    @property
    @pulumi.getter(name="ikeConfigs")
    def ike_configs(self) -> pulumi.Output[Sequence['outputs.IpsecServerIkeConfig']]:
        """
        The configuration of Phase 1 negotiations. See the following `Block ike_config`.
        """
        return pulumi.get(self, "ike_configs")

    @property
    @pulumi.getter(name="ipsecConfigs")
    def ipsec_configs(self) -> pulumi.Output[Sequence['outputs.IpsecServerIpsecConfig']]:
        """
        The configuration of Phase 2 negotiations. See the following `Block ipsec_config`.
        """
        return pulumi.get(self, "ipsec_configs")

    @property
    @pulumi.getter(name="ipsecServerName")
    def ipsec_server_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
        """
        return pulumi.get(self, "ipsec_server_name")

    @property
    @pulumi.getter(name="localSubnet")
    def local_subnet(self) -> pulumi.Output[str]:
        """
        The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
        """
        return pulumi.get(self, "local_subnet")

    @property
    @pulumi.getter
    def psk(self) -> pulumi.Output[str]:
        """
        The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
        """
        return pulumi.get(self, "psk")

    @property
    @pulumi.getter(name="pskEnabled")
    def psk_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
        """
        return pulumi.get(self, "psk_enabled")

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> pulumi.Output[str]:
        """
        The ID of the VPN gateway.
        """
        return pulumi.get(self, "vpn_gateway_id")

