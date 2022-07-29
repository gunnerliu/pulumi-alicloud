// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rdc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.rdc.OrganizationArgs;
import com.pulumi.alicloud.rdc.inputs.OrganizationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a RDC Organization resource.
 * 
 * For information about RDC Organization and how to use it, see [What is Organization](https://help.aliyun.com/product/51588.html).
 * 
 * &gt; **NOTE:** Available in v1.137.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RDC Organization can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:rdc/organization:Organization example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:rdc/organization:Organization")
public class Organization extends com.pulumi.resources.CustomResource {
    /**
     * The desired member count.
     * 
     */
    @Export(name="desiredMemberCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> desiredMemberCount;

    /**
     * @return The desired member count.
     * 
     */
    public Output<Optional<Integer>> desiredMemberCount() {
        return Codegen.optional(this.desiredMemberCount);
    }
    /**
     * Company name.
     * 
     */
    @Export(name="organizationName", type=String.class, parameters={})
    private Output<String> organizationName;

    /**
     * @return Company name.
     * 
     */
    public Output<String> organizationName() {
        return this.organizationName;
    }
    /**
     * User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
     * 
     */
    @Export(name="realPk", type=String.class, parameters={})
    private Output</* @Nullable */ String> realPk;

    /**
     * @return User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
     * 
     */
    public Output<Optional<String>> realPk() {
        return Codegen.optional(this.realPk);
    }
    /**
     * This is organization source information
     * 
     */
    @Export(name="source", type=String.class, parameters={})
    private Output<String> source;

    /**
     * @return This is organization source information
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Organization(String name) {
        this(name, OrganizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Organization(String name, OrganizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Organization(String name, OrganizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rdc/organization:Organization", name, args == null ? OrganizationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Organization(String name, Output<String> id, @Nullable OrganizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rdc/organization:Organization", name, state, makeResourceOptions(options, id));
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
    public static Organization get(String name, Output<String> id, @Nullable OrganizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Organization(name, id, state, options);
    }
}
