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
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.nlb.NlbFunctions;
 * import com.pulumi.alicloud.nlb.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.nlb.LoadBalancer;
 * import com.pulumi.alicloud.nlb.LoadBalancerArgs;
 * import com.pulumi.alicloud.nlb.inputs.LoadBalancerZoneMappingArgs;
 * import com.pulumi.alicloud.vpc.CommonBandwithPackage;
 * import com.pulumi.alicloud.vpc.CommonBandwithPackageArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-example&#34;);
 *         final var defaultResourceGroups = ResourcemanagerFunctions.getResourceGroups();
 * 
 *         final var defaultZones = NlbFunctions.getZones();
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;10.4.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(name)
 *             .cidrBlock(&#34;10.4.0.0/24&#34;)
 *             .vpcId(defaultNetwork.id())
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var default1 = new Switch(&#34;default1&#34;, SwitchArgs.builder()        
 *             .vswitchName(name)
 *             .cidrBlock(&#34;10.4.1.0/24&#34;)
 *             .vpcId(defaultNetwork.id())
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[1].id()))
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup(&#34;defaultSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultLoadBalancer = new LoadBalancer(&#34;defaultLoadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .loadBalancerName(name)
 *             .resourceGroupId(defaultResourceGroups.applyValue(getResourceGroupsResult -&gt; getResourceGroupsResult.ids()[0]))
 *             .loadBalancerType(&#34;Network&#34;)
 *             .addressType(&#34;Internet&#34;)
 *             .addressIpVersion(&#34;Ipv4&#34;)
 *             .vpcId(defaultNetwork.id())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Created&#34;, &#34;TF&#34;),
 *                 Map.entry(&#34;For&#34;, &#34;example&#34;)
 *             ))
 *             .zoneMappings(            
 *                 LoadBalancerZoneMappingArgs.builder()
 *                     .vswitchId(defaultSwitch.id())
 *                     .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *                     .build(),
 *                 LoadBalancerZoneMappingArgs.builder()
 *                     .vswitchId(default1.id())
 *                     .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[1].id()))
 *                     .build())
 *             .build());
 * 
 *         var defaultCommonBandwithPackage = new CommonBandwithPackage(&#34;defaultCommonBandwithPackage&#34;, CommonBandwithPackageArgs.builder()        
 *             .bandwidth(2)
 *             .internetChargeType(&#34;PayByBandwidth&#34;)
 *             .bandwidthPackageName(name)
 *             .description(name)
 *             .build());
 * 
 *         var defaultLoadbalancerCommonBandwidthPackageAttachment = new LoadbalancerCommonBandwidthPackageAttachment(&#34;defaultLoadbalancerCommonBandwidthPackageAttachment&#34;, LoadbalancerCommonBandwidthPackageAttachmentArgs.builder()        
 *             .bandwidthPackageId(defaultCommonBandwithPackage.id())
 *             .loadBalancerId(defaultLoadBalancer.id())
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
 * $ pulumi import alicloud:nlb/loadbalancerCommonBandwidthPackageAttachment:LoadbalancerCommonBandwidthPackageAttachment example &lt;load_balancer_id&gt;:&lt;bandwidth_package_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:nlb/loadbalancerCommonBandwidthPackageAttachment:LoadbalancerCommonBandwidthPackageAttachment")
public class LoadbalancerCommonBandwidthPackageAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the bound shared bandwidth package.
     * 
     */
    @Export(name="bandwidthPackageId", refs={String.class}, tree="[0]")
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
    @Export(name="loadBalancerId", refs={String.class}, tree="[0]")
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
    @Export(name="status", refs={String.class}, tree="[0]")
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
