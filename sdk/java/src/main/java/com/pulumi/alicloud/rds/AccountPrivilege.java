// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.rds.AccountPrivilegeArgs;
import com.pulumi.alicloud.rds.inputs.AccountPrivilegeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an RDS account privilege resource and used to grant several database some access privilege. A database can be granted by multiple account, see [What is DB Account Privilege](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-grantaccountprivilege).
 * 
 * &gt; **NOTE:** At present, a database can only have one database owner.
 * 
 * &gt; **NOTE:** Available since v1.5.0.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.rds.RdsFunctions;
 * import com.pulumi.alicloud.rds.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.rds.Instance;
 * import com.pulumi.alicloud.rds.InstanceArgs;
 * import com.pulumi.alicloud.rds.Database;
 * import com.pulumi.alicloud.rds.DatabaseArgs;
 * import com.pulumi.alicloud.rds.Account;
 * import com.pulumi.alicloud.rds.AccountArgs;
 * import com.pulumi.alicloud.rds.AccountPrivilege;
 * import com.pulumi.alicloud.rds.AccountPrivilegeArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf_example&#34;);
 *         final var defaultZones = RdsFunctions.getZones(GetZonesArgs.builder()
 *             .engine(&#34;MySQL&#34;)
 *             .engineVersion(&#34;5.6&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
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
 *         var instance = new Instance(&#34;instance&#34;, InstanceArgs.builder()        
 *             .engine(&#34;MySQL&#34;)
 *             .engineVersion(&#34;5.6&#34;)
 *             .instanceType(&#34;rds.mysql.s1.small&#34;)
 *             .instanceStorage(&#34;10&#34;)
 *             .vswitchId(defaultSwitch.id())
 *             .instanceName(name)
 *             .build());
 * 
 *         for (var i = 0; i &lt; 2; i++) {
 *             new Database(&#34;db-&#34; + i, DatabaseArgs.builder()            
 *                 .instanceId(instance.id())
 *                 .description(&#34;from terraform&#34;)
 *                 .build());
 * 
 *         
 * }
 *         var account = new Account(&#34;account&#34;, AccountArgs.builder()        
 *             .dbInstanceId(instance.id())
 *             .accountName(&#34;tfexample&#34;)
 *             .accountPassword(&#34;Example12345&#34;)
 *             .accountDescription(&#34;from terraform&#34;)
 *             .build());
 * 
 *         var privilege = new AccountPrivilege(&#34;privilege&#34;, AccountPrivilegeArgs.builder()        
 *             .instanceId(instance.id())
 *             .accountName(account.name())
 *             .privilege(&#34;ReadOnly&#34;)
 *             .dbNames(db.stream().map(element -&gt; element.name()).collect(toList()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * RDS account privilege can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:rds/accountPrivilege:AccountPrivilege example &#34;rm-12345:tf_account:ReadOnly&#34;
 * ```
 * 
 */
@ResourceType(type="alicloud:rds/accountPrivilege:AccountPrivilege")
public class AccountPrivilege extends com.pulumi.resources.CustomResource {
    /**
     * A specified account name.
     * 
     */
    @Export(name="accountName", refs={String.class}, tree="[0]")
    private Output<String> accountName;

    /**
     * @return A specified account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * List of specified database name.
     * 
     */
    @Export(name="dbNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dbNames;

    /**
     * @return List of specified database name.
     * 
     */
    public Output<List<String>> dbNames() {
        return this.dbNames;
    }
    /**
     * The Id of instance in which account belongs.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The Id of instance in which account belongs.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The privilege of one account access database. Valid values:
     * - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
     * - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
     * - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
     *   Default to &#34;ReadOnly&#34;.
     * 
     */
    @Export(name="privilege", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privilege;

    /**
     * @return The privilege of one account access database. Valid values:
     * - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
     * - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
     * - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
     * - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
     *   Default to &#34;ReadOnly&#34;.
     * 
     */
    public Output<Optional<String>> privilege() {
        return Codegen.optional(this.privilege);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountPrivilege(String name) {
        this(name, AccountPrivilegeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountPrivilege(String name, AccountPrivilegeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountPrivilege(String name, AccountPrivilegeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/accountPrivilege:AccountPrivilege", name, args == null ? AccountPrivilegeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccountPrivilege(String name, Output<String> id, @Nullable AccountPrivilegeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/accountPrivilege:AccountPrivilege", name, state, makeResourceOptions(options, id));
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
    public static AccountPrivilege get(String name, Output<String> id, @Nullable AccountPrivilegeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccountPrivilege(name, id, state, options);
    }
}
