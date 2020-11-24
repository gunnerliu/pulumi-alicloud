# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['ServerCertificate']


class ServerCertificate(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alicloud_certifacte_id: Optional[pulumi.Input[str]] = None,
                 alicloud_certifacte_name: Optional[pulumi.Input[str]] = None,
                 alicloud_certificate_id: Optional[pulumi.Input[str]] = None,
                 alicloud_certificate_name: Optional[pulumi.Input[str]] = None,
                 alicloud_certificate_region_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 server_certificate: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        A Load Balancer Server Certificate is an ssl Certificate used by the listener of the protocol https.

        For information about slb and how to use it, see [What is Server Load Balancer](https://www.alibabacloud.com/help/doc-detail/27539.htm).

        For information about Server Certificate and how to use it, see [Configure Server Certificate](https://www.alibabacloud.com/help/doc-detail/85968.htm).

        ## Example Usage

        * using server_certificate/private content as string example

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # create a server certificate
        foo = alicloud.slb.ServerCertificate("foo",
            private_key=\"\"\"-----BEGIN RSA PRIVATE KEY-----
        MIICXAIBAAKBgQDO0knDrlNdiys******ErVpjsckAaOW/JDG5PCSwkaMxk=
        -----END RSA PRIVATE KEY-----
        \"\"\",
            server_certificate=\"\"\"-----BEGIN CERTIFICATE-----
        MIIDRjCCAq+gAwIBAgI+OuMs******XTtI90EAxEG/bJJyOm5LqoiA=
        -----END CERTIFICATE-----
        \"\"\")
        ```

        * using server_certificate/private file example

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # create a server certificate
        foo = alicloud.slb.ServerCertificate("foo",
            server_certificate=(lambda path: open(path).read())(f"{path['module']}/server_certificate.pem"),
            private_key=(lambda path: open(path).read())(f"{path['module']}/private_key.pem"))
        ```

        ## Import

        Server Load balancer Server Certificate can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:slb/serverCertificate:ServerCertificate example abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alicloud_certificate_id: an id of server certificate ssued/proxied by alibaba cloud. but it is not supported on the international site of alibaba cloud now.
        :param pulumi.Input[str] alicloud_certificate_name: the name of the certificate specified by `alicloud_certificate_id`.but it is not supported on the international site of alibaba cloud now.
        :param pulumi.Input[str] alicloud_certificate_region_id: the region of the certificate specified by `alicloud_certificate_id`. but it is not supported on the international site of alibaba cloud now.
        :param pulumi.Input[str] name: Name of the Server Certificate.
        :param pulumi.Input[str] private_key: the content of privat key of the ssl certificate specified by `server_certificate`. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the slb server certificate belongs.
        :param pulumi.Input[str] server_certificate: the content of the ssl certificate. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
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

            if alicloud_certifacte_id is not None:
                warnings.warn("""Field 'alicloud_certifacte_id' has been deprecated from provider version 1.68.0. Use 'alicloud_certificate_id' replaces it.""", DeprecationWarning)
                pulumi.log.warn("alicloud_certifacte_id is deprecated: Field 'alicloud_certifacte_id' has been deprecated from provider version 1.68.0. Use 'alicloud_certificate_id' replaces it.")
            __props__['alicloud_certifacte_id'] = alicloud_certifacte_id
            if alicloud_certifacte_name is not None:
                warnings.warn("""Field 'alicloud_certifacte_name' has been deprecated from provider version 1.68.0. Use 'alicloud_certificate_name' replaces it.""", DeprecationWarning)
                pulumi.log.warn("alicloud_certifacte_name is deprecated: Field 'alicloud_certifacte_name' has been deprecated from provider version 1.68.0. Use 'alicloud_certificate_name' replaces it.")
            __props__['alicloud_certifacte_name'] = alicloud_certifacte_name
            __props__['alicloud_certificate_id'] = alicloud_certificate_id
            __props__['alicloud_certificate_name'] = alicloud_certificate_name
            __props__['alicloud_certificate_region_id'] = alicloud_certificate_region_id
            __props__['name'] = name
            __props__['private_key'] = private_key
            __props__['resource_group_id'] = resource_group_id
            __props__['server_certificate'] = server_certificate
            __props__['tags'] = tags
        super(ServerCertificate, __self__).__init__(
            'alicloud:slb/serverCertificate:ServerCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alicloud_certifacte_id: Optional[pulumi.Input[str]] = None,
            alicloud_certifacte_name: Optional[pulumi.Input[str]] = None,
            alicloud_certificate_id: Optional[pulumi.Input[str]] = None,
            alicloud_certificate_name: Optional[pulumi.Input[str]] = None,
            alicloud_certificate_region_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            server_certificate: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None) -> 'ServerCertificate':
        """
        Get an existing ServerCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alicloud_certificate_id: an id of server certificate ssued/proxied by alibaba cloud. but it is not supported on the international site of alibaba cloud now.
        :param pulumi.Input[str] alicloud_certificate_name: the name of the certificate specified by `alicloud_certificate_id`.but it is not supported on the international site of alibaba cloud now.
        :param pulumi.Input[str] alicloud_certificate_region_id: the region of the certificate specified by `alicloud_certificate_id`. but it is not supported on the international site of alibaba cloud now.
        :param pulumi.Input[str] name: Name of the Server Certificate.
        :param pulumi.Input[str] private_key: the content of privat key of the ssl certificate specified by `server_certificate`. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the slb server certificate belongs.
        :param pulumi.Input[str] server_certificate: the content of the ssl certificate. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["alicloud_certifacte_id"] = alicloud_certifacte_id
        __props__["alicloud_certifacte_name"] = alicloud_certifacte_name
        __props__["alicloud_certificate_id"] = alicloud_certificate_id
        __props__["alicloud_certificate_name"] = alicloud_certificate_name
        __props__["alicloud_certificate_region_id"] = alicloud_certificate_region_id
        __props__["name"] = name
        __props__["private_key"] = private_key
        __props__["resource_group_id"] = resource_group_id
        __props__["server_certificate"] = server_certificate
        __props__["tags"] = tags
        return ServerCertificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="alicloudCertifacteId")
    def alicloud_certifacte_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "alicloud_certifacte_id")

    @property
    @pulumi.getter(name="alicloudCertifacteName")
    def alicloud_certifacte_name(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "alicloud_certifacte_name")

    @property
    @pulumi.getter(name="alicloudCertificateId")
    def alicloud_certificate_id(self) -> pulumi.Output[Optional[str]]:
        """
        an id of server certificate ssued/proxied by alibaba cloud. but it is not supported on the international site of alibaba cloud now.
        """
        return pulumi.get(self, "alicloud_certificate_id")

    @property
    @pulumi.getter(name="alicloudCertificateName")
    def alicloud_certificate_name(self) -> pulumi.Output[Optional[str]]:
        """
        the name of the certificate specified by `alicloud_certificate_id`.but it is not supported on the international site of alibaba cloud now.
        """
        return pulumi.get(self, "alicloud_certificate_name")

    @property
    @pulumi.getter(name="alicloudCertificateRegionId")
    def alicloud_certificate_region_id(self) -> pulumi.Output[Optional[str]]:
        """
        the region of the certificate specified by `alicloud_certificate_id`. but it is not supported on the international site of alibaba cloud now.
        """
        return pulumi.get(self, "alicloud_certificate_region_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Server Certificate.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[Optional[str]]:
        """
        the content of privat key of the ssl certificate specified by `server_certificate`. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
        """
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The Id of resource group which the slb server certificate belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="serverCertificate")
    def server_certificate(self) -> pulumi.Output[Optional[str]]:
        """
        the content of the ssl certificate. where `alicloud_certificate_id` is null, it is required, otherwise it is ignored.
        """
        return pulumi.get(self, "server_certificate")

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

