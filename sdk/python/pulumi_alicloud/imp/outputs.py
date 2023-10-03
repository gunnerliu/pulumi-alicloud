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

__all__ = [
    'AppTemplateConfigList',
    'GetAppTemplatesTemplateResult',
    'GetAppTemplatesTemplateConfigListResult',
]

@pulumi.output_type
class AppTemplateConfigList(dict):
    def __init__(__self__, *,
                 key: Optional[str] = None,
                 value: Optional[str] = None):
        """
        :param str key: Configuration item key. Valid values: ["config.appCallbackAuthKey","config.appCallbackUrl","config.callbackClass.live","config.callbackClass.user","config.livePullDomain","config.livePushDomain","config.multipleClientsLogin","config.regionId","config.streamChangeCallbackUrl"].
        :param str value: Configuration item content.
               
               > **NOTE:**  By default, the attribute `config_list` will return all of nine keys with empty value. If you want to set one or more of the key's value, you had better also set other keys, otherwise, there will be a diff.
        """
        AppTemplateConfigList._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            value=value,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: Optional[str] = None,
             value: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if key is not None:
            _setter("key", key)
        if value is not None:
            _setter("value", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[str]:
        """
        Configuration item key. Valid values: ["config.appCallbackAuthKey","config.appCallbackUrl","config.callbackClass.live","config.callbackClass.user","config.livePullDomain","config.livePushDomain","config.multipleClientsLogin","config.regionId","config.streamChangeCallbackUrl"].
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        """
        Configuration item content.

        > **NOTE:**  By default, the attribute `config_list` will return all of nine keys with empty value. If you want to set one or more of the key's value, you had better also set other keys, otherwise, there will be a diff.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetAppTemplatesTemplateResult(dict):
    def __init__(__self__, *,
                 app_template_creator: str,
                 app_template_id: str,
                 app_template_name: str,
                 component_lists: Sequence[str],
                 config_lists: Sequence['outputs.GetAppTemplatesTemplateConfigListResult'],
                 create_time: str,
                 id: str,
                 integration_mode: str,
                 scene: str,
                 sdk_info: str,
                 standard_room_info: str,
                 status: str):
        """
        :param str app_template_creator: Apply template creator.
        :param str app_template_id: The first ID of the resource.
        :param str app_template_name: The name of the resource.
        :param Sequence[str] component_lists: List of components.
        :param Sequence['GetAppTemplatesTemplateConfigListArgs'] config_lists: List of config.
        :param str create_time: Creation time.
        :param str id: The ID of the App Template.
        :param str integration_mode: Integration mode (Integrated SDK:paasSDK, Model Room: standardRoom).
        :param str scene: Application Template scenario, e-commerce business, classroom classroom.
        :param str sdk_info: SDK information.
        :param str standard_room_info: Model room information.
        :param str status: Application template usage status.
        """
        GetAppTemplatesTemplateResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            app_template_creator=app_template_creator,
            app_template_id=app_template_id,
            app_template_name=app_template_name,
            component_lists=component_lists,
            config_lists=config_lists,
            create_time=create_time,
            id=id,
            integration_mode=integration_mode,
            scene=scene,
            sdk_info=sdk_info,
            standard_room_info=standard_room_info,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             app_template_creator: str,
             app_template_id: str,
             app_template_name: str,
             component_lists: Sequence[str],
             config_lists: Sequence['outputs.GetAppTemplatesTemplateConfigListResult'],
             create_time: str,
             id: str,
             integration_mode: str,
             scene: str,
             sdk_info: str,
             standard_room_info: str,
             status: str,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("app_template_creator", app_template_creator)
        _setter("app_template_id", app_template_id)
        _setter("app_template_name", app_template_name)
        _setter("component_lists", component_lists)
        _setter("config_lists", config_lists)
        _setter("create_time", create_time)
        _setter("id", id)
        _setter("integration_mode", integration_mode)
        _setter("scene", scene)
        _setter("sdk_info", sdk_info)
        _setter("standard_room_info", standard_room_info)
        _setter("status", status)

    @property
    @pulumi.getter(name="appTemplateCreator")
    def app_template_creator(self) -> str:
        """
        Apply template creator.
        """
        return pulumi.get(self, "app_template_creator")

    @property
    @pulumi.getter(name="appTemplateId")
    def app_template_id(self) -> str:
        """
        The first ID of the resource.
        """
        return pulumi.get(self, "app_template_id")

    @property
    @pulumi.getter(name="appTemplateName")
    def app_template_name(self) -> str:
        """
        The name of the resource.
        """
        return pulumi.get(self, "app_template_name")

    @property
    @pulumi.getter(name="componentLists")
    def component_lists(self) -> Sequence[str]:
        """
        List of components.
        """
        return pulumi.get(self, "component_lists")

    @property
    @pulumi.getter(name="configLists")
    def config_lists(self) -> Sequence['outputs.GetAppTemplatesTemplateConfigListResult']:
        """
        List of config.
        """
        return pulumi.get(self, "config_lists")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        Creation time.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the App Template.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="integrationMode")
    def integration_mode(self) -> str:
        """
        Integration mode (Integrated SDK:paasSDK, Model Room: standardRoom).
        """
        return pulumi.get(self, "integration_mode")

    @property
    @pulumi.getter
    def scene(self) -> str:
        """
        Application Template scenario, e-commerce business, classroom classroom.
        """
        return pulumi.get(self, "scene")

    @property
    @pulumi.getter(name="sdkInfo")
    def sdk_info(self) -> str:
        """
        SDK information.
        """
        return pulumi.get(self, "sdk_info")

    @property
    @pulumi.getter(name="standardRoomInfo")
    def standard_room_info(self) -> str:
        """
        Model room information.
        """
        return pulumi.get(self, "standard_room_info")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Application template usage status.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetAppTemplatesTemplateConfigListResult(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str):
        """
        :param str key: Config key.
        :param str value: Config Value.
        """
        GetAppTemplatesTemplateConfigListResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            value=value,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: str,
             value: str,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("key", key)
        _setter("value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        Config key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        Config Value.
        """
        return pulumi.get(self, "value")


