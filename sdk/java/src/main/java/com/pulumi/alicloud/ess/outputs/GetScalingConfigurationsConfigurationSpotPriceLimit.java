// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScalingConfigurationsConfigurationSpotPriceLimit {
    /**
     * @return Resource type of an ECS instance.
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return Price limit hourly of instance type.
     * 
     */
    private @Nullable Double priceLimit;

    private GetScalingConfigurationsConfigurationSpotPriceLimit() {}
    /**
     * @return Resource type of an ECS instance.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return Price limit hourly of instance type.
     * 
     */
    public Optional<Double> priceLimit() {
        return Optional.ofNullable(this.priceLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScalingConfigurationsConfigurationSpotPriceLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String instanceType;
        private @Nullable Double priceLimit;
        public Builder() {}
        public Builder(GetScalingConfigurationsConfigurationSpotPriceLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.priceLimit = defaults.priceLimit;
        }

        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder priceLimit(@Nullable Double priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public GetScalingConfigurationsConfigurationSpotPriceLimit build() {
            final var o = new GetScalingConfigurationsConfigurationSpotPriceLimit();
            o.instanceType = instanceType;
            o.priceLimit = priceLimit;
            return o;
        }
    }
}