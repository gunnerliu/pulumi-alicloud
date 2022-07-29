// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEcsDisksDiskOperationLock {
    private final String lockReason;

    @CustomType.Constructor
    private GetEcsDisksDiskOperationLock(@CustomType.Parameter("lockReason") String lockReason) {
        this.lockReason = lockReason;
    }

    public String lockReason() {
        return this.lockReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsDisksDiskOperationLock defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lockReason;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEcsDisksDiskOperationLock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lockReason = defaults.lockReason;
        }

        public Builder lockReason(String lockReason) {
            this.lockReason = Objects.requireNonNull(lockReason);
            return this;
        }        public GetEcsDisksDiskOperationLock build() {
            return new GetEcsDisksDiskOperationLock(lockReason);
        }
    }
}
