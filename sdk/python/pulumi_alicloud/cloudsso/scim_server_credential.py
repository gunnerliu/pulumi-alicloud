# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ScimServerCredentialArgs', 'ScimServerCredential']

@pulumi.input_type
class ScimServerCredentialArgs:
    def __init__(__self__, *,
                 directory_id: pulumi.Input[str],
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ScimServerCredential resource.
        :param pulumi.Input[str] directory_id: The ID of the Directory.
        :param pulumi.Input[str] status: The Status of the resource. Valid values: `Disabled`, `Enabled`.
        """
        pulumi.set(__self__, "directory_id", directory_id)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> pulumi.Input[str]:
        """
        The ID of the Directory.
        """
        return pulumi.get(self, "directory_id")

    @directory_id.setter
    def directory_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "directory_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The Status of the resource. Valid values: `Disabled`, `Enabled`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _ScimServerCredentialState:
    def __init__(__self__, *,
                 credential_id: Optional[pulumi.Input[str]] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ScimServerCredential resources.
        :param pulumi.Input[str] credential_id: The CredentialId of the resource.
        :param pulumi.Input[str] directory_id: The ID of the Directory.
        :param pulumi.Input[str] status: The Status of the resource. Valid values: `Disabled`, `Enabled`.
        """
        if credential_id is not None:
            pulumi.set(__self__, "credential_id", credential_id)
        if directory_id is not None:
            pulumi.set(__self__, "directory_id", directory_id)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="credentialId")
    def credential_id(self) -> Optional[pulumi.Input[str]]:
        """
        The CredentialId of the resource.
        """
        return pulumi.get(self, "credential_id")

    @credential_id.setter
    def credential_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "credential_id", value)

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Directory.
        """
        return pulumi.get(self, "directory_id")

    @directory_id.setter
    def directory_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "directory_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The Status of the resource. Valid values: `Disabled`, `Enabled`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class ScimServerCredential(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloud SSO SCIM Server Credential resource.

        For information about Cloud SSO SCIM Server Credential and how to use it, see [What is Cloud SSO SCIM Server Credential](https://www.alibabacloud.com/help/doc-detail/264937.html).

        > **NOTE:** Available in v1.138.0+.

        > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region

        ## Import

        Cloud SSO SCIM Server Credential can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cloudsso/scimServerCredential:ScimServerCredential example <directory_id>:<credential_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] directory_id: The ID of the Directory.
        :param pulumi.Input[str] status: The Status of the resource. Valid values: `Disabled`, `Enabled`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ScimServerCredentialArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud SSO SCIM Server Credential resource.

        For information about Cloud SSO SCIM Server Credential and how to use it, see [What is Cloud SSO SCIM Server Credential](https://www.alibabacloud.com/help/doc-detail/264937.html).

        > **NOTE:** Available in v1.138.0+.

        > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region

        ## Import

        Cloud SSO SCIM Server Credential can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cloudsso/scimServerCredential:ScimServerCredential example <directory_id>:<credential_id>
        ```

        :param str resource_name: The name of the resource.
        :param ScimServerCredentialArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ScimServerCredentialArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ScimServerCredentialArgs.__new__(ScimServerCredentialArgs)

            if directory_id is None and not opts.urn:
                raise TypeError("Missing required property 'directory_id'")
            __props__.__dict__["directory_id"] = directory_id
            __props__.__dict__["status"] = status
            __props__.__dict__["credential_id"] = None
        super(ScimServerCredential, __self__).__init__(
            'alicloud:cloudsso/scimServerCredential:ScimServerCredential',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            credential_id: Optional[pulumi.Input[str]] = None,
            directory_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'ScimServerCredential':
        """
        Get an existing ScimServerCredential resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] credential_id: The CredentialId of the resource.
        :param pulumi.Input[str] directory_id: The ID of the Directory.
        :param pulumi.Input[str] status: The Status of the resource. Valid values: `Disabled`, `Enabled`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ScimServerCredentialState.__new__(_ScimServerCredentialState)

        __props__.__dict__["credential_id"] = credential_id
        __props__.__dict__["directory_id"] = directory_id
        __props__.__dict__["status"] = status
        return ScimServerCredential(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="credentialId")
    def credential_id(self) -> pulumi.Output[str]:
        """
        The CredentialId of the resource.
        """
        return pulumi.get(self, "credential_id")

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> pulumi.Output[str]:
        """
        The ID of the Directory.
        """
        return pulumi.get(self, "directory_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The Status of the resource. Valid values: `Disabled`, `Enabled`.
        """
        return pulumi.get(self, "status")

