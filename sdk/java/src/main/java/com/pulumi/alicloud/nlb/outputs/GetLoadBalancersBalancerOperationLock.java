// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersBalancerOperationLock {
    /**
     * @return The reason why the NLB instance is locked.
     * 
     */
    private String lockReason;
    /**
     * @return The type of lock.
     * 
     */
    private String lockType;

    private GetLoadBalancersBalancerOperationLock() {}
    /**
     * @return The reason why the NLB instance is locked.
     * 
     */
    public String lockReason() {
        return this.lockReason;
    }
    /**
     * @return The type of lock.
     * 
     */
    public String lockType() {
        return this.lockType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersBalancerOperationLock defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String lockReason;
        private String lockType;
        public Builder() {}
        public Builder(GetLoadBalancersBalancerOperationLock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lockReason = defaults.lockReason;
    	      this.lockType = defaults.lockType;
        }

        @CustomType.Setter
        public Builder lockReason(String lockReason) {
            this.lockReason = Objects.requireNonNull(lockReason);
            return this;
        }
        @CustomType.Setter
        public Builder lockType(String lockType) {
            this.lockType = Objects.requireNonNull(lockType);
            return this;
        }
        public GetLoadBalancersBalancerOperationLock build() {
            final var _resultValue = new GetLoadBalancersBalancerOperationLock();
            _resultValue.lockReason = lockReason;
            _resultValue.lockType = lockType;
            return _resultValue;
        }
    }
}
