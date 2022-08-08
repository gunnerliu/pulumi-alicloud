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

__all__ = [
    'GetMasterSlaveServerGroupsResult',
    'AwaitableGetMasterSlaveServerGroupsResult',
    'get_master_slave_server_groups',
    'get_master_slave_server_groups_output',
]

@pulumi.output_type
class GetMasterSlaveServerGroupsResult:
    """
    A collection of values returned by getMasterSlaveServerGroups.
    """
    def __init__(__self__, groups=None, id=None, ids=None, load_balancer_id=None, name_regex=None, names=None, output_file=None):
        if groups and not isinstance(groups, list):
            raise TypeError("Expected argument 'groups' to be a list")
        pulumi.set(__self__, "groups", groups)
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

    @property
    @pulumi.getter
    def groups(self) -> Sequence['outputs.GetMasterSlaveServerGroupsGroupResult']:
        """
        A list of SLB master slave server groups. Each element contains the following attributes:
        """
        return pulumi.get(self, "groups")

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
        A list of SLB master slave server groups IDs.
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
        A list of SLB master slave server groups names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetMasterSlaveServerGroupsResult(GetMasterSlaveServerGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMasterSlaveServerGroupsResult(
            groups=self.groups,
            id=self.id,
            ids=self.ids,
            load_balancer_id=self.load_balancer_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file)


def get_master_slave_server_groups(ids: Optional[Sequence[str]] = None,
                                   load_balancer_id: Optional[str] = None,
                                   name_regex: Optional[str] = None,
                                   output_file: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMasterSlaveServerGroupsResult:
    """
    This data source provides the master slave server groups related to a server load balancer.

    > **NOTE:** Available in 1.54.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default_zones = alicloud.get_zones(available_disk_category="cloud_efficiency",
        available_resource_creation="VSwitch")
    default_instance_types = alicloud.ecs.get_instance_types(availability_zone=default_zones.zones[0].id,
        eni_amount=2)
    image = alicloud.ecs.get_images(name_regex="^ubuntu_18.*64",
        most_recent=True,
        owners="system")
    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "tf-testAccSlbMasterSlaveServerGroupVpc"
    number = config.get("number")
    if number is None:
        number = "1"
    main_network = alicloud.vpc.Network("mainNetwork", cidr_block="172.16.0.0/16")
    main_switch = alicloud.vpc.Switch("mainSwitch",
        vpc_id=main_network.id,
        zone_id=default_zones.zones[0].id,
        vswitch_name=name,
        cidr_block="172.16.0.0/16")
    group_security_group = alicloud.ecs.SecurityGroup("groupSecurityGroup", vpc_id=main_network.id)
    instance_instance = []
    for range in [{"value": i} for i in range(0, 2)]:
        instance_instance.append(alicloud.ecs.Instance(f"instanceInstance-{range['value']}",
            image_id=image.images[0].id,
            instance_type=default_instance_types.instance_types[0].id,
            instance_name=name,
            security_groups=[group_security_group.id],
            internet_charge_type="PayByTraffic",
            internet_max_bandwidth_out=10,
            availability_zone=default_zones.zones[0].id,
            instance_charge_type="PostPaid",
            system_disk_category="cloud_efficiency",
            vswitch_id=main_switch.id))
    instance_application_load_balancer = alicloud.slb.ApplicationLoadBalancer("instanceApplicationLoadBalancer",
        load_balancer_name=name,
        vswitch_id=main_switch.id,
        load_balancer_spec="slb.s2.small")
    group_master_slave_server_group = alicloud.slb.MasterSlaveServerGroup("groupMasterSlaveServerGroup",
        load_balancer_id=instance_application_load_balancer.id,
        servers=[
            alicloud.slb.MasterSlaveServerGroupServerArgs(
                server_id=instance_instance[0].id,
                port=100,
                weight=100,
                server_type="Master",
            ),
            alicloud.slb.MasterSlaveServerGroupServerArgs(
                server_id=instance_instance[1].id,
                port=100,
                weight=100,
                server_type="Slave",
            ),
        ])
    sample_ds = alicloud.slb.get_master_slave_server_groups_output(load_balancer_id=instance_application_load_balancer.id)
    pulumi.export("firstSlbServerGroupId", sample_ds.groups[0].id)
    ```


    :param Sequence[str] ids: A list of master slave server group IDs to filter results.
    :param str load_balancer_id: ID of the SLB.
    :param str name_regex: A regex string to filter results by master slave server group name.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['loadBalancerId'] = load_balancer_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:slb/getMasterSlaveServerGroups:getMasterSlaveServerGroups', __args__, opts=opts, typ=GetMasterSlaveServerGroupsResult).value

    return AwaitableGetMasterSlaveServerGroupsResult(
        groups=__ret__.groups,
        id=__ret__.id,
        ids=__ret__.ids,
        load_balancer_id=__ret__.load_balancer_id,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file)


@_utilities.lift_output_func(get_master_slave_server_groups)
def get_master_slave_server_groups_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                          load_balancer_id: Optional[pulumi.Input[str]] = None,
                                          name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                          output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMasterSlaveServerGroupsResult]:
    """
    This data source provides the master slave server groups related to a server load balancer.

    > **NOTE:** Available in 1.54.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default_zones = alicloud.get_zones(available_disk_category="cloud_efficiency",
        available_resource_creation="VSwitch")
    default_instance_types = alicloud.ecs.get_instance_types(availability_zone=default_zones.zones[0].id,
        eni_amount=2)
    image = alicloud.ecs.get_images(name_regex="^ubuntu_18.*64",
        most_recent=True,
        owners="system")
    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "tf-testAccSlbMasterSlaveServerGroupVpc"
    number = config.get("number")
    if number is None:
        number = "1"
    main_network = alicloud.vpc.Network("mainNetwork", cidr_block="172.16.0.0/16")
    main_switch = alicloud.vpc.Switch("mainSwitch",
        vpc_id=main_network.id,
        zone_id=default_zones.zones[0].id,
        vswitch_name=name,
        cidr_block="172.16.0.0/16")
    group_security_group = alicloud.ecs.SecurityGroup("groupSecurityGroup", vpc_id=main_network.id)
    instance_instance = []
    for range in [{"value": i} for i in range(0, 2)]:
        instance_instance.append(alicloud.ecs.Instance(f"instanceInstance-{range['value']}",
            image_id=image.images[0].id,
            instance_type=default_instance_types.instance_types[0].id,
            instance_name=name,
            security_groups=[group_security_group.id],
            internet_charge_type="PayByTraffic",
            internet_max_bandwidth_out=10,
            availability_zone=default_zones.zones[0].id,
            instance_charge_type="PostPaid",
            system_disk_category="cloud_efficiency",
            vswitch_id=main_switch.id))
    instance_application_load_balancer = alicloud.slb.ApplicationLoadBalancer("instanceApplicationLoadBalancer",
        load_balancer_name=name,
        vswitch_id=main_switch.id,
        load_balancer_spec="slb.s2.small")
    group_master_slave_server_group = alicloud.slb.MasterSlaveServerGroup("groupMasterSlaveServerGroup",
        load_balancer_id=instance_application_load_balancer.id,
        servers=[
            alicloud.slb.MasterSlaveServerGroupServerArgs(
                server_id=instance_instance[0].id,
                port=100,
                weight=100,
                server_type="Master",
            ),
            alicloud.slb.MasterSlaveServerGroupServerArgs(
                server_id=instance_instance[1].id,
                port=100,
                weight=100,
                server_type="Slave",
            ),
        ])
    sample_ds = alicloud.slb.get_master_slave_server_groups_output(load_balancer_id=instance_application_load_balancer.id)
    pulumi.export("firstSlbServerGroupId", sample_ds.groups[0].id)
    ```


    :param Sequence[str] ids: A list of master slave server group IDs to filter results.
    :param str load_balancer_id: ID of the SLB.
    :param str name_regex: A regex string to filter results by master slave server group name.
    """
    ...
