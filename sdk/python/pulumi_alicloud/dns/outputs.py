# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetAlidnsDomainGroupsGroupResult',
    'GetAlidnsDomainsDomainResult',
    'GetAlidnsDomainsDomainRecordLineResult',
    'GetAlidnsInstancesInstanceResult',
    'GetAlidnsRecordsRecordResult',
    'GetDomainGroupsGroupResult',
    'GetDomainRecordsRecordResult',
    'GetDomainsDomainResult',
    'GetDomainsDomainRecordLineResult',
    'GetGroupsGroupResult',
    'GetInstancesInstanceResult',
    'GetRecordsRecordResult',
    'GetResolutionLinesLineResult',
]

@pulumi.output_type
class GetAlidnsDomainGroupsGroupResult(dict):
    def __init__(__self__, *,
                 domain_count: int,
                 group_id: str,
                 group_name: str,
                 id: str):
        """
        :param int domain_count: Number of domain names in the group.
        :param str group_id: Id of the domain group.
        :param str group_name: The name of the domain group.
        :param str id: Id of the instance.
        """
        pulumi.set(__self__, "domain_count", domain_count)
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "group_name", group_name)
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="domainCount")
    def domain_count(self) -> int:
        """
        Number of domain names in the group.
        """
        return pulumi.get(self, "domain_count")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        Id of the domain group.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> str:
        """
        The name of the domain group.
        """
        return pulumi.get(self, "group_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Id of the instance.
        """
        return pulumi.get(self, "id")


@pulumi.output_type
class GetAlidnsDomainsDomainResult(dict):
    def __init__(__self__, *,
                 ali_domain: bool,
                 available_ttls: Sequence[int],
                 dns_servers: Sequence[str],
                 domain_id: str,
                 domain_name: str,
                 group_id: str,
                 group_name: str,
                 id: str,
                 in_black_hole: bool,
                 in_clean: bool,
                 instance_id: str,
                 line_type: str,
                 min_ttl: int,
                 puny_code: str,
                 record_line_tree_json: str,
                 record_lines: Sequence['outputs.GetAlidnsDomainsDomainRecordLineResult'],
                 region_lines: bool,
                 remark: str,
                 resource_group_id: str,
                 slave_dns: bool,
                 tags: Mapping[str, Any],
                 version_code: str,
                 version_name: str):
        """
        :param bool ali_domain: Specifies whether the domain is from Alibaba Cloud or not.
        :param Sequence[int] available_ttls: List of available TTLs.
        :param Sequence[str] dns_servers: DNS list of domain names in the resolution system.
        :param str domain_id: ID of the domain.
        :param str domain_name: Name of the domain.
        :param str group_id: Domain group ID, if not filled, the default is all groups.
        :param str group_name: Name of group that contains the domain.
        :param str id: The Id of resource.
        :param bool in_black_hole: Whether it is in black hole.
        :param bool in_clean: Whether it is cleaning.
        :param str instance_id: Cloud analysis product ID.
        :param int min_ttl: Minimum TTL.
        :param str puny_code: Punycode of the Chinese domain.
        :param str record_line_tree_json: Tree-like analytical line list.
        :param Sequence['GetAlidnsDomainsDomainRecordLineArgs'] record_lines: Parse the line data list.
        :param bool region_lines: Whether it is a regional route.
        :param str remark: The Id of resource group which the dns belongs.
        :param str resource_group_id: The Id of resource group which the dns belongs.
        :param bool slave_dns: Whether to allow auxiliary dns.
        :param Mapping[str, Any] tags: A mapping of tags to assign to the resource.
        :param str version_code: Cloud analysis version code.
        """
        pulumi.set(__self__, "ali_domain", ali_domain)
        pulumi.set(__self__, "available_ttls", available_ttls)
        pulumi.set(__self__, "dns_servers", dns_servers)
        pulumi.set(__self__, "domain_id", domain_id)
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "group_name", group_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "in_black_hole", in_black_hole)
        pulumi.set(__self__, "in_clean", in_clean)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "line_type", line_type)
        pulumi.set(__self__, "min_ttl", min_ttl)
        pulumi.set(__self__, "puny_code", puny_code)
        pulumi.set(__self__, "record_line_tree_json", record_line_tree_json)
        pulumi.set(__self__, "record_lines", record_lines)
        pulumi.set(__self__, "region_lines", region_lines)
        pulumi.set(__self__, "remark", remark)
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        pulumi.set(__self__, "slave_dns", slave_dns)
        pulumi.set(__self__, "tags", tags)
        pulumi.set(__self__, "version_code", version_code)
        pulumi.set(__self__, "version_name", version_name)

    @property
    @pulumi.getter(name="aliDomain")
    def ali_domain(self) -> bool:
        """
        Specifies whether the domain is from Alibaba Cloud or not.
        """
        return pulumi.get(self, "ali_domain")

    @property
    @pulumi.getter(name="availableTtls")
    def available_ttls(self) -> Sequence[int]:
        """
        List of available TTLs.
        """
        return pulumi.get(self, "available_ttls")

    @property
    @pulumi.getter(name="dnsServers")
    def dns_servers(self) -> Sequence[str]:
        """
        DNS list of domain names in the resolution system.
        """
        return pulumi.get(self, "dns_servers")

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> str:
        """
        ID of the domain.
        """
        return pulumi.get(self, "domain_id")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        """
        Name of the domain.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        Domain group ID, if not filled, the default is all groups.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> str:
        """
        Name of group that contains the domain.
        """
        return pulumi.get(self, "group_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Id of resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="inBlackHole")
    def in_black_hole(self) -> bool:
        """
        Whether it is in black hole.
        """
        return pulumi.get(self, "in_black_hole")

    @property
    @pulumi.getter(name="inClean")
    def in_clean(self) -> bool:
        """
        Whether it is cleaning.
        """
        return pulumi.get(self, "in_clean")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        Cloud analysis product ID.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="lineType")
    def line_type(self) -> str:
        return pulumi.get(self, "line_type")

    @property
    @pulumi.getter(name="minTtl")
    def min_ttl(self) -> int:
        """
        Minimum TTL.
        """
        return pulumi.get(self, "min_ttl")

    @property
    @pulumi.getter(name="punyCode")
    def puny_code(self) -> str:
        """
        Punycode of the Chinese domain.
        """
        return pulumi.get(self, "puny_code")

    @property
    @pulumi.getter(name="recordLineTreeJson")
    def record_line_tree_json(self) -> str:
        """
        Tree-like analytical line list.
        """
        return pulumi.get(self, "record_line_tree_json")

    @property
    @pulumi.getter(name="recordLines")
    def record_lines(self) -> Sequence['outputs.GetAlidnsDomainsDomainRecordLineResult']:
        """
        Parse the line data list.
        """
        return pulumi.get(self, "record_lines")

    @property
    @pulumi.getter(name="regionLines")
    def region_lines(self) -> bool:
        """
        Whether it is a regional route.
        """
        return pulumi.get(self, "region_lines")

    @property
    @pulumi.getter
    def remark(self) -> str:
        """
        The Id of resource group which the dns belongs.
        """
        return pulumi.get(self, "remark")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> str:
        """
        The Id of resource group which the dns belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="slaveDns")
    def slave_dns(self) -> bool:
        """
        Whether to allow auxiliary dns.
        """
        return pulumi.get(self, "slave_dns")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, Any]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="versionCode")
    def version_code(self) -> str:
        """
        Cloud analysis version code.
        """
        return pulumi.get(self, "version_code")

    @property
    @pulumi.getter(name="versionName")
    def version_name(self) -> str:
        return pulumi.get(self, "version_name")


@pulumi.output_type
class GetAlidnsDomainsDomainRecordLineResult(dict):
    def __init__(__self__, *,
                 father_code: str,
                 line_code: str,
                 line_display_name: str,
                 line_name: str):
        """
        :param str father_code: The code of the parent line, or empty if there is none.
        :param str line_code: Sub-line Code.
        :param str line_display_name: Parent line display name.
        :param str line_name: Sub-line display name.
        """
        pulumi.set(__self__, "father_code", father_code)
        pulumi.set(__self__, "line_code", line_code)
        pulumi.set(__self__, "line_display_name", line_display_name)
        pulumi.set(__self__, "line_name", line_name)

    @property
    @pulumi.getter(name="fatherCode")
    def father_code(self) -> str:
        """
        The code of the parent line, or empty if there is none.
        """
        return pulumi.get(self, "father_code")

    @property
    @pulumi.getter(name="lineCode")
    def line_code(self) -> str:
        """
        Sub-line Code.
        """
        return pulumi.get(self, "line_code")

    @property
    @pulumi.getter(name="lineDisplayName")
    def line_display_name(self) -> str:
        """
        Parent line display name.
        """
        return pulumi.get(self, "line_display_name")

    @property
    @pulumi.getter(name="lineName")
    def line_name(self) -> str:
        """
        Sub-line display name.
        """
        return pulumi.get(self, "line_name")


@pulumi.output_type
class GetAlidnsInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 dns_security: str,
                 domain: str,
                 domain_numbers: str,
                 id: str,
                 instance_id: str,
                 payment_type: str,
                 version_code: str,
                 version_name: str):
        """
        :param str dns_security: DNS security level.
        :param str domain: (Available in 1.124.1+) The domain name.
        :param str domain_numbers: Number of domain names bound.
        :param str id: Id of the instance.
        :param str instance_id: Id of the instance resource.
        :param str payment_type: (Available in 1.124.1+) The payment type of alidns instance.
        :param str version_code: Paid package version.
        :param str version_name: Paid package version name.
        """
        pulumi.set(__self__, "dns_security", dns_security)
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "domain_numbers", domain_numbers)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "payment_type", payment_type)
        pulumi.set(__self__, "version_code", version_code)
        pulumi.set(__self__, "version_name", version_name)

    @property
    @pulumi.getter(name="dnsSecurity")
    def dns_security(self) -> str:
        """
        DNS security level.
        """
        return pulumi.get(self, "dns_security")

    @property
    @pulumi.getter
    def domain(self) -> str:
        """
        (Available in 1.124.1+) The domain name.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="domainNumbers")
    def domain_numbers(self) -> str:
        """
        Number of domain names bound.
        """
        return pulumi.get(self, "domain_numbers")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Id of the instance.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        Id of the instance resource.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> str:
        """
        (Available in 1.124.1+) The payment type of alidns instance.
        """
        return pulumi.get(self, "payment_type")

    @property
    @pulumi.getter(name="versionCode")
    def version_code(self) -> str:
        """
        Paid package version.
        """
        return pulumi.get(self, "version_code")

    @property
    @pulumi.getter(name="versionName")
    def version_name(self) -> str:
        """
        Paid package version name.
        """
        return pulumi.get(self, "version_name")


@pulumi.output_type
class GetAlidnsRecordsRecordResult(dict):
    def __init__(__self__, *,
                 domain_name: str,
                 id: str,
                 line: str,
                 locked: bool,
                 priority: int,
                 record_id: str,
                 remark: str,
                 rr: str,
                 status: str,
                 ttl: int,
                 type: str,
                 value: str):
        """
        :param str domain_name: The domain name associated to the records.
        :param str id: ID of the resource.
        :param str line: ISP line. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm)
        :param bool locked: Indicates whether the record is locked.
        :param int priority: Priority of the `MX` record.
        :param str record_id: ID of the record.
        :param str remark: The remark of the domain record.  **NOTE:** Available in 1.144.0+.
        :param str rr: Host record of the domain.
        :param str status: Record status. Valid values: `ENABLE` and `DISABLE`.
        :param int ttl: TTL of the record.
        :param str type: Record type. Valid values: `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
        :param str value: Host record value of the domain.
        """
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "line", line)
        pulumi.set(__self__, "locked", locked)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "record_id", record_id)
        pulumi.set(__self__, "remark", remark)
        pulumi.set(__self__, "rr", rr)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "ttl", ttl)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        """
        The domain name associated to the records.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def line(self) -> str:
        """
        ISP line. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm)
        """
        return pulumi.get(self, "line")

    @property
    @pulumi.getter
    def locked(self) -> bool:
        """
        Indicates whether the record is locked.
        """
        return pulumi.get(self, "locked")

    @property
    @pulumi.getter
    def priority(self) -> int:
        """
        Priority of the `MX` record.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="recordId")
    def record_id(self) -> str:
        """
        ID of the record.
        """
        return pulumi.get(self, "record_id")

    @property
    @pulumi.getter
    def remark(self) -> str:
        """
        The remark of the domain record.  **NOTE:** Available in 1.144.0+.
        """
        return pulumi.get(self, "remark")

    @property
    @pulumi.getter
    def rr(self) -> str:
        """
        Host record of the domain.
        """
        return pulumi.get(self, "rr")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Record status. Valid values: `ENABLE` and `DISABLE`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def ttl(self) -> int:
        """
        TTL of the record.
        """
        return pulumi.get(self, "ttl")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Record type. Valid values: `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        Host record value of the domain.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetDomainGroupsGroupResult(dict):
    def __init__(__self__, *,
                 group_id: str,
                 group_name: str):
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "group_name", group_name)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> str:
        return pulumi.get(self, "group_name")


@pulumi.output_type
class GetDomainRecordsRecordResult(dict):
    def __init__(__self__, *,
                 domain_name: str,
                 host_record: str,
                 line: str,
                 locked: bool,
                 priority: int,
                 record_id: str,
                 status: str,
                 ttl: float,
                 type: str,
                 value: str):
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "host_record", host_record)
        pulumi.set(__self__, "line", line)
        pulumi.set(__self__, "locked", locked)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "record_id", record_id)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "ttl", ttl)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="hostRecord")
    def host_record(self) -> str:
        return pulumi.get(self, "host_record")

    @property
    @pulumi.getter
    def line(self) -> str:
        return pulumi.get(self, "line")

    @property
    @pulumi.getter
    def locked(self) -> bool:
        return pulumi.get(self, "locked")

    @property
    @pulumi.getter
    def priority(self) -> int:
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="recordId")
    def record_id(self) -> str:
        return pulumi.get(self, "record_id")

    @property
    @pulumi.getter
    def status(self) -> str:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def ttl(self) -> float:
        return pulumi.get(self, "ttl")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")


@pulumi.output_type
class GetDomainsDomainResult(dict):
    def __init__(__self__, *,
                 ali_domain: bool,
                 available_ttls: Sequence[int],
                 dns_servers: Sequence[str],
                 domain_id: str,
                 domain_name: str,
                 group_id: str,
                 group_name: str,
                 id: str,
                 in_black_hole: bool,
                 in_clean: bool,
                 instance_id: str,
                 line_type: str,
                 min_ttl: int,
                 puny_code: str,
                 record_line_tree_json: str,
                 record_lines: Sequence['outputs.GetDomainsDomainRecordLineResult'],
                 region_lines: bool,
                 remark: str,
                 resource_group_id: str,
                 slave_dns: bool,
                 tags: Mapping[str, Any],
                 version_code: str,
                 version_name: str):
        """
        :param bool ali_domain: Specifies whether the domain is from Alibaba Cloud or not.
        :param Sequence[str] dns_servers: DNS list of domain names in the resolution system.
        :param str domain_id: ID of the domain.
        :param str domain_name: Name of the domain.
        :param str group_id: Domain group ID, if not filled, the default is all groups.
        :param str group_name: Name of group that contains the domain.
        :param str id: The Id of resource.
        :param bool in_black_hole: Whether it is in black hole.
        :param bool in_clean: Whether it is cleaning.
        :param str instance_id: Cloud analysis product ID.
        :param int min_ttl: Minimum TTL.
        :param str puny_code: Punycode of the Chinese domain.
        :param str record_line_tree_json: Tree-like analytical line list.
        :param bool region_lines: Whether it is a regional route.
        :param str remark: The Id of resource group which the dns belongs.
        :param str resource_group_id: The Id of resource group which the dns belongs.
        :param bool slave_dns: Whether to allow auxiliary dns.
        :param Mapping[str, Any] tags: A mapping of tags to assign to the resource.
        :param str version_code: Cloud analysis version code.
        """
        pulumi.set(__self__, "ali_domain", ali_domain)
        pulumi.set(__self__, "available_ttls", available_ttls)
        pulumi.set(__self__, "dns_servers", dns_servers)
        pulumi.set(__self__, "domain_id", domain_id)
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "group_name", group_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "in_black_hole", in_black_hole)
        pulumi.set(__self__, "in_clean", in_clean)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "line_type", line_type)
        pulumi.set(__self__, "min_ttl", min_ttl)
        pulumi.set(__self__, "puny_code", puny_code)
        pulumi.set(__self__, "record_line_tree_json", record_line_tree_json)
        pulumi.set(__self__, "record_lines", record_lines)
        pulumi.set(__self__, "region_lines", region_lines)
        pulumi.set(__self__, "remark", remark)
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        pulumi.set(__self__, "slave_dns", slave_dns)
        pulumi.set(__self__, "tags", tags)
        pulumi.set(__self__, "version_code", version_code)
        pulumi.set(__self__, "version_name", version_name)

    @property
    @pulumi.getter(name="aliDomain")
    def ali_domain(self) -> bool:
        """
        Specifies whether the domain is from Alibaba Cloud or not.
        """
        return pulumi.get(self, "ali_domain")

    @property
    @pulumi.getter(name="availableTtls")
    def available_ttls(self) -> Sequence[int]:
        return pulumi.get(self, "available_ttls")

    @property
    @pulumi.getter(name="dnsServers")
    def dns_servers(self) -> Sequence[str]:
        """
        DNS list of domain names in the resolution system.
        """
        return pulumi.get(self, "dns_servers")

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> str:
        """
        ID of the domain.
        """
        return pulumi.get(self, "domain_id")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        """
        Name of the domain.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        Domain group ID, if not filled, the default is all groups.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> str:
        """
        Name of group that contains the domain.
        """
        return pulumi.get(self, "group_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Id of resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="inBlackHole")
    def in_black_hole(self) -> bool:
        """
        Whether it is in black hole.
        """
        return pulumi.get(self, "in_black_hole")

    @property
    @pulumi.getter(name="inClean")
    def in_clean(self) -> bool:
        """
        Whether it is cleaning.
        """
        return pulumi.get(self, "in_clean")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        Cloud analysis product ID.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="lineType")
    def line_type(self) -> str:
        return pulumi.get(self, "line_type")

    @property
    @pulumi.getter(name="minTtl")
    def min_ttl(self) -> int:
        """
        Minimum TTL.
        """
        return pulumi.get(self, "min_ttl")

    @property
    @pulumi.getter(name="punyCode")
    def puny_code(self) -> str:
        """
        Punycode of the Chinese domain.
        """
        return pulumi.get(self, "puny_code")

    @property
    @pulumi.getter(name="recordLineTreeJson")
    def record_line_tree_json(self) -> str:
        """
        Tree-like analytical line list.
        """
        return pulumi.get(self, "record_line_tree_json")

    @property
    @pulumi.getter(name="recordLines")
    def record_lines(self) -> Sequence['outputs.GetDomainsDomainRecordLineResult']:
        return pulumi.get(self, "record_lines")

    @property
    @pulumi.getter(name="regionLines")
    def region_lines(self) -> bool:
        """
        Whether it is a regional route.
        """
        return pulumi.get(self, "region_lines")

    @property
    @pulumi.getter
    def remark(self) -> str:
        """
        The Id of resource group which the dns belongs.
        """
        return pulumi.get(self, "remark")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> str:
        """
        The Id of resource group which the dns belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="slaveDns")
    def slave_dns(self) -> bool:
        """
        Whether to allow auxiliary dns.
        """
        return pulumi.get(self, "slave_dns")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, Any]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="versionCode")
    def version_code(self) -> str:
        """
        Cloud analysis version code.
        """
        return pulumi.get(self, "version_code")

    @property
    @pulumi.getter(name="versionName")
    def version_name(self) -> str:
        return pulumi.get(self, "version_name")


@pulumi.output_type
class GetDomainsDomainRecordLineResult(dict):
    def __init__(__self__, *,
                 father_code: str,
                 line_code: str,
                 line_display_name: str,
                 line_name: str):
        pulumi.set(__self__, "father_code", father_code)
        pulumi.set(__self__, "line_code", line_code)
        pulumi.set(__self__, "line_display_name", line_display_name)
        pulumi.set(__self__, "line_name", line_name)

    @property
    @pulumi.getter(name="fatherCode")
    def father_code(self) -> str:
        return pulumi.get(self, "father_code")

    @property
    @pulumi.getter(name="lineCode")
    def line_code(self) -> str:
        return pulumi.get(self, "line_code")

    @property
    @pulumi.getter(name="lineDisplayName")
    def line_display_name(self) -> str:
        return pulumi.get(self, "line_display_name")

    @property
    @pulumi.getter(name="lineName")
    def line_name(self) -> str:
        return pulumi.get(self, "line_name")


@pulumi.output_type
class GetGroupsGroupResult(dict):
    def __init__(__self__, *,
                 group_id: str,
                 group_name: str):
        """
        :param str group_id: Id of the group.
        :param str group_name: Name of the group.
        """
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "group_name", group_name)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        Id of the group.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> str:
        """
        Name of the group.
        """
        return pulumi.get(self, "group_name")


@pulumi.output_type
class GetInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 dns_security: str,
                 domain: str,
                 domain_numbers: str,
                 id: str,
                 instance_id: str,
                 payment_type: str,
                 version_code: str,
                 version_name: str):
        """
        :param str dns_security: DNS security level.
        :param str domain_numbers: Number of domain names bound.
        :param str id: Id of the instance.
        :param str instance_id: Id of the instance resource.
        :param str version_code: Paid package version.
        :param str version_name: Paid package version name.
        """
        pulumi.set(__self__, "dns_security", dns_security)
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "domain_numbers", domain_numbers)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "payment_type", payment_type)
        pulumi.set(__self__, "version_code", version_code)
        pulumi.set(__self__, "version_name", version_name)

    @property
    @pulumi.getter(name="dnsSecurity")
    def dns_security(self) -> str:
        """
        DNS security level.
        """
        return pulumi.get(self, "dns_security")

    @property
    @pulumi.getter
    def domain(self) -> str:
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="domainNumbers")
    def domain_numbers(self) -> str:
        """
        Number of domain names bound.
        """
        return pulumi.get(self, "domain_numbers")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Id of the instance.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        Id of the instance resource.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> str:
        return pulumi.get(self, "payment_type")

    @property
    @pulumi.getter(name="versionCode")
    def version_code(self) -> str:
        """
        Paid package version.
        """
        return pulumi.get(self, "version_code")

    @property
    @pulumi.getter(name="versionName")
    def version_name(self) -> str:
        """
        Paid package version name.
        """
        return pulumi.get(self, "version_name")


@pulumi.output_type
class GetRecordsRecordResult(dict):
    def __init__(__self__, *,
                 domain_name: str,
                 host_record: str,
                 line: str,
                 locked: bool,
                 priority: int,
                 record_id: str,
                 status: str,
                 ttl: float,
                 type: str,
                 value: str):
        """
        :param str domain_name: The domain name associated to the records.
        :param str host_record: Host record of the domain.
        :param str line: ISP line. Valid items are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm)
        :param bool locked: Indicates whether the record is locked.
        :param int priority: Priority of the `MX` record.
        :param str record_id: ID of the record.
        :param str status: Record status. Valid items are `ENABLE` and `DISABLE`.
        :param float ttl: TTL of the record.
        :param str type: Record type. Valid items are `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
        :param str value: Host record value of the domain.
        """
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "host_record", host_record)
        pulumi.set(__self__, "line", line)
        pulumi.set(__self__, "locked", locked)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "record_id", record_id)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "ttl", ttl)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        """
        The domain name associated to the records.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="hostRecord")
    def host_record(self) -> str:
        """
        Host record of the domain.
        """
        return pulumi.get(self, "host_record")

    @property
    @pulumi.getter
    def line(self) -> str:
        """
        ISP line. Valid items are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm)
        """
        return pulumi.get(self, "line")

    @property
    @pulumi.getter
    def locked(self) -> bool:
        """
        Indicates whether the record is locked.
        """
        return pulumi.get(self, "locked")

    @property
    @pulumi.getter
    def priority(self) -> int:
        """
        Priority of the `MX` record.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="recordId")
    def record_id(self) -> str:
        """
        ID of the record.
        """
        return pulumi.get(self, "record_id")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Record status. Valid items are `ENABLE` and `DISABLE`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def ttl(self) -> float:
        """
        TTL of the record.
        """
        return pulumi.get(self, "ttl")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Record type. Valid items are `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        Host record value of the domain.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetResolutionLinesLineResult(dict):
    def __init__(__self__, *,
                 line_code: str,
                 line_display_name: str,
                 line_name: str):
        """
        :param str line_display_name: Line display name.
        :param str line_name: Line name.
        """
        pulumi.set(__self__, "line_code", line_code)
        pulumi.set(__self__, "line_display_name", line_display_name)
        pulumi.set(__self__, "line_name", line_name)

    @property
    @pulumi.getter(name="lineCode")
    def line_code(self) -> str:
        return pulumi.get(self, "line_code")

    @property
    @pulumi.getter(name="lineDisplayName")
    def line_display_name(self) -> str:
        """
        Line display name.
        """
        return pulumi.get(self, "line_display_name")

    @property
    @pulumi.getter(name="lineName")
    def line_name(self) -> str:
        """
        Line name.
        """
        return pulumi.get(self, "line_name")


