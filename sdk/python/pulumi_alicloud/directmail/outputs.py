# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetDomainsDomainResult',
    'GetMailAddressesAddressResult',
    'GetReceiversReceiverseResult',
    'GetTagsTagResult',
]

@pulumi.output_type
class GetDomainsDomainResult(dict):
    def __init__(__self__, *,
                 cname_auth_status: str,
                 cname_confirm_status: str,
                 cname_record: str,
                 create_time: str,
                 default_domain: str,
                 dns_mx: str,
                 dns_spf: str,
                 dns_txt: str,
                 domain_id: str,
                 domain_name: str,
                 domain_type: str,
                 icp_status: str,
                 id: str,
                 mx_auth_status: str,
                 mx_record: str,
                 spf_auth_status: str,
                 spf_record: str,
                 status: str,
                 tl_domain_name: str,
                 tracef_record: str):
        """
        :param str cname_auth_status: Track verification.
        :param str cname_confirm_status: Indicates whether the CNAME record is successfully verified. Valid values: `0` and `1`. `0`: indicates the verification is successful. `1`: indicates that the verification fails.
        :param str cname_record: The value of the CNAME record.
        :param str create_time: The time when the DNS record was created.
        :param str default_domain: The default domain name.
        :param str dns_mx: The value of the MX record.
        :param str dns_spf: The value of the SPF record.
        :param str dns_txt: The value of the TXT ownership record.
        :param str domain_id: The ID of the domain name.
        :param str domain_name: The domain name.
        :param str domain_type: The type of the domain.
        :param str icp_status: The status of ICP filing. Valid values: `0` and `1`. `0`: indicates that the domain name is not filed. `1`: indicates that the domain name is filed.
        :param str id: The ID of the Domain.
        :param str mx_auth_status: Indicates whether the MX record is successfully verified. Valid values: `0` and `1`. `0`: indicates the verification is successful. `1`: indicates that the verification fails.
        :param str mx_record: The MX verification record provided by Alibaba Cloud DNS.
        :param str spf_auth_status: Indicates whether the SPF record is successfully verified. Valid values: `0` and `1`. `0`: indicates the verification is successful. `1`: indicates that the verification fails.
        :param str spf_record: The SPF verification record provided by Alibaba Cloud DNS.
        :param str status: The status of the domain name. Valid values:`0` to `4`. `0`:Available, Passed. `1`: Unavailable, No passed. `2`: Available, cname no passed, icp no passed. `3`: Available, icp no passed. `4`: Available, cname no passed.
        :param str tl_domain_name: The primary domain name.
        :param str tracef_record: The CNAME verification record provided by Alibaba Cloud DNS.
        """
        GetDomainsDomainResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cname_auth_status=cname_auth_status,
            cname_confirm_status=cname_confirm_status,
            cname_record=cname_record,
            create_time=create_time,
            default_domain=default_domain,
            dns_mx=dns_mx,
            dns_spf=dns_spf,
            dns_txt=dns_txt,
            domain_id=domain_id,
            domain_name=domain_name,
            domain_type=domain_type,
            icp_status=icp_status,
            id=id,
            mx_auth_status=mx_auth_status,
            mx_record=mx_record,
            spf_auth_status=spf_auth_status,
            spf_record=spf_record,
            status=status,
            tl_domain_name=tl_domain_name,
            tracef_record=tracef_record,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cname_auth_status: Optional[str] = None,
             cname_confirm_status: Optional[str] = None,
             cname_record: Optional[str] = None,
             create_time: Optional[str] = None,
             default_domain: Optional[str] = None,
             dns_mx: Optional[str] = None,
             dns_spf: Optional[str] = None,
             dns_txt: Optional[str] = None,
             domain_id: Optional[str] = None,
             domain_name: Optional[str] = None,
             domain_type: Optional[str] = None,
             icp_status: Optional[str] = None,
             id: Optional[str] = None,
             mx_auth_status: Optional[str] = None,
             mx_record: Optional[str] = None,
             spf_auth_status: Optional[str] = None,
             spf_record: Optional[str] = None,
             status: Optional[str] = None,
             tl_domain_name: Optional[str] = None,
             tracef_record: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if cname_auth_status is None and 'cnameAuthStatus' in kwargs:
            cname_auth_status = kwargs['cnameAuthStatus']
        if cname_auth_status is None:
            raise TypeError("Missing 'cname_auth_status' argument")
        if cname_confirm_status is None and 'cnameConfirmStatus' in kwargs:
            cname_confirm_status = kwargs['cnameConfirmStatus']
        if cname_confirm_status is None:
            raise TypeError("Missing 'cname_confirm_status' argument")
        if cname_record is None and 'cnameRecord' in kwargs:
            cname_record = kwargs['cnameRecord']
        if cname_record is None:
            raise TypeError("Missing 'cname_record' argument")
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if create_time is None:
            raise TypeError("Missing 'create_time' argument")
        if default_domain is None and 'defaultDomain' in kwargs:
            default_domain = kwargs['defaultDomain']
        if default_domain is None:
            raise TypeError("Missing 'default_domain' argument")
        if dns_mx is None and 'dnsMx' in kwargs:
            dns_mx = kwargs['dnsMx']
        if dns_mx is None:
            raise TypeError("Missing 'dns_mx' argument")
        if dns_spf is None and 'dnsSpf' in kwargs:
            dns_spf = kwargs['dnsSpf']
        if dns_spf is None:
            raise TypeError("Missing 'dns_spf' argument")
        if dns_txt is None and 'dnsTxt' in kwargs:
            dns_txt = kwargs['dnsTxt']
        if dns_txt is None:
            raise TypeError("Missing 'dns_txt' argument")
        if domain_id is None and 'domainId' in kwargs:
            domain_id = kwargs['domainId']
        if domain_id is None:
            raise TypeError("Missing 'domain_id' argument")
        if domain_name is None and 'domainName' in kwargs:
            domain_name = kwargs['domainName']
        if domain_name is None:
            raise TypeError("Missing 'domain_name' argument")
        if domain_type is None and 'domainType' in kwargs:
            domain_type = kwargs['domainType']
        if domain_type is None:
            raise TypeError("Missing 'domain_type' argument")
        if icp_status is None and 'icpStatus' in kwargs:
            icp_status = kwargs['icpStatus']
        if icp_status is None:
            raise TypeError("Missing 'icp_status' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if mx_auth_status is None and 'mxAuthStatus' in kwargs:
            mx_auth_status = kwargs['mxAuthStatus']
        if mx_auth_status is None:
            raise TypeError("Missing 'mx_auth_status' argument")
        if mx_record is None and 'mxRecord' in kwargs:
            mx_record = kwargs['mxRecord']
        if mx_record is None:
            raise TypeError("Missing 'mx_record' argument")
        if spf_auth_status is None and 'spfAuthStatus' in kwargs:
            spf_auth_status = kwargs['spfAuthStatus']
        if spf_auth_status is None:
            raise TypeError("Missing 'spf_auth_status' argument")
        if spf_record is None and 'spfRecord' in kwargs:
            spf_record = kwargs['spfRecord']
        if spf_record is None:
            raise TypeError("Missing 'spf_record' argument")
        if status is None:
            raise TypeError("Missing 'status' argument")
        if tl_domain_name is None and 'tlDomainName' in kwargs:
            tl_domain_name = kwargs['tlDomainName']
        if tl_domain_name is None:
            raise TypeError("Missing 'tl_domain_name' argument")
        if tracef_record is None and 'tracefRecord' in kwargs:
            tracef_record = kwargs['tracefRecord']
        if tracef_record is None:
            raise TypeError("Missing 'tracef_record' argument")

        _setter("cname_auth_status", cname_auth_status)
        _setter("cname_confirm_status", cname_confirm_status)
        _setter("cname_record", cname_record)
        _setter("create_time", create_time)
        _setter("default_domain", default_domain)
        _setter("dns_mx", dns_mx)
        _setter("dns_spf", dns_spf)
        _setter("dns_txt", dns_txt)
        _setter("domain_id", domain_id)
        _setter("domain_name", domain_name)
        _setter("domain_type", domain_type)
        _setter("icp_status", icp_status)
        _setter("id", id)
        _setter("mx_auth_status", mx_auth_status)
        _setter("mx_record", mx_record)
        _setter("spf_auth_status", spf_auth_status)
        _setter("spf_record", spf_record)
        _setter("status", status)
        _setter("tl_domain_name", tl_domain_name)
        _setter("tracef_record", tracef_record)

    @property
    @pulumi.getter(name="cnameAuthStatus")
    def cname_auth_status(self) -> str:
        """
        Track verification.
        """
        return pulumi.get(self, "cname_auth_status")

    @property
    @pulumi.getter(name="cnameConfirmStatus")
    def cname_confirm_status(self) -> str:
        """
        Indicates whether the CNAME record is successfully verified. Valid values: `0` and `1`. `0`: indicates the verification is successful. `1`: indicates that the verification fails.
        """
        return pulumi.get(self, "cname_confirm_status")

    @property
    @pulumi.getter(name="cnameRecord")
    def cname_record(self) -> str:
        """
        The value of the CNAME record.
        """
        return pulumi.get(self, "cname_record")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The time when the DNS record was created.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="defaultDomain")
    def default_domain(self) -> str:
        """
        The default domain name.
        """
        return pulumi.get(self, "default_domain")

    @property
    @pulumi.getter(name="dnsMx")
    def dns_mx(self) -> str:
        """
        The value of the MX record.
        """
        return pulumi.get(self, "dns_mx")

    @property
    @pulumi.getter(name="dnsSpf")
    def dns_spf(self) -> str:
        """
        The value of the SPF record.
        """
        return pulumi.get(self, "dns_spf")

    @property
    @pulumi.getter(name="dnsTxt")
    def dns_txt(self) -> str:
        """
        The value of the TXT ownership record.
        """
        return pulumi.get(self, "dns_txt")

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> str:
        """
        The ID of the domain name.
        """
        return pulumi.get(self, "domain_id")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        """
        The domain name.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="domainType")
    def domain_type(self) -> str:
        """
        The type of the domain.
        """
        return pulumi.get(self, "domain_type")

    @property
    @pulumi.getter(name="icpStatus")
    def icp_status(self) -> str:
        """
        The status of ICP filing. Valid values: `0` and `1`. `0`: indicates that the domain name is not filed. `1`: indicates that the domain name is filed.
        """
        return pulumi.get(self, "icp_status")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Domain.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mxAuthStatus")
    def mx_auth_status(self) -> str:
        """
        Indicates whether the MX record is successfully verified. Valid values: `0` and `1`. `0`: indicates the verification is successful. `1`: indicates that the verification fails.
        """
        return pulumi.get(self, "mx_auth_status")

    @property
    @pulumi.getter(name="mxRecord")
    def mx_record(self) -> str:
        """
        The MX verification record provided by Alibaba Cloud DNS.
        """
        return pulumi.get(self, "mx_record")

    @property
    @pulumi.getter(name="spfAuthStatus")
    def spf_auth_status(self) -> str:
        """
        Indicates whether the SPF record is successfully verified. Valid values: `0` and `1`. `0`: indicates the verification is successful. `1`: indicates that the verification fails.
        """
        return pulumi.get(self, "spf_auth_status")

    @property
    @pulumi.getter(name="spfRecord")
    def spf_record(self) -> str:
        """
        The SPF verification record provided by Alibaba Cloud DNS.
        """
        return pulumi.get(self, "spf_record")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the domain name. Valid values:`0` to `4`. `0`:Available, Passed. `1`: Unavailable, No passed. `2`: Available, cname no passed, icp no passed. `3`: Available, icp no passed. `4`: Available, cname no passed.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="tlDomainName")
    def tl_domain_name(self) -> str:
        """
        The primary domain name.
        """
        return pulumi.get(self, "tl_domain_name")

    @property
    @pulumi.getter(name="tracefRecord")
    def tracef_record(self) -> str:
        """
        The CNAME verification record provided by Alibaba Cloud DNS.
        """
        return pulumi.get(self, "tracef_record")


@pulumi.output_type
class GetMailAddressesAddressResult(dict):
    def __init__(__self__, *,
                 account_name: str,
                 create_time: str,
                 daily_count: str,
                 daily_req_count: str,
                 domain_status: str,
                 id: str,
                 mail_address_id: str,
                 month_count: str,
                 month_req_count: str,
                 reply_address: str,
                 reply_status: str,
                 sendtype: str,
                 status: str):
        """
        :param str account_name: The sender address.
        :param str create_time: The creation of the record time.
        :param str daily_count: On the quota limit.
        :param str daily_req_count: On the quota.
        :param str domain_status: Domain name status. Valid values: `0`, `1`.
        :param str id: The ID of the Mail Address.
        :param str mail_address_id: The sender address ID.
        :param str month_count: Monthly quota limit.
        :param str month_req_count: Months amount.
        :param str reply_address: Return address.
        :param str reply_status: If using STMP address status.
        :param str sendtype: Account type.
        :param str status: Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
        """
        GetMailAddressesAddressResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_name=account_name,
            create_time=create_time,
            daily_count=daily_count,
            daily_req_count=daily_req_count,
            domain_status=domain_status,
            id=id,
            mail_address_id=mail_address_id,
            month_count=month_count,
            month_req_count=month_req_count,
            reply_address=reply_address,
            reply_status=reply_status,
            sendtype=sendtype,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_name: Optional[str] = None,
             create_time: Optional[str] = None,
             daily_count: Optional[str] = None,
             daily_req_count: Optional[str] = None,
             domain_status: Optional[str] = None,
             id: Optional[str] = None,
             mail_address_id: Optional[str] = None,
             month_count: Optional[str] = None,
             month_req_count: Optional[str] = None,
             reply_address: Optional[str] = None,
             reply_status: Optional[str] = None,
             sendtype: Optional[str] = None,
             status: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if account_name is None and 'accountName' in kwargs:
            account_name = kwargs['accountName']
        if account_name is None:
            raise TypeError("Missing 'account_name' argument")
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if create_time is None:
            raise TypeError("Missing 'create_time' argument")
        if daily_count is None and 'dailyCount' in kwargs:
            daily_count = kwargs['dailyCount']
        if daily_count is None:
            raise TypeError("Missing 'daily_count' argument")
        if daily_req_count is None and 'dailyReqCount' in kwargs:
            daily_req_count = kwargs['dailyReqCount']
        if daily_req_count is None:
            raise TypeError("Missing 'daily_req_count' argument")
        if domain_status is None and 'domainStatus' in kwargs:
            domain_status = kwargs['domainStatus']
        if domain_status is None:
            raise TypeError("Missing 'domain_status' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if mail_address_id is None and 'mailAddressId' in kwargs:
            mail_address_id = kwargs['mailAddressId']
        if mail_address_id is None:
            raise TypeError("Missing 'mail_address_id' argument")
        if month_count is None and 'monthCount' in kwargs:
            month_count = kwargs['monthCount']
        if month_count is None:
            raise TypeError("Missing 'month_count' argument")
        if month_req_count is None and 'monthReqCount' in kwargs:
            month_req_count = kwargs['monthReqCount']
        if month_req_count is None:
            raise TypeError("Missing 'month_req_count' argument")
        if reply_address is None and 'replyAddress' in kwargs:
            reply_address = kwargs['replyAddress']
        if reply_address is None:
            raise TypeError("Missing 'reply_address' argument")
        if reply_status is None and 'replyStatus' in kwargs:
            reply_status = kwargs['replyStatus']
        if reply_status is None:
            raise TypeError("Missing 'reply_status' argument")
        if sendtype is None:
            raise TypeError("Missing 'sendtype' argument")
        if status is None:
            raise TypeError("Missing 'status' argument")

        _setter("account_name", account_name)
        _setter("create_time", create_time)
        _setter("daily_count", daily_count)
        _setter("daily_req_count", daily_req_count)
        _setter("domain_status", domain_status)
        _setter("id", id)
        _setter("mail_address_id", mail_address_id)
        _setter("month_count", month_count)
        _setter("month_req_count", month_req_count)
        _setter("reply_address", reply_address)
        _setter("reply_status", reply_status)
        _setter("sendtype", sendtype)
        _setter("status", status)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> str:
        """
        The sender address.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The creation of the record time.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="dailyCount")
    def daily_count(self) -> str:
        """
        On the quota limit.
        """
        return pulumi.get(self, "daily_count")

    @property
    @pulumi.getter(name="dailyReqCount")
    def daily_req_count(self) -> str:
        """
        On the quota.
        """
        return pulumi.get(self, "daily_req_count")

    @property
    @pulumi.getter(name="domainStatus")
    def domain_status(self) -> str:
        """
        Domain name status. Valid values: `0`, `1`.
        """
        return pulumi.get(self, "domain_status")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Mail Address.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mailAddressId")
    def mail_address_id(self) -> str:
        """
        The sender address ID.
        """
        return pulumi.get(self, "mail_address_id")

    @property
    @pulumi.getter(name="monthCount")
    def month_count(self) -> str:
        """
        Monthly quota limit.
        """
        return pulumi.get(self, "month_count")

    @property
    @pulumi.getter(name="monthReqCount")
    def month_req_count(self) -> str:
        """
        Months amount.
        """
        return pulumi.get(self, "month_req_count")

    @property
    @pulumi.getter(name="replyAddress")
    def reply_address(self) -> str:
        """
        Return address.
        """
        return pulumi.get(self, "reply_address")

    @property
    @pulumi.getter(name="replyStatus")
    def reply_status(self) -> str:
        """
        If using STMP address status.
        """
        return pulumi.get(self, "reply_status")

    @property
    @pulumi.getter
    def sendtype(self) -> str:
        """
        Account type.
        """
        return pulumi.get(self, "sendtype")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetReceiversReceiverseResult(dict):
    def __init__(__self__, *,
                 create_time: str,
                 description: str,
                 id: str,
                 receivers_alias: str,
                 receivers_id: str,
                 receivers_name: str,
                 status: int):
        """
        :param str create_time: The creation time of the resource.
        :param str description: The description.
        :param str id: The ID of the Receivers.
        :param str receivers_alias: The Receivers Alias.
        :param str receivers_id: The first ID of the resource.
        :param str receivers_name: The name of the resource.
        :param int status: The status of the resource.
        """
        GetReceiversReceiverseResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            create_time=create_time,
            description=description,
            id=id,
            receivers_alias=receivers_alias,
            receivers_id=receivers_id,
            receivers_name=receivers_name,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             create_time: Optional[str] = None,
             description: Optional[str] = None,
             id: Optional[str] = None,
             receivers_alias: Optional[str] = None,
             receivers_id: Optional[str] = None,
             receivers_name: Optional[str] = None,
             status: Optional[int] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if create_time is None:
            raise TypeError("Missing 'create_time' argument")
        if description is None:
            raise TypeError("Missing 'description' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if receivers_alias is None and 'receiversAlias' in kwargs:
            receivers_alias = kwargs['receiversAlias']
        if receivers_alias is None:
            raise TypeError("Missing 'receivers_alias' argument")
        if receivers_id is None and 'receiversId' in kwargs:
            receivers_id = kwargs['receiversId']
        if receivers_id is None:
            raise TypeError("Missing 'receivers_id' argument")
        if receivers_name is None and 'receiversName' in kwargs:
            receivers_name = kwargs['receiversName']
        if receivers_name is None:
            raise TypeError("Missing 'receivers_name' argument")
        if status is None:
            raise TypeError("Missing 'status' argument")

        _setter("create_time", create_time)
        _setter("description", description)
        _setter("id", id)
        _setter("receivers_alias", receivers_alias)
        _setter("receivers_id", receivers_id)
        _setter("receivers_name", receivers_name)
        _setter("status", status)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Receivers.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="receiversAlias")
    def receivers_alias(self) -> str:
        """
        The Receivers Alias.
        """
        return pulumi.get(self, "receivers_alias")

    @property
    @pulumi.getter(name="receiversId")
    def receivers_id(self) -> str:
        """
        The first ID of the resource.
        """
        return pulumi.get(self, "receivers_id")

    @property
    @pulumi.getter(name="receiversName")
    def receivers_name(self) -> str:
        """
        The name of the resource.
        """
        return pulumi.get(self, "receivers_name")

    @property
    @pulumi.getter
    def status(self) -> int:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetTagsTagResult(dict):
    def __init__(__self__, *,
                 id: str,
                 tag_id: str,
                 tag_name: str):
        """
        :param str id: The ID of the tag.
        :param str tag_id: The ID of the tag.
        :param str tag_name: The name of the tag.
        """
        GetTagsTagResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            id=id,
            tag_id=tag_id,
            tag_name=tag_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             id: Optional[str] = None,
             tag_id: Optional[str] = None,
             tag_name: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if id is None:
            raise TypeError("Missing 'id' argument")
        if tag_id is None and 'tagId' in kwargs:
            tag_id = kwargs['tagId']
        if tag_id is None:
            raise TypeError("Missing 'tag_id' argument")
        if tag_name is None and 'tagName' in kwargs:
            tag_name = kwargs['tagName']
        if tag_name is None:
            raise TypeError("Missing 'tag_name' argument")

        _setter("id", id)
        _setter("tag_id", tag_id)
        _setter("tag_name", tag_name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the tag.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="tagId")
    def tag_id(self) -> str:
        """
        The ID of the tag.
        """
        return pulumi.get(self, "tag_id")

    @property
    @pulumi.getter(name="tagName")
    def tag_name(self) -> str:
        """
        The name of the tag.
        """
        return pulumi.get(self, "tag_name")


