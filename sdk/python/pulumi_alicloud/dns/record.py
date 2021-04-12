# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = ['RecordArgs', 'Record']

@pulumi.input_type
class RecordArgs:
    def __init__(__self__, *,
                 host_record: pulumi.Input[str],
                 type: pulumi.Input[str],
                 value: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 routing: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a Record resource.
        :param pulumi.Input[str] host_record: Host record for the domain record. This host_record can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
        :param pulumi.Input[str] type: The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
        :param pulumi.Input[str] value: The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it's no need to add a `.` at the end.
        :param pulumi.Input[str] name: Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        :param pulumi.Input[int] priority: The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
        :param pulumi.Input[str] routing: The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using dns.getResolutionLines in data source to get the value.
        :param pulumi.Input[int] ttl: The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
        """
        pulumi.set(__self__, "host_record", host_record)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "value", value)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if routing is not None:
            pulumi.set(__self__, "routing", routing)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)

    @property
    @pulumi.getter(name="hostRecord")
    def host_record(self) -> pulumi.Input[str]:
        """
        Host record for the domain record. This host_record can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
        """
        return pulumi.get(self, "host_record")

    @host_record.setter
    def host_record(self, value: pulumi.Input[str]):
        pulumi.set(self, "host_record", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it's no need to add a `.` at the end.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def routing(self) -> Optional[pulumi.Input[str]]:
        """
        The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using dns.getResolutionLines in data source to get the value.
        """
        return pulumi.get(self, "routing")

    @routing.setter
    def routing(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "routing", value)

    @property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[int]]:
        """
        The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ttl", value)


class Record(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 host_record: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 routing: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        RDS record can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dns/record:Record example abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] host_record: Host record for the domain record. This host_record can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
        :param pulumi.Input[str] name: Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        :param pulumi.Input[int] priority: The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
        :param pulumi.Input[str] routing: The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using dns.getResolutionLines in data source to get the value.
        :param pulumi.Input[int] ttl: The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
        :param pulumi.Input[str] type: The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
        :param pulumi.Input[str] value: The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it's no need to add a `.` at the end.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RecordArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        RDS record can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dns/record:Record example abc123456
        ```

        :param str resource_name: The name of the resource.
        :param RecordArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RecordArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 host_record: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 routing: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

            if host_record is None and not opts.urn:
                raise TypeError("Missing required property 'host_record'")
            __props__['host_record'] = host_record
            __props__['name'] = name
            __props__['priority'] = priority
            __props__['routing'] = routing
            __props__['ttl'] = ttl
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__['value'] = value
            __props__['locked'] = None
            __props__['status'] = None
        super(Record, __self__).__init__(
            'alicloud:dns/record:Record',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            host_record: Optional[pulumi.Input[str]] = None,
            locked: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            routing: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            ttl: Optional[pulumi.Input[int]] = None,
            type: Optional[pulumi.Input[str]] = None,
            value: Optional[pulumi.Input[str]] = None) -> 'Record':
        """
        Get an existing Record resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] host_record: Host record for the domain record. This host_record can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
        :param pulumi.Input[str] name: Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        :param pulumi.Input[int] priority: The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
        :param pulumi.Input[str] routing: The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using dns.getResolutionLines in data source to get the value.
        :param pulumi.Input[str] status: The record status. `Enable` or `Disable`.
        :param pulumi.Input[int] ttl: The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
        :param pulumi.Input[str] type: The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
        :param pulumi.Input[str] value: The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it's no need to add a `.` at the end.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["host_record"] = host_record
        __props__["locked"] = locked
        __props__["name"] = name
        __props__["priority"] = priority
        __props__["routing"] = routing
        __props__["status"] = status
        __props__["ttl"] = ttl
        __props__["type"] = type
        __props__["value"] = value
        return Record(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="hostRecord")
    def host_record(self) -> pulumi.Output[str]:
        """
        Host record for the domain record. This host_record can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
        """
        return pulumi.get(self, "host_record")

    @property
    @pulumi.getter
    def locked(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "locked")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[Optional[int]]:
        """
        The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def routing(self) -> pulumi.Output[Optional[str]]:
        """
        The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using dns.getResolutionLines in data source to get the value.
        """
        return pulumi.get(self, "routing")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The record status. `Enable` or `Disable`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def ttl(self) -> pulumi.Output[Optional[int]]:
        """
        The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
        """
        return pulumi.get(self, "ttl")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it's no need to add a `.` at the end.
        """
        return pulumi.get(self, "value")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

