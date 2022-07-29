// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.resourcemanager.ControlPolicyAttachmentArgs;
import com.pulumi.alicloud.resourcemanager.inputs.ControlPolicyAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Resource Manager Control Policy Attachment resource.
 * 
 * For information about Resource Manager Control Policy Attachment and how to use it, see [What is Control Policy Attachment](https://help.aliyun.com/document_detail/208330.html).
 * 
 * &gt; **NOTE:** Available in v1.120.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Resource Manager Control Policy Attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:resourcemanager/controlPolicyAttachment:ControlPolicyAttachment example &lt;policy_id&gt;:&lt;target_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:resourcemanager/controlPolicyAttachment:ControlPolicyAttachment")
public class ControlPolicyAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of control policy.
     * 
     */
    @Export(name="policyId", type=String.class, parameters={})
    private Output<String> policyId;

    /**
     * @return The ID of control policy.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }
    /**
     * The ID of target.
     * 
     */
    @Export(name="targetId", type=String.class, parameters={})
    private Output<String> targetId;

    /**
     * @return The ID of target.
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ControlPolicyAttachment(String name) {
        this(name, ControlPolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ControlPolicyAttachment(String name, ControlPolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ControlPolicyAttachment(String name, ControlPolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/controlPolicyAttachment:ControlPolicyAttachment", name, args == null ? ControlPolicyAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ControlPolicyAttachment(String name, Output<String> id, @Nullable ControlPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/controlPolicyAttachment:ControlPolicyAttachment", name, state, makeResourceOptions(options, id));
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
    public static ControlPolicyAttachment get(String name, Output<String> id, @Nullable ControlPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ControlPolicyAttachment(name, id, state, options);
    }
}
