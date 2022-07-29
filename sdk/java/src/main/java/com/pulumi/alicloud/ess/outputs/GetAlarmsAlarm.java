// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAlarmsAlarm {
    /**
     * @return The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
     * 
     */
    private final List<String> alarmActions;
    /**
     * @return Defines the application group id defined by CMS which is assigned when you upload custom metric to CMS, only available for custom metirc.
     * 
     */
    private final Integer cloudMonitorGroupId;
    /**
     * @return The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand.
     * 
     */
    private final String comparisonOperator;
    /**
     * @return The description for the alarm.
     * 
     */
    private final String description;
    /**
     * @return The dimension map for the alarm&#39;s associated metric.
     * 
     */
    private final Map<String,Object> dimensions;
    /**
     * @return Whether to enable specific ess alarm.
     * 
     */
    private final Boolean enable;
    /**
     * @return The number of times that needs to satisfies comparison condition before transition into ALARM state.
     * 
     */
    private final Integer evaluationCount;
    /**
     * @return The id of alarm.
     * 
     */
    private final String id;
    /**
     * @return The name for the alarm&#39;s associated metric. See Block_metricNames_and_dimensions below for details.
     * 
     */
    private final String metricName;
    /**
     * @return The type for the alarm&#39;s associated metric. Supported value: system, custom. &#34;system&#34; means the metric data is collected by Aliyun Cloud Monitor Service(CMS), &#34;custom&#34; means the metric data is upload to CMS by users. Defaults to system.
     * 
     */
    private final String metricType;
    /**
     * @return The name for ess alarm.
     * 
     */
    private final String name;
    /**
     * @return The period in seconds over which the specified statistic is applied.
     * 
     */
    private final Integer period;
    /**
     * @return Scaling group id the alarms belong to.
     * 
     */
    private final String scalingGroupId;
    /**
     * @return The state of alarm task.
     * 
     */
    private final String state;
    /**
     * @return The statistic to apply to the alarm&#39;s associated metric.
     * 
     */
    private final String statistics;
    /**
     * @return The value against which the specified statistics is compared.
     * 
     */
    private final String threshold;

    @CustomType.Constructor
    private GetAlarmsAlarm(
        @CustomType.Parameter("alarmActions") List<String> alarmActions,
        @CustomType.Parameter("cloudMonitorGroupId") Integer cloudMonitorGroupId,
        @CustomType.Parameter("comparisonOperator") String comparisonOperator,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("dimensions") Map<String,Object> dimensions,
        @CustomType.Parameter("enable") Boolean enable,
        @CustomType.Parameter("evaluationCount") Integer evaluationCount,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("metricType") String metricType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("period") Integer period,
        @CustomType.Parameter("scalingGroupId") String scalingGroupId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("statistics") String statistics,
        @CustomType.Parameter("threshold") String threshold) {
        this.alarmActions = alarmActions;
        this.cloudMonitorGroupId = cloudMonitorGroupId;
        this.comparisonOperator = comparisonOperator;
        this.description = description;
        this.dimensions = dimensions;
        this.enable = enable;
        this.evaluationCount = evaluationCount;
        this.id = id;
        this.metricName = metricName;
        this.metricType = metricType;
        this.name = name;
        this.period = period;
        this.scalingGroupId = scalingGroupId;
        this.state = state;
        this.statistics = statistics;
        this.threshold = threshold;
    }

    /**
     * @return The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
     * 
     */
    public List<String> alarmActions() {
        return this.alarmActions;
    }
    /**
     * @return Defines the application group id defined by CMS which is assigned when you upload custom metric to CMS, only available for custom metirc.
     * 
     */
    public Integer cloudMonitorGroupId() {
        return this.cloudMonitorGroupId;
    }
    /**
     * @return The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand.
     * 
     */
    public String comparisonOperator() {
        return this.comparisonOperator;
    }
    /**
     * @return The description for the alarm.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The dimension map for the alarm&#39;s associated metric.
     * 
     */
    public Map<String,Object> dimensions() {
        return this.dimensions;
    }
    /**
     * @return Whether to enable specific ess alarm.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return The number of times that needs to satisfies comparison condition before transition into ALARM state.
     * 
     */
    public Integer evaluationCount() {
        return this.evaluationCount;
    }
    /**
     * @return The id of alarm.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name for the alarm&#39;s associated metric. See Block_metricNames_and_dimensions below for details.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return The type for the alarm&#39;s associated metric. Supported value: system, custom. &#34;system&#34; means the metric data is collected by Aliyun Cloud Monitor Service(CMS), &#34;custom&#34; means the metric data is upload to CMS by users. Defaults to system.
     * 
     */
    public String metricType() {
        return this.metricType;
    }
    /**
     * @return The name for ess alarm.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The period in seconds over which the specified statistic is applied.
     * 
     */
    public Integer period() {
        return this.period;
    }
    /**
     * @return Scaling group id the alarms belong to.
     * 
     */
    public String scalingGroupId() {
        return this.scalingGroupId;
    }
    /**
     * @return The state of alarm task.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The statistic to apply to the alarm&#39;s associated metric.
     * 
     */
    public String statistics() {
        return this.statistics;
    }
    /**
     * @return The value against which the specified statistics is compared.
     * 
     */
    public String threshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlarmsAlarm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> alarmActions;
        private Integer cloudMonitorGroupId;
        private String comparisonOperator;
        private String description;
        private Map<String,Object> dimensions;
        private Boolean enable;
        private Integer evaluationCount;
        private String id;
        private String metricName;
        private String metricType;
        private String name;
        private Integer period;
        private String scalingGroupId;
        private String state;
        private String statistics;
        private String threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlarmsAlarm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmActions = defaults.alarmActions;
    	      this.cloudMonitorGroupId = defaults.cloudMonitorGroupId;
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.description = defaults.description;
    	      this.dimensions = defaults.dimensions;
    	      this.enable = defaults.enable;
    	      this.evaluationCount = defaults.evaluationCount;
    	      this.id = defaults.id;
    	      this.metricName = defaults.metricName;
    	      this.metricType = defaults.metricType;
    	      this.name = defaults.name;
    	      this.period = defaults.period;
    	      this.scalingGroupId = defaults.scalingGroupId;
    	      this.state = defaults.state;
    	      this.statistics = defaults.statistics;
    	      this.threshold = defaults.threshold;
        }

        public Builder alarmActions(List<String> alarmActions) {
            this.alarmActions = Objects.requireNonNull(alarmActions);
            return this;
        }
        public Builder alarmActions(String... alarmActions) {
            return alarmActions(List.of(alarmActions));
        }
        public Builder cloudMonitorGroupId(Integer cloudMonitorGroupId) {
            this.cloudMonitorGroupId = Objects.requireNonNull(cloudMonitorGroupId);
            return this;
        }
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder dimensions(Map<String,Object> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder evaluationCount(Integer evaluationCount) {
            this.evaluationCount = Objects.requireNonNull(evaluationCount);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricType(String metricType) {
            this.metricType = Objects.requireNonNull(metricType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder period(Integer period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }
        public Builder scalingGroupId(String scalingGroupId) {
            this.scalingGroupId = Objects.requireNonNull(scalingGroupId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder statistics(String statistics) {
            this.statistics = Objects.requireNonNull(statistics);
            return this;
        }
        public Builder threshold(String threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }        public GetAlarmsAlarm build() {
            return new GetAlarmsAlarm(alarmActions, cloudMonitorGroupId, comparisonOperator, description, dimensions, enable, evaluationCount, id, metricName, metricType, name, period, scalingGroupId, state, statistics, threshold);
        }
    }
}
