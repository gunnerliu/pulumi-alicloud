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
    private final String id;
    /**
     * @return A list of matched Container Registry Enterprise Edition sync rules. Its element is a sync rule uuid.
     * 
     */
    private final List<String> ids;
    /**
     * @return ID of Container Registry Enterprise Edition local instance.
     * 
     */
    private final String instanceId;
    private final @Nullable String nameRegex;
    /**
     * @return A list of sync rule names.
     * 
     */
    private final List<String> names;
    /**
     * @return Name of Container Registry Enterprise Edition local namespace.
     * 
     */
    private final @Nullable String namespaceName;
    private final @Nullable String outputFile;
    /**
     * @return Name of Container Registry Enterprise Edition local repo.
     * 
     */
    private final @Nullable String repoName;
    /**
     * @return A list of matched Container Registry Enterprise Edition sync rules. Each element contains the following attributes:
     * 
     */
    private final List<GetRegistryEnterpriseSyncRulesRule> rules;
    /**
     * @return ID of Container Registry Enterprise Edition target instance.
     * 
     */
    private final @Nullable String targetInstanceId;

    @CustomType.Constructor
    private GetRegistryEnterpriseSyncRulesResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("namespaceName") @Nullable String namespaceName,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("repoName") @Nullable String repoName,
        @CustomType.Parameter("rules") List<GetRegistryEnterpriseSyncRulesRule> rules,
        @CustomType.Parameter("targetInstanceId") @Nullable String targetInstanceId) {
        this.id = id;
        this.ids = ids;
        this.instanceId = instanceId;
        this.nameRegex = nameRegex;
        this.names = names;
        this.namespaceName = namespaceName;
        this.outputFile = outputFile;
        this.repoName = repoName;
        this.rules = rules;
        this.targetInstanceId = targetInstanceId;
    }

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

        public Builder() {
    	      // Empty
        }

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
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
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
        public Builder namespaceName(@Nullable String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder repoName(@Nullable String repoName) {
            this.repoName = repoName;
            return this;
        }
        public Builder rules(List<GetRegistryEnterpriseSyncRulesRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetRegistryEnterpriseSyncRulesRule... rules) {
            return rules(List.of(rules));
        }
        public Builder targetInstanceId(@Nullable String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }        public GetRegistryEnterpriseSyncRulesResult build() {
            return new GetRegistryEnterpriseSyncRulesResult(id, ids, instanceId, nameRegex, names, namespaceName, outputFile, repoName, rules, targetInstanceId);
        }
    }
}
