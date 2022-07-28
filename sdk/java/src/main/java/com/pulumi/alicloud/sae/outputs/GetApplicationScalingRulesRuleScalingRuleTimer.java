// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.alicloud.sae.outputs.GetApplicationScalingRulesRuleScalingRuleTimerSchedule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationScalingRulesRuleScalingRuleTimer {
    /**
     * @return The short-term start date of the timed elastic scaling strategy.
     * 
     */
    private final String beginDate;
    /**
     * @return The short-term end date of the timed elastic scaling strategy.
     * 
     */
    private final String endDate;
    /**
     * @return The period in which a timed elastic scaling strategy is executed.
     * 
     */
    private final String period;
    /**
     * @return Trigger point in time within a single day.
     * 
     */
    private final List<GetApplicationScalingRulesRuleScalingRuleTimerSchedule> schedules;

    @CustomType.Constructor
    private GetApplicationScalingRulesRuleScalingRuleTimer(
        @CustomType.Parameter("beginDate") String beginDate,
        @CustomType.Parameter("endDate") String endDate,
        @CustomType.Parameter("period") String period,
        @CustomType.Parameter("schedules") List<GetApplicationScalingRulesRuleScalingRuleTimerSchedule> schedules) {
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.period = period;
        this.schedules = schedules;
    }

    /**
     * @return The short-term start date of the timed elastic scaling strategy.
     * 
     */
    public String beginDate() {
        return this.beginDate;
    }
    /**
     * @return The short-term end date of the timed elastic scaling strategy.
     * 
     */
    public String endDate() {
        return this.endDate;
    }
    /**
     * @return The period in which a timed elastic scaling strategy is executed.
     * 
     */
    public String period() {
        return this.period;
    }
    /**
     * @return Trigger point in time within a single day.
     * 
     */
    public List<GetApplicationScalingRulesRuleScalingRuleTimerSchedule> schedules() {
        return this.schedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationScalingRulesRuleScalingRuleTimer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String beginDate;
        private String endDate;
        private String period;
        private List<GetApplicationScalingRulesRuleScalingRuleTimerSchedule> schedules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationScalingRulesRuleScalingRuleTimer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beginDate = defaults.beginDate;
    	      this.endDate = defaults.endDate;
    	      this.period = defaults.period;
    	      this.schedules = defaults.schedules;
        }

        public Builder beginDate(String beginDate) {
            this.beginDate = Objects.requireNonNull(beginDate);
            return this;
        }
        public Builder endDate(String endDate) {
            this.endDate = Objects.requireNonNull(endDate);
            return this;
        }
        public Builder period(String period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }
        public Builder schedules(List<GetApplicationScalingRulesRuleScalingRuleTimerSchedule> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }
        public Builder schedules(GetApplicationScalingRulesRuleScalingRuleTimerSchedule... schedules) {
            return schedules(List.of(schedules));
        }        public GetApplicationScalingRulesRuleScalingRuleTimer build() {
            return new GetApplicationScalingRulesRuleScalingRuleTimer(beginDate, endDate, period, schedules);
        }
    }
}
