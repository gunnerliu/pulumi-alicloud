// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ga.ListenerArgs;
import com.pulumi.alicloud.ga.inputs.ListenerState;
import com.pulumi.alicloud.ga.outputs.ListenerCertificate;
import com.pulumi.alicloud.ga.outputs.ListenerForwardedForConfig;
import com.pulumi.alicloud.ga.outputs.ListenerPortRange;
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
 * Provides a Global Accelerator (GA) Listener resource.
 * 
 * For information about Global Accelerator (GA) Listener and how to use it, see [What is Listener](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createlistener).
 * 
 * &gt; **NOTE:** Available since v1.111.0.
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
 * import com.pulumi.alicloud.ga.Listener;
 * import com.pulumi.alicloud.ga.ListenerArgs;
 * import com.pulumi.alicloud.ga.inputs.ListenerPortRangeArgs;
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
 *             .autoUseCoupon(true)
 *             .spec(&#34;1&#34;)
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
 *             .portRanges(ListenerPortRangeArgs.builder()
 *                 .fromPort(80)
 *                 .toPort(80)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Ga Listener can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ga/listener:Listener example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ga/listener:Listener")
public class Listener extends com.pulumi.resources.CustomResource {
    /**
     * The accelerator id.
     * 
     */
    @Export(name="acceleratorId", refs={String.class}, tree="[0]")
    private Output<String> acceleratorId;

    /**
     * @return The accelerator id.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * The certificates of the listener. See `certificates` below.
     * &gt; **NOTE:** This parameter needs to be configured only for monitoring of the `HTTPS` protocol.
     * 
     */
    @Export(name="certificates", refs={List.class,ListenerCertificate.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ListenerCertificate>> certificates;

    /**
     * @return The certificates of the listener. See `certificates` below.
     * &gt; **NOTE:** This parameter needs to be configured only for monitoring of the `HTTPS` protocol.
     * 
     */
    public Output<Optional<List<ListenerCertificate>>> certificates() {
        return Codegen.optional(this.certificates);
    }
    /**
     * The clientAffinity of the listener. Default value: `NONE`. Valid values:
     * 
     */
    @Export(name="clientAffinity", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientAffinity;

    /**
     * @return The clientAffinity of the listener. Default value: `NONE`. Valid values:
     * 
     */
    public Output<Optional<String>> clientAffinity() {
        return Codegen.optional(this.clientAffinity);
    }
    /**
     * The description of the listener.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the listener.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The XForward headers. See `forwarded_for_config` below.
     * 
     */
    @Export(name="forwardedForConfig", refs={ListenerForwardedForConfig.class}, tree="[0]")
    private Output</* @Nullable */ ListenerForwardedForConfig> forwardedForConfig;

    /**
     * @return The XForward headers. See `forwarded_for_config` below.
     * 
     */
    public Output<Optional<ListenerForwardedForConfig>> forwardedForConfig() {
        return Codegen.optional(this.forwardedForConfig);
    }
    /**
     * The routing type of the listener. Default Value: `Standard`. Valid values:
     * 
     */
    @Export(name="listenerType", refs={String.class}, tree="[0]")
    private Output<String> listenerType;

    /**
     * @return The routing type of the listener. Default Value: `Standard`. Valid values:
     * 
     */
    public Output<String> listenerType() {
        return this.listenerType;
    }
    /**
     * The name of the listener. The length of the name is 2-128 characters. It starts with uppercase and lowercase letters or Chinese characters. It can contain numbers and underscores and dashes.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the listener. The length of the name is 2-128 characters. It starts with uppercase and lowercase letters or Chinese characters. It can contain numbers and underscores and dashes.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The portRanges of the listener. See `port_ranges` below.
     * &gt; **NOTE:** For `HTTP` or `HTTPS` protocol monitoring, only one monitoring port can be configured, that is, the start monitoring port and end monitoring port should be the same.
     * 
     */
    @Export(name="portRanges", refs={List.class,ListenerPortRange.class}, tree="[0,1]")
    private Output<List<ListenerPortRange>> portRanges;

    /**
     * @return The portRanges of the listener. See `port_ranges` below.
     * &gt; **NOTE:** For `HTTP` or `HTTPS` protocol monitoring, only one monitoring port can be configured, that is, the start monitoring port and end monitoring port should be the same.
     * 
     */
    public Output<List<ListenerPortRange>> portRanges() {
        return this.portRanges;
    }
    /**
     * Type of network transport protocol monitored. Default value: `TCP`. Valid values: `TCP`, `UDP`, `HTTP`, `HTTPS`.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> protocol;

    /**
     * @return Type of network transport protocol monitored. Default value: `TCP`. Valid values: `TCP`, `UDP`, `HTTP`, `HTTPS`.
     * 
     */
    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    /**
     * The proxy protocol of the listener. Default value: `false`. Valid values:
     * 
     */
    @Export(name="proxyProtocol", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> proxyProtocol;

    /**
     * @return The proxy protocol of the listener. Default value: `false`. Valid values:
     * 
     */
    public Output<Optional<Boolean>> proxyProtocol() {
        return Codegen.optional(this.proxyProtocol);
    }
    /**
     * The ID of the security policy. **NOTE:** Only `HTTPS` listeners support this parameter. Valid values:
     * 
     */
    @Export(name="securityPolicyId", refs={String.class}, tree="[0]")
    private Output<String> securityPolicyId;

    /**
     * @return The ID of the security policy. **NOTE:** Only `HTTPS` listeners support this parameter. Valid values:
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }
    /**
     * The status of the listener.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the listener.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Listener(String name) {
        this(name, ListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Listener(String name, ListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/listener:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Listener(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/listener:Listener", name, state, makeResourceOptions(options, id));
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
    public static Listener get(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, state, options);
    }
}
