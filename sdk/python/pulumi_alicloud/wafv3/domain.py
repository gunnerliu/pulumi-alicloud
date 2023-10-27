# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DomainArgs', 'Domain']

@pulumi.input_type
class DomainArgs:
    def __init__(__self__, *,
                 domain: pulumi.Input[str],
                 instance_id: pulumi.Input[str],
                 listen: pulumi.Input['DomainListenArgs'],
                 redirect: pulumi.Input['DomainRedirectArgs'],
                 access_type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Domain resource.
        :param pulumi.Input[str] domain: The name of the domain name to query.
        :param pulumi.Input[str] instance_id: WAF instance ID
        :param pulumi.Input['DomainListenArgs'] listen: Configure listening information. See `listen` below.
        :param pulumi.Input['DomainRedirectArgs'] redirect: Configure forwarding information. See `redirect` below.
        :param pulumi.Input[str] access_type: The access type of the WAF instance. Value: **share** (default): CNAME access.
        """
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "listen", listen)
        pulumi.set(__self__, "redirect", redirect)
        if access_type is not None:
            pulumi.set(__self__, "access_type", access_type)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Input[str]:
        """
        The name of the domain name to query.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        WAF instance ID
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def listen(self) -> pulumi.Input['DomainListenArgs']:
        """
        Configure listening information. See `listen` below.
        """
        return pulumi.get(self, "listen")

    @listen.setter
    def listen(self, value: pulumi.Input['DomainListenArgs']):
        pulumi.set(self, "listen", value)

    @property
    @pulumi.getter
    def redirect(self) -> pulumi.Input['DomainRedirectArgs']:
        """
        Configure forwarding information. See `redirect` below.
        """
        return pulumi.get(self, "redirect")

    @redirect.setter
    def redirect(self, value: pulumi.Input['DomainRedirectArgs']):
        pulumi.set(self, "redirect", value)

    @property
    @pulumi.getter(name="accessType")
    def access_type(self) -> Optional[pulumi.Input[str]]:
        """
        The access type of the WAF instance. Value: **share** (default): CNAME access.
        """
        return pulumi.get(self, "access_type")

    @access_type.setter
    def access_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_type", value)


@pulumi.input_type
class _DomainState:
    def __init__(__self__, *,
                 access_type: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 listen: Optional[pulumi.Input['DomainListenArgs']] = None,
                 redirect: Optional[pulumi.Input['DomainRedirectArgs']] = None,
                 resource_manager_resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Domain resources.
        :param pulumi.Input[str] access_type: The access type of the WAF instance. Value: **share** (default): CNAME access.
        :param pulumi.Input[str] domain: The name of the domain name to query.
        :param pulumi.Input[str] instance_id: WAF instance ID
        :param pulumi.Input['DomainListenArgs'] listen: Configure listening information. See `listen` below.
        :param pulumi.Input['DomainRedirectArgs'] redirect: Configure forwarding information. See `redirect` below.
        :param pulumi.Input[str] resource_manager_resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] status: The status of the resource.
        """
        if access_type is not None:
            pulumi.set(__self__, "access_type", access_type)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if listen is not None:
            pulumi.set(__self__, "listen", listen)
        if redirect is not None:
            pulumi.set(__self__, "redirect", redirect)
        if resource_manager_resource_group_id is not None:
            pulumi.set(__self__, "resource_manager_resource_group_id", resource_manager_resource_group_id)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="accessType")
    def access_type(self) -> Optional[pulumi.Input[str]]:
        """
        The access type of the WAF instance. Value: **share** (default): CNAME access.
        """
        return pulumi.get(self, "access_type")

    @access_type.setter
    def access_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_type", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the domain name to query.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        WAF instance ID
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def listen(self) -> Optional[pulumi.Input['DomainListenArgs']]:
        """
        Configure listening information. See `listen` below.
        """
        return pulumi.get(self, "listen")

    @listen.setter
    def listen(self, value: Optional[pulumi.Input['DomainListenArgs']]):
        pulumi.set(self, "listen", value)

    @property
    @pulumi.getter
    def redirect(self) -> Optional[pulumi.Input['DomainRedirectArgs']]:
        """
        Configure forwarding information. See `redirect` below.
        """
        return pulumi.get(self, "redirect")

    @redirect.setter
    def redirect(self, value: Optional[pulumi.Input['DomainRedirectArgs']]):
        pulumi.set(self, "redirect", value)

    @property
    @pulumi.getter(name="resourceManagerResourceGroupId")
    def resource_manager_resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_manager_resource_group_id")

    @resource_manager_resource_group_id.setter
    def resource_manager_resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_manager_resource_group_id", value)

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


class Domain(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_type: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 listen: Optional[pulumi.Input[pulumi.InputType['DomainListenArgs']]] = None,
                 redirect: Optional[pulumi.Input[pulumi.InputType['DomainRedirectArgs']]] = None,
                 __props__=None):
        """
        Provides a Wafv3 Domain resource.

        For information about Wafv3 Domain and how to use it, see [What is Domain](https://www.alibabacloud.com/help/en/web-application-firewall/latest/api-waf-openapi-2021-10-01-createdomain).

        > **NOTE:** Available since v1.200.0.

        ## Import

        Wafv3 Domain can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:wafv3/domain:Domain example <instance_id>:<domain>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_type: The access type of the WAF instance. Value: **share** (default): CNAME access.
        :param pulumi.Input[str] domain: The name of the domain name to query.
        :param pulumi.Input[str] instance_id: WAF instance ID
        :param pulumi.Input[pulumi.InputType['DomainListenArgs']] listen: Configure listening information. See `listen` below.
        :param pulumi.Input[pulumi.InputType['DomainRedirectArgs']] redirect: Configure forwarding information. See `redirect` below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Wafv3 Domain resource.

        For information about Wafv3 Domain and how to use it, see [What is Domain](https://www.alibabacloud.com/help/en/web-application-firewall/latest/api-waf-openapi-2021-10-01-createdomain).

        > **NOTE:** Available since v1.200.0.

        ## Import

        Wafv3 Domain can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:wafv3/domain:Domain example <instance_id>:<domain>
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
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_type: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 listen: Optional[pulumi.Input[pulumi.InputType['DomainListenArgs']]] = None,
                 redirect: Optional[pulumi.Input[pulumi.InputType['DomainRedirectArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainArgs.__new__(DomainArgs)

            __props__.__dict__["access_type"] = access_type
            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__.__dict__["domain"] = domain
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if listen is None and not opts.urn:
                raise TypeError("Missing required property 'listen'")
            __props__.__dict__["listen"] = listen
            if redirect is None and not opts.urn:
                raise TypeError("Missing required property 'redirect'")
            __props__.__dict__["redirect"] = redirect
            __props__.__dict__["resource_manager_resource_group_id"] = None
            __props__.__dict__["status"] = None
        super(Domain, __self__).__init__(
            'alicloud:wafv3/domain:Domain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_type: Optional[pulumi.Input[str]] = None,
            domain: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            listen: Optional[pulumi.Input[pulumi.InputType['DomainListenArgs']]] = None,
            redirect: Optional[pulumi.Input[pulumi.InputType['DomainRedirectArgs']]] = None,
            resource_manager_resource_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'Domain':
        """
        Get an existing Domain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_type: The access type of the WAF instance. Value: **share** (default): CNAME access.
        :param pulumi.Input[str] domain: The name of the domain name to query.
        :param pulumi.Input[str] instance_id: WAF instance ID
        :param pulumi.Input[pulumi.InputType['DomainListenArgs']] listen: Configure listening information. See `listen` below.
        :param pulumi.Input[pulumi.InputType['DomainRedirectArgs']] redirect: Configure forwarding information. See `redirect` below.
        :param pulumi.Input[str] resource_manager_resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] status: The status of the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainState.__new__(_DomainState)

        __props__.__dict__["access_type"] = access_type
        __props__.__dict__["domain"] = domain
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["listen"] = listen
        __props__.__dict__["redirect"] = redirect
        __props__.__dict__["resource_manager_resource_group_id"] = resource_manager_resource_group_id
        __props__.__dict__["status"] = status
        return Domain(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessType")
    def access_type(self) -> pulumi.Output[Optional[str]]:
        """
        The access type of the WAF instance. Value: **share** (default): CNAME access.
        """
        return pulumi.get(self, "access_type")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        The name of the domain name to query.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        WAF instance ID
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def listen(self) -> pulumi.Output['outputs.DomainListen']:
        """
        Configure listening information. See `listen` below.
        """
        return pulumi.get(self, "listen")

    @property
    @pulumi.getter
    def redirect(self) -> pulumi.Output['outputs.DomainRedirect']:
        """
        Configure forwarding information. See `redirect` below.
        """
        return pulumi.get(self, "redirect")

    @property
    @pulumi.getter(name="resourceManagerResourceGroupId")
    def resource_manager_resource_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_manager_resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

