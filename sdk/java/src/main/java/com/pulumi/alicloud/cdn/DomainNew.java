// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cdn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cdn.DomainNewArgs;
import com.pulumi.alicloud.cdn.inputs.DomainNewState;
import com.pulumi.alicloud.cdn.outputs.DomainNewCertificateConfig;
import com.pulumi.alicloud.cdn.outputs.DomainNewSource;
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
 * Provides a CDN Domain resource. CDN domain name.
 * 
 * For information about CDN Domain and how to use it, see [What is Domain](https://www.alibabacloud.com/help/en/cdn/developer-reference/api-cdn-2018-05-10-addcdndomain).
 * 
 * &gt; **NOTE:** Available since v1.34.0.
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
 * import com.pulumi.alicloud.cdn.DomainNew;
 * import com.pulumi.alicloud.cdn.DomainNewArgs;
 * import com.pulumi.alicloud.cdn.inputs.DomainNewSourceArgs;
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
 *         final var domainName = config.get(&#34;domainName&#34;).orElse(&#34;mycdndomain.alicloud-provider.cn&#34;);
 *         var default_ = new DomainNew(&#34;default&#34;, DomainNewArgs.builder()        
 *             .scope(&#34;overseas&#34;)
 *             .domainName(domainName)
 *             .cdnType(&#34;web&#34;)
 *             .sources(DomainNewSourceArgs.builder()
 *                 .type(&#34;ipaddr&#34;)
 *                 .content(&#34;1.1.1.1&#34;)
 *                 .priority(20)
 *                 .port(80)
 *                 .weight(15)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * CDN Domain can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cdn/domainNew:DomainNew example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cdn/domainNew:DomainNew")
public class DomainNew extends com.pulumi.resources.CustomResource {
    /**
     * Cdn type of the accelerated domain. Valid values are `web`, `download`, `video`.
     * 
     */
    @Export(name="cdnType", refs={String.class}, tree="[0]")
    private Output<String> cdnType;

    /**
     * @return Cdn type of the accelerated domain. Valid values are `web`, `download`, `video`.
     * 
     */
    public Output<String> cdnType() {
        return this.cdnType;
    }
    /**
     * Certificate configuration. See `certificate_config` below.
     * 
     */
    @Export(name="certificateConfig", refs={DomainNewCertificateConfig.class}, tree="[0]")
    private Output<DomainNewCertificateConfig> certificateConfig;

    /**
     * @return Certificate configuration. See `certificate_config` below.
     * 
     */
    public Output<DomainNewCertificateConfig> certificateConfig() {
        return this.certificateConfig;
    }
    /**
     * Health test URL.
     * 
     */
    @Export(name="checkUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> checkUrl;

    /**
     * @return Health test URL.
     * 
     */
    public Output<Optional<String>> checkUrl() {
        return Codegen.optional(this.checkUrl);
    }
    /**
     * The CNAME domain name corresponding to the accelerated domain name.
     * 
     */
    @Export(name="cname", refs={String.class}, tree="[0]")
    private Output<String> cname;

    /**
     * @return The CNAME domain name corresponding to the accelerated domain name.
     * 
     */
    public Output<String> cname() {
        return this.cname;
    }
    /**
     * Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * Scope of the accelerated domain. Valid values are `domestic`, `overseas`, `global`. Default value is `domestic`. This parameter&#39;s setting is valid Only for the international users and domestic L3 and above users. Value:
     * - **domestic**: Mainland China only.
     * - **overseas**: Global (excluding Mainland China).
     * - **global**: global.
     *   The default value is **domestic**.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return Scope of the accelerated domain. Valid values are `domestic`, `overseas`, `global`. Default value is `domestic`. This parameter&#39;s setting is valid Only for the international users and domestic L3 and above users. Value:
     * - **domestic**: Mainland China only.
     * - **overseas**: Global (excluding Mainland China).
     * - **global**: global.
     *   The default value is **domestic**.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * The source address list of the accelerated domain. Defaults to null. See `sources` below.
     * 
     */
    @Export(name="sources", refs={List.class,DomainNewSource.class}, tree="[0,1]")
    private Output<List<DomainNewSource>> sources;

    /**
     * @return The source address list of the accelerated domain. Defaults to null. See `sources` below.
     * 
     */
    public Output<List<DomainNewSource>> sources() {
        return this.sources;
    }
    /**
     * The status of the resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tag of the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return The tag of the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainNew(String name) {
        this(name, DomainNewArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainNew(String name, DomainNewArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainNew(String name, DomainNewArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cdn/domainNew:DomainNew", name, args == null ? DomainNewArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainNew(String name, Output<String> id, @Nullable DomainNewState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cdn/domainNew:DomainNew", name, state, makeResourceOptions(options, id));
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
    public static DomainNew get(String name, Output<String> id, @Nullable DomainNewState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainNew(name, id, state, options);
    }
}
