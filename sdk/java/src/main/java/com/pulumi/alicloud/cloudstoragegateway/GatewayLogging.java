// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudstoragegateway;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cloudstoragegateway.GatewayLoggingArgs;
import com.pulumi.alicloud.cloudstoragegateway.inputs.GatewayLoggingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Storage Gateway Gateway Logging resource.
 * 
 * For information about Cloud Storage Gateway Gateway Logging and how to use it, see [What is Gateway Logging](https://www.alibabacloud.com/help/en/cloud-storage-gateway/latest/creategatewaylogging).
 * 
 * &gt; **NOTE:** Available since v1.144.0.
 * 
 * ## Import
 * 
 * Cloud Storage Gateway Gateway Logging can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cloudstoragegateway/gatewayLogging:GatewayLogging example &lt;gateway_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cloudstoragegateway/gatewayLogging:GatewayLogging")
public class GatewayLogging extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Gateway.
     * 
     */
    @Export(name="gatewayId", refs={String.class}, tree="[0]")
    private Output<String> gatewayId;

    /**
     * @return The ID of the Gateway.
     * 
     */
    public Output<String> gatewayId() {
        return this.gatewayId;
    }
    /**
     * The name of the Log Store.
     * 
     */
    @Export(name="slsLogstore", refs={String.class}, tree="[0]")
    private Output<String> slsLogstore;

    /**
     * @return The name of the Log Store.
     * 
     */
    public Output<String> slsLogstore() {
        return this.slsLogstore;
    }
    /**
     * The name of the Project.
     * 
     */
    @Export(name="slsProject", refs={String.class}, tree="[0]")
    private Output<String> slsProject;

    /**
     * @return The name of the Project.
     * 
     */
    public Output<String> slsProject() {
        return this.slsProject;
    }
    /**
     * The status of the resource. Valid values: `Enabled`, `Disable`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource. Valid values: `Enabled`, `Disable`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GatewayLogging(String name) {
        this(name, GatewayLoggingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GatewayLogging(String name, GatewayLoggingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GatewayLogging(String name, GatewayLoggingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudstoragegateway/gatewayLogging:GatewayLogging", name, args == null ? GatewayLoggingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GatewayLogging(String name, Output<String> id, @Nullable GatewayLoggingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudstoragegateway/gatewayLogging:GatewayLogging", name, state, makeResourceOptions(options, id));
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
    public static GatewayLogging get(String name, Output<String> id, @Nullable GatewayLoggingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GatewayLogging(name, id, state, options);
    }
}
