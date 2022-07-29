// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRulesRuleTarget {
    /**
     * @return The endpoint.
     * 
     */
    private final String endpoint;
    /**
     * @return The id of target.
     * 
     */
    private final String targetId;
    /**
     * @return The type of target.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRulesRuleTarget(
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("targetId") String targetId,
        @CustomType.Parameter("type") String type) {
        this.endpoint = endpoint;
        this.targetId = targetId;
        this.type = type;
    }

    /**
     * @return The endpoint.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The id of target.
     * 
     */
    public String targetId() {
        return this.targetId;
    }
    /**
     * @return The type of target.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesRuleTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String targetId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRulesRuleTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.targetId = defaults.targetId;
    	      this.type = defaults.type;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRulesRuleTarget build() {
            return new GetRulesRuleTarget(endpoint, targetId, type);
        }
    }
}
