// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.InterRegionTrafficQosQueueArgs;
import com.pulumi.alicloud.cen.inputs.InterRegionTrafficQosQueueState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cen Inter Region Traffic Qos Queue resource.
 * 
 * For information about Cen Inter Region Traffic Qos Queue and how to use it, see [What is Inter Region Traffic Qos Queue](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createceninterregiontrafficqosqueue).
 * 
 * &gt; **NOTE:** Available since v1.195.0.
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
 * import com.pulumi.alicloud.Provider;
 * import com.pulumi.alicloud.ProviderArgs;
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceArgs;
 * import com.pulumi.alicloud.cen.BandwidthPackage;
 * import com.pulumi.alicloud.cen.BandwidthPackageArgs;
 * import com.pulumi.alicloud.cen.BandwidthPackageAttachment;
 * import com.pulumi.alicloud.cen.BandwidthPackageAttachmentArgs;
 * import com.pulumi.alicloud.cen.TransitRouter;
 * import com.pulumi.alicloud.cen.TransitRouterArgs;
 * import com.pulumi.alicloud.cen.TransitRouterPeerAttachment;
 * import com.pulumi.alicloud.cen.TransitRouterPeerAttachmentArgs;
 * import com.pulumi.alicloud.cen.InterRegionTrafficQosPolicy;
 * import com.pulumi.alicloud.cen.InterRegionTrafficQosPolicyArgs;
 * import com.pulumi.alicloud.cen.InterRegionTrafficQosQueue;
 * import com.pulumi.alicloud.cen.InterRegionTrafficQosQueueArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf_example&#34;);
 *         final var defaultRegion = config.get(&#34;defaultRegion&#34;).orElse(&#34;cn-hangzhou&#34;);
 *         final var peerRegion = config.get(&#34;peerRegion&#34;).orElse(&#34;cn-beijing&#34;);
 *         var hz = new Provider(&#34;hz&#34;, ProviderArgs.builder()        
 *             .region(defaultRegion)
 *             .build());
 * 
 *         var bj = new Provider(&#34;bj&#34;, ProviderArgs.builder()        
 *             .region(peerRegion)
 *             .build());
 * 
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .cenInstanceName(name)
 *             .protectionLevel(&#34;REDUCED&#34;)
 *             .build());
 * 
 *         var defaultBandwidthPackage = new BandwidthPackage(&#34;defaultBandwidthPackage&#34;, BandwidthPackageArgs.builder()        
 *             .bandwidth(5)
 *             .cenBandwidthPackageName(&#34;tf_example&#34;)
 *             .geographicRegionAId(&#34;China&#34;)
 *             .geographicRegionBId(&#34;China&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.hz())
 *                 .build());
 * 
 *         var defaultBandwidthPackageAttachment = new BandwidthPackageAttachment(&#34;defaultBandwidthPackageAttachment&#34;, BandwidthPackageAttachmentArgs.builder()        
 *             .instanceId(defaultInstance.id())
 *             .bandwidthPackageId(defaultBandwidthPackage.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.hz())
 *                 .build());
 * 
 *         var defaultTransitRouter = new TransitRouter(&#34;defaultTransitRouter&#34;, TransitRouterArgs.builder()        
 *             .cenId(defaultInstance.id())
 *             .supportMulticast(true)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.hz())
 *                 .build());
 * 
 *         var peer = new TransitRouter(&#34;peer&#34;, TransitRouterArgs.builder()        
 *             .cenId(defaultTransitRouter.cenId())
 *             .supportMulticast(true)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.bj())
 *                 .build());
 * 
 *         var defaultTransitRouterPeerAttachment = new TransitRouterPeerAttachment(&#34;defaultTransitRouterPeerAttachment&#34;, TransitRouterPeerAttachmentArgs.builder()        
 *             .cenId(defaultInstance.id())
 *             .transitRouterId(defaultTransitRouter.transitRouterId())
 *             .peerTransitRouterRegionId(peerRegion)
 *             .peerTransitRouterId(peer.transitRouterId())
 *             .cenBandwidthPackageId(defaultBandwidthPackageAttachment.bandwidthPackageId())
 *             .bandwidth(5)
 *             .transitRouterAttachmentDescription(name)
 *             .transitRouterAttachmentName(name)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.hz())
 *                 .build());
 * 
 *         var defaultInterRegionTrafficQosPolicy = new InterRegionTrafficQosPolicy(&#34;defaultInterRegionTrafficQosPolicy&#34;, InterRegionTrafficQosPolicyArgs.builder()        
 *             .transitRouterId(defaultTransitRouter.transitRouterId())
 *             .transitRouterAttachmentId(defaultTransitRouterPeerAttachment.transitRouterAttachmentId())
 *             .interRegionTrafficQosPolicyName(name)
 *             .interRegionTrafficQosPolicyDescription(name)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.hz())
 *                 .build());
 * 
 *         var defaultInterRegionTrafficQosQueue = new InterRegionTrafficQosQueue(&#34;defaultInterRegionTrafficQosQueue&#34;, InterRegionTrafficQosQueueArgs.builder()        
 *             .remainBandwidthPercent(20)
 *             .trafficQosPolicyId(defaultInterRegionTrafficQosPolicy.id())
 *             .dscps(            
 *                 1,
 *                 2)
 *             .interRegionTrafficQosQueueDescription(name)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cen Inter Region Traffic Qos Queue can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cen/interRegionTrafficQosQueue:InterRegionTrafficQosQueue example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/interRegionTrafficQosQueue:InterRegionTrafficQosQueue")
public class InterRegionTrafficQosQueue extends com.pulumi.resources.CustomResource {
    /**
     * The DSCP value of the traffic packet to be matched in the current queue, ranging from 0 to 63.
     * 
     */
    @Export(name="dscps", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dscps;

    /**
     * @return The DSCP value of the traffic packet to be matched in the current queue, ranging from 0 to 63.
     * 
     */
    public Output<List<String>> dscps() {
        return this.dscps;
    }
    /**
     * The description information of the traffic scheduling policy.
     * 
     */
    @Export(name="interRegionTrafficQosQueueDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> interRegionTrafficQosQueueDescription;

    /**
     * @return The description information of the traffic scheduling policy.
     * 
     */
    public Output<Optional<String>> interRegionTrafficQosQueueDescription() {
        return Codegen.optional(this.interRegionTrafficQosQueueDescription);
    }
    /**
     * The name of the traffic scheduling policy.
     * 
     */
    @Export(name="interRegionTrafficQosQueueName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> interRegionTrafficQosQueueName;

    /**
     * @return The name of the traffic scheduling policy.
     * 
     */
    public Output<Optional<String>> interRegionTrafficQosQueueName() {
        return Codegen.optional(this.interRegionTrafficQosQueueName);
    }
    /**
     * The percentage of cross-region bandwidth that the current queue can use.
     * 
     */
    @Export(name="remainBandwidthPercent", refs={Integer.class}, tree="[0]")
    private Output<Integer> remainBandwidthPercent;

    /**
     * @return The percentage of cross-region bandwidth that the current queue can use.
     * 
     */
    public Output<Integer> remainBandwidthPercent() {
        return this.remainBandwidthPercent;
    }
    /**
     * The status of the traffic scheduling policy. -**Creating**: The function is being created.-**Active**: available.-**Modifying**: is being modified.-**Deleting**: Deleted.-**Deleted**: Deleted.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the traffic scheduling policy. -**Creating**: The function is being created.-**Active**: available.-**Modifying**: is being modified.-**Deleting**: Deleted.-**Deleted**: Deleted.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The ID of the traffic scheduling policy.
     * 
     */
    @Export(name="trafficQosPolicyId", refs={String.class}, tree="[0]")
    private Output<String> trafficQosPolicyId;

    /**
     * @return The ID of the traffic scheduling policy.
     * 
     */
    public Output<String> trafficQosPolicyId() {
        return this.trafficQosPolicyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InterRegionTrafficQosQueue(String name) {
        this(name, InterRegionTrafficQosQueueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InterRegionTrafficQosQueue(String name, InterRegionTrafficQosQueueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InterRegionTrafficQosQueue(String name, InterRegionTrafficQosQueueArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/interRegionTrafficQosQueue:InterRegionTrafficQosQueue", name, args == null ? InterRegionTrafficQosQueueArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InterRegionTrafficQosQueue(String name, Output<String> id, @Nullable InterRegionTrafficQosQueueState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/interRegionTrafficQosQueue:InterRegionTrafficQosQueue", name, state, makeResourceOptions(options, id));
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
    public static InterRegionTrafficQosQueue get(String name, Output<String> id, @Nullable InterRegionTrafficQosQueueState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InterRegionTrafficQosQueue(name, id, state, options);
    }
}
