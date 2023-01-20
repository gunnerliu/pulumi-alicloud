# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InstanceArgs', 'Instance']

@pulumi.input_type
class InstanceArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[str],
                 instance_series: pulumi.Input[str],
                 specification: pulumi.Input[str],
                 vswitch_id: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 instance_charge_type: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Instance resource.
        :param pulumi.Input[str] description: Description of the DRDS instance, This description can have a string of 2 to 256 characters.
        :param pulumi.Input[str] instance_series: The parameter of the instance series. **NOTE:**  `drds.sn1.4c8g`,`drds.sn1.8c16g`,`drds.sn1.16c32g`,`drds.sn1.32c64g` are no longer supported. Valid values:
               - `drds.sn2.4c16g` Starter Edition.
               - `drds.sn2.8c32g` Standard Edition.
               - `drds.sn2.16c64g` Enterprise Edition.
        :param pulumi.Input[str] specification: User-defined DRDS instance specification. Value range:
               - `drds.sn1.4c8g` for DRDS instance Starter version;
               - value range : `drds.sn1.4c8g.8c16g`, `drds.sn1.4c8g.16c32g`, `drds.sn1.4c8g.32c64g`, `drds.sn1.4c8g.64c128g`
               - `drds.sn1.8c16g` for DRDS instance Standard edition;
               - value range : `drds.sn1.8c16g.16c32g`, `drds.sn1.8c16g.32c64g`, `drds.sn1.8c16g.64c128g`
               - `drds.sn1.16c32g` for DRDS instance Enterprise Edition;
               - value range : `drds.sn1.16c32g.32c64g`, `drds.sn1.16c32g.64c128g`
               - `drds.sn1.32c64g` for DRDS instance Extreme Edition;
               - value range : `drds.sn1.32c64g.128c256g`
        :param pulumi.Input[str] vswitch_id: The VSwitch ID to launch in.
        :param pulumi.Input[str] zone_id: The Zone to launch the DRDS instance.
        :param pulumi.Input[str] instance_charge_type: Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        :param pulumi.Input[str] vpc_id: The id of the VPC.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "instance_series", instance_series)
        pulumi.set(__self__, "specification", specification)
        pulumi.set(__self__, "vswitch_id", vswitch_id)
        pulumi.set(__self__, "zone_id", zone_id)
        if instance_charge_type is not None:
            pulumi.set(__self__, "instance_charge_type", instance_charge_type)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        Description of the DRDS instance, This description can have a string of 2 to 256 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="instanceSeries")
    def instance_series(self) -> pulumi.Input[str]:
        """
        The parameter of the instance series. **NOTE:**  `drds.sn1.4c8g`,`drds.sn1.8c16g`,`drds.sn1.16c32g`,`drds.sn1.32c64g` are no longer supported. Valid values:
        - `drds.sn2.4c16g` Starter Edition.
        - `drds.sn2.8c32g` Standard Edition.
        - `drds.sn2.16c64g` Enterprise Edition.
        """
        return pulumi.get(self, "instance_series")

    @instance_series.setter
    def instance_series(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_series", value)

    @property
    @pulumi.getter
    def specification(self) -> pulumi.Input[str]:
        """
        User-defined DRDS instance specification. Value range:
        - `drds.sn1.4c8g` for DRDS instance Starter version;
        - value range : `drds.sn1.4c8g.8c16g`, `drds.sn1.4c8g.16c32g`, `drds.sn1.4c8g.32c64g`, `drds.sn1.4c8g.64c128g`
        - `drds.sn1.8c16g` for DRDS instance Standard edition;
        - value range : `drds.sn1.8c16g.16c32g`, `drds.sn1.8c16g.32c64g`, `drds.sn1.8c16g.64c128g`
        - `drds.sn1.16c32g` for DRDS instance Enterprise Edition;
        - value range : `drds.sn1.16c32g.32c64g`, `drds.sn1.16c32g.64c128g`
        - `drds.sn1.32c64g` for DRDS instance Extreme Edition;
        - value range : `drds.sn1.32c64g.128c256g`
        """
        return pulumi.get(self, "specification")

    @specification.setter
    def specification(self, value: pulumi.Input[str]):
        pulumi.set(self, "specification", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Input[str]:
        """
        The VSwitch ID to launch in.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The Zone to launch the DRDS instance.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> Optional[pulumi.Input[str]]:
        """
        Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        """
        return pulumi.get(self, "instance_charge_type")

    @instance_charge_type.setter
    def instance_charge_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_charge_type", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the VPC.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


@pulumi.input_type
class _InstanceState:
    def __init__(__self__, *,
                 connection_string: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 instance_charge_type: Optional[pulumi.Input[str]] = None,
                 instance_series: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[str]] = None,
                 specification: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Instance resources.
        :param pulumi.Input[str] connection_string: (Available in 1.196.0+) The connection string of the DRDS instance.
        :param pulumi.Input[str] description: Description of the DRDS instance, This description can have a string of 2 to 256 characters.
        :param pulumi.Input[str] instance_charge_type: Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        :param pulumi.Input[str] instance_series: The parameter of the instance series. **NOTE:**  `drds.sn1.4c8g`,`drds.sn1.8c16g`,`drds.sn1.16c32g`,`drds.sn1.32c64g` are no longer supported. Valid values:
               - `drds.sn2.4c16g` Starter Edition.
               - `drds.sn2.8c32g` Standard Edition.
               - `drds.sn2.16c64g` Enterprise Edition.
        :param pulumi.Input[str] port: (Available in 1.196.0+) The connection port of the DRDS instance.
        :param pulumi.Input[str] specification: User-defined DRDS instance specification. Value range:
               - `drds.sn1.4c8g` for DRDS instance Starter version;
               - value range : `drds.sn1.4c8g.8c16g`, `drds.sn1.4c8g.16c32g`, `drds.sn1.4c8g.32c64g`, `drds.sn1.4c8g.64c128g`
               - `drds.sn1.8c16g` for DRDS instance Standard edition;
               - value range : `drds.sn1.8c16g.16c32g`, `drds.sn1.8c16g.32c64g`, `drds.sn1.8c16g.64c128g`
               - `drds.sn1.16c32g` for DRDS instance Enterprise Edition;
               - value range : `drds.sn1.16c32g.32c64g`, `drds.sn1.16c32g.64c128g`
               - `drds.sn1.32c64g` for DRDS instance Extreme Edition;
               - value range : `drds.sn1.32c64g.128c256g`
        :param pulumi.Input[str] vpc_id: The id of the VPC.
        :param pulumi.Input[str] vswitch_id: The VSwitch ID to launch in.
        :param pulumi.Input[str] zone_id: The Zone to launch the DRDS instance.
        """
        if connection_string is not None:
            pulumi.set(__self__, "connection_string", connection_string)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if instance_charge_type is not None:
            pulumi.set(__self__, "instance_charge_type", instance_charge_type)
        if instance_series is not None:
            pulumi.set(__self__, "instance_series", instance_series)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if specification is not None:
            pulumi.set(__self__, "specification", specification)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)
        if vswitch_id is not None:
            pulumi.set(__self__, "vswitch_id", vswitch_id)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> Optional[pulumi.Input[str]]:
        """
        (Available in 1.196.0+) The connection string of the DRDS instance.
        """
        return pulumi.get(self, "connection_string")

    @connection_string.setter
    def connection_string(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_string", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the DRDS instance, This description can have a string of 2 to 256 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> Optional[pulumi.Input[str]]:
        """
        Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        """
        return pulumi.get(self, "instance_charge_type")

    @instance_charge_type.setter
    def instance_charge_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_charge_type", value)

    @property
    @pulumi.getter(name="instanceSeries")
    def instance_series(self) -> Optional[pulumi.Input[str]]:
        """
        The parameter of the instance series. **NOTE:**  `drds.sn1.4c8g`,`drds.sn1.8c16g`,`drds.sn1.16c32g`,`drds.sn1.32c64g` are no longer supported. Valid values:
        - `drds.sn2.4c16g` Starter Edition.
        - `drds.sn2.8c32g` Standard Edition.
        - `drds.sn2.16c64g` Enterprise Edition.
        """
        return pulumi.get(self, "instance_series")

    @instance_series.setter
    def instance_series(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_series", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[str]]:
        """
        (Available in 1.196.0+) The connection port of the DRDS instance.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def specification(self) -> Optional[pulumi.Input[str]]:
        """
        User-defined DRDS instance specification. Value range:
        - `drds.sn1.4c8g` for DRDS instance Starter version;
        - value range : `drds.sn1.4c8g.8c16g`, `drds.sn1.4c8g.16c32g`, `drds.sn1.4c8g.32c64g`, `drds.sn1.4c8g.64c128g`
        - `drds.sn1.8c16g` for DRDS instance Standard edition;
        - value range : `drds.sn1.8c16g.16c32g`, `drds.sn1.8c16g.32c64g`, `drds.sn1.8c16g.64c128g`
        - `drds.sn1.16c32g` for DRDS instance Enterprise Edition;
        - value range : `drds.sn1.16c32g.32c64g`, `drds.sn1.16c32g.64c128g`
        - `drds.sn1.32c64g` for DRDS instance Extreme Edition;
        - value range : `drds.sn1.32c64g.128c256g`
        """
        return pulumi.get(self, "specification")

    @specification.setter
    def specification(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "specification", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the VPC.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VSwitch ID to launch in.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Zone to launch the DRDS instance.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class Instance(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 instance_charge_type: Optional[pulumi.Input[str]] = None,
                 instance_series: Optional[pulumi.Input[str]] = None,
                 specification: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Distributed Relational Database Service (DRDS) is a lightweight (stateless), flexible, stable, and efficient middleware product independently developed by Alibaba Group to resolve scalability issues with single-host relational databases.
        With its compatibility with MySQL protocols and syntaxes, DRDS enables database/table sharding, smooth scaling, configuration upgrade/downgrade,
        transparent read/write splitting, and distributed transactions, providing O&M capabilities for distributed databases throughout their entire lifecycle.

        For information about DRDS and how to use it, see [What is DRDS](https://www.alibabacloud.com/help/product/29657.htm).

        > **NOTE:** At present, DRDS instance only can be supported in the regions: cn-shenzhen, cn-beijing, cn-hangzhou, cn-hongkong, cn-qingdao, ap-southeast-1.

        > **NOTE:** Currently, this resource only support `Domestic Site Account`.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.drds.Instance("default",
            description="drds instance",
            instance_charge_type="PostPaid",
            instance_series="drds.sn1.4c8g",
            specification="drds.sn1.4c8g.8C16G",
            vswitch_id="vsw-bp1jlu3swk8rq2yoi40ey",
            zone_id="cn-hangzhou-e")
        ```

        ## Import

        Distributed Relational Database Service (DRDS) can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:drds/instance:Instance example drds-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the DRDS instance, This description can have a string of 2 to 256 characters.
        :param pulumi.Input[str] instance_charge_type: Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        :param pulumi.Input[str] instance_series: The parameter of the instance series. **NOTE:**  `drds.sn1.4c8g`,`drds.sn1.8c16g`,`drds.sn1.16c32g`,`drds.sn1.32c64g` are no longer supported. Valid values:
               - `drds.sn2.4c16g` Starter Edition.
               - `drds.sn2.8c32g` Standard Edition.
               - `drds.sn2.16c64g` Enterprise Edition.
        :param pulumi.Input[str] specification: User-defined DRDS instance specification. Value range:
               - `drds.sn1.4c8g` for DRDS instance Starter version;
               - value range : `drds.sn1.4c8g.8c16g`, `drds.sn1.4c8g.16c32g`, `drds.sn1.4c8g.32c64g`, `drds.sn1.4c8g.64c128g`
               - `drds.sn1.8c16g` for DRDS instance Standard edition;
               - value range : `drds.sn1.8c16g.16c32g`, `drds.sn1.8c16g.32c64g`, `drds.sn1.8c16g.64c128g`
               - `drds.sn1.16c32g` for DRDS instance Enterprise Edition;
               - value range : `drds.sn1.16c32g.32c64g`, `drds.sn1.16c32g.64c128g`
               - `drds.sn1.32c64g` for DRDS instance Extreme Edition;
               - value range : `drds.sn1.32c64g.128c256g`
        :param pulumi.Input[str] vpc_id: The id of the VPC.
        :param pulumi.Input[str] vswitch_id: The VSwitch ID to launch in.
        :param pulumi.Input[str] zone_id: The Zone to launch the DRDS instance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Distributed Relational Database Service (DRDS) is a lightweight (stateless), flexible, stable, and efficient middleware product independently developed by Alibaba Group to resolve scalability issues with single-host relational databases.
        With its compatibility with MySQL protocols and syntaxes, DRDS enables database/table sharding, smooth scaling, configuration upgrade/downgrade,
        transparent read/write splitting, and distributed transactions, providing O&M capabilities for distributed databases throughout their entire lifecycle.

        For information about DRDS and how to use it, see [What is DRDS](https://www.alibabacloud.com/help/product/29657.htm).

        > **NOTE:** At present, DRDS instance only can be supported in the regions: cn-shenzhen, cn-beijing, cn-hangzhou, cn-hongkong, cn-qingdao, ap-southeast-1.

        > **NOTE:** Currently, this resource only support `Domestic Site Account`.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.drds.Instance("default",
            description="drds instance",
            instance_charge_type="PostPaid",
            instance_series="drds.sn1.4c8g",
            specification="drds.sn1.4c8g.8C16G",
            vswitch_id="vsw-bp1jlu3swk8rq2yoi40ey",
            zone_id="cn-hangzhou-e")
        ```

        ## Import

        Distributed Relational Database Service (DRDS) can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:drds/instance:Instance example drds-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param InstanceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 instance_charge_type: Optional[pulumi.Input[str]] = None,
                 instance_series: Optional[pulumi.Input[str]] = None,
                 specification: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceArgs.__new__(InstanceArgs)

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["instance_charge_type"] = instance_charge_type
            if instance_series is None and not opts.urn:
                raise TypeError("Missing required property 'instance_series'")
            __props__.__dict__["instance_series"] = instance_series
            if specification is None and not opts.urn:
                raise TypeError("Missing required property 'specification'")
            __props__.__dict__["specification"] = specification
            __props__.__dict__["vpc_id"] = vpc_id
            if vswitch_id is None and not opts.urn:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__.__dict__["vswitch_id"] = vswitch_id
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["connection_string"] = None
            __props__.__dict__["port"] = None
        super(Instance, __self__).__init__(
            'alicloud:drds/instance:Instance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            connection_string: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            instance_charge_type: Optional[pulumi.Input[str]] = None,
            instance_series: Optional[pulumi.Input[str]] = None,
            port: Optional[pulumi.Input[str]] = None,
            specification: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'Instance':
        """
        Get an existing Instance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] connection_string: (Available in 1.196.0+) The connection string of the DRDS instance.
        :param pulumi.Input[str] description: Description of the DRDS instance, This description can have a string of 2 to 256 characters.
        :param pulumi.Input[str] instance_charge_type: Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        :param pulumi.Input[str] instance_series: The parameter of the instance series. **NOTE:**  `drds.sn1.4c8g`,`drds.sn1.8c16g`,`drds.sn1.16c32g`,`drds.sn1.32c64g` are no longer supported. Valid values:
               - `drds.sn2.4c16g` Starter Edition.
               - `drds.sn2.8c32g` Standard Edition.
               - `drds.sn2.16c64g` Enterprise Edition.
        :param pulumi.Input[str] port: (Available in 1.196.0+) The connection port of the DRDS instance.
        :param pulumi.Input[str] specification: User-defined DRDS instance specification. Value range:
               - `drds.sn1.4c8g` for DRDS instance Starter version;
               - value range : `drds.sn1.4c8g.8c16g`, `drds.sn1.4c8g.16c32g`, `drds.sn1.4c8g.32c64g`, `drds.sn1.4c8g.64c128g`
               - `drds.sn1.8c16g` for DRDS instance Standard edition;
               - value range : `drds.sn1.8c16g.16c32g`, `drds.sn1.8c16g.32c64g`, `drds.sn1.8c16g.64c128g`
               - `drds.sn1.16c32g` for DRDS instance Enterprise Edition;
               - value range : `drds.sn1.16c32g.32c64g`, `drds.sn1.16c32g.64c128g`
               - `drds.sn1.32c64g` for DRDS instance Extreme Edition;
               - value range : `drds.sn1.32c64g.128c256g`
        :param pulumi.Input[str] vpc_id: The id of the VPC.
        :param pulumi.Input[str] vswitch_id: The VSwitch ID to launch in.
        :param pulumi.Input[str] zone_id: The Zone to launch the DRDS instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceState.__new__(_InstanceState)

        __props__.__dict__["connection_string"] = connection_string
        __props__.__dict__["description"] = description
        __props__.__dict__["instance_charge_type"] = instance_charge_type
        __props__.__dict__["instance_series"] = instance_series
        __props__.__dict__["port"] = port
        __props__.__dict__["specification"] = specification
        __props__.__dict__["vpc_id"] = vpc_id
        __props__.__dict__["vswitch_id"] = vswitch_id
        __props__.__dict__["zone_id"] = zone_id
        return Instance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> pulumi.Output[str]:
        """
        (Available in 1.196.0+) The connection string of the DRDS instance.
        """
        return pulumi.get(self, "connection_string")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of the DRDS instance, This description can have a string of 2 to 256 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> pulumi.Output[Optional[str]]:
        """
        Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        """
        return pulumi.get(self, "instance_charge_type")

    @property
    @pulumi.getter(name="instanceSeries")
    def instance_series(self) -> pulumi.Output[str]:
        """
        The parameter of the instance series. **NOTE:**  `drds.sn1.4c8g`,`drds.sn1.8c16g`,`drds.sn1.16c32g`,`drds.sn1.32c64g` are no longer supported. Valid values:
        - `drds.sn2.4c16g` Starter Edition.
        - `drds.sn2.8c32g` Standard Edition.
        - `drds.sn2.16c64g` Enterprise Edition.
        """
        return pulumi.get(self, "instance_series")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[str]:
        """
        (Available in 1.196.0+) The connection port of the DRDS instance.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def specification(self) -> pulumi.Output[str]:
        """
        User-defined DRDS instance specification. Value range:
        - `drds.sn1.4c8g` for DRDS instance Starter version;
        - value range : `drds.sn1.4c8g.8c16g`, `drds.sn1.4c8g.16c32g`, `drds.sn1.4c8g.32c64g`, `drds.sn1.4c8g.64c128g`
        - `drds.sn1.8c16g` for DRDS instance Standard edition;
        - value range : `drds.sn1.8c16g.16c32g`, `drds.sn1.8c16g.32c64g`, `drds.sn1.8c16g.64c128g`
        - `drds.sn1.16c32g` for DRDS instance Enterprise Edition;
        - value range : `drds.sn1.16c32g.32c64g`, `drds.sn1.16c32g.64c128g`
        - `drds.sn1.32c64g` for DRDS instance Extreme Edition;
        - value range : `drds.sn1.32c64g.128c256g`
        """
        return pulumi.get(self, "specification")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The id of the VPC.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        """
        The VSwitch ID to launch in.
        """
        return pulumi.get(self, "vswitch_id")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The Zone to launch the DRDS instance.
        """
        return pulumi.get(self, "zone_id")

