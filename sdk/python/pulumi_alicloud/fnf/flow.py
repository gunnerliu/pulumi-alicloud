# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['FlowArgs', 'Flow']

@pulumi.input_type
class FlowArgs:
    def __init__(__self__, *,
                 definition: pulumi.Input[str],
                 description: pulumi.Input[str],
                 type: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Flow resource.
        :param pulumi.Input[str] definition: The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
        :param pulumi.Input[str] description: The description of the flow.
        :param pulumi.Input[str] type: The type of the flow. Valid values are `FDL` or `DEFAULT`.
        :param pulumi.Input[str] name: The name of the flow. The name must be unique in an Alibaba Cloud account.
        :param pulumi.Input[str] role_arn: The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
        """
        FlowArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            definition=definition,
            description=description,
            type=type,
            name=name,
            role_arn=role_arn,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             definition: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             role_arn: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if definition is None:
            raise TypeError("Missing 'definition' argument")
        if description is None:
            raise TypeError("Missing 'description' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")
        if role_arn is None and 'roleArn' in kwargs:
            role_arn = kwargs['roleArn']

        _setter("definition", definition)
        _setter("description", description)
        _setter("type", type)
        if name is not None:
            _setter("name", name)
        if role_arn is not None:
            _setter("role_arn", role_arn)

    @property
    @pulumi.getter
    def definition(self) -> pulumi.Input[str]:
        """
        The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
        """
        return pulumi.get(self, "definition")

    @definition.setter
    def definition(self, value: pulumi.Input[str]):
        pulumi.set(self, "definition", value)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        The description of the flow.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of the flow. Valid values are `FDL` or `DEFAULT`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the flow. The name must be unique in an Alibaba Cloud account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_arn", value)


@pulumi.input_type
class _FlowState:
    def __init__(__self__, *,
                 definition: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 flow_id: Optional[pulumi.Input[str]] = None,
                 last_modified_time: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Flow resources.
        :param pulumi.Input[str] definition: The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
        :param pulumi.Input[str] description: The description of the flow.
        :param pulumi.Input[str] flow_id: The unique ID of the flow.
        :param pulumi.Input[str] last_modified_time: The time when the flow was last modified.
        :param pulumi.Input[str] name: The name of the flow. The name must be unique in an Alibaba Cloud account.
        :param pulumi.Input[str] role_arn: The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
        :param pulumi.Input[str] type: The type of the flow. Valid values are `FDL` or `DEFAULT`.
        """
        _FlowState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            definition=definition,
            description=description,
            flow_id=flow_id,
            last_modified_time=last_modified_time,
            name=name,
            role_arn=role_arn,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             definition: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             flow_id: Optional[pulumi.Input[str]] = None,
             last_modified_time: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             role_arn: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if flow_id is None and 'flowId' in kwargs:
            flow_id = kwargs['flowId']
        if last_modified_time is None and 'lastModifiedTime' in kwargs:
            last_modified_time = kwargs['lastModifiedTime']
        if role_arn is None and 'roleArn' in kwargs:
            role_arn = kwargs['roleArn']

        if definition is not None:
            _setter("definition", definition)
        if description is not None:
            _setter("description", description)
        if flow_id is not None:
            _setter("flow_id", flow_id)
        if last_modified_time is not None:
            _setter("last_modified_time", last_modified_time)
        if name is not None:
            _setter("name", name)
        if role_arn is not None:
            _setter("role_arn", role_arn)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter
    def definition(self) -> Optional[pulumi.Input[str]]:
        """
        The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
        """
        return pulumi.get(self, "definition")

    @definition.setter
    def definition(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "definition", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the flow.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="flowId")
    def flow_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique ID of the flow.
        """
        return pulumi.get(self, "flow_id")

    @flow_id.setter
    def flow_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "flow_id", value)

    @property
    @pulumi.getter(name="lastModifiedTime")
    def last_modified_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time when the flow was last modified.
        """
        return pulumi.get(self, "last_modified_time")

    @last_modified_time.setter
    def last_modified_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modified_time", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the flow. The name must be unique in an Alibaba Cloud account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
        """
        return pulumi.get(self, "role_arn")

    @role_arn.setter
    def role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_arn", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the flow. Valid values are `FDL` or `DEFAULT`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class Flow(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 definition: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Serverless Workflow Flow resource.

        For information about Serverless Workflow Flow and how to use it, see [What is Flow](https://www.alibabacloud.com/help/en/doc-detail/123079.htm).

        > **NOTE:** Available in v1.105.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.ram.Role("default", document=\"\"\"  {
            "Statement": [
              {
                "Action": "sts:AssumeRole",
                "Effect": "Allow",
                "Principal": {
                  "Service": [
                    "fnf.aliyuncs.com"
                  ]
                }
              }
            ],
            "Version": "1"
          }
        \"\"\")
        example = alicloud.fnf.Flow("example",
            definition=\"\"\"  version: v1beta1
          type: flow
          steps:
            - type: pass
              name: helloworld
        \"\"\",
            role_arn=default.arn,
            description="Test for terraform fnf_flow.",
            type="FDL")
        ```

        ## Import

        Serverless Workflow Flow can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:fnf/flow:Flow example <name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] definition: The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
        :param pulumi.Input[str] description: The description of the flow.
        :param pulumi.Input[str] name: The name of the flow. The name must be unique in an Alibaba Cloud account.
        :param pulumi.Input[str] role_arn: The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
        :param pulumi.Input[str] type: The type of the flow. Valid values are `FDL` or `DEFAULT`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FlowArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Serverless Workflow Flow resource.

        For information about Serverless Workflow Flow and how to use it, see [What is Flow](https://www.alibabacloud.com/help/en/doc-detail/123079.htm).

        > **NOTE:** Available in v1.105.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.ram.Role("default", document=\"\"\"  {
            "Statement": [
              {
                "Action": "sts:AssumeRole",
                "Effect": "Allow",
                "Principal": {
                  "Service": [
                    "fnf.aliyuncs.com"
                  ]
                }
              }
            ],
            "Version": "1"
          }
        \"\"\")
        example = alicloud.fnf.Flow("example",
            definition=\"\"\"  version: v1beta1
          type: flow
          steps:
            - type: pass
              name: helloworld
        \"\"\",
            role_arn=default.arn,
            description="Test for terraform fnf_flow.",
            type="FDL")
        ```

        ## Import

        Serverless Workflow Flow can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:fnf/flow:Flow example <name>
        ```

        :param str resource_name: The name of the resource.
        :param FlowArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FlowArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            FlowArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 definition: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 role_arn: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FlowArgs.__new__(FlowArgs)

            if definition is None and not opts.urn:
                raise TypeError("Missing required property 'definition'")
            __props__.__dict__["definition"] = definition
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["role_arn"] = role_arn
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["flow_id"] = None
            __props__.__dict__["last_modified_time"] = None
        super(Flow, __self__).__init__(
            'alicloud:fnf/flow:Flow',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            definition: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            flow_id: Optional[pulumi.Input[str]] = None,
            last_modified_time: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            role_arn: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'Flow':
        """
        Get an existing Flow resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] definition: The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
        :param pulumi.Input[str] description: The description of the flow.
        :param pulumi.Input[str] flow_id: The unique ID of the flow.
        :param pulumi.Input[str] last_modified_time: The time when the flow was last modified.
        :param pulumi.Input[str] name: The name of the flow. The name must be unique in an Alibaba Cloud account.
        :param pulumi.Input[str] role_arn: The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
        :param pulumi.Input[str] type: The type of the flow. Valid values are `FDL` or `DEFAULT`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FlowState.__new__(_FlowState)

        __props__.__dict__["definition"] = definition
        __props__.__dict__["description"] = description
        __props__.__dict__["flow_id"] = flow_id
        __props__.__dict__["last_modified_time"] = last_modified_time
        __props__.__dict__["name"] = name
        __props__.__dict__["role_arn"] = role_arn
        __props__.__dict__["type"] = type
        return Flow(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def definition(self) -> pulumi.Output[str]:
        """
        The definition of the flow. It must comply with the Flow Definition Language (FDL) syntax.
        """
        return pulumi.get(self, "definition")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of the flow.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="flowId")
    def flow_id(self) -> pulumi.Output[str]:
        """
        The unique ID of the flow.
        """
        return pulumi.get(self, "flow_id")

    @property
    @pulumi.getter(name="lastModifiedTime")
    def last_modified_time(self) -> pulumi.Output[str]:
        """
        The time when the flow was last modified.
        """
        return pulumi.get(self, "last_modified_time")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the flow. The name must be unique in an Alibaba Cloud account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> pulumi.Output[Optional[str]]:
        """
        The ARN of the specified RAM role that Serverless Workflow uses to assume the role when Serverless Workflow executes a flow.
        """
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the flow. Valid values are `FDL` or `DEFAULT`.
        """
        return pulumi.get(self, "type")

