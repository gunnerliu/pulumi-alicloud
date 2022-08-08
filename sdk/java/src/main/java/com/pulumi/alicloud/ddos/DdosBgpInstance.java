// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ddos.DdosBgpInstanceArgs;
import com.pulumi.alicloud.ddos.inputs.DdosBgpInstanceState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Anti-DDoS Advanced instance resource. &#34;Ddosbgp&#34; is the short term of this product.
 * 
 * &gt; **NOTE:** The endpoint of bssopenapi used only support &#34;business.aliyuncs.com&#34; at present.
 * 
 * &gt; **NOTE:** Available in 1.57.0+ .
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
 * import com.pulumi.alicloud.ddos.DdosBgpInstance;
 * import com.pulumi.alicloud.ddos.DdosBgpInstanceArgs;
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
 *         var instance = new DdosBgpInstance(&#34;instance&#34;, DdosBgpInstanceArgs.builder()        
 *             .bandwidth(&#34;201&#34;)
 *             .baseBandwidth(&#34;20&#34;)
 *             .ipCount(&#34;100&#34;)
 *             .ipType(&#34;IPv4&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Ddosbgp instance can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ddos/ddosBgpInstance:DdosBgpInstance example ddosbgp-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:ddos/ddosBgpInstance:DdosBgpInstance")
public class DdosBgpInstance extends com.pulumi.resources.CustomResource {
    /**
     * Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 51,91,101,201,301. The unit is Gbps.
     * 
     */
    @Export(name="bandwidth", type=Integer.class, parameters={})
    private Output<Integer> bandwidth;

    /**
     * @return Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 51,91,101,201,301. The unit is Gbps.
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }
    /**
     * Base defend bandwidth of the instance. Valid values: 20. The unit is Gbps. Default to `20`.
     * 
     */
    @Export(name="baseBandwidth", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> baseBandwidth;

    /**
     * @return Base defend bandwidth of the instance. Valid values: 20. The unit is Gbps. Default to `20`.
     * 
     */
    public Output<Optional<Integer>> baseBandwidth() {
        return Codegen.optional(this.baseBandwidth);
    }
    /**
     * IP count of the instance. Valid values: 100.
     * 
     */
    @Export(name="ipCount", type=Integer.class, parameters={})
    private Output<Integer> ipCount;

    /**
     * @return IP count of the instance. Valid values: 100.
     * 
     */
    public Output<Integer> ipCount() {
        return this.ipCount;
    }
    /**
     * IP version of the instance. Valid values: IPv4,IPv6.
     * 
     */
    @Export(name="ipType", type=String.class, parameters={})
    private Output<String> ipType;

    /**
     * @return IP version of the instance. Valid values: IPv4,IPv6.
     * 
     */
    public Output<String> ipType() {
        return this.ipType;
    }
    /**
     * Name of the instance. This name can have a string of 1 to 63 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the instance. This name can have a string of 1 to 63 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The duration that you will buy Ddosbgp instance (in month). Valid values: [1~9], 12, 24, 36. Default to 12. At present, the provider does not support modify &#34;period&#34;.
     * 
     */
    @Export(name="period", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> period;

    /**
     * @return The duration that you will buy Ddosbgp instance (in month). Valid values: [1~9], 12, 24, 36. Default to 12. At present, the provider does not support modify &#34;period&#34;.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * Type of the instance. Valid values: Enterprise,Professional. Default to `Enterprise`
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Type of the instance. Valid values: Enterprise,Professional. Default to `Enterprise`
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DdosBgpInstance(String name) {
        this(name, DdosBgpInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DdosBgpInstance(String name, DdosBgpInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DdosBgpInstance(String name, DdosBgpInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ddos/ddosBgpInstance:DdosBgpInstance", name, args == null ? DdosBgpInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DdosBgpInstance(String name, Output<String> id, @Nullable DdosBgpInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ddos/ddosBgpInstance:DdosBgpInstance", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("alicloud:dns/ddosBgpInstance:DdosBgpInstance").build())
            ))
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
    public static DdosBgpInstance get(String name, Output<String> id, @Nullable DdosBgpInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DdosBgpInstance(name, id, state, options);
    }
}
