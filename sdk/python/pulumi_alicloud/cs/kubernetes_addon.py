# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['KubernetesAddonInitArgs', 'KubernetesAddon']

@pulumi.input_type
class KubernetesAddonInitArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 version: pulumi.Input[str],
                 config: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a KubernetesAddon resource.
        :param pulumi.Input[str] cluster_id: The id of kubernetes cluster.
        :param pulumi.Input[str] version: The current version of addon.
        :param pulumi.Input[str] config: The custom configuration of addon. You can checkout the customizable configuration of the addon through datasource `cs_get_kubernetes_addon_metadata`, the returned format is the standard json schema. If return empty, it means that the addon does not support custom configuration yet. You can also checkout the current custom configuration through the data source `cs_get_kubernetes_addons`.
        :param pulumi.Input[str] name: The name of addon.
        """
        KubernetesAddonInitArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cluster_id=cluster_id,
            version=version,
            config=config,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cluster_id: pulumi.Input[str],
             version: pulumi.Input[str],
             config: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("cluster_id", cluster_id)
        _setter("version", version)
        if config is not None:
            _setter("config", config)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        The id of kubernetes cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def version(self) -> pulumi.Input[str]:
        """
        The current version of addon.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: pulumi.Input[str]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[str]]:
        """
        The custom configuration of addon. You can checkout the customizable configuration of the addon through datasource `cs_get_kubernetes_addon_metadata`, the returned format is the standard json schema. If return empty, it means that the addon does not support custom configuration yet. You can also checkout the current custom configuration through the data source `cs_get_kubernetes_addons`.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of addon.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _KubernetesAddonState:
    def __init__(__self__, *,
                 can_upgrade: Optional[pulumi.Input[bool]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 next_version: Optional[pulumi.Input[str]] = None,
                 required: Optional[pulumi.Input[bool]] = None,
                 version: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering KubernetesAddon resources.
        :param pulumi.Input[bool] can_upgrade: Is the addon ready for upgrade.
        :param pulumi.Input[str] cluster_id: The id of kubernetes cluster.
        :param pulumi.Input[str] config: The custom configuration of addon. You can checkout the customizable configuration of the addon through datasource `cs_get_kubernetes_addon_metadata`, the returned format is the standard json schema. If return empty, it means that the addon does not support custom configuration yet. You can also checkout the current custom configuration through the data source `cs_get_kubernetes_addons`.
        :param pulumi.Input[str] name: The name of addon.
        :param pulumi.Input[str] next_version: The version which addon can be upgraded to.
        :param pulumi.Input[bool] required: Is it a mandatory addon to be installed.
        :param pulumi.Input[str] version: The current version of addon.
        """
        _KubernetesAddonState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            can_upgrade=can_upgrade,
            cluster_id=cluster_id,
            config=config,
            name=name,
            next_version=next_version,
            required=required,
            version=version,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             can_upgrade: Optional[pulumi.Input[bool]] = None,
             cluster_id: Optional[pulumi.Input[str]] = None,
             config: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             next_version: Optional[pulumi.Input[str]] = None,
             required: Optional[pulumi.Input[bool]] = None,
             version: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if can_upgrade is not None:
            _setter("can_upgrade", can_upgrade)
        if cluster_id is not None:
            _setter("cluster_id", cluster_id)
        if config is not None:
            _setter("config", config)
        if name is not None:
            _setter("name", name)
        if next_version is not None:
            _setter("next_version", next_version)
        if required is not None:
            _setter("required", required)
        if version is not None:
            _setter("version", version)

    @property
    @pulumi.getter(name="canUpgrade")
    def can_upgrade(self) -> Optional[pulumi.Input[bool]]:
        """
        Is the addon ready for upgrade.
        """
        return pulumi.get(self, "can_upgrade")

    @can_upgrade.setter
    def can_upgrade(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "can_upgrade", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of kubernetes cluster.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[str]]:
        """
        The custom configuration of addon. You can checkout the customizable configuration of the addon through datasource `cs_get_kubernetes_addon_metadata`, the returned format is the standard json schema. If return empty, it means that the addon does not support custom configuration yet. You can also checkout the current custom configuration through the data source `cs_get_kubernetes_addons`.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of addon.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nextVersion")
    def next_version(self) -> Optional[pulumi.Input[str]]:
        """
        The version which addon can be upgraded to.
        """
        return pulumi.get(self, "next_version")

    @next_version.setter
    def next_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "next_version", value)

    @property
    @pulumi.getter
    def required(self) -> Optional[pulumi.Input[bool]]:
        """
        Is it a mandatory addon to be installed.
        """
        return pulumi.get(self, "required")

    @required.setter
    def required(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "required", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        The current version of addon.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)


class KubernetesAddon(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource will help you to manage addon in Kubernetes Cluster, see [What is kubernetes addon](https://www.alibabacloud.com/help/en/ack/ack-managed-and-ack-dedicated/developer-reference/api-install-a-component-in-an-ack-cluster).

        > **NOTE:** Available since v1.150.0.

        > **NOTE:** From version 1.166.0, support specifying addon customizable configuration.

        ## Import

        Cluster addon can be imported by cluster id and addon name. Then write the addon.tf file according to the result of `pulumi preview`.

        ```sh
         $ pulumi import alicloud:cs/kubernetesAddon:KubernetesAddon my_addon <cluster_id>:<addon_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The id of kubernetes cluster.
        :param pulumi.Input[str] config: The custom configuration of addon. You can checkout the customizable configuration of the addon through datasource `cs_get_kubernetes_addon_metadata`, the returned format is the standard json schema. If return empty, it means that the addon does not support custom configuration yet. You can also checkout the current custom configuration through the data source `cs_get_kubernetes_addons`.
        :param pulumi.Input[str] name: The name of addon.
        :param pulumi.Input[str] version: The current version of addon.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KubernetesAddonInitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource will help you to manage addon in Kubernetes Cluster, see [What is kubernetes addon](https://www.alibabacloud.com/help/en/ack/ack-managed-and-ack-dedicated/developer-reference/api-install-a-component-in-an-ack-cluster).

        > **NOTE:** Available since v1.150.0.

        > **NOTE:** From version 1.166.0, support specifying addon customizable configuration.

        ## Import

        Cluster addon can be imported by cluster id and addon name. Then write the addon.tf file according to the result of `pulumi preview`.

        ```sh
         $ pulumi import alicloud:cs/kubernetesAddon:KubernetesAddon my_addon <cluster_id>:<addon_name>
        ```

        :param str resource_name: The name of the resource.
        :param KubernetesAddonInitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KubernetesAddonInitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            KubernetesAddonInitArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KubernetesAddonInitArgs.__new__(KubernetesAddonInitArgs)

            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["config"] = config
            __props__.__dict__["name"] = name
            if version is None and not opts.urn:
                raise TypeError("Missing required property 'version'")
            __props__.__dict__["version"] = version
            __props__.__dict__["can_upgrade"] = None
            __props__.__dict__["next_version"] = None
            __props__.__dict__["required"] = None
        super(KubernetesAddon, __self__).__init__(
            'alicloud:cs/kubernetesAddon:KubernetesAddon',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            can_upgrade: Optional[pulumi.Input[bool]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            config: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            next_version: Optional[pulumi.Input[str]] = None,
            required: Optional[pulumi.Input[bool]] = None,
            version: Optional[pulumi.Input[str]] = None) -> 'KubernetesAddon':
        """
        Get an existing KubernetesAddon resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] can_upgrade: Is the addon ready for upgrade.
        :param pulumi.Input[str] cluster_id: The id of kubernetes cluster.
        :param pulumi.Input[str] config: The custom configuration of addon. You can checkout the customizable configuration of the addon through datasource `cs_get_kubernetes_addon_metadata`, the returned format is the standard json schema. If return empty, it means that the addon does not support custom configuration yet. You can also checkout the current custom configuration through the data source `cs_get_kubernetes_addons`.
        :param pulumi.Input[str] name: The name of addon.
        :param pulumi.Input[str] next_version: The version which addon can be upgraded to.
        :param pulumi.Input[bool] required: Is it a mandatory addon to be installed.
        :param pulumi.Input[str] version: The current version of addon.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KubernetesAddonState.__new__(_KubernetesAddonState)

        __props__.__dict__["can_upgrade"] = can_upgrade
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["config"] = config
        __props__.__dict__["name"] = name
        __props__.__dict__["next_version"] = next_version
        __props__.__dict__["required"] = required
        __props__.__dict__["version"] = version
        return KubernetesAddon(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="canUpgrade")
    def can_upgrade(self) -> pulumi.Output[bool]:
        """
        Is the addon ready for upgrade.
        """
        return pulumi.get(self, "can_upgrade")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The id of kubernetes cluster.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[str]:
        """
        The custom configuration of addon. You can checkout the customizable configuration of the addon through datasource `cs_get_kubernetes_addon_metadata`, the returned format is the standard json schema. If return empty, it means that the addon does not support custom configuration yet. You can also checkout the current custom configuration through the data source `cs_get_kubernetes_addons`.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of addon.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nextVersion")
    def next_version(self) -> pulumi.Output[str]:
        """
        The version which addon can be upgraded to.
        """
        return pulumi.get(self, "next_version")

    @property
    @pulumi.getter
    def required(self) -> pulumi.Output[bool]:
        """
        Is it a mandatory addon to be installed.
        """
        return pulumi.get(self, "required")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        The current version of addon.
        """
        return pulumi.get(self, "version")

