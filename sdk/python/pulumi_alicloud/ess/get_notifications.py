# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetNotificationsResult',
    'AwaitableGetNotificationsResult',
    'get_notifications',
]

@pulumi.output_type
class GetNotificationsResult:
    """
    A collection of values returned by getNotifications.
    """
    def __init__(__self__, id=None, ids=None, notifications=None, output_file=None, scaling_group_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if notifications and not isinstance(notifications, list):
            raise TypeError("Expected argument 'notifications' to be a list")
        pulumi.set(__self__, "notifications", notifications)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if scaling_group_id and not isinstance(scaling_group_id, str):
            raise TypeError("Expected argument 'scaling_group_id' to be a str")
        pulumi.set(__self__, "scaling_group_id", scaling_group_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Optional[Sequence[str]]:
        """
        A list of notification ids.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter
    def notifications(self) -> Sequence['outputs.GetNotificationsNotificationResult']:
        """
        A list of notifications. Each element contains the following attributes:
        """
        return pulumi.get(self, "notifications")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> str:
        """
        ID of the scaling group.
        """
        return pulumi.get(self, "scaling_group_id")


class AwaitableGetNotificationsResult(GetNotificationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNotificationsResult(
            id=self.id,
            ids=self.ids,
            notifications=self.notifications,
            output_file=self.output_file,
            scaling_group_id=self.scaling_group_id)


def get_notifications(ids: Optional[Sequence[str]] = None,
                      output_file: Optional[str] = None,
                      scaling_group_id: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNotificationsResult:
    """
    This data source provides available notification resources.

    > **NOTE:** Available in 1.72.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ds = alicloud.ess.get_notifications(scaling_group_id="scaling_group_id")
    pulumi.export("firstNotification", ds.notifications[0].id)
    ```


    :param Sequence[str] ids: A list of notification ids.
    :param str scaling_group_id: Scaling group id the notifications belong to.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['scalingGroupId'] = scaling_group_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:ess/getNotifications:getNotifications', __args__, opts=opts, typ=GetNotificationsResult).value

    return AwaitableGetNotificationsResult(
        id=__ret__.id,
        ids=__ret__.ids,
        notifications=__ret__.notifications,
        output_file=__ret__.output_file,
        scaling_group_id=__ret__.scaling_group_id)
