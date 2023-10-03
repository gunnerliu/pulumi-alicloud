# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ApplicationGroupArgs', 'ApplicationGroup']

@pulumi.input_type
class ApplicationGroupArgs:
    def __init__(__self__, *,
                 application_group_name: pulumi.Input[str],
                 application_name: pulumi.Input[str],
                 deploy_region_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 import_tag_key: Optional[pulumi.Input[str]] = None,
                 import_tag_value: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ApplicationGroup resource.
        :param pulumi.Input[str] application_group_name: The name of the Application group.
        :param pulumi.Input[str] application_name: The name of the Application.
        :param pulumi.Input[str] deploy_region_id: The region ID of the deployment.
        :param pulumi.Input[str] description: Application group description information.
        :param pulumi.Input[str] import_tag_key: The tag key must be passed in at the same time as the tag value (import_tag_value) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is app-{ApplicationName} (application name).
        :param pulumi.Input[str] import_tag_value: The tag value must be passed in at the same time as the tag key (import_tag_key) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is application group name.
               .
        """
        ApplicationGroupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            application_group_name=application_group_name,
            application_name=application_name,
            deploy_region_id=deploy_region_id,
            description=description,
            import_tag_key=import_tag_key,
            import_tag_value=import_tag_value,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             application_group_name: pulumi.Input[str],
             application_name: pulumi.Input[str],
             deploy_region_id: pulumi.Input[str],
             description: Optional[pulumi.Input[str]] = None,
             import_tag_key: Optional[pulumi.Input[str]] = None,
             import_tag_value: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("application_group_name", application_group_name)
        _setter("application_name", application_name)
        _setter("deploy_region_id", deploy_region_id)
        if description is not None:
            _setter("description", description)
        if import_tag_key is not None:
            _setter("import_tag_key", import_tag_key)
        if import_tag_value is not None:
            _setter("import_tag_value", import_tag_value)

    @property
    @pulumi.getter(name="applicationGroupName")
    def application_group_name(self) -> pulumi.Input[str]:
        """
        The name of the Application group.
        """
        return pulumi.get(self, "application_group_name")

    @application_group_name.setter
    def application_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "application_group_name", value)

    @property
    @pulumi.getter(name="applicationName")
    def application_name(self) -> pulumi.Input[str]:
        """
        The name of the Application.
        """
        return pulumi.get(self, "application_name")

    @application_name.setter
    def application_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "application_name", value)

    @property
    @pulumi.getter(name="deployRegionId")
    def deploy_region_id(self) -> pulumi.Input[str]:
        """
        The region ID of the deployment.
        """
        return pulumi.get(self, "deploy_region_id")

    @deploy_region_id.setter
    def deploy_region_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "deploy_region_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Application group description information.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="importTagKey")
    def import_tag_key(self) -> Optional[pulumi.Input[str]]:
        """
        The tag key must be passed in at the same time as the tag value (import_tag_value) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is app-{ApplicationName} (application name).
        """
        return pulumi.get(self, "import_tag_key")

    @import_tag_key.setter
    def import_tag_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "import_tag_key", value)

    @property
    @pulumi.getter(name="importTagValue")
    def import_tag_value(self) -> Optional[pulumi.Input[str]]:
        """
        The tag value must be passed in at the same time as the tag key (import_tag_key) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is application group name.
        .
        """
        return pulumi.get(self, "import_tag_value")

    @import_tag_value.setter
    def import_tag_value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "import_tag_value", value)


@pulumi.input_type
class _ApplicationGroupState:
    def __init__(__self__, *,
                 application_group_name: Optional[pulumi.Input[str]] = None,
                 application_name: Optional[pulumi.Input[str]] = None,
                 deploy_region_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 import_tag_key: Optional[pulumi.Input[str]] = None,
                 import_tag_value: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ApplicationGroup resources.
        :param pulumi.Input[str] application_group_name: The name of the Application group.
        :param pulumi.Input[str] application_name: The name of the Application.
        :param pulumi.Input[str] deploy_region_id: The region ID of the deployment.
        :param pulumi.Input[str] description: Application group description information.
        :param pulumi.Input[str] import_tag_key: The tag key must be passed in at the same time as the tag value (import_tag_value) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is app-{ApplicationName} (application name).
        :param pulumi.Input[str] import_tag_value: The tag value must be passed in at the same time as the tag key (import_tag_key) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is application group name.
               .
        """
        _ApplicationGroupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            application_group_name=application_group_name,
            application_name=application_name,
            deploy_region_id=deploy_region_id,
            description=description,
            import_tag_key=import_tag_key,
            import_tag_value=import_tag_value,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             application_group_name: Optional[pulumi.Input[str]] = None,
             application_name: Optional[pulumi.Input[str]] = None,
             deploy_region_id: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             import_tag_key: Optional[pulumi.Input[str]] = None,
             import_tag_value: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if application_group_name is not None:
            _setter("application_group_name", application_group_name)
        if application_name is not None:
            _setter("application_name", application_name)
        if deploy_region_id is not None:
            _setter("deploy_region_id", deploy_region_id)
        if description is not None:
            _setter("description", description)
        if import_tag_key is not None:
            _setter("import_tag_key", import_tag_key)
        if import_tag_value is not None:
            _setter("import_tag_value", import_tag_value)

    @property
    @pulumi.getter(name="applicationGroupName")
    def application_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Application group.
        """
        return pulumi.get(self, "application_group_name")

    @application_group_name.setter
    def application_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_group_name", value)

    @property
    @pulumi.getter(name="applicationName")
    def application_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Application.
        """
        return pulumi.get(self, "application_name")

    @application_name.setter
    def application_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_name", value)

    @property
    @pulumi.getter(name="deployRegionId")
    def deploy_region_id(self) -> Optional[pulumi.Input[str]]:
        """
        The region ID of the deployment.
        """
        return pulumi.get(self, "deploy_region_id")

    @deploy_region_id.setter
    def deploy_region_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "deploy_region_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Application group description information.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="importTagKey")
    def import_tag_key(self) -> Optional[pulumi.Input[str]]:
        """
        The tag key must be passed in at the same time as the tag value (import_tag_value) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is app-{ApplicationName} (application name).
        """
        return pulumi.get(self, "import_tag_key")

    @import_tag_key.setter
    def import_tag_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "import_tag_key", value)

    @property
    @pulumi.getter(name="importTagValue")
    def import_tag_value(self) -> Optional[pulumi.Input[str]]:
        """
        The tag value must be passed in at the same time as the tag key (import_tag_key) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is application group name.
        .
        """
        return pulumi.get(self, "import_tag_value")

    @import_tag_value.setter
    def import_tag_value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "import_tag_value", value)


class ApplicationGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_group_name: Optional[pulumi.Input[str]] = None,
                 application_name: Optional[pulumi.Input[str]] = None,
                 deploy_region_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 import_tag_key: Optional[pulumi.Input[str]] = None,
                 import_tag_value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a OOS Application Group resource.

        For information about OOS Application Group and how to use it, see [What is Application Group](https://www.alibabacloud.com/help/en/operation-orchestration-service/latest/api-oos-2019-06-01-createapplicationgroup).

        > **NOTE:** Available since v1.146.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default_application = alicloud.oos.Application("defaultApplication",
            resource_group_id=default_resource_groups.groups[0].id,
            application_name=name,
            description=name,
            tags={
                "Created": "TF",
            })
        default_regions = alicloud.get_regions(current=True)
        default_application_group = alicloud.oos.ApplicationGroup("defaultApplicationGroup",
            application_group_name=name,
            application_name=default_application.id,
            deploy_region_id=default_regions.regions[0].id,
            description=name,
            import_tag_key="example_key",
            import_tag_value="example_value")
        ```

        ## Import

        OOS Application Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:oos/applicationGroup:ApplicationGroup example <application_name>:<application_group_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_group_name: The name of the Application group.
        :param pulumi.Input[str] application_name: The name of the Application.
        :param pulumi.Input[str] deploy_region_id: The region ID of the deployment.
        :param pulumi.Input[str] description: Application group description information.
        :param pulumi.Input[str] import_tag_key: The tag key must be passed in at the same time as the tag value (import_tag_value) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is app-{ApplicationName} (application name).
        :param pulumi.Input[str] import_tag_value: The tag value must be passed in at the same time as the tag key (import_tag_key) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is application group name.
               .
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplicationGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a OOS Application Group resource.

        For information about OOS Application Group and how to use it, see [What is Application Group](https://www.alibabacloud.com/help/en/operation-orchestration-service/latest/api-oos-2019-06-01-createapplicationgroup).

        > **NOTE:** Available since v1.146.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default_application = alicloud.oos.Application("defaultApplication",
            resource_group_id=default_resource_groups.groups[0].id,
            application_name=name,
            description=name,
            tags={
                "Created": "TF",
            })
        default_regions = alicloud.get_regions(current=True)
        default_application_group = alicloud.oos.ApplicationGroup("defaultApplicationGroup",
            application_group_name=name,
            application_name=default_application.id,
            deploy_region_id=default_regions.regions[0].id,
            description=name,
            import_tag_key="example_key",
            import_tag_value="example_value")
        ```

        ## Import

        OOS Application Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:oos/applicationGroup:ApplicationGroup example <application_name>:<application_group_name>
        ```

        :param str resource_name: The name of the resource.
        :param ApplicationGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplicationGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ApplicationGroupArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_group_name: Optional[pulumi.Input[str]] = None,
                 application_name: Optional[pulumi.Input[str]] = None,
                 deploy_region_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 import_tag_key: Optional[pulumi.Input[str]] = None,
                 import_tag_value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplicationGroupArgs.__new__(ApplicationGroupArgs)

            if application_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'application_group_name'")
            __props__.__dict__["application_group_name"] = application_group_name
            if application_name is None and not opts.urn:
                raise TypeError("Missing required property 'application_name'")
            __props__.__dict__["application_name"] = application_name
            if deploy_region_id is None and not opts.urn:
                raise TypeError("Missing required property 'deploy_region_id'")
            __props__.__dict__["deploy_region_id"] = deploy_region_id
            __props__.__dict__["description"] = description
            __props__.__dict__["import_tag_key"] = import_tag_key
            __props__.__dict__["import_tag_value"] = import_tag_value
        super(ApplicationGroup, __self__).__init__(
            'alicloud:oos/applicationGroup:ApplicationGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            application_group_name: Optional[pulumi.Input[str]] = None,
            application_name: Optional[pulumi.Input[str]] = None,
            deploy_region_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            import_tag_key: Optional[pulumi.Input[str]] = None,
            import_tag_value: Optional[pulumi.Input[str]] = None) -> 'ApplicationGroup':
        """
        Get an existing ApplicationGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_group_name: The name of the Application group.
        :param pulumi.Input[str] application_name: The name of the Application.
        :param pulumi.Input[str] deploy_region_id: The region ID of the deployment.
        :param pulumi.Input[str] description: Application group description information.
        :param pulumi.Input[str] import_tag_key: The tag key must be passed in at the same time as the tag value (import_tag_value) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is app-{ApplicationName} (application name).
        :param pulumi.Input[str] import_tag_value: The tag value must be passed in at the same time as the tag key (import_tag_key) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is application group name.
               .
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplicationGroupState.__new__(_ApplicationGroupState)

        __props__.__dict__["application_group_name"] = application_group_name
        __props__.__dict__["application_name"] = application_name
        __props__.__dict__["deploy_region_id"] = deploy_region_id
        __props__.__dict__["description"] = description
        __props__.__dict__["import_tag_key"] = import_tag_key
        __props__.__dict__["import_tag_value"] = import_tag_value
        return ApplicationGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="applicationGroupName")
    def application_group_name(self) -> pulumi.Output[str]:
        """
        The name of the Application group.
        """
        return pulumi.get(self, "application_group_name")

    @property
    @pulumi.getter(name="applicationName")
    def application_name(self) -> pulumi.Output[str]:
        """
        The name of the Application.
        """
        return pulumi.get(self, "application_name")

    @property
    @pulumi.getter(name="deployRegionId")
    def deploy_region_id(self) -> pulumi.Output[str]:
        """
        The region ID of the deployment.
        """
        return pulumi.get(self, "deploy_region_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Application group description information.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="importTagKey")
    def import_tag_key(self) -> pulumi.Output[str]:
        """
        The tag key must be passed in at the same time as the tag value (import_tag_value) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is app-{ApplicationName} (application name).
        """
        return pulumi.get(self, "import_tag_key")

    @property
    @pulumi.getter(name="importTagValue")
    def import_tag_value(self) -> pulumi.Output[str]:
        """
        The tag value must be passed in at the same time as the tag key (import_tag_key) or none, not just one. If both `import_tag_key` and `import_tag_value` are left empty, the default is application group name.
        .
        """
        return pulumi.get(self, "import_tag_value")

