# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['RegistryEnterpriseRepo']


class RegistryEnterpriseRepo(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 detail: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 repo_type: Optional[pulumi.Input[str]] = None,
                 summary: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        This resource will help you to manager Container Registry Enterprise Edition repositories.

        For information about Container Registry Enterprise Edition repository and how to use it, see [Create a Repository](https://www.alibabacloud.com/help/doc-detail/145291.htm)

        > **NOTE:** Available in v1.86.0+.

        > **NOTE:** You need to set your registry password in Container Registry Enterprise Edition console before use this resource.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        my_namespace = alicloud.cs.RegistryEnterpriseNamespace("my-namespace",
            instance_id="cri-xxx",
            auto_create=False,
            default_visibility="PUBLIC")
        my_repo = alicloud.cs.RegistryEnterpriseRepo("my-repo",
            instance_id=my_namespace.instance_id,
            namespace=my_namespace.name,
            summary="this is summary of my new repo",
            repo_type="PUBLIC",
            detail="this is a public repo")
        ```

        ## Import

        Container Registry Enterprise Edition repository can be imported using the `{instance_id}:{namespace}:{repository}`, e.g.

        ```sh
         $ pulumi import alicloud:cs/registryEnterpriseRepo:RegistryEnterpriseRepo default `cri-xxx:my-namespace:my-repo`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] detail: The repository specific information. MarkDown format is supported, and the length limit is 2000.
        :param pulumi.Input[str] instance_id: ID of Container Registry Enterprise Edition instance.
        :param pulumi.Input[str] name: Name of Container Registry Enterprise Edition repository. It can contain 2 to 64 characters.
        :param pulumi.Input[str] namespace: Name of Container Registry Enterprise Edition namespace where repository is located. It can contain 2 to 30 characters.
        :param pulumi.Input[str] repo_type: `PUBLIC` or `PRIVATE`, repo's visibility.
        :param pulumi.Input[str] summary: The repository general information. It can contain 1 to 100 characters.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['detail'] = detail
            if instance_id is None:
                raise TypeError("Missing required property 'instance_id'")
            __props__['instance_id'] = instance_id
            __props__['name'] = name
            if namespace is None:
                raise TypeError("Missing required property 'namespace'")
            __props__['namespace'] = namespace
            if repo_type is None:
                raise TypeError("Missing required property 'repo_type'")
            __props__['repo_type'] = repo_type
            if summary is None:
                raise TypeError("Missing required property 'summary'")
            __props__['summary'] = summary
            __props__['repo_id'] = None
        super(RegistryEnterpriseRepo, __self__).__init__(
            'alicloud:cs/registryEnterpriseRepo:RegistryEnterpriseRepo',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            detail: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            repo_id: Optional[pulumi.Input[str]] = None,
            repo_type: Optional[pulumi.Input[str]] = None,
            summary: Optional[pulumi.Input[str]] = None) -> 'RegistryEnterpriseRepo':
        """
        Get an existing RegistryEnterpriseRepo resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] detail: The repository specific information. MarkDown format is supported, and the length limit is 2000.
        :param pulumi.Input[str] instance_id: ID of Container Registry Enterprise Edition instance.
        :param pulumi.Input[str] name: Name of Container Registry Enterprise Edition repository. It can contain 2 to 64 characters.
        :param pulumi.Input[str] namespace: Name of Container Registry Enterprise Edition namespace where repository is located. It can contain 2 to 30 characters.
        :param pulumi.Input[str] repo_id: The uuid of Container Registry Enterprise Edition repository.
        :param pulumi.Input[str] repo_type: `PUBLIC` or `PRIVATE`, repo's visibility.
        :param pulumi.Input[str] summary: The repository general information. It can contain 1 to 100 characters.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["detail"] = detail
        __props__["instance_id"] = instance_id
        __props__["name"] = name
        __props__["namespace"] = namespace
        __props__["repo_id"] = repo_id
        __props__["repo_type"] = repo_type
        __props__["summary"] = summary
        return RegistryEnterpriseRepo(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def detail(self) -> pulumi.Output[Optional[str]]:
        """
        The repository specific information. MarkDown format is supported, and the length limit is 2000.
        """
        return pulumi.get(self, "detail")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        ID of Container Registry Enterprise Edition instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of Container Registry Enterprise Edition repository. It can contain 2 to 64 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[str]:
        """
        Name of Container Registry Enterprise Edition namespace where repository is located. It can contain 2 to 30 characters.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="repoId")
    def repo_id(self) -> pulumi.Output[str]:
        """
        The uuid of Container Registry Enterprise Edition repository.
        """
        return pulumi.get(self, "repo_id")

    @property
    @pulumi.getter(name="repoType")
    def repo_type(self) -> pulumi.Output[str]:
        """
        `PUBLIC` or `PRIVATE`, repo's visibility.
        """
        return pulumi.get(self, "repo_type")

    @property
    @pulumi.getter
    def summary(self) -> pulumi.Output[str]:
        """
        The repository general information. It can contain 1 to 100 characters.
        """
        return pulumi.get(self, "summary")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

