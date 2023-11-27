// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.nlb.LoadBalancerArgs;
import com.pulumi.alicloud.nlb.inputs.LoadBalancerState;
import com.pulumi.alicloud.nlb.outputs.LoadBalancerZoneMapping;
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
 * Provides a NLB Load Balancer resource.
 * 
 * For information about NLB Load Balancer and how to use it, see [What is Load Balancer](https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer).
 * 
 * &gt; **NOTE:** Available since v1.191.0.
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
 * import com.pulumi.alicloud.nlb.LoadBalancer;
 * import com.pulumi.alicloud.nlb.LoadBalancerArgs;
 * import com.pulumi.alicloud.nlb.inputs.LoadBalancerZoneMappingArgs;
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
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * NLB Load Balancer can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:nlb/loadBalancer:LoadBalancer example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:nlb/loadBalancer:LoadBalancer")
public class LoadBalancer extends com.pulumi.resources.CustomResource {
    /**
     * The protocol version. Valid values:
     * - ipv4 (default): IPv4
     * - DualStack: dual stack
     * 
     */
    @Export(name="addressIpVersion", refs={String.class}, tree="[0]")
    private Output<String> addressIpVersion;

    /**
     * @return The protocol version. Valid values:
     * - ipv4 (default): IPv4
     * - DualStack: dual stack
     * 
     */
    public Output<String> addressIpVersion() {
        return this.addressIpVersion;
    }
    /**
     * The type of IPv4 address used by the NLB instance. Valid values:
     * - Internet: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.
     * - Intranet: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the virtual private cloud (VPC) where the NLB instance is deployed.
     * 
     */
    @Export(name="addressType", refs={String.class}, tree="[0]")
    private Output<String> addressType;

    /**
     * @return The type of IPv4 address used by the NLB instance. Valid values:
     * - Internet: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.
     * - Intranet: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the virtual private cloud (VPC) where the NLB instance is deployed.
     * 
     */
    public Output<String> addressType() {
        return this.addressType;
    }
    /**
     * The ID of the EIP bandwidth plan that is associated with the NLB instance if the NLB instance uses a public IP address.
     * 
     */
    @Export(name="bandwidthPackageId", refs={String.class}, tree="[0]")
    private Output<String> bandwidthPackageId;

    /**
     * @return The ID of the EIP bandwidth plan that is associated with the NLB instance if the NLB instance uses a public IP address.
     * 
     */
    public Output<String> bandwidthPackageId() {
        return this.bandwidthPackageId;
    }
    /**
     * The time when the resource was created. The time is displayed in UTC in `yyyy-MM-ddTHH:mm:ssZ` format.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time when the resource was created. The time is displayed in UTC in `yyyy-MM-ddTHH:mm:ssZ` format.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Specifies whether to enable cross-zone load balancing for the NLB instance.
     * 
     */
    @Export(name="crossZoneEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> crossZoneEnabled;

    /**
     * @return Specifies whether to enable cross-zone load balancing for the NLB instance.
     * 
     */
    public Output<Boolean> crossZoneEnabled() {
        return this.crossZoneEnabled;
    }
    /**
     * Specifies whether to enable deletion protection. Default value: `false`. Valid values:
     * 
     */
    @Export(name="deletionProtectionEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> deletionProtectionEnabled;

    /**
     * @return Specifies whether to enable deletion protection. Default value: `false`. Valid values:
     * 
     */
    public Output<Boolean> deletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }
    /**
     * The reason why the deletion protection feature is enabled or disabled. The `deletion_protection_reason` takes effect only when `deletion_protection_enabled` is set to `true`.
     * 
     */
    @Export(name="deletionProtectionReason", refs={String.class}, tree="[0]")
    private Output<String> deletionProtectionReason;

    /**
     * @return The reason why the deletion protection feature is enabled or disabled. The `deletion_protection_reason` takes effect only when `deletion_protection_enabled` is set to `true`.
     * 
     */
    public Output<String> deletionProtectionReason() {
        return this.deletionProtectionReason;
    }
    /**
     * The domain name of the NLB instance.
     * 
     */
    @Export(name="dnsName", refs={String.class}, tree="[0]")
    private Output<String> dnsName;

    /**
     * @return The domain name of the NLB instance.
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * The type of IPv6 address used by the NLB instance.
     * 
     */
    @Export(name="ipv6AddressType", refs={String.class}, tree="[0]")
    private Output<String> ipv6AddressType;

    /**
     * @return The type of IPv6 address used by the NLB instance.
     * 
     */
    public Output<String> ipv6AddressType() {
        return this.ipv6AddressType;
    }
    /**
     * The business status of the NLB instance.
     * 
     */
    @Export(name="loadBalancerBusinessStatus", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerBusinessStatus;

    /**
     * @return The business status of the NLB instance.
     * 
     */
    public Output<String> loadBalancerBusinessStatus() {
        return this.loadBalancerBusinessStatus;
    }
    /**
     * The name of the NLB instance. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
     * 
     */
    @Export(name="loadBalancerName", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerName;

    /**
     * @return The name of the NLB instance. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
     * 
     */
    public Output<String> loadBalancerName() {
        return this.loadBalancerName;
    }
    /**
     * The type of the instance. Set the value to `Network`, which specifies an NLB instance.
     * 
     */
    @Export(name="loadBalancerType", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerType;

    /**
     * @return The type of the instance. Set the value to `Network`, which specifies an NLB instance.
     * 
     */
    public Output<String> loadBalancerType() {
        return this.loadBalancerType;
    }
    /**
     * The reason why the configuration read-only mode is enabled. The `modification_protection_reason` takes effect only when `modification_protection_status` is set to `ConsoleProtection`.
     * 
     */
    @Export(name="modificationProtectionReason", refs={String.class}, tree="[0]")
    private Output<String> modificationProtectionReason;

    /**
     * @return The reason why the configuration read-only mode is enabled. The `modification_protection_reason` takes effect only when `modification_protection_status` is set to `ConsoleProtection`.
     * 
     */
    public Output<String> modificationProtectionReason() {
        return this.modificationProtectionReason;
    }
    /**
     * Specifies whether to enable the configuration read-only mode. Default value: `NonProtection`. Valid values:
     * 
     */
    @Export(name="modificationProtectionStatus", refs={String.class}, tree="[0]")
    private Output<String> modificationProtectionStatus;

    /**
     * @return Specifies whether to enable the configuration read-only mode. Default value: `NonProtection`. Valid values:
     * 
     */
    public Output<String> modificationProtectionStatus() {
        return this.modificationProtectionStatus;
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The status of the NLB instance.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the NLB instance.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the VPC where the NLB instance is deployed.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC where the NLB instance is deployed.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * Available Area Configuration List. You must add at least two zones. You can add a maximum of 10 zones. See `zone_mappings` below.
     * 
     */
    @Export(name="zoneMappings", refs={List.class,LoadBalancerZoneMapping.class}, tree="[0,1]")
    private Output<List<LoadBalancerZoneMapping>> zoneMappings;

    /**
     * @return Available Area Configuration List. You must add at least two zones. You can add a maximum of 10 zones. See `zone_mappings` below.
     * 
     */
    public Output<List<LoadBalancerZoneMapping>> zoneMappings() {
        return this.zoneMappings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancer(String name) {
        this(name, LoadBalancerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancer(String name, LoadBalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancer(String name, LoadBalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nlb/loadBalancer:LoadBalancer", name, args == null ? LoadBalancerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancer(String name, Output<String> id, @Nullable LoadBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:nlb/loadBalancer:LoadBalancer", name, state, makeResourceOptions(options, id));
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
    public static LoadBalancer get(String name, Output<String> id, @Nullable LoadBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancer(name, id, state, options);
    }
}
