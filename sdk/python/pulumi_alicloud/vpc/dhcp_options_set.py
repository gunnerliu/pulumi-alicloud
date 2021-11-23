# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DhcpOptionsSetArgs', 'DhcpOptionsSet']

@pulumi.input_type
class DhcpOptionsSetArgs:
    def __init__(__self__, *,
                 associate_vpcs: Optional[pulumi.Input[Sequence[pulumi.Input['DhcpOptionsSetAssociateVpcArgs']]]] = None,
                 dhcp_options_set_description: Optional[pulumi.Input[str]] = None,
                 dhcp_options_set_name: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 domain_name_servers: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a DhcpOptionsSet resource.
        :param pulumi.Input[Sequence[pulumi.Input['DhcpOptionsSetAssociateVpcArgs']]] associate_vpcs: AssociateVpcs. Number of VPCs that can be associated with each DHCP options set is 10.
        :param pulumi.Input[str] dhcp_options_set_description: The description of the DHCP options set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[str] dhcp_options_set_name: The name of the DHCP options set. The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
        :param pulumi.Input[str] domain_name: The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
        :param pulumi.Input[str] domain_name_servers: The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are `100.100.2.136` and `100.100.2.138`.
        :param pulumi.Input[bool] dry_run: Specifies whether to precheck this request only. Valid values: `true` or `false`.
        """
        if associate_vpcs is not None:
            pulumi.set(__self__, "associate_vpcs", associate_vpcs)
        if dhcp_options_set_description is not None:
            pulumi.set(__self__, "dhcp_options_set_description", dhcp_options_set_description)
        if dhcp_options_set_name is not None:
            pulumi.set(__self__, "dhcp_options_set_name", dhcp_options_set_name)
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if domain_name_servers is not None:
            pulumi.set(__self__, "domain_name_servers", domain_name_servers)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)

    @property
    @pulumi.getter(name="associateVpcs")
    def associate_vpcs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DhcpOptionsSetAssociateVpcArgs']]]]:
        """
        AssociateVpcs. Number of VPCs that can be associated with each DHCP options set is 10.
        """
        return pulumi.get(self, "associate_vpcs")

    @associate_vpcs.setter
    def associate_vpcs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DhcpOptionsSetAssociateVpcArgs']]]]):
        pulumi.set(self, "associate_vpcs", value)

    @property
    @pulumi.getter(name="dhcpOptionsSetDescription")
    def dhcp_options_set_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the DHCP options set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "dhcp_options_set_description")

    @dhcp_options_set_description.setter
    def dhcp_options_set_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dhcp_options_set_description", value)

    @property
    @pulumi.getter(name="dhcpOptionsSetName")
    def dhcp_options_set_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the DHCP options set. The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
        """
        return pulumi.get(self, "dhcp_options_set_name")

    @dhcp_options_set_name.setter
    def dhcp_options_set_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dhcp_options_set_name", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="domainNameServers")
    def domain_name_servers(self) -> Optional[pulumi.Input[str]]:
        """
        The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are `100.100.2.136` and `100.100.2.138`.
        """
        return pulumi.get(self, "domain_name_servers")

    @domain_name_servers.setter
    def domain_name_servers(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name_servers", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to precheck this request only. Valid values: `true` or `false`.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)


@pulumi.input_type
class _DhcpOptionsSetState:
    def __init__(__self__, *,
                 associate_vpcs: Optional[pulumi.Input[Sequence[pulumi.Input['DhcpOptionsSetAssociateVpcArgs']]]] = None,
                 dhcp_options_set_description: Optional[pulumi.Input[str]] = None,
                 dhcp_options_set_name: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 domain_name_servers: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 owner_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DhcpOptionsSet resources.
        :param pulumi.Input[Sequence[pulumi.Input['DhcpOptionsSetAssociateVpcArgs']]] associate_vpcs: AssociateVpcs. Number of VPCs that can be associated with each DHCP options set is 10.
        :param pulumi.Input[str] dhcp_options_set_description: The description of the DHCP options set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[str] dhcp_options_set_name: The name of the DHCP options set. The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
        :param pulumi.Input[str] domain_name: The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
        :param pulumi.Input[str] domain_name_servers: The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are `100.100.2.136` and `100.100.2.138`.
        :param pulumi.Input[bool] dry_run: Specifies whether to precheck this request only. Valid values: `true` or `false`.
        :param pulumi.Input[str] owner_id: The ID of the account to which the DHCP options set belongs.
        :param pulumi.Input[str] status: The status of the DHCP options set. Valid values: `Available`, `InUse` or `Pending`. `Available`: The DHCP options set is available for use. `InUse`: The DHCP options set is in use. `Pending`: The DHCP options set is being configured.
        """
        if associate_vpcs is not None:
            pulumi.set(__self__, "associate_vpcs", associate_vpcs)
        if dhcp_options_set_description is not None:
            pulumi.set(__self__, "dhcp_options_set_description", dhcp_options_set_description)
        if dhcp_options_set_name is not None:
            pulumi.set(__self__, "dhcp_options_set_name", dhcp_options_set_name)
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if domain_name_servers is not None:
            pulumi.set(__self__, "domain_name_servers", domain_name_servers)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if owner_id is not None:
            pulumi.set(__self__, "owner_id", owner_id)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="associateVpcs")
    def associate_vpcs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DhcpOptionsSetAssociateVpcArgs']]]]:
        """
        AssociateVpcs. Number of VPCs that can be associated with each DHCP options set is 10.
        """
        return pulumi.get(self, "associate_vpcs")

    @associate_vpcs.setter
    def associate_vpcs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DhcpOptionsSetAssociateVpcArgs']]]]):
        pulumi.set(self, "associate_vpcs", value)

    @property
    @pulumi.getter(name="dhcpOptionsSetDescription")
    def dhcp_options_set_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the DHCP options set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "dhcp_options_set_description")

    @dhcp_options_set_description.setter
    def dhcp_options_set_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dhcp_options_set_description", value)

    @property
    @pulumi.getter(name="dhcpOptionsSetName")
    def dhcp_options_set_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the DHCP options set. The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
        """
        return pulumi.get(self, "dhcp_options_set_name")

    @dhcp_options_set_name.setter
    def dhcp_options_set_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dhcp_options_set_name", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="domainNameServers")
    def domain_name_servers(self) -> Optional[pulumi.Input[str]]:
        """
        The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are `100.100.2.136` and `100.100.2.138`.
        """
        return pulumi.get(self, "domain_name_servers")

    @domain_name_servers.setter
    def domain_name_servers(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name_servers", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to precheck this request only. Valid values: `true` or `false`.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the account to which the DHCP options set belongs.
        """
        return pulumi.get(self, "owner_id")

    @owner_id.setter
    def owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the DHCP options set. Valid values: `Available`, `InUse` or `Pending`. `Available`: The DHCP options set is available for use. `InUse`: The DHCP options set is in use. `Pending`: The DHCP options set is being configured.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class DhcpOptionsSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 associate_vpcs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DhcpOptionsSetAssociateVpcArgs']]]]] = None,
                 dhcp_options_set_description: Optional[pulumi.Input[str]] = None,
                 dhcp_options_set_name: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 domain_name_servers: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Provides a VPC Dhcp Options Set resource.

        For information about VPC Dhcp Options Set and how to use it, see [What is Dhcp Options Set](https://www.alibabacloud.com/help/doc-detail/174112.htm).

        > **NOTE:** Available in v1.134.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.vpc.DhcpOptionsSet("example",
            dhcp_options_set_description="example_value",
            dhcp_options_set_name="example_value",
            domain_name="example.com",
            domain_name_servers="100.100.2.136")
        ```

        ## Import

        VPC Dhcp Options Set can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/dhcpOptionsSet:DhcpOptionsSet example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DhcpOptionsSetAssociateVpcArgs']]]] associate_vpcs: AssociateVpcs. Number of VPCs that can be associated with each DHCP options set is 10.
        :param pulumi.Input[str] dhcp_options_set_description: The description of the DHCP options set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[str] dhcp_options_set_name: The name of the DHCP options set. The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
        :param pulumi.Input[str] domain_name: The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
        :param pulumi.Input[str] domain_name_servers: The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are `100.100.2.136` and `100.100.2.138`.
        :param pulumi.Input[bool] dry_run: Specifies whether to precheck this request only. Valid values: `true` or `false`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[DhcpOptionsSetArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a VPC Dhcp Options Set resource.

        For information about VPC Dhcp Options Set and how to use it, see [What is Dhcp Options Set](https://www.alibabacloud.com/help/doc-detail/174112.htm).

        > **NOTE:** Available in v1.134.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.vpc.DhcpOptionsSet("example",
            dhcp_options_set_description="example_value",
            dhcp_options_set_name="example_value",
            domain_name="example.com",
            domain_name_servers="100.100.2.136")
        ```

        ## Import

        VPC Dhcp Options Set can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/dhcpOptionsSet:DhcpOptionsSet example <id>
        ```

        :param str resource_name: The name of the resource.
        :param DhcpOptionsSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DhcpOptionsSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 associate_vpcs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DhcpOptionsSetAssociateVpcArgs']]]]] = None,
                 dhcp_options_set_description: Optional[pulumi.Input[str]] = None,
                 dhcp_options_set_name: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 domain_name_servers: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
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
            __props__ = DhcpOptionsSetArgs.__new__(DhcpOptionsSetArgs)

            __props__.__dict__["associate_vpcs"] = associate_vpcs
            __props__.__dict__["dhcp_options_set_description"] = dhcp_options_set_description
            __props__.__dict__["dhcp_options_set_name"] = dhcp_options_set_name
            __props__.__dict__["domain_name"] = domain_name
            __props__.__dict__["domain_name_servers"] = domain_name_servers
            __props__.__dict__["dry_run"] = dry_run
            __props__.__dict__["owner_id"] = None
            __props__.__dict__["status"] = None
        super(DhcpOptionsSet, __self__).__init__(
            'alicloud:vpc/dhcpOptionsSet:DhcpOptionsSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            associate_vpcs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DhcpOptionsSetAssociateVpcArgs']]]]] = None,
            dhcp_options_set_description: Optional[pulumi.Input[str]] = None,
            dhcp_options_set_name: Optional[pulumi.Input[str]] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            domain_name_servers: Optional[pulumi.Input[str]] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            owner_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'DhcpOptionsSet':
        """
        Get an existing DhcpOptionsSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DhcpOptionsSetAssociateVpcArgs']]]] associate_vpcs: AssociateVpcs. Number of VPCs that can be associated with each DHCP options set is 10.
        :param pulumi.Input[str] dhcp_options_set_description: The description of the DHCP options set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[str] dhcp_options_set_name: The name of the DHCP options set. The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
        :param pulumi.Input[str] domain_name: The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
        :param pulumi.Input[str] domain_name_servers: The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are `100.100.2.136` and `100.100.2.138`.
        :param pulumi.Input[bool] dry_run: Specifies whether to precheck this request only. Valid values: `true` or `false`.
        :param pulumi.Input[str] owner_id: The ID of the account to which the DHCP options set belongs.
        :param pulumi.Input[str] status: The status of the DHCP options set. Valid values: `Available`, `InUse` or `Pending`. `Available`: The DHCP options set is available for use. `InUse`: The DHCP options set is in use. `Pending`: The DHCP options set is being configured.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DhcpOptionsSetState.__new__(_DhcpOptionsSetState)

        __props__.__dict__["associate_vpcs"] = associate_vpcs
        __props__.__dict__["dhcp_options_set_description"] = dhcp_options_set_description
        __props__.__dict__["dhcp_options_set_name"] = dhcp_options_set_name
        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["domain_name_servers"] = domain_name_servers
        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["owner_id"] = owner_id
        __props__.__dict__["status"] = status
        return DhcpOptionsSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="associateVpcs")
    def associate_vpcs(self) -> pulumi.Output[Optional[Sequence['outputs.DhcpOptionsSetAssociateVpc']]]:
        """
        AssociateVpcs. Number of VPCs that can be associated with each DHCP options set is 10.
        """
        return pulumi.get(self, "associate_vpcs")

    @property
    @pulumi.getter(name="dhcpOptionsSetDescription")
    def dhcp_options_set_description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the DHCP options set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "dhcp_options_set_description")

    @property
    @pulumi.getter(name="dhcpOptionsSetName")
    def dhcp_options_set_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the DHCP options set. The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
        """
        return pulumi.get(self, "dhcp_options_set_name")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[Optional[str]]:
        """
        The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="domainNameServers")
    def domain_name_servers(self) -> pulumi.Output[Optional[str]]:
        """
        The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are `100.100.2.136` and `100.100.2.138`.
        """
        return pulumi.get(self, "domain_name_servers")

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to precheck this request only. Valid values: `true` or `false`.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> pulumi.Output[str]:
        """
        The ID of the account to which the DHCP options set belongs.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the DHCP options set. Valid values: `Available`, `InUse` or `Pending`. `Available`: The DHCP options set is available for use. `InUse`: The DHCP options set is in use. `Pending`: The DHCP options set is being configured.
        """
        return pulumi.get(self, "status")
