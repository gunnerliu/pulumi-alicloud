// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DbInstancePlanPlanConfigScaleOut {
    /**
     * @return The executed time of the Plan.
     * 
     */
    private final @Nullable String executeTime;
    /**
     * @return The Cron Time of the plan.
     * 
     */
    private final @Nullable String planCronTime;
    /**
     * @return The segment Node Num of the Plan.
     * 
     */
    private final @Nullable String segmentNodeNum;

    @CustomType.Constructor
    private DbInstancePlanPlanConfigScaleOut(
        @CustomType.Parameter("executeTime") @Nullable String executeTime,
        @CustomType.Parameter("planCronTime") @Nullable String planCronTime,
        @CustomType.Parameter("segmentNodeNum") @Nullable String segmentNodeNum) {
        this.executeTime = executeTime;
        this.planCronTime = planCronTime;
        this.segmentNodeNum = segmentNodeNum;
    }

    /**
     * @return The executed time of the Plan.
     * 
     */
    public Optional<String> executeTime() {
        return Optional.ofNullable(this.executeTime);
    }
    /**
     * @return The Cron Time of the plan.
     * 
     */
    public Optional<String> planCronTime() {
        return Optional.ofNullable(this.planCronTime);
    }
    /**
     * @return The segment Node Num of the Plan.
     * 
     */
    public Optional<String> segmentNodeNum() {
        return Optional.ofNullable(this.segmentNodeNum);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DbInstancePlanPlanConfigScaleOut defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String executeTime;
        private @Nullable String planCronTime;
        private @Nullable String segmentNodeNum;

        public Builder() {
    	      // Empty
        }

        public Builder(DbInstancePlanPlanConfigScaleOut defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeTime = defaults.executeTime;
    	      this.planCronTime = defaults.planCronTime;
    	      this.segmentNodeNum = defaults.segmentNodeNum;
        }

        public Builder executeTime(@Nullable String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Builder planCronTime(@Nullable String planCronTime) {
            this.planCronTime = planCronTime;
            return this;
        }
        public Builder segmentNodeNum(@Nullable String segmentNodeNum) {
            this.segmentNodeNum = segmentNodeNum;
            return this;
        }        public DbInstancePlanPlanConfigScaleOut build() {
            return new DbInstancePlanPlanConfigScaleOut(executeTime, planCronTime, segmentNodeNum);
        }
    }
}
