// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.PrefixListArgs;
import com.pulumi.alicloud.vpc.inputs.PrefixListState;
import com.pulumi.alicloud.vpc.outputs.PrefixListEntry;
import com.pulumi.alicloud.vpc.outputs.PrefixListPrefixListAssociation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Vpc Prefix List resource. This resource is used to create a prefix list.
 * 
 * For information about Vpc Prefix List and how to use it, see [What is Prefix List](https://www.alibabacloud.com/help/zh/virtual-private-cloud/latest/creatvpcprefixlist).
 * 
 * &gt; **NOTE:** Available in v1.182.0+.
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
 * import com.pulumi.alicloud.resourcemanager.ResourceGroup;
 * import com.pulumi.alicloud.resourcemanager.ResourceGroupArgs;
 * import com.pulumi.alicloud.vpc.PrefixList;
 * import com.pulumi.alicloud.vpc.PrefixListArgs;
 * import com.pulumi.alicloud.vpc.inputs.PrefixListEntryArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-testacc-example&#34;);
 *         var defaultRg = new ResourceGroup(&#34;defaultRg&#34;, ResourceGroupArgs.builder()        
 *             .displayName(&#34;tf-testacc-chenyi&#34;)
 *             .resourceGroupName(name)
 *             .build());
 * 
 *         var changeRg = new ResourceGroup(&#34;changeRg&#34;, ResourceGroupArgs.builder()        
 *             .displayName(&#34;tf-testacc-chenyi-change&#34;)
 *             .resourceGroupName(String.format(&#34;%s1&#34;, name))
 *             .build());
 * 
 *         var default_ = new PrefixList(&#34;default&#34;, PrefixListArgs.builder()        
 *             .maxEntries(50)
 *             .resourceGroupId(defaultRg.id())
 *             .prefixListDescription(&#34;test&#34;)
 *             .ipVersion(&#34;IPV4&#34;)
 *             .prefixListName(name)
 *             .entrys(PrefixListEntryArgs.builder()
 *                 .cidr(&#34;192.168.0.0/16&#34;)
 *                 .description(&#34;test&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Vpc Prefix List can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:vpc/prefixList:PrefixList example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/prefixList:PrefixList")
public class PrefixList extends com.pulumi.resources.CustomResource {
    /**
     * The time when the prefix list was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time when the prefix list was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The CIDR address block list of the prefix list.See the following `Block Entrys`.
     * 
     */
    @Export(name="entrys", refs={List.class,PrefixListEntry.class}, tree="[0,1]")
    private Output</* @Nullable */ List<PrefixListEntry>> entrys;

    /**
     * @return The CIDR address block list of the prefix list.See the following `Block Entrys`.
     * 
     */
    public Output<Optional<List<PrefixListEntry>>> entrys() {
        return Codegen.optional(this.entrys);
    }
    /**
     * The IP version of the prefix list. Value:-**IPV4**:IPv4 version.-**IPV6**:IPv6 version.
     * 
     */
    @Export(name="ipVersion", refs={String.class}, tree="[0]")
    private Output<String> ipVersion;

    /**
     * @return The IP version of the prefix list. Value:-**IPV4**:IPv4 version.-**IPV6**:IPv6 version.
     * 
     */
    public Output<String> ipVersion() {
        return this.ipVersion;
    }
    /**
     * The maximum number of entries for CIDR address blocks in the prefix list.
     * 
     */
    @Export(name="maxEntries", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxEntries;

    /**
     * @return The maximum number of entries for CIDR address blocks in the prefix list.
     * 
     */
    public Output<Integer> maxEntries() {
        return this.maxEntries;
    }
    /**
     * The association list information of the prefix list.
     * 
     */
    @Export(name="prefixListAssociations", refs={List.class,PrefixListPrefixListAssociation.class}, tree="[0,1]")
    private Output<List<PrefixListPrefixListAssociation>> prefixListAssociations;

    /**
     * @return The association list information of the prefix list.
     * 
     */
    public Output<List<PrefixListPrefixListAssociation>> prefixListAssociations() {
        return this.prefixListAssociations;
    }
    /**
     * The description of the prefix list.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="prefixListDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> prefixListDescription;

    /**
     * @return The description of the prefix list.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> prefixListDescription() {
        return Codegen.optional(this.prefixListDescription);
    }
    /**
     * The ID of the query Prefix List.
     * 
     */
    @Export(name="prefixListId", refs={String.class}, tree="[0]")
    private Output<String> prefixListId;

    /**
     * @return The ID of the query Prefix List.
     * 
     */
    public Output<String> prefixListId() {
        return this.prefixListId;
    }
    /**
     * The name of the prefix list. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
     * 
     */
    @Export(name="prefixListName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> prefixListName;

    /**
     * @return The name of the prefix list. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
     * 
     */
    public Output<Optional<String>> prefixListName() {
        return Codegen.optional(this.prefixListName);
    }
    /**
     * The ID of the resource group to which the PrefixList belongs.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the PrefixList belongs.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The share type of the prefix list. Value:-**Shared**: indicates that the prefix list is a Shared prefix list.-Null: indicates that the prefix list is not a shared prefix list.
     * 
     */
    @Export(name="shareType", refs={String.class}, tree="[0]")
    private Output<String> shareType;

    /**
     * @return The share type of the prefix list. Value:-**Shared**: indicates that the prefix list is a Shared prefix list.-Null: indicates that the prefix list is not a shared prefix list.
     * 
     */
    public Output<String> shareType() {
        return this.shareType;
    }
    /**
     * Resource attribute fields that represent the status of the resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Resource attribute fields that represent the status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tags of PrefixList.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return The tags of PrefixList.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrefixList(String name) {
        this(name, PrefixListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrefixList(String name, @Nullable PrefixListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrefixList(String name, @Nullable PrefixListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/prefixList:PrefixList", name, args == null ? PrefixListArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrefixList(String name, Output<String> id, @Nullable PrefixListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/prefixList:PrefixList", name, state, makeResourceOptions(options, id));
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
    public static PrefixList get(String name, Output<String> id, @Nullable PrefixListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrefixList(name, id, state, options);
    }
}
