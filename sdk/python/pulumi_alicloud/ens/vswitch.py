# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VswitchArgs', 'Vswitch']

@pulumi.input_type
class VswitchArgs:
    def __init__(__self__, *,
                 cidr_block: pulumi.Input[str],
                 ens_region_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 vswitch_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Vswitch resource.
        :param pulumi.Input[str] cidr_block: IPv4 CIDR block of the VSwitch instance.
        :param pulumi.Input[str] ens_region_id: ENS Region ID.
        :param pulumi.Input[str] description: Description of the VSwitch Instance.
        :param pulumi.Input[str] network_id: Network ID of the VSwitch instance.
        :param pulumi.Input[str] vswitch_name: Name of the switch instance.
        """
        pulumi.set(__self__, "cidr_block", cidr_block)
        pulumi.set(__self__, "ens_region_id", ens_region_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if vswitch_name is not None:
            pulumi.set(__self__, "vswitch_name", vswitch_name)

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> pulumi.Input[str]:
        """
        IPv4 CIDR block of the VSwitch instance.
        """
        return pulumi.get(self, "cidr_block")

    @cidr_block.setter
    def cidr_block(self, value: pulumi.Input[str]):
        pulumi.set(self, "cidr_block", value)

    @property
    @pulumi.getter(name="ensRegionId")
    def ens_region_id(self) -> pulumi.Input[str]:
        """
        ENS Region ID.
        """
        return pulumi.get(self, "ens_region_id")

    @ens_region_id.setter
    def ens_region_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "ens_region_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the VSwitch Instance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[str]]:
        """
        Network ID of the VSwitch instance.
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter(name="vswitchName")
    def vswitch_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the switch instance.
        """
        return pulumi.get(self, "vswitch_name")

    @vswitch_name.setter
    def vswitch_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_name", value)


@pulumi.input_type
class _VswitchState:
    def __init__(__self__, *,
                 cidr_block: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ens_region_id: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 vswitch_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Vswitch resources.
        :param pulumi.Input[str] cidr_block: IPv4 CIDR block of the VSwitch instance.
        :param pulumi.Input[str] create_time: The creation time of the VSwitch instance, in the UTC time format, yyyy-MM-ddTHH:mm:ssZ.
        :param pulumi.Input[str] description: Description of the VSwitch Instance.
        :param pulumi.Input[str] ens_region_id: ENS Region ID.
        :param pulumi.Input[str] network_id: Network ID of the VSwitch instance.
        :param pulumi.Input[str] status: Status of the switch instance.
        :param pulumi.Input[str] vswitch_name: Name of the switch instance.
        """
        if cidr_block is not None:
            pulumi.set(__self__, "cidr_block", cidr_block)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if ens_region_id is not None:
            pulumi.set(__self__, "ens_region_id", ens_region_id)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if vswitch_name is not None:
            pulumi.set(__self__, "vswitch_name", vswitch_name)

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> Optional[pulumi.Input[str]]:
        """
        IPv4 CIDR block of the VSwitch instance.
        """
        return pulumi.get(self, "cidr_block")

    @cidr_block.setter
    def cidr_block(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cidr_block", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The creation time of the VSwitch instance, in the UTC time format, yyyy-MM-ddTHH:mm:ssZ.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the VSwitch Instance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="ensRegionId")
    def ens_region_id(self) -> Optional[pulumi.Input[str]]:
        """
        ENS Region ID.
        """
        return pulumi.get(self, "ens_region_id")

    @ens_region_id.setter
    def ens_region_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ens_region_id", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[str]]:
        """
        Network ID of the VSwitch instance.
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the switch instance.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="vswitchName")
    def vswitch_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the switch instance.
        """
        return pulumi.get(self, "vswitch_name")

    @vswitch_name.setter
    def vswitch_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_name", value)


class Vswitch(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidr_block: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ens_region_id: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 vswitch_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a ENS Vswitch resource.

        For information about ENS Vswitch and how to use it, see [What is Vswitch](https://www.alibabacloud.com/help/en/ens/developer-reference/api-createvswitch).

        > **NOTE:** Available since v1.213.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_network = alicloud.ens.Network("defaultNetwork",
            network_name=name,
            description=name,
            cidr_block="192.168.2.0/24",
            ens_region_id="cn-chenzhou-telecom_unicom_cmcc")
        default_vswitch = alicloud.ens.Vswitch("defaultVswitch",
            description=name,
            cidr_block="192.168.2.0/24",
            vswitch_name=name,
            ens_region_id="cn-chenzhou-telecom_unicom_cmcc",
            network_id=default_network.id)
        ```

        ## Import

        ENS Vswitch can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ens/vswitch:Vswitch example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cidr_block: IPv4 CIDR block of the VSwitch instance.
        :param pulumi.Input[str] description: Description of the VSwitch Instance.
        :param pulumi.Input[str] ens_region_id: ENS Region ID.
        :param pulumi.Input[str] network_id: Network ID of the VSwitch instance.
        :param pulumi.Input[str] vswitch_name: Name of the switch instance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VswitchArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ENS Vswitch resource.

        For information about ENS Vswitch and how to use it, see [What is Vswitch](https://www.alibabacloud.com/help/en/ens/developer-reference/api-createvswitch).

        > **NOTE:** Available since v1.213.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_network = alicloud.ens.Network("defaultNetwork",
            network_name=name,
            description=name,
            cidr_block="192.168.2.0/24",
            ens_region_id="cn-chenzhou-telecom_unicom_cmcc")
        default_vswitch = alicloud.ens.Vswitch("defaultVswitch",
            description=name,
            cidr_block="192.168.2.0/24",
            vswitch_name=name,
            ens_region_id="cn-chenzhou-telecom_unicom_cmcc",
            network_id=default_network.id)
        ```

        ## Import

        ENS Vswitch can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ens/vswitch:Vswitch example <id>
        ```

        :param str resource_name: The name of the resource.
        :param VswitchArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VswitchArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidr_block: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ens_region_id: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[str]] = None,
                 vswitch_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VswitchArgs.__new__(VswitchArgs)

            if cidr_block is None and not opts.urn:
                raise TypeError("Missing required property 'cidr_block'")
            __props__.__dict__["cidr_block"] = cidr_block
            __props__.__dict__["description"] = description
            if ens_region_id is None and not opts.urn:
                raise TypeError("Missing required property 'ens_region_id'")
            __props__.__dict__["ens_region_id"] = ens_region_id
            __props__.__dict__["network_id"] = network_id
            __props__.__dict__["vswitch_name"] = vswitch_name
            __props__.__dict__["create_time"] = None
            __props__.__dict__["status"] = None
        super(Vswitch, __self__).__init__(
            'alicloud:ens/vswitch:Vswitch',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cidr_block: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            ens_region_id: Optional[pulumi.Input[str]] = None,
            network_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            vswitch_name: Optional[pulumi.Input[str]] = None) -> 'Vswitch':
        """
        Get an existing Vswitch resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cidr_block: IPv4 CIDR block of the VSwitch instance.
        :param pulumi.Input[str] create_time: The creation time of the VSwitch instance, in the UTC time format, yyyy-MM-ddTHH:mm:ssZ.
        :param pulumi.Input[str] description: Description of the VSwitch Instance.
        :param pulumi.Input[str] ens_region_id: ENS Region ID.
        :param pulumi.Input[str] network_id: Network ID of the VSwitch instance.
        :param pulumi.Input[str] status: Status of the switch instance.
        :param pulumi.Input[str] vswitch_name: Name of the switch instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VswitchState.__new__(_VswitchState)

        __props__.__dict__["cidr_block"] = cidr_block
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["ens_region_id"] = ens_region_id
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["status"] = status
        __props__.__dict__["vswitch_name"] = vswitch_name
        return Vswitch(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> pulumi.Output[str]:
        """
        IPv4 CIDR block of the VSwitch instance.
        """
        return pulumi.get(self, "cidr_block")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The creation time of the VSwitch instance, in the UTC time format, yyyy-MM-ddTHH:mm:ssZ.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the VSwitch Instance.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="ensRegionId")
    def ens_region_id(self) -> pulumi.Output[str]:
        """
        ENS Region ID.
        """
        return pulumi.get(self, "ens_region_id")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[str]:
        """
        Network ID of the VSwitch instance.
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the switch instance.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vswitchName")
    def vswitch_name(self) -> pulumi.Output[Optional[str]]:
        """
        Name of the switch instance.
        """
        return pulumi.get(self, "vswitch_name")

