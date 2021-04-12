# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = ['HAVipArgs', 'HAVip']

@pulumi.input_type
class HAVipArgs:
    def __init__(__self__, *,
                 vswitch_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 havip_name: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a HAVip resource.
        :param pulumi.Input[str] vswitch_id: The vswitch_id of the HaVip, the field can't be changed.
        :param pulumi.Input[str] description: The description of the HaVip instance.
        :param pulumi.Input[str] havip_name: The name of the HaVip instance.
        :param pulumi.Input[str] ip_address: The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        """
        pulumi.set(__self__, "vswitch_id", vswitch_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if havip_name is not None:
            pulumi.set(__self__, "havip_name", havip_name)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Input[str]:
        """
        The vswitch_id of the HaVip, the field can't be changed.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the HaVip instance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="havipName")
    def havip_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the HaVip instance.
        """
        return pulumi.get(self, "havip_name")

    @havip_name.setter
    def havip_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "havip_name", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)


class HAVip(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 havip_name: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        The havip can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/hAVip:HAVip foo havip-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the HaVip instance.
        :param pulumi.Input[str] havip_name: The name of the HaVip instance.
        :param pulumi.Input[str] ip_address: The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        :param pulumi.Input[str] vswitch_id: The vswitch_id of the HaVip, the field can't be changed.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HAVipArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        The havip can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/hAVip:HAVip foo havip-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param HAVipArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HAVipArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 havip_name: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
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
            __props__['havip_name'] = havip_name
            __props__['ip_address'] = ip_address
            if vswitch_id is None and not opts.urn:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__['vswitch_id'] = vswitch_id
            __props__['status'] = None
        super(HAVip, __self__).__init__(
            'alicloud:vpc/hAVip:HAVip',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            havip_name: Optional[pulumi.Input[str]] = None,
            ip_address: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None) -> 'HAVip':
        """
        Get an existing HAVip resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the HaVip instance.
        :param pulumi.Input[str] havip_name: The name of the HaVip instance.
        :param pulumi.Input[str] ip_address: The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        :param pulumi.Input[str] status: (Available in v1.120.0+) The status of the HaVip instance.
        :param pulumi.Input[str] vswitch_id: The vswitch_id of the HaVip, the field can't be changed.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["description"] = description
        __props__["havip_name"] = havip_name
        __props__["ip_address"] = ip_address
        __props__["status"] = status
        __props__["vswitch_id"] = vswitch_id
        return HAVip(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the HaVip instance.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="havipName")
    def havip_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the HaVip instance.
        """
        return pulumi.get(self, "havip_name")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[str]:
        """
        The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        (Available in v1.120.0+) The status of the HaVip instance.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        """
        The vswitch_id of the HaVip, the field can't be changed.
        """
        return pulumi.get(self, "vswitch_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

