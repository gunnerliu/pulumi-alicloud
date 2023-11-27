// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEcsDeploymentSetsSet {
    /**
     * @return The time when the deployment set was created.
     * 
     */
    private String createTime;
    /**
     * @return The ID of the Deployment Set.
     * 
     */
    private String deploymentSetId;
    /**
     * @return The name of the deployment set.
     * 
     */
    private String deploymentSetName;
    /**
     * @return The description of the deployment set.
     * 
     */
    private String description;
    /**
     * @return The deployment domain.
     * 
     */
    private String domain;
    /**
     * @return The deployment granularity.
     * 
     */
    private String granularity;
    /**
     * @return The ID of the Deployment Set.
     * 
     */
    private String id;
    /**
     * @return The number of instances in the deployment set.
     * 
     */
    private Integer instanceAmount;
    /**
     * @return The IDs of the instances in the deployment set.
     * 
     */
    private List<String> instanceIds;
    /**
     * @return The deployment strategy.
     * 
     */
    private String strategy;

    private GetEcsDeploymentSetsSet() {}
    /**
     * @return The time when the deployment set was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The ID of the Deployment Set.
     * 
     */
    public String deploymentSetId() {
        return this.deploymentSetId;
    }
    /**
     * @return The name of the deployment set.
     * 
     */
    public String deploymentSetName() {
        return this.deploymentSetName;
    }
    /**
     * @return The description of the deployment set.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The deployment domain.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return The deployment granularity.
     * 
     */
    public String granularity() {
        return this.granularity;
    }
    /**
     * @return The ID of the Deployment Set.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The number of instances in the deployment set.
     * 
     */
    public Integer instanceAmount() {
        return this.instanceAmount;
    }
    /**
     * @return The IDs of the instances in the deployment set.
     * 
     */
    public List<String> instanceIds() {
        return this.instanceIds;
    }
    /**
     * @return The deployment strategy.
     * 
     */
    public String strategy() {
        return this.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsDeploymentSetsSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String deploymentSetId;
        private String deploymentSetName;
        private String description;
        private String domain;
        private String granularity;
        private String id;
        private Integer instanceAmount;
        private List<String> instanceIds;
        private String strategy;
        public Builder() {}
        public Builder(GetEcsDeploymentSetsSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deploymentSetId = defaults.deploymentSetId;
    	      this.deploymentSetName = defaults.deploymentSetName;
    	      this.description = defaults.description;
    	      this.domain = defaults.domain;
    	      this.granularity = defaults.granularity;
    	      this.id = defaults.id;
    	      this.instanceAmount = defaults.instanceAmount;
    	      this.instanceIds = defaults.instanceIds;
    	      this.strategy = defaults.strategy;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder deploymentSetId(String deploymentSetId) {
            this.deploymentSetId = Objects.requireNonNull(deploymentSetId);
            return this;
        }
        @CustomType.Setter
        public Builder deploymentSetName(String deploymentSetName) {
            this.deploymentSetName = Objects.requireNonNull(deploymentSetName);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        @CustomType.Setter
        public Builder granularity(String granularity) {
            this.granularity = Objects.requireNonNull(granularity);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceAmount(Integer instanceAmount) {
            this.instanceAmount = Objects.requireNonNull(instanceAmount);
            return this;
        }
        @CustomType.Setter
        public Builder instanceIds(List<String> instanceIds) {
            this.instanceIds = Objects.requireNonNull(instanceIds);
            return this;
        }
        public Builder instanceIds(String... instanceIds) {
            return instanceIds(List.of(instanceIds));
        }
        @CustomType.Setter
        public Builder strategy(String strategy) {
            this.strategy = Objects.requireNonNull(strategy);
            return this;
        }
        public GetEcsDeploymentSetsSet build() {
            final var _resultValue = new GetEcsDeploymentSetsSet();
            _resultValue.createTime = createTime;
            _resultValue.deploymentSetId = deploymentSetId;
            _resultValue.deploymentSetName = deploymentSetName;
            _resultValue.description = description;
            _resultValue.domain = domain;
            _resultValue.granularity = granularity;
            _resultValue.id = id;
            _resultValue.instanceAmount = instanceAmount;
            _resultValue.instanceIds = instanceIds;
            _resultValue.strategy = strategy;
            return _resultValue;
        }
    }
}
