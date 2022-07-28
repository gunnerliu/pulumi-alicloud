// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnterpriseInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnterpriseInstanceArgs Empty = new EnterpriseInstanceArgs();

    /**
     * Cross-database query datalink name.
     * 
     */
    @Import(name="dataLinkName")
    private @Nullable Output<String> dataLinkName;

    /**
     * @return Cross-database query datalink name.
     * 
     */
    public Optional<Output<String>> dataLinkName() {
        return Optional.ofNullable(this.dataLinkName);
    }

    /**
     * Database access password.
     * 
     */
    @Import(name="databasePassword", required=true)
    private Output<String> databasePassword;

    /**
     * @return Database access password.
     * 
     */
    public Output<String> databasePassword() {
        return this.databasePassword;
    }

    /**
     * Database access account.
     * 
     */
    @Import(name="databaseUser", required=true)
    private Output<String> databaseUser;

    /**
     * @return Database access account.
     * 
     */
    public Output<String> databaseUser() {
        return this.databaseUser;
    }

    /**
     * The dba id of the database instance.
     * 
     */
    @Import(name="dbaId")
    private @Nullable Output<String> dbaId;

    /**
     * @return The dba id of the database instance.
     * 
     */
    public Optional<Output<String>> dbaId() {
        return Optional.ofNullable(this.dbaId);
    }

    /**
     * The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
     * 
     */
    @Import(name="dbaUid", required=true)
    private Output<Integer> dbaUid;

    /**
     * @return The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
     * 
     */
    public Output<Integer> dbaUid() {
        return this.dbaUid;
    }

    /**
     * Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
     * 
     */
    @Import(name="ddlOnline")
    private @Nullable Output<Integer> ddlOnline;

    /**
     * @return Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
     * 
     */
    public Optional<Output<Integer>> ddlOnline() {
        return Optional.ofNullable(this.ddlOnline);
    }

    /**
     * ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
     * 
     */
    @Import(name="ecsInstanceId")
    private @Nullable Output<String> ecsInstanceId;

    /**
     * @return ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
     * 
     */
    public Optional<Output<String>> ecsInstanceId() {
        return Optional.ofNullable(this.ecsInstanceId);
    }

    /**
     * The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
     * 
     */
    @Import(name="ecsRegion")
    private @Nullable Output<String> ecsRegion;

    /**
     * @return The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
     * 
     */
    public Optional<Output<String>> ecsRegion() {
        return Optional.ofNullable(this.ecsRegion);
    }

    /**
     * Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
     * 
     */
    @Import(name="envType", required=true)
    private Output<String> envType;

    /**
     * @return Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
     * 
     */
    public Output<String> envType() {
        return this.envType;
    }

    /**
     * Export timeout, unit: s (seconds).
     * 
     */
    @Import(name="exportTimeout", required=true)
    private Output<Integer> exportTimeout;

    /**
     * @return Export timeout, unit: s (seconds).
     * 
     */
    public Output<Integer> exportTimeout() {
        return this.exportTimeout;
    }

    /**
     * Host address of the target database.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return Host address of the target database.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * Field `instance_alias` has been deprecated from version 1.100.0. Use `instance_name` instead.
     * 
     * @deprecated
     * Field &#39;instance_alias&#39; has been deprecated from version 1.100.0. Use &#39;instance_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'instance_alias' has been deprecated from version 1.100.0. Use 'instance_name' instead. */
    @Import(name="instanceAlias")
    private @Nullable Output<String> instanceAlias;

    /**
     * @return Field `instance_alias` has been deprecated from version 1.100.0. Use `instance_name` instead.
     * 
     * @deprecated
     * Field &#39;instance_alias&#39; has been deprecated from version 1.100.0. Use &#39;instance_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'instance_alias' has been deprecated from version 1.100.0. Use 'instance_name' instead. */
    public Optional<Output<String>> instanceAlias() {
        return Optional.ofNullable(this.instanceAlias);
    }

    /**
     * The instance id of the database instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The instance id of the database instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Instance name, to help users quickly distinguish positioning.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return Instance name, to help users quickly distinguish positioning.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
     * 
     */
    @Import(name="instanceSource", required=true)
    private Output<String> instanceSource;

    /**
     * @return The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
     * 
     */
    public Output<String> instanceSource() {
        return this.instanceSource;
    }

    /**
     * Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
     * 
     */
    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    /**
     * @return Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * Network type. Valid values: `CLASSIC`, `VPC`.
     * 
     */
    @Import(name="networkType", required=true)
    private Output<String> networkType;

    /**
     * @return Network type. Valid values: `CLASSIC`, `VPC`.
     * 
     */
    public Output<String> networkType() {
        return this.networkType;
    }

    /**
     * Access port of the target database.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return Access port of the target database.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Query timeout time, unit: s (seconds).
     * 
     */
    @Import(name="queryTimeout", required=true)
    private Output<Integer> queryTimeout;

    /**
     * @return Query timeout time, unit: s (seconds).
     * 
     */
    public Output<Integer> queryTimeout() {
        return this.queryTimeout;
    }

    /**
     * The security rule of the instance is passed into the name of the security rule in the enterprise.
     * 
     */
    @Import(name="safeRule", required=true)
    private Output<String> safeRule;

    /**
     * @return The security rule of the instance is passed into the name of the security rule in the enterprise.
     * 
     */
    public Output<String> safeRule() {
        return this.safeRule;
    }

    /**
     * The safe rule id of the database instance.
     * 
     */
    @Import(name="safeRuleId")
    private @Nullable Output<String> safeRuleId;

    /**
     * @return The safe rule id of the database instance.
     * 
     */
    public Optional<Output<String>> safeRuleId() {
        return Optional.ofNullable(this.safeRuleId);
    }

    /**
     * The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
     * 
     */
    @Import(name="sid")
    private @Nullable Output<String> sid;

    /**
     * @return The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
     * 
     */
    public Optional<Output<String>> sid() {
        return Optional.ofNullable(this.sid);
    }

    /**
     * Whether the instance ignores test connectivity. Valid values: `true`, `false`.
     * 
     */
    @Import(name="skipTest")
    private @Nullable Output<Boolean> skipTest;

    /**
     * @return Whether the instance ignores test connectivity. Valid values: `true`, `false`.
     * 
     */
    public Optional<Output<Boolean>> skipTest() {
        return Optional.ofNullable(this.skipTest);
    }

    /**
     * The tenant ID.
     * 
     */
    @Import(name="tid")
    private @Nullable Output<Integer> tid;

    /**
     * @return The tenant ID.
     * 
     */
    public Optional<Output<Integer>> tid() {
        return Optional.ofNullable(this.tid);
    }

    /**
     * Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
     * 
     */
    @Import(name="useDsql")
    private @Nullable Output<Integer> useDsql;

    /**
     * @return Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
     * 
     */
    public Optional<Output<Integer>> useDsql() {
        return Optional.ofNullable(this.useDsql);
    }

    /**
     * VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private EnterpriseInstanceArgs() {}

    private EnterpriseInstanceArgs(EnterpriseInstanceArgs $) {
        this.dataLinkName = $.dataLinkName;
        this.databasePassword = $.databasePassword;
        this.databaseUser = $.databaseUser;
        this.dbaId = $.dbaId;
        this.dbaUid = $.dbaUid;
        this.ddlOnline = $.ddlOnline;
        this.ecsInstanceId = $.ecsInstanceId;
        this.ecsRegion = $.ecsRegion;
        this.envType = $.envType;
        this.exportTimeout = $.exportTimeout;
        this.host = $.host;
        this.instanceAlias = $.instanceAlias;
        this.instanceId = $.instanceId;
        this.instanceName = $.instanceName;
        this.instanceSource = $.instanceSource;
        this.instanceType = $.instanceType;
        this.networkType = $.networkType;
        this.port = $.port;
        this.queryTimeout = $.queryTimeout;
        this.safeRule = $.safeRule;
        this.safeRuleId = $.safeRuleId;
        this.sid = $.sid;
        this.skipTest = $.skipTest;
        this.tid = $.tid;
        this.useDsql = $.useDsql;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnterpriseInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnterpriseInstanceArgs $;

        public Builder() {
            $ = new EnterpriseInstanceArgs();
        }

        public Builder(EnterpriseInstanceArgs defaults) {
            $ = new EnterpriseInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataLinkName Cross-database query datalink name.
         * 
         * @return builder
         * 
         */
        public Builder dataLinkName(@Nullable Output<String> dataLinkName) {
            $.dataLinkName = dataLinkName;
            return this;
        }

        /**
         * @param dataLinkName Cross-database query datalink name.
         * 
         * @return builder
         * 
         */
        public Builder dataLinkName(String dataLinkName) {
            return dataLinkName(Output.of(dataLinkName));
        }

        /**
         * @param databasePassword Database access password.
         * 
         * @return builder
         * 
         */
        public Builder databasePassword(Output<String> databasePassword) {
            $.databasePassword = databasePassword;
            return this;
        }

        /**
         * @param databasePassword Database access password.
         * 
         * @return builder
         * 
         */
        public Builder databasePassword(String databasePassword) {
            return databasePassword(Output.of(databasePassword));
        }

        /**
         * @param databaseUser Database access account.
         * 
         * @return builder
         * 
         */
        public Builder databaseUser(Output<String> databaseUser) {
            $.databaseUser = databaseUser;
            return this;
        }

        /**
         * @param databaseUser Database access account.
         * 
         * @return builder
         * 
         */
        public Builder databaseUser(String databaseUser) {
            return databaseUser(Output.of(databaseUser));
        }

        /**
         * @param dbaId The dba id of the database instance.
         * 
         * @return builder
         * 
         */
        public Builder dbaId(@Nullable Output<String> dbaId) {
            $.dbaId = dbaId;
            return this;
        }

        /**
         * @param dbaId The dba id of the database instance.
         * 
         * @return builder
         * 
         */
        public Builder dbaId(String dbaId) {
            return dbaId(Output.of(dbaId));
        }

        /**
         * @param dbaUid The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
         * 
         * @return builder
         * 
         */
        public Builder dbaUid(Output<Integer> dbaUid) {
            $.dbaUid = dbaUid;
            return this;
        }

        /**
         * @param dbaUid The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
         * 
         * @return builder
         * 
         */
        public Builder dbaUid(Integer dbaUid) {
            return dbaUid(Output.of(dbaUid));
        }

        /**
         * @param ddlOnline Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
         * 
         * @return builder
         * 
         */
        public Builder ddlOnline(@Nullable Output<Integer> ddlOnline) {
            $.ddlOnline = ddlOnline;
            return this;
        }

        /**
         * @param ddlOnline Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
         * 
         * @return builder
         * 
         */
        public Builder ddlOnline(Integer ddlOnline) {
            return ddlOnline(Output.of(ddlOnline));
        }

        /**
         * @param ecsInstanceId ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
         * 
         * @return builder
         * 
         */
        public Builder ecsInstanceId(@Nullable Output<String> ecsInstanceId) {
            $.ecsInstanceId = ecsInstanceId;
            return this;
        }

        /**
         * @param ecsInstanceId ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
         * 
         * @return builder
         * 
         */
        public Builder ecsInstanceId(String ecsInstanceId) {
            return ecsInstanceId(Output.of(ecsInstanceId));
        }

        /**
         * @param ecsRegion The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
         * 
         * @return builder
         * 
         */
        public Builder ecsRegion(@Nullable Output<String> ecsRegion) {
            $.ecsRegion = ecsRegion;
            return this;
        }

        /**
         * @param ecsRegion The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
         * 
         * @return builder
         * 
         */
        public Builder ecsRegion(String ecsRegion) {
            return ecsRegion(Output.of(ecsRegion));
        }

        /**
         * @param envType Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
         * 
         * @return builder
         * 
         */
        public Builder envType(Output<String> envType) {
            $.envType = envType;
            return this;
        }

        /**
         * @param envType Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
         * 
         * @return builder
         * 
         */
        public Builder envType(String envType) {
            return envType(Output.of(envType));
        }

        /**
         * @param exportTimeout Export timeout, unit: s (seconds).
         * 
         * @return builder
         * 
         */
        public Builder exportTimeout(Output<Integer> exportTimeout) {
            $.exportTimeout = exportTimeout;
            return this;
        }

        /**
         * @param exportTimeout Export timeout, unit: s (seconds).
         * 
         * @return builder
         * 
         */
        public Builder exportTimeout(Integer exportTimeout) {
            return exportTimeout(Output.of(exportTimeout));
        }

        /**
         * @param host Host address of the target database.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Host address of the target database.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param instanceAlias Field `instance_alias` has been deprecated from version 1.100.0. Use `instance_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;instance_alias&#39; has been deprecated from version 1.100.0. Use &#39;instance_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'instance_alias' has been deprecated from version 1.100.0. Use 'instance_name' instead. */
        public Builder instanceAlias(@Nullable Output<String> instanceAlias) {
            $.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * @param instanceAlias Field `instance_alias` has been deprecated from version 1.100.0. Use `instance_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;instance_alias&#39; has been deprecated from version 1.100.0. Use &#39;instance_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'instance_alias' has been deprecated from version 1.100.0. Use 'instance_name' instead. */
        public Builder instanceAlias(String instanceAlias) {
            return instanceAlias(Output.of(instanceAlias));
        }

        /**
         * @param instanceId The instance id of the database instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The instance id of the database instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param instanceName Instance name, to help users quickly distinguish positioning.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName Instance name, to help users quickly distinguish positioning.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param instanceSource The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
         * 
         * @return builder
         * 
         */
        public Builder instanceSource(Output<String> instanceSource) {
            $.instanceSource = instanceSource;
            return this;
        }

        /**
         * @param instanceSource The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
         * 
         * @return builder
         * 
         */
        public Builder instanceSource(String instanceSource) {
            return instanceSource(Output.of(instanceSource));
        }

        /**
         * @param instanceType Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType Database type. Valid values: `MySQL`, `SQLServer`, `PostgreSQL`, `Oracle,` `DRDS`, `OceanBase`, `Mongo`, `Redis`.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param networkType Network type. Valid values: `CLASSIC`, `VPC`.
         * 
         * @return builder
         * 
         */
        public Builder networkType(Output<String> networkType) {
            $.networkType = networkType;
            return this;
        }

        /**
         * @param networkType Network type. Valid values: `CLASSIC`, `VPC`.
         * 
         * @return builder
         * 
         */
        public Builder networkType(String networkType) {
            return networkType(Output.of(networkType));
        }

        /**
         * @param port Access port of the target database.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Access port of the target database.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param queryTimeout Query timeout time, unit: s (seconds).
         * 
         * @return builder
         * 
         */
        public Builder queryTimeout(Output<Integer> queryTimeout) {
            $.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * @param queryTimeout Query timeout time, unit: s (seconds).
         * 
         * @return builder
         * 
         */
        public Builder queryTimeout(Integer queryTimeout) {
            return queryTimeout(Output.of(queryTimeout));
        }

        /**
         * @param safeRule The security rule of the instance is passed into the name of the security rule in the enterprise.
         * 
         * @return builder
         * 
         */
        public Builder safeRule(Output<String> safeRule) {
            $.safeRule = safeRule;
            return this;
        }

        /**
         * @param safeRule The security rule of the instance is passed into the name of the security rule in the enterprise.
         * 
         * @return builder
         * 
         */
        public Builder safeRule(String safeRule) {
            return safeRule(Output.of(safeRule));
        }

        /**
         * @param safeRuleId The safe rule id of the database instance.
         * 
         * @return builder
         * 
         */
        public Builder safeRuleId(@Nullable Output<String> safeRuleId) {
            $.safeRuleId = safeRuleId;
            return this;
        }

        /**
         * @param safeRuleId The safe rule id of the database instance.
         * 
         * @return builder
         * 
         */
        public Builder safeRuleId(String safeRuleId) {
            return safeRuleId(Output.of(safeRuleId));
        }

        /**
         * @param sid The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
         * 
         * @return builder
         * 
         */
        public Builder sid(@Nullable Output<String> sid) {
            $.sid = sid;
            return this;
        }

        /**
         * @param sid The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
         * 
         * @return builder
         * 
         */
        public Builder sid(String sid) {
            return sid(Output.of(sid));
        }

        /**
         * @param skipTest Whether the instance ignores test connectivity. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder skipTest(@Nullable Output<Boolean> skipTest) {
            $.skipTest = skipTest;
            return this;
        }

        /**
         * @param skipTest Whether the instance ignores test connectivity. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder skipTest(Boolean skipTest) {
            return skipTest(Output.of(skipTest));
        }

        /**
         * @param tid The tenant ID.
         * 
         * @return builder
         * 
         */
        public Builder tid(@Nullable Output<Integer> tid) {
            $.tid = tid;
            return this;
        }

        /**
         * @param tid The tenant ID.
         * 
         * @return builder
         * 
         */
        public Builder tid(Integer tid) {
            return tid(Output.of(tid));
        }

        /**
         * @param useDsql Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
         * 
         * @return builder
         * 
         */
        public Builder useDsql(@Nullable Output<Integer> useDsql) {
            $.useDsql = useDsql;
            return this;
        }

        /**
         * @param useDsql Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
         * 
         * @return builder
         * 
         */
        public Builder useDsql(Integer useDsql) {
            return useDsql(Output.of(useDsql));
        }

        /**
         * @param vpcId VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public EnterpriseInstanceArgs build() {
            $.databasePassword = Objects.requireNonNull($.databasePassword, "expected parameter 'databasePassword' to be non-null");
            $.databaseUser = Objects.requireNonNull($.databaseUser, "expected parameter 'databaseUser' to be non-null");
            $.dbaUid = Objects.requireNonNull($.dbaUid, "expected parameter 'dbaUid' to be non-null");
            $.envType = Objects.requireNonNull($.envType, "expected parameter 'envType' to be non-null");
            $.exportTimeout = Objects.requireNonNull($.exportTimeout, "expected parameter 'exportTimeout' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.instanceSource = Objects.requireNonNull($.instanceSource, "expected parameter 'instanceSource' to be non-null");
            $.instanceType = Objects.requireNonNull($.instanceType, "expected parameter 'instanceType' to be non-null");
            $.networkType = Objects.requireNonNull($.networkType, "expected parameter 'networkType' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.queryTimeout = Objects.requireNonNull($.queryTimeout, "expected parameter 'queryTimeout' to be non-null");
            $.safeRule = Objects.requireNonNull($.safeRule, "expected parameter 'safeRule' to be non-null");
            return $;
        }
    }

}
