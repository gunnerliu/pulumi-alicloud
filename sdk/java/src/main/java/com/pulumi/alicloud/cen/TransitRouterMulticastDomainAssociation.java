// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TransitRouterMulticastDomainAssociationArgs;
import com.pulumi.alicloud.cen.inputs.TransitRouterMulticastDomainAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Enterprise Network (CEN) Transit Router Multicast Domain Association resource.
 * 
 * For information about Cloud Enterprise Network (CEN) Transit Router Multicast Domain Association and how to use it, see [What is Transit Router Multicast Domain Association](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-associatetransitroutermulticastdomain).
 * 
 * &gt; **NOTE:** Available in v1.195.0+.
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
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceArgs;
 * import com.pulumi.alicloud.cen.TransitRouter;
 * import com.pulumi.alicloud.cen.TransitRouterArgs;
 * import com.pulumi.alicloud.cen.TransitRouterMulticastDomain;
 * import com.pulumi.alicloud.cen.TransitRouterMulticastDomainArgs;
 * import com.pulumi.alicloud.cen.TransitRouterVpcAttachment;
 * import com.pulumi.alicloud.cen.TransitRouterVpcAttachmentArgs;
 * import com.pulumi.alicloud.cen.inputs.TransitRouterVpcAttachmentZoneMappingArgs;
 * import com.pulumi.alicloud.cen.TransitRouterMulticastDomainAssociation;
 * import com.pulumi.alicloud.cen.TransitRouterMulticastDomainAssociationArgs;
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
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .cenInstanceName(&#34;tf-example&#34;)
 *             .build());
 * 
 *         var defaultTransitRouter = new TransitRouter(&#34;defaultTransitRouter&#34;, TransitRouterArgs.builder()        
 *             .cenId(defaultInstance.id())
 *             .supportMulticast(true)
 *             .build());
 * 
 *         var defaultTransitRouterMulticastDomain = new TransitRouterMulticastDomain(&#34;defaultTransitRouterMulticastDomain&#34;, TransitRouterMulticastDomainArgs.builder()        
 *             .transitRouterId(defaultTransitRouter.transitRouterId())
 *             .build());
 * 
 *         var defaultTransitRouterVpcAttachment = new TransitRouterVpcAttachment(&#34;defaultTransitRouterVpcAttachment&#34;, TransitRouterVpcAttachmentArgs.builder()        
 *             .cenId(defaultTransitRouter.cenId())
 *             .transitRouterId(defaultTransitRouterMulticastDomain.transitRouterId())
 *             .vpcId(&#34;your_vpc_id&#34;)
 *             .zoneMappings(TransitRouterVpcAttachmentZoneMappingArgs.builder()
 *                 .zoneId(&#34;your_zone_id&#34;)
 *                 .vswitchId(&#34;your_vswitch_id&#34;)
 *                 .build())
 *             .build());
 * 
 *         var defaultTransitRouterMulticastDomainAssociation = new TransitRouterMulticastDomainAssociation(&#34;defaultTransitRouterMulticastDomainAssociation&#34;, TransitRouterMulticastDomainAssociationArgs.builder()        
 *             .transitRouterMulticastDomainId(defaultTransitRouterMulticastDomain.id())
 *             .transitRouterAttachmentId(defaultTransitRouterVpcAttachment.transitRouterAttachmentId())
 *             .vswitchId(&#34;your_vswitch_id&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Enterprise Network (CEN) Transit Router Multicast Domain Association can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cen/transitRouterMulticastDomainAssociation:TransitRouterMulticastDomainAssociation example &lt;transit_router_multicast_domain_id&gt;:&lt;transit_router_attachment_id&gt;:&lt;vswitch_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/transitRouterMulticastDomainAssociation:TransitRouterMulticastDomainAssociation")
public class TransitRouterMulticastDomainAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The status of the Transit Router Multicast Domain Association.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the Transit Router Multicast Domain Association.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The ID of the VPC connection.
     * 
     */
    @Export(name="transitRouterAttachmentId", type=String.class, parameters={})
    private Output<String> transitRouterAttachmentId;

    /**
     * @return The ID of the VPC connection.
     * 
     */
    public Output<String> transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }
    /**
     * The ID of the multicast domain.
     * 
     */
    @Export(name="transitRouterMulticastDomainId", type=String.class, parameters={})
    private Output<String> transitRouterMulticastDomainId;

    /**
     * @return The ID of the multicast domain.
     * 
     */
    public Output<String> transitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }
    /**
     * The ID of the vSwitch.
     * 
     */
    @Export(name="vswitchId", type=String.class, parameters={})
    private Output<String> vswitchId;

    /**
     * @return The ID of the vSwitch.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitRouterMulticastDomainAssociation(String name) {
        this(name, TransitRouterMulticastDomainAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitRouterMulticastDomainAssociation(String name, TransitRouterMulticastDomainAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitRouterMulticastDomainAssociation(String name, TransitRouterMulticastDomainAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterMulticastDomainAssociation:TransitRouterMulticastDomainAssociation", name, args == null ? TransitRouterMulticastDomainAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitRouterMulticastDomainAssociation(String name, Output<String> id, @Nullable TransitRouterMulticastDomainAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterMulticastDomainAssociation:TransitRouterMulticastDomainAssociation", name, state, makeResourceOptions(options, id));
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
    public static TransitRouterMulticastDomainAssociation get(String name, Output<String> id, @Nullable TransitRouterMulticastDomainAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitRouterMulticastDomainAssociation(name, id, state, options);
    }
}
