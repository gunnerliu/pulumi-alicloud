# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SecurityPolicyArgs', 'SecurityPolicy']

@pulumi.input_type
class SecurityPolicyArgs:
    def __init__(__self__, *,
                 ciphers: pulumi.Input[Sequence[pulumi.Input[str]]],
                 security_policy_name: pulumi.Input[str],
                 tls_versions: pulumi.Input[Sequence[pulumi.Input[str]]],
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a SecurityPolicy resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ciphers: The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
        :param pulumi.Input[str] security_policy_name: The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tls_versions: The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        """
        pulumi.set(__self__, "ciphers", ciphers)
        pulumi.set(__self__, "security_policy_name", security_policy_name)
        pulumi.set(__self__, "tls_versions", tls_versions)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def ciphers(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
        """
        return pulumi.get(self, "ciphers")

    @ciphers.setter
    def ciphers(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "ciphers", value)

    @property
    @pulumi.getter(name="securityPolicyName")
    def security_policy_name(self) -> pulumi.Input[str]:
        """
        The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
        """
        return pulumi.get(self, "security_policy_name")

    @security_policy_name.setter
    def security_policy_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "security_policy_name", value)

    @property
    @pulumi.getter(name="tlsVersions")
    def tls_versions(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
        """
        return pulumi.get(self, "tls_versions")

    @tls_versions.setter
    def tls_versions(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "tls_versions", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _SecurityPolicyState:
    def __init__(__self__, *,
                 ciphers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_policy_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 tls_versions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering SecurityPolicy resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ciphers: The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] security_policy_name: The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tls_versions: The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
        """
        if ciphers is not None:
            pulumi.set(__self__, "ciphers", ciphers)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if security_policy_name is not None:
            pulumi.set(__self__, "security_policy_name", security_policy_name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tls_versions is not None:
            pulumi.set(__self__, "tls_versions", tls_versions)

    @property
    @pulumi.getter
    def ciphers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
        """
        return pulumi.get(self, "ciphers")

    @ciphers.setter
    def ciphers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ciphers", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="securityPolicyName")
    def security_policy_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
        """
        return pulumi.get(self, "security_policy_name")

    @security_policy_name.setter
    def security_policy_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_policy_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tlsVersions")
    def tls_versions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
        """
        return pulumi.get(self, "tls_versions")

    @tls_versions.setter
    def tls_versions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tls_versions", value)


class SecurityPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ciphers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_policy_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 tls_versions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a ALB Security Policy resource.

        For information about ALB Security Policy and how to use it, see [What is Security Policy](https://www.alibabacloud.com/help/doc-detail/213607.htm).

        > **NOTE:** Available in v1.130.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "testAccSecurityPolicy"
        default = alicloud.alb.SecurityPolicy("default",
            security_policy_name=name,
            tls_versions=["TLSv1.0"],
            ciphers=[
                "ECDHE-ECDSA-AES128-SHA",
                "AES256-SHA",
            ])
        ```

        ## Import

        ALB Security Policy can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:alb/securityPolicy:SecurityPolicy example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ciphers: The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] security_policy_name: The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tls_versions: The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecurityPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ALB Security Policy resource.

        For information about ALB Security Policy and how to use it, see [What is Security Policy](https://www.alibabacloud.com/help/doc-detail/213607.htm).

        > **NOTE:** Available in v1.130.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "testAccSecurityPolicy"
        default = alicloud.alb.SecurityPolicy("default",
            security_policy_name=name,
            tls_versions=["TLSv1.0"],
            ciphers=[
                "ECDHE-ECDSA-AES128-SHA",
                "AES256-SHA",
            ])
        ```

        ## Import

        ALB Security Policy can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:alb/securityPolicy:SecurityPolicy example <id>
        ```

        :param str resource_name: The name of the resource.
        :param SecurityPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecurityPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ciphers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_policy_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 tls_versions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecurityPolicyArgs.__new__(SecurityPolicyArgs)

            if ciphers is None and not opts.urn:
                raise TypeError("Missing required property 'ciphers'")
            __props__.__dict__["ciphers"] = ciphers
            __props__.__dict__["dry_run"] = dry_run
            __props__.__dict__["resource_group_id"] = resource_group_id
            if security_policy_name is None and not opts.urn:
                raise TypeError("Missing required property 'security_policy_name'")
            __props__.__dict__["security_policy_name"] = security_policy_name
            __props__.__dict__["tags"] = tags
            if tls_versions is None and not opts.urn:
                raise TypeError("Missing required property 'tls_versions'")
            __props__.__dict__["tls_versions"] = tls_versions
            __props__.__dict__["status"] = None
        super(SecurityPolicy, __self__).__init__(
            'alicloud:alb/securityPolicy:SecurityPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ciphers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            security_policy_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            tls_versions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'SecurityPolicy':
        """
        Get an existing SecurityPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ciphers: The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] security_policy_name: The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tls_versions: The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecurityPolicyState.__new__(_SecurityPolicyState)

        __props__.__dict__["ciphers"] = ciphers
        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["security_policy_name"] = security_policy_name
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tls_versions"] = tls_versions
        return SecurityPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def ciphers(self) -> pulumi.Output[Sequence[str]]:
        """
        The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
        """
        return pulumi.get(self, "ciphers")

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="securityPolicyName")
    def security_policy_name(self) -> pulumi.Output[str]:
        """
        The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
        """
        return pulumi.get(self, "security_policy_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tlsVersions")
    def tls_versions(self) -> pulumi.Output[Sequence[str]]:
        """
        The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
        """
        return pulumi.get(self, "tls_versions")
