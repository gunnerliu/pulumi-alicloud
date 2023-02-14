# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['LoadBalancerSecurityGroupAttachmentArgs', 'LoadBalancerSecurityGroupAttachment']

@pulumi.input_type
class LoadBalancerSecurityGroupAttachmentArgs:
    def __init__(__self__, *,
                 load_balancer_id: pulumi.Input[str],
                 security_group_id: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a LoadBalancerSecurityGroupAttachment resource.
        :param pulumi.Input[str] load_balancer_id: The ID of the network-based server load balancer instance to be bound to the security group.
        :param pulumi.Input[str] security_group_id: The ID of security groups.
        :param pulumi.Input[bool] dry_run: Whether to PreCheck this request only. Value:-**true**: sends a check request and does not bind a security group to the instance. Check items include whether required parameters, request format, and business restrictions have been filled in. If the check fails, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.-**false** (default): Sends a normal request, returns the HTTP 2xx status code after the check, and directly performs the operation.
        """
        pulumi.set(__self__, "load_balancer_id", load_balancer_id)
        pulumi.set(__self__, "security_group_id", security_group_id)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Input[str]:
        """
        The ID of the network-based server load balancer instance to be bound to the security group.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "load_balancer_id", value)

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> pulumi.Input[str]:
        """
        The ID of security groups.
        """
        return pulumi.get(self, "security_group_id")

    @security_group_id.setter
    def security_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "security_group_id", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to PreCheck this request only. Value:-**true**: sends a check request and does not bind a security group to the instance. Check items include whether required parameters, request format, and business restrictions have been filled in. If the check fails, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.-**false** (default): Sends a normal request, returns the HTTP 2xx status code after the check, and directly performs the operation.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)


@pulumi.input_type
class _LoadBalancerSecurityGroupAttachmentState:
    def __init__(__self__, *,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LoadBalancerSecurityGroupAttachment resources.
        :param pulumi.Input[bool] dry_run: Whether to PreCheck this request only. Value:-**true**: sends a check request and does not bind a security group to the instance. Check items include whether required parameters, request format, and business restrictions have been filled in. If the check fails, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.-**false** (default): Sends a normal request, returns the HTTP 2xx status code after the check, and directly performs the operation.
        :param pulumi.Input[str] load_balancer_id: The ID of the network-based server load balancer instance to be bound to the security group.
        :param pulumi.Input[str] security_group_id: The ID of security groups.
        """
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if load_balancer_id is not None:
            pulumi.set(__self__, "load_balancer_id", load_balancer_id)
        if security_group_id is not None:
            pulumi.set(__self__, "security_group_id", security_group_id)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to PreCheck this request only. Value:-**true**: sends a check request and does not bind a security group to the instance. Check items include whether required parameters, request format, and business restrictions have been filled in. If the check fails, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.-**false** (default): Sends a normal request, returns the HTTP 2xx status code after the check, and directly performs the operation.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the network-based server load balancer instance to be bound to the security group.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "load_balancer_id", value)

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of security groups.
        """
        return pulumi.get(self, "security_group_id")

    @security_group_id.setter
    def security_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_group_id", value)


class LoadBalancerSecurityGroupAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Nlb Load Balancer Security Group Attachment resource.

        For information about Nlb Load Balancer Security Group Attachment and how to use it, see [What is Load Balancer Security Group Attachment](https://www.alibabacloud.com/help/en/server-load-balancer/latest/loadbalancerjoinsecuritygroup).

        > **NOTE:** Available in v1.198.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_zones = alicloud.nlb.get_zones()
        default_networks = alicloud.vpc.get_networks(name_regex="^default-NODELETING$")
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default1 = alicloud.vpc.get_switches(vpc_id=default_networks.ids[0],
            zone_id=default_zones.zones[0].id)
        default2 = alicloud.vpc.get_switches(vpc_id=default_networks.ids[0],
            zone_id=default_zones.zones[1].id)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_networks.ids[0])
        zone_id1 = default_zones.zones[0].id
        vswitch_id1 = default1.ids[0]
        zone_id2 = default_zones.zones[1].id
        vswitch_id2 = default2.ids[0]
        default_load_balancer = alicloud.nlb.LoadBalancer("defaultLoadBalancer",
            load_balancer_name=var["name"],
            resource_group_id=default_resource_groups.ids[0],
            load_balancer_type="Network",
            address_type="Internet",
            address_ip_version="Ipv4",
            vpc_id=default_networks.ids[0],
            zone_mappings=[
                alicloud.nlb.LoadBalancerZoneMappingArgs(
                    vswitch_id=vswitch_id1,
                    zone_id=zone_id1,
                ),
                alicloud.nlb.LoadBalancerZoneMappingArgs(
                    vswitch_id=vswitch_id2,
                    zone_id=zone_id2,
                ),
            ])
        default_load_balancer_security_group_attachment = alicloud.nlb.LoadBalancerSecurityGroupAttachment("defaultLoadBalancerSecurityGroupAttachment",
            security_group_id=default_security_group.id,
            load_balancer_id=default_load_balancer.id)
        ```

        ## Import

        Nlb Load Balancer Security Group Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:nlb/loadBalancerSecurityGroupAttachment:LoadBalancerSecurityGroupAttachment example <LoadBalancerId>:<SecurityGroupId>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: Whether to PreCheck this request only. Value:-**true**: sends a check request and does not bind a security group to the instance. Check items include whether required parameters, request format, and business restrictions have been filled in. If the check fails, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.-**false** (default): Sends a normal request, returns the HTTP 2xx status code after the check, and directly performs the operation.
        :param pulumi.Input[str] load_balancer_id: The ID of the network-based server load balancer instance to be bound to the security group.
        :param pulumi.Input[str] security_group_id: The ID of security groups.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadBalancerSecurityGroupAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Nlb Load Balancer Security Group Attachment resource.

        For information about Nlb Load Balancer Security Group Attachment and how to use it, see [What is Load Balancer Security Group Attachment](https://www.alibabacloud.com/help/en/server-load-balancer/latest/loadbalancerjoinsecuritygroup).

        > **NOTE:** Available in v1.198.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_zones = alicloud.nlb.get_zones()
        default_networks = alicloud.vpc.get_networks(name_regex="^default-NODELETING$")
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default1 = alicloud.vpc.get_switches(vpc_id=default_networks.ids[0],
            zone_id=default_zones.zones[0].id)
        default2 = alicloud.vpc.get_switches(vpc_id=default_networks.ids[0],
            zone_id=default_zones.zones[1].id)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_networks.ids[0])
        zone_id1 = default_zones.zones[0].id
        vswitch_id1 = default1.ids[0]
        zone_id2 = default_zones.zones[1].id
        vswitch_id2 = default2.ids[0]
        default_load_balancer = alicloud.nlb.LoadBalancer("defaultLoadBalancer",
            load_balancer_name=var["name"],
            resource_group_id=default_resource_groups.ids[0],
            load_balancer_type="Network",
            address_type="Internet",
            address_ip_version="Ipv4",
            vpc_id=default_networks.ids[0],
            zone_mappings=[
                alicloud.nlb.LoadBalancerZoneMappingArgs(
                    vswitch_id=vswitch_id1,
                    zone_id=zone_id1,
                ),
                alicloud.nlb.LoadBalancerZoneMappingArgs(
                    vswitch_id=vswitch_id2,
                    zone_id=zone_id2,
                ),
            ])
        default_load_balancer_security_group_attachment = alicloud.nlb.LoadBalancerSecurityGroupAttachment("defaultLoadBalancerSecurityGroupAttachment",
            security_group_id=default_security_group.id,
            load_balancer_id=default_load_balancer.id)
        ```

        ## Import

        Nlb Load Balancer Security Group Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:nlb/loadBalancerSecurityGroupAttachment:LoadBalancerSecurityGroupAttachment example <LoadBalancerId>:<SecurityGroupId>
        ```

        :param str resource_name: The name of the resource.
        :param LoadBalancerSecurityGroupAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadBalancerSecurityGroupAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadBalancerSecurityGroupAttachmentArgs.__new__(LoadBalancerSecurityGroupAttachmentArgs)

            __props__.__dict__["dry_run"] = dry_run
            if load_balancer_id is None and not opts.urn:
                raise TypeError("Missing required property 'load_balancer_id'")
            __props__.__dict__["load_balancer_id"] = load_balancer_id
            if security_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'security_group_id'")
            __props__.__dict__["security_group_id"] = security_group_id
        super(LoadBalancerSecurityGroupAttachment, __self__).__init__(
            'alicloud:nlb/loadBalancerSecurityGroupAttachment:LoadBalancerSecurityGroupAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            load_balancer_id: Optional[pulumi.Input[str]] = None,
            security_group_id: Optional[pulumi.Input[str]] = None) -> 'LoadBalancerSecurityGroupAttachment':
        """
        Get an existing LoadBalancerSecurityGroupAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: Whether to PreCheck this request only. Value:-**true**: sends a check request and does not bind a security group to the instance. Check items include whether required parameters, request format, and business restrictions have been filled in. If the check fails, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.-**false** (default): Sends a normal request, returns the HTTP 2xx status code after the check, and directly performs the operation.
        :param pulumi.Input[str] load_balancer_id: The ID of the network-based server load balancer instance to be bound to the security group.
        :param pulumi.Input[str] security_group_id: The ID of security groups.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadBalancerSecurityGroupAttachmentState.__new__(_LoadBalancerSecurityGroupAttachmentState)

        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["load_balancer_id"] = load_balancer_id
        __props__.__dict__["security_group_id"] = security_group_id
        return LoadBalancerSecurityGroupAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to PreCheck this request only. Value:-**true**: sends a check request and does not bind a security group to the instance. Check items include whether required parameters, request format, and business restrictions have been filled in. If the check fails, the corresponding error is returned. If the check passes, the error code 'DryRunOperation' is returned '.-**false** (default): Sends a normal request, returns the HTTP 2xx status code after the check, and directly performs the operation.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Output[str]:
        """
        The ID of the network-based server load balancer instance to be bound to the security group.
        """
        return pulumi.get(self, "load_balancer_id")

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> pulumi.Output[str]:
        """
        The ID of security groups.
        """
        return pulumi.get(self, "security_group_id")
