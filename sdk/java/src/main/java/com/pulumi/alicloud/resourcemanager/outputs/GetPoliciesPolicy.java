// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPoliciesPolicy {
    /**
     * @return The number of times the policy is referenced.
     * 
     */
    private Integer attachmentCount;
    /**
     * @return The default version of the policy.
     * 
     */
    private String defaultVersion;
    /**
     * @return The description of the policy.
     * 
     */
    private String description;
    /**
     * @return The ID of the policy.
     * 
     */
    private String id;
    /**
     * @return The name of the policy.
     * 
     */
    private String policyName;
    /**
     * @return The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values: `Custom` and `System`.
     * 
     */
    private String policyType;
    /**
     * @return The time when the policy was updated.
     * 
     */
    private String updateDate;

    private GetPoliciesPolicy() {}
    /**
     * @return The number of times the policy is referenced.
     * 
     */
    public Integer attachmentCount() {
        return this.attachmentCount;
    }
    /**
     * @return The default version of the policy.
     * 
     */
    public String defaultVersion() {
        return this.defaultVersion;
    }
    /**
     * @return The description of the policy.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the policy.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the policy.
     * 
     */
    public String policyName() {
        return this.policyName;
    }
    /**
     * @return The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values: `Custom` and `System`.
     * 
     */
    public String policyType() {
        return this.policyType;
    }
    /**
     * @return The time when the policy was updated.
     * 
     */
    public String updateDate() {
        return this.updateDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoliciesPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer attachmentCount;
        private String defaultVersion;
        private String description;
        private String id;
        private String policyName;
        private String policyType;
        private String updateDate;
        public Builder() {}
        public Builder(GetPoliciesPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentCount = defaults.attachmentCount;
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.policyName = defaults.policyName;
    	      this.policyType = defaults.policyType;
    	      this.updateDate = defaults.updateDate;
        }

        @CustomType.Setter
        public Builder attachmentCount(Integer attachmentCount) {
            this.attachmentCount = Objects.requireNonNull(attachmentCount);
            return this;
        }
        @CustomType.Setter
        public Builder defaultVersion(String defaultVersion) {
            this.defaultVersion = Objects.requireNonNull(defaultVersion);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder policyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        @CustomType.Setter
        public Builder policyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }
        @CustomType.Setter
        public Builder updateDate(String updateDate) {
            this.updateDate = Objects.requireNonNull(updateDate);
            return this;
        }
        public GetPoliciesPolicy build() {
            final var _resultValue = new GetPoliciesPolicy();
            _resultValue.attachmentCount = attachmentCount;
            _resultValue.defaultVersion = defaultVersion;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.policyName = policyName;
            _resultValue.policyType = policyType;
            _resultValue.updateDate = updateDate;
            return _resultValue;
        }
    }
}
