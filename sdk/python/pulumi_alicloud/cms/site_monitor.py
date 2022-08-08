# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['SiteMonitorArgs', 'SiteMonitor']

@pulumi.input_type
class SiteMonitorArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[str],
                 task_name: pulumi.Input[str],
                 task_type: pulumi.Input[str],
                 alert_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 interval: Optional[pulumi.Input[int]] = None,
                 isp_cities: Optional[pulumi.Input[Sequence[pulumi.Input['SiteMonitorIspCityArgs']]]] = None,
                 options_json: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SiteMonitor resource.
        :param pulumi.Input[str] address: The URL or IP address monitored by the site monitoring task.
        :param pulumi.Input[str] task_name: The name of the site monitoring task. The name must be 4 to 100 characters in length. The name can contain the following types of characters: letters, digits, and underscores.
        :param pulumi.Input[str] task_type: The protocol of the site monitoring task. Currently, site monitoring supports the following protocols: HTTP, Ping, TCP, UDP, DNS, SMTP, POP3, and FTP.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] alert_ids: The IDs of existing alert rules to be associated with the site monitoring task.
        :param pulumi.Input[int] interval: The monitoring interval of the site monitoring task. Unit: minutes. Valid values: 1, 5, and 15. Default value: 1.
        :param pulumi.Input[Sequence[pulumi.Input['SiteMonitorIspCityArgs']]] isp_cities: The detection points in a JSON array. For example, `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]` indicates the detection points in Beijing, Hangzhou, and Qingdao respectively. You can call the [DescribeSiteMonitorISPCityList](https://www.alibabacloud.com/help/en/doc-detail/115045.htm) operation to query detection point information. If this parameter is not specified, three detection points will be chosen randomly for monitoring.
        :param pulumi.Input[str] options_json: The extended options of the protocol of the site monitoring task. The options vary according to the protocol.
        """
        pulumi.set(__self__, "address", address)
        pulumi.set(__self__, "task_name", task_name)
        pulumi.set(__self__, "task_type", task_type)
        if alert_ids is not None:
            pulumi.set(__self__, "alert_ids", alert_ids)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)
        if isp_cities is not None:
            pulumi.set(__self__, "isp_cities", isp_cities)
        if options_json is not None:
            pulumi.set(__self__, "options_json", options_json)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Input[str]:
        """
        The URL or IP address monitored by the site monitoring task.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[str]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter(name="taskName")
    def task_name(self) -> pulumi.Input[str]:
        """
        The name of the site monitoring task. The name must be 4 to 100 characters in length. The name can contain the following types of characters: letters, digits, and underscores.
        """
        return pulumi.get(self, "task_name")

    @task_name.setter
    def task_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "task_name", value)

    @property
    @pulumi.getter(name="taskType")
    def task_type(self) -> pulumi.Input[str]:
        """
        The protocol of the site monitoring task. Currently, site monitoring supports the following protocols: HTTP, Ping, TCP, UDP, DNS, SMTP, POP3, and FTP.
        """
        return pulumi.get(self, "task_type")

    @task_type.setter
    def task_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "task_type", value)

    @property
    @pulumi.getter(name="alertIds")
    def alert_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The IDs of existing alert rules to be associated with the site monitoring task.
        """
        return pulumi.get(self, "alert_ids")

    @alert_ids.setter
    def alert_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "alert_ids", value)

    @property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[int]]:
        """
        The monitoring interval of the site monitoring task. Unit: minutes. Valid values: 1, 5, and 15. Default value: 1.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter(name="ispCities")
    def isp_cities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SiteMonitorIspCityArgs']]]]:
        """
        The detection points in a JSON array. For example, `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]` indicates the detection points in Beijing, Hangzhou, and Qingdao respectively. You can call the [DescribeSiteMonitorISPCityList](https://www.alibabacloud.com/help/en/doc-detail/115045.htm) operation to query detection point information. If this parameter is not specified, three detection points will be chosen randomly for monitoring.
        """
        return pulumi.get(self, "isp_cities")

    @isp_cities.setter
    def isp_cities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SiteMonitorIspCityArgs']]]]):
        pulumi.set(self, "isp_cities", value)

    @property
    @pulumi.getter(name="optionsJson")
    def options_json(self) -> Optional[pulumi.Input[str]]:
        """
        The extended options of the protocol of the site monitoring task. The options vary according to the protocol.
        """
        return pulumi.get(self, "options_json")

    @options_json.setter
    def options_json(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "options_json", value)


@pulumi.input_type
class _SiteMonitorState:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input[str]] = None,
                 alert_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 interval: Optional[pulumi.Input[int]] = None,
                 isp_cities: Optional[pulumi.Input[Sequence[pulumi.Input['SiteMonitorIspCityArgs']]]] = None,
                 options_json: Optional[pulumi.Input[str]] = None,
                 task_name: Optional[pulumi.Input[str]] = None,
                 task_state: Optional[pulumi.Input[str]] = None,
                 task_type: Optional[pulumi.Input[str]] = None,
                 update_time: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SiteMonitor resources.
        :param pulumi.Input[str] address: The URL or IP address monitored by the site monitoring task.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] alert_ids: The IDs of existing alert rules to be associated with the site monitoring task.
        :param pulumi.Input[int] interval: The monitoring interval of the site monitoring task. Unit: minutes. Valid values: 1, 5, and 15. Default value: 1.
        :param pulumi.Input[Sequence[pulumi.Input['SiteMonitorIspCityArgs']]] isp_cities: The detection points in a JSON array. For example, `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]` indicates the detection points in Beijing, Hangzhou, and Qingdao respectively. You can call the [DescribeSiteMonitorISPCityList](https://www.alibabacloud.com/help/en/doc-detail/115045.htm) operation to query detection point information. If this parameter is not specified, three detection points will be chosen randomly for monitoring.
        :param pulumi.Input[str] options_json: The extended options of the protocol of the site monitoring task. The options vary according to the protocol.
        :param pulumi.Input[str] task_name: The name of the site monitoring task. The name must be 4 to 100 characters in length. The name can contain the following types of characters: letters, digits, and underscores.
        :param pulumi.Input[str] task_type: The protocol of the site monitoring task. Currently, site monitoring supports the following protocols: HTTP, Ping, TCP, UDP, DNS, SMTP, POP3, and FTP.
        """
        if address is not None:
            pulumi.set(__self__, "address", address)
        if alert_ids is not None:
            pulumi.set(__self__, "alert_ids", alert_ids)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)
        if isp_cities is not None:
            pulumi.set(__self__, "isp_cities", isp_cities)
        if options_json is not None:
            pulumi.set(__self__, "options_json", options_json)
        if task_name is not None:
            pulumi.set(__self__, "task_name", task_name)
        if task_state is not None:
            pulumi.set(__self__, "task_state", task_state)
        if task_type is not None:
            pulumi.set(__self__, "task_type", task_type)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[str]]:
        """
        The URL or IP address monitored by the site monitoring task.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter(name="alertIds")
    def alert_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The IDs of existing alert rules to be associated with the site monitoring task.
        """
        return pulumi.get(self, "alert_ids")

    @alert_ids.setter
    def alert_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "alert_ids", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[int]]:
        """
        The monitoring interval of the site monitoring task. Unit: minutes. Valid values: 1, 5, and 15. Default value: 1.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter(name="ispCities")
    def isp_cities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SiteMonitorIspCityArgs']]]]:
        """
        The detection points in a JSON array. For example, `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]` indicates the detection points in Beijing, Hangzhou, and Qingdao respectively. You can call the [DescribeSiteMonitorISPCityList](https://www.alibabacloud.com/help/en/doc-detail/115045.htm) operation to query detection point information. If this parameter is not specified, three detection points will be chosen randomly for monitoring.
        """
        return pulumi.get(self, "isp_cities")

    @isp_cities.setter
    def isp_cities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SiteMonitorIspCityArgs']]]]):
        pulumi.set(self, "isp_cities", value)

    @property
    @pulumi.getter(name="optionsJson")
    def options_json(self) -> Optional[pulumi.Input[str]]:
        """
        The extended options of the protocol of the site monitoring task. The options vary according to the protocol.
        """
        return pulumi.get(self, "options_json")

    @options_json.setter
    def options_json(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "options_json", value)

    @property
    @pulumi.getter(name="taskName")
    def task_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the site monitoring task. The name must be 4 to 100 characters in length. The name can contain the following types of characters: letters, digits, and underscores.
        """
        return pulumi.get(self, "task_name")

    @task_name.setter
    def task_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "task_name", value)

    @property
    @pulumi.getter(name="taskState")
    def task_state(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "task_state")

    @task_state.setter
    def task_state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "task_state", value)

    @property
    @pulumi.getter(name="taskType")
    def task_type(self) -> Optional[pulumi.Input[str]]:
        """
        The protocol of the site monitoring task. Currently, site monitoring supports the following protocols: HTTP, Ping, TCP, UDP, DNS, SMTP, POP3, and FTP.
        """
        return pulumi.get(self, "task_type")

    @task_type.setter
    def task_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "task_type", value)

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "update_time", value)


class SiteMonitor(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[str]] = None,
                 alert_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 interval: Optional[pulumi.Input[int]] = None,
                 isp_cities: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SiteMonitorIspCityArgs']]]]] = None,
                 options_json: Optional[pulumi.Input[str]] = None,
                 task_name: Optional[pulumi.Input[str]] = None,
                 task_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource provides a site monitor resource and it can be used to monitor public endpoints and websites.
        Details at https://www.alibabacloud.com/help/doc-detail/67907.htm

        Available in 1.72.0+

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        basic = alicloud.cms.SiteMonitor("basic",
            address="http://www.alibabacloud.com",
            interval=5,
            isp_cities=[alicloud.cms.SiteMonitorIspCityArgs(
                city="546",
                isp="465",
            )],
            task_name="tf-testAccCmsSiteMonitor_basic",
            task_type="HTTP")
        ```

        ## Import

        Alarm rule can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cms/siteMonitor:SiteMonitor alarm abc12345
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The URL or IP address monitored by the site monitoring task.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] alert_ids: The IDs of existing alert rules to be associated with the site monitoring task.
        :param pulumi.Input[int] interval: The monitoring interval of the site monitoring task. Unit: minutes. Valid values: 1, 5, and 15. Default value: 1.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SiteMonitorIspCityArgs']]]] isp_cities: The detection points in a JSON array. For example, `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]` indicates the detection points in Beijing, Hangzhou, and Qingdao respectively. You can call the [DescribeSiteMonitorISPCityList](https://www.alibabacloud.com/help/en/doc-detail/115045.htm) operation to query detection point information. If this parameter is not specified, three detection points will be chosen randomly for monitoring.
        :param pulumi.Input[str] options_json: The extended options of the protocol of the site monitoring task. The options vary according to the protocol.
        :param pulumi.Input[str] task_name: The name of the site monitoring task. The name must be 4 to 100 characters in length. The name can contain the following types of characters: letters, digits, and underscores.
        :param pulumi.Input[str] task_type: The protocol of the site monitoring task. Currently, site monitoring supports the following protocols: HTTP, Ping, TCP, UDP, DNS, SMTP, POP3, and FTP.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SiteMonitorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource provides a site monitor resource and it can be used to monitor public endpoints and websites.
        Details at https://www.alibabacloud.com/help/doc-detail/67907.htm

        Available in 1.72.0+

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        basic = alicloud.cms.SiteMonitor("basic",
            address="http://www.alibabacloud.com",
            interval=5,
            isp_cities=[alicloud.cms.SiteMonitorIspCityArgs(
                city="546",
                isp="465",
            )],
            task_name="tf-testAccCmsSiteMonitor_basic",
            task_type="HTTP")
        ```

        ## Import

        Alarm rule can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cms/siteMonitor:SiteMonitor alarm abc12345
        ```

        :param str resource_name: The name of the resource.
        :param SiteMonitorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SiteMonitorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[str]] = None,
                 alert_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 interval: Optional[pulumi.Input[int]] = None,
                 isp_cities: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SiteMonitorIspCityArgs']]]]] = None,
                 options_json: Optional[pulumi.Input[str]] = None,
                 task_name: Optional[pulumi.Input[str]] = None,
                 task_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SiteMonitorArgs.__new__(SiteMonitorArgs)

            if address is None and not opts.urn:
                raise TypeError("Missing required property 'address'")
            __props__.__dict__["address"] = address
            __props__.__dict__["alert_ids"] = alert_ids
            __props__.__dict__["interval"] = interval
            __props__.__dict__["isp_cities"] = isp_cities
            __props__.__dict__["options_json"] = options_json
            if task_name is None and not opts.urn:
                raise TypeError("Missing required property 'task_name'")
            __props__.__dict__["task_name"] = task_name
            if task_type is None and not opts.urn:
                raise TypeError("Missing required property 'task_type'")
            __props__.__dict__["task_type"] = task_type
            __props__.__dict__["create_time"] = None
            __props__.__dict__["task_state"] = None
            __props__.__dict__["update_time"] = None
        super(SiteMonitor, __self__).__init__(
            'alicloud:cms/siteMonitor:SiteMonitor',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address: Optional[pulumi.Input[str]] = None,
            alert_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            interval: Optional[pulumi.Input[int]] = None,
            isp_cities: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SiteMonitorIspCityArgs']]]]] = None,
            options_json: Optional[pulumi.Input[str]] = None,
            task_name: Optional[pulumi.Input[str]] = None,
            task_state: Optional[pulumi.Input[str]] = None,
            task_type: Optional[pulumi.Input[str]] = None,
            update_time: Optional[pulumi.Input[str]] = None) -> 'SiteMonitor':
        """
        Get an existing SiteMonitor resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The URL or IP address monitored by the site monitoring task.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] alert_ids: The IDs of existing alert rules to be associated with the site monitoring task.
        :param pulumi.Input[int] interval: The monitoring interval of the site monitoring task. Unit: minutes. Valid values: 1, 5, and 15. Default value: 1.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SiteMonitorIspCityArgs']]]] isp_cities: The detection points in a JSON array. For example, `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]` indicates the detection points in Beijing, Hangzhou, and Qingdao respectively. You can call the [DescribeSiteMonitorISPCityList](https://www.alibabacloud.com/help/en/doc-detail/115045.htm) operation to query detection point information. If this parameter is not specified, three detection points will be chosen randomly for monitoring.
        :param pulumi.Input[str] options_json: The extended options of the protocol of the site monitoring task. The options vary according to the protocol.
        :param pulumi.Input[str] task_name: The name of the site monitoring task. The name must be 4 to 100 characters in length. The name can contain the following types of characters: letters, digits, and underscores.
        :param pulumi.Input[str] task_type: The protocol of the site monitoring task. Currently, site monitoring supports the following protocols: HTTP, Ping, TCP, UDP, DNS, SMTP, POP3, and FTP.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SiteMonitorState.__new__(_SiteMonitorState)

        __props__.__dict__["address"] = address
        __props__.__dict__["alert_ids"] = alert_ids
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["interval"] = interval
        __props__.__dict__["isp_cities"] = isp_cities
        __props__.__dict__["options_json"] = options_json
        __props__.__dict__["task_name"] = task_name
        __props__.__dict__["task_state"] = task_state
        __props__.__dict__["task_type"] = task_type
        __props__.__dict__["update_time"] = update_time
        return SiteMonitor(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Output[str]:
        """
        The URL or IP address monitored by the site monitoring task.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter(name="alertIds")
    def alert_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The IDs of existing alert rules to be associated with the site monitoring task.
        """
        return pulumi.get(self, "alert_ids")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Output[Optional[int]]:
        """
        The monitoring interval of the site monitoring task. Unit: minutes. Valid values: 1, 5, and 15. Default value: 1.
        """
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter(name="ispCities")
    def isp_cities(self) -> pulumi.Output[Optional[Sequence['outputs.SiteMonitorIspCity']]]:
        """
        The detection points in a JSON array. For example, `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]` indicates the detection points in Beijing, Hangzhou, and Qingdao respectively. You can call the [DescribeSiteMonitorISPCityList](https://www.alibabacloud.com/help/en/doc-detail/115045.htm) operation to query detection point information. If this parameter is not specified, three detection points will be chosen randomly for monitoring.
        """
        return pulumi.get(self, "isp_cities")

    @property
    @pulumi.getter(name="optionsJson")
    def options_json(self) -> pulumi.Output[Optional[str]]:
        """
        The extended options of the protocol of the site monitoring task. The options vary according to the protocol.
        """
        return pulumi.get(self, "options_json")

    @property
    @pulumi.getter(name="taskName")
    def task_name(self) -> pulumi.Output[str]:
        """
        The name of the site monitoring task. The name must be 4 to 100 characters in length. The name can contain the following types of characters: letters, digits, and underscores.
        """
        return pulumi.get(self, "task_name")

    @property
    @pulumi.getter(name="taskState")
    def task_state(self) -> pulumi.Output[str]:
        return pulumi.get(self, "task_state")

    @property
    @pulumi.getter(name="taskType")
    def task_type(self) -> pulumi.Output[str]:
        """
        The protocol of the site monitoring task. Currently, site monitoring supports the following protocols: HTTP, Ping, TCP, UDP, DNS, SMTP, POP3, and FTP.
        """
        return pulumi.get(self, "task_type")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[str]:
        return pulumi.get(self, "update_time")

