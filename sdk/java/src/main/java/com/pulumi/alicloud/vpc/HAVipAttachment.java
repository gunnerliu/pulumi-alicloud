// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.HAVipAttachmentArgs;
import com.pulumi.alicloud.vpc.inputs.HAVipAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
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
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetInstanceTypesArgs;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.vpc.HAVip;
 * import com.pulumi.alicloud.vpc.HAVipArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.vpc.HAVipAttachment;
 * import com.pulumi.alicloud.vpc.HAVipAttachmentArgs;
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
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         final var defaultInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .availabilityZone(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .cpuCoreCount(1)
 *             .memorySize(2)
 *             .build());
 * 
 *         final var defaultImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex(&#34;^ubuntu_18.*64&#34;)
 *             .mostRecent(true)
 *             .owners(&#34;system&#34;)
 *             .build());
 * 
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;test_havip_attachment&#34;);
 *         var fooNetwork = new Network(&#34;fooNetwork&#34;, NetworkArgs.builder()        
 *             .cidrBlock(&#34;172.16.0.0/12&#34;)
 *             .build());
 * 
 *         var fooSwitch = new Switch(&#34;fooSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(fooNetwork.id())
 *             .cidrBlock(&#34;172.16.0.0/21&#34;)
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var fooHAVip = new HAVip(&#34;fooHAVip&#34;, HAVipArgs.builder()        
 *             .vswitchId(fooSwitch.id())
 *             .description(name)
 *             .build());
 * 
 *         var tfTestFoo = new SecurityGroup(&#34;tfTestFoo&#34;, SecurityGroupArgs.builder()        
 *             .description(&#34;foo&#34;)
 *             .vpcId(fooNetwork.id())
 *             .build());
 * 
 *         var fooInstance = new Instance(&#34;fooInstance&#34;, InstanceArgs.builder()        
 *             .availabilityZone(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .vswitchId(fooSwitch.id())
 *             .imageId(defaultImages.applyValue(getImagesResult -&gt; getImagesResult.images()[0].id()))
 *             .instanceType(defaultInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes()[0].id()))
 *             .systemDiskCategory(&#34;cloud_efficiency&#34;)
 *             .internetChargeType(&#34;PayByTraffic&#34;)
 *             .internetMaxBandwidthOut(5)
 *             .securityGroups(tfTestFoo.id())
 *             .instanceName(name)
 *             .userData(&#34;echo &#39;net.ipv4.ip_forward=1&#39;&gt;&gt; /etc/sysctl.conf&#34;)
 *             .build());
 * 
 *         var fooHAVipAttachment = new HAVipAttachment(&#34;fooHAVipAttachment&#34;, HAVipAttachmentArgs.builder()        
 *             .havipId(fooHAVip.id())
 *             .instanceId(fooInstance.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * The havip attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpc/hAVipAttachment:HAVipAttachment foo havip-abc123456:i-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/hAVipAttachment:HAVipAttachment")
public class HAVipAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The havip_id of the havip attachment, the field can&#39;t be changed.
     * 
     */
    @Export(name="havipId", type=String.class, parameters={})
    private Output<String> havipId;

    /**
     * @return The havip_id of the havip attachment, the field can&#39;t be changed.
     * 
     */
    public Output<String> havipId() {
        return this.havipId;
    }
    /**
     * The instance_id of the havip attachment, the field can&#39;t be changed.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The instance_id of the havip attachment, the field can&#39;t be changed.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HAVipAttachment(String name) {
        this(name, HAVipAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HAVipAttachment(String name, HAVipAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HAVipAttachment(String name, HAVipAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/hAVipAttachment:HAVipAttachment", name, args == null ? HAVipAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HAVipAttachment(String name, Output<String> id, @Nullable HAVipAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/hAVipAttachment:HAVipAttachment", name, state, makeResourceOptions(options, id));
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
    public static HAVipAttachment get(String name, Output<String> id, @Nullable HAVipAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HAVipAttachment(name, id, state, options);
    }
}
