// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertSchedule {
    /**
     * @return Cron expression when type is Cron.
     * 
     */
    private final @Nullable String cronExpression;
    /**
     * @return Day of week when type is Weekly, including 0,1,2,3,4,5,6, 0 for Sunday, 1 for Monday
     * 
     */
    private final @Nullable Integer dayOfWeek;
    private final @Nullable Integer delay;
    /**
     * @return Hour of day when type is Weekly/Daily.
     * 
     */
    private final @Nullable Integer hour;
    /**
     * @return Execution interval. 60 seconds minimum, such as 60s, 1h. used when type is FixedRate.
     * 
     */
    private final @Nullable String interval;
    private final @Nullable Boolean runImmediately;
    /**
     * @return Time zone for schedule.
     * 
     */
    private final @Nullable String timeZone;
    /**
     * @return including FixedRate,Hourly,Daily,Weekly,Cron.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AlertSchedule(
        @CustomType.Parameter("cronExpression") @Nullable String cronExpression,
        @CustomType.Parameter("dayOfWeek") @Nullable Integer dayOfWeek,
        @CustomType.Parameter("delay") @Nullable Integer delay,
        @CustomType.Parameter("hour") @Nullable Integer hour,
        @CustomType.Parameter("interval") @Nullable String interval,
        @CustomType.Parameter("runImmediately") @Nullable Boolean runImmediately,
        @CustomType.Parameter("timeZone") @Nullable String timeZone,
        @CustomType.Parameter("type") String type) {
        this.cronExpression = cronExpression;
        this.dayOfWeek = dayOfWeek;
        this.delay = delay;
        this.hour = hour;
        this.interval = interval;
        this.runImmediately = runImmediately;
        this.timeZone = timeZone;
        this.type = type;
    }

    /**
     * @return Cron expression when type is Cron.
     * 
     */
    public Optional<String> cronExpression() {
        return Optional.ofNullable(this.cronExpression);
    }
    /**
     * @return Day of week when type is Weekly, including 0,1,2,3,4,5,6, 0 for Sunday, 1 for Monday
     * 
     */
    public Optional<Integer> dayOfWeek() {
        return Optional.ofNullable(this.dayOfWeek);
    }
    public Optional<Integer> delay() {
        return Optional.ofNullable(this.delay);
    }
    /**
     * @return Hour of day when type is Weekly/Daily.
     * 
     */
    public Optional<Integer> hour() {
        return Optional.ofNullable(this.hour);
    }
    /**
     * @return Execution interval. 60 seconds minimum, such as 60s, 1h. used when type is FixedRate.
     * 
     */
    public Optional<String> interval() {
        return Optional.ofNullable(this.interval);
    }
    public Optional<Boolean> runImmediately() {
        return Optional.ofNullable(this.runImmediately);
    }
    /**
     * @return Time zone for schedule.
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }
    /**
     * @return including FixedRate,Hourly,Daily,Weekly,Cron.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cronExpression;
        private @Nullable Integer dayOfWeek;
        private @Nullable Integer delay;
        private @Nullable Integer hour;
        private @Nullable String interval;
        private @Nullable Boolean runImmediately;
        private @Nullable String timeZone;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronExpression = defaults.cronExpression;
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.delay = defaults.delay;
    	      this.hour = defaults.hour;
    	      this.interval = defaults.interval;
    	      this.runImmediately = defaults.runImmediately;
    	      this.timeZone = defaults.timeZone;
    	      this.type = defaults.type;
        }

        public Builder cronExpression(@Nullable String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public Builder dayOfWeek(@Nullable Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Builder delay(@Nullable Integer delay) {
            this.delay = delay;
            return this;
        }
        public Builder hour(@Nullable Integer hour) {
            this.hour = hour;
            return this;
        }
        public Builder interval(@Nullable String interval) {
            this.interval = interval;
            return this;
        }
        public Builder runImmediately(@Nullable Boolean runImmediately) {
            this.runImmediately = runImmediately;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AlertSchedule build() {
            return new AlertSchedule(cronExpression, dayOfWeek, delay, hour, interval, runImmediately, timeZone, type);
        }
    }
}
