# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['NamespaceArgs', 'Namespace']

@pulumi.input_type
class NamespaceArgs:
    def __init__(__self__, *,
                 namespace_logical_id: pulumi.Input[str],
                 namespace_name: pulumi.Input[str],
                 debug_enable: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Namespace resource.
        :param pulumi.Input[str] namespace_logical_id: The ID of the namespace.
               - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
               - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
        :param pulumi.Input[str] namespace_name: The name of the namespace, The name can be up to `63` characters in length.
        :param pulumi.Input[bool] debug_enable: Specifies whether to enable remote debugging.
        :param pulumi.Input[str] description: The description of the namespace, The description can be up to `128` characters in length.
        """
        NamespaceArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            namespace_logical_id=namespace_logical_id,
            namespace_name=namespace_name,
            debug_enable=debug_enable,
            description=description,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             namespace_logical_id: Optional[pulumi.Input[str]] = None,
             namespace_name: Optional[pulumi.Input[str]] = None,
             debug_enable: Optional[pulumi.Input[bool]] = None,
             description: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if namespace_logical_id is None and 'namespaceLogicalId' in kwargs:
            namespace_logical_id = kwargs['namespaceLogicalId']
        if namespace_logical_id is None:
            raise TypeError("Missing 'namespace_logical_id' argument")
        if namespace_name is None and 'namespaceName' in kwargs:
            namespace_name = kwargs['namespaceName']
        if namespace_name is None:
            raise TypeError("Missing 'namespace_name' argument")
        if debug_enable is None and 'debugEnable' in kwargs:
            debug_enable = kwargs['debugEnable']

        _setter("namespace_logical_id", namespace_logical_id)
        _setter("namespace_name", namespace_name)
        if debug_enable is not None:
            _setter("debug_enable", debug_enable)
        if description is not None:
            _setter("description", description)

    @property
    @pulumi.getter(name="namespaceLogicalId")
    def namespace_logical_id(self) -> pulumi.Input[str]:
        """
        The ID of the namespace.
        - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
        - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
        """
        return pulumi.get(self, "namespace_logical_id")

    @namespace_logical_id.setter
    def namespace_logical_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "namespace_logical_id", value)

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> pulumi.Input[str]:
        """
        The name of the namespace, The name can be up to `63` characters in length.
        """
        return pulumi.get(self, "namespace_name")

    @namespace_name.setter
    def namespace_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "namespace_name", value)

    @property
    @pulumi.getter(name="debugEnable")
    def debug_enable(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable remote debugging.
        """
        return pulumi.get(self, "debug_enable")

    @debug_enable.setter
    def debug_enable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "debug_enable", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the namespace, The description can be up to `128` characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _NamespaceState:
    def __init__(__self__, *,
                 debug_enable: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 namespace_logical_id: Optional[pulumi.Input[str]] = None,
                 namespace_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Namespace resources.
        :param pulumi.Input[bool] debug_enable: Specifies whether to enable remote debugging.
        :param pulumi.Input[str] description: The description of the namespace, The description can be up to `128` characters in length.
        :param pulumi.Input[str] namespace_logical_id: The ID of the namespace.
               - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
               - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
        :param pulumi.Input[str] namespace_name: The name of the namespace, The name can be up to `63` characters in length.
        """
        _NamespaceState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            debug_enable=debug_enable,
            description=description,
            namespace_logical_id=namespace_logical_id,
            namespace_name=namespace_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             debug_enable: Optional[pulumi.Input[bool]] = None,
             description: Optional[pulumi.Input[str]] = None,
             namespace_logical_id: Optional[pulumi.Input[str]] = None,
             namespace_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if debug_enable is None and 'debugEnable' in kwargs:
            debug_enable = kwargs['debugEnable']
        if namespace_logical_id is None and 'namespaceLogicalId' in kwargs:
            namespace_logical_id = kwargs['namespaceLogicalId']
        if namespace_name is None and 'namespaceName' in kwargs:
            namespace_name = kwargs['namespaceName']

        if debug_enable is not None:
            _setter("debug_enable", debug_enable)
        if description is not None:
            _setter("description", description)
        if namespace_logical_id is not None:
            _setter("namespace_logical_id", namespace_logical_id)
        if namespace_name is not None:
            _setter("namespace_name", namespace_name)

    @property
    @pulumi.getter(name="debugEnable")
    def debug_enable(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable remote debugging.
        """
        return pulumi.get(self, "debug_enable")

    @debug_enable.setter
    def debug_enable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "debug_enable", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the namespace, The description can be up to `128` characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="namespaceLogicalId")
    def namespace_logical_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the namespace.
        - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
        - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
        """
        return pulumi.get(self, "namespace_logical_id")

    @namespace_logical_id.setter
    def namespace_logical_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace_logical_id", value)

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the namespace, The name can be up to `63` characters in length.
        """
        return pulumi.get(self, "namespace_name")

    @namespace_name.setter
    def namespace_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace_name", value)


class Namespace(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 debug_enable: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 namespace_logical_id: Optional[pulumi.Input[str]] = None,
                 namespace_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a EDAS Namespace resource.

        For information about EDAS Namespace and how to use it, see [What is Namespace](https://www.alibabacloud.com/help/en/enterprise-distributed-application-service/latest/insertorupdateregion).

        > **NOTE:** Available since v1.173.0.

        ## Import

        EDAS Namespace can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:edas/namespace:Namespace example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] debug_enable: Specifies whether to enable remote debugging.
        :param pulumi.Input[str] description: The description of the namespace, The description can be up to `128` characters in length.
        :param pulumi.Input[str] namespace_logical_id: The ID of the namespace.
               - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
               - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
        :param pulumi.Input[str] namespace_name: The name of the namespace, The name can be up to `63` characters in length.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NamespaceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a EDAS Namespace resource.

        For information about EDAS Namespace and how to use it, see [What is Namespace](https://www.alibabacloud.com/help/en/enterprise-distributed-application-service/latest/insertorupdateregion).

        > **NOTE:** Available since v1.173.0.

        ## Import

        EDAS Namespace can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:edas/namespace:Namespace example <id>
        ```

        :param str resource_name: The name of the resource.
        :param NamespaceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NamespaceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            NamespaceArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 debug_enable: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 namespace_logical_id: Optional[pulumi.Input[str]] = None,
                 namespace_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NamespaceArgs.__new__(NamespaceArgs)

            __props__.__dict__["debug_enable"] = debug_enable
            __props__.__dict__["description"] = description
            if namespace_logical_id is None and not opts.urn:
                raise TypeError("Missing required property 'namespace_logical_id'")
            __props__.__dict__["namespace_logical_id"] = namespace_logical_id
            if namespace_name is None and not opts.urn:
                raise TypeError("Missing required property 'namespace_name'")
            __props__.__dict__["namespace_name"] = namespace_name
        super(Namespace, __self__).__init__(
            'alicloud:edas/namespace:Namespace',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            debug_enable: Optional[pulumi.Input[bool]] = None,
            description: Optional[pulumi.Input[str]] = None,
            namespace_logical_id: Optional[pulumi.Input[str]] = None,
            namespace_name: Optional[pulumi.Input[str]] = None) -> 'Namespace':
        """
        Get an existing Namespace resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] debug_enable: Specifies whether to enable remote debugging.
        :param pulumi.Input[str] description: The description of the namespace, The description can be up to `128` characters in length.
        :param pulumi.Input[str] namespace_logical_id: The ID of the namespace.
               - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
               - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
        :param pulumi.Input[str] namespace_name: The name of the namespace, The name can be up to `63` characters in length.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NamespaceState.__new__(_NamespaceState)

        __props__.__dict__["debug_enable"] = debug_enable
        __props__.__dict__["description"] = description
        __props__.__dict__["namespace_logical_id"] = namespace_logical_id
        __props__.__dict__["namespace_name"] = namespace_name
        return Namespace(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="debugEnable")
    def debug_enable(self) -> pulumi.Output[bool]:
        """
        Specifies whether to enable remote debugging.
        """
        return pulumi.get(self, "debug_enable")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the namespace, The description can be up to `128` characters in length.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="namespaceLogicalId")
    def namespace_logical_id(self) -> pulumi.Output[str]:
        """
        The ID of the namespace.
        - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
        - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
        """
        return pulumi.get(self, "namespace_logical_id")

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> pulumi.Output[str]:
        """
        The name of the namespace, The name can be up to `63` characters in length.
        """
        return pulumi.get(self, "namespace_name")

