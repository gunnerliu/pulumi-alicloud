# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['OssScanConfigArgs', 'OssScanConfig']

@pulumi.input_type
class OssScanConfigArgs:
    def __init__(__self__, *,
                 bucket_name_lists: pulumi.Input[Sequence[pulumi.Input[str]]],
                 enable: pulumi.Input[int],
                 end_time: pulumi.Input[str],
                 key_suffix_lists: pulumi.Input[Sequence[pulumi.Input[str]]],
                 scan_day_lists: pulumi.Input[Sequence[pulumi.Input[int]]],
                 start_time: pulumi.Input[str],
                 all_key_prefix: Optional[pulumi.Input[bool]] = None,
                 key_prefix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 oss_scan_config_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a OssScanConfig resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] bucket_name_lists: Bucket List.
        :param pulumi.Input[int] enable: Enable configuration.
        :param pulumi.Input[str] end_time: End time, hours, minutes and seconds.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] key_suffix_lists: File Suffix List.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] scan_day_lists: Scan cycle.
        :param pulumi.Input[str] start_time: Start time, hours, minutes and seconds.
        :param pulumi.Input[bool] all_key_prefix: Match all prefixes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] key_prefix_lists: File prefix list.
        :param pulumi.Input[str] oss_scan_config_name: Configuration Name.
        """
        pulumi.set(__self__, "bucket_name_lists", bucket_name_lists)
        pulumi.set(__self__, "enable", enable)
        pulumi.set(__self__, "end_time", end_time)
        pulumi.set(__self__, "key_suffix_lists", key_suffix_lists)
        pulumi.set(__self__, "scan_day_lists", scan_day_lists)
        pulumi.set(__self__, "start_time", start_time)
        if all_key_prefix is not None:
            pulumi.set(__self__, "all_key_prefix", all_key_prefix)
        if key_prefix_lists is not None:
            pulumi.set(__self__, "key_prefix_lists", key_prefix_lists)
        if oss_scan_config_name is not None:
            pulumi.set(__self__, "oss_scan_config_name", oss_scan_config_name)

    @property
    @pulumi.getter(name="bucketNameLists")
    def bucket_name_lists(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Bucket List.
        """
        return pulumi.get(self, "bucket_name_lists")

    @bucket_name_lists.setter
    def bucket_name_lists(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "bucket_name_lists", value)

    @property
    @pulumi.getter
    def enable(self) -> pulumi.Input[int]:
        """
        Enable configuration.
        """
        return pulumi.get(self, "enable")

    @enable.setter
    def enable(self, value: pulumi.Input[int]):
        pulumi.set(self, "enable", value)

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> pulumi.Input[str]:
        """
        End time, hours, minutes and seconds.
        """
        return pulumi.get(self, "end_time")

    @end_time.setter
    def end_time(self, value: pulumi.Input[str]):
        pulumi.set(self, "end_time", value)

    @property
    @pulumi.getter(name="keySuffixLists")
    def key_suffix_lists(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        File Suffix List.
        """
        return pulumi.get(self, "key_suffix_lists")

    @key_suffix_lists.setter
    def key_suffix_lists(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "key_suffix_lists", value)

    @property
    @pulumi.getter(name="scanDayLists")
    def scan_day_lists(self) -> pulumi.Input[Sequence[pulumi.Input[int]]]:
        """
        Scan cycle.
        """
        return pulumi.get(self, "scan_day_lists")

    @scan_day_lists.setter
    def scan_day_lists(self, value: pulumi.Input[Sequence[pulumi.Input[int]]]):
        pulumi.set(self, "scan_day_lists", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Input[str]:
        """
        Start time, hours, minutes and seconds.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: pulumi.Input[str]):
        pulumi.set(self, "start_time", value)

    @property
    @pulumi.getter(name="allKeyPrefix")
    def all_key_prefix(self) -> Optional[pulumi.Input[bool]]:
        """
        Match all prefixes.
        """
        return pulumi.get(self, "all_key_prefix")

    @all_key_prefix.setter
    def all_key_prefix(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "all_key_prefix", value)

    @property
    @pulumi.getter(name="keyPrefixLists")
    def key_prefix_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        File prefix list.
        """
        return pulumi.get(self, "key_prefix_lists")

    @key_prefix_lists.setter
    def key_prefix_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "key_prefix_lists", value)

    @property
    @pulumi.getter(name="ossScanConfigName")
    def oss_scan_config_name(self) -> Optional[pulumi.Input[str]]:
        """
        Configuration Name.
        """
        return pulumi.get(self, "oss_scan_config_name")

    @oss_scan_config_name.setter
    def oss_scan_config_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oss_scan_config_name", value)


@pulumi.input_type
class _OssScanConfigState:
    def __init__(__self__, *,
                 all_key_prefix: Optional[pulumi.Input[bool]] = None,
                 bucket_name_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 enable: Optional[pulumi.Input[int]] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 key_prefix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 key_suffix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 oss_scan_config_name: Optional[pulumi.Input[str]] = None,
                 scan_day_lists: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 start_time: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OssScanConfig resources.
        :param pulumi.Input[bool] all_key_prefix: Match all prefixes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] bucket_name_lists: Bucket List.
        :param pulumi.Input[int] enable: Enable configuration.
        :param pulumi.Input[str] end_time: End time, hours, minutes and seconds.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] key_prefix_lists: File prefix list.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] key_suffix_lists: File Suffix List.
        :param pulumi.Input[str] oss_scan_config_name: Configuration Name.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] scan_day_lists: Scan cycle.
        :param pulumi.Input[str] start_time: Start time, hours, minutes and seconds.
        """
        if all_key_prefix is not None:
            pulumi.set(__self__, "all_key_prefix", all_key_prefix)
        if bucket_name_lists is not None:
            pulumi.set(__self__, "bucket_name_lists", bucket_name_lists)
        if enable is not None:
            pulumi.set(__self__, "enable", enable)
        if end_time is not None:
            pulumi.set(__self__, "end_time", end_time)
        if key_prefix_lists is not None:
            pulumi.set(__self__, "key_prefix_lists", key_prefix_lists)
        if key_suffix_lists is not None:
            pulumi.set(__self__, "key_suffix_lists", key_suffix_lists)
        if oss_scan_config_name is not None:
            pulumi.set(__self__, "oss_scan_config_name", oss_scan_config_name)
        if scan_day_lists is not None:
            pulumi.set(__self__, "scan_day_lists", scan_day_lists)
        if start_time is not None:
            pulumi.set(__self__, "start_time", start_time)

    @property
    @pulumi.getter(name="allKeyPrefix")
    def all_key_prefix(self) -> Optional[pulumi.Input[bool]]:
        """
        Match all prefixes.
        """
        return pulumi.get(self, "all_key_prefix")

    @all_key_prefix.setter
    def all_key_prefix(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "all_key_prefix", value)

    @property
    @pulumi.getter(name="bucketNameLists")
    def bucket_name_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Bucket List.
        """
        return pulumi.get(self, "bucket_name_lists")

    @bucket_name_lists.setter
    def bucket_name_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "bucket_name_lists", value)

    @property
    @pulumi.getter
    def enable(self) -> Optional[pulumi.Input[int]]:
        """
        Enable configuration.
        """
        return pulumi.get(self, "enable")

    @enable.setter
    def enable(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "enable", value)

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> Optional[pulumi.Input[str]]:
        """
        End time, hours, minutes and seconds.
        """
        return pulumi.get(self, "end_time")

    @end_time.setter
    def end_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_time", value)

    @property
    @pulumi.getter(name="keyPrefixLists")
    def key_prefix_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        File prefix list.
        """
        return pulumi.get(self, "key_prefix_lists")

    @key_prefix_lists.setter
    def key_prefix_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "key_prefix_lists", value)

    @property
    @pulumi.getter(name="keySuffixLists")
    def key_suffix_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        File Suffix List.
        """
        return pulumi.get(self, "key_suffix_lists")

    @key_suffix_lists.setter
    def key_suffix_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "key_suffix_lists", value)

    @property
    @pulumi.getter(name="ossScanConfigName")
    def oss_scan_config_name(self) -> Optional[pulumi.Input[str]]:
        """
        Configuration Name.
        """
        return pulumi.get(self, "oss_scan_config_name")

    @oss_scan_config_name.setter
    def oss_scan_config_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oss_scan_config_name", value)

    @property
    @pulumi.getter(name="scanDayLists")
    def scan_day_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        Scan cycle.
        """
        return pulumi.get(self, "scan_day_lists")

    @scan_day_lists.setter
    def scan_day_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "scan_day_lists", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[pulumi.Input[str]]:
        """
        Start time, hours, minutes and seconds.
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_time", value)


class OssScanConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 all_key_prefix: Optional[pulumi.Input[bool]] = None,
                 bucket_name_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 enable: Optional[pulumi.Input[int]] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 key_prefix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 key_suffix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 oss_scan_config_name: Optional[pulumi.Input[str]] = None,
                 scan_day_lists: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Threat Detection Oss Scan Config resource. Oss detection configuration.

        For information about Threat Detection Oss Scan Config and how to use it, see [What is Oss Scan Config](https://www.alibabacloud.com/help/zh/security-center/developer-reference/api-sas-2018-12-03-createossscanconfig/).

        > **NOTE:** Available since v1.214.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default8j4t1_r = alicloud.oss.Bucket("default8j4t1R",
            bucket=f"{name}-1",
            storage_class="Standard")
        default9_h_mqf_t = alicloud.oss.Bucket("default9HMqfT",
            bucket=f"{name}-2",
            storage_class="Standard")
        defaultx_b_xq_fq = alicloud.oss.Bucket("defaultxBXqFQ",
            bucket=f"{name}-3",
            storage_class="Standard")
        defaulth_zv_cm_r = alicloud.oss.Bucket("defaulthZvCmR",
            bucket=f"{name}-4",
            storage_class="Standard")
        default = alicloud.threatdetection.OssScanConfig("default",
            key_suffix_lists=[
                ".jsp",
                ".php",
                ".k",
            ],
            scan_day_lists=[
                2,
                5,
                4,
                3,
            ],
            oss_scan_config_name=name,
            end_time="00:00:02",
            start_time="00:00:01",
            enable=1,
            all_key_prefix=False,
            bucket_name_lists=[
                default8j4t1_r.bucket,
                default9_h_mqf_t.bucket,
                defaultx_b_xq_fq.bucket,
            ],
            key_prefix_lists=[
                "/root",
                "/usr",
                "/123",
            ])
        ```

        ## Import

        Threat Detection Oss Scan Config can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:threatdetection/ossScanConfig:OssScanConfig example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] all_key_prefix: Match all prefixes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] bucket_name_lists: Bucket List.
        :param pulumi.Input[int] enable: Enable configuration.
        :param pulumi.Input[str] end_time: End time, hours, minutes and seconds.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] key_prefix_lists: File prefix list.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] key_suffix_lists: File Suffix List.
        :param pulumi.Input[str] oss_scan_config_name: Configuration Name.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] scan_day_lists: Scan cycle.
        :param pulumi.Input[str] start_time: Start time, hours, minutes and seconds.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OssScanConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Threat Detection Oss Scan Config resource. Oss detection configuration.

        For information about Threat Detection Oss Scan Config and how to use it, see [What is Oss Scan Config](https://www.alibabacloud.com/help/zh/security-center/developer-reference/api-sas-2018-12-03-createossscanconfig/).

        > **NOTE:** Available since v1.214.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default8j4t1_r = alicloud.oss.Bucket("default8j4t1R",
            bucket=f"{name}-1",
            storage_class="Standard")
        default9_h_mqf_t = alicloud.oss.Bucket("default9HMqfT",
            bucket=f"{name}-2",
            storage_class="Standard")
        defaultx_b_xq_fq = alicloud.oss.Bucket("defaultxBXqFQ",
            bucket=f"{name}-3",
            storage_class="Standard")
        defaulth_zv_cm_r = alicloud.oss.Bucket("defaulthZvCmR",
            bucket=f"{name}-4",
            storage_class="Standard")
        default = alicloud.threatdetection.OssScanConfig("default",
            key_suffix_lists=[
                ".jsp",
                ".php",
                ".k",
            ],
            scan_day_lists=[
                2,
                5,
                4,
                3,
            ],
            oss_scan_config_name=name,
            end_time="00:00:02",
            start_time="00:00:01",
            enable=1,
            all_key_prefix=False,
            bucket_name_lists=[
                default8j4t1_r.bucket,
                default9_h_mqf_t.bucket,
                defaultx_b_xq_fq.bucket,
            ],
            key_prefix_lists=[
                "/root",
                "/usr",
                "/123",
            ])
        ```

        ## Import

        Threat Detection Oss Scan Config can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:threatdetection/ossScanConfig:OssScanConfig example <id>
        ```

        :param str resource_name: The name of the resource.
        :param OssScanConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OssScanConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 all_key_prefix: Optional[pulumi.Input[bool]] = None,
                 bucket_name_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 enable: Optional[pulumi.Input[int]] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 key_prefix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 key_suffix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 oss_scan_config_name: Optional[pulumi.Input[str]] = None,
                 scan_day_lists: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OssScanConfigArgs.__new__(OssScanConfigArgs)

            __props__.__dict__["all_key_prefix"] = all_key_prefix
            if bucket_name_lists is None and not opts.urn:
                raise TypeError("Missing required property 'bucket_name_lists'")
            __props__.__dict__["bucket_name_lists"] = bucket_name_lists
            if enable is None and not opts.urn:
                raise TypeError("Missing required property 'enable'")
            __props__.__dict__["enable"] = enable
            if end_time is None and not opts.urn:
                raise TypeError("Missing required property 'end_time'")
            __props__.__dict__["end_time"] = end_time
            __props__.__dict__["key_prefix_lists"] = key_prefix_lists
            if key_suffix_lists is None and not opts.urn:
                raise TypeError("Missing required property 'key_suffix_lists'")
            __props__.__dict__["key_suffix_lists"] = key_suffix_lists
            __props__.__dict__["oss_scan_config_name"] = oss_scan_config_name
            if scan_day_lists is None and not opts.urn:
                raise TypeError("Missing required property 'scan_day_lists'")
            __props__.__dict__["scan_day_lists"] = scan_day_lists
            if start_time is None and not opts.urn:
                raise TypeError("Missing required property 'start_time'")
            __props__.__dict__["start_time"] = start_time
        super(OssScanConfig, __self__).__init__(
            'alicloud:threatdetection/ossScanConfig:OssScanConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            all_key_prefix: Optional[pulumi.Input[bool]] = None,
            bucket_name_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            enable: Optional[pulumi.Input[int]] = None,
            end_time: Optional[pulumi.Input[str]] = None,
            key_prefix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            key_suffix_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            oss_scan_config_name: Optional[pulumi.Input[str]] = None,
            scan_day_lists: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
            start_time: Optional[pulumi.Input[str]] = None) -> 'OssScanConfig':
        """
        Get an existing OssScanConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] all_key_prefix: Match all prefixes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] bucket_name_lists: Bucket List.
        :param pulumi.Input[int] enable: Enable configuration.
        :param pulumi.Input[str] end_time: End time, hours, minutes and seconds.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] key_prefix_lists: File prefix list.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] key_suffix_lists: File Suffix List.
        :param pulumi.Input[str] oss_scan_config_name: Configuration Name.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] scan_day_lists: Scan cycle.
        :param pulumi.Input[str] start_time: Start time, hours, minutes and seconds.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OssScanConfigState.__new__(_OssScanConfigState)

        __props__.__dict__["all_key_prefix"] = all_key_prefix
        __props__.__dict__["bucket_name_lists"] = bucket_name_lists
        __props__.__dict__["enable"] = enable
        __props__.__dict__["end_time"] = end_time
        __props__.__dict__["key_prefix_lists"] = key_prefix_lists
        __props__.__dict__["key_suffix_lists"] = key_suffix_lists
        __props__.__dict__["oss_scan_config_name"] = oss_scan_config_name
        __props__.__dict__["scan_day_lists"] = scan_day_lists
        __props__.__dict__["start_time"] = start_time
        return OssScanConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allKeyPrefix")
    def all_key_prefix(self) -> pulumi.Output[bool]:
        """
        Match all prefixes.
        """
        return pulumi.get(self, "all_key_prefix")

    @property
    @pulumi.getter(name="bucketNameLists")
    def bucket_name_lists(self) -> pulumi.Output[Sequence[str]]:
        """
        Bucket List.
        """
        return pulumi.get(self, "bucket_name_lists")

    @property
    @pulumi.getter
    def enable(self) -> pulumi.Output[int]:
        """
        Enable configuration.
        """
        return pulumi.get(self, "enable")

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> pulumi.Output[str]:
        """
        End time, hours, minutes and seconds.
        """
        return pulumi.get(self, "end_time")

    @property
    @pulumi.getter(name="keyPrefixLists")
    def key_prefix_lists(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        File prefix list.
        """
        return pulumi.get(self, "key_prefix_lists")

    @property
    @pulumi.getter(name="keySuffixLists")
    def key_suffix_lists(self) -> pulumi.Output[Sequence[str]]:
        """
        File Suffix List.
        """
        return pulumi.get(self, "key_suffix_lists")

    @property
    @pulumi.getter(name="ossScanConfigName")
    def oss_scan_config_name(self) -> pulumi.Output[Optional[str]]:
        """
        Configuration Name.
        """
        return pulumi.get(self, "oss_scan_config_name")

    @property
    @pulumi.getter(name="scanDayLists")
    def scan_day_lists(self) -> pulumi.Output[Sequence[int]]:
        """
        Scan cycle.
        """
        return pulumi.get(self, "scan_day_lists")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Output[str]:
        """
        Start time, hours, minutes and seconds.
        """
        return pulumi.get(self, "start_time")
