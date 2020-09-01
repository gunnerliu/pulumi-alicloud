# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = [
    'AlarmEscalationsCritical',
    'AlarmEscalationsInfo',
    'AlarmEscalationsWarn',
    'SiteMonitorIspCity',
]

@pulumi.output_type
class AlarmEscalationsCritical(dict):
    def __init__(__self__, *,
                 comparison_operator: Optional[str] = None,
                 statistics: Optional[str] = None,
                 threshold: Optional[str] = None,
                 times: Optional[float] = None):
        """
        :param str comparison_operator: Critical level alarm comparison operator. Valid values: ["<=", "<", ">", ">=", "==", "!="]. Default to "==".
        :param str statistics: Critical level alarm statistics method.. It must be consistent with that defined for metrics. Valid values: ["Average", "Minimum", "Maximum"]. Default to "Average".
        :param str threshold: Critical level alarm threshold value, which must be a numeric value currently.
        :param float times: Critical level alarm retry times. Default to 3.
        """
        if comparison_operator is not None:
            pulumi.set(__self__, "comparison_operator", comparison_operator)
        if statistics is not None:
            pulumi.set(__self__, "statistics", statistics)
        if threshold is not None:
            pulumi.set(__self__, "threshold", threshold)
        if times is not None:
            pulumi.set(__self__, "times", times)

    @property
    @pulumi.getter(name="comparisonOperator")
    def comparison_operator(self) -> Optional[str]:
        """
        Critical level alarm comparison operator. Valid values: ["<=", "<", ">", ">=", "==", "!="]. Default to "==".
        """
        return pulumi.get(self, "comparison_operator")

    @property
    @pulumi.getter
    def statistics(self) -> Optional[str]:
        """
        Critical level alarm statistics method.. It must be consistent with that defined for metrics. Valid values: ["Average", "Minimum", "Maximum"]. Default to "Average".
        """
        return pulumi.get(self, "statistics")

    @property
    @pulumi.getter
    def threshold(self) -> Optional[str]:
        """
        Critical level alarm threshold value, which must be a numeric value currently.
        """
        return pulumi.get(self, "threshold")

    @property
    @pulumi.getter
    def times(self) -> Optional[float]:
        """
        Critical level alarm retry times. Default to 3.
        """
        return pulumi.get(self, "times")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class AlarmEscalationsInfo(dict):
    def __init__(__self__, *,
                 comparison_operator: Optional[str] = None,
                 statistics: Optional[str] = None,
                 threshold: Optional[str] = None,
                 times: Optional[float] = None):
        """
        :param str comparison_operator: Critical level alarm comparison operator. Valid values: ["<=", "<", ">", ">=", "==", "!="]. Default to "==".
        :param str statistics: Critical level alarm statistics method.. It must be consistent with that defined for metrics. Valid values: ["Average", "Minimum", "Maximum"]. Default to "Average".
        :param str threshold: Critical level alarm threshold value, which must be a numeric value currently.
        :param float times: Critical level alarm retry times. Default to 3.
        """
        if comparison_operator is not None:
            pulumi.set(__self__, "comparison_operator", comparison_operator)
        if statistics is not None:
            pulumi.set(__self__, "statistics", statistics)
        if threshold is not None:
            pulumi.set(__self__, "threshold", threshold)
        if times is not None:
            pulumi.set(__self__, "times", times)

    @property
    @pulumi.getter(name="comparisonOperator")
    def comparison_operator(self) -> Optional[str]:
        """
        Critical level alarm comparison operator. Valid values: ["<=", "<", ">", ">=", "==", "!="]. Default to "==".
        """
        return pulumi.get(self, "comparison_operator")

    @property
    @pulumi.getter
    def statistics(self) -> Optional[str]:
        """
        Critical level alarm statistics method.. It must be consistent with that defined for metrics. Valid values: ["Average", "Minimum", "Maximum"]. Default to "Average".
        """
        return pulumi.get(self, "statistics")

    @property
    @pulumi.getter
    def threshold(self) -> Optional[str]:
        """
        Critical level alarm threshold value, which must be a numeric value currently.
        """
        return pulumi.get(self, "threshold")

    @property
    @pulumi.getter
    def times(self) -> Optional[float]:
        """
        Critical level alarm retry times. Default to 3.
        """
        return pulumi.get(self, "times")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class AlarmEscalationsWarn(dict):
    def __init__(__self__, *,
                 comparison_operator: Optional[str] = None,
                 statistics: Optional[str] = None,
                 threshold: Optional[str] = None,
                 times: Optional[float] = None):
        """
        :param str comparison_operator: Critical level alarm comparison operator. Valid values: ["<=", "<", ">", ">=", "==", "!="]. Default to "==".
        :param str statistics: Critical level alarm statistics method.. It must be consistent with that defined for metrics. Valid values: ["Average", "Minimum", "Maximum"]. Default to "Average".
        :param str threshold: Critical level alarm threshold value, which must be a numeric value currently.
        :param float times: Critical level alarm retry times. Default to 3.
        """
        if comparison_operator is not None:
            pulumi.set(__self__, "comparison_operator", comparison_operator)
        if statistics is not None:
            pulumi.set(__self__, "statistics", statistics)
        if threshold is not None:
            pulumi.set(__self__, "threshold", threshold)
        if times is not None:
            pulumi.set(__self__, "times", times)

    @property
    @pulumi.getter(name="comparisonOperator")
    def comparison_operator(self) -> Optional[str]:
        """
        Critical level alarm comparison operator. Valid values: ["<=", "<", ">", ">=", "==", "!="]. Default to "==".
        """
        return pulumi.get(self, "comparison_operator")

    @property
    @pulumi.getter
    def statistics(self) -> Optional[str]:
        """
        Critical level alarm statistics method.. It must be consistent with that defined for metrics. Valid values: ["Average", "Minimum", "Maximum"]. Default to "Average".
        """
        return pulumi.get(self, "statistics")

    @property
    @pulumi.getter
    def threshold(self) -> Optional[str]:
        """
        Critical level alarm threshold value, which must be a numeric value currently.
        """
        return pulumi.get(self, "threshold")

    @property
    @pulumi.getter
    def times(self) -> Optional[float]:
        """
        Critical level alarm retry times. Default to 3.
        """
        return pulumi.get(self, "times")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class SiteMonitorIspCity(dict):
    def __init__(__self__, *,
                 city: str,
                 isp: str):
        pulumi.set(__self__, "city", city)
        pulumi.set(__self__, "isp", isp)

    @property
    @pulumi.getter
    def city(self) -> str:
        return pulumi.get(self, "city")

    @property
    @pulumi.getter
    def isp(self) -> str:
        return pulumi.get(self, "isp")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

