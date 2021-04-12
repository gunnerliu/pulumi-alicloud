# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['ApplicationInfoArgs', 'ApplicationInfo']

@pulumi.input_type
class ApplicationInfoArgs:
    def __init__(__self__, *,
                 desire_value: pulumi.Input[float],
                 product_code: pulumi.Input[str],
                 quota_action_code: pulumi.Input[str],
                 reason: pulumi.Input[str],
                 audit_mode: Optional[pulumi.Input[str]] = None,
                 dimensions: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationInfoDimensionArgs']]]] = None,
                 notice_type: Optional[pulumi.Input[int]] = None,
                 quota_category: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ApplicationInfo resource.
        """
        pulumi.set(__self__, "desire_value", desire_value)
        pulumi.set(__self__, "product_code", product_code)
        pulumi.set(__self__, "quota_action_code", quota_action_code)
        pulumi.set(__self__, "reason", reason)
        if audit_mode is not None:
            pulumi.set(__self__, "audit_mode", audit_mode)
        if dimensions is not None:
            pulumi.set(__self__, "dimensions", dimensions)
        if notice_type is not None:
            pulumi.set(__self__, "notice_type", notice_type)
        if quota_category is not None:
            pulumi.set(__self__, "quota_category", quota_category)

    @property
    @pulumi.getter(name="desireValue")
    def desire_value(self) -> pulumi.Input[float]:
        return pulumi.get(self, "desire_value")

    @desire_value.setter
    def desire_value(self, value: pulumi.Input[float]):
        pulumi.set(self, "desire_value", value)

    @property
    @pulumi.getter(name="productCode")
    def product_code(self) -> pulumi.Input[str]:
        return pulumi.get(self, "product_code")

    @product_code.setter
    def product_code(self, value: pulumi.Input[str]):
        pulumi.set(self, "product_code", value)

    @property
    @pulumi.getter(name="quotaActionCode")
    def quota_action_code(self) -> pulumi.Input[str]:
        return pulumi.get(self, "quota_action_code")

    @quota_action_code.setter
    def quota_action_code(self, value: pulumi.Input[str]):
        pulumi.set(self, "quota_action_code", value)

    @property
    @pulumi.getter
    def reason(self) -> pulumi.Input[str]:
        return pulumi.get(self, "reason")

    @reason.setter
    def reason(self, value: pulumi.Input[str]):
        pulumi.set(self, "reason", value)

    @property
    @pulumi.getter(name="auditMode")
    def audit_mode(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "audit_mode")

    @audit_mode.setter
    def audit_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "audit_mode", value)

    @property
    @pulumi.getter
    def dimensions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationInfoDimensionArgs']]]]:
        return pulumi.get(self, "dimensions")

    @dimensions.setter
    def dimensions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApplicationInfoDimensionArgs']]]]):
        pulumi.set(self, "dimensions", value)

    @property
    @pulumi.getter(name="noticeType")
    def notice_type(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "notice_type")

    @notice_type.setter
    def notice_type(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "notice_type", value)

    @property
    @pulumi.getter(name="quotaCategory")
    def quota_category(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "quota_category")

    @quota_category.setter
    def quota_category(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "quota_category", value)


class ApplicationInfo(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 audit_mode: Optional[pulumi.Input[str]] = None,
                 desire_value: Optional[pulumi.Input[float]] = None,
                 dimensions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApplicationInfoDimensionArgs']]]]] = None,
                 notice_type: Optional[pulumi.Input[int]] = None,
                 product_code: Optional[pulumi.Input[str]] = None,
                 quota_action_code: Optional[pulumi.Input[str]] = None,
                 quota_category: Optional[pulumi.Input[str]] = None,
                 reason: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a ApplicationInfo resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplicationInfoArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a ApplicationInfo resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param ApplicationInfoArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplicationInfoArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 audit_mode: Optional[pulumi.Input[str]] = None,
                 desire_value: Optional[pulumi.Input[float]] = None,
                 dimensions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApplicationInfoDimensionArgs']]]]] = None,
                 notice_type: Optional[pulumi.Input[int]] = None,
                 product_code: Optional[pulumi.Input[str]] = None,
                 quota_action_code: Optional[pulumi.Input[str]] = None,
                 quota_category: Optional[pulumi.Input[str]] = None,
                 reason: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

            __props__['audit_mode'] = audit_mode
            if desire_value is None and not opts.urn:
                raise TypeError("Missing required property 'desire_value'")
            __props__['desire_value'] = desire_value
            __props__['dimensions'] = dimensions
            __props__['notice_type'] = notice_type
            if product_code is None and not opts.urn:
                raise TypeError("Missing required property 'product_code'")
            __props__['product_code'] = product_code
            if quota_action_code is None and not opts.urn:
                raise TypeError("Missing required property 'quota_action_code'")
            __props__['quota_action_code'] = quota_action_code
            __props__['quota_category'] = quota_category
            if reason is None and not opts.urn:
                raise TypeError("Missing required property 'reason'")
            __props__['reason'] = reason
            __props__['approve_value'] = None
            __props__['audit_reason'] = None
            __props__['effective_time'] = None
            __props__['expire_time'] = None
            __props__['quota_description'] = None
            __props__['quota_name'] = None
            __props__['quota_unit'] = None
            __props__['status'] = None
        super(ApplicationInfo, __self__).__init__(
            'alicloud:quotas/applicationInfo:ApplicationInfo',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            approve_value: Optional[pulumi.Input[str]] = None,
            audit_mode: Optional[pulumi.Input[str]] = None,
            audit_reason: Optional[pulumi.Input[str]] = None,
            desire_value: Optional[pulumi.Input[float]] = None,
            dimensions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApplicationInfoDimensionArgs']]]]] = None,
            effective_time: Optional[pulumi.Input[str]] = None,
            expire_time: Optional[pulumi.Input[str]] = None,
            notice_type: Optional[pulumi.Input[int]] = None,
            product_code: Optional[pulumi.Input[str]] = None,
            quota_action_code: Optional[pulumi.Input[str]] = None,
            quota_category: Optional[pulumi.Input[str]] = None,
            quota_description: Optional[pulumi.Input[str]] = None,
            quota_name: Optional[pulumi.Input[str]] = None,
            quota_unit: Optional[pulumi.Input[str]] = None,
            reason: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'ApplicationInfo':
        """
        Get an existing ApplicationInfo resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["approve_value"] = approve_value
        __props__["audit_mode"] = audit_mode
        __props__["audit_reason"] = audit_reason
        __props__["desire_value"] = desire_value
        __props__["dimensions"] = dimensions
        __props__["effective_time"] = effective_time
        __props__["expire_time"] = expire_time
        __props__["notice_type"] = notice_type
        __props__["product_code"] = product_code
        __props__["quota_action_code"] = quota_action_code
        __props__["quota_category"] = quota_category
        __props__["quota_description"] = quota_description
        __props__["quota_name"] = quota_name
        __props__["quota_unit"] = quota_unit
        __props__["reason"] = reason
        __props__["status"] = status
        return ApplicationInfo(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="approveValue")
    def approve_value(self) -> pulumi.Output[str]:
        return pulumi.get(self, "approve_value")

    @property
    @pulumi.getter(name="auditMode")
    def audit_mode(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "audit_mode")

    @property
    @pulumi.getter(name="auditReason")
    def audit_reason(self) -> pulumi.Output[str]:
        return pulumi.get(self, "audit_reason")

    @property
    @pulumi.getter(name="desireValue")
    def desire_value(self) -> pulumi.Output[float]:
        return pulumi.get(self, "desire_value")

    @property
    @pulumi.getter
    def dimensions(self) -> pulumi.Output[Optional[Sequence['outputs.ApplicationInfoDimension']]]:
        return pulumi.get(self, "dimensions")

    @property
    @pulumi.getter(name="effectiveTime")
    def effective_time(self) -> pulumi.Output[str]:
        return pulumi.get(self, "effective_time")

    @property
    @pulumi.getter(name="expireTime")
    def expire_time(self) -> pulumi.Output[str]:
        return pulumi.get(self, "expire_time")

    @property
    @pulumi.getter(name="noticeType")
    def notice_type(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "notice_type")

    @property
    @pulumi.getter(name="productCode")
    def product_code(self) -> pulumi.Output[str]:
        return pulumi.get(self, "product_code")

    @property
    @pulumi.getter(name="quotaActionCode")
    def quota_action_code(self) -> pulumi.Output[str]:
        return pulumi.get(self, "quota_action_code")

    @property
    @pulumi.getter(name="quotaCategory")
    def quota_category(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "quota_category")

    @property
    @pulumi.getter(name="quotaDescription")
    def quota_description(self) -> pulumi.Output[str]:
        return pulumi.get(self, "quota_description")

    @property
    @pulumi.getter(name="quotaName")
    def quota_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "quota_name")

    @property
    @pulumi.getter(name="quotaUnit")
    def quota_unit(self) -> pulumi.Output[str]:
        return pulumi.get(self, "quota_unit")

    @property
    @pulumi.getter
    def reason(self) -> pulumi.Output[str]:
        return pulumi.get(self, "reason")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        return pulumi.get(self, "status")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

