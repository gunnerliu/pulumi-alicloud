// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.alicloud.alb.outputs.GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRulesRuleRuleActionTrafficMirrorConfig {
    /**
     * @return The Traffic is mirrored to the server group.
     * 
     */
    private final List<GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig> mirrorGroupConfigs;
    /**
     * @return The Mirror target type.
     * 
     */
    private final String targetType;

    @CustomType.Constructor
    private GetRulesRuleRuleActionTrafficMirrorConfig(
        @CustomType.Parameter("mirrorGroupConfigs") List<GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig> mirrorGroupConfigs,
        @CustomType.Parameter("targetType") String targetType) {
        this.mirrorGroupConfigs = mirrorGroupConfigs;
        this.targetType = targetType;
    }

    /**
     * @return The Traffic is mirrored to the server group.
     * 
     */
    public List<GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig> mirrorGroupConfigs() {
        return this.mirrorGroupConfigs;
    }
    /**
     * @return The Mirror target type.
     * 
     */
    public String targetType() {
        return this.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesRuleRuleActionTrafficMirrorConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig> mirrorGroupConfigs;
        private String targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRulesRuleRuleActionTrafficMirrorConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mirrorGroupConfigs = defaults.mirrorGroupConfigs;
    	      this.targetType = defaults.targetType;
        }

        public Builder mirrorGroupConfigs(List<GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig> mirrorGroupConfigs) {
            this.mirrorGroupConfigs = Objects.requireNonNull(mirrorGroupConfigs);
            return this;
        }
        public Builder mirrorGroupConfigs(GetRulesRuleRuleActionTrafficMirrorConfigMirrorGroupConfig... mirrorGroupConfigs) {
            return mirrorGroupConfigs(List.of(mirrorGroupConfigs));
        }
        public Builder targetType(String targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }        public GetRulesRuleRuleActionTrafficMirrorConfig build() {
            return new GetRulesRuleRuleActionTrafficMirrorConfig(mirrorGroupConfigs, targetType);
        }
    }
}
