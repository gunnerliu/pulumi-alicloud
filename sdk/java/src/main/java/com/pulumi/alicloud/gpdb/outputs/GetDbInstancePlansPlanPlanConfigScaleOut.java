// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDbInstancePlansPlanPlanConfigScaleOut {
    /**
     * @return The executed time of the Plan.
     * 
     */
    private final String executeTime;
    /**
     * @return The Cron Time of the plan.
     * 
     */
    private final String planCronTime;
    /**
     * @return The Status of the plan Task.
     * 
     */
    private final String planTaskStatus;
    /**
     * @return The segment Node Num of the Plan.
     * 
     */
    private final String segmentNodeNum;

    @CustomType.Constructor
    private GetDbInstancePlansPlanPlanConfigScaleOut(
        @CustomType.Parameter("executeTime") String executeTime,
        @CustomType.Parameter("planCronTime") String planCronTime,
        @CustomType.Parameter("planTaskStatus") String planTaskStatus,
        @CustomType.Parameter("segmentNodeNum") String segmentNodeNum) {
        this.executeTime = executeTime;
        this.planCronTime = planCronTime;
        this.planTaskStatus = planTaskStatus;
        this.segmentNodeNum = segmentNodeNum;
    }

    /**
     * @return The executed time of the Plan.
     * 
     */
    public String executeTime() {
        return this.executeTime;
    }
    /**
     * @return The Cron Time of the plan.
     * 
     */
    public String planCronTime() {
        return this.planCronTime;
    }
    /**
     * @return The Status of the plan Task.
     * 
     */
    public String planTaskStatus() {
        return this.planTaskStatus;
    }
    /**
     * @return The segment Node Num of the Plan.
     * 
     */
    public String segmentNodeNum() {
        return this.segmentNodeNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDbInstancePlansPlanPlanConfigScaleOut defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executeTime;
        private String planCronTime;
        private String planTaskStatus;
        private String segmentNodeNum;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDbInstancePlansPlanPlanConfigScaleOut defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeTime = defaults.executeTime;
    	      this.planCronTime = defaults.planCronTime;
    	      this.planTaskStatus = defaults.planTaskStatus;
    	      this.segmentNodeNum = defaults.segmentNodeNum;
        }

        public Builder executeTime(String executeTime) {
            this.executeTime = Objects.requireNonNull(executeTime);
            return this;
        }
        public Builder planCronTime(String planCronTime) {
            this.planCronTime = Objects.requireNonNull(planCronTime);
            return this;
        }
        public Builder planTaskStatus(String planTaskStatus) {
            this.planTaskStatus = Objects.requireNonNull(planTaskStatus);
            return this;
        }
        public Builder segmentNodeNum(String segmentNodeNum) {
            this.segmentNodeNum = Objects.requireNonNull(segmentNodeNum);
            return this;
        }        public GetDbInstancePlansPlanPlanConfigScaleOut build() {
            return new GetDbInstancePlansPlanPlanConfigScaleOut(executeTime, planCronTime, planTaskStatus, segmentNodeNum);
        }
    }
}
