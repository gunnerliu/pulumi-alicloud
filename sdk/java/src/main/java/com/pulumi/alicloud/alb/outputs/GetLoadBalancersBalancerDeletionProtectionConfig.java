// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersBalancerDeletionProtectionConfig {
    /**
     * @return Remove the Protection Status.
     * 
     */
    private Boolean enabled;
    /**
     * @return Deletion Protection Turn-on Time Use Greenwich Mean Time, in the Format of Yyyy-MM-ddTHH: mm:SSZ.
     * 
     */
    private String enabledTime;

    private GetLoadBalancersBalancerDeletionProtectionConfig() {}
    /**
     * @return Remove the Protection Status.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Deletion Protection Turn-on Time Use Greenwich Mean Time, in the Format of Yyyy-MM-ddTHH: mm:SSZ.
     * 
     */
    public String enabledTime() {
        return this.enabledTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersBalancerDeletionProtectionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String enabledTime;
        public Builder() {}
        public Builder(GetLoadBalancersBalancerDeletionProtectionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.enabledTime = defaults.enabledTime;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder enabledTime(String enabledTime) {
            this.enabledTime = Objects.requireNonNull(enabledTime);
            return this;
        }
        public GetLoadBalancersBalancerDeletionProtectionConfig build() {
            final var o = new GetLoadBalancersBalancerDeletionProtectionConfig();
            o.enabled = enabled;
            o.enabledTime = enabledTime;
            return o;
        }
    }
}
