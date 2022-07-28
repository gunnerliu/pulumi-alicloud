// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TransitRouterArgs;
import com.pulumi.alicloud.cen.inputs.TransitRouterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CEN transit router resource that associate the transitRouter with the CEN instance.[What is Cen Transit Router](https://help.aliyun.com/document_detail/261169.html)
 * 
 * &gt; **NOTE:** Available in 1.126.0+
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CEN instance can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cen/transitRouter:TransitRouter default cen-*****:tr-*******
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/transitRouter:TransitRouter")
public class TransitRouter extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the CEN.
     * 
     */
    @Export(name="cenId", type=String.class, parameters={})
    private Output<String> cenId;

    /**
     * @return The ID of the CEN.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }
    /**
     * The dry run.
     * 
     */
    @Export(name="dryRun", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The associating status of the Transit Router.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The associating status of the Transit Router.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The description of the transit router.
     * 
     */
    @Export(name="transitRouterDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> transitRouterDescription;

    /**
     * @return The description of the transit router.
     * 
     */
    public Output<Optional<String>> transitRouterDescription() {
        return Codegen.optional(this.transitRouterDescription);
    }
    /**
     * The transit router id of the transit router.
     * 
     */
    @Export(name="transitRouterId", type=String.class, parameters={})
    private Output<String> transitRouterId;

    /**
     * @return The transit router id of the transit router.
     * 
     */
    public Output<String> transitRouterId() {
        return this.transitRouterId;
    }
    /**
     * The name of the transit router.
     * 
     */
    @Export(name="transitRouterName", type=String.class, parameters={})
    private Output</* @Nullable */ String> transitRouterName;

    /**
     * @return The name of the transit router.
     * 
     */
    public Output<Optional<String>> transitRouterName() {
        return Codegen.optional(this.transitRouterName);
    }
    /**
     * The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitRouter(String name) {
        this(name, TransitRouterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitRouter(String name, TransitRouterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitRouter(String name, TransitRouterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouter:TransitRouter", name, args == null ? TransitRouterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitRouter(String name, Output<String> id, @Nullable TransitRouterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouter:TransitRouter", name, state, makeResourceOptions(options, id));
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
    public static TransitRouter get(String name, Output<String> id, @Nullable TransitRouterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitRouter(name, id, state, options);
    }
}
