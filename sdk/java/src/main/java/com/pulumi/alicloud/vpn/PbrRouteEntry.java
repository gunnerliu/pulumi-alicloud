// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpn.PbrRouteEntryArgs;
import com.pulumi.alicloud.vpn.inputs.PbrRouteEntryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a VPN Pbr Route Entry resource.
 * 
 * &gt; **NOTE:** Available in 1.162.0+.
 * 
 * For information about VPN Pbr Route Entry and how to use it, see [What is VPN Pbr Route Entry](https://www.alibabacloud.com/help/en/doc-detail/127248.html).
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
 * import com.pulumi.alicloud.vpn.VpnFunctions;
 * import com.pulumi.alicloud.vpn.inputs.GetGatewaysArgs;
 * import com.pulumi.alicloud.vpn.CustomerGateway;
 * import com.pulumi.alicloud.vpn.CustomerGatewayArgs;
 * import com.pulumi.alicloud.vpn.Connection;
 * import com.pulumi.alicloud.vpn.ConnectionArgs;
 * import com.pulumi.alicloud.vpn.PbrRouteEntry;
 * import com.pulumi.alicloud.vpn.PbrRouteEntryArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tfacc&#34;);
 *         final var defaultGateways = VpnFunctions.getGateways();
 * 
 *         var defaultCustomerGateway = new CustomerGateway(&#34;defaultCustomerGateway&#34;, CustomerGatewayArgs.builder()        
 *             .ipAddress(&#34;192.168.1.1&#34;)
 *             .build());
 * 
 *         var defaultConnection = new Connection(&#34;defaultConnection&#34;, ConnectionArgs.builder()        
 *             .customerGatewayId(defaultCustomerGateway.id())
 *             .vpnGatewayId(defaultGateways.applyValue(getGatewaysResult -&gt; getGatewaysResult.ids()[0]))
 *             .localSubnets(&#34;192.168.2.0/24&#34;)
 *             .remoteSubnets(&#34;192.168.3.0/24&#34;)
 *             .build());
 * 
 *         var defaultPbrRouteEntry = new PbrRouteEntry(&#34;defaultPbrRouteEntry&#34;, PbrRouteEntryArgs.builder()        
 *             .vpnGatewayId(defaultGateways.applyValue(getGatewaysResult -&gt; getGatewaysResult.ids()[0]))
 *             .routeSource(&#34;192.168.1.0/24&#34;)
 *             .routeDest(&#34;10.0.0.0/24&#34;)
 *             .nextHop(defaultConnection.id())
 *             .weight(0)
 *             .publishVpc(false)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * VPN Pbr route entry can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpn/pbrRouteEntry:PbrRouteEntry example &lt;vpn_gateway_id&gt;:&lt;next_hop&gt;:&lt;route_source&gt;:&lt;route_dest&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpn/pbrRouteEntry:PbrRouteEntry")
public class PbrRouteEntry extends com.pulumi.resources.CustomResource {
    /**
     * The next hop of the policy-based route.
     * 
     */
    @Export(name="nextHop", refs={String.class}, tree="[0]")
    private Output<String> nextHop;

    /**
     * @return The next hop of the policy-based route.
     * 
     */
    public Output<String> nextHop() {
        return this.nextHop;
    }
    /**
     * Whether to issue the destination route to the VPC.
     * 
     */
    @Export(name="publishVpc", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> publishVpc;

    /**
     * @return Whether to issue the destination route to the VPC.
     * 
     */
    public Output<Boolean> publishVpc() {
        return this.publishVpc;
    }
    /**
     * The destination CIDR block of the policy-based route.
     * 
     */
    @Export(name="routeDest", refs={String.class}, tree="[0]")
    private Output<String> routeDest;

    /**
     * @return The destination CIDR block of the policy-based route.
     * 
     */
    public Output<String> routeDest() {
        return this.routeDest;
    }
    /**
     * The source CIDR block of the policy-based route.
     * 
     */
    @Export(name="routeSource", refs={String.class}, tree="[0]")
    private Output<String> routeSource;

    /**
     * @return The source CIDR block of the policy-based route.
     * 
     */
    public Output<String> routeSource() {
        return this.routeSource;
    }
    /**
     * The status of the vpn pbr route entry.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the vpn pbr route entry.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The ID of the vpn gateway.
     * 
     */
    @Export(name="vpnGatewayId", refs={String.class}, tree="[0]")
    private Output<String> vpnGatewayId;

    /**
     * @return The ID of the vpn gateway.
     * 
     */
    public Output<String> vpnGatewayId() {
        return this.vpnGatewayId;
    }
    /**
     * The weight of the policy-based route. Valid values: 0 and 100.
     * 
     */
    @Export(name="weight", refs={Integer.class}, tree="[0]")
    private Output<Integer> weight;

    /**
     * @return The weight of the policy-based route. Valid values: 0 and 100.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PbrRouteEntry(String name) {
        this(name, PbrRouteEntryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PbrRouteEntry(String name, PbrRouteEntryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PbrRouteEntry(String name, PbrRouteEntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpn/pbrRouteEntry:PbrRouteEntry", name, args == null ? PbrRouteEntryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PbrRouteEntry(String name, Output<String> id, @Nullable PbrRouteEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpn/pbrRouteEntry:PbrRouteEntry", name, state, makeResourceOptions(options, id));
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
    public static PbrRouteEntry get(String name, Output<String> id, @Nullable PbrRouteEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PbrRouteEntry(name, id, state, options);
    }
}
