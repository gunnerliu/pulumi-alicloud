# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['InstanceClusterAttachment']


class InstanceClusterAttachment(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 instance_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides an EDAS instance cluster attachment resource.

        > **NOTE:** Available in 1.82.0+

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.edas.InstanceClusterAttachment("default",
            cluster_id=var["cluster_id"],
            instance_ids=var["instance_ids"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the cluster that you want to create the application.
        :param pulumi.Input[List[pulumi.Input[str]]] instance_ids: The ID of instance. Type: list.
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

            if cluster_id is None:
                raise TypeError("Missing required property 'cluster_id'")
            __props__['cluster_id'] = cluster_id
            if instance_ids is None:
                raise TypeError("Missing required property 'instance_ids'")
            __props__['instance_ids'] = instance_ids
            __props__['cluster_member_ids'] = None
            __props__['ecu_map'] = None
            __props__['status_map'] = None
        super(InstanceClusterAttachment, __self__).__init__(
            'alicloud:edas/instanceClusterAttachment:InstanceClusterAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            cluster_member_ids: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            ecu_map: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            instance_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            status_map: Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]] = None) -> 'InstanceClusterAttachment':
        """
        Get an existing InstanceClusterAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the cluster that you want to create the application.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] cluster_member_ids: The cluster members map of the resource supplied above. The key is instance_id and the value is cluster_member_id.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] ecu_map: The ecu map of the resource supplied above. The key is instance_id and the value is ecu_id.
        :param pulumi.Input[List[pulumi.Input[str]]] instance_ids: The ID of instance. Type: list.
        :param pulumi.Input[Mapping[str, pulumi.Input[float]]] status_map: The status map of the resource supplied above. The key is instance_id and the values are 1(running) 0(converting) -1(failed) and -2(offline).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["cluster_id"] = cluster_id
        __props__["cluster_member_ids"] = cluster_member_ids
        __props__["ecu_map"] = ecu_map
        __props__["instance_ids"] = instance_ids
        __props__["status_map"] = status_map
        return InstanceClusterAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        """
        The ID of the cluster that you want to create the application.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="clusterMemberIds")
    def cluster_member_ids(self) -> Mapping[str, str]:
        """
        The cluster members map of the resource supplied above. The key is instance_id and the value is cluster_member_id.
        """
        return pulumi.get(self, "cluster_member_ids")

    @property
    @pulumi.getter(name="ecuMap")
    def ecu_map(self) -> Mapping[str, str]:
        """
        The ecu map of the resource supplied above. The key is instance_id and the value is ecu_id.
        """
        return pulumi.get(self, "ecu_map")

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> List[str]:
        """
        The ID of instance. Type: list.
        """
        return pulumi.get(self, "instance_ids")

    @property
    @pulumi.getter(name="statusMap")
    def status_map(self) -> Mapping[str, float]:
        """
        The status map of the resource supplied above. The key is instance_id and the values are 1(running) 0(converting) -1(failed) and -2(offline).
        """
        return pulumi.get(self, "status_map")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

