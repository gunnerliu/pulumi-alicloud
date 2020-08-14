# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetBackendServersResult:
    """
    A collection of values returned by getBackendServers.
    """
    def __init__(__self__, backend_servers=None, id=None, ids=None, load_balancer_id=None, output_file=None):
        if backend_servers and not isinstance(backend_servers, list):
            raise TypeError("Expected argument 'backend_servers' to be a list")
        __self__.backend_servers = backend_servers
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        __self__.ids = ids
        if load_balancer_id and not isinstance(load_balancer_id, str):
            raise TypeError("Expected argument 'load_balancer_id' to be a str")
        __self__.load_balancer_id = load_balancer_id
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        __self__.output_file = output_file
class AwaitableGetBackendServersResult(GetBackendServersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBackendServersResult(
            backend_servers=self.backend_servers,
            id=self.id,
            ids=self.ids,
            load_balancer_id=self.load_balancer_id,
            output_file=self.output_file)

def get_backend_servers(ids=None,load_balancer_id=None,output_file=None,opts=None):
    """
    This data source provides the server load balancer backend servers related to a server load balancer..

    > **NOTE:** Available in 1.53.0+

    ## Example Usage



    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    sample_ds = alicloud.slb.get_backend_servers(load_balancer_id=alicloud_slb["sample_slb"]["id"])
    pulumi.export("firstSlbBackendServerId", sample_ds.backend_servers[0]["id"])
    ```



    :param list ids: List of attached ECS instance IDs.
    :param str load_balancer_id: ID of the SLB with attachments.
    """
    __args__ = dict()


    __args__['ids'] = ids
    __args__['loadBalancerId'] = load_balancer_id
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:slb/getBackendServers:getBackendServers', __args__, opts=opts).value

    return AwaitableGetBackendServersResult(
        backend_servers=__ret__.get('backendServers'),
        id=__ret__.get('id'),
        ids=__ret__.get('ids'),
        load_balancer_id=__ret__.get('loadBalancerId'),
        output_file=__ret__.get('outputFile'))
