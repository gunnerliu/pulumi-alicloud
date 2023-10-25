# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['StorageCapacityUnitArgs', 'StorageCapacityUnit']

@pulumi.input_type
class StorageCapacityUnitArgs:
    def __init__(__self__, *,
                 capacity: pulumi.Input[int],
                 description: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 period_unit: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 storage_capacity_unit_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a StorageCapacityUnit resource.
        :param pulumi.Input[int] capacity: The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
        :param pulumi.Input[str] description: The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[int] period: The validity period of the Storage Capacity Unit. Default value: `1`.
               * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
               * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
        :param pulumi.Input[str] period_unit: The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
        :param pulumi.Input[str] start_time: The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
        :param pulumi.Input[str] storage_capacity_unit_name: The name of the Storage Capacity Unit.
        """
        StorageCapacityUnitArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            capacity=capacity,
            description=description,
            period=period,
            period_unit=period_unit,
            start_time=start_time,
            storage_capacity_unit_name=storage_capacity_unit_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             capacity: Optional[pulumi.Input[int]] = None,
             description: Optional[pulumi.Input[str]] = None,
             period: Optional[pulumi.Input[int]] = None,
             period_unit: Optional[pulumi.Input[str]] = None,
             start_time: Optional[pulumi.Input[str]] = None,
             storage_capacity_unit_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if capacity is None:
            raise TypeError("Missing 'capacity' argument")
        if period_unit is None and 'periodUnit' in kwargs:
            period_unit = kwargs['periodUnit']
        if start_time is None and 'startTime' in kwargs:
            start_time = kwargs['startTime']
        if storage_capacity_unit_name is None and 'storageCapacityUnitName' in kwargs:
            storage_capacity_unit_name = kwargs['storageCapacityUnitName']

        _setter("capacity", capacity)
        if description is not None:
            _setter("description", description)
        if period is not None:
            _setter("period", period)
        if period_unit is not None:
            _setter("period_unit", period_unit)
        if start_time is not None:
            _setter("start_time", start_time)
        if storage_capacity_unit_name is not None:
            _setter("storage_capacity_unit_name", storage_capacity_unit_name)

    @property
    @pulumi.getter
    def capacity(self) -> pulumi.Input[int]:
        """
        The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
        """
        return pulumi.get(self, "capacity")

    @capacity.setter
    def capacity(self, value: pulumi.Input[int]):
        pulumi.set(self, "capacity", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[int]]:
        """
        The validity period of the Storage Capacity Unit. Default value: `1`.
        * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
        * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="periodUnit")
    def period_unit(self) -> Optional[pulumi.Input[str]]:
        """
        The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
        """
        return pulumi.get(self, "period_unit")

    @period_unit.setter
    def period_unit(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "period_unit", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_time", value)

    @property
    @pulumi.getter(name="storageCapacityUnitName")
    def storage_capacity_unit_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Storage Capacity Unit.
        """
        return pulumi.get(self, "storage_capacity_unit_name")

    @storage_capacity_unit_name.setter
    def storage_capacity_unit_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_capacity_unit_name", value)


@pulumi.input_type
class _StorageCapacityUnitState:
    def __init__(__self__, *,
                 capacity: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 period_unit: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 storage_capacity_unit_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering StorageCapacityUnit resources.
        :param pulumi.Input[int] capacity: The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
        :param pulumi.Input[str] description: The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[int] period: The validity period of the Storage Capacity Unit. Default value: `1`.
               * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
               * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
        :param pulumi.Input[str] period_unit: The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
        :param pulumi.Input[str] start_time: The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
        :param pulumi.Input[str] status: The status of Storage Capacity Unit.
        :param pulumi.Input[str] storage_capacity_unit_name: The name of the Storage Capacity Unit.
        """
        _StorageCapacityUnitState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            capacity=capacity,
            description=description,
            period=period,
            period_unit=period_unit,
            start_time=start_time,
            status=status,
            storage_capacity_unit_name=storage_capacity_unit_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             capacity: Optional[pulumi.Input[int]] = None,
             description: Optional[pulumi.Input[str]] = None,
             period: Optional[pulumi.Input[int]] = None,
             period_unit: Optional[pulumi.Input[str]] = None,
             start_time: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             storage_capacity_unit_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if period_unit is None and 'periodUnit' in kwargs:
            period_unit = kwargs['periodUnit']
        if start_time is None and 'startTime' in kwargs:
            start_time = kwargs['startTime']
        if storage_capacity_unit_name is None and 'storageCapacityUnitName' in kwargs:
            storage_capacity_unit_name = kwargs['storageCapacityUnitName']

        if capacity is not None:
            _setter("capacity", capacity)
        if description is not None:
            _setter("description", description)
        if period is not None:
            _setter("period", period)
        if period_unit is not None:
            _setter("period_unit", period_unit)
        if start_time is not None:
            _setter("start_time", start_time)
        if status is not None:
            _setter("status", status)
        if storage_capacity_unit_name is not None:
            _setter("storage_capacity_unit_name", storage_capacity_unit_name)

    @property
    @pulumi.getter
    def capacity(self) -> Optional[pulumi.Input[int]]:
        """
        The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
        """
        return pulumi.get(self, "capacity")

    @capacity.setter
    def capacity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "capacity", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[int]]:
        """
        The validity period of the Storage Capacity Unit. Default value: `1`.
        * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
        * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="periodUnit")
    def period_unit(self) -> Optional[pulumi.Input[str]]:
        """
        The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
        """
        return pulumi.get(self, "period_unit")

    @period_unit.setter
    def period_unit(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "period_unit", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_time", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of Storage Capacity Unit.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="storageCapacityUnitName")
    def storage_capacity_unit_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Storage Capacity Unit.
        """
        return pulumi.get(self, "storage_capacity_unit_name")

    @storage_capacity_unit_name.setter
    def storage_capacity_unit_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_capacity_unit_name", value)


class StorageCapacityUnit(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 capacity: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 period_unit: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 storage_capacity_unit_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a ECS Storage Capacity Unit resource.

        For information about ECS Storage Capacity Unit and how to use it, see [What is Storage Capacity Unit](https://www.alibabacloud.com/help/en/doc-detail/161157.html).

        > **NOTE:** Available in v1.155.0+.

        ## Import

        ECS Storage Capacity Unit can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/storageCapacityUnit:StorageCapacityUnit example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] capacity: The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
        :param pulumi.Input[str] description: The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[int] period: The validity period of the Storage Capacity Unit. Default value: `1`.
               * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
               * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
        :param pulumi.Input[str] period_unit: The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
        :param pulumi.Input[str] start_time: The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
        :param pulumi.Input[str] storage_capacity_unit_name: The name of the Storage Capacity Unit.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StorageCapacityUnitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ECS Storage Capacity Unit resource.

        For information about ECS Storage Capacity Unit and how to use it, see [What is Storage Capacity Unit](https://www.alibabacloud.com/help/en/doc-detail/161157.html).

        > **NOTE:** Available in v1.155.0+.

        ## Import

        ECS Storage Capacity Unit can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/storageCapacityUnit:StorageCapacityUnit example <id>
        ```

        :param str resource_name: The name of the resource.
        :param StorageCapacityUnitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StorageCapacityUnitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            StorageCapacityUnitArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 capacity: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 period_unit: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 storage_capacity_unit_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StorageCapacityUnitArgs.__new__(StorageCapacityUnitArgs)

            if capacity is None and not opts.urn:
                raise TypeError("Missing required property 'capacity'")
            __props__.__dict__["capacity"] = capacity
            __props__.__dict__["description"] = description
            __props__.__dict__["period"] = period
            __props__.__dict__["period_unit"] = period_unit
            __props__.__dict__["start_time"] = start_time
            __props__.__dict__["storage_capacity_unit_name"] = storage_capacity_unit_name
            __props__.__dict__["status"] = None
        super(StorageCapacityUnit, __self__).__init__(
            'alicloud:ecs/storageCapacityUnit:StorageCapacityUnit',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            capacity: Optional[pulumi.Input[int]] = None,
            description: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[int]] = None,
            period_unit: Optional[pulumi.Input[str]] = None,
            start_time: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            storage_capacity_unit_name: Optional[pulumi.Input[str]] = None) -> 'StorageCapacityUnit':
        """
        Get an existing StorageCapacityUnit resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] capacity: The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
        :param pulumi.Input[str] description: The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[int] period: The validity period of the Storage Capacity Unit. Default value: `1`.
               * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
               * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
        :param pulumi.Input[str] period_unit: The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
        :param pulumi.Input[str] start_time: The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
        :param pulumi.Input[str] status: The status of Storage Capacity Unit.
        :param pulumi.Input[str] storage_capacity_unit_name: The name of the Storage Capacity Unit.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StorageCapacityUnitState.__new__(_StorageCapacityUnitState)

        __props__.__dict__["capacity"] = capacity
        __props__.__dict__["description"] = description
        __props__.__dict__["period"] = period
        __props__.__dict__["period_unit"] = period_unit
        __props__.__dict__["start_time"] = start_time
        __props__.__dict__["status"] = status
        __props__.__dict__["storage_capacity_unit_name"] = storage_capacity_unit_name
        return StorageCapacityUnit(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def capacity(self) -> pulumi.Output[int]:
        """
        The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
        """
        return pulumi.get(self, "capacity")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[int]:
        """
        The validity period of the Storage Capacity Unit. Default value: `1`.
        * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
        * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter(name="periodUnit")
    def period_unit(self) -> pulumi.Output[str]:
        """
        The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
        """
        return pulumi.get(self, "period_unit")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Output[str]:
        """
        The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
        """
        return pulumi.get(self, "start_time")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of Storage Capacity Unit.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="storageCapacityUnitName")
    def storage_capacity_unit_name(self) -> pulumi.Output[str]:
        """
        The name of the Storage Capacity Unit.
        """
        return pulumi.get(self, "storage_capacity_unit_name")

