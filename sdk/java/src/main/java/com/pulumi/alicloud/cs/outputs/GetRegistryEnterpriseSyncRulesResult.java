// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.alicloud.cs.outputs.GetRegistryEnterpriseSyncRulesRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegistryEnterpriseSyncRulesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of matched Container Registry Enterprise Edition sync rules. Its element is a sync rule uuid.
     * 
     */
    private List<String> ids;
    /**
     * @return ID of Container Registry Enterprise Edition local instance.
     * 
     */
    private String instanceId;
    private @Nullable String nameRegex;
    /**
     * @return A list of sync rule names.
     * 
     */
    private List<String> names;
    /**
     * @return Name of Container Registry Enterprise Edition local namespace.
     * 
     */
    private @Nullable String namespaceName;
    private @Nullable String outputFile;
    /**
     * @return Name of Container Registry Enterprise Edition local repo.
     * 
     */
    private @Nullable String repoName;
    /**
     * @return A list of matched Container Registry Enterprise Edition sync rules. Each element contains the following attributes:
     * 
     */
    private List<GetRegistryEnterpriseSyncRulesRule> rules;
    /**
     * @return ID of Container Registry Enterprise Edition target instance.
     * 
     */
    private @Nullable String targetInstanceId;

    private GetRegistryEnterpriseSyncRulesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of matched Container Registry Enterprise Edition sync rules. Its element is a sync rule uuid.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return ID of Container Registry Enterprise Edition local instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of sync rule names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    /**
     * @return Name of Container Registry Enterprise Edition local namespace.
     * 
     */
    public Optional<String> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return Name of Container Registry Enterprise Edition local repo.
     * 
     */
    public Optional<String> repoName() {
        return Optional.ofNullable(this.repoName);
    }
    /**
     * @return A list of matched Container Registry Enterprise Edition sync rules. Each element contains the following attributes:
     * 
     */
    public List<GetRegistryEnterpriseSyncRulesRule> rules() {
        return this.rules;
    }
    /**
     * @return ID of Container Registry Enterprise Edition target instance.
     * 
     */
    public Optional<String> targetInstanceId() {
        return Optional.ofNullable(this.targetInstanceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryEnterpriseSyncRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private String instanceId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String namespaceName;
        private @Nullable String outputFile;
        private @Nullable String repoName;
        private List<GetRegistryEnterpriseSyncRulesRule> rules;
        private @Nullable String targetInstanceId;
        public Builder() {}
        public Builder(GetRegistryEnterpriseSyncRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.namespaceName = defaults.namespaceName;
    	      this.outputFile = defaults.outputFile;
    	      this.repoName = defaults.repoName;
    	      this.rules = defaults.rules;
    	      this.targetInstanceId = defaults.targetInstanceId;
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
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder namespaceName(@Nullable String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder repoName(@Nullable String repoName) {
            this.repoName = repoName;
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<GetRegistryEnterpriseSyncRulesRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetRegistryEnterpriseSyncRulesRule... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder targetInstanceId(@Nullable String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public GetRegistryEnterpriseSyncRulesResult build() {
            final var _resultValue = new GetRegistryEnterpriseSyncRulesResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceId = instanceId;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.namespaceName = namespaceName;
            _resultValue.outputFile = outputFile;
            _resultValue.repoName = repoName;
            _resultValue.rules = rules;
            _resultValue.targetInstanceId = targetInstanceId;
            return _resultValue;
        }
    }
}
