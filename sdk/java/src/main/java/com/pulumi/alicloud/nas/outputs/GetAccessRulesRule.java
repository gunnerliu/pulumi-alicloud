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
    private final String accessRuleId;
    /**
     * @return Priority of the AccessRule.
     * 
     */
    private final Integer priority;
    /**
     * @return Filter results by a specific RWAccess.
     * 
     */
    private final String rwAccess;
    /**
     * @return Filter results by a specific SourceCidrIp.
     * 
     */
    private final String sourceCidrIp;
    /**
     * @return Filter results by a specific UserAccess.
     * 
     */
    private final String userAccess;

    @CustomType.Constructor
    private GetAccessRulesRule(
        @CustomType.Parameter("accessRuleId") String accessRuleId,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("rwAccess") String rwAccess,
        @CustomType.Parameter("sourceCidrIp") String sourceCidrIp,
        @CustomType.Parameter("userAccess") String userAccess) {
        this.accessRuleId = accessRuleId;
        this.priority = priority;
        this.rwAccess = rwAccess;
        this.sourceCidrIp = sourceCidrIp;
        this.userAccess = userAccess;
    }

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

    public static final class Builder {
        private String accessRuleId;
        private Integer priority;
        private String rwAccess;
        private String sourceCidrIp;
        private String userAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRuleId = defaults.accessRuleId;
    	      this.priority = defaults.priority;
    	      this.rwAccess = defaults.rwAccess;
    	      this.sourceCidrIp = defaults.sourceCidrIp;
    	      this.userAccess = defaults.userAccess;
        }

        public Builder accessRuleId(String accessRuleId) {
            this.accessRuleId = Objects.requireNonNull(accessRuleId);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder rwAccess(String rwAccess) {
            this.rwAccess = Objects.requireNonNull(rwAccess);
            return this;
        }
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = Objects.requireNonNull(sourceCidrIp);
            return this;
        }
        public Builder userAccess(String userAccess) {
            this.userAccess = Objects.requireNonNull(userAccess);
            return this;
        }        public GetAccessRulesRule build() {
            return new GetAccessRulesRule(accessRuleId, priority, rwAccess, sourceCidrIp, userAccess);
        }
    }
}
