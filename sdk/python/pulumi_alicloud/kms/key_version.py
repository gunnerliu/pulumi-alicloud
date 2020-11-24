# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['KeyVersion']


class KeyVersion(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Alikms Key Version resource. For information about Alikms Key Version and how to use it, see [What is Resource Alikms Key Version](https://www.alibabacloud.com/help/doc-detail/133838.htm).

        > **NOTE:** Available in v1.85.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        this = alicloud.kms.Key("this")
        keyversion = alicloud.kms.KeyVersion("keyversion", key_id=this.id)
        ```

        ## Import

        Alikms key version can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:kms/keyVersion:KeyVersion example 72da539a-2fa8-4f2d-b854-*****	
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key_id: The id of the master key (CMK).
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

            if key_id is None:
                raise TypeError("Missing required property 'key_id'")
            __props__['key_id'] = key_id
            __props__['creation_date'] = None
            __props__['key_version_id'] = None
        super(KeyVersion, __self__).__init__(
            'alicloud:kms/keyVersion:KeyVersion',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            creation_date: Optional[pulumi.Input[str]] = None,
            key_id: Optional[pulumi.Input[str]] = None,
            key_version_id: Optional[pulumi.Input[str]] = None) -> 'KeyVersion':
        """
        Get an existing KeyVersion resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] creation_date: The date and time (UTC time) when the Alikms key version was created.
        :param pulumi.Input[str] key_id: The id of the master key (CMK).
        :param pulumi.Input[str] key_version_id: The id of the Alikms key version.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["creation_date"] = creation_date
        __props__["key_id"] = key_id
        __props__["key_version_id"] = key_version_id
        return KeyVersion(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="creationDate")
    def creation_date(self) -> pulumi.Output[str]:
        """
        The date and time (UTC time) when the Alikms key version was created.
        """
        return pulumi.get(self, "creation_date")

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> pulumi.Output[str]:
        """
        The id of the master key (CMK).
        """
        return pulumi.get(self, "key_id")

    @property
    @pulumi.getter(name="keyVersionId")
    def key_version_id(self) -> pulumi.Output[str]:
        """
        The id of the Alikms key version.
        """
        return pulumi.get(self, "key_version_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

