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

__all__ = [
    'GetIpsecServersResult',
    'AwaitableGetIpsecServersResult',
    'get_ipsec_servers',
    'get_ipsec_servers_output',
]

@pulumi.output_type
class GetIpsecServersResult:
    """
    A collection of values returned by getIpsecServers.
    """
    def __init__(__self__, id=None, ids=None, ipsec_server_name=None, name_regex=None, names=None, output_file=None, servers=None, vpn_gateway_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if ipsec_server_name and not isinstance(ipsec_server_name, str):
            raise TypeError("Expected argument 'ipsec_server_name' to be a str")
        pulumi.set(__self__, "ipsec_server_name", ipsec_server_name)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if servers and not isinstance(servers, list):
            raise TypeError("Expected argument 'servers' to be a list")
        pulumi.set(__self__, "servers", servers)
        if vpn_gateway_id and not isinstance(vpn_gateway_id, str):
            raise TypeError("Expected argument 'vpn_gateway_id' to be a str")
        pulumi.set(__self__, "vpn_gateway_id", vpn_gateway_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="ipsecServerName")
    def ipsec_server_name(self) -> Optional[str]:
        return pulumi.get(self, "ipsec_server_name")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def servers(self) -> Sequence['outputs.GetIpsecServersServerResult']:
        return pulumi.get(self, "servers")

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> Optional[str]:
        return pulumi.get(self, "vpn_gateway_id")


class AwaitableGetIpsecServersResult(GetIpsecServersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIpsecServersResult(
            id=self.id,
            ids=self.ids,
            ipsec_server_name=self.ipsec_server_name,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            servers=self.servers,
            vpn_gateway_id=self.vpn_gateway_id)


def get_ipsec_servers(ids: Optional[Sequence[str]] = None,
                      ipsec_server_name: Optional[str] = None,
                      name_regex: Optional[str] = None,
                      output_file: Optional[str] = None,
                      vpn_gateway_id: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIpsecServersResult:
    """
    This data source provides the Vpn Ipsec Servers of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.161.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.vpc.get_ipsec_servers(ids=["example_id"])
    pulumi.export("vpnIpsecServerId1", ids.servers[0].id)
    name_regex = alicloud.vpc.get_ipsec_servers(name_regex="^my-IpsecServer")
    pulumi.export("vpnIpsecServerId2", name_regex.servers[0].id)
    ```


    :param Sequence[str] ids: A list of Ipsec Server IDs.
    :param str ipsec_server_name: The name of the IPsec server.
    :param str name_regex: A regex string to filter results by Ipsec Server name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str vpn_gateway_id: The ID of the VPN gateway.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['ipsecServerName'] = ipsec_server_name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['vpnGatewayId'] = vpn_gateway_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:vpc/getIpsecServers:getIpsecServers', __args__, opts=opts, typ=GetIpsecServersResult).value

    return AwaitableGetIpsecServersResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        ipsec_server_name=pulumi.get(__ret__, 'ipsec_server_name'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        servers=pulumi.get(__ret__, 'servers'),
        vpn_gateway_id=pulumi.get(__ret__, 'vpn_gateway_id'))


@_utilities.lift_output_func(get_ipsec_servers)
def get_ipsec_servers_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                             ipsec_server_name: Optional[pulumi.Input[Optional[str]]] = None,
                             name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                             output_file: Optional[pulumi.Input[Optional[str]]] = None,
                             vpn_gateway_id: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetIpsecServersResult]:
    """
    This data source provides the Vpn Ipsec Servers of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.161.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.vpc.get_ipsec_servers(ids=["example_id"])
    pulumi.export("vpnIpsecServerId1", ids.servers[0].id)
    name_regex = alicloud.vpc.get_ipsec_servers(name_regex="^my-IpsecServer")
    pulumi.export("vpnIpsecServerId2", name_regex.servers[0].id)
    ```


    :param Sequence[str] ids: A list of Ipsec Server IDs.
    :param str ipsec_server_name: The name of the IPsec server.
    :param str name_regex: A regex string to filter results by Ipsec Server name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str vpn_gateway_id: The ID of the VPN gateway.
    """
    ...
