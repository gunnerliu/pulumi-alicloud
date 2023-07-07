// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TransitRouterVpnAttachmentArgs;
import com.pulumi.alicloud.cen.inputs.TransitRouterVpnAttachmentState;
import com.pulumi.alicloud.cen.outputs.TransitRouterVpnAttachmentZone;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Enterprise Network (CEN) Transit Router Vpn Attachment resource.
 * 
 * For information about Cloud Enterprise Network (CEN) Transit Router Vpn Attachment and how to use it, see [What is Transit Router Vpn Attachment](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-createtransitroutervpnattachment).
 * 
 * &gt; **NOTE:** Available since v1.183.0.
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
 * import com.pulumi.alicloud.cen.CenFunctions;
 * import com.pulumi.alicloud.cen.inputs.GetTransitRouterAvailableResourcesArgs;
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceArgs;
 * import com.pulumi.alicloud.cen.TransitRouter;
 * import com.pulumi.alicloud.cen.TransitRouterArgs;
 * import com.pulumi.alicloud.vpn.CustomerGateway;
 * import com.pulumi.alicloud.vpn.CustomerGatewayArgs;
 * import com.pulumi.alicloud.vpn.GatewayVpnAttachment;
 * import com.pulumi.alicloud.vpn.GatewayVpnAttachmentArgs;
 * import com.pulumi.alicloud.vpn.inputs.GatewayVpnAttachmentIkeConfigArgs;
 * import com.pulumi.alicloud.vpn.inputs.GatewayVpnAttachmentIpsecConfigArgs;
 * import com.pulumi.alicloud.vpn.inputs.GatewayVpnAttachmentBgpConfigArgs;
 * import com.pulumi.alicloud.vpn.inputs.GatewayVpnAttachmentHealthCheckConfigArgs;
 * import com.pulumi.alicloud.cen.TransitRouterCidr;
 * import com.pulumi.alicloud.cen.TransitRouterCidrArgs;
 * import com.pulumi.alicloud.cen.TransitRouterVpnAttachment;
 * import com.pulumi.alicloud.cen.TransitRouterVpnAttachmentArgs;
 * import com.pulumi.alicloud.cen.inputs.TransitRouterVpnAttachmentZoneArgs;
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
 *         final var default = CenFunctions.getTransitRouterAvailableResources();
 * 
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .cenInstanceName(name)
 *             .build());
 * 
 *         var exampleTransitRouter = new TransitRouter(&#34;exampleTransitRouter&#34;, TransitRouterArgs.builder()        
 *             .cenId(exampleInstance.id())
 *             .transitRouterDescription(name)
 *             .transitRouterName(name)
 *             .build());
 * 
 *         var exampleCustomerGateway = new CustomerGateway(&#34;exampleCustomerGateway&#34;, CustomerGatewayArgs.builder()        
 *             .ipAddress(&#34;42.104.22.210&#34;)
 *             .asn(&#34;45014&#34;)
 *             .description(name)
 *             .build());
 * 
 *         var exampleGatewayVpnAttachment = new GatewayVpnAttachment(&#34;exampleGatewayVpnAttachment&#34;, GatewayVpnAttachmentArgs.builder()        
 *             .customerGatewayId(exampleCustomerGateway.id())
 *             .networkType(&#34;public&#34;)
 *             .localSubnet(&#34;0.0.0.0/0&#34;)
 *             .remoteSubnet(&#34;0.0.0.0/0&#34;)
 *             .effectImmediately(false)
 *             .ikeConfig(GatewayVpnAttachmentIkeConfigArgs.builder()
 *                 .ikeAuthAlg(&#34;md5&#34;)
 *                 .ikeEncAlg(&#34;des&#34;)
 *                 .ikeVersion(&#34;ikev2&#34;)
 *                 .ikeMode(&#34;main&#34;)
 *                 .ikeLifetime(86400)
 *                 .psk(&#34;tf-testvpn2&#34;)
 *                 .ikePfs(&#34;group1&#34;)
 *                 .remoteId(&#34;testbob2&#34;)
 *                 .localId(&#34;testalice2&#34;)
 *                 .build())
 *             .ipsecConfig(GatewayVpnAttachmentIpsecConfigArgs.builder()
 *                 .ipsecPfs(&#34;group5&#34;)
 *                 .ipsecEncAlg(&#34;des&#34;)
 *                 .ipsecAuthAlg(&#34;md5&#34;)
 *                 .ipsecLifetime(86400)
 *                 .build())
 *             .bgpConfig(GatewayVpnAttachmentBgpConfigArgs.builder()
 *                 .enable(true)
 *                 .localAsn(45014)
 *                 .tunnelCidr(&#34;169.254.11.0/30&#34;)
 *                 .localBgpIp(&#34;169.254.11.1&#34;)
 *                 .build())
 *             .healthCheckConfig(GatewayVpnAttachmentHealthCheckConfigArgs.builder()
 *                 .enable(true)
 *                 .sip(&#34;192.168.1.1&#34;)
 *                 .dip(&#34;10.0.0.1&#34;)
 *                 .interval(10)
 *                 .retry(10)
 *                 .policy(&#34;revoke_route&#34;)
 *                 .build())
 *             .enableDpd(true)
 *             .enableNatTraversal(true)
 *             .vpnAttachmentName(name)
 *             .build());
 * 
 *         var exampleTransitRouterCidr = new TransitRouterCidr(&#34;exampleTransitRouterCidr&#34;, TransitRouterCidrArgs.builder()        
 *             .transitRouterId(exampleTransitRouter.transitRouterId())
 *             .cidr(&#34;192.168.0.0/16&#34;)
 *             .transitRouterCidrName(name)
 *             .description(name)
 *             .publishCidrRoute(true)
 *             .build());
 * 
 *         var exampleTransitRouterVpnAttachment = new TransitRouterVpnAttachment(&#34;exampleTransitRouterVpnAttachment&#34;, TransitRouterVpnAttachmentArgs.builder()        
 *             .autoPublishRouteEnabled(false)
 *             .transitRouterAttachmentDescription(name)
 *             .transitRouterAttachmentName(name)
 *             .cenId(exampleTransitRouter.cenId())
 *             .transitRouterId(exampleTransitRouterCidr.transitRouterId())
 *             .vpnId(exampleGatewayVpnAttachment.id())
 *             .zones(TransitRouterVpnAttachmentZoneArgs.builder()
 *                 .zoneId(default_.resources()[0].masterZones()[0])
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Enterprise Network (CEN) Transit Router Vpn Attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cen/transitRouterVpnAttachment:TransitRouterVpnAttachment example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/transitRouterVpnAttachment:TransitRouterVpnAttachment")
public class TransitRouterVpnAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Whether to allow the forwarding router instance to automatically publish routing entries to IPsec connections.
     * 
     */
    @Export(name="autoPublishRouteEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> autoPublishRouteEnabled;

    /**
     * @return Whether to allow the forwarding router instance to automatically publish routing entries to IPsec connections.
     * 
     */
    public Output<Boolean> autoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }
    /**
     * The id of the cen.
     * 
     */
    @Export(name="cenId", type=String.class, parameters={})
    private Output</* @Nullable */ String> cenId;

    /**
     * @return The id of the cen.
     * 
     */
    public Output<Optional<String>> cenId() {
        return Codegen.optional(this.cenId);
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
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The description of the VPN connection. The description can contain `2` to `256` characters. The description must start with English letters, but cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="transitRouterAttachmentDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> transitRouterAttachmentDescription;

    /**
     * @return The description of the VPN connection. The description can contain `2` to `256` characters. The description must start with English letters, but cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> transitRouterAttachmentDescription() {
        return Codegen.optional(this.transitRouterAttachmentDescription);
    }
    /**
     * The name of the VPN connection. The name must be `2` to `128` characters in length, and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    @Export(name="transitRouterAttachmentName", type=String.class, parameters={})
    private Output</* @Nullable */ String> transitRouterAttachmentName;

    /**
     * @return The name of the VPN connection. The name must be `2` to `128` characters in length, and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    public Output<Optional<String>> transitRouterAttachmentName() {
        return Codegen.optional(this.transitRouterAttachmentName);
    }
    /**
     * The ID of the forwarding router instance.
     * 
     */
    @Export(name="transitRouterId", type=String.class, parameters={})
    private Output<String> transitRouterId;

    /**
     * @return The ID of the forwarding router instance.
     * 
     */
    public Output<String> transitRouterId() {
        return this.transitRouterId;
    }
    /**
     * The id of the vpn.
     * 
     */
    @Export(name="vpnId", type=String.class, parameters={})
    private Output<String> vpnId;

    /**
     * @return The id of the vpn.
     * 
     */
    public Output<String> vpnId() {
        return this.vpnId;
    }
    /**
     * The owner id of vpn. **NOTE:** You must set `vpn_owner_id`, if you want to connect the transit router to an IPsec-VPN connection that belongs to another Alibaba Cloud account.
     * 
     */
    @Export(name="vpnOwnerId", type=String.class, parameters={})
    private Output<String> vpnOwnerId;

    /**
     * @return The owner id of vpn. **NOTE:** You must set `vpn_owner_id`, if you want to connect the transit router to an IPsec-VPN connection that belongs to another Alibaba Cloud account.
     * 
     */
    public Output<String> vpnOwnerId() {
        return this.vpnOwnerId;
    }
    /**
     * The list of zone mapping. See `zone` below.
     * 
     */
    @Export(name="zones", type=List.class, parameters={TransitRouterVpnAttachmentZone.class})
    private Output<List<TransitRouterVpnAttachmentZone>> zones;

    /**
     * @return The list of zone mapping. See `zone` below.
     * 
     */
    public Output<List<TransitRouterVpnAttachmentZone>> zones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitRouterVpnAttachment(String name) {
        this(name, TransitRouterVpnAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitRouterVpnAttachment(String name, TransitRouterVpnAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitRouterVpnAttachment(String name, TransitRouterVpnAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterVpnAttachment:TransitRouterVpnAttachment", name, args == null ? TransitRouterVpnAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitRouterVpnAttachment(String name, Output<String> id, @Nullable TransitRouterVpnAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterVpnAttachment:TransitRouterVpnAttachment", name, state, makeResourceOptions(options, id));
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
    public static TransitRouterVpnAttachment get(String name, Output<String> id, @Nullable TransitRouterVpnAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitRouterVpnAttachment(name, id, state, options);
    }
}
