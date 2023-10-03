# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BaselineStrategyArgs', 'BaselineStrategy']

@pulumi.input_type
class BaselineStrategyArgs:
    def __init__(__self__, *,
                 baseline_strategy_name: pulumi.Input[str],
                 custom_type: pulumi.Input[str],
                 cycle_days: pulumi.Input[int],
                 end_time: pulumi.Input[str],
                 risk_sub_type_name: pulumi.Input[str],
                 start_time: pulumi.Input[str],
                 target_type: pulumi.Input[str],
                 cycle_start_time: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a BaselineStrategy resource.
        :param pulumi.Input[str] baseline_strategy_name: Policy name.
        :param pulumi.Input[str] custom_type: The type of policy. Value:
               * **common**: standard policy
               * **custom**: custom policy
        :param pulumi.Input[int] cycle_days: The detection period of the policy.
        :param pulumi.Input[str] end_time: The baseline check policy execution end time.
        :param pulumi.Input[str] risk_sub_type_name: Detection item subtype.
        :param pulumi.Input[str] start_time: The baseline check policy start time.
        :param pulumi.Input[str] target_type: The method of adding assets that take effect from the policy. Value:
               * **groupId**: Added by asset group.
               * **uuid**: Add by single asset.
        :param pulumi.Input[int] cycle_start_time: The detection period of the policy. Value:
               * **0**: 0:00~06:00
               * **6**: 6:00~12:00
               * **12**: 12:00~18:00
               * **18**: 18:00~24:00
        """
        BaselineStrategyArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            baseline_strategy_name=baseline_strategy_name,
            custom_type=custom_type,
            cycle_days=cycle_days,
            end_time=end_time,
            risk_sub_type_name=risk_sub_type_name,
            start_time=start_time,
            target_type=target_type,
            cycle_start_time=cycle_start_time,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             baseline_strategy_name: pulumi.Input[str],
             custom_type: pulumi.Input[str],
             cycle_days: pulumi.Input[int],
             end_time: pulumi.Input[str],
             risk_sub_type_name: pulumi.Input[str],
             start_time: pulumi.Input[str],
             target_type: pulumi.Input[str],
             cycle_start_time: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("baseline_strategy_name", baseline_strategy_name)
        _setter("custom_type", custom_type)
        _setter("cycle_days", cycle_days)
        _setter("end_time", end_time)
        _setter("risk_sub_type_name", risk_sub_type_name)
        _setter("start_time", start_time)
        _setter("target_type", target_type)
        if cycle_start_time is not None:
            _setter("cycle_start_time", cycle_start_time)

    @property
    @pulumi.getter(name="baselineStrategyName")
    def baseline_strategy_name(self) -> pulumi.Input[str]:
        """
        Policy name.
        """
        return pulumi.get(self, "baseline_strategy_name")

    @baseline_strategy_name.setter
    def baseline_strategy_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "baseline_strategy_name", value)

    @property
    @pulumi.getter(name="customType")
    def custom_type(self) -> pulumi.Input[str]:
        """
        The type of policy. Value:
        * **common**: standard policy
        * **custom**: custom policy
        """
        return pulumi.get(self, "custom_type")

    @custom_type.setter
    def custom_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "custom_type", value)

    @property
    @pulumi.getter(name="cycleDays")
    def cycle_days(self) -> pulumi.Input[int]:
        """
        The detection period of the policy.
        """
        return pulumi.get(self, "cycle_days")

    @cycle_days.setter
    def cycle_days(self, value: pulumi.Input[int]):
        pulumi.set(self, "cycle_days", value)

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> pulumi.Input[str]:
        """
        The baseline check policy execution end time.
        """
        return pulumi.get(self, "end_time")

    @end_time.setter
    def end_time(self, value: pulumi.Input[str]):
        pulumi.set(self, "end_time", value)

    @property
    @pulumi.getter(name="riskSubTypeName")
    def risk_sub_type_name(self) -> pulumi.Input[str]:
        """
        Detection item subtype.
        """
        return pulumi.get(self, "risk_sub_type_name")

    @risk_sub_type_name.setter
    def risk_sub_type_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "risk_sub_type_name", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Input[str]:
        """
        The baseline check policy start time.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: pulumi.Input[str]):
        pulumi.set(self, "start_time", value)

    @property
    @pulumi.getter(name="targetType")
    def target_type(self) -> pulumi.Input[str]:
        """
        The method of adding assets that take effect from the policy. Value:
        * **groupId**: Added by asset group.
        * **uuid**: Add by single asset.
        """
        return pulumi.get(self, "target_type")

    @target_type.setter
    def target_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "target_type", value)

    @property
    @pulumi.getter(name="cycleStartTime")
    def cycle_start_time(self) -> Optional[pulumi.Input[int]]:
        """
        The detection period of the policy. Value:
        * **0**: 0:00~06:00
        * **6**: 6:00~12:00
        * **12**: 12:00~18:00
        * **18**: 18:00~24:00
        """
        return pulumi.get(self, "cycle_start_time")

    @cycle_start_time.setter
    def cycle_start_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cycle_start_time", value)


@pulumi.input_type
class _BaselineStrategyState:
    def __init__(__self__, *,
                 baseline_strategy_id: Optional[pulumi.Input[str]] = None,
                 baseline_strategy_name: Optional[pulumi.Input[str]] = None,
                 custom_type: Optional[pulumi.Input[str]] = None,
                 cycle_days: Optional[pulumi.Input[int]] = None,
                 cycle_start_time: Optional[pulumi.Input[int]] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 risk_sub_type_name: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 target_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BaselineStrategy resources.
        :param pulumi.Input[str] baseline_strategy_id: The ID of the baseline check policy.
        :param pulumi.Input[str] baseline_strategy_name: Policy name.
        :param pulumi.Input[str] custom_type: The type of policy. Value:
               * **common**: standard policy
               * **custom**: custom policy
        :param pulumi.Input[int] cycle_days: The detection period of the policy.
        :param pulumi.Input[int] cycle_start_time: The detection period of the policy. Value:
               * **0**: 0:00~06:00
               * **6**: 6:00~12:00
               * **12**: 12:00~18:00
               * **18**: 18:00~24:00
        :param pulumi.Input[str] end_time: The baseline check policy execution end time.
        :param pulumi.Input[str] risk_sub_type_name: Detection item subtype.
        :param pulumi.Input[str] start_time: The baseline check policy start time.
        :param pulumi.Input[str] target_type: The method of adding assets that take effect from the policy. Value:
               * **groupId**: Added by asset group.
               * **uuid**: Add by single asset.
        """
        _BaselineStrategyState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            baseline_strategy_id=baseline_strategy_id,
            baseline_strategy_name=baseline_strategy_name,
            custom_type=custom_type,
            cycle_days=cycle_days,
            cycle_start_time=cycle_start_time,
            end_time=end_time,
            risk_sub_type_name=risk_sub_type_name,
            start_time=start_time,
            target_type=target_type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             baseline_strategy_id: Optional[pulumi.Input[str]] = None,
             baseline_strategy_name: Optional[pulumi.Input[str]] = None,
             custom_type: Optional[pulumi.Input[str]] = None,
             cycle_days: Optional[pulumi.Input[int]] = None,
             cycle_start_time: Optional[pulumi.Input[int]] = None,
             end_time: Optional[pulumi.Input[str]] = None,
             risk_sub_type_name: Optional[pulumi.Input[str]] = None,
             start_time: Optional[pulumi.Input[str]] = None,
             target_type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if baseline_strategy_id is not None:
            _setter("baseline_strategy_id", baseline_strategy_id)
        if baseline_strategy_name is not None:
            _setter("baseline_strategy_name", baseline_strategy_name)
        if custom_type is not None:
            _setter("custom_type", custom_type)
        if cycle_days is not None:
            _setter("cycle_days", cycle_days)
        if cycle_start_time is not None:
            _setter("cycle_start_time", cycle_start_time)
        if end_time is not None:
            _setter("end_time", end_time)
        if risk_sub_type_name is not None:
            _setter("risk_sub_type_name", risk_sub_type_name)
        if start_time is not None:
            _setter("start_time", start_time)
        if target_type is not None:
            _setter("target_type", target_type)

    @property
    @pulumi.getter(name="baselineStrategyId")
    def baseline_strategy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the baseline check policy.
        """
        return pulumi.get(self, "baseline_strategy_id")

    @baseline_strategy_id.setter
    def baseline_strategy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "baseline_strategy_id", value)

    @property
    @pulumi.getter(name="baselineStrategyName")
    def baseline_strategy_name(self) -> Optional[pulumi.Input[str]]:
        """
        Policy name.
        """
        return pulumi.get(self, "baseline_strategy_name")

    @baseline_strategy_name.setter
    def baseline_strategy_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "baseline_strategy_name", value)

    @property
    @pulumi.getter(name="customType")
    def custom_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of policy. Value:
        * **common**: standard policy
        * **custom**: custom policy
        """
        return pulumi.get(self, "custom_type")

    @custom_type.setter
    def custom_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_type", value)

    @property
    @pulumi.getter(name="cycleDays")
    def cycle_days(self) -> Optional[pulumi.Input[int]]:
        """
        The detection period of the policy.
        """
        return pulumi.get(self, "cycle_days")

    @cycle_days.setter
    def cycle_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cycle_days", value)

    @property
    @pulumi.getter(name="cycleStartTime")
    def cycle_start_time(self) -> Optional[pulumi.Input[int]]:
        """
        The detection period of the policy. Value:
        * **0**: 0:00~06:00
        * **6**: 6:00~12:00
        * **12**: 12:00~18:00
        * **18**: 18:00~24:00
        """
        return pulumi.get(self, "cycle_start_time")

    @cycle_start_time.setter
    def cycle_start_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cycle_start_time", value)

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> Optional[pulumi.Input[str]]:
        """
        The baseline check policy execution end time.
        """
        return pulumi.get(self, "end_time")

    @end_time.setter
    def end_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_time", value)

    @property
    @pulumi.getter(name="riskSubTypeName")
    def risk_sub_type_name(self) -> Optional[pulumi.Input[str]]:
        """
        Detection item subtype.
        """
        return pulumi.get(self, "risk_sub_type_name")

    @risk_sub_type_name.setter
    def risk_sub_type_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "risk_sub_type_name", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[pulumi.Input[str]]:
        """
        The baseline check policy start time.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_time", value)

    @property
    @pulumi.getter(name="targetType")
    def target_type(self) -> Optional[pulumi.Input[str]]:
        """
        The method of adding assets that take effect from the policy. Value:
        * **groupId**: Added by asset group.
        * **uuid**: Add by single asset.
        """
        return pulumi.get(self, "target_type")

    @target_type.setter
    def target_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target_type", value)


class BaselineStrategy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 baseline_strategy_name: Optional[pulumi.Input[str]] = None,
                 custom_type: Optional[pulumi.Input[str]] = None,
                 cycle_days: Optional[pulumi.Input[int]] = None,
                 cycle_start_time: Optional[pulumi.Input[int]] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 risk_sub_type_name: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 target_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Threat Detection Baseline Strategy resource.

        For information about Threat Detection Baseline Strategy and how to use it, see [What is Baseline Strategy](https://www.alibabacloud.com/help/zh/security-center/latest/api-doc-sas-2018-12-03-api-doc-modifystrategy).

        > **NOTE:** Available in v1.195.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.threatdetection.BaselineStrategy("default",
            baseline_strategy_name="apispec",
            custom_type="custom",
            cycle_days=3,
            end_time="08:00:00",
            risk_sub_type_name="hc_exploit_redis",
            start_time="05:00:00",
            target_type="groupId")
        ```

        ## Import

        Threat Detection Baseline Strategy can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:threatdetection/baselineStrategy:BaselineStrategy example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] baseline_strategy_name: Policy name.
        :param pulumi.Input[str] custom_type: The type of policy. Value:
               * **common**: standard policy
               * **custom**: custom policy
        :param pulumi.Input[int] cycle_days: The detection period of the policy.
        :param pulumi.Input[int] cycle_start_time: The detection period of the policy. Value:
               * **0**: 0:00~06:00
               * **6**: 6:00~12:00
               * **12**: 12:00~18:00
               * **18**: 18:00~24:00
        :param pulumi.Input[str] end_time: The baseline check policy execution end time.
        :param pulumi.Input[str] risk_sub_type_name: Detection item subtype.
        :param pulumi.Input[str] start_time: The baseline check policy start time.
        :param pulumi.Input[str] target_type: The method of adding assets that take effect from the policy. Value:
               * **groupId**: Added by asset group.
               * **uuid**: Add by single asset.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BaselineStrategyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Threat Detection Baseline Strategy resource.

        For information about Threat Detection Baseline Strategy and how to use it, see [What is Baseline Strategy](https://www.alibabacloud.com/help/zh/security-center/latest/api-doc-sas-2018-12-03-api-doc-modifystrategy).

        > **NOTE:** Available in v1.195.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.threatdetection.BaselineStrategy("default",
            baseline_strategy_name="apispec",
            custom_type="custom",
            cycle_days=3,
            end_time="08:00:00",
            risk_sub_type_name="hc_exploit_redis",
            start_time="05:00:00",
            target_type="groupId")
        ```

        ## Import

        Threat Detection Baseline Strategy can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:threatdetection/baselineStrategy:BaselineStrategy example <id>
        ```

        :param str resource_name: The name of the resource.
        :param BaselineStrategyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BaselineStrategyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            BaselineStrategyArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 baseline_strategy_name: Optional[pulumi.Input[str]] = None,
                 custom_type: Optional[pulumi.Input[str]] = None,
                 cycle_days: Optional[pulumi.Input[int]] = None,
                 cycle_start_time: Optional[pulumi.Input[int]] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 risk_sub_type_name: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 target_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BaselineStrategyArgs.__new__(BaselineStrategyArgs)

            if baseline_strategy_name is None and not opts.urn:
                raise TypeError("Missing required property 'baseline_strategy_name'")
            __props__.__dict__["baseline_strategy_name"] = baseline_strategy_name
            if custom_type is None and not opts.urn:
                raise TypeError("Missing required property 'custom_type'")
            __props__.__dict__["custom_type"] = custom_type
            if cycle_days is None and not opts.urn:
                raise TypeError("Missing required property 'cycle_days'")
            __props__.__dict__["cycle_days"] = cycle_days
            __props__.__dict__["cycle_start_time"] = cycle_start_time
            if end_time is None and not opts.urn:
                raise TypeError("Missing required property 'end_time'")
            __props__.__dict__["end_time"] = end_time
            if risk_sub_type_name is None and not opts.urn:
                raise TypeError("Missing required property 'risk_sub_type_name'")
            __props__.__dict__["risk_sub_type_name"] = risk_sub_type_name
            if start_time is None and not opts.urn:
                raise TypeError("Missing required property 'start_time'")
            __props__.__dict__["start_time"] = start_time
            if target_type is None and not opts.urn:
                raise TypeError("Missing required property 'target_type'")
            __props__.__dict__["target_type"] = target_type
            __props__.__dict__["baseline_strategy_id"] = None
        super(BaselineStrategy, __self__).__init__(
            'alicloud:threatdetection/baselineStrategy:BaselineStrategy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            baseline_strategy_id: Optional[pulumi.Input[str]] = None,
            baseline_strategy_name: Optional[pulumi.Input[str]] = None,
            custom_type: Optional[pulumi.Input[str]] = None,
            cycle_days: Optional[pulumi.Input[int]] = None,
            cycle_start_time: Optional[pulumi.Input[int]] = None,
            end_time: Optional[pulumi.Input[str]] = None,
            risk_sub_type_name: Optional[pulumi.Input[str]] = None,
            start_time: Optional[pulumi.Input[str]] = None,
            target_type: Optional[pulumi.Input[str]] = None) -> 'BaselineStrategy':
        """
        Get an existing BaselineStrategy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] baseline_strategy_id: The ID of the baseline check policy.
        :param pulumi.Input[str] baseline_strategy_name: Policy name.
        :param pulumi.Input[str] custom_type: The type of policy. Value:
               * **common**: standard policy
               * **custom**: custom policy
        :param pulumi.Input[int] cycle_days: The detection period of the policy.
        :param pulumi.Input[int] cycle_start_time: The detection period of the policy. Value:
               * **0**: 0:00~06:00
               * **6**: 6:00~12:00
               * **12**: 12:00~18:00
               * **18**: 18:00~24:00
        :param pulumi.Input[str] end_time: The baseline check policy execution end time.
        :param pulumi.Input[str] risk_sub_type_name: Detection item subtype.
        :param pulumi.Input[str] start_time: The baseline check policy start time.
        :param pulumi.Input[str] target_type: The method of adding assets that take effect from the policy. Value:
               * **groupId**: Added by asset group.
               * **uuid**: Add by single asset.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BaselineStrategyState.__new__(_BaselineStrategyState)

        __props__.__dict__["baseline_strategy_id"] = baseline_strategy_id
        __props__.__dict__["baseline_strategy_name"] = baseline_strategy_name
        __props__.__dict__["custom_type"] = custom_type
        __props__.__dict__["cycle_days"] = cycle_days
        __props__.__dict__["cycle_start_time"] = cycle_start_time
        __props__.__dict__["end_time"] = end_time
        __props__.__dict__["risk_sub_type_name"] = risk_sub_type_name
        __props__.__dict__["start_time"] = start_time
        __props__.__dict__["target_type"] = target_type
        return BaselineStrategy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="baselineStrategyId")
    def baseline_strategy_id(self) -> pulumi.Output[str]:
        """
        The ID of the baseline check policy.
        """
        return pulumi.get(self, "baseline_strategy_id")

    @property
    @pulumi.getter(name="baselineStrategyName")
    def baseline_strategy_name(self) -> pulumi.Output[str]:
        """
        Policy name.
        """
        return pulumi.get(self, "baseline_strategy_name")

    @property
    @pulumi.getter(name="customType")
    def custom_type(self) -> pulumi.Output[str]:
        """
        The type of policy. Value:
        * **common**: standard policy
        * **custom**: custom policy
        """
        return pulumi.get(self, "custom_type")

    @property
    @pulumi.getter(name="cycleDays")
    def cycle_days(self) -> pulumi.Output[int]:
        """
        The detection period of the policy.
        """
        return pulumi.get(self, "cycle_days")

    @property
    @pulumi.getter(name="cycleStartTime")
    def cycle_start_time(self) -> pulumi.Output[int]:
        """
        The detection period of the policy. Value:
        * **0**: 0:00~06:00
        * **6**: 6:00~12:00
        * **12**: 12:00~18:00
        * **18**: 18:00~24:00
        """
        return pulumi.get(self, "cycle_start_time")

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> pulumi.Output[str]:
        """
        The baseline check policy execution end time.
        """
        return pulumi.get(self, "end_time")

    @property
    @pulumi.getter(name="riskSubTypeName")
    def risk_sub_type_name(self) -> pulumi.Output[str]:
        """
        Detection item subtype.
        """
        return pulumi.get(self, "risk_sub_type_name")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Output[str]:
        """
        The baseline check policy start time.
        """
        return pulumi.get(self, "start_time")

    @property
    @pulumi.getter(name="targetType")
    def target_type(self) -> pulumi.Output[str]:
        """
        The method of adding assets that take effect from the policy. Value:
        * **groupId**: Added by asset group.
        * **uuid**: Add by single asset.
        """
        return pulumi.get(self, "target_type")

