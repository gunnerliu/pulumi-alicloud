// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.alicloud.cms.outputs.GetMetricRuleBlackListsListMetric;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMetricRuleBlackListsList {
    /**
     * @return Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
     * 
     */
    private String category;
    /**
     * @return The timestamp for creating an alert blacklist policy.Unit: milliseconds.
     * 
     */
    private String createTime;
    /**
     * @return The effective time range of the alert blacklist policy.
     * 
     */
    private String effectiveTime;
    /**
     * @return The start timestamp of the alert blacklist policy.Unit: milliseconds.
     * 
     */
    private String enableEndTime;
    /**
     * @return The end timestamp of the alert blacklist policy.Unit: milliseconds.
     * 
     */
    private String enableStartTime;
    private String id;
    /**
     * @return The list of instances of cloud services specified in the alert blacklist policy.
     * 
     */
    private List<String> instances;
    /**
     * @return The status of the alert blacklist policy. Value:-true: enabled.-false: disabled.
     * 
     */
    private Boolean isEnable;
    /**
     * @return The first ID of the resource
     * 
     */
    private String metricRuleBlackListId;
    /**
     * @return The name of the alert blacklist policy.
     * 
     */
    private String metricRuleBlackListName;
    /**
     * @return Monitoring metrics in the instance.
     * 
     */
    private List<GetMetricRuleBlackListsListMetric> metrics;
    /**
     * @return The data namespace of the cloud service.
     * 
     */
    private String namespace;
    /**
     * @return The effective range of the alert blacklist policy. Value:-USER: The alert blacklist policy only takes effect in the current Alibaba cloud account.-GROUP: The alert blacklist policy takes effect in the specified application GROUP.
     * 
     */
    private String scopeType;
    /**
     * @return Application Group ID list. The format is JSON Array.&gt; This parameter is displayed only when &#39;ScopeType&#39; is &#39;GROUP.
     * 
     */
    private List<String> scopeValues;

    private GetMetricRuleBlackListsList() {}
    /**
     * @return Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return The timestamp for creating an alert blacklist policy.Unit: milliseconds.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The effective time range of the alert blacklist policy.
     * 
     */
    public String effectiveTime() {
        return this.effectiveTime;
    }
    /**
     * @return The start timestamp of the alert blacklist policy.Unit: milliseconds.
     * 
     */
    public String enableEndTime() {
        return this.enableEndTime;
    }
    /**
     * @return The end timestamp of the alert blacklist policy.Unit: milliseconds.
     * 
     */
    public String enableStartTime() {
        return this.enableStartTime;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return The list of instances of cloud services specified in the alert blacklist policy.
     * 
     */
    public List<String> instances() {
        return this.instances;
    }
    /**
     * @return The status of the alert blacklist policy. Value:-true: enabled.-false: disabled.
     * 
     */
    public Boolean isEnable() {
        return this.isEnable;
    }
    /**
     * @return The first ID of the resource
     * 
     */
    public String metricRuleBlackListId() {
        return this.metricRuleBlackListId;
    }
    /**
     * @return The name of the alert blacklist policy.
     * 
     */
    public String metricRuleBlackListName() {
        return this.metricRuleBlackListName;
    }
    /**
     * @return Monitoring metrics in the instance.
     * 
     */
    public List<GetMetricRuleBlackListsListMetric> metrics() {
        return this.metrics;
    }
    /**
     * @return The data namespace of the cloud service.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return The effective range of the alert blacklist policy. Value:-USER: The alert blacklist policy only takes effect in the current Alibaba cloud account.-GROUP: The alert blacklist policy takes effect in the specified application GROUP.
     * 
     */
    public String scopeType() {
        return this.scopeType;
    }
    /**
     * @return Application Group ID list. The format is JSON Array.&gt; This parameter is displayed only when &#39;ScopeType&#39; is &#39;GROUP.
     * 
     */
    public List<String> scopeValues() {
        return this.scopeValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetricRuleBlackListsList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String category;
        private String createTime;
        private String effectiveTime;
        private String enableEndTime;
        private String enableStartTime;
        private String id;
        private List<String> instances;
        private Boolean isEnable;
        private String metricRuleBlackListId;
        private String metricRuleBlackListName;
        private List<GetMetricRuleBlackListsListMetric> metrics;
        private String namespace;
        private String scopeType;
        private List<String> scopeValues;
        public Builder() {}
        public Builder(GetMetricRuleBlackListsList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.createTime = defaults.createTime;
    	      this.effectiveTime = defaults.effectiveTime;
    	      this.enableEndTime = defaults.enableEndTime;
    	      this.enableStartTime = defaults.enableStartTime;
    	      this.id = defaults.id;
    	      this.instances = defaults.instances;
    	      this.isEnable = defaults.isEnable;
    	      this.metricRuleBlackListId = defaults.metricRuleBlackListId;
    	      this.metricRuleBlackListName = defaults.metricRuleBlackListName;
    	      this.metrics = defaults.metrics;
    	      this.namespace = defaults.namespace;
    	      this.scopeType = defaults.scopeType;
    	      this.scopeValues = defaults.scopeValues;
        }

        @CustomType.Setter
        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = Objects.requireNonNull(effectiveTime);
            return this;
        }
        @CustomType.Setter
        public Builder enableEndTime(String enableEndTime) {
            this.enableEndTime = Objects.requireNonNull(enableEndTime);
            return this;
        }
        @CustomType.Setter
        public Builder enableStartTime(String enableStartTime) {
            this.enableStartTime = Objects.requireNonNull(enableStartTime);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instances(List<String> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        @CustomType.Setter
        public Builder isEnable(Boolean isEnable) {
            this.isEnable = Objects.requireNonNull(isEnable);
            return this;
        }
        @CustomType.Setter
        public Builder metricRuleBlackListId(String metricRuleBlackListId) {
            this.metricRuleBlackListId = Objects.requireNonNull(metricRuleBlackListId);
            return this;
        }
        @CustomType.Setter
        public Builder metricRuleBlackListName(String metricRuleBlackListName) {
            this.metricRuleBlackListName = Objects.requireNonNull(metricRuleBlackListName);
            return this;
        }
        @CustomType.Setter
        public Builder metrics(List<GetMetricRuleBlackListsListMetric> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder metrics(GetMetricRuleBlackListsListMetric... metrics) {
            return metrics(List.of(metrics));
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        @CustomType.Setter
        public Builder scopeType(String scopeType) {
            this.scopeType = Objects.requireNonNull(scopeType);
            return this;
        }
        @CustomType.Setter
        public Builder scopeValues(List<String> scopeValues) {
            this.scopeValues = Objects.requireNonNull(scopeValues);
            return this;
        }
        public Builder scopeValues(String... scopeValues) {
            return scopeValues(List.of(scopeValues));
        }
        public GetMetricRuleBlackListsList build() {
            final var _resultValue = new GetMetricRuleBlackListsList();
            _resultValue.category = category;
            _resultValue.createTime = createTime;
            _resultValue.effectiveTime = effectiveTime;
            _resultValue.enableEndTime = enableEndTime;
            _resultValue.enableStartTime = enableStartTime;
            _resultValue.id = id;
            _resultValue.instances = instances;
            _resultValue.isEnable = isEnable;
            _resultValue.metricRuleBlackListId = metricRuleBlackListId;
            _resultValue.metricRuleBlackListName = metricRuleBlackListName;
            _resultValue.metrics = metrics;
            _resultValue.namespace = namespace;
            _resultValue.scopeType = scopeType;
            _resultValue.scopeValues = scopeValues;
            return _resultValue;
        }
    }
}
