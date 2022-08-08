// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ess.ScalingGroupVServerGroupsArgs;
import com.pulumi.alicloud.ess.inputs.ScalingGroupVServerGroupsState;
import com.pulumi.alicloud.ess.outputs.ScalingGroupVServerGroupsVserverGroup;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Attaches/Detaches vserver groups to a specified scaling group.
 * 
 * &gt; **NOTE:** The load balancer of which vserver groups belongs to must be in `active` status.
 * 
 * &gt; **NOTE:** If scaling group&#39;s network type is `VPC`, the vserver groups must be in the same `VPC`.
 * 
 * &gt; **NOTE:** A scaling group can have at most 5 vserver groups attached by default.
 * 
 * &gt; **NOTE:** Vserver groups and the default group of loadbalancer share the same backend server quota.
 * 
 * &gt; **NOTE:** When attach vserver groups to scaling group, existing ECS instances will be added to vserver groups; Instead, ECS instances will be removed from vserver group when detach.
 * 
 * &gt; **NOTE:** Detach action will be executed before attach action.
 * 
 * &gt; **NOTE:** Vserver group is defined uniquely by `loadbalancer_id`, `vserver_group_id`, `port`.
 * 
 * &gt; **NOTE:** Modifing `weight` attribute means detach vserver group first and then, attach with new weight parameter.
 * 
 * &gt; **NOTE:** Resource `alicloud.ess.ScalingGroupVServerGroups` is available in 1.53.0+.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.slb.ApplicationLoadBalancer;
 * import com.pulumi.alicloud.slb.ApplicationLoadBalancerArgs;
 * import com.pulumi.alicloud.slb.ServerGroup;
 * import com.pulumi.alicloud.slb.ServerGroupArgs;
 * import com.pulumi.alicloud.slb.Listener;
 * import com.pulumi.alicloud.slb.ListenerArgs;
 * import com.pulumi.alicloud.ess.ScalingGroup;
 * import com.pulumi.alicloud.ess.ScalingGroupArgs;
 * import com.pulumi.alicloud.ess.ScalingGroupVServerGroups;
 * import com.pulumi.alicloud.ess.ScalingGroupVServerGroupsArgs;
 * import com.pulumi.alicloud.ess.inputs.ScalingGroupVServerGroupsVserverGroupArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;testAccEssVserverGroupsAttachment&#34;);
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableDiskCategory(&#34;cloud_efficiency&#34;)
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .cidrBlock(&#34;172.16.0.0/16&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(defaultNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/24&#34;)
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var defaultApplicationLoadBalancer = new ApplicationLoadBalancer(&#34;defaultApplicationLoadBalancer&#34;, ApplicationLoadBalancerArgs.builder()        
 *             .loadBalancerName(name)
 *             .vswitchId(defaultSwitch.id())
 *             .build());
 * 
 *         var defaultServerGroup = new ServerGroup(&#34;defaultServerGroup&#34;, ServerGroupArgs.builder()        
 *             .loadBalancerId(defaultApplicationLoadBalancer.id())
 *             .build());
 * 
 *         for (var i = 0; i &lt; 2; i++) {
 *             new Listener(&#34;defaultListener-&#34; + i, ListenerArgs.builder()            
 *                 .loadBalancerId(defaultApplicationLoadBalancer.stream().map(element -&gt; element.id()).collect(toList())[range.value()])
 *                 .backendPort(&#34;22&#34;)
 *                 .frontendPort(&#34;22&#34;)
 *                 .protocol(&#34;tcp&#34;)
 *                 .bandwidth(&#34;10&#34;)
 *                 .healthCheckType(&#34;tcp&#34;)
 *                 .build());
 * 
 *         
 * }
 *         var defaultScalingGroup = new ScalingGroup(&#34;defaultScalingGroup&#34;, ScalingGroupArgs.builder()        
 *             .minSize(&#34;2&#34;)
 *             .maxSize(&#34;2&#34;)
 *             .scalingGroupName(name)
 *             .vswitchIds(defaultSwitch.id())
 *             .build());
 * 
 *         var defaultScalingGroupVServerGroups = new ScalingGroupVServerGroups(&#34;defaultScalingGroupVServerGroups&#34;, ScalingGroupVServerGroupsArgs.builder()        
 *             .scalingGroupId(defaultScalingGroup.id())
 *             .vserverGroups(ScalingGroupVServerGroupsVserverGroupArgs.builder()
 *                 .loadbalancerId(defaultApplicationLoadBalancer.id())
 *                 .vserverAttributes(ScalingGroupVServerGroupsVserverGroupVserverAttributeArgs.builder()
 *                     .vserverGroupId(defaultServerGroup.id())
 *                     .port(&#34;100&#34;)
 *                     .weight(&#34;60&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Block vserver_group
 * 
 * the vserver_group supports the following:
 * 
 * * `loadbalancer_id` - (Required) Loadbalancer server ID of VServer Group.
 * * `vserver_attributes` - (Required) A list of VServer Group attributes. See Block vserver_attribute below for details.
 * 
 * ## Block vserver_attribute
 * 
 * * `vserver_group_id` - (Required) ID of VServer Group.
 * * `port` - (Required) - The port will be used for VServer Group backend server.
 * * `weight` - (Required) The weight of an ECS instance attached to the VServer Group.
 * 
 * ## Import
 * 
 * ESS vserver groups can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups example abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups")
public class ScalingGroupVServerGroups extends com.pulumi.resources.CustomResource {
    /**
     * If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
     * 
     */
    @Export(name="force", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * ID of the scaling group.
     * 
     */
    @Export(name="scalingGroupId", type=String.class, parameters={})
    private Output<String> scalingGroupId;

    /**
     * @return ID of the scaling group.
     * 
     */
    public Output<String> scalingGroupId() {
        return this.scalingGroupId;
    }
    /**
     * A list of vserver groups attached on scaling group. See Block vserver_group below for details.
     * 
     */
    @Export(name="vserverGroups", type=List.class, parameters={ScalingGroupVServerGroupsVserverGroup.class})
    private Output<List<ScalingGroupVServerGroupsVserverGroup>> vserverGroups;

    /**
     * @return A list of vserver groups attached on scaling group. See Block vserver_group below for details.
     * 
     */
    public Output<List<ScalingGroupVServerGroupsVserverGroup>> vserverGroups() {
        return this.vserverGroups;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScalingGroupVServerGroups(String name) {
        this(name, ScalingGroupVServerGroupsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScalingGroupVServerGroups(String name, ScalingGroupVServerGroupsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScalingGroupVServerGroups(String name, ScalingGroupVServerGroupsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups", name, args == null ? ScalingGroupVServerGroupsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScalingGroupVServerGroups(String name, Output<String> id, @Nullable ScalingGroupVServerGroupsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups", name, state, makeResourceOptions(options, id));
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
    public static ScalingGroupVServerGroups get(String name, Output<String> id, @Nullable ScalingGroupVServerGroupsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScalingGroupVServerGroups(name, id, state, options);
    }
}
