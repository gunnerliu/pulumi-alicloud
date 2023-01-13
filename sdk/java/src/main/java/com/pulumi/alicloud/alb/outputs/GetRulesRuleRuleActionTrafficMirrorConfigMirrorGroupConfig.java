// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.alicloud.alb.outputs.GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig {
    /**
     * @return The destination server group to which requests are forwarded.
     * 
     */
    private List<GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple> serverGroupTuples;

    private GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig() {}
    /**
     * @return The destination server group to which requests are forwarded.
     * 
     */
    public List<GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple> serverGroupTuples() {
        return this.serverGroupTuples;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple> serverGroupTuples;
        public Builder() {}
        public Builder(GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverGroupTuples = defaults.serverGroupTuples;
        }

        @CustomType.Setter
        public Builder serverGroupTuples(List<GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple> serverGroupTuples) {
            this.serverGroupTuples = Objects.requireNonNull(serverGroupTuples);
            return this;
        }
        public Builder serverGroupTuples(GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple... serverGroupTuples) {
            return serverGroupTuples(List.of(serverGroupTuples));
        }
        public GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig build() {
            final var o = new GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig();
            o.serverGroupTuples = serverGroupTuples;
            return o;
        }
    }
}
