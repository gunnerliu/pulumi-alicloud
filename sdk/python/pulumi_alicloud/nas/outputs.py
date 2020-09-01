# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = [
    'GetAccessGroupsGroupResult',
    'GetAccessRulesRuleResult',
    'GetFileSystemsSystemResult',
    'GetMountTargetsTargetResult',
]

@pulumi.output_type
class GetAccessGroupsGroupResult(dict):
    def __init__(__self__, *,
                 description: str,
                 id: str,
                 mount_target_count: float,
                 rule_count: float,
                 type: str):
        """
        :param str description: Filter results by a specific Description.
        :param str id: AccessGroupName of the AccessGroup.
        :param float mount_target_count: MountTargetCount block of the AccessGroup
        :param float rule_count: RuleCount of the AccessGroup.
        :param str type: Filter results by a specific AccessGroupType.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "mount_target_count", mount_target_count)
        pulumi.set(__self__, "rule_count", rule_count)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Filter results by a specific Description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        AccessGroupName of the AccessGroup.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mountTargetCount")
    def mount_target_count(self) -> float:
        """
        MountTargetCount block of the AccessGroup
        """
        return pulumi.get(self, "mount_target_count")

    @property
    @pulumi.getter(name="ruleCount")
    def rule_count(self) -> float:
        """
        RuleCount of the AccessGroup.
        """
        return pulumi.get(self, "rule_count")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Filter results by a specific AccessGroupType.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetAccessRulesRuleResult(dict):
    def __init__(__self__, *,
                 access_rule_id: str,
                 priority: float,
                 rw_access: str,
                 source_cidr_ip: str,
                 user_access: str):
        """
        :param str access_rule_id: AccessRuleId of the AccessRule.
        :param float priority: Priority of the AccessRule.
        :param str rw_access: Filter results by a specific RWAccess.
        :param str source_cidr_ip: Filter results by a specific SourceCidrIp.
        :param str user_access: Filter results by a specific UserAccess.
        """
        pulumi.set(__self__, "access_rule_id", access_rule_id)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "rw_access", rw_access)
        pulumi.set(__self__, "source_cidr_ip", source_cidr_ip)
        pulumi.set(__self__, "user_access", user_access)

    @property
    @pulumi.getter(name="accessRuleId")
    def access_rule_id(self) -> str:
        """
        AccessRuleId of the AccessRule.
        """
        return pulumi.get(self, "access_rule_id")

    @property
    @pulumi.getter
    def priority(self) -> float:
        """
        Priority of the AccessRule.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="rwAccess")
    def rw_access(self) -> str:
        """
        Filter results by a specific RWAccess.
        """
        return pulumi.get(self, "rw_access")

    @property
    @pulumi.getter(name="sourceCidrIp")
    def source_cidr_ip(self) -> str:
        """
        Filter results by a specific SourceCidrIp.
        """
        return pulumi.get(self, "source_cidr_ip")

    @property
    @pulumi.getter(name="userAccess")
    def user_access(self) -> str:
        """
        Filter results by a specific UserAccess.
        """
        return pulumi.get(self, "user_access")


@pulumi.output_type
class GetFileSystemsSystemResult(dict):
    def __init__(__self__, *,
                 create_time: str,
                 description: str,
                 id: str,
                 metered_size: float,
                 protocol_type: str,
                 region_id: str,
                 storage_type: str):
        """
        :param str create_time: Time of creation.
        :param str description: Destription of the FileSystem.
        :param str id: ID of the FileSystem.
        :param float metered_size: MeteredSize of the FileSystem.
        :param str protocol_type: Filter results by a specific ProtocolType.
        :param str region_id: ID of the region where the FileSystem is located.
        :param str storage_type: Filter results by a specific StorageType.
        """
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "metered_size", metered_size)
        pulumi.set(__self__, "protocol_type", protocol_type)
        pulumi.set(__self__, "region_id", region_id)
        pulumi.set(__self__, "storage_type", storage_type)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        Time of creation.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Destription of the FileSystem.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the FileSystem.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="meteredSize")
    def metered_size(self) -> float:
        """
        MeteredSize of the FileSystem.
        """
        return pulumi.get(self, "metered_size")

    @property
    @pulumi.getter(name="protocolType")
    def protocol_type(self) -> str:
        """
        Filter results by a specific ProtocolType.
        """
        return pulumi.get(self, "protocol_type")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> str:
        """
        ID of the region where the FileSystem is located.
        """
        return pulumi.get(self, "region_id")

    @property
    @pulumi.getter(name="storageType")
    def storage_type(self) -> str:
        """
        Filter results by a specific StorageType.
        """
        return pulumi.get(self, "storage_type")


@pulumi.output_type
class GetMountTargetsTargetResult(dict):
    def __init__(__self__, *,
                 access_group_name: str,
                 id: str,
                 mount_target_domain: str,
                 type: str,
                 vpc_id: str,
                 vswitch_id: str):
        """
        :param str access_group_name: Filter results by a specific AccessGroupName.
        :param str id: ID of the MountTargetDomain.
        :param str mount_target_domain: Filter results by a specific MountTargetDomain.
        :param str type: Filter results by a specific NetworkType.
        :param str vpc_id: Filter results by a specific VpcId.
        :param str vswitch_id: Filter results by a specific VSwitchId.
        """
        pulumi.set(__self__, "access_group_name", access_group_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "mount_target_domain", mount_target_domain)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "vpc_id", vpc_id)
        pulumi.set(__self__, "vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> str:
        """
        Filter results by a specific AccessGroupName.
        """
        return pulumi.get(self, "access_group_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the MountTargetDomain.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mountTargetDomain")
    def mount_target_domain(self) -> str:
        """
        Filter results by a specific MountTargetDomain.
        """
        return pulumi.get(self, "mount_target_domain")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Filter results by a specific NetworkType.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        """
        Filter results by a specific VpcId.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> str:
        """
        Filter results by a specific VSwitchId.
        """
        return pulumi.get(self, "vswitch_id")

