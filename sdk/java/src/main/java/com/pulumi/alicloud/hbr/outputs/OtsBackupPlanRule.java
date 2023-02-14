// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OtsBackupPlanRule {
    /**
     * @return Backup type. Valid values: `COMPLETE`.
     * 
     */
    private @Nullable String backupType;
    /**
     * @return Whether to disable the backup task. Valid values: `true`, `false`. Default values: `false`.
     * 
     */
    private @Nullable Boolean disabled;
    /**
     * @return Backup retention days, the minimum is 1.
     * 
     */
    private @Nullable String retention;
    /**
     * @return The name of the backup rule.**Note:** Required while source_type equals `OTS_TABLE`. `rule_name` should be unique for the specific user.
     * 
     */
    private @Nullable String ruleName;
    /**
     * @return Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     * 
     */
    private @Nullable String schedule;

    private OtsBackupPlanRule() {}
    /**
     * @return Backup type. Valid values: `COMPLETE`.
     * 
     */
    public Optional<String> backupType() {
        return Optional.ofNullable(this.backupType);
    }
    /**
     * @return Whether to disable the backup task. Valid values: `true`, `false`. Default values: `false`.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return Backup retention days, the minimum is 1.
     * 
     */
    public Optional<String> retention() {
        return Optional.ofNullable(this.retention);
    }
    /**
     * @return The name of the backup rule.**Note:** Required while source_type equals `OTS_TABLE`. `rule_name` should be unique for the specific user.
     * 
     */
    public Optional<String> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }
    /**
     * @return Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     * 
     */
    public Optional<String> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OtsBackupPlanRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String backupType;
        private @Nullable Boolean disabled;
        private @Nullable String retention;
        private @Nullable String ruleName;
        private @Nullable String schedule;
        public Builder() {}
        public Builder(OtsBackupPlanRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupType = defaults.backupType;
    	      this.disabled = defaults.disabled;
    	      this.retention = defaults.retention;
    	      this.ruleName = defaults.ruleName;
    	      this.schedule = defaults.schedule;
        }

        @CustomType.Setter
        public Builder backupType(@Nullable String backupType) {
            this.backupType = backupType;
            return this;
        }
        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder retention(@Nullable String retention) {
            this.retention = retention;
            return this;
        }
        @CustomType.Setter
        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        @CustomType.Setter
        public Builder schedule(@Nullable String schedule) {
            this.schedule = schedule;
            return this;
        }
        public OtsBackupPlanRule build() {
            final var o = new OtsBackupPlanRule();
            o.backupType = backupType;
            o.disabled = disabled;
            o.retention = retention;
            o.ruleName = ruleName;
            o.schedule = schedule;
            return o;
        }
    }
}