# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SnapshotArgs', 'Snapshot']

@pulumi.input_type
class SnapshotArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 snapshot_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Snapshot resource.
        :param pulumi.Input[str] instance_id: The ID of the database file system.
        :param pulumi.Input[str] description: Description of the snapshot. The description must be `2` to `256` characters in length. It must start with a letter, and cannot start with `http://` or `https://`.
        :param pulumi.Input[bool] force: Whether to force deletion of snapshots.
        :param pulumi.Input[int] retention_days: The retention time of the snapshot. Unit: days. Snapshots are automatically released after the retention time expires. Valid values: `1` to `65536`.
        :param pulumi.Input[str] snapshot_name: The display name of the snapshot. The length is `2` to `128` characters. It must start with a large or small letter or Chinese, and cannot start with `http://` and `https://`. It can contain numbers, colons (:), underscores (_), or hyphens (-). To prevent name conflicts with automatic snapshots, you cannot start with `auto`.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if retention_days is not None:
            pulumi.set(__self__, "retention_days", retention_days)
        if snapshot_name is not None:
            pulumi.set(__self__, "snapshot_name", snapshot_name)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the database file system.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the snapshot. The description must be `2` to `256` characters in length. It must start with a letter, and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to force deletion of snapshots.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force", value)

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> Optional[pulumi.Input[int]]:
        """
        The retention time of the snapshot. Unit: days. Snapshots are automatically released after the retention time expires. Valid values: `1` to `65536`.
        """
        return pulumi.get(self, "retention_days")

    @retention_days.setter
    def retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention_days", value)

    @property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> Optional[pulumi.Input[str]]:
        """
        The display name of the snapshot. The length is `2` to `128` characters. It must start with a large or small letter or Chinese, and cannot start with `http://` and `https://`. It can contain numbers, colons (:), underscores (_), or hyphens (-). To prevent name conflicts with automatic snapshots, you cannot start with `auto`.
        """
        return pulumi.get(self, "snapshot_name")

    @snapshot_name.setter
    def snapshot_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snapshot_name", value)


@pulumi.input_type
class _SnapshotState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 snapshot_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Snapshot resources.
        :param pulumi.Input[str] description: Description of the snapshot. The description must be `2` to `256` characters in length. It must start with a letter, and cannot start with `http://` or `https://`.
        :param pulumi.Input[bool] force: Whether to force deletion of snapshots.
        :param pulumi.Input[str] instance_id: The ID of the database file system.
        :param pulumi.Input[int] retention_days: The retention time of the snapshot. Unit: days. Snapshots are automatically released after the retention time expires. Valid values: `1` to `65536`.
        :param pulumi.Input[str] snapshot_name: The display name of the snapshot. The length is `2` to `128` characters. It must start with a large or small letter or Chinese, and cannot start with `http://` and `https://`. It can contain numbers, colons (:), underscores (_), or hyphens (-). To prevent name conflicts with automatic snapshots, you cannot start with `auto`.
        :param pulumi.Input[str] status: The status of the Snapshot.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if retention_days is not None:
            pulumi.set(__self__, "retention_days", retention_days)
        if snapshot_name is not None:
            pulumi.set(__self__, "snapshot_name", snapshot_name)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the snapshot. The description must be `2` to `256` characters in length. It must start with a letter, and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to force deletion of snapshots.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the database file system.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> Optional[pulumi.Input[int]]:
        """
        The retention time of the snapshot. Unit: days. Snapshots are automatically released after the retention time expires. Valid values: `1` to `65536`.
        """
        return pulumi.get(self, "retention_days")

    @retention_days.setter
    def retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention_days", value)

    @property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> Optional[pulumi.Input[str]]:
        """
        The display name of the snapshot. The length is `2` to `128` characters. It must start with a large or small letter or Chinese, and cannot start with `http://` and `https://`. It can contain numbers, colons (:), underscores (_), or hyphens (-). To prevent name conflicts with automatic snapshots, you cannot start with `auto`.
        """
        return pulumi.get(self, "snapshot_name")

    @snapshot_name.setter
    def snapshot_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snapshot_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the Snapshot.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class Snapshot(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 snapshot_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a DBFS Snapshot resource.

        For information about DBFS Snapshot and how to use it.

        > **NOTE:** Available since v1.156.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        zone_id = "cn-hangzhou-i"
        example_instance_types = alicloud.ecs.get_instance_types(availability_zone=zone_id,
            instance_type_family="ecs.g7se")
        example_images = alicloud.ecs.get_images(instance_type=example_instance_types.instance_types[len(example_instance_types.instance_types) - 1].id,
            name_regex="^aliyun_2",
            owners="system")
        example_network = alicloud.vpc.Network("exampleNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        example_switch = alicloud.vpc.Switch("exampleSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=example_network.id,
            zone_id=zone_id)
        example_security_group = alicloud.ecs.SecurityGroup("exampleSecurityGroup", vpc_id=example_network.id)
        example_instance = alicloud.ecs.Instance("exampleInstance",
            availability_zone=zone_id,
            instance_name=name,
            image_id=example_images.images[1].id,
            instance_type=example_instance_types.instance_types[len(example_instance_types.instance_types) - 1].id,
            security_groups=[example_security_group.id],
            vswitch_id=example_switch.id,
            system_disk_category="cloud_essd")
        example_databasefilesystem_instance_instance = alicloud.databasefilesystem.Instance("exampleDatabasefilesystem/instanceInstance",
            category="standard",
            zone_id=zone_id,
            performance_level="PL1",
            instance_name=name,
            size=100)
        example_instance_attachment = alicloud.databasefilesystem.InstanceAttachment("exampleInstanceAttachment",
            ecs_id=example_instance.id,
            instance_id=example_databasefilesystem / instance_instance["id"])
        example_snapshot = alicloud.databasefilesystem.Snapshot("exampleSnapshot",
            instance_id=example_instance_attachment.instance_id,
            snapshot_name=name,
            description=name,
            retention_days=30)
        ```

        ## Import

        DBFS Snapshot can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:databasefilesystem/snapshot:Snapshot example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the snapshot. The description must be `2` to `256` characters in length. It must start with a letter, and cannot start with `http://` or `https://`.
        :param pulumi.Input[bool] force: Whether to force deletion of snapshots.
        :param pulumi.Input[str] instance_id: The ID of the database file system.
        :param pulumi.Input[int] retention_days: The retention time of the snapshot. Unit: days. Snapshots are automatically released after the retention time expires. Valid values: `1` to `65536`.
        :param pulumi.Input[str] snapshot_name: The display name of the snapshot. The length is `2` to `128` characters. It must start with a large or small letter or Chinese, and cannot start with `http://` and `https://`. It can contain numbers, colons (:), underscores (_), or hyphens (-). To prevent name conflicts with automatic snapshots, you cannot start with `auto`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SnapshotArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DBFS Snapshot resource.

        For information about DBFS Snapshot and how to use it.

        > **NOTE:** Available since v1.156.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        zone_id = "cn-hangzhou-i"
        example_instance_types = alicloud.ecs.get_instance_types(availability_zone=zone_id,
            instance_type_family="ecs.g7se")
        example_images = alicloud.ecs.get_images(instance_type=example_instance_types.instance_types[len(example_instance_types.instance_types) - 1].id,
            name_regex="^aliyun_2",
            owners="system")
        example_network = alicloud.vpc.Network("exampleNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        example_switch = alicloud.vpc.Switch("exampleSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=example_network.id,
            zone_id=zone_id)
        example_security_group = alicloud.ecs.SecurityGroup("exampleSecurityGroup", vpc_id=example_network.id)
        example_instance = alicloud.ecs.Instance("exampleInstance",
            availability_zone=zone_id,
            instance_name=name,
            image_id=example_images.images[1].id,
            instance_type=example_instance_types.instance_types[len(example_instance_types.instance_types) - 1].id,
            security_groups=[example_security_group.id],
            vswitch_id=example_switch.id,
            system_disk_category="cloud_essd")
        example_databasefilesystem_instance_instance = alicloud.databasefilesystem.Instance("exampleDatabasefilesystem/instanceInstance",
            category="standard",
            zone_id=zone_id,
            performance_level="PL1",
            instance_name=name,
            size=100)
        example_instance_attachment = alicloud.databasefilesystem.InstanceAttachment("exampleInstanceAttachment",
            ecs_id=example_instance.id,
            instance_id=example_databasefilesystem / instance_instance["id"])
        example_snapshot = alicloud.databasefilesystem.Snapshot("exampleSnapshot",
            instance_id=example_instance_attachment.instance_id,
            snapshot_name=name,
            description=name,
            retention_days=30)
        ```

        ## Import

        DBFS Snapshot can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:databasefilesystem/snapshot:Snapshot example <id>
        ```

        :param str resource_name: The name of the resource.
        :param SnapshotArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SnapshotArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 snapshot_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SnapshotArgs.__new__(SnapshotArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["force"] = force
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["retention_days"] = retention_days
            __props__.__dict__["snapshot_name"] = snapshot_name
            __props__.__dict__["status"] = None
        super(Snapshot, __self__).__init__(
            'alicloud:databasefilesystem/snapshot:Snapshot',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            force: Optional[pulumi.Input[bool]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            retention_days: Optional[pulumi.Input[int]] = None,
            snapshot_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'Snapshot':
        """
        Get an existing Snapshot resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the snapshot. The description must be `2` to `256` characters in length. It must start with a letter, and cannot start with `http://` or `https://`.
        :param pulumi.Input[bool] force: Whether to force deletion of snapshots.
        :param pulumi.Input[str] instance_id: The ID of the database file system.
        :param pulumi.Input[int] retention_days: The retention time of the snapshot. Unit: days. Snapshots are automatically released after the retention time expires. Valid values: `1` to `65536`.
        :param pulumi.Input[str] snapshot_name: The display name of the snapshot. The length is `2` to `128` characters. It must start with a large or small letter or Chinese, and cannot start with `http://` and `https://`. It can contain numbers, colons (:), underscores (_), or hyphens (-). To prevent name conflicts with automatic snapshots, you cannot start with `auto`.
        :param pulumi.Input[str] status: The status of the Snapshot.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SnapshotState.__new__(_SnapshotState)

        __props__.__dict__["description"] = description
        __props__.__dict__["force"] = force
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["retention_days"] = retention_days
        __props__.__dict__["snapshot_name"] = snapshot_name
        __props__.__dict__["status"] = status
        return Snapshot(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the snapshot. The description must be `2` to `256` characters in length. It must start with a letter, and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def force(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to force deletion of snapshots.
        """
        return pulumi.get(self, "force")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the database file system.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> pulumi.Output[Optional[int]]:
        """
        The retention time of the snapshot. Unit: days. Snapshots are automatically released after the retention time expires. Valid values: `1` to `65536`.
        """
        return pulumi.get(self, "retention_days")

    @property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> pulumi.Output[Optional[str]]:
        """
        The display name of the snapshot. The length is `2` to `128` characters. It must start with a large or small letter or Chinese, and cannot start with `http://` and `https://`. It can contain numbers, colons (:), underscores (_), or hyphens (-). To prevent name conflicts with automatic snapshots, you cannot start with `auto`.
        """
        return pulumi.get(self, "snapshot_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the Snapshot.
        """
        return pulumi.get(self, "status")

