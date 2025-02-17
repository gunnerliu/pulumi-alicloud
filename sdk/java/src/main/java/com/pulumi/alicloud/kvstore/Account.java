// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kvstore;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.kvstore.AccountArgs;
import com.pulumi.alicloud.kvstore.inputs.AccountState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a KVStore Account resource.
 * 
 * For information about KVStore Account and how to use it, see [What is Account](https://www.alibabacloud.com/help/doc-detail/95973.htm).
 * 
 * &gt; **NOTE:** Available since v1.66.0.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.kvstore.KvstoreFunctions;
 * import com.pulumi.alicloud.kvstore.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.kvstore.Instance;
 * import com.pulumi.alicloud.kvstore.InstanceArgs;
 * import com.pulumi.alicloud.kvstore.Account;
 * import com.pulumi.alicloud.kvstore.AccountArgs;
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
 *         final var defaultZones = KvstoreFunctions.getZones();
 * 
 *         final var defaultResourceGroups = ResourcemanagerFunctions.getResourceGroups(GetResourceGroupsArgs.builder()
 *             .status(&#34;OK&#34;)
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
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .dbInstanceName(name)
 *             .vswitchId(defaultSwitch.id())
 *             .resourceGroupId(defaultResourceGroups.applyValue(getResourceGroupsResult -&gt; getResourceGroupsResult.ids()[0]))
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .instanceClass(&#34;redis.master.large.default&#34;)
 *             .instanceType(&#34;Redis&#34;)
 *             .engineVersion(&#34;5.0&#34;)
 *             .securityIps(&#34;10.23.12.24&#34;)
 *             .config(Map.ofEntries(
 *                 Map.entry(&#34;appendonly&#34;, &#34;yes&#34;),
 *                 Map.entry(&#34;lazyfree-lazy-eviction&#34;, &#34;yes&#34;)
 *             ))
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Created&#34;, &#34;TF&#34;),
 *                 Map.entry(&#34;For&#34;, &#34;example&#34;)
 *             ))
 *             .build());
 * 
 *         var defaultAccount = new Account(&#34;defaultAccount&#34;, AccountArgs.builder()        
 *             .accountName(&#34;tfexamplename&#34;)
 *             .accountPassword(&#34;YourPassword_123&#34;)
 *             .instanceId(defaultInstance.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * KVStore account can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:kvstore/account:Account example &lt;instance_id&gt;:&lt;account_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:kvstore/account:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * The name of the account. The name must meet the following requirements:
     * * The name can contain lowercase letters, digits, and hyphens (-), and must start with a lowercase letter.
     * * The name can be up to 100 characters in length.
     * * The name cannot be one of the reserved words in the [Reserved words for Redis account names](https://www.alibabacloud.com/help/zh/doc-detail/92665.htm) section.
     * 
     */
    @Export(name="accountName", refs={String.class}, tree="[0]")
    private Output<String> accountName;

    /**
     * @return The name of the account. The name must meet the following requirements:
     * * The name can contain lowercase letters, digits, and hyphens (-), and must start with a lowercase letter.
     * * The name can be up to 100 characters in length.
     * * The name cannot be one of the reserved words in the [Reserved words for Redis account names](https://www.alibabacloud.com/help/zh/doc-detail/92665.htm) section.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * The password of the account. The password must be 8 to 32 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!@ # $ % ^ &amp; * ( ) _ + - =`. You have to specify one of `account_password` and `kms_encrypted_password` fields.
     * 
     */
    @Export(name="accountPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountPassword;

    /**
     * @return The password of the account. The password must be 8 to 32 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!@ # $ % ^ &amp; * ( ) _ + - =`. You have to specify one of `account_password` and `kms_encrypted_password` fields.
     * 
     */
    public Output<Optional<String>> accountPassword() {
        return Codegen.optional(this.accountPassword);
    }
    /**
     * The privilege of account access database. Default value: `RoleReadWrite`
     * 
     */
    @Export(name="accountPrivilege", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountPrivilege;

    /**
     * @return The privilege of account access database. Default value: `RoleReadWrite`
     * 
     */
    public Output<Optional<String>> accountPrivilege() {
        return Codegen.optional(this.accountPrivilege);
    }
    /**
     * Privilege type of account.
     * - Normal: Common privilege.
     *   Default to Normal.
     * 
     */
    @Export(name="accountType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountType;

    /**
     * @return Privilege type of account.
     * - Normal: Common privilege.
     *   Default to Normal.
     * 
     */
    public Output<Optional<String>> accountType() {
        return Codegen.optional(this.accountType);
    }
    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The Id of instance in which account belongs (The engine version of instance must be 4.0 or 4.0+).
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The Id of instance in which account belongs (The engine version of instance must be 4.0 or 4.0+).
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * An KMS encrypts password used to a KVStore account. If the `account_password` is filled in, this field will be ignored.
     * 
     */
    @Export(name="kmsEncryptedPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsEncryptedPassword;

    /**
     * @return An KMS encrypts password used to a KVStore account. If the `account_password` is filled in, this field will be ignored.
     * 
     */
    public Output<Optional<String>> kmsEncryptedPassword() {
        return Codegen.optional(this.kmsEncryptedPassword);
    }
    /**
     * An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a KVStore account with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
     * 
     */
    @Export(name="kmsEncryptionContext", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> kmsEncryptionContext;

    /**
     * @return An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a KVStore account with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
     * 
     */
    public Output<Optional<Map<String,Object>>> kmsEncryptionContext() {
        return Codegen.optional(this.kmsEncryptionContext);
    }
    /**
     * The status of KVStore Account.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of KVStore Account.
     * 
     */
    public Output<String> status() {
        return this.status;
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
        super("alicloud:kvstore/account:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Account(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:kvstore/account:Account", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "accountPassword"
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
    public static Account get(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, state, options);
    }
}
