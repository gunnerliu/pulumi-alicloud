// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.resourcemanager.AccountArgs;
import com.pulumi.alicloud.resourcemanager.inputs.AccountState;
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
 * Provides a Resource Manager Account resource. Member accounts are containers for resources in a resource directory. These accounts isolate resources and serve as organizational units in the resource directory. You can create member accounts in a folder and then manage them in a unified manner.
 * For information about Resource Manager Account and how to use it, see [What is Resource Manager Account](https://www.alibabacloud.com/help/en/doc-detail/111231.htm).
 * 
 * &gt; **NOTE:** Available since v1.83.0.
 * 
 * &gt; **NOTE:** From version 1.188.0, the resource can be destroyed. The member deletion feature is in invitational preview. You can contact the service manager of Alibaba Cloud to apply for a trial. see [how to destroy it](https://www.alibabacloud.com/help/en/resource-management/latest/delete-account).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.resourcemanager.Folder;
 * import com.pulumi.alicloud.resourcemanager.FolderArgs;
 * import com.pulumi.alicloud.resourcemanager.Account;
 * import com.pulumi.alicloud.resourcemanager.AccountArgs;
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
 *         final var displayName = config.get(&#34;displayName&#34;).orElse(&#34;EAccount&#34;);
 *         var exampleFolder = new Folder(&#34;exampleFolder&#34;, FolderArgs.builder()        
 *             .folderName(name)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .displayName(displayName)
 *             .folderId(exampleFolder.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Deleting `alicloud.resourcemanager.Account` or removing it from your configuration
 * 
 * Deleting the resource manager account or removing it from your configuration will remove it from your state file and management,
 * but may not destroy the account. If there are some dependent resource in the account,
 * the deleting account will enter a silence period of 45 days. After the silence period ends,
 * the system automatically starts to delete the member. [See More Details](https://www.alibabacloud.com/help/en/resource-management/latest/delete-resource-account).
 * 
 * ## Import
 * 
 * Resource Manager Account can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:resourcemanager/account:Account example 13148890145*****
 * ```
 * 
 */
@ResourceType(type="alicloud:resourcemanager/account:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * The IDs of the check items that you can choose to ignore for the member deletion.
     * If you want to delete the account, please use datasource `alicloud.resourcemanager.getAccountDeletionCheckTask`
     * to get check ids and set them.
     * 
     */
    @Export(name="abandonAbleCheckIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> abandonAbleCheckIds;

    /**
     * @return The IDs of the check items that you can choose to ignore for the member deletion.
     * If you want to delete the account, please use datasource `alicloud.resourcemanager.getAccountDeletionCheckTask`
     * to get check ids and set them.
     * 
     */
    public Output<Optional<List<String>>> abandonAbleCheckIds() {
        return Codegen.optional(this.abandonAbleCheckIds);
    }
    /**
     * The name prefix of account.
     * 
     */
    @Export(name="accountNamePrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountNamePrefix;

    /**
     * @return The name prefix of account.
     * 
     */
    public Output<Optional<String>> accountNamePrefix() {
        return Codegen.optional(this.accountNamePrefix);
    }
    /**
     * Member name. The length is 2 ~ 50 characters or Chinese characters, which can include Chinese characters, English letters, numbers, underscores (_), dots (.) And dashes (-).
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return Member name. The length is 2 ~ 50 characters or Chinese characters, which can include Chinese characters, English letters, numbers, underscores (_), dots (.) And dashes (-).
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The ID of the parent folder.
     * 
     */
    @Export(name="folderId", refs={String.class}, tree="[0]")
    private Output<String> folderId;

    /**
     * @return The ID of the parent folder.
     * 
     */
    public Output<String> folderId() {
        return this.folderId;
    }
    /**
     * Ways for members to join the resource directory. Valid values: `invited`, `created`.
     * 
     */
    @Export(name="joinMethod", refs={String.class}, tree="[0]")
    private Output<String> joinMethod;

    /**
     * @return Ways for members to join the resource directory. Valid values: `invited`, `created`.
     * 
     */
    public Output<String> joinMethod() {
        return this.joinMethod;
    }
    /**
     * The time when the member joined the resource directory.
     * 
     */
    @Export(name="joinTime", refs={String.class}, tree="[0]")
    private Output<String> joinTime;

    /**
     * @return The time when the member joined the resource directory.
     * 
     */
    public Output<String> joinTime() {
        return this.joinTime;
    }
    /**
     * The modification time of the invitation.
     * 
     */
    @Export(name="modifyTime", refs={String.class}, tree="[0]")
    private Output<String> modifyTime;

    /**
     * @return The modification time of the invitation.
     * 
     */
    public Output<String> modifyTime() {
        return this.modifyTime;
    }
    /**
     * The ID of the billing account. If you leave this parameter empty, the current account is used as the billing account.
     * 
     */
    @Export(name="payerAccountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> payerAccountId;

    /**
     * @return The ID of the billing account. If you leave this parameter empty, the current account is used as the billing account.
     * 
     */
    public Output<Optional<String>> payerAccountId() {
        return Codegen.optional(this.payerAccountId);
    }
    /**
     * Resource directory ID.
     * 
     */
    @Export(name="resourceDirectoryId", refs={String.class}, tree="[0]")
    private Output<String> resourceDirectoryId;

    /**
     * @return Resource directory ID.
     * 
     */
    public Output<String> resourceDirectoryId() {
        return this.resourceDirectoryId;
    }
    /**
     * Member joining status. Valid values: `CreateSuccess`,`CreateVerifying`,`CreateFailed`,`CreateExpired`,`CreateCancelled`,`PromoteVerifying`,`PromoteFailed`,`PromoteExpired`,`PromoteCancelled`,`PromoteSuccess`,`InviteSuccess`,`Removed`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Member joining status. Valid values: `CreateSuccess`,`CreateVerifying`,`CreateFailed`,`CreateExpired`,`CreateCancelled`,`PromoteVerifying`,`PromoteFailed`,`PromoteExpired`,`PromoteCancelled`,`PromoteSuccess`,`InviteSuccess`,`Removed`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     * &gt; **NOTE:** The member name must be unique within the resource directory.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     * &gt; **NOTE:** The member name must be unique within the resource directory.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Member type. The value of `ResourceAccount` indicates the resource account.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Member type. The value of `ResourceAccount` indicates the resource account.
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
        super("alicloud:resourcemanager/account:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Account(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/account:Account", name, state, makeResourceOptions(options, id));
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
