// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ddos.DdosCooInstanceArgs;
import com.pulumi.alicloud.ddos.inputs.DdosCooInstanceState;
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
 * BGP-Line Anti-DDoS instance resource. &#34;Ddoscoo&#34; is the short term of this product. See [What is Anti-DDoS Pro](https://www.alibabacloud.com/help/doc-detail/69319.htm).
 * 
 * &gt; **NOTE:** The product region only support cn-hangzhou.
 * 
 * &gt; **NOTE:** The endpoint of bssopenapi used only support &#34;business.aliyuncs.com&#34; at present.
 * 
 * &gt; **NOTE:** Available in 1.37.0+ .
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Ddoscoo instance can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ddos/ddosCooInstance:DdosCooInstance example ddoscoo-cn-123456
 * ```
 * 
 */
@ResourceType(type="alicloud:ddos/ddosCooInstance:DdosCooInstance")
public class DdosCooInstance extends com.pulumi.resources.CustomResource {
    /**
     * Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
     * 
     */
    @Export(name="bandwidth", type=String.class, parameters={})
    private Output<String> bandwidth;

    /**
     * @return Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
     * 
     */
    public Output<String> bandwidth() {
        return this.bandwidth;
    }
    /**
     * Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
     * 
     */
    @Export(name="baseBandwidth", type=String.class, parameters={})
    private Output<String> baseBandwidth;

    /**
     * @return Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
     * 
     */
    public Output<String> baseBandwidth() {
        return this.baseBandwidth;
    }
    /**
     * Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    @Export(name="domainCount", type=String.class, parameters={})
    private Output<String> domainCount;

    /**
     * @return Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    public Output<String> domainCount() {
        return this.domainCount;
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
     * The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify &#34;period&#34;.
     * 
     */
    @Export(name="period", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> period;

    /**
     * @return The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify &#34;period&#34;.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    @Export(name="portCount", type=String.class, parameters={})
    private Output<String> portCount;

    /**
     * @return Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    public Output<String> portCount() {
        return this.portCount;
    }
    /**
     * The product type for purchasing DDOSCOO instances used to differ different account type. Valid values:
     * - ddoscoo: Only supports domestic account.
     * - ddoscoo_intl: Only supports to international account.
     *   Default to ddoscoo.
     * 
     */
    @Export(name="productType", type=String.class, parameters={})
    private Output</* @Nullable */ String> productType;

    /**
     * @return The product type for purchasing DDOSCOO instances used to differ different account type. Valid values:
     * - ddoscoo: Only supports domestic account.
     * - ddoscoo_intl: Only supports to international account.
     *   Default to ddoscoo.
     * 
     */
    public Output<Optional<String>> productType() {
        return Codegen.optional(this.productType);
    }
    /**
     * Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
     * 
     */
    @Export(name="serviceBandwidth", type=String.class, parameters={})
    private Output<String> serviceBandwidth;

    /**
     * @return Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
     * 
     */
    public Output<String> serviceBandwidth() {
        return this.serviceBandwidth;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DdosCooInstance(String name) {
        this(name, DdosCooInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DdosCooInstance(String name, DdosCooInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DdosCooInstance(String name, DdosCooInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ddos/ddosCooInstance:DdosCooInstance", name, args == null ? DdosCooInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DdosCooInstance(String name, Output<String> id, @Nullable DdosCooInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ddos/ddosCooInstance:DdosCooInstance", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("alicloud:dns/ddosCooInstance:DdosCooInstance").build())
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
    public static DdosCooInstance get(String name, Output<String> id, @Nullable DdosCooInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DdosCooInstance(name, id, state, options);
    }
}
