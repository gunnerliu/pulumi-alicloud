// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DdosCooInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DdosCooInstanceArgs Empty = new DdosCooInstanceArgs();

    /**
     * Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
     * 
     */
    @Import(name="bandwidth", required=true)
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
    @Import(name="baseBandwidth", required=true)
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
    @Import(name="domainCount", required=true)
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
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the instance. This name can have a string of 1 to 63 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify &#34;period&#34;.
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify &#34;period&#34;.
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    @Import(name="portCount", required=true)
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
    @Import(name="productType")
    private @Nullable Output<String> productType;

    /**
     * @return The product type for purchasing DDOSCOO instances used to differ different account type. Valid values:
     * - ddoscoo: Only supports domestic account.
     * - ddoscoo_intl: Only supports to international account.
     *   Default to ddoscoo.
     * 
     */
    public Optional<Output<String>> productType() {
        return Optional.ofNullable(this.productType);
    }

    /**
     * Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
     * 
     */
    @Import(name="serviceBandwidth", required=true)
    private Output<String> serviceBandwidth;

    /**
     * @return Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
     * 
     */
    public Output<String> serviceBandwidth() {
        return this.serviceBandwidth;
    }

    private DdosCooInstanceArgs() {}

    private DdosCooInstanceArgs(DdosCooInstanceArgs $) {
        this.bandwidth = $.bandwidth;
        this.baseBandwidth = $.baseBandwidth;
        this.domainCount = $.domainCount;
        this.name = $.name;
        this.period = $.period;
        this.portCount = $.portCount;
        this.productType = $.productType;
        this.serviceBandwidth = $.serviceBandwidth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DdosCooInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DdosCooInstanceArgs $;

        public Builder() {
            $ = new DdosCooInstanceArgs();
        }

        public Builder(DdosCooInstanceArgs defaults) {
            $ = new DdosCooInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidth Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Output<String> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(String bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param baseBandwidth Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder baseBandwidth(Output<String> baseBandwidth) {
            $.baseBandwidth = baseBandwidth;
            return this;
        }

        /**
         * @param baseBandwidth Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder baseBandwidth(String baseBandwidth) {
            return baseBandwidth(Output.of(baseBandwidth));
        }

        /**
         * @param domainCount Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder domainCount(Output<String> domainCount) {
            $.domainCount = domainCount;
            return this;
        }

        /**
         * @param domainCount Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder domainCount(String domainCount) {
            return domainCount(Output.of(domainCount));
        }

        /**
         * @param name Name of the instance. This name can have a string of 1 to 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the instance. This name can have a string of 1 to 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param period The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify &#34;period&#34;.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify &#34;period&#34;.
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param portCount Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder portCount(Output<String> portCount) {
            $.portCount = portCount;
            return this;
        }

        /**
         * @param portCount Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder portCount(String portCount) {
            return portCount(Output.of(portCount));
        }

        /**
         * @param productType The product type for purchasing DDOSCOO instances used to differ different account type. Valid values:
         * - ddoscoo: Only supports domestic account.
         * - ddoscoo_intl: Only supports to international account.
         *   Default to ddoscoo.
         * 
         * @return builder
         * 
         */
        public Builder productType(@Nullable Output<String> productType) {
            $.productType = productType;
            return this;
        }

        /**
         * @param productType The product type for purchasing DDOSCOO instances used to differ different account type. Valid values:
         * - ddoscoo: Only supports domestic account.
         * - ddoscoo_intl: Only supports to international account.
         *   Default to ddoscoo.
         * 
         * @return builder
         * 
         */
        public Builder productType(String productType) {
            return productType(Output.of(productType));
        }

        /**
         * @param serviceBandwidth Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder serviceBandwidth(Output<String> serviceBandwidth) {
            $.serviceBandwidth = serviceBandwidth;
            return this;
        }

        /**
         * @param serviceBandwidth Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder serviceBandwidth(String serviceBandwidth) {
            return serviceBandwidth(Output.of(serviceBandwidth));
        }

        public DdosCooInstanceArgs build() {
            $.bandwidth = Objects.requireNonNull($.bandwidth, "expected parameter 'bandwidth' to be non-null");
            $.baseBandwidth = Objects.requireNonNull($.baseBandwidth, "expected parameter 'baseBandwidth' to be non-null");
            $.domainCount = Objects.requireNonNull($.domainCount, "expected parameter 'domainCount' to be non-null");
            $.portCount = Objects.requireNonNull($.portCount, "expected parameter 'portCount' to be non-null");
            $.serviceBandwidth = Objects.requireNonNull($.serviceBandwidth, "expected parameter 'serviceBandwidth' to be non-null");
            return $;
        }
    }

}