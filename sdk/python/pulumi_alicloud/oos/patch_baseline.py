# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PatchBaselineArgs', 'PatchBaseline']

@pulumi.input_type
class PatchBaselineArgs:
    def __init__(__self__, *,
                 approval_rules: pulumi.Input[str],
                 operation_system: pulumi.Input[str],
                 patch_baseline_name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PatchBaseline resource.
        :param pulumi.Input[str] approval_rules: Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
        :param pulumi.Input[str] operation_system: Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`, `AlmaLinux`.
        :param pulumi.Input[str] patch_baseline_name: The name of the patch baseline.
        :param pulumi.Input[str] description: Patches baseline description information.
        """
        pulumi.set(__self__, "approval_rules", approval_rules)
        pulumi.set(__self__, "operation_system", operation_system)
        pulumi.set(__self__, "patch_baseline_name", patch_baseline_name)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter(name="approvalRules")
    def approval_rules(self) -> pulumi.Input[str]:
        """
        Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
        """
        return pulumi.get(self, "approval_rules")

    @approval_rules.setter
    def approval_rules(self, value: pulumi.Input[str]):
        pulumi.set(self, "approval_rules", value)

    @property
    @pulumi.getter(name="operationSystem")
    def operation_system(self) -> pulumi.Input[str]:
        """
        Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`, `AlmaLinux`.
        """
        return pulumi.get(self, "operation_system")

    @operation_system.setter
    def operation_system(self, value: pulumi.Input[str]):
        pulumi.set(self, "operation_system", value)

    @property
    @pulumi.getter(name="patchBaselineName")
    def patch_baseline_name(self) -> pulumi.Input[str]:
        """
        The name of the patch baseline.
        """
        return pulumi.get(self, "patch_baseline_name")

    @patch_baseline_name.setter
    def patch_baseline_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "patch_baseline_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Patches baseline description information.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _PatchBaselineState:
    def __init__(__self__, *,
                 approval_rules: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 operation_system: Optional[pulumi.Input[str]] = None,
                 patch_baseline_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PatchBaseline resources.
        :param pulumi.Input[str] approval_rules: Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
        :param pulumi.Input[str] description: Patches baseline description information.
        :param pulumi.Input[str] operation_system: Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`, `AlmaLinux`.
        :param pulumi.Input[str] patch_baseline_name: The name of the patch baseline.
        """
        if approval_rules is not None:
            pulumi.set(__self__, "approval_rules", approval_rules)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if operation_system is not None:
            pulumi.set(__self__, "operation_system", operation_system)
        if patch_baseline_name is not None:
            pulumi.set(__self__, "patch_baseline_name", patch_baseline_name)

    @property
    @pulumi.getter(name="approvalRules")
    def approval_rules(self) -> Optional[pulumi.Input[str]]:
        """
        Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
        """
        return pulumi.get(self, "approval_rules")

    @approval_rules.setter
    def approval_rules(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "approval_rules", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Patches baseline description information.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="operationSystem")
    def operation_system(self) -> Optional[pulumi.Input[str]]:
        """
        Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`, `AlmaLinux`.
        """
        return pulumi.get(self, "operation_system")

    @operation_system.setter
    def operation_system(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "operation_system", value)

    @property
    @pulumi.getter(name="patchBaselineName")
    def patch_baseline_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the patch baseline.
        """
        return pulumi.get(self, "patch_baseline_name")

    @patch_baseline_name.setter
    def patch_baseline_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "patch_baseline_name", value)


class PatchBaseline(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 approval_rules: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 operation_system: Optional[pulumi.Input[str]] = None,
                 patch_baseline_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a OOS Patch Baseline resource.

        For information about OOS Patch Baseline and how to use it, see [What is Patch Baseline](https://www.alibabacloud.com/help/en/doc-detail/268700.html).

        > **NOTE:** Available in v1.146.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.oos.PatchBaseline("example",
            approval_rules="example_value",
            operation_system="Windows",
            patch_baseline_name="my-PatchBaseline")
        ```

        ## Import

        OOS Patch Baseline can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:oos/patchBaseline:PatchBaseline example <patch_baseline_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] approval_rules: Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
        :param pulumi.Input[str] description: Patches baseline description information.
        :param pulumi.Input[str] operation_system: Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`, `AlmaLinux`.
        :param pulumi.Input[str] patch_baseline_name: The name of the patch baseline.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PatchBaselineArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a OOS Patch Baseline resource.

        For information about OOS Patch Baseline and how to use it, see [What is Patch Baseline](https://www.alibabacloud.com/help/en/doc-detail/268700.html).

        > **NOTE:** Available in v1.146.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.oos.PatchBaseline("example",
            approval_rules="example_value",
            operation_system="Windows",
            patch_baseline_name="my-PatchBaseline")
        ```

        ## Import

        OOS Patch Baseline can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:oos/patchBaseline:PatchBaseline example <patch_baseline_name>
        ```

        :param str resource_name: The name of the resource.
        :param PatchBaselineArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PatchBaselineArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 approval_rules: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 operation_system: Optional[pulumi.Input[str]] = None,
                 patch_baseline_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PatchBaselineArgs.__new__(PatchBaselineArgs)

            if approval_rules is None and not opts.urn:
                raise TypeError("Missing required property 'approval_rules'")
            __props__.__dict__["approval_rules"] = approval_rules
            __props__.__dict__["description"] = description
            if operation_system is None and not opts.urn:
                raise TypeError("Missing required property 'operation_system'")
            __props__.__dict__["operation_system"] = operation_system
            if patch_baseline_name is None and not opts.urn:
                raise TypeError("Missing required property 'patch_baseline_name'")
            __props__.__dict__["patch_baseline_name"] = patch_baseline_name
        super(PatchBaseline, __self__).__init__(
            'alicloud:oos/patchBaseline:PatchBaseline',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            approval_rules: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            operation_system: Optional[pulumi.Input[str]] = None,
            patch_baseline_name: Optional[pulumi.Input[str]] = None) -> 'PatchBaseline':
        """
        Get an existing PatchBaseline resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] approval_rules: Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
        :param pulumi.Input[str] description: Patches baseline description information.
        :param pulumi.Input[str] operation_system: Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`, `AlmaLinux`.
        :param pulumi.Input[str] patch_baseline_name: The name of the patch baseline.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PatchBaselineState.__new__(_PatchBaselineState)

        __props__.__dict__["approval_rules"] = approval_rules
        __props__.__dict__["description"] = description
        __props__.__dict__["operation_system"] = operation_system
        __props__.__dict__["patch_baseline_name"] = patch_baseline_name
        return PatchBaseline(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="approvalRules")
    def approval_rules(self) -> pulumi.Output[str]:
        """
        Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
        """
        return pulumi.get(self, "approval_rules")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Patches baseline description information.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="operationSystem")
    def operation_system(self) -> pulumi.Output[str]:
        """
        Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`, `AlmaLinux`.
        """
        return pulumi.get(self, "operation_system")

    @property
    @pulumi.getter(name="patchBaselineName")
    def patch_baseline_name(self) -> pulumi.Output[str]:
        """
        The name of the patch baseline.
        """
        return pulumi.get(self, "patch_baseline_name")

