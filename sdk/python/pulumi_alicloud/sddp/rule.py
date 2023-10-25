# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RuleArgs', 'Rule']

@pulumi.input_type
class RuleArgs:
    def __init__(__self__, *,
                 category: pulumi.Input[int],
                 content: pulumi.Input[str],
                 rule_name: pulumi.Input[str],
                 content_category: Optional[pulumi.Input[str]] = None,
                 custom_type: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 product_code: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 risk_level_id: Optional[pulumi.Input[str]] = None,
                 rule_type: Optional[pulumi.Input[int]] = None,
                 stat_express: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[int]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 warn_level: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a Rule resource.
        :param pulumi.Input[int] category: Sensitive Data Identification Rules for the Type of. Valid values:
        :param pulumi.Input[str] content: Sensitive Data Identification Rules the Content.
        :param pulumi.Input[str] rule_name: Sensitive Data Identification Name of the Rule.
        :param pulumi.Input[str] content_category: The Content Classification.
        :param pulumi.Input[int] custom_type: Sensitive Data Identification Rules of Type. Valid values:
        :param pulumi.Input[str] description: Sensitive Data Identification a Description of the Rule Information.
        :param pulumi.Input[str] lang: The Request and Receive the Language of the Message Type. Valid values:
        :param pulumi.Input[str] product_code: Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
        :param pulumi.Input[str] product_id: Product ID. Valid values:
        :param pulumi.Input[str] risk_level_id: Sensitive Data Identification Rules of Risk Level ID. Valid values:
        :param pulumi.Input[int] rule_type: Rule Type.
        :param pulumi.Input[str] stat_express: Triggered the Alarm Conditions.
        :param pulumi.Input[int] status: Sensitive Data Identification Rules Detection State of.
        :param pulumi.Input[str] target: The Target of rule.
        :param pulumi.Input[int] warn_level: The Level of Risk. Valid values:
        """
        RuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            category=category,
            content=content,
            rule_name=rule_name,
            content_category=content_category,
            custom_type=custom_type,
            description=description,
            lang=lang,
            product_code=product_code,
            product_id=product_id,
            risk_level_id=risk_level_id,
            rule_type=rule_type,
            stat_express=stat_express,
            status=status,
            target=target,
            warn_level=warn_level,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             category: Optional[pulumi.Input[int]] = None,
             content: Optional[pulumi.Input[str]] = None,
             rule_name: Optional[pulumi.Input[str]] = None,
             content_category: Optional[pulumi.Input[str]] = None,
             custom_type: Optional[pulumi.Input[int]] = None,
             description: Optional[pulumi.Input[str]] = None,
             lang: Optional[pulumi.Input[str]] = None,
             product_code: Optional[pulumi.Input[str]] = None,
             product_id: Optional[pulumi.Input[str]] = None,
             risk_level_id: Optional[pulumi.Input[str]] = None,
             rule_type: Optional[pulumi.Input[int]] = None,
             stat_express: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[int]] = None,
             target: Optional[pulumi.Input[str]] = None,
             warn_level: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if category is None:
            raise TypeError("Missing 'category' argument")
        if content is None:
            raise TypeError("Missing 'content' argument")
        if rule_name is None and 'ruleName' in kwargs:
            rule_name = kwargs['ruleName']
        if rule_name is None:
            raise TypeError("Missing 'rule_name' argument")
        if content_category is None and 'contentCategory' in kwargs:
            content_category = kwargs['contentCategory']
        if custom_type is None and 'customType' in kwargs:
            custom_type = kwargs['customType']
        if product_code is None and 'productCode' in kwargs:
            product_code = kwargs['productCode']
        if product_id is None and 'productId' in kwargs:
            product_id = kwargs['productId']
        if risk_level_id is None and 'riskLevelId' in kwargs:
            risk_level_id = kwargs['riskLevelId']
        if rule_type is None and 'ruleType' in kwargs:
            rule_type = kwargs['ruleType']
        if stat_express is None and 'statExpress' in kwargs:
            stat_express = kwargs['statExpress']
        if warn_level is None and 'warnLevel' in kwargs:
            warn_level = kwargs['warnLevel']

        _setter("category", category)
        _setter("content", content)
        _setter("rule_name", rule_name)
        if content_category is not None:
            _setter("content_category", content_category)
        if custom_type is not None:
            _setter("custom_type", custom_type)
        if description is not None:
            _setter("description", description)
        if lang is not None:
            _setter("lang", lang)
        if product_code is not None:
            _setter("product_code", product_code)
        if product_id is not None:
            _setter("product_id", product_id)
        if risk_level_id is not None:
            _setter("risk_level_id", risk_level_id)
        if rule_type is not None:
            _setter("rule_type", rule_type)
        if stat_express is not None:
            _setter("stat_express", stat_express)
        if status is not None:
            _setter("status", status)
        if target is not None:
            _setter("target", target)
        if warn_level is not None:
            _setter("warn_level", warn_level)

    @property
    @pulumi.getter
    def category(self) -> pulumi.Input[int]:
        """
        Sensitive Data Identification Rules for the Type of. Valid values:
        """
        return pulumi.get(self, "category")

    @category.setter
    def category(self, value: pulumi.Input[int]):
        pulumi.set(self, "category", value)

    @property
    @pulumi.getter
    def content(self) -> pulumi.Input[str]:
        """
        Sensitive Data Identification Rules the Content.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: pulumi.Input[str]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> pulumi.Input[str]:
        """
        Sensitive Data Identification Name of the Rule.
        """
        return pulumi.get(self, "rule_name")

    @rule_name.setter
    def rule_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "rule_name", value)

    @property
    @pulumi.getter(name="contentCategory")
    def content_category(self) -> Optional[pulumi.Input[str]]:
        """
        The Content Classification.
        """
        return pulumi.get(self, "content_category")

    @content_category.setter
    def content_category(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_category", value)

    @property
    @pulumi.getter(name="customType")
    def custom_type(self) -> Optional[pulumi.Input[int]]:
        """
        Sensitive Data Identification Rules of Type. Valid values:
        """
        return pulumi.get(self, "custom_type")

    @custom_type.setter
    def custom_type(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "custom_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Sensitive Data Identification a Description of the Rule Information.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def lang(self) -> Optional[pulumi.Input[str]]:
        """
        The Request and Receive the Language of the Message Type. Valid values:
        """
        return pulumi.get(self, "lang")

    @lang.setter
    def lang(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lang", value)

    @property
    @pulumi.getter(name="productCode")
    def product_code(self) -> Optional[pulumi.Input[str]]:
        """
        Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
        """
        return pulumi.get(self, "product_code")

    @product_code.setter
    def product_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_code", value)

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> Optional[pulumi.Input[str]]:
        """
        Product ID. Valid values:
        """
        return pulumi.get(self, "product_id")

    @product_id.setter
    def product_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_id", value)

    @property
    @pulumi.getter(name="riskLevelId")
    def risk_level_id(self) -> Optional[pulumi.Input[str]]:
        """
        Sensitive Data Identification Rules of Risk Level ID. Valid values:
        """
        return pulumi.get(self, "risk_level_id")

    @risk_level_id.setter
    def risk_level_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "risk_level_id", value)

    @property
    @pulumi.getter(name="ruleType")
    def rule_type(self) -> Optional[pulumi.Input[int]]:
        """
        Rule Type.
        """
        return pulumi.get(self, "rule_type")

    @rule_type.setter
    def rule_type(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "rule_type", value)

    @property
    @pulumi.getter(name="statExpress")
    def stat_express(self) -> Optional[pulumi.Input[str]]:
        """
        Triggered the Alarm Conditions.
        """
        return pulumi.get(self, "stat_express")

    @stat_express.setter
    def stat_express(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "stat_express", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[int]]:
        """
        Sensitive Data Identification Rules Detection State of.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def target(self) -> Optional[pulumi.Input[str]]:
        """
        The Target of rule.
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter(name="warnLevel")
    def warn_level(self) -> Optional[pulumi.Input[int]]:
        """
        The Level of Risk. Valid values:
        """
        return pulumi.get(self, "warn_level")

    @warn_level.setter
    def warn_level(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "warn_level", value)


@pulumi.input_type
class _RuleState:
    def __init__(__self__, *,
                 category: Optional[pulumi.Input[int]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 content_category: Optional[pulumi.Input[str]] = None,
                 custom_type: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 product_code: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 risk_level_id: Optional[pulumi.Input[str]] = None,
                 rule_name: Optional[pulumi.Input[str]] = None,
                 rule_type: Optional[pulumi.Input[int]] = None,
                 stat_express: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[int]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 warn_level: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering Rule resources.
        :param pulumi.Input[int] category: Sensitive Data Identification Rules for the Type of. Valid values:
        :param pulumi.Input[str] content: Sensitive Data Identification Rules the Content.
        :param pulumi.Input[str] content_category: The Content Classification.
        :param pulumi.Input[int] custom_type: Sensitive Data Identification Rules of Type. Valid values:
        :param pulumi.Input[str] description: Sensitive Data Identification a Description of the Rule Information.
        :param pulumi.Input[str] lang: The Request and Receive the Language of the Message Type. Valid values:
        :param pulumi.Input[str] product_code: Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
        :param pulumi.Input[str] product_id: Product ID. Valid values:
        :param pulumi.Input[str] risk_level_id: Sensitive Data Identification Rules of Risk Level ID. Valid values:
        :param pulumi.Input[str] rule_name: Sensitive Data Identification Name of the Rule.
        :param pulumi.Input[int] rule_type: Rule Type.
        :param pulumi.Input[str] stat_express: Triggered the Alarm Conditions.
        :param pulumi.Input[int] status: Sensitive Data Identification Rules Detection State of.
        :param pulumi.Input[str] target: The Target of rule.
        :param pulumi.Input[int] warn_level: The Level of Risk. Valid values:
        """
        _RuleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            category=category,
            content=content,
            content_category=content_category,
            custom_type=custom_type,
            description=description,
            lang=lang,
            product_code=product_code,
            product_id=product_id,
            risk_level_id=risk_level_id,
            rule_name=rule_name,
            rule_type=rule_type,
            stat_express=stat_express,
            status=status,
            target=target,
            warn_level=warn_level,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             category: Optional[pulumi.Input[int]] = None,
             content: Optional[pulumi.Input[str]] = None,
             content_category: Optional[pulumi.Input[str]] = None,
             custom_type: Optional[pulumi.Input[int]] = None,
             description: Optional[pulumi.Input[str]] = None,
             lang: Optional[pulumi.Input[str]] = None,
             product_code: Optional[pulumi.Input[str]] = None,
             product_id: Optional[pulumi.Input[str]] = None,
             risk_level_id: Optional[pulumi.Input[str]] = None,
             rule_name: Optional[pulumi.Input[str]] = None,
             rule_type: Optional[pulumi.Input[int]] = None,
             stat_express: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[int]] = None,
             target: Optional[pulumi.Input[str]] = None,
             warn_level: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if content_category is None and 'contentCategory' in kwargs:
            content_category = kwargs['contentCategory']
        if custom_type is None and 'customType' in kwargs:
            custom_type = kwargs['customType']
        if product_code is None and 'productCode' in kwargs:
            product_code = kwargs['productCode']
        if product_id is None and 'productId' in kwargs:
            product_id = kwargs['productId']
        if risk_level_id is None and 'riskLevelId' in kwargs:
            risk_level_id = kwargs['riskLevelId']
        if rule_name is None and 'ruleName' in kwargs:
            rule_name = kwargs['ruleName']
        if rule_type is None and 'ruleType' in kwargs:
            rule_type = kwargs['ruleType']
        if stat_express is None and 'statExpress' in kwargs:
            stat_express = kwargs['statExpress']
        if warn_level is None and 'warnLevel' in kwargs:
            warn_level = kwargs['warnLevel']

        if category is not None:
            _setter("category", category)
        if content is not None:
            _setter("content", content)
        if content_category is not None:
            _setter("content_category", content_category)
        if custom_type is not None:
            _setter("custom_type", custom_type)
        if description is not None:
            _setter("description", description)
        if lang is not None:
            _setter("lang", lang)
        if product_code is not None:
            _setter("product_code", product_code)
        if product_id is not None:
            _setter("product_id", product_id)
        if risk_level_id is not None:
            _setter("risk_level_id", risk_level_id)
        if rule_name is not None:
            _setter("rule_name", rule_name)
        if rule_type is not None:
            _setter("rule_type", rule_type)
        if stat_express is not None:
            _setter("stat_express", stat_express)
        if status is not None:
            _setter("status", status)
        if target is not None:
            _setter("target", target)
        if warn_level is not None:
            _setter("warn_level", warn_level)

    @property
    @pulumi.getter
    def category(self) -> Optional[pulumi.Input[int]]:
        """
        Sensitive Data Identification Rules for the Type of. Valid values:
        """
        return pulumi.get(self, "category")

    @category.setter
    def category(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "category", value)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        """
        Sensitive Data Identification Rules the Content.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="contentCategory")
    def content_category(self) -> Optional[pulumi.Input[str]]:
        """
        The Content Classification.
        """
        return pulumi.get(self, "content_category")

    @content_category.setter
    def content_category(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_category", value)

    @property
    @pulumi.getter(name="customType")
    def custom_type(self) -> Optional[pulumi.Input[int]]:
        """
        Sensitive Data Identification Rules of Type. Valid values:
        """
        return pulumi.get(self, "custom_type")

    @custom_type.setter
    def custom_type(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "custom_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Sensitive Data Identification a Description of the Rule Information.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def lang(self) -> Optional[pulumi.Input[str]]:
        """
        The Request and Receive the Language of the Message Type. Valid values:
        """
        return pulumi.get(self, "lang")

    @lang.setter
    def lang(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lang", value)

    @property
    @pulumi.getter(name="productCode")
    def product_code(self) -> Optional[pulumi.Input[str]]:
        """
        Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
        """
        return pulumi.get(self, "product_code")

    @product_code.setter
    def product_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_code", value)

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> Optional[pulumi.Input[str]]:
        """
        Product ID. Valid values:
        """
        return pulumi.get(self, "product_id")

    @product_id.setter
    def product_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_id", value)

    @property
    @pulumi.getter(name="riskLevelId")
    def risk_level_id(self) -> Optional[pulumi.Input[str]]:
        """
        Sensitive Data Identification Rules of Risk Level ID. Valid values:
        """
        return pulumi.get(self, "risk_level_id")

    @risk_level_id.setter
    def risk_level_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "risk_level_id", value)

    @property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> Optional[pulumi.Input[str]]:
        """
        Sensitive Data Identification Name of the Rule.
        """
        return pulumi.get(self, "rule_name")

    @rule_name.setter
    def rule_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rule_name", value)

    @property
    @pulumi.getter(name="ruleType")
    def rule_type(self) -> Optional[pulumi.Input[int]]:
        """
        Rule Type.
        """
        return pulumi.get(self, "rule_type")

    @rule_type.setter
    def rule_type(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "rule_type", value)

    @property
    @pulumi.getter(name="statExpress")
    def stat_express(self) -> Optional[pulumi.Input[str]]:
        """
        Triggered the Alarm Conditions.
        """
        return pulumi.get(self, "stat_express")

    @stat_express.setter
    def stat_express(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "stat_express", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[int]]:
        """
        Sensitive Data Identification Rules Detection State of.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def target(self) -> Optional[pulumi.Input[str]]:
        """
        The Target of rule.
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter(name="warnLevel")
    def warn_level(self) -> Optional[pulumi.Input[int]]:
        """
        The Level of Risk. Valid values:
        """
        return pulumi.get(self, "warn_level")

    @warn_level.setter
    def warn_level(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "warn_level", value)


class Rule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 category: Optional[pulumi.Input[int]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 content_category: Optional[pulumi.Input[str]] = None,
                 custom_type: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 product_code: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 risk_level_id: Optional[pulumi.Input[str]] = None,
                 rule_name: Optional[pulumi.Input[str]] = None,
                 rule_type: Optional[pulumi.Input[int]] = None,
                 stat_express: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[int]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 warn_level: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a Data Security Center Rule resource.

        For information about Data Security Center Rule and how to use it, see [What is Rule](https://www.alibabacloud.com/help/en/data-security-center/latest/api-sddp-2019-01-03-createrule).

        > **NOTE:** Available since v1.132.0.

        ## Import

        Data Security Center Rule can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:sddp/rule:Rule example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] category: Sensitive Data Identification Rules for the Type of. Valid values:
        :param pulumi.Input[str] content: Sensitive Data Identification Rules the Content.
        :param pulumi.Input[str] content_category: The Content Classification.
        :param pulumi.Input[int] custom_type: Sensitive Data Identification Rules of Type. Valid values:
        :param pulumi.Input[str] description: Sensitive Data Identification a Description of the Rule Information.
        :param pulumi.Input[str] lang: The Request and Receive the Language of the Message Type. Valid values:
        :param pulumi.Input[str] product_code: Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
        :param pulumi.Input[str] product_id: Product ID. Valid values:
        :param pulumi.Input[str] risk_level_id: Sensitive Data Identification Rules of Risk Level ID. Valid values:
        :param pulumi.Input[str] rule_name: Sensitive Data Identification Name of the Rule.
        :param pulumi.Input[int] rule_type: Rule Type.
        :param pulumi.Input[str] stat_express: Triggered the Alarm Conditions.
        :param pulumi.Input[int] status: Sensitive Data Identification Rules Detection State of.
        :param pulumi.Input[str] target: The Target of rule.
        :param pulumi.Input[int] warn_level: The Level of Risk. Valid values:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Data Security Center Rule resource.

        For information about Data Security Center Rule and how to use it, see [What is Rule](https://www.alibabacloud.com/help/en/data-security-center/latest/api-sddp-2019-01-03-createrule).

        > **NOTE:** Available since v1.132.0.

        ## Import

        Data Security Center Rule can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:sddp/rule:Rule example <id>
        ```

        :param str resource_name: The name of the resource.
        :param RuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            RuleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 category: Optional[pulumi.Input[int]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 content_category: Optional[pulumi.Input[str]] = None,
                 custom_type: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 product_code: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 risk_level_id: Optional[pulumi.Input[str]] = None,
                 rule_name: Optional[pulumi.Input[str]] = None,
                 rule_type: Optional[pulumi.Input[int]] = None,
                 stat_express: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[int]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 warn_level: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RuleArgs.__new__(RuleArgs)

            if category is None and not opts.urn:
                raise TypeError("Missing required property 'category'")
            __props__.__dict__["category"] = category
            if content is None and not opts.urn:
                raise TypeError("Missing required property 'content'")
            __props__.__dict__["content"] = content
            __props__.__dict__["content_category"] = content_category
            __props__.__dict__["custom_type"] = custom_type
            __props__.__dict__["description"] = description
            __props__.__dict__["lang"] = lang
            __props__.__dict__["product_code"] = product_code
            __props__.__dict__["product_id"] = product_id
            __props__.__dict__["risk_level_id"] = risk_level_id
            if rule_name is None and not opts.urn:
                raise TypeError("Missing required property 'rule_name'")
            __props__.__dict__["rule_name"] = rule_name
            __props__.__dict__["rule_type"] = rule_type
            __props__.__dict__["stat_express"] = stat_express
            __props__.__dict__["status"] = status
            __props__.__dict__["target"] = target
            __props__.__dict__["warn_level"] = warn_level
        super(Rule, __self__).__init__(
            'alicloud:sddp/rule:Rule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            category: Optional[pulumi.Input[int]] = None,
            content: Optional[pulumi.Input[str]] = None,
            content_category: Optional[pulumi.Input[str]] = None,
            custom_type: Optional[pulumi.Input[int]] = None,
            description: Optional[pulumi.Input[str]] = None,
            lang: Optional[pulumi.Input[str]] = None,
            product_code: Optional[pulumi.Input[str]] = None,
            product_id: Optional[pulumi.Input[str]] = None,
            risk_level_id: Optional[pulumi.Input[str]] = None,
            rule_name: Optional[pulumi.Input[str]] = None,
            rule_type: Optional[pulumi.Input[int]] = None,
            stat_express: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[int]] = None,
            target: Optional[pulumi.Input[str]] = None,
            warn_level: Optional[pulumi.Input[int]] = None) -> 'Rule':
        """
        Get an existing Rule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] category: Sensitive Data Identification Rules for the Type of. Valid values:
        :param pulumi.Input[str] content: Sensitive Data Identification Rules the Content.
        :param pulumi.Input[str] content_category: The Content Classification.
        :param pulumi.Input[int] custom_type: Sensitive Data Identification Rules of Type. Valid values:
        :param pulumi.Input[str] description: Sensitive Data Identification a Description of the Rule Information.
        :param pulumi.Input[str] lang: The Request and Receive the Language of the Message Type. Valid values:
        :param pulumi.Input[str] product_code: Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
        :param pulumi.Input[str] product_id: Product ID. Valid values:
        :param pulumi.Input[str] risk_level_id: Sensitive Data Identification Rules of Risk Level ID. Valid values:
        :param pulumi.Input[str] rule_name: Sensitive Data Identification Name of the Rule.
        :param pulumi.Input[int] rule_type: Rule Type.
        :param pulumi.Input[str] stat_express: Triggered the Alarm Conditions.
        :param pulumi.Input[int] status: Sensitive Data Identification Rules Detection State of.
        :param pulumi.Input[str] target: The Target of rule.
        :param pulumi.Input[int] warn_level: The Level of Risk. Valid values:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RuleState.__new__(_RuleState)

        __props__.__dict__["category"] = category
        __props__.__dict__["content"] = content
        __props__.__dict__["content_category"] = content_category
        __props__.__dict__["custom_type"] = custom_type
        __props__.__dict__["description"] = description
        __props__.__dict__["lang"] = lang
        __props__.__dict__["product_code"] = product_code
        __props__.__dict__["product_id"] = product_id
        __props__.__dict__["risk_level_id"] = risk_level_id
        __props__.__dict__["rule_name"] = rule_name
        __props__.__dict__["rule_type"] = rule_type
        __props__.__dict__["stat_express"] = stat_express
        __props__.__dict__["status"] = status
        __props__.__dict__["target"] = target
        __props__.__dict__["warn_level"] = warn_level
        return Rule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def category(self) -> pulumi.Output[int]:
        """
        Sensitive Data Identification Rules for the Type of. Valid values:
        """
        return pulumi.get(self, "category")

    @property
    @pulumi.getter
    def content(self) -> pulumi.Output[str]:
        """
        Sensitive Data Identification Rules the Content.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="contentCategory")
    def content_category(self) -> pulumi.Output[str]:
        """
        The Content Classification.
        """
        return pulumi.get(self, "content_category")

    @property
    @pulumi.getter(name="customType")
    def custom_type(self) -> pulumi.Output[int]:
        """
        Sensitive Data Identification Rules of Type. Valid values:
        """
        return pulumi.get(self, "custom_type")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Sensitive Data Identification a Description of the Rule Information.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def lang(self) -> pulumi.Output[Optional[str]]:
        """
        The Request and Receive the Language of the Message Type. Valid values:
        """
        return pulumi.get(self, "lang")

    @property
    @pulumi.getter(name="productCode")
    def product_code(self) -> pulumi.Output[Optional[str]]:
        """
        Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
        """
        return pulumi.get(self, "product_code")

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> pulumi.Output[Optional[str]]:
        """
        Product ID. Valid values:
        """
        return pulumi.get(self, "product_id")

    @property
    @pulumi.getter(name="riskLevelId")
    def risk_level_id(self) -> pulumi.Output[Optional[str]]:
        """
        Sensitive Data Identification Rules of Risk Level ID. Valid values:
        """
        return pulumi.get(self, "risk_level_id")

    @property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> pulumi.Output[str]:
        """
        Sensitive Data Identification Name of the Rule.
        """
        return pulumi.get(self, "rule_name")

    @property
    @pulumi.getter(name="ruleType")
    def rule_type(self) -> pulumi.Output[Optional[int]]:
        """
        Rule Type.
        """
        return pulumi.get(self, "rule_type")

    @property
    @pulumi.getter(name="statExpress")
    def stat_express(self) -> pulumi.Output[Optional[str]]:
        """
        Triggered the Alarm Conditions.
        """
        return pulumi.get(self, "stat_express")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[int]:
        """
        Sensitive Data Identification Rules Detection State of.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def target(self) -> pulumi.Output[Optional[str]]:
        """
        The Target of rule.
        """
        return pulumi.get(self, "target")

    @property
    @pulumi.getter(name="warnLevel")
    def warn_level(self) -> pulumi.Output[Optional[int]]:
        """
        The Level of Risk. Valid values:
        """
        return pulumi.get(self, "warn_level")

