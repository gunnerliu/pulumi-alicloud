// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.nlb.LoadbalancerCommonBandwidthPackageAttachmentArgs;
import com.pulumi.alicloud.nlb.inputs.LoadbalancerCommonBandwidthPackageAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a NLB Loadbalancer Common Bandwidth Package Attachment resource. Bandwidth Package Operation.
 * 
 * For information about NLB Loadbalancer Common Bandwidth Package Attachment and how to use it, see [What is Loadbalancer Common Bandwidth Package Attachment](https://www.alibabacloud.com/help/en/server-load-balancer/latest/nlb-instances-change).
 * 
 * &gt; **NOTE:** Available since v1.209.0.
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
 * import com.pulumi.alicloud.nlb.LoadbalancerCommonBandwidthPackageAttachment;
 * import com.pulumi.alicloud.nlb.LoadbalancerCommonBandwidthPackageAttachmentArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         var default_ = new LoadbalancerCommonBandwidthPackageAttachment(&#34;default&#34;, LoadbalancerCommonBandwidthPackageAttachmentArgs.builder()        
 *             .bandwidthPackageId(&#34;cbwp-2zexv44uov1m4b7xnh60j&#34;)
 *             .loadBalancerId(&#34;nlb-f6gdwdsnt02uzx002l&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * NLB Loadbalancer Common Bandwidth Package Attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:nlb/loadbalancerCommonBandwidthPackageAttachment:LoadbalancerCommonBandwidthPackageAttachment example &lt;load_balancer_id&gt;:&lt;bandwidth_package_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:nlb/loadbalancerCommonBandwidthPackageAttachment:LoadbalancerCommonBandwidthPackageAttachment")
public class LoadbalancerCommonBandwidthPackageAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the bound shared bandwidth package.
     * 
     */
    @Export(name="bandwidthPackageId", type=String.class, parameters={})
    private Output<String> bandwidthPackageId;

    /**
     * @return The ID of the bound shared bandwidth package.
     * 
     */
    public Output<String> bandwidthPackageId() {
        return this.bandwidthPackageId;
    }
    /**
     * The ID of the network-based server load balancer instance.
     * 
     */
    @Export(name="loadBalancerId", type=String.class, parameters={})
    private Output<String> loadBalancerId;

    /**
     * @return The ID of the network-based server load balancer instance.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * Network-based load balancing instance status. Value:, indicating that the instance listener will no longer forward traffic.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Network-based load balancing instance status. Value:, indicating that the instance listener will no longer forward traffic.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadbalancerCommonBandwidthPackageAttachment(String name) {
        this(name, LoadbalancerCommonBandwidthPackageAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadbalancerCommonBandwidthPackageAttachment(String name, LoadbalancerCommonBandwidthPackageAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadbalancerCommonBandwidthPackageAttachment(String name, LoadbalancerCommonBandwidthPackageAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nlb/loadbalancerCommonBandwidthPackageAttachment:LoadbalancerCommonBandwidthPackageAttachment", name, args == null ? LoadbalancerCommonBandwidthPackageAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadbalancerCommonBandwidthPackageAttachment(String name, Output<String> id, @Nullable LoadbalancerCommonBandwidthPackageAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nlb/loadbalancerCommonBandwidthPackageAttachment:LoadbalancerCommonBandwidthPackageAttachment", name, state, makeResourceOptions(options, id));
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
    public static LoadbalancerCommonBandwidthPackageAttachment get(String name, Output<String> id, @Nullable LoadbalancerCommonBandwidthPackageAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadbalancerCommonBandwidthPackageAttachment(name, id, state, options);
    }
}