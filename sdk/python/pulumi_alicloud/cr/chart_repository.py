# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ChartRepositoryArgs', 'ChartRepository']

@pulumi.input_type
class ChartRepositoryArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 repo_name: pulumi.Input[str],
                 repo_namespace_name: pulumi.Input[str],
                 repo_type: Optional[pulumi.Input[str]] = None,
                 summary: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ChartRepository resource.
        :param pulumi.Input[str] instance_id: The ID of the Container Registry instance.
        :param pulumi.Input[str] repo_name: The name of the repository that you want to create.
        :param pulumi.Input[str] repo_namespace_name: The namespace to which the repository belongs.
        :param pulumi.Input[str] repo_type: The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        :param pulumi.Input[str] summary: The summary about the repository.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "repo_name", repo_name)
        pulumi.set(__self__, "repo_namespace_name", repo_namespace_name)
        if repo_type is not None:
            pulumi.set(__self__, "repo_type", repo_type)
        if summary is not None:
            pulumi.set(__self__, "summary", summary)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the Container Registry instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="repoName")
    def repo_name(self) -> pulumi.Input[str]:
        """
        The name of the repository that you want to create.
        """
        return pulumi.get(self, "repo_name")

    @repo_name.setter
    def repo_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "repo_name", value)

    @property
    @pulumi.getter(name="repoNamespaceName")
    def repo_namespace_name(self) -> pulumi.Input[str]:
        """
        The namespace to which the repository belongs.
        """
        return pulumi.get(self, "repo_namespace_name")

    @repo_namespace_name.setter
    def repo_namespace_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "repo_namespace_name", value)

    @property
    @pulumi.getter(name="repoType")
    def repo_type(self) -> Optional[pulumi.Input[str]]:
        """
        The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        """
        return pulumi.get(self, "repo_type")

    @repo_type.setter
    def repo_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repo_type", value)

    @property
    @pulumi.getter
    def summary(self) -> Optional[pulumi.Input[str]]:
        """
        The summary about the repository.
        """
        return pulumi.get(self, "summary")

    @summary.setter
    def summary(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "summary", value)


@pulumi.input_type
class _ChartRepositoryState:
    def __init__(__self__, *,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 repo_name: Optional[pulumi.Input[str]] = None,
                 repo_namespace_name: Optional[pulumi.Input[str]] = None,
                 repo_type: Optional[pulumi.Input[str]] = None,
                 summary: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ChartRepository resources.
        :param pulumi.Input[str] instance_id: The ID of the Container Registry instance.
        :param pulumi.Input[str] repo_name: The name of the repository that you want to create.
        :param pulumi.Input[str] repo_namespace_name: The namespace to which the repository belongs.
        :param pulumi.Input[str] repo_type: The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        :param pulumi.Input[str] summary: The summary about the repository.
        """
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if repo_name is not None:
            pulumi.set(__self__, "repo_name", repo_name)
        if repo_namespace_name is not None:
            pulumi.set(__self__, "repo_namespace_name", repo_namespace_name)
        if repo_type is not None:
            pulumi.set(__self__, "repo_type", repo_type)
        if summary is not None:
            pulumi.set(__self__, "summary", summary)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Container Registry instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="repoName")
    def repo_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the repository that you want to create.
        """
        return pulumi.get(self, "repo_name")

    @repo_name.setter
    def repo_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repo_name", value)

    @property
    @pulumi.getter(name="repoNamespaceName")
    def repo_namespace_name(self) -> Optional[pulumi.Input[str]]:
        """
        The namespace to which the repository belongs.
        """
        return pulumi.get(self, "repo_namespace_name")

    @repo_namespace_name.setter
    def repo_namespace_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repo_namespace_name", value)

    @property
    @pulumi.getter(name="repoType")
    def repo_type(self) -> Optional[pulumi.Input[str]]:
        """
        The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        """
        return pulumi.get(self, "repo_type")

    @repo_type.setter
    def repo_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repo_type", value)

    @property
    @pulumi.getter
    def summary(self) -> Optional[pulumi.Input[str]]:
        """
        The summary about the repository.
        """
        return pulumi.get(self, "summary")

    @summary.setter
    def summary(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "summary", value)


class ChartRepository(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 repo_name: Optional[pulumi.Input[str]] = None,
                 repo_namespace_name: Optional[pulumi.Input[str]] = None,
                 repo_type: Optional[pulumi.Input[str]] = None,
                 summary: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CR Chart Repository resource.

        For information about CR Chart Repository and how to use it, see [What is Chart Repository](https://www.alibabacloud.com/help/doc-detail/145318.htm).

        > **NOTE:** Available in v1.149.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_registry_enterprise_instance = alicloud.cr.RegistryEnterpriseInstance("defaultRegistryEnterpriseInstance",
            payment_type="Subscription",
            period=1,
            instance_type="Advanced",
            instance_name="name")
        default_chart_namespace = alicloud.cr.ChartNamespace("defaultChartNamespace",
            instance_id=default_registry_enterprise_instance.id,
            namespace_name="name")
        default_chart_repository = alicloud.cr.ChartRepository("defaultChartRepository",
            repo_namespace_name=default_chart_namespace.namespace_name,
            instance_id=local["instance"],
            repo_name="repo_name")
        ```

        ## Import

        CR Chart Repository can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cr/chartRepository:ChartRepository example <instance_id>:<repo_namespace_name>:<repo_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: The ID of the Container Registry instance.
        :param pulumi.Input[str] repo_name: The name of the repository that you want to create.
        :param pulumi.Input[str] repo_namespace_name: The namespace to which the repository belongs.
        :param pulumi.Input[str] repo_type: The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        :param pulumi.Input[str] summary: The summary about the repository.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ChartRepositoryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CR Chart Repository resource.

        For information about CR Chart Repository and how to use it, see [What is Chart Repository](https://www.alibabacloud.com/help/doc-detail/145318.htm).

        > **NOTE:** Available in v1.149.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_registry_enterprise_instance = alicloud.cr.RegistryEnterpriseInstance("defaultRegistryEnterpriseInstance",
            payment_type="Subscription",
            period=1,
            instance_type="Advanced",
            instance_name="name")
        default_chart_namespace = alicloud.cr.ChartNamespace("defaultChartNamespace",
            instance_id=default_registry_enterprise_instance.id,
            namespace_name="name")
        default_chart_repository = alicloud.cr.ChartRepository("defaultChartRepository",
            repo_namespace_name=default_chart_namespace.namespace_name,
            instance_id=local["instance"],
            repo_name="repo_name")
        ```

        ## Import

        CR Chart Repository can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cr/chartRepository:ChartRepository example <instance_id>:<repo_namespace_name>:<repo_name>
        ```

        :param str resource_name: The name of the resource.
        :param ChartRepositoryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ChartRepositoryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 repo_name: Optional[pulumi.Input[str]] = None,
                 repo_namespace_name: Optional[pulumi.Input[str]] = None,
                 repo_type: Optional[pulumi.Input[str]] = None,
                 summary: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ChartRepositoryArgs.__new__(ChartRepositoryArgs)

            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if repo_name is None and not opts.urn:
                raise TypeError("Missing required property 'repo_name'")
            __props__.__dict__["repo_name"] = repo_name
            if repo_namespace_name is None and not opts.urn:
                raise TypeError("Missing required property 'repo_namespace_name'")
            __props__.__dict__["repo_namespace_name"] = repo_namespace_name
            __props__.__dict__["repo_type"] = repo_type
            __props__.__dict__["summary"] = summary
        super(ChartRepository, __self__).__init__(
            'alicloud:cr/chartRepository:ChartRepository',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            repo_name: Optional[pulumi.Input[str]] = None,
            repo_namespace_name: Optional[pulumi.Input[str]] = None,
            repo_type: Optional[pulumi.Input[str]] = None,
            summary: Optional[pulumi.Input[str]] = None) -> 'ChartRepository':
        """
        Get an existing ChartRepository resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: The ID of the Container Registry instance.
        :param pulumi.Input[str] repo_name: The name of the repository that you want to create.
        :param pulumi.Input[str] repo_namespace_name: The namespace to which the repository belongs.
        :param pulumi.Input[str] repo_type: The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        :param pulumi.Input[str] summary: The summary about the repository.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ChartRepositoryState.__new__(_ChartRepositoryState)

        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["repo_name"] = repo_name
        __props__.__dict__["repo_namespace_name"] = repo_namespace_name
        __props__.__dict__["repo_type"] = repo_type
        __props__.__dict__["summary"] = summary
        return ChartRepository(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the Container Registry instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="repoName")
    def repo_name(self) -> pulumi.Output[str]:
        """
        The name of the repository that you want to create.
        """
        return pulumi.get(self, "repo_name")

    @property
    @pulumi.getter(name="repoNamespaceName")
    def repo_namespace_name(self) -> pulumi.Output[str]:
        """
        The namespace to which the repository belongs.
        """
        return pulumi.get(self, "repo_namespace_name")

    @property
    @pulumi.getter(name="repoType")
    def repo_type(self) -> pulumi.Output[str]:
        """
        The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        """
        return pulumi.get(self, "repo_type")

    @property
    @pulumi.getter
    def summary(self) -> pulumi.Output[Optional[str]]:
        """
        The summary about the repository.
        """
        return pulumi.get(self, "summary")

