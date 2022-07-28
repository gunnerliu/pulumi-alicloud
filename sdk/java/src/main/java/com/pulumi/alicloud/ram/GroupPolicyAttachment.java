// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ram.GroupPolicyAttachmentArgs;
import com.pulumi.alicloud.ram.inputs.GroupPolicyAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a RAM Group Policy attachment resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RAM Group Policy attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ram/groupPolicyAttachment:GroupPolicyAttachment example group:my-policy:Custom:my-group
 * ```
 * 
 */
@ResourceType(type="alicloud:ram/groupPolicyAttachment:GroupPolicyAttachment")
public class GroupPolicyAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    @Export(name="groupName", type=String.class, parameters={})
    private Output<String> groupName;

    /**
     * @return Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> groupName() {
        return this.groupName;
    }
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    @Export(name="policyName", type=String.class, parameters={})
    private Output<String> policyName;

    /**
     * @return Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }
    /**
     * Type of the RAM policy. It must be `Custom` or `System`.
     * 
     */
    @Export(name="policyType", type=String.class, parameters={})
    private Output<String> policyType;

    /**
     * @return Type of the RAM policy. It must be `Custom` or `System`.
     * 
     */
    public Output<String> policyType() {
        return this.policyType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupPolicyAttachment(String name) {
        this(name, GroupPolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupPolicyAttachment(String name, GroupPolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupPolicyAttachment(String name, GroupPolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/groupPolicyAttachment:GroupPolicyAttachment", name, args == null ? GroupPolicyAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupPolicyAttachment(String name, Output<String> id, @Nullable GroupPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/groupPolicyAttachment:GroupPolicyAttachment", name, state, makeResourceOptions(options, id));
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
    public static GroupPolicyAttachment get(String name, Output<String> id, @Nullable GroupPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupPolicyAttachment(name, id, state, options);
    }
}
