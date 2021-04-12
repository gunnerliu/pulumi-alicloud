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
    'GetMountTargetsResult',
    'AwaitableGetMountTargetsResult',
    'get_mount_targets',
]

@pulumi.output_type
class GetMountTargetsResult:
    """
    A collection of values returned by getMountTargets.
    """
    def __init__(__self__, access_group_name=None, file_system_id=None, id=None, ids=None, mount_target_domain=None, network_type=None, output_file=None, status=None, targets=None, type=None, vpc_id=None, vswitch_id=None):
        if access_group_name and not isinstance(access_group_name, str):
            raise TypeError("Expected argument 'access_group_name' to be a str")
        pulumi.set(__self__, "access_group_name", access_group_name)
        if file_system_id and not isinstance(file_system_id, str):
            raise TypeError("Expected argument 'file_system_id' to be a str")
        pulumi.set(__self__, "file_system_id", file_system_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if mount_target_domain and not isinstance(mount_target_domain, str):
            raise TypeError("Expected argument 'mount_target_domain' to be a str")
        if mount_target_domain is not None:
            warnings.warn("""Field 'mount_target_domain' has been deprecated from provider version 1.53.0. New field 'ids' replaces it.""", DeprecationWarning)
            pulumi.log.warn("""mount_target_domain is deprecated: Field 'mount_target_domain' has been deprecated from provider version 1.53.0. New field 'ids' replaces it.""")

        pulumi.set(__self__, "mount_target_domain", mount_target_domain)
        if network_type and not isinstance(network_type, str):
            raise TypeError("Expected argument 'network_type' to be a str")
        pulumi.set(__self__, "network_type", network_type)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if targets and not isinstance(targets, list):
            raise TypeError("Expected argument 'targets' to be a list")
        pulumi.set(__self__, "targets", targets)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        if type is not None:
            warnings.warn("""Field 'type' has been deprecated from provider version 1.95.0. New field 'network_type' replaces it.""", DeprecationWarning)
            pulumi.log.warn("""type is deprecated: Field 'type' has been deprecated from provider version 1.95.0. New field 'network_type' replaces it.""")

        pulumi.set(__self__, "type", type)
        if vpc_id and not isinstance(vpc_id, str):
            raise TypeError("Expected argument 'vpc_id' to be a str")
        pulumi.set(__self__, "vpc_id", vpc_id)
        if vswitch_id and not isinstance(vswitch_id, str):
            raise TypeError("Expected argument 'vswitch_id' to be a str")
        pulumi.set(__self__, "vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> Optional[str]:
        """
        AccessGroup of The MountTarget.
        """
        return pulumi.get(self, "access_group_name")

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> str:
        return pulumi.get(self, "file_system_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        """
        A list of MountTargetDomain.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="mountTargetDomain")
    def mount_target_domain(self) -> Optional[str]:
        """
        MountTargetDomain of the MountTarget.
        * `type`- Field `type` has been deprecated from provider version 1.95.0. New field `network_type` replaces it.
        * `network_type`- (Available 1.95.0+) NetworkType of The MountTarget.
        * `status`- (Available 1.95.0+) The status of the mount target.
        """
        return pulumi.get(self, "mount_target_domain")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> Optional[str]:
        return pulumi.get(self, "network_type")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def targets(self) -> Sequence['outputs.GetMountTargetsTargetResult']:
        """
        A list of MountTargetDomains. Each element contains the following attributes:
        """
        return pulumi.get(self, "targets")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[str]:
        """
        VpcId of The MountTarget.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[str]:
        """
        VSwitchId of The MountTarget.
        """
        return pulumi.get(self, "vswitch_id")


class AwaitableGetMountTargetsResult(GetMountTargetsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMountTargetsResult(
            access_group_name=self.access_group_name,
            file_system_id=self.file_system_id,
            id=self.id,
            ids=self.ids,
            mount_target_domain=self.mount_target_domain,
            network_type=self.network_type,
            output_file=self.output_file,
            status=self.status,
            targets=self.targets,
            type=self.type,
            vpc_id=self.vpc_id,
            vswitch_id=self.vswitch_id)


def get_mount_targets(access_group_name: Optional[str] = None,
                      file_system_id: Optional[str] = None,
                      ids: Optional[Sequence[str]] = None,
                      mount_target_domain: Optional[str] = None,
                      network_type: Optional[str] = None,
                      output_file: Optional[str] = None,
                      status: Optional[str] = None,
                      type: Optional[str] = None,
                      vpc_id: Optional[str] = None,
                      vswitch_id: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMountTargetsResult:
    """
    This data source provides MountTargets available to the user.

    > **NOTE**: Available in 1.35.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.nas.get_mount_targets(file_system_id="1a2sc4d",
        access_group_name="tf-testAccNasConfig")
    pulumi.export("theFirstMountTargetDomain", example.targets[0].id)
    ```


    :param str access_group_name: Filter results by a specific AccessGroupName.
    :param str file_system_id: The ID of the FileSystem that owns the MountTarget.
    :param Sequence[str] ids: A list of MountTargetDomain.
    :param str mount_target_domain: Field `mount_target_domain` has been deprecated from provider version 1.53.0. New field `ids` replaces it.
    :param str network_type: Filter results by a specific NetworkType.
    :param str status: Filter results by the status of mount target. Valid values: `Active`, `Inactive` and `Pending`.
    :param str type: Field `type` has been deprecated from provider version 1.95.0. New field `network_type` replaces it.
    :param str vpc_id: Filter results by a specific VpcId.
    :param str vswitch_id: Filter results by a specific VSwitchId.
    """
    __args__ = dict()
    __args__['accessGroupName'] = access_group_name
    __args__['fileSystemId'] = file_system_id
    __args__['ids'] = ids
    __args__['mountTargetDomain'] = mount_target_domain
    __args__['networkType'] = network_type
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['type'] = type
    __args__['vpcId'] = vpc_id
    __args__['vswitchId'] = vswitch_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:nas/getMountTargets:getMountTargets', __args__, opts=opts, typ=GetMountTargetsResult).value

    return AwaitableGetMountTargetsResult(
        access_group_name=__ret__.access_group_name,
        file_system_id=__ret__.file_system_id,
        id=__ret__.id,
        ids=__ret__.ids,
        mount_target_domain=__ret__.mount_target_domain,
        network_type=__ret__.network_type,
        output_file=__ret__.output_file,
        status=__ret__.status,
        targets=__ret__.targets,
        type=__ret__.type,
        vpc_id=__ret__.vpc_id,
        vswitch_id=__ret__.vswitch_id)
