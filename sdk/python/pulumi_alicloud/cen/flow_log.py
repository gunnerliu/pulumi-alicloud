# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['FlowLogArgs', 'FlowLog']

@pulumi.input_type
class FlowLogArgs:
    def __init__(__self__, *,
                 cen_id: pulumi.Input[str],
                 log_store_name: pulumi.Input[str],
                 project_name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 flow_log_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FlowLog resource.
        :param pulumi.Input[str] cen_id: The ID of the CEN Instance.
        :param pulumi.Input[str] log_store_name: The name of the log store which is in the  `project_name` SLS project.
        :param pulumi.Input[str] project_name: The name of the SLS project.
        :param pulumi.Input[str] description: The description of flowlog.
        :param pulumi.Input[str] flow_log_name: The name of flowlog.
        :param pulumi.Input[str] status: The status of flowlog. Valid values: ["Active", "Inactive"]. Default to "Active".
        """
        FlowLogArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cen_id=cen_id,
            log_store_name=log_store_name,
            project_name=project_name,
            description=description,
            flow_log_name=flow_log_name,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cen_id: pulumi.Input[str],
             log_store_name: pulumi.Input[str],
             project_name: pulumi.Input[str],
             description: Optional[pulumi.Input[str]] = None,
             flow_log_name: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("cen_id", cen_id)
        _setter("log_store_name", log_store_name)
        _setter("project_name", project_name)
        if description is not None:
            _setter("description", description)
        if flow_log_name is not None:
            _setter("flow_log_name", flow_log_name)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> pulumi.Input[str]:
        """
        The ID of the CEN Instance.
        """
        return pulumi.get(self, "cen_id")

    @cen_id.setter
    def cen_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cen_id", value)

    @property
    @pulumi.getter(name="logStoreName")
    def log_store_name(self) -> pulumi.Input[str]:
        """
        The name of the log store which is in the  `project_name` SLS project.
        """
        return pulumi.get(self, "log_store_name")

    @log_store_name.setter
    def log_store_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "log_store_name", value)

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Input[str]:
        """
        The name of the SLS project.
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of flowlog.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="flowLogName")
    def flow_log_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of flowlog.
        """
        return pulumi.get(self, "flow_log_name")

    @flow_log_name.setter
    def flow_log_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "flow_log_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of flowlog. Valid values: ["Active", "Inactive"]. Default to "Active".
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _FlowLogState:
    def __init__(__self__, *,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 flow_log_name: Optional[pulumi.Input[str]] = None,
                 log_store_name: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FlowLog resources.
        :param pulumi.Input[str] cen_id: The ID of the CEN Instance.
        :param pulumi.Input[str] description: The description of flowlog.
        :param pulumi.Input[str] flow_log_name: The name of flowlog.
        :param pulumi.Input[str] log_store_name: The name of the log store which is in the  `project_name` SLS project.
        :param pulumi.Input[str] project_name: The name of the SLS project.
        :param pulumi.Input[str] status: The status of flowlog. Valid values: ["Active", "Inactive"]. Default to "Active".
        """
        _FlowLogState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cen_id=cen_id,
            description=description,
            flow_log_name=flow_log_name,
            log_store_name=log_store_name,
            project_name=project_name,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cen_id: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             flow_log_name: Optional[pulumi.Input[str]] = None,
             log_store_name: Optional[pulumi.Input[str]] = None,
             project_name: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if cen_id is not None:
            _setter("cen_id", cen_id)
        if description is not None:
            _setter("description", description)
        if flow_log_name is not None:
            _setter("flow_log_name", flow_log_name)
        if log_store_name is not None:
            _setter("log_store_name", log_store_name)
        if project_name is not None:
            _setter("project_name", project_name)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the CEN Instance.
        """
        return pulumi.get(self, "cen_id")

    @cen_id.setter
    def cen_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cen_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of flowlog.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="flowLogName")
    def flow_log_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of flowlog.
        """
        return pulumi.get(self, "flow_log_name")

    @flow_log_name.setter
    def flow_log_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "flow_log_name", value)

    @property
    @pulumi.getter(name="logStoreName")
    def log_store_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the log store which is in the  `project_name` SLS project.
        """
        return pulumi.get(self, "log_store_name")

    @log_store_name.setter
    def log_store_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_store_name", value)

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the SLS project.
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of flowlog. Valid values: ["Active", "Inactive"]. Default to "Active".
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class FlowLog(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 flow_log_name: Optional[pulumi.Input[str]] = None,
                 log_store_name: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource used to create a flow log function in Cloud Enterprise Network (CEN).
        By using the flow log function, you can capture the traffic data of the network instances in different regions of a CEN.
        You can also use the data aggregated in flow logs to analyze cross-region traffic flows, minimize traffic costs, and troubleshoot network faults.

        For information about CEN flow log and how to use it, see [Manage CEN flowlog](https://www.alibabacloud.com/help/doc-detail/123006.htm).

        > **NOTE:** Available in 1.73.0+

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # Create a cen flowlog resource and use it to publish a route entry pointing to an ECS.
        default_instance = alicloud.cen.Instance("defaultInstance")
        default_project = alicloud.log.Project("defaultProject", description="create by terraform")
        default_store = alicloud.log.Store("defaultStore",
            project=default_project.name,
            retention_period=3650,
            shard_count=3,
            auto_split=True,
            max_split_shard_count=60,
            append_meta=True)
        default_flow_log = alicloud.cen.FlowLog("defaultFlowLog",
            flow_log_name="my-flowlog",
            cen_id=default_instance.id,
            project_name=default_project.name,
            log_store_name=default_store.name)
        ```

        ## Import

        CEN flowlog can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/flowLog:FlowLog default flowlog-tig1xxxxxx
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cen_id: The ID of the CEN Instance.
        :param pulumi.Input[str] description: The description of flowlog.
        :param pulumi.Input[str] flow_log_name: The name of flowlog.
        :param pulumi.Input[str] log_store_name: The name of the log store which is in the  `project_name` SLS project.
        :param pulumi.Input[str] project_name: The name of the SLS project.
        :param pulumi.Input[str] status: The status of flowlog. Valid values: ["Active", "Inactive"]. Default to "Active".
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FlowLogArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource used to create a flow log function in Cloud Enterprise Network (CEN).
        By using the flow log function, you can capture the traffic data of the network instances in different regions of a CEN.
        You can also use the data aggregated in flow logs to analyze cross-region traffic flows, minimize traffic costs, and troubleshoot network faults.

        For information about CEN flow log and how to use it, see [Manage CEN flowlog](https://www.alibabacloud.com/help/doc-detail/123006.htm).

        > **NOTE:** Available in 1.73.0+

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # Create a cen flowlog resource and use it to publish a route entry pointing to an ECS.
        default_instance = alicloud.cen.Instance("defaultInstance")
        default_project = alicloud.log.Project("defaultProject", description="create by terraform")
        default_store = alicloud.log.Store("defaultStore",
            project=default_project.name,
            retention_period=3650,
            shard_count=3,
            auto_split=True,
            max_split_shard_count=60,
            append_meta=True)
        default_flow_log = alicloud.cen.FlowLog("defaultFlowLog",
            flow_log_name="my-flowlog",
            cen_id=default_instance.id,
            project_name=default_project.name,
            log_store_name=default_store.name)
        ```

        ## Import

        CEN flowlog can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/flowLog:FlowLog default flowlog-tig1xxxxxx
        ```

        :param str resource_name: The name of the resource.
        :param FlowLogArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FlowLogArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            FlowLogArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 flow_log_name: Optional[pulumi.Input[str]] = None,
                 log_store_name: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FlowLogArgs.__new__(FlowLogArgs)

            if cen_id is None and not opts.urn:
                raise TypeError("Missing required property 'cen_id'")
            __props__.__dict__["cen_id"] = cen_id
            __props__.__dict__["description"] = description
            __props__.__dict__["flow_log_name"] = flow_log_name
            if log_store_name is None and not opts.urn:
                raise TypeError("Missing required property 'log_store_name'")
            __props__.__dict__["log_store_name"] = log_store_name
            if project_name is None and not opts.urn:
                raise TypeError("Missing required property 'project_name'")
            __props__.__dict__["project_name"] = project_name
            __props__.__dict__["status"] = status
        super(FlowLog, __self__).__init__(
            'alicloud:cen/flowLog:FlowLog',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cen_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            flow_log_name: Optional[pulumi.Input[str]] = None,
            log_store_name: Optional[pulumi.Input[str]] = None,
            project_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'FlowLog':
        """
        Get an existing FlowLog resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cen_id: The ID of the CEN Instance.
        :param pulumi.Input[str] description: The description of flowlog.
        :param pulumi.Input[str] flow_log_name: The name of flowlog.
        :param pulumi.Input[str] log_store_name: The name of the log store which is in the  `project_name` SLS project.
        :param pulumi.Input[str] project_name: The name of the SLS project.
        :param pulumi.Input[str] status: The status of flowlog. Valid values: ["Active", "Inactive"]. Default to "Active".
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FlowLogState.__new__(_FlowLogState)

        __props__.__dict__["cen_id"] = cen_id
        __props__.__dict__["description"] = description
        __props__.__dict__["flow_log_name"] = flow_log_name
        __props__.__dict__["log_store_name"] = log_store_name
        __props__.__dict__["project_name"] = project_name
        __props__.__dict__["status"] = status
        return FlowLog(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> pulumi.Output[str]:
        """
        The ID of the CEN Instance.
        """
        return pulumi.get(self, "cen_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of flowlog.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="flowLogName")
    def flow_log_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of flowlog.
        """
        return pulumi.get(self, "flow_log_name")

    @property
    @pulumi.getter(name="logStoreName")
    def log_store_name(self) -> pulumi.Output[str]:
        """
        The name of the log store which is in the  `project_name` SLS project.
        """
        return pulumi.get(self, "log_store_name")

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Output[str]:
        """
        The name of the SLS project.
        """
        return pulumi.get(self, "project_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[str]]:
        """
        The status of flowlog. Valid values: ["Active", "Inactive"]. Default to "Active".
        """
        return pulumi.get(self, "status")

