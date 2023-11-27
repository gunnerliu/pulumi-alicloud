# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ServiceMonitoringAgentProcessArgs', 'ServiceMonitoringAgentProcess']

@pulumi.input_type
class ServiceMonitoringAgentProcessArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 process_name: pulumi.Input[str],
                 process_user: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ServiceMonitoringAgentProcess resource.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] process_name: The name of the process.
        :param pulumi.Input[str] process_user: The user who launches the process.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "process_name", process_name)
        if process_user is not None:
            pulumi.set(__self__, "process_user", process_user)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="processName")
    def process_name(self) -> pulumi.Input[str]:
        """
        The name of the process.
        """
        return pulumi.get(self, "process_name")

    @process_name.setter
    def process_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "process_name", value)

    @property
    @pulumi.getter(name="processUser")
    def process_user(self) -> Optional[pulumi.Input[str]]:
        """
        The user who launches the process.
        """
        return pulumi.get(self, "process_user")

    @process_user.setter
    def process_user(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "process_user", value)


@pulumi.input_type
class _ServiceMonitoringAgentProcessState:
    def __init__(__self__, *,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 process_id: Optional[pulumi.Input[str]] = None,
                 process_name: Optional[pulumi.Input[str]] = None,
                 process_user: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceMonitoringAgentProcess resources.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] process_id: The ID of the process.
        :param pulumi.Input[str] process_name: The name of the process.
        :param pulumi.Input[str] process_user: The user who launches the process.
        """
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if process_id is not None:
            pulumi.set(__self__, "process_id", process_id)
        if process_name is not None:
            pulumi.set(__self__, "process_name", process_name)
        if process_user is not None:
            pulumi.set(__self__, "process_user", process_user)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="processId")
    def process_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the process.
        """
        return pulumi.get(self, "process_id")

    @process_id.setter
    def process_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "process_id", value)

    @property
    @pulumi.getter(name="processName")
    def process_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the process.
        """
        return pulumi.get(self, "process_name")

    @process_name.setter
    def process_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "process_name", value)

    @property
    @pulumi.getter(name="processUser")
    def process_user(self) -> Optional[pulumi.Input[str]]:
        """
        The user who launches the process.
        """
        return pulumi.get(self, "process_user")

    @process_user.setter
    def process_user(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "process_user", value)


class ServiceMonitoringAgentProcess(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 process_name: Optional[pulumi.Input[str]] = None,
                 process_user: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloud Monitor Service Monitoring Agent Process resource.

        For information about Cloud Monitor Service Monitoring Agent Process and how to use it, see [What is Monitoring Agent Process](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-createmonitoragentprocess).

        > **NOTE:** Available since v1.212.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_zones = alicloud.get_zones(available_disk_category="cloud_efficiency",
            available_resource_creation="VSwitch")
        default_instance_types = alicloud.ecs.get_instance_types(availability_zone=default_zones.zones[0].id,
            instance_type_family="ecs.sn1ne")
        default_images = alicloud.ecs.get_images(name_regex="^ubuntu_[0-9]+_[0-9]+_x64*",
            most_recent=True,
            owners="system")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_zones.zones[0].id,
            vswitch_name=name)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_switch.vpc_id)
        default_instance = alicloud.ecs.Instance("defaultInstance",
            image_id=default_images.images[0].id,
            instance_type=default_instance_types.instance_types[0].id,
            instance_name=name,
            security_groups=[__item.id for __item in [default_security_group]],
            internet_charge_type="PayByTraffic",
            internet_max_bandwidth_out=10,
            availability_zone=default_zones.zones[0].id,
            instance_charge_type="PostPaid",
            system_disk_category="cloud_efficiency",
            vswitch_id=default_switch.id)
        default_service_monitoring_agent_process = alicloud.cloudmonitor.ServiceMonitoringAgentProcess("defaultServiceMonitoringAgentProcess",
            instance_id=default_instance.id,
            process_name=name,
            process_user="root")
        ```

        ## Import

        Cloud Monitor Service Monitoring Agent Process can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cloudmonitor/serviceMonitoringAgentProcess:ServiceMonitoringAgentProcess example <instance_id>:<process_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] process_name: The name of the process.
        :param pulumi.Input[str] process_user: The user who launches the process.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceMonitoringAgentProcessArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Monitor Service Monitoring Agent Process resource.

        For information about Cloud Monitor Service Monitoring Agent Process and how to use it, see [What is Monitoring Agent Process](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-createmonitoragentprocess).

        > **NOTE:** Available since v1.212.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_zones = alicloud.get_zones(available_disk_category="cloud_efficiency",
            available_resource_creation="VSwitch")
        default_instance_types = alicloud.ecs.get_instance_types(availability_zone=default_zones.zones[0].id,
            instance_type_family="ecs.sn1ne")
        default_images = alicloud.ecs.get_images(name_regex="^ubuntu_[0-9]+_[0-9]+_x64*",
            most_recent=True,
            owners="system")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_zones.zones[0].id,
            vswitch_name=name)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_switch.vpc_id)
        default_instance = alicloud.ecs.Instance("defaultInstance",
            image_id=default_images.images[0].id,
            instance_type=default_instance_types.instance_types[0].id,
            instance_name=name,
            security_groups=[__item.id for __item in [default_security_group]],
            internet_charge_type="PayByTraffic",
            internet_max_bandwidth_out=10,
            availability_zone=default_zones.zones[0].id,
            instance_charge_type="PostPaid",
            system_disk_category="cloud_efficiency",
            vswitch_id=default_switch.id)
        default_service_monitoring_agent_process = alicloud.cloudmonitor.ServiceMonitoringAgentProcess("defaultServiceMonitoringAgentProcess",
            instance_id=default_instance.id,
            process_name=name,
            process_user="root")
        ```

        ## Import

        Cloud Monitor Service Monitoring Agent Process can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cloudmonitor/serviceMonitoringAgentProcess:ServiceMonitoringAgentProcess example <instance_id>:<process_id>
        ```

        :param str resource_name: The name of the resource.
        :param ServiceMonitoringAgentProcessArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceMonitoringAgentProcessArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 process_name: Optional[pulumi.Input[str]] = None,
                 process_user: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceMonitoringAgentProcessArgs.__new__(ServiceMonitoringAgentProcessArgs)

            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if process_name is None and not opts.urn:
                raise TypeError("Missing required property 'process_name'")
            __props__.__dict__["process_name"] = process_name
            __props__.__dict__["process_user"] = process_user
            __props__.__dict__["process_id"] = None
        super(ServiceMonitoringAgentProcess, __self__).__init__(
            'alicloud:cloudmonitor/serviceMonitoringAgentProcess:ServiceMonitoringAgentProcess',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            process_id: Optional[pulumi.Input[str]] = None,
            process_name: Optional[pulumi.Input[str]] = None,
            process_user: Optional[pulumi.Input[str]] = None) -> 'ServiceMonitoringAgentProcess':
        """
        Get an existing ServiceMonitoringAgentProcess resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] process_id: The ID of the process.
        :param pulumi.Input[str] process_name: The name of the process.
        :param pulumi.Input[str] process_user: The user who launches the process.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceMonitoringAgentProcessState.__new__(_ServiceMonitoringAgentProcessState)

        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["process_id"] = process_id
        __props__.__dict__["process_name"] = process_name
        __props__.__dict__["process_user"] = process_user
        return ServiceMonitoringAgentProcess(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="processId")
    def process_id(self) -> pulumi.Output[str]:
        """
        The ID of the process.
        """
        return pulumi.get(self, "process_id")

    @property
    @pulumi.getter(name="processName")
    def process_name(self) -> pulumi.Output[str]:
        """
        The name of the process.
        """
        return pulumi.get(self, "process_name")

    @property
    @pulumi.getter(name="processUser")
    def process_user(self) -> pulumi.Output[Optional[str]]:
        """
        The user who launches the process.
        """
        return pulumi.get(self, "process_user")

