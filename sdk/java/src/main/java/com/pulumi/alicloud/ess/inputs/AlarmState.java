// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlarmState extends com.pulumi.resources.ResourceArgs {

    public static final AlarmState Empty = new AlarmState();

    /**
     * The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
     * 
     */
    @Import(name="alarmActions")
    private @Nullable Output<List<String>> alarmActions;

    /**
     * @return The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
     * 
     */
    public Optional<Output<List<String>>> alarmActions() {
        return Optional.ofNullable(this.alarmActions);
    }

    /**
     * Defines the application group id defined by CMS which is assigned when you upload custom metric to CMS, only available for custom metirc.
     * 
     */
    @Import(name="cloudMonitorGroupId")
    private @Nullable Output<Integer> cloudMonitorGroupId;

    /**
     * @return Defines the application group id defined by CMS which is assigned when you upload custom metric to CMS, only available for custom metirc.
     * 
     */
    public Optional<Output<Integer>> cloudMonitorGroupId() {
        return Optional.ofNullable(this.cloudMonitorGroupId);
    }

    /**
     * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Supported value: &gt;=, &lt;=, &gt;, &lt;. Defaults to &gt;=.
     * 
     */
    @Import(name="comparisonOperator")
    private @Nullable Output<String> comparisonOperator;

    /**
     * @return The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Supported value: &gt;=, &lt;=, &gt;, &lt;. Defaults to &gt;=.
     * 
     */
    public Optional<Output<String>> comparisonOperator() {
        return Optional.ofNullable(this.comparisonOperator);
    }

    /**
     * The description for the alarm.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the alarm.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The dimension map for the alarm&#39;s associated metric (documented below). For all metrics, you can not set the dimension key as &#34;scaling_group&#34; or &#34;userId&#34;, which is set by default, the second dimension for metric, such as &#34;device&#34; for &#34;PackagesNetIn&#34;, need to be set by users.
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<Map<String,Object>> dimensions;

    /**
     * @return The dimension map for the alarm&#39;s associated metric (documented below). For all metrics, you can not set the dimension key as &#34;scaling_group&#34; or &#34;userId&#34;, which is set by default, the second dimension for metric, such as &#34;device&#34; for &#34;PackagesNetIn&#34;, need to be set by users.
     * 
     */
    public Optional<Output<Map<String,Object>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * Whether to enable specific ess alarm. Default to true.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return Whether to enable specific ess alarm. Default to true.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * The number of times that needs to satisfies comparison condition before transition into ALARM state. Defaults to 3.
     * 
     */
    @Import(name="evaluationCount")
    private @Nullable Output<Integer> evaluationCount;

    /**
     * @return The number of times that needs to satisfies comparison condition before transition into ALARM state. Defaults to 3.
     * 
     */
    public Optional<Output<Integer>> evaluationCount() {
        return Optional.ofNullable(this.evaluationCount);
    }

    /**
     * The name for the alarm&#39;s associated metric. See Block_metricNames_and_dimensions below for details.
     * 
     */
    @Import(name="metricName")
    private @Nullable Output<String> metricName;

    /**
     * @return The name for the alarm&#39;s associated metric. See Block_metricNames_and_dimensions below for details.
     * 
     */
    public Optional<Output<String>> metricName() {
        return Optional.ofNullable(this.metricName);
    }

    /**
     * The type for the alarm&#39;s associated metric. Supported value: system, custom. &#34;system&#34; means the metric data is collected by Aliyun Cloud Monitor Service(CMS), &#34;custom&#34; means the metric data is upload to CMS by users. Defaults to system.
     * 
     */
    @Import(name="metricType")
    private @Nullable Output<String> metricType;

    /**
     * @return The type for the alarm&#39;s associated metric. Supported value: system, custom. &#34;system&#34; means the metric data is collected by Aliyun Cloud Monitor Service(CMS), &#34;custom&#34; means the metric data is upload to CMS by users. Defaults to system.
     * 
     */
    public Optional<Output<String>> metricType() {
        return Optional.ofNullable(this.metricType);
    }

    /**
     * The name for ess alarm.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for ess alarm.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The period in seconds over which the specified statistic is applied. Supported value: 60, 120, 300, 900. Defaults to 300.
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return The period in seconds over which the specified statistic is applied. Supported value: 60, 120, 300, 900. Defaults to 300.
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The scaling group associated with this alarm, the &#39;ForceNew&#39; attribute is available in 1.56.0+.
     * 
     */
    @Import(name="scalingGroupId")
    private @Nullable Output<String> scalingGroupId;

    /**
     * @return The scaling group associated with this alarm, the &#39;ForceNew&#39; attribute is available in 1.56.0+.
     * 
     */
    public Optional<Output<String>> scalingGroupId() {
        return Optional.ofNullable(this.scalingGroupId);
    }

    /**
     * The state of specified alarm.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of specified alarm.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The statistic to apply to the alarm&#39;s associated metric. Supported value: Average, Minimum, Maximum. Defaults to Average.
     * 
     */
    @Import(name="statistics")
    private @Nullable Output<String> statistics;

    /**
     * @return The statistic to apply to the alarm&#39;s associated metric. Supported value: Average, Minimum, Maximum. Defaults to Average.
     * 
     */
    public Optional<Output<String>> statistics() {
        return Optional.ofNullable(this.statistics);
    }

    /**
     * The value against which the specified statistics is compared.
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<String> threshold;

    /**
     * @return The value against which the specified statistics is compared.
     * 
     */
    public Optional<Output<String>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    private AlarmState() {}

    private AlarmState(AlarmState $) {
        this.alarmActions = $.alarmActions;
        this.cloudMonitorGroupId = $.cloudMonitorGroupId;
        this.comparisonOperator = $.comparisonOperator;
        this.description = $.description;
        this.dimensions = $.dimensions;
        this.enable = $.enable;
        this.evaluationCount = $.evaluationCount;
        this.metricName = $.metricName;
        this.metricType = $.metricType;
        this.name = $.name;
        this.period = $.period;
        this.scalingGroupId = $.scalingGroupId;
        this.state = $.state;
        this.statistics = $.statistics;
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlarmState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlarmState $;

        public Builder() {
            $ = new AlarmState();
        }

        public Builder(AlarmState defaults) {
            $ = new AlarmState(Objects.requireNonNull(defaults));
        }

        /**
         * @param alarmActions The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
         * 
         * @return builder
         * 
         */
        public Builder alarmActions(@Nullable Output<List<String>> alarmActions) {
            $.alarmActions = alarmActions;
            return this;
        }

        /**
         * @param alarmActions The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
         * 
         * @return builder
         * 
         */
        public Builder alarmActions(List<String> alarmActions) {
            return alarmActions(Output.of(alarmActions));
        }

        /**
         * @param alarmActions The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
         * 
         * @return builder
         * 
         */
        public Builder alarmActions(String... alarmActions) {
            return alarmActions(List.of(alarmActions));
        }

        /**
         * @param cloudMonitorGroupId Defines the application group id defined by CMS which is assigned when you upload custom metric to CMS, only available for custom metirc.
         * 
         * @return builder
         * 
         */
        public Builder cloudMonitorGroupId(@Nullable Output<Integer> cloudMonitorGroupId) {
            $.cloudMonitorGroupId = cloudMonitorGroupId;
            return this;
        }

        /**
         * @param cloudMonitorGroupId Defines the application group id defined by CMS which is assigned when you upload custom metric to CMS, only available for custom metirc.
         * 
         * @return builder
         * 
         */
        public Builder cloudMonitorGroupId(Integer cloudMonitorGroupId) {
            return cloudMonitorGroupId(Output.of(cloudMonitorGroupId));
        }

        /**
         * @param comparisonOperator The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Supported value: &gt;=, &lt;=, &gt;, &lt;. Defaults to &gt;=.
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(@Nullable Output<String> comparisonOperator) {
            $.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * @param comparisonOperator The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Supported value: &gt;=, &lt;=, &gt;, &lt;. Defaults to &gt;=.
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(String comparisonOperator) {
            return comparisonOperator(Output.of(comparisonOperator));
        }

        /**
         * @param description The description for the alarm.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the alarm.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dimensions The dimension map for the alarm&#39;s associated metric (documented below). For all metrics, you can not set the dimension key as &#34;scaling_group&#34; or &#34;userId&#34;, which is set by default, the second dimension for metric, such as &#34;device&#34; for &#34;PackagesNetIn&#34;, need to be set by users.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable Output<Map<String,Object>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions The dimension map for the alarm&#39;s associated metric (documented below). For all metrics, you can not set the dimension key as &#34;scaling_group&#34; or &#34;userId&#34;, which is set by default, the second dimension for metric, such as &#34;device&#34; for &#34;PackagesNetIn&#34;, need to be set by users.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(Map<String,Object> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param enable Whether to enable specific ess alarm. Default to true.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Whether to enable specific ess alarm. Default to true.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param evaluationCount The number of times that needs to satisfies comparison condition before transition into ALARM state. Defaults to 3.
         * 
         * @return builder
         * 
         */
        public Builder evaluationCount(@Nullable Output<Integer> evaluationCount) {
            $.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * @param evaluationCount The number of times that needs to satisfies comparison condition before transition into ALARM state. Defaults to 3.
         * 
         * @return builder
         * 
         */
        public Builder evaluationCount(Integer evaluationCount) {
            return evaluationCount(Output.of(evaluationCount));
        }

        /**
         * @param metricName The name for the alarm&#39;s associated metric. See Block_metricNames_and_dimensions below for details.
         * 
         * @return builder
         * 
         */
        public Builder metricName(@Nullable Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName The name for the alarm&#39;s associated metric. See Block_metricNames_and_dimensions below for details.
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param metricType The type for the alarm&#39;s associated metric. Supported value: system, custom. &#34;system&#34; means the metric data is collected by Aliyun Cloud Monitor Service(CMS), &#34;custom&#34; means the metric data is upload to CMS by users. Defaults to system.
         * 
         * @return builder
         * 
         */
        public Builder metricType(@Nullable Output<String> metricType) {
            $.metricType = metricType;
            return this;
        }

        /**
         * @param metricType The type for the alarm&#39;s associated metric. Supported value: system, custom. &#34;system&#34; means the metric data is collected by Aliyun Cloud Monitor Service(CMS), &#34;custom&#34; means the metric data is upload to CMS by users. Defaults to system.
         * 
         * @return builder
         * 
         */
        public Builder metricType(String metricType) {
            return metricType(Output.of(metricType));
        }

        /**
         * @param name The name for ess alarm.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for ess alarm.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param period The period in seconds over which the specified statistic is applied. Supported value: 60, 120, 300, 900. Defaults to 300.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The period in seconds over which the specified statistic is applied. Supported value: 60, 120, 300, 900. Defaults to 300.
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param scalingGroupId The scaling group associated with this alarm, the &#39;ForceNew&#39; attribute is available in 1.56.0+.
         * 
         * @return builder
         * 
         */
        public Builder scalingGroupId(@Nullable Output<String> scalingGroupId) {
            $.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * @param scalingGroupId The scaling group associated with this alarm, the &#39;ForceNew&#39; attribute is available in 1.56.0+.
         * 
         * @return builder
         * 
         */
        public Builder scalingGroupId(String scalingGroupId) {
            return scalingGroupId(Output.of(scalingGroupId));
        }

        /**
         * @param state The state of specified alarm.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of specified alarm.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param statistics The statistic to apply to the alarm&#39;s associated metric. Supported value: Average, Minimum, Maximum. Defaults to Average.
         * 
         * @return builder
         * 
         */
        public Builder statistics(@Nullable Output<String> statistics) {
            $.statistics = statistics;
            return this;
        }

        /**
         * @param statistics The statistic to apply to the alarm&#39;s associated metric. Supported value: Average, Minimum, Maximum. Defaults to Average.
         * 
         * @return builder
         * 
         */
        public Builder statistics(String statistics) {
            return statistics(Output.of(statistics));
        }

        /**
         * @param threshold The value against which the specified statistics is compared.
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<String> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold The value against which the specified statistics is compared.
         * 
         * @return builder
         * 
         */
        public Builder threshold(String threshold) {
            return threshold(Output.of(threshold));
        }

        public AlarmState build() {
            return $;
        }
    }

}
