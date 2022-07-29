// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BandwidthPackageArgs extends com.pulumi.resources.ResourceArgs {

    public static final BandwidthPackageArgs Empty = new BandwidthPackageArgs();

    /**
     * The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
     * 
     */
    @Import(name="bandwidth", required=true)
    private Output<Integer> bandwidth;

    /**
     * @return The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }

    /**
     * The name of the bandwidth package. Defaults to null.
     * 
     */
    @Import(name="cenBandwidthPackageName")
    private @Nullable Output<String> cenBandwidthPackageName;

    /**
     * @return The name of the bandwidth package. Defaults to null.
     * 
     */
    public Optional<Output<String>> cenBandwidthPackageName() {
        return Optional.ofNullable(this.cenBandwidthPackageName);
    }

    /**
     * Field `charge_type` has been deprecated from version 1.97.0. Use `payment_type` and instead.
     * 
     * @deprecated
     * Field &#39;charge_type&#39; has been deprecated from version 1.98.0. Use &#39;payment_type&#39; and instead.
     * 
     */
    @Deprecated /* Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead. */
    @Import(name="chargeType")
    private @Nullable Output<String> chargeType;

    /**
     * @return Field `charge_type` has been deprecated from version 1.97.0. Use `payment_type` and instead.
     * 
     * @deprecated
     * Field &#39;charge_type&#39; has been deprecated from version 1.98.0. Use &#39;payment_type&#39; and instead.
     * 
     */
    @Deprecated /* Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead. */
    public Optional<Output<String>> chargeType() {
        return Optional.ofNullable(this.chargeType);
    }

    /**
     * The description of the bandwidth package. Default to null.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the bandwidth package. Default to null.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     * 
     */
    @Import(name="geographicRegionAId")
    private @Nullable Output<String> geographicRegionAId;

    /**
     * @return The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     * 
     */
    public Optional<Output<String>> geographicRegionAId() {
        return Optional.ofNullable(this.geographicRegionAId);
    }

    /**
     * The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     * 
     */
    @Import(name="geographicRegionBId")
    private @Nullable Output<String> geographicRegionBId;

    /**
     * @return The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
     * 
     */
    public Optional<Output<String>> geographicRegionBId() {
        return Optional.ofNullable(this.geographicRegionBId);
    }

    /**
     * Field `geographic_region_ids` has been deprecated from version 1.97.0. Use `geographic_region_a_id` and `geographic_region_b_id` instead.
     * 
     * @deprecated
     * Field &#39;geographic_region_ids&#39; has been deprecated from version 1.98.0. Use &#39;geographic_region_a_id&#39; and &#39;geographic_region_b_id&#39; instead.
     * 
     */
    @Deprecated /* Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead. */
    @Import(name="geographicRegionIds")
    private @Nullable Output<List<String>> geographicRegionIds;

    /**
     * @return Field `geographic_region_ids` has been deprecated from version 1.97.0. Use `geographic_region_a_id` and `geographic_region_b_id` instead.
     * 
     * @deprecated
     * Field &#39;geographic_region_ids&#39; has been deprecated from version 1.98.0. Use &#39;geographic_region_a_id&#39; and &#39;geographic_region_b_id&#39; instead.
     * 
     */
    @Deprecated /* Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead. */
    public Optional<Output<List<String>>> geographicRegionIds() {
        return Optional.ofNullable(this.geographicRegionIds);
    }

    /**
     * Field `name` has been deprecated from version 1.97.0. Use `cen_bandwidth_package_name` and instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from version 1.98.0. Use &#39;cen_bandwidth_package_name&#39; and instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Field `name` has been deprecated from version 1.97.0. Use `cen_bandwidth_package_name` and instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated from version 1.98.0. Use &#39;cen_bandwidth_package_name&#39; and instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PostPaid`. If set to PrePaid, the bandwidth package can&#39;t be deleted before expired time.
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PostPaid`. If set to PrePaid, the bandwidth package can&#39;t be deleted before expired time.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    @Import(name="period")
    private @Nullable Output<Integer> period;

    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    private BandwidthPackageArgs() {}

    private BandwidthPackageArgs(BandwidthPackageArgs $) {
        this.bandwidth = $.bandwidth;
        this.cenBandwidthPackageName = $.cenBandwidthPackageName;
        this.chargeType = $.chargeType;
        this.description = $.description;
        this.geographicRegionAId = $.geographicRegionAId;
        this.geographicRegionBId = $.geographicRegionBId;
        this.geographicRegionIds = $.geographicRegionIds;
        this.name = $.name;
        this.paymentType = $.paymentType;
        this.period = $.period;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BandwidthPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BandwidthPackageArgs $;

        public Builder() {
            $ = new BandwidthPackageArgs();
        }

        public Builder(BandwidthPackageArgs defaults) {
            $ = new BandwidthPackageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidth The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param cenBandwidthPackageName The name of the bandwidth package. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder cenBandwidthPackageName(@Nullable Output<String> cenBandwidthPackageName) {
            $.cenBandwidthPackageName = cenBandwidthPackageName;
            return this;
        }

        /**
         * @param cenBandwidthPackageName The name of the bandwidth package. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder cenBandwidthPackageName(String cenBandwidthPackageName) {
            return cenBandwidthPackageName(Output.of(cenBandwidthPackageName));
        }

        /**
         * @param chargeType Field `charge_type` has been deprecated from version 1.97.0. Use `payment_type` and instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;charge_type&#39; has been deprecated from version 1.98.0. Use &#39;payment_type&#39; and instead.
         * 
         */
        @Deprecated /* Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead. */
        public Builder chargeType(@Nullable Output<String> chargeType) {
            $.chargeType = chargeType;
            return this;
        }

        /**
         * @param chargeType Field `charge_type` has been deprecated from version 1.97.0. Use `payment_type` and instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;charge_type&#39; has been deprecated from version 1.98.0. Use &#39;payment_type&#39; and instead.
         * 
         */
        @Deprecated /* Field 'charge_type' has been deprecated from version 1.98.0. Use 'payment_type' and instead. */
        public Builder chargeType(String chargeType) {
            return chargeType(Output.of(chargeType));
        }

        /**
         * @param description The description of the bandwidth package. Default to null.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the bandwidth package. Default to null.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param geographicRegionAId The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
         * 
         * @return builder
         * 
         */
        public Builder geographicRegionAId(@Nullable Output<String> geographicRegionAId) {
            $.geographicRegionAId = geographicRegionAId;
            return this;
        }

        /**
         * @param geographicRegionAId The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
         * 
         * @return builder
         * 
         */
        public Builder geographicRegionAId(String geographicRegionAId) {
            return geographicRegionAId(Output.of(geographicRegionAId));
        }

        /**
         * @param geographicRegionBId The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
         * 
         * @return builder
         * 
         */
        public Builder geographicRegionBId(@Nullable Output<String> geographicRegionBId) {
            $.geographicRegionBId = geographicRegionBId;
            return this;
        }

        /**
         * @param geographicRegionBId The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
         * 
         * @return builder
         * 
         */
        public Builder geographicRegionBId(String geographicRegionBId) {
            return geographicRegionBId(Output.of(geographicRegionBId));
        }

        /**
         * @param geographicRegionIds Field `geographic_region_ids` has been deprecated from version 1.97.0. Use `geographic_region_a_id` and `geographic_region_b_id` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;geographic_region_ids&#39; has been deprecated from version 1.98.0. Use &#39;geographic_region_a_id&#39; and &#39;geographic_region_b_id&#39; instead.
         * 
         */
        @Deprecated /* Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead. */
        public Builder geographicRegionIds(@Nullable Output<List<String>> geographicRegionIds) {
            $.geographicRegionIds = geographicRegionIds;
            return this;
        }

        /**
         * @param geographicRegionIds Field `geographic_region_ids` has been deprecated from version 1.97.0. Use `geographic_region_a_id` and `geographic_region_b_id` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;geographic_region_ids&#39; has been deprecated from version 1.98.0. Use &#39;geographic_region_a_id&#39; and &#39;geographic_region_b_id&#39; instead.
         * 
         */
        @Deprecated /* Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead. */
        public Builder geographicRegionIds(List<String> geographicRegionIds) {
            return geographicRegionIds(Output.of(geographicRegionIds));
        }

        /**
         * @param geographicRegionIds Field `geographic_region_ids` has been deprecated from version 1.97.0. Use `geographic_region_a_id` and `geographic_region_b_id` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;geographic_region_ids&#39; has been deprecated from version 1.98.0. Use &#39;geographic_region_a_id&#39; and &#39;geographic_region_b_id&#39; instead.
         * 
         */
        @Deprecated /* Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead. */
        public Builder geographicRegionIds(String... geographicRegionIds) {
            return geographicRegionIds(List.of(geographicRegionIds));
        }

        /**
         * @param name Field `name` has been deprecated from version 1.97.0. Use `cen_bandwidth_package_name` and instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from version 1.98.0. Use &#39;cen_bandwidth_package_name&#39; and instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Field `name` has been deprecated from version 1.97.0. Use `cen_bandwidth_package_name` and instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated from version 1.98.0. Use &#39;cen_bandwidth_package_name&#39; and instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated from version 1.98.0. Use 'cen_bandwidth_package_name' and instead. */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param paymentType The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PostPaid`. If set to PrePaid, the bandwidth package can&#39;t be deleted before expired time.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PostPaid`. If set to PrePaid, the bandwidth package can&#39;t be deleted before expired time.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        public BandwidthPackageArgs build() {
            $.bandwidth = Objects.requireNonNull($.bandwidth, "expected parameter 'bandwidth' to be non-null");
            return $;
        }
    }

}
