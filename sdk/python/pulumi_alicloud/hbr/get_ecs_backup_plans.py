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
    'GetEcsBackupPlansResult',
    'AwaitableGetEcsBackupPlansResult',
    'get_ecs_backup_plans',
    'get_ecs_backup_plans_output',
]

@pulumi.output_type
class GetEcsBackupPlansResult:
    """
    A collection of values returned by getEcsBackupPlans.
    """
    def __init__(__self__, id=None, ids=None, instance_id=None, name_regex=None, names=None, output_file=None, plans=None, vault_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
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
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[str]:
        return pulumi.get(self, "instance_id")

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
    def plans(self) -> Sequence['outputs.GetEcsBackupPlansPlanResult']:
        return pulumi.get(self, "plans")

    @property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> Optional[str]:
        return pulumi.get(self, "vault_id")


class AwaitableGetEcsBackupPlansResult(GetEcsBackupPlansResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEcsBackupPlansResult(
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            plans=self.plans,
            vault_id=self.vault_id)


def get_ecs_backup_plans(ids: Optional[Sequence[str]] = None,
                         instance_id: Optional[str] = None,
                         name_regex: Optional[str] = None,
                         output_file: Optional[str] = None,
                         vault_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEcsBackupPlansResult:
    """
    This data source provides the Hbr EcsBackupPlans of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.132.0+.


    :param Sequence[str] ids: A list of EcsBackupPlan IDs.
    :param str instance_id: The ID of ECS instance.
    :param str name_regex: A regex string to filter results by EcsBackupPlan name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str vault_id: The ID of Backup vault.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['vaultId'] = vault_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:hbr/getEcsBackupPlans:getEcsBackupPlans', __args__, opts=opts, typ=GetEcsBackupPlansResult).value

    return AwaitableGetEcsBackupPlansResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        plans=pulumi.get(__ret__, 'plans'),
        vault_id=pulumi.get(__ret__, 'vault_id'))


@_utilities.lift_output_func(get_ecs_backup_plans)
def get_ecs_backup_plans_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                instance_id: Optional[pulumi.Input[Optional[str]]] = None,
                                name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                vault_id: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEcsBackupPlansResult]:
    """
    This data source provides the Hbr EcsBackupPlans of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.132.0+.


    :param Sequence[str] ids: A list of EcsBackupPlan IDs.
    :param str instance_id: The ID of ECS instance.
    :param str name_regex: A regex string to filter results by EcsBackupPlan name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str vault_id: The ID of Backup vault.
    """
    ...
