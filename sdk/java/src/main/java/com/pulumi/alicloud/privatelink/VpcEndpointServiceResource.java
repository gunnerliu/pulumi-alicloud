// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.privatelink.VpcEndpointServiceResourceArgs;
import com.pulumi.alicloud.privatelink.inputs.VpcEndpointServiceResourceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Private Link Vpc Endpoint Service Resource resource. Endpoint service resource.
 * 
 * For information about Private Link Vpc Endpoint Service Resource and how to use it, see [What is Vpc Endpoint Service Resource](https://www.alibabacloud.com/help/en/privatelink/latest/api-privatelink-2020-04-15-attachresourcetovpcendpointservice).
 * 
 * &gt; **NOTE:** Available since v1.110.0.
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
 * import com.pulumi.alicloud.privatelink.VpcEndpointService;
 * import com.pulumi.alicloud.privatelink.VpcEndpointServiceArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.slb.ApplicationLoadBalancer;
 * import com.pulumi.alicloud.slb.ApplicationLoadBalancerArgs;
 * import com.pulumi.alicloud.privatelink.VpcEndpoint;
 * import com.pulumi.alicloud.privatelink.VpcEndpointArgs;
 * import com.pulumi.alicloud.privatelink.VpcEndpointServiceResource;
 * import com.pulumi.alicloud.privatelink.VpcEndpointServiceResourceArgs;
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
 *         final var exampleZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var exampleVpcEndpointService = new VpcEndpointService(&#34;exampleVpcEndpointService&#34;, VpcEndpointServiceArgs.builder()        
 *             .serviceDescription(name)
 *             .connectBandwidth(103)
 *             .autoAcceptConnection(false)
 *             .build());
 * 
 *         var exampleNetwork = new Network(&#34;exampleNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;10.0.0.0/8&#34;)
 *             .build());
 * 
 *         var exampleSwitch = new Switch(&#34;exampleSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(name)
 *             .cidrBlock(&#34;10.1.0.0/16&#34;)
 *             .vpcId(exampleNetwork.id())
 *             .zoneId(exampleZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var exampleSecurityGroup = new SecurityGroup(&#34;exampleSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(exampleNetwork.id())
 *             .build());
 * 
 *         var exampleApplicationLoadBalancer = new ApplicationLoadBalancer(&#34;exampleApplicationLoadBalancer&#34;, ApplicationLoadBalancerArgs.builder()        
 *             .loadBalancerName(name)
 *             .vswitchId(exampleSwitch.id())
 *             .loadBalancerSpec(&#34;slb.s2.small&#34;)
 *             .addressType(&#34;intranet&#34;)
 *             .build());
 * 
 *         var exampleVpcEndpoint = new VpcEndpoint(&#34;exampleVpcEndpoint&#34;, VpcEndpointArgs.builder()        
 *             .serviceId(exampleVpcEndpointService.id())
 *             .securityGroupIds(exampleSecurityGroup.id())
 *             .vpcId(exampleNetwork.id())
 *             .vpcEndpointName(name)
 *             .build());
 * 
 *         var exampleVpcEndpointServiceResource = new VpcEndpointServiceResource(&#34;exampleVpcEndpointServiceResource&#34;, VpcEndpointServiceResourceArgs.builder()        
 *             .serviceId(exampleVpcEndpointService.id())
 *             .resourceId(exampleApplicationLoadBalancer.id())
 *             .resourceType(&#34;slb&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Private Link Vpc Endpoint Service Resource can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource example &lt;service_id&gt;:&lt;resource_id&gt;:&lt;zone_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource")
public class VpcEndpointServiceResource extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
     * - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
     * - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Specifies whether to perform only a dry run, without performing the actual request. Valid values:
     * - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
     * - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The service resource ID.
     * 
     */
    @Export(name="resourceId", refs={String.class}, tree="[0]")
    private Output<String> resourceId;

    /**
     * @return The service resource ID.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }
    /**
     * Service resource type, value:
     * - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
     * - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
     * - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
     * 
     */
    @Export(name="resourceType", refs={String.class}, tree="[0]")
    private Output<String> resourceType;

    /**
     * @return Service resource type, value:
     * - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
     * - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
     * - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }
    /**
     * The endpoint service ID.
     * 
     */
    @Export(name="serviceId", refs={String.class}, tree="[0]")
    private Output<String> serviceId;

    /**
     * @return The endpoint service ID.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }
    /**
     * The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcEndpointServiceResource(String name) {
        this(name, VpcEndpointServiceResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcEndpointServiceResource(String name, VpcEndpointServiceResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcEndpointServiceResource(String name, VpcEndpointServiceResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource", name, args == null ? VpcEndpointServiceResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcEndpointServiceResource(String name, Output<String> id, @Nullable VpcEndpointServiceResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:privatelink/vpcEndpointServiceResource:VpcEndpointServiceResource", name, state, makeResourceOptions(options, id));
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
    public static VpcEndpointServiceResource get(String name, Output<String> id, @Nullable VpcEndpointServiceResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcEndpointServiceResource(name, id, state, options);
    }
}
