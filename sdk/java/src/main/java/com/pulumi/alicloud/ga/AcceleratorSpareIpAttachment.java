// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ga.AcceleratorSpareIpAttachmentArgs;
import com.pulumi.alicloud.ga.inputs.AcceleratorSpareIpAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Global Accelerator (GA) Accelerator Spare Ip Attachment resource.
 * 
 * For information about Global Accelerator (GA) Accelerator Spare Ip Attachment and how to use it, see [What is Accelerator Spare Ip Attachment](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createspareips).
 * 
 * &gt; **NOTE:** Available since v1.167.0.
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
 * import com.pulumi.alicloud.ga.Accelerator;
 * import com.pulumi.alicloud.ga.AcceleratorArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackage;
 * import com.pulumi.alicloud.ga.BandwidthPackageArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachment;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachmentArgs;
 * import com.pulumi.alicloud.ga.AcceleratorSpareIpAttachment;
 * import com.pulumi.alicloud.ga.AcceleratorSpareIpAttachmentArgs;
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
 *         var defaultAccelerator = new Accelerator(&#34;defaultAccelerator&#34;, AcceleratorArgs.builder()        
 *             .duration(1)
 *             .spec(&#34;1&#34;)
 *             .acceleratorName(&#34;terraform-example&#34;)
 *             .autoUseCoupon(true)
 *             .description(&#34;terraform-example&#34;)
 *             .build());
 * 
 *         var defaultBandwidthPackage = new BandwidthPackage(&#34;defaultBandwidthPackage&#34;, BandwidthPackageArgs.builder()        
 *             .bandwidth(100)
 *             .type(&#34;Basic&#34;)
 *             .bandwidthType(&#34;Basic&#34;)
 *             .paymentType(&#34;PayAsYouGo&#34;)
 *             .billingType(&#34;PayBy95&#34;)
 *             .ratio(30)
 *             .bandwidthPackageName(&#34;terraform-example&#34;)
 *             .autoPay(true)
 *             .autoUseCoupon(true)
 *             .build());
 * 
 *         var defaultBandwidthPackageAttachment = new BandwidthPackageAttachment(&#34;defaultBandwidthPackageAttachment&#34;, BandwidthPackageAttachmentArgs.builder()        
 *             .acceleratorId(defaultAccelerator.id())
 *             .bandwidthPackageId(defaultBandwidthPackage.id())
 *             .build());
 * 
 *         var defaultAcceleratorSpareIpAttachment = new AcceleratorSpareIpAttachment(&#34;defaultAcceleratorSpareIpAttachment&#34;, AcceleratorSpareIpAttachmentArgs.builder()        
 *             .acceleratorId(defaultBandwidthPackageAttachment.acceleratorId())
 *             .spareIp(&#34;127.0.0.1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Global Accelerator (GA) Accelerator Spare Ip Attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ga/acceleratorSpareIpAttachment:AcceleratorSpareIpAttachment example &lt;accelerator_id&gt;:&lt;spare_ip&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ga/acceleratorSpareIpAttachment:AcceleratorSpareIpAttachment")
public class AcceleratorSpareIpAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the global acceleration instance.
     * 
     */
    @Export(name="acceleratorId", refs={String.class}, tree="[0]")
    private Output<String> acceleratorId;

    /**
     * @return The ID of the global acceleration instance.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * The dry run.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The standby IP address of CNAME. When the acceleration area is abnormal, the traffic is switched to the standby IP address.
     * 
     */
    @Export(name="spareIp", refs={String.class}, tree="[0]")
    private Output<String> spareIp;

    /**
     * @return The standby IP address of CNAME. When the acceleration area is abnormal, the traffic is switched to the standby IP address.
     * 
     */
    public Output<String> spareIp() {
        return this.spareIp;
    }
    /**
     * The status of the standby CNAME IP address.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the standby CNAME IP address.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AcceleratorSpareIpAttachment(String name) {
        this(name, AcceleratorSpareIpAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AcceleratorSpareIpAttachment(String name, AcceleratorSpareIpAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AcceleratorSpareIpAttachment(String name, AcceleratorSpareIpAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/acceleratorSpareIpAttachment:AcceleratorSpareIpAttachment", name, args == null ? AcceleratorSpareIpAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AcceleratorSpareIpAttachment(String name, Output<String> id, @Nullable AcceleratorSpareIpAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/acceleratorSpareIpAttachment:AcceleratorSpareIpAttachment", name, state, makeResourceOptions(options, id));
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
    public static AcceleratorSpareIpAttachment get(String name, Output<String> id, @Nullable AcceleratorSpareIpAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AcceleratorSpareIpAttachment(name, id, state, options);
    }
}
