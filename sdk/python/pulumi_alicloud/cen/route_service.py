# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = ['RouteServiceArgs', 'RouteService']

@pulumi.input_type
class RouteServiceArgs:
    def __init__(__self__, *,
                 access_region_id: pulumi.Input[str],
                 cen_id: pulumi.Input[str],
                 host: pulumi.Input[str],
                 host_region_id: pulumi.Input[str],
                 host_vpc_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a RouteService resource.
        :param pulumi.Input[str] access_region_id: The region of the network instances that access the cloud services.
        :param pulumi.Input[str] cen_id: The ID of the CEN instance.
        :param pulumi.Input[str] host: The domain name or IP address of the cloud service.
        :param pulumi.Input[str] host_region_id: The region of the cloud service.
        :param pulumi.Input[str] host_vpc_id: The VPC associated with the cloud service.
        :param pulumi.Input[str] description: The description of the cloud service.
        """
        pulumi.set(__self__, "access_region_id", access_region_id)
        pulumi.set(__self__, "cen_id", cen_id)
        pulumi.set(__self__, "host", host)
        pulumi.set(__self__, "host_region_id", host_region_id)
        pulumi.set(__self__, "host_vpc_id", host_vpc_id)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter(name="accessRegionId")
    def access_region_id(self) -> pulumi.Input[str]:
        """
        The region of the network instances that access the cloud services.
        """
        return pulumi.get(self, "access_region_id")

    @access_region_id.setter
    def access_region_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "access_region_id", value)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> pulumi.Input[str]:
        """
        The ID of the CEN instance.
        """
        return pulumi.get(self, "cen_id")

    @cen_id.setter
    def cen_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cen_id", value)

    @property
    @pulumi.getter
    def host(self) -> pulumi.Input[str]:
        """
        The domain name or IP address of the cloud service.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: pulumi.Input[str]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter(name="hostRegionId")
    def host_region_id(self) -> pulumi.Input[str]:
        """
        The region of the cloud service.
        """
        return pulumi.get(self, "host_region_id")

    @host_region_id.setter
    def host_region_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "host_region_id", value)

    @property
    @pulumi.getter(name="hostVpcId")
    def host_vpc_id(self) -> pulumi.Input[str]:
        """
        The VPC associated with the cloud service.
        """
        return pulumi.get(self, "host_vpc_id")

    @host_vpc_id.setter
    def host_vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "host_vpc_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the cloud service.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


class RouteService(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_region_id: Optional[pulumi.Input[str]] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 host_region_id: Optional[pulumi.Input[str]] = None,
                 host_vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a CEN Route Service resource. The virtual border routers (VBRs) and Cloud Connect Network (CCN) instances attached to Cloud Enterprise Network (CEN) instances can access the cloud services deployed in VPCs through the CEN instances.

        For information about CEN Route Service and how to use it, see [What is Route Service](https://www.alibabacloud.com/help/en/doc-detail/106671.htm).

        > **NOTE:** Available in v1.99.0+.

        > **NOTE:** Ensure that at least one VPC in the selected region is attached to the CEN instance.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-test"
        example_networks = alicloud.vpc.get_networks(is_default=True)
        example_instance = alicloud.cen.Instance("exampleInstance")
        vpc = alicloud.cen.InstanceAttachment("vpc",
            instance_id=example_instance.id,
            child_instance_id=example_networks.vpcs[0].id,
            child_instance_type="VPC",
            child_instance_region_id=example_networks.vpcs[0].region_id)
        this = alicloud.cen.RouteService("this",
            access_region_id=example_networks.vpcs[0].region_id,
            host_region_id=example_networks.vpcs[0].region_id,
            host_vpc_id=example_networks.vpcs[0].id,
            cen_id=vpc.instance_id,
            host="100.118.28.52/32")
        ```

        ## Import

        CEN Route Service can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/routeService:RouteService example cen-ahixm0efqh********:cn-shanghai:100.118.28.52/32:cn-shanghai
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_region_id: The region of the network instances that access the cloud services.
        :param pulumi.Input[str] cen_id: The ID of the CEN instance.
        :param pulumi.Input[str] description: The description of the cloud service.
        :param pulumi.Input[str] host: The domain name or IP address of the cloud service.
        :param pulumi.Input[str] host_region_id: The region of the cloud service.
        :param pulumi.Input[str] host_vpc_id: The VPC associated with the cloud service.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RouteServiceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CEN Route Service resource. The virtual border routers (VBRs) and Cloud Connect Network (CCN) instances attached to Cloud Enterprise Network (CEN) instances can access the cloud services deployed in VPCs through the CEN instances.

        For information about CEN Route Service and how to use it, see [What is Route Service](https://www.alibabacloud.com/help/en/doc-detail/106671.htm).

        > **NOTE:** Available in v1.99.0+.

        > **NOTE:** Ensure that at least one VPC in the selected region is attached to the CEN instance.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-test"
        example_networks = alicloud.vpc.get_networks(is_default=True)
        example_instance = alicloud.cen.Instance("exampleInstance")
        vpc = alicloud.cen.InstanceAttachment("vpc",
            instance_id=example_instance.id,
            child_instance_id=example_networks.vpcs[0].id,
            child_instance_type="VPC",
            child_instance_region_id=example_networks.vpcs[0].region_id)
        this = alicloud.cen.RouteService("this",
            access_region_id=example_networks.vpcs[0].region_id,
            host_region_id=example_networks.vpcs[0].region_id,
            host_vpc_id=example_networks.vpcs[0].id,
            cen_id=vpc.instance_id,
            host="100.118.28.52/32")
        ```

        ## Import

        CEN Route Service can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/routeService:RouteService example cen-ahixm0efqh********:cn-shanghai:100.118.28.52/32:cn-shanghai
        ```

        :param str resource_name: The name of the resource.
        :param RouteServiceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RouteServiceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_region_id: Optional[pulumi.Input[str]] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 host_region_id: Optional[pulumi.Input[str]] = None,
                 host_vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

            if access_region_id is None and not opts.urn:
                raise TypeError("Missing required property 'access_region_id'")
            __props__['access_region_id'] = access_region_id
            if cen_id is None and not opts.urn:
                raise TypeError("Missing required property 'cen_id'")
            __props__['cen_id'] = cen_id
            __props__['description'] = description
            if host is None and not opts.urn:
                raise TypeError("Missing required property 'host'")
            __props__['host'] = host
            if host_region_id is None and not opts.urn:
                raise TypeError("Missing required property 'host_region_id'")
            __props__['host_region_id'] = host_region_id
            if host_vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'host_vpc_id'")
            __props__['host_vpc_id'] = host_vpc_id
            __props__['status'] = None
        super(RouteService, __self__).__init__(
            'alicloud:cen/routeService:RouteService',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_region_id: Optional[pulumi.Input[str]] = None,
            cen_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            host: Optional[pulumi.Input[str]] = None,
            host_region_id: Optional[pulumi.Input[str]] = None,
            host_vpc_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'RouteService':
        """
        Get an existing RouteService resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_region_id: The region of the network instances that access the cloud services.
        :param pulumi.Input[str] cen_id: The ID of the CEN instance.
        :param pulumi.Input[str] description: The description of the cloud service.
        :param pulumi.Input[str] host: The domain name or IP address of the cloud service.
        :param pulumi.Input[str] host_region_id: The region of the cloud service.
        :param pulumi.Input[str] host_vpc_id: The VPC associated with the cloud service.
        :param pulumi.Input[str] status: The status of the cloud service.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["access_region_id"] = access_region_id
        __props__["cen_id"] = cen_id
        __props__["description"] = description
        __props__["host"] = host
        __props__["host_region_id"] = host_region_id
        __props__["host_vpc_id"] = host_vpc_id
        __props__["status"] = status
        return RouteService(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessRegionId")
    def access_region_id(self) -> pulumi.Output[str]:
        """
        The region of the network instances that access the cloud services.
        """
        return pulumi.get(self, "access_region_id")

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> pulumi.Output[str]:
        """
        The ID of the CEN instance.
        """
        return pulumi.get(self, "cen_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the cloud service.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def host(self) -> pulumi.Output[str]:
        """
        The domain name or IP address of the cloud service.
        """
        return pulumi.get(self, "host")

    @property
    @pulumi.getter(name="hostRegionId")
    def host_region_id(self) -> pulumi.Output[str]:
        """
        The region of the cloud service.
        """
        return pulumi.get(self, "host_region_id")

    @property
    @pulumi.getter(name="hostVpcId")
    def host_vpc_id(self) -> pulumi.Output[str]:
        """
        The VPC associated with the cloud service.
        """
        return pulumi.get(self, "host_vpc_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the cloud service.
        """
        return pulumi.get(self, "status")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

