// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.edas;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.edas.SlbAttachmentArgs;
import com.pulumi.alicloud.edas.inputs.SlbAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Binds SLB to an EDAS application.
 * 
 * &gt; **NOTE:** Available since v1.82.0.
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
 * import com.pulumi.alicloud.inputs.GetRegionsArgs;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.ecs.inputs.GetInstanceTypesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.edas.Cluster;
 * import com.pulumi.alicloud.edas.ClusterArgs;
 * import com.pulumi.alicloud.edas.InstanceClusterAttachment;
 * import com.pulumi.alicloud.edas.InstanceClusterAttachmentArgs;
 * import com.pulumi.alicloud.edas.Application;
 * import com.pulumi.alicloud.edas.ApplicationArgs;
 * import com.pulumi.alicloud.slb.ApplicationLoadBalancer;
 * import com.pulumi.alicloud.slb.ApplicationLoadBalancerArgs;
 * import com.pulumi.alicloud.edas.SlbAttachment;
 * import com.pulumi.alicloud.edas.SlbAttachmentArgs;
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
 *         final var defaultRegions = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         final var defaultImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex(&#34;^ubuntu_[0-9]+_[0-9]+_x64*&#34;)
 *             .owners(&#34;system&#34;)
 *             .build());
 * 
 *         final var defaultInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .availabilityZone(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .cpuCoreCount(1)
 *             .memorySize(2)
 *             .build());
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
 *         var defaultSecurityGroup = new SecurityGroup(&#34;defaultSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .availabilityZone(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .instanceName(name)
 *             .imageId(defaultImages.applyValue(getImagesResult -&gt; getImagesResult.images()[0].id()))
 *             .instanceType(defaultInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes()[0].id()))
 *             .securityGroups(defaultSecurityGroup.id())
 *             .vswitchId(defaultSwitch.id())
 *             .internetMaxBandwidthOut(&#34;10&#34;)
 *             .internetChargeType(&#34;PayByTraffic&#34;)
 *             .instanceChargeType(&#34;PostPaid&#34;)
 *             .systemDiskCategory(&#34;cloud_efficiency&#34;)
 *             .build());
 * 
 *         var defaultCluster = new Cluster(&#34;defaultCluster&#34;, ClusterArgs.builder()        
 *             .clusterName(name)
 *             .clusterType(&#34;2&#34;)
 *             .networkMode(&#34;2&#34;)
 *             .logicalRegionId(defaultRegions.applyValue(getRegionsResult -&gt; getRegionsResult.regions()[0].id()))
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultInstanceClusterAttachment = new InstanceClusterAttachment(&#34;defaultInstanceClusterAttachment&#34;, InstanceClusterAttachmentArgs.builder()        
 *             .clusterId(defaultCluster.id())
 *             .instanceIds(defaultInstance.id())
 *             .build());
 * 
 *         var defaultApplication = new Application(&#34;defaultApplication&#34;, ApplicationArgs.builder()        
 *             .applicationName(name)
 *             .clusterId(defaultCluster.id())
 *             .packageType(&#34;JAR&#34;)
 *             .build());
 * 
 *         var defaultApplicationLoadBalancer = new ApplicationLoadBalancer(&#34;defaultApplicationLoadBalancer&#34;, ApplicationLoadBalancerArgs.builder()        
 *             .loadBalancerName(name)
 *             .vswitchId(defaultSwitch.id())
 *             .loadBalancerSpec(&#34;slb.s2.small&#34;)
 *             .addressType(&#34;intranet&#34;)
 *             .build());
 * 
 *         var defaultSlbAttachment = new SlbAttachment(&#34;defaultSlbAttachment&#34;, SlbAttachmentArgs.builder()        
 *             .appId(defaultApplication.id())
 *             .slbId(defaultApplicationLoadBalancer.id())
 *             .slbIp(defaultApplicationLoadBalancer.address())
 *             .type(defaultApplicationLoadBalancer.addressType())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="alicloud:edas/slbAttachment:SlbAttachment")
public class SlbAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the application to which you want to bind an SLB instance.
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output<String> appId;

    /**
     * @return The ID of the application to which you want to bind an SLB instance.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The listening port for the bound SLB instance.
     * 
     */
    @Export(name="listenerPort", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> listenerPort;

    /**
     * @return The listening port for the bound SLB instance.
     * 
     */
    public Output<Optional<Integer>> listenerPort() {
        return Codegen.optional(this.listenerPort);
    }
    /**
     * The ID of the SLB instance that is going to be bound.
     * 
     */
    @Export(name="slbId", refs={String.class}, tree="[0]")
    private Output<String> slbId;

    /**
     * @return The ID of the SLB instance that is going to be bound.
     * 
     */
    public Output<String> slbId() {
        return this.slbId;
    }
    /**
     * The IP address that is allocated to the bound SLB instance.
     * 
     */
    @Export(name="slbIp", refs={String.class}, tree="[0]")
    private Output<String> slbIp;

    /**
     * @return The IP address that is allocated to the bound SLB instance.
     * 
     */
    public Output<String> slbIp() {
        return this.slbIp;
    }
    /**
     * Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and forward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
     * 
     */
    @Export(name="slbStatus", refs={String.class}, tree="[0]")
    private Output<String> slbStatus;

    /**
     * @return Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and forward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
     * 
     */
    public Output<String> slbStatus() {
        return this.slbStatus;
    }
    /**
     * The type of the bound SLB instance.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the bound SLB instance.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The ID of the virtual server (VServer) group associated with the intranet SLB instance.
     * 
     */
    @Export(name="vserverGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vserverGroupId;

    /**
     * @return The ID of the virtual server (VServer) group associated with the intranet SLB instance.
     * 
     */
    public Output<Optional<String>> vserverGroupId() {
        return Codegen.optional(this.vserverGroupId);
    }
    /**
     * VPC related vswitch ID.
     * 
     */
    @Export(name="vswitchId", refs={String.class}, tree="[0]")
    private Output<String> vswitchId;

    /**
     * @return VPC related vswitch ID.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SlbAttachment(String name) {
        this(name, SlbAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SlbAttachment(String name, SlbAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SlbAttachment(String name, SlbAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:edas/slbAttachment:SlbAttachment", name, args == null ? SlbAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SlbAttachment(String name, Output<String> id, @Nullable SlbAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:edas/slbAttachment:SlbAttachment", name, state, makeResourceOptions(options, id));
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
    public static SlbAttachment get(String name, Output<String> id, @Nullable SlbAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SlbAttachment(name, id, state, options);
    }
}
