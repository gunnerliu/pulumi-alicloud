// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TransitRouterPeerAttachmentArgs;
import com.pulumi.alicloud.cen.inputs.TransitRouterPeerAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CEN transit router peer attachment resource that associate the transit router with the CEN instance. [What is CEN transit router peer attachment](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-createtransitrouterpeerattachment)
 * 
 * &gt; **NOTE:** Available since v1.128.0.
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
 *         final var region = config.get(&#34;region&#34;).orElse(&#34;cn-hangzhou&#34;);
 *         final var peerRegion = config.get(&#34;peerRegion&#34;).orElse(&#34;cn-beijing&#34;);
 *         var hz = new Provider(&#34;hz&#34;, ProviderArgs.builder()        
 *             .region(region)
 *             .build());
 * 
 *         var bj = new Provider(&#34;bj&#34;, ProviderArgs.builder()        
 *             .region(peerRegion)
 *             .build());
 * 
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .cenInstanceName(name)
 *             .protectionLevel(&#34;REDUCED&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.bj())
 *                 .build());
 * 
 *         var exampleBandwidthPackage = new BandwidthPackage(&#34;exampleBandwidthPackage&#34;, BandwidthPackageArgs.builder()        
 *             .bandwidth(5)
 *             .cenBandwidthPackageName(&#34;tf_example&#34;)
 *             .geographicRegionAId(&#34;China&#34;)
 *             .geographicRegionBId(&#34;China&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.bj())
 *                 .build());
 * 
 *         var exampleBandwidthPackageAttachment = new BandwidthPackageAttachment(&#34;exampleBandwidthPackageAttachment&#34;, BandwidthPackageAttachmentArgs.builder()        
 *             .instanceId(exampleInstance.id())
 *             .bandwidthPackageId(exampleBandwidthPackage.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.bj())
 *                 .build());
 * 
 *         var exampleTransitRouter = new TransitRouter(&#34;exampleTransitRouter&#34;, TransitRouterArgs.builder()        
 *             .cenId(exampleBandwidthPackageAttachment.instanceId())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.hz())
 *                 .build());
 * 
 *         var peer = new TransitRouter(&#34;peer&#34;, TransitRouterArgs.builder()        
 *             .cenId(exampleTransitRouter.cenId())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(alicloud.bj())
 *                 .build());
 * 
 *         var exampleTransitRouterPeerAttachment = new TransitRouterPeerAttachment(&#34;exampleTransitRouterPeerAttachment&#34;, TransitRouterPeerAttachmentArgs.builder()        
 *             .cenId(exampleInstance.id())
 *             .transitRouterId(exampleTransitRouter.transitRouterId())
 *             .peerTransitRouterRegionId(peerRegion)
 *             .peerTransitRouterId(peer.transitRouterId())
 *             .cenBandwidthPackageId(exampleBandwidthPackageAttachment.bandwidthPackageId())
 *             .bandwidth(5)
 *             .transitRouterAttachmentDescription(name)
 *             .transitRouterAttachmentName(name)
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
 * CEN instance can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cen/transitRouterPeerAttachment:TransitRouterPeerAttachment example tr-********:tr-attach-*******
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/transitRouterPeerAttachment:TransitRouterPeerAttachment")
public class TransitRouterPeerAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Auto publish route enabled. The system default value is `false`.
     * 
     */
    @Export(name="autoPublishRouteEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoPublishRouteEnabled;

    /**
     * @return Auto publish route enabled. The system default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> autoPublishRouteEnabled() {
        return Codegen.optional(this.autoPublishRouteEnabled);
    }
    /**
     * The bandwidth of the bandwidth package.
     * 
     */
    @Export(name="bandwidth", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> bandwidth;

    /**
     * @return The bandwidth of the bandwidth package.
     * 
     */
    public Output<Optional<Integer>> bandwidth() {
        return Codegen.optional(this.bandwidth);
    }
    /**
     * The method that is used to allocate bandwidth to the cross-region connection. Valid values: `BandwidthPackage` and `DataTransfer`.
     * 
     */
    @Export(name="bandwidthType", type=String.class, parameters={})
    private Output<String> bandwidthType;

    /**
     * @return The method that is used to allocate bandwidth to the cross-region connection. Valid values: `BandwidthPackage` and `DataTransfer`.
     * 
     */
    public Output<String> bandwidthType() {
        return this.bandwidthType;
    }
    /**
     * The ID of the bandwidth package. If you do not enter the ID of the package, it means you are using the test. The system default test is 1bps, demonstrating that you test network connectivity
     * 
     */
    @Export(name="cenBandwidthPackageId", type=String.class, parameters={})
    private Output</* @Nullable */ String> cenBandwidthPackageId;

    /**
     * @return The ID of the bandwidth package. If you do not enter the ID of the package, it means you are using the test. The system default test is 1bps, demonstrating that you test network connectivity
     * 
     */
    public Output<Optional<String>> cenBandwidthPackageId() {
        return Codegen.optional(this.cenBandwidthPackageId);
    }
    /**
     * The ID of the CEN.
     * 
     */
    @Export(name="cenId", type=String.class, parameters={})
    private Output<String> cenId;

    /**
     * @return The ID of the CEN.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }
    /**
     * Whether to perform pre-check for this request, including permission, instance status verification, etc.
     * 
     */
    @Export(name="dryRun", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Whether to perform pre-check for this request, including permission, instance status verification, etc.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The ID of the peer transit router.
     * 
     */
    @Export(name="peerTransitRouterId", type=String.class, parameters={})
    private Output<String> peerTransitRouterId;

    /**
     * @return The ID of the peer transit router.
     * 
     */
    public Output<String> peerTransitRouterId() {
        return this.peerTransitRouterId;
    }
    /**
     * The region ID of peer transit router.
     * 
     */
    @Export(name="peerTransitRouterRegionId", type=String.class, parameters={})
    private Output<String> peerTransitRouterRegionId;

    /**
     * @return The region ID of peer transit router.
     * 
     */
    public Output<String> peerTransitRouterRegionId() {
        return this.peerTransitRouterRegionId;
    }
    /**
     * The resource type to attachment. Only support `VR` and default value is `VR`.
     * 
     */
    @Export(name="resourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceType;

    /**
     * @return The resource type to attachment. Only support `VR` and default value is `VR`.
     * 
     */
    public Output<Optional<String>> resourceType() {
        return Codegen.optional(this.resourceType);
    }
    /**
     * Whether to association route table. System default is `false`.
     * 
     */
    @Export(name="routeTableAssociationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> routeTableAssociationEnabled;

    /**
     * @return Whether to association route table. System default is `false`.
     * 
     */
    public Output<Optional<Boolean>> routeTableAssociationEnabled() {
        return Codegen.optional(this.routeTableAssociationEnabled);
    }
    /**
     * Whether to propagation route table. System default is `false`.
     * 
     */
    @Export(name="routeTablePropagationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> routeTablePropagationEnabled;

    /**
     * @return Whether to propagation route table. System default is `false`.
     * 
     */
    public Output<Optional<Boolean>> routeTablePropagationEnabled() {
        return Codegen.optional(this.routeTablePropagationEnabled);
    }
    /**
     * The associating status of the network.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The associating status of the network.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The description of transit router attachment. The description is 2~256 characters long and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="transitRouterAttachmentDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> transitRouterAttachmentDescription;

    /**
     * @return The description of transit router attachment. The description is 2~256 characters long and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> transitRouterAttachmentDescription() {
        return Codegen.optional(this.transitRouterAttachmentDescription);
    }
    /**
     * The ID of transit router attachment id.
     * 
     */
    @Export(name="transitRouterAttachmentId", type=String.class, parameters={})
    private Output<String> transitRouterAttachmentId;

    /**
     * @return The ID of transit router attachment id.
     * 
     */
    public Output<String> transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }
    /**
     * The name of transit router attachment. The name is 2~128 characters in length, starts with uppercase and lowercase letters or Chinese, and can contain numbers, underscores (_) and dashes (-)
     * 
     */
    @Export(name="transitRouterAttachmentName", type=String.class, parameters={})
    private Output</* @Nullable */ String> transitRouterAttachmentName;

    /**
     * @return The name of transit router attachment. The name is 2~128 characters in length, starts with uppercase and lowercase letters or Chinese, and can contain numbers, underscores (_) and dashes (-)
     * 
     */
    public Output<Optional<String>> transitRouterAttachmentName() {
        return Codegen.optional(this.transitRouterAttachmentName);
    }
    /**
     * The ID of the transit router to attach.
     * 
     */
    @Export(name="transitRouterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> transitRouterId;

    /**
     * @return The ID of the transit router to attach.
     * 
     */
    public Output<Optional<String>> transitRouterId() {
        return Codegen.optional(this.transitRouterId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitRouterPeerAttachment(String name) {
        this(name, TransitRouterPeerAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitRouterPeerAttachment(String name, TransitRouterPeerAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitRouterPeerAttachment(String name, TransitRouterPeerAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterPeerAttachment:TransitRouterPeerAttachment", name, args == null ? TransitRouterPeerAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitRouterPeerAttachment(String name, Output<String> id, @Nullable TransitRouterPeerAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterPeerAttachment:TransitRouterPeerAttachment", name, state, makeResourceOptions(options, id));
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
    public static TransitRouterPeerAttachment get(String name, Output<String> id, @Nullable TransitRouterPeerAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitRouterPeerAttachment(name, id, state, options);
    }
}
