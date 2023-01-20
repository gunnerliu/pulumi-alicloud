// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.outputs;

import com.pulumi.alicloud.gpdb.outputs.GetDbInstancePlansPlanPlanConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDbInstancePlansPlan {
    /**
     * @return The name of the Plan.
     * 
     */
    private String dbInstancePlanName;
    /**
     * @return The ID of the resource. The value formats as `&lt;db_instance_id&gt;:&lt;plan_id&gt;`.
     * 
     */
    private String id;
    /**
     * @return Plan configuration information.
     * 
     */
    private List<GetDbInstancePlansPlanPlanConfig> planConfigs;
    private String planDesc;
    /**
     * @return The end time of the Plan.
     * 
     */
    private String planEndDate;
    /**
     * @return The ID of DB Instance Plan.
     * 
     */
    private String planId;
    /**
     * @return Plan scheduling type. Valid values: `Postpone`, `Regular`.
     * 
     */
    private String planScheduleType;
    /**
     * @return The start time of the Plan.
     * 
     */
    private String planStartDate;
    /**
     * @return The type of the Plan. Valid values: `PauseResume`, `Resize`.
     * 
     */
    private String planType;
    /**
     * @return The Status of the Plan.
     * 
     */
    private String status;

    private GetDbInstancePlansPlan() {}
    /**
     * @return The name of the Plan.
     * 
     */
    public String dbInstancePlanName() {
        return this.dbInstancePlanName;
    }
    /**
     * @return The ID of the resource. The value formats as `&lt;db_instance_id&gt;:&lt;plan_id&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Plan configuration information.
     * 
     */
    public List<GetDbInstancePlansPlanPlanConfig> planConfigs() {
        return this.planConfigs;
    }
    public String planDesc() {
        return this.planDesc;
    }
    /**
     * @return The end time of the Plan.
     * 
     */
    public String planEndDate() {
        return this.planEndDate;
    }
    /**
     * @return The ID of DB Instance Plan.
     * 
     */
    public String planId() {
        return this.planId;
    }
    /**
     * @return Plan scheduling type. Valid values: `Postpone`, `Regular`.
     * 
     */
    public String planScheduleType() {
        return this.planScheduleType;
    }
    /**
     * @return The start time of the Plan.
     * 
     */
    public String planStartDate() {
        return this.planStartDate;
    }
    /**
     * @return The type of the Plan. Valid values: `PauseResume`, `Resize`.
     * 
     */
    public String planType() {
        return this.planType;
    }
    /**
     * @return The Status of the Plan.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDbInstancePlansPlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dbInstancePlanName;
        private String id;
        private List<GetDbInstancePlansPlanPlanConfig> planConfigs;
        private String planDesc;
        private String planEndDate;
        private String planId;
        private String planScheduleType;
        private String planStartDate;
        private String planType;
        private String status;
        public Builder() {}
        public Builder(GetDbInstancePlansPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbInstancePlanName = defaults.dbInstancePlanName;
    	      this.id = defaults.id;
    	      this.planConfigs = defaults.planConfigs;
    	      this.planDesc = defaults.planDesc;
    	      this.planEndDate = defaults.planEndDate;
    	      this.planId = defaults.planId;
    	      this.planScheduleType = defaults.planScheduleType;
    	      this.planStartDate = defaults.planStartDate;
    	      this.planType = defaults.planType;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder dbInstancePlanName(String dbInstancePlanName) {
            this.dbInstancePlanName = Objects.requireNonNull(dbInstancePlanName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder planConfigs(List<GetDbInstancePlansPlanPlanConfig> planConfigs) {
            this.planConfigs = Objects.requireNonNull(planConfigs);
            return this;
        }
        public Builder planConfigs(GetDbInstancePlansPlanPlanConfig... planConfigs) {
            return planConfigs(List.of(planConfigs));
        }
        @CustomType.Setter
        public Builder planDesc(String planDesc) {
            this.planDesc = Objects.requireNonNull(planDesc);
            return this;
        }
        @CustomType.Setter
        public Builder planEndDate(String planEndDate) {
            this.planEndDate = Objects.requireNonNull(planEndDate);
            return this;
        }
        @CustomType.Setter
        public Builder planId(String planId) {
            this.planId = Objects.requireNonNull(planId);
            return this;
        }
        @CustomType.Setter
        public Builder planScheduleType(String planScheduleType) {
            this.planScheduleType = Objects.requireNonNull(planScheduleType);
            return this;
        }
        @CustomType.Setter
        public Builder planStartDate(String planStartDate) {
            this.planStartDate = Objects.requireNonNull(planStartDate);
            return this;
        }
        @CustomType.Setter
        public Builder planType(String planType) {
            this.planType = Objects.requireNonNull(planType);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetDbInstancePlansPlan build() {
            final var o = new GetDbInstancePlansPlan();
            o.dbInstancePlanName = dbInstancePlanName;
            o.id = id;
            o.planConfigs = planConfigs;
            o.planDesc = planDesc;
            o.planEndDate = planEndDate;
            o.planId = planId;
            o.planScheduleType = planScheduleType;
            o.planStartDate = planStartDate;
            o.planType = planType;
            o.status = status;
            return o;
        }
    }
}
