# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SnapshotPolicyArgs', 'SnapshotPolicy']

@pulumi.input_type
class SnapshotPolicyArgs:
    def __init__(__self__, *,
                 repeat_weekdays: pulumi.Input[Sequence[pulumi.Input[str]]],
                 retention_days: pulumi.Input[int],
                 time_points: pulumi.Input[Sequence[pulumi.Input[str]]],
                 copied_snapshots_retention_days: Optional[pulumi.Input[int]] = None,
                 enable_cross_region_copy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 target_copy_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a SnapshotPolicy resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] repeat_weekdays: The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
               - A maximum of seven time points can be selected.
               - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
        :param pulumi.Input[int] retention_days: The snapshot retention time, and the unit of measurement is day. Optional values:
               - -1: The automatic snapshots are retained permanently.
               - [1, 65536]: The number of days retained.
               
               Default value: -1.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] time_points: The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
               - A maximum of 24 time points can be selected.
               - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
        :param pulumi.Input[str] name: The snapshot policy name.
        """
        SnapshotPolicyArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            repeat_weekdays=repeat_weekdays,
            retention_days=retention_days,
            time_points=time_points,
            copied_snapshots_retention_days=copied_snapshots_retention_days,
            enable_cross_region_copy=enable_cross_region_copy,
            name=name,
            tags=tags,
            target_copy_regions=target_copy_regions,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             repeat_weekdays: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             retention_days: Optional[pulumi.Input[int]] = None,
             time_points: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             copied_snapshots_retention_days: Optional[pulumi.Input[int]] = None,
             enable_cross_region_copy: Optional[pulumi.Input[bool]] = None,
             name: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             target_copy_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if repeat_weekdays is None and 'repeatWeekdays' in kwargs:
            repeat_weekdays = kwargs['repeatWeekdays']
        if repeat_weekdays is None:
            raise TypeError("Missing 'repeat_weekdays' argument")
        if retention_days is None and 'retentionDays' in kwargs:
            retention_days = kwargs['retentionDays']
        if retention_days is None:
            raise TypeError("Missing 'retention_days' argument")
        if time_points is None and 'timePoints' in kwargs:
            time_points = kwargs['timePoints']
        if time_points is None:
            raise TypeError("Missing 'time_points' argument")
        if copied_snapshots_retention_days is None and 'copiedSnapshotsRetentionDays' in kwargs:
            copied_snapshots_retention_days = kwargs['copiedSnapshotsRetentionDays']
        if enable_cross_region_copy is None and 'enableCrossRegionCopy' in kwargs:
            enable_cross_region_copy = kwargs['enableCrossRegionCopy']
        if target_copy_regions is None and 'targetCopyRegions' in kwargs:
            target_copy_regions = kwargs['targetCopyRegions']

        _setter("repeat_weekdays", repeat_weekdays)
        _setter("retention_days", retention_days)
        _setter("time_points", time_points)
        if copied_snapshots_retention_days is not None:
            _setter("copied_snapshots_retention_days", copied_snapshots_retention_days)
        if enable_cross_region_copy is not None:
            _setter("enable_cross_region_copy", enable_cross_region_copy)
        if name is not None:
            _setter("name", name)
        if tags is not None:
            _setter("tags", tags)
        if target_copy_regions is not None:
            _setter("target_copy_regions", target_copy_regions)

    @property
    @pulumi.getter(name="repeatWeekdays")
    def repeat_weekdays(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
        - A maximum of seven time points can be selected.
        - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
        """
        return pulumi.get(self, "repeat_weekdays")

    @repeat_weekdays.setter
    def repeat_weekdays(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "repeat_weekdays", value)

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> pulumi.Input[int]:
        """
        The snapshot retention time, and the unit of measurement is day. Optional values:
        - -1: The automatic snapshots are retained permanently.
        - [1, 65536]: The number of days retained.

        Default value: -1.
        """
        return pulumi.get(self, "retention_days")

    @retention_days.setter
    def retention_days(self, value: pulumi.Input[int]):
        pulumi.set(self, "retention_days", value)

    @property
    @pulumi.getter(name="timePoints")
    def time_points(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
        - A maximum of 24 time points can be selected.
        - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
        """
        return pulumi.get(self, "time_points")

    @time_points.setter
    def time_points(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "time_points", value)

    @property
    @pulumi.getter(name="copiedSnapshotsRetentionDays")
    def copied_snapshots_retention_days(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "copied_snapshots_retention_days")

    @copied_snapshots_retention_days.setter
    def copied_snapshots_retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "copied_snapshots_retention_days", value)

    @property
    @pulumi.getter(name="enableCrossRegionCopy")
    def enable_cross_region_copy(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enable_cross_region_copy")

    @enable_cross_region_copy.setter
    def enable_cross_region_copy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_cross_region_copy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The snapshot policy name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="targetCopyRegions")
    def target_copy_regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "target_copy_regions")

    @target_copy_regions.setter
    def target_copy_regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "target_copy_regions", value)


@pulumi.input_type
class _SnapshotPolicyState:
    def __init__(__self__, *,
                 copied_snapshots_retention_days: Optional[pulumi.Input[int]] = None,
                 enable_cross_region_copy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 repeat_weekdays: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 target_copy_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 time_points: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering SnapshotPolicy resources.
        :param pulumi.Input[str] name: The snapshot policy name.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] repeat_weekdays: The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
               - A maximum of seven time points can be selected.
               - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
        :param pulumi.Input[int] retention_days: The snapshot retention time, and the unit of measurement is day. Optional values:
               - -1: The automatic snapshots are retained permanently.
               - [1, 65536]: The number of days retained.
               
               Default value: -1.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] time_points: The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
               - A maximum of 24 time points can be selected.
               - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
        """
        _SnapshotPolicyState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            copied_snapshots_retention_days=copied_snapshots_retention_days,
            enable_cross_region_copy=enable_cross_region_copy,
            name=name,
            repeat_weekdays=repeat_weekdays,
            retention_days=retention_days,
            status=status,
            tags=tags,
            target_copy_regions=target_copy_regions,
            time_points=time_points,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             copied_snapshots_retention_days: Optional[pulumi.Input[int]] = None,
             enable_cross_region_copy: Optional[pulumi.Input[bool]] = None,
             name: Optional[pulumi.Input[str]] = None,
             repeat_weekdays: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             retention_days: Optional[pulumi.Input[int]] = None,
             status: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             target_copy_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             time_points: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if copied_snapshots_retention_days is None and 'copiedSnapshotsRetentionDays' in kwargs:
            copied_snapshots_retention_days = kwargs['copiedSnapshotsRetentionDays']
        if enable_cross_region_copy is None and 'enableCrossRegionCopy' in kwargs:
            enable_cross_region_copy = kwargs['enableCrossRegionCopy']
        if repeat_weekdays is None and 'repeatWeekdays' in kwargs:
            repeat_weekdays = kwargs['repeatWeekdays']
        if retention_days is None and 'retentionDays' in kwargs:
            retention_days = kwargs['retentionDays']
        if target_copy_regions is None and 'targetCopyRegions' in kwargs:
            target_copy_regions = kwargs['targetCopyRegions']
        if time_points is None and 'timePoints' in kwargs:
            time_points = kwargs['timePoints']

        if copied_snapshots_retention_days is not None:
            _setter("copied_snapshots_retention_days", copied_snapshots_retention_days)
        if enable_cross_region_copy is not None:
            _setter("enable_cross_region_copy", enable_cross_region_copy)
        if name is not None:
            _setter("name", name)
        if repeat_weekdays is not None:
            _setter("repeat_weekdays", repeat_weekdays)
        if retention_days is not None:
            _setter("retention_days", retention_days)
        if status is not None:
            _setter("status", status)
        if tags is not None:
            _setter("tags", tags)
        if target_copy_regions is not None:
            _setter("target_copy_regions", target_copy_regions)
        if time_points is not None:
            _setter("time_points", time_points)

    @property
    @pulumi.getter(name="copiedSnapshotsRetentionDays")
    def copied_snapshots_retention_days(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "copied_snapshots_retention_days")

    @copied_snapshots_retention_days.setter
    def copied_snapshots_retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "copied_snapshots_retention_days", value)

    @property
    @pulumi.getter(name="enableCrossRegionCopy")
    def enable_cross_region_copy(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enable_cross_region_copy")

    @enable_cross_region_copy.setter
    def enable_cross_region_copy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_cross_region_copy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The snapshot policy name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="repeatWeekdays")
    def repeat_weekdays(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
        - A maximum of seven time points can be selected.
        - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
        """
        return pulumi.get(self, "repeat_weekdays")

    @repeat_weekdays.setter
    def repeat_weekdays(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "repeat_weekdays", value)

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> Optional[pulumi.Input[int]]:
        """
        The snapshot retention time, and the unit of measurement is day. Optional values:
        - -1: The automatic snapshots are retained permanently.
        - [1, 65536]: The number of days retained.

        Default value: -1.
        """
        return pulumi.get(self, "retention_days")

    @retention_days.setter
    def retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention_days", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="targetCopyRegions")
    def target_copy_regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "target_copy_regions")

    @target_copy_regions.setter
    def target_copy_regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "target_copy_regions", value)

    @property
    @pulumi.getter(name="timePoints")
    def time_points(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
        - A maximum of 24 time points can be selected.
        - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
        """
        return pulumi.get(self, "time_points")

    @time_points.setter
    def time_points(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "time_points", value)


class SnapshotPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 copied_snapshots_retention_days: Optional[pulumi.Input[int]] = None,
                 enable_cross_region_copy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 repeat_weekdays: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 target_copy_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 time_points: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        > **DEPRECATED:** This resource has been renamed to ecs.AutoSnapshotPolicy from version 1.117.0.

        Provides an ECS snapshot policy resource.

        For information about snapshot policy and how to use it, see [Snapshot](https://www.alibabacloud.com/help/doc-detail/25460.html).

        > **NOTE:** Available in 1.42.0+.

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
               
               Default value: -1.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] time_points: The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
               - A maximum of 24 time points can be selected.
               - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SnapshotPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **DEPRECATED:** This resource has been renamed to ecs.AutoSnapshotPolicy from version 1.117.0.

        Provides an ECS snapshot policy resource.

        For information about snapshot policy and how to use it, see [Snapshot](https://www.alibabacloud.com/help/doc-detail/25460.html).

        > **NOTE:** Available in 1.42.0+.

        ## Import

        Snapshot can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/snapshotPolicy:SnapshotPolicy snapshot sp-abc1234567890000
        ```

        :param str resource_name: The name of the resource.
        :param SnapshotPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SnapshotPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            SnapshotPolicyArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 copied_snapshots_retention_days: Optional[pulumi.Input[int]] = None,
                 enable_cross_region_copy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 repeat_weekdays: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 retention_days: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 target_copy_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 time_points: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SnapshotPolicyArgs.__new__(SnapshotPolicyArgs)

            __props__.__dict__["copied_snapshots_retention_days"] = copied_snapshots_retention_days
            __props__.__dict__["enable_cross_region_copy"] = enable_cross_region_copy
            __props__.__dict__["name"] = name
            if repeat_weekdays is None and not opts.urn:
                raise TypeError("Missing required property 'repeat_weekdays'")
            __props__.__dict__["repeat_weekdays"] = repeat_weekdays
            if retention_days is None and not opts.urn:
                raise TypeError("Missing required property 'retention_days'")
            __props__.__dict__["retention_days"] = retention_days
            __props__.__dict__["tags"] = tags
            __props__.__dict__["target_copy_regions"] = target_copy_regions
            if time_points is None and not opts.urn:
                raise TypeError("Missing required property 'time_points'")
            __props__.__dict__["time_points"] = time_points
            __props__.__dict__["status"] = None
        super(SnapshotPolicy, __self__).__init__(
            'alicloud:ecs/snapshotPolicy:SnapshotPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            copied_snapshots_retention_days: Optional[pulumi.Input[int]] = None,
            enable_cross_region_copy: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            repeat_weekdays: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            retention_days: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            target_copy_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
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
               
               Default value: -1.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] time_points: The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
               - A maximum of 24 time points can be selected.
               - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SnapshotPolicyState.__new__(_SnapshotPolicyState)

        __props__.__dict__["copied_snapshots_retention_days"] = copied_snapshots_retention_days
        __props__.__dict__["enable_cross_region_copy"] = enable_cross_region_copy
        __props__.__dict__["name"] = name
        __props__.__dict__["repeat_weekdays"] = repeat_weekdays
        __props__.__dict__["retention_days"] = retention_days
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["target_copy_regions"] = target_copy_regions
        __props__.__dict__["time_points"] = time_points
        return SnapshotPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="copiedSnapshotsRetentionDays")
    def copied_snapshots_retention_days(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "copied_snapshots_retention_days")

    @property
    @pulumi.getter(name="enableCrossRegionCopy")
    def enable_cross_region_copy(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "enable_cross_region_copy")

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

        Default value: -1.
        """
        return pulumi.get(self, "retention_days")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="targetCopyRegions")
    def target_copy_regions(self) -> pulumi.Output[Optional[Sequence[str]]]:
        return pulumi.get(self, "target_copy_regions")

    @property
    @pulumi.getter(name="timePoints")
    def time_points(self) -> pulumi.Output[Sequence[str]]:
        """
        The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
        - A maximum of 24 time points can be selected.
        - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
        """
        return pulumi.get(self, "time_points")

