# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ServiceLinkedRoleArgs', 'ServiceLinkedRole']

@pulumi.input_type
class ServiceLinkedRoleArgs:
    def __init__(__self__, *,
                 product_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a ServiceLinkedRole resource.
        :param pulumi.Input[str] product_name: The product name for SLR. Dbfs can automatically create the following service-linked roles: `AliyunServiceRoleForDbfs`.
        """
        ServiceLinkedRoleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            product_name=product_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             product_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if product_name is None and 'productName' in kwargs:
            product_name = kwargs['productName']
        if product_name is None:
            raise TypeError("Missing 'product_name' argument")

        _setter("product_name", product_name)

    @property
    @pulumi.getter(name="productName")
    def product_name(self) -> pulumi.Input[str]:
        """
        The product name for SLR. Dbfs can automatically create the following service-linked roles: `AliyunServiceRoleForDbfs`.
        """
        return pulumi.get(self, "product_name")

    @product_name.setter
    def product_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "product_name", value)


@pulumi.input_type
class _ServiceLinkedRoleState:
    def __init__(__self__, *,
                 product_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering ServiceLinkedRole resources.
        :param pulumi.Input[str] product_name: The product name for SLR. Dbfs can automatically create the following service-linked roles: `AliyunServiceRoleForDbfs`.
        :param pulumi.Input[bool] status: The status of the service Associated role. Valid Values: `true`: Created. `false`: not created.
        """
        _ServiceLinkedRoleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            product_name=product_name,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             product_name: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if product_name is None and 'productName' in kwargs:
            product_name = kwargs['productName']

        if product_name is not None:
            _setter("product_name", product_name)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="productName")
    def product_name(self) -> Optional[pulumi.Input[str]]:
        """
        The product name for SLR. Dbfs can automatically create the following service-linked roles: `AliyunServiceRoleForDbfs`.
        """
        return pulumi.get(self, "product_name")

    @product_name.setter
    def product_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[bool]]:
        """
        The status of the service Associated role. Valid Values: `true`: Created. `false`: not created.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "status", value)


class ServiceLinkedRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 product_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Using this data source can create Dbfs service-linked roles(SLR). Dbfs may need to access another Alibaba Cloud service to implement a specific feature. In this case, Dbfs must assume a specific service-linked role, which is a Resource Access Management (RAM) role, to obtain permissions to access another Alibaba Cloud service.

        For information about Dbfs service-linked roles(SLR) and how to use it, see [What is service-linked roles](https://www.alibabacloud.com/help/doc-detail/181425.htm).

        > **NOTE:** Available since v1.157.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        service_linked_role = alicloud.databasefilesystem.ServiceLinkedRole("serviceLinkedRole", product_name="AliyunServiceRoleForDbfs")
        ```

        ## Import

        Dbfs service-linked roles(SLR) can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:databasefilesystem/serviceLinkedRole:ServiceLinkedRole example <product_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] product_name: The product name for SLR. Dbfs can automatically create the following service-linked roles: `AliyunServiceRoleForDbfs`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceLinkedRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Using this data source can create Dbfs service-linked roles(SLR). Dbfs may need to access another Alibaba Cloud service to implement a specific feature. In this case, Dbfs must assume a specific service-linked role, which is a Resource Access Management (RAM) role, to obtain permissions to access another Alibaba Cloud service.

        For information about Dbfs service-linked roles(SLR) and how to use it, see [What is service-linked roles](https://www.alibabacloud.com/help/doc-detail/181425.htm).

        > **NOTE:** Available since v1.157.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        service_linked_role = alicloud.databasefilesystem.ServiceLinkedRole("serviceLinkedRole", product_name="AliyunServiceRoleForDbfs")
        ```

        ## Import

        Dbfs service-linked roles(SLR) can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:databasefilesystem/serviceLinkedRole:ServiceLinkedRole example <product_name>
        ```

        :param str resource_name: The name of the resource.
        :param ServiceLinkedRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceLinkedRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ServiceLinkedRoleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 product_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceLinkedRoleArgs.__new__(ServiceLinkedRoleArgs)

            if product_name is None and not opts.urn:
                raise TypeError("Missing required property 'product_name'")
            __props__.__dict__["product_name"] = product_name
            __props__.__dict__["status"] = None
        super(ServiceLinkedRole, __self__).__init__(
            'alicloud:databasefilesystem/serviceLinkedRole:ServiceLinkedRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            product_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[bool]] = None) -> 'ServiceLinkedRole':
        """
        Get an existing ServiceLinkedRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] product_name: The product name for SLR. Dbfs can automatically create the following service-linked roles: `AliyunServiceRoleForDbfs`.
        :param pulumi.Input[bool] status: The status of the service Associated role. Valid Values: `true`: Created. `false`: not created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceLinkedRoleState.__new__(_ServiceLinkedRoleState)

        __props__.__dict__["product_name"] = product_name
        __props__.__dict__["status"] = status
        return ServiceLinkedRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="productName")
    def product_name(self) -> pulumi.Output[str]:
        """
        The product name for SLR. Dbfs can automatically create the following service-linked roles: `AliyunServiceRoleForDbfs`.
        """
        return pulumi.get(self, "product_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[bool]:
        """
        The status of the service Associated role. Valid Values: `true`: Created. `false`: not created.
        """
        return pulumi.get(self, "status")

