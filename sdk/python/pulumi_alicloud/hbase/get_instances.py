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
    'GetInstancesResult',
    'AwaitableGetInstancesResult',
    'get_instances',
    'get_instances_output',
]

@pulumi.output_type
class GetInstancesResult:
    """
    A collection of values returned by getInstances.
    """
    def __init__(__self__, availability_zone=None, id=None, ids=None, instances=None, name_regex=None, names=None, output_file=None, tags=None):
        if availability_zone and not isinstance(availability_zone, str):
            raise TypeError("Expected argument 'availability_zone' to be a str")
        pulumi.set(__self__, "availability_zone", availability_zone)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instances and not isinstance(instances, list):
            raise TypeError("Expected argument 'instances' to be a list")
        pulumi.set(__self__, "instances", instances)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> Optional[str]:
        return pulumi.get(self, "availability_zone")

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
        The ids list of HBase instances
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter
    def instances(self) -> Sequence['outputs.GetInstancesInstanceResult']:
        """
        A list of HBase instances. Its every element contains the following attributes:
        """
        return pulumi.get(self, "instances")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        The names list of HBase instances
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, Any]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")


class AwaitableGetInstancesResult(GetInstancesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstancesResult(
            availability_zone=self.availability_zone,
            id=self.id,
            ids=self.ids,
            instances=self.instances,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            tags=self.tags)


def get_instances(availability_zone: Optional[str] = None,
                  ids: Optional[Sequence[str]] = None,
                  name_regex: Optional[str] = None,
                  output_file: Optional[str] = None,
                  tags: Optional[Mapping[str, Any]] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstancesResult:
    """
    The `hbase_get_instances` data source provides a collection of HBase instances available in Alicloud account.
    Filters support regular expression for the instance name, ids or availability_zone.

    > **NOTE:**  Available in 1.67.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    hbase = alicloud.hbase.get_instances(availability_zone="cn-shenzhen-b",
        name_regex="tf_testAccHBase")
    ```


    :param str availability_zone: Instance availability zone.
    :param Sequence[str] ids: The ids list of HBase instances
    :param str name_regex: A regex string to apply to the instance name.
    :param str output_file: The name of file that can save the collection of instances after running `pulumi preview`.
    :param Mapping[str, Any] tags: A mapping of tags to assign to the resource.
    """
    __args__ = dict()
    __args__['availabilityZone'] = availability_zone
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:hbase/getInstances:getInstances', __args__, opts=opts, typ=GetInstancesResult).value

    return AwaitableGetInstancesResult(
        availability_zone=pulumi.get(__ret__, 'availability_zone'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instances=pulumi.get(__ret__, 'instances'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_instances)
def get_instances_output(availability_zone: Optional[pulumi.Input[Optional[str]]] = None,
                         ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                         name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                         output_file: Optional[pulumi.Input[Optional[str]]] = None,
                         tags: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInstancesResult]:
    """
    The `hbase_get_instances` data source provides a collection of HBase instances available in Alicloud account.
    Filters support regular expression for the instance name, ids or availability_zone.

    > **NOTE:**  Available in 1.67.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    hbase = alicloud.hbase.get_instances(availability_zone="cn-shenzhen-b",
        name_regex="tf_testAccHBase")
    ```


    :param str availability_zone: Instance availability zone.
    :param Sequence[str] ids: The ids list of HBase instances
    :param str name_regex: A regex string to apply to the instance name.
    :param str output_file: The name of file that can save the collection of instances after running `pulumi preview`.
    :param Mapping[str, Any] tags: A mapping of tags to assign to the resource.
    """
    ...
