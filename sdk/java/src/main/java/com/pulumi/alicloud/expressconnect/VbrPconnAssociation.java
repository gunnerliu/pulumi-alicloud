// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.expressconnect.VbrPconnAssociationArgs;
import com.pulumi.alicloud.expressconnect.inputs.VbrPconnAssociationState;
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
 * Provides a Express Connect Vbr Pconn Association resource.
 * 
 * For information about Express Connect Vbr Pconn Association and how to use it, see [What is Vbr Pconn Association](https://www.alibabacloud.com/help/en/express-connect/latest/associatephysicalconnectiontovirtualborderrouter#doc-api-Vpc-AssociatePhysicalConnectionToVirtualBorderRouter).
 * 
 * &gt; **NOTE:** Available since v1.196.0.
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
 * import com.pulumi.alicloud.expressconnect.ExpressconnectFunctions;
 * import com.pulumi.alicloud.expressconnect.inputs.GetPhysicalConnectionsArgs;
 * import com.pulumi.random.RandomInteger;
 * import com.pulumi.random.RandomIntegerArgs;
 * import com.pulumi.alicloud.expressconnect.VirtualBorderRouter;
 * import com.pulumi.alicloud.expressconnect.VirtualBorderRouterArgs;
 * import com.pulumi.alicloud.expressconnect.VbrPconnAssociation;
 * import com.pulumi.alicloud.expressconnect.VbrPconnAssociationArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-example&#34;);
 *         final var examplePhysicalConnections = ExpressconnectFunctions.getPhysicalConnections(GetPhysicalConnectionsArgs.builder()
 *             .nameRegex(&#34;^preserved-NODELETING&#34;)
 *             .build());
 * 
 *         var vlanId = new RandomInteger(&#34;vlanId&#34;, RandomIntegerArgs.builder()        
 *             .max(2999)
 *             .min(1)
 *             .build());
 * 
 *         var exampleVirtualBorderRouter = new VirtualBorderRouter(&#34;exampleVirtualBorderRouter&#34;, VirtualBorderRouterArgs.builder()        
 *             .localGatewayIp(&#34;10.0.0.1&#34;)
 *             .peerGatewayIp(&#34;10.0.0.2&#34;)
 *             .peeringSubnetMask(&#34;255.255.255.252&#34;)
 *             .physicalConnectionId(examplePhysicalConnections.applyValue(getPhysicalConnectionsResult -&gt; getPhysicalConnectionsResult.connections()[0].id()))
 *             .virtualBorderRouterName(name)
 *             .vlanId(vlanId.id())
 *             .minRxInterval(1000)
 *             .minTxInterval(1000)
 *             .detectMultiplier(10)
 *             .enableIpv6(true)
 *             .localIpv6GatewayIp(&#34;2408:4004:cc:400::1&#34;)
 *             .peerIpv6GatewayIp(&#34;2408:4004:cc:400::2&#34;)
 *             .peeringIpv6SubnetMask(&#34;2408:4004:cc:400::/56&#34;)
 *             .build());
 * 
 *         var exampleVbrPconnAssociation = new VbrPconnAssociation(&#34;exampleVbrPconnAssociation&#34;, VbrPconnAssociationArgs.builder()        
 *             .peerGatewayIp(&#34;10.0.0.6&#34;)
 *             .localGatewayIp(&#34;10.0.0.5&#34;)
 *             .physicalConnectionId(examplePhysicalConnections.applyValue(getPhysicalConnectionsResult -&gt; getPhysicalConnectionsResult.connections()[2].id()))
 *             .vbrId(exampleVirtualBorderRouter.id())
 *             .peeringSubnetMask(&#34;255.255.255.252&#34;)
 *             .vlanId(vlanId.id().applyValue(id -&gt; id + 2))
 *             .enableIpv6(true)
 *             .localIpv6GatewayIp(&#34;2408:4004:cc::3&#34;)
 *             .peerIpv6GatewayIp(&#34;2408:4004:cc::4&#34;)
 *             .peeringIpv6SubnetMask(&#34;2408:4004:cc::/56&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Express Connect Vbr Pconn Association can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:expressconnect/vbrPconnAssociation:VbrPconnAssociation example &lt;VbrId&gt;:&lt;PhysicalConnectionId&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:expressconnect/vbrPconnAssociation:VbrPconnAssociation")
public class VbrPconnAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The circuit code provided by the operator for the physical connection.
     * 
     */
    @Export(name="circuitCode", refs={String.class}, tree="[0]")
    private Output<String> circuitCode;

    /**
     * @return The circuit code provided by the operator for the physical connection.
     * 
     */
    public Output<String> circuitCode() {
        return this.circuitCode;
    }
    /**
     * Whether IPv6 is enabled. Value:
     * - **true**: on.
     * - **false** (default): Off.
     * 
     */
    @Export(name="enableIpv6", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableIpv6;

    /**
     * @return Whether IPv6 is enabled. Value:
     * - **true**: on.
     * - **false** (default): Off.
     * 
     */
    public Output<Boolean> enableIpv6() {
        return this.enableIpv6;
    }
    /**
     * The Alibaba cloud IP address of the VBR instance.
     * 
     */
    @Export(name="localGatewayIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> localGatewayIp;

    /**
     * @return The Alibaba cloud IP address of the VBR instance.
     * 
     */
    public Output<Optional<String>> localGatewayIp() {
        return Codegen.optional(this.localGatewayIp);
    }
    /**
     * The IPv6 address on the Alibaba Cloud side of the VBR instance.
     * 
     */
    @Export(name="localIpv6GatewayIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> localIpv6GatewayIp;

    /**
     * @return The IPv6 address on the Alibaba Cloud side of the VBR instance.
     * 
     */
    public Output<Optional<String>> localIpv6GatewayIp() {
        return Codegen.optional(this.localIpv6GatewayIp);
    }
    /**
     * The client IP address of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     * 
     */
    @Export(name="peerGatewayIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> peerGatewayIp;

    /**
     * @return The client IP address of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     * 
     */
    public Output<Optional<String>> peerGatewayIp() {
        return Codegen.optional(this.peerGatewayIp);
    }
    /**
     * The IPv6 address of the client side of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     * 
     */
    @Export(name="peerIpv6GatewayIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> peerIpv6GatewayIp;

    /**
     * @return The IPv6 address of the client side of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
     * 
     */
    public Output<Optional<String>> peerIpv6GatewayIp() {
        return Codegen.optional(this.peerIpv6GatewayIp);
    }
    /**
     * The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.Two IPv6 addresses must be in the same subnet.
     * 
     */
    @Export(name="peeringIpv6SubnetMask", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> peeringIpv6SubnetMask;

    /**
     * @return The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.Two IPv6 addresses must be in the same subnet.
     * 
     */
    public Output<Optional<String>> peeringIpv6SubnetMask() {
        return Codegen.optional(this.peeringIpv6SubnetMask);
    }
    /**
     * The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.The two IP addresses must be in the same subnet.
     * 
     */
    @Export(name="peeringSubnetMask", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> peeringSubnetMask;

    /**
     * @return The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.The two IP addresses must be in the same subnet.
     * 
     */
    public Output<Optional<String>> peeringSubnetMask() {
        return Codegen.optional(this.peeringSubnetMask);
    }
    /**
     * The ID of the leased line instance.
     * 
     */
    @Export(name="physicalConnectionId", refs={String.class}, tree="[0]")
    private Output<String> physicalConnectionId;

    /**
     * @return The ID of the leased line instance.
     * 
     */
    public Output<String> physicalConnectionId() {
        return this.physicalConnectionId;
    }
    /**
     * The status of the resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The ID of the VBR instance.
     * 
     */
    @Export(name="vbrId", refs={String.class}, tree="[0]")
    private Output<String> vbrId;

    /**
     * @return The ID of the VBR instance.
     * 
     */
    public Output<String> vbrId() {
        return this.vbrId;
    }
    /**
     * VLAN ID of the VBR. Valid values: **0 to 2999**. **NOTE:** only the owner of the physical connection can specify this parameter. The VLAN ID of two VBRs under the same physical connection cannot be the same.
     * 
     */
    @Export(name="vlanId", refs={Integer.class}, tree="[0]")
    private Output<Integer> vlanId;

    /**
     * @return VLAN ID of the VBR. Valid values: **0 to 2999**. **NOTE:** only the owner of the physical connection can specify this parameter. The VLAN ID of two VBRs under the same physical connection cannot be the same.
     * 
     */
    public Output<Integer> vlanId() {
        return this.vlanId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VbrPconnAssociation(String name) {
        this(name, VbrPconnAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VbrPconnAssociation(String name, VbrPconnAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VbrPconnAssociation(String name, VbrPconnAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:expressconnect/vbrPconnAssociation:VbrPconnAssociation", name, args == null ? VbrPconnAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VbrPconnAssociation(String name, Output<String> id, @Nullable VbrPconnAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:expressconnect/vbrPconnAssociation:VbrPconnAssociation", name, state, makeResourceOptions(options, id));
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
    public static VbrPconnAssociation get(String name, Output<String> id, @Nullable VbrPconnAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VbrPconnAssociation(name, id, state, options);
    }
}
