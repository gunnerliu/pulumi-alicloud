# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['CommonBandwithPackage']


class CommonBandwithPackage(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[str]] = None,
                 bandwidth_package_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[str]] = None,
                 internet_charge_type: Optional[pulumi.Input[str]] = None,
                 isp: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ratio: Optional[pulumi.Input[int]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        The common bandwidth package can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/commonBandwithPackage:CommonBandwithPackage foo cbwp-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bandwidth: The bandwidth of the common bandwidth package, in Mbps.
        :param pulumi.Input[str] bandwidth_package_name: The name of the common bandwidth package.
        :param pulumi.Input[str] description: The description of the common bandwidth package instance.
        :param pulumi.Input[str] internet_charge_type: The billing method of the common bandwidth package. Valid values are `PayByBandwidth` and `PayBy95` and `PayByTraffic`. `PayBy95` is pay by classic 95th percentile pricing. International Account doesn't supports `PayByBandwidth` and `PayBy95`. Default to `PayByTraffic`.
        :param pulumi.Input[str] isp: The type of the Internet Service Provider. Valid values: `BGP` and `BGP_PRO`. Default to `BGP`.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.120.0. New field `bandwidth_package_name` instead.
        :param pulumi.Input[int] ratio: Ratio of the common bandwidth package. It is valid when `internet_charge_type` is `PayBy95`. Default to `100`. Valid values: [10-100].
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the common bandwidth package belongs.
        :param pulumi.Input[str] zone: The zone of bandwidth package.
        """
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

            if bandwidth is None and not opts.urn:
                raise TypeError("Missing required property 'bandwidth'")
            __props__['bandwidth'] = bandwidth
            __props__['bandwidth_package_name'] = bandwidth_package_name
            __props__['description'] = description
            __props__['force'] = force
            __props__['internet_charge_type'] = internet_charge_type
            __props__['isp'] = isp
            if name is not None and not opts.urn:
                warnings.warn("""Field 'name' has been deprecated from provider version 1.120.0. New field 'bandwidth_package_name' instead.""", DeprecationWarning)
                pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'bandwidth_package_name' instead.""")
            __props__['name'] = name
            __props__['ratio'] = ratio
            __props__['resource_group_id'] = resource_group_id
            __props__['zone'] = zone
            __props__['status'] = None
        super(CommonBandwithPackage, __self__).__init__(
            'alicloud:vpc/commonBandwithPackage:CommonBandwithPackage',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bandwidth: Optional[pulumi.Input[str]] = None,
            bandwidth_package_name: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            force: Optional[pulumi.Input[str]] = None,
            internet_charge_type: Optional[pulumi.Input[str]] = None,
            isp: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            ratio: Optional[pulumi.Input[int]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            zone: Optional[pulumi.Input[str]] = None) -> 'CommonBandwithPackage':
        """
        Get an existing CommonBandwithPackage resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bandwidth: The bandwidth of the common bandwidth package, in Mbps.
        :param pulumi.Input[str] bandwidth_package_name: The name of the common bandwidth package.
        :param pulumi.Input[str] description: The description of the common bandwidth package instance.
        :param pulumi.Input[str] internet_charge_type: The billing method of the common bandwidth package. Valid values are `PayByBandwidth` and `PayBy95` and `PayByTraffic`. `PayBy95` is pay by classic 95th percentile pricing. International Account doesn't supports `PayByBandwidth` and `PayBy95`. Default to `PayByTraffic`.
        :param pulumi.Input[str] isp: The type of the Internet Service Provider. Valid values: `BGP` and `BGP_PRO`. Default to `BGP`.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.120.0. New field `bandwidth_package_name` instead.
        :param pulumi.Input[int] ratio: Ratio of the common bandwidth package. It is valid when `internet_charge_type` is `PayBy95`. Default to `100`. Valid values: [10-100].
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the common bandwidth package belongs.
        :param pulumi.Input[str] status: (Available in 1.120.0+) The status of bandwidth package.
        :param pulumi.Input[str] zone: The zone of bandwidth package.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["bandwidth"] = bandwidth
        __props__["bandwidth_package_name"] = bandwidth_package_name
        __props__["description"] = description
        __props__["force"] = force
        __props__["internet_charge_type"] = internet_charge_type
        __props__["isp"] = isp
        __props__["name"] = name
        __props__["ratio"] = ratio
        __props__["resource_group_id"] = resource_group_id
        __props__["status"] = status
        __props__["zone"] = zone
        return CommonBandwithPackage(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Output[str]:
        """
        The bandwidth of the common bandwidth package, in Mbps.
        """
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter(name="bandwidthPackageName")
    def bandwidth_package_name(self) -> pulumi.Output[str]:
        """
        The name of the common bandwidth package.
        """
        return pulumi.get(self, "bandwidth_package_name")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the common bandwidth package instance.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def force(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "force")

    @property
    @pulumi.getter(name="internetChargeType")
    def internet_charge_type(self) -> pulumi.Output[Optional[str]]:
        """
        The billing method of the common bandwidth package. Valid values are `PayByBandwidth` and `PayBy95` and `PayByTraffic`. `PayBy95` is pay by classic 95th percentile pricing. International Account doesn't supports `PayByBandwidth` and `PayBy95`. Default to `PayByTraffic`.
        """
        return pulumi.get(self, "internet_charge_type")

    @property
    @pulumi.getter
    def isp(self) -> pulumi.Output[Optional[str]]:
        """
        The type of the Internet Service Provider. Valid values: `BGP` and `BGP_PRO`. Default to `BGP`.
        """
        return pulumi.get(self, "isp")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Field `name` has been deprecated from provider version 1.120.0. New field `bandwidth_package_name` instead.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def ratio(self) -> pulumi.Output[Optional[int]]:
        """
        Ratio of the common bandwidth package. It is valid when `internet_charge_type` is `PayBy95`. Default to `100`. Valid values: [10-100].
        """
        return pulumi.get(self, "ratio")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The Id of resource group which the common bandwidth package belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        (Available in 1.120.0+) The status of bandwidth package.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Output[Optional[str]]:
        """
        The zone of bandwidth package.
        """
        return pulumi.get(self, "zone")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

