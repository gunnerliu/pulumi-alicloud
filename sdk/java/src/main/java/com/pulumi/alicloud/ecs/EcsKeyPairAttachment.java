// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsKeyPairAttachmentArgs;
import com.pulumi.alicloud.ecs.inputs.EcsKeyPairAttachmentState;
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
 * Provides a ECS Key Pair Attachment resource.
 * 
 * For information about ECS Key Pair Attachment and how to use it, see [What is Key Pair Attachment](https://www.alibabacloud.com/help/en/doc-detail/51775.htm).
 * 
 * &gt; **NOTE:** Available in v1.121.0+.
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
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.ecs.inputs.GetInstanceTypesArgs;
 * import com.pulumi.alicloud.ecs.inputs.GetImagesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.ecs.EcsKeyPair;
 * import com.pulumi.alicloud.ecs.EcsKeyPairArgs;
 * import com.pulumi.alicloud.ecs.EcsKeyPairAttachment;
 * import com.pulumi.alicloud.ecs.EcsKeyPairAttachmentArgs;
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
 *         final var exampleZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;Instance&#34;)
 *             .build());
 * 
 *         final var exampleInstanceTypes = EcsFunctions.getInstanceTypes(GetInstanceTypesArgs.builder()
 *             .availabilityZone(exampleZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .cpuCoreCount(1)
 *             .memorySize(2)
 *             .build());
 * 
 *         final var exampleImages = EcsFunctions.getImages(GetImagesArgs.builder()
 *             .nameRegex(&#34;^ubuntu_[0-9]+_[0-9]+_x64*&#34;)
 *             .owners(&#34;system&#34;)
 *             .build());
 * 
 *         var exampleNetwork = new Network(&#34;exampleNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(&#34;terraform-example&#34;)
 *             .cidrBlock(&#34;172.17.3.0/24&#34;)
 *             .build());
 * 
 *         var exampleSwitch = new Switch(&#34;exampleSwitch&#34;, SwitchArgs.builder()        
 *             .vswitchName(&#34;terraform-example&#34;)
 *             .cidrBlock(&#34;172.17.3.0/24&#34;)
 *             .vpcId(exampleNetwork.id())
 *             .zoneId(exampleZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var exampleSecurityGroup = new SecurityGroup(&#34;exampleSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .vpcId(exampleNetwork.id())
 *             .build());
 * 
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .imageId(exampleImages.applyValue(getImagesResult -&gt; getImagesResult.images()[0].id()))
 *             .instanceType(exampleInstanceTypes.applyValue(getInstanceTypesResult -&gt; getInstanceTypesResult.instanceTypes()[0].id()))
 *             .availabilityZone(exampleZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .securityGroups(exampleSecurityGroup.id())
 *             .instanceName(&#34;terraform-example&#34;)
 *             .internetChargeType(&#34;PayByBandwidth&#34;)
 *             .vswitchId(exampleSwitch.id())
 *             .build());
 * 
 *         var exampleEcsKeyPair = new EcsKeyPair(&#34;exampleEcsKeyPair&#34;, EcsKeyPairArgs.builder()        
 *             .keyPairName(&#34;terraform-example&#34;)
 *             .build());
 * 
 *         var exampleEcsKeyPairAttachment = new EcsKeyPairAttachment(&#34;exampleEcsKeyPairAttachment&#34;, EcsKeyPairAttachmentArgs.builder()        
 *             .keyPairName(exampleEcsKeyPair.keyPairName())
 *             .instanceIds(exampleInstance.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECS Key Pair Attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/ecsKeyPairAttachment:EcsKeyPairAttachment example &lt;key_pair_name&gt;:&lt;instance_ids&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsKeyPairAttachment:EcsKeyPairAttachment")
public class EcsKeyPairAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
     * 
     */
    @Export(name="force", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
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
     * @deprecated
     * Field &#39;key_name&#39; has been deprecated from provider version 1.121.0. New field &#39;key_pair_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead. */
    @Export(name="keyName", refs={String.class}, tree="[0]")
    private Output<String> keyName;

    public Output<String> keyName() {
        return this.keyName;
    }
    /**
     * The name of key pair used to bind.
     * 
     */
    @Export(name="keyPairName", refs={String.class}, tree="[0]")
    private Output<String> keyPairName;

    /**
     * @return The name of key pair used to bind.
     * 
     */
    public Output<String> keyPairName() {
        return this.keyPairName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsKeyPairAttachment(String name) {
        this(name, EcsKeyPairAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsKeyPairAttachment(String name, EcsKeyPairAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsKeyPairAttachment(String name, EcsKeyPairAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsKeyPairAttachment:EcsKeyPairAttachment", name, args == null ? EcsKeyPairAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EcsKeyPairAttachment(String name, Output<String> id, @Nullable EcsKeyPairAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsKeyPairAttachment:EcsKeyPairAttachment", name, state, makeResourceOptions(options, id));
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
    public static EcsKeyPairAttachment get(String name, Output<String> id, @Nullable EcsKeyPairAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsKeyPairAttachment(name, id, state, options);
    }
}
