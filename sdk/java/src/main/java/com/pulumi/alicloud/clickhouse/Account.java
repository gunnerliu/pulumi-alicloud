// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.clickhouse;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.clickhouse.AccountArgs;
import com.pulumi.alicloud.clickhouse.inputs.AccountState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Click House Account resource.
 * 
 * For information about Click House Account and how to use it, see [What is Account](https://www.alibabacloud.com/product/clickhouse).
 * 
 * &gt; **NOTE:** Available in v1.134.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Click House Account can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:clickhouse/account:Account example &lt;db_cluster_id&gt;:&lt;account_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:clickhouse/account:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
     * 
     */
    @Export(name="accountDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> accountDescription;

    /**
     * @return In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
     * 
     */
    public Output<Optional<String>> accountDescription() {
        return Codegen.optional(this.accountDescription);
    }
    /**
     * Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
     * 
     */
    @Export(name="accountName", type=String.class, parameters={})
    private Output<String> accountName;

    /**
     * @return Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^&amp; author (s):_+-=) in a length of 8-32 bit.
     * 
     */
    @Export(name="accountPassword", type=String.class, parameters={})
    private Output<String> accountPassword;

    /**
     * @return The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^&amp; author (s):_+-=) in a length of 8-32 bit.
     * 
     */
    public Output<String> accountPassword() {
        return this.accountPassword;
    }
    /**
     * The list of databases to which you want to grant permissions. Separate databases with commas (,).
     * 
     */
    @Export(name="allowDatabases", type=String.class, parameters={})
    private Output<String> allowDatabases;

    /**
     * @return The list of databases to which you want to grant permissions. Separate databases with commas (,).
     * 
     */
    public Output<String> allowDatabases() {
        return this.allowDatabases;
    }
    /**
     * The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
     * 
     */
    @Export(name="allowDictionaries", type=String.class, parameters={})
    private Output<String> allowDictionaries;

    /**
     * @return The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
     * 
     */
    public Output<String> allowDictionaries() {
        return this.allowDictionaries;
    }
    /**
     * The db cluster id.
     * 
     */
    @Export(name="dbClusterId", type=String.class, parameters={})
    private Output<String> dbClusterId;

    /**
     * @return The db cluster id.
     * 
     */
    public Output<String> dbClusterId() {
        return this.dbClusterId;
    }
    /**
     * Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
     * -`true`: grants DDL permissions to the database account.
     * -`false`: does not grant DDL permissions to the database account.
     * 
     */
    @Export(name="ddlAuthority", type=Boolean.class, parameters={})
    private Output<Boolean> ddlAuthority;

    /**
     * @return Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
     * -`true`: grants DDL permissions to the database account.
     * -`false`: does not grant DDL permissions to the database account.
     * 
     */
    public Output<Boolean> ddlAuthority() {
        return this.ddlAuthority;
    }
    /**
     * Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
     * 
     */
    @Export(name="dmlAuthority", type=String.class, parameters={})
    private Output<String> dmlAuthority;

    /**
     * @return Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
     * 
     */
    public Output<String> dmlAuthority() {
        return this.dmlAuthority;
    }
    /**
     * The status of the resource. Valid Status: `Creating`,`Available`,`Deleting`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the resource. Valid Status: `Creating`,`Available`,`Deleting`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The list of all databases. Separate databases with commas (,).
     * 
     */
    @Export(name="totalDatabases", type=String.class, parameters={})
    private Output<String> totalDatabases;

    /**
     * @return The list of all databases. Separate databases with commas (,).
     * 
     */
    public Output<String> totalDatabases() {
        return this.totalDatabases;
    }
    /**
     * The list of all dictionaries. Separate dictionaries with commas (,).
     * 
     */
    @Export(name="totalDictionaries", type=String.class, parameters={})
    private Output<String> totalDictionaries;

    /**
     * @return The list of all dictionaries. Separate dictionaries with commas (,).
     * 
     */
    public Output<String> totalDictionaries() {
        return this.totalDictionaries;
    }
    /**
     * The type of the database account. Valid values: `Normal` or `Super`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the database account. Valid values: `Normal` or `Super`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Account(String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(String name, AccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:clickhouse/account:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Account(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:clickhouse/account:Account", name, state, makeResourceOptions(options, id));
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
    public static Account get(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, state, options);
    }
}
