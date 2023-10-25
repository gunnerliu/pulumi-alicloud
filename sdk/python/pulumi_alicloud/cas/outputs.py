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
    'GetCertificatesCertificateResult',
    'GetServiceCertificatesCertificateResult',
]

@pulumi.output_type
class GetCertificatesCertificateResult(dict):
    def __init__(__self__, *,
                 buy_in_aliyun: bool,
                 cert: str,
                 cert_id: str,
                 certificate_name: str,
                 city: str,
                 common: str,
                 country: str,
                 end_date: str,
                 expired: bool,
                 fingerprint: str,
                 id: str,
                 issuer: str,
                 key: str,
                 name: str,
                 org_name: str,
                 province: str,
                 sans: str,
                 start_date: str):
        """
        :param bool buy_in_aliyun: The cert is buy from aliyun or not.
        :param str city: The cert's city.
        :param str common: The cert's common name.
        :param str country: The cert's country.
        :param str end_date: The cert's not valid after time.
        :param bool expired: The cert is expired or not.
        :param str id: The cert's id.
        :param str issuer: The cert's .
        :param str name: The cert's name.
        :param str org_name: The cert's organization.
        :param str province: The cert's province.
        :param str sans: The cert's subject alternative name.
        :param str start_date: The cert's not valid before time.
        """
        GetCertificatesCertificateResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            buy_in_aliyun=buy_in_aliyun,
            cert=cert,
            cert_id=cert_id,
            certificate_name=certificate_name,
            city=city,
            common=common,
            country=country,
            end_date=end_date,
            expired=expired,
            fingerprint=fingerprint,
            id=id,
            issuer=issuer,
            key=key,
            name=name,
            org_name=org_name,
            province=province,
            sans=sans,
            start_date=start_date,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             buy_in_aliyun: Optional[bool] = None,
             cert: Optional[str] = None,
             cert_id: Optional[str] = None,
             certificate_name: Optional[str] = None,
             city: Optional[str] = None,
             common: Optional[str] = None,
             country: Optional[str] = None,
             end_date: Optional[str] = None,
             expired: Optional[bool] = None,
             fingerprint: Optional[str] = None,
             id: Optional[str] = None,
             issuer: Optional[str] = None,
             key: Optional[str] = None,
             name: Optional[str] = None,
             org_name: Optional[str] = None,
             province: Optional[str] = None,
             sans: Optional[str] = None,
             start_date: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if buy_in_aliyun is None and 'buyInAliyun' in kwargs:
            buy_in_aliyun = kwargs['buyInAliyun']
        if buy_in_aliyun is None:
            raise TypeError("Missing 'buy_in_aliyun' argument")
        if cert is None:
            raise TypeError("Missing 'cert' argument")
        if cert_id is None and 'certId' in kwargs:
            cert_id = kwargs['certId']
        if cert_id is None:
            raise TypeError("Missing 'cert_id' argument")
        if certificate_name is None and 'certificateName' in kwargs:
            certificate_name = kwargs['certificateName']
        if certificate_name is None:
            raise TypeError("Missing 'certificate_name' argument")
        if city is None:
            raise TypeError("Missing 'city' argument")
        if common is None:
            raise TypeError("Missing 'common' argument")
        if country is None:
            raise TypeError("Missing 'country' argument")
        if end_date is None and 'endDate' in kwargs:
            end_date = kwargs['endDate']
        if end_date is None:
            raise TypeError("Missing 'end_date' argument")
        if expired is None:
            raise TypeError("Missing 'expired' argument")
        if fingerprint is None:
            raise TypeError("Missing 'fingerprint' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if issuer is None:
            raise TypeError("Missing 'issuer' argument")
        if key is None:
            raise TypeError("Missing 'key' argument")
        if name is None:
            raise TypeError("Missing 'name' argument")
        if org_name is None and 'orgName' in kwargs:
            org_name = kwargs['orgName']
        if org_name is None:
            raise TypeError("Missing 'org_name' argument")
        if province is None:
            raise TypeError("Missing 'province' argument")
        if sans is None:
            raise TypeError("Missing 'sans' argument")
        if start_date is None and 'startDate' in kwargs:
            start_date = kwargs['startDate']
        if start_date is None:
            raise TypeError("Missing 'start_date' argument")

        _setter("buy_in_aliyun", buy_in_aliyun)
        _setter("cert", cert)
        _setter("cert_id", cert_id)
        _setter("certificate_name", certificate_name)
        _setter("city", city)
        _setter("common", common)
        _setter("country", country)
        _setter("end_date", end_date)
        _setter("expired", expired)
        _setter("fingerprint", fingerprint)
        _setter("id", id)
        _setter("issuer", issuer)
        _setter("key", key)
        _setter("name", name)
        _setter("org_name", org_name)
        _setter("province", province)
        _setter("sans", sans)
        _setter("start_date", start_date)

    @property
    @pulumi.getter(name="buyInAliyun")
    def buy_in_aliyun(self) -> bool:
        """
        The cert is buy from aliyun or not.
        """
        return pulumi.get(self, "buy_in_aliyun")

    @property
    @pulumi.getter
    def cert(self) -> str:
        return pulumi.get(self, "cert")

    @property
    @pulumi.getter(name="certId")
    def cert_id(self) -> str:
        return pulumi.get(self, "cert_id")

    @property
    @pulumi.getter(name="certificateName")
    def certificate_name(self) -> str:
        return pulumi.get(self, "certificate_name")

    @property
    @pulumi.getter
    def city(self) -> str:
        """
        The cert's city.
        """
        return pulumi.get(self, "city")

    @property
    @pulumi.getter
    def common(self) -> str:
        """
        The cert's common name.
        """
        return pulumi.get(self, "common")

    @property
    @pulumi.getter
    def country(self) -> str:
        """
        The cert's country.
        """
        return pulumi.get(self, "country")

    @property
    @pulumi.getter(name="endDate")
    def end_date(self) -> str:
        """
        The cert's not valid after time.
        """
        return pulumi.get(self, "end_date")

    @property
    @pulumi.getter
    def expired(self) -> bool:
        """
        The cert is expired or not.
        """
        return pulumi.get(self, "expired")

    @property
    @pulumi.getter
    def fingerprint(self) -> str:
        return pulumi.get(self, "fingerprint")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The cert's id.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def issuer(self) -> str:
        """
        The cert's .
        """
        return pulumi.get(self, "issuer")

    @property
    @pulumi.getter
    def key(self) -> str:
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The cert's name.
        """
        warnings.warn("""Field 'name' has been deprecated from provider version 1.129.0 and it will be removed in the future version. Please use the new attribute 'certificate_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from provider version 1.129.0 and it will be removed in the future version. Please use the new attribute 'certificate_name' instead.""")

        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgName")
    def org_name(self) -> str:
        """
        The cert's organization.
        """
        return pulumi.get(self, "org_name")

    @property
    @pulumi.getter
    def province(self) -> str:
        """
        The cert's province.
        """
        return pulumi.get(self, "province")

    @property
    @pulumi.getter
    def sans(self) -> str:
        """
        The cert's subject alternative name.
        """
        return pulumi.get(self, "sans")

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> str:
        """
        The cert's not valid before time.
        """
        return pulumi.get(self, "start_date")


@pulumi.output_type
class GetServiceCertificatesCertificateResult(dict):
    def __init__(__self__, *,
                 buy_in_aliyun: bool,
                 cert: str,
                 cert_id: str,
                 certificate_name: str,
                 city: str,
                 common: str,
                 country: str,
                 end_date: str,
                 expired: bool,
                 fingerprint: str,
                 id: str,
                 issuer: str,
                 key: str,
                 name: str,
                 org_name: str,
                 province: str,
                 sans: str,
                 start_date: str):
        """
        :param bool buy_in_aliyun: The cert is buy from aliyun or not.
        :param str cert: The cert's Cert.
        :param str cert_id: The cert's id.
        :param str certificate_name: The cert's name.
        :param str city: The cert's city.
        :param str common: The cert's common name.
        :param str country: The cert's country.
        :param str end_date: The cert's not valid after time.
        :param bool expired: The cert is expired or not.
        :param str fingerprint: The cert's finger.
        :param str id: The cert's id.
        :param str issuer: The cert's Issuer.
        :param str key: The cert's Keye.
        :param str org_name: The cert's organization.
        :param str province: The cert's province.
        :param str sans: The cert's subject alternative name.
        :param str start_date: The cert's not valid before time.
        """
        GetServiceCertificatesCertificateResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            buy_in_aliyun=buy_in_aliyun,
            cert=cert,
            cert_id=cert_id,
            certificate_name=certificate_name,
            city=city,
            common=common,
            country=country,
            end_date=end_date,
            expired=expired,
            fingerprint=fingerprint,
            id=id,
            issuer=issuer,
            key=key,
            name=name,
            org_name=org_name,
            province=province,
            sans=sans,
            start_date=start_date,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             buy_in_aliyun: Optional[bool] = None,
             cert: Optional[str] = None,
             cert_id: Optional[str] = None,
             certificate_name: Optional[str] = None,
             city: Optional[str] = None,
             common: Optional[str] = None,
             country: Optional[str] = None,
             end_date: Optional[str] = None,
             expired: Optional[bool] = None,
             fingerprint: Optional[str] = None,
             id: Optional[str] = None,
             issuer: Optional[str] = None,
             key: Optional[str] = None,
             name: Optional[str] = None,
             org_name: Optional[str] = None,
             province: Optional[str] = None,
             sans: Optional[str] = None,
             start_date: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if buy_in_aliyun is None and 'buyInAliyun' in kwargs:
            buy_in_aliyun = kwargs['buyInAliyun']
        if buy_in_aliyun is None:
            raise TypeError("Missing 'buy_in_aliyun' argument")
        if cert is None:
            raise TypeError("Missing 'cert' argument")
        if cert_id is None and 'certId' in kwargs:
            cert_id = kwargs['certId']
        if cert_id is None:
            raise TypeError("Missing 'cert_id' argument")
        if certificate_name is None and 'certificateName' in kwargs:
            certificate_name = kwargs['certificateName']
        if certificate_name is None:
            raise TypeError("Missing 'certificate_name' argument")
        if city is None:
            raise TypeError("Missing 'city' argument")
        if common is None:
            raise TypeError("Missing 'common' argument")
        if country is None:
            raise TypeError("Missing 'country' argument")
        if end_date is None and 'endDate' in kwargs:
            end_date = kwargs['endDate']
        if end_date is None:
            raise TypeError("Missing 'end_date' argument")
        if expired is None:
            raise TypeError("Missing 'expired' argument")
        if fingerprint is None:
            raise TypeError("Missing 'fingerprint' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if issuer is None:
            raise TypeError("Missing 'issuer' argument")
        if key is None:
            raise TypeError("Missing 'key' argument")
        if name is None:
            raise TypeError("Missing 'name' argument")
        if org_name is None and 'orgName' in kwargs:
            org_name = kwargs['orgName']
        if org_name is None:
            raise TypeError("Missing 'org_name' argument")
        if province is None:
            raise TypeError("Missing 'province' argument")
        if sans is None:
            raise TypeError("Missing 'sans' argument")
        if start_date is None and 'startDate' in kwargs:
            start_date = kwargs['startDate']
        if start_date is None:
            raise TypeError("Missing 'start_date' argument")

        _setter("buy_in_aliyun", buy_in_aliyun)
        _setter("cert", cert)
        _setter("cert_id", cert_id)
        _setter("certificate_name", certificate_name)
        _setter("city", city)
        _setter("common", common)
        _setter("country", country)
        _setter("end_date", end_date)
        _setter("expired", expired)
        _setter("fingerprint", fingerprint)
        _setter("id", id)
        _setter("issuer", issuer)
        _setter("key", key)
        _setter("name", name)
        _setter("org_name", org_name)
        _setter("province", province)
        _setter("sans", sans)
        _setter("start_date", start_date)

    @property
    @pulumi.getter(name="buyInAliyun")
    def buy_in_aliyun(self) -> bool:
        """
        The cert is buy from aliyun or not.
        """
        return pulumi.get(self, "buy_in_aliyun")

    @property
    @pulumi.getter
    def cert(self) -> str:
        """
        The cert's Cert.
        """
        return pulumi.get(self, "cert")

    @property
    @pulumi.getter(name="certId")
    def cert_id(self) -> str:
        """
        The cert's id.
        """
        return pulumi.get(self, "cert_id")

    @property
    @pulumi.getter(name="certificateName")
    def certificate_name(self) -> str:
        """
        The cert's name.
        """
        return pulumi.get(self, "certificate_name")

    @property
    @pulumi.getter
    def city(self) -> str:
        """
        The cert's city.
        """
        return pulumi.get(self, "city")

    @property
    @pulumi.getter
    def common(self) -> str:
        """
        The cert's common name.
        """
        return pulumi.get(self, "common")

    @property
    @pulumi.getter
    def country(self) -> str:
        """
        The cert's country.
        """
        return pulumi.get(self, "country")

    @property
    @pulumi.getter(name="endDate")
    def end_date(self) -> str:
        """
        The cert's not valid after time.
        """
        return pulumi.get(self, "end_date")

    @property
    @pulumi.getter
    def expired(self) -> bool:
        """
        The cert is expired or not.
        """
        return pulumi.get(self, "expired")

    @property
    @pulumi.getter
    def fingerprint(self) -> str:
        """
        The cert's finger.
        """
        return pulumi.get(self, "fingerprint")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The cert's id.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def issuer(self) -> str:
        """
        The cert's Issuer.
        """
        return pulumi.get(self, "issuer")

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        The cert's Keye.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def name(self) -> str:
        warnings.warn("""Field 'name' has been deprecated from provider version 1.129.0 and it will be removed in the future version. Please use the new attribute 'certificate_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from provider version 1.129.0 and it will be removed in the future version. Please use the new attribute 'certificate_name' instead.""")

        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgName")
    def org_name(self) -> str:
        """
        The cert's organization.
        """
        return pulumi.get(self, "org_name")

    @property
    @pulumi.getter
    def province(self) -> str:
        """
        The cert's province.
        """
        return pulumi.get(self, "province")

    @property
    @pulumi.getter
    def sans(self) -> str:
        """
        The cert's subject alternative name.
        """
        return pulumi.get(self, "sans")

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> str:
        """
        The cert's not valid before time.
        """
        return pulumi.get(self, "start_date")


