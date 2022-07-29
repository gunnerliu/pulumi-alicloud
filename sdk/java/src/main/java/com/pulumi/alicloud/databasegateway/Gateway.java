// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.databasegateway;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.databasegateway.GatewayArgs;
import com.pulumi.alicloud.databasegateway.inputs.GatewayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Database Gateway Gateway resource.
 * 
 * For information about Database Gateway Gateway and how to use it, see [What is Gateway](https://www.alibabacloud.com/help/doc-detail/123415.htm).
 * 
 * &gt; **NOTE:** Available in v1.135.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Database Gateway Gateway can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:databasegateway/gateway:Gateway example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:databasegateway/gateway:Gateway")
public class Gateway extends com.pulumi.resources.CustomResource {
    /**
     * The description of Gateway.
     * 
     */
    @Export(name="gatewayDesc", type=String.class, parameters={})
    private Output</* @Nullable */ String> gatewayDesc;

    /**
     * @return The description of Gateway.
     * 
     */
    public Output<Optional<String>> gatewayDesc() {
        return Codegen.optional(this.gatewayDesc);
    }
    /**
     * The name of the Gateway.
     * 
     */
    @Export(name="gatewayName", type=String.class, parameters={})
    private Output<String> gatewayName;

    /**
     * @return The name of the Gateway.
     * 
     */
    public Output<String> gatewayName() {
        return this.gatewayName;
    }
    /**
     * The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gateway(String name) {
        this(name, GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gateway(String name, GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(String name, GatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:databasegateway/gateway:Gateway", name, args == null ? GatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Gateway(String name, Output<String> id, @Nullable GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:databasegateway/gateway:Gateway", name, state, makeResourceOptions(options, id));
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
    public static Gateway get(String name, Output<String> id, @Nullable GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, state, options);
    }
}
