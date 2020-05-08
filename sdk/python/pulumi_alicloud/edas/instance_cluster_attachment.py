# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class InstanceClusterAttachment(pulumi.CustomResource):
    cluster_id: pulumi.Output[str]
    """
    The ID of the cluster that you want to create the application.
    """
    cluster_member_ids: pulumi.Output[dict]
    """
    The cluster members map of the resource supplied above. The key is instance_id and the value is cluster_member_id.
    """
    ecu_map: pulumi.Output[dict]
    """
    The ecu map of the resource supplied above. The key is instance_id and the value is ecu_id.
    """
    instance_ids: pulumi.Output[list]
    """
    The ID of instance. Type: list.
    """
    status_map: pulumi.Output[dict]
    """
    The status map of the resource supplied above. The key is instance_id and the values are 1(running) 0(converting) -1(failed) and -2(offline).
    """
    def __init__(__self__, resource_name, opts=None, cluster_id=None, instance_ids=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides an EDAS instance cluster attachment resource.

        > **NOTE:** Available in 1.82.0+




        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the cluster that you want to create the application.
        :param pulumi.Input[list] instance_ids: The ID of instance. Type: list.
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
            opts.version = utilities.get_version()
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
    def get(resource_name, id, opts=None, cluster_id=None, cluster_member_ids=None, ecu_map=None, instance_ids=None, status_map=None):
        """
        Get an existing InstanceClusterAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the cluster that you want to create the application.
        :param pulumi.Input[dict] cluster_member_ids: The cluster members map of the resource supplied above. The key is instance_id and the value is cluster_member_id.
        :param pulumi.Input[dict] ecu_map: The ecu map of the resource supplied above. The key is instance_id and the value is ecu_id.
        :param pulumi.Input[list] instance_ids: The ID of instance. Type: list.
        :param pulumi.Input[dict] status_map: The status map of the resource supplied above. The key is instance_id and the values are 1(running) 0(converting) -1(failed) and -2(offline).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["cluster_id"] = cluster_id
        __props__["cluster_member_ids"] = cluster_member_ids
        __props__["ecu_map"] = ecu_map
        __props__["instance_ids"] = instance_ids
        __props__["status_map"] = status_map
        return InstanceClusterAttachment(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

