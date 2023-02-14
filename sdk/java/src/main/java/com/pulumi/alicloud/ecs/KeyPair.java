// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.KeyPairArgs;
import com.pulumi.alicloud.ecs.inputs.KeyPairState;
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
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.ecs.KeyPair;
 * import com.pulumi.alicloud.ecs.KeyPairArgs;
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
 *         var basic = new KeyPair(&#34;basic&#34;, KeyPairArgs.builder()        
 *             .keyName(&#34;terraform-test-key-pair&#34;)
 *             .build());
 * 
 *         var prefix = new KeyPair(&#34;prefix&#34;, KeyPairArgs.builder()        
 *             .keyNamePrefix(&#34;terraform-test-key-pair-prefix&#34;)
 *             .build());
 * 
 *         var publickey = new KeyPair(&#34;publickey&#34;, KeyPairArgs.builder()        
 *             .keyName(&#34;my_public_key&#34;)
 *             .publicKey(&#34;ssh-rsa AAAAB3Nza12345678qwertyuudsfsg&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Key pair can be imported using the name, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/keyPair:KeyPair example my_public_key
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/keyPair:KeyPair")
public class KeyPair extends com.pulumi.resources.CustomResource {
    @Export(name="fingerPrint", type=String.class, parameters={})
    private Output<String> fingerPrint;

    public Output<String> fingerPrint() {
        return this.fingerPrint;
    }
    /**
     * The name of file to save your new key pair&#39;s private key. Strongly suggest you to specified it when you creating key pair, otherwise, you wouldn&#39;t get its private key ever.
     * 
     */
    @Export(name="keyFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyFile;

    /**
     * @return The name of file to save your new key pair&#39;s private key. Strongly suggest you to specified it when you creating key pair, otherwise, you wouldn&#39;t get its private key ever.
     * 
     */
    public Output<Optional<String>> keyFile() {
        return Codegen.optional(this.keyFile);
    }
    /**
     * The key pair&#39;s name. It is the only in one Alicloud account.
     * 
     * @deprecated
     * Field &#39;key_name&#39; has been deprecated from provider version 1.121.0. New field &#39;key_pair_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead. */
    @Export(name="keyName", type=String.class, parameters={})
    private Output<String> keyName;

    /**
     * @return The key pair&#39;s name. It is the only in one Alicloud account.
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
    @Export(name="keyPairName", type=String.class, parameters={})
    private Output<String> keyPairName;

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
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeyPair(String name) {
        this(name, KeyPairArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeyPair(String name, @Nullable KeyPairArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeyPair(String name, @Nullable KeyPairArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/keyPair:KeyPair", name, args == null ? KeyPairArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KeyPair(String name, Output<String> id, @Nullable KeyPairState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/keyPair:KeyPair", name, state, makeResourceOptions(options, id));
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
    public static KeyPair get(String name, Output<String> id, @Nullable KeyPairState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KeyPair(name, id, state, options);
    }
}