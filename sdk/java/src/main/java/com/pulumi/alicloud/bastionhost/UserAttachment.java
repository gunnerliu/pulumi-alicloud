// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.bastionhost.UserAttachmentArgs;
import com.pulumi.alicloud.bastionhost.inputs.UserAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Bastion Host User Attachment resource to add user to one user group.
 * 
 * &gt; **NOTE:** Available in v1.134.0+.
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
 * import com.pulumi.alicloud.bastionhost.UserAttachment;
 * import com.pulumi.alicloud.bastionhost.UserAttachmentArgs;
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
 *         var example = new UserAttachment(&#34;example&#34;, UserAttachmentArgs.builder()        
 *             .instanceId(&#34;bastionhost-cn-tl3xxxxxxx&#34;)
 *             .userGroupId(&#34;10&#34;)
 *             .userId(&#34;100&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Bastion Host User Attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:bastionhost/userAttachment:UserAttachment example &lt;instance_id&gt;:&lt;user_group_id&gt;:&lt;user_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:bastionhost/userAttachment:UserAttachment")
public class UserAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the user group to add the user&#39;s bastion host ID of.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return Specifies the user group to add the user&#39;s bastion host ID of.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Specifies the user group to which you want to add the user ID.
     * 
     */
    @Export(name="userGroupId", type=String.class, parameters={})
    private Output<String> userGroupId;

    /**
     * @return Specifies the user group to which you want to add the user ID.
     * 
     */
    public Output<String> userGroupId() {
        return this.userGroupId;
    }
    /**
     * Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserAttachment(String name) {
        this(name, UserAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserAttachment(String name, UserAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserAttachment(String name, UserAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:bastionhost/userAttachment:UserAttachment", name, args == null ? UserAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserAttachment(String name, Output<String> id, @Nullable UserAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:bastionhost/userAttachment:UserAttachment", name, state, makeResourceOptions(options, id));
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
    public static UserAttachment get(String name, Output<String> id, @Nullable UserAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserAttachment(name, id, state, options);
    }
}
