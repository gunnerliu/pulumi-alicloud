# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TransitRouterArgs', 'TransitRouter']

@pulumi.input_type
class TransitRouterArgs:
    def __init__(__self__, *,
                 cen_id: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 support_multicast: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_description: Optional[pulumi.Input[str]] = None,
                 transit_router_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TransitRouter resource.
        :param pulumi.Input[str] cen_id: The ID of the CEN.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[bool] support_multicast: Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values: `false`, `true`. Default Value: `false`. The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-listtransitrouteravailableresource) to query the regions that support multicast.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] transit_router_description: The description of the transit router.
        :param pulumi.Input[str] transit_router_name: The name of the transit router.
        """
        TransitRouterArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cen_id=cen_id,
            dry_run=dry_run,
            support_multicast=support_multicast,
            tags=tags,
            transit_router_description=transit_router_description,
            transit_router_name=transit_router_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cen_id: pulumi.Input[str],
             dry_run: Optional[pulumi.Input[bool]] = None,
             support_multicast: Optional[pulumi.Input[bool]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             transit_router_description: Optional[pulumi.Input[str]] = None,
             transit_router_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("cen_id", cen_id)
        if dry_run is not None:
            _setter("dry_run", dry_run)
        if support_multicast is not None:
            _setter("support_multicast", support_multicast)
        if tags is not None:
            _setter("tags", tags)
        if transit_router_description is not None:
            _setter("transit_router_description", transit_router_description)
        if transit_router_name is not None:
            _setter("transit_router_name", transit_router_name)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> pulumi.Input[str]:
        """
        The ID of the CEN.
        """
        return pulumi.get(self, "cen_id")

    @cen_id.setter
    def cen_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cen_id", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="supportMulticast")
    def support_multicast(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values: `false`, `true`. Default Value: `false`. The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-listtransitrouteravailableresource) to query the regions that support multicast.
        """
        return pulumi.get(self, "support_multicast")

    @support_multicast.setter
    def support_multicast(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "support_multicast", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="transitRouterDescription")
    def transit_router_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the transit router.
        """
        return pulumi.get(self, "transit_router_description")

    @transit_router_description.setter
    def transit_router_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_description", value)

    @property
    @pulumi.getter(name="transitRouterName")
    def transit_router_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the transit router.
        """
        return pulumi.get(self, "transit_router_name")

    @transit_router_name.setter
    def transit_router_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_name", value)


@pulumi.input_type
class _TransitRouterState:
    def __init__(__self__, *,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 support_multicast: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_description: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 transit_router_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TransitRouter resources.
        :param pulumi.Input[str] cen_id: The ID of the CEN.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] status: The associating status of the Transit Router.
        :param pulumi.Input[bool] support_multicast: Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values: `false`, `true`. Default Value: `false`. The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-listtransitrouteravailableresource) to query the regions that support multicast.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] transit_router_description: The description of the transit router.
        :param pulumi.Input[str] transit_router_id: The transit router id of the transit router.
        :param pulumi.Input[str] transit_router_name: The name of the transit router.
        :param pulumi.Input[str] type: The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
        """
        _TransitRouterState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cen_id=cen_id,
            dry_run=dry_run,
            status=status,
            support_multicast=support_multicast,
            tags=tags,
            transit_router_description=transit_router_description,
            transit_router_id=transit_router_id,
            transit_router_name=transit_router_name,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cen_id: Optional[pulumi.Input[str]] = None,
             dry_run: Optional[pulumi.Input[bool]] = None,
             status: Optional[pulumi.Input[str]] = None,
             support_multicast: Optional[pulumi.Input[bool]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             transit_router_description: Optional[pulumi.Input[str]] = None,
             transit_router_id: Optional[pulumi.Input[str]] = None,
             transit_router_name: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if cen_id is not None:
            _setter("cen_id", cen_id)
        if dry_run is not None:
            _setter("dry_run", dry_run)
        if status is not None:
            _setter("status", status)
        if support_multicast is not None:
            _setter("support_multicast", support_multicast)
        if tags is not None:
            _setter("tags", tags)
        if transit_router_description is not None:
            _setter("transit_router_description", transit_router_description)
        if transit_router_id is not None:
            _setter("transit_router_id", transit_router_id)
        if transit_router_name is not None:
            _setter("transit_router_name", transit_router_name)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the CEN.
        """
        return pulumi.get(self, "cen_id")

    @cen_id.setter
    def cen_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cen_id", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The associating status of the Transit Router.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="supportMulticast")
    def support_multicast(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values: `false`, `true`. Default Value: `false`. The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-listtransitrouteravailableresource) to query the regions that support multicast.
        """
        return pulumi.get(self, "support_multicast")

    @support_multicast.setter
    def support_multicast(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "support_multicast", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="transitRouterDescription")
    def transit_router_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the transit router.
        """
        return pulumi.get(self, "transit_router_description")

    @transit_router_description.setter
    def transit_router_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_description", value)

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[pulumi.Input[str]]:
        """
        The transit router id of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_id", value)

    @property
    @pulumi.getter(name="transitRouterName")
    def transit_router_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the transit router.
        """
        return pulumi.get(self, "transit_router_name")

    @transit_router_name.setter
    def transit_router_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class TransitRouter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 support_multicast: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_description: Optional[pulumi.Input[str]] = None,
                 transit_router_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CEN transit router resource that associate the transitRouter with the CEN instance.[What is Cen Transit Router](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-createtransitrouter)

        > **NOTE:** Available since v1.126.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example_instance = alicloud.cen.Instance("exampleInstance",
            cen_instance_name="tf_example",
            description="an example for cen")
        example_transit_router = alicloud.cen.TransitRouter("exampleTransitRouter",
            transit_router_name="tf_example",
            cen_id=example_instance.id)
        ```

        ## Import

        CEN instance can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouter:TransitRouter default cen-*****:tr-*******
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cen_id: The ID of the CEN.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[bool] support_multicast: Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values: `false`, `true`. Default Value: `false`. The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-listtransitrouteravailableresource) to query the regions that support multicast.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] transit_router_description: The description of the transit router.
        :param pulumi.Input[str] transit_router_name: The name of the transit router.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TransitRouterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CEN transit router resource that associate the transitRouter with the CEN instance.[What is Cen Transit Router](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-createtransitrouter)

        > **NOTE:** Available since v1.126.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example_instance = alicloud.cen.Instance("exampleInstance",
            cen_instance_name="tf_example",
            description="an example for cen")
        example_transit_router = alicloud.cen.TransitRouter("exampleTransitRouter",
            transit_router_name="tf_example",
            cen_id=example_instance.id)
        ```

        ## Import

        CEN instance can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouter:TransitRouter default cen-*****:tr-*******
        ```

        :param str resource_name: The name of the resource.
        :param TransitRouterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TransitRouterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TransitRouterArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 support_multicast: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_description: Optional[pulumi.Input[str]] = None,
                 transit_router_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransitRouterArgs.__new__(TransitRouterArgs)

            if cen_id is None and not opts.urn:
                raise TypeError("Missing required property 'cen_id'")
            __props__.__dict__["cen_id"] = cen_id
            __props__.__dict__["dry_run"] = dry_run
            __props__.__dict__["support_multicast"] = support_multicast
            __props__.__dict__["tags"] = tags
            __props__.__dict__["transit_router_description"] = transit_router_description
            __props__.__dict__["transit_router_name"] = transit_router_name
            __props__.__dict__["status"] = None
            __props__.__dict__["transit_router_id"] = None
            __props__.__dict__["type"] = None
        super(TransitRouter, __self__).__init__(
            'alicloud:cen/transitRouter:TransitRouter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cen_id: Optional[pulumi.Input[str]] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            status: Optional[pulumi.Input[str]] = None,
            support_multicast: Optional[pulumi.Input[bool]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            transit_router_description: Optional[pulumi.Input[str]] = None,
            transit_router_id: Optional[pulumi.Input[str]] = None,
            transit_router_name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'TransitRouter':
        """
        Get an existing TransitRouter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cen_id: The ID of the CEN.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] status: The associating status of the Transit Router.
        :param pulumi.Input[bool] support_multicast: Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values: `false`, `true`. Default Value: `false`. The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-listtransitrouteravailableresource) to query the regions that support multicast.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] transit_router_description: The description of the transit router.
        :param pulumi.Input[str] transit_router_id: The transit router id of the transit router.
        :param pulumi.Input[str] transit_router_name: The name of the transit router.
        :param pulumi.Input[str] type: The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransitRouterState.__new__(_TransitRouterState)

        __props__.__dict__["cen_id"] = cen_id
        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["status"] = status
        __props__.__dict__["support_multicast"] = support_multicast
        __props__.__dict__["tags"] = tags
        __props__.__dict__["transit_router_description"] = transit_router_description
        __props__.__dict__["transit_router_id"] = transit_router_id
        __props__.__dict__["transit_router_name"] = transit_router_name
        __props__.__dict__["type"] = type
        return TransitRouter(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> pulumi.Output[str]:
        """
        The ID of the CEN.
        """
        return pulumi.get(self, "cen_id")

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The associating status of the Transit Router.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="supportMulticast")
    def support_multicast(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values: `false`, `true`. Default Value: `false`. The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-listtransitrouteravailableresource) to query the regions that support multicast.
        """
        return pulumi.get(self, "support_multicast")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="transitRouterDescription")
    def transit_router_description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the transit router.
        """
        return pulumi.get(self, "transit_router_description")

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Output[str]:
        """
        The transit router id of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @property
    @pulumi.getter(name="transitRouterName")
    def transit_router_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the transit router.
        """
        return pulumi.get(self, "transit_router_name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
        """
        return pulumi.get(self, "type")

