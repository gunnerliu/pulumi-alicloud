// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AcceleratorState extends com.pulumi.resources.ResourceArgs {

    public static final AcceleratorState Empty = new AcceleratorState();

    /**
     * The Name of the GA instance.
     * 
     */
    @Import(name="acceleratorName")
    private @Nullable Output<String> acceleratorName;

    /**
     * @return The Name of the GA instance.
     * 
     */
    public Optional<Output<String>> acceleratorName() {
        return Optional.ofNullable(this.acceleratorName);
    }

    /**
     * Auto renewal period of an instance, in the unit of month. The value range is 1-12.
     * 
     */
    @Import(name="autoRenewDuration")
    private @Nullable Output<Integer> autoRenewDuration;

    /**
     * @return Auto renewal period of an instance, in the unit of month. The value range is 1-12.
     * 
     */
    public Optional<Output<Integer>> autoRenewDuration() {
        return Optional.ofNullable(this.autoRenewDuration);
    }

    /**
     * Use coupons to pay bills automatically. Default value is `false`. Valid value: `true`: Use, `false`: Not used.
     * 
     */
    @Import(name="autoUseCoupon")
    private @Nullable Output<Boolean> autoUseCoupon;

    /**
     * @return Use coupons to pay bills automatically. Default value is `false`. Valid value: `true`: Use, `false`: Not used.
     * 
     */
    public Optional<Output<Boolean>> autoUseCoupon() {
        return Optional.ofNullable(this.autoUseCoupon);
    }

    /**
     * Descriptive information of the global acceleration instance.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Descriptive information of the global acceleration instance.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The subscription duration. **NOTE:** Starting from v1.150.0+, the `duration` and  `pricing_cycle` are both required.
     * * If the `pricing_cycle` parameter is set to `Month`, the valid values for the `duration` parameter are 1 to 9.
     * * If the `pricing_cycle` parameter is set to `Year`, the valid values for the `duration` parameter are 1 to 3.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<Integer> duration;

    /**
     * @return The subscription duration. **NOTE:** Starting from v1.150.0+, the `duration` and  `pricing_cycle` are both required.
     * * If the `pricing_cycle` parameter is set to `Month`, the valid values for the `duration` parameter are 1 to 9.
     * * If the `pricing_cycle` parameter is set to `Year`, the valid values for the `duration` parameter are 1 to 3.
     * 
     */
    public Optional<Output<Integer>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * The billing cycle of the GA instance. Valid values: `Month`,`Year`. The default value: `Month`.
     * 
     */
    @Import(name="pricingCycle")
    private @Nullable Output<String> pricingCycle;

    /**
     * @return The billing cycle of the GA instance. Valid values: `Month`,`Year`. The default value: `Month`.
     * 
     */
    public Optional<Output<String>> pricingCycle() {
        return Optional.ofNullable(this.pricingCycle);
    }

    /**
     * Whether to renew an accelerator automatically or not. Default to &#34;Normal&#34;. Valid values:
     * 
     */
    @Import(name="renewalStatus")
    private @Nullable Output<String> renewalStatus;

    /**
     * @return Whether to renew an accelerator automatically or not. Default to &#34;Normal&#34;. Valid values:
     * 
     */
    public Optional<Output<String>> renewalStatus() {
        return Optional.ofNullable(this.renewalStatus);
    }

    /**
     * The instance type of the GA instance. Specification of global acceleration instance, value:
     * `1`: Small 1.
     * `2`: Small 2.
     * `3`: Small 3.
     * `5`: Medium 1.
     * `8`: Medium 2.
     * `10`: Medium 3.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<String> spec;

    /**
     * @return The instance type of the GA instance. Specification of global acceleration instance, value:
     * `1`: Small 1.
     * `2`: Small 2.
     * `3`: Small 3.
     * `5`: Medium 1.
     * `8`: Medium 2.
     * `10`: Medium 3.
     * 
     */
    public Optional<Output<String>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * The status of the GA instance.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the GA instance.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private AcceleratorState() {}

    private AcceleratorState(AcceleratorState $) {
        this.acceleratorName = $.acceleratorName;
        this.autoRenewDuration = $.autoRenewDuration;
        this.autoUseCoupon = $.autoUseCoupon;
        this.description = $.description;
        this.duration = $.duration;
        this.pricingCycle = $.pricingCycle;
        this.renewalStatus = $.renewalStatus;
        this.spec = $.spec;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AcceleratorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AcceleratorState $;

        public Builder() {
            $ = new AcceleratorState();
        }

        public Builder(AcceleratorState defaults) {
            $ = new AcceleratorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorName The Name of the GA instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorName(@Nullable Output<String> acceleratorName) {
            $.acceleratorName = acceleratorName;
            return this;
        }

        /**
         * @param acceleratorName The Name of the GA instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorName(String acceleratorName) {
            return acceleratorName(Output.of(acceleratorName));
        }

        /**
         * @param autoRenewDuration Auto renewal period of an instance, in the unit of month. The value range is 1-12.
         * 
         * @return builder
         * 
         */
        public Builder autoRenewDuration(@Nullable Output<Integer> autoRenewDuration) {
            $.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * @param autoRenewDuration Auto renewal period of an instance, in the unit of month. The value range is 1-12.
         * 
         * @return builder
         * 
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            return autoRenewDuration(Output.of(autoRenewDuration));
        }

        /**
         * @param autoUseCoupon Use coupons to pay bills automatically. Default value is `false`. Valid value: `true`: Use, `false`: Not used.
         * 
         * @return builder
         * 
         */
        public Builder autoUseCoupon(@Nullable Output<Boolean> autoUseCoupon) {
            $.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * @param autoUseCoupon Use coupons to pay bills automatically. Default value is `false`. Valid value: `true`: Use, `false`: Not used.
         * 
         * @return builder
         * 
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            return autoUseCoupon(Output.of(autoUseCoupon));
        }

        /**
         * @param description Descriptive information of the global acceleration instance.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Descriptive information of the global acceleration instance.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param duration The subscription duration. **NOTE:** Starting from v1.150.0+, the `duration` and  `pricing_cycle` are both required.
         * * If the `pricing_cycle` parameter is set to `Month`, the valid values for the `duration` parameter are 1 to 9.
         * * If the `pricing_cycle` parameter is set to `Year`, the valid values for the `duration` parameter are 1 to 3.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<Integer> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The subscription duration. **NOTE:** Starting from v1.150.0+, the `duration` and  `pricing_cycle` are both required.
         * * If the `pricing_cycle` parameter is set to `Month`, the valid values for the `duration` parameter are 1 to 9.
         * * If the `pricing_cycle` parameter is set to `Year`, the valid values for the `duration` parameter are 1 to 3.
         * 
         * @return builder
         * 
         */
        public Builder duration(Integer duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param pricingCycle The billing cycle of the GA instance. Valid values: `Month`,`Year`. The default value: `Month`.
         * 
         * @return builder
         * 
         */
        public Builder pricingCycle(@Nullable Output<String> pricingCycle) {
            $.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * @param pricingCycle The billing cycle of the GA instance. Valid values: `Month`,`Year`. The default value: `Month`.
         * 
         * @return builder
         * 
         */
        public Builder pricingCycle(String pricingCycle) {
            return pricingCycle(Output.of(pricingCycle));
        }

        /**
         * @param renewalStatus Whether to renew an accelerator automatically or not. Default to &#34;Normal&#34;. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder renewalStatus(@Nullable Output<String> renewalStatus) {
            $.renewalStatus = renewalStatus;
            return this;
        }

        /**
         * @param renewalStatus Whether to renew an accelerator automatically or not. Default to &#34;Normal&#34;. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder renewalStatus(String renewalStatus) {
            return renewalStatus(Output.of(renewalStatus));
        }

        /**
         * @param spec The instance type of the GA instance. Specification of global acceleration instance, value:
         * `1`: Small 1.
         * `2`: Small 2.
         * `3`: Small 3.
         * `5`: Medium 1.
         * `8`: Medium 2.
         * `10`: Medium 3.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<String> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec The instance type of the GA instance. Specification of global acceleration instance, value:
         * `1`: Small 1.
         * `2`: Small 2.
         * `3`: Small 3.
         * `5`: Medium 1.
         * `8`: Medium 2.
         * `10`: Medium 3.
         * 
         * @return builder
         * 
         */
        public Builder spec(String spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param status The status of the GA instance.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the GA instance.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public AcceleratorState build() {
            return $;
        }
    }

}
