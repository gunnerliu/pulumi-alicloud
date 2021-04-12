# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = ['SamlProviderArgs', 'SamlProvider']

@pulumi.input_type
class SamlProviderArgs:
    def __init__(__self__, *,
                 saml_provider_name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 encodedsaml_metadata_document: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SamlProvider resource.
        :param pulumi.Input[str] saml_provider_name: The name of SAML Provider.
        :param pulumi.Input[str] description: The description of SAML Provider.
        :param pulumi.Input[str] encodedsaml_metadata_document: The metadata file, which is Base64 encoded. The file is provided by an IdP that supports SAML 2.0.
        """
        pulumi.set(__self__, "saml_provider_name", saml_provider_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if encodedsaml_metadata_document is not None:
            pulumi.set(__self__, "encodedsaml_metadata_document", encodedsaml_metadata_document)

    @property
    @pulumi.getter(name="samlProviderName")
    def saml_provider_name(self) -> pulumi.Input[str]:
        """
        The name of SAML Provider.
        """
        return pulumi.get(self, "saml_provider_name")

    @saml_provider_name.setter
    def saml_provider_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "saml_provider_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of SAML Provider.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="encodedsamlMetadataDocument")
    def encodedsaml_metadata_document(self) -> Optional[pulumi.Input[str]]:
        """
        The metadata file, which is Base64 encoded. The file is provided by an IdP that supports SAML 2.0.
        """
        return pulumi.get(self, "encodedsaml_metadata_document")

    @encodedsaml_metadata_document.setter
    def encodedsaml_metadata_document(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encodedsaml_metadata_document", value)


class SamlProvider(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 encodedsaml_metadata_document: Optional[pulumi.Input[str]] = None,
                 saml_provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a RAM SAML Provider resource.

        For information about RAM SAML Provider and how to use it, see [What is SAML Provider](https://www.alibabacloud.com/help/doc-detail/186846.htm).

        > **NOTE:** Available in v1.114.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.ram.SamlProvider("example",
            description="For Terraform Test",
            encodedsaml_metadata_document="your encodedsaml metadata document",
            saml_provider_name="tf-testAcc")
        ```

        ## Import

        RAM SAML Provider can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ram/samlProvider:SamlProvider example <saml_provider_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of SAML Provider.
        :param pulumi.Input[str] encodedsaml_metadata_document: The metadata file, which is Base64 encoded. The file is provided by an IdP that supports SAML 2.0.
        :param pulumi.Input[str] saml_provider_name: The name of SAML Provider.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SamlProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a RAM SAML Provider resource.

        For information about RAM SAML Provider and how to use it, see [What is SAML Provider](https://www.alibabacloud.com/help/doc-detail/186846.htm).

        > **NOTE:** Available in v1.114.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.ram.SamlProvider("example",
            description="For Terraform Test",
            encodedsaml_metadata_document="your encodedsaml metadata document",
            saml_provider_name="tf-testAcc")
        ```

        ## Import

        RAM SAML Provider can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ram/samlProvider:SamlProvider example <saml_provider_name>
        ```

        :param str resource_name: The name of the resource.
        :param SamlProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SamlProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 encodedsaml_metadata_document: Optional[pulumi.Input[str]] = None,
                 saml_provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

            __props__['description'] = description
            __props__['encodedsaml_metadata_document'] = encodedsaml_metadata_document
            if saml_provider_name is None and not opts.urn:
                raise TypeError("Missing required property 'saml_provider_name'")
            __props__['saml_provider_name'] = saml_provider_name
            __props__['arn'] = None
            __props__['update_date'] = None
        super(SamlProvider, __self__).__init__(
            'alicloud:ram/samlProvider:SamlProvider',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            encodedsaml_metadata_document: Optional[pulumi.Input[str]] = None,
            saml_provider_name: Optional[pulumi.Input[str]] = None,
            update_date: Optional[pulumi.Input[str]] = None) -> 'SamlProvider':
        """
        Get an existing SamlProvider resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Alibaba Cloud Resource Name (ARN) of the IdP.
        :param pulumi.Input[str] description: The description of SAML Provider.
        :param pulumi.Input[str] encodedsaml_metadata_document: The metadata file, which is Base64 encoded. The file is provided by an IdP that supports SAML 2.0.
        :param pulumi.Input[str] saml_provider_name: The name of SAML Provider.
        :param pulumi.Input[str] update_date: The update time.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["arn"] = arn
        __props__["description"] = description
        __props__["encodedsaml_metadata_document"] = encodedsaml_metadata_document
        __props__["saml_provider_name"] = saml_provider_name
        __props__["update_date"] = update_date
        return SamlProvider(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Alibaba Cloud Resource Name (ARN) of the IdP.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of SAML Provider.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="encodedsamlMetadataDocument")
    def encodedsaml_metadata_document(self) -> pulumi.Output[Optional[str]]:
        """
        The metadata file, which is Base64 encoded. The file is provided by an IdP that supports SAML 2.0.
        """
        return pulumi.get(self, "encodedsaml_metadata_document")

    @property
    @pulumi.getter(name="samlProviderName")
    def saml_provider_name(self) -> pulumi.Output[str]:
        """
        The name of SAML Provider.
        """
        return pulumi.get(self, "saml_provider_name")

    @property
    @pulumi.getter(name="updateDate")
    def update_date(self) -> pulumi.Output[str]:
        """
        The update time.
        """
        return pulumi.get(self, "update_date")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

