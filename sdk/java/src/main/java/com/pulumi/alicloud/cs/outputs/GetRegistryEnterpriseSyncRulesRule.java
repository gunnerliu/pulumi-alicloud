// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegistryEnterpriseSyncRulesRule {
    /**
     * @return ID of Container Registry Enterprise Edition sync rule.
     * 
     */
    private String id;
    /**
     * @return ID of Container Registry Enterprise Edition local instance.
     * 
     */
    private String instanceId;
    /**
     * @return Name of Container Registry Enterprise Edition sync rule.
     * 
     */
    private String name;
    /**
     * @return Name of Container Registry Enterprise Edition local namespace.
     * 
     */
    private String namespaceName;
    /**
     * @return Region of Container Registry Enterprise Edition local instance.
     * 
     */
    private String regionId;
    /**
     * @return Name of Container Registry Enterprise Edition local repo.
     * 
     */
    private String repoName;
    /**
     * @return `FROM` or `TO`, the direction of synchronization. `FROM` indicates that the local instance is the source instance. `TO` indicates that the local instance is the target instance to be synchronized.
     * 
     */
    private String syncDirection;
    /**
     * @return `REPO` or `NAMESPACE`,the scope that the synchronization rule applies.
     * 
     */
    private String syncScope;
    /**
     * @return `PASSIVE` or `INITIATIVE`, the policy configured to trigger the synchronization rule.
     * 
     */
    private String syncTrigger;
    /**
     * @return The regular expression used to filter image tags for synchronization in the source repository.
     * 
     */
    private String tagFilter;
    /**
     * @return ID of Container Registry Enterprise Edition target instance.
     * 
     */
    private String targetInstanceId;
    /**
     * @return Name of Container Registry Enterprise Edition target namespace.
     * 
     */
    private String targetNamespaceName;
    /**
     * @return Region of Container Registry Enterprise Edition target instance.
     * 
     */
    private String targetRegionId;
    /**
     * @return Name of Container Registry Enterprise Edition target repo.
     * 
     */
    private String targetRepoName;

    private GetRegistryEnterpriseSyncRulesRule() {}
    /**
     * @return ID of Container Registry Enterprise Edition sync rule.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ID of Container Registry Enterprise Edition local instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return Name of Container Registry Enterprise Edition sync rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name of Container Registry Enterprise Edition local namespace.
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }
    /**
     * @return Region of Container Registry Enterprise Edition local instance.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return Name of Container Registry Enterprise Edition local repo.
     * 
     */
    public String repoName() {
        return this.repoName;
    }
    /**
     * @return `FROM` or `TO`, the direction of synchronization. `FROM` indicates that the local instance is the source instance. `TO` indicates that the local instance is the target instance to be synchronized.
     * 
     */
    public String syncDirection() {
        return this.syncDirection;
    }
    /**
     * @return `REPO` or `NAMESPACE`,the scope that the synchronization rule applies.
     * 
     */
    public String syncScope() {
        return this.syncScope;
    }
    /**
     * @return `PASSIVE` or `INITIATIVE`, the policy configured to trigger the synchronization rule.
     * 
     */
    public String syncTrigger() {
        return this.syncTrigger;
    }
    /**
     * @return The regular expression used to filter image tags for synchronization in the source repository.
     * 
     */
    public String tagFilter() {
        return this.tagFilter;
    }
    /**
     * @return ID of Container Registry Enterprise Edition target instance.
     * 
     */
    public String targetInstanceId() {
        return this.targetInstanceId;
    }
    /**
     * @return Name of Container Registry Enterprise Edition target namespace.
     * 
     */
    public String targetNamespaceName() {
        return this.targetNamespaceName;
    }
    /**
     * @return Region of Container Registry Enterprise Edition target instance.
     * 
     */
    public String targetRegionId() {
        return this.targetRegionId;
    }
    /**
     * @return Name of Container Registry Enterprise Edition target repo.
     * 
     */
    public String targetRepoName() {
        return this.targetRepoName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryEnterpriseSyncRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String instanceId;
        private String name;
        private String namespaceName;
        private String regionId;
        private String repoName;
        private String syncDirection;
        private String syncScope;
        private String syncTrigger;
        private String tagFilter;
        private String targetInstanceId;
        private String targetNamespaceName;
        private String targetRegionId;
        private String targetRepoName;
        public Builder() {}
        public Builder(GetRegistryEnterpriseSyncRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.namespaceName = defaults.namespaceName;
    	      this.regionId = defaults.regionId;
    	      this.repoName = defaults.repoName;
    	      this.syncDirection = defaults.syncDirection;
    	      this.syncScope = defaults.syncScope;
    	      this.syncTrigger = defaults.syncTrigger;
    	      this.tagFilter = defaults.tagFilter;
    	      this.targetInstanceId = defaults.targetInstanceId;
    	      this.targetNamespaceName = defaults.targetNamespaceName;
    	      this.targetRegionId = defaults.targetRegionId;
    	      this.targetRepoName = defaults.targetRepoName;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        @CustomType.Setter
        public Builder repoName(String repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }
        @CustomType.Setter
        public Builder syncDirection(String syncDirection) {
            this.syncDirection = Objects.requireNonNull(syncDirection);
            return this;
        }
        @CustomType.Setter
        public Builder syncScope(String syncScope) {
            this.syncScope = Objects.requireNonNull(syncScope);
            return this;
        }
        @CustomType.Setter
        public Builder syncTrigger(String syncTrigger) {
            this.syncTrigger = Objects.requireNonNull(syncTrigger);
            return this;
        }
        @CustomType.Setter
        public Builder tagFilter(String tagFilter) {
            this.tagFilter = Objects.requireNonNull(tagFilter);
            return this;
        }
        @CustomType.Setter
        public Builder targetInstanceId(String targetInstanceId) {
            this.targetInstanceId = Objects.requireNonNull(targetInstanceId);
            return this;
        }
        @CustomType.Setter
        public Builder targetNamespaceName(String targetNamespaceName) {
            this.targetNamespaceName = Objects.requireNonNull(targetNamespaceName);
            return this;
        }
        @CustomType.Setter
        public Builder targetRegionId(String targetRegionId) {
            this.targetRegionId = Objects.requireNonNull(targetRegionId);
            return this;
        }
        @CustomType.Setter
        public Builder targetRepoName(String targetRepoName) {
            this.targetRepoName = Objects.requireNonNull(targetRepoName);
            return this;
        }
        public GetRegistryEnterpriseSyncRulesRule build() {
            final var _resultValue = new GetRegistryEnterpriseSyncRulesRule();
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.name = name;
            _resultValue.namespaceName = namespaceName;
            _resultValue.regionId = regionId;
            _resultValue.repoName = repoName;
            _resultValue.syncDirection = syncDirection;
            _resultValue.syncScope = syncScope;
            _resultValue.syncTrigger = syncTrigger;
            _resultValue.tagFilter = tagFilter;
            _resultValue.targetInstanceId = targetInstanceId;
            _resultValue.targetNamespaceName = targetNamespaceName;
            _resultValue.targetRegionId = targetRegionId;
            _resultValue.targetRepoName = targetRepoName;
            return _resultValue;
        }
    }
}
