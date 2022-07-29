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
public final class ScalingConfigurationSpotPriceLimit {
    /**
     * @return Resource type of an ECS instance.
     * 
     */
    private final @Nullable String instanceType;
    private final @Nullable Double priceLimit;

    @CustomType.Constructor
    private ScalingConfigurationSpotPriceLimit(
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("priceLimit") @Nullable Double priceLimit) {
        this.instanceType = instanceType;
        this.priceLimit = priceLimit;
    }

    /**
     * @return Resource type of an ECS instance.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    public Optional<Double> priceLimit() {
        return Optional.ofNullable(this.priceLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingConfigurationSpotPriceLimit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instanceType;
        private @Nullable Double priceLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingConfigurationSpotPriceLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.priceLimit = defaults.priceLimit;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder priceLimit(@Nullable Double priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }        public ScalingConfigurationSpotPriceLimit build() {
            return new ScalingConfigurationSpotPriceLimit(instanceType, priceLimit);
        }
    }
}
