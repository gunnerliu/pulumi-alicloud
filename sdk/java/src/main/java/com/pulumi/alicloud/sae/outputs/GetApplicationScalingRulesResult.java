// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.alicloud.sae.outputs.GetApplicationScalingRulesRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationScalingRulesResult {
    private final String appId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String outputFile;
    private final List<GetApplicationScalingRulesRule> rules;

    @CustomType.Constructor
    private GetApplicationScalingRulesResult(
        @CustomType.Parameter("appId") String appId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("rules") List<GetApplicationScalingRulesRule> rules) {
        this.appId = appId;
        this.id = id;
        this.ids = ids;
        this.outputFile = outputFile;
        this.rules = rules;
    }

    public String appId() {
        return this.appId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetApplicationScalingRulesRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationScalingRulesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private List<GetApplicationScalingRulesRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationScalingRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.rules = defaults.rules;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder rules(List<GetApplicationScalingRulesRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetApplicationScalingRulesRule... rules) {
            return rules(List.of(rules));
        }        public GetApplicationScalingRulesResult build() {
            return new GetApplicationScalingRulesResult(appId, id, ids, outputFile, rules);
        }
    }
}
