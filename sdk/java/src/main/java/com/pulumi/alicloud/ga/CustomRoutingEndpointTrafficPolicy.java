// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ga.CustomRoutingEndpointTrafficPolicyArgs;
import com.pulumi.alicloud.ga.inputs.CustomRoutingEndpointTrafficPolicyState;
import com.pulumi.alicloud.ga.outputs.CustomRoutingEndpointTrafficPolicyPortRange;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Global Accelerator (GA) Custom Routing Endpoint Traffic Policy resource.
 * 
 * For information about Global Accelerator (GA) Custom Routing Endpoint Traffic Policy and how to use it, see [What is Custom Routing Endpoint Traffic Policy](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createcustomroutingendpointtrafficpolicies).
 * 
 * &gt; **NOTE:** Available since v1.197.0.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ga.Accelerator;
 * import com.pulumi.alicloud.ga.AcceleratorArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackage;
 * import com.pulumi.alicloud.ga.BandwidthPackageArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachment;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachmentArgs;
 * import com.pulumi.alicloud.ga.Listener;
 * import com.pulumi.alicloud.ga.ListenerArgs;
 * import com.pulumi.alicloud.ga.inputs.ListenerPortRangeArgs;
 * import com.pulumi.alicloud.ga.CustomRoutingEndpointGroup;
 * import com.pulumi.alicloud.ga.CustomRoutingEndpointGroupArgs;
 * import com.pulumi.alicloud.ga.CustomRoutingEndpoint;
 * import com.pulumi.alicloud.ga.CustomRoutingEndpointArgs;
 * import com.pulumi.alicloud.ga.CustomRoutingEndpointGroupDestination;
 * import com.pulumi.alicloud.ga.CustomRoutingEndpointGroupDestinationArgs;
 * import com.pulumi.alicloud.ga.CustomRoutingEndpointTrafficPolicy;
 * import com.pulumi.alicloud.ga.CustomRoutingEndpointTrafficPolicyArgs;
 * import com.pulumi.alicloud.ga.inputs.CustomRoutingEndpointTrafficPolicyPortRangeArgs;
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
 *         final var region = config.get(&#34;region&#34;).orElse(&#34;cn-hangzhou&#34;);
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(&#34;terraform-example&#34;)
 *             .cidrBlock(&#34;172.17.3.0/24&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(&#34;terraform-example&#34;)
 *             .cidrBlock(&#34;172.17.3.0/24&#34;)
 *             .vpcId(defaultNetwork.id())
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var defaultAccelerator = new Accelerator(&#34;defaultAccelerator&#34;, AcceleratorArgs.builder()        
 *             .duration(1)
 *             .autoUseCoupon(true)
 *             .spec(&#34;1&#34;)
 *             .build());
 * 
 *         var defaultBandwidthPackage = new BandwidthPackage(&#34;defaultBandwidthPackage&#34;, BandwidthPackageArgs.builder()        
 *             .bandwidth(100)
 *             .type(&#34;Basic&#34;)
 *             .bandwidthType(&#34;Basic&#34;)
 *             .paymentType(&#34;PayAsYouGo&#34;)
 *             .billingType(&#34;PayBy95&#34;)
 *             .ratio(30)
 *             .build());
 * 
 *         var defaultBandwidthPackageAttachment = new BandwidthPackageAttachment(&#34;defaultBandwidthPackageAttachment&#34;, BandwidthPackageAttachmentArgs.builder()        
 *             .acceleratorId(defaultAccelerator.id())
 *             .bandwidthPackageId(defaultBandwidthPackage.id())
 *             .build());
 * 
 *         var defaultListener = new Listener(&#34;defaultListener&#34;, ListenerArgs.builder()        
 *             .acceleratorId(defaultBandwidthPackageAttachment.acceleratorId())
 *             .listenerType(&#34;CustomRouting&#34;)
 *             .portRanges(ListenerPortRangeArgs.builder()
 *                 .fromPort(10000)
 *                 .toPort(16000)
 *                 .build())
 *             .build());
 * 
 *         var defaultCustomRoutingEndpointGroup = new CustomRoutingEndpointGroup(&#34;defaultCustomRoutingEndpointGroup&#34;, CustomRoutingEndpointGroupArgs.builder()        
 *             .acceleratorId(defaultListener.acceleratorId())
 *             .listenerId(defaultListener.id())
 *             .endpointGroupRegion(region)
 *             .customRoutingEndpointGroupName(&#34;terraform-example&#34;)
 *             .description(&#34;terraform-example&#34;)
 *             .build());
 * 
 *         var defaultCustomRoutingEndpoint = new CustomRoutingEndpoint(&#34;defaultCustomRoutingEndpoint&#34;, CustomRoutingEndpointArgs.builder()        
 *             .endpointGroupId(defaultCustomRoutingEndpointGroup.id())
 *             .endpoint(defaultSwitch.id())
 *             .type(&#34;PrivateSubNet&#34;)
 *             .trafficToEndpointPolicy(&#34;AllowCustom&#34;)
 *             .build());
 * 
 *         var defaultCustomRoutingEndpointGroupDestination = new CustomRoutingEndpointGroupDestination(&#34;defaultCustomRoutingEndpointGroupDestination&#34;, CustomRoutingEndpointGroupDestinationArgs.builder()        
 *             .endpointGroupId(defaultCustomRoutingEndpointGroup.id())
 *             .protocols(&#34;TCP&#34;)
 *             .fromPort(1)
 *             .toPort(10)
 *             .build());
 * 
 *         var defaultCustomRoutingEndpointTrafficPolicy = new CustomRoutingEndpointTrafficPolicy(&#34;defaultCustomRoutingEndpointTrafficPolicy&#34;, CustomRoutingEndpointTrafficPolicyArgs.builder()        
 *             .endpointId(defaultCustomRoutingEndpoint.customRoutingEndpointId())
 *             .address(&#34;172.17.3.0&#34;)
 *             .portRanges(CustomRoutingEndpointTrafficPolicyPortRangeArgs.builder()
 *                 .fromPort(1)
 *                 .toPort(10)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Global Accelerator (GA) Custom Routing Endpoint Traffic Policy can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ga/customRoutingEndpointTrafficPolicy:CustomRoutingEndpointTrafficPolicy example &lt;endpoint_id&gt;:&lt;custom_routing_endpoint_traffic_policy_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ga/customRoutingEndpointTrafficPolicy:CustomRoutingEndpointTrafficPolicy")
public class CustomRoutingEndpointTrafficPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the GA instance.
     * 
     */
    @Export(name="acceleratorId", refs={String.class}, tree="[0]")
    private Output<String> acceleratorId;

    /**
     * @return The ID of the GA instance.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * The IP address of the destination to which traffic is allowed.
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return The IP address of the destination to which traffic is allowed.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * The ID of the Custom Routing Endpoint Traffic Policy.
     * 
     */
    @Export(name="customRoutingEndpointTrafficPolicyId", refs={String.class}, tree="[0]")
    private Output<String> customRoutingEndpointTrafficPolicyId;

    /**
     * @return The ID of the Custom Routing Endpoint Traffic Policy.
     * 
     */
    public Output<String> customRoutingEndpointTrafficPolicyId() {
        return this.customRoutingEndpointTrafficPolicyId;
    }
    /**
     * The ID of the endpoint group.
     * 
     */
    @Export(name="endpointGroupId", refs={String.class}, tree="[0]")
    private Output<String> endpointGroupId;

    /**
     * @return The ID of the endpoint group.
     * 
     */
    public Output<String> endpointGroupId() {
        return this.endpointGroupId;
    }
    /**
     * The ID of the Custom Routing Endpoint.
     * 
     */
    @Export(name="endpointId", refs={String.class}, tree="[0]")
    private Output<String> endpointId;

    /**
     * @return The ID of the Custom Routing Endpoint.
     * 
     */
    public Output<String> endpointId() {
        return this.endpointId;
    }
    /**
     * The ID of the listener.
     * 
     */
    @Export(name="listenerId", refs={String.class}, tree="[0]")
    private Output<String> listenerId;

    /**
     * @return The ID of the listener.
     * 
     */
    public Output<String> listenerId() {
        return this.listenerId;
    }
    /**
     * Port rangeSee the following. See `port_ranges` below.
     * 
     */
    @Export(name="portRanges", refs={List.class,CustomRoutingEndpointTrafficPolicyPortRange.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CustomRoutingEndpointTrafficPolicyPortRange>> portRanges;

    /**
     * @return Port rangeSee the following. See `port_ranges` below.
     * 
     */
    public Output<Optional<List<CustomRoutingEndpointTrafficPolicyPortRange>>> portRanges() {
        return Codegen.optional(this.portRanges);
    }
    /**
     * The status of the Custom Routing Endpoint Traffic Policy.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Custom Routing Endpoint Traffic Policy.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomRoutingEndpointTrafficPolicy(String name) {
        this(name, CustomRoutingEndpointTrafficPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomRoutingEndpointTrafficPolicy(String name, CustomRoutingEndpointTrafficPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomRoutingEndpointTrafficPolicy(String name, CustomRoutingEndpointTrafficPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/customRoutingEndpointTrafficPolicy:CustomRoutingEndpointTrafficPolicy", name, args == null ? CustomRoutingEndpointTrafficPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomRoutingEndpointTrafficPolicy(String name, Output<String> id, @Nullable CustomRoutingEndpointTrafficPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/customRoutingEndpointTrafficPolicy:CustomRoutingEndpointTrafficPolicy", name, state, makeResourceOptions(options, id));
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
    public static CustomRoutingEndpointTrafficPolicy get(String name, Output<String> id, @Nullable CustomRoutingEndpointTrafficPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomRoutingEndpointTrafficPolicy(name, id, state, options);
    }
}
