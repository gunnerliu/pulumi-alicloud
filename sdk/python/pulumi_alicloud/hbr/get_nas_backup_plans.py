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

__all__ = [
    'GetNasBackupPlansResult',
    'AwaitableGetNasBackupPlansResult',
    'get_nas_backup_plans',
    'get_nas_backup_plans_output',
]

@pulumi.output_type
class GetNasBackupPlansResult:
    """
    A collection of values returned by getNasBackupPlans.
    """
    def __init__(__self__, file_system_id=None, id=None, ids=None, name_regex=None, names=None, output_file=None, plans=None, vault_id=None):
        if file_system_id and not isinstance(file_system_id, str):
            raise TypeError("Expected argument 'file_system_id' to be a str")
        pulumi.set(__self__, "file_system_id", file_system_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if plans and not isinstance(plans, list):
            raise TypeError("Expected argument 'plans' to be a list")
        pulumi.set(__self__, "plans", plans)
        if vault_id and not isinstance(vault_id, str):
            raise TypeError("Expected argument 'vault_id' to be a str")
        pulumi.set(__self__, "vault_id", vault_id)

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> Optional[str]:
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
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def plans(self) -> Sequence['outputs.GetNasBackupPlansPlanResult']:
        return pulumi.get(self, "plans")

    @property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> Optional[str]:
        return pulumi.get(self, "vault_id")


class AwaitableGetNasBackupPlansResult(GetNasBackupPlansResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNasBackupPlansResult(
            file_system_id=self.file_system_id,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            plans=self.plans,
            vault_id=self.vault_id)


def get_nas_backup_plans(file_system_id: Optional[str] = None,
                         ids: Optional[Sequence[str]] = None,
                         name_regex: Optional[str] = None,
                         output_file: Optional[str] = None,
                         vault_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNasBackupPlansResult:
    """
    This data source provides the Hbr NasBackupPlans of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.132.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.hbr.get_nas_backup_plans(name_regex="^my-NasBackupPlan")
    pulumi.export("hbrNasBackupPlanId", ids.plans[0].id)
    ```


    :param str file_system_id: The File System ID of Nas.
    :param Sequence[str] ids: A list of NasBackupPlan IDs.
    :param str name_regex: A regex string to filter results by NasBackupPlan name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str vault_id: The ID of backup vault.
    """
    __args__ = dict()
    __args__['fileSystemId'] = file_system_id
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['vaultId'] = vault_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:hbr/getNasBackupPlans:getNasBackupPlans', __args__, opts=opts, typ=GetNasBackupPlansResult).value

    return AwaitableGetNasBackupPlansResult(
        file_system_id=pulumi.get(__ret__, 'file_system_id'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        plans=pulumi.get(__ret__, 'plans'),
        vault_id=pulumi.get(__ret__, 'vault_id'))


@_utilities.lift_output_func(get_nas_backup_plans)
def get_nas_backup_plans_output(file_system_id: Optional[pulumi.Input[Optional[str]]] = None,
                                ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                vault_id: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNasBackupPlansResult]:
    """
    This data source provides the Hbr NasBackupPlans of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.132.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.hbr.get_nas_backup_plans(name_regex="^my-NasBackupPlan")
    pulumi.export("hbrNasBackupPlanId", ids.plans[0].id)
    ```


    :param str file_system_id: The File System ID of Nas.
    :param Sequence[str] ids: A list of NasBackupPlan IDs.
    :param str name_regex: A regex string to filter results by NasBackupPlan name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str vault_id: The ID of backup vault.
    """
    ...
