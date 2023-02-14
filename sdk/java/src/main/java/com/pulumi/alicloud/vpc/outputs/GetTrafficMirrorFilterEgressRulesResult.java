// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetTrafficMirrorFilterEgressRulesRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTrafficMirrorFilterEgressRulesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String outputFile;
    private List<GetTrafficMirrorFilterEgressRulesRule> rules;
    private @Nullable String status;
    private String trafficMirrorFilterId;

    private GetTrafficMirrorFilterEgressRulesResult() {}
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
    public List<GetTrafficMirrorFilterEgressRulesRule> rules() {
        return this.rules;
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public String trafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficMirrorFilterEgressRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private List<GetTrafficMirrorFilterEgressRulesRule> rules;
        private @Nullable String status;
        private String trafficMirrorFilterId;
        public Builder() {}
        public Builder(GetTrafficMirrorFilterEgressRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.rules = defaults.rules;
    	      this.status = defaults.status;
    	      this.trafficMirrorFilterId = defaults.trafficMirrorFilterId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<GetTrafficMirrorFilterEgressRulesRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetTrafficMirrorFilterEgressRulesRule... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            this.trafficMirrorFilterId = Objects.requireNonNull(trafficMirrorFilterId);
            return this;
        }
        public GetTrafficMirrorFilterEgressRulesResult build() {
            final var o = new GetTrafficMirrorFilterEgressRulesResult();
            o.id = id;
            o.ids = ids;
            o.outputFile = outputFile;
            o.rules = rules;
            o.status = status;
            o.trafficMirrorFilterId = trafficMirrorFilterId;
            return o;
        }
    }
}