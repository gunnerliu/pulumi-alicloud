# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['MonitorGroupInstances']


class MonitorGroupInstances(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 instances: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MonitorGroupInstancesInstanceArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Cloud Monitor Service Monitor Group Instances resource.

        For information about Cloud Monitor Service Monitor Group Instances and how to use it, see [What is Monitor Group Instances](https://www.alibabacloud.com/help/en/doc-detail/115031.htm).

        > **NOTE:** Available in v1.115.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name="tf-testacc-vpcname",
            cidr_block="192.168.0.0/16")
        default_monitor_group = alicloud.cms.MonitorGroup("defaultMonitorGroup", monitor_group_name="tf-testaccmonitorgroup")
        example = alicloud.cms.MonitorGroupInstances("example",
            group_id=default_monitor_group.id,
            instances=[alicloud.cms.MonitorGroupInstancesInstanceArgs(
                instance_id=default_network.id,
                instance_name="tf-testacc-vpcname",
                region_id="cn-hangzhou",
                category="vpc",
            )])
        ```

        ## Import

        Cloud Monitor Service Monitor Group Instances can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cms/monitorGroupInstances:MonitorGroupInstances example <group_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: The id of Cms Group.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MonitorGroupInstancesInstanceArgs']]]] instances: Instance information added to the Cms Group.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if group_id is None and not opts.urn:
                raise TypeError("Missing required property 'group_id'")
            __props__['group_id'] = group_id
            if instances is None and not opts.urn:
                raise TypeError("Missing required property 'instances'")
            __props__['instances'] = instances
        super(MonitorGroupInstances, __self__).__init__(
            'alicloud:cms/monitorGroupInstances:MonitorGroupInstances',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            instances: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MonitorGroupInstancesInstanceArgs']]]]] = None) -> 'MonitorGroupInstances':
        """
        Get an existing MonitorGroupInstances resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: The id of Cms Group.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MonitorGroupInstancesInstanceArgs']]]] instances: Instance information added to the Cms Group.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["group_id"] = group_id
        __props__["instances"] = instances
        return MonitorGroupInstances(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        The id of Cms Group.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter
    def instances(self) -> pulumi.Output[Sequence['outputs.MonitorGroupInstancesInstance']]:
        """
        Instance information added to the Cms Group.
        """
        return pulumi.get(self, "instances")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

