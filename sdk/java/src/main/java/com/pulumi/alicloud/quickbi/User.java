// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quickbi;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.quickbi.UserArgs;
import com.pulumi.alicloud.quickbi.inputs.UserState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Quick BI User resource.
 * 
 * For information about Quick BI User and how to use it, see [What is User](https://www.alibabacloud.com/help/doc-detail/33813.htm).
 * 
 * &gt; **NOTE:** Available in v1.136.0+.
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
 * import com.pulumi.alicloud.quickbi.User;
 * import com.pulumi.alicloud.quickbi.UserArgs;
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
 *         var example = new User(&#34;example&#34;, UserArgs.builder()        
 *             .accountName(&#34;example_value&#34;)
 *             .adminUser(false)
 *             .authAdminUser(false)
 *             .nickName(&#34;example_value&#34;)
 *             .userType(&#34;Analyst&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Quick BI User can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:quickbi/user:User example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:quickbi/user:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * Alibaba Cloud account ID.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return Alibaba Cloud account ID.
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * An Alibaba Cloud account, Alibaba Cloud name.
     * 
     */
    @Export(name="accountName", refs={String.class}, tree="[0]")
    private Output<String> accountName;

    /**
     * @return An Alibaba Cloud account, Alibaba Cloud name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * Whether it is the administrator. Valid values: `true` and `false`.
     * 
     */
    @Export(name="adminUser", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> adminUser;

    /**
     * @return Whether it is the administrator. Valid values: `true` and `false`.
     * 
     */
    public Output<Boolean> adminUser() {
        return this.adminUser;
    }
    /**
     * Whether this is a permissions administrator. Valid values: `false`, `true`.
     * 
     */
    @Export(name="authAdminUser", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> authAdminUser;

    /**
     * @return Whether this is a permissions administrator. Valid values: `false`, `true`.
     * 
     */
    public Output<Boolean> authAdminUser() {
        return this.authAdminUser;
    }
    /**
     * The nickname of the user.
     * 
     */
    @Export(name="nickName", refs={String.class}, tree="[0]")
    private Output<String> nickName;

    /**
     * @return The nickname of the user.
     * 
     */
    public Output<String> nickName() {
        return this.nickName;
    }
    /**
     * The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
     * 
     */
    @Export(name="userType", refs={String.class}, tree="[0]")
    private Output<String> userType;

    /**
     * @return The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
     * 
     */
    public Output<String> userType() {
        return this.userType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:quickbi/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:quickbi/user:User", name, state, makeResourceOptions(options, id));
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
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
