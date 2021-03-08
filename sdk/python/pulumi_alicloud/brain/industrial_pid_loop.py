# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['IndustrialPidLoop']


class IndustrialPidLoop(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 pid_loop_configuration: Optional[pulumi.Input[str]] = None,
                 pid_loop_dcs_type: Optional[pulumi.Input[str]] = None,
                 pid_loop_desc: Optional[pulumi.Input[str]] = None,
                 pid_loop_is_crucial: Optional[pulumi.Input[bool]] = None,
                 pid_loop_name: Optional[pulumi.Input[str]] = None,
                 pid_loop_type: Optional[pulumi.Input[str]] = None,
                 pid_project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Brain Industrial Pid Loop resource.

        > **NOTE:** Available in v1.117.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.brain.IndustrialPidLoop("example",
            pid_loop_configuration="YourLoopConfiguration",
            pid_loop_dcs_type="standard",
            pid_loop_is_crucial=True,
            pid_loop_name="tf-testAcc",
            pid_loop_type="0",
            pid_project_id="856c6b8f-ca63-40a4-xxxx-xxxx")
        ```

        ## Import

        Brain Industrial Pid Loop can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:brain/industrialPidLoop:IndustrialPidLoop example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] pid_loop_configuration: The Pid Loop Configuration.
        :param pulumi.Input[str] pid_loop_dcs_type: The dcs type of Pid Loop. Valid values: `standard`.
        :param pulumi.Input[str] pid_loop_desc: The desc of Pid Loop.
        :param pulumi.Input[bool] pid_loop_is_crucial: Whether is crucial Pid Loop.
        :param pulumi.Input[str] pid_loop_name: The name of Pid Loop.
        :param pulumi.Input[str] pid_loop_type: The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
        :param pulumi.Input[str] pid_project_id: The pid project id.
        """
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

            if pid_loop_configuration is None and not opts.urn:
                raise TypeError("Missing required property 'pid_loop_configuration'")
            __props__['pid_loop_configuration'] = pid_loop_configuration
            if pid_loop_dcs_type is None and not opts.urn:
                raise TypeError("Missing required property 'pid_loop_dcs_type'")
            __props__['pid_loop_dcs_type'] = pid_loop_dcs_type
            __props__['pid_loop_desc'] = pid_loop_desc
            if pid_loop_is_crucial is None and not opts.urn:
                raise TypeError("Missing required property 'pid_loop_is_crucial'")
            __props__['pid_loop_is_crucial'] = pid_loop_is_crucial
            if pid_loop_name is None and not opts.urn:
                raise TypeError("Missing required property 'pid_loop_name'")
            __props__['pid_loop_name'] = pid_loop_name
            if pid_loop_type is None and not opts.urn:
                raise TypeError("Missing required property 'pid_loop_type'")
            __props__['pid_loop_type'] = pid_loop_type
            if pid_project_id is None and not opts.urn:
                raise TypeError("Missing required property 'pid_project_id'")
            __props__['pid_project_id'] = pid_project_id
            __props__['status'] = None
        super(IndustrialPidLoop, __self__).__init__(
            'alicloud:brain/industrialPidLoop:IndustrialPidLoop',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            pid_loop_configuration: Optional[pulumi.Input[str]] = None,
            pid_loop_dcs_type: Optional[pulumi.Input[str]] = None,
            pid_loop_desc: Optional[pulumi.Input[str]] = None,
            pid_loop_is_crucial: Optional[pulumi.Input[bool]] = None,
            pid_loop_name: Optional[pulumi.Input[str]] = None,
            pid_loop_type: Optional[pulumi.Input[str]] = None,
            pid_project_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'IndustrialPidLoop':
        """
        Get an existing IndustrialPidLoop resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] pid_loop_configuration: The Pid Loop Configuration.
        :param pulumi.Input[str] pid_loop_dcs_type: The dcs type of Pid Loop. Valid values: `standard`.
        :param pulumi.Input[str] pid_loop_desc: The desc of Pid Loop.
        :param pulumi.Input[bool] pid_loop_is_crucial: Whether is crucial Pid Loop.
        :param pulumi.Input[str] pid_loop_name: The name of Pid Loop.
        :param pulumi.Input[str] pid_loop_type: The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
        :param pulumi.Input[str] pid_project_id: The pid project id.
        :param pulumi.Input[str] status: The status of Pid Loop.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["pid_loop_configuration"] = pid_loop_configuration
        __props__["pid_loop_dcs_type"] = pid_loop_dcs_type
        __props__["pid_loop_desc"] = pid_loop_desc
        __props__["pid_loop_is_crucial"] = pid_loop_is_crucial
        __props__["pid_loop_name"] = pid_loop_name
        __props__["pid_loop_type"] = pid_loop_type
        __props__["pid_project_id"] = pid_project_id
        __props__["status"] = status
        return IndustrialPidLoop(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="pidLoopConfiguration")
    def pid_loop_configuration(self) -> pulumi.Output[str]:
        """
        The Pid Loop Configuration.
        """
        return pulumi.get(self, "pid_loop_configuration")

    @property
    @pulumi.getter(name="pidLoopDcsType")
    def pid_loop_dcs_type(self) -> pulumi.Output[str]:
        """
        The dcs type of Pid Loop. Valid values: `standard`.
        """
        return pulumi.get(self, "pid_loop_dcs_type")

    @property
    @pulumi.getter(name="pidLoopDesc")
    def pid_loop_desc(self) -> pulumi.Output[Optional[str]]:
        """
        The desc of Pid Loop.
        """
        return pulumi.get(self, "pid_loop_desc")

    @property
    @pulumi.getter(name="pidLoopIsCrucial")
    def pid_loop_is_crucial(self) -> pulumi.Output[bool]:
        """
        Whether is crucial Pid Loop.
        """
        return pulumi.get(self, "pid_loop_is_crucial")

    @property
    @pulumi.getter(name="pidLoopName")
    def pid_loop_name(self) -> pulumi.Output[str]:
        """
        The name of Pid Loop.
        """
        return pulumi.get(self, "pid_loop_name")

    @property
    @pulumi.getter(name="pidLoopType")
    def pid_loop_type(self) -> pulumi.Output[str]:
        """
        The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
        """
        return pulumi.get(self, "pid_loop_type")

    @property
    @pulumi.getter(name="pidProjectId")
    def pid_project_id(self) -> pulumi.Output[str]:
        """
        The pid project id.
        """
        return pulumi.get(self, "pid_project_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of Pid Loop.
        """
        return pulumi.get(self, "status")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

