# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['OpenApiImageCache']


class OpenApiImageCache(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 eip_instance_id: Optional[pulumi.Input[str]] = None,
                 image_cache_name: Optional[pulumi.Input[str]] = None,
                 image_cache_size: Optional[pulumi.Input[float]] = None,
                 image_registry_credentials: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OpenApiImageCacheImageRegistryCredentialArgs']]]]] = None,
                 images: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 retention_days: Optional[pulumi.Input[float]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a OpenApiImageCache resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
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

            __props__['eip_instance_id'] = eip_instance_id
            if image_cache_name is None:
                raise TypeError("Missing required property 'image_cache_name'")
            __props__['image_cache_name'] = image_cache_name
            __props__['image_cache_size'] = image_cache_size
            __props__['image_registry_credentials'] = image_registry_credentials
            if images is None:
                raise TypeError("Missing required property 'images'")
            __props__['images'] = images
            __props__['resource_group_id'] = resource_group_id
            __props__['retention_days'] = retention_days
            if security_group_id is None:
                raise TypeError("Missing required property 'security_group_id'")
            __props__['security_group_id'] = security_group_id
            if vswitch_id is None:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__['vswitch_id'] = vswitch_id
            __props__['zone_id'] = zone_id
            __props__['container_group_id'] = None
            __props__['status'] = None
        super(OpenApiImageCache, __self__).__init__(
            'alicloud:eci/openApiImageCache:OpenApiImageCache',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            container_group_id: Optional[pulumi.Input[str]] = None,
            eip_instance_id: Optional[pulumi.Input[str]] = None,
            image_cache_name: Optional[pulumi.Input[str]] = None,
            image_cache_size: Optional[pulumi.Input[float]] = None,
            image_registry_credentials: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OpenApiImageCacheImageRegistryCredentialArgs']]]]] = None,
            images: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            retention_days: Optional[pulumi.Input[float]] = None,
            security_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'OpenApiImageCache':
        """
        Get an existing OpenApiImageCache resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["container_group_id"] = container_group_id
        __props__["eip_instance_id"] = eip_instance_id
        __props__["image_cache_name"] = image_cache_name
        __props__["image_cache_size"] = image_cache_size
        __props__["image_registry_credentials"] = image_registry_credentials
        __props__["images"] = images
        __props__["resource_group_id"] = resource_group_id
        __props__["retention_days"] = retention_days
        __props__["security_group_id"] = security_group_id
        __props__["status"] = status
        __props__["vswitch_id"] = vswitch_id
        __props__["zone_id"] = zone_id
        return OpenApiImageCache(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="containerGroupId")
    def container_group_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "container_group_id")

    @property
    @pulumi.getter(name="eipInstanceId")
    def eip_instance_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "eip_instance_id")

    @property
    @pulumi.getter(name="imageCacheName")
    def image_cache_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "image_cache_name")

    @property
    @pulumi.getter(name="imageCacheSize")
    def image_cache_size(self) -> pulumi.Output[Optional[float]]:
        return pulumi.get(self, "image_cache_size")

    @property
    @pulumi.getter(name="imageRegistryCredentials")
    def image_registry_credentials(self) -> pulumi.Output[Optional[List['outputs.OpenApiImageCacheImageRegistryCredential']]]:
        return pulumi.get(self, "image_registry_credentials")

    @property
    @pulumi.getter
    def images(self) -> pulumi.Output[List[str]]:
        return pulumi.get(self, "images")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> pulumi.Output[Optional[float]]:
        return pulumi.get(self, "retention_days")

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "security_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "vswitch_id")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "zone_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
