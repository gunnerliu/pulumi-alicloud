# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['CompliancePackArgs', 'CompliancePack']

@pulumi.input_type
class CompliancePackArgs:
    def __init__(__self__, *,
                 compliance_pack_name: pulumi.Input[str],
                 description: pulumi.Input[str],
                 risk_level: pulumi.Input[int],
                 compliance_pack_template_id: Optional[pulumi.Input[str]] = None,
                 config_rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleIdArgs']]]] = None,
                 config_rules: Optional[pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleArgs']]]] = None):
        """
        The set of arguments for constructing a CompliancePack resource.
        :param pulumi.Input[str] compliance_pack_name: The Compliance Package Name. . **NOTE:** the `compliance_pack_name` supports modification since V1.146.0.
        :param pulumi.Input[str] description: The Description of compliance pack.
        :param pulumi.Input[int] risk_level: The Risk Level. Valid values:  `1`: critical, `2`: warning, `3`: info.
        :param pulumi.Input[str] compliance_pack_template_id: Compliance Package Template Id.
        :param pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleIdArgs']]] config_rule_ids: A list of Config Rule IDs.
        :param pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleArgs']]] config_rules: A list of Config Rules.
        """
        pulumi.set(__self__, "compliance_pack_name", compliance_pack_name)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "risk_level", risk_level)
        if compliance_pack_template_id is not None:
            pulumi.set(__self__, "compliance_pack_template_id", compliance_pack_template_id)
        if config_rule_ids is not None:
            pulumi.set(__self__, "config_rule_ids", config_rule_ids)
        if config_rules is not None:
            warnings.warn("""Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead.""", DeprecationWarning)
            pulumi.log.warn("""config_rules is deprecated: Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead.""")
        if config_rules is not None:
            pulumi.set(__self__, "config_rules", config_rules)

    @property
    @pulumi.getter(name="compliancePackName")
    def compliance_pack_name(self) -> pulumi.Input[str]:
        """
        The Compliance Package Name. . **NOTE:** the `compliance_pack_name` supports modification since V1.146.0.
        """
        return pulumi.get(self, "compliance_pack_name")

    @compliance_pack_name.setter
    def compliance_pack_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "compliance_pack_name", value)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        The Description of compliance pack.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="riskLevel")
    def risk_level(self) -> pulumi.Input[int]:
        """
        The Risk Level. Valid values:  `1`: critical, `2`: warning, `3`: info.
        """
        return pulumi.get(self, "risk_level")

    @risk_level.setter
    def risk_level(self, value: pulumi.Input[int]):
        pulumi.set(self, "risk_level", value)

    @property
    @pulumi.getter(name="compliancePackTemplateId")
    def compliance_pack_template_id(self) -> Optional[pulumi.Input[str]]:
        """
        Compliance Package Template Id.
        """
        return pulumi.get(self, "compliance_pack_template_id")

    @compliance_pack_template_id.setter
    def compliance_pack_template_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compliance_pack_template_id", value)

    @property
    @pulumi.getter(name="configRuleIds")
    def config_rule_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleIdArgs']]]]:
        """
        A list of Config Rule IDs.
        """
        return pulumi.get(self, "config_rule_ids")

    @config_rule_ids.setter
    def config_rule_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleIdArgs']]]]):
        pulumi.set(self, "config_rule_ids", value)

    @property
    @pulumi.getter(name="configRules")
    def config_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleArgs']]]]:
        """
        A list of Config Rules.
        """
        return pulumi.get(self, "config_rules")

    @config_rules.setter
    def config_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleArgs']]]]):
        pulumi.set(self, "config_rules", value)


@pulumi.input_type
class _CompliancePackState:
    def __init__(__self__, *,
                 compliance_pack_name: Optional[pulumi.Input[str]] = None,
                 compliance_pack_template_id: Optional[pulumi.Input[str]] = None,
                 config_rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleIdArgs']]]] = None,
                 config_rules: Optional[pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleArgs']]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 risk_level: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CompliancePack resources.
        :param pulumi.Input[str] compliance_pack_name: The Compliance Package Name. . **NOTE:** the `compliance_pack_name` supports modification since V1.146.0.
        :param pulumi.Input[str] compliance_pack_template_id: Compliance Package Template Id.
        :param pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleIdArgs']]] config_rule_ids: A list of Config Rule IDs.
        :param pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleArgs']]] config_rules: A list of Config Rules.
        :param pulumi.Input[str] description: The Description of compliance pack.
        :param pulumi.Input[int] risk_level: The Risk Level. Valid values:  `1`: critical, `2`: warning, `3`: info.
        :param pulumi.Input[str] status: The status of the resource. The valid values: `CREATING`, `ACTIVE`.
        """
        if compliance_pack_name is not None:
            pulumi.set(__self__, "compliance_pack_name", compliance_pack_name)
        if compliance_pack_template_id is not None:
            pulumi.set(__self__, "compliance_pack_template_id", compliance_pack_template_id)
        if config_rule_ids is not None:
            pulumi.set(__self__, "config_rule_ids", config_rule_ids)
        if config_rules is not None:
            warnings.warn("""Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead.""", DeprecationWarning)
            pulumi.log.warn("""config_rules is deprecated: Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead.""")
        if config_rules is not None:
            pulumi.set(__self__, "config_rules", config_rules)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if risk_level is not None:
            pulumi.set(__self__, "risk_level", risk_level)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="compliancePackName")
    def compliance_pack_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Compliance Package Name. . **NOTE:** the `compliance_pack_name` supports modification since V1.146.0.
        """
        return pulumi.get(self, "compliance_pack_name")

    @compliance_pack_name.setter
    def compliance_pack_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compliance_pack_name", value)

    @property
    @pulumi.getter(name="compliancePackTemplateId")
    def compliance_pack_template_id(self) -> Optional[pulumi.Input[str]]:
        """
        Compliance Package Template Id.
        """
        return pulumi.get(self, "compliance_pack_template_id")

    @compliance_pack_template_id.setter
    def compliance_pack_template_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compliance_pack_template_id", value)

    @property
    @pulumi.getter(name="configRuleIds")
    def config_rule_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleIdArgs']]]]:
        """
        A list of Config Rule IDs.
        """
        return pulumi.get(self, "config_rule_ids")

    @config_rule_ids.setter
    def config_rule_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleIdArgs']]]]):
        pulumi.set(self, "config_rule_ids", value)

    @property
    @pulumi.getter(name="configRules")
    def config_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleArgs']]]]:
        """
        A list of Config Rules.
        """
        return pulumi.get(self, "config_rules")

    @config_rules.setter
    def config_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CompliancePackConfigRuleArgs']]]]):
        pulumi.set(self, "config_rules", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The Description of compliance pack.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="riskLevel")
    def risk_level(self) -> Optional[pulumi.Input[int]]:
        """
        The Risk Level. Valid values:  `1`: critical, `2`: warning, `3`: info.
        """
        return pulumi.get(self, "risk_level")

    @risk_level.setter
    def risk_level(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "risk_level", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource. The valid values: `CREATING`, `ACTIVE`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class CompliancePack(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compliance_pack_name: Optional[pulumi.Input[str]] = None,
                 compliance_pack_template_id: Optional[pulumi.Input[str]] = None,
                 config_rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CompliancePackConfigRuleIdArgs']]]]] = None,
                 config_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CompliancePackConfigRuleArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 risk_level: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a Cloud Config Compliance Pack resource.

        For information about Cloud Config Compliance Pack and how to use it, see [What is Compliance Pack](https://www.alibabacloud.com/help/en/doc-detail/194753.html).

        > **NOTE:** Available in v1.124.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "example_name"
        default_instances = alicloud.ecs.get_instances()
        default_resource_groups = alicloud.resourcemanager.get_resource_groups(status="OK")
        default_rule = alicloud.cfg.Rule("defaultRule",
            rule_name=name,
            description=name,
            source_identifier="ecs-instances-in-vpc",
            source_owner="ALIYUN",
            resource_types_scopes=["ACS::ECS::Instance"],
            risk_level=1,
            config_rule_trigger_types="ConfigurationItemChangeNotification",
            tag_key_scope="tfTest",
            tag_value_scope="tfTest 123",
            resource_group_ids_scope=default_resource_groups.ids[0],
            exclude_resource_ids_scope=default_instances.instances[0].id,
            region_ids_scope="cn-hangzhou",
            input_parameters={
                "vpcIds": default_instances.instances[0].vpc_id,
            })
        default_compliance_pack = alicloud.cfg.CompliancePack("defaultCompliancePack",
            compliance_pack_name="tf-testaccConfig1234",
            description="tf-testaccConfig1234",
            risk_level=1,
            config_rule_ids=[alicloud.cfg.CompliancePackConfigRuleIdArgs(
                config_rule_id=default_rule.id,
            )])
        ```

        ## Import

        Cloud Config Compliance Pack can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cfg/compliancePack:CompliancePack example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] compliance_pack_name: The Compliance Package Name. . **NOTE:** the `compliance_pack_name` supports modification since V1.146.0.
        :param pulumi.Input[str] compliance_pack_template_id: Compliance Package Template Id.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CompliancePackConfigRuleIdArgs']]]] config_rule_ids: A list of Config Rule IDs.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CompliancePackConfigRuleArgs']]]] config_rules: A list of Config Rules.
        :param pulumi.Input[str] description: The Description of compliance pack.
        :param pulumi.Input[int] risk_level: The Risk Level. Valid values:  `1`: critical, `2`: warning, `3`: info.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CompliancePackArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Config Compliance Pack resource.

        For information about Cloud Config Compliance Pack and how to use it, see [What is Compliance Pack](https://www.alibabacloud.com/help/en/doc-detail/194753.html).

        > **NOTE:** Available in v1.124.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "example_name"
        default_instances = alicloud.ecs.get_instances()
        default_resource_groups = alicloud.resourcemanager.get_resource_groups(status="OK")
        default_rule = alicloud.cfg.Rule("defaultRule",
            rule_name=name,
            description=name,
            source_identifier="ecs-instances-in-vpc",
            source_owner="ALIYUN",
            resource_types_scopes=["ACS::ECS::Instance"],
            risk_level=1,
            config_rule_trigger_types="ConfigurationItemChangeNotification",
            tag_key_scope="tfTest",
            tag_value_scope="tfTest 123",
            resource_group_ids_scope=default_resource_groups.ids[0],
            exclude_resource_ids_scope=default_instances.instances[0].id,
            region_ids_scope="cn-hangzhou",
            input_parameters={
                "vpcIds": default_instances.instances[0].vpc_id,
            })
        default_compliance_pack = alicloud.cfg.CompliancePack("defaultCompliancePack",
            compliance_pack_name="tf-testaccConfig1234",
            description="tf-testaccConfig1234",
            risk_level=1,
            config_rule_ids=[alicloud.cfg.CompliancePackConfigRuleIdArgs(
                config_rule_id=default_rule.id,
            )])
        ```

        ## Import

        Cloud Config Compliance Pack can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cfg/compliancePack:CompliancePack example <id>
        ```

        :param str resource_name: The name of the resource.
        :param CompliancePackArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CompliancePackArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compliance_pack_name: Optional[pulumi.Input[str]] = None,
                 compliance_pack_template_id: Optional[pulumi.Input[str]] = None,
                 config_rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CompliancePackConfigRuleIdArgs']]]]] = None,
                 config_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CompliancePackConfigRuleArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 risk_level: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CompliancePackArgs.__new__(CompliancePackArgs)

            if compliance_pack_name is None and not opts.urn:
                raise TypeError("Missing required property 'compliance_pack_name'")
            __props__.__dict__["compliance_pack_name"] = compliance_pack_name
            __props__.__dict__["compliance_pack_template_id"] = compliance_pack_template_id
            __props__.__dict__["config_rule_ids"] = config_rule_ids
            if config_rules is not None and not opts.urn:
                warnings.warn("""Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead.""", DeprecationWarning)
                pulumi.log.warn("""config_rules is deprecated: Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead.""")
            __props__.__dict__["config_rules"] = config_rules
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if risk_level is None and not opts.urn:
                raise TypeError("Missing required property 'risk_level'")
            __props__.__dict__["risk_level"] = risk_level
            __props__.__dict__["status"] = None
        super(CompliancePack, __self__).__init__(
            'alicloud:cfg/compliancePack:CompliancePack',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            compliance_pack_name: Optional[pulumi.Input[str]] = None,
            compliance_pack_template_id: Optional[pulumi.Input[str]] = None,
            config_rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CompliancePackConfigRuleIdArgs']]]]] = None,
            config_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CompliancePackConfigRuleArgs']]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            risk_level: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'CompliancePack':
        """
        Get an existing CompliancePack resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] compliance_pack_name: The Compliance Package Name. . **NOTE:** the `compliance_pack_name` supports modification since V1.146.0.
        :param pulumi.Input[str] compliance_pack_template_id: Compliance Package Template Id.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CompliancePackConfigRuleIdArgs']]]] config_rule_ids: A list of Config Rule IDs.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CompliancePackConfigRuleArgs']]]] config_rules: A list of Config Rules.
        :param pulumi.Input[str] description: The Description of compliance pack.
        :param pulumi.Input[int] risk_level: The Risk Level. Valid values:  `1`: critical, `2`: warning, `3`: info.
        :param pulumi.Input[str] status: The status of the resource. The valid values: `CREATING`, `ACTIVE`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CompliancePackState.__new__(_CompliancePackState)

        __props__.__dict__["compliance_pack_name"] = compliance_pack_name
        __props__.__dict__["compliance_pack_template_id"] = compliance_pack_template_id
        __props__.__dict__["config_rule_ids"] = config_rule_ids
        __props__.__dict__["config_rules"] = config_rules
        __props__.__dict__["description"] = description
        __props__.__dict__["risk_level"] = risk_level
        __props__.__dict__["status"] = status
        return CompliancePack(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="compliancePackName")
    def compliance_pack_name(self) -> pulumi.Output[str]:
        """
        The Compliance Package Name. . **NOTE:** the `compliance_pack_name` supports modification since V1.146.0.
        """
        return pulumi.get(self, "compliance_pack_name")

    @property
    @pulumi.getter(name="compliancePackTemplateId")
    def compliance_pack_template_id(self) -> pulumi.Output[Optional[str]]:
        """
        Compliance Package Template Id.
        """
        return pulumi.get(self, "compliance_pack_template_id")

    @property
    @pulumi.getter(name="configRuleIds")
    def config_rule_ids(self) -> pulumi.Output[Optional[Sequence['outputs.CompliancePackConfigRuleId']]]:
        """
        A list of Config Rule IDs.
        """
        return pulumi.get(self, "config_rule_ids")

    @property
    @pulumi.getter(name="configRules")
    def config_rules(self) -> pulumi.Output[Optional[Sequence['outputs.CompliancePackConfigRule']]]:
        """
        A list of Config Rules.
        """
        return pulumi.get(self, "config_rules")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The Description of compliance pack.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="riskLevel")
    def risk_level(self) -> pulumi.Output[int]:
        """
        The Risk Level. Valid values:  `1`: critical, `2`: warning, `3`: info.
        """
        return pulumi.get(self, "risk_level")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource. The valid values: `CREATING`, `ACTIVE`.
        """
        return pulumi.get(self, "status")

