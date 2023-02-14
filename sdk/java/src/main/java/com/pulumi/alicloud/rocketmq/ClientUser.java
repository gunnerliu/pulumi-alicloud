// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.rocketmq.ClientUserArgs;
import com.pulumi.alicloud.rocketmq.inputs.ClientUserState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Sag ClientUser resource. This topic describes how to manage accounts as an administrator. After you configure the network, you can create multiple accounts and distribute them to end users so that clients can access Alibaba Cloud.
 * 
 * For information about Sag ClientUser and how to use it, see [What is Sag ClientUser](https://www.alibabacloud.com/help/doc-detail/108326.htm).
 * 
 * &gt; **NOTE:** Available in 1.65.0+
 * 
 * &gt; **NOTE:** Only the following regions support. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]
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
 * import com.pulumi.alicloud.rocketmq.ClientUser;
 * import com.pulumi.alicloud.rocketmq.ClientUserArgs;
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
 *         var default_ = new ClientUser(&#34;default&#34;, ClientUserArgs.builder()        
 *             .bandwidth(&#34;20&#34;)
 *             .clientIp(&#34;192.1.10.0&#34;)
 *             .password(&#34;xxxxxxx&#34;)
 *             .sagId(&#34;sag-xxxxx&#34;)
 *             .userMail(&#34;tftest-xxxxx@test.com&#34;)
 *             .userName(&#34;th-username-xxxxx&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * The Sag ClientUser can be imported using the name, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:rocketmq/clientUser:ClientUser example sag-abc123456:tf-username-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:rocketmq/clientUser:ClientUser")
public class ClientUser extends com.pulumi.resources.CustomResource {
    /**
     * The SAG APP bandwidth that the user can use. Unit: Kbit/s. Maximum value: 2000 Kbit/s.
     * 
     */
    @Export(name="bandwidth", type=Integer.class, parameters={})
    private Output<Integer> bandwidth;

    /**
     * @return The SAG APP bandwidth that the user can use. Unit: Kbit/s. Maximum value: 2000 Kbit/s.
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }
    /**
     * The IP address of the SAG APP. If you specify this parameter, the current account always uses the specified IP address.Note The IP address must be in the private CIDR block of the SAG client.If you do not specify this parameter, the system automatically allocates an IP address from the private CIDR block of the SAG client. In this case, each re-connection uses a different IP address.
     * 
     */
    @Export(name="clientIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientIp;

    /**
     * @return The IP address of the SAG APP. If you specify this parameter, the current account always uses the specified IP address.Note The IP address must be in the private CIDR block of the SAG client.If you do not specify this parameter, the system automatically allocates an IP address from the private CIDR block of the SAG client. In this case, each re-connection uses a different IP address.
     * 
     */
    public Output<Optional<String>> clientIp() {
        return Codegen.optional(this.clientIp);
    }
    @Export(name="kmsEncryptedPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsEncryptedPassword;

    public Output<Optional<String>> kmsEncryptedPassword() {
        return Codegen.optional(this.kmsEncryptedPassword);
    }
    @Export(name="kmsEncryptionContext", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> kmsEncryptionContext;

    public Output<Optional<Map<String,Object>>> kmsEncryptionContext() {
        return Codegen.optional(this.kmsEncryptionContext);
    }
    /**
     * The password used to log on to the SAG APP.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return The password used to log on to the SAG APP.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * The ID of the SAG instance created for the SAG APP.
     * 
     */
    @Export(name="sagId", type=String.class, parameters={})
    private Output<String> sagId;

    /**
     * @return The ID of the SAG instance created for the SAG APP.
     * 
     */
    public Output<String> sagId() {
        return this.sagId;
    }
    /**
     * The email address of the user. The administrator uses this address to send the account information for logging on to the APP to the user.
     * 
     */
    @Export(name="userMail", type=String.class, parameters={})
    private Output<String> userMail;

    /**
     * @return The email address of the user. The administrator uses this address to send the account information for logging on to the APP to the user.
     * 
     */
    public Output<String> userMail() {
        return this.userMail;
    }
    /**
     * The user name. User names in the same SAG APP must be unique.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return The user name. User names in the same SAG APP must be unique.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClientUser(String name) {
        this(name, ClientUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClientUser(String name, ClientUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClientUser(String name, ClientUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rocketmq/clientUser:ClientUser", name, args == null ? ClientUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClientUser(String name, Output<String> id, @Nullable ClientUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rocketmq/clientUser:ClientUser", name, state, makeResourceOptions(options, id));
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
    public static ClientUser get(String name, Output<String> id, @Nullable ClientUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClientUser(name, id, state, options);
    }
}