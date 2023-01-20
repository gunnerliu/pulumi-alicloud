// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ga.BasicIpSetArgs;
import com.pulumi.alicloud.ga.inputs.BasicIpSetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Global Accelerator (GA) Basic Ip Set resource.
 * 
 * For information about Global Accelerator (GA) Basic Ip Set and how to use it, see [What is Basic Ip Set](https://www.alibabacloud.com/help/en/global-accelerator/latest/createbasicipset).
 * 
 * &gt; **NOTE:** Available in v1.194.0+.
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
 * import com.pulumi.alicloud.ga.BasicAccelerator;
 * import com.pulumi.alicloud.ga.BasicAcceleratorArgs;
 * import com.pulumi.alicloud.ga.BasicIpSet;
 * import com.pulumi.alicloud.ga.BasicIpSetArgs;
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
 *         var defaultBasicAccelerator = new BasicAccelerator(&#34;defaultBasicAccelerator&#34;, BasicAcceleratorArgs.builder()        
 *             .duration(1)
 *             .pricingCycle(&#34;Month&#34;)
 *             .bandwidthBillingType(&#34;CDT&#34;)
 *             .autoPay(true)
 *             .autoUseCoupon(&#34;true&#34;)
 *             .autoRenew(false)
 *             .autoRenewDuration(1)
 *             .build());
 * 
 *         var defaultBasicIpSet = new BasicIpSet(&#34;defaultBasicIpSet&#34;, BasicIpSetArgs.builder()        
 *             .acceleratorId(defaultBasicAccelerator.id())
 *             .accelerateRegionId(&#34;cn-hangzhou&#34;)
 *             .ispType(&#34;BGP&#34;)
 *             .bandwidth(&#34;5&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Global Accelerator (GA) Basic Ip Set can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ga/basicIpSet:BasicIpSet example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ga/basicIpSet:BasicIpSet")
public class BasicIpSet extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the acceleration region.
     * 
     */
    @Export(name="accelerateRegionId", type=String.class, parameters={})
    private Output<String> accelerateRegionId;

    /**
     * @return The ID of the acceleration region.
     * 
     */
    public Output<String> accelerateRegionId() {
        return this.accelerateRegionId;
    }
    /**
     * The ID of the basic GA instance.
     * 
     */
    @Export(name="acceleratorId", type=String.class, parameters={})
    private Output<String> acceleratorId;

    /**
     * @return The ID of the basic GA instance.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * The bandwidth of the acceleration region. Unit: Mbit/s.
     * 
     */
    @Export(name="bandwidth", type=Integer.class, parameters={})
    private Output<Integer> bandwidth;

    /**
     * @return The bandwidth of the acceleration region. Unit: Mbit/s.
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }
    /**
     * The line type of the elastic IP address (EIP) in the acceleration region. Default value: `BGP`. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`.
     * 
     */
    @Export(name="ispType", type=String.class, parameters={})
    private Output<String> ispType;

    /**
     * @return The line type of the elastic IP address (EIP) in the acceleration region. Default value: `BGP`. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`.
     * 
     */
    public Output<String> ispType() {
        return this.ispType;
    }
    /**
     * The status of the Basic Ip Set instance.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the Basic Ip Set instance.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BasicIpSet(String name) {
        this(name, BasicIpSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BasicIpSet(String name, BasicIpSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BasicIpSet(String name, BasicIpSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/basicIpSet:BasicIpSet", name, args == null ? BasicIpSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BasicIpSet(String name, Output<String> id, @Nullable BasicIpSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/basicIpSet:BasicIpSet", name, state, makeResourceOptions(options, id));
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
    public static BasicIpSet get(String name, Output<String> id, @Nullable BasicIpSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BasicIpSet(name, id, state, options);
    }
}
