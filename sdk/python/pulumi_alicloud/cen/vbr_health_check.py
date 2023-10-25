# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VbrHealthCheckArgs', 'VbrHealthCheck']

@pulumi.input_type
class VbrHealthCheckArgs:
    def __init__(__self__, *,
                 cen_id: pulumi.Input[str],
                 health_check_target_ip: pulumi.Input[str],
                 vbr_instance_id: pulumi.Input[str],
                 vbr_instance_region_id: pulumi.Input[str],
                 health_check_interval: Optional[pulumi.Input[int]] = None,
                 health_check_source_ip: Optional[pulumi.Input[str]] = None,
                 healthy_threshold: Optional[pulumi.Input[int]] = None,
                 vbr_instance_owner_id: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a VbrHealthCheck resource.
        :param pulumi.Input[str] cen_id: The ID of the CEN instance.
        :param pulumi.Input[str] health_check_target_ip: The destination IP address of health checks.
        :param pulumi.Input[str] vbr_instance_id: The ID of the VBR.
        :param pulumi.Input[str] vbr_instance_region_id: The ID of the region to which the VBR belongs.
               
               ->**NOTE:** The `cen.VbrHealthCheck` resource depends on the related `cen.InstanceAttachment` resource.
        :param pulumi.Input[int] health_check_interval: Specifies the interval at which the health check sends continuous detection packets. Default value: 2. Value range: 2 to 3.
        :param pulumi.Input[str] health_check_source_ip: The source IP address of health checks.
        :param pulumi.Input[int] healthy_threshold: Specifies the number of probe messages sent by the health check. Default value: 8. Value range: 3 to 8.
        :param pulumi.Input[int] vbr_instance_owner_id: The ID of the account to which the VBR belongs.
        """
        VbrHealthCheckArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cen_id=cen_id,
            health_check_target_ip=health_check_target_ip,
            vbr_instance_id=vbr_instance_id,
            vbr_instance_region_id=vbr_instance_region_id,
            health_check_interval=health_check_interval,
            health_check_source_ip=health_check_source_ip,
            healthy_threshold=healthy_threshold,
            vbr_instance_owner_id=vbr_instance_owner_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cen_id: Optional[pulumi.Input[str]] = None,
             health_check_target_ip: Optional[pulumi.Input[str]] = None,
             vbr_instance_id: Optional[pulumi.Input[str]] = None,
             vbr_instance_region_id: Optional[pulumi.Input[str]] = None,
             health_check_interval: Optional[pulumi.Input[int]] = None,
             health_check_source_ip: Optional[pulumi.Input[str]] = None,
             healthy_threshold: Optional[pulumi.Input[int]] = None,
             vbr_instance_owner_id: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cen_id is None and 'cenId' in kwargs:
            cen_id = kwargs['cenId']
        if cen_id is None:
            raise TypeError("Missing 'cen_id' argument")
        if health_check_target_ip is None and 'healthCheckTargetIp' in kwargs:
            health_check_target_ip = kwargs['healthCheckTargetIp']
        if health_check_target_ip is None:
            raise TypeError("Missing 'health_check_target_ip' argument")
        if vbr_instance_id is None and 'vbrInstanceId' in kwargs:
            vbr_instance_id = kwargs['vbrInstanceId']
        if vbr_instance_id is None:
            raise TypeError("Missing 'vbr_instance_id' argument")
        if vbr_instance_region_id is None and 'vbrInstanceRegionId' in kwargs:
            vbr_instance_region_id = kwargs['vbrInstanceRegionId']
        if vbr_instance_region_id is None:
            raise TypeError("Missing 'vbr_instance_region_id' argument")
        if health_check_interval is None and 'healthCheckInterval' in kwargs:
            health_check_interval = kwargs['healthCheckInterval']
        if health_check_source_ip is None and 'healthCheckSourceIp' in kwargs:
            health_check_source_ip = kwargs['healthCheckSourceIp']
        if healthy_threshold is None and 'healthyThreshold' in kwargs:
            healthy_threshold = kwargs['healthyThreshold']
        if vbr_instance_owner_id is None and 'vbrInstanceOwnerId' in kwargs:
            vbr_instance_owner_id = kwargs['vbrInstanceOwnerId']

        _setter("cen_id", cen_id)
        _setter("health_check_target_ip", health_check_target_ip)
        _setter("vbr_instance_id", vbr_instance_id)
        _setter("vbr_instance_region_id", vbr_instance_region_id)
        if health_check_interval is not None:
            _setter("health_check_interval", health_check_interval)
        if health_check_source_ip is not None:
            _setter("health_check_source_ip", health_check_source_ip)
        if healthy_threshold is not None:
            _setter("healthy_threshold", healthy_threshold)
        if vbr_instance_owner_id is not None:
            _setter("vbr_instance_owner_id", vbr_instance_owner_id)

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
    @pulumi.getter(name="healthCheckTargetIp")
    def health_check_target_ip(self) -> pulumi.Input[str]:
        """
        The destination IP address of health checks.
        """
        return pulumi.get(self, "health_check_target_ip")

    @health_check_target_ip.setter
    def health_check_target_ip(self, value: pulumi.Input[str]):
        pulumi.set(self, "health_check_target_ip", value)

    @property
    @pulumi.getter(name="vbrInstanceId")
    def vbr_instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the VBR.
        """
        return pulumi.get(self, "vbr_instance_id")

    @vbr_instance_id.setter
    def vbr_instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vbr_instance_id", value)

    @property
    @pulumi.getter(name="vbrInstanceRegionId")
    def vbr_instance_region_id(self) -> pulumi.Input[str]:
        """
        The ID of the region to which the VBR belongs.

        ->**NOTE:** The `cen.VbrHealthCheck` resource depends on the related `cen.InstanceAttachment` resource.
        """
        return pulumi.get(self, "vbr_instance_region_id")

    @vbr_instance_region_id.setter
    def vbr_instance_region_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vbr_instance_region_id", value)

    @property
    @pulumi.getter(name="healthCheckInterval")
    def health_check_interval(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the interval at which the health check sends continuous detection packets. Default value: 2. Value range: 2 to 3.
        """
        return pulumi.get(self, "health_check_interval")

    @health_check_interval.setter
    def health_check_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "health_check_interval", value)

    @property
    @pulumi.getter(name="healthCheckSourceIp")
    def health_check_source_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The source IP address of health checks.
        """
        return pulumi.get(self, "health_check_source_ip")

    @health_check_source_ip.setter
    def health_check_source_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_source_ip", value)

    @property
    @pulumi.getter(name="healthyThreshold")
    def healthy_threshold(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the number of probe messages sent by the health check. Default value: 8. Value range: 3 to 8.
        """
        return pulumi.get(self, "healthy_threshold")

    @healthy_threshold.setter
    def healthy_threshold(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "healthy_threshold", value)

    @property
    @pulumi.getter(name="vbrInstanceOwnerId")
    def vbr_instance_owner_id(self) -> Optional[pulumi.Input[int]]:
        """
        The ID of the account to which the VBR belongs.
        """
        return pulumi.get(self, "vbr_instance_owner_id")

    @vbr_instance_owner_id.setter
    def vbr_instance_owner_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vbr_instance_owner_id", value)


@pulumi.input_type
class _VbrHealthCheckState:
    def __init__(__self__, *,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 health_check_interval: Optional[pulumi.Input[int]] = None,
                 health_check_source_ip: Optional[pulumi.Input[str]] = None,
                 health_check_target_ip: Optional[pulumi.Input[str]] = None,
                 healthy_threshold: Optional[pulumi.Input[int]] = None,
                 vbr_instance_id: Optional[pulumi.Input[str]] = None,
                 vbr_instance_owner_id: Optional[pulumi.Input[int]] = None,
                 vbr_instance_region_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VbrHealthCheck resources.
        :param pulumi.Input[str] cen_id: The ID of the CEN instance.
        :param pulumi.Input[int] health_check_interval: Specifies the interval at which the health check sends continuous detection packets. Default value: 2. Value range: 2 to 3.
        :param pulumi.Input[str] health_check_source_ip: The source IP address of health checks.
        :param pulumi.Input[str] health_check_target_ip: The destination IP address of health checks.
        :param pulumi.Input[int] healthy_threshold: Specifies the number of probe messages sent by the health check. Default value: 8. Value range: 3 to 8.
        :param pulumi.Input[str] vbr_instance_id: The ID of the VBR.
        :param pulumi.Input[int] vbr_instance_owner_id: The ID of the account to which the VBR belongs.
        :param pulumi.Input[str] vbr_instance_region_id: The ID of the region to which the VBR belongs.
               
               ->**NOTE:** The `cen.VbrHealthCheck` resource depends on the related `cen.InstanceAttachment` resource.
        """
        _VbrHealthCheckState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cen_id=cen_id,
            health_check_interval=health_check_interval,
            health_check_source_ip=health_check_source_ip,
            health_check_target_ip=health_check_target_ip,
            healthy_threshold=healthy_threshold,
            vbr_instance_id=vbr_instance_id,
            vbr_instance_owner_id=vbr_instance_owner_id,
            vbr_instance_region_id=vbr_instance_region_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cen_id: Optional[pulumi.Input[str]] = None,
             health_check_interval: Optional[pulumi.Input[int]] = None,
             health_check_source_ip: Optional[pulumi.Input[str]] = None,
             health_check_target_ip: Optional[pulumi.Input[str]] = None,
             healthy_threshold: Optional[pulumi.Input[int]] = None,
             vbr_instance_id: Optional[pulumi.Input[str]] = None,
             vbr_instance_owner_id: Optional[pulumi.Input[int]] = None,
             vbr_instance_region_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if cen_id is None and 'cenId' in kwargs:
            cen_id = kwargs['cenId']
        if health_check_interval is None and 'healthCheckInterval' in kwargs:
            health_check_interval = kwargs['healthCheckInterval']
        if health_check_source_ip is None and 'healthCheckSourceIp' in kwargs:
            health_check_source_ip = kwargs['healthCheckSourceIp']
        if health_check_target_ip is None and 'healthCheckTargetIp' in kwargs:
            health_check_target_ip = kwargs['healthCheckTargetIp']
        if healthy_threshold is None and 'healthyThreshold' in kwargs:
            healthy_threshold = kwargs['healthyThreshold']
        if vbr_instance_id is None and 'vbrInstanceId' in kwargs:
            vbr_instance_id = kwargs['vbrInstanceId']
        if vbr_instance_owner_id is None and 'vbrInstanceOwnerId' in kwargs:
            vbr_instance_owner_id = kwargs['vbrInstanceOwnerId']
        if vbr_instance_region_id is None and 'vbrInstanceRegionId' in kwargs:
            vbr_instance_region_id = kwargs['vbrInstanceRegionId']

        if cen_id is not None:
            _setter("cen_id", cen_id)
        if health_check_interval is not None:
            _setter("health_check_interval", health_check_interval)
        if health_check_source_ip is not None:
            _setter("health_check_source_ip", health_check_source_ip)
        if health_check_target_ip is not None:
            _setter("health_check_target_ip", health_check_target_ip)
        if healthy_threshold is not None:
            _setter("healthy_threshold", healthy_threshold)
        if vbr_instance_id is not None:
            _setter("vbr_instance_id", vbr_instance_id)
        if vbr_instance_owner_id is not None:
            _setter("vbr_instance_owner_id", vbr_instance_owner_id)
        if vbr_instance_region_id is not None:
            _setter("vbr_instance_region_id", vbr_instance_region_id)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the CEN instance.
        """
        return pulumi.get(self, "cen_id")

    @cen_id.setter
    def cen_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cen_id", value)

    @property
    @pulumi.getter(name="healthCheckInterval")
    def health_check_interval(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the interval at which the health check sends continuous detection packets. Default value: 2. Value range: 2 to 3.
        """
        return pulumi.get(self, "health_check_interval")

    @health_check_interval.setter
    def health_check_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "health_check_interval", value)

    @property
    @pulumi.getter(name="healthCheckSourceIp")
    def health_check_source_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The source IP address of health checks.
        """
        return pulumi.get(self, "health_check_source_ip")

    @health_check_source_ip.setter
    def health_check_source_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_source_ip", value)

    @property
    @pulumi.getter(name="healthCheckTargetIp")
    def health_check_target_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The destination IP address of health checks.
        """
        return pulumi.get(self, "health_check_target_ip")

    @health_check_target_ip.setter
    def health_check_target_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_target_ip", value)

    @property
    @pulumi.getter(name="healthyThreshold")
    def healthy_threshold(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the number of probe messages sent by the health check. Default value: 8. Value range: 3 to 8.
        """
        return pulumi.get(self, "healthy_threshold")

    @healthy_threshold.setter
    def healthy_threshold(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "healthy_threshold", value)

    @property
    @pulumi.getter(name="vbrInstanceId")
    def vbr_instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VBR.
        """
        return pulumi.get(self, "vbr_instance_id")

    @vbr_instance_id.setter
    def vbr_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vbr_instance_id", value)

    @property
    @pulumi.getter(name="vbrInstanceOwnerId")
    def vbr_instance_owner_id(self) -> Optional[pulumi.Input[int]]:
        """
        The ID of the account to which the VBR belongs.
        """
        return pulumi.get(self, "vbr_instance_owner_id")

    @vbr_instance_owner_id.setter
    def vbr_instance_owner_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vbr_instance_owner_id", value)

    @property
    @pulumi.getter(name="vbrInstanceRegionId")
    def vbr_instance_region_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the region to which the VBR belongs.

        ->**NOTE:** The `cen.VbrHealthCheck` resource depends on the related `cen.InstanceAttachment` resource.
        """
        return pulumi.get(self, "vbr_instance_region_id")

    @vbr_instance_region_id.setter
    def vbr_instance_region_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vbr_instance_region_id", value)


class VbrHealthCheck(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 health_check_interval: Optional[pulumi.Input[int]] = None,
                 health_check_source_ip: Optional[pulumi.Input[str]] = None,
                 health_check_target_ip: Optional[pulumi.Input[str]] = None,
                 healthy_threshold: Optional[pulumi.Input[int]] = None,
                 vbr_instance_id: Optional[pulumi.Input[str]] = None,
                 vbr_instance_owner_id: Optional[pulumi.Input[int]] = None,
                 vbr_instance_region_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This topic describes how to configure the health check feature for a Cloud Enterprise Network (CEN) instance.
        After you attach a Virtual Border Router (VBR) to the CEN instance and configure the health check feature, you can monitor the network conditions of the on-premises data center connected to the VBR.

        For information about CEN VBR HealthCheck and how to use it, see [Manage CEN VBR HealthCheck](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-enablecenvbrhealthcheck).

        > **NOTE:** Available since v1.88.0.

        ## Import

        CEN VBR HealthCheck can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/vbrHealthCheck:VbrHealthCheck example vbr-xxxxx:cn-hangzhou
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cen_id: The ID of the CEN instance.
        :param pulumi.Input[int] health_check_interval: Specifies the interval at which the health check sends continuous detection packets. Default value: 2. Value range: 2 to 3.
        :param pulumi.Input[str] health_check_source_ip: The source IP address of health checks.
        :param pulumi.Input[str] health_check_target_ip: The destination IP address of health checks.
        :param pulumi.Input[int] healthy_threshold: Specifies the number of probe messages sent by the health check. Default value: 8. Value range: 3 to 8.
        :param pulumi.Input[str] vbr_instance_id: The ID of the VBR.
        :param pulumi.Input[int] vbr_instance_owner_id: The ID of the account to which the VBR belongs.
        :param pulumi.Input[str] vbr_instance_region_id: The ID of the region to which the VBR belongs.
               
               ->**NOTE:** The `cen.VbrHealthCheck` resource depends on the related `cen.InstanceAttachment` resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VbrHealthCheckArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This topic describes how to configure the health check feature for a Cloud Enterprise Network (CEN) instance.
        After you attach a Virtual Border Router (VBR) to the CEN instance and configure the health check feature, you can monitor the network conditions of the on-premises data center connected to the VBR.

        For information about CEN VBR HealthCheck and how to use it, see [Manage CEN VBR HealthCheck](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-enablecenvbrhealthcheck).

        > **NOTE:** Available since v1.88.0.

        ## Import

        CEN VBR HealthCheck can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/vbrHealthCheck:VbrHealthCheck example vbr-xxxxx:cn-hangzhou
        ```

        :param str resource_name: The name of the resource.
        :param VbrHealthCheckArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VbrHealthCheckArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            VbrHealthCheckArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cen_id: Optional[pulumi.Input[str]] = None,
                 health_check_interval: Optional[pulumi.Input[int]] = None,
                 health_check_source_ip: Optional[pulumi.Input[str]] = None,
                 health_check_target_ip: Optional[pulumi.Input[str]] = None,
                 healthy_threshold: Optional[pulumi.Input[int]] = None,
                 vbr_instance_id: Optional[pulumi.Input[str]] = None,
                 vbr_instance_owner_id: Optional[pulumi.Input[int]] = None,
                 vbr_instance_region_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VbrHealthCheckArgs.__new__(VbrHealthCheckArgs)

            if cen_id is None and not opts.urn:
                raise TypeError("Missing required property 'cen_id'")
            __props__.__dict__["cen_id"] = cen_id
            __props__.__dict__["health_check_interval"] = health_check_interval
            __props__.__dict__["health_check_source_ip"] = health_check_source_ip
            if health_check_target_ip is None and not opts.urn:
                raise TypeError("Missing required property 'health_check_target_ip'")
            __props__.__dict__["health_check_target_ip"] = health_check_target_ip
            __props__.__dict__["healthy_threshold"] = healthy_threshold
            if vbr_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'vbr_instance_id'")
            __props__.__dict__["vbr_instance_id"] = vbr_instance_id
            __props__.__dict__["vbr_instance_owner_id"] = vbr_instance_owner_id
            if vbr_instance_region_id is None and not opts.urn:
                raise TypeError("Missing required property 'vbr_instance_region_id'")
            __props__.__dict__["vbr_instance_region_id"] = vbr_instance_region_id
        super(VbrHealthCheck, __self__).__init__(
            'alicloud:cen/vbrHealthCheck:VbrHealthCheck',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cen_id: Optional[pulumi.Input[str]] = None,
            health_check_interval: Optional[pulumi.Input[int]] = None,
            health_check_source_ip: Optional[pulumi.Input[str]] = None,
            health_check_target_ip: Optional[pulumi.Input[str]] = None,
            healthy_threshold: Optional[pulumi.Input[int]] = None,
            vbr_instance_id: Optional[pulumi.Input[str]] = None,
            vbr_instance_owner_id: Optional[pulumi.Input[int]] = None,
            vbr_instance_region_id: Optional[pulumi.Input[str]] = None) -> 'VbrHealthCheck':
        """
        Get an existing VbrHealthCheck resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cen_id: The ID of the CEN instance.
        :param pulumi.Input[int] health_check_interval: Specifies the interval at which the health check sends continuous detection packets. Default value: 2. Value range: 2 to 3.
        :param pulumi.Input[str] health_check_source_ip: The source IP address of health checks.
        :param pulumi.Input[str] health_check_target_ip: The destination IP address of health checks.
        :param pulumi.Input[int] healthy_threshold: Specifies the number of probe messages sent by the health check. Default value: 8. Value range: 3 to 8.
        :param pulumi.Input[str] vbr_instance_id: The ID of the VBR.
        :param pulumi.Input[int] vbr_instance_owner_id: The ID of the account to which the VBR belongs.
        :param pulumi.Input[str] vbr_instance_region_id: The ID of the region to which the VBR belongs.
               
               ->**NOTE:** The `cen.VbrHealthCheck` resource depends on the related `cen.InstanceAttachment` resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VbrHealthCheckState.__new__(_VbrHealthCheckState)

        __props__.__dict__["cen_id"] = cen_id
        __props__.__dict__["health_check_interval"] = health_check_interval
        __props__.__dict__["health_check_source_ip"] = health_check_source_ip
        __props__.__dict__["health_check_target_ip"] = health_check_target_ip
        __props__.__dict__["healthy_threshold"] = healthy_threshold
        __props__.__dict__["vbr_instance_id"] = vbr_instance_id
        __props__.__dict__["vbr_instance_owner_id"] = vbr_instance_owner_id
        __props__.__dict__["vbr_instance_region_id"] = vbr_instance_region_id
        return VbrHealthCheck(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> pulumi.Output[str]:
        """
        The ID of the CEN instance.
        """
        return pulumi.get(self, "cen_id")

    @property
    @pulumi.getter(name="healthCheckInterval")
    def health_check_interval(self) -> pulumi.Output[Optional[int]]:
        """
        Specifies the interval at which the health check sends continuous detection packets. Default value: 2. Value range: 2 to 3.
        """
        return pulumi.get(self, "health_check_interval")

    @property
    @pulumi.getter(name="healthCheckSourceIp")
    def health_check_source_ip(self) -> pulumi.Output[Optional[str]]:
        """
        The source IP address of health checks.
        """
        return pulumi.get(self, "health_check_source_ip")

    @property
    @pulumi.getter(name="healthCheckTargetIp")
    def health_check_target_ip(self) -> pulumi.Output[str]:
        """
        The destination IP address of health checks.
        """
        return pulumi.get(self, "health_check_target_ip")

    @property
    @pulumi.getter(name="healthyThreshold")
    def healthy_threshold(self) -> pulumi.Output[Optional[int]]:
        """
        Specifies the number of probe messages sent by the health check. Default value: 8. Value range: 3 to 8.
        """
        return pulumi.get(self, "healthy_threshold")

    @property
    @pulumi.getter(name="vbrInstanceId")
    def vbr_instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the VBR.
        """
        return pulumi.get(self, "vbr_instance_id")

    @property
    @pulumi.getter(name="vbrInstanceOwnerId")
    def vbr_instance_owner_id(self) -> pulumi.Output[Optional[int]]:
        """
        The ID of the account to which the VBR belongs.
        """
        return pulumi.get(self, "vbr_instance_owner_id")

    @property
    @pulumi.getter(name="vbrInstanceRegionId")
    def vbr_instance_region_id(self) -> pulumi.Output[str]:
        """
        The ID of the region to which the VBR belongs.

        ->**NOTE:** The `cen.VbrHealthCheck` resource depends on the related `cen.InstanceAttachment` resource.
        """
        return pulumi.get(self, "vbr_instance_region_id")

