# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['Disk']


class Disk(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 availability_zone: Optional[pulumi.Input[str]] = None,
                 category: Optional[pulumi.Input[str]] = None,
                 delete_auto_snapshot: Optional[pulumi.Input[bool]] = None,
                 delete_with_instance: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enable_auto_snapshot: Optional[pulumi.Input[bool]] = None,
                 encrypted: Optional[pulumi.Input[bool]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 performance_level: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 snapshot_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a ECS disk resource.

        > **NOTE:** One of `size` or `snapshot_id` is required when specifying an ECS disk. If all of them be specified, `size` must more than the size of snapshot which `snapshot_id` represents. Currently, `ecs.Disk` doesn't resize disk.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # Create a new ECS disk.
        ecs_disk = alicloud.ecs.Disk("ecsDisk",
            availability_zone="cn-beijing-b",
            category="cloud_efficiency",
            description="Hello ecs disk.",
            encrypted=True,
            kms_key_id="2a6767f0-a16c-4679-a60f-13bf*****",
            size=30,
            tags={
                "Name": "TerraformTest",
            })
        ```

        ## Import

        Cloud disk can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/disk:Disk example d-abc12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] availability_zone: The Zone to create the disk in.
        :param pulumi.Input[str] category: Category of the disk. Valid values are `cloud`, `cloud_efficiency`, `cloud_ssd`, `cloud_essd`. Default is `cloud_efficiency`.
        :param pulumi.Input[bool] delete_auto_snapshot: Indicates whether the automatic snapshot is deleted when the disk is released. Default value: false.
        :param pulumi.Input[bool] delete_with_instance: Indicates whether the disk is released together with the instance: Default value: false.
        :param pulumi.Input[str] description: Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        :param pulumi.Input[bool] enable_auto_snapshot: Indicates whether to apply a created automatic snapshot policy to the disk. Default value: false.
        :param pulumi.Input[bool] encrypted: If true, the disk will be encrypted, conflict with `snapshot_id`.
        :param pulumi.Input[str] kms_key_id: The ID of the KMS key corresponding to the data disk, The specified parameter `Encrypted` must be `true` when KmsKeyId is not empty.
        :param pulumi.Input[str] name: Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
        :param pulumi.Input[str] performance_level: Specifies the performance level of an ESSD when you create the ESSD. Default value: `PL1`. Valid values:                                                       
               * `PL1`: A single ESSD delivers up to 50,000 random read/write IOPS.
               * `PL2`: A single ESSD delivers up to 100,000 random read/write IOPS.
               * `PL3`: A single ESSD delivers up to 1,000,000 random read/write IOPS.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the disk belongs.
               > **NOTE:** Disk category `cloud` has been outdated and it only can be used none I/O Optimized ECS instances. Recommend `cloud_efficiency` and `cloud_ssd` disk.
        :param pulumi.Input[int] size: The size of the disk in GiBs. When resize the disk, the new size must be greater than the former value, or you would get an error `InvalidDiskSize.TooSmall`.
        :param pulumi.Input[str] snapshot_id: A snapshot to base the disk off of. If the disk size required by snapshot is greater than `size`, the `size` will be ignored, conflict with `encrypted`.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
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

            if availability_zone is None:
                raise TypeError("Missing required property 'availability_zone'")
            __props__['availability_zone'] = availability_zone
            __props__['category'] = category
            __props__['delete_auto_snapshot'] = delete_auto_snapshot
            __props__['delete_with_instance'] = delete_with_instance
            __props__['description'] = description
            __props__['enable_auto_snapshot'] = enable_auto_snapshot
            __props__['encrypted'] = encrypted
            __props__['kms_key_id'] = kms_key_id
            __props__['name'] = name
            __props__['performance_level'] = performance_level
            __props__['resource_group_id'] = resource_group_id
            if size is None:
                raise TypeError("Missing required property 'size'")
            __props__['size'] = size
            __props__['snapshot_id'] = snapshot_id
            __props__['tags'] = tags
            __props__['status'] = None
        super(Disk, __self__).__init__(
            'alicloud:ecs/disk:Disk',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            availability_zone: Optional[pulumi.Input[str]] = None,
            category: Optional[pulumi.Input[str]] = None,
            delete_auto_snapshot: Optional[pulumi.Input[bool]] = None,
            delete_with_instance: Optional[pulumi.Input[bool]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enable_auto_snapshot: Optional[pulumi.Input[bool]] = None,
            encrypted: Optional[pulumi.Input[bool]] = None,
            kms_key_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            performance_level: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            size: Optional[pulumi.Input[int]] = None,
            snapshot_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None) -> 'Disk':
        """
        Get an existing Disk resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] availability_zone: The Zone to create the disk in.
        :param pulumi.Input[str] category: Category of the disk. Valid values are `cloud`, `cloud_efficiency`, `cloud_ssd`, `cloud_essd`. Default is `cloud_efficiency`.
        :param pulumi.Input[bool] delete_auto_snapshot: Indicates whether the automatic snapshot is deleted when the disk is released. Default value: false.
        :param pulumi.Input[bool] delete_with_instance: Indicates whether the disk is released together with the instance: Default value: false.
        :param pulumi.Input[str] description: Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        :param pulumi.Input[bool] enable_auto_snapshot: Indicates whether to apply a created automatic snapshot policy to the disk. Default value: false.
        :param pulumi.Input[bool] encrypted: If true, the disk will be encrypted, conflict with `snapshot_id`.
        :param pulumi.Input[str] kms_key_id: The ID of the KMS key corresponding to the data disk, The specified parameter `Encrypted` must be `true` when KmsKeyId is not empty.
        :param pulumi.Input[str] name: Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
        :param pulumi.Input[str] performance_level: Specifies the performance level of an ESSD when you create the ESSD. Default value: `PL1`. Valid values:                                                       
               * `PL1`: A single ESSD delivers up to 50,000 random read/write IOPS.
               * `PL2`: A single ESSD delivers up to 100,000 random read/write IOPS.
               * `PL3`: A single ESSD delivers up to 1,000,000 random read/write IOPS.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the disk belongs.
               > **NOTE:** Disk category `cloud` has been outdated and it only can be used none I/O Optimized ECS instances. Recommend `cloud_efficiency` and `cloud_ssd` disk.
        :param pulumi.Input[int] size: The size of the disk in GiBs. When resize the disk, the new size must be greater than the former value, or you would get an error `InvalidDiskSize.TooSmall`.
        :param pulumi.Input[str] snapshot_id: A snapshot to base the disk off of. If the disk size required by snapshot is greater than `size`, the `size` will be ignored, conflict with `encrypted`.
        :param pulumi.Input[str] status: The disk status.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["availability_zone"] = availability_zone
        __props__["category"] = category
        __props__["delete_auto_snapshot"] = delete_auto_snapshot
        __props__["delete_with_instance"] = delete_with_instance
        __props__["description"] = description
        __props__["enable_auto_snapshot"] = enable_auto_snapshot
        __props__["encrypted"] = encrypted
        __props__["kms_key_id"] = kms_key_id
        __props__["name"] = name
        __props__["performance_level"] = performance_level
        __props__["resource_group_id"] = resource_group_id
        __props__["size"] = size
        __props__["snapshot_id"] = snapshot_id
        __props__["status"] = status
        __props__["tags"] = tags
        return Disk(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> pulumi.Output[str]:
        """
        The Zone to create the disk in.
        """
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter
    def category(self) -> pulumi.Output[Optional[str]]:
        """
        Category of the disk. Valid values are `cloud`, `cloud_efficiency`, `cloud_ssd`, `cloud_essd`. Default is `cloud_efficiency`.
        """
        return pulumi.get(self, "category")

    @property
    @pulumi.getter(name="deleteAutoSnapshot")
    def delete_auto_snapshot(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether the automatic snapshot is deleted when the disk is released. Default value: false.
        """
        return pulumi.get(self, "delete_auto_snapshot")

    @property
    @pulumi.getter(name="deleteWithInstance")
    def delete_with_instance(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether the disk is released together with the instance: Default value: false.
        """
        return pulumi.get(self, "delete_with_instance")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="enableAutoSnapshot")
    def enable_auto_snapshot(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether to apply a created automatic snapshot policy to the disk. Default value: false.
        """
        return pulumi.get(self, "enable_auto_snapshot")

    @property
    @pulumi.getter
    def encrypted(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, the disk will be encrypted, conflict with `snapshot_id`.
        """
        return pulumi.get(self, "encrypted")

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the KMS key corresponding to the data disk, The specified parameter `Encrypted` must be `true` when KmsKeyId is not empty.
        """
        return pulumi.get(self, "kms_key_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="performanceLevel")
    def performance_level(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the performance level of an ESSD when you create the ESSD. Default value: `PL1`. Valid values:                                                       
        * `PL1`: A single ESSD delivers up to 50,000 random read/write IOPS.
        * `PL2`: A single ESSD delivers up to 100,000 random read/write IOPS.
        * `PL3`: A single ESSD delivers up to 1,000,000 random read/write IOPS.
        """
        return pulumi.get(self, "performance_level")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        The Id of resource group which the disk belongs.
        > **NOTE:** Disk category `cloud` has been outdated and it only can be used none I/O Optimized ECS instances. Recommend `cloud_efficiency` and `cloud_ssd` disk.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def size(self) -> pulumi.Output[int]:
        """
        The size of the disk in GiBs. When resize the disk, the new size must be greater than the former value, or you would get an error `InvalidDiskSize.TooSmall`.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> pulumi.Output[Optional[str]]:
        """
        A snapshot to base the disk off of. If the disk size required by snapshot is greater than `size`, the `size` will be ignored, conflict with `encrypted`.
        """
        return pulumi.get(self, "snapshot_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The disk status.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

