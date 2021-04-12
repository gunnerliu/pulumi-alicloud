# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetRulesResult',
    'AwaitableGetRulesResult',
    'get_rules',
]

@pulumi.output_type
class GetRulesResult:
    """
    A collection of values returned by getRules.
    """
    def __init__(__self__, frontend_port=None, id=None, ids=None, load_balancer_id=None, name_regex=None, names=None, output_file=None, slb_rules=None):
        if frontend_port and not isinstance(frontend_port, int):
            raise TypeError("Expected argument 'frontend_port' to be a int")
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
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if slb_rules and not isinstance(slb_rules, list):
            raise TypeError("Expected argument 'slb_rules' to be a list")
        pulumi.set(__self__, "slb_rules", slb_rules)

    @property
    @pulumi.getter(name="frontendPort")
    def frontend_port(self) -> int:
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
    def ids(self) -> Sequence[str]:
        """
        A list of SLB listener rules IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> str:
        return pulumi.get(self, "load_balancer_id")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of SLB listener rules names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="slbRules")
    def slb_rules(self) -> Sequence['outputs.GetRulesSlbRuleResult']:
        """
        A list of SLB listener rules. Each element contains the following attributes:
        """
        return pulumi.get(self, "slb_rules")


class AwaitableGetRulesResult(GetRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRulesResult(
            frontend_port=self.frontend_port,
            id=self.id,
            ids=self.ids,
            load_balancer_id=self.load_balancer_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            slb_rules=self.slb_rules)


def get_rules(frontend_port: Optional[int] = None,
              ids: Optional[Sequence[str]] = None,
              load_balancer_id: Optional[str] = None,
              name_regex: Optional[str] = None,
              output_file: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRulesResult:
    """
    This data source provides the rules associated with a server load balancer listener.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "slbrulebasicconfig"
    default_zones = alicloud.get_zones(available_disk_category="cloud_efficiency",
        available_resource_creation="VSwitch")
    default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/16")
    default_switch = alicloud.vpc.Switch("defaultSwitch",
        vpc_id=default_network.id,
        cidr_block="172.16.0.0/16",
        availability_zone=default_zones.zones[0].id,
        vswitch_name=name)
    default_load_balancer = alicloud.slb.LoadBalancer("defaultLoadBalancer", vswitch_id=default_switch.id)
    default_listener = alicloud.slb.Listener("defaultListener",
        load_balancer_id=default_load_balancer.id,
        backend_port=22,
        frontend_port=22,
        protocol="http",
        bandwidth=5,
        health_check_connect_port=20)
    default_server_group = alicloud.slb.ServerGroup("defaultServerGroup", load_balancer_id=default_load_balancer.id)
    default_rule = alicloud.slb.Rule("defaultRule",
        load_balancer_id=default_load_balancer.id,
        frontend_port=default_listener.frontend_port,
        domain="*.aliyun.com",
        url="/image",
        server_group_id=default_server_group.id)
    sample_ds = default_load_balancer.id.apply(lambda id: alicloud.slb.get_rules(load_balancer_id=id,
        frontend_port=22))
    pulumi.export("firstSlbRuleId", sample_ds.slb_rules[0].id)
    ```


    :param int frontend_port: SLB listener port.
    :param Sequence[str] ids: A list of rules IDs to filter results.
    :param str load_balancer_id: ID of the SLB with listener rules.
    :param str name_regex: A regex string to filter results by rule name.
    """
    __args__ = dict()
    __args__['frontendPort'] = frontend_port
    __args__['ids'] = ids
    __args__['loadBalancerId'] = load_balancer_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:slb/getRules:getRules', __args__, opts=opts, typ=GetRulesResult).value

    return AwaitableGetRulesResult(
        frontend_port=__ret__.frontend_port,
        id=__ret__.id,
        ids=__ret__.ids,
        load_balancer_id=__ret__.load_balancer_id,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        slb_rules=__ret__.slb_rules)
