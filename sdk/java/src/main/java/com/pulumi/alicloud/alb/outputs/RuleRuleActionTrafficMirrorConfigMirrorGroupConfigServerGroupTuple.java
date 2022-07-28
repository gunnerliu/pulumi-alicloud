// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple {
    /**
     * @return The ID of the destination server group to which requests are forwarded.
     * 
     */
    private final @Nullable String serverGroupId;

    @CustomType.Constructor
    private RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple(@CustomType.Parameter("serverGroupId") @Nullable String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    /**
     * @return The ID of the destination server group to which requests are forwarded.
     * 
     */
    public Optional<String> serverGroupId() {
        return Optional.ofNullable(this.serverGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String serverGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverGroupId = defaults.serverGroupId;
        }

        public Builder serverGroupId(@Nullable String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }        public RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple build() {
            return new RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple(serverGroupId);
        }
    }
}
