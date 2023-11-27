// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DbInstancePlanPlanConfigPause {
    /**
     * @return The executed time of the Plan.
     * 
     */
    private @Nullable String executeTime;
    /**
     * @return The Cron Time of the plan.
     * 
     */
    private @Nullable String planCronTime;

    private DbInstancePlanPlanConfigPause() {}
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DbInstancePlanPlanConfigPause defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String executeTime;
        private @Nullable String planCronTime;
        public Builder() {}
        public Builder(DbInstancePlanPlanConfigPause defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeTime = defaults.executeTime;
    	      this.planCronTime = defaults.planCronTime;
        }

        @CustomType.Setter
        public Builder executeTime(@Nullable String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        @CustomType.Setter
        public Builder planCronTime(@Nullable String planCronTime) {
            this.planCronTime = planCronTime;
            return this;
        }
        public DbInstancePlanPlanConfigPause build() {
            final var _resultValue = new DbInstancePlanPlanConfigPause();
            _resultValue.executeTime = executeTime;
            _resultValue.planCronTime = planCronTime;
            return _resultValue;
        }
    }
}
