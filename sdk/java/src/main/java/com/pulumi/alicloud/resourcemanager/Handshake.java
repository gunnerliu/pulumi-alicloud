// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.resourcemanager.HandshakeArgs;
import com.pulumi.alicloud.resourcemanager.inputs.HandshakeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Resource Manager handshake resource. You can invite accounts to join a resource directory for unified management.
 * For information about Resource Manager handshake and how to use it, see [What is Resource Manager handshake](https://www.alibabacloud.com/help/en/doc-detail/135287.htm).
 * 
 * &gt; **NOTE:** Available in v1.82.0+.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.resourcemanager.Handshake;
 * import com.pulumi.alicloud.resourcemanager.HandshakeArgs;
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
 *         var example = new Handshake(&#34;example&#34;, HandshakeArgs.builder()        
 *             .note(&#34;test resource manager handshake&#34;)
 *             .targetEntity(&#34;1182775234******&#34;)
 *             .targetType(&#34;Account&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Resource Manager handshake can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:resourcemanager/handshake:Handshake example h-QmdexeFm1kE*****
 * ```
 * 
 */
@ResourceType(type="alicloud:resourcemanager/handshake:Handshake")
public class Handshake extends com.pulumi.resources.CustomResource {
    /**
     * The expiration time of the invitation.
     * 
     */
    @Export(name="expireTime", refs={String.class}, tree="[0]")
    private Output<String> expireTime;

    /**
     * @return The expiration time of the invitation.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * Resource account master account ID.
     * 
     */
    @Export(name="masterAccountId", refs={String.class}, tree="[0]")
    private Output<String> masterAccountId;

    /**
     * @return Resource account master account ID.
     * 
     */
    public Output<String> masterAccountId() {
        return this.masterAccountId;
    }
    /**
     * The name of the main account of the resource directory.
     * 
     */
    @Export(name="masterAccountName", refs={String.class}, tree="[0]")
    private Output<String> masterAccountName;

    /**
     * @return The name of the main account of the resource directory.
     * 
     */
    public Output<String> masterAccountName() {
        return this.masterAccountName;
    }
    /**
     * The modification time of the invitation.
     * 
     */
    @Export(name="modifyTime", refs={String.class}, tree="[0]")
    private Output<String> modifyTime;

    /**
     * @return The modification time of the invitation.
     * 
     */
    public Output<String> modifyTime() {
        return this.modifyTime;
    }
    /**
     * Remarks. The maximum length is 1024 characters.
     * 
     */
    @Export(name="note", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> note;

    /**
     * @return Remarks. The maximum length is 1024 characters.
     * 
     */
    public Output<Optional<String>> note() {
        return Codegen.optional(this.note);
    }
    /**
     * Resource directory ID.
     * 
     */
    @Export(name="resourceDirectoryId", refs={String.class}, tree="[0]")
    private Output<String> resourceDirectoryId;

    /**
     * @return Resource directory ID.
     * 
     */
    public Output<String> resourceDirectoryId() {
        return this.resourceDirectoryId;
    }
    /**
     * Invitation status. Valid values: `Pending` waiting for confirmation, `Accepted`, `Cancelled`, `Declined`, `Expired`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Invitation status. Valid values: `Pending` waiting for confirmation, `Accepted`, `Cancelled`, `Declined`, `Expired`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Invited account ID or login email.
     * 
     */
    @Export(name="targetEntity", refs={String.class}, tree="[0]")
    private Output<String> targetEntity;

    /**
     * @return Invited account ID or login email.
     * 
     */
    public Output<String> targetEntity() {
        return this.targetEntity;
    }
    /**
     * Type of account being invited. Valid values: `Account`, `Email`.
     * 
     */
    @Export(name="targetType", refs={String.class}, tree="[0]")
    private Output<String> targetType;

    /**
     * @return Type of account being invited. Valid values: `Account`, `Email`.
     * 
     */
    public Output<String> targetType() {
        return this.targetType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Handshake(String name) {
        this(name, HandshakeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Handshake(String name, HandshakeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Handshake(String name, HandshakeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/handshake:Handshake", name, args == null ? HandshakeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Handshake(String name, Output<String> id, @Nullable HandshakeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/handshake:Handshake", name, state, makeResourceOptions(options, id));
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
    public static Handshake get(String name, Output<String> id, @Nullable HandshakeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Handshake(name, id, state, options);
    }
}
