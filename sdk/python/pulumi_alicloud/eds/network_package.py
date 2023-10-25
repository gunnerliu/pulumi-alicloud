# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['NetworkPackageArgs', 'NetworkPackage']

@pulumi.input_type
class NetworkPackageArgs:
    def __init__(__self__, *,
                 bandwidth: pulumi.Input[int],
                 office_site_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a NetworkPackage resource.
        :param pulumi.Input[int] bandwidth: The bandwidth of package public network bandwidth peak. Valid values: 1~200. Unit:Mbps.
        :param pulumi.Input[str] office_site_id: The ID of office site.
        """
        NetworkPackageArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            bandwidth=bandwidth,
            office_site_id=office_site_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             bandwidth: Optional[pulumi.Input[int]] = None,
             office_site_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if bandwidth is None:
            raise TypeError("Missing 'bandwidth' argument")
        if office_site_id is None and 'officeSiteId' in kwargs:
            office_site_id = kwargs['officeSiteId']
        if office_site_id is None:
            raise TypeError("Missing 'office_site_id' argument")

        _setter("bandwidth", bandwidth)
        _setter("office_site_id", office_site_id)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Input[int]:
        """
        The bandwidth of package public network bandwidth peak. Valid values: 1~200. Unit:Mbps.
        """
        return pulumi.get(self, "bandwidth")

    @bandwidth.setter
    def bandwidth(self, value: pulumi.Input[int]):
        pulumi.set(self, "bandwidth", value)

    @property
    @pulumi.getter(name="officeSiteId")
    def office_site_id(self) -> pulumi.Input[str]:
        """
        The ID of office site.
        """
        return pulumi.get(self, "office_site_id")

    @office_site_id.setter
    def office_site_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "office_site_id", value)


@pulumi.input_type
class _NetworkPackageState:
    def __init__(__self__, *,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 internet_charge_type: Optional[pulumi.Input[str]] = None,
                 office_site_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NetworkPackage resources.
        :param pulumi.Input[int] bandwidth: The bandwidth of package public network bandwidth peak. Valid values: 1~200. Unit:Mbps.
        :param pulumi.Input[str] internet_charge_type: The internet charge type  of  package.
        :param pulumi.Input[str] office_site_id: The ID of office site.
        :param pulumi.Input[str] status: The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
        """
        _NetworkPackageState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            bandwidth=bandwidth,
            internet_charge_type=internet_charge_type,
            office_site_id=office_site_id,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             bandwidth: Optional[pulumi.Input[int]] = None,
             internet_charge_type: Optional[pulumi.Input[str]] = None,
             office_site_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if internet_charge_type is None and 'internetChargeType' in kwargs:
            internet_charge_type = kwargs['internetChargeType']
        if office_site_id is None and 'officeSiteId' in kwargs:
            office_site_id = kwargs['officeSiteId']

        if bandwidth is not None:
            _setter("bandwidth", bandwidth)
        if internet_charge_type is not None:
            _setter("internet_charge_type", internet_charge_type)
        if office_site_id is not None:
            _setter("office_site_id", office_site_id)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter
    def bandwidth(self) -> Optional[pulumi.Input[int]]:
        """
        The bandwidth of package public network bandwidth peak. Valid values: 1~200. Unit:Mbps.
        """
        return pulumi.get(self, "bandwidth")

    @bandwidth.setter
    def bandwidth(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "bandwidth", value)

    @property
    @pulumi.getter(name="internetChargeType")
    def internet_charge_type(self) -> Optional[pulumi.Input[str]]:
        """
        The internet charge type  of  package.
        """
        return pulumi.get(self, "internet_charge_type")

    @internet_charge_type.setter
    def internet_charge_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "internet_charge_type", value)

    @property
    @pulumi.getter(name="officeSiteId")
    def office_site_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of office site.
        """
        return pulumi.get(self, "office_site_id")

    @office_site_id.setter
    def office_site_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "office_site_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class NetworkPackage(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 office_site_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a ECD Network Package resource.

        For information about ECD Network Package and how to use it, see [What is Network Package](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-createnetworkpackage).

        > **NOTE:** Available since v1.142.0.

        ## Import

        ECD Network Package can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:eds/networkPackage:NetworkPackage example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] bandwidth: The bandwidth of package public network bandwidth peak. Valid values: 1~200. Unit:Mbps.
        :param pulumi.Input[str] office_site_id: The ID of office site.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkPackageArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ECD Network Package resource.

        For information about ECD Network Package and how to use it, see [What is Network Package](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-createnetworkpackage).

        > **NOTE:** Available since v1.142.0.

        ## Import

        ECD Network Package can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:eds/networkPackage:NetworkPackage example <id>
        ```

        :param str resource_name: The name of the resource.
        :param NetworkPackageArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkPackageArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            NetworkPackageArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 office_site_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkPackageArgs.__new__(NetworkPackageArgs)

            if bandwidth is None and not opts.urn:
                raise TypeError("Missing required property 'bandwidth'")
            __props__.__dict__["bandwidth"] = bandwidth
            if office_site_id is None and not opts.urn:
                raise TypeError("Missing required property 'office_site_id'")
            __props__.__dict__["office_site_id"] = office_site_id
            __props__.__dict__["internet_charge_type"] = None
            __props__.__dict__["status"] = None
        super(NetworkPackage, __self__).__init__(
            'alicloud:eds/networkPackage:NetworkPackage',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bandwidth: Optional[pulumi.Input[int]] = None,
            internet_charge_type: Optional[pulumi.Input[str]] = None,
            office_site_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'NetworkPackage':
        """
        Get an existing NetworkPackage resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] bandwidth: The bandwidth of package public network bandwidth peak. Valid values: 1~200. Unit:Mbps.
        :param pulumi.Input[str] internet_charge_type: The internet charge type  of  package.
        :param pulumi.Input[str] office_site_id: The ID of office site.
        :param pulumi.Input[str] status: The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkPackageState.__new__(_NetworkPackageState)

        __props__.__dict__["bandwidth"] = bandwidth
        __props__.__dict__["internet_charge_type"] = internet_charge_type
        __props__.__dict__["office_site_id"] = office_site_id
        __props__.__dict__["status"] = status
        return NetworkPackage(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Output[int]:
        """
        The bandwidth of package public network bandwidth peak. Valid values: 1~200. Unit:Mbps.
        """
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter(name="internetChargeType")
    def internet_charge_type(self) -> pulumi.Output[str]:
        """
        The internet charge type  of  package.
        """
        return pulumi.get(self, "internet_charge_type")

    @property
    @pulumi.getter(name="officeSiteId")
    def office_site_id(self) -> pulumi.Output[str]:
        """
        The ID of office site.
        """
        return pulumi.get(self, "office_site_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
        """
        return pulumi.get(self, "status")

