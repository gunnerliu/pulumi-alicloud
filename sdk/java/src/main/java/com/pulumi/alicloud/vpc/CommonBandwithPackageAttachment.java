// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.CommonBandwithPackageAttachmentArgs;
import com.pulumi.alicloud.vpc.inputs.CommonBandwithPackageAttachmentState;
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
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.vpc.CommonBandwithPackage;
 * import com.pulumi.alicloud.vpc.CommonBandwithPackageArgs;
 * import com.pulumi.alicloud.ecs.EipAddress;
 * import com.pulumi.alicloud.ecs.EipAddressArgs;
 * import com.pulumi.alicloud.vpc.CommonBandwithPackageAttachment;
 * import com.pulumi.alicloud.vpc.CommonBandwithPackageAttachmentArgs;
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
 *         var defaultCommonBandwithPackage = new CommonBandwithPackage(&#34;defaultCommonBandwithPackage&#34;, CommonBandwithPackageArgs.builder()        
 *             .bandwidth(3)
 *             .internetChargeType(&#34;PayByBandwidth&#34;)
 *             .build());
 * 
 *         var defaultEipAddress = new EipAddress(&#34;defaultEipAddress&#34;, EipAddressArgs.builder()        
 *             .bandwidth(&#34;3&#34;)
 *             .internetChargeType(&#34;PayByTraffic&#34;)
 *             .build());
 * 
 *         var defaultCommonBandwithPackageAttachment = new CommonBandwithPackageAttachment(&#34;defaultCommonBandwithPackageAttachment&#34;, CommonBandwithPackageAttachmentArgs.builder()        
 *             .bandwidthPackageId(defaultCommonBandwithPackage.id())
 *             .instanceId(defaultEipAddress.id())
 *             .bandwidthPackageBandwidth(&#34;2&#34;)
 *             .ipType(&#34;EIP&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * cbwp Common Bandwidth Package Attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpc/commonBandwithPackageAttachment:CommonBandwithPackageAttachment example &lt;bandwidth_package_id&gt;:&lt;instance_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/commonBandwithPackageAttachment:CommonBandwithPackageAttachment")
public class CommonBandwithPackageAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The maximum bandwidth for the EIP. This value cannot be larger than the maximum bandwidth of the EIP bandwidth plan. Unit: Mbit/s.
     * 
     */
    @Export(name="bandwidthPackageBandwidth", refs={String.class}, tree="[0]")
    private Output<String> bandwidthPackageBandwidth;

    /**
     * @return The maximum bandwidth for the EIP. This value cannot be larger than the maximum bandwidth of the EIP bandwidth plan. Unit: Mbit/s.
     * 
     */
    public Output<String> bandwidthPackageBandwidth() {
        return this.bandwidthPackageBandwidth;
    }
    /**
     * The bandwidth_package_id of the common bandwidth package attachment, the field can&#39;t be changed.
     * 
     */
    @Export(name="bandwidthPackageId", refs={String.class}, tree="[0]")
    private Output<String> bandwidthPackageId;

    /**
     * @return The bandwidth_package_id of the common bandwidth package attachment, the field can&#39;t be changed.
     * 
     */
    public Output<String> bandwidthPackageId() {
        return this.bandwidthPackageId;
    }
    /**
     * Whether to cancel the maximum bandwidth configuration for the EIP. Default: false.
     * 
     */
    @Export(name="cancelCommonBandwidthPackageIpBandwidth", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> cancelCommonBandwidthPackageIpBandwidth;

    /**
     * @return Whether to cancel the maximum bandwidth configuration for the EIP. Default: false.
     * 
     */
    public Output<Optional<Boolean>> cancelCommonBandwidthPackageIpBandwidth() {
        return Codegen.optional(this.cancelCommonBandwidthPackageIpBandwidth);
    }
    /**
     * The instance_id of the common bandwidth package attachment, the field can&#39;t be changed.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The instance_id of the common bandwidth package attachment, the field can&#39;t be changed.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * IP type. Set the value to **EIP**, which indicates that the EIP is added to the Internet shared bandwidth.
     * 
     */
    @Export(name="ipType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipType;

    /**
     * @return IP type. Set the value to **EIP**, which indicates that the EIP is added to the Internet shared bandwidth.
     * 
     */
    public Output<Optional<String>> ipType() {
        return Codegen.optional(this.ipType);
    }
    /**
     * The status of the Internet Shared Bandwidth instance.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Internet Shared Bandwidth instance.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CommonBandwithPackageAttachment(String name) {
        this(name, CommonBandwithPackageAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CommonBandwithPackageAttachment(String name, CommonBandwithPackageAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CommonBandwithPackageAttachment(String name, CommonBandwithPackageAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/commonBandwithPackageAttachment:CommonBandwithPackageAttachment", name, args == null ? CommonBandwithPackageAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CommonBandwithPackageAttachment(String name, Output<String> id, @Nullable CommonBandwithPackageAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/commonBandwithPackageAttachment:CommonBandwithPackageAttachment", name, state, makeResourceOptions(options, id));
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
    public static CommonBandwithPackageAttachment get(String name, Output<String> id, @Nullable CommonBandwithPackageAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CommonBandwithPackageAttachment(name, id, state, options);
    }
}
