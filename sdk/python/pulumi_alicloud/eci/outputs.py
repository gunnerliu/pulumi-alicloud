# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'ImageCacheImageRegistryCredential',
    'OpenApiImageCacheImageRegistryCredential',
    'GetImageCachesCachResult',
    'GetImageCachesCachEventResult',
]

@pulumi.output_type
class ImageCacheImageRegistryCredential(dict):
    def __init__(__self__, *,
                 password: Optional[str] = None,
                 server: Optional[str] = None,
                 user_name: Optional[str] = None):
        """
        :param str password: The password of the Image Registry.
        :param str server: The address of Image Registry without `http://` or `https://`.
        :param str user_name: The user name of Image Registry.
        """
        if password is not None:
            pulumi.set(__self__, "password", password)
        if server is not None:
            pulumi.set(__self__, "server", server)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter
    def password(self) -> Optional[str]:
        """
        The password of the Image Registry.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def server(self) -> Optional[str]:
        """
        The address of Image Registry without `http://` or `https://`.
        """
        return pulumi.get(self, "server")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[str]:
        """
        The user name of Image Registry.
        """
        return pulumi.get(self, "user_name")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OpenApiImageCacheImageRegistryCredential(dict):
    def __init__(__self__, *,
                 password: Optional[str] = None,
                 server: Optional[str] = None,
                 user_name: Optional[str] = None):
        if password is not None:
            pulumi.set(__self__, "password", password)
        if server is not None:
            pulumi.set(__self__, "server", server)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter
    def password(self) -> Optional[str]:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def server(self) -> Optional[str]:
        return pulumi.get(self, "server")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[str]:
        return pulumi.get(self, "user_name")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class GetImageCachesCachResult(dict):
    def __init__(__self__, *,
                 container_group_id: str,
                 events: List['outputs.GetImageCachesCachEventResult'],
                 expire_date_time: str,
                 id: str,
                 image_cache_id: str,
                 image_cache_name: str,
                 images: List[str],
                 progress: str,
                 snapshot_id: str,
                 status: str):
        """
        :param str container_group_id: The id of container group.
        :param List['GetImageCachesCachEventArgs'] events: Image cache pulls image event information.
        :param str expire_date_time: The time of expired.
        :param str id: The ID of the ECI Image Cache.
        :param str image_cache_id: The id of the ECI Image Cache.
        :param str image_cache_name: The name of ECI Image Cache.
        :param List[str] images: The list of cached images.
        :param str progress: The progress of ECI Image Cache.
        :param str snapshot_id: The id of snapshot.
        :param str status: The status of ECI Image Cache.
        """
        pulumi.set(__self__, "container_group_id", container_group_id)
        pulumi.set(__self__, "events", events)
        pulumi.set(__self__, "expire_date_time", expire_date_time)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "image_cache_id", image_cache_id)
        pulumi.set(__self__, "image_cache_name", image_cache_name)
        pulumi.set(__self__, "images", images)
        pulumi.set(__self__, "progress", progress)
        pulumi.set(__self__, "snapshot_id", snapshot_id)
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="containerGroupId")
    def container_group_id(self) -> str:
        """
        The id of container group.
        """
        return pulumi.get(self, "container_group_id")

    @property
    @pulumi.getter
    def events(self) -> List['outputs.GetImageCachesCachEventResult']:
        """
        Image cache pulls image event information.
        """
        return pulumi.get(self, "events")

    @property
    @pulumi.getter(name="expireDateTime")
    def expire_date_time(self) -> str:
        """
        The time of expired.
        """
        return pulumi.get(self, "expire_date_time")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the ECI Image Cache.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="imageCacheId")
    def image_cache_id(self) -> str:
        """
        The id of the ECI Image Cache.
        """
        return pulumi.get(self, "image_cache_id")

    @property
    @pulumi.getter(name="imageCacheName")
    def image_cache_name(self) -> str:
        """
        The name of ECI Image Cache.
        """
        return pulumi.get(self, "image_cache_name")

    @property
    @pulumi.getter
    def images(self) -> List[str]:
        """
        The list of cached images.
        """
        return pulumi.get(self, "images")

    @property
    @pulumi.getter
    def progress(self) -> str:
        """
        The progress of ECI Image Cache.
        """
        return pulumi.get(self, "progress")

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> str:
        """
        The id of snapshot.
        """
        return pulumi.get(self, "snapshot_id")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of ECI Image Cache.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetImageCachesCachEventResult(dict):
    def __init__(__self__, *,
                 count: float,
                 first_timestamp: str,
                 last_timestamp: str,
                 message: str,
                 name: str,
                 type: str):
        """
        :param float count: Number of events.
        :param str first_timestamp: Start time.
        :param str last_timestamp: End time.
        :param str name: The name of event.
        :param str type: The type of event.
        """
        pulumi.set(__self__, "count", count)
        pulumi.set(__self__, "first_timestamp", first_timestamp)
        pulumi.set(__self__, "last_timestamp", last_timestamp)
        pulumi.set(__self__, "message", message)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def count(self) -> float:
        """
        Number of events.
        """
        return pulumi.get(self, "count")

    @property
    @pulumi.getter(name="firstTimestamp")
    def first_timestamp(self) -> str:
        """
        Start time.
        """
        return pulumi.get(self, "first_timestamp")

    @property
    @pulumi.getter(name="lastTimestamp")
    def last_timestamp(self) -> str:
        """
        End time.
        """
        return pulumi.get(self, "last_timestamp")

    @property
    @pulumi.getter
    def message(self) -> str:
        return pulumi.get(self, "message")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of event.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of event.
        """
        return pulumi.get(self, "type")

