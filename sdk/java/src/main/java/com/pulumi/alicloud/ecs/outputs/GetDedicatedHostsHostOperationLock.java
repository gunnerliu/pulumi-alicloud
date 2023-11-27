// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDedicatedHostsHostOperationLock {
    /**
     * @return The reason why the dedicated host resource is locked.
     * 
     */
    private String lockReason;

    private GetDedicatedHostsHostOperationLock() {}
    /**
     * @return The reason why the dedicated host resource is locked.
     * 
     */
    public String lockReason() {
        return this.lockReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedHostsHostOperationLock defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String lockReason;
        public Builder() {}
        public Builder(GetDedicatedHostsHostOperationLock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lockReason = defaults.lockReason;
        }

        @CustomType.Setter
        public Builder lockReason(String lockReason) {
            this.lockReason = Objects.requireNonNull(lockReason);
            return this;
        }
        public GetDedicatedHostsHostOperationLock build() {
            final var _resultValue = new GetDedicatedHostsHostOperationLock();
            _resultValue.lockReason = lockReason;
            return _resultValue;
        }
    }
}
