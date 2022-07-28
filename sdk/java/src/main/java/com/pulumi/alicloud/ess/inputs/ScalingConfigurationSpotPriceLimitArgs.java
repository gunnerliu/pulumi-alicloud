// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScalingConfigurationSpotPriceLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScalingConfigurationSpotPriceLimitArgs Empty = new ScalingConfigurationSpotPriceLimitArgs();

    /**
     * Resource type of an ECS instance.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return Resource type of an ECS instance.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    @Import(name="priceLimit")
    private @Nullable Output<Double> priceLimit;

    public Optional<Output<Double>> priceLimit() {
        return Optional.ofNullable(this.priceLimit);
    }

    private ScalingConfigurationSpotPriceLimitArgs() {}

    private ScalingConfigurationSpotPriceLimitArgs(ScalingConfigurationSpotPriceLimitArgs $) {
        this.instanceType = $.instanceType;
        this.priceLimit = $.priceLimit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalingConfigurationSpotPriceLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalingConfigurationSpotPriceLimitArgs $;

        public Builder() {
            $ = new ScalingConfigurationSpotPriceLimitArgs();
        }

        public Builder(ScalingConfigurationSpotPriceLimitArgs defaults) {
            $ = new ScalingConfigurationSpotPriceLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceType Resource type of an ECS instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType Resource type of an ECS instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder priceLimit(@Nullable Output<Double> priceLimit) {
            $.priceLimit = priceLimit;
            return this;
        }

        public Builder priceLimit(Double priceLimit) {
            return priceLimit(Output.of(priceLimit));
        }

        public ScalingConfigurationSpotPriceLimitArgs build() {
            return $;
        }
    }

}
