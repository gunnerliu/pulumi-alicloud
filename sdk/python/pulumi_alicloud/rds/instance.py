# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Instance']


class Instance(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_renew: Optional[pulumi.Input[bool]] = None,
                 auto_renew_period: Optional[pulumi.Input[float]] = None,
                 auto_upgrade_minor_version: Optional[pulumi.Input[str]] = None,
                 db_instance_storage_type: Optional[pulumi.Input[str]] = None,
                 engine: Optional[pulumi.Input[str]] = None,
                 engine_version: Optional[pulumi.Input[str]] = None,
                 force_restart: Optional[pulumi.Input[bool]] = None,
                 instance_charge_type: Optional[pulumi.Input[str]] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 instance_storage: Optional[pulumi.Input[float]] = None,
                 instance_type: Optional[pulumi.Input[str]] = None,
                 maintain_time: Optional[pulumi.Input[str]] = None,
                 monitoring_period: Optional[pulumi.Input[float]] = None,
                 parameters: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['InstanceParameterArgs']]]]] = None,
                 period: Optional[pulumi.Input[float]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_group_id: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 security_ip_mode: Optional[pulumi.Input[str]] = None,
                 security_ips: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 sql_collector_config_value: Optional[pulumi.Input[float]] = None,
                 sql_collector_status: Optional[pulumi.Input[str]] = None,
                 ssl_action: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 tde_status: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides an RDS instance resource. A DB instance is an isolated database
        environment in the cloud. A DB instance can contain multiple user-created
        databases.

        ## Example Usage
        ### Create a RDS MySQL instance

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "dbInstanceconfig"
        creation = config.get("creation")
        if creation is None:
            creation = "Rds"
        default_zones = alicloud.get_zones(available_resource_creation=creation)
        default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            availability_zone=default_zones.zones[0].id,
            cidr_block="172.16.0.0/24",
            vpc_id=default_network.id)
        default_instance = alicloud.rds.Instance("defaultInstance",
            engine="MySQL",
            engine_version="5.6",
            instance_charge_type="Postpaid",
            instance_name=name,
            instance_storage=30,
            instance_type="rds.mysql.s2.large",
            monitoring_period=60,
            vswitch_id=default_switch.id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_renew: Whether to renewal a DB instance automatically or not. It is valid when instance_charge_type is `PrePaid`. Default to `false`.
        :param pulumi.Input[float] auto_renew_period: Auto-renewal period of an instance, in the unit of the month. It is valid when instance_charge_type is `PrePaid`. Valid value:[1~12], Default to 1.
        :param pulumi.Input[str] auto_upgrade_minor_version: The upgrade method to use. Valid values:
               - Auto: Instances are automatically upgraded to a higher minor version.
               - Manual: Instances are forcibly upgraded to a higher minor version when the current version is unpublished.
        :param pulumi.Input[str] db_instance_storage_type: The storage type of the instance. Valid values:
               - local_ssd: specifies to use local SSDs. This value is recommended.
               - cloud_ssd: specifies to use standard SSDs.
               - cloud_essd: specifies to use enhanced SSDs (ESSDs).
               - cloud_essd2: specifies to use enhanced SSDs (ESSDs).
               - cloud_essd3: specifies to use enhanced SSDs (ESSDs).
        :param pulumi.Input[str] engine: Database type. Value options: MySQL, SQLServer, PostgreSQL, and PPAS.
        :param pulumi.Input[str] engine_version: Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
        :param pulumi.Input[bool] force_restart: Set it to true to make some parameter efficient when modifying them. Default to false.
        :param pulumi.Input[str] instance_charge_type: Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`. Currently, the resource only supports PostPaid to PrePaid.
        :param pulumi.Input[str] instance_name: The name of DB instance. It a string of 2 to 256 characters.
        :param pulumi.Input[float] instance_storage: User-defined DB instance storage space. Value range:
               - [5, 2000] for MySQL/PostgreSQL/PPAS HA dual node edition;
               - [20,1000] for MySQL 5.7 basic single node edition;
               - [10, 2000] for SQL Server 2008R2;
               - [20,2000] for SQL Server 2012 basic single node edition
               Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
               Note: There is extra 5 GB storage for SQL Server Instance and it is not in specified `instance_storage`.
        :param pulumi.Input[str] instance_type: DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
        :param pulumi.Input[str] maintain_time: Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
        :param pulumi.Input[float] monitoring_period: The monitoring frequency in seconds. Valid values are 5, 60, 300. Defaults to 300.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['InstanceParameterArgs']]]] parameters: Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm) .
        :param pulumi.Input[float] period: The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
        :param pulumi.Input[str] resource_group_id: The ID of resource group which the DB instance belongs.
        :param pulumi.Input[str] security_group_id: It has been deprecated from 1.69.0 and use `security_group_ids` instead.
        :param pulumi.Input[List[pulumi.Input[str]]] security_group_ids: , Available in 1.69.0+) The list IDs to join ECS Security Group. At most supports three security groups.
        :param pulumi.Input[str] security_ip_mode: Valid values are `normal`, `safety`, Default to `normal`. support `safety` switch to high security access mode
        :param pulumi.Input[List[pulumi.Input[str]]] security_ips: List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        :param pulumi.Input[float] sql_collector_config_value: The sql collector keep time of the instance. Valid values are `30`, `180`, `365`, `1095`, `1825`, Default to `30`.
        :param pulumi.Input[str] sql_collector_status: The sql collector status of the instance. Valid values are `Enabled`, `Disabled`, Default to `Disabled`.
        :param pulumi.Input[str] ssl_action: Actions performed on SSL functions, Valid values: `Open`: turn on SSL encryption; `Close`: turn off SSL encryption; `Update`: update SSL certificate. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26254.htm).
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
               - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
               - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        :param pulumi.Input[str] tde_status: The TDE(Transparent Data Encryption) status. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26256.htm).
        :param pulumi.Input[str] vswitch_id: The virtual switch ID to launch DB instances in one VPC. If there are multiple vswitches, separate them with commas.
        :param pulumi.Input[str] zone_id: The Zone to launch the DB instance. From version 1.8.1, it supports multiple zone.
               If it is a multi-zone and `vswitch_id` is specified, the vswitch must in the one of them.
               The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `getZones`.
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

            __props__['auto_renew'] = auto_renew
            __props__['auto_renew_period'] = auto_renew_period
            __props__['auto_upgrade_minor_version'] = auto_upgrade_minor_version
            __props__['db_instance_storage_type'] = db_instance_storage_type
            if engine is None:
                raise TypeError("Missing required property 'engine'")
            __props__['engine'] = engine
            if engine_version is None:
                raise TypeError("Missing required property 'engine_version'")
            __props__['engine_version'] = engine_version
            __props__['force_restart'] = force_restart
            __props__['instance_charge_type'] = instance_charge_type
            __props__['instance_name'] = instance_name
            if instance_storage is None:
                raise TypeError("Missing required property 'instance_storage'")
            __props__['instance_storage'] = instance_storage
            if instance_type is None:
                raise TypeError("Missing required property 'instance_type'")
            __props__['instance_type'] = instance_type
            __props__['maintain_time'] = maintain_time
            __props__['monitoring_period'] = monitoring_period
            __props__['parameters'] = parameters
            __props__['period'] = period
            __props__['resource_group_id'] = resource_group_id
            if security_group_id is not None:
                warnings.warn("Attribute `security_group_id` has been deprecated from 1.69.0 and use `security_group_ids` instead.", DeprecationWarning)
                pulumi.log.warn("security_group_id is deprecated: Attribute `security_group_id` has been deprecated from 1.69.0 and use `security_group_ids` instead.")
            __props__['security_group_id'] = security_group_id
            __props__['security_group_ids'] = security_group_ids
            __props__['security_ip_mode'] = security_ip_mode
            __props__['security_ips'] = security_ips
            __props__['sql_collector_config_value'] = sql_collector_config_value
            __props__['sql_collector_status'] = sql_collector_status
            __props__['ssl_action'] = ssl_action
            __props__['tags'] = tags
            __props__['tde_status'] = tde_status
            __props__['vswitch_id'] = vswitch_id
            __props__['zone_id'] = zone_id
            __props__['connection_string'] = None
            __props__['port'] = None
            __props__['ssl_status'] = None
        super(Instance, __self__).__init__(
            'alicloud:rds/instance:Instance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_renew: Optional[pulumi.Input[bool]] = None,
            auto_renew_period: Optional[pulumi.Input[float]] = None,
            auto_upgrade_minor_version: Optional[pulumi.Input[str]] = None,
            connection_string: Optional[pulumi.Input[str]] = None,
            db_instance_storage_type: Optional[pulumi.Input[str]] = None,
            engine: Optional[pulumi.Input[str]] = None,
            engine_version: Optional[pulumi.Input[str]] = None,
            force_restart: Optional[pulumi.Input[bool]] = None,
            instance_charge_type: Optional[pulumi.Input[str]] = None,
            instance_name: Optional[pulumi.Input[str]] = None,
            instance_storage: Optional[pulumi.Input[float]] = None,
            instance_type: Optional[pulumi.Input[str]] = None,
            maintain_time: Optional[pulumi.Input[str]] = None,
            monitoring_period: Optional[pulumi.Input[float]] = None,
            parameters: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['InstanceParameterArgs']]]]] = None,
            period: Optional[pulumi.Input[float]] = None,
            port: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            security_group_id: Optional[pulumi.Input[str]] = None,
            security_group_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            security_ip_mode: Optional[pulumi.Input[str]] = None,
            security_ips: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            sql_collector_config_value: Optional[pulumi.Input[float]] = None,
            sql_collector_status: Optional[pulumi.Input[str]] = None,
            ssl_action: Optional[pulumi.Input[str]] = None,
            ssl_status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            tde_status: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'Instance':
        """
        Get an existing Instance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_renew: Whether to renewal a DB instance automatically or not. It is valid when instance_charge_type is `PrePaid`. Default to `false`.
        :param pulumi.Input[float] auto_renew_period: Auto-renewal period of an instance, in the unit of the month. It is valid when instance_charge_type is `PrePaid`. Valid value:[1~12], Default to 1.
        :param pulumi.Input[str] auto_upgrade_minor_version: The upgrade method to use. Valid values:
               - Auto: Instances are automatically upgraded to a higher minor version.
               - Manual: Instances are forcibly upgraded to a higher minor version when the current version is unpublished.
        :param pulumi.Input[str] connection_string: RDS database connection string.
        :param pulumi.Input[str] db_instance_storage_type: The storage type of the instance. Valid values:
               - local_ssd: specifies to use local SSDs. This value is recommended.
               - cloud_ssd: specifies to use standard SSDs.
               - cloud_essd: specifies to use enhanced SSDs (ESSDs).
               - cloud_essd2: specifies to use enhanced SSDs (ESSDs).
               - cloud_essd3: specifies to use enhanced SSDs (ESSDs).
        :param pulumi.Input[str] engine: Database type. Value options: MySQL, SQLServer, PostgreSQL, and PPAS.
        :param pulumi.Input[str] engine_version: Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
        :param pulumi.Input[bool] force_restart: Set it to true to make some parameter efficient when modifying them. Default to false.
        :param pulumi.Input[str] instance_charge_type: Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`. Currently, the resource only supports PostPaid to PrePaid.
        :param pulumi.Input[str] instance_name: The name of DB instance. It a string of 2 to 256 characters.
        :param pulumi.Input[float] instance_storage: User-defined DB instance storage space. Value range:
               - [5, 2000] for MySQL/PostgreSQL/PPAS HA dual node edition;
               - [20,1000] for MySQL 5.7 basic single node edition;
               - [10, 2000] for SQL Server 2008R2;
               - [20,2000] for SQL Server 2012 basic single node edition
               Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
               Note: There is extra 5 GB storage for SQL Server Instance and it is not in specified `instance_storage`.
        :param pulumi.Input[str] instance_type: DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
        :param pulumi.Input[str] maintain_time: Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
        :param pulumi.Input[float] monitoring_period: The monitoring frequency in seconds. Valid values are 5, 60, 300. Defaults to 300.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['InstanceParameterArgs']]]] parameters: Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm) .
        :param pulumi.Input[float] period: The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
        :param pulumi.Input[str] port: RDS database connection port.
        :param pulumi.Input[str] resource_group_id: The ID of resource group which the DB instance belongs.
        :param pulumi.Input[str] security_group_id: It has been deprecated from 1.69.0 and use `security_group_ids` instead.
        :param pulumi.Input[List[pulumi.Input[str]]] security_group_ids: , Available in 1.69.0+) The list IDs to join ECS Security Group. At most supports three security groups.
        :param pulumi.Input[str] security_ip_mode: Valid values are `normal`, `safety`, Default to `normal`. support `safety` switch to high security access mode
        :param pulumi.Input[List[pulumi.Input[str]]] security_ips: List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        :param pulumi.Input[float] sql_collector_config_value: The sql collector keep time of the instance. Valid values are `30`, `180`, `365`, `1095`, `1825`, Default to `30`.
        :param pulumi.Input[str] sql_collector_status: The sql collector status of the instance. Valid values are `Enabled`, `Disabled`, Default to `Disabled`.
        :param pulumi.Input[str] ssl_action: Actions performed on SSL functions, Valid values: `Open`: turn on SSL encryption; `Close`: turn off SSL encryption; `Update`: update SSL certificate. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26254.htm).
        :param pulumi.Input[str] ssl_status: Status of the SSL feature. `Yes`: SSL is turned on; `No`: SSL is turned off.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
               - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
               - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        :param pulumi.Input[str] tde_status: The TDE(Transparent Data Encryption) status. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26256.htm).
        :param pulumi.Input[str] vswitch_id: The virtual switch ID to launch DB instances in one VPC. If there are multiple vswitches, separate them with commas.
        :param pulumi.Input[str] zone_id: The Zone to launch the DB instance. From version 1.8.1, it supports multiple zone.
               If it is a multi-zone and `vswitch_id` is specified, the vswitch must in the one of them.
               The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `getZones`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["auto_renew"] = auto_renew
        __props__["auto_renew_period"] = auto_renew_period
        __props__["auto_upgrade_minor_version"] = auto_upgrade_minor_version
        __props__["connection_string"] = connection_string
        __props__["db_instance_storage_type"] = db_instance_storage_type
        __props__["engine"] = engine
        __props__["engine_version"] = engine_version
        __props__["force_restart"] = force_restart
        __props__["instance_charge_type"] = instance_charge_type
        __props__["instance_name"] = instance_name
        __props__["instance_storage"] = instance_storage
        __props__["instance_type"] = instance_type
        __props__["maintain_time"] = maintain_time
        __props__["monitoring_period"] = monitoring_period
        __props__["parameters"] = parameters
        __props__["period"] = period
        __props__["port"] = port
        __props__["resource_group_id"] = resource_group_id
        __props__["security_group_id"] = security_group_id
        __props__["security_group_ids"] = security_group_ids
        __props__["security_ip_mode"] = security_ip_mode
        __props__["security_ips"] = security_ips
        __props__["sql_collector_config_value"] = sql_collector_config_value
        __props__["sql_collector_status"] = sql_collector_status
        __props__["ssl_action"] = ssl_action
        __props__["ssl_status"] = ssl_status
        __props__["tags"] = tags
        __props__["tde_status"] = tde_status
        __props__["vswitch_id"] = vswitch_id
        __props__["zone_id"] = zone_id
        return Instance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoRenew")
    def auto_renew(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to renewal a DB instance automatically or not. It is valid when instance_charge_type is `PrePaid`. Default to `false`.
        """
        return pulumi.get(self, "auto_renew")

    @property
    @pulumi.getter(name="autoRenewPeriod")
    def auto_renew_period(self) -> pulumi.Output[Optional[float]]:
        """
        Auto-renewal period of an instance, in the unit of the month. It is valid when instance_charge_type is `PrePaid`. Valid value:[1~12], Default to 1.
        """
        return pulumi.get(self, "auto_renew_period")

    @property
    @pulumi.getter(name="autoUpgradeMinorVersion")
    def auto_upgrade_minor_version(self) -> pulumi.Output[str]:
        """
        The upgrade method to use. Valid values:
        - Auto: Instances are automatically upgraded to a higher minor version.
        - Manual: Instances are forcibly upgraded to a higher minor version when the current version is unpublished.
        """
        return pulumi.get(self, "auto_upgrade_minor_version")

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> pulumi.Output[str]:
        """
        RDS database connection string.
        """
        return pulumi.get(self, "connection_string")

    @property
    @pulumi.getter(name="dbInstanceStorageType")
    def db_instance_storage_type(self) -> pulumi.Output[str]:
        """
        The storage type of the instance. Valid values:
        - local_ssd: specifies to use local SSDs. This value is recommended.
        - cloud_ssd: specifies to use standard SSDs.
        - cloud_essd: specifies to use enhanced SSDs (ESSDs).
        - cloud_essd2: specifies to use enhanced SSDs (ESSDs).
        - cloud_essd3: specifies to use enhanced SSDs (ESSDs).
        """
        return pulumi.get(self, "db_instance_storage_type")

    @property
    @pulumi.getter
    def engine(self) -> pulumi.Output[str]:
        """
        Database type. Value options: MySQL, SQLServer, PostgreSQL, and PPAS.
        """
        return pulumi.get(self, "engine")

    @property
    @pulumi.getter(name="engineVersion")
    def engine_version(self) -> pulumi.Output[str]:
        """
        Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
        """
        return pulumi.get(self, "engine_version")

    @property
    @pulumi.getter(name="forceRestart")
    def force_restart(self) -> pulumi.Output[Optional[bool]]:
        """
        Set it to true to make some parameter efficient when modifying them. Default to false.
        """
        return pulumi.get(self, "force_restart")

    @property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> pulumi.Output[Optional[str]]:
        """
        Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`. Currently, the resource only supports PostPaid to PrePaid.
        """
        return pulumi.get(self, "instance_charge_type")

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of DB instance. It a string of 2 to 256 characters.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="instanceStorage")
    def instance_storage(self) -> pulumi.Output[float]:
        """
        User-defined DB instance storage space. Value range:
        - [5, 2000] for MySQL/PostgreSQL/PPAS HA dual node edition;
        - [20,1000] for MySQL 5.7 basic single node edition;
        - [10, 2000] for SQL Server 2008R2;
        - [20,2000] for SQL Server 2012 basic single node edition
        Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
        Note: There is extra 5 GB storage for SQL Server Instance and it is not in specified `instance_storage`.
        """
        return pulumi.get(self, "instance_storage")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> pulumi.Output[str]:
        """
        DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="maintainTime")
    def maintain_time(self) -> pulumi.Output[str]:
        """
        Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
        """
        return pulumi.get(self, "maintain_time")

    @property
    @pulumi.getter(name="monitoringPeriod")
    def monitoring_period(self) -> pulumi.Output[float]:
        """
        The monitoring frequency in seconds. Valid values are 5, 60, 300. Defaults to 300.
        """
        return pulumi.get(self, "monitoring_period")

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Output[List['outputs.InstanceParameter']]:
        """
        Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm) .
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[Optional[float]]:
        """
        The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[str]:
        """
        RDS database connection port.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The ID of resource group which the DB instance belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> pulumi.Output[str]:
        """
        It has been deprecated from 1.69.0 and use `security_group_ids` instead.
        """
        return pulumi.get(self, "security_group_id")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> pulumi.Output[List[str]]:
        """
        , Available in 1.69.0+) The list IDs to join ECS Security Group. At most supports three security groups.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="securityIpMode")
    def security_ip_mode(self) -> pulumi.Output[Optional[str]]:
        """
        Valid values are `normal`, `safety`, Default to `normal`. support `safety` switch to high security access mode
        """
        return pulumi.get(self, "security_ip_mode")

    @property
    @pulumi.getter(name="securityIps")
    def security_ips(self) -> pulumi.Output[List[str]]:
        """
        List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        """
        return pulumi.get(self, "security_ips")

    @property
    @pulumi.getter(name="sqlCollectorConfigValue")
    def sql_collector_config_value(self) -> pulumi.Output[Optional[float]]:
        """
        The sql collector keep time of the instance. Valid values are `30`, `180`, `365`, `1095`, `1825`, Default to `30`.
        """
        return pulumi.get(self, "sql_collector_config_value")

    @property
    @pulumi.getter(name="sqlCollectorStatus")
    def sql_collector_status(self) -> pulumi.Output[str]:
        """
        The sql collector status of the instance. Valid values are `Enabled`, `Disabled`, Default to `Disabled`.
        """
        return pulumi.get(self, "sql_collector_status")

    @property
    @pulumi.getter(name="sslAction")
    def ssl_action(self) -> pulumi.Output[str]:
        """
        Actions performed on SSL functions, Valid values: `Open`: turn on SSL encryption; `Close`: turn off SSL encryption; `Update`: update SSL certificate. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26254.htm).
        """
        return pulumi.get(self, "ssl_action")

    @property
    @pulumi.getter(name="sslStatus")
    def ssl_status(self) -> pulumi.Output[str]:
        """
        Status of the SSL feature. `Yes`: SSL is turned on; `No`: SSL is turned off.
        """
        return pulumi.get(self, "ssl_status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
        - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tdeStatus")
    def tde_status(self) -> pulumi.Output[Optional[str]]:
        """
        The TDE(Transparent Data Encryption) status. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26256.htm).
        """
        return pulumi.get(self, "tde_status")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[Optional[str]]:
        """
        The virtual switch ID to launch DB instances in one VPC. If there are multiple vswitches, separate them with commas.
        """
        return pulumi.get(self, "vswitch_id")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The Zone to launch the DB instance. From version 1.8.1, it supports multiple zone.
        If it is a multi-zone and `vswitch_id` is specified, the vswitch must in the one of them.
        The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `getZones`.
        """
        return pulumi.get(self, "zone_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

