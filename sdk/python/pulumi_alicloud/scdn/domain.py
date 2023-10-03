# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DomainArgs', 'Domain']

@pulumi.input_type
class DomainArgs:
    def __init__(__self__, *,
                 domain_name: pulumi.Input[str],
                 sources: pulumi.Input[Sequence[pulumi.Input['DomainSourceArgs']]],
                 biz_name: Optional[pulumi.Input[str]] = None,
                 cert_infos: Optional[pulumi.Input[Sequence[pulumi.Input['DomainCertInfoArgs']]]] = None,
                 check_url: Optional[pulumi.Input[str]] = None,
                 force_set: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Domain resource.
        :param pulumi.Input[str] domain_name: The name of domain.
        :param pulumi.Input[Sequence[pulumi.Input['DomainSourceArgs']]] sources: the Origin Server Information. See the following `Block sources`.
        :param pulumi.Input[str] biz_name: Attribute perm has been deprecated and suggest removing it from your template.
        :param pulumi.Input[Sequence[pulumi.Input['DomainCertInfoArgs']]] cert_infos: Certificate Information. See the following `Block cert_infos`.
        :param pulumi.Input[str] check_url: The health check url.
        :param pulumi.Input[str] force_set: Whether to set certificate forcibly.
        :param pulumi.Input[str] resource_group_id: The resource group id.
        :param pulumi.Input[str] status: The status of the resource. Valid values: `offline`, `online`.
        """
        DomainArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            domain_name=domain_name,
            sources=sources,
            biz_name=biz_name,
            cert_infos=cert_infos,
            check_url=check_url,
            force_set=force_set,
            resource_group_id=resource_group_id,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             domain_name: pulumi.Input[str],
             sources: pulumi.Input[Sequence[pulumi.Input['DomainSourceArgs']]],
             biz_name: Optional[pulumi.Input[str]] = None,
             cert_infos: Optional[pulumi.Input[Sequence[pulumi.Input['DomainCertInfoArgs']]]] = None,
             check_url: Optional[pulumi.Input[str]] = None,
             force_set: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("domain_name", domain_name)
        _setter("sources", sources)
        if biz_name is not None:
            warnings.warn("""Attribute biz_name has been deprecated and suggest removing it from your template.""", DeprecationWarning)
            pulumi.log.warn("""biz_name is deprecated: Attribute biz_name has been deprecated and suggest removing it from your template.""")
        if biz_name is not None:
            _setter("biz_name", biz_name)
        if cert_infos is not None:
            _setter("cert_infos", cert_infos)
        if check_url is not None:
            _setter("check_url", check_url)
        if force_set is not None:
            _setter("force_set", force_set)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Input[str]:
        """
        The name of domain.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter
    def sources(self) -> pulumi.Input[Sequence[pulumi.Input['DomainSourceArgs']]]:
        """
        the Origin Server Information. See the following `Block sources`.
        """
        return pulumi.get(self, "sources")

    @sources.setter
    def sources(self, value: pulumi.Input[Sequence[pulumi.Input['DomainSourceArgs']]]):
        pulumi.set(self, "sources", value)

    @property
    @pulumi.getter(name="bizName")
    def biz_name(self) -> Optional[pulumi.Input[str]]:
        """
        Attribute perm has been deprecated and suggest removing it from your template.
        """
        warnings.warn("""Attribute biz_name has been deprecated and suggest removing it from your template.""", DeprecationWarning)
        pulumi.log.warn("""biz_name is deprecated: Attribute biz_name has been deprecated and suggest removing it from your template.""")

        return pulumi.get(self, "biz_name")

    @biz_name.setter
    def biz_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "biz_name", value)

    @property
    @pulumi.getter(name="certInfos")
    def cert_infos(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DomainCertInfoArgs']]]]:
        """
        Certificate Information. See the following `Block cert_infos`.
        """
        return pulumi.get(self, "cert_infos")

    @cert_infos.setter
    def cert_infos(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DomainCertInfoArgs']]]]):
        pulumi.set(self, "cert_infos", value)

    @property
    @pulumi.getter(name="checkUrl")
    def check_url(self) -> Optional[pulumi.Input[str]]:
        """
        The health check url.
        """
        return pulumi.get(self, "check_url")

    @check_url.setter
    def check_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "check_url", value)

    @property
    @pulumi.getter(name="forceSet")
    def force_set(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to set certificate forcibly.
        """
        return pulumi.get(self, "force_set")

    @force_set.setter
    def force_set(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "force_set", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The resource group id.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource. Valid values: `offline`, `online`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _DomainState:
    def __init__(__self__, *,
                 biz_name: Optional[pulumi.Input[str]] = None,
                 cert_infos: Optional[pulumi.Input[Sequence[pulumi.Input['DomainCertInfoArgs']]]] = None,
                 check_url: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 force_set: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 sources: Optional[pulumi.Input[Sequence[pulumi.Input['DomainSourceArgs']]]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Domain resources.
        :param pulumi.Input[str] biz_name: Attribute perm has been deprecated and suggest removing it from your template.
        :param pulumi.Input[Sequence[pulumi.Input['DomainCertInfoArgs']]] cert_infos: Certificate Information. See the following `Block cert_infos`.
        :param pulumi.Input[str] check_url: The health check url.
        :param pulumi.Input[str] domain_name: The name of domain.
        :param pulumi.Input[str] force_set: Whether to set certificate forcibly.
        :param pulumi.Input[str] resource_group_id: The resource group id.
        :param pulumi.Input[Sequence[pulumi.Input['DomainSourceArgs']]] sources: the Origin Server Information. See the following `Block sources`.
        :param pulumi.Input[str] status: The status of the resource. Valid values: `offline`, `online`.
        """
        _DomainState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            biz_name=biz_name,
            cert_infos=cert_infos,
            check_url=check_url,
            domain_name=domain_name,
            force_set=force_set,
            resource_group_id=resource_group_id,
            sources=sources,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             biz_name: Optional[pulumi.Input[str]] = None,
             cert_infos: Optional[pulumi.Input[Sequence[pulumi.Input['DomainCertInfoArgs']]]] = None,
             check_url: Optional[pulumi.Input[str]] = None,
             domain_name: Optional[pulumi.Input[str]] = None,
             force_set: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             sources: Optional[pulumi.Input[Sequence[pulumi.Input['DomainSourceArgs']]]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if biz_name is not None:
            warnings.warn("""Attribute biz_name has been deprecated and suggest removing it from your template.""", DeprecationWarning)
            pulumi.log.warn("""biz_name is deprecated: Attribute biz_name has been deprecated and suggest removing it from your template.""")
        if biz_name is not None:
            _setter("biz_name", biz_name)
        if cert_infos is not None:
            _setter("cert_infos", cert_infos)
        if check_url is not None:
            _setter("check_url", check_url)
        if domain_name is not None:
            _setter("domain_name", domain_name)
        if force_set is not None:
            _setter("force_set", force_set)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if sources is not None:
            _setter("sources", sources)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="bizName")
    def biz_name(self) -> Optional[pulumi.Input[str]]:
        """
        Attribute perm has been deprecated and suggest removing it from your template.
        """
        warnings.warn("""Attribute biz_name has been deprecated and suggest removing it from your template.""", DeprecationWarning)
        pulumi.log.warn("""biz_name is deprecated: Attribute biz_name has been deprecated and suggest removing it from your template.""")

        return pulumi.get(self, "biz_name")

    @biz_name.setter
    def biz_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "biz_name", value)

    @property
    @pulumi.getter(name="certInfos")
    def cert_infos(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DomainCertInfoArgs']]]]:
        """
        Certificate Information. See the following `Block cert_infos`.
        """
        return pulumi.get(self, "cert_infos")

    @cert_infos.setter
    def cert_infos(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DomainCertInfoArgs']]]]):
        pulumi.set(self, "cert_infos", value)

    @property
    @pulumi.getter(name="checkUrl")
    def check_url(self) -> Optional[pulumi.Input[str]]:
        """
        The health check url.
        """
        return pulumi.get(self, "check_url")

    @check_url.setter
    def check_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "check_url", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of domain.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="forceSet")
    def force_set(self) -> Optional[pulumi.Input[str]]:
        """
        Whether to set certificate forcibly.
        """
        return pulumi.get(self, "force_set")

    @force_set.setter
    def force_set(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "force_set", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The resource group id.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def sources(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DomainSourceArgs']]]]:
        """
        the Origin Server Information. See the following `Block sources`.
        """
        return pulumi.get(self, "sources")

    @sources.setter
    def sources(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DomainSourceArgs']]]]):
        pulumi.set(self, "sources", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource. Valid values: `offline`, `online`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class Domain(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 biz_name: Optional[pulumi.Input[str]] = None,
                 cert_infos: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainCertInfoArgs']]]]] = None,
                 check_url: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 force_set: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 sources: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainSourceArgs']]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a SCDN Domain resource.

        For information about SCDN Domain and how to use it, see [What is Domain](https://help.aliyun.com/document_detail/63672.html).

        > **NOTE:** Available in v1.131.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.scdn.Domain("example",
            domain_name="my-Domain",
            sources=[alicloud.scdn.DomainSourceArgs(
                content="xxx.aliyuncs.com",
                enabled="online",
                port=80,
                priority="20",
                type="oss",
            )])
        ```

        ## Import

        SCDN Domain can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:scdn/domain:Domain example <domain_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] biz_name: Attribute perm has been deprecated and suggest removing it from your template.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainCertInfoArgs']]]] cert_infos: Certificate Information. See the following `Block cert_infos`.
        :param pulumi.Input[str] check_url: The health check url.
        :param pulumi.Input[str] domain_name: The name of domain.
        :param pulumi.Input[str] force_set: Whether to set certificate forcibly.
        :param pulumi.Input[str] resource_group_id: The resource group id.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainSourceArgs']]]] sources: the Origin Server Information. See the following `Block sources`.
        :param pulumi.Input[str] status: The status of the resource. Valid values: `offline`, `online`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a SCDN Domain resource.

        For information about SCDN Domain and how to use it, see [What is Domain](https://help.aliyun.com/document_detail/63672.html).

        > **NOTE:** Available in v1.131.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.scdn.Domain("example",
            domain_name="my-Domain",
            sources=[alicloud.scdn.DomainSourceArgs(
                content="xxx.aliyuncs.com",
                enabled="online",
                port=80,
                priority="20",
                type="oss",
            )])
        ```

        ## Import

        SCDN Domain can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:scdn/domain:Domain example <domain_name>
        ```

        :param str resource_name: The name of the resource.
        :param DomainArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DomainArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DomainArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 biz_name: Optional[pulumi.Input[str]] = None,
                 cert_infos: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainCertInfoArgs']]]]] = None,
                 check_url: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 force_set: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 sources: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainSourceArgs']]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainArgs.__new__(DomainArgs)

            __props__.__dict__["biz_name"] = biz_name
            __props__.__dict__["cert_infos"] = cert_infos
            __props__.__dict__["check_url"] = check_url
            if domain_name is None and not opts.urn:
                raise TypeError("Missing required property 'domain_name'")
            __props__.__dict__["domain_name"] = domain_name
            __props__.__dict__["force_set"] = force_set
            __props__.__dict__["resource_group_id"] = resource_group_id
            if sources is None and not opts.urn:
                raise TypeError("Missing required property 'sources'")
            __props__.__dict__["sources"] = sources
            __props__.__dict__["status"] = status
        super(Domain, __self__).__init__(
            'alicloud:scdn/domain:Domain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            biz_name: Optional[pulumi.Input[str]] = None,
            cert_infos: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainCertInfoArgs']]]]] = None,
            check_url: Optional[pulumi.Input[str]] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            force_set: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            sources: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainSourceArgs']]]]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'Domain':
        """
        Get an existing Domain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] biz_name: Attribute perm has been deprecated and suggest removing it from your template.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainCertInfoArgs']]]] cert_infos: Certificate Information. See the following `Block cert_infos`.
        :param pulumi.Input[str] check_url: The health check url.
        :param pulumi.Input[str] domain_name: The name of domain.
        :param pulumi.Input[str] force_set: Whether to set certificate forcibly.
        :param pulumi.Input[str] resource_group_id: The resource group id.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainSourceArgs']]]] sources: the Origin Server Information. See the following `Block sources`.
        :param pulumi.Input[str] status: The status of the resource. Valid values: `offline`, `online`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainState.__new__(_DomainState)

        __props__.__dict__["biz_name"] = biz_name
        __props__.__dict__["cert_infos"] = cert_infos
        __props__.__dict__["check_url"] = check_url
        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["force_set"] = force_set
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["sources"] = sources
        __props__.__dict__["status"] = status
        return Domain(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="bizName")
    def biz_name(self) -> pulumi.Output[Optional[str]]:
        """
        Attribute perm has been deprecated and suggest removing it from your template.
        """
        warnings.warn("""Attribute biz_name has been deprecated and suggest removing it from your template.""", DeprecationWarning)
        pulumi.log.warn("""biz_name is deprecated: Attribute biz_name has been deprecated and suggest removing it from your template.""")

        return pulumi.get(self, "biz_name")

    @property
    @pulumi.getter(name="certInfos")
    def cert_infos(self) -> pulumi.Output[Optional[Sequence['outputs.DomainCertInfo']]]:
        """
        Certificate Information. See the following `Block cert_infos`.
        """
        return pulumi.get(self, "cert_infos")

    @property
    @pulumi.getter(name="checkUrl")
    def check_url(self) -> pulumi.Output[Optional[str]]:
        """
        The health check url.
        """
        return pulumi.get(self, "check_url")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[str]:
        """
        The name of domain.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="forceSet")
    def force_set(self) -> pulumi.Output[Optional[str]]:
        """
        Whether to set certificate forcibly.
        """
        return pulumi.get(self, "force_set")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The resource group id.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def sources(self) -> pulumi.Output[Sequence['outputs.DomainSource']]:
        """
        the Origin Server Information. See the following `Block sources`.
        """
        return pulumi.get(self, "sources")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource. Valid values: `offline`, `online`.
        """
        return pulumi.get(self, "status")

