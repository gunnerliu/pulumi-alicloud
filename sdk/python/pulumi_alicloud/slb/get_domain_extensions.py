# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetDomainExtensionsResult',
    'AwaitableGetDomainExtensionsResult',
    'get_domain_extensions',
]

@pulumi.output_type
class GetDomainExtensionsResult:
    """
    A collection of values returned by getDomainExtensions.
    """
    def __init__(__self__, extensions=None, frontend_port=None, id=None, ids=None, load_balancer_id=None, output_file=None):
        if extensions and not isinstance(extensions, list):
            raise TypeError("Expected argument 'extensions' to be a list")
        pulumi.set(__self__, "extensions", extensions)
        if frontend_port and not isinstance(frontend_port, float):
            raise TypeError("Expected argument 'frontend_port' to be a float")
        pulumi.set(__self__, "frontend_port", frontend_port)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if load_balancer_id and not isinstance(load_balancer_id, str):
            raise TypeError("Expected argument 'load_balancer_id' to be a str")
        pulumi.set(__self__, "load_balancer_id", load_balancer_id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @property
    @pulumi.getter
    def extensions(self) -> List['outputs.GetDomainExtensionsExtensionResult']:
        """
        A list of SLB domain extension. Each element contains the following attributes:
        """
        return pulumi.get(self, "extensions")

    @property
    @pulumi.getter(name="frontendPort")
    def frontend_port(self) -> float:
        return pulumi.get(self, "frontend_port")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> List[str]:
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> str:
        return pulumi.get(self, "load_balancer_id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetDomainExtensionsResult(GetDomainExtensionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDomainExtensionsResult(
            extensions=self.extensions,
            frontend_port=self.frontend_port,
            id=self.id,
            ids=self.ids,
            load_balancer_id=self.load_balancer_id,
            output_file=self.output_file)


def get_domain_extensions(frontend_port: Optional[float] = None,
                          ids: Optional[List[str]] = None,
                          load_balancer_id: Optional[str] = None,
                          output_file: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDomainExtensionsResult:
    """
    This data source provides the domain extensions associated with a server load balancer listener.

    > **NOTE:** Available in 1.60.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    foo = alicloud.slb.get_domain_extensions(frontend_port="fake-port",
        ids=["fake-de-id"],
        load_balancer_id="fake-lb-id")
    ```


    :param float frontend_port: The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
    :param List[str] ids: IDs of the SLB domain extensions.
    :param str load_balancer_id: The ID of the SLB instance.
    """
    __args__ = dict()
    __args__['frontendPort'] = frontend_port
    __args__['ids'] = ids
    __args__['loadBalancerId'] = load_balancer_id
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:slb/getDomainExtensions:getDomainExtensions', __args__, opts=opts, typ=GetDomainExtensionsResult).value

    return AwaitableGetDomainExtensionsResult(
        extensions=__ret__.extensions,
        frontend_port=__ret__.frontend_port,
        id=__ret__.id,
        ids=__ret__.ids,
        load_balancer_id=__ret__.load_balancer_id,
        output_file=__ret__.output_file)
