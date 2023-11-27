// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.directmail;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.directmail.ReceiversArgs;
import com.pulumi.alicloud.directmail.inputs.ReceiversState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Direct Mail Receivers resource.
 * 
 * For information about Direct Mail Receivers and how to use it, see [What is Direct Mail Receivers](https://www.alibabacloud.com/help/en/doc-detail/29414.htm).
 * 
 * &gt; **NOTE:** Available since v1.125.0.
 * 
 * ## Import
 * 
 * Direct Mail Receivers can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:directmail/receivers:Receivers example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:directmail/receivers:Receivers")
public class Receivers extends com.pulumi.resources.CustomResource {
    /**
     * The description of receivers and 1-50 characters in length.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of receivers and 1-50 characters in length.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The alias of receivers. Must email address and less than 30 characters in length.
     * 
     */
    @Export(name="receiversAlias", refs={String.class}, tree="[0]")
    private Output<String> receiversAlias;

    /**
     * @return The alias of receivers. Must email address and less than 30 characters in length.
     * 
     */
    public Output<String> receiversAlias() {
        return this.receiversAlias;
    }
    /**
     * The name of the resource. The length that cannot be repeated is 1-30 characters.
     * 
     */
    @Export(name="receiversName", refs={String.class}, tree="[0]")
    private Output<String> receiversName;

    /**
     * @return The name of the resource. The length that cannot be repeated is 1-30 characters.
     * 
     */
    public Output<String> receiversName() {
        return this.receiversName;
    }
    /**
     * The status of the resource. `0` means uploading, `1` means upload completed.
     * 
     */
    @Export(name="status", refs={Integer.class}, tree="[0]")
    private Output<Integer> status;

    /**
     * @return The status of the resource. `0` means uploading, `1` means upload completed.
     * 
     */
    public Output<Integer> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Receivers(String name) {
        this(name, ReceiversArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Receivers(String name, ReceiversArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Receivers(String name, ReceiversArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:directmail/receivers:Receivers", name, args == null ? ReceiversArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Receivers(String name, Output<String> id, @Nullable ReceiversState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:directmail/receivers:Receivers", name, state, makeResourceOptions(options, id));
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
    public static Receivers get(String name, Output<String> id, @Nullable ReceiversState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Receivers(name, id, state, options);
    }
}
