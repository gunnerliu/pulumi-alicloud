# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DomainArgs', 'Domain']

@pulumi.input_type
class DomainArgs:
    def __init__(__self__, *,
                 accelerator_id: pulumi.Input[str],
                 domain: pulumi.Input[str]):
        """
        The set of arguments for constructing a Domain resource.
        :param pulumi.Input[str] accelerator_id: The ID of the global acceleration instance.
        :param pulumi.Input[str] domain: The accelerated domain name to be added. only top-level domain names are supported, such as 'example.com'.
        """
        DomainArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            accelerator_id=accelerator_id,
            domain=domain,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             accelerator_id: pulumi.Input[str],
             domain: pulumi.Input[str],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("accelerator_id", accelerator_id)
        _setter("domain", domain)

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> pulumi.Input[str]:
        """
        The ID of the global acceleration instance.
        """
        return pulumi.get(self, "accelerator_id")

    @accelerator_id.setter
    def accelerator_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "accelerator_id", value)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Input[str]:
        """
        The accelerated domain name to be added. only top-level domain names are supported, such as 'example.com'.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain", value)


@pulumi.input_type
class _DomainState:
    def __init__(__self__, *,
                 accelerator_id: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Domain resources.
        :param pulumi.Input[str] accelerator_id: The ID of the global acceleration instance.
        :param pulumi.Input[str] domain: The accelerated domain name to be added. only top-level domain names are supported, such as 'example.com'.
        :param pulumi.Input[str] status: The status of the resource
        """
        _DomainState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            accelerator_id=accelerator_id,
            domain=domain,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             accelerator_id: Optional[pulumi.Input[str]] = None,
             domain: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if accelerator_id is not None:
            _setter("accelerator_id", accelerator_id)
        if domain is not None:
            _setter("domain", domain)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the global acceleration instance.
        """
        return pulumi.get(self, "accelerator_id")

    @accelerator_id.setter
    def accelerator_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accelerator_id", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The accelerated domain name to be added. only top-level domain names are supported, such as 'example.com'.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource
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
                 accelerator_id: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Ga Domain resource.

        For information about Ga Domain and how to use it, see [What is Domain](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createdomain).

        > **NOTE:** Available since v1.197.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_accelerator = alicloud.ga.Accelerator("defaultAccelerator",
            duration=1,
            auto_use_coupon=True,
            spec="1")
        default_domain = alicloud.ga.Domain("defaultDomain",
            domain="changes.com.cn",
            accelerator_id=default_accelerator.id)
        ```

        ## Import

        Ga Domain can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ga/domain:Domain example <accelerator_id>:<domain>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accelerator_id: The ID of the global acceleration instance.
        :param pulumi.Input[str] domain: The accelerated domain name to be added. only top-level domain names are supported, such as 'example.com'.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Ga Domain resource.

        For information about Ga Domain and how to use it, see [What is Domain](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createdomain).

        > **NOTE:** Available since v1.197.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_accelerator = alicloud.ga.Accelerator("defaultAccelerator",
            duration=1,
            auto_use_coupon=True,
            spec="1")
        default_domain = alicloud.ga.Domain("defaultDomain",
            domain="changes.com.cn",
            accelerator_id=default_accelerator.id)
        ```

        ## Import

        Ga Domain can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ga/domain:Domain example <accelerator_id>:<domain>
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
                 accelerator_id: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainArgs.__new__(DomainArgs)

            if accelerator_id is None and not opts.urn:
                raise TypeError("Missing required property 'accelerator_id'")
            __props__.__dict__["accelerator_id"] = accelerator_id
            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__.__dict__["domain"] = domain
            __props__.__dict__["status"] = None
        super(Domain, __self__).__init__(
            'alicloud:ga/domain:Domain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accelerator_id: Optional[pulumi.Input[str]] = None,
            domain: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'Domain':
        """
        Get an existing Domain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accelerator_id: The ID of the global acceleration instance.
        :param pulumi.Input[str] domain: The accelerated domain name to be added. only top-level domain names are supported, such as 'example.com'.
        :param pulumi.Input[str] status: The status of the resource
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainState.__new__(_DomainState)

        __props__.__dict__["accelerator_id"] = accelerator_id
        __props__.__dict__["domain"] = domain
        __props__.__dict__["status"] = status
        return Domain(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> pulumi.Output[str]:
        """
        The ID of the global acceleration instance.
        """
        return pulumi.get(self, "accelerator_id")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        The accelerated domain name to be added. only top-level domain names are supported, such as 'example.com'.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource
        """
        return pulumi.get(self, "status")

