// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.eventbridge.SlrArgs;
import com.pulumi.alicloud.eventbridge.inputs.SlrState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="alicloud:eventbridge/slr:Slr")
public class Slr extends com.pulumi.resources.CustomResource {
    @Export(name="productName", refs={String.class}, tree="[0]")
    private Output<String> productName;

    public Output<String> productName() {
        return this.productName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Slr(String name) {
        this(name, SlrArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Slr(String name, SlrArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Slr(String name, SlrArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eventbridge/slr:Slr", name, args == null ? SlrArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Slr(String name, Output<String> id, @Nullable SlrState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eventbridge/slr:Slr", name, state, makeResourceOptions(options, id));
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
    public static Slr get(String name, Output<String> id, @Nullable SlrState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Slr(name, id, state, options);
    }
}
