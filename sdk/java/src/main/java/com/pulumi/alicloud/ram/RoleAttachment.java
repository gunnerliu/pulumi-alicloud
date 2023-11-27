// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ram.RoleAttachmentArgs;
import com.pulumi.alicloud.ram.inputs.RoleAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a RAM role attachment resource to bind role for several ECS instances.
 * 
 * &gt; **NOTE:** Available since v1.0.0+.
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
 * import com.pulumi.alicloud.ecs.SecurityGroupRule;
 * import com.pulumi.alicloud.ecs.SecurityGroupRuleArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.ram.Role;
 * import com.pulumi.alicloud.ram.RoleArgs;
 * import com.pulumi.alicloud.ram.RoleAttachment;
 * import com.pulumi.alicloud.ram.RoleAttachmentArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;ecsInstanceVPCExample&#34;);
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
 *         var defaultSecurityGroupRule = new SecurityGroupRule(&#34;defaultSecurityGroupRule&#34;, SecurityGroupRuleArgs.builder()        
 *             .type(&#34;ingress&#34;)
 *             .ipProtocol(&#34;tcp&#34;)
 *             .nicType(&#34;intranet&#34;)
 *             .policy(&#34;accept&#34;)
 *             .portRange(&#34;22/22&#34;)
 *             .priority(1)
 *             .securityGroupId(defaultSecurityGroup.id())
 *             .cidrIp(&#34;172.16.0.0/24&#34;)
 *             .build());
 * 
 *         var foo = new Instance(&#34;foo&#34;, InstanceArgs.builder()        
 *             .vswitchId(defaultSwitch.id())
 *             .imageId(defaultImages.applyValue(getImagesResult -&gt; getImagesResult.images()[0].id()))
 *             .instanceType(defaultInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes()[0].id()))
 *             .systemDiskCategory(&#34;cloud_efficiency&#34;)
 *             .internetChargeType(&#34;PayByTraffic&#34;)
 *             .internetMaxBandwidthOut(5)
 *             .securityGroups(defaultSecurityGroup.id())
 *             .instanceName(name)
 *             .build());
 * 
 *         var role = new Role(&#34;role&#34;, RoleArgs.builder()        
 *             .document(&#34;&#34;&#34;
 *   {
 *     &#34;Statement&#34;: [
 *       {
 *         &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *         &#34;Effect&#34;: &#34;Allow&#34;,
 *         &#34;Principal&#34;: {
 *           &#34;Service&#34;: [
 *             &#34;ecs.aliyuncs.com&#34;
 *           ]
 *         }
 *       }
 *     ],
 *     &#34;Version&#34;: &#34;1&#34;
 *   }
 * 
 *             &#34;&#34;&#34;)
 *             .description(&#34;this is a test&#34;)
 *             .force(true)
 *             .build());
 * 
 *         var attach = new RoleAttachment(&#34;attach&#34;, RoleAttachmentArgs.builder()        
 *             .roleName(role.name())
 *             .instanceIds(foo.stream().map(element -&gt; element.id()).collect(toList()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="alicloud:ram/roleAttachment:RoleAttachment")
public class RoleAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The list of ECS instance&#39;s IDs.
     * 
     */
    @Export(name="instanceIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> instanceIds;

    /**
     * @return The list of ECS instance&#39;s IDs.
     * 
     */
    public Output<List<String>> instanceIds() {
        return this.instanceIds;
    }
    /**
     * The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;, &#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    @Export(name="roleName", refs={String.class}, tree="[0]")
    private Output<String> roleName;

    /**
     * @return The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;, &#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoleAttachment(String name) {
        this(name, RoleAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoleAttachment(String name, RoleAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoleAttachment(String name, RoleAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/roleAttachment:RoleAttachment", name, args == null ? RoleAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RoleAttachment(String name, Output<String> id, @Nullable RoleAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/roleAttachment:RoleAttachment", name, state, makeResourceOptions(options, id));
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
    public static RoleAttachment get(String name, Output<String> id, @Nullable RoleAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoleAttachment(name, id, state, options);
    }
}
