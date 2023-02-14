// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ga.CustomRoutingEndpointGroupArgs;
import com.pulumi.alicloud.ga.inputs.CustomRoutingEndpointGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Global Accelerator (GA) Custom Routing Endpoint Group resource.
 * 
 * For information about Global Accelerator (GA) Custom Routing Endpoint Group and how to use it, see [What is Custom Routing Endpoint Group](https://www.alibabacloud.com/help/en/global-accelerator/latest/createcustomroutingendpointgroups).
 * 
 * &gt; **NOTE:** Available in v1.197.0+.
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
 * import com.pulumi.alicloud.ga.GaFunctions;
 * import com.pulumi.alicloud.ga.inputs.GetAcceleratorsArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackage;
 * import com.pulumi.alicloud.ga.BandwidthPackageArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachment;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachmentArgs;
 * import com.pulumi.alicloud.ga.Listener;
 * import com.pulumi.alicloud.ga.ListenerArgs;
 * import com.pulumi.alicloud.ga.inputs.ListenerPortRangeArgs;
 * import com.pulumi.alicloud.ga.CustomRoutingEndpointGroup;
 * import com.pulumi.alicloud.ga.CustomRoutingEndpointGroupArgs;
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
 *         final var defaultAccelerators = GaFunctions.getAccelerators(GetAcceleratorsArgs.builder()
 *             .status(&#34;active&#34;)
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
 *             .acceleratorId(defaultAccelerators.applyValue(getAcceleratorsResult -&gt; getAcceleratorsResult.accelerators()[0].id()))
 *             .bandwidthPackageId(defaultBandwidthPackage.id())
 *             .build());
 * 
 *         var defaultListener = new Listener(&#34;defaultListener&#34;, ListenerArgs.builder()        
 *             .acceleratorId(defaultBandwidthPackageAttachment.acceleratorId())
 *             .listenerType(&#34;CustomRouting&#34;)
 *             .portRanges(ListenerPortRangeArgs.builder()
 *                 .fromPort(10000)
 *                 .toPort(16000)
 *                 .build())
 *             .build());
 * 
 *         var defaultCustomRoutingEndpointGroup = new CustomRoutingEndpointGroup(&#34;defaultCustomRoutingEndpointGroup&#34;, CustomRoutingEndpointGroupArgs.builder()        
 *             .acceleratorId(defaultListener.acceleratorId())
 *             .listenerId(defaultListener.id())
 *             .endpointGroupRegion(&#34;cn-hangzhou&#34;)
 *             .customRoutingEndpointGroupName(&#34;example_value&#34;)
 *             .description(&#34;example_value&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Global Accelerator (GA) Custom Routing Endpoint Group can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ga/customRoutingEndpointGroup:CustomRoutingEndpointGroup example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ga/customRoutingEndpointGroup:CustomRoutingEndpointGroup")
public class CustomRoutingEndpointGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the GA instance.
     * 
     */
    @Export(name="acceleratorId", type=String.class, parameters={})
    private Output<String> acceleratorId;

    /**
     * @return The ID of the GA instance.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * The name of the endpoint group.
     * 
     */
    @Export(name="customRoutingEndpointGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> customRoutingEndpointGroupName;

    /**
     * @return The name of the endpoint group.
     * 
     */
    public Output<Optional<String>> customRoutingEndpointGroupName() {
        return Codegen.optional(this.customRoutingEndpointGroupName);
    }
    /**
     * The description of the endpoint group.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the endpoint group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the region in which to create the endpoint group.
     * 
     */
    @Export(name="endpointGroupRegion", type=String.class, parameters={})
    private Output<String> endpointGroupRegion;

    /**
     * @return The ID of the region in which to create the endpoint group.
     * 
     */
    public Output<String> endpointGroupRegion() {
        return this.endpointGroupRegion;
    }
    /**
     * The ID of the custom routing listener.
     * 
     */
    @Export(name="listenerId", type=String.class, parameters={})
    private Output<String> listenerId;

    /**
     * @return The ID of the custom routing listener.
     * 
     */
    public Output<String> listenerId() {
        return this.listenerId;
    }
    /**
     * The status of the Custom Routing Endpoint Group.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the Custom Routing Endpoint Group.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomRoutingEndpointGroup(String name) {
        this(name, CustomRoutingEndpointGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomRoutingEndpointGroup(String name, CustomRoutingEndpointGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomRoutingEndpointGroup(String name, CustomRoutingEndpointGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/customRoutingEndpointGroup:CustomRoutingEndpointGroup", name, args == null ? CustomRoutingEndpointGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomRoutingEndpointGroup(String name, Output<String> id, @Nullable CustomRoutingEndpointGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/customRoutingEndpointGroup:CustomRoutingEndpointGroup", name, state, makeResourceOptions(options, id));
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
    public static CustomRoutingEndpointGroup get(String name, Output<String> id, @Nullable CustomRoutingEndpointGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomRoutingEndpointGroup(name, id, state, options);
    }
}