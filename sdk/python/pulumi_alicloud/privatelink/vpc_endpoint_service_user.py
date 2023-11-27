# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VpcEndpointServiceUserArgs', 'VpcEndpointServiceUser']

@pulumi.input_type
class VpcEndpointServiceUserArgs:
    def __init__(__self__, *,
                 service_id: pulumi.Input[str],
                 user_id: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a VpcEndpointServiceUser resource.
        :param pulumi.Input[str] service_id: The endpoint service ID.
        :param pulumi.Input[str] user_id: The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
        :param pulumi.Input[bool] dry_run: Specifies whether to perform only a dry run, without performing the actual request. Valid values:
               - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.
               - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        """
        pulumi.set(__self__, "service_id", service_id)
        pulumi.set(__self__, "user_id", user_id)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Input[str]:
        """
        The endpoint service ID.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[str]:
        """
        The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_id", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to perform only a dry run, without performing the actual request. Valid values:
        - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.
        - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)


@pulumi.input_type
class _VpcEndpointServiceUserState:
    def __init__(__self__, *,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VpcEndpointServiceUser resources.
        :param pulumi.Input[bool] dry_run: Specifies whether to perform only a dry run, without performing the actual request. Valid values:
               - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.
               - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        :param pulumi.Input[str] service_id: The endpoint service ID.
        :param pulumi.Input[str] user_id: The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
        """
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to perform only a dry run, without performing the actual request. Valid values:
        - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.
        - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        """
        The endpoint service ID.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class VpcEndpointServiceUser(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Private Link Vpc Endpoint Service User resource. Endpoint service user whitelist.

        For information about Private Link Vpc Endpoint Service User and how to use it, see [What is Vpc Endpoint Service User](https://www.alibabacloud.com/help/en/privatelink/latest/api-privatelink-2020-04-15-addusertovpcendpointservice).

        > **NOTE:** Available since v1.110.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tfexampleuser"
        example_vpc_endpoint_service = alicloud.privatelink.VpcEndpointService("exampleVpcEndpointService",
            service_description=name,
            connect_bandwidth=103,
            auto_accept_connection=False)
        example_user = alicloud.ram.User("exampleUser",
            display_name="user_display_name",
            mobile="86-18688888888",
            email="hello.uuu@aaa.com",
            comments="yoyoyo")
        example_vpc_endpoint_service_user = alicloud.privatelink.VpcEndpointServiceUser("exampleVpcEndpointServiceUser",
            service_id=example_vpc_endpoint_service.id,
            user_id=example_user.id)
        ```

        ## Import

        Private Link Vpc Endpoint Service User can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:privatelink/vpcEndpointServiceUser:VpcEndpointServiceUser example <service_id>:<user_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: Specifies whether to perform only a dry run, without performing the actual request. Valid values:
               - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.
               - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        :param pulumi.Input[str] service_id: The endpoint service ID.
        :param pulumi.Input[str] user_id: The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpcEndpointServiceUserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Private Link Vpc Endpoint Service User resource. Endpoint service user whitelist.

        For information about Private Link Vpc Endpoint Service User and how to use it, see [What is Vpc Endpoint Service User](https://www.alibabacloud.com/help/en/privatelink/latest/api-privatelink-2020-04-15-addusertovpcendpointservice).

        > **NOTE:** Available since v1.110.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tfexampleuser"
        example_vpc_endpoint_service = alicloud.privatelink.VpcEndpointService("exampleVpcEndpointService",
            service_description=name,
            connect_bandwidth=103,
            auto_accept_connection=False)
        example_user = alicloud.ram.User("exampleUser",
            display_name="user_display_name",
            mobile="86-18688888888",
            email="hello.uuu@aaa.com",
            comments="yoyoyo")
        example_vpc_endpoint_service_user = alicloud.privatelink.VpcEndpointServiceUser("exampleVpcEndpointServiceUser",
            service_id=example_vpc_endpoint_service.id,
            user_id=example_user.id)
        ```

        ## Import

        Private Link Vpc Endpoint Service User can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:privatelink/vpcEndpointServiceUser:VpcEndpointServiceUser example <service_id>:<user_id>
        ```

        :param str resource_name: The name of the resource.
        :param VpcEndpointServiceUserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcEndpointServiceUserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcEndpointServiceUserArgs.__new__(VpcEndpointServiceUserArgs)

            __props__.__dict__["dry_run"] = dry_run
            if service_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_id'")
            __props__.__dict__["service_id"] = service_id
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
        super(VpcEndpointServiceUser, __self__).__init__(
            'alicloud:privatelink/vpcEndpointServiceUser:VpcEndpointServiceUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            service_id: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'VpcEndpointServiceUser':
        """
        Get an existing VpcEndpointServiceUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: Specifies whether to perform only a dry run, without performing the actual request. Valid values:
               - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.
               - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        :param pulumi.Input[str] service_id: The endpoint service ID.
        :param pulumi.Input[str] user_id: The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcEndpointServiceUserState.__new__(_VpcEndpointServiceUserState)

        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["service_id"] = service_id
        __props__.__dict__["user_id"] = user_id
        return VpcEndpointServiceUser(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to perform only a dry run, without performing the actual request. Valid values:
        - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.
        - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[str]:
        """
        The endpoint service ID.
        """
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
        """
        return pulumi.get(self, "user_id")

