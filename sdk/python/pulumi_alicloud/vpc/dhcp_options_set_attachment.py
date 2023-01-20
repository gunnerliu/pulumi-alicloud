# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DhcpOptionsSetAttachmentArgs', 'DhcpOptionsSetAttachment']

@pulumi.input_type
class DhcpOptionsSetAttachmentArgs:
    def __init__(__self__, *,
                 dhcp_options_set_id: pulumi.Input[str],
                 vpc_id: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a DhcpOptionsSetAttachment resource.
        :param pulumi.Input[str] dhcp_options_set_id: The ID of the DHCP options set.
        :param pulumi.Input[str] vpc_id: The ID of the VPC network that is to be associated with the DHCP options set..
        :param pulumi.Input[bool] dry_run: Specifies whether to precheck this request only. Default values: `false`. Valid values:
        """
        pulumi.set(__self__, "dhcp_options_set_id", dhcp_options_set_id)
        pulumi.set(__self__, "vpc_id", vpc_id)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)

    @property
    @pulumi.getter(name="dhcpOptionsSetId")
    def dhcp_options_set_id(self) -> pulumi.Input[str]:
        """
        The ID of the DHCP options set.
        """
        return pulumi.get(self, "dhcp_options_set_id")

    @dhcp_options_set_id.setter
    def dhcp_options_set_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "dhcp_options_set_id", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        The ID of the VPC network that is to be associated with the DHCP options set..
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to precheck this request only. Default values: `false`. Valid values:
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)


@pulumi.input_type
class _DhcpOptionsSetAttachmentState:
    def __init__(__self__, *,
                 dhcp_options_set_id: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DhcpOptionsSetAttachment resources.
        :param pulumi.Input[str] dhcp_options_set_id: The ID of the DHCP options set.
        :param pulumi.Input[bool] dry_run: Specifies whether to precheck this request only. Default values: `false`. Valid values:
        :param pulumi.Input[str] status: The status of the VPC network that is associated with the DHCP options set.  Valid values: `InUse` or `Pending`.
        :param pulumi.Input[str] vpc_id: The ID of the VPC network that is to be associated with the DHCP options set..
        """
        if dhcp_options_set_id is not None:
            pulumi.set(__self__, "dhcp_options_set_id", dhcp_options_set_id)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="dhcpOptionsSetId")
    def dhcp_options_set_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the DHCP options set.
        """
        return pulumi.get(self, "dhcp_options_set_id")

    @dhcp_options_set_id.setter
    def dhcp_options_set_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dhcp_options_set_id", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to precheck this request only. Default values: `false`. Valid values:
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the VPC network that is associated with the DHCP options set.  Valid values: `InUse` or `Pending`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC network that is to be associated with the DHCP options set..
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class DhcpOptionsSetAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dhcp_options_set_id: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a VPC Dhcp Options Set Attachment resource.

        For information about VPC Dhcp Options Set and how to use it, see [What is Dhcp Options Set](https://www.alibabacloud.com/help/doc-detail/174112.htm).

        > **NOTE:** Available in v1.153.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example_network = alicloud.vpc.Network("exampleNetwork",
            vpc_name="test",
            cidr_block="172.16.0.0/12")
        example_dhcp_options_set = alicloud.vpc.DhcpOptionsSet("exampleDhcpOptionsSet",
            dhcp_options_set_name="example_value",
            dhcp_options_set_description="example_value",
            domain_name="example.com",
            domain_name_servers="100.100.2.136")
        example_dhcp_options_set_attachment = alicloud.vpc.DhcpOptionsSetAttachment("exampleDhcpOptionsSetAttachment",
            vpc_id=example_network.id,
            dhcp_options_set_id=example_dhcp_options_set.id)
        ```

        ## Import

        VPC Dhcp Options Set Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/dhcpOptionsSetAttachment:DhcpOptionsSetAttachment example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dhcp_options_set_id: The ID of the DHCP options set.
        :param pulumi.Input[bool] dry_run: Specifies whether to precheck this request only. Default values: `false`. Valid values:
        :param pulumi.Input[str] vpc_id: The ID of the VPC network that is to be associated with the DHCP options set..
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DhcpOptionsSetAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a VPC Dhcp Options Set Attachment resource.

        For information about VPC Dhcp Options Set and how to use it, see [What is Dhcp Options Set](https://www.alibabacloud.com/help/doc-detail/174112.htm).

        > **NOTE:** Available in v1.153.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example_network = alicloud.vpc.Network("exampleNetwork",
            vpc_name="test",
            cidr_block="172.16.0.0/12")
        example_dhcp_options_set = alicloud.vpc.DhcpOptionsSet("exampleDhcpOptionsSet",
            dhcp_options_set_name="example_value",
            dhcp_options_set_description="example_value",
            domain_name="example.com",
            domain_name_servers="100.100.2.136")
        example_dhcp_options_set_attachment = alicloud.vpc.DhcpOptionsSetAttachment("exampleDhcpOptionsSetAttachment",
            vpc_id=example_network.id,
            dhcp_options_set_id=example_dhcp_options_set.id)
        ```

        ## Import

        VPC Dhcp Options Set Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/dhcpOptionsSetAttachment:DhcpOptionsSetAttachment example <id>
        ```

        :param str resource_name: The name of the resource.
        :param DhcpOptionsSetAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DhcpOptionsSetAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dhcp_options_set_id: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DhcpOptionsSetAttachmentArgs.__new__(DhcpOptionsSetAttachmentArgs)

            if dhcp_options_set_id is None and not opts.urn:
                raise TypeError("Missing required property 'dhcp_options_set_id'")
            __props__.__dict__["dhcp_options_set_id"] = dhcp_options_set_id
            __props__.__dict__["dry_run"] = dry_run
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["status"] = None
        super(DhcpOptionsSetAttachment, __self__).__init__(
            'alicloud:vpc/dhcpOptionsSetAttachment:DhcpOptionsSetAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dhcp_options_set_id: Optional[pulumi.Input[str]] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            status: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'DhcpOptionsSetAttachment':
        """
        Get an existing DhcpOptionsSetAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dhcp_options_set_id: The ID of the DHCP options set.
        :param pulumi.Input[bool] dry_run: Specifies whether to precheck this request only. Default values: `false`. Valid values:
        :param pulumi.Input[str] status: The status of the VPC network that is associated with the DHCP options set.  Valid values: `InUse` or `Pending`.
        :param pulumi.Input[str] vpc_id: The ID of the VPC network that is to be associated with the DHCP options set..
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DhcpOptionsSetAttachmentState.__new__(_DhcpOptionsSetAttachmentState)

        __props__.__dict__["dhcp_options_set_id"] = dhcp_options_set_id
        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["status"] = status
        __props__.__dict__["vpc_id"] = vpc_id
        return DhcpOptionsSetAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dhcpOptionsSetId")
    def dhcp_options_set_id(self) -> pulumi.Output[str]:
        """
        The ID of the DHCP options set.
        """
        return pulumi.get(self, "dhcp_options_set_id")

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to precheck this request only. Default values: `false`. Valid values:
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the VPC network that is associated with the DHCP options set.  Valid values: `InUse` or `Pending`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The ID of the VPC network that is to be associated with the DHCP options set..
        """
        return pulumi.get(self, "vpc_id")

