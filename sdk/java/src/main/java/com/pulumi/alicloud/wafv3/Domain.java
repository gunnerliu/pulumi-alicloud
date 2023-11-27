// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.wafv3;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.wafv3.DomainArgs;
import com.pulumi.alicloud.wafv3.inputs.DomainState;
import com.pulumi.alicloud.wafv3.outputs.DomainListen;
import com.pulumi.alicloud.wafv3.outputs.DomainRedirect;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Wafv3 Domain resource.
 * 
 * For information about Wafv3 Domain and how to use it, see [What is Domain](https://www.alibabacloud.com/help/en/web-application-firewall/latest/api-waf-openapi-2021-10-01-createdomain).
 * 
 * &gt; **NOTE:** Available since v1.200.0.
 * 
 * ## Import
 * 
 * Wafv3 Domain can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:wafv3/domain:Domain example &lt;instance_id&gt;:&lt;domain&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:wafv3/domain:Domain")
public class Domain extends com.pulumi.resources.CustomResource {
    /**
     * The access type of the WAF instance. Value: **share** (default): CNAME access.
     * 
     */
    @Export(name="accessType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accessType;

    /**
     * @return The access type of the WAF instance. Value: **share** (default): CNAME access.
     * 
     */
    public Output<Optional<String>> accessType() {
        return Codegen.optional(this.accessType);
    }
    /**
     * The name of the domain name to query.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    /**
     * @return The name of the domain name to query.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * WAF instance ID
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return WAF instance ID
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Configure listening information. See `listen` below.
     * 
     */
    @Export(name="listen", refs={DomainListen.class}, tree="[0]")
    private Output<DomainListen> listen;

    /**
     * @return Configure listening information. See `listen` below.
     * 
     */
    public Output<DomainListen> listen() {
        return this.listen;
    }
    /**
     * Configure forwarding information. See `redirect` below.
     * 
     */
    @Export(name="redirect", refs={DomainRedirect.class}, tree="[0]")
    private Output<DomainRedirect> redirect;

    /**
     * @return Configure forwarding information. See `redirect` below.
     * 
     */
    public Output<DomainRedirect> redirect() {
        return this.redirect;
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceManagerResourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceManagerResourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<String> resourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:wafv3/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:wafv3/domain:Domain", name, state, makeResourceOptions(options, id));
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
    public static Domain get(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, state, options);
    }
}
