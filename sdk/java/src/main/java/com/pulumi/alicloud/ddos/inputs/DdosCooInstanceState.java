// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DdosCooInstanceState extends com.pulumi.resources.ResourceArgs {

    public static final DdosCooInstanceState Empty = new DdosCooInstanceState();

    /**
     * The IP version of the IP address. Default value: `Ipv4`. Valid values: `Ipv4`, `Ipv6`.
     * 
     */
    @Import(name="addressType")
    private @Nullable Output<String> addressType;

    /**
     * @return The IP version of the IP address. Default value: `Ipv4`. Valid values: `Ipv4`, `Ipv6`.
     * 
     */
    public Optional<Output<String>> addressType() {
        return Optional.ofNullable(this.addressType);
    }

    /**
     * Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<String> bandwidth;

    /**
     * @return Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
     * 
     */
    public Optional<Output<String>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * The mitigation plan of the instance. Valid values:
     * 
     */
    @Import(name="bandwidthMode")
    private @Nullable Output<String> bandwidthMode;

    /**
     * @return The mitigation plan of the instance. Valid values:
     * 
     */
    public Optional<Output<String>> bandwidthMode() {
        return Optional.ofNullable(this.bandwidthMode);
    }

    /**
     * Base defend bandwidth of the instance. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade.
     * 
     */
    @Import(name="baseBandwidth")
    private @Nullable Output<String> baseBandwidth;

    /**
     * @return Base defend bandwidth of the instance. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade.
     * 
     */
    public Optional<Output<String>> baseBandwidth() {
        return Optional.ofNullable(this.baseBandwidth);
    }

    /**
     * Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    @Import(name="domainCount")
    private @Nullable Output<String> domainCount;

    /**
     * @return Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    public Optional<Output<String>> domainCount() {
        return Optional.ofNullable(this.domainCount);
    }

    /**
     * The mitigation plan of the instance. Default value: `coop`. Valid values:
     * 
     */
    @Import(name="editionSale")
    private @Nullable Output<String> editionSale;

    /**
     * @return The mitigation plan of the instance. Default value: `coop`. Valid values:
     * 
     */
    public Optional<Output<String>> editionSale() {
        return Optional.ofNullable(this.editionSale);
    }

    /**
     * (Available since v1.212.0) The IP address of the instance.
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return (Available since v1.212.0) The IP address of the instance.
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
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
     * The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], `12`, `24`, `36`. Default value: `1`. At present, the provider does not support modify `period`.
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], `12`, `24`, `36`. Default value: `1`. At present, the provider does not support modify `period`.
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    @Import(name="portCount")
    private @Nullable Output<String> portCount;

    /**
     * @return Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    public Optional<Output<String>> portCount() {
        return Optional.ofNullable(this.portCount);
    }

    /**
     * The product type for purchasing DDOSCOO instances used to differ different account type. Default value: `ddoscoo`. Valid values:
     * 
     */
    @Import(name="productType")
    private @Nullable Output<String> productType;

    /**
     * @return The product type for purchasing DDOSCOO instances used to differ different account type. Default value: `ddoscoo`. Valid values:
     * 
     */
    public Optional<Output<String>> productType() {
        return Optional.ofNullable(this.productType);
    }

    /**
     * Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
     * 
     */
    @Import(name="serviceBandwidth")
    private @Nullable Output<String> serviceBandwidth;

    /**
     * @return Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
     * 
     */
    public Optional<Output<String>> serviceBandwidth() {
        return Optional.ofNullable(this.serviceBandwidth);
    }

    private DdosCooInstanceState() {}

    private DdosCooInstanceState(DdosCooInstanceState $) {
        this.addressType = $.addressType;
        this.bandwidth = $.bandwidth;
        this.bandwidthMode = $.bandwidthMode;
        this.baseBandwidth = $.baseBandwidth;
        this.domainCount = $.domainCount;
        this.editionSale = $.editionSale;
        this.ip = $.ip;
        this.name = $.name;
        this.period = $.period;
        this.portCount = $.portCount;
        this.productType = $.productType;
        this.serviceBandwidth = $.serviceBandwidth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DdosCooInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DdosCooInstanceState $;

        public Builder() {
            $ = new DdosCooInstanceState();
        }

        public Builder(DdosCooInstanceState defaults) {
            $ = new DdosCooInstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressType The IP version of the IP address. Default value: `Ipv4`. Valid values: `Ipv4`, `Ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder addressType(@Nullable Output<String> addressType) {
            $.addressType = addressType;
            return this;
        }

        /**
         * @param addressType The IP version of the IP address. Default value: `Ipv4`. Valid values: `Ipv4`, `Ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder addressType(String addressType) {
            return addressType(Output.of(addressType));
        }

        /**
         * @param bandwidth Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<String> bandwidth) {
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
         * @param bandwidthMode The mitigation plan of the instance. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder bandwidthMode(@Nullable Output<String> bandwidthMode) {
            $.bandwidthMode = bandwidthMode;
            return this;
        }

        /**
         * @param bandwidthMode The mitigation plan of the instance. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder bandwidthMode(String bandwidthMode) {
            return bandwidthMode(Output.of(bandwidthMode));
        }

        /**
         * @param baseBandwidth Base defend bandwidth of the instance. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder baseBandwidth(@Nullable Output<String> baseBandwidth) {
            $.baseBandwidth = baseBandwidth;
            return this;
        }

        /**
         * @param baseBandwidth Base defend bandwidth of the instance. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade.
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
        public Builder domainCount(@Nullable Output<String> domainCount) {
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
         * @param editionSale The mitigation plan of the instance. Default value: `coop`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder editionSale(@Nullable Output<String> editionSale) {
            $.editionSale = editionSale;
            return this;
        }

        /**
         * @param editionSale The mitigation plan of the instance. Default value: `coop`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder editionSale(String editionSale) {
            return editionSale(Output.of(editionSale));
        }

        /**
         * @param ip (Available since v1.212.0) The IP address of the instance.
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip (Available since v1.212.0) The IP address of the instance.
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
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
         * @param period The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], `12`, `24`, `36`. Default value: `1`. At present, the provider does not support modify `period`.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], `12`, `24`, `36`. Default value: `1`. At present, the provider does not support modify `period`.
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
        public Builder portCount(@Nullable Output<String> portCount) {
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
         * @param productType The product type for purchasing DDOSCOO instances used to differ different account type. Default value: `ddoscoo`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder productType(@Nullable Output<String> productType) {
            $.productType = productType;
            return this;
        }

        /**
         * @param productType The product type for purchasing DDOSCOO instances used to differ different account type. Default value: `ddoscoo`. Valid values:
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
        public Builder serviceBandwidth(@Nullable Output<String> serviceBandwidth) {
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

        public DdosCooInstanceState build() {
            return $;
        }
    }

}
