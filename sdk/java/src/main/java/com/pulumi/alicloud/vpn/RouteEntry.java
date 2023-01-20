// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpn.RouteEntryArgs;
import com.pulumi.alicloud.vpn.inputs.RouteEntryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.vpn.Gateway;
 * import com.pulumi.alicloud.vpn.GatewayArgs;
 * import com.pulumi.alicloud.vpn.CustomerGateway;
 * import com.pulumi.alicloud.vpn.CustomerGatewayArgs;
 * import com.pulumi.alicloud.vpn.Connection;
 * import com.pulumi.alicloud.vpn.ConnectionArgs;
 * import com.pulumi.alicloud.vpn.RouteEntry;
 * import com.pulumi.alicloud.vpn.RouteEntryArgs;
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
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableDiskCategory(&#34;cloud_efficiency&#34;)
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .cidrBlock(&#34;10.1.0.0/21&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock(&#34;10.1.0.0/24&#34;)
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var defaultGateway = new Gateway(&#34;defaultGateway&#34;, GatewayArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .bandwidth(10)
 *             .instanceChargeType(&#34;PayByTraffic&#34;)
 *             .enableSsl(false)
 *             .vswitchId(defaultSwitch.id())
 *             .build());
 * 
 *         var defaultCustomerGateway = new CustomerGateway(&#34;defaultCustomerGateway&#34;, CustomerGatewayArgs.builder()        
 *             .ipAddress(&#34;192.168.1.1&#34;)
 *             .build());
 * 
 *         var defaultConnection = new Connection(&#34;defaultConnection&#34;, ConnectionArgs.builder()        
 *             .customerGatewayId(defaultCustomerGateway.id())
 *             .vpnGatewayId(defaultGateway.id())
 *             .localSubnets(&#34;192.168.2.0/24&#34;)
 *             .remoteSubnets(&#34;192.168.3.0/24&#34;)
 *             .build());
 * 
 *         var defaultRouteEntry = new RouteEntry(&#34;defaultRouteEntry&#34;, RouteEntryArgs.builder()        
 *             .vpnGatewayId(defaultGateway.id())
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
 * VPN route entry can be imported using the id(VpnGatewayId +&#34;:&#34;+ NextHop +&#34;:&#34;+ RouteDest), e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpn/routeEntry:RouteEntry example vpn-abc123456:vco-abc123456:10.0.0.10/24
 * ```
 * 
 */
@ResourceType(type="alicloud:vpn/routeEntry:RouteEntry")
public class RouteEntry extends com.pulumi.resources.CustomResource {
    /**
     * The next hop of the destination route.
     * 
     */
    @Export(name="nextHop", type=String.class, parameters={})
    private Output<String> nextHop;

    /**
     * @return The next hop of the destination route.
     * 
     */
    public Output<String> nextHop() {
        return this.nextHop;
    }
    /**
     * Whether to issue the destination route to the VPC.
     * 
     */
    @Export(name="publishVpc", type=Boolean.class, parameters={})
    private Output<Boolean> publishVpc;

    /**
     * @return Whether to issue the destination route to the VPC.
     * 
     */
    public Output<Boolean> publishVpc() {
        return this.publishVpc;
    }
    /**
     * The destination network segment of the destination route.
     * 
     */
    @Export(name="routeDest", type=String.class, parameters={})
    private Output<String> routeDest;

    /**
     * @return The destination network segment of the destination route.
     * 
     */
    public Output<String> routeDest() {
        return this.routeDest;
    }
    /**
     * (Available in 1.161.0+) The type of the vpn route entry.
     * 
     */
    @Export(name="routeEntryType", type=String.class, parameters={})
    private Output<String> routeEntryType;

    /**
     * @return (Available in 1.161.0+) The type of the vpn route entry.
     * 
     */
    public Output<String> routeEntryType() {
        return this.routeEntryType;
    }
    /**
     * (Available in 1.161.0+) The status of the vpn route entry.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return (Available in 1.161.0+) The status of the vpn route entry.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The id of the vpn gateway.
     * 
     */
    @Export(name="vpnGatewayId", type=String.class, parameters={})
    private Output<String> vpnGatewayId;

    /**
     * @return The id of the vpn gateway.
     * 
     */
    public Output<String> vpnGatewayId() {
        return this.vpnGatewayId;
    }
    /**
     * The value should be 0 or 100.
     * 
     */
    @Export(name="weight", type=Integer.class, parameters={})
    private Output<Integer> weight;

    /**
     * @return The value should be 0 or 100.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteEntry(String name) {
        this(name, RouteEntryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteEntry(String name, RouteEntryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteEntry(String name, RouteEntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpn/routeEntry:RouteEntry", name, args == null ? RouteEntryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouteEntry(String name, Output<String> id, @Nullable RouteEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpn/routeEntry:RouteEntry", name, state, makeResourceOptions(options, id));
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
    public static RouteEntry get(String name, Output<String> id, @Nullable RouteEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouteEntry(name, id, state, options);
    }
}
