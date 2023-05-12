# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['EcsSnapshotArgs', 'EcsSnapshot']

@pulumi.input_type
class EcsSnapshotArgs:
    def __init__(__self__, *,
                 disk_id: pulumi.Input[str],
                 category: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 instant_access: Optional[pulumi.Input[bool]] = None,
                 instant_access_retention_days: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 snapshot_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a EcsSnapshot resource.
        :param pulumi.Input[str] disk_id: The ID of the disk.
        :param pulumi.Input[str] category: The category of the snapshot. Valid Values: `standard` and `flash`.
        :param pulumi.Input[str] description: The description of the snapshot.
        :param pulumi.Input[bool] force: Specifies whether to forcibly delete the snapshot that has been used to create disks.
        :param pulumi.Input[bool] instant_access: Specifies whether to enable the instant access feature.
        :param pulumi.Input[int] instant_access_retention_days: Specifies the retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
        :param pulumi.Input[str] resource_group_id: The resource group id.
        :param pulumi.Input[int] retention_days: The retention period of the snapshot.
        :param pulumi.Input[str] snapshot_name: The name of the snapshot.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the snapshot.
               
               > **NOTE:** If `force` is true, After an snapshot is deleted, the disks created from this snapshot cannot be re-initialized.
        """
        pulumi.set(__self__, "disk_id", disk_id)
        if category is not None:
            pulumi.set(__self__, "category", category)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if instant_access is not None:
            pulumi.set(__self__, "instant_access", instant_access)
        if instant_access_retention_days is not None:
            pulumi.set(__self__, "instant_access_retention_days", instant_access_retention_days)
        if name is not None:
            warnings.warn("""Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead.""")
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if retention_days is not None:
            pulumi.set(__self__, "retention_days", retention_days)
        if snapshot_name is not None:
            pulumi.set(__self__, "snapshot_name", snapshot_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="diskId")
    def disk_id(self) -> pulumi.Input[str]:
        """
        The ID of the disk.
        """
        return pulumi.get(self, "disk_id")

    @disk_id.setter
    def disk_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "disk_id", value)

    @property
    @pulumi.getter
    def category(self) -> Optional[pulumi.Input[str]]:
        """
        The category of the snapshot. Valid Values: `standard` and `flash`.
        """
        return pulumi.get(self, "category")

    @category.setter
    def category(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "category", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the snapshot.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to forcibly delete the snapshot that has been used to create disks.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force", value)

    @property
    @pulumi.getter(name="instantAccess")
    def instant_access(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable the instant access feature.
        """
        return pulumi.get(self, "instant_access")

    @instant_access.setter
    def instant_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "instant_access", value)

    @property
    @pulumi.getter(name="instantAccessRetentionDays")
    def instant_access_retention_days(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
        """
        return pulumi.get(self, "instant_access_retention_days")

    @instant_access_retention_days.setter
    def instant_access_retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "instant_access_retention_days", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The resource group id.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> Optional[pulumi.Input[int]]:
        """
        The retention period of the snapshot.
        """
        return pulumi.get(self, "retention_days")

    @retention_days.setter
    def retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention_days", value)

    @property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the snapshot.
        """
        return pulumi.get(self, "snapshot_name")

    @snapshot_name.setter
    def snapshot_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snapshot_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the snapshot.

        > **NOTE:** If `force` is true, After an snapshot is deleted, the disks created from this snapshot cannot be re-initialized.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _EcsSnapshotState:
    def __init__(__self__, *,
                 category: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disk_id: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 instant_access: Optional[pulumi.Input[bool]] = None,
                 instant_access_retention_days: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 snapshot_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        Input properties used for looking up and filtering EcsSnapshot resources.
        :param pulumi.Input[str] category: The category of the snapshot. Valid Values: `standard` and `flash`.
        :param pulumi.Input[str] description: The description of the snapshot.
        :param pulumi.Input[str] disk_id: The ID of the disk.
        :param pulumi.Input[bool] force: Specifies whether to forcibly delete the snapshot that has been used to create disks.
        :param pulumi.Input[bool] instant_access: Specifies whether to enable the instant access feature.
        :param pulumi.Input[int] instant_access_retention_days: Specifies the retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
        :param pulumi.Input[str] resource_group_id: The resource group id.
        :param pulumi.Input[int] retention_days: The retention period of the snapshot.
        :param pulumi.Input[str] snapshot_name: The name of the snapshot.
        :param pulumi.Input[str] status: The status of snapshot.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the snapshot.
               
               > **NOTE:** If `force` is true, After an snapshot is deleted, the disks created from this snapshot cannot be re-initialized.
        """
        if category is not None:
            pulumi.set(__self__, "category", category)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disk_id is not None:
            pulumi.set(__self__, "disk_id", disk_id)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if instant_access is not None:
            pulumi.set(__self__, "instant_access", instant_access)
        if instant_access_retention_days is not None:
            pulumi.set(__self__, "instant_access_retention_days", instant_access_retention_days)
        if name is not None:
            warnings.warn("""Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead.""")
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if retention_days is not None:
            pulumi.set(__self__, "retention_days", retention_days)
        if snapshot_name is not None:
            pulumi.set(__self__, "snapshot_name", snapshot_name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def category(self) -> Optional[pulumi.Input[str]]:
        """
        The category of the snapshot. Valid Values: `standard` and `flash`.
        """
        return pulumi.get(self, "category")

    @category.setter
    def category(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "category", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the snapshot.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="diskId")
    def disk_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the disk.
        """
        return pulumi.get(self, "disk_id")

    @disk_id.setter
    def disk_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "disk_id", value)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to forcibly delete the snapshot that has been used to create disks.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force", value)

    @property
    @pulumi.getter(name="instantAccess")
    def instant_access(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable the instant access feature.
        """
        return pulumi.get(self, "instant_access")

    @instant_access.setter
    def instant_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "instant_access", value)

    @property
    @pulumi.getter(name="instantAccessRetentionDays")
    def instant_access_retention_days(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
        """
        return pulumi.get(self, "instant_access_retention_days")

    @instant_access_retention_days.setter
    def instant_access_retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "instant_access_retention_days", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The resource group id.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> Optional[pulumi.Input[int]]:
        """
        The retention period of the snapshot.
        """
        return pulumi.get(self, "retention_days")

    @retention_days.setter
    def retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention_days", value)

    @property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the snapshot.
        """
        return pulumi.get(self, "snapshot_name")

    @snapshot_name.setter
    def snapshot_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snapshot_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of snapshot.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the snapshot.

        > **NOTE:** If `force` is true, After an snapshot is deleted, the disks created from this snapshot cannot be re-initialized.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)


class EcsSnapshot(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 category: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disk_id: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 instant_access: Optional[pulumi.Input[bool]] = None,
                 instant_access_retention_days: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 snapshot_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        """
        Provides a ECS Snapshot resource.

        For information about ECS Snapshot and how to use it, see [What is Snapshot](https://www.alibabacloud.com/help/en/doc-detail/25524.htm).

        > **NOTE:** Available in v1.120.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.ecs.EcsSnapshot("default",
            category="standard",
            description="Test For Terraform",
            disk_id="d-gw8csgxxxxxxxxx",
            retention_days=20,
            snapshot_name="tf-test",
            tags={
                "Created": "TF",
                "For": "Acceptance-test",
            })
        ```

        ## Import

        ECS Snapshot can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/ecsSnapshot:EcsSnapshot example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] category: The category of the snapshot. Valid Values: `standard` and `flash`.
        :param pulumi.Input[str] description: The description of the snapshot.
        :param pulumi.Input[str] disk_id: The ID of the disk.
        :param pulumi.Input[bool] force: Specifies whether to forcibly delete the snapshot that has been used to create disks.
        :param pulumi.Input[bool] instant_access: Specifies whether to enable the instant access feature.
        :param pulumi.Input[int] instant_access_retention_days: Specifies the retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
        :param pulumi.Input[str] resource_group_id: The resource group id.
        :param pulumi.Input[int] retention_days: The retention period of the snapshot.
        :param pulumi.Input[str] snapshot_name: The name of the snapshot.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the snapshot.
               
               > **NOTE:** If `force` is true, After an snapshot is deleted, the disks created from this snapshot cannot be re-initialized.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EcsSnapshotArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ECS Snapshot resource.

        For information about ECS Snapshot and how to use it, see [What is Snapshot](https://www.alibabacloud.com/help/en/doc-detail/25524.htm).

        > **NOTE:** Available in v1.120.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.ecs.EcsSnapshot("default",
            category="standard",
            description="Test For Terraform",
            disk_id="d-gw8csgxxxxxxxxx",
            retention_days=20,
            snapshot_name="tf-test",
            tags={
                "Created": "TF",
                "For": "Acceptance-test",
            })
        ```

        ## Import

        ECS Snapshot can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/ecsSnapshot:EcsSnapshot example <id>
        ```

        :param str resource_name: The name of the resource.
        :param EcsSnapshotArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EcsSnapshotArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 category: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disk_id: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 instant_access: Optional[pulumi.Input[bool]] = None,
                 instant_access_retention_days: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 snapshot_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EcsSnapshotArgs.__new__(EcsSnapshotArgs)

            __props__.__dict__["category"] = category
            __props__.__dict__["description"] = description
            if disk_id is None and not opts.urn:
                raise TypeError("Missing required property 'disk_id'")
            __props__.__dict__["disk_id"] = disk_id
            __props__.__dict__["force"] = force
            __props__.__dict__["instant_access"] = instant_access
            __props__.__dict__["instant_access_retention_days"] = instant_access_retention_days
            if name is not None and not opts.urn:
                warnings.warn("""Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead.""", DeprecationWarning)
                pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'snapshot_name' instead.""")
            __props__.__dict__["name"] = name
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["retention_days"] = retention_days
            __props__.__dict__["snapshot_name"] = snapshot_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["status"] = None
        super(EcsSnapshot, __self__).__init__(
            'alicloud:ecs/ecsSnapshot:EcsSnapshot',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            category: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            disk_id: Optional[pulumi.Input[str]] = None,
            force: Optional[pulumi.Input[bool]] = None,
            instant_access: Optional[pulumi.Input[bool]] = None,
            instant_access_retention_days: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            retention_days: Optional[pulumi.Input[int]] = None,
            snapshot_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None) -> 'EcsSnapshot':
        """
        Get an existing EcsSnapshot resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] category: The category of the snapshot. Valid Values: `standard` and `flash`.
        :param pulumi.Input[str] description: The description of the snapshot.
        :param pulumi.Input[str] disk_id: The ID of the disk.
        :param pulumi.Input[bool] force: Specifies whether to forcibly delete the snapshot that has been used to create disks.
        :param pulumi.Input[bool] instant_access: Specifies whether to enable the instant access feature.
        :param pulumi.Input[int] instant_access_retention_days: Specifies the retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
        :param pulumi.Input[str] resource_group_id: The resource group id.
        :param pulumi.Input[int] retention_days: The retention period of the snapshot.
        :param pulumi.Input[str] snapshot_name: The name of the snapshot.
        :param pulumi.Input[str] status: The status of snapshot.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the snapshot.
               
               > **NOTE:** If `force` is true, After an snapshot is deleted, the disks created from this snapshot cannot be re-initialized.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EcsSnapshotState.__new__(_EcsSnapshotState)

        __props__.__dict__["category"] = category
        __props__.__dict__["description"] = description
        __props__.__dict__["disk_id"] = disk_id
        __props__.__dict__["force"] = force
        __props__.__dict__["instant_access"] = instant_access
        __props__.__dict__["instant_access_retention_days"] = instant_access_retention_days
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["retention_days"] = retention_days
        __props__.__dict__["snapshot_name"] = snapshot_name
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        return EcsSnapshot(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def category(self) -> pulumi.Output[Optional[str]]:
        """
        The category of the snapshot. Valid Values: `standard` and `flash`.
        """
        return pulumi.get(self, "category")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the snapshot.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="diskId")
    def disk_id(self) -> pulumi.Output[str]:
        """
        The ID of the disk.
        """
        return pulumi.get(self, "disk_id")

    @property
    @pulumi.getter
    def force(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to forcibly delete the snapshot that has been used to create disks.
        """
        return pulumi.get(self, "force")

    @property
    @pulumi.getter(name="instantAccess")
    def instant_access(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to enable the instant access feature.
        """
        return pulumi.get(self, "instant_access")

    @property
    @pulumi.getter(name="instantAccessRetentionDays")
    def instant_access_retention_days(self) -> pulumi.Output[Optional[int]]:
        """
        Specifies the retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
        """
        return pulumi.get(self, "instant_access_retention_days")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        The resource group id.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> pulumi.Output[Optional[int]]:
        """
        The retention period of the snapshot.
        """
        return pulumi.get(self, "retention_days")

    @property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> pulumi.Output[str]:
        """
        The name of the snapshot.
        """
        return pulumi.get(self, "snapshot_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of snapshot.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the snapshot.

        > **NOTE:** If `force` is true, After an snapshot is deleted, the disks created from this snapshot cannot be re-initialized.
        """
        return pulumi.get(self, "tags")

