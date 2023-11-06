# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SnapshotArgs', 'Snapshot']

@pulumi.input_type
class SnapshotArgs:
    def __init__(__self__, *,
                 desktop_id: pulumi.Input[str],
                 snapshot_name: pulumi.Input[str],
                 source_disk_type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Snapshot resource.
        :param pulumi.Input[str] desktop_id: The ID of the Desktop.
        :param pulumi.Input[str] snapshot_name: The name of the Snapshot.
        :param pulumi.Input[str] source_disk_type: The type of the disk for which to create a snapshot. Valid values: `SYSTEM`, `DATA`.
        :param pulumi.Input[str] description: The description of the Snapshot.
        """
        SnapshotArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            desktop_id=desktop_id,
            snapshot_name=snapshot_name,
            source_disk_type=source_disk_type,
            description=description,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             desktop_id: Optional[pulumi.Input[str]] = None,
             snapshot_name: Optional[pulumi.Input[str]] = None,
             source_disk_type: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if desktop_id is None and 'desktopId' in kwargs:
            desktop_id = kwargs['desktopId']
        if desktop_id is None:
            raise TypeError("Missing 'desktop_id' argument")
        if snapshot_name is None and 'snapshotName' in kwargs:
            snapshot_name = kwargs['snapshotName']
        if snapshot_name is None:
            raise TypeError("Missing 'snapshot_name' argument")
        if source_disk_type is None and 'sourceDiskType' in kwargs:
            source_disk_type = kwargs['sourceDiskType']
        if source_disk_type is None:
            raise TypeError("Missing 'source_disk_type' argument")

        _setter("desktop_id", desktop_id)
        _setter("snapshot_name", snapshot_name)
        _setter("source_disk_type", source_disk_type)
        if description is not None:
            _setter("description", description)

    @property
    @pulumi.getter(name="desktopId")
    def desktop_id(self) -> pulumi.Input[str]:
        """
        The ID of the Desktop.
        """
        return pulumi.get(self, "desktop_id")

    @desktop_id.setter
    def desktop_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "desktop_id", value)

    @property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> pulumi.Input[str]:
        """
        The name of the Snapshot.
        """
        return pulumi.get(self, "snapshot_name")

    @snapshot_name.setter
    def snapshot_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "snapshot_name", value)

    @property
    @pulumi.getter(name="sourceDiskType")
    def source_disk_type(self) -> pulumi.Input[str]:
        """
        The type of the disk for which to create a snapshot. Valid values: `SYSTEM`, `DATA`.
        """
        return pulumi.get(self, "source_disk_type")

    @source_disk_type.setter
    def source_disk_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_disk_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Snapshot.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _SnapshotState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 desktop_id: Optional[pulumi.Input[str]] = None,
                 snapshot_name: Optional[pulumi.Input[str]] = None,
                 source_disk_type: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Snapshot resources.
        :param pulumi.Input[str] description: The description of the Snapshot.
        :param pulumi.Input[str] desktop_id: The ID of the Desktop.
        :param pulumi.Input[str] snapshot_name: The name of the Snapshot.
        :param pulumi.Input[str] source_disk_type: The type of the disk for which to create a snapshot. Valid values: `SYSTEM`, `DATA`.
        :param pulumi.Input[str] status: The status of the snapshot.
        """
        _SnapshotState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            desktop_id=desktop_id,
            snapshot_name=snapshot_name,
            source_disk_type=source_disk_type,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             desktop_id: Optional[pulumi.Input[str]] = None,
             snapshot_name: Optional[pulumi.Input[str]] = None,
             source_disk_type: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if desktop_id is None and 'desktopId' in kwargs:
            desktop_id = kwargs['desktopId']
        if snapshot_name is None and 'snapshotName' in kwargs:
            snapshot_name = kwargs['snapshotName']
        if source_disk_type is None and 'sourceDiskType' in kwargs:
            source_disk_type = kwargs['sourceDiskType']

        if description is not None:
            _setter("description", description)
        if desktop_id is not None:
            _setter("desktop_id", desktop_id)
        if snapshot_name is not None:
            _setter("snapshot_name", snapshot_name)
        if source_disk_type is not None:
            _setter("source_disk_type", source_disk_type)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Snapshot.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="desktopId")
    def desktop_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Desktop.
        """
        return pulumi.get(self, "desktop_id")

    @desktop_id.setter
    def desktop_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "desktop_id", value)

    @property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Snapshot.
        """
        return pulumi.get(self, "snapshot_name")

    @snapshot_name.setter
    def snapshot_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snapshot_name", value)

    @property
    @pulumi.getter(name="sourceDiskType")
    def source_disk_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the disk for which to create a snapshot. Valid values: `SYSTEM`, `DATA`.
        """
        return pulumi.get(self, "source_disk_type")

    @source_disk_type.setter
    def source_disk_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_disk_type", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the snapshot.
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
                 desktop_id: Optional[pulumi.Input[str]] = None,
                 snapshot_name: Optional[pulumi.Input[str]] = None,
                 source_disk_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a ECD Snapshot resource.

        For information about ECD Snapshot and how to use it, see [What is Snapshot](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-createsnapshot).

        > **NOTE:** Available since v1.169.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_simple_office_site = alicloud.eds.SimpleOfficeSite("defaultSimpleOfficeSite",
            cidr_block="172.16.0.0/12",
            enable_admin_access=True,
            desktop_access_type="Internet",
            office_site_name=name)
        default_ecd_policy_group = alicloud.eds.EcdPolicyGroup("defaultEcdPolicyGroup",
            policy_group_name=name,
            clipboard="read",
            local_drive="read",
            usb_redirect="off",
            watermark="off",
            authorize_access_policy_rules=[alicloud.eds.EcdPolicyGroupAuthorizeAccessPolicyRuleArgs(
                description=name,
                cidr_ip="1.2.3.45/24",
            )],
            authorize_security_policy_rules=[alicloud.eds.EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs(
                type="inflow",
                policy="accept",
                description=name,
                port_range="80/80",
                ip_protocol="TCP",
                priority="1",
                cidr_ip="1.2.3.4/24",
            )])
        default_bundles = alicloud.eds.get_bundles(bundle_type="SYSTEM")
        default_desktop = alicloud.eds.Desktop("defaultDesktop",
            office_site_id=default_simple_office_site.id,
            policy_group_id=default_ecd_policy_group.id,
            bundle_id=default_bundles.bundles[1].id,
            desktop_name=name)
        default_snapshot = alicloud.eds.Snapshot("defaultSnapshot",
            description=name,
            desktop_id=default_desktop.id,
            snapshot_name=name,
            source_disk_type="SYSTEM")
        ```

        ## Import

        ECD Snapshot can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:eds/snapshot:Snapshot example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Snapshot.
        :param pulumi.Input[str] desktop_id: The ID of the Desktop.
        :param pulumi.Input[str] snapshot_name: The name of the Snapshot.
        :param pulumi.Input[str] source_disk_type: The type of the disk for which to create a snapshot. Valid values: `SYSTEM`, `DATA`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SnapshotArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ECD Snapshot resource.

        For information about ECD Snapshot and how to use it, see [What is Snapshot](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-createsnapshot).

        > **NOTE:** Available since v1.169.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_simple_office_site = alicloud.eds.SimpleOfficeSite("defaultSimpleOfficeSite",
            cidr_block="172.16.0.0/12",
            enable_admin_access=True,
            desktop_access_type="Internet",
            office_site_name=name)
        default_ecd_policy_group = alicloud.eds.EcdPolicyGroup("defaultEcdPolicyGroup",
            policy_group_name=name,
            clipboard="read",
            local_drive="read",
            usb_redirect="off",
            watermark="off",
            authorize_access_policy_rules=[alicloud.eds.EcdPolicyGroupAuthorizeAccessPolicyRuleArgs(
                description=name,
                cidr_ip="1.2.3.45/24",
            )],
            authorize_security_policy_rules=[alicloud.eds.EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs(
                type="inflow",
                policy="accept",
                description=name,
                port_range="80/80",
                ip_protocol="TCP",
                priority="1",
                cidr_ip="1.2.3.4/24",
            )])
        default_bundles = alicloud.eds.get_bundles(bundle_type="SYSTEM")
        default_desktop = alicloud.eds.Desktop("defaultDesktop",
            office_site_id=default_simple_office_site.id,
            policy_group_id=default_ecd_policy_group.id,
            bundle_id=default_bundles.bundles[1].id,
            desktop_name=name)
        default_snapshot = alicloud.eds.Snapshot("defaultSnapshot",
            description=name,
            desktop_id=default_desktop.id,
            snapshot_name=name,
            source_disk_type="SYSTEM")
        ```

        ## Import

        ECD Snapshot can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:eds/snapshot:Snapshot example <id>
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
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            SnapshotArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 desktop_id: Optional[pulumi.Input[str]] = None,
                 snapshot_name: Optional[pulumi.Input[str]] = None,
                 source_disk_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SnapshotArgs.__new__(SnapshotArgs)

            __props__.__dict__["description"] = description
            if desktop_id is None and not opts.urn:
                raise TypeError("Missing required property 'desktop_id'")
            __props__.__dict__["desktop_id"] = desktop_id
            if snapshot_name is None and not opts.urn:
                raise TypeError("Missing required property 'snapshot_name'")
            __props__.__dict__["snapshot_name"] = snapshot_name
            if source_disk_type is None and not opts.urn:
                raise TypeError("Missing required property 'source_disk_type'")
            __props__.__dict__["source_disk_type"] = source_disk_type
            __props__.__dict__["status"] = None
        super(Snapshot, __self__).__init__(
            'alicloud:eds/snapshot:Snapshot',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            desktop_id: Optional[pulumi.Input[str]] = None,
            snapshot_name: Optional[pulumi.Input[str]] = None,
            source_disk_type: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'Snapshot':
        """
        Get an existing Snapshot resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Snapshot.
        :param pulumi.Input[str] desktop_id: The ID of the Desktop.
        :param pulumi.Input[str] snapshot_name: The name of the Snapshot.
        :param pulumi.Input[str] source_disk_type: The type of the disk for which to create a snapshot. Valid values: `SYSTEM`, `DATA`.
        :param pulumi.Input[str] status: The status of the snapshot.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SnapshotState.__new__(_SnapshotState)

        __props__.__dict__["description"] = description
        __props__.__dict__["desktop_id"] = desktop_id
        __props__.__dict__["snapshot_name"] = snapshot_name
        __props__.__dict__["source_disk_type"] = source_disk_type
        __props__.__dict__["status"] = status
        return Snapshot(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the Snapshot.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="desktopId")
    def desktop_id(self) -> pulumi.Output[str]:
        """
        The ID of the Desktop.
        """
        return pulumi.get(self, "desktop_id")

    @property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> pulumi.Output[str]:
        """
        The name of the Snapshot.
        """
        return pulumi.get(self, "snapshot_name")

    @property
    @pulumi.getter(name="sourceDiskType")
    def source_disk_type(self) -> pulumi.Output[str]:
        """
        The type of the disk for which to create a snapshot. Valid values: `SYSTEM`, `DATA`.
        """
        return pulumi.get(self, "source_disk_type")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the snapshot.
        """
        return pulumi.get(self, "status")

