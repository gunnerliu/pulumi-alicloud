// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ram.SecurityPreferenceArgs;
import com.pulumi.alicloud.ram.inputs.SecurityPreferenceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a RAM Security Preference resource.
 * 
 * For information about RAM Security Preference and how to use it, see [What is Security Preference](https://www.alibabacloud.com/help/en/doc-detail/186694.htm).
 * 
 * &gt; **NOTE:** Available since v1.152.0.
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
 * import com.pulumi.alicloud.ram.SecurityPreference;
 * import com.pulumi.alicloud.ram.SecurityPreferenceArgs;
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
 *         var example = new SecurityPreference(&#34;example&#34;, SecurityPreferenceArgs.builder()        
 *             .allowUserToChangePassword(true)
 *             .enableSaveMfaTicket(false)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * RAM Security Preference can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ram/securityPreference:SecurityPreference example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ram/securityPreference:SecurityPreference")
public class SecurityPreference extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether RAM users can change their passwords. Valid values: `true` and `false`
     * 
     */
    @Export(name="allowUserToChangePassword", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> allowUserToChangePassword;

    /**
     * @return Specifies whether RAM users can change their passwords. Valid values: `true` and `false`
     * 
     */
    public Output<Boolean> allowUserToChangePassword() {
        return this.allowUserToChangePassword;
    }
    /**
     * Specifies whether RAM users can manage their AccessKey pairs. Valid values: `true` and `false`
     * 
     */
    @Export(name="allowUserToManageAccessKeys", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> allowUserToManageAccessKeys;

    /**
     * @return Specifies whether RAM users can manage their AccessKey pairs. Valid values: `true` and `false`
     * 
     */
    public Output<Boolean> allowUserToManageAccessKeys() {
        return this.allowUserToManageAccessKeys;
    }
    /**
     * Specifies whether RAM users can manage their MFA devices. Valid values: `true` and `false`
     * 
     */
    @Export(name="allowUserToManageMfaDevices", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> allowUserToManageMfaDevices;

    /**
     * @return Specifies whether RAM users can manage their MFA devices. Valid values: `true` and `false`
     * 
     */
    public Output<Boolean> allowUserToManageMfaDevices() {
        return this.allowUserToManageMfaDevices;
    }
    /**
     * Specifies whether to remember the MFA devices for seven days. Valid values: `true` and `false`
     * 
     */
    @Export(name="enableSaveMfaTicket", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableSaveMfaTicket;

    /**
     * @return Specifies whether to remember the MFA devices for seven days. Valid values: `true` and `false`
     * 
     */
    public Output<Boolean> enableSaveMfaTicket() {
        return this.enableSaveMfaTicket;
    }
    /**
     * Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console by using usernames and passwords. Valid values: `true` and `false`
     * 
     */
    @Export(name="enforceMfaForLogin", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enforceMfaForLogin;

    /**
     * @return Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console by using usernames and passwords. Valid values: `true` and `false`
     * 
     */
    public Output<Boolean> enforceMfaForLogin() {
        return this.enforceMfaForLogin;
    }
    /**
     * The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). However, this parameter does not take effect on API calls that are authenticated by using AccessKey pairs.**NOTE:** You can specify up to 25 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.
     * * If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.
     * * If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.
     * * If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.
     * 
     */
    @Export(name="loginNetworkMasks", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> loginNetworkMasks;

    /**
     * @return The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). However, this parameter does not take effect on API calls that are authenticated by using AccessKey pairs.**NOTE:** You can specify up to 25 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.
     * * If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.
     * * If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.
     * * If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.
     * 
     */
    public Output<Optional<String>> loginNetworkMasks() {
        return Codegen.optional(this.loginNetworkMasks);
    }
    /**
     * The validity period of the logon session of RAM users. Valid values: 6 to 24. Unit: hours. Default value: 6.
     * 
     */
    @Export(name="loginSessionDuration", refs={Integer.class}, tree="[0]")
    private Output<Integer> loginSessionDuration;

    /**
     * @return The validity period of the logon session of RAM users. Valid values: 6 to 24. Unit: hours. Default value: 6.
     * 
     */
    public Output<Integer> loginSessionDuration() {
        return this.loginSessionDuration;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityPreference(String name) {
        this(name, SecurityPreferenceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityPreference(String name, @Nullable SecurityPreferenceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityPreference(String name, @Nullable SecurityPreferenceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/securityPreference:SecurityPreference", name, args == null ? SecurityPreferenceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecurityPreference(String name, Output<String> id, @Nullable SecurityPreferenceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/securityPreference:SecurityPreference", name, state, makeResourceOptions(options, id));
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
    public static SecurityPreference get(String name, Output<String> id, @Nullable SecurityPreferenceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecurityPreference(name, id, state, options);
    }
}
