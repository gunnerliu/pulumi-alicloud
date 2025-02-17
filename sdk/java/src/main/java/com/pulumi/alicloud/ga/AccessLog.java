// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ga.AccessLogArgs;
import com.pulumi.alicloud.ga.inputs.AccessLogState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Global Accelerator (GA) Access Log resource.
 * 
 * For information about Global Accelerator (GA) Access Log and how to use it, see [What is Access Log](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-attachlogstoretoendpointgroup).
 * 
 * &gt; **NOTE:** Available since v1.187.0.
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
 * import com.pulumi.alicloud.log.Project;
 * import com.pulumi.alicloud.log.Store;
 * import com.pulumi.alicloud.log.StoreArgs;
 * import com.pulumi.alicloud.ga.Accelerator;
 * import com.pulumi.alicloud.ga.AcceleratorArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackage;
 * import com.pulumi.alicloud.ga.BandwidthPackageArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachment;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachmentArgs;
 * import com.pulumi.alicloud.ga.Listener;
 * import com.pulumi.alicloud.ga.ListenerArgs;
 * import com.pulumi.alicloud.ga.inputs.ListenerPortRangeArgs;
 * import com.pulumi.alicloud.ecs.EipAddress;
 * import com.pulumi.alicloud.ecs.EipAddressArgs;
 * import com.pulumi.alicloud.ga.EndpointGroup;
 * import com.pulumi.alicloud.ga.EndpointGroupArgs;
 * import com.pulumi.alicloud.ga.inputs.EndpointGroupEndpointConfigurationArgs;
 * import com.pulumi.alicloud.ga.AccessLog;
 * import com.pulumi.alicloud.ga.AccessLogArgs;
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
 *         final var region = config.get(&#34;region&#34;).orElse(&#34;cn-hangzhou&#34;);
 *         var defaultRandomInteger = new RandomInteger(&#34;defaultRandomInteger&#34;, RandomIntegerArgs.builder()        
 *             .max(99999)
 *             .min(10000)
 *             .build());
 * 
 *         var defaultProject = new Project(&#34;defaultProject&#34;);
 * 
 *         var defaultStore = new Store(&#34;defaultStore&#34;, StoreArgs.builder()        
 *             .project(defaultProject.name())
 *             .build());
 * 
 *         var defaultAccelerator = new Accelerator(&#34;defaultAccelerator&#34;, AcceleratorArgs.builder()        
 *             .duration(1)
 *             .autoUseCoupon(true)
 *             .spec(&#34;2&#34;)
 *             .build());
 * 
 *         var defaultBandwidthPackage = new BandwidthPackage(&#34;defaultBandwidthPackage&#34;, BandwidthPackageArgs.builder()        
 *             .bandwidth(100)
 *             .type(&#34;Basic&#34;)
 *             .bandwidthType(&#34;Basic&#34;)
 *             .paymentType(&#34;PayAsYouGo&#34;)
 *             .billingType(&#34;PayBy95&#34;)
 *             .ratio(30)
 *             .build());
 * 
 *         var defaultBandwidthPackageAttachment = new BandwidthPackageAttachment(&#34;defaultBandwidthPackageAttachment&#34;, BandwidthPackageAttachmentArgs.builder()        
 *             .acceleratorId(defaultAccelerator.id())
 *             .bandwidthPackageId(defaultBandwidthPackage.id())
 *             .build());
 * 
 *         var defaultListener = new Listener(&#34;defaultListener&#34;, ListenerArgs.builder()        
 *             .acceleratorId(defaultBandwidthPackageAttachment.acceleratorId())
 *             .clientAffinity(&#34;SOURCE_IP&#34;)
 *             .protocol(&#34;HTTP&#34;)
 *             .portRanges(ListenerPortRangeArgs.builder()
 *                 .fromPort(70)
 *                 .toPort(70)
 *                 .build())
 *             .build());
 * 
 *         var defaultEipAddress = new EipAddress(&#34;defaultEipAddress&#34;, EipAddressArgs.builder()        
 *             .bandwidth(&#34;10&#34;)
 *             .internetChargeType(&#34;PayByBandwidth&#34;)
 *             .addressName(&#34;terraform-example&#34;)
 *             .build());
 * 
 *         var defaultEndpointGroup = new EndpointGroup(&#34;defaultEndpointGroup&#34;, EndpointGroupArgs.builder()        
 *             .acceleratorId(defaultListener.acceleratorId())
 *             .endpointConfigurations(EndpointGroupEndpointConfigurationArgs.builder()
 *                 .endpoint(defaultEipAddress.ipAddress())
 *                 .type(&#34;PublicIp&#34;)
 *                 .weight(20)
 *                 .build())
 *             .endpointGroupRegion(region)
 *             .listenerId(defaultListener.id())
 *             .build());
 * 
 *         var defaultAccessLog = new AccessLog(&#34;defaultAccessLog&#34;, AccessLogArgs.builder()        
 *             .acceleratorId(defaultAccelerator.id())
 *             .listenerId(defaultListener.id())
 *             .endpointGroupId(defaultEndpointGroup.id())
 *             .slsProjectName(defaultProject.name())
 *             .slsLogStoreName(defaultStore.name())
 *             .slsRegionId(region)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Global Accelerator (GA) Access Log can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ga/accessLog:AccessLog example &lt;accelerator_id&gt;:&lt;listener_id&gt;:&lt;endpoint_group_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ga/accessLog:AccessLog")
public class AccessLog extends com.pulumi.resources.CustomResource {
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
     * The ID of the endpoint group instance.
     * 
     */
    @Export(name="endpointGroupId", refs={String.class}, tree="[0]")
    private Output<String> endpointGroupId;

    /**
     * @return The ID of the endpoint group instance.
     * 
     */
    public Output<String> endpointGroupId() {
        return this.endpointGroupId;
    }
    /**
     * The ID of the listener.
     * 
     */
    @Export(name="listenerId", refs={String.class}, tree="[0]")
    private Output<String> listenerId;

    /**
     * @return The ID of the listener.
     * 
     */
    public Output<String> listenerId() {
        return this.listenerId;
    }
    /**
     * The name of the Log Store.
     * 
     */
    @Export(name="slsLogStoreName", refs={String.class}, tree="[0]")
    private Output<String> slsLogStoreName;

    /**
     * @return The name of the Log Store.
     * 
     */
    public Output<String> slsLogStoreName() {
        return this.slsLogStoreName;
    }
    /**
     * The name of the Log Service project.
     * 
     */
    @Export(name="slsProjectName", refs={String.class}, tree="[0]")
    private Output<String> slsProjectName;

    /**
     * @return The name of the Log Service project.
     * 
     */
    public Output<String> slsProjectName() {
        return this.slsProjectName;
    }
    /**
     * The region ID of the Log Service project.
     * 
     */
    @Export(name="slsRegionId", refs={String.class}, tree="[0]")
    private Output<String> slsRegionId;

    /**
     * @return The region ID of the Log Service project.
     * 
     */
    public Output<String> slsRegionId() {
        return this.slsRegionId;
    }
    /**
     * Whether access log is enabled.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Whether access log is enabled.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessLog(String name) {
        this(name, AccessLogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessLog(String name, AccessLogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessLog(String name, AccessLogArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/accessLog:AccessLog", name, args == null ? AccessLogArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessLog(String name, Output<String> id, @Nullable AccessLogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/accessLog:AccessLog", name, state, makeResourceOptions(options, id));
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
    public static AccessLog get(String name, Output<String> id, @Nullable AccessLogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessLog(name, id, state, options);
    }
}
