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
    'GetSslVpnClientCertsResult',
    'AwaitableGetSslVpnClientCertsResult',
    'get_ssl_vpn_client_certs',
    'get_ssl_vpn_client_certs_output',
]

@pulumi.output_type
class GetSslVpnClientCertsResult:
    """
    A collection of values returned by getSslVpnClientCerts.
    """
    def __init__(__self__, certs=None, id=None, ids=None, name_regex=None, names=None, output_file=None, ssl_vpn_server_id=None):
        if certs and not isinstance(certs, list):
            raise TypeError("Expected argument 'certs' to be a list")
        pulumi.set(__self__, "certs", certs)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if ssl_vpn_server_id and not isinstance(ssl_vpn_server_id, str):
            raise TypeError("Expected argument 'ssl_vpn_server_id' to be a str")
        pulumi.set(__self__, "ssl_vpn_server_id", ssl_vpn_server_id)

    @property
    @pulumi.getter
    def certs(self) -> Sequence['outputs.GetSslVpnClientCertsCertResult']:
        """
        A list of SSL-VPN client certificates. Each element contains the following attributes:
        """
        return pulumi.get(self, "certs")

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
        """
        A list of SSL-VPN client cert IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of SSL-VPN client cert names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="sslVpnServerId")
    def ssl_vpn_server_id(self) -> Optional[str]:
        """
        ID of the SSL-VPN Server.
        """
        return pulumi.get(self, "ssl_vpn_server_id")


class AwaitableGetSslVpnClientCertsResult(GetSslVpnClientCertsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSslVpnClientCertsResult(
            certs=self.certs,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            ssl_vpn_server_id=self.ssl_vpn_server_id)


def get_ssl_vpn_client_certs(ids: Optional[Sequence[str]] = None,
                             name_regex: Optional[str] = None,
                             output_file: Optional[str] = None,
                             ssl_vpn_server_id: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSslVpnClientCertsResult:
    """
    The SSL-VPN client certificates data source lists lots of SSL-VPN client certificates resource information owned by an Alicloud account.


    :param Sequence[str] ids: IDs of the SSL-VPN client certificates.
    :param str name_regex: A regex string of SSL-VPN client certificate name.
    :param str output_file: Save the result to the file.
    :param str ssl_vpn_server_id: Use the SSL-VPN server ID as the search key.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['sslVpnServerId'] = ssl_vpn_server_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:vpc/getSslVpnClientCerts:getSslVpnClientCerts', __args__, opts=opts, typ=GetSslVpnClientCertsResult).value

    return AwaitableGetSslVpnClientCertsResult(
        certs=pulumi.get(__ret__, 'certs'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        ssl_vpn_server_id=pulumi.get(__ret__, 'ssl_vpn_server_id'))


@_utilities.lift_output_func(get_ssl_vpn_client_certs)
def get_ssl_vpn_client_certs_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                    name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                    output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                    ssl_vpn_server_id: Optional[pulumi.Input[Optional[str]]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSslVpnClientCertsResult]:
    """
    The SSL-VPN client certificates data source lists lots of SSL-VPN client certificates resource information owned by an Alicloud account.


    :param Sequence[str] ids: IDs of the SSL-VPN client certificates.
    :param str name_regex: A regex string of SSL-VPN client certificate name.
    :param str output_file: Save the result to the file.
    :param str ssl_vpn_server_id: Use the SSL-VPN server ID as the search key.
    """
    ...
