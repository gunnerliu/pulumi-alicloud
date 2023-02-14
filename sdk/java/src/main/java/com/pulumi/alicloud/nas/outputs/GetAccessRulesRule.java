// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccessRulesRule {
    /**
     * @return AccessRuleId of the AccessRule.
     * 
     */
    private String accessRuleId;
    /**
     * @return Priority of the AccessRule.
     * 
     */
    private Integer priority;
    /**
     * @return Filter results by a specific RWAccess.
     * 
     */
    private String rwAccess;
    /**
     * @return Filter results by a specific SourceCidrIp.
     * 
     */
    private String sourceCidrIp;
    /**
     * @return Filter results by a specific UserAccess.
     * 
     */
    private String userAccess;

    private GetAccessRulesRule() {}
    /**
     * @return AccessRuleId of the AccessRule.
     * 
     */
    public String accessRuleId() {
        return this.accessRuleId;
    }
    /**
     * @return Priority of the AccessRule.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Filter results by a specific RWAccess.
     * 
     */
    public String rwAccess() {
        return this.rwAccess;
    }
    /**
     * @return Filter results by a specific SourceCidrIp.
     * 
     */
    public String sourceCidrIp() {
        return this.sourceCidrIp;
    }
    /**
     * @return Filter results by a specific UserAccess.
     * 
     */
    public String userAccess() {
        return this.userAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessRuleId;
        private Integer priority;
        private String rwAccess;
        private String sourceCidrIp;
        private String userAccess;
        public Builder() {}
        public Builder(GetAccessRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRuleId = defaults.accessRuleId;
    	      this.priority = defaults.priority;
    	      this.rwAccess = defaults.rwAccess;
    	      this.sourceCidrIp = defaults.sourceCidrIp;
    	      this.userAccess = defaults.userAccess;
        }

        @CustomType.Setter
        public Builder accessRuleId(String accessRuleId) {
            this.accessRuleId = Objects.requireNonNull(accessRuleId);
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder rwAccess(String rwAccess) {
            this.rwAccess = Objects.requireNonNull(rwAccess);
            return this;
        }
        @CustomType.Setter
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = Objects.requireNonNull(sourceCidrIp);
            return this;
        }
        @CustomType.Setter
        public Builder userAccess(String userAccess) {
            this.userAccess = Objects.requireNonNull(userAccess);
            return this;
        }
        public GetAccessRulesRule build() {
            final var o = new GetAccessRulesRule();
            o.accessRuleId = accessRuleId;
            o.priority = priority;
            o.rwAccess = rwAccess;
            o.sourceCidrIp = sourceCidrIp;
            o.userAccess = userAccess;
            return o;
        }
    }
}