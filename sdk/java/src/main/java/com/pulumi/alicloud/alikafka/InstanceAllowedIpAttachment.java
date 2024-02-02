// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alikafka;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.alikafka.InstanceAllowedIpAttachmentArgs;
import com.pulumi.alicloud.alikafka.inputs.InstanceAllowedIpAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a AliKafka Instance Allowed Ip Attachment resource.
 * 
 * For information about Ali Kafka Instance Allowed Ip Attachment and how to use it, see [What is Instance Allowed Ip Attachment](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/api-alikafka-2019-09-16-updateallowedip).
 * 
 * &gt; **NOTE:** Available since v1.163.0.
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
 * import com.pulumi.random.RandomInteger;
 * import com.pulumi.random.RandomIntegerArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.alikafka.Instance;
 * import com.pulumi.alicloud.alikafka.InstanceArgs;
 * import com.pulumi.alicloud.alikafka.InstanceAllowedIpAttachment;
 * import com.pulumi.alicloud.alikafka.InstanceAllowedIpAttachmentArgs;
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
 *         var defaultRandomInteger = new RandomInteger(&#34;defaultRandomInteger&#34;, RandomIntegerArgs.builder()        
 *             .min(10000)
 *             .max(99999)
 *             .build());
 * 
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
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
 *             .partitionNum(50)
 *             .diskType(1)
 *             .diskSize(500)
 *             .deployType(5)
 *             .ioMax(20)
 *             .vswitchId(defaultSwitch.id())
 *             .securityGroup(defaultSecurityGroup.id())
 *             .build());
 * 
 *         var defaultInstanceAllowedIpAttachment = new InstanceAllowedIpAttachment(&#34;defaultInstanceAllowedIpAttachment&#34;, InstanceAllowedIpAttachmentArgs.builder()        
 *             .allowedIp(&#34;114.237.9.78/32&#34;)
 *             .allowedType(&#34;vpc&#34;)
 *             .instanceId(defaultInstance.id())
 *             .portRange(&#34;9092/9092&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * AliKafka Instance Allowed Ip Attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:alikafka/instanceAllowedIpAttachment:InstanceAllowedIpAttachment example &lt;instance_id&gt;:&lt;allowed_type&gt;:&lt;port_range&gt;:&lt;allowed_ip&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:alikafka/instanceAllowedIpAttachment:InstanceAllowedIpAttachment")
public class InstanceAllowedIpAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The allowed ip. It can be a CIDR block.
     * 
     */
    @Export(name="allowedIp", refs={String.class}, tree="[0]")
    private Output<String> allowedIp;

    /**
     * @return The allowed ip. It can be a CIDR block.
     * 
     */
    public Output<String> allowedIp() {
        return this.allowedIp;
    }
    /**
     * The type of whitelist. Valid Value: `vpc`, `internet`. **NOTE:** From version 1.179.0, `allowed_type` can be set to `internet`.
     * 
     */
    @Export(name="allowedType", refs={String.class}, tree="[0]")
    private Output<String> allowedType;

    /**
     * @return The type of whitelist. Valid Value: `vpc`, `internet`. **NOTE:** From version 1.179.0, `allowed_type` can be set to `internet`.
     * 
     */
    public Output<String> allowedType() {
        return this.allowedType;
    }
    /**
     * The ID of the instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The ID of the instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The Port range.  Valid Value: `9092/9092`, `9093/9093`. **NOTE:** From version 1.179.0, `port_range` can be set to `9093/9093`.
     * - `9092/9092`: port range for a VPC whitelist.
     * - `9093/9093`: port range for an Internet whitelist.
     * 
     */
    @Export(name="portRange", refs={String.class}, tree="[0]")
    private Output<String> portRange;

    /**
     * @return The Port range.  Valid Value: `9092/9092`, `9093/9093`. **NOTE:** From version 1.179.0, `port_range` can be set to `9093/9093`.
     * - `9092/9092`: port range for a VPC whitelist.
     * - `9093/9093`: port range for an Internet whitelist.
     * 
     */
    public Output<String> portRange() {
        return this.portRange;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceAllowedIpAttachment(String name) {
        this(name, InstanceAllowedIpAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceAllowedIpAttachment(String name, InstanceAllowedIpAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceAllowedIpAttachment(String name, InstanceAllowedIpAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:alikafka/instanceAllowedIpAttachment:InstanceAllowedIpAttachment", name, args == null ? InstanceAllowedIpAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceAllowedIpAttachment(String name, Output<String> id, @Nullable InstanceAllowedIpAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:alikafka/instanceAllowedIpAttachment:InstanceAllowedIpAttachment", name, state, makeResourceOptions(options, id));
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
    public static InstanceAllowedIpAttachment get(String name, Output<String> id, @Nullable InstanceAllowedIpAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceAllowedIpAttachment(name, id, state, options);
    }
}
