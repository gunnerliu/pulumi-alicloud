# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['CommandArgs', 'Command']

@pulumi.input_type
class CommandArgs:
    def __init__(__self__, *,
                 command_content: pulumi.Input[str],
                 type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 enable_parameter: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[int]] = None,
                 working_dir: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Command resource.
        :param pulumi.Input[str] command_content: The Base64-encoded content of the command.
        :param pulumi.Input[str] type: The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
        :param pulumi.Input[str] description: The description of command.
        :param pulumi.Input[bool] enable_parameter: Specifies whether to use custom parameters in the command to be created. Default to: false.
        :param pulumi.Input[str] name: The name of the command, which supports all character sets. It can be up to 128 characters in length.
        :param pulumi.Input[int] timeout: The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
        :param pulumi.Input[str] working_dir: The execution path of the command in the ECS instance.
        """
        CommandArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            command_content=command_content,
            type=type,
            description=description,
            enable_parameter=enable_parameter,
            name=name,
            timeout=timeout,
            working_dir=working_dir,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             command_content: pulumi.Input[str],
             type: pulumi.Input[str],
             description: Optional[pulumi.Input[str]] = None,
             enable_parameter: Optional[pulumi.Input[bool]] = None,
             name: Optional[pulumi.Input[str]] = None,
             timeout: Optional[pulumi.Input[int]] = None,
             working_dir: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("command_content", command_content)
        _setter("type", type)
        if description is not None:
            _setter("description", description)
        if enable_parameter is not None:
            _setter("enable_parameter", enable_parameter)
        if name is not None:
            _setter("name", name)
        if timeout is not None:
            _setter("timeout", timeout)
        if working_dir is not None:
            _setter("working_dir", working_dir)

    @property
    @pulumi.getter(name="commandContent")
    def command_content(self) -> pulumi.Input[str]:
        """
        The Base64-encoded content of the command.
        """
        return pulumi.get(self, "command_content")

    @command_content.setter
    def command_content(self, value: pulumi.Input[str]):
        pulumi.set(self, "command_content", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of command.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="enableParameter")
    def enable_parameter(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to use custom parameters in the command to be created. Default to: false.
        """
        return pulumi.get(self, "enable_parameter")

    @enable_parameter.setter
    def enable_parameter(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_parameter", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the command, which supports all character sets. It can be up to 128 characters in length.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[int]]:
        """
        The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter(name="workingDir")
    def working_dir(self) -> Optional[pulumi.Input[str]]:
        """
        The execution path of the command in the ECS instance.
        """
        return pulumi.get(self, "working_dir")

    @working_dir.setter
    def working_dir(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "working_dir", value)


@pulumi.input_type
class _CommandState:
    def __init__(__self__, *,
                 command_content: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enable_parameter: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 working_dir: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Command resources.
        :param pulumi.Input[str] command_content: The Base64-encoded content of the command.
        :param pulumi.Input[str] description: The description of command.
        :param pulumi.Input[bool] enable_parameter: Specifies whether to use custom parameters in the command to be created. Default to: false.
        :param pulumi.Input[str] name: The name of the command, which supports all character sets. It can be up to 128 characters in length.
        :param pulumi.Input[int] timeout: The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
        :param pulumi.Input[str] type: The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
        :param pulumi.Input[str] working_dir: The execution path of the command in the ECS instance.
        """
        _CommandState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            command_content=command_content,
            description=description,
            enable_parameter=enable_parameter,
            name=name,
            timeout=timeout,
            type=type,
            working_dir=working_dir,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             command_content: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             enable_parameter: Optional[pulumi.Input[bool]] = None,
             name: Optional[pulumi.Input[str]] = None,
             timeout: Optional[pulumi.Input[int]] = None,
             type: Optional[pulumi.Input[str]] = None,
             working_dir: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if command_content is not None:
            _setter("command_content", command_content)
        if description is not None:
            _setter("description", description)
        if enable_parameter is not None:
            _setter("enable_parameter", enable_parameter)
        if name is not None:
            _setter("name", name)
        if timeout is not None:
            _setter("timeout", timeout)
        if type is not None:
            _setter("type", type)
        if working_dir is not None:
            _setter("working_dir", working_dir)

    @property
    @pulumi.getter(name="commandContent")
    def command_content(self) -> Optional[pulumi.Input[str]]:
        """
        The Base64-encoded content of the command.
        """
        return pulumi.get(self, "command_content")

    @command_content.setter
    def command_content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "command_content", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of command.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="enableParameter")
    def enable_parameter(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to use custom parameters in the command to be created. Default to: false.
        """
        return pulumi.get(self, "enable_parameter")

    @enable_parameter.setter
    def enable_parameter(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_parameter", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the command, which supports all character sets. It can be up to 128 characters in length.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[int]]:
        """
        The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="workingDir")
    def working_dir(self) -> Optional[pulumi.Input[str]]:
        """
        The execution path of the command in the ECS instance.
        """
        return pulumi.get(self, "working_dir")

    @working_dir.setter
    def working_dir(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "working_dir", value)


class Command(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 command_content: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enable_parameter: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 working_dir: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a ECS Command resource.

        For information about ECS Command and how to use it, see [What is Command](https://www.alibabacloud.com/help/en/doc-detail/64844.htm).

        > **NOTE:** Available in v1.116.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.ecs.Command("example",
            command_content="bHMK",
            description="For Terraform Test",
            type="RunShellScript",
            working_dir="/root")
        ```

        ## Import

        ECS Command can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/command:Command example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] command_content: The Base64-encoded content of the command.
        :param pulumi.Input[str] description: The description of command.
        :param pulumi.Input[bool] enable_parameter: Specifies whether to use custom parameters in the command to be created. Default to: false.
        :param pulumi.Input[str] name: The name of the command, which supports all character sets. It can be up to 128 characters in length.
        :param pulumi.Input[int] timeout: The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
        :param pulumi.Input[str] type: The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
        :param pulumi.Input[str] working_dir: The execution path of the command in the ECS instance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CommandArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ECS Command resource.

        For information about ECS Command and how to use it, see [What is Command](https://www.alibabacloud.com/help/en/doc-detail/64844.htm).

        > **NOTE:** Available in v1.116.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.ecs.Command("example",
            command_content="bHMK",
            description="For Terraform Test",
            type="RunShellScript",
            working_dir="/root")
        ```

        ## Import

        ECS Command can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/command:Command example <id>
        ```

        :param str resource_name: The name of the resource.
        :param CommandArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CommandArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            CommandArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 command_content: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enable_parameter: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 working_dir: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CommandArgs.__new__(CommandArgs)

            if command_content is None and not opts.urn:
                raise TypeError("Missing required property 'command_content'")
            __props__.__dict__["command_content"] = command_content
            __props__.__dict__["description"] = description
            __props__.__dict__["enable_parameter"] = enable_parameter
            __props__.__dict__["name"] = name
            __props__.__dict__["timeout"] = timeout
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["working_dir"] = working_dir
        super(Command, __self__).__init__(
            'alicloud:ecs/command:Command',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            command_content: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enable_parameter: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            timeout: Optional[pulumi.Input[int]] = None,
            type: Optional[pulumi.Input[str]] = None,
            working_dir: Optional[pulumi.Input[str]] = None) -> 'Command':
        """
        Get an existing Command resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] command_content: The Base64-encoded content of the command.
        :param pulumi.Input[str] description: The description of command.
        :param pulumi.Input[bool] enable_parameter: Specifies whether to use custom parameters in the command to be created. Default to: false.
        :param pulumi.Input[str] name: The name of the command, which supports all character sets. It can be up to 128 characters in length.
        :param pulumi.Input[int] timeout: The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
        :param pulumi.Input[str] type: The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
        :param pulumi.Input[str] working_dir: The execution path of the command in the ECS instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CommandState.__new__(_CommandState)

        __props__.__dict__["command_content"] = command_content
        __props__.__dict__["description"] = description
        __props__.__dict__["enable_parameter"] = enable_parameter
        __props__.__dict__["name"] = name
        __props__.__dict__["timeout"] = timeout
        __props__.__dict__["type"] = type
        __props__.__dict__["working_dir"] = working_dir
        return Command(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="commandContent")
    def command_content(self) -> pulumi.Output[str]:
        """
        The Base64-encoded content of the command.
        """
        return pulumi.get(self, "command_content")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of command.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="enableParameter")
    def enable_parameter(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to use custom parameters in the command to be created. Default to: false.
        """
        return pulumi.get(self, "enable_parameter")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the command, which supports all character sets. It can be up to 128 characters in length.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Output[Optional[int]]:
        """
        The timeout period that is specified for the command to be run on ECS instances. Unit: seconds. Default to: `60`.
        """
        return pulumi.get(self, "timeout")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The command type. Valid Values: `RunBatScript`, `RunPowerShellScript` and `RunShellScript`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="workingDir")
    def working_dir(self) -> pulumi.Output[Optional[str]]:
        """
        The execution path of the command in the ECS instance.
        """
        return pulumi.get(self, "working_dir")

