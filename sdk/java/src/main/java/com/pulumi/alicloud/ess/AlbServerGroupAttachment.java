// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ess.AlbServerGroupAttachmentArgs;
import com.pulumi.alicloud.ess.inputs.AlbServerGroupAttachmentState;
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
 * Attaches/Detaches alb server group to a specified scaling group.
 * 
 * For information about alb server group attachment, see [AttachAlbServerGroups](https://www.alibabacloud.com/help/en/doc-detail/266800.html).
 * 
 * &gt; **NOTE:** If scaling group&#39;s network type is `VPC`, the alb server groups must be in the same `VPC`.
 * 
 * &gt; **NOTE:** Alb server group attachment is defined uniquely by `scaling_group_id`, `alb_server_group_id`, `port`.
 * 
 * &gt; **NOTE:** Resource `alicloud.ess.AlbServerGroupAttachment` don&#39;t support modification.
 * 
 * &gt; **NOTE:** Available since v1.158.0.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetInstanceTypesArgs;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ess.ScalingGroup;
 * import com.pulumi.alicloud.ess.ScalingGroupArgs;
 * import com.pulumi.alicloud.ess.ScalingConfiguration;
 * import com.pulumi.alicloud.ess.ScalingConfigurationArgs;
 * import com.pulumi.alicloud.alb.ServerGroup;
 * import com.pulumi.alicloud.alb.ServerGroupArgs;
 * import com.pulumi.alicloud.alb.inputs.ServerGroupHealthCheckConfigArgs;
 * import com.pulumi.alicloud.alb.inputs.ServerGroupStickySessionConfigArgs;
 * import com.pulumi.alicloud.ess.AlbServerGroupAttachment;
 * import com.pulumi.alicloud.ess.AlbServerGroupAttachmentArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableDiskCategory(&#34;cloud_efficiency&#34;)
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         final var defaultInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .availabilityZone(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .cpuCoreCount(2)
 *             .memorySize(4)
 *             .build());
 * 
 *         final var defaultImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex(&#34;^ubuntu_18.*64&#34;)
 *             .mostRecent(true)
 *             .owners(&#34;system&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;172.16.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/24&#34;)
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vswitchName(name)
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup(&#34;defaultSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultScalingGroup = new ScalingGroup(&#34;defaultScalingGroup&#34;, ScalingGroupArgs.builder()        
 *             .minSize(&#34;0&#34;)
 *             .maxSize(&#34;2&#34;)
 *             .scalingGroupName(name)
 *             .defaultCooldown(200)
 *             .removalPolicies(&#34;OldestInstance&#34;)
 *             .vswitchIds(defaultSwitch.id())
 *             .build());
 * 
 *         var defaultScalingConfiguration = new ScalingConfiguration(&#34;defaultScalingConfiguration&#34;, ScalingConfigurationArgs.builder()        
 *             .scalingGroupId(defaultScalingGroup.id())
 *             .imageId(defaultImages.applyValue(getImagesResult -&gt; getImagesResult.images()[0].id()))
 *             .instanceType(defaultInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes()[0].id()))
 *             .securityGroupId(defaultSecurityGroup.id())
 *             .forceDelete(true)
 *             .active(true)
 *             .enable(true)
 *             .build());
 * 
 *         var defaultServerGroup = new ServerGroup(&#34;defaultServerGroup&#34;, ServerGroupArgs.builder()        
 *             .serverGroupName(name)
 *             .vpcId(defaultNetwork.id())
 *             .healthCheckConfig(ServerGroupHealthCheckConfigArgs.builder()
 *                 .healthCheckEnabled(&#34;false&#34;)
 *                 .build())
 *             .stickySessionConfig(ServerGroupStickySessionConfigArgs.builder()
 *                 .stickySessionEnabled(true)
 *                 .cookie(&#34;tf-example&#34;)
 *                 .stickySessionType(&#34;Server&#34;)
 *                 .build())
 *             .build());
 * 
 *         var defaultAlbServerGroupAttachment = new AlbServerGroupAttachment(&#34;defaultAlbServerGroupAttachment&#34;, AlbServerGroupAttachmentArgs.builder()        
 *             .scalingGroupId(defaultScalingConfiguration.scalingGroupId())
 *             .albServerGroupId(defaultServerGroup.id())
 *             .port(9000)
 *             .weight(50)
 *             .forceAttach(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ESS alb server groups can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ess/albServerGroupAttachment:AlbServerGroupAttachment example asg-xxx:sgp-xxx:5000
 * ```
 * 
 */
@ResourceType(type="alicloud:ess/albServerGroupAttachment:AlbServerGroupAttachment")
public class AlbServerGroupAttachment extends com.pulumi.resources.CustomResource {
    /**
     * ID of Alb Server Group.
     * 
     */
    @Export(name="albServerGroupId", refs={String.class}, tree="[0]")
    private Output<String> albServerGroupId;

    /**
     * @return ID of Alb Server Group.
     * 
     */
    public Output<String> albServerGroupId() {
        return this.albServerGroupId;
    }
    /**
     * If instances of scaling group are attached/removed from slb backend server when attach/detach alb
     * server group from scaling group. Default to false.
     * 
     */
    @Export(name="forceAttach", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceAttach;

    /**
     * @return If instances of scaling group are attached/removed from slb backend server when attach/detach alb
     * server group from scaling group. Default to false.
     * 
     */
    public Output<Optional<Boolean>> forceAttach() {
        return Codegen.optional(this.forceAttach);
    }
    /**
     * The port will be used for Alb Server Group backend server.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output<Integer> port;

    /**
     * @return The port will be used for Alb Server Group backend server.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * ID of the scaling group.
     * 
     */
    @Export(name="scalingGroupId", refs={String.class}, tree="[0]")
    private Output<String> scalingGroupId;

    /**
     * @return ID of the scaling group.
     * 
     */
    public Output<String> scalingGroupId() {
        return this.scalingGroupId;
    }
    /**
     * The weight of an ECS instance attached to the Alb Server Group.
     * 
     */
    @Export(name="weight", refs={Integer.class}, tree="[0]")
    private Output<Integer> weight;

    /**
     * @return The weight of an ECS instance attached to the Alb Server Group.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlbServerGroupAttachment(String name) {
        this(name, AlbServerGroupAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlbServerGroupAttachment(String name, AlbServerGroupAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlbServerGroupAttachment(String name, AlbServerGroupAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/albServerGroupAttachment:AlbServerGroupAttachment", name, args == null ? AlbServerGroupAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AlbServerGroupAttachment(String name, Output<String> id, @Nullable AlbServerGroupAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/albServerGroupAttachment:AlbServerGroupAttachment", name, state, makeResourceOptions(options, id));
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
    public static AlbServerGroupAttachment get(String name, Output<String> id, @Nullable AlbServerGroupAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlbServerGroupAttachment(name, id, state, options);
    }
}
