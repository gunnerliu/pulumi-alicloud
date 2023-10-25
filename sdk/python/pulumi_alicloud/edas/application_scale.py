# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ApplicationScaleArgs', 'ApplicationScale']

@pulumi.input_type
class ApplicationScaleArgs:
    def __init__(__self__, *,
                 app_id: pulumi.Input[str],
                 deploy_group: pulumi.Input[str],
                 ecu_infos: pulumi.Input[Sequence[pulumi.Input[str]]],
                 force_status: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a ApplicationScale resource.
        :param pulumi.Input[str] app_id: The ID of the application that you want to deploy.
        :param pulumi.Input[str] deploy_group: The ID of the instance group to which you want to add ECS instances to scale out the application.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ecu_infos: The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        :param pulumi.Input[bool] force_status: This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
        """
        ApplicationScaleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            app_id=app_id,
            deploy_group=deploy_group,
            ecu_infos=ecu_infos,
            force_status=force_status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             app_id: Optional[pulumi.Input[str]] = None,
             deploy_group: Optional[pulumi.Input[str]] = None,
             ecu_infos: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             force_status: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if app_id is None and 'appId' in kwargs:
            app_id = kwargs['appId']
        if app_id is None:
            raise TypeError("Missing 'app_id' argument")
        if deploy_group is None and 'deployGroup' in kwargs:
            deploy_group = kwargs['deployGroup']
        if deploy_group is None:
            raise TypeError("Missing 'deploy_group' argument")
        if ecu_infos is None and 'ecuInfos' in kwargs:
            ecu_infos = kwargs['ecuInfos']
        if ecu_infos is None:
            raise TypeError("Missing 'ecu_infos' argument")
        if force_status is None and 'forceStatus' in kwargs:
            force_status = kwargs['forceStatus']

        _setter("app_id", app_id)
        _setter("deploy_group", deploy_group)
        _setter("ecu_infos", ecu_infos)
        if force_status is not None:
            _setter("force_status", force_status)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Input[str]:
        """
        The ID of the application that you want to deploy.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter(name="deployGroup")
    def deploy_group(self) -> pulumi.Input[str]:
        """
        The ID of the instance group to which you want to add ECS instances to scale out the application.
        """
        return pulumi.get(self, "deploy_group")

    @deploy_group.setter
    def deploy_group(self, value: pulumi.Input[str]):
        pulumi.set(self, "deploy_group", value)

    @property
    @pulumi.getter(name="ecuInfos")
    def ecu_infos(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        """
        return pulumi.get(self, "ecu_infos")

    @ecu_infos.setter
    def ecu_infos(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "ecu_infos", value)

    @property
    @pulumi.getter(name="forceStatus")
    def force_status(self) -> Optional[pulumi.Input[bool]]:
        """
        This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
        """
        return pulumi.get(self, "force_status")

    @force_status.setter
    def force_status(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_status", value)


@pulumi.input_type
class _ApplicationScaleState:
    def __init__(__self__, *,
                 app_id: Optional[pulumi.Input[str]] = None,
                 deploy_group: Optional[pulumi.Input[str]] = None,
                 ecc_info: Optional[pulumi.Input[str]] = None,
                 ecu_infos: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 force_status: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering ApplicationScale resources.
        :param pulumi.Input[str] app_id: The ID of the application that you want to deploy.
        :param pulumi.Input[str] deploy_group: The ID of the instance group to which you want to add ECS instances to scale out the application.
        :param pulumi.Input[str] ecc_info: The ecc information of the resource supplied above. The value is formulated as `<ecc1,ecc2>`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ecu_infos: The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        :param pulumi.Input[bool] force_status: This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
        """
        _ApplicationScaleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            app_id=app_id,
            deploy_group=deploy_group,
            ecc_info=ecc_info,
            ecu_infos=ecu_infos,
            force_status=force_status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             app_id: Optional[pulumi.Input[str]] = None,
             deploy_group: Optional[pulumi.Input[str]] = None,
             ecc_info: Optional[pulumi.Input[str]] = None,
             ecu_infos: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             force_status: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if app_id is None and 'appId' in kwargs:
            app_id = kwargs['appId']
        if deploy_group is None and 'deployGroup' in kwargs:
            deploy_group = kwargs['deployGroup']
        if ecc_info is None and 'eccInfo' in kwargs:
            ecc_info = kwargs['eccInfo']
        if ecu_infos is None and 'ecuInfos' in kwargs:
            ecu_infos = kwargs['ecuInfos']
        if force_status is None and 'forceStatus' in kwargs:
            force_status = kwargs['forceStatus']

        if app_id is not None:
            _setter("app_id", app_id)
        if deploy_group is not None:
            _setter("deploy_group", deploy_group)
        if ecc_info is not None:
            _setter("ecc_info", ecc_info)
        if ecu_infos is not None:
            _setter("ecu_infos", ecu_infos)
        if force_status is not None:
            _setter("force_status", force_status)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the application that you want to deploy.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter(name="deployGroup")
    def deploy_group(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the instance group to which you want to add ECS instances to scale out the application.
        """
        return pulumi.get(self, "deploy_group")

    @deploy_group.setter
    def deploy_group(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "deploy_group", value)

    @property
    @pulumi.getter(name="eccInfo")
    def ecc_info(self) -> Optional[pulumi.Input[str]]:
        """
        The ecc information of the resource supplied above. The value is formulated as `<ecc1,ecc2>`.
        """
        return pulumi.get(self, "ecc_info")

    @ecc_info.setter
    def ecc_info(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ecc_info", value)

    @property
    @pulumi.getter(name="ecuInfos")
    def ecu_infos(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        """
        return pulumi.get(self, "ecu_infos")

    @ecu_infos.setter
    def ecu_infos(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ecu_infos", value)

    @property
    @pulumi.getter(name="forceStatus")
    def force_status(self) -> Optional[pulumi.Input[bool]]:
        """
        This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
        """
        return pulumi.get(self, "force_status")

    @force_status.setter
    def force_status(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_status", value)


class ApplicationScale(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 deploy_group: Optional[pulumi.Input[str]] = None,
                 ecu_infos: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 force_status: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        This operation is provided to scale out an EDAS application, see [What is EDAS Application Scale](https://www.alibabacloud.com/help/en/edas/developer-reference/api-edas-2017-08-01-scaleoutapplication).

        > **NOTE:** Available since v1.82.0.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: The ID of the application that you want to deploy.
        :param pulumi.Input[str] deploy_group: The ID of the instance group to which you want to add ECS instances to scale out the application.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ecu_infos: The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        :param pulumi.Input[bool] force_status: This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplicationScaleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This operation is provided to scale out an EDAS application, see [What is EDAS Application Scale](https://www.alibabacloud.com/help/en/edas/developer-reference/api-edas-2017-08-01-scaleoutapplication).

        > **NOTE:** Available since v1.82.0.

        :param str resource_name: The name of the resource.
        :param ApplicationScaleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplicationScaleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ApplicationScaleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 deploy_group: Optional[pulumi.Input[str]] = None,
                 ecu_infos: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 force_status: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplicationScaleArgs.__new__(ApplicationScaleArgs)

            if app_id is None and not opts.urn:
                raise TypeError("Missing required property 'app_id'")
            __props__.__dict__["app_id"] = app_id
            if deploy_group is None and not opts.urn:
                raise TypeError("Missing required property 'deploy_group'")
            __props__.__dict__["deploy_group"] = deploy_group
            if ecu_infos is None and not opts.urn:
                raise TypeError("Missing required property 'ecu_infos'")
            __props__.__dict__["ecu_infos"] = ecu_infos
            __props__.__dict__["force_status"] = force_status
            __props__.__dict__["ecc_info"] = None
        super(ApplicationScale, __self__).__init__(
            'alicloud:edas/applicationScale:ApplicationScale',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_id: Optional[pulumi.Input[str]] = None,
            deploy_group: Optional[pulumi.Input[str]] = None,
            ecc_info: Optional[pulumi.Input[str]] = None,
            ecu_infos: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            force_status: Optional[pulumi.Input[bool]] = None) -> 'ApplicationScale':
        """
        Get an existing ApplicationScale resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: The ID of the application that you want to deploy.
        :param pulumi.Input[str] deploy_group: The ID of the instance group to which you want to add ECS instances to scale out the application.
        :param pulumi.Input[str] ecc_info: The ecc information of the resource supplied above. The value is formulated as `<ecc1,ecc2>`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ecu_infos: The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        :param pulumi.Input[bool] force_status: This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplicationScaleState.__new__(_ApplicationScaleState)

        __props__.__dict__["app_id"] = app_id
        __props__.__dict__["deploy_group"] = deploy_group
        __props__.__dict__["ecc_info"] = ecc_info
        __props__.__dict__["ecu_infos"] = ecu_infos
        __props__.__dict__["force_status"] = force_status
        return ApplicationScale(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Output[str]:
        """
        The ID of the application that you want to deploy.
        """
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter(name="deployGroup")
    def deploy_group(self) -> pulumi.Output[str]:
        """
        The ID of the instance group to which you want to add ECS instances to scale out the application.
        """
        return pulumi.get(self, "deploy_group")

    @property
    @pulumi.getter(name="eccInfo")
    def ecc_info(self) -> pulumi.Output[str]:
        """
        The ecc information of the resource supplied above. The value is formulated as `<ecc1,ecc2>`.
        """
        return pulumi.get(self, "ecc_info")

    @property
    @pulumi.getter(name="ecuInfos")
    def ecu_infos(self) -> pulumi.Output[Sequence[str]]:
        """
        The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        """
        return pulumi.get(self, "ecu_infos")

    @property
    @pulumi.getter(name="forceStatus")
    def force_status(self) -> pulumi.Output[Optional[bool]]:
        """
        This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
        """
        return pulumi.get(self, "force_status")

