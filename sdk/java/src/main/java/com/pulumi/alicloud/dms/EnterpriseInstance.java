// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dms.EnterpriseInstanceArgs;
import com.pulumi.alicloud.dms.inputs.EnterpriseInstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DMS Enterprise Instance resource.
 * 
 * &gt; **NOTE:** API users must first register in DMS.
 * 
 * &gt; **NOTE:** Available since v1.81.0.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetRegionsArgs;
 * import com.pulumi.alicloud.dms.DmsFunctions;
 * import com.pulumi.alicloud.dms.inputs.GetUserTenantsArgs;
 * import com.pulumi.alicloud.rds.RdsFunctions;
 * import com.pulumi.alicloud.rds.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.rds.inputs.GetInstanceClassesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.rds.Instance;
 * import com.pulumi.alicloud.rds.InstanceArgs;
 * import com.pulumi.alicloud.rds.Account;
 * import com.pulumi.alicloud.rds.AccountArgs;
 * import com.pulumi.alicloud.dms.EnterpriseInstance;
 * import com.pulumi.alicloud.dms.EnterpriseInstanceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-example&#34;);
 *         final var current = AlicloudFunctions.getAccount();
 * 
 *         final var defaultRegions = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         final var defaultUserTenants = DmsFunctions.getUserTenants(GetUserTenantsArgs.builder()
 *             .status(&#34;ACTIVE&#34;)
 *             .build());
 * 
 *         final var defaultZones = RdsFunctions.getZones(GetZonesArgs.builder()
 *             .engine(&#34;MySQL&#34;)
 *             .engineVersion(&#34;8.0&#34;)
 *             .instanceChargeType(&#34;PostPaid&#34;)
 *             .category(&#34;HighAvailability&#34;)
 *             .dbInstanceStorageType(&#34;cloud_essd&#34;)
 *             .build());
 * 
 *         final var defaultInstanceClasses = RdsFunctions.getInstanceClasses(GetInstanceClassesArgs.builder()
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .engine(&#34;MySQL&#34;)
 *             .engineVersion(&#34;8.0&#34;)
 *             .category(&#34;HighAvailability&#34;)
 *             .dbInstanceStorageType(&#34;cloud_essd&#34;)
 *             .instanceChargeType(&#34;PostPaid&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;10.4.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(name)
 *             .cidrBlock(&#34;10.4.0.0/24&#34;)
 *             .vpcId(defaultNetwork.id())
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup(&#34;defaultSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .engine(&#34;MySQL&#34;)
 *             .engineVersion(&#34;8.0&#34;)
 *             .dbInstanceStorageType(&#34;cloud_essd&#34;)
 *             .instanceType(defaultInstanceClasses.applyValue(getInstanceClassesResult -&gt; getInstanceClassesResult.instanceClasses()[0].instanceClass()))
 *             .instanceStorage(defaultInstanceClasses.applyValue(getInstanceClassesResult -&gt; getInstanceClassesResult.instanceClasses()[0].storageRange().min()))
 *             .vswitchId(defaultSwitch.id())
 *             .instanceName(name)
 *             .securityIps(            
 *                 &#34;100.104.5.0/24&#34;,
 *                 &#34;192.168.0.6&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Created&#34;, &#34;TF&#34;),
 *                 Map.entry(&#34;For&#34;, &#34;example&#34;)
 *             ))
 *             .build());
 * 
 *         var defaultAccount = new Account(&#34;defaultAccount&#34;, AccountArgs.builder()        
 *             .dbInstanceId(defaultInstance.id())
 *             .accountName(&#34;tfexamplename&#34;)
 *             .accountPassword(&#34;Example12345&#34;)
 *             .accountType(&#34;Normal&#34;)
 *             .build());
 * 
 *         var defaultEnterpriseInstance = new EnterpriseInstance(&#34;defaultEnterpriseInstance&#34;, EnterpriseInstanceArgs.builder()        
 *             .tid(defaultUserTenants.applyValue(getUserTenantsResult -&gt; getUserTenantsResult.ids()[0]))
 *             .instanceType(&#34;MySQL&#34;)
 *             .instanceSource(&#34;RDS&#34;)
 *             .networkType(&#34;VPC&#34;)
 *             .envType(&#34;dev&#34;)
 *             .host(defaultInstance.connectionString())
 *             .port(3306)
 *             .databaseUser(defaultAccount.accountName())
 *             .databasePassword(defaultAccount.accountPassword())
 *             .instanceName(name)
 *             .dbaUid(current.applyValue(getAccountResult -&gt; getAccountResult.id()))
 *             .safeRule(&#34;自由操作&#34;)
 *             .queryTimeout(60)
 *             .exportTimeout(600)
 *             .ecsRegion(defaultRegions.applyValue(getRegionsResult -&gt; getRegionsResult.regions()[0].id()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * DMS Enterprise can be imported using host and port, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:dms/enterpriseInstance:EnterpriseInstance example rm-uf648hgs7874xxxx.mysql.rds.aliyuncs.com:3306
 * ```
 * 
 */
@ResourceType(type="alicloud:dms/enterpriseInstance:EnterpriseInstance")
public class EnterpriseInstance extends com.pulumi.resources.CustomResource {
    /**
     * Cross-database query datalink name.
     * 
     */
    @Export(name="dataLinkName", type=String.class, parameters={})
    private Output<String> dataLinkName;

    /**
     * @return Cross-database query datalink name.
     * 
     */
    public Output<String> dataLinkName() {
        return this.dataLinkName;
    }
    /**
     * Database access password.
     * 
     */
    @Export(name="databasePassword", type=String.class, parameters={})
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
    @Export(name="databaseUser", type=String.class, parameters={})
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
    @Export(name="dbaId", type=String.class, parameters={})
    private Output<String> dbaId;

    /**
     * @return The dba id of the database instance.
     * 
     */
    public Output<String> dbaId() {
        return this.dbaId;
    }
    /**
     * The instance dba nickname.
     * 
     */
    @Export(name="dbaNickName", type=String.class, parameters={})
    private Output<String> dbaNickName;

    /**
     * @return The instance dba nickname.
     * 
     */
    public Output<String> dbaNickName() {
        return this.dbaNickName;
    }
    /**
     * The DBA of the instance is passed into the Alibaba Cloud uid of the DBA.
     * 
     */
    @Export(name="dbaUid", type=Integer.class, parameters={})
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
    @Export(name="ddlOnline", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ddlOnline;

    /**
     * @return Whether to use online services, currently only supports MySQL and PolarDB. Valid values: `0` Not used, `1` Native online DDL priority, `2` DMS lock-free table structure change priority.
     * 
     */
    public Output<Optional<Integer>> ddlOnline() {
        return Codegen.optional(this.ddlOnline);
    }
    /**
     * ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
     * 
     */
    @Export(name="ecsInstanceId", type=String.class, parameters={})
    private Output<String> ecsInstanceId;

    /**
     * @return ECS instance ID. The value of InstanceSource is the ECS self-built library. This value must be passed.
     * 
     */
    public Output<String> ecsInstanceId() {
        return this.ecsInstanceId;
    }
    /**
     * The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
     * 
     */
    @Export(name="ecsRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> ecsRegion;

    /**
     * @return The region where the instance is located. This value must be passed when the value of InstanceSource is RDS, ECS self-built library, and VPC dedicated line IDC.
     * 
     */
    public Output<Optional<String>> ecsRegion() {
        return Codegen.optional(this.ecsRegion);
    }
    /**
     * Environment type. Valid values: `product` production environment, `dev` development environment, `pre` pre-release environment, `test` test environment, `sit` SIT environment, `uat` UAT environment, `pet` pressure test environment, `stag` STAG environment.
     * 
     */
    @Export(name="envType", type=String.class, parameters={})
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
    @Export(name="exportTimeout", type=Integer.class, parameters={})
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
    @Export(name="host", type=String.class, parameters={})
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
    @Export(name="instanceAlias", type=String.class, parameters={})
    private Output<String> instanceAlias;

    /**
     * @return Field `instance_alias` has been deprecated from version 1.100.0. Use `instance_name` instead.
     * 
     */
    public Output<String> instanceAlias() {
        return this.instanceAlias;
    }
    /**
     * The instance id of the database instance.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The instance id of the database instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Instance name, to help users quickly distinguish positioning.
     * 
     */
    @Export(name="instanceName", type=String.class, parameters={})
    private Output<String> instanceName;

    /**
     * @return Instance name, to help users quickly distinguish positioning.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }
    /**
     * The source of the database instance. Valid values: `PUBLIC_OWN`, `RDS`, `ECS_OWN`, `VPC_IDC`.
     * 
     */
    @Export(name="instanceSource", type=String.class, parameters={})
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
    @Export(name="instanceType", type=String.class, parameters={})
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
    @Export(name="networkType", type=String.class, parameters={})
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
    @Export(name="port", type=Integer.class, parameters={})
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
    @Export(name="queryTimeout", type=Integer.class, parameters={})
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
    @Export(name="safeRule", type=String.class, parameters={})
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
    @Export(name="safeRuleId", type=String.class, parameters={})
    private Output<String> safeRuleId;

    /**
     * @return The safe rule id of the database instance.
     * 
     */
    public Output<String> safeRuleId() {
        return this.safeRuleId;
    }
    /**
     * The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
     * 
     */
    @Export(name="sid", type=String.class, parameters={})
    private Output</* @Nullable */ String> sid;

    /**
     * @return The SID. This value must be passed when InstanceType is PostgreSQL or Oracle.
     * 
     */
    public Output<Optional<String>> sid() {
        return Codegen.optional(this.sid);
    }
    /**
     * Whether the instance ignores test connectivity. Valid values: `true`, `false`.
     * 
     */
    @Export(name="skipTest", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipTest;

    /**
     * @return Whether the instance ignores test connectivity. Valid values: `true`, `false`.
     * 
     */
    public Output<Optional<Boolean>> skipTest() {
        return Codegen.optional(this.skipTest);
    }
    /**
     * It has been deprecated from provider version 1.100.0 and &#39;status&#39; instead.
     * 
     * @deprecated
     * Field &#39;state&#39; has been deprecated from version 1.100.0. Use &#39;status&#39; instead.
     * 
     */
    @Deprecated /* Field 'state' has been deprecated from version 1.100.0. Use 'status' instead. */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return It has been deprecated from provider version 1.100.0 and &#39;status&#39; instead.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The instance status.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The instance status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tenant ID.
     * 
     */
    @Export(name="tid", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tid;

    /**
     * @return The tenant ID.
     * 
     */
    public Output<Optional<Integer>> tid() {
        return Codegen.optional(this.tid);
    }
    /**
     * Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
     * 
     */
    @Export(name="useDsql", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> useDsql;

    /**
     * @return Whether to enable cross-instance query. Valid values: `0` not open, `1` open.
     * 
     */
    public Output<Optional<Integer>> useDsql() {
        return Codegen.optional(this.useDsql);
    }
    /**
     * VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcId;

    /**
     * @return VPC ID. This value must be passed when the value of InstanceSource is VPC dedicated line IDC.
     * 
     */
    public Output<Optional<String>> vpcId() {
        return Codegen.optional(this.vpcId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnterpriseInstance(String name) {
        this(name, EnterpriseInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnterpriseInstance(String name, EnterpriseInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnterpriseInstance(String name, EnterpriseInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dms/enterpriseInstance:EnterpriseInstance", name, args == null ? EnterpriseInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EnterpriseInstance(String name, Output<String> id, @Nullable EnterpriseInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dms/enterpriseInstance:EnterpriseInstance", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "databasePassword"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EnterpriseInstance get(String name, Output<String> id, @Nullable EnterpriseInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnterpriseInstance(name, id, state, options);
    }
}
