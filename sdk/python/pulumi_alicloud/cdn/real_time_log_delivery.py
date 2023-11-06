# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RealTimeLogDeliveryArgs', 'RealTimeLogDelivery']

@pulumi.input_type
class RealTimeLogDeliveryArgs:
    def __init__(__self__, *,
                 domain: pulumi.Input[str],
                 logstore: pulumi.Input[str],
                 project: pulumi.Input[str],
                 sls_region: pulumi.Input[str]):
        """
        The set of arguments for constructing a RealTimeLogDelivery resource.
        :param pulumi.Input[str] domain: The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
        :param pulumi.Input[str] logstore: The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
        :param pulumi.Input[str] project: The name of the Log Service project that is used for real-time log delivery.
        :param pulumi.Input[str] sls_region: The region where the Log Service project is deployed.
               
               > **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
        """
        RealTimeLogDeliveryArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            domain=domain,
            logstore=logstore,
            project=project,
            sls_region=sls_region,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             domain: Optional[pulumi.Input[str]] = None,
             logstore: Optional[pulumi.Input[str]] = None,
             project: Optional[pulumi.Input[str]] = None,
             sls_region: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if domain is None:
            raise TypeError("Missing 'domain' argument")
        if logstore is None:
            raise TypeError("Missing 'logstore' argument")
        if project is None:
            raise TypeError("Missing 'project' argument")
        if sls_region is None and 'slsRegion' in kwargs:
            sls_region = kwargs['slsRegion']
        if sls_region is None:
            raise TypeError("Missing 'sls_region' argument")

        _setter("domain", domain)
        _setter("logstore", logstore)
        _setter("project", project)
        _setter("sls_region", sls_region)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Input[str]:
        """
        The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def logstore(self) -> pulumi.Input[str]:
        """
        The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
        """
        return pulumi.get(self, "logstore")

    @logstore.setter
    def logstore(self, value: pulumi.Input[str]):
        pulumi.set(self, "logstore", value)

    @property
    @pulumi.getter
    def project(self) -> pulumi.Input[str]:
        """
        The name of the Log Service project that is used for real-time log delivery.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: pulumi.Input[str]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="slsRegion")
    def sls_region(self) -> pulumi.Input[str]:
        """
        The region where the Log Service project is deployed.

        > **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
        """
        return pulumi.get(self, "sls_region")

    @sls_region.setter
    def sls_region(self, value: pulumi.Input[str]):
        pulumi.set(self, "sls_region", value)


@pulumi.input_type
class _RealTimeLogDeliveryState:
    def __init__(__self__, *,
                 domain: Optional[pulumi.Input[str]] = None,
                 logstore: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 sls_region: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RealTimeLogDelivery resources.
        :param pulumi.Input[str] domain: The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
        :param pulumi.Input[str] logstore: The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
        :param pulumi.Input[str] project: The name of the Log Service project that is used for real-time log delivery.
        :param pulumi.Input[str] sls_region: The region where the Log Service project is deployed.
               
               > **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
        :param pulumi.Input[str] status: The status of the real-time log delivery feature. Valid Values: `online` and `offline`.
        """
        _RealTimeLogDeliveryState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            domain=domain,
            logstore=logstore,
            project=project,
            sls_region=sls_region,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             domain: Optional[pulumi.Input[str]] = None,
             logstore: Optional[pulumi.Input[str]] = None,
             project: Optional[pulumi.Input[str]] = None,
             sls_region: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if sls_region is None and 'slsRegion' in kwargs:
            sls_region = kwargs['slsRegion']

        if domain is not None:
            _setter("domain", domain)
        if logstore is not None:
            _setter("logstore", logstore)
        if project is not None:
            _setter("project", project)
        if sls_region is not None:
            _setter("sls_region", sls_region)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def logstore(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
        """
        return pulumi.get(self, "logstore")

    @logstore.setter
    def logstore(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "logstore", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Log Service project that is used for real-time log delivery.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="slsRegion")
    def sls_region(self) -> Optional[pulumi.Input[str]]:
        """
        The region where the Log Service project is deployed.

        > **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
        """
        return pulumi.get(self, "sls_region")

    @sls_region.setter
    def sls_region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sls_region", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the real-time log delivery feature. Valid Values: `online` and `offline`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class RealTimeLogDelivery(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 logstore: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 sls_region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CDN Real Time Log Delivery resource.

        For information about CDN Real Time Log Delivery and how to use it, see [What is Real Time Log Delivery](https://www.alibabacloud.com/help/en/cdn/developer-reference/api-cdn-2018-05-10-createrealtimelogdelivery).

        > **NOTE:** Available since v1.134.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        default_domain_new = alicloud.cdn.DomainNew("defaultDomainNew",
            scope="overseas",
            domain_name="mycdndomain.alicloud-provider.cn",
            cdn_type="web",
            sources=[alicloud.cdn.DomainNewSourceArgs(
                type="ipaddr",
                content="1.1.3.1",
                priority=20,
                port=80,
                weight=15,
            )])
        default_random_integer = random.RandomInteger("defaultRandomInteger",
            max=99999,
            min=10000)
        default_project = alicloud.log.Project("defaultProject", description="terraform-example")
        default_store = alicloud.log.Store("defaultStore",
            project=default_project.name,
            shard_count=3,
            auto_split=True,
            max_split_shard_count=60,
            append_meta=True)
        default_regions = alicloud.get_regions(current=True)
        default_real_time_log_delivery = alicloud.cdn.RealTimeLogDelivery("defaultRealTimeLogDelivery",
            domain=default_domain_new.domain_name,
            logstore=default_project.name,
            project=default_store.name,
            sls_region=default_regions.regions[0].id)
        ```

        ## Import

        CDN Real Time Log Delivery can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cdn/realTimeLogDelivery:RealTimeLogDelivery example <domain>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
        :param pulumi.Input[str] logstore: The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
        :param pulumi.Input[str] project: The name of the Log Service project that is used for real-time log delivery.
        :param pulumi.Input[str] sls_region: The region where the Log Service project is deployed.
               
               > **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RealTimeLogDeliveryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CDN Real Time Log Delivery resource.

        For information about CDN Real Time Log Delivery and how to use it, see [What is Real Time Log Delivery](https://www.alibabacloud.com/help/en/cdn/developer-reference/api-cdn-2018-05-10-createrealtimelogdelivery).

        > **NOTE:** Available since v1.134.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        default_domain_new = alicloud.cdn.DomainNew("defaultDomainNew",
            scope="overseas",
            domain_name="mycdndomain.alicloud-provider.cn",
            cdn_type="web",
            sources=[alicloud.cdn.DomainNewSourceArgs(
                type="ipaddr",
                content="1.1.3.1",
                priority=20,
                port=80,
                weight=15,
            )])
        default_random_integer = random.RandomInteger("defaultRandomInteger",
            max=99999,
            min=10000)
        default_project = alicloud.log.Project("defaultProject", description="terraform-example")
        default_store = alicloud.log.Store("defaultStore",
            project=default_project.name,
            shard_count=3,
            auto_split=True,
            max_split_shard_count=60,
            append_meta=True)
        default_regions = alicloud.get_regions(current=True)
        default_real_time_log_delivery = alicloud.cdn.RealTimeLogDelivery("defaultRealTimeLogDelivery",
            domain=default_domain_new.domain_name,
            logstore=default_project.name,
            project=default_store.name,
            sls_region=default_regions.regions[0].id)
        ```

        ## Import

        CDN Real Time Log Delivery can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cdn/realTimeLogDelivery:RealTimeLogDelivery example <domain>
        ```

        :param str resource_name: The name of the resource.
        :param RealTimeLogDeliveryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RealTimeLogDeliveryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            RealTimeLogDeliveryArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 logstore: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 sls_region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RealTimeLogDeliveryArgs.__new__(RealTimeLogDeliveryArgs)

            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__.__dict__["domain"] = domain
            if logstore is None and not opts.urn:
                raise TypeError("Missing required property 'logstore'")
            __props__.__dict__["logstore"] = logstore
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            if sls_region is None and not opts.urn:
                raise TypeError("Missing required property 'sls_region'")
            __props__.__dict__["sls_region"] = sls_region
            __props__.__dict__["status"] = None
        super(RealTimeLogDelivery, __self__).__init__(
            'alicloud:cdn/realTimeLogDelivery:RealTimeLogDelivery',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain: Optional[pulumi.Input[str]] = None,
            logstore: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None,
            sls_region: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'RealTimeLogDelivery':
        """
        Get an existing RealTimeLogDelivery resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
        :param pulumi.Input[str] logstore: The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
        :param pulumi.Input[str] project: The name of the Log Service project that is used for real-time log delivery.
        :param pulumi.Input[str] sls_region: The region where the Log Service project is deployed.
               
               > **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
        :param pulumi.Input[str] status: The status of the real-time log delivery feature. Valid Values: `online` and `offline`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RealTimeLogDeliveryState.__new__(_RealTimeLogDeliveryState)

        __props__.__dict__["domain"] = domain
        __props__.__dict__["logstore"] = logstore
        __props__.__dict__["project"] = project
        __props__.__dict__["sls_region"] = sls_region
        __props__.__dict__["status"] = status
        return RealTimeLogDelivery(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def logstore(self) -> pulumi.Output[str]:
        """
        The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
        """
        return pulumi.get(self, "logstore")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        The name of the Log Service project that is used for real-time log delivery.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="slsRegion")
    def sls_region(self) -> pulumi.Output[str]:
        """
        The region where the Log Service project is deployed.

        > **NOTE:** If your Project and Logstore services already exist, if you continue to create existing content, the created content will overwrite your existing indexes and custom reports. Please be careful to create your existing services to avoid affecting your online services after coverage.
        """
        return pulumi.get(self, "sls_region")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the real-time log delivery feature. Valid Values: `online` and `offline`.
        """
        return pulumi.get(self, "status")

