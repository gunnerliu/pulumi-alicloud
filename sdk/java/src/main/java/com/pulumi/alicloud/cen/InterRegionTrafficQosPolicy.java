// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.InterRegionTrafficQosPolicyArgs;
import com.pulumi.alicloud.cen.inputs.InterRegionTrafficQosPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Enterprise Network (CEN) Inter Region Traffic Qos Policy resource.
 * 
 * For information about Cloud Enterprise Network (CEN) Inter Region Traffic Qos Policy and how to use it, see [What is Inter Region Traffic Qos Policy](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createceninterregiontrafficqospolicy).
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
 *         var bj = new Provider(&#34;bj&#34;, ProviderArgs.builder()        
 *             .region(&#34;cn-beijing&#34;)
 *             .build());
 * 
 *         var hz = new Provider(&#34;hz&#34;, ProviderArgs.builder()        
 *             .region(&#34;cn-hangzhou&#34;)
 *             .build());
 * 
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .cenInstanceName(&#34;tf-example&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.hz())
 *                 .build());
 * 
 *         var defaultBandwidthPackage = new BandwidthPackage(&#34;defaultBandwidthPackage&#34;, BandwidthPackageArgs.builder()        
 *             .bandwidth(5)
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
 *         var hzTransitRouter = new TransitRouter(&#34;hzTransitRouter&#34;, TransitRouterArgs.builder()        
 *             .cenId(defaultBandwidthPackageAttachment.instanceId())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.hz())
 *                 .build());
 * 
 *         var bjTransitRouter = new TransitRouter(&#34;bjTransitRouter&#34;, TransitRouterArgs.builder()        
 *             .cenId(hzTransitRouter.cenId())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.bj())
 *                 .build());
 * 
 *         var defaultTransitRouterPeerAttachment = new TransitRouterPeerAttachment(&#34;defaultTransitRouterPeerAttachment&#34;, TransitRouterPeerAttachmentArgs.builder()        
 *             .cenId(defaultInstance.id())
 *             .transitRouterId(hzTransitRouter.transitRouterId())
 *             .peerTransitRouterRegionId(&#34;cn-beijing&#34;)
 *             .peerTransitRouterId(bjTransitRouter.transitRouterId())
 *             .cenBandwidthPackageId(defaultBandwidthPackageAttachment.bandwidthPackageId())
 *             .bandwidth(5)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.hz())
 *                 .build());
 * 
 *         var defaultInterRegionTrafficQosPolicy = new InterRegionTrafficQosPolicy(&#34;defaultInterRegionTrafficQosPolicy&#34;, InterRegionTrafficQosPolicyArgs.builder()        
 *             .transitRouterId(hzTransitRouter.transitRouterId())
 *             .transitRouterAttachmentId(defaultTransitRouterPeerAttachment.transitRouterAttachmentId())
 *             .interRegionTrafficQosPolicyName(&#34;tf-example-name&#34;)
 *             .interRegionTrafficQosPolicyDescription(&#34;tf-example-description&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.hz())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Enterprise Network (CEN) Inter Region Traffic Qos Policy can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cen/interRegionTrafficQosPolicy:InterRegionTrafficQosPolicy example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/interRegionTrafficQosPolicy:InterRegionTrafficQosPolicy")
public class InterRegionTrafficQosPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The description of the QoS policy. The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.
     * 
     */
    @Export(name="interRegionTrafficQosPolicyDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> interRegionTrafficQosPolicyDescription;

    /**
     * @return The description of the QoS policy. The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.
     * 
     */
    public Output<Optional<String>> interRegionTrafficQosPolicyDescription() {
        return Codegen.optional(this.interRegionTrafficQosPolicyDescription);
    }
    /**
     * The name of the QoS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    @Export(name="interRegionTrafficQosPolicyName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> interRegionTrafficQosPolicyName;

    /**
     * @return The name of the QoS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    public Output<Optional<String>> interRegionTrafficQosPolicyName() {
        return Codegen.optional(this.interRegionTrafficQosPolicyName);
    }
    /**
     * The status of the Inter Region Traffic Qos Policy.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Inter Region Traffic Qos Policy.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The ID of the inter-region connection.
     * 
     */
    @Export(name="transitRouterAttachmentId", refs={String.class}, tree="[0]")
    private Output<String> transitRouterAttachmentId;

    /**
     * @return The ID of the inter-region connection.
     * 
     */
    public Output<String> transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }
    /**
     * The ID of the transit router.
     * 
     */
    @Export(name="transitRouterId", refs={String.class}, tree="[0]")
    private Output<String> transitRouterId;

    /**
     * @return The ID of the transit router.
     * 
     */
    public Output<String> transitRouterId() {
        return this.transitRouterId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InterRegionTrafficQosPolicy(String name) {
        this(name, InterRegionTrafficQosPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InterRegionTrafficQosPolicy(String name, InterRegionTrafficQosPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InterRegionTrafficQosPolicy(String name, InterRegionTrafficQosPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/interRegionTrafficQosPolicy:InterRegionTrafficQosPolicy", name, args == null ? InterRegionTrafficQosPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InterRegionTrafficQosPolicy(String name, Output<String> id, @Nullable InterRegionTrafficQosPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/interRegionTrafficQosPolicy:InterRegionTrafficQosPolicy", name, state, makeResourceOptions(options, id));
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
    public static InterRegionTrafficQosPolicy get(String name, Output<String> id, @Nullable InterRegionTrafficQosPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InterRegionTrafficQosPolicy(name, id, state, options);
    }
}
