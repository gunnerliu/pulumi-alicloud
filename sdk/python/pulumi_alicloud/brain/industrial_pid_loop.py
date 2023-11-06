# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['IndustrialPidLoopArgs', 'IndustrialPidLoop']

@pulumi.input_type
class IndustrialPidLoopArgs:
    def __init__(__self__, *,
                 pid_loop_configuration: pulumi.Input[str],
                 pid_loop_dcs_type: pulumi.Input[str],
                 pid_loop_is_crucial: pulumi.Input[bool],
                 pid_loop_name: pulumi.Input[str],
                 pid_loop_type: pulumi.Input[str],
                 pid_project_id: pulumi.Input[str],
                 pid_loop_desc: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a IndustrialPidLoop resource.
        :param pulumi.Input[str] pid_loop_configuration: The Pid Loop Configuration.
        :param pulumi.Input[str] pid_loop_dcs_type: The dcs type of Pid Loop. Valid values: `standard`.
        :param pulumi.Input[bool] pid_loop_is_crucial: Whether is crucial Pid Loop.
        :param pulumi.Input[str] pid_loop_name: The name of Pid Loop.
        :param pulumi.Input[str] pid_loop_type: The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
        :param pulumi.Input[str] pid_project_id: The pid project id.
        :param pulumi.Input[str] pid_loop_desc: The desc of Pid Loop.
        """
        IndustrialPidLoopArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            pid_loop_configuration=pid_loop_configuration,
            pid_loop_dcs_type=pid_loop_dcs_type,
            pid_loop_is_crucial=pid_loop_is_crucial,
            pid_loop_name=pid_loop_name,
            pid_loop_type=pid_loop_type,
            pid_project_id=pid_project_id,
            pid_loop_desc=pid_loop_desc,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             pid_loop_configuration: Optional[pulumi.Input[str]] = None,
             pid_loop_dcs_type: Optional[pulumi.Input[str]] = None,
             pid_loop_is_crucial: Optional[pulumi.Input[bool]] = None,
             pid_loop_name: Optional[pulumi.Input[str]] = None,
             pid_loop_type: Optional[pulumi.Input[str]] = None,
             pid_project_id: Optional[pulumi.Input[str]] = None,
             pid_loop_desc: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if pid_loop_configuration is None and 'pidLoopConfiguration' in kwargs:
            pid_loop_configuration = kwargs['pidLoopConfiguration']
        if pid_loop_configuration is None:
            raise TypeError("Missing 'pid_loop_configuration' argument")
        if pid_loop_dcs_type is None and 'pidLoopDcsType' in kwargs:
            pid_loop_dcs_type = kwargs['pidLoopDcsType']
        if pid_loop_dcs_type is None:
            raise TypeError("Missing 'pid_loop_dcs_type' argument")
        if pid_loop_is_crucial is None and 'pidLoopIsCrucial' in kwargs:
            pid_loop_is_crucial = kwargs['pidLoopIsCrucial']
        if pid_loop_is_crucial is None:
            raise TypeError("Missing 'pid_loop_is_crucial' argument")
        if pid_loop_name is None and 'pidLoopName' in kwargs:
            pid_loop_name = kwargs['pidLoopName']
        if pid_loop_name is None:
            raise TypeError("Missing 'pid_loop_name' argument")
        if pid_loop_type is None and 'pidLoopType' in kwargs:
            pid_loop_type = kwargs['pidLoopType']
        if pid_loop_type is None:
            raise TypeError("Missing 'pid_loop_type' argument")
        if pid_project_id is None and 'pidProjectId' in kwargs:
            pid_project_id = kwargs['pidProjectId']
        if pid_project_id is None:
            raise TypeError("Missing 'pid_project_id' argument")
        if pid_loop_desc is None and 'pidLoopDesc' in kwargs:
            pid_loop_desc = kwargs['pidLoopDesc']

        _setter("pid_loop_configuration", pid_loop_configuration)
        _setter("pid_loop_dcs_type", pid_loop_dcs_type)
        _setter("pid_loop_is_crucial", pid_loop_is_crucial)
        _setter("pid_loop_name", pid_loop_name)
        _setter("pid_loop_type", pid_loop_type)
        _setter("pid_project_id", pid_project_id)
        if pid_loop_desc is not None:
            _setter("pid_loop_desc", pid_loop_desc)

    @property
    @pulumi.getter(name="pidLoopConfiguration")
    def pid_loop_configuration(self) -> pulumi.Input[str]:
        """
        The Pid Loop Configuration.
        """
        return pulumi.get(self, "pid_loop_configuration")

    @pid_loop_configuration.setter
    def pid_loop_configuration(self, value: pulumi.Input[str]):
        pulumi.set(self, "pid_loop_configuration", value)

    @property
    @pulumi.getter(name="pidLoopDcsType")
    def pid_loop_dcs_type(self) -> pulumi.Input[str]:
        """
        The dcs type of Pid Loop. Valid values: `standard`.
        """
        return pulumi.get(self, "pid_loop_dcs_type")

    @pid_loop_dcs_type.setter
    def pid_loop_dcs_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "pid_loop_dcs_type", value)

    @property
    @pulumi.getter(name="pidLoopIsCrucial")
    def pid_loop_is_crucial(self) -> pulumi.Input[bool]:
        """
        Whether is crucial Pid Loop.
        """
        return pulumi.get(self, "pid_loop_is_crucial")

    @pid_loop_is_crucial.setter
    def pid_loop_is_crucial(self, value: pulumi.Input[bool]):
        pulumi.set(self, "pid_loop_is_crucial", value)

    @property
    @pulumi.getter(name="pidLoopName")
    def pid_loop_name(self) -> pulumi.Input[str]:
        """
        The name of Pid Loop.
        """
        return pulumi.get(self, "pid_loop_name")

    @pid_loop_name.setter
    def pid_loop_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "pid_loop_name", value)

    @property
    @pulumi.getter(name="pidLoopType")
    def pid_loop_type(self) -> pulumi.Input[str]:
        """
        The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
        """
        return pulumi.get(self, "pid_loop_type")

    @pid_loop_type.setter
    def pid_loop_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "pid_loop_type", value)

    @property
    @pulumi.getter(name="pidProjectId")
    def pid_project_id(self) -> pulumi.Input[str]:
        """
        The pid project id.
        """
        return pulumi.get(self, "pid_project_id")

    @pid_project_id.setter
    def pid_project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "pid_project_id", value)

    @property
    @pulumi.getter(name="pidLoopDesc")
    def pid_loop_desc(self) -> Optional[pulumi.Input[str]]:
        """
        The desc of Pid Loop.
        """
        return pulumi.get(self, "pid_loop_desc")

    @pid_loop_desc.setter
    def pid_loop_desc(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pid_loop_desc", value)


@pulumi.input_type
class _IndustrialPidLoopState:
    def __init__(__self__, *,
                 pid_loop_configuration: Optional[pulumi.Input[str]] = None,
                 pid_loop_dcs_type: Optional[pulumi.Input[str]] = None,
                 pid_loop_desc: Optional[pulumi.Input[str]] = None,
                 pid_loop_is_crucial: Optional[pulumi.Input[bool]] = None,
                 pid_loop_name: Optional[pulumi.Input[str]] = None,
                 pid_loop_type: Optional[pulumi.Input[str]] = None,
                 pid_project_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IndustrialPidLoop resources.
        :param pulumi.Input[str] pid_loop_configuration: The Pid Loop Configuration.
        :param pulumi.Input[str] pid_loop_dcs_type: The dcs type of Pid Loop. Valid values: `standard`.
        :param pulumi.Input[str] pid_loop_desc: The desc of Pid Loop.
        :param pulumi.Input[bool] pid_loop_is_crucial: Whether is crucial Pid Loop.
        :param pulumi.Input[str] pid_loop_name: The name of Pid Loop.
        :param pulumi.Input[str] pid_loop_type: The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
        :param pulumi.Input[str] pid_project_id: The pid project id.
        :param pulumi.Input[str] status: The status of Pid Loop.
        """
        _IndustrialPidLoopState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            pid_loop_configuration=pid_loop_configuration,
            pid_loop_dcs_type=pid_loop_dcs_type,
            pid_loop_desc=pid_loop_desc,
            pid_loop_is_crucial=pid_loop_is_crucial,
            pid_loop_name=pid_loop_name,
            pid_loop_type=pid_loop_type,
            pid_project_id=pid_project_id,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             pid_loop_configuration: Optional[pulumi.Input[str]] = None,
             pid_loop_dcs_type: Optional[pulumi.Input[str]] = None,
             pid_loop_desc: Optional[pulumi.Input[str]] = None,
             pid_loop_is_crucial: Optional[pulumi.Input[bool]] = None,
             pid_loop_name: Optional[pulumi.Input[str]] = None,
             pid_loop_type: Optional[pulumi.Input[str]] = None,
             pid_project_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if pid_loop_configuration is None and 'pidLoopConfiguration' in kwargs:
            pid_loop_configuration = kwargs['pidLoopConfiguration']
        if pid_loop_dcs_type is None and 'pidLoopDcsType' in kwargs:
            pid_loop_dcs_type = kwargs['pidLoopDcsType']
        if pid_loop_desc is None and 'pidLoopDesc' in kwargs:
            pid_loop_desc = kwargs['pidLoopDesc']
        if pid_loop_is_crucial is None and 'pidLoopIsCrucial' in kwargs:
            pid_loop_is_crucial = kwargs['pidLoopIsCrucial']
        if pid_loop_name is None and 'pidLoopName' in kwargs:
            pid_loop_name = kwargs['pidLoopName']
        if pid_loop_type is None and 'pidLoopType' in kwargs:
            pid_loop_type = kwargs['pidLoopType']
        if pid_project_id is None and 'pidProjectId' in kwargs:
            pid_project_id = kwargs['pidProjectId']

        if pid_loop_configuration is not None:
            _setter("pid_loop_configuration", pid_loop_configuration)
        if pid_loop_dcs_type is not None:
            _setter("pid_loop_dcs_type", pid_loop_dcs_type)
        if pid_loop_desc is not None:
            _setter("pid_loop_desc", pid_loop_desc)
        if pid_loop_is_crucial is not None:
            _setter("pid_loop_is_crucial", pid_loop_is_crucial)
        if pid_loop_name is not None:
            _setter("pid_loop_name", pid_loop_name)
        if pid_loop_type is not None:
            _setter("pid_loop_type", pid_loop_type)
        if pid_project_id is not None:
            _setter("pid_project_id", pid_project_id)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="pidLoopConfiguration")
    def pid_loop_configuration(self) -> Optional[pulumi.Input[str]]:
        """
        The Pid Loop Configuration.
        """
        return pulumi.get(self, "pid_loop_configuration")

    @pid_loop_configuration.setter
    def pid_loop_configuration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pid_loop_configuration", value)

    @property
    @pulumi.getter(name="pidLoopDcsType")
    def pid_loop_dcs_type(self) -> Optional[pulumi.Input[str]]:
        """
        The dcs type of Pid Loop. Valid values: `standard`.
        """
        return pulumi.get(self, "pid_loop_dcs_type")

    @pid_loop_dcs_type.setter
    def pid_loop_dcs_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pid_loop_dcs_type", value)

    @property
    @pulumi.getter(name="pidLoopDesc")
    def pid_loop_desc(self) -> Optional[pulumi.Input[str]]:
        """
        The desc of Pid Loop.
        """
        return pulumi.get(self, "pid_loop_desc")

    @pid_loop_desc.setter
    def pid_loop_desc(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pid_loop_desc", value)

    @property
    @pulumi.getter(name="pidLoopIsCrucial")
    def pid_loop_is_crucial(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether is crucial Pid Loop.
        """
        return pulumi.get(self, "pid_loop_is_crucial")

    @pid_loop_is_crucial.setter
    def pid_loop_is_crucial(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "pid_loop_is_crucial", value)

    @property
    @pulumi.getter(name="pidLoopName")
    def pid_loop_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of Pid Loop.
        """
        return pulumi.get(self, "pid_loop_name")

    @pid_loop_name.setter
    def pid_loop_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pid_loop_name", value)

    @property
    @pulumi.getter(name="pidLoopType")
    def pid_loop_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
        """
        return pulumi.get(self, "pid_loop_type")

    @pid_loop_type.setter
    def pid_loop_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pid_loop_type", value)

    @property
    @pulumi.getter(name="pidProjectId")
    def pid_project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The pid project id.
        """
        return pulumi.get(self, "pid_project_id")

    @pid_project_id.setter
    def pid_project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pid_project_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of Pid Loop.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class IndustrialPidLoop(pulumi.CustomResource):
    @overload
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
                 __props__=None):
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
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IndustrialPidLoopArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
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
        :param IndustrialPidLoopArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IndustrialPidLoopArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            IndustrialPidLoopArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 pid_loop_configuration: Optional[pulumi.Input[str]] = None,
                 pid_loop_dcs_type: Optional[pulumi.Input[str]] = None,
                 pid_loop_desc: Optional[pulumi.Input[str]] = None,
                 pid_loop_is_crucial: Optional[pulumi.Input[bool]] = None,
                 pid_loop_name: Optional[pulumi.Input[str]] = None,
                 pid_loop_type: Optional[pulumi.Input[str]] = None,
                 pid_project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IndustrialPidLoopArgs.__new__(IndustrialPidLoopArgs)

            if pid_loop_configuration is None and not opts.urn:
                raise TypeError("Missing required property 'pid_loop_configuration'")
            __props__.__dict__["pid_loop_configuration"] = pid_loop_configuration
            if pid_loop_dcs_type is None and not opts.urn:
                raise TypeError("Missing required property 'pid_loop_dcs_type'")
            __props__.__dict__["pid_loop_dcs_type"] = pid_loop_dcs_type
            __props__.__dict__["pid_loop_desc"] = pid_loop_desc
            if pid_loop_is_crucial is None and not opts.urn:
                raise TypeError("Missing required property 'pid_loop_is_crucial'")
            __props__.__dict__["pid_loop_is_crucial"] = pid_loop_is_crucial
            if pid_loop_name is None and not opts.urn:
                raise TypeError("Missing required property 'pid_loop_name'")
            __props__.__dict__["pid_loop_name"] = pid_loop_name
            if pid_loop_type is None and not opts.urn:
                raise TypeError("Missing required property 'pid_loop_type'")
            __props__.__dict__["pid_loop_type"] = pid_loop_type
            if pid_project_id is None and not opts.urn:
                raise TypeError("Missing required property 'pid_project_id'")
            __props__.__dict__["pid_project_id"] = pid_project_id
            __props__.__dict__["status"] = None
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

        __props__ = _IndustrialPidLoopState.__new__(_IndustrialPidLoopState)

        __props__.__dict__["pid_loop_configuration"] = pid_loop_configuration
        __props__.__dict__["pid_loop_dcs_type"] = pid_loop_dcs_type
        __props__.__dict__["pid_loop_desc"] = pid_loop_desc
        __props__.__dict__["pid_loop_is_crucial"] = pid_loop_is_crucial
        __props__.__dict__["pid_loop_name"] = pid_loop_name
        __props__.__dict__["pid_loop_type"] = pid_loop_type
        __props__.__dict__["pid_project_id"] = pid_project_id
        __props__.__dict__["status"] = status
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

