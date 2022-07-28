// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.alicloud.arms.outputs.GetPrometheusAlertRulesRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrometheusAlertRulesResult {
    private final String clusterId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String matchExpressions;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String outputFile;
    private final List<GetPrometheusAlertRulesRule> rules;
    private final @Nullable Integer status;
    private final @Nullable String type;

    @CustomType.Constructor
    private GetPrometheusAlertRulesResult(
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("matchExpressions") @Nullable String matchExpressions,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("rules") List<GetPrometheusAlertRulesRule> rules,
        @CustomType.Parameter("status") @Nullable Integer status,
        @CustomType.Parameter("type") @Nullable String type) {
        this.clusterId = clusterId;
        this.id = id;
        this.ids = ids;
        this.matchExpressions = matchExpressions;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.rules = rules;
        this.status = status;
        this.type = type;
    }

    public String clusterId() {
        return this.clusterId;
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
    public Optional<String> matchExpressions() {
        return Optional.ofNullable(this.matchExpressions);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetPrometheusAlertRulesRule> rules() {
        return this.rules;
    }
    public Optional<Integer> status() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrometheusAlertRulesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private String id;
        private List<String> ids;
        private @Nullable String matchExpressions;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetPrometheusAlertRulesRule> rules;
        private @Nullable Integer status;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrometheusAlertRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.matchExpressions = defaults.matchExpressions;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.rules = defaults.rules;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
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
        public Builder matchExpressions(@Nullable String matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder rules(List<GetPrometheusAlertRulesRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetPrometheusAlertRulesRule... rules) {
            return rules(List.of(rules));
        }
        public Builder status(@Nullable Integer status) {
            this.status = status;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public GetPrometheusAlertRulesResult build() {
            return new GetPrometheusAlertRulesResult(clusterId, id, ids, matchExpressions, nameRegex, names, outputFile, rules, status, type);
        }
    }
}
