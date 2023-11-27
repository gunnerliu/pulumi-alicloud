// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.bastionhost.UserArgs;
import com.pulumi.alicloud.bastionhost.inputs.UserState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Bastion Host User resource.
 * 
 * For information about Bastion Host User and how to use it, see [What is User](https://www.alibabacloud.com/help/en/bastion-host/latest/api-yundun-bastionhost-2019-12-09-createuser).
 * 
 * &gt; **NOTE:** Available since v1.133.0.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.bastionhost.Instance;
 * import com.pulumi.alicloud.bastionhost.InstanceArgs;
 * import com.pulumi.alicloud.bastionhost.User;
 * import com.pulumi.alicloud.bastionhost.UserArgs;
 * import com.pulumi.alicloud.ram.User;
 * import com.pulumi.alicloud.ram.UserArgs;
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
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
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
 *             .description(name)
 *             .licenseCode(&#34;bhah_ent_50_asset&#34;)
 *             .planCode(&#34;cloudbastion&#34;)
 *             .storage(&#34;5&#34;)
 *             .bandwidth(&#34;5&#34;)
 *             .period(&#34;1&#34;)
 *             .vswitchId(defaultSwitch.id())
 *             .securityGroupIds(defaultSecurityGroup.id())
 *             .build());
 * 
 *         var localUser = new User(&#34;localUser&#34;, UserArgs.builder()        
 *             .instanceId(defaultInstance.id())
 *             .mobileCountryCode(&#34;CN&#34;)
 *             .mobile(&#34;13312345678&#34;)
 *             .password(&#34;YourPassword-123&#34;)
 *             .source(&#34;Local&#34;)
 *             .userName(String.format(&#34;%s_local_user&#34;, name))
 *             .build());
 * 
 *         var user = new User(&#34;user&#34;, UserArgs.builder()        
 *             .displayName(String.format(&#34;%s_bastionhost_user&#34;, name))
 *             .mobile(&#34;86-18688888888&#34;)
 *             .email(&#34;hello.uuu@aaa.com&#34;)
 *             .comments(&#34;yoyoyo&#34;)
 *             .force(true)
 *             .build());
 * 
 *         final var defaultAccount = AlicloudFunctions.getAccount();
 * 
 *         var ramUser = new User(&#34;ramUser&#34;, UserArgs.builder()        
 *             .instanceId(defaultInstance.id())
 *             .source(&#34;Ram&#34;)
 *             .sourceUserId(defaultAccount.applyValue(getAccountResult -&gt; getAccountResult.id()))
 *             .userName(user.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Bastion Host User can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:bastionhost/user:User example &lt;instance_id&gt;:&lt;user_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:bastionhost/user:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Specify the New Created the User&#39;s Display Name. Supports up to 128 Characters.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return Specify the New Created the User&#39;s Display Name. Supports up to 128 Characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Specify the New User&#39;s Mailbox.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> email;

    /**
     * @return Specify the New User&#39;s Mailbox.
     * 
     */
    public Output<Optional<String>> email() {
        return Codegen.optional(this.email);
    }
    /**
     * You Want to Query the User the Bastion Host ID of.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return You Want to Query the User the Bastion Host ID of.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Specify the New of the User That Created a Different Mobile Phone Number from Your.
     * 
     */
    @Export(name="mobile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mobile;

    /**
     * @return Specify the New of the User That Created a Different Mobile Phone Number from Your.
     * 
     */
    public Output<Optional<String>> mobile() {
        return Codegen.optional(this.mobile);
    }
    /**
     * Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN. Valid Values:
     * * CN: Mainland China (+86)
     * * HK: hong Kong, China (+852)
     * * MO: Macau, China (+853)
     * * TW: Taiwan, China (+886)
     * * RU: Russian (+7)
     * * SG: Singapore (+65)
     * * MY: malaysia (+60)
     * * ID: Indonesia (+62)
     * * DE: Germany (+49)
     * * AU: Australia (+61)
     * * US: United States (+1)
     * * AE: dubai (+971)
     * * JP: Japan (+81) Introducing the Long-Range
     * * GB: United Kingdom (+44)
     * * IN: India (+91)
     * * KR: South Korea (+82)
     * * PH: philippines (+63)
     * * CH: Switzerland (+41)
     * * SE: Sweden (+46)
     * 
     */
    @Export(name="mobileCountryCode", refs={String.class}, tree="[0]")
    private Output<String> mobileCountryCode;

    /**
     * @return Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN. Valid Values:
     * * CN: Mainland China (+86)
     * * HK: hong Kong, China (+852)
     * * MO: Macau, China (+853)
     * * TW: Taiwan, China (+886)
     * * RU: Russian (+7)
     * * SG: Singapore (+65)
     * * MY: malaysia (+60)
     * * ID: Indonesia (+62)
     * * DE: Germany (+49)
     * * AU: Australia (+61)
     * * US: United States (+1)
     * * AE: dubai (+971)
     * * JP: Japan (+81) Introducing the Long-Range
     * * GB: United Kingdom (+44)
     * * IN: India (+91)
     * * KR: South Korea (+82)
     * * PH: philippines (+63)
     * * CH: Switzerland (+41)
     * * SE: Sweden (+46)
     * 
     */
    public Output<String> mobileCountryCode() {
        return this.mobileCountryCode;
    }
    /**
     * Specify the New User&#39;s Password. Supports up to 128 Characters. Description of the New User as the Source of the Local User That Is, Source Value for Local, this Parameter Is Required.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return Specify the New User&#39;s Password. Supports up to 128 Characters. Description of the New User as the Source of the Local User That Is, Source Value for Local, this Parameter Is Required.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * Specify the New of the User That Created the Source. Valid Values:
     * * Local: Local User
     * * Ram: Ram User
     * * AD: AD-authenticated User
     * * LDAP: LDAP-authenticated User
     * &gt; **NOTE:** From version 1.199.0, `source` can be set to `AD`, `LDAP`.
     * 
     */
    @Export(name="source", refs={String.class}, tree="[0]")
    private Output<String> source;

    /**
     * @return Specify the New of the User That Created the Source. Valid Values:
     * * Local: Local User
     * * Ram: Ram User
     * * AD: AD-authenticated User
     * * LDAP: LDAP-authenticated User
     * &gt; **NOTE:** From version 1.199.0, `source` can be set to `AD`, `LDAP`.
     * 
     */
    public Output<String> source() {
        return this.source;
    }
    /**
     * Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User&#39;s Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
     * 
     */
    @Export(name="sourceUserId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceUserId;

    /**
     * @return Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User&#39;s Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
     * 
     */
    public Output<Optional<String>> sourceUserId() {
        return Codegen.optional(this.sourceUserId);
    }
    /**
     * The status of the resource. Valid values: `Frozen`, `Normal`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource. Valid values: `Frozen`, `Normal`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The User ID.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The User ID.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }
    /**
     * Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output<String> userName;

    /**
     * @return Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
     * 
     */
    public Output<String> userName() {
        return this.userName;
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
        super("alicloud:bastionhost/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:bastionhost/user:User", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
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
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
