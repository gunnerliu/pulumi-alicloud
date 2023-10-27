# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['OidcProviderArgs', 'OidcProvider']

@pulumi.input_type
class OidcProviderArgs:
    def __init__(__self__, *,
                 issuer_url: pulumi.Input[str],
                 oidc_provider_name: pulumi.Input[str],
                 client_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 fingerprints: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 issuance_limit_time: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a OidcProvider resource.
        :param pulumi.Input[str] issuer_url: The issuer URL of the OIDC identity provider.
        :param pulumi.Input[str] oidc_provider_name: The name of the OIDC identity provider.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] client_ids: Client ID.
        :param pulumi.Input[str] description: Description of OIDC identity provider.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] fingerprints: The authentication fingerprint of the HTTPS CA certificate.
        :param pulumi.Input[int] issuance_limit_time: The earliest time when an external IdP is allowed to issue an ID Token. If the iat field in the ID Token is greater than the current time, the request is rejected.Unit: hours. Value range: 1~168.
        """
        pulumi.set(__self__, "issuer_url", issuer_url)
        pulumi.set(__self__, "oidc_provider_name", oidc_provider_name)
        if client_ids is not None:
            pulumi.set(__self__, "client_ids", client_ids)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if fingerprints is not None:
            pulumi.set(__self__, "fingerprints", fingerprints)
        if issuance_limit_time is not None:
            pulumi.set(__self__, "issuance_limit_time", issuance_limit_time)

    @property
    @pulumi.getter(name="issuerUrl")
    def issuer_url(self) -> pulumi.Input[str]:
        """
        The issuer URL of the OIDC identity provider.
        """
        return pulumi.get(self, "issuer_url")

    @issuer_url.setter
    def issuer_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "issuer_url", value)

    @property
    @pulumi.getter(name="oidcProviderName")
    def oidc_provider_name(self) -> pulumi.Input[str]:
        """
        The name of the OIDC identity provider.
        """
        return pulumi.get(self, "oidc_provider_name")

    @oidc_provider_name.setter
    def oidc_provider_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "oidc_provider_name", value)

    @property
    @pulumi.getter(name="clientIds")
    def client_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Client ID.
        """
        return pulumi.get(self, "client_ids")

    @client_ids.setter
    def client_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "client_ids", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of OIDC identity provider.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def fingerprints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The authentication fingerprint of the HTTPS CA certificate.
        """
        return pulumi.get(self, "fingerprints")

    @fingerprints.setter
    def fingerprints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "fingerprints", value)

    @property
    @pulumi.getter(name="issuanceLimitTime")
    def issuance_limit_time(self) -> Optional[pulumi.Input[int]]:
        """
        The earliest time when an external IdP is allowed to issue an ID Token. If the iat field in the ID Token is greater than the current time, the request is rejected.Unit: hours. Value range: 1~168.
        """
        return pulumi.get(self, "issuance_limit_time")

    @issuance_limit_time.setter
    def issuance_limit_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "issuance_limit_time", value)


@pulumi.input_type
class _OidcProviderState:
    def __init__(__self__, *,
                 client_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 fingerprints: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 issuance_limit_time: Optional[pulumi.Input[int]] = None,
                 issuer_url: Optional[pulumi.Input[str]] = None,
                 oidc_provider_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OidcProvider resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] client_ids: Client ID.
        :param pulumi.Input[str] create_time: Creation Time (UTC time).
        :param pulumi.Input[str] description: Description of OIDC identity provider.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] fingerprints: The authentication fingerprint of the HTTPS CA certificate.
        :param pulumi.Input[int] issuance_limit_time: The earliest time when an external IdP is allowed to issue an ID Token. If the iat field in the ID Token is greater than the current time, the request is rejected.Unit: hours. Value range: 1~168.
        :param pulumi.Input[str] issuer_url: The issuer URL of the OIDC identity provider.
        :param pulumi.Input[str] oidc_provider_name: The name of the OIDC identity provider.
        """
        if client_ids is not None:
            pulumi.set(__self__, "client_ids", client_ids)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if fingerprints is not None:
            pulumi.set(__self__, "fingerprints", fingerprints)
        if issuance_limit_time is not None:
            pulumi.set(__self__, "issuance_limit_time", issuance_limit_time)
        if issuer_url is not None:
            pulumi.set(__self__, "issuer_url", issuer_url)
        if oidc_provider_name is not None:
            pulumi.set(__self__, "oidc_provider_name", oidc_provider_name)

    @property
    @pulumi.getter(name="clientIds")
    def client_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Client ID.
        """
        return pulumi.get(self, "client_ids")

    @client_ids.setter
    def client_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "client_ids", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        Creation Time (UTC time).
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of OIDC identity provider.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def fingerprints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The authentication fingerprint of the HTTPS CA certificate.
        """
        return pulumi.get(self, "fingerprints")

    @fingerprints.setter
    def fingerprints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "fingerprints", value)

    @property
    @pulumi.getter(name="issuanceLimitTime")
    def issuance_limit_time(self) -> Optional[pulumi.Input[int]]:
        """
        The earliest time when an external IdP is allowed to issue an ID Token. If the iat field in the ID Token is greater than the current time, the request is rejected.Unit: hours. Value range: 1~168.
        """
        return pulumi.get(self, "issuance_limit_time")

    @issuance_limit_time.setter
    def issuance_limit_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "issuance_limit_time", value)

    @property
    @pulumi.getter(name="issuerUrl")
    def issuer_url(self) -> Optional[pulumi.Input[str]]:
        """
        The issuer URL of the OIDC identity provider.
        """
        return pulumi.get(self, "issuer_url")

    @issuer_url.setter
    def issuer_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "issuer_url", value)

    @property
    @pulumi.getter(name="oidcProviderName")
    def oidc_provider_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the OIDC identity provider.
        """
        return pulumi.get(self, "oidc_provider_name")

    @oidc_provider_name.setter
    def oidc_provider_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oidc_provider_name", value)


class OidcProvider(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 fingerprints: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 issuance_limit_time: Optional[pulumi.Input[int]] = None,
                 issuer_url: Optional[pulumi.Input[str]] = None,
                 oidc_provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a IMS Oidc Provider resource. OpenID Connect Provider.

        For information about IMS Oidc Provider and how to use it, see [What is Oidc Provider](https://www.alibabacloud.com/help/en/ram/developer-reference/api-ims-2019-08-15-createoidcprovider).

        > **NOTE:** Available since v1.210.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        oidc_provider_name = config.get("oidcProviderName")
        if oidc_provider_name is None:
            oidc_provider_name = "amp-resource-example-oidc-provider"
        default = alicloud.ims.OidcProvider("default",
            description=oidc_provider_name,
            issuer_url="https://oauth.aliyun.com",
            fingerprints=["902ef2deeb3c5b13ea4c3d5193629309e231ae55"],
            issuance_limit_time=12,
            oidc_provider_name=name,
            client_ids=[
                "123",
                "456",
            ])
        ```

        ## Import

        IMS Oidc Provider can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ims/oidcProvider:OidcProvider example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] client_ids: Client ID.
        :param pulumi.Input[str] description: Description of OIDC identity provider.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] fingerprints: The authentication fingerprint of the HTTPS CA certificate.
        :param pulumi.Input[int] issuance_limit_time: The earliest time when an external IdP is allowed to issue an ID Token. If the iat field in the ID Token is greater than the current time, the request is rejected.Unit: hours. Value range: 1~168.
        :param pulumi.Input[str] issuer_url: The issuer URL of the OIDC identity provider.
        :param pulumi.Input[str] oidc_provider_name: The name of the OIDC identity provider.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OidcProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a IMS Oidc Provider resource. OpenID Connect Provider.

        For information about IMS Oidc Provider and how to use it, see [What is Oidc Provider](https://www.alibabacloud.com/help/en/ram/developer-reference/api-ims-2019-08-15-createoidcprovider).

        > **NOTE:** Available since v1.210.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        oidc_provider_name = config.get("oidcProviderName")
        if oidc_provider_name is None:
            oidc_provider_name = "amp-resource-example-oidc-provider"
        default = alicloud.ims.OidcProvider("default",
            description=oidc_provider_name,
            issuer_url="https://oauth.aliyun.com",
            fingerprints=["902ef2deeb3c5b13ea4c3d5193629309e231ae55"],
            issuance_limit_time=12,
            oidc_provider_name=name,
            client_ids=[
                "123",
                "456",
            ])
        ```

        ## Import

        IMS Oidc Provider can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ims/oidcProvider:OidcProvider example <id>
        ```

        :param str resource_name: The name of the resource.
        :param OidcProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OidcProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 fingerprints: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 issuance_limit_time: Optional[pulumi.Input[int]] = None,
                 issuer_url: Optional[pulumi.Input[str]] = None,
                 oidc_provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OidcProviderArgs.__new__(OidcProviderArgs)

            __props__.__dict__["client_ids"] = client_ids
            __props__.__dict__["description"] = description
            __props__.__dict__["fingerprints"] = fingerprints
            __props__.__dict__["issuance_limit_time"] = issuance_limit_time
            if issuer_url is None and not opts.urn:
                raise TypeError("Missing required property 'issuer_url'")
            __props__.__dict__["issuer_url"] = issuer_url
            if oidc_provider_name is None and not opts.urn:
                raise TypeError("Missing required property 'oidc_provider_name'")
            __props__.__dict__["oidc_provider_name"] = oidc_provider_name
            __props__.__dict__["create_time"] = None
        super(OidcProvider, __self__).__init__(
            'alicloud:ims/oidcProvider:OidcProvider',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            client_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            fingerprints: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            issuance_limit_time: Optional[pulumi.Input[int]] = None,
            issuer_url: Optional[pulumi.Input[str]] = None,
            oidc_provider_name: Optional[pulumi.Input[str]] = None) -> 'OidcProvider':
        """
        Get an existing OidcProvider resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] client_ids: Client ID.
        :param pulumi.Input[str] create_time: Creation Time (UTC time).
        :param pulumi.Input[str] description: Description of OIDC identity provider.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] fingerprints: The authentication fingerprint of the HTTPS CA certificate.
        :param pulumi.Input[int] issuance_limit_time: The earliest time when an external IdP is allowed to issue an ID Token. If the iat field in the ID Token is greater than the current time, the request is rejected.Unit: hours. Value range: 1~168.
        :param pulumi.Input[str] issuer_url: The issuer URL of the OIDC identity provider.
        :param pulumi.Input[str] oidc_provider_name: The name of the OIDC identity provider.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OidcProviderState.__new__(_OidcProviderState)

        __props__.__dict__["client_ids"] = client_ids
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["fingerprints"] = fingerprints
        __props__.__dict__["issuance_limit_time"] = issuance_limit_time
        __props__.__dict__["issuer_url"] = issuer_url
        __props__.__dict__["oidc_provider_name"] = oidc_provider_name
        return OidcProvider(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clientIds")
    def client_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Client ID.
        """
        return pulumi.get(self, "client_ids")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Creation Time (UTC time).
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of OIDC identity provider.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def fingerprints(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The authentication fingerprint of the HTTPS CA certificate.
        """
        return pulumi.get(self, "fingerprints")

    @property
    @pulumi.getter(name="issuanceLimitTime")
    def issuance_limit_time(self) -> pulumi.Output[int]:
        """
        The earliest time when an external IdP is allowed to issue an ID Token. If the iat field in the ID Token is greater than the current time, the request is rejected.Unit: hours. Value range: 1~168.
        """
        return pulumi.get(self, "issuance_limit_time")

    @property
    @pulumi.getter(name="issuerUrl")
    def issuer_url(self) -> pulumi.Output[str]:
        """
        The issuer URL of the OIDC identity provider.
        """
        return pulumi.get(self, "issuer_url")

    @property
    @pulumi.getter(name="oidcProviderName")
    def oidc_provider_name(self) -> pulumi.Output[str]:
        """
        The name of the OIDC identity provider.
        """
        return pulumi.get(self, "oidc_provider_name")

