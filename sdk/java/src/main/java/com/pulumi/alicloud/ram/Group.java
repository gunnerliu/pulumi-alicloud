// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ram.GroupArgs;
import com.pulumi.alicloud.ram.inputs.GroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * RAM group can be imported using the id or name, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ram/group:Group example my-group
 * ```
 * 
 */
@ResourceType(type="alicloud:ram/group:Group")
public class Group extends com.pulumi.resources.CustomResource {
    /**
     * Comment of the RAM group. This parameter can have a string of 1 to 128 characters.
     * 
     */
    @Export(name="comments", type=String.class, parameters={})
    private Output</* @Nullable */ String> comments;

    /**
     * @return Comment of the RAM group. This parameter can have a string of 1 to 128 characters.
     * 
     */
    public Output<Optional<String>> comments() {
        return Codegen.optional(this.comments);
    }
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     * 
     */
    @Export(name="force", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return This parameter is used for resource destroy. Default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * Name of the RAM group. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the RAM group. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Group(String name) {
        this(name, GroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Group(String name, @Nullable GroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(String name, @Nullable GroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/group:Group", name, args == null ? GroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Group(String name, Output<String> id, @Nullable GroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/group:Group", name, state, makeResourceOptions(options, id));
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
    public static Group get(String name, Output<String> id, @Nullable GroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, state, options);
    }
}
