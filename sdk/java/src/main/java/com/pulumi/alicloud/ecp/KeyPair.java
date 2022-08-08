// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecp;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecp.KeyPairArgs;
import com.pulumi.alicloud.ecp.inputs.KeyPairState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Elastic Cloud Phone (ECP) Key Pair resource.
 * 
 * For information about Elastic Cloud Phone (ECP) Key Pair and how to use it, see [What is Key Pair](https://help.aliyun.com/document_detail/257197.html).
 * 
 * &gt; **NOTE:** Available in v1.130.0+.
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
 * import com.pulumi.alicloud.ecp.KeyPair;
 * import com.pulumi.alicloud.ecp.KeyPairArgs;
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
 *         var example = new KeyPair(&#34;example&#34;, KeyPairArgs.builder()        
 *             .keyPairName(&#34;my-KeyPair&#34;)
 *             .publicKeyBody(&#34;ssh-rsa AAAAxxxxxxxxxxtyuudsfsg&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Elastic Cloud Phone (ECP) Key Pair can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecp/keyPair:KeyPair example &lt;key_pair_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecp/keyPair:KeyPair")
public class KeyPair extends com.pulumi.resources.CustomResource {
    /**
     * The Key Name.
     * 
     */
    @Export(name="keyPairName", type=String.class, parameters={})
    private Output<String> keyPairName;

    /**
     * @return The Key Name.
     * 
     */
    public Output<String> keyPairName() {
        return this.keyPairName;
    }
    /**
     * The public key body.
     * 
     */
    @Export(name="publicKeyBody", type=String.class, parameters={})
    private Output<String> publicKeyBody;

    /**
     * @return The public key body.
     * 
     */
    public Output<String> publicKeyBody() {
        return this.publicKeyBody;
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
    public KeyPair(String name, KeyPairArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeyPair(String name, KeyPairArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecp/keyPair:KeyPair", name, args == null ? KeyPairArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KeyPair(String name, Output<String> id, @Nullable KeyPairState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecp/keyPair:KeyPair", name, state, makeResourceOptions(options, id));
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
