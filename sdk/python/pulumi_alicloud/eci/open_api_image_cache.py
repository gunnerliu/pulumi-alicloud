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

__all__ = ['OpenApiImageCacheArgs', 'OpenApiImageCache']

@pulumi.input_type
class OpenApiImageCacheArgs:
    def __init__(__self__, *,
                 image_cache_name: pulumi.Input[str],
                 images: pulumi.Input[Sequence[pulumi.Input[str]]],
                 security_group_id: pulumi.Input[str],
                 vswitch_id: pulumi.Input[str],
                 eip_instance_id: Optional[pulumi.Input[str]] = None,
                 image_cache_size: Optional[pulumi.Input[int]] = None,
                 image_registry_credentials: Optional[pulumi.Input[Sequence[pulumi.Input['OpenApiImageCacheImageRegistryCredentialArgs']]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a OpenApiImageCache resource.
        """
        OpenApiImageCacheArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            image_cache_name=image_cache_name,
            images=images,
            security_group_id=security_group_id,
            vswitch_id=vswitch_id,
            eip_instance_id=eip_instance_id,
            image_cache_size=image_cache_size,
            image_registry_credentials=image_registry_credentials,
            resource_group_id=resource_group_id,
            retention_days=retention_days,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             image_cache_name: Optional[pulumi.Input[str]] = None,
             images: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             security_group_id: Optional[pulumi.Input[str]] = None,
             vswitch_id: Optional[pulumi.Input[str]] = None,
             eip_instance_id: Optional[pulumi.Input[str]] = None,
             image_cache_size: Optional[pulumi.Input[int]] = None,
             image_registry_credentials: Optional[pulumi.Input[Sequence[pulumi.Input['OpenApiImageCacheImageRegistryCredentialArgs']]]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             retention_days: Optional[pulumi.Input[int]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if image_cache_name is None and 'imageCacheName' in kwargs:
            image_cache_name = kwargs['imageCacheName']
        if image_cache_name is None:
            raise TypeError("Missing 'image_cache_name' argument")
        if images is None:
            raise TypeError("Missing 'images' argument")
        if security_group_id is None and 'securityGroupId' in kwargs:
            security_group_id = kwargs['securityGroupId']
        if security_group_id is None:
            raise TypeError("Missing 'security_group_id' argument")
        if vswitch_id is None and 'vswitchId' in kwargs:
            vswitch_id = kwargs['vswitchId']
        if vswitch_id is None:
            raise TypeError("Missing 'vswitch_id' argument")
        if eip_instance_id is None and 'eipInstanceId' in kwargs:
            eip_instance_id = kwargs['eipInstanceId']
        if image_cache_size is None and 'imageCacheSize' in kwargs:
            image_cache_size = kwargs['imageCacheSize']
        if image_registry_credentials is None and 'imageRegistryCredentials' in kwargs:
            image_registry_credentials = kwargs['imageRegistryCredentials']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if retention_days is None and 'retentionDays' in kwargs:
            retention_days = kwargs['retentionDays']
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']

        _setter("image_cache_name", image_cache_name)
        _setter("images", images)
        _setter("security_group_id", security_group_id)
        _setter("vswitch_id", vswitch_id)
        if eip_instance_id is not None:
            _setter("eip_instance_id", eip_instance_id)
        if image_cache_size is not None:
            _setter("image_cache_size", image_cache_size)
        if image_registry_credentials is not None:
            _setter("image_registry_credentials", image_registry_credentials)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if retention_days is not None:
            _setter("retention_days", retention_days)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter(name="imageCacheName")
    def image_cache_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "image_cache_name")

    @image_cache_name.setter
    def image_cache_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "image_cache_name", value)

    @property
    @pulumi.getter
    def images(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        return pulumi.get(self, "images")

    @images.setter
    def images(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "images", value)

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "security_group_id")

    @security_group_id.setter
    def security_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "security_group_id", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter(name="eipInstanceId")
    def eip_instance_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "eip_instance_id")

    @eip_instance_id.setter
    def eip_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "eip_instance_id", value)

    @property
    @pulumi.getter(name="imageCacheSize")
    def image_cache_size(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "image_cache_size")

    @image_cache_size.setter
    def image_cache_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "image_cache_size", value)

    @property
    @pulumi.getter(name="imageRegistryCredentials")
    def image_registry_credentials(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OpenApiImageCacheImageRegistryCredentialArgs']]]]:
        return pulumi.get(self, "image_registry_credentials")

    @image_registry_credentials.setter
    def image_registry_credentials(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OpenApiImageCacheImageRegistryCredentialArgs']]]]):
        pulumi.set(self, "image_registry_credentials", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "retention_days")

    @retention_days.setter
    def retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention_days", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _OpenApiImageCacheState:
    def __init__(__self__, *,
                 container_group_id: Optional[pulumi.Input[str]] = None,
                 eip_instance_id: Optional[pulumi.Input[str]] = None,
                 image_cache_name: Optional[pulumi.Input[str]] = None,
                 image_cache_size: Optional[pulumi.Input[int]] = None,
                 image_registry_credentials: Optional[pulumi.Input[Sequence[pulumi.Input['OpenApiImageCacheImageRegistryCredentialArgs']]]] = None,
                 images: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OpenApiImageCache resources.
        """
        _OpenApiImageCacheState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            container_group_id=container_group_id,
            eip_instance_id=eip_instance_id,
            image_cache_name=image_cache_name,
            image_cache_size=image_cache_size,
            image_registry_credentials=image_registry_credentials,
            images=images,
            resource_group_id=resource_group_id,
            retention_days=retention_days,
            security_group_id=security_group_id,
            status=status,
            vswitch_id=vswitch_id,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             container_group_id: Optional[pulumi.Input[str]] = None,
             eip_instance_id: Optional[pulumi.Input[str]] = None,
             image_cache_name: Optional[pulumi.Input[str]] = None,
             image_cache_size: Optional[pulumi.Input[int]] = None,
             image_registry_credentials: Optional[pulumi.Input[Sequence[pulumi.Input['OpenApiImageCacheImageRegistryCredentialArgs']]]] = None,
             images: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             retention_days: Optional[pulumi.Input[int]] = None,
             security_group_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             vswitch_id: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if container_group_id is None and 'containerGroupId' in kwargs:
            container_group_id = kwargs['containerGroupId']
        if eip_instance_id is None and 'eipInstanceId' in kwargs:
            eip_instance_id = kwargs['eipInstanceId']
        if image_cache_name is None and 'imageCacheName' in kwargs:
            image_cache_name = kwargs['imageCacheName']
        if image_cache_size is None and 'imageCacheSize' in kwargs:
            image_cache_size = kwargs['imageCacheSize']
        if image_registry_credentials is None and 'imageRegistryCredentials' in kwargs:
            image_registry_credentials = kwargs['imageRegistryCredentials']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if retention_days is None and 'retentionDays' in kwargs:
            retention_days = kwargs['retentionDays']
        if security_group_id is None and 'securityGroupId' in kwargs:
            security_group_id = kwargs['securityGroupId']
        if vswitch_id is None and 'vswitchId' in kwargs:
            vswitch_id = kwargs['vswitchId']
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']

        if container_group_id is not None:
            _setter("container_group_id", container_group_id)
        if eip_instance_id is not None:
            _setter("eip_instance_id", eip_instance_id)
        if image_cache_name is not None:
            _setter("image_cache_name", image_cache_name)
        if image_cache_size is not None:
            _setter("image_cache_size", image_cache_size)
        if image_registry_credentials is not None:
            _setter("image_registry_credentials", image_registry_credentials)
        if images is not None:
            _setter("images", images)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if retention_days is not None:
            _setter("retention_days", retention_days)
        if security_group_id is not None:
            _setter("security_group_id", security_group_id)
        if status is not None:
            _setter("status", status)
        if vswitch_id is not None:
            _setter("vswitch_id", vswitch_id)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter(name="containerGroupId")
    def container_group_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "container_group_id")

    @container_group_id.setter
    def container_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "container_group_id", value)

    @property
    @pulumi.getter(name="eipInstanceId")
    def eip_instance_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "eip_instance_id")

    @eip_instance_id.setter
    def eip_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "eip_instance_id", value)

    @property
    @pulumi.getter(name="imageCacheName")
    def image_cache_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "image_cache_name")

    @image_cache_name.setter
    def image_cache_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "image_cache_name", value)

    @property
    @pulumi.getter(name="imageCacheSize")
    def image_cache_size(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "image_cache_size")

    @image_cache_size.setter
    def image_cache_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "image_cache_size", value)

    @property
    @pulumi.getter(name="imageRegistryCredentials")
    def image_registry_credentials(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OpenApiImageCacheImageRegistryCredentialArgs']]]]:
        return pulumi.get(self, "image_registry_credentials")

    @image_registry_credentials.setter
    def image_registry_credentials(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OpenApiImageCacheImageRegistryCredentialArgs']]]]):
        pulumi.set(self, "image_registry_credentials", value)

    @property
    @pulumi.getter
    def images(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "images")

    @images.setter
    def images(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "images", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "retention_days")

    @retention_days.setter
    def retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention_days", value)

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "security_group_id")

    @security_group_id.setter
    def security_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class OpenApiImageCache(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 eip_instance_id: Optional[pulumi.Input[str]] = None,
                 image_cache_name: Optional[pulumi.Input[str]] = None,
                 image_cache_size: Optional[pulumi.Input[int]] = None,
                 image_registry_credentials: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OpenApiImageCacheImageRegistryCredentialArgs']]]]] = None,
                 images: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a OpenApiImageCache resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OpenApiImageCacheArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a OpenApiImageCache resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param OpenApiImageCacheArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OpenApiImageCacheArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            OpenApiImageCacheArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 eip_instance_id: Optional[pulumi.Input[str]] = None,
                 image_cache_name: Optional[pulumi.Input[str]] = None,
                 image_cache_size: Optional[pulumi.Input[int]] = None,
                 image_registry_credentials: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OpenApiImageCacheImageRegistryCredentialArgs']]]]] = None,
                 images: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OpenApiImageCacheArgs.__new__(OpenApiImageCacheArgs)

            __props__.__dict__["eip_instance_id"] = eip_instance_id
            if image_cache_name is None and not opts.urn:
                raise TypeError("Missing required property 'image_cache_name'")
            __props__.__dict__["image_cache_name"] = image_cache_name
            __props__.__dict__["image_cache_size"] = image_cache_size
            __props__.__dict__["image_registry_credentials"] = image_registry_credentials
            if images is None and not opts.urn:
                raise TypeError("Missing required property 'images'")
            __props__.__dict__["images"] = images
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["retention_days"] = retention_days
            if security_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'security_group_id'")
            __props__.__dict__["security_group_id"] = security_group_id
            if vswitch_id is None and not opts.urn:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__.__dict__["vswitch_id"] = vswitch_id
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["container_group_id"] = None
            __props__.__dict__["status"] = None
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
            image_cache_size: Optional[pulumi.Input[int]] = None,
            image_registry_credentials: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OpenApiImageCacheImageRegistryCredentialArgs']]]]] = None,
            images: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            retention_days: Optional[pulumi.Input[int]] = None,
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

        __props__ = _OpenApiImageCacheState.__new__(_OpenApiImageCacheState)

        __props__.__dict__["container_group_id"] = container_group_id
        __props__.__dict__["eip_instance_id"] = eip_instance_id
        __props__.__dict__["image_cache_name"] = image_cache_name
        __props__.__dict__["image_cache_size"] = image_cache_size
        __props__.__dict__["image_registry_credentials"] = image_registry_credentials
        __props__.__dict__["images"] = images
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["retention_days"] = retention_days
        __props__.__dict__["security_group_id"] = security_group_id
        __props__.__dict__["status"] = status
        __props__.__dict__["vswitch_id"] = vswitch_id
        __props__.__dict__["zone_id"] = zone_id
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
    def image_cache_size(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "image_cache_size")

    @property
    @pulumi.getter(name="imageRegistryCredentials")
    def image_registry_credentials(self) -> pulumi.Output[Optional[Sequence['outputs.OpenApiImageCacheImageRegistryCredential']]]:
        return pulumi.get(self, "image_registry_credentials")

    @property
    @pulumi.getter
    def images(self) -> pulumi.Output[Sequence[str]]:
        return pulumi.get(self, "images")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> pulumi.Output[Optional[int]]:
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

