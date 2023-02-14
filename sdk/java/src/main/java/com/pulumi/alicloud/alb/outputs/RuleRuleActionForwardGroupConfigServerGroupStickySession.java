// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleRuleActionForwardGroupConfigServerGroupStickySession {
    /**
     * @return Whether to enable session persistence.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The timeout period. Unit: seconds. Valid values: `1` to `86400`. Default value: `1000`.
     * 
     */
    private @Nullable Integer timeout;

    private RuleRuleActionForwardGroupConfigServerGroupStickySession() {}
    /**
     * @return Whether to enable session persistence.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The timeout period. Unit: seconds. Valid values: `1` to `86400`. Default value: `1000`.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleRuleActionForwardGroupConfigServerGroupStickySession defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer timeout;
        public Builder() {}
        public Builder(RuleRuleActionForwardGroupConfigServerGroupStickySession defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public RuleRuleActionForwardGroupConfigServerGroupStickySession build() {
            final var o = new RuleRuleActionForwardGroupConfigServerGroupStickySession();
            o.enabled = enabled;
            o.timeout = timeout;
            return o;
        }
    }
}