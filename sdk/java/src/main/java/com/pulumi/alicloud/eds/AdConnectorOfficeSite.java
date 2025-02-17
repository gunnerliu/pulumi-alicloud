// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.eds.AdConnectorOfficeSiteArgs;
import com.pulumi.alicloud.eds.inputs.AdConnectorOfficeSiteState;
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
 * Provides a ECD Ad Connector Office Site resource.
 * 
 * For information about ECD Ad Connector Office Site and how to use it, see [What is Ad Connector Office Site](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-createadconnectorofficesite).
 * 
 * &gt; **NOTE:** Available since v1.176.0.
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
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceArgs;
 * import com.pulumi.alicloud.eds.AdConnectorOfficeSite;
 * import com.pulumi.alicloud.eds.AdConnectorOfficeSiteArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .cenInstanceName(name)
 *             .protectionLevel(&#34;REDUCED&#34;)
 *             .build());
 * 
 *         var defaultAdConnectorOfficeSite = new AdConnectorOfficeSite(&#34;defaultAdConnectorOfficeSite&#34;, AdConnectorOfficeSiteArgs.builder()        
 *             .adConnectorOfficeSiteName(name)
 *             .bandwidth(100)
 *             .cenId(defaultInstance.id())
 *             .cidrBlock(&#34;10.0.0.0/12&#34;)
 *             .desktopAccessType(&#34;INTERNET&#34;)
 *             .dnsAddresses(&#34;127.0.0.2&#34;)
 *             .domainName(&#34;corp.example.com&#34;)
 *             .domainPassword(&#34;Example1234&#34;)
 *             .domainUserName(&#34;sAMAccountName&#34;)
 *             .enableAdminAccess(false)
 *             .enableInternetAccess(false)
 *             .mfaEnabled(false)
 *             .subDomainDnsAddresses(&#34;127.0.0.3&#34;)
 *             .subDomainName(&#34;child.example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECD Ad Connector Office Site can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:eds/adConnectorOfficeSite:AdConnectorOfficeSite example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:eds/adConnectorOfficeSite:AdConnectorOfficeSite")
public class AdConnectorOfficeSite extends com.pulumi.resources.CustomResource {
    /**
     * The name of the workspace. The name must be 2 to 255 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain digits, colons (:), underscores (_), and hyphens (-).
     * 
     */
    @Export(name="adConnectorOfficeSiteName", refs={String.class}, tree="[0]")
    private Output<String> adConnectorOfficeSiteName;

    /**
     * @return The name of the workspace. The name must be 2 to 255 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain digits, colons (:), underscores (_), and hyphens (-).
     * 
     */
    public Output<String> adConnectorOfficeSiteName() {
        return this.adConnectorOfficeSiteName;
    }
    /**
     * The ad hostname.
     * 
     */
    @Export(name="adHostname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> adHostname;

    /**
     * @return The ad hostname.
     * 
     */
    public Output<Optional<String>> adHostname() {
        return Codegen.optional(this.adHostname);
    }
    /**
     * The maximum public bandwidth value. Valid values: 0 to 200. If you do not specify this parameter or you set this parameter to 0, Internet access is disabled.
     * 
     */
    @Export(name="bandwidth", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> bandwidth;

    /**
     * @return The maximum public bandwidth value. Valid values: 0 to 200. If you do not specify this parameter or you set this parameter to 0, Internet access is disabled.
     * 
     */
    public Output<Optional<Integer>> bandwidth() {
        return Codegen.optional(this.bandwidth);
    }
    /**
     * The ID of the CEN instance.
     * 
     */
    @Export(name="cenId", refs={String.class}, tree="[0]")
    private Output<String> cenId;

    /**
     * @return The ID of the CEN instance.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }
    /**
     * The cen owner id.
     * 
     */
    @Export(name="cenOwnerId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cenOwnerId;

    /**
     * @return The cen owner id.
     * 
     */
    public Output<Optional<String>> cenOwnerId() {
        return Codegen.optional(this.cenOwnerId);
    }
    /**
     * Workspace Corresponds to the Security Office Network of IPv4 Segment.
     * 
     */
    @Export(name="cidrBlock", refs={String.class}, tree="[0]")
    private Output<String> cidrBlock;

    /**
     * @return Workspace Corresponds to the Security Office Network of IPv4 Segment.
     * 
     */
    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * The method that you use to connect to cloud desktops. **Note:** The VPC connection method is provided by Alibaba Cloud PrivateLink. You are not charged for PrivateLink. When you set this parameter to VPC or Any, PrivateLink is automatically activated. Default value: `INTERNET`. Valid values:
     * 
     */
    @Export(name="desktopAccessType", refs={String.class}, tree="[0]")
    private Output<String> desktopAccessType;

    /**
     * @return The method that you use to connect to cloud desktops. **Note:** The VPC connection method is provided by Alibaba Cloud PrivateLink. You are not charged for PrivateLink. When you set this parameter to VPC or Any, PrivateLink is automatically activated. Default value: `INTERNET`. Valid values:
     * 
     */
    public Output<String> desktopAccessType() {
        return this.desktopAccessType;
    }
    /**
     * The IP address N of the DNS server of the enterprise AD system. You can specify only one IP address.
     * 
     */
    @Export(name="dnsAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dnsAddresses;

    /**
     * @return The IP address N of the DNS server of the enterprise AD system. You can specify only one IP address.
     * 
     */
    public Output<List<String>> dnsAddresses() {
        return this.dnsAddresses;
    }
    /**
     * The domain name of the enterprise AD system. You can register each domain name only once.
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return The domain name of the enterprise AD system. You can register each domain name only once.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The password of the domain administrator. The password can be up to 64 characters in length.
     * 
     */
    @Export(name="domainPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> domainPassword;

    /**
     * @return The password of the domain administrator. The password can be up to 64 characters in length.
     * 
     */
    public Output<Optional<String>> domainPassword() {
        return Codegen.optional(this.domainPassword);
    }
    /**
     * The username of the domain administrator. The username can be up to 64 characters in length.
     * 
     */
    @Export(name="domainUserName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> domainUserName;

    /**
     * @return The username of the domain administrator. The username can be up to 64 characters in length.
     * 
     */
    public Output<Optional<String>> domainUserName() {
        return Codegen.optional(this.domainUserName);
    }
    /**
     * Specifies whether to grant the permissions of the local administrator to the desktop users. Default value: true.
     * 
     */
    @Export(name="enableAdminAccess", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableAdminAccess;

    /**
     * @return Specifies whether to grant the permissions of the local administrator to the desktop users. Default value: true.
     * 
     */
    public Output<Boolean> enableAdminAccess() {
        return this.enableAdminAccess;
    }
    /**
     * Specifies whether to enable Internet access.
     * 
     */
    @Export(name="enableInternetAccess", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableInternetAccess;

    /**
     * @return Specifies whether to enable Internet access.
     * 
     */
    public Output<Boolean> enableInternetAccess() {
        return this.enableInternetAccess;
    }
    /**
     * Specifies whether to enable multi-factor authentication (MFA).
     * 
     */
    @Export(name="mfaEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> mfaEnabled;

    /**
     * @return Specifies whether to enable multi-factor authentication (MFA).
     * 
     */
    public Output<Optional<Boolean>> mfaEnabled() {
        return Codegen.optional(this.mfaEnabled);
    }
    /**
     * The protocol type. Valid values: `ASP`, `HDX`.
     * 
     */
    @Export(name="protocolType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> protocolType;

    /**
     * @return The protocol type. Valid values: `ASP`, `HDX`.
     * 
     */
    public Output<Optional<String>> protocolType() {
        return Codegen.optional(this.protocolType);
    }
    /**
     * The AD Connector specifications. Valid values: `1`, `2`.
     * 
     */
    @Export(name="specification", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> specification;

    /**
     * @return The AD Connector specifications. Valid values: `1`, `2`.
     * 
     */
    public Output<Optional<Integer>> specification() {
        return Codegen.optional(this.specification);
    }
    /**
     * The resource State.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The resource State.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The DNS address N of the enterprise AD subdomain. If you specify a value for the `sub_domain_name` parameter but you do not specify a value for this parameter, the DNS address of the subdomain is the same as the DNS address of the parent domain.
     * 
     */
    @Export(name="subDomainDnsAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> subDomainDnsAddresses;

    /**
     * @return The DNS address N of the enterprise AD subdomain. If you specify a value for the `sub_domain_name` parameter but you do not specify a value for this parameter, the DNS address of the subdomain is the same as the DNS address of the parent domain.
     * 
     */
    public Output<Optional<List<String>>> subDomainDnsAddresses() {
        return Codegen.optional(this.subDomainDnsAddresses);
    }
    /**
     * The domain name of the enterprise AD subdomain.
     * 
     */
    @Export(name="subDomainName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subDomainName;

    /**
     * @return The domain name of the enterprise AD subdomain.
     * 
     */
    public Output<Optional<String>> subDomainName() {
        return Codegen.optional(this.subDomainName);
    }
    /**
     * The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the SendVerifyCode operation to obtain the verification code.
     * 
     */
    @Export(name="verifyCode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> verifyCode;

    /**
     * @return The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the SendVerifyCode operation to obtain the verification code.
     * 
     */
    public Output<Optional<String>> verifyCode() {
        return Codegen.optional(this.verifyCode);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AdConnectorOfficeSite(String name) {
        this(name, AdConnectorOfficeSiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AdConnectorOfficeSite(String name, AdConnectorOfficeSiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AdConnectorOfficeSite(String name, AdConnectorOfficeSiteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eds/adConnectorOfficeSite:AdConnectorOfficeSite", name, args == null ? AdConnectorOfficeSiteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AdConnectorOfficeSite(String name, Output<String> id, @Nullable AdConnectorOfficeSiteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eds/adConnectorOfficeSite:AdConnectorOfficeSite", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "domainPassword"
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
    public static AdConnectorOfficeSite get(String name, Output<String> id, @Nullable AdConnectorOfficeSiteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AdConnectorOfficeSite(name, id, state, options);
    }
}
