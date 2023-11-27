// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.tag;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.tag.PolicyAttachmentArgs;
import com.pulumi.alicloud.tag.inputs.PolicyAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Tag Policy Attachment resource to attaches a policy to an object. After you attach a tag policy to an object.
 * For information about Tag Policy Attachment and how to use it,
 * see [What is Policy Attachment](https://www.alibabacloud.com/help/en/resource-management/latest/attach-policy).
 * 
 * &gt; **NOTE:** Available since v1.204.0.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.tag.Policy;
 * import com.pulumi.alicloud.tag.PolicyArgs;
 * import com.pulumi.alicloud.tag.PolicyAttachment;
 * import com.pulumi.alicloud.tag.PolicyAttachmentArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-example&#34;);
 *         final var default = AlicloudFunctions.getAccount();
 * 
 *         var examplePolicy = new Policy(&#34;examplePolicy&#34;, PolicyArgs.builder()        
 *             .policyName(name)
 *             .policyDesc(name)
 *             .userType(&#34;USER&#34;)
 *             .policyContent(&#34;&#34;&#34;
 * 		{&#34;tags&#34;:{&#34;CostCenter&#34;:{&#34;tag_value&#34;:{&#34;@@assign&#34;:[&#34;Beijing&#34;,&#34;Shanghai&#34;]},&#34;tag_key&#34;:{&#34;@@assign&#34;:&#34;CostCenter&#34;}}}}
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var examplePolicyAttachment = new PolicyAttachment(&#34;examplePolicyAttachment&#34;, PolicyAttachmentArgs.builder()        
 *             .policyId(examplePolicy.id())
 *             .targetId(default_.id())
 *             .targetType(&#34;USER&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Tag Policy Attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:tag/policyAttachment:PolicyAttachment example &lt;policy_id&gt;:&lt;target_id&gt;:&lt;target_type&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:tag/policyAttachment:PolicyAttachment")
public class PolicyAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the tag policy.
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output<String> policyId;

    /**
     * @return The ID of the tag policy.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }
    /**
     * The ID of the object.
     * 
     */
    @Export(name="targetId", refs={String.class}, tree="[0]")
    private Output<String> targetId;

    /**
     * @return The ID of the object.
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }
    /**
     * The type of the object. Valid values: `USER`, `ROOT`, `FOLDER`, `ACCOUNT`.
     * 
     */
    @Export(name="targetType", refs={String.class}, tree="[0]")
    private Output<String> targetType;

    /**
     * @return The type of the object. Valid values: `USER`, `ROOT`, `FOLDER`, `ACCOUNT`.
     * 
     */
    public Output<String> targetType() {
        return this.targetType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyAttachment(String name) {
        this(name, PolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyAttachment(String name, PolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyAttachment(String name, PolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:tag/policyAttachment:PolicyAttachment", name, args == null ? PolicyAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PolicyAttachment(String name, Output<String> id, @Nullable PolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:tag/policyAttachment:PolicyAttachment", name, state, makeResourceOptions(options, id));
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
    public static PolicyAttachment get(String name, Output<String> id, @Nullable PolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PolicyAttachment(name, id, state, options);
    }
}
