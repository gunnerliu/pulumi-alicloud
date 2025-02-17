// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ens.DiskInstanceAttachmentArgs;
import com.pulumi.alicloud.ens.inputs.DiskInstanceAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ENS Disk Instance Attachment resource. Disk instance mount.
 * 
 * For information about ENS Disk Instance Attachment and how to use it, see [What is Disk Instance Attachment](https://www.alibabacloud.com/help/en/).
 * 
 * &gt; **NOTE:** Available since v1.216.0.
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
 * import com.pulumi.alicloud.ens.Disk;
 * import com.pulumi.alicloud.ens.DiskArgs;
 * import com.pulumi.alicloud.ens.Instance;
 * import com.pulumi.alicloud.ens.InstanceArgs;
 * import com.pulumi.alicloud.ens.inputs.InstanceSystemDiskArgs;
 * import com.pulumi.alicloud.ens.DiskInstanceAttachment;
 * import com.pulumi.alicloud.ens.DiskInstanceAttachmentArgs;
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
 *         var defaultDisk = new Disk(&#34;defaultDisk&#34;, DiskArgs.builder()        
 *             .size(&#34;20&#34;)
 *             .ensRegionId(&#34;cn-chenzhou-telecom_unicom_cmcc&#34;)
 *             .paymentType(&#34;PayAsYouGo&#34;)
 *             .category(&#34;cloud_efficiency&#34;)
 *             .build());
 * 
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .systemDisk(InstanceSystemDiskArgs.builder()
 *                 .size(&#34;20&#34;)
 *                 .build())
 *             .imageId(&#34;centos_6_08_64_20G_alibase_20171208&#34;)
 *             .paymentType(&#34;Subscription&#34;)
 *             .instanceType(&#34;ens.sn1.stiny&#34;)
 *             .password(&#34;12345678ABCabc&#34;)
 *             .amount(&#34;1&#34;)
 *             .internetMaxBandwidthOut(&#34;10&#34;)
 *             .uniqueSuffix(true)
 *             .publicIpIdentification(true)
 *             .ensRegionId(&#34;cn-chenzhou-telecom_unicom_cmcc&#34;)
 *             .scheduleAreaLevel(&#34;Region&#34;)
 *             .periodUnit(&#34;Month&#34;)
 *             .period(&#34;1&#34;)
 *             .build());
 * 
 *         var defaultDiskInstanceAttachment = new DiskInstanceAttachment(&#34;defaultDiskInstanceAttachment&#34;, DiskInstanceAttachmentArgs.builder()        
 *             .instanceId(defaultInstance.id())
 *             .deleteWithInstance(&#34;false&#34;)
 *             .diskId(defaultDisk.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ENS Disk Instance Attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ens/diskInstanceAttachment:DiskInstanceAttachment example &lt;disk_id&gt;:&lt;instance_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ens/diskInstanceAttachment:DiskInstanceAttachment")
public class DiskInstanceAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Whether the cloud disk to be mounted is released with the instance  Value: true: When the instance is released, the cloud disk is released together with the instance. false: When the instance is released, the cloud disk is retained and is not released together with the instance. Empty means false by default.
     * 
     */
    @Export(name="deleteWithInstance", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deleteWithInstance;

    /**
     * @return Whether the cloud disk to be mounted is released with the instance  Value: true: When the instance is released, the cloud disk is released together with the instance. false: When the instance is released, the cloud disk is retained and is not released together with the instance. Empty means false by default.
     * 
     */
    public Output<Optional<String>> deleteWithInstance() {
        return Codegen.optional(this.deleteWithInstance);
    }
    /**
     * The ID of the cloud disk to be mounted. The Cloud Disk (DiskId) and the instance (InstanceId) must be on the same node.
     * 
     */
    @Export(name="diskId", refs={String.class}, tree="[0]")
    private Output<String> diskId;

    /**
     * @return The ID of the cloud disk to be mounted. The Cloud Disk (DiskId) and the instance (InstanceId) must be on the same node.
     * 
     */
    public Output<String> diskId() {
        return this.diskId;
    }
    /**
     * Instance ID.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return Instance ID.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiskInstanceAttachment(String name) {
        this(name, DiskInstanceAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiskInstanceAttachment(String name, DiskInstanceAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiskInstanceAttachment(String name, DiskInstanceAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ens/diskInstanceAttachment:DiskInstanceAttachment", name, args == null ? DiskInstanceAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DiskInstanceAttachment(String name, Output<String> id, @Nullable DiskInstanceAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ens/diskInstanceAttachment:DiskInstanceAttachment", name, state, makeResourceOptions(options, id));
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
    public static DiskInstanceAttachment get(String name, Output<String> id, @Nullable DiskInstanceAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiskInstanceAttachment(name, id, state, options);
    }
}
