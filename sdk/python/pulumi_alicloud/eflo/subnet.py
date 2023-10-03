# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SubnetArgs', 'Subnet']

@pulumi.input_type
class SubnetArgs:
    def __init__(__self__, *,
                 cidr: pulumi.Input[str],
                 subnet_name: pulumi.Input[str],
                 vpd_id: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Subnet resource.
        :param pulumi.Input[str] cidr: CIDR network segment.
        :param pulumi.Input[str] subnet_name: The Subnet name.
        :param pulumi.Input[str] vpd_id: The Eflo VPD ID.
        :param pulumi.Input[str] zone_id: The zone ID  of the resource.
        :param pulumi.Input[str] type: Eflo subnet usage type. optional value:
               - General type is not filled in
               - OOB:OOB type
               - LB: LB type
        """
        SubnetArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cidr=cidr,
            subnet_name=subnet_name,
            vpd_id=vpd_id,
            zone_id=zone_id,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cidr: pulumi.Input[str],
             subnet_name: pulumi.Input[str],
             vpd_id: pulumi.Input[str],
             zone_id: pulumi.Input[str],
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("cidr", cidr)
        _setter("subnet_name", subnet_name)
        _setter("vpd_id", vpd_id)
        _setter("zone_id", zone_id)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter
    def cidr(self) -> pulumi.Input[str]:
        """
        CIDR network segment.
        """
        return pulumi.get(self, "cidr")

    @cidr.setter
    def cidr(self, value: pulumi.Input[str]):
        pulumi.set(self, "cidr", value)

    @property
    @pulumi.getter(name="subnetName")
    def subnet_name(self) -> pulumi.Input[str]:
        """
        The Subnet name.
        """
        return pulumi.get(self, "subnet_name")

    @subnet_name.setter
    def subnet_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "subnet_name", value)

    @property
    @pulumi.getter(name="vpdId")
    def vpd_id(self) -> pulumi.Input[str]:
        """
        The Eflo VPD ID.
        """
        return pulumi.get(self, "vpd_id")

    @vpd_id.setter
    def vpd_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpd_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone ID  of the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Eflo subnet usage type. optional value:
        - General type is not filled in
        - OOB:OOB type
        - LB: LB type
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _SubnetState:
    def __init__(__self__, *,
                 cidr: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 gmt_modified: Optional[pulumi.Input[str]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 subnet_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vpd_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Subnet resources.
        :param pulumi.Input[str] cidr: CIDR network segment.
        :param pulumi.Input[str] create_time: The creation time of the resource.
        :param pulumi.Input[str] gmt_modified: Modification time.
        :param pulumi.Input[str] message: Error message.
        :param pulumi.Input[str] resource_group_id: Resource Group ID.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[str] subnet_id: The id of the subnet.
        :param pulumi.Input[str] subnet_name: The Subnet name.
        :param pulumi.Input[str] type: Eflo subnet usage type. optional value:
               - General type is not filled in
               - OOB:OOB type
               - LB: LB type
        :param pulumi.Input[str] vpd_id: The Eflo VPD ID.
        :param pulumi.Input[str] zone_id: The zone ID  of the resource.
        """
        _SubnetState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cidr=cidr,
            create_time=create_time,
            gmt_modified=gmt_modified,
            message=message,
            resource_group_id=resource_group_id,
            status=status,
            subnet_id=subnet_id,
            subnet_name=subnet_name,
            type=type,
            vpd_id=vpd_id,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cidr: Optional[pulumi.Input[str]] = None,
             create_time: Optional[pulumi.Input[str]] = None,
             gmt_modified: Optional[pulumi.Input[str]] = None,
             message: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             subnet_id: Optional[pulumi.Input[str]] = None,
             subnet_name: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             vpd_id: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if cidr is not None:
            _setter("cidr", cidr)
        if create_time is not None:
            _setter("create_time", create_time)
        if gmt_modified is not None:
            _setter("gmt_modified", gmt_modified)
        if message is not None:
            _setter("message", message)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if status is not None:
            _setter("status", status)
        if subnet_id is not None:
            _setter("subnet_id", subnet_id)
        if subnet_name is not None:
            _setter("subnet_name", subnet_name)
        if type is not None:
            _setter("type", type)
        if vpd_id is not None:
            _setter("vpd_id", vpd_id)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter
    def cidr(self) -> Optional[pulumi.Input[str]]:
        """
        CIDR network segment.
        """
        return pulumi.get(self, "cidr")

    @cidr.setter
    def cidr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cidr", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="gmtModified")
    def gmt_modified(self) -> Optional[pulumi.Input[str]]:
        """
        Modification time.
        """
        return pulumi.get(self, "gmt_modified")

    @gmt_modified.setter
    def gmt_modified(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gmt_modified", value)

    @property
    @pulumi.getter
    def message(self) -> Optional[pulumi.Input[str]]:
        """
        Error message.
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "message", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        Resource Group ID.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the subnet.
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet_id", value)

    @property
    @pulumi.getter(name="subnetName")
    def subnet_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Subnet name.
        """
        return pulumi.get(self, "subnet_name")

    @subnet_name.setter
    def subnet_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet_name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Eflo subnet usage type. optional value:
        - General type is not filled in
        - OOB:OOB type
        - LB: LB type
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="vpdId")
    def vpd_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Eflo VPD ID.
        """
        return pulumi.get(self, "vpd_id")

    @vpd_id.setter
    def vpd_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpd_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone ID  of the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class Subnet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidr: Optional[pulumi.Input[str]] = None,
                 subnet_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vpd_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Eflo Subnet resource.

        For information about Eflo Subnet and how to use it, see [What is Subnet](https://www.alibabacloud.com/help/en/pai/user-guide/overview-of-intelligent-computing-lingjun).

        > **NOTE:** Available since v1.204.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_zones = alicloud.get_zones()
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default_vpd = alicloud.eflo.Vpd("defaultVpd",
            cidr="10.0.0.0/8",
            vpd_name=name,
            resource_group_id=default_resource_groups.groups[0].id)
        default_subnet = alicloud.eflo.Subnet("defaultSubnet",
            subnet_name=name,
            zone_id=default_zones.zones[0].id,
            cidr="10.0.0.0/16",
            vpd_id=default_vpd.id)
        ```

        ## Import

        Eflo Subnet can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:eflo/subnet:Subnet example <vpd_id>:<subnet_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cidr: CIDR network segment.
        :param pulumi.Input[str] subnet_name: The Subnet name.
        :param pulumi.Input[str] type: Eflo subnet usage type. optional value:
               - General type is not filled in
               - OOB:OOB type
               - LB: LB type
        :param pulumi.Input[str] vpd_id: The Eflo VPD ID.
        :param pulumi.Input[str] zone_id: The zone ID  of the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SubnetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Eflo Subnet resource.

        For information about Eflo Subnet and how to use it, see [What is Subnet](https://www.alibabacloud.com/help/en/pai/user-guide/overview-of-intelligent-computing-lingjun).

        > **NOTE:** Available since v1.204.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_zones = alicloud.get_zones()
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default_vpd = alicloud.eflo.Vpd("defaultVpd",
            cidr="10.0.0.0/8",
            vpd_name=name,
            resource_group_id=default_resource_groups.groups[0].id)
        default_subnet = alicloud.eflo.Subnet("defaultSubnet",
            subnet_name=name,
            zone_id=default_zones.zones[0].id,
            cidr="10.0.0.0/16",
            vpd_id=default_vpd.id)
        ```

        ## Import

        Eflo Subnet can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:eflo/subnet:Subnet example <vpd_id>:<subnet_id>
        ```

        :param str resource_name: The name of the resource.
        :param SubnetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SubnetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            SubnetArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidr: Optional[pulumi.Input[str]] = None,
                 subnet_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vpd_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SubnetArgs.__new__(SubnetArgs)

            if cidr is None and not opts.urn:
                raise TypeError("Missing required property 'cidr'")
            __props__.__dict__["cidr"] = cidr
            if subnet_name is None and not opts.urn:
                raise TypeError("Missing required property 'subnet_name'")
            __props__.__dict__["subnet_name"] = subnet_name
            __props__.__dict__["type"] = type
            if vpd_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpd_id'")
            __props__.__dict__["vpd_id"] = vpd_id
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["create_time"] = None
            __props__.__dict__["gmt_modified"] = None
            __props__.__dict__["message"] = None
            __props__.__dict__["resource_group_id"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["subnet_id"] = None
        super(Subnet, __self__).__init__(
            'alicloud:eflo/subnet:Subnet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cidr: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            gmt_modified: Optional[pulumi.Input[str]] = None,
            message: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            subnet_id: Optional[pulumi.Input[str]] = None,
            subnet_name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            vpd_id: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'Subnet':
        """
        Get an existing Subnet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cidr: CIDR network segment.
        :param pulumi.Input[str] create_time: The creation time of the resource.
        :param pulumi.Input[str] gmt_modified: Modification time.
        :param pulumi.Input[str] message: Error message.
        :param pulumi.Input[str] resource_group_id: Resource Group ID.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[str] subnet_id: The id of the subnet.
        :param pulumi.Input[str] subnet_name: The Subnet name.
        :param pulumi.Input[str] type: Eflo subnet usage type. optional value:
               - General type is not filled in
               - OOB:OOB type
               - LB: LB type
        :param pulumi.Input[str] vpd_id: The Eflo VPD ID.
        :param pulumi.Input[str] zone_id: The zone ID  of the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SubnetState.__new__(_SubnetState)

        __props__.__dict__["cidr"] = cidr
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["gmt_modified"] = gmt_modified
        __props__.__dict__["message"] = message
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["status"] = status
        __props__.__dict__["subnet_id"] = subnet_id
        __props__.__dict__["subnet_name"] = subnet_name
        __props__.__dict__["type"] = type
        __props__.__dict__["vpd_id"] = vpd_id
        __props__.__dict__["zone_id"] = zone_id
        return Subnet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def cidr(self) -> pulumi.Output[str]:
        """
        CIDR network segment.
        """
        return pulumi.get(self, "cidr")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="gmtModified")
    def gmt_modified(self) -> pulumi.Output[str]:
        """
        Modification time.
        """
        return pulumi.get(self, "gmt_modified")

    @property
    @pulumi.getter
    def message(self) -> pulumi.Output[str]:
        """
        Error message.
        """
        return pulumi.get(self, "message")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        Resource Group ID.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> pulumi.Output[str]:
        """
        The id of the subnet.
        """
        return pulumi.get(self, "subnet_id")

    @property
    @pulumi.getter(name="subnetName")
    def subnet_name(self) -> pulumi.Output[str]:
        """
        The Subnet name.
        """
        return pulumi.get(self, "subnet_name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        Eflo subnet usage type. optional value:
        - General type is not filled in
        - OOB:OOB type
        - LB: LB type
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="vpdId")
    def vpd_id(self) -> pulumi.Output[str]:
        """
        The Eflo VPD ID.
        """
        return pulumi.get(self, "vpd_id")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone ID  of the resource.
        """
        return pulumi.get(self, "zone_id")

