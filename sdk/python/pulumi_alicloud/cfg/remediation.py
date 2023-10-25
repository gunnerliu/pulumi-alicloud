# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RemediationArgs', 'Remediation']

@pulumi.input_type
class RemediationArgs:
    def __init__(__self__, *,
                 config_rule_id: pulumi.Input[str],
                 invoke_type: pulumi.Input[str],
                 params: pulumi.Input[str],
                 remediation_template_id: pulumi.Input[str],
                 remediation_type: pulumi.Input[str],
                 remediation_source_type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Remediation resource.
        :param pulumi.Input[str] config_rule_id: Rule ID.
        :param pulumi.Input[str] invoke_type: Execution type, valid values: `Manual`, `Automatic`.
        :param pulumi.Input[str] params: Remediation parameter.
        :param pulumi.Input[str] remediation_template_id: Remediation template ID.
        :param pulumi.Input[str] remediation_type: Remediation type, valid values: `OOS`, `FC`.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        :param pulumi.Input[str] remediation_source_type: Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
        """
        RemediationArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            config_rule_id=config_rule_id,
            invoke_type=invoke_type,
            params=params,
            remediation_template_id=remediation_template_id,
            remediation_type=remediation_type,
            remediation_source_type=remediation_source_type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             config_rule_id: Optional[pulumi.Input[str]] = None,
             invoke_type: Optional[pulumi.Input[str]] = None,
             params: Optional[pulumi.Input[str]] = None,
             remediation_template_id: Optional[pulumi.Input[str]] = None,
             remediation_type: Optional[pulumi.Input[str]] = None,
             remediation_source_type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if config_rule_id is None and 'configRuleId' in kwargs:
            config_rule_id = kwargs['configRuleId']
        if config_rule_id is None:
            raise TypeError("Missing 'config_rule_id' argument")
        if invoke_type is None and 'invokeType' in kwargs:
            invoke_type = kwargs['invokeType']
        if invoke_type is None:
            raise TypeError("Missing 'invoke_type' argument")
        if params is None:
            raise TypeError("Missing 'params' argument")
        if remediation_template_id is None and 'remediationTemplateId' in kwargs:
            remediation_template_id = kwargs['remediationTemplateId']
        if remediation_template_id is None:
            raise TypeError("Missing 'remediation_template_id' argument")
        if remediation_type is None and 'remediationType' in kwargs:
            remediation_type = kwargs['remediationType']
        if remediation_type is None:
            raise TypeError("Missing 'remediation_type' argument")
        if remediation_source_type is None and 'remediationSourceType' in kwargs:
            remediation_source_type = kwargs['remediationSourceType']

        _setter("config_rule_id", config_rule_id)
        _setter("invoke_type", invoke_type)
        _setter("params", params)
        _setter("remediation_template_id", remediation_template_id)
        _setter("remediation_type", remediation_type)
        if remediation_source_type is not None:
            _setter("remediation_source_type", remediation_source_type)

    @property
    @pulumi.getter(name="configRuleId")
    def config_rule_id(self) -> pulumi.Input[str]:
        """
        Rule ID.
        """
        return pulumi.get(self, "config_rule_id")

    @config_rule_id.setter
    def config_rule_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "config_rule_id", value)

    @property
    @pulumi.getter(name="invokeType")
    def invoke_type(self) -> pulumi.Input[str]:
        """
        Execution type, valid values: `Manual`, `Automatic`.
        """
        return pulumi.get(self, "invoke_type")

    @invoke_type.setter
    def invoke_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "invoke_type", value)

    @property
    @pulumi.getter
    def params(self) -> pulumi.Input[str]:
        """
        Remediation parameter.
        """
        return pulumi.get(self, "params")

    @params.setter
    def params(self, value: pulumi.Input[str]):
        pulumi.set(self, "params", value)

    @property
    @pulumi.getter(name="remediationTemplateId")
    def remediation_template_id(self) -> pulumi.Input[str]:
        """
        Remediation template ID.
        """
        return pulumi.get(self, "remediation_template_id")

    @remediation_template_id.setter
    def remediation_template_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "remediation_template_id", value)

    @property
    @pulumi.getter(name="remediationType")
    def remediation_type(self) -> pulumi.Input[str]:
        """
        Remediation type, valid values: `OOS`, `FC`.

        The following arguments will be discarded. Please use new fields as soon as possible:
        """
        return pulumi.get(self, "remediation_type")

    @remediation_type.setter
    def remediation_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "remediation_type", value)

    @property
    @pulumi.getter(name="remediationSourceType")
    def remediation_source_type(self) -> Optional[pulumi.Input[str]]:
        """
        Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
        """
        return pulumi.get(self, "remediation_source_type")

    @remediation_source_type.setter
    def remediation_source_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "remediation_source_type", value)


@pulumi.input_type
class _RemediationState:
    def __init__(__self__, *,
                 config_rule_id: Optional[pulumi.Input[str]] = None,
                 invoke_type: Optional[pulumi.Input[str]] = None,
                 params: Optional[pulumi.Input[str]] = None,
                 remediation_id: Optional[pulumi.Input[str]] = None,
                 remediation_source_type: Optional[pulumi.Input[str]] = None,
                 remediation_template_id: Optional[pulumi.Input[str]] = None,
                 remediation_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Remediation resources.
        :param pulumi.Input[str] config_rule_id: Rule ID.
        :param pulumi.Input[str] invoke_type: Execution type, valid values: `Manual`, `Automatic`.
        :param pulumi.Input[str] params: Remediation parameter.
        :param pulumi.Input[str] remediation_id: Remediation ID.
        :param pulumi.Input[str] remediation_source_type: Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
        :param pulumi.Input[str] remediation_template_id: Remediation template ID.
        :param pulumi.Input[str] remediation_type: Remediation type, valid values: `OOS`, `FC`.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        """
        _RemediationState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            config_rule_id=config_rule_id,
            invoke_type=invoke_type,
            params=params,
            remediation_id=remediation_id,
            remediation_source_type=remediation_source_type,
            remediation_template_id=remediation_template_id,
            remediation_type=remediation_type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             config_rule_id: Optional[pulumi.Input[str]] = None,
             invoke_type: Optional[pulumi.Input[str]] = None,
             params: Optional[pulumi.Input[str]] = None,
             remediation_id: Optional[pulumi.Input[str]] = None,
             remediation_source_type: Optional[pulumi.Input[str]] = None,
             remediation_template_id: Optional[pulumi.Input[str]] = None,
             remediation_type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if config_rule_id is None and 'configRuleId' in kwargs:
            config_rule_id = kwargs['configRuleId']
        if invoke_type is None and 'invokeType' in kwargs:
            invoke_type = kwargs['invokeType']
        if remediation_id is None and 'remediationId' in kwargs:
            remediation_id = kwargs['remediationId']
        if remediation_source_type is None and 'remediationSourceType' in kwargs:
            remediation_source_type = kwargs['remediationSourceType']
        if remediation_template_id is None and 'remediationTemplateId' in kwargs:
            remediation_template_id = kwargs['remediationTemplateId']
        if remediation_type is None and 'remediationType' in kwargs:
            remediation_type = kwargs['remediationType']

        if config_rule_id is not None:
            _setter("config_rule_id", config_rule_id)
        if invoke_type is not None:
            _setter("invoke_type", invoke_type)
        if params is not None:
            _setter("params", params)
        if remediation_id is not None:
            _setter("remediation_id", remediation_id)
        if remediation_source_type is not None:
            _setter("remediation_source_type", remediation_source_type)
        if remediation_template_id is not None:
            _setter("remediation_template_id", remediation_template_id)
        if remediation_type is not None:
            _setter("remediation_type", remediation_type)

    @property
    @pulumi.getter(name="configRuleId")
    def config_rule_id(self) -> Optional[pulumi.Input[str]]:
        """
        Rule ID.
        """
        return pulumi.get(self, "config_rule_id")

    @config_rule_id.setter
    def config_rule_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_rule_id", value)

    @property
    @pulumi.getter(name="invokeType")
    def invoke_type(self) -> Optional[pulumi.Input[str]]:
        """
        Execution type, valid values: `Manual`, `Automatic`.
        """
        return pulumi.get(self, "invoke_type")

    @invoke_type.setter
    def invoke_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "invoke_type", value)

    @property
    @pulumi.getter
    def params(self) -> Optional[pulumi.Input[str]]:
        """
        Remediation parameter.
        """
        return pulumi.get(self, "params")

    @params.setter
    def params(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "params", value)

    @property
    @pulumi.getter(name="remediationId")
    def remediation_id(self) -> Optional[pulumi.Input[str]]:
        """
        Remediation ID.
        """
        return pulumi.get(self, "remediation_id")

    @remediation_id.setter
    def remediation_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "remediation_id", value)

    @property
    @pulumi.getter(name="remediationSourceType")
    def remediation_source_type(self) -> Optional[pulumi.Input[str]]:
        """
        Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
        """
        return pulumi.get(self, "remediation_source_type")

    @remediation_source_type.setter
    def remediation_source_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "remediation_source_type", value)

    @property
    @pulumi.getter(name="remediationTemplateId")
    def remediation_template_id(self) -> Optional[pulumi.Input[str]]:
        """
        Remediation template ID.
        """
        return pulumi.get(self, "remediation_template_id")

    @remediation_template_id.setter
    def remediation_template_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "remediation_template_id", value)

    @property
    @pulumi.getter(name="remediationType")
    def remediation_type(self) -> Optional[pulumi.Input[str]]:
        """
        Remediation type, valid values: `OOS`, `FC`.

        The following arguments will be discarded. Please use new fields as soon as possible:
        """
        return pulumi.get(self, "remediation_type")

    @remediation_type.setter
    def remediation_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "remediation_type", value)


class Remediation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_rule_id: Optional[pulumi.Input[str]] = None,
                 invoke_type: Optional[pulumi.Input[str]] = None,
                 params: Optional[pulumi.Input[str]] = None,
                 remediation_source_type: Optional[pulumi.Input[str]] = None,
                 remediation_template_id: Optional[pulumi.Input[str]] = None,
                 remediation_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Config Remediation resource.

        For information about Config Remediation and how to use it, see [What is Remediation](https://www.alibabacloud.com/help/en/cloud-config/latest/api-config-2020-09-07-createremediation).

        > **NOTE:** Available since v1.204.0.

        ## Import

        Config Remediation can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cfg/remediation:Remediation example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config_rule_id: Rule ID.
        :param pulumi.Input[str] invoke_type: Execution type, valid values: `Manual`, `Automatic`.
        :param pulumi.Input[str] params: Remediation parameter.
        :param pulumi.Input[str] remediation_source_type: Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
        :param pulumi.Input[str] remediation_template_id: Remediation template ID.
        :param pulumi.Input[str] remediation_type: Remediation type, valid values: `OOS`, `FC`.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RemediationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Config Remediation resource.

        For information about Config Remediation and how to use it, see [What is Remediation](https://www.alibabacloud.com/help/en/cloud-config/latest/api-config-2020-09-07-createremediation).

        > **NOTE:** Available since v1.204.0.

        ## Import

        Config Remediation can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cfg/remediation:Remediation example <id>
        ```

        :param str resource_name: The name of the resource.
        :param RemediationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RemediationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            RemediationArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_rule_id: Optional[pulumi.Input[str]] = None,
                 invoke_type: Optional[pulumi.Input[str]] = None,
                 params: Optional[pulumi.Input[str]] = None,
                 remediation_source_type: Optional[pulumi.Input[str]] = None,
                 remediation_template_id: Optional[pulumi.Input[str]] = None,
                 remediation_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RemediationArgs.__new__(RemediationArgs)

            if config_rule_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_rule_id'")
            __props__.__dict__["config_rule_id"] = config_rule_id
            if invoke_type is None and not opts.urn:
                raise TypeError("Missing required property 'invoke_type'")
            __props__.__dict__["invoke_type"] = invoke_type
            if params is None and not opts.urn:
                raise TypeError("Missing required property 'params'")
            __props__.__dict__["params"] = params
            __props__.__dict__["remediation_source_type"] = remediation_source_type
            if remediation_template_id is None and not opts.urn:
                raise TypeError("Missing required property 'remediation_template_id'")
            __props__.__dict__["remediation_template_id"] = remediation_template_id
            if remediation_type is None and not opts.urn:
                raise TypeError("Missing required property 'remediation_type'")
            __props__.__dict__["remediation_type"] = remediation_type
            __props__.__dict__["remediation_id"] = None
        super(Remediation, __self__).__init__(
            'alicloud:cfg/remediation:Remediation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_rule_id: Optional[pulumi.Input[str]] = None,
            invoke_type: Optional[pulumi.Input[str]] = None,
            params: Optional[pulumi.Input[str]] = None,
            remediation_id: Optional[pulumi.Input[str]] = None,
            remediation_source_type: Optional[pulumi.Input[str]] = None,
            remediation_template_id: Optional[pulumi.Input[str]] = None,
            remediation_type: Optional[pulumi.Input[str]] = None) -> 'Remediation':
        """
        Get an existing Remediation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config_rule_id: Rule ID.
        :param pulumi.Input[str] invoke_type: Execution type, valid values: `Manual`, `Automatic`.
        :param pulumi.Input[str] params: Remediation parameter.
        :param pulumi.Input[str] remediation_id: Remediation ID.
        :param pulumi.Input[str] remediation_source_type: Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
        :param pulumi.Input[str] remediation_template_id: Remediation template ID.
        :param pulumi.Input[str] remediation_type: Remediation type, valid values: `OOS`, `FC`.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RemediationState.__new__(_RemediationState)

        __props__.__dict__["config_rule_id"] = config_rule_id
        __props__.__dict__["invoke_type"] = invoke_type
        __props__.__dict__["params"] = params
        __props__.__dict__["remediation_id"] = remediation_id
        __props__.__dict__["remediation_source_type"] = remediation_source_type
        __props__.__dict__["remediation_template_id"] = remediation_template_id
        __props__.__dict__["remediation_type"] = remediation_type
        return Remediation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configRuleId")
    def config_rule_id(self) -> pulumi.Output[str]:
        """
        Rule ID.
        """
        return pulumi.get(self, "config_rule_id")

    @property
    @pulumi.getter(name="invokeType")
    def invoke_type(self) -> pulumi.Output[str]:
        """
        Execution type, valid values: `Manual`, `Automatic`.
        """
        return pulumi.get(self, "invoke_type")

    @property
    @pulumi.getter
    def params(self) -> pulumi.Output[str]:
        """
        Remediation parameter.
        """
        return pulumi.get(self, "params")

    @property
    @pulumi.getter(name="remediationId")
    def remediation_id(self) -> pulumi.Output[str]:
        """
        Remediation ID.
        """
        return pulumi.get(self, "remediation_id")

    @property
    @pulumi.getter(name="remediationSourceType")
    def remediation_source_type(self) -> pulumi.Output[str]:
        """
        Remediation resource type, valid values: `ALIYUN` , `CUSTOMER`.
        """
        return pulumi.get(self, "remediation_source_type")

    @property
    @pulumi.getter(name="remediationTemplateId")
    def remediation_template_id(self) -> pulumi.Output[str]:
        """
        Remediation template ID.
        """
        return pulumi.get(self, "remediation_template_id")

    @property
    @pulumi.getter(name="remediationType")
    def remediation_type(self) -> pulumi.Output[str]:
        """
        Remediation type, valid values: `OOS`, `FC`.

        The following arguments will be discarded. Please use new fields as soon as possible:
        """
        return pulumi.get(self, "remediation_type")

