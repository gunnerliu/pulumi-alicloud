# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['SnapshotPolicy']


class SnapshotPolicy(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 repeat_weekdays: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 time_points: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides an ECS snapshot policy resource.

        For information about snapshot policy and how to use it, see [Snapshot](https://www.alibabacloud.com/help/doc-detail/25460.html).

        > **NOTE:** Available in 1.42.0+.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        sp = alicloud.ecs.SnapshotPolicy("sp",
            repeat_weekdays=[
                "1",
                "2",
                "3",
            ],
            retention_days=-1,
            time_points=[
                "1",
                "22",
                "23",
            ])
        ```

        ## Import

        Snapshot can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/snapshotPolicy:SnapshotPolicy snapshot sp-abc1234567890000
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The snapshot policy name.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] repeat_weekdays: The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
               - A maximum of seven time points can be selected.
               - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
        :param pulumi.Input[int] retention_days: The snapshot retention time, and the unit of measurement is day. Optional values:
               - -1: The automatic snapshots are retained permanently.
               - [1, 65536]: The number of days retained.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] time_points: The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
               - A maximum of 24 time points can be selected.
               - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
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

            __props__['name'] = name
            if repeat_weekdays is None:
                raise TypeError("Missing required property 'repeat_weekdays'")
            __props__['repeat_weekdays'] = repeat_weekdays
            if retention_days is None:
                raise TypeError("Missing required property 'retention_days'")
            __props__['retention_days'] = retention_days
            if time_points is None:
                raise TypeError("Missing required property 'time_points'")
            __props__['time_points'] = time_points
        super(SnapshotPolicy, __self__).__init__(
            'alicloud:ecs/snapshotPolicy:SnapshotPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            repeat_weekdays: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            retention_days: Optional[pulumi.Input[int]] = None,
            time_points: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'SnapshotPolicy':
        """
        Get an existing SnapshotPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The snapshot policy name.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] repeat_weekdays: The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
               - A maximum of seven time points can be selected.
               - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
        :param pulumi.Input[int] retention_days: The snapshot retention time, and the unit of measurement is day. Optional values:
               - -1: The automatic snapshots are retained permanently.
               - [1, 65536]: The number of days retained.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] time_points: The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
               - A maximum of 24 time points can be selected.
               - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["name"] = name
        __props__["repeat_weekdays"] = repeat_weekdays
        __props__["retention_days"] = retention_days
        __props__["time_points"] = time_points
        return SnapshotPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The snapshot policy name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="repeatWeekdays")
    def repeat_weekdays(self) -> pulumi.Output[Sequence[str]]:
        """
        The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
        - A maximum of seven time points can be selected.
        - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
        """
        return pulumi.get(self, "repeat_weekdays")

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> pulumi.Output[int]:
        """
        The snapshot retention time, and the unit of measurement is day. Optional values:
        - -1: The automatic snapshots are retained permanently.
        - [1, 65536]: The number of days retained.
        """
        return pulumi.get(self, "retention_days")

    @property
    @pulumi.getter(name="timePoints")
    def time_points(self) -> pulumi.Output[Sequence[str]]:
        """
        The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
        - A maximum of 24 time points can be selected.
        - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
        """
        return pulumi.get(self, "time_points")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

