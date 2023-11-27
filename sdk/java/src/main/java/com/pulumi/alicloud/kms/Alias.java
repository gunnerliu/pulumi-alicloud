// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.kms.AliasArgs;
import com.pulumi.alicloud.kms.inputs.AliasState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create an alias for the master key (CMK).
 * 
 * &gt; **NOTE:** Available in v1.77.0+.
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
 * import com.pulumi.alicloud.kms.Key;
 * import com.pulumi.alicloud.kms.Alias;
 * import com.pulumi.alicloud.kms.AliasArgs;
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
 *         var thisKey = new Key(&#34;thisKey&#34;);
 * 
 *         var thisAlias = new Alias(&#34;thisAlias&#34;, AliasArgs.builder()        
 *             .aliasName(&#34;alias/test_kms_alias&#34;)
 *             .keyId(thisKey.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * KMS alias can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:kms/alias:Alias example alias/test_kms_alias
 * ```
 * 
 */
@ResourceType(type="alicloud:kms/alias:Alias")
public class Alias extends com.pulumi.resources.CustomResource {
    /**
     * The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
     * 
     */
    @Export(name="aliasName", refs={String.class}, tree="[0]")
    private Output<String> aliasName;

    /**
     * @return The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
     * 
     */
    public Output<String> aliasName() {
        return this.aliasName;
    }
    /**
     * The id of the key.
     * 
     * &gt; **NOTE:** Each alias represents only one master key(CMK).
     * 
     * &gt; **NOTE:** Within an area of the same user, alias is not reproducible.
     * 
     * &gt; **NOTE:** UpdateAlias can be used to update the mapping relationship between alias and master key(CMK).
     * 
     */
    @Export(name="keyId", refs={String.class}, tree="[0]")
    private Output<String> keyId;

    /**
     * @return The id of the key.
     * 
     * &gt; **NOTE:** Each alias represents only one master key(CMK).
     * 
     * &gt; **NOTE:** Within an area of the same user, alias is not reproducible.
     * 
     * &gt; **NOTE:** UpdateAlias can be used to update the mapping relationship between alias and master key(CMK).
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alias(String name) {
        this(name, AliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alias(String name, AliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alias(String name, AliasArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:kms/alias:Alias", name, args == null ? AliasArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Alias(String name, Output<String> id, @Nullable AliasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:kms/alias:Alias", name, state, makeResourceOptions(options, id));
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
    public static Alias get(String name, Output<String> id, @Nullable AliasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Alias(name, id, state, options);
    }
}
