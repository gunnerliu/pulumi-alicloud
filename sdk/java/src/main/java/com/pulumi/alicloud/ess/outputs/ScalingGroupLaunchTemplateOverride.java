// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScalingGroupLaunchTemplateOverride {
    /**
     * @return The instance type in launchTemplateOverride.
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return The maximum bid price of instance type in launchTemplateOverride.
     * 
     * &gt; **NOTE:** When detach loadbalancers, instances in group will be remove from loadbalancer&#39;s `Default Server Group`; On the contrary, When attach loadbalancers, instances in group will be added to loadbalancer&#39;s `Default Server Group`.
     * 
     * &gt; **NOTE:** When detach dbInstances, private ip of instances in group will be remove from dbInstance&#39;s `WhiteList`; On the contrary, When attach dbInstances, private ip of instances in group will be added to dbInstance&#39;s `WhiteList`.
     * 
     * &gt; **NOTE:** `on_demand_base_capacity`,`on_demand_percentage_above_base_capacity`,`spot_instance_pools`,`spot_instance_remedy` are valid only if `multi_az_policy` is &#39;COST_OPTIMIZED&#39;.
     * 
     */
    private @Nullable Double spotPriceLimit;
    /**
     * @return The weight of the instance type in launchTemplateOverride.
     * 
     */
    private @Nullable Integer weightedCapacity;

    private ScalingGroupLaunchTemplateOverride() {}
    /**
     * @return The instance type in launchTemplateOverride.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return The maximum bid price of instance type in launchTemplateOverride.
     * 
     * &gt; **NOTE:** When detach loadbalancers, instances in group will be remove from loadbalancer&#39;s `Default Server Group`; On the contrary, When attach loadbalancers, instances in group will be added to loadbalancer&#39;s `Default Server Group`.
     * 
     * &gt; **NOTE:** When detach dbInstances, private ip of instances in group will be remove from dbInstance&#39;s `WhiteList`; On the contrary, When attach dbInstances, private ip of instances in group will be added to dbInstance&#39;s `WhiteList`.
     * 
     * &gt; **NOTE:** `on_demand_base_capacity`,`on_demand_percentage_above_base_capacity`,`spot_instance_pools`,`spot_instance_remedy` are valid only if `multi_az_policy` is &#39;COST_OPTIMIZED&#39;.
     * 
     */
    public Optional<Double> spotPriceLimit() {
        return Optional.ofNullable(this.spotPriceLimit);
    }
    /**
     * @return The weight of the instance type in launchTemplateOverride.
     * 
     */
    public Optional<Integer> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingGroupLaunchTemplateOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String instanceType;
        private @Nullable Double spotPriceLimit;
        private @Nullable Integer weightedCapacity;
        public Builder() {}
        public Builder(ScalingGroupLaunchTemplateOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.spotPriceLimit = defaults.spotPriceLimit;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {

            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder spotPriceLimit(@Nullable Double spotPriceLimit) {

            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        @CustomType.Setter
        public Builder weightedCapacity(@Nullable Integer weightedCapacity) {

            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public ScalingGroupLaunchTemplateOverride build() {
            final var _resultValue = new ScalingGroupLaunchTemplateOverride();
            _resultValue.instanceType = instanceType;
            _resultValue.spotPriceLimit = spotPriceLimit;
            _resultValue.weightedCapacity = weightedCapacity;
            return _resultValue;
        }
    }
}
