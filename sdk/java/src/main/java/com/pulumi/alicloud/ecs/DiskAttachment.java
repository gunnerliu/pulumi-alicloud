// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.DiskAttachmentArgs;
import com.pulumi.alicloud.ecs.inputs.DiskAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * The disk attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/diskAttachment:DiskAttachment example d-abc12345678:i-abc12355
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/diskAttachment:DiskAttachment")
public class DiskAttachment extends com.pulumi.resources.CustomResource {
    @Export(name="bootable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> bootable;

    public Output<Optional<Boolean>> bootable() {
        return Codegen.optional(this.bootable);
    }
    @Export(name="deleteWithInstance", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteWithInstance;

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
    @Export(name="keyPairName", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyPairName;

    public Output<Optional<String>> keyPairName() {
        return Codegen.optional(this.keyPairName);
    }
    @Export(name="password", type=String.class, parameters={})
    private Output</* @Nullable */ String> password;

    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiskAttachment(String name) {
        this(name, DiskAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiskAttachment(String name, DiskAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiskAttachment(String name, DiskAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/diskAttachment:DiskAttachment", name, args == null ? DiskAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DiskAttachment(String name, Output<String> id, @Nullable DiskAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/diskAttachment:DiskAttachment", name, state, makeResourceOptions(options, id));
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
    public static DiskAttachment get(String name, Output<String> id, @Nullable DiskAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiskAttachment(name, id, state, options);
    }
}
