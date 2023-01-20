// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDbInstancePlansPlanPlanConfigScaleIn {
    /**
     * @return The executed time of the Plan.
     * 
     */
    private String executeTime;
    /**
     * @return The Cron Time of the plan.
     * 
     */
    private String planCronTime;
    /**
     * @return The Status of the plan Task.
     * 
     */
    private String planTaskStatus;
    /**
     * @return The segment Node Num of the Plan.
     * 
     */
    private String segmentNodeNum;

    private GetDbInstancePlansPlanPlanConfigScaleIn() {}
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

    public static Builder builder(GetDbInstancePlansPlanPlanConfigScaleIn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String executeTime;
        private String planCronTime;
        private String planTaskStatus;
        private String segmentNodeNum;
        public Builder() {}
        public Builder(GetDbInstancePlansPlanPlanConfigScaleIn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeTime = defaults.executeTime;
    	      this.planCronTime = defaults.planCronTime;
    	      this.planTaskStatus = defaults.planTaskStatus;
    	      this.segmentNodeNum = defaults.segmentNodeNum;
        }

        @CustomType.Setter
        public Builder executeTime(String executeTime) {
            this.executeTime = Objects.requireNonNull(executeTime);
            return this;
        }
        @CustomType.Setter
        public Builder planCronTime(String planCronTime) {
            this.planCronTime = Objects.requireNonNull(planCronTime);
            return this;
        }
        @CustomType.Setter
        public Builder planTaskStatus(String planTaskStatus) {
            this.planTaskStatus = Objects.requireNonNull(planTaskStatus);
            return this;
        }
        @CustomType.Setter
        public Builder segmentNodeNum(String segmentNodeNum) {
            this.segmentNodeNum = Objects.requireNonNull(segmentNodeNum);
            return this;
        }
        public GetDbInstancePlansPlanPlanConfigScaleIn build() {
            final var o = new GetDbInstancePlansPlanPlanConfigScaleIn();
            o.executeTime = executeTime;
            o.planCronTime = planCronTime;
            o.planTaskStatus = planTaskStatus;
            o.segmentNodeNum = segmentNodeNum;
            return o;
        }
    }
}
