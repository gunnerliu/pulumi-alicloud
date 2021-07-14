# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TransitRouterArgs', 'TransitRouter']

@pulumi.input_type
class TransitRouterArgs:
    def __init__(__self__, *,
                 cen_id: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 transit_router_description: Optional[pulumi.Input[str]] = None,
                 transit_router_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TransitRouter resource.
        :param pulumi.Input[str] cen_id: The ID of the CEN.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] transit_router_description: The description of the transit router.
        :param pulumi.Input[str] transit_router_name: The name of the transit router.
        """
        pulumi.set(__self__, "cen_id", cen_id)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if transit_router_description is not None:
            pulumi.set(__self__, "transit_router_description", transit_router_description)
        if transit_router_name is not None:
            pulumi.set(__self__, "transit_router_name", transit_router_name)

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
                 transit_router_description: Optional[pulumi.Input[str]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 transit_router_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TransitRouter resources.
        :param pulumi.Input[str] cen_id: The ID of the CEN.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] status: The associating status of the Transit Router.
        :param pulumi.Input[str] transit_router_description: The description of the transit router.
        :param pulumi.Input[str] transit_router_name: The name of the transit router.
        :param pulumi.Input[str] type: The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
        """
        if cen_id is not None:
            pulumi.set(__self__, "cen_id", cen_id)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if transit_router_description is not None:
            pulumi.set(__self__, "transit_router_description", transit_router_description)
        if transit_router_id is not None:
            pulumi.set(__self__, "transit_router_id", transit_router_id)
        if transit_router_name is not None:
            pulumi.set(__self__, "transit_router_name", transit_router_name)
        if type is not None:
            pulumi.set(__self__, "type", type)

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
                 transit_router_description: Optional[pulumi.Input[str]] = None,
                 transit_router_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CEN transit router resource that associate the transitRouter with the CEN instance.[What is Cen Transit Router](https://help.aliyun.com/document_detail/261169.html)

        > **NOTE:** Available in 1.126.0+

        ## Import

        CEN instance can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouter:TransitRouter default cen-*****:tr-*******
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cen_id: The ID of the CEN.
        :param pulumi.Input[bool] dry_run: The dry run.
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
        Provides a CEN transit router resource that associate the transitRouter with the CEN instance.[What is Cen Transit Router](https://help.aliyun.com/document_detail/261169.html)

        > **NOTE:** Available in 1.126.0+

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
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 transit_router_description: Optional[pulumi.Input[str]] = None,
                 transit_router_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransitRouterArgs.__new__(TransitRouterArgs)

            if cen_id is None and not opts.urn:
                raise TypeError("Missing required property 'cen_id'")
            __props__.__dict__["cen_id"] = cen_id
            __props__.__dict__["dry_run"] = dry_run
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
        :param pulumi.Input[str] transit_router_description: The description of the transit router.
        :param pulumi.Input[str] transit_router_name: The name of the transit router.
        :param pulumi.Input[str] type: The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransitRouterState.__new__(_TransitRouterState)

        __props__.__dict__["cen_id"] = cen_id
        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["status"] = status
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
    @pulumi.getter(name="transitRouterDescription")
    def transit_router_description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the transit router.
        """
        return pulumi.get(self, "transit_router_description")

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Output[str]:
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

