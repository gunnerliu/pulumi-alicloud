# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['EnterpriseInstance']


class EnterpriseInstance(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_link_name: Optional[pulumi.Input[str]] = None,
                 database_password: Optional[pulumi.Input[str]] = None,
                 database_user: Optional[pulumi.Input[str]] = None,
                 dba_id: Optional[pulumi.Input[str]] = None,
                 dba_uid: Optional[pulumi.Input[float]] = None,
                 ddl_online: Optional[pulumi.Input[float]] = None,
                 ecs_instance_id: Optional[pulumi.Input[str]] = None,
                 ecs_region: Optional[pulumi.Input[str]] = None,
                 env_type: Optional[pulumi.Input[str]] = None,
                 export_timeout: Optional[pulumi.Input[float]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 instance_alias: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 instance_source: Optional[pulumi.Input[str]] = None,
                 instance_type: Optional[pulumi.Input[str]] = None,
                 network_type: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[float]] = None,
                 query_timeout: Optional[pulumi.Input[float]] = None,
                 safe_rule: Optional[pulumi.Input[str]] = None,
                 safe_rule_id: Optional[pulumi.Input[str]] = None,
                 sid: Optional[pulumi.Input[str]] = None,
                 tid: Optional[pulumi.Input[float]] = None,
                 use_dsql: Optional[pulumi.Input[float]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a DMS Enterprise Instance resource.

        > **NOTE:** API users must first register in DMS.
        **NOTE:** Available in 1.81.0+.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.dms.EnterpriseInstance("default",
            database_password="Yourpassword123",
            database_user="your_user_name",
            dba_uid="1182725234xxxxxxx",
            ecs_region="cn-shanghai",
            env_type="test",
            export_timeout=600,
            host="rm-uf648hgsxxxxxx.mysql.rds.aliyuncs.com",
            instance_alias="your_alias_name",
            instance_source="RDS",
            instance_type="MySQL",
            network_type="VPC",
            port=3306,
            query_timeout=60,
            safe_rule="自由操作",
            tid=12345)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] data_link_name: Cross-database query datalink name.
        :param pulumi.Input[str] database_password: Database access password.
        :param pulumi.Input[str] database_user: Database access account.
        :param pulumi.Input[float] dba_uid: The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
        :param pulumi.Input[float] ddl_online: Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
        :param pulumi.Input[str] ecs_instance_id: ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
        :param pulumi.Input[str] ecs_region: The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
        :param pulumi.Input[str] env_type: Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
        :param pulumi.Input[float] export_timeout: Export timeout, unit: s (seconds).
        :param pulumi.Input[str] host: Host address of the target database.
        :param pulumi.Input[str] instance_alias: Instance alias, to help users quickly distinguish positioning.
        :param pulumi.Input[str] instance_source: The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
        :param pulumi.Input[str] instance_type: Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
        :param pulumi.Input[str] network_type: Network type. Valid values: `CLASSIC`, `VPC`.
        :param pulumi.Input[float] port: Access port of the target database.
        :param pulumi.Input[float] query_timeout: Query timeout time, unit: s (seconds).
        :param pulumi.Input[str] safe_rule: The security rule of the instance is passed into the name of the security rule in the enterprise.
        :param pulumi.Input[str] sid: The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
        :param pulumi.Input[float] tid: The tenant ID.
        :param pulumi.Input[float] use_dsql: Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
        :param pulumi.Input[str] vpc_id: VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
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

            __props__['data_link_name'] = data_link_name
            if database_password is None:
                raise TypeError("Missing required property 'database_password'")
            __props__['database_password'] = database_password
            if database_user is None:
                raise TypeError("Missing required property 'database_user'")
            __props__['database_user'] = database_user
            __props__['dba_id'] = dba_id
            if dba_uid is None:
                raise TypeError("Missing required property 'dba_uid'")
            __props__['dba_uid'] = dba_uid
            __props__['ddl_online'] = ddl_online
            __props__['ecs_instance_id'] = ecs_instance_id
            __props__['ecs_region'] = ecs_region
            if env_type is None:
                raise TypeError("Missing required property 'env_type'")
            __props__['env_type'] = env_type
            if export_timeout is None:
                raise TypeError("Missing required property 'export_timeout'")
            __props__['export_timeout'] = export_timeout
            if host is None:
                raise TypeError("Missing required property 'host'")
            __props__['host'] = host
            if instance_alias is None:
                raise TypeError("Missing required property 'instance_alias'")
            __props__['instance_alias'] = instance_alias
            __props__['instance_id'] = instance_id
            if instance_source is None:
                raise TypeError("Missing required property 'instance_source'")
            __props__['instance_source'] = instance_source
            if instance_type is None:
                raise TypeError("Missing required property 'instance_type'")
            __props__['instance_type'] = instance_type
            if network_type is None:
                raise TypeError("Missing required property 'network_type'")
            __props__['network_type'] = network_type
            if port is None:
                raise TypeError("Missing required property 'port'")
            __props__['port'] = port
            if query_timeout is None:
                raise TypeError("Missing required property 'query_timeout'")
            __props__['query_timeout'] = query_timeout
            if safe_rule is None:
                raise TypeError("Missing required property 'safe_rule'")
            __props__['safe_rule'] = safe_rule
            __props__['safe_rule_id'] = safe_rule_id
            __props__['sid'] = sid
            __props__['tid'] = tid
            __props__['use_dsql'] = use_dsql
            __props__['vpc_id'] = vpc_id
            __props__['dba_nick_name'] = None
            __props__['state'] = None
        super(EnterpriseInstance, __self__).__init__(
            'alicloud:dms/enterpriseInstance:EnterpriseInstance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            data_link_name: Optional[pulumi.Input[str]] = None,
            database_password: Optional[pulumi.Input[str]] = None,
            database_user: Optional[pulumi.Input[str]] = None,
            dba_id: Optional[pulumi.Input[str]] = None,
            dba_nick_name: Optional[pulumi.Input[str]] = None,
            dba_uid: Optional[pulumi.Input[float]] = None,
            ddl_online: Optional[pulumi.Input[float]] = None,
            ecs_instance_id: Optional[pulumi.Input[str]] = None,
            ecs_region: Optional[pulumi.Input[str]] = None,
            env_type: Optional[pulumi.Input[str]] = None,
            export_timeout: Optional[pulumi.Input[float]] = None,
            host: Optional[pulumi.Input[str]] = None,
            instance_alias: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            instance_source: Optional[pulumi.Input[str]] = None,
            instance_type: Optional[pulumi.Input[str]] = None,
            network_type: Optional[pulumi.Input[str]] = None,
            port: Optional[pulumi.Input[float]] = None,
            query_timeout: Optional[pulumi.Input[float]] = None,
            safe_rule: Optional[pulumi.Input[str]] = None,
            safe_rule_id: Optional[pulumi.Input[str]] = None,
            sid: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            tid: Optional[pulumi.Input[float]] = None,
            use_dsql: Optional[pulumi.Input[float]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'EnterpriseInstance':
        """
        Get an existing EnterpriseInstance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] data_link_name: Cross-database query datalink name.
        :param pulumi.Input[str] database_password: Database access password.
        :param pulumi.Input[str] database_user: Database access account.
        :param pulumi.Input[str] dba_nick_name: The instance dba nickname.
        :param pulumi.Input[float] dba_uid: The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
        :param pulumi.Input[float] ddl_online: Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
        :param pulumi.Input[str] ecs_instance_id: ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
        :param pulumi.Input[str] ecs_region: The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
        :param pulumi.Input[str] env_type: Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
        :param pulumi.Input[float] export_timeout: Export timeout, unit: s (seconds).
        :param pulumi.Input[str] host: Host address of the target database.
        :param pulumi.Input[str] instance_alias: Instance alias, to help users quickly distinguish positioning.
        :param pulumi.Input[str] instance_source: The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
        :param pulumi.Input[str] instance_type: Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
        :param pulumi.Input[str] network_type: Network type. Valid values: `CLASSIC`, `VPC`.
        :param pulumi.Input[float] port: Access port of the target database.
        :param pulumi.Input[float] query_timeout: Query timeout time, unit: s (seconds).
        :param pulumi.Input[str] safe_rule: The security rule of the instance is passed into the name of the security rule in the enterprise.
        :param pulumi.Input[str] sid: The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
        :param pulumi.Input[str] state: The instance status.
        :param pulumi.Input[float] tid: The tenant ID.
        :param pulumi.Input[float] use_dsql: Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
        :param pulumi.Input[str] vpc_id: VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["data_link_name"] = data_link_name
        __props__["database_password"] = database_password
        __props__["database_user"] = database_user
        __props__["dba_id"] = dba_id
        __props__["dba_nick_name"] = dba_nick_name
        __props__["dba_uid"] = dba_uid
        __props__["ddl_online"] = ddl_online
        __props__["ecs_instance_id"] = ecs_instance_id
        __props__["ecs_region"] = ecs_region
        __props__["env_type"] = env_type
        __props__["export_timeout"] = export_timeout
        __props__["host"] = host
        __props__["instance_alias"] = instance_alias
        __props__["instance_id"] = instance_id
        __props__["instance_source"] = instance_source
        __props__["instance_type"] = instance_type
        __props__["network_type"] = network_type
        __props__["port"] = port
        __props__["query_timeout"] = query_timeout
        __props__["safe_rule"] = safe_rule
        __props__["safe_rule_id"] = safe_rule_id
        __props__["sid"] = sid
        __props__["state"] = state
        __props__["tid"] = tid
        __props__["use_dsql"] = use_dsql
        __props__["vpc_id"] = vpc_id
        return EnterpriseInstance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dataLinkName")
    def data_link_name(self) -> pulumi.Output[Optional[str]]:
        """
        Cross-database query datalink name.
        """
        return pulumi.get(self, "data_link_name")

    @property
    @pulumi.getter(name="databasePassword")
    def database_password(self) -> pulumi.Output[str]:
        """
        Database access password.
        """
        return pulumi.get(self, "database_password")

    @property
    @pulumi.getter(name="databaseUser")
    def database_user(self) -> pulumi.Output[str]:
        """
        Database access account.
        """
        return pulumi.get(self, "database_user")

    @property
    @pulumi.getter(name="dbaId")
    def dba_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "dba_id")

    @property
    @pulumi.getter(name="dbaNickName")
    def dba_nick_name(self) -> pulumi.Output[str]:
        """
        The instance dba nickname.
        """
        return pulumi.get(self, "dba_nick_name")

    @property
    @pulumi.getter(name="dbaUid")
    def dba_uid(self) -> pulumi.Output[float]:
        """
        The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
        """
        return pulumi.get(self, "dba_uid")

    @property
    @pulumi.getter(name="ddlOnline")
    def ddl_online(self) -> pulumi.Output[Optional[float]]:
        """
        Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
        """
        return pulumi.get(self, "ddl_online")

    @property
    @pulumi.getter(name="ecsInstanceId")
    def ecs_instance_id(self) -> pulumi.Output[str]:
        """
        ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
        """
        return pulumi.get(self, "ecs_instance_id")

    @property
    @pulumi.getter(name="ecsRegion")
    def ecs_region(self) -> pulumi.Output[Optional[str]]:
        """
        The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
        """
        return pulumi.get(self, "ecs_region")

    @property
    @pulumi.getter(name="envType")
    def env_type(self) -> pulumi.Output[str]:
        """
        Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
        """
        return pulumi.get(self, "env_type")

    @property
    @pulumi.getter(name="exportTimeout")
    def export_timeout(self) -> pulumi.Output[float]:
        """
        Export timeout, unit: s (seconds).
        """
        return pulumi.get(self, "export_timeout")

    @property
    @pulumi.getter
    def host(self) -> pulumi.Output[str]:
        """
        Host address of the target database.
        """
        return pulumi.get(self, "host")

    @property
    @pulumi.getter(name="instanceAlias")
    def instance_alias(self) -> pulumi.Output[str]:
        """
        Instance alias, to help users quickly distinguish positioning.
        """
        return pulumi.get(self, "instance_alias")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="instanceSource")
    def instance_source(self) -> pulumi.Output[str]:
        """
        The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
        """
        return pulumi.get(self, "instance_source")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> pulumi.Output[str]:
        """
        Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> pulumi.Output[str]:
        """
        Network type. Valid values: `CLASSIC`, `VPC`.
        """
        return pulumi.get(self, "network_type")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[float]:
        """
        Access port of the target database.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="queryTimeout")
    def query_timeout(self) -> pulumi.Output[float]:
        """
        Query timeout time, unit: s (seconds).
        """
        return pulumi.get(self, "query_timeout")

    @property
    @pulumi.getter(name="safeRule")
    def safe_rule(self) -> pulumi.Output[str]:
        """
        The security rule of the instance is passed into the name of the security rule in the enterprise.
        """
        return pulumi.get(self, "safe_rule")

    @property
    @pulumi.getter(name="safeRuleId")
    def safe_rule_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "safe_rule_id")

    @property
    @pulumi.getter
    def sid(self) -> pulumi.Output[Optional[str]]:
        """
        The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
        """
        return pulumi.get(self, "sid")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The instance status.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tid(self) -> pulumi.Output[Optional[float]]:
        """
        The tenant ID.
        """
        return pulumi.get(self, "tid")

    @property
    @pulumi.getter(name="useDsql")
    def use_dsql(self) -> pulumi.Output[Optional[float]]:
        """
        Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
        """
        return pulumi.get(self, "use_dsql")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[Optional[str]]:
        """
        VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
        """
        return pulumi.get(self, "vpc_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

