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
    'GetHanaBackupPlansResult',
    'AwaitableGetHanaBackupPlansResult',
    'get_hana_backup_plans',
    'get_hana_backup_plans_output',
]

@pulumi.output_type
class GetHanaBackupPlansResult:
    """
    A collection of values returned by getHanaBackupPlans.
    """
    def __init__(__self__, cluster_id=None, database_name=None, id=None, ids=None, name_regex=None, names=None, output_file=None, page_number=None, page_size=None, plans=None, vault_id=None):
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if database_name and not isinstance(database_name, str):
            raise TypeError("Expected argument 'database_name' to be a str")
        pulumi.set(__self__, "database_name", database_name)
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
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)
        if plans and not isinstance(plans, list):
            raise TypeError("Expected argument 'plans' to be a list")
        pulumi.set(__self__, "plans", plans)
        if vault_id and not isinstance(vault_id, str):
            raise TypeError("Expected argument 'vault_id' to be a str")
        pulumi.set(__self__, "vault_id", vault_id)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> Optional[str]:
        return pulumi.get(self, "database_name")

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
    @pulumi.getter(name="pageNumber")
    def page_number(self) -> Optional[int]:
        return pulumi.get(self, "page_number")

    @property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[int]:
        return pulumi.get(self, "page_size")

    @property
    @pulumi.getter
    def plans(self) -> Sequence['outputs.GetHanaBackupPlansPlanResult']:
        return pulumi.get(self, "plans")

    @property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> Optional[str]:
        return pulumi.get(self, "vault_id")


class AwaitableGetHanaBackupPlansResult(GetHanaBackupPlansResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHanaBackupPlansResult(
            cluster_id=self.cluster_id,
            database_name=self.database_name,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            plans=self.plans,
            vault_id=self.vault_id)


def get_hana_backup_plans(cluster_id: Optional[str] = None,
                          database_name: Optional[str] = None,
                          ids: Optional[Sequence[str]] = None,
                          name_regex: Optional[str] = None,
                          output_file: Optional[str] = None,
                          page_number: Optional[int] = None,
                          page_size: Optional[int] = None,
                          vault_id: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHanaBackupPlansResult:
    """
    This data source provides the Hbr Hana Backup Plans of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.179.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.hbr.get_hana_backup_plans(cluster_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("hbrHanaBackupPlanId1", ids.plans[0].id)
    ```


    :param str cluster_id: The ID of the SAP HANA instance.
    :param str database_name: The name of the database.
    :param Sequence[str] ids: A list of Hana Backup Plan IDs.
    :param str name_regex: A regex string to filter results by Hana Backup Plan name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str vault_id: The ID of the backup vault.
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['databaseName'] = database_name
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['vaultId'] = vault_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:hbr/getHanaBackupPlans:getHanaBackupPlans', __args__, opts=opts, typ=GetHanaBackupPlansResult).value

    return AwaitableGetHanaBackupPlansResult(
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        database_name=pulumi.get(__ret__, 'database_name'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'),
        plans=pulumi.get(__ret__, 'plans'),
        vault_id=pulumi.get(__ret__, 'vault_id'))


@_utilities.lift_output_func(get_hana_backup_plans)
def get_hana_backup_plans_output(cluster_id: Optional[pulumi.Input[str]] = None,
                                 database_name: Optional[pulumi.Input[Optional[str]]] = None,
                                 ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                 name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                 output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                 page_number: Optional[pulumi.Input[Optional[int]]] = None,
                                 page_size: Optional[pulumi.Input[Optional[int]]] = None,
                                 vault_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetHanaBackupPlansResult]:
    """
    This data source provides the Hbr Hana Backup Plans of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.179.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.hbr.get_hana_backup_plans(cluster_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("hbrHanaBackupPlanId1", ids.plans[0].id)
    ```


    :param str cluster_id: The ID of the SAP HANA instance.
    :param str database_name: The name of the database.
    :param Sequence[str] ids: A list of Hana Backup Plan IDs.
    :param str name_regex: A regex string to filter results by Hana Backup Plan name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str vault_id: The ID of the backup vault.
    """
    ...
