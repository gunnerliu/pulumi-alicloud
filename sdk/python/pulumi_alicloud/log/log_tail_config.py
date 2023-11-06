# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['LogTailConfigArgs', 'LogTailConfig']

@pulumi.input_type
class LogTailConfigArgs:
    def __init__(__self__, *,
                 input_detail: pulumi.Input[str],
                 input_type: pulumi.Input[str],
                 logstore: pulumi.Input[str],
                 output_type: pulumi.Input[str],
                 project: pulumi.Input[str],
                 log_sample: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a LogTailConfig resource.
        :param pulumi.Input[str] input_detail: The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
        :param pulumi.Input[str] input_type: The input type. Currently only two types of files and plugin are supported.
        :param pulumi.Input[str] logstore: The log store name to the query index belongs.
        :param pulumi.Input[str] output_type: The output type. Currently, only LogService is supported.
        :param pulumi.Input[str] project: The project name to the log store belongs.
        :param pulumi.Input[str] log_sample: （Optional）The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
        :param pulumi.Input[str] name: The Logtail configuration name, which is unique in the same project.
        """
        LogTailConfigArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            input_detail=input_detail,
            input_type=input_type,
            logstore=logstore,
            output_type=output_type,
            project=project,
            log_sample=log_sample,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             input_detail: Optional[pulumi.Input[str]] = None,
             input_type: Optional[pulumi.Input[str]] = None,
             logstore: Optional[pulumi.Input[str]] = None,
             output_type: Optional[pulumi.Input[str]] = None,
             project: Optional[pulumi.Input[str]] = None,
             log_sample: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if input_detail is None and 'inputDetail' in kwargs:
            input_detail = kwargs['inputDetail']
        if input_detail is None:
            raise TypeError("Missing 'input_detail' argument")
        if input_type is None and 'inputType' in kwargs:
            input_type = kwargs['inputType']
        if input_type is None:
            raise TypeError("Missing 'input_type' argument")
        if logstore is None:
            raise TypeError("Missing 'logstore' argument")
        if output_type is None and 'outputType' in kwargs:
            output_type = kwargs['outputType']
        if output_type is None:
            raise TypeError("Missing 'output_type' argument")
        if project is None:
            raise TypeError("Missing 'project' argument")
        if log_sample is None and 'logSample' in kwargs:
            log_sample = kwargs['logSample']

        _setter("input_detail", input_detail)
        _setter("input_type", input_type)
        _setter("logstore", logstore)
        _setter("output_type", output_type)
        _setter("project", project)
        if log_sample is not None:
            _setter("log_sample", log_sample)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter(name="inputDetail")
    def input_detail(self) -> pulumi.Input[str]:
        """
        The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
        """
        return pulumi.get(self, "input_detail")

    @input_detail.setter
    def input_detail(self, value: pulumi.Input[str]):
        pulumi.set(self, "input_detail", value)

    @property
    @pulumi.getter(name="inputType")
    def input_type(self) -> pulumi.Input[str]:
        """
        The input type. Currently only two types of files and plugin are supported.
        """
        return pulumi.get(self, "input_type")

    @input_type.setter
    def input_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "input_type", value)

    @property
    @pulumi.getter
    def logstore(self) -> pulumi.Input[str]:
        """
        The log store name to the query index belongs.
        """
        return pulumi.get(self, "logstore")

    @logstore.setter
    def logstore(self, value: pulumi.Input[str]):
        pulumi.set(self, "logstore", value)

    @property
    @pulumi.getter(name="outputType")
    def output_type(self) -> pulumi.Input[str]:
        """
        The output type. Currently, only LogService is supported.
        """
        return pulumi.get(self, "output_type")

    @output_type.setter
    def output_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "output_type", value)

    @property
    @pulumi.getter
    def project(self) -> pulumi.Input[str]:
        """
        The project name to the log store belongs.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: pulumi.Input[str]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="logSample")
    def log_sample(self) -> Optional[pulumi.Input[str]]:
        """
        （Optional）The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
        """
        return pulumi.get(self, "log_sample")

    @log_sample.setter
    def log_sample(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_sample", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The Logtail configuration name, which is unique in the same project.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _LogTailConfigState:
    def __init__(__self__, *,
                 input_detail: Optional[pulumi.Input[str]] = None,
                 input_type: Optional[pulumi.Input[str]] = None,
                 log_sample: Optional[pulumi.Input[str]] = None,
                 logstore: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 output_type: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LogTailConfig resources.
        :param pulumi.Input[str] input_detail: The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
        :param pulumi.Input[str] input_type: The input type. Currently only two types of files and plugin are supported.
        :param pulumi.Input[str] log_sample: （Optional）The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
        :param pulumi.Input[str] logstore: The log store name to the query index belongs.
        :param pulumi.Input[str] name: The Logtail configuration name, which is unique in the same project.
        :param pulumi.Input[str] output_type: The output type. Currently, only LogService is supported.
        :param pulumi.Input[str] project: The project name to the log store belongs.
        """
        _LogTailConfigState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            input_detail=input_detail,
            input_type=input_type,
            log_sample=log_sample,
            logstore=logstore,
            name=name,
            output_type=output_type,
            project=project,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             input_detail: Optional[pulumi.Input[str]] = None,
             input_type: Optional[pulumi.Input[str]] = None,
             log_sample: Optional[pulumi.Input[str]] = None,
             logstore: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             output_type: Optional[pulumi.Input[str]] = None,
             project: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if input_detail is None and 'inputDetail' in kwargs:
            input_detail = kwargs['inputDetail']
        if input_type is None and 'inputType' in kwargs:
            input_type = kwargs['inputType']
        if log_sample is None and 'logSample' in kwargs:
            log_sample = kwargs['logSample']
        if output_type is None and 'outputType' in kwargs:
            output_type = kwargs['outputType']

        if input_detail is not None:
            _setter("input_detail", input_detail)
        if input_type is not None:
            _setter("input_type", input_type)
        if log_sample is not None:
            _setter("log_sample", log_sample)
        if logstore is not None:
            _setter("logstore", logstore)
        if name is not None:
            _setter("name", name)
        if output_type is not None:
            _setter("output_type", output_type)
        if project is not None:
            _setter("project", project)

    @property
    @pulumi.getter(name="inputDetail")
    def input_detail(self) -> Optional[pulumi.Input[str]]:
        """
        The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
        """
        return pulumi.get(self, "input_detail")

    @input_detail.setter
    def input_detail(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "input_detail", value)

    @property
    @pulumi.getter(name="inputType")
    def input_type(self) -> Optional[pulumi.Input[str]]:
        """
        The input type. Currently only two types of files and plugin are supported.
        """
        return pulumi.get(self, "input_type")

    @input_type.setter
    def input_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "input_type", value)

    @property
    @pulumi.getter(name="logSample")
    def log_sample(self) -> Optional[pulumi.Input[str]]:
        """
        （Optional）The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
        """
        return pulumi.get(self, "log_sample")

    @log_sample.setter
    def log_sample(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_sample", value)

    @property
    @pulumi.getter
    def logstore(self) -> Optional[pulumi.Input[str]]:
        """
        The log store name to the query index belongs.
        """
        return pulumi.get(self, "logstore")

    @logstore.setter
    def logstore(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "logstore", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The Logtail configuration name, which is unique in the same project.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="outputType")
    def output_type(self) -> Optional[pulumi.Input[str]]:
        """
        The output type. Currently, only LogService is supported.
        """
        return pulumi.get(self, "output_type")

    @output_type.setter
    def output_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "output_type", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The project name to the log store belongs.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)


class LogTailConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 input_detail: Optional[pulumi.Input[str]] = None,
                 input_type: Optional[pulumi.Input[str]] = None,
                 log_sample: Optional[pulumi.Input[str]] = None,
                 logstore: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 output_type: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The Logtail access service is a log collection agent provided by Log Service.
        You can use Logtail to collect logs from servers such as Alibaba Cloud Elastic
        Compute Service (ECS) instances in real time in the Log Service console. [Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm)

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        default = random.RandomInteger("default",
            max=99999,
            min=10000)
        example_project = alicloud.log.Project("exampleProject", description="terraform-example")
        example_store = alicloud.log.Store("exampleStore",
            project=example_project.name,
            retention_period=3650,
            shard_count=3,
            auto_split=True,
            max_split_shard_count=60,
            append_meta=True)
        example_log_tail_config = alicloud.log.LogTailConfig("exampleLogTailConfig",
            project=example_project.name,
            logstore=example_store.name,
            input_type="file",
            output_type="LogService",
            input_detail=\"\"\"  	{
        		"logPath": "/logPath",
        		"filePattern": "access.log",
        		"logType": "json_log",
        		"topicFormat": "default",
        		"discardUnmatch": false,
        		"enableRawLog": true,
        		"fileEncoding": "gbk",
        		"maxDepth": 10
        	}
        \"\"\")
        ```
        ## Module Support

        You can use the existing sls-logtail module
        to create logtail config, machine group, install logtail on ECS instances and join instances into machine group one-click.

        ## Import

        Logtial config can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:log/logTailConfig:LogTailConfig example tf-log:tf-log-store:tf-log-config
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] input_detail: The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
        :param pulumi.Input[str] input_type: The input type. Currently only two types of files and plugin are supported.
        :param pulumi.Input[str] log_sample: （Optional）The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
        :param pulumi.Input[str] logstore: The log store name to the query index belongs.
        :param pulumi.Input[str] name: The Logtail configuration name, which is unique in the same project.
        :param pulumi.Input[str] output_type: The output type. Currently, only LogService is supported.
        :param pulumi.Input[str] project: The project name to the log store belongs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogTailConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The Logtail access service is a log collection agent provided by Log Service.
        You can use Logtail to collect logs from servers such as Alibaba Cloud Elastic
        Compute Service (ECS) instances in real time in the Log Service console. [Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm)

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        default = random.RandomInteger("default",
            max=99999,
            min=10000)
        example_project = alicloud.log.Project("exampleProject", description="terraform-example")
        example_store = alicloud.log.Store("exampleStore",
            project=example_project.name,
            retention_period=3650,
            shard_count=3,
            auto_split=True,
            max_split_shard_count=60,
            append_meta=True)
        example_log_tail_config = alicloud.log.LogTailConfig("exampleLogTailConfig",
            project=example_project.name,
            logstore=example_store.name,
            input_type="file",
            output_type="LogService",
            input_detail=\"\"\"  	{
        		"logPath": "/logPath",
        		"filePattern": "access.log",
        		"logType": "json_log",
        		"topicFormat": "default",
        		"discardUnmatch": false,
        		"enableRawLog": true,
        		"fileEncoding": "gbk",
        		"maxDepth": 10
        	}
        \"\"\")
        ```
        ## Module Support

        You can use the existing sls-logtail module
        to create logtail config, machine group, install logtail on ECS instances and join instances into machine group one-click.

        ## Import

        Logtial config can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:log/logTailConfig:LogTailConfig example tf-log:tf-log-store:tf-log-config
        ```

        :param str resource_name: The name of the resource.
        :param LogTailConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogTailConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            LogTailConfigArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 input_detail: Optional[pulumi.Input[str]] = None,
                 input_type: Optional[pulumi.Input[str]] = None,
                 log_sample: Optional[pulumi.Input[str]] = None,
                 logstore: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 output_type: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogTailConfigArgs.__new__(LogTailConfigArgs)

            if input_detail is None and not opts.urn:
                raise TypeError("Missing required property 'input_detail'")
            __props__.__dict__["input_detail"] = input_detail
            if input_type is None and not opts.urn:
                raise TypeError("Missing required property 'input_type'")
            __props__.__dict__["input_type"] = input_type
            __props__.__dict__["log_sample"] = log_sample
            if logstore is None and not opts.urn:
                raise TypeError("Missing required property 'logstore'")
            __props__.__dict__["logstore"] = logstore
            __props__.__dict__["name"] = name
            if output_type is None and not opts.urn:
                raise TypeError("Missing required property 'output_type'")
            __props__.__dict__["output_type"] = output_type
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
        super(LogTailConfig, __self__).__init__(
            'alicloud:log/logTailConfig:LogTailConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            input_detail: Optional[pulumi.Input[str]] = None,
            input_type: Optional[pulumi.Input[str]] = None,
            log_sample: Optional[pulumi.Input[str]] = None,
            logstore: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            output_type: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None) -> 'LogTailConfig':
        """
        Get an existing LogTailConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] input_detail: The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
        :param pulumi.Input[str] input_type: The input type. Currently only two types of files and plugin are supported.
        :param pulumi.Input[str] log_sample: （Optional）The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
        :param pulumi.Input[str] logstore: The log store name to the query index belongs.
        :param pulumi.Input[str] name: The Logtail configuration name, which is unique in the same project.
        :param pulumi.Input[str] output_type: The output type. Currently, only LogService is supported.
        :param pulumi.Input[str] project: The project name to the log store belongs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogTailConfigState.__new__(_LogTailConfigState)

        __props__.__dict__["input_detail"] = input_detail
        __props__.__dict__["input_type"] = input_type
        __props__.__dict__["log_sample"] = log_sample
        __props__.__dict__["logstore"] = logstore
        __props__.__dict__["name"] = name
        __props__.__dict__["output_type"] = output_type
        __props__.__dict__["project"] = project
        return LogTailConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="inputDetail")
    def input_detail(self) -> pulumi.Output[str]:
        """
        The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
        """
        return pulumi.get(self, "input_detail")

    @property
    @pulumi.getter(name="inputType")
    def input_type(self) -> pulumi.Output[str]:
        """
        The input type. Currently only two types of files and plugin are supported.
        """
        return pulumi.get(self, "input_type")

    @property
    @pulumi.getter(name="logSample")
    def log_sample(self) -> pulumi.Output[Optional[str]]:
        """
        （Optional）The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
        """
        return pulumi.get(self, "log_sample")

    @property
    @pulumi.getter
    def logstore(self) -> pulumi.Output[str]:
        """
        The log store name to the query index belongs.
        """
        return pulumi.get(self, "logstore")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The Logtail configuration name, which is unique in the same project.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="outputType")
    def output_type(self) -> pulumi.Output[str]:
        """
        The output type. Currently, only LogService is supported.
        """
        return pulumi.get(self, "output_type")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        The project name to the log store belongs.
        """
        return pulumi.get(self, "project")

