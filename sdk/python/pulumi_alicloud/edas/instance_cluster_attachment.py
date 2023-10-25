# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InstanceClusterAttachmentArgs', 'InstanceClusterAttachment']

@pulumi.input_type
class InstanceClusterAttachmentArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 instance_ids: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        The set of arguments for constructing a InstanceClusterAttachment resource.
        :param pulumi.Input[str] cluster_id: The ID of the cluster that you want to create the application.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: The ID of instance. Type: list.
        """
        InstanceClusterAttachmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_id=cluster_id,
            instance_ids=instance_ids,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_id: Optional[pulumi.Input[str]] = None,
             instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cluster_id is None and 'clusterId' in kwargs:
            cluster_id = kwargs['clusterId']
        if cluster_id is None:
            raise TypeError("Missing 'cluster_id' argument")
        if instance_ids is None and 'instanceIds' in kwargs:
            instance_ids = kwargs['instanceIds']
        if instance_ids is None:
            raise TypeError("Missing 'instance_ids' argument")

        _setter("cluster_id", cluster_id)
        _setter("instance_ids", instance_ids)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The ID of the cluster that you want to create the application.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The ID of instance. Type: list.
        """
        return pulumi.get(self, "instance_ids")

    @instance_ids.setter
    def instance_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "instance_ids", value)


@pulumi.input_type
class _InstanceClusterAttachmentState:
    def __init__(__self__, *,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 cluster_member_ids: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 ecu_map: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status_map: Optional[pulumi.Input[Mapping[str, pulumi.Input[int]]]] = None):
        """
        Input properties used for looking up and filtering InstanceClusterAttachment resources.
        :param pulumi.Input[str] cluster_id: The ID of the cluster that you want to create the application.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] cluster_member_ids: The cluster members map of the resource supplied above. The key is instance_id and the value is cluster_member_id.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] ecu_map: The ecu map of the resource supplied above. The key is instance_id and the value is ecu_id.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: The ID of instance. Type: list.
        :param pulumi.Input[Mapping[str, pulumi.Input[int]]] status_map: The status map of the resource supplied above. The key is instance_id and the values are 1(running) 0(converting) -1(failed) and -2(offline).
        """
        _InstanceClusterAttachmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_id=cluster_id,
            cluster_member_ids=cluster_member_ids,
            ecu_map=ecu_map,
            instance_ids=instance_ids,
            status_map=status_map,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_id: Optional[pulumi.Input[str]] = None,
             cluster_member_ids: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
             ecu_map: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
             instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             status_map: Optional[pulumi.Input[Mapping[str, pulumi.Input[int]]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cluster_id is None and 'clusterId' in kwargs:
            cluster_id = kwargs['clusterId']
        if cluster_member_ids is None and 'clusterMemberIds' in kwargs:
            cluster_member_ids = kwargs['clusterMemberIds']
        if ecu_map is None and 'ecuMap' in kwargs:
            ecu_map = kwargs['ecuMap']
        if instance_ids is None and 'instanceIds' in kwargs:
            instance_ids = kwargs['instanceIds']
        if status_map is None and 'statusMap' in kwargs:
            status_map = kwargs['statusMap']

        if cluster_id is not None:
            _setter("cluster_id", cluster_id)
        if cluster_member_ids is not None:
            _setter("cluster_member_ids", cluster_member_ids)
        if ecu_map is not None:
            _setter("ecu_map", ecu_map)
        if instance_ids is not None:
            _setter("instance_ids", instance_ids)
        if status_map is not None:
            _setter("status_map", status_map)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the cluster that you want to create the application.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="clusterMemberIds")
    def cluster_member_ids(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The cluster members map of the resource supplied above. The key is instance_id and the value is cluster_member_id.
        """
        return pulumi.get(self, "cluster_member_ids")

    @cluster_member_ids.setter
    def cluster_member_ids(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "cluster_member_ids", value)

    @property
    @pulumi.getter(name="ecuMap")
    def ecu_map(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The ecu map of the resource supplied above. The key is instance_id and the value is ecu_id.
        """
        return pulumi.get(self, "ecu_map")

    @ecu_map.setter
    def ecu_map(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "ecu_map", value)

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The ID of instance. Type: list.
        """
        return pulumi.get(self, "instance_ids")

    @instance_ids.setter
    def instance_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "instance_ids", value)

    @property
    @pulumi.getter(name="statusMap")
    def status_map(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[int]]]]:
        """
        The status map of the resource supplied above. The key is instance_id and the values are 1(running) 0(converting) -1(failed) and -2(offline).
        """
        return pulumi.get(self, "status_map")

    @status_map.setter
    def status_map(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[int]]]]):
        pulumi.set(self, "status_map", value)


class InstanceClusterAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an EDAS instance cluster attachment resource, see [What is EDAS Instance Cluster Attachment](https://www.alibabacloud.com/help/en/edas/developer-reference/api-edas-2017-08-01-installagent).

        > **NOTE:** Available since v1.82.0.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the cluster that you want to create the application.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: The ID of instance. Type: list.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceClusterAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an EDAS instance cluster attachment resource, see [What is EDAS Instance Cluster Attachment](https://www.alibabacloud.com/help/en/edas/developer-reference/api-edas-2017-08-01-installagent).

        > **NOTE:** Available since v1.82.0.

        :param str resource_name: The name of the resource.
        :param InstanceClusterAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceClusterAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            InstanceClusterAttachmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceClusterAttachmentArgs.__new__(InstanceClusterAttachmentArgs)

            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            if instance_ids is None and not opts.urn:
                raise TypeError("Missing required property 'instance_ids'")
            __props__.__dict__["instance_ids"] = instance_ids
            __props__.__dict__["cluster_member_ids"] = None
            __props__.__dict__["ecu_map"] = None
            __props__.__dict__["status_map"] = None
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
            instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            status_map: Optional[pulumi.Input[Mapping[str, pulumi.Input[int]]]] = None) -> 'InstanceClusterAttachment':
        """
        Get an existing InstanceClusterAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The ID of the cluster that you want to create the application.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] cluster_member_ids: The cluster members map of the resource supplied above. The key is instance_id and the value is cluster_member_id.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] ecu_map: The ecu map of the resource supplied above. The key is instance_id and the value is ecu_id.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: The ID of instance. Type: list.
        :param pulumi.Input[Mapping[str, pulumi.Input[int]]] status_map: The status map of the resource supplied above. The key is instance_id and the values are 1(running) 0(converting) -1(failed) and -2(offline).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceClusterAttachmentState.__new__(_InstanceClusterAttachmentState)

        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["cluster_member_ids"] = cluster_member_ids
        __props__.__dict__["ecu_map"] = ecu_map
        __props__.__dict__["instance_ids"] = instance_ids
        __props__.__dict__["status_map"] = status_map
        return InstanceClusterAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The ID of the cluster that you want to create the application.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="clusterMemberIds")
    def cluster_member_ids(self) -> pulumi.Output[Mapping[str, str]]:
        """
        The cluster members map of the resource supplied above. The key is instance_id and the value is cluster_member_id.
        """
        return pulumi.get(self, "cluster_member_ids")

    @property
    @pulumi.getter(name="ecuMap")
    def ecu_map(self) -> pulumi.Output[Mapping[str, str]]:
        """
        The ecu map of the resource supplied above. The key is instance_id and the value is ecu_id.
        """
        return pulumi.get(self, "ecu_map")

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        The ID of instance. Type: list.
        """
        return pulumi.get(self, "instance_ids")

    @property
    @pulumi.getter(name="statusMap")
    def status_map(self) -> pulumi.Output[Mapping[str, int]]:
        """
        The status map of the resource supplied above. The key is instance_id and the values are 1(running) 0(converting) -1(failed) and -2(offline).
        """
        return pulumi.get(self, "status_map")

