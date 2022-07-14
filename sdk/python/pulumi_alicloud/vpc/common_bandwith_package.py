# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['CommonBandwithPackageArgs', 'CommonBandwithPackage']

@pulumi.input_type
class CommonBandwithPackageArgs:
    def __init__(__self__, *,
                 bandwidth: pulumi.Input[str],
                 bandwidth_package_name: Optional[pulumi.Input[str]] = None,
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[str]] = None,
                 internet_charge_type: Optional[pulumi.Input[str]] = None,
                 isp: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ratio: Optional[pulumi.Input[int]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a CommonBandwithPackage resource.
        :param pulumi.Input[str] bandwidth: The bandwidth of the common bandwidth package. Unit: Mbps.
        :param pulumi.Input[str] bandwidth_package_name: The name of the common bandwidth package.
        :param pulumi.Input[bool] deletion_protection: Whether enable the deletion protection or not. Default value: `false`.
               - true: Enable deletion protection.
               - false: Disable deletion protection.
        :param pulumi.Input[str] description: The description of the common bandwidth package instance.
        :param pulumi.Input[str] force: This parameter is used for resource destroy. Default value is `false`.
        :param pulumi.Input[str] internet_charge_type: The billing method of the common bandwidth package. Valid values are `PayByBandwidth` and `PayBy95` and `PayByTraffic`, `PayByDominantTraffic`. `PayBy95` is pay by classic 95th percentile pricing. International Account doesn't supports `PayByBandwidth` and `PayBy95`. Default to `PayByTraffic`. **NOTE:** From 1.176.0+, `PayByDominantTraffic` is available.
        :param pulumi.Input[str] isp: The type of the Internet Service Provider. Valid values: `BGP` and `BGP_PRO`. Default to `BGP`.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.120.0. New field `bandwidth_package_name` instead.
        :param pulumi.Input[int] ratio: Ratio of the common bandwidth package. It is valid when `internet_charge_type` is `PayBy95`. Default to `100`. Valid values: [10-100].
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the common bandwidth package belongs.
        :param pulumi.Input[str] zone: The zone of bandwidth package.
        """
        pulumi.set(__self__, "bandwidth", bandwidth)
        if bandwidth_package_name is not None:
            pulumi.set(__self__, "bandwidth_package_name", bandwidth_package_name)
        if deletion_protection is not None:
            pulumi.set(__self__, "deletion_protection", deletion_protection)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if internet_charge_type is not None:
            pulumi.set(__self__, "internet_charge_type", internet_charge_type)
        if isp is not None:
            pulumi.set(__self__, "isp", isp)
        if name is not None:
            warnings.warn("""Field 'name' has been deprecated from provider version 1.120.0. New field 'bandwidth_package_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'bandwidth_package_name' instead.""")
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ratio is not None:
            pulumi.set(__self__, "ratio", ratio)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Input[str]:
        """
        The bandwidth of the common bandwidth package. Unit: Mbps.
        """
        return pulumi.get(self, "bandwidth")

    @bandwidth.setter
    def bandwidth(self, value: pulumi.Input[str]):
        pulumi.set(self, "bandwidth", value)

    @property
    @pulumi.getter(name="bandwidthPackageName")
    def bandwidth_package_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the common bandwidth package.
        """
        return pulumi.get(self, "bandwidth_package_name")

    @bandwidth_package_name.setter
    def bandwidth_package_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bandwidth_package_name", value)

    @property
    @pulumi.getter(name="deletionProtection")
    def deletion_protection(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether enable the deletion protection or not. Default value: `false`.
        - true: Enable deletion protection.
        - false: Disable deletion protection.
        """
        return pulumi.get(self, "deletion_protection")

    @deletion_protection.setter
    def deletion_protection(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deletion_protection", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the common bandwidth package instance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[str]]:
        """
        This parameter is used for resource destroy. Default value is `false`.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "force", value)

    @property
    @pulumi.getter(name="internetChargeType")
    def internet_charge_type(self) -> Optional[pulumi.Input[str]]:
        """
        The billing method of the common bandwidth package. Valid values are `PayByBandwidth` and `PayBy95` and `PayByTraffic`, `PayByDominantTraffic`. `PayBy95` is pay by classic 95th percentile pricing. International Account doesn't supports `PayByBandwidth` and `PayBy95`. Default to `PayByTraffic`. **NOTE:** From 1.176.0+, `PayByDominantTraffic` is available.
        """
        return pulumi.get(self, "internet_charge_type")

    @internet_charge_type.setter
    def internet_charge_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "internet_charge_type", value)

    @property
    @pulumi.getter
    def isp(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the Internet Service Provider. Valid values: `BGP` and `BGP_PRO`. Default to `BGP`.
        """
        return pulumi.get(self, "isp")

    @isp.setter
    def isp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "isp", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Field `name` has been deprecated from provider version 1.120.0. New field `bandwidth_package_name` instead.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def ratio(self) -> Optional[pulumi.Input[int]]:
        """
        Ratio of the common bandwidth package. It is valid when `internet_charge_type` is `PayBy95`. Default to `100`. Valid values: [10-100].
        """
        return pulumi.get(self, "ratio")

    @ratio.setter
    def ratio(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ratio", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Id of resource group which the common bandwidth package belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        The zone of bandwidth package.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


@pulumi.input_type
class _CommonBandwithPackageState:
    def __init__(__self__, *,
                 bandwidth: Optional[pulumi.Input[str]] = None,
                 bandwidth_package_name: Optional[pulumi.Input[str]] = None,
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[str]] = None,
                 internet_charge_type: Optional[pulumi.Input[str]] = None,
                 isp: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ratio: Optional[pulumi.Input[int]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CommonBandwithPackage resources.
        :param pulumi.Input[str] bandwidth: The bandwidth of the common bandwidth package. Unit: Mbps.
        :param pulumi.Input[str] bandwidth_package_name: The name of the common bandwidth package.
        :param pulumi.Input[bool] deletion_protection: Whether enable the deletion protection or not. Default value: `false`.
               - true: Enable deletion protection.
               - false: Disable deletion protection.
        :param pulumi.Input[str] description: The description of the common bandwidth package instance.
        :param pulumi.Input[str] force: This parameter is used for resource destroy. Default value is `false`.
        :param pulumi.Input[str] internet_charge_type: The billing method of the common bandwidth package. Valid values are `PayByBandwidth` and `PayBy95` and `PayByTraffic`, `PayByDominantTraffic`. `PayBy95` is pay by classic 95th percentile pricing. International Account doesn't supports `PayByBandwidth` and `PayBy95`. Default to `PayByTraffic`. **NOTE:** From 1.176.0+, `PayByDominantTraffic` is available.
        :param pulumi.Input[str] isp: The type of the Internet Service Provider. Valid values: `BGP` and `BGP_PRO`. Default to `BGP`.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.120.0. New field `bandwidth_package_name` instead.
        :param pulumi.Input[int] ratio: Ratio of the common bandwidth package. It is valid when `internet_charge_type` is `PayBy95`. Default to `100`. Valid values: [10-100].
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the common bandwidth package belongs.
        :param pulumi.Input[str] status: (Available in 1.120.0+) The status of bandwidth package.
        :param pulumi.Input[str] zone: The zone of bandwidth package.
        """
        if bandwidth is not None:
            pulumi.set(__self__, "bandwidth", bandwidth)
        if bandwidth_package_name is not None:
            pulumi.set(__self__, "bandwidth_package_name", bandwidth_package_name)
        if deletion_protection is not None:
            pulumi.set(__self__, "deletion_protection", deletion_protection)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if force is not None:
            pulumi.set(__self__, "force", force)
        if internet_charge_type is not None:
            pulumi.set(__self__, "internet_charge_type", internet_charge_type)
        if isp is not None:
            pulumi.set(__self__, "isp", isp)
        if name is not None:
            warnings.warn("""Field 'name' has been deprecated from provider version 1.120.0. New field 'bandwidth_package_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'bandwidth_package_name' instead.""")
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ratio is not None:
            pulumi.set(__self__, "ratio", ratio)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter
    def bandwidth(self) -> Optional[pulumi.Input[str]]:
        """
        The bandwidth of the common bandwidth package. Unit: Mbps.
        """
        return pulumi.get(self, "bandwidth")

    @bandwidth.setter
    def bandwidth(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bandwidth", value)

    @property
    @pulumi.getter(name="bandwidthPackageName")
    def bandwidth_package_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the common bandwidth package.
        """
        return pulumi.get(self, "bandwidth_package_name")

    @bandwidth_package_name.setter
    def bandwidth_package_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bandwidth_package_name", value)

    @property
    @pulumi.getter(name="deletionProtection")
    def deletion_protection(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether enable the deletion protection or not. Default value: `false`.
        - true: Enable deletion protection.
        - false: Disable deletion protection.
        """
        return pulumi.get(self, "deletion_protection")

    @deletion_protection.setter
    def deletion_protection(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deletion_protection", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the common bandwidth package instance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[str]]:
        """
        This parameter is used for resource destroy. Default value is `false`.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "force", value)

    @property
    @pulumi.getter(name="internetChargeType")
    def internet_charge_type(self) -> Optional[pulumi.Input[str]]:
        """
        The billing method of the common bandwidth package. Valid values are `PayByBandwidth` and `PayBy95` and `PayByTraffic`, `PayByDominantTraffic`. `PayBy95` is pay by classic 95th percentile pricing. International Account doesn't supports `PayByBandwidth` and `PayBy95`. Default to `PayByTraffic`. **NOTE:** From 1.176.0+, `PayByDominantTraffic` is available.
        """
        return pulumi.get(self, "internet_charge_type")

    @internet_charge_type.setter
    def internet_charge_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "internet_charge_type", value)

    @property
    @pulumi.getter
    def isp(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the Internet Service Provider. Valid values: `BGP` and `BGP_PRO`. Default to `BGP`.
        """
        return pulumi.get(self, "isp")

    @isp.setter
    def isp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "isp", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Field `name` has been deprecated from provider version 1.120.0. New field `bandwidth_package_name` instead.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def ratio(self) -> Optional[pulumi.Input[int]]:
        """
        Ratio of the common bandwidth package. It is valid when `internet_charge_type` is `PayBy95`. Default to `100`. Valid values: [10-100].
        """
        return pulumi.get(self, "ratio")

    @ratio.setter
    def ratio(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ratio", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Id of resource group which the common bandwidth package belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        (Available in 1.120.0+) The status of bandwidth package.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        The zone of bandwidth package.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


class CommonBandwithPackage(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[str]] = None,
                 bandwidth_package_name: Optional[pulumi.Input[str]] = None,
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[str]] = None,
                 internet_charge_type: Optional[pulumi.Input[str]] = None,
                 isp: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ratio: Optional[pulumi.Input[int]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        foo = alicloud.vpc.CommonBandwithPackage("foo",
            bandwidth="1000",
            bandwidth_package_name="test-common-bandwidth-package",
            description="test-common-bandwidth-package",
            internet_charge_type="PayByBandwidth")
        ```

        ## Import

        The common bandwidth package can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/commonBandwithPackage:CommonBandwithPackage foo cbwp-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bandwidth: The bandwidth of the common bandwidth package. Unit: Mbps.
        :param pulumi.Input[str] bandwidth_package_name: The name of the common bandwidth package.
        :param pulumi.Input[bool] deletion_protection: Whether enable the deletion protection or not. Default value: `false`.
               - true: Enable deletion protection.
               - false: Disable deletion protection.
        :param pulumi.Input[str] description: The description of the common bandwidth package instance.
        :param pulumi.Input[str] force: This parameter is used for resource destroy. Default value is `false`.
        :param pulumi.Input[str] internet_charge_type: The billing method of the common bandwidth package. Valid values are `PayByBandwidth` and `PayBy95` and `PayByTraffic`, `PayByDominantTraffic`. `PayBy95` is pay by classic 95th percentile pricing. International Account doesn't supports `PayByBandwidth` and `PayBy95`. Default to `PayByTraffic`. **NOTE:** From 1.176.0+, `PayByDominantTraffic` is available.
        :param pulumi.Input[str] isp: The type of the Internet Service Provider. Valid values: `BGP` and `BGP_PRO`. Default to `BGP`.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.120.0. New field `bandwidth_package_name` instead.
        :param pulumi.Input[int] ratio: Ratio of the common bandwidth package. It is valid when `internet_charge_type` is `PayBy95`. Default to `100`. Valid values: [10-100].
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the common bandwidth package belongs.
        :param pulumi.Input[str] zone: The zone of bandwidth package.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CommonBandwithPackageArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        foo = alicloud.vpc.CommonBandwithPackage("foo",
            bandwidth="1000",
            bandwidth_package_name="test-common-bandwidth-package",
            description="test-common-bandwidth-package",
            internet_charge_type="PayByBandwidth")
        ```

        ## Import

        The common bandwidth package can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/commonBandwithPackage:CommonBandwithPackage foo cbwp-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param CommonBandwithPackageArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CommonBandwithPackageArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[str]] = None,
                 bandwidth_package_name: Optional[pulumi.Input[str]] = None,
                 deletion_protection: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 force: Optional[pulumi.Input[str]] = None,
                 internet_charge_type: Optional[pulumi.Input[str]] = None,
                 isp: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ratio: Optional[pulumi.Input[int]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
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
            __props__ = CommonBandwithPackageArgs.__new__(CommonBandwithPackageArgs)

            if bandwidth is None and not opts.urn:
                raise TypeError("Missing required property 'bandwidth'")
            __props__.__dict__["bandwidth"] = bandwidth
            __props__.__dict__["bandwidth_package_name"] = bandwidth_package_name
            __props__.__dict__["deletion_protection"] = deletion_protection
            __props__.__dict__["description"] = description
            __props__.__dict__["force"] = force
            __props__.__dict__["internet_charge_type"] = internet_charge_type
            __props__.__dict__["isp"] = isp
            if name is not None and not opts.urn:
                warnings.warn("""Field 'name' has been deprecated from provider version 1.120.0. New field 'bandwidth_package_name' instead.""", DeprecationWarning)
                pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'bandwidth_package_name' instead.""")
            __props__.__dict__["name"] = name
            __props__.__dict__["ratio"] = ratio
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["zone"] = zone
            __props__.__dict__["status"] = None
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
            deletion_protection: Optional[pulumi.Input[bool]] = None,
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
        :param pulumi.Input[str] bandwidth: The bandwidth of the common bandwidth package. Unit: Mbps.
        :param pulumi.Input[str] bandwidth_package_name: The name of the common bandwidth package.
        :param pulumi.Input[bool] deletion_protection: Whether enable the deletion protection or not. Default value: `false`.
               - true: Enable deletion protection.
               - false: Disable deletion protection.
        :param pulumi.Input[str] description: The description of the common bandwidth package instance.
        :param pulumi.Input[str] force: This parameter is used for resource destroy. Default value is `false`.
        :param pulumi.Input[str] internet_charge_type: The billing method of the common bandwidth package. Valid values are `PayByBandwidth` and `PayBy95` and `PayByTraffic`, `PayByDominantTraffic`. `PayBy95` is pay by classic 95th percentile pricing. International Account doesn't supports `PayByBandwidth` and `PayBy95`. Default to `PayByTraffic`. **NOTE:** From 1.176.0+, `PayByDominantTraffic` is available.
        :param pulumi.Input[str] isp: The type of the Internet Service Provider. Valid values: `BGP` and `BGP_PRO`. Default to `BGP`.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.120.0. New field `bandwidth_package_name` instead.
        :param pulumi.Input[int] ratio: Ratio of the common bandwidth package. It is valid when `internet_charge_type` is `PayBy95`. Default to `100`. Valid values: [10-100].
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the common bandwidth package belongs.
        :param pulumi.Input[str] status: (Available in 1.120.0+) The status of bandwidth package.
        :param pulumi.Input[str] zone: The zone of bandwidth package.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CommonBandwithPackageState.__new__(_CommonBandwithPackageState)

        __props__.__dict__["bandwidth"] = bandwidth
        __props__.__dict__["bandwidth_package_name"] = bandwidth_package_name
        __props__.__dict__["deletion_protection"] = deletion_protection
        __props__.__dict__["description"] = description
        __props__.__dict__["force"] = force
        __props__.__dict__["internet_charge_type"] = internet_charge_type
        __props__.__dict__["isp"] = isp
        __props__.__dict__["name"] = name
        __props__.__dict__["ratio"] = ratio
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["status"] = status
        __props__.__dict__["zone"] = zone
        return CommonBandwithPackage(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Output[str]:
        """
        The bandwidth of the common bandwidth package. Unit: Mbps.
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
    @pulumi.getter(name="deletionProtection")
    def deletion_protection(self) -> pulumi.Output[bool]:
        """
        Whether enable the deletion protection or not. Default value: `false`.
        - true: Enable deletion protection.
        - false: Disable deletion protection.
        """
        return pulumi.get(self, "deletion_protection")

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
        """
        This parameter is used for resource destroy. Default value is `false`.
        """
        return pulumi.get(self, "force")

    @property
    @pulumi.getter(name="internetChargeType")
    def internet_charge_type(self) -> pulumi.Output[Optional[str]]:
        """
        The billing method of the common bandwidth package. Valid values are `PayByBandwidth` and `PayBy95` and `PayByTraffic`, `PayByDominantTraffic`. `PayBy95` is pay by classic 95th percentile pricing. International Account doesn't supports `PayByBandwidth` and `PayBy95`. Default to `PayByTraffic`. **NOTE:** From 1.176.0+, `PayByDominantTraffic` is available.
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

