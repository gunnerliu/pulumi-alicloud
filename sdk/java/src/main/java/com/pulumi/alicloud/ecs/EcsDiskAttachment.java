// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsDiskAttachmentArgs;
import com.pulumi.alicloud.ecs.inputs.EcsDiskAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Alicloud ECS Disk Attachment as a resource, to attach and detach disks from ECS Instances.
 * 
 * For information about ECS Disk Attachment and how to use it, see [What is Disk Attachment](https://www.alibabacloud.com/help/en/doc-detail/25515.htm).
 * 
 * &gt; **NOTE:** Available in v1.122.0+.
 * 
 * ## Example Usage
 * 
 * Basic usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.EcsDisk;
 * import com.pulumi.alicloud.ecs.EcsDiskArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.ecs.EcsDiskAttachment;
 * import com.pulumi.alicloud.ecs.EcsDiskAttachmentArgs;
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
 *         var ecsSg = new SecurityGroup(&#34;ecsSg&#34;, SecurityGroupArgs.builder()        
 *             .description(&#34;New security group&#34;)
 *             .build());
 * 
 *         var ecsDisk = new EcsDisk(&#34;ecsDisk&#34;, EcsDiskArgs.builder()        
 *             .availabilityZone(&#34;cn-beijing-a&#34;)
 *             .size(&#34;50&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;TerraformTest-disk&#34;))
 *             .build());
 * 
 *         var ecsInstance = new Instance(&#34;ecsInstance&#34;, InstanceArgs.builder()        
 *             .imageId(&#34;ubuntu_18_04_64_20G_alibase_20190624.vhd&#34;)
 *             .instanceType(&#34;ecs.n4.small&#34;)
 *             .availabilityZone(&#34;cn-beijing-a&#34;)
 *             .securityGroups(ecsSg.id())
 *             .instanceName(&#34;Hello&#34;)
 *             .internetChargeType(&#34;PayByBandwidth&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;TerraformTest-instance&#34;))
 *             .build());
 * 
 *         var ecsDiskAtt = new EcsDiskAttachment(&#34;ecsDiskAtt&#34;, EcsDiskAttachmentArgs.builder()        
 *             .diskId(ecsDisk.id())
 *             .instanceId(ecsInstance.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * The disk attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/ecsDiskAttachment:EcsDiskAttachment example d-abc12345678:i-abc12355
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsDiskAttachment:EcsDiskAttachment")
public class EcsDiskAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Whether to mount as a system disk. Default to: `false`.
     * 
     */
    @Export(name="bootable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> bootable;

    /**
     * @return Whether to mount as a system disk. Default to: `false`.
     * 
     */
    public Output<Optional<Boolean>> bootable() {
        return Codegen.optional(this.bootable);
    }
    /**
     * Indicates whether the disk is released together with the instance. Default to: `false`.
     * 
     */
    @Export(name="deleteWithInstance", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteWithInstance;

    /**
     * @return Indicates whether the disk is released together with the instance. Default to: `false`.
     * 
     */
    public Output<Optional<Boolean>> deleteWithInstance() {
        return Codegen.optional(this.deleteWithInstance);
    }
    @Export(name="device", type=String.class, parameters={})
    private Output<String> device;

    public Output<String> device() {
        return this.device;
    }
    /**
     * ID of the Disk to be attached.
     * 
     */
    @Export(name="diskId", type=String.class, parameters={})
    private Output<String> diskId;

    /**
     * @return ID of the Disk to be attached.
     * 
     */
    public Output<String> diskId() {
        return this.diskId;
    }
    /**
     * ID of the Instance to attach to.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return ID of the Instance to attach to.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The name of key pair
     * 
     */
    @Export(name="keyPairName", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyPairName;

    /**
     * @return The name of key pair
     * 
     */
    public Output<Optional<String>> keyPairName() {
        return Codegen.optional(this.keyPairName);
    }
    /**
     * When mounting the system disk, setting the user name and password of the instance is only effective for the administrator and root user names, and other user names are not effective.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output</* @Nullable */ String> password;

    /**
     * @return When mounting the system disk, setting the user name and password of the instance is only effective for the administrator and root user names, and other user names are not effective.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsDiskAttachment(String name) {
        this(name, EcsDiskAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsDiskAttachment(String name, EcsDiskAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsDiskAttachment(String name, EcsDiskAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsDiskAttachment:EcsDiskAttachment", name, args == null ? EcsDiskAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EcsDiskAttachment(String name, Output<String> id, @Nullable EcsDiskAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsDiskAttachment:EcsDiskAttachment", name, state, makeResourceOptions(options, id));
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
    public static EcsDiskAttachment get(String name, Output<String> id, @Nullable EcsDiskAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsDiskAttachment(name, id, state, options);
    }
}
