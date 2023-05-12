// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.RouteServiceArgs;
import com.pulumi.alicloud.cen.inputs.RouteServiceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CEN Route Service resource. The virtual border routers (VBRs) and Cloud Connect Network (CCN) instances attached to Cloud Enterprise Network (CEN) instances can access the cloud services deployed in VPCs through the CEN instances.
 * 
 * For information about CEN Route Service and how to use it, see [What is Route Service](https://www.alibabacloud.com/help/en/doc-detail/106671.htm).
 * 
 * &gt; **NOTE:** Available in v1.99.0+.
 * 
 * &gt; **NOTE:** Ensure that at least one VPC in the selected region is attached to the CEN instance.
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
 * import com.pulumi.alicloud.vpc.VpcFunctions;
 * import com.pulumi.alicloud.vpc.inputs.GetNetworksArgs;
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceAttachment;
 * import com.pulumi.alicloud.cen.InstanceAttachmentArgs;
 * import com.pulumi.alicloud.cen.RouteService;
 * import com.pulumi.alicloud.cen.RouteServiceArgs;
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
 *         final var config = ctx.config();
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-test&#34;);
 *         final var exampleNetworks = VpcFunctions.getNetworks(GetNetworksArgs.builder()
 *             .isDefault(true)
 *             .build());
 * 
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;);
 * 
 *         var vpc = new InstanceAttachment(&#34;vpc&#34;, InstanceAttachmentArgs.builder()        
 *             .instanceId(exampleInstance.id())
 *             .childInstanceId(exampleNetworks.applyValue(getNetworksResult -&gt; getNetworksResult.vpcs()[0].id()))
 *             .childInstanceType(&#34;VPC&#34;)
 *             .childInstanceRegionId(exampleNetworks.applyValue(getNetworksResult -&gt; getNetworksResult.vpcs()[0].regionId()))
 *             .build());
 * 
 *         var this_ = new RouteService(&#34;this&#34;, RouteServiceArgs.builder()        
 *             .accessRegionId(exampleNetworks.applyValue(getNetworksResult -&gt; getNetworksResult.vpcs()[0].regionId()))
 *             .hostRegionId(exampleNetworks.applyValue(getNetworksResult -&gt; getNetworksResult.vpcs()[0].regionId()))
 *             .hostVpcId(exampleNetworks.applyValue(getNetworksResult -&gt; getNetworksResult.vpcs()[0].id()))
 *             .cenId(vpc.instanceId())
 *             .host(&#34;100.118.28.52/32&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * CEN Route Service can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cen/routeService:RouteService example cen-ahixm0efqh********:cn-shanghai:100.118.28.52/32:cn-shanghai
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/routeService:RouteService")
public class RouteService extends com.pulumi.resources.CustomResource {
    /**
     * The region of the network instances that access the cloud services.
     * 
     */
    @Export(name="accessRegionId", type=String.class, parameters={})
    private Output<String> accessRegionId;

    /**
     * @return The region of the network instances that access the cloud services.
     * 
     */
    public Output<String> accessRegionId() {
        return this.accessRegionId;
    }
    /**
     * The ID of the CEN instance.
     * 
     */
    @Export(name="cenId", type=String.class, parameters={})
    private Output<String> cenId;

    /**
     * @return The ID of the CEN instance.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }
    /**
     * The description of the cloud service.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the cloud service.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The domain name or IP address of the cloud service.
     * 
     */
    @Export(name="host", type=String.class, parameters={})
    private Output<String> host;

    /**
     * @return The domain name or IP address of the cloud service.
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    /**
     * The region of the cloud service.
     * 
     */
    @Export(name="hostRegionId", type=String.class, parameters={})
    private Output<String> hostRegionId;

    /**
     * @return The region of the cloud service.
     * 
     */
    public Output<String> hostRegionId() {
        return this.hostRegionId;
    }
    /**
     * The VPC associated with the cloud service.
     * 
     * &gt; **NOTE:** The values of `host_region_id` and `access_region_id` must be consistent.
     * 
     */
    @Export(name="hostVpcId", type=String.class, parameters={})
    private Output<String> hostVpcId;

    /**
     * @return The VPC associated with the cloud service.
     * 
     * &gt; **NOTE:** The values of `host_region_id` and `access_region_id` must be consistent.
     * 
     */
    public Output<String> hostVpcId() {
        return this.hostVpcId;
    }
    /**
     * The status of the cloud service.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the cloud service.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteService(String name) {
        this(name, RouteServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteService(String name, RouteServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteService(String name, RouteServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/routeService:RouteService", name, args == null ? RouteServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouteService(String name, Output<String> id, @Nullable RouteServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/routeService:RouteService", name, state, makeResourceOptions(options, id));
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
    public static RouteService get(String name, Output<String> id, @Nullable RouteServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouteService(name, id, state, options);
    }
}
