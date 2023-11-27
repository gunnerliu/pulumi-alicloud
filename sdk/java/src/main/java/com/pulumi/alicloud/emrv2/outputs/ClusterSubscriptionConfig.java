// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emrv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterSubscriptionConfig {
    /**
     * @return Auto renew for prepaid, ’true’ or ‘false’ . Default value: false.
     * 
     */
    private @Nullable Boolean autoRenew;
    /**
     * @return If paymentType is Subscription, this should be specified. Supported value: 1、2、3、4、5、6、7、8、9、12、24、36、48.
     * 
     */
    private @Nullable Integer autoRenewDuration;
    /**
     * @return If paymentType is Subscription, this should be specified. Supported value: Month or Year.
     * 
     */
    private @Nullable String autoRenewDurationUnit;
    /**
     * @return If paymentType is Subscription, this should be specified. Supported value: 1、2、3、4、5、6、7、8、9、12、24、36、48.
     * 
     */
    private Integer paymentDuration;
    /**
     * @return If paymentType is Subscription, this should be specified. Supported value: Month or Year.
     * 
     */
    private String paymentDurationUnit;

    private ClusterSubscriptionConfig() {}
    /**
     * @return Auto renew for prepaid, ’true’ or ‘false’ . Default value: false.
     * 
     */
    public Optional<Boolean> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }
    /**
     * @return If paymentType is Subscription, this should be specified. Supported value: 1、2、3、4、5、6、7、8、9、12、24、36、48.
     * 
     */
    public Optional<Integer> autoRenewDuration() {
        return Optional.ofNullable(this.autoRenewDuration);
    }
    /**
     * @return If paymentType is Subscription, this should be specified. Supported value: Month or Year.
     * 
     */
    public Optional<String> autoRenewDurationUnit() {
        return Optional.ofNullable(this.autoRenewDurationUnit);
    }
    /**
     * @return If paymentType is Subscription, this should be specified. Supported value: 1、2、3、4、5、6、7、8、9、12、24、36、48.
     * 
     */
    public Integer paymentDuration() {
        return this.paymentDuration;
    }
    /**
     * @return If paymentType is Subscription, this should be specified. Supported value: Month or Year.
     * 
     */
    public String paymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSubscriptionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoRenew;
        private @Nullable Integer autoRenewDuration;
        private @Nullable String autoRenewDurationUnit;
        private Integer paymentDuration;
        private String paymentDurationUnit;
        public Builder() {}
        public Builder(ClusterSubscriptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRenew = defaults.autoRenew;
    	      this.autoRenewDuration = defaults.autoRenewDuration;
    	      this.autoRenewDurationUnit = defaults.autoRenewDurationUnit;
    	      this.paymentDuration = defaults.paymentDuration;
    	      this.paymentDurationUnit = defaults.paymentDurationUnit;
        }

        @CustomType.Setter
        public Builder autoRenew(@Nullable Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        @CustomType.Setter
        public Builder autoRenewDuration(@Nullable Integer autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }
        @CustomType.Setter
        public Builder autoRenewDurationUnit(@Nullable String autoRenewDurationUnit) {
            this.autoRenewDurationUnit = autoRenewDurationUnit;
            return this;
        }
        @CustomType.Setter
        public Builder paymentDuration(Integer paymentDuration) {
            this.paymentDuration = Objects.requireNonNull(paymentDuration);
            return this;
        }
        @CustomType.Setter
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.paymentDurationUnit = Objects.requireNonNull(paymentDurationUnit);
            return this;
        }
        public ClusterSubscriptionConfig build() {
            final var _resultValue = new ClusterSubscriptionConfig();
            _resultValue.autoRenew = autoRenew;
            _resultValue.autoRenewDuration = autoRenewDuration;
            _resultValue.autoRenewDurationUnit = autoRenewDurationUnit;
            _resultValue.paymentDuration = paymentDuration;
            _resultValue.paymentDurationUnit = paymentDurationUnit;
            return _resultValue;
        }
    }
}
