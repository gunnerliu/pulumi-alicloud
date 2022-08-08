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

__all__ = [
    'GetAggregateCompliancePacksResult',
    'AwaitableGetAggregateCompliancePacksResult',
    'get_aggregate_compliance_packs',
    'get_aggregate_compliance_packs_output',
]

@pulumi.output_type
class GetAggregateCompliancePacksResult:
    """
    A collection of values returned by getAggregateCompliancePacks.
    """
    def __init__(__self__, aggregator_id=None, enable_details=None, id=None, ids=None, name_regex=None, names=None, output_file=None, packs=None, status=None):
        if aggregator_id and not isinstance(aggregator_id, str):
            raise TypeError("Expected argument 'aggregator_id' to be a str")
        pulumi.set(__self__, "aggregator_id", aggregator_id)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
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
        if packs and not isinstance(packs, list):
            raise TypeError("Expected argument 'packs' to be a list")
        pulumi.set(__self__, "packs", packs)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="aggregatorId")
    def aggregator_id(self) -> str:
        return pulumi.get(self, "aggregator_id")

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

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
        """
        A list of Config Aggregate Compliance Pack names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def packs(self) -> Sequence['outputs.GetAggregateCompliancePacksPackResult']:
        """
        A list of Config Aggregate Compliance Packs. Each element contains the following attributes:
        """
        return pulumi.get(self, "packs")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")


class AwaitableGetAggregateCompliancePacksResult(GetAggregateCompliancePacksResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAggregateCompliancePacksResult(
            aggregator_id=self.aggregator_id,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            packs=self.packs,
            status=self.status)


def get_aggregate_compliance_packs(aggregator_id: Optional[str] = None,
                                   enable_details: Optional[bool] = None,
                                   ids: Optional[Sequence[str]] = None,
                                   name_regex: Optional[str] = None,
                                   output_file: Optional[str] = None,
                                   status: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAggregateCompliancePacksResult:
    """
    This data source provides the Config Aggregate Compliance Packs of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.124.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cfg.get_aggregate_compliance_packs(aggregator_id="ca-3a9b626622af001d****",
        ids=["cp-152a626622af00bc****"],
        name_regex="the_resource_name")
    pulumi.export("firstConfigAggregateCompliancePackId", example.packs[0].id)
    ```


    :param str aggregator_id: The ID of aggregator.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Aggregate Compliance Pack IDs.
    :param str name_regex: A regex string to filter results by Aggregate Compliance Pack name.
    :param str status: The status of the resource. Valid values `ACTIVE`, `CREATING`, `INACTIVE`.
    """
    __args__ = dict()
    __args__['aggregatorId'] = aggregator_id
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cfg/getAggregateCompliancePacks:getAggregateCompliancePacks', __args__, opts=opts, typ=GetAggregateCompliancePacksResult).value

    return AwaitableGetAggregateCompliancePacksResult(
        aggregator_id=__ret__.aggregator_id,
        enable_details=__ret__.enable_details,
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        packs=__ret__.packs,
        status=__ret__.status)


@_utilities.lift_output_func(get_aggregate_compliance_packs)
def get_aggregate_compliance_packs_output(aggregator_id: Optional[pulumi.Input[str]] = None,
                                          enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                                          ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                          name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                          output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                          status: Optional[pulumi.Input[Optional[str]]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAggregateCompliancePacksResult]:
    """
    This data source provides the Config Aggregate Compliance Packs of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.124.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cfg.get_aggregate_compliance_packs(aggregator_id="ca-3a9b626622af001d****",
        ids=["cp-152a626622af00bc****"],
        name_regex="the_resource_name")
    pulumi.export("firstConfigAggregateCompliancePackId", example.packs[0].id)
    ```


    :param str aggregator_id: The ID of aggregator.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Aggregate Compliance Pack IDs.
    :param str name_regex: A regex string to filter results by Aggregate Compliance Pack name.
    :param str status: The status of the resource. Valid values `ACTIVE`, `CREATING`, `INACTIVE`.
    """
    ...
