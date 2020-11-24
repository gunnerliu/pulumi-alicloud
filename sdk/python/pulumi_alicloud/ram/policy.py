# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Policy']


class Policy(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 document: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 statements: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyStatementArgs']]]]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        RAM policy can be imported using the id or name, e.g.

        ```sh
         $ pulumi import alicloud:ram/policy:Policy example my-policy
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the RAM policy. This name can have a string of 1 to 1024 characters.
        :param pulumi.Input[str] document: Document of the RAM policy. It is required when the `statement` is not specified.
        :param pulumi.Input[bool] force: This parameter is used for resource destroy. Default value is `false`.
        :param pulumi.Input[str] name: Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyStatementArgs']]]] statements: (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
        :param pulumi.Input[str] version: (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
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

            __props__['description'] = description
            __props__['document'] = document
            __props__['force'] = force
            __props__['name'] = name
            if statements is not None:
                warnings.warn("""Field 'statement' has been deprecated from version 1.49.0, and use field 'document' to replace. """, DeprecationWarning)
                pulumi.log.warn("statements is deprecated: Field 'statement' has been deprecated from version 1.49.0, and use field 'document' to replace. ")
            __props__['statements'] = statements
            if version is not None:
                warnings.warn("""Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace. """, DeprecationWarning)
                pulumi.log.warn("version is deprecated: Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace. ")
            __props__['version'] = version
            __props__['attachment_count'] = None
            __props__['type'] = None
        super(Policy, __self__).__init__(
            'alicloud:ram/policy:Policy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            attachment_count: Optional[pulumi.Input[int]] = None,
            description: Optional[pulumi.Input[str]] = None,
            document: Optional[pulumi.Input[str]] = None,
            force: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            statements: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyStatementArgs']]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[str]] = None) -> 'Policy':
        """
        Get an existing Policy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] attachment_count: The policy attachment count.
        :param pulumi.Input[str] description: Description of the RAM policy. This name can have a string of 1 to 1024 characters.
        :param pulumi.Input[str] document: Document of the RAM policy. It is required when the `statement` is not specified.
        :param pulumi.Input[bool] force: This parameter is used for resource destroy. Default value is `false`.
        :param pulumi.Input[str] name: Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyStatementArgs']]]] statements: (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
        :param pulumi.Input[str] type: The policy type.
        :param pulumi.Input[str] version: (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["attachment_count"] = attachment_count
        __props__["description"] = description
        __props__["document"] = document
        __props__["force"] = force
        __props__["name"] = name
        __props__["statements"] = statements
        __props__["type"] = type
        __props__["version"] = version
        return Policy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="attachmentCount")
    def attachment_count(self) -> pulumi.Output[int]:
        """
        The policy attachment count.
        """
        return pulumi.get(self, "attachment_count")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the RAM policy. This name can have a string of 1 to 1024 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def document(self) -> pulumi.Output[str]:
        """
        Document of the RAM policy. It is required when the `statement` is not specified.
        """
        return pulumi.get(self, "document")

    @property
    @pulumi.getter
    def force(self) -> pulumi.Output[Optional[bool]]:
        """
        This parameter is used for resource destroy. Default value is `false`.
        """
        return pulumi.get(self, "force")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def statements(self) -> pulumi.Output[Sequence['outputs.PolicyStatement']]:
        """
        (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
        """
        return pulumi.get(self, "statements")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The policy type.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[Optional[str]]:
        """
        (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
        """
        return pulumi.get(self, "version")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

