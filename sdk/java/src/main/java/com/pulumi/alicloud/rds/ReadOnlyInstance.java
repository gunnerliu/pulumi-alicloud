// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.rds.ReadOnlyInstanceArgs;
import com.pulumi.alicloud.rds.inputs.ReadOnlyInstanceState;
import com.pulumi.alicloud.rds.outputs.ReadOnlyInstanceParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an RDS readonly instance resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.rds.Instance;
 * import com.pulumi.alicloud.rds.InstanceArgs;
 * import com.pulumi.alicloud.rds.ReadOnlyInstance;
 * import com.pulumi.alicloud.rds.ReadOnlyInstanceArgs;
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
 *         final var creation = config.get(&#34;creation&#34;).orElse(&#34;Rds&#34;);
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;dbInstancevpc&#34;);
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(creation)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .cidrBlock(&#34;172.16.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/24&#34;)
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vswitchName(name)
 *             .build());
 * 
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .engine(&#34;MySQL&#34;)
 *             .engineVersion(&#34;5.6&#34;)
 *             .instanceType(&#34;rds.mysql.t1.small&#34;)
 *             .instanceStorage(&#34;20&#34;)
 *             .instanceChargeType(&#34;Postpaid&#34;)
 *             .instanceName(name)
 *             .vswitchId(defaultSwitch.id())
 *             .securityIps(            
 *                 &#34;10.168.1.12&#34;,
 *                 &#34;100.69.7.112&#34;)
 *             .build());
 * 
 *         var defaultReadOnlyInstance = new ReadOnlyInstance(&#34;defaultReadOnlyInstance&#34;, ReadOnlyInstanceArgs.builder()        
 *             .masterDbInstanceId(defaultInstance.id())
 *             .zoneId(defaultInstance.zoneId())
 *             .engineVersion(defaultInstance.engineVersion())
 *             .instanceType(defaultInstance.instanceType())
 *             .instanceStorage(&#34;30&#34;)
 *             .instanceName(String.format(&#34;%sro&#34;, name))
 *             .vswitchId(defaultSwitch.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * RDS readonly instance can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:rds/readOnlyInstance:ReadOnlyInstance example rm-abc12345678
 * ```
 * 
 */
@ResourceType(type="alicloud:rds/readOnlyInstance:ReadOnlyInstance")
public class ReadOnlyInstance extends com.pulumi.resources.CustomResource {
    /**
     * The method that is used to verify the identities of clients. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. It is valid only when `ssl_enabled  = 1`. Valid values:
     * - cert
     * - perfer
     * - verify-ca
     * - verify-full (supported only when the instance runs PostgreSQL 12 or later)
     * 
     */
    @Export(name="acl", type=String.class, parameters={})
    private Output<String> acl;

    /**
     * @return The method that is used to verify the identities of clients. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. It is valid only when `ssl_enabled  = 1`. Valid values:
     * - cert
     * - perfer
     * - verify-ca
     * - verify-full (supported only when the instance runs PostgreSQL 12 or later)
     * 
     */
    public Output<String> acl() {
        return this.acl;
    }
    /**
     * Whether to renewal a DB instance automatically or not. It is valid when instance_charge_type is `PrePaid`. Default to `false`.
     * 
     */
    @Export(name="autoRenew", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoRenew;

    /**
     * @return Whether to renewal a DB instance automatically or not. It is valid when instance_charge_type is `PrePaid`. Default to `false`.
     * 
     */
    public Output<Optional<Boolean>> autoRenew() {
        return Codegen.optional(this.autoRenew);
    }
    /**
     * Auto-renewal period of an instance, in the unit of the month. It is valid when instance_charge_type is `PrePaid`. Valid value:[1~12], Default to 1.
     * 
     */
    @Export(name="autoRenewPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> autoRenewPeriod;

    /**
     * @return Auto-renewal period of an instance, in the unit of the month. It is valid when instance_charge_type is `PrePaid`. Valid value:[1~12], Default to 1.
     * 
     */
    public Output<Optional<Integer>> autoRenewPeriod() {
        return Codegen.optional(this.autoRenewPeriod);
    }
    /**
     * The type of the server certificate. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. If you set the SSLEnabled parameter to 1, the default value of this parameter is aliyun. It is valid only when `ssl_enabled  = 1`. Value range:
     * - aliyun: a cloud certificate
     * - custom: a custom certificate
     * 
     */
    @Export(name="caType", type=String.class, parameters={})
    private Output<String> caType;

    /**
     * @return The type of the server certificate. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. If you set the SSLEnabled parameter to 1, the default value of this parameter is aliyun. It is valid only when `ssl_enabled  = 1`. Value range:
     * - aliyun: a cloud certificate
     * - custom: a custom certificate
     * 
     */
    public Output<String> caType() {
        return this.caType;
    }
    /**
     * The public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. If you set the ClientCAEbabled parameter to 1, you must also specify this parameter. It is valid only when `ssl_enabled  = 1`.
     * 
     */
    @Export(name="clientCaCert", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientCaCert;

    /**
     * @return The public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. If you set the ClientCAEbabled parameter to 1, you must also specify this parameter. It is valid only when `ssl_enabled  = 1`.
     * 
     */
    public Output<Optional<String>> clientCaCert() {
        return Codegen.optional(this.clientCaCert);
    }
    /**
     * Specifies whether to enable the public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. It is valid only when `ssl_enabled  = 1`. Valid values:
     * - 1: enables the public key
     * - 0: disables the public key
     * 
     */
    @Export(name="clientCaEnabled", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> clientCaEnabled;

    /**
     * @return Specifies whether to enable the public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. It is valid only when `ssl_enabled  = 1`. Valid values:
     * - 1: enables the public key
     * - 0: disables the public key
     * 
     */
    public Output<Optional<Integer>> clientCaEnabled() {
        return Codegen.optional(this.clientCaEnabled);
    }
    /**
     * The CRL that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. If you set the ClientCrlEnabled parameter to 1, you must also specify this parameter. It is valid only when `ssl_enabled  = 1`.
     * 
     */
    @Export(name="clientCertRevocationList", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientCertRevocationList;

    /**
     * @return The CRL that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. If you set the ClientCrlEnabled parameter to 1, you must also specify this parameter. It is valid only when `ssl_enabled  = 1`.
     * 
     */
    public Output<Optional<String>> clientCertRevocationList() {
        return Codegen.optional(this.clientCertRevocationList);
    }
    /**
     * Specifies whether to enable a certificate revocation list (CRL) that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. It is valid only when `ssl_enabled  = 1`. Valid values:
     * - 1: enables the CRL
     * - 0: disables the CRL
     * 
     */
    @Export(name="clientCrlEnabled", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> clientCrlEnabled;

    /**
     * @return Specifies whether to enable a certificate revocation list (CRL) that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. It is valid only when `ssl_enabled  = 1`. Valid values:
     * - 1: enables the CRL
     * - 0: disables the CRL
     * 
     */
    public Output<Optional<Integer>> clientCrlEnabled() {
        return Codegen.optional(this.clientCrlEnabled);
    }
    /**
     * RDS database connection string.
     * 
     */
    @Export(name="connectionString", type=String.class, parameters={})
    private Output<String> connectionString;

    /**
     * @return RDS database connection string.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }
    /**
     * The attribute of the IP address whitelist. By default, this parameter is empty.
     * 
     */
    @Export(name="dbInstanceIpArrayAttribute", type=String.class, parameters={})
    private Output</* @Nullable */ String> dbInstanceIpArrayAttribute;

    /**
     * @return The attribute of the IP address whitelist. By default, this parameter is empty.
     * 
     */
    public Output<Optional<String>> dbInstanceIpArrayAttribute() {
        return Codegen.optional(this.dbInstanceIpArrayAttribute);
    }
    /**
     * The name of the IP address whitelist. Default value: Default.
     * 
     */
    @Export(name="dbInstanceIpArrayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> dbInstanceIpArrayName;

    /**
     * @return The name of the IP address whitelist. Default value: Default.
     * 
     */
    public Output<Optional<String>> dbInstanceIpArrayName() {
        return Codegen.optional(this.dbInstanceIpArrayName);
    }
    /**
     * The storage type of the instance. Valid values:
     * - local_ssd: specifies to use local SSDs. This value is recommended.
     * - cloud_ssd: specifies to use standard SSDs.
     * - cloud_essd: specifies to use enhanced SSDs (ESSDs).
     * - cloud_essd2: specifies to use enhanced SSDs (ESSDs).
     * - cloud_essd3: specifies to use enhanced SSDs (ESSDs).
     * 
     */
    @Export(name="dbInstanceStorageType", type=String.class, parameters={})
    private Output<String> dbInstanceStorageType;

    /**
     * @return The storage type of the instance. Valid values:
     * - local_ssd: specifies to use local SSDs. This value is recommended.
     * - cloud_ssd: specifies to use standard SSDs.
     * - cloud_essd: specifies to use enhanced SSDs (ESSDs).
     * - cloud_essd2: specifies to use enhanced SSDs (ESSDs).
     * - cloud_essd3: specifies to use enhanced SSDs (ESSDs).
     * 
     */
    public Output<String> dbInstanceStorageType() {
        return this.dbInstanceStorageType;
    }
    /**
     * The switch of delete protection. Valid values:
     * - true: delete protect.
     * - false: no delete protect.
     * 
     */
    @Export(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return The switch of delete protection. Valid values:
     * - true: delete protect.
     * - false: no delete protect.
     * 
     */
    public Output<Optional<Boolean>> deletionProtection() {
        return Codegen.optional(this.deletionProtection);
    }
    /**
     * Database type.
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output<String> engine;

    /**
     * @return Database type.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
     * 
     */
    @Export(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * Set it to true to make some parameter efficient when modifying them. Default to false.
     * 
     */
    @Export(name="forceRestart", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceRestart;

    /**
     * @return Set it to true to make some parameter efficient when modifying them. Default to false.
     * 
     */
    public Output<Optional<Boolean>> forceRestart() {
        return Codegen.optional(this.forceRestart);
    }
    /**
     * Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`. The interval between the two conversion operations must be greater than 15 minutes. Only when this parameter is `Postpaid`, the instance can be released.
     * 
     */
    @Export(name="instanceChargeType", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceChargeType;

    /**
     * @return Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`. The interval between the two conversion operations must be greater than 15 minutes. Only when this parameter is `Postpaid`, the instance can be released.
     * 
     */
    public Output<Optional<String>> instanceChargeType() {
        return Codegen.optional(this.instanceChargeType);
    }
    /**
     * The name of DB instance. It a string of 2 to 256 characters.
     * 
     */
    @Export(name="instanceName", type=String.class, parameters={})
    private Output<String> instanceName;

    /**
     * @return The name of DB instance. It a string of 2 to 256 characters.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }
    /**
     * User-defined DB instance storage space. Value range: [5, 2000] for MySQL/SQL Server HA dual node edition. Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
     * 
     */
    @Export(name="instanceStorage", type=Integer.class, parameters={})
    private Output<Integer> instanceStorage;

    /**
     * @return User-defined DB instance storage space. Value range: [5, 2000] for MySQL/SQL Server HA dual node edition. Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
     * 
     */
    public Output<Integer> instanceStorage() {
        return this.instanceStorage;
    }
    /**
     * DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
     * 
     */
    @Export(name="instanceType", type=String.class, parameters={})
    private Output<String> instanceType;

    /**
     * @return DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * ID of the master instance.
     * 
     */
    @Export(name="masterDbInstanceId", type=String.class, parameters={})
    private Output<String> masterDbInstanceId;

    /**
     * @return ID of the master instance.
     * 
     */
    public Output<String> masterDbInstanceId() {
        return this.masterDbInstanceId;
    }
    /**
     * The method that is used to modify the IP address whitelist. Default value: Cover. Valid values:
     * - Cover: Use the value of the SecurityIps parameter to overwrite the existing entries in the IP address whitelist.
     * - Append: Add the IP addresses and CIDR blocks that are specified in the SecurityIps parameter to the IP address whitelist.
     * - Delete: Delete IP addresses and CIDR blocks that are specified in the SecurityIps parameter from the IP address whitelist. You must retain at least one IP address or CIDR block.
     * 
     */
    @Export(name="modifyMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> modifyMode;

    /**
     * @return The method that is used to modify the IP address whitelist. Default value: Cover. Valid values:
     * - Cover: Use the value of the SecurityIps parameter to overwrite the existing entries in the IP address whitelist.
     * - Append: Add the IP addresses and CIDR blocks that are specified in the SecurityIps parameter to the IP address whitelist.
     * - Delete: Delete IP addresses and CIDR blocks that are specified in the SecurityIps parameter from the IP address whitelist. You must retain at least one IP address or CIDR block.
     * 
     */
    public Output<Optional<String>> modifyMode() {
        return Codegen.optional(this.modifyMode);
    }
    /**
     * Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm).
     * 
     */
    @Export(name="parameters", type=List.class, parameters={ReadOnlyInstanceParameter.class})
    private Output<List<ReadOnlyInstanceParameter>> parameters;

    /**
     * @return Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm).
     * 
     */
    public Output<List<ReadOnlyInstanceParameter>> parameters() {
        return this.parameters;
    }
    /**
     * The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36.
     * 
     */
    @Export(name="period", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> period;

    /**
     * @return The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * RDS database connection port.
     * 
     */
    @Export(name="port", type=String.class, parameters={})
    private Output<String> port;

    /**
     * @return RDS database connection port.
     * 
     */
    public Output<String> port() {
        return this.port;
    }
    /**
     * The method that is used to verify the replication permission. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. It is valid only when `ssl_enabled  = 1`. Valid values:
     * - cert
     * - perfer
     * - verify-ca
     * - verify-full (supported only when the instance runs PostgreSQL 12 or later)
     * &gt; **NOTE:** Because of data backup and migration, change DB instance type and storage would cost 15~20 minutes. Please make full preparation before changing them.
     * 
     */
    @Export(name="replicationAcl", type=String.class, parameters={})
    private Output<String> replicationAcl;

    /**
     * @return The method that is used to verify the replication permission. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. It is valid only when `ssl_enabled  = 1`. Valid values:
     * - cert
     * - perfer
     * - verify-ca
     * - verify-full (supported only when the instance runs PostgreSQL 12 or later)
     * &gt; **NOTE:** Because of data backup and migration, change DB instance type and storage would cost 15~20 minutes. Please make full preparation before changing them.
     * 
     */
    public Output<String> replicationAcl() {
        return this.replicationAcl;
    }
    /**
     * The ID of resource group which the DB read-only instance belongs.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output<String> resourceGroupId;

    /**
     * @return The ID of resource group which the DB read-only instance belongs.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The type of IP address in the IP address whitelist.
     * 
     */
    @Export(name="securityIpType", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityIpType;

    /**
     * @return The type of IP address in the IP address whitelist.
     * 
     */
    public Output<Optional<String>> securityIpType() {
        return Codegen.optional(this.securityIpType);
    }
    /**
     * List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     * 
     */
    @Export(name="securityIps", type=List.class, parameters={String.class})
    private Output<List<String>> securityIps;

    /**
     * @return List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     * 
     */
    public Output<List<String>> securityIps() {
        return this.securityIps;
    }
    /**
     * The content of the server certificate. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. If you set the CAType parameter to custom, you must also specify this parameter. It is valid only when `ssl_enabled  = 1`.
     * 
     */
    @Export(name="serverCert", type=String.class, parameters={})
    private Output<String> serverCert;

    /**
     * @return The content of the server certificate. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. If you set the CAType parameter to custom, you must also specify this parameter. It is valid only when `ssl_enabled  = 1`.
     * 
     */
    public Output<String> serverCert() {
        return this.serverCert;
    }
    /**
     * The private key of the server certificate. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. If you set the CAType parameter to custom, you must also specify this parameter. It is valid only when `ssl_enabled  = 1`.
     * 
     */
    @Export(name="serverKey", type=String.class, parameters={})
    private Output<String> serverKey;

    /**
     * @return The private key of the server certificate. This parameter is supported only when the instance runs PostgreSQL with standard or enhanced SSDs. If you set the CAType parameter to custom, you must also specify this parameter. It is valid only when `ssl_enabled  = 1`.
     * 
     */
    public Output<String> serverKey() {
        return this.serverKey;
    }
    /**
     * Specifies whether to enable or disable SSL encryption. Valid values:
     * - 1: enables SSL encryption
     * - 0: disables SSL encryption
     * 
     */
    @Export(name="sslEnabled", type=Integer.class, parameters={})
    private Output<Integer> sslEnabled;

    /**
     * @return Specifies whether to enable or disable SSL encryption. Valid values:
     * - 1: enables SSL encryption
     * - 0: disables SSL encryption
     * 
     */
    public Output<Integer> sslEnabled() {
        return this.sslEnabled;
    }
    /**
     * The specific point in time when you want to perform the update. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. It is valid only when `upgrade_db_instance_kernel_version = true`. The time must be in UTC.
     * 
     */
    @Export(name="switchTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> switchTime;

    /**
     * @return The specific point in time when you want to perform the update. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. It is valid only when `upgrade_db_instance_kernel_version = true`. The time must be in UTC.
     * 
     */
    public Output<Optional<String>> switchTime() {
        return Codegen.optional(this.switchTime);
    }
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The minor engine version to which you want to update the instance. If you do not specify this parameter, the instance is updated to the latest minor engine version. It is valid only when `upgrade_db_instance_kernel_version = true`. You must specify the minor engine version in one of the following formats:
     * - PostgreSQL: rds_postgres_&lt;Major engine version&gt;00_&lt;Minor engine version&gt;. Example: rds_postgres_1200_20200830.
     * - MySQL: &lt;RDS edition&gt;_&lt;Minor engine version&gt;. Examples: rds_20200229, xcluster_20200229, and xcluster80_20200229. The following RDS editions are supported:
     * - rds: The instance runs RDS Basic or High-availability Edition.
     * - xcluster: The instance runs MySQL 5.7 on RDS Enterprise Edition.
     * - xcluster80: The instance runs MySQL 8.0 on RDS Enterprise Edition.
     * - SQLServer: &lt;Minor engine version&gt;. Example: 15.0.4073.23.
     * 
     */
    @Export(name="targetMinorVersion", type=String.class, parameters={})
    private Output<String> targetMinorVersion;

    /**
     * @return The minor engine version to which you want to update the instance. If you do not specify this parameter, the instance is updated to the latest minor engine version. It is valid only when `upgrade_db_instance_kernel_version = true`. You must specify the minor engine version in one of the following formats:
     * - PostgreSQL: rds_postgres_&lt;Major engine version&gt;00_&lt;Minor engine version&gt;. Example: rds_postgres_1200_20200830.
     * - MySQL: &lt;RDS edition&gt;_&lt;Minor engine version&gt;. Examples: rds_20200229, xcluster_20200229, and xcluster80_20200229. The following RDS editions are supported:
     * - rds: The instance runs RDS Basic or High-availability Edition.
     * - xcluster: The instance runs MySQL 5.7 on RDS Enterprise Edition.
     * - xcluster80: The instance runs MySQL 8.0 on RDS Enterprise Edition.
     * - SQLServer: &lt;Minor engine version&gt;. Example: 15.0.4073.23.
     * 
     */
    public Output<String> targetMinorVersion() {
        return this.targetMinorVersion;
    }
    /**
     * Whether to upgrade a minor version of the kernel. Valid values:
     * - true: upgrade
     * - false: not to upgrade
     * 
     */
    @Export(name="upgradeDbInstanceKernelVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> upgradeDbInstanceKernelVersion;

    /**
     * @return Whether to upgrade a minor version of the kernel. Valid values:
     * - true: upgrade
     * - false: not to upgrade
     * 
     */
    public Output<Optional<Boolean>> upgradeDbInstanceKernelVersion() {
        return Codegen.optional(this.upgradeDbInstanceKernelVersion);
    }
    /**
     * The method to update the minor engine version. Default value: Immediate. It is valid only when `upgrade_db_instance_kernel_version = true`. Valid values:
     * - Immediate: The minor engine version is immediately updated.
     * - MaintainTime: The minor engine version is updated during the maintenance window. For more information about how to change the maintenance window, see ModifyDBInstanceMaintainTime.
     * - SpecifyTime: The minor engine version is updated at the point in time you specify.
     * 
     */
    @Export(name="upgradeTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> upgradeTime;

    /**
     * @return The method to update the minor engine version. Default value: Immediate. It is valid only when `upgrade_db_instance_kernel_version = true`. Valid values:
     * - Immediate: The minor engine version is immediately updated.
     * - MaintainTime: The minor engine version is updated during the maintenance window. For more information about how to change the maintenance window, see ModifyDBInstanceMaintainTime.
     * - SpecifyTime: The minor engine version is updated at the point in time you specify.
     * 
     */
    public Output<Optional<String>> upgradeTime() {
        return Codegen.optional(this.upgradeTime);
    }
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     * 
     */
    @Export(name="vswitchId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vswitchId;

    /**
     * @return The virtual switch ID to launch DB instances in one VPC.
     * 
     */
    public Output<Optional<String>> vswitchId() {
        return Codegen.optional(this.vswitchId);
    }
    /**
     * The network type of the IP address whitelist. Default value: MIX. Valid values:
     * - Classic: classic network in enhanced whitelist mode
     * - VPC: virtual private cloud (VPC) in enhanced whitelist mode
     * - MIX: standard whitelist mode
     * &gt; **NOTE:** In standard whitelist mode, IP addresses and CIDR blocks can be added only to the default IP address whitelist. In enhanced whitelist mode, IP addresses and CIDR blocks can be added to both IP address whitelists of the classic network type and those of the VPC network type.
     * 
     */
    @Export(name="whitelistNetworkType", type=String.class, parameters={})
    private Output</* @Nullable */ String> whitelistNetworkType;

    /**
     * @return The network type of the IP address whitelist. Default value: MIX. Valid values:
     * - Classic: classic network in enhanced whitelist mode
     * - VPC: virtual private cloud (VPC) in enhanced whitelist mode
     * - MIX: standard whitelist mode
     * &gt; **NOTE:** In standard whitelist mode, IP addresses and CIDR blocks can be added only to the default IP address whitelist. In enhanced whitelist mode, IP addresses and CIDR blocks can be added to both IP address whitelists of the classic network type and those of the VPC network type.
     * 
     */
    public Output<Optional<String>> whitelistNetworkType() {
        return Codegen.optional(this.whitelistNetworkType);
    }
    /**
     * The Zone to launch the DB instance.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The Zone to launch the DB instance.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReadOnlyInstance(String name) {
        this(name, ReadOnlyInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReadOnlyInstance(String name, ReadOnlyInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReadOnlyInstance(String name, ReadOnlyInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/readOnlyInstance:ReadOnlyInstance", name, args == null ? ReadOnlyInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReadOnlyInstance(String name, Output<String> id, @Nullable ReadOnlyInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/readOnlyInstance:ReadOnlyInstance", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static ReadOnlyInstance get(String name, Output<String> id, @Nullable ReadOnlyInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReadOnlyInstance(name, id, state, options);
    }
}
