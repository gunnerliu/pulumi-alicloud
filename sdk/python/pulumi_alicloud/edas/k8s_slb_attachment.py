# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['K8sSlbAttachmentArgs', 'K8sSlbAttachment']

@pulumi.input_type
class K8sSlbAttachmentArgs:
    def __init__(__self__, *,
                 app_id: pulumi.Input[str],
                 slb_configs: Optional[pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigArgs']]]] = None):
        """
        The set of arguments for constructing a K8sSlbAttachment resource.
        :param pulumi.Input[str] app_id: The ID of the EDAS k8s application to which you want to bind SLB instances.
        :param pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigArgs']]] slb_configs: The configurations of SLB attachment, which is supported for multiple configurations. See `slb_configs` below.
        """
        K8sSlbAttachmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            app_id=app_id,
            slb_configs=slb_configs,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             app_id: Optional[pulumi.Input[str]] = None,
             slb_configs: Optional[pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if app_id is None and 'appId' in kwargs:
            app_id = kwargs['appId']
        if app_id is None:
            raise TypeError("Missing 'app_id' argument")
        if slb_configs is None and 'slbConfigs' in kwargs:
            slb_configs = kwargs['slbConfigs']

        _setter("app_id", app_id)
        if slb_configs is not None:
            _setter("slb_configs", slb_configs)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Input[str]:
        """
        The ID of the EDAS k8s application to which you want to bind SLB instances.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter(name="slbConfigs")
    def slb_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigArgs']]]]:
        """
        The configurations of SLB attachment, which is supported for multiple configurations. See `slb_configs` below.
        """
        return pulumi.get(self, "slb_configs")

    @slb_configs.setter
    def slb_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigArgs']]]]):
        pulumi.set(self, "slb_configs", value)


@pulumi.input_type
class _K8sSlbAttachmentState:
    def __init__(__self__, *,
                 app_id: Optional[pulumi.Input[str]] = None,
                 slb_configs: Optional[pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigArgs']]]] = None):
        """
        Input properties used for looking up and filtering K8sSlbAttachment resources.
        :param pulumi.Input[str] app_id: The ID of the EDAS k8s application to which you want to bind SLB instances.
        :param pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigArgs']]] slb_configs: The configurations of SLB attachment, which is supported for multiple configurations. See `slb_configs` below.
        """
        _K8sSlbAttachmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            app_id=app_id,
            slb_configs=slb_configs,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             app_id: Optional[pulumi.Input[str]] = None,
             slb_configs: Optional[pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if app_id is None and 'appId' in kwargs:
            app_id = kwargs['appId']
        if slb_configs is None and 'slbConfigs' in kwargs:
            slb_configs = kwargs['slbConfigs']

        if app_id is not None:
            _setter("app_id", app_id)
        if slb_configs is not None:
            _setter("slb_configs", slb_configs)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the EDAS k8s application to which you want to bind SLB instances.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter(name="slbConfigs")
    def slb_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigArgs']]]]:
        """
        The configurations of SLB attachment, which is supported for multiple configurations. See `slb_configs` below.
        """
        return pulumi.get(self, "slb_configs")

    @slb_configs.setter
    def slb_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigArgs']]]]):
        pulumi.set(self, "slb_configs", value)


class K8sSlbAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 slb_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['K8sSlbAttachmentSlbConfigArgs']]]]] = None,
                 __props__=None):
        """
        Binds SLBs to an EDAS k8s application.

        For information about EDAS k8s slb attachment and how to use it, see [What is k8s slb attachment](https://www.alibabacloud.com/help/en/enterprise-distributed-application-service/latest/bindk8sslb).

        > **NOTE:** Available since v1.194.0.

        ## Import

        Slb information of EDAS k8s application can be imported using the ID of an EDAS k8s application. e.g.

        ```sh
         $ pulumi import alicloud:edas/k8sSlbAttachment:K8sSlbAttachment example <EDAS k8s app id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: The ID of the EDAS k8s application to which you want to bind SLB instances.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['K8sSlbAttachmentSlbConfigArgs']]]] slb_configs: The configurations of SLB attachment, which is supported for multiple configurations. See `slb_configs` below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: K8sSlbAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Binds SLBs to an EDAS k8s application.

        For information about EDAS k8s slb attachment and how to use it, see [What is k8s slb attachment](https://www.alibabacloud.com/help/en/enterprise-distributed-application-service/latest/bindk8sslb).

        > **NOTE:** Available since v1.194.0.

        ## Import

        Slb information of EDAS k8s application can be imported using the ID of an EDAS k8s application. e.g.

        ```sh
         $ pulumi import alicloud:edas/k8sSlbAttachment:K8sSlbAttachment example <EDAS k8s app id>
        ```

        :param str resource_name: The name of the resource.
        :param K8sSlbAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(K8sSlbAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            K8sSlbAttachmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 slb_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['K8sSlbAttachmentSlbConfigArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = K8sSlbAttachmentArgs.__new__(K8sSlbAttachmentArgs)

            if app_id is None and not opts.urn:
                raise TypeError("Missing required property 'app_id'")
            __props__.__dict__["app_id"] = app_id
            __props__.__dict__["slb_configs"] = slb_configs
        super(K8sSlbAttachment, __self__).__init__(
            'alicloud:edas/k8sSlbAttachment:K8sSlbAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_id: Optional[pulumi.Input[str]] = None,
            slb_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['K8sSlbAttachmentSlbConfigArgs']]]]] = None) -> 'K8sSlbAttachment':
        """
        Get an existing K8sSlbAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: The ID of the EDAS k8s application to which you want to bind SLB instances.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['K8sSlbAttachmentSlbConfigArgs']]]] slb_configs: The configurations of SLB attachment, which is supported for multiple configurations. See `slb_configs` below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _K8sSlbAttachmentState.__new__(_K8sSlbAttachmentState)

        __props__.__dict__["app_id"] = app_id
        __props__.__dict__["slb_configs"] = slb_configs
        return K8sSlbAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Output[str]:
        """
        The ID of the EDAS k8s application to which you want to bind SLB instances.
        """
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter(name="slbConfigs")
    def slb_configs(self) -> pulumi.Output[Sequence['outputs.K8sSlbAttachmentSlbConfig']]:
        """
        The configurations of SLB attachment, which is supported for multiple configurations. See `slb_configs` below.
        """
        return pulumi.get(self, "slb_configs")

