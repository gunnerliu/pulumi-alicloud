# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'DbInstancePlanPlanConfigArgs',
    'DbInstancePlanPlanConfigPauseArgs',
    'DbInstancePlanPlanConfigResumeArgs',
    'DbInstancePlanPlanConfigScaleInArgs',
    'DbInstancePlanPlanConfigScaleOutArgs',
    'InstanceIpWhitelistArgs',
]

@pulumi.input_type
class DbInstancePlanPlanConfigArgs:
    def __init__(__self__, *,
                 pause: Optional[pulumi.Input['DbInstancePlanPlanConfigPauseArgs']] = None,
                 resume: Optional[pulumi.Input['DbInstancePlanPlanConfigResumeArgs']] = None,
                 scale_in: Optional[pulumi.Input['DbInstancePlanPlanConfigScaleInArgs']] = None,
                 scale_out: Optional[pulumi.Input['DbInstancePlanPlanConfigScaleOutArgs']] = None):
        """
        :param pulumi.Input['DbInstancePlanPlanConfigPauseArgs'] pause: Pause instance plan config. See `pause` below.
        :param pulumi.Input['DbInstancePlanPlanConfigResumeArgs'] resume: Resume instance plan config. See `resume` below.
        :param pulumi.Input['DbInstancePlanPlanConfigScaleInArgs'] scale_in: Scale In instance plan config. See `scale_in` below.
        :param pulumi.Input['DbInstancePlanPlanConfigScaleOutArgs'] scale_out: Scale out instance plan config. See `scale_out` below.
        """
        DbInstancePlanPlanConfigArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            pause=pause,
            resume=resume,
            scale_in=scale_in,
            scale_out=scale_out,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             pause: Optional[pulumi.Input['DbInstancePlanPlanConfigPauseArgs']] = None,
             resume: Optional[pulumi.Input['DbInstancePlanPlanConfigResumeArgs']] = None,
             scale_in: Optional[pulumi.Input['DbInstancePlanPlanConfigScaleInArgs']] = None,
             scale_out: Optional[pulumi.Input['DbInstancePlanPlanConfigScaleOutArgs']] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if pause is not None:
            _setter("pause", pause)
        if resume is not None:
            _setter("resume", resume)
        if scale_in is not None:
            _setter("scale_in", scale_in)
        if scale_out is not None:
            _setter("scale_out", scale_out)

    @property
    @pulumi.getter
    def pause(self) -> Optional[pulumi.Input['DbInstancePlanPlanConfigPauseArgs']]:
        """
        Pause instance plan config. See `pause` below.
        """
        return pulumi.get(self, "pause")

    @pause.setter
    def pause(self, value: Optional[pulumi.Input['DbInstancePlanPlanConfigPauseArgs']]):
        pulumi.set(self, "pause", value)

    @property
    @pulumi.getter
    def resume(self) -> Optional[pulumi.Input['DbInstancePlanPlanConfigResumeArgs']]:
        """
        Resume instance plan config. See `resume` below.
        """
        return pulumi.get(self, "resume")

    @resume.setter
    def resume(self, value: Optional[pulumi.Input['DbInstancePlanPlanConfigResumeArgs']]):
        pulumi.set(self, "resume", value)

    @property
    @pulumi.getter(name="scaleIn")
    def scale_in(self) -> Optional[pulumi.Input['DbInstancePlanPlanConfigScaleInArgs']]:
        """
        Scale In instance plan config. See `scale_in` below.
        """
        return pulumi.get(self, "scale_in")

    @scale_in.setter
    def scale_in(self, value: Optional[pulumi.Input['DbInstancePlanPlanConfigScaleInArgs']]):
        pulumi.set(self, "scale_in", value)

    @property
    @pulumi.getter(name="scaleOut")
    def scale_out(self) -> Optional[pulumi.Input['DbInstancePlanPlanConfigScaleOutArgs']]:
        """
        Scale out instance plan config. See `scale_out` below.
        """
        return pulumi.get(self, "scale_out")

    @scale_out.setter
    def scale_out(self, value: Optional[pulumi.Input['DbInstancePlanPlanConfigScaleOutArgs']]):
        pulumi.set(self, "scale_out", value)


@pulumi.input_type
class DbInstancePlanPlanConfigPauseArgs:
    def __init__(__self__, *,
                 execute_time: Optional[pulumi.Input[str]] = None,
                 plan_cron_time: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] execute_time: The executed time of the Plan.
        :param pulumi.Input[str] plan_cron_time: The Cron Time of the plan.
        """
        DbInstancePlanPlanConfigPauseArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            execute_time=execute_time,
            plan_cron_time=plan_cron_time,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             execute_time: Optional[pulumi.Input[str]] = None,
             plan_cron_time: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if execute_time is not None:
            _setter("execute_time", execute_time)
        if plan_cron_time is not None:
            _setter("plan_cron_time", plan_cron_time)

    @property
    @pulumi.getter(name="executeTime")
    def execute_time(self) -> Optional[pulumi.Input[str]]:
        """
        The executed time of the Plan.
        """
        return pulumi.get(self, "execute_time")

    @execute_time.setter
    def execute_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "execute_time", value)

    @property
    @pulumi.getter(name="planCronTime")
    def plan_cron_time(self) -> Optional[pulumi.Input[str]]:
        """
        The Cron Time of the plan.
        """
        return pulumi.get(self, "plan_cron_time")

    @plan_cron_time.setter
    def plan_cron_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan_cron_time", value)


@pulumi.input_type
class DbInstancePlanPlanConfigResumeArgs:
    def __init__(__self__, *,
                 execute_time: Optional[pulumi.Input[str]] = None,
                 plan_cron_time: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] execute_time: The executed time of the Plan.
        :param pulumi.Input[str] plan_cron_time: The Cron Time of the plan.
        """
        DbInstancePlanPlanConfigResumeArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            execute_time=execute_time,
            plan_cron_time=plan_cron_time,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             execute_time: Optional[pulumi.Input[str]] = None,
             plan_cron_time: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if execute_time is not None:
            _setter("execute_time", execute_time)
        if plan_cron_time is not None:
            _setter("plan_cron_time", plan_cron_time)

    @property
    @pulumi.getter(name="executeTime")
    def execute_time(self) -> Optional[pulumi.Input[str]]:
        """
        The executed time of the Plan.
        """
        return pulumi.get(self, "execute_time")

    @execute_time.setter
    def execute_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "execute_time", value)

    @property
    @pulumi.getter(name="planCronTime")
    def plan_cron_time(self) -> Optional[pulumi.Input[str]]:
        """
        The Cron Time of the plan.
        """
        return pulumi.get(self, "plan_cron_time")

    @plan_cron_time.setter
    def plan_cron_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan_cron_time", value)


@pulumi.input_type
class DbInstancePlanPlanConfigScaleInArgs:
    def __init__(__self__, *,
                 execute_time: Optional[pulumi.Input[str]] = None,
                 plan_cron_time: Optional[pulumi.Input[str]] = None,
                 segment_node_num: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] execute_time: The executed time of the Plan.
        :param pulumi.Input[str] plan_cron_time: The Cron Time of the plan.
        :param pulumi.Input[str] segment_node_num: The segment Node Num of the Plan.
        """
        DbInstancePlanPlanConfigScaleInArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            execute_time=execute_time,
            plan_cron_time=plan_cron_time,
            segment_node_num=segment_node_num,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             execute_time: Optional[pulumi.Input[str]] = None,
             plan_cron_time: Optional[pulumi.Input[str]] = None,
             segment_node_num: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if execute_time is not None:
            _setter("execute_time", execute_time)
        if plan_cron_time is not None:
            _setter("plan_cron_time", plan_cron_time)
        if segment_node_num is not None:
            _setter("segment_node_num", segment_node_num)

    @property
    @pulumi.getter(name="executeTime")
    def execute_time(self) -> Optional[pulumi.Input[str]]:
        """
        The executed time of the Plan.
        """
        return pulumi.get(self, "execute_time")

    @execute_time.setter
    def execute_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "execute_time", value)

    @property
    @pulumi.getter(name="planCronTime")
    def plan_cron_time(self) -> Optional[pulumi.Input[str]]:
        """
        The Cron Time of the plan.
        """
        return pulumi.get(self, "plan_cron_time")

    @plan_cron_time.setter
    def plan_cron_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan_cron_time", value)

    @property
    @pulumi.getter(name="segmentNodeNum")
    def segment_node_num(self) -> Optional[pulumi.Input[str]]:
        """
        The segment Node Num of the Plan.
        """
        return pulumi.get(self, "segment_node_num")

    @segment_node_num.setter
    def segment_node_num(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "segment_node_num", value)


@pulumi.input_type
class DbInstancePlanPlanConfigScaleOutArgs:
    def __init__(__self__, *,
                 execute_time: Optional[pulumi.Input[str]] = None,
                 plan_cron_time: Optional[pulumi.Input[str]] = None,
                 segment_node_num: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] execute_time: The executed time of the Plan.
        :param pulumi.Input[str] plan_cron_time: The Cron Time of the plan.
        :param pulumi.Input[str] segment_node_num: The segment Node Num of the Plan.
        """
        DbInstancePlanPlanConfigScaleOutArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            execute_time=execute_time,
            plan_cron_time=plan_cron_time,
            segment_node_num=segment_node_num,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             execute_time: Optional[pulumi.Input[str]] = None,
             plan_cron_time: Optional[pulumi.Input[str]] = None,
             segment_node_num: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if execute_time is not None:
            _setter("execute_time", execute_time)
        if plan_cron_time is not None:
            _setter("plan_cron_time", plan_cron_time)
        if segment_node_num is not None:
            _setter("segment_node_num", segment_node_num)

    @property
    @pulumi.getter(name="executeTime")
    def execute_time(self) -> Optional[pulumi.Input[str]]:
        """
        The executed time of the Plan.
        """
        return pulumi.get(self, "execute_time")

    @execute_time.setter
    def execute_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "execute_time", value)

    @property
    @pulumi.getter(name="planCronTime")
    def plan_cron_time(self) -> Optional[pulumi.Input[str]]:
        """
        The Cron Time of the plan.
        """
        return pulumi.get(self, "plan_cron_time")

    @plan_cron_time.setter
    def plan_cron_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan_cron_time", value)

    @property
    @pulumi.getter(name="segmentNodeNum")
    def segment_node_num(self) -> Optional[pulumi.Input[str]]:
        """
        The segment Node Num of the Plan.
        """
        return pulumi.get(self, "segment_node_num")

    @segment_node_num.setter
    def segment_node_num(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "segment_node_num", value)


@pulumi.input_type
class InstanceIpWhitelistArgs:
    def __init__(__self__, *,
                 ip_group_attribute: Optional[pulumi.Input[str]] = None,
                 ip_group_name: Optional[pulumi.Input[str]] = None,
                 security_ip_list: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] ip_group_attribute: The value of this parameter is empty by default. The attribute of the whitelist group. 
               If the value contains `hidden`, this white list item will not output.
        :param pulumi.Input[str] ip_group_name: IP whitelist group name.
        :param pulumi.Input[str] security_ip_list: List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]). System default to `["127.0.0.1"]`.
        """
        InstanceIpWhitelistArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            ip_group_attribute=ip_group_attribute,
            ip_group_name=ip_group_name,
            security_ip_list=security_ip_list,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             ip_group_attribute: Optional[pulumi.Input[str]] = None,
             ip_group_name: Optional[pulumi.Input[str]] = None,
             security_ip_list: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if ip_group_attribute is not None:
            _setter("ip_group_attribute", ip_group_attribute)
        if ip_group_name is not None:
            _setter("ip_group_name", ip_group_name)
        if security_ip_list is not None:
            _setter("security_ip_list", security_ip_list)

    @property
    @pulumi.getter(name="ipGroupAttribute")
    def ip_group_attribute(self) -> Optional[pulumi.Input[str]]:
        """
        The value of this parameter is empty by default. The attribute of the whitelist group. 
        If the value contains `hidden`, this white list item will not output.
        """
        return pulumi.get(self, "ip_group_attribute")

    @ip_group_attribute.setter
    def ip_group_attribute(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_group_attribute", value)

    @property
    @pulumi.getter(name="ipGroupName")
    def ip_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        IP whitelist group name.
        """
        return pulumi.get(self, "ip_group_name")

    @ip_group_name.setter
    def ip_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_group_name", value)

    @property
    @pulumi.getter(name="securityIpList")
    def security_ip_list(self) -> Optional[pulumi.Input[str]]:
        """
        List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]). System default to `["127.0.0.1"]`.
        """
        return pulumi.get(self, "security_ip_list")

    @security_ip_list.setter
    def security_ip_list(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_ip_list", value)


