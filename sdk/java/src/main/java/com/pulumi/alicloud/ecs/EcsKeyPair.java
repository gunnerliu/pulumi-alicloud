// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsKeyPairArgs;
import com.pulumi.alicloud.ecs.inputs.EcsKeyPairState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECS Key Pair resource.
 * 
 * For information about ECS Key Pair and how to use it, see [What is Key Pair](https://www.alibabacloud.com/help/en/doc-detail/51771.htm).
 * 
 * &gt; **NOTE:** Available in v1.121.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ECS Key Pair can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/ecsKeyPair:EcsKeyPair example &lt;key_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsKeyPair:EcsKeyPair")
public class EcsKeyPair extends com.pulumi.resources.CustomResource {
    @Export(name="fingerPrint", type=String.class, parameters={})
    private Output<String> fingerPrint;

    public Output<String> fingerPrint() {
        return this.fingerPrint;
    }
    /**
     * The key file.
     * 
     */
    @Export(name="keyFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyFile;

    /**
     * @return The key file.
     * 
     */
    public Output<Optional<String>> keyFile() {
        return Codegen.optional(this.keyFile);
    }
    /**
     * Field `key_name` has been deprecated from provider version 1.121.0. New field `key_pair_name` instead.
     * 
     * @deprecated
     * Field &#39;key_name&#39; has been deprecated from provider version 1.121.0. New field &#39;key_pair_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead. */
    @Export(name="keyName", type=String.class, parameters={})
    private Output<String> keyName;

    /**
     * @return Field `key_name` has been deprecated from provider version 1.121.0. New field `key_pair_name` instead.
     * 
     */
    public Output<String> keyName() {
        return this.keyName;
    }
    @Export(name="keyNamePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyNamePrefix;

    public Output<Optional<String>> keyNamePrefix() {
        return Codegen.optional(this.keyNamePrefix);
    }
    /**
     * The key pair&#39;s name. It is the only in one Alicloud account, the key pair&#39;s name. must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
     * 
     */
    @Export(name="keyPairName", type=String.class, parameters={})
    private Output<String> keyPairName;

    /**
     * @return The key pair&#39;s name. It is the only in one Alicloud account, the key pair&#39;s name. must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
     * 
     */
    public Output<String> keyPairName() {
        return this.keyPairName;
    }
    /**
     * You can import an existing public key and using Alicloud key pair to manage it. If this parameter is specified, `resource_group_id` is the key pair belongs.
     * 
     */
    @Export(name="publicKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicKey;

    /**
     * @return You can import an existing public key and using Alicloud key pair to manage it. If this parameter is specified, `resource_group_id` is the key pair belongs.
     * 
     */
    public Output<Optional<String>> publicKey() {
        return Codegen.optional(this.publicKey);
    }
    /**
     * The Id of resource group which the key pair belongs.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The Id of resource group which the key pair belongs.
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsKeyPair(String name) {
        this(name, EcsKeyPairArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsKeyPair(String name, @Nullable EcsKeyPairArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsKeyPair(String name, @Nullable EcsKeyPairArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsKeyPair:EcsKeyPair", name, args == null ? EcsKeyPairArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EcsKeyPair(String name, Output<String> id, @Nullable EcsKeyPairState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsKeyPair:EcsKeyPair", name, state, makeResourceOptions(options, id));
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
    public static EcsKeyPair get(String name, Output<String> id, @Nullable EcsKeyPairState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsKeyPair(name, id, state, options);
    }
}
