// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.mse.ZnodeArgs;
import com.pulumi.alicloud.mse.inputs.ZnodeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Microservice Engine (MSE) Znode resource.
 * 
 * For information about Microservice Engine (MSE) Znode and how to use it, see [What is Znode](https://help.aliyun.com/document_detail/393622.html).
 * 
 * &gt; **NOTE:** Available in v1.162.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Microservice Engine (MSE) Znode can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:mse/znode:Znode example &lt;cluster_id&gt;:&lt;path&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:mse/znode:Znode")
public class Znode extends com.pulumi.resources.CustomResource {
    /**
     * The language type of the returned information. Valid values: `zh` or `en`.
     * 
     */
    @Export(name="acceptLanguage", type=String.class, parameters={})
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return The language type of the returned information. Valid values: `zh` or `en`.
     * 
     */
    public Output<Optional<String>> acceptLanguage() {
        return Codegen.optional(this.acceptLanguage);
    }
    /**
     * The ID of the Cluster.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The ID of the Cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The Node data.
     * 
     */
    @Export(name="data", type=String.class, parameters={})
    private Output</* @Nullable */ String> data;

    /**
     * @return The Node data.
     * 
     */
    public Output<Optional<String>> data() {
        return Codegen.optional(this.data);
    }
    /**
     * The Node path. The value must start with a forward slash (/).
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output<String> path;

    /**
     * @return The Node path. The value must start with a forward slash (/).
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Znode(String name) {
        this(name, ZnodeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Znode(String name, ZnodeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Znode(String name, ZnodeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:mse/znode:Znode", name, args == null ? ZnodeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Znode(String name, Output<String> id, @Nullable ZnodeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:mse/znode:Znode", name, state, makeResourceOptions(options, id));
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
    public static Znode get(String name, Output<String> id, @Nullable ZnodeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Znode(name, id, state, options);
    }
}
