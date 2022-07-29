// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dns.DnsDomainArgs;
import com.pulumi.alicloud.dns.inputs.DnsDomainState;
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
 * ## Example Usage
 * 
 * ## Import
 * 
 * DNS domain can be imported using the id or domain name, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:dns/dnsDomain:DnsDomain example aliyun.com
 * ```
 * 
 */
@ResourceType(type="alicloud:dns/dnsDomain:DnsDomain")
public class DnsDomain extends com.pulumi.resources.CustomResource {
    @Export(name="dnsServers", type=List.class, parameters={String.class})
    private Output<List<String>> dnsServers;

    public Output<List<String>> dnsServers() {
        return this.dnsServers;
    }
    /**
     * The domain ID.
     * 
     */
    @Export(name="domainId", type=String.class, parameters={})
    private Output<String> domainId;

    /**
     * @return The domain ID.
     * 
     */
    public Output<String> domainId() {
        return this.domainId;
    }
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return Name of the domain. This name without suffix can have a string of 1 to 63 characters(domain name subject, excluding suffix), must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     * 
     */
    @Export(name="groupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> groupId;

    /**
     * @return Id of the group in which the domain will add. If not supplied, then use default group.
     * 
     */
    public Output<Optional<String>> groupId() {
        return Codegen.optional(this.groupId);
    }
    @Export(name="groupName", type=String.class, parameters={})
    private Output<String> groupName;

    public Output<String> groupName() {
        return this.groupName;
    }
    /**
     * User language.
     * 
     */
    @Export(name="lang", type=String.class, parameters={})
    private Output</* @Nullable */ String> lang;

    /**
     * @return User language.
     * 
     */
    public Output<Optional<String>> lang() {
        return Codegen.optional(this.lang);
    }
    @Export(name="punyCode", type=String.class, parameters={})
    private Output<String> punyCode;

    public Output<String> punyCode() {
        return this.punyCode;
    }
    /**
     * Remarks information for your domain name.
     * 
     */
    @Export(name="remark", type=String.class, parameters={})
    private Output</* @Nullable */ String> remark;

    /**
     * @return Remarks information for your domain name.
     * 
     */
    public Output<Optional<String>> remark() {
        return Codegen.optional(this.remark);
    }
    /**
     * The Id of resource group which the dns domain belongs.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output<String> resourceGroupId;

    /**
     * @return The Id of resource group which the dns domain belongs.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DnsDomain(String name) {
        this(name, DnsDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DnsDomain(String name, DnsDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DnsDomain(String name, DnsDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dns/dnsDomain:DnsDomain", name, args == null ? DnsDomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DnsDomain(String name, Output<String> id, @Nullable DnsDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dns/dnsDomain:DnsDomain", name, state, makeResourceOptions(options, id));
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
    public static DnsDomain get(String name, Output<String> id, @Nullable DnsDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DnsDomain(name, id, state, options);
    }
}
