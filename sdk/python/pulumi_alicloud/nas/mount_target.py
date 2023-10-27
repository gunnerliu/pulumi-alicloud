# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MountTargetArgs', 'MountTarget']

@pulumi.input_type
class MountTargetArgs:
    def __init__(__self__, *,
                 file_system_id: pulumi.Input[str],
                 access_group_name: Optional[pulumi.Input[str]] = None,
                 network_type: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MountTarget resource.
        :param pulumi.Input[str] file_system_id: The ID of the file system.
        :param pulumi.Input[str] access_group_name: The name of the permission group that applies to the mount target.
        :param pulumi.Input[str] network_type: mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
        :param pulumi.Input[str] security_group_id: The ID of security group.
        :param pulumi.Input[str] status: Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
        :param pulumi.Input[str] vpc_id: The ID of VPC.
        :param pulumi.Input[str] vswitch_id: The ID of the VSwitch in the VPC where the mount target resides.
        """
        pulumi.set(__self__, "file_system_id", file_system_id)
        if access_group_name is not None:
            pulumi.set(__self__, "access_group_name", access_group_name)
        if network_type is not None:
            pulumi.set(__self__, "network_type", network_type)
        if security_group_id is not None:
            pulumi.set(__self__, "security_group_id", security_group_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)
        if vswitch_id is not None:
            pulumi.set(__self__, "vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> pulumi.Input[str]:
        """
        The ID of the file system.
        """
        return pulumi.get(self, "file_system_id")

    @file_system_id.setter
    def file_system_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "file_system_id", value)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the permission group that applies to the mount target.
        """
        return pulumi.get(self, "access_group_name")

    @access_group_name.setter
    def access_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_group_name", value)

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> Optional[pulumi.Input[str]]:
        """
        mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
        """
        return pulumi.get(self, "network_type")

    @network_type.setter
    def network_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_type", value)

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of security group.
        """
        return pulumi.get(self, "security_group_id")

    @security_group_id.setter
    def security_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of VPC.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VSwitch in the VPC where the mount target resides.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)


@pulumi.input_type
class _MountTargetState:
    def __init__(__self__, *,
                 access_group_name: Optional[pulumi.Input[str]] = None,
                 file_system_id: Optional[pulumi.Input[str]] = None,
                 mount_target_domain: Optional[pulumi.Input[str]] = None,
                 network_type: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MountTarget resources.
        :param pulumi.Input[str] access_group_name: The name of the permission group that applies to the mount target.
        :param pulumi.Input[str] file_system_id: The ID of the file system.
        :param pulumi.Input[str] mount_target_domain: The IPv4 domain name of the mount target. **NOTE:** Available since v1.161.0.
        :param pulumi.Input[str] network_type: mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
        :param pulumi.Input[str] security_group_id: The ID of security group.
        :param pulumi.Input[str] status: Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
        :param pulumi.Input[str] vpc_id: The ID of VPC.
        :param pulumi.Input[str] vswitch_id: The ID of the VSwitch in the VPC where the mount target resides.
        """
        if access_group_name is not None:
            pulumi.set(__self__, "access_group_name", access_group_name)
        if file_system_id is not None:
            pulumi.set(__self__, "file_system_id", file_system_id)
        if mount_target_domain is not None:
            pulumi.set(__self__, "mount_target_domain", mount_target_domain)
        if network_type is not None:
            pulumi.set(__self__, "network_type", network_type)
        if security_group_id is not None:
            pulumi.set(__self__, "security_group_id", security_group_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)
        if vswitch_id is not None:
            pulumi.set(__self__, "vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the permission group that applies to the mount target.
        """
        return pulumi.get(self, "access_group_name")

    @access_group_name.setter
    def access_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_group_name", value)

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the file system.
        """
        return pulumi.get(self, "file_system_id")

    @file_system_id.setter
    def file_system_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_system_id", value)

    @property
    @pulumi.getter(name="mountTargetDomain")
    def mount_target_domain(self) -> Optional[pulumi.Input[str]]:
        """
        The IPv4 domain name of the mount target. **NOTE:** Available since v1.161.0.
        """
        return pulumi.get(self, "mount_target_domain")

    @mount_target_domain.setter
    def mount_target_domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mount_target_domain", value)

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> Optional[pulumi.Input[str]]:
        """
        mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
        """
        return pulumi.get(self, "network_type")

    @network_type.setter
    def network_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_type", value)

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of security group.
        """
        return pulumi.get(self, "security_group_id")

    @security_group_id.setter
    def security_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of VPC.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VSwitch in the VPC where the mount target resides.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)


class MountTarget(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_group_name: Optional[pulumi.Input[str]] = None,
                 file_system_id: Optional[pulumi.Input[str]] = None,
                 network_type: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a NAS Mount Target resource.
        For information about NAS Mount Target and how to use it, see [Manage NAS Mount Targets](https://www.alibabacloud.com/help/en/doc-detail/27531.htm).

        > **NOTE:** Available since v1.34.0.

        ## Import

        NAS MountTarget can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:nas/mountTarget:MountTarget foo 192094b415:192094b415-luw38.cn-beijing.nas.aliyuncs.com
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_group_name: The name of the permission group that applies to the mount target.
        :param pulumi.Input[str] file_system_id: The ID of the file system.
        :param pulumi.Input[str] network_type: mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
        :param pulumi.Input[str] security_group_id: The ID of security group.
        :param pulumi.Input[str] status: Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
        :param pulumi.Input[str] vpc_id: The ID of VPC.
        :param pulumi.Input[str] vswitch_id: The ID of the VSwitch in the VPC where the mount target resides.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MountTargetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a NAS Mount Target resource.
        For information about NAS Mount Target and how to use it, see [Manage NAS Mount Targets](https://www.alibabacloud.com/help/en/doc-detail/27531.htm).

        > **NOTE:** Available since v1.34.0.

        ## Import

        NAS MountTarget can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:nas/mountTarget:MountTarget foo 192094b415:192094b415-luw38.cn-beijing.nas.aliyuncs.com
        ```

        :param str resource_name: The name of the resource.
        :param MountTargetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MountTargetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_group_name: Optional[pulumi.Input[str]] = None,
                 file_system_id: Optional[pulumi.Input[str]] = None,
                 network_type: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MountTargetArgs.__new__(MountTargetArgs)

            __props__.__dict__["access_group_name"] = access_group_name
            if file_system_id is None and not opts.urn:
                raise TypeError("Missing required property 'file_system_id'")
            __props__.__dict__["file_system_id"] = file_system_id
            __props__.__dict__["network_type"] = network_type
            __props__.__dict__["security_group_id"] = security_group_id
            __props__.__dict__["status"] = status
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["vswitch_id"] = vswitch_id
            __props__.__dict__["mount_target_domain"] = None
        super(MountTarget, __self__).__init__(
            'alicloud:nas/mountTarget:MountTarget',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_group_name: Optional[pulumi.Input[str]] = None,
            file_system_id: Optional[pulumi.Input[str]] = None,
            mount_target_domain: Optional[pulumi.Input[str]] = None,
            network_type: Optional[pulumi.Input[str]] = None,
            security_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None) -> 'MountTarget':
        """
        Get an existing MountTarget resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_group_name: The name of the permission group that applies to the mount target.
        :param pulumi.Input[str] file_system_id: The ID of the file system.
        :param pulumi.Input[str] mount_target_domain: The IPv4 domain name of the mount target. **NOTE:** Available since v1.161.0.
        :param pulumi.Input[str] network_type: mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
        :param pulumi.Input[str] security_group_id: The ID of security group.
        :param pulumi.Input[str] status: Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
        :param pulumi.Input[str] vpc_id: The ID of VPC.
        :param pulumi.Input[str] vswitch_id: The ID of the VSwitch in the VPC where the mount target resides.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MountTargetState.__new__(_MountTargetState)

        __props__.__dict__["access_group_name"] = access_group_name
        __props__.__dict__["file_system_id"] = file_system_id
        __props__.__dict__["mount_target_domain"] = mount_target_domain
        __props__.__dict__["network_type"] = network_type
        __props__.__dict__["security_group_id"] = security_group_id
        __props__.__dict__["status"] = status
        __props__.__dict__["vpc_id"] = vpc_id
        __props__.__dict__["vswitch_id"] = vswitch_id
        return MountTarget(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the permission group that applies to the mount target.
        """
        return pulumi.get(self, "access_group_name")

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> pulumi.Output[str]:
        """
        The ID of the file system.
        """
        return pulumi.get(self, "file_system_id")

    @property
    @pulumi.getter(name="mountTargetDomain")
    def mount_target_domain(self) -> pulumi.Output[str]:
        """
        The IPv4 domain name of the mount target. **NOTE:** Available since v1.161.0.
        """
        return pulumi.get(self, "mount_target_domain")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> pulumi.Output[str]:
        """
        mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
        """
        return pulumi.get(self, "network_type")

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of security group.
        """
        return pulumi.get(self, "security_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The ID of VPC.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the VSwitch in the VPC where the mount target resides.
        """
        return pulumi.get(self, "vswitch_id")

