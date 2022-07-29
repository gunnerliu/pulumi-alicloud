// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.bastionhost.HostAttachmentArgs;
import com.pulumi.alicloud.bastionhost.inputs.HostAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Bastion Host Host Attachment resource to add host into one host group.
 * 
 * &gt; **NOTE:** Available in v1.135.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Bastion Host Host Attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:bastionhost/hostAttachment:HostAttachment example &lt;instance_id&gt;:&lt;host_group_id&gt;:&lt;host_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:bastionhost/hostAttachment:HostAttachment")
public class HostAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the added to the host group ID.
     * 
     */
    @Export(name="hostGroupId", type=String.class, parameters={})
    private Output<String> hostGroupId;

    /**
     * @return Specifies the added to the host group ID.
     * 
     */
    public Output<String> hostGroupId() {
        return this.hostGroupId;
    }
    /**
     * Specified to be part of a host group of host ID.
     * 
     */
    @Export(name="hostId", type=String.class, parameters={})
    private Output<String> hostId;

    /**
     * @return Specified to be part of a host group of host ID.
     * 
     */
    public Output<String> hostId() {
        return this.hostId;
    }
    /**
     * The bastion host instance id.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The bastion host instance id.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostAttachment(String name) {
        this(name, HostAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostAttachment(String name, HostAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostAttachment(String name, HostAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:bastionhost/hostAttachment:HostAttachment", name, args == null ? HostAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HostAttachment(String name, Output<String> id, @Nullable HostAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:bastionhost/hostAttachment:HostAttachment", name, state, makeResourceOptions(options, id));
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
    public static HostAttachment get(String name, Output<String> id, @Nullable HostAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HostAttachment(name, id, state, options);
    }
}
