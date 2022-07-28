// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.alicloud.ga.outputs.GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig {
    private final List<GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples;

    @CustomType.Constructor
    private GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig(@CustomType.Parameter("serverGroupTuples") List<GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples) {
        this.serverGroupTuples = serverGroupTuples;
    }

    public List<GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples() {
        return this.serverGroupTuples;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples;

        public Builder() {
    	      // Empty
        }

        public Builder(GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverGroupTuples = defaults.serverGroupTuples;
        }

        public Builder serverGroupTuples(List<GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples) {
            this.serverGroupTuples = Objects.requireNonNull(serverGroupTuples);
            return this;
        }
        public Builder serverGroupTuples(GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple... serverGroupTuples) {
            return serverGroupTuples(List.of(serverGroupTuples));
        }        public GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig build() {
            return new GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig(serverGroupTuples);
        }
    }
}
