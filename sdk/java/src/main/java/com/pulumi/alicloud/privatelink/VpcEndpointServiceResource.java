// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.privatelink.VpcEndpointServiceResourceArgs;
import com.pulumi.alicloud.privatelink.inputs.VpcEndpointServiceResourceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Private Link Vpc Endpoint Service Resource resource.
 * 
 * For information about Private Link Vpc Endpoint Service Resource and how to use it, see [What is Vpc Endpoint Service Resource](https://help.aliyun.com/document_detail/183548.html).
 * 
 * &gt; **NOTE:** Available in v1.110.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Private Link Vpc Endpoint Service Resource can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource example &lt;service_id&gt;:&lt;resource_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource")
public class VpcEndpointServiceResource extends com.pulumi.resources.CustomResource {
    /**
     * The dry run.
     * 
     */
    @Export(name="dryRun", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The ID of Resource.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The ID of Resource.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }
    /**
     * The Type of Resource.
     * 
     */
    @Export(name="resourceType", type=String.class, parameters={})
    private Output<String> resourceType;

    /**
     * @return The Type of Resource.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }
    /**
     * The ID of Vpc Endpoint Service.
     * 
     */
    @Export(name="serviceId", type=String.class, parameters={})
    private Output<String> serviceId;

    /**
     * @return The ID of Vpc Endpoint Service.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcEndpointServiceResource(String name) {
        this(name, VpcEndpointServiceResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcEndpointServiceResource(String name, VpcEndpointServiceResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcEndpointServiceResource(String name, VpcEndpointServiceResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource", name, args == null ? VpcEndpointServiceResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcEndpointServiceResource(String name, Output<String> id, @Nullable VpcEndpointServiceResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource", name, state, makeResourceOptions(options, id));
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
    public static VpcEndpointServiceResource get(String name, Output<String> id, @Nullable VpcEndpointServiceResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcEndpointServiceResource(name, id, state, options);
    }
}
