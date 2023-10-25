# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['LifecycleHookArgs', 'LifecycleHook']

@pulumi.input_type
class LifecycleHookArgs:
    def __init__(__self__, *,
                 lifecycle_transition: pulumi.Input[str],
                 scaling_group_id: pulumi.Input[str],
                 default_result: Optional[pulumi.Input[str]] = None,
                 heartbeat_timeout: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notification_arn: Optional[pulumi.Input[str]] = None,
                 notification_metadata: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a LifecycleHook resource.
        :param pulumi.Input[str] lifecycle_transition: Type of Scaling activity attached to lifecycle hook. Supported value: SCALE_OUT, SCALE_IN.
        :param pulumi.Input[str] scaling_group_id: The ID of the Auto Scaling group to which you want to assign the lifecycle hook.
        :param pulumi.Input[str] default_result: Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses. Applicable value: CONTINUE, ABANDON, ROLLBACK, default value: CONTINUE.
        :param pulumi.Input[int] heartbeat_timeout: Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the default_result parameter. Default value: 600.
        :param pulumi.Input[str] name: The name of the lifecycle hook, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is lifecycle hook id.
        :param pulumi.Input[str] notification_arn: The Arn of notification target.
        :param pulumi.Input[str] notification_metadata: Additional information that you want to include when Auto Scaling sends a message to the notification target.
        """
        LifecycleHookArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            lifecycle_transition=lifecycle_transition,
            scaling_group_id=scaling_group_id,
            default_result=default_result,
            heartbeat_timeout=heartbeat_timeout,
            name=name,
            notification_arn=notification_arn,
            notification_metadata=notification_metadata,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             lifecycle_transition: Optional[pulumi.Input[str]] = None,
             scaling_group_id: Optional[pulumi.Input[str]] = None,
             default_result: Optional[pulumi.Input[str]] = None,
             heartbeat_timeout: Optional[pulumi.Input[int]] = None,
             name: Optional[pulumi.Input[str]] = None,
             notification_arn: Optional[pulumi.Input[str]] = None,
             notification_metadata: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if lifecycle_transition is None and 'lifecycleTransition' in kwargs:
            lifecycle_transition = kwargs['lifecycleTransition']
        if lifecycle_transition is None:
            raise TypeError("Missing 'lifecycle_transition' argument")
        if scaling_group_id is None and 'scalingGroupId' in kwargs:
            scaling_group_id = kwargs['scalingGroupId']
        if scaling_group_id is None:
            raise TypeError("Missing 'scaling_group_id' argument")
        if default_result is None and 'defaultResult' in kwargs:
            default_result = kwargs['defaultResult']
        if heartbeat_timeout is None and 'heartbeatTimeout' in kwargs:
            heartbeat_timeout = kwargs['heartbeatTimeout']
        if notification_arn is None and 'notificationArn' in kwargs:
            notification_arn = kwargs['notificationArn']
        if notification_metadata is None and 'notificationMetadata' in kwargs:
            notification_metadata = kwargs['notificationMetadata']

        _setter("lifecycle_transition", lifecycle_transition)
        _setter("scaling_group_id", scaling_group_id)
        if default_result is not None:
            _setter("default_result", default_result)
        if heartbeat_timeout is not None:
            _setter("heartbeat_timeout", heartbeat_timeout)
        if name is not None:
            _setter("name", name)
        if notification_arn is not None:
            _setter("notification_arn", notification_arn)
        if notification_metadata is not None:
            _setter("notification_metadata", notification_metadata)

    @property
    @pulumi.getter(name="lifecycleTransition")
    def lifecycle_transition(self) -> pulumi.Input[str]:
        """
        Type of Scaling activity attached to lifecycle hook. Supported value: SCALE_OUT, SCALE_IN.
        """
        return pulumi.get(self, "lifecycle_transition")

    @lifecycle_transition.setter
    def lifecycle_transition(self, value: pulumi.Input[str]):
        pulumi.set(self, "lifecycle_transition", value)

    @property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> pulumi.Input[str]:
        """
        The ID of the Auto Scaling group to which you want to assign the lifecycle hook.
        """
        return pulumi.get(self, "scaling_group_id")

    @scaling_group_id.setter
    def scaling_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "scaling_group_id", value)

    @property
    @pulumi.getter(name="defaultResult")
    def default_result(self) -> Optional[pulumi.Input[str]]:
        """
        Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses. Applicable value: CONTINUE, ABANDON, ROLLBACK, default value: CONTINUE.
        """
        return pulumi.get(self, "default_result")

    @default_result.setter
    def default_result(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_result", value)

    @property
    @pulumi.getter(name="heartbeatTimeout")
    def heartbeat_timeout(self) -> Optional[pulumi.Input[int]]:
        """
        Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the default_result parameter. Default value: 600.
        """
        return pulumi.get(self, "heartbeat_timeout")

    @heartbeat_timeout.setter
    def heartbeat_timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "heartbeat_timeout", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the lifecycle hook, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is lifecycle hook id.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="notificationArn")
    def notification_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Arn of notification target.
        """
        return pulumi.get(self, "notification_arn")

    @notification_arn.setter
    def notification_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notification_arn", value)

    @property
    @pulumi.getter(name="notificationMetadata")
    def notification_metadata(self) -> Optional[pulumi.Input[str]]:
        """
        Additional information that you want to include when Auto Scaling sends a message to the notification target.
        """
        return pulumi.get(self, "notification_metadata")

    @notification_metadata.setter
    def notification_metadata(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notification_metadata", value)


@pulumi.input_type
class _LifecycleHookState:
    def __init__(__self__, *,
                 default_result: Optional[pulumi.Input[str]] = None,
                 heartbeat_timeout: Optional[pulumi.Input[int]] = None,
                 lifecycle_transition: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notification_arn: Optional[pulumi.Input[str]] = None,
                 notification_metadata: Optional[pulumi.Input[str]] = None,
                 scaling_group_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LifecycleHook resources.
        :param pulumi.Input[str] default_result: Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses. Applicable value: CONTINUE, ABANDON, ROLLBACK, default value: CONTINUE.
        :param pulumi.Input[int] heartbeat_timeout: Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the default_result parameter. Default value: 600.
        :param pulumi.Input[str] lifecycle_transition: Type of Scaling activity attached to lifecycle hook. Supported value: SCALE_OUT, SCALE_IN.
        :param pulumi.Input[str] name: The name of the lifecycle hook, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is lifecycle hook id.
        :param pulumi.Input[str] notification_arn: The Arn of notification target.
        :param pulumi.Input[str] notification_metadata: Additional information that you want to include when Auto Scaling sends a message to the notification target.
        :param pulumi.Input[str] scaling_group_id: The ID of the Auto Scaling group to which you want to assign the lifecycle hook.
        """
        _LifecycleHookState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            default_result=default_result,
            heartbeat_timeout=heartbeat_timeout,
            lifecycle_transition=lifecycle_transition,
            name=name,
            notification_arn=notification_arn,
            notification_metadata=notification_metadata,
            scaling_group_id=scaling_group_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             default_result: Optional[pulumi.Input[str]] = None,
             heartbeat_timeout: Optional[pulumi.Input[int]] = None,
             lifecycle_transition: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             notification_arn: Optional[pulumi.Input[str]] = None,
             notification_metadata: Optional[pulumi.Input[str]] = None,
             scaling_group_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if default_result is None and 'defaultResult' in kwargs:
            default_result = kwargs['defaultResult']
        if heartbeat_timeout is None and 'heartbeatTimeout' in kwargs:
            heartbeat_timeout = kwargs['heartbeatTimeout']
        if lifecycle_transition is None and 'lifecycleTransition' in kwargs:
            lifecycle_transition = kwargs['lifecycleTransition']
        if notification_arn is None and 'notificationArn' in kwargs:
            notification_arn = kwargs['notificationArn']
        if notification_metadata is None and 'notificationMetadata' in kwargs:
            notification_metadata = kwargs['notificationMetadata']
        if scaling_group_id is None and 'scalingGroupId' in kwargs:
            scaling_group_id = kwargs['scalingGroupId']

        if default_result is not None:
            _setter("default_result", default_result)
        if heartbeat_timeout is not None:
            _setter("heartbeat_timeout", heartbeat_timeout)
        if lifecycle_transition is not None:
            _setter("lifecycle_transition", lifecycle_transition)
        if name is not None:
            _setter("name", name)
        if notification_arn is not None:
            _setter("notification_arn", notification_arn)
        if notification_metadata is not None:
            _setter("notification_metadata", notification_metadata)
        if scaling_group_id is not None:
            _setter("scaling_group_id", scaling_group_id)

    @property
    @pulumi.getter(name="defaultResult")
    def default_result(self) -> Optional[pulumi.Input[str]]:
        """
        Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses. Applicable value: CONTINUE, ABANDON, ROLLBACK, default value: CONTINUE.
        """
        return pulumi.get(self, "default_result")

    @default_result.setter
    def default_result(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_result", value)

    @property
    @pulumi.getter(name="heartbeatTimeout")
    def heartbeat_timeout(self) -> Optional[pulumi.Input[int]]:
        """
        Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the default_result parameter. Default value: 600.
        """
        return pulumi.get(self, "heartbeat_timeout")

    @heartbeat_timeout.setter
    def heartbeat_timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "heartbeat_timeout", value)

    @property
    @pulumi.getter(name="lifecycleTransition")
    def lifecycle_transition(self) -> Optional[pulumi.Input[str]]:
        """
        Type of Scaling activity attached to lifecycle hook. Supported value: SCALE_OUT, SCALE_IN.
        """
        return pulumi.get(self, "lifecycle_transition")

    @lifecycle_transition.setter
    def lifecycle_transition(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lifecycle_transition", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the lifecycle hook, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is lifecycle hook id.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="notificationArn")
    def notification_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Arn of notification target.
        """
        return pulumi.get(self, "notification_arn")

    @notification_arn.setter
    def notification_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notification_arn", value)

    @property
    @pulumi.getter(name="notificationMetadata")
    def notification_metadata(self) -> Optional[pulumi.Input[str]]:
        """
        Additional information that you want to include when Auto Scaling sends a message to the notification target.
        """
        return pulumi.get(self, "notification_metadata")

    @notification_metadata.setter
    def notification_metadata(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notification_metadata", value)

    @property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Auto Scaling group to which you want to assign the lifecycle hook.
        """
        return pulumi.get(self, "scaling_group_id")

    @scaling_group_id.setter
    def scaling_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scaling_group_id", value)


class LifecycleHook(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_result: Optional[pulumi.Input[str]] = None,
                 heartbeat_timeout: Optional[pulumi.Input[int]] = None,
                 lifecycle_transition: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notification_arn: Optional[pulumi.Input[str]] = None,
                 notification_metadata: Optional[pulumi.Input[str]] = None,
                 scaling_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a ESS lifecycle hook resource. More about Ess lifecycle hook, see [LifecycleHook](https://www.alibabacloud.com/help/doc-detail/73839.htm).

        > **NOTE:** Available since v1.13.0.

        ## Module Support

        You can use to the existing autoscaling module
        to create a lifecycle hook, scaling group and configuration one-click.

        ## Import

        Ess lifecycle hook can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ess/lifecycleHook:LifecycleHook example ash-l12345
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_result: Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses. Applicable value: CONTINUE, ABANDON, ROLLBACK, default value: CONTINUE.
        :param pulumi.Input[int] heartbeat_timeout: Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the default_result parameter. Default value: 600.
        :param pulumi.Input[str] lifecycle_transition: Type of Scaling activity attached to lifecycle hook. Supported value: SCALE_OUT, SCALE_IN.
        :param pulumi.Input[str] name: The name of the lifecycle hook, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is lifecycle hook id.
        :param pulumi.Input[str] notification_arn: The Arn of notification target.
        :param pulumi.Input[str] notification_metadata: Additional information that you want to include when Auto Scaling sends a message to the notification target.
        :param pulumi.Input[str] scaling_group_id: The ID of the Auto Scaling group to which you want to assign the lifecycle hook.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LifecycleHookArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ESS lifecycle hook resource. More about Ess lifecycle hook, see [LifecycleHook](https://www.alibabacloud.com/help/doc-detail/73839.htm).

        > **NOTE:** Available since v1.13.0.

        ## Module Support

        You can use to the existing autoscaling module
        to create a lifecycle hook, scaling group and configuration one-click.

        ## Import

        Ess lifecycle hook can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ess/lifecycleHook:LifecycleHook example ash-l12345
        ```

        :param str resource_name: The name of the resource.
        :param LifecycleHookArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LifecycleHookArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            LifecycleHookArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_result: Optional[pulumi.Input[str]] = None,
                 heartbeat_timeout: Optional[pulumi.Input[int]] = None,
                 lifecycle_transition: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notification_arn: Optional[pulumi.Input[str]] = None,
                 notification_metadata: Optional[pulumi.Input[str]] = None,
                 scaling_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LifecycleHookArgs.__new__(LifecycleHookArgs)

            __props__.__dict__["default_result"] = default_result
            __props__.__dict__["heartbeat_timeout"] = heartbeat_timeout
            if lifecycle_transition is None and not opts.urn:
                raise TypeError("Missing required property 'lifecycle_transition'")
            __props__.__dict__["lifecycle_transition"] = lifecycle_transition
            __props__.__dict__["name"] = name
            __props__.__dict__["notification_arn"] = notification_arn
            __props__.__dict__["notification_metadata"] = notification_metadata
            if scaling_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'scaling_group_id'")
            __props__.__dict__["scaling_group_id"] = scaling_group_id
        super(LifecycleHook, __self__).__init__(
            'alicloud:ess/lifecycleHook:LifecycleHook',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            default_result: Optional[pulumi.Input[str]] = None,
            heartbeat_timeout: Optional[pulumi.Input[int]] = None,
            lifecycle_transition: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            notification_arn: Optional[pulumi.Input[str]] = None,
            notification_metadata: Optional[pulumi.Input[str]] = None,
            scaling_group_id: Optional[pulumi.Input[str]] = None) -> 'LifecycleHook':
        """
        Get an existing LifecycleHook resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_result: Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses. Applicable value: CONTINUE, ABANDON, ROLLBACK, default value: CONTINUE.
        :param pulumi.Input[int] heartbeat_timeout: Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the default_result parameter. Default value: 600.
        :param pulumi.Input[str] lifecycle_transition: Type of Scaling activity attached to lifecycle hook. Supported value: SCALE_OUT, SCALE_IN.
        :param pulumi.Input[str] name: The name of the lifecycle hook, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is lifecycle hook id.
        :param pulumi.Input[str] notification_arn: The Arn of notification target.
        :param pulumi.Input[str] notification_metadata: Additional information that you want to include when Auto Scaling sends a message to the notification target.
        :param pulumi.Input[str] scaling_group_id: The ID of the Auto Scaling group to which you want to assign the lifecycle hook.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LifecycleHookState.__new__(_LifecycleHookState)

        __props__.__dict__["default_result"] = default_result
        __props__.__dict__["heartbeat_timeout"] = heartbeat_timeout
        __props__.__dict__["lifecycle_transition"] = lifecycle_transition
        __props__.__dict__["name"] = name
        __props__.__dict__["notification_arn"] = notification_arn
        __props__.__dict__["notification_metadata"] = notification_metadata
        __props__.__dict__["scaling_group_id"] = scaling_group_id
        return LifecycleHook(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="defaultResult")
    def default_result(self) -> pulumi.Output[Optional[str]]:
        """
        Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses. Applicable value: CONTINUE, ABANDON, ROLLBACK, default value: CONTINUE.
        """
        return pulumi.get(self, "default_result")

    @property
    @pulumi.getter(name="heartbeatTimeout")
    def heartbeat_timeout(self) -> pulumi.Output[Optional[int]]:
        """
        Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the default_result parameter. Default value: 600.
        """
        return pulumi.get(self, "heartbeat_timeout")

    @property
    @pulumi.getter(name="lifecycleTransition")
    def lifecycle_transition(self) -> pulumi.Output[str]:
        """
        Type of Scaling activity attached to lifecycle hook. Supported value: SCALE_OUT, SCALE_IN.
        """
        return pulumi.get(self, "lifecycle_transition")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the lifecycle hook, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is lifecycle hook id.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="notificationArn")
    def notification_arn(self) -> pulumi.Output[str]:
        """
        The Arn of notification target.
        """
        return pulumi.get(self, "notification_arn")

    @property
    @pulumi.getter(name="notificationMetadata")
    def notification_metadata(self) -> pulumi.Output[str]:
        """
        Additional information that you want to include when Auto Scaling sends a message to the notification target.
        """
        return pulumi.get(self, "notification_metadata")

    @property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the Auto Scaling group to which you want to assign the lifecycle hook.
        """
        return pulumi.get(self, "scaling_group_id")

