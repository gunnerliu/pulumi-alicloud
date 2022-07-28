// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoSnapshotPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final AutoSnapshotPolicyState Empty = new AutoSnapshotPolicyState();

    /**
     * The name of the automatic snapshot policy. Limits:
     * - The name must be `2` to `128` characters in length,
     * - The name must start with a letter.
     * - The name can contain digits, colons (:), underscores (_), and hyphens (-). The name cannot start with `http://` or `https://`.
     * - The value of this parameter is empty by default.
     * 
     */
    @Import(name="autoSnapshotPolicyName")
    private @Nullable Output<String> autoSnapshotPolicyName;

    /**
     * @return The name of the automatic snapshot policy. Limits:
     * - The name must be `2` to `128` characters in length,
     * - The name must start with a letter.
     * - The name can contain digits, colons (:), underscores (_), and hyphens (-). The name cannot start with `http://` or `https://`.
     * - The value of this parameter is empty by default.
     * 
     */
    public Optional<Output<String>> autoSnapshotPolicyName() {
        return Optional.ofNullable(this.autoSnapshotPolicyName);
    }

    /**
     * The day on which an auto snapshot is created.
     * - A maximum of 7 time points can be selected.
     * - The format is  an JSON array of [&#34;1&#34;, &#34;2&#34;, … &#34;7&#34;]  and the time points are separated by commas (,).
     * 
     */
    @Import(name="repeatWeekdays")
    private @Nullable Output<List<String>> repeatWeekdays;

    /**
     * @return The day on which an auto snapshot is created.
     * - A maximum of 7 time points can be selected.
     * - The format is  an JSON array of [&#34;1&#34;, &#34;2&#34;, … &#34;7&#34;]  and the time points are separated by commas (,).
     * 
     */
    public Optional<Output<List<String>>> repeatWeekdays() {
        return Optional.ofNullable(this.repeatWeekdays);
    }

    /**
     * The number of days for which you want to retain auto snapshots. Unit: days. Valid values:
     * - `-1`: the default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
     * 
     */
    @Import(name="retentionDays")
    private @Nullable Output<Integer> retentionDays;

    /**
     * @return The number of days for which you want to retain auto snapshots. Unit: days. Valid values:
     * - `-1`: the default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
     * 
     */
    public Optional<Output<Integer>> retentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }

    /**
     * The status of the automatic snapshot policy.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the automatic snapshot policy.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The point in time at which an auto snapshot is created.
     * - A maximum of 24 time points can be selected.
     * - The format is  an JSON array of [&#34;0&#34;, &#34;1&#34;, … &#34;23&#34;] and the time points are separated by commas (,).
     * 
     */
    @Import(name="timePoints")
    private @Nullable Output<List<String>> timePoints;

    /**
     * @return The point in time at which an auto snapshot is created.
     * - A maximum of 24 time points can be selected.
     * - The format is  an JSON array of [&#34;0&#34;, &#34;1&#34;, … &#34;23&#34;] and the time points are separated by commas (,).
     * 
     */
    public Optional<Output<List<String>>> timePoints() {
        return Optional.ofNullable(this.timePoints);
    }

    private AutoSnapshotPolicyState() {}

    private AutoSnapshotPolicyState(AutoSnapshotPolicyState $) {
        this.autoSnapshotPolicyName = $.autoSnapshotPolicyName;
        this.repeatWeekdays = $.repeatWeekdays;
        this.retentionDays = $.retentionDays;
        this.status = $.status;
        this.timePoints = $.timePoints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoSnapshotPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoSnapshotPolicyState $;

        public Builder() {
            $ = new AutoSnapshotPolicyState();
        }

        public Builder(AutoSnapshotPolicyState defaults) {
            $ = new AutoSnapshotPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoSnapshotPolicyName The name of the automatic snapshot policy. Limits:
         * - The name must be `2` to `128` characters in length,
         * - The name must start with a letter.
         * - The name can contain digits, colons (:), underscores (_), and hyphens (-). The name cannot start with `http://` or `https://`.
         * - The value of this parameter is empty by default.
         * 
         * @return builder
         * 
         */
        public Builder autoSnapshotPolicyName(@Nullable Output<String> autoSnapshotPolicyName) {
            $.autoSnapshotPolicyName = autoSnapshotPolicyName;
            return this;
        }

        /**
         * @param autoSnapshotPolicyName The name of the automatic snapshot policy. Limits:
         * - The name must be `2` to `128` characters in length,
         * - The name must start with a letter.
         * - The name can contain digits, colons (:), underscores (_), and hyphens (-). The name cannot start with `http://` or `https://`.
         * - The value of this parameter is empty by default.
         * 
         * @return builder
         * 
         */
        public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
            return autoSnapshotPolicyName(Output.of(autoSnapshotPolicyName));
        }

        /**
         * @param repeatWeekdays The day on which an auto snapshot is created.
         * - A maximum of 7 time points can be selected.
         * - The format is  an JSON array of [&#34;1&#34;, &#34;2&#34;, … &#34;7&#34;]  and the time points are separated by commas (,).
         * 
         * @return builder
         * 
         */
        public Builder repeatWeekdays(@Nullable Output<List<String>> repeatWeekdays) {
            $.repeatWeekdays = repeatWeekdays;
            return this;
        }

        /**
         * @param repeatWeekdays The day on which an auto snapshot is created.
         * - A maximum of 7 time points can be selected.
         * - The format is  an JSON array of [&#34;1&#34;, &#34;2&#34;, … &#34;7&#34;]  and the time points are separated by commas (,).
         * 
         * @return builder
         * 
         */
        public Builder repeatWeekdays(List<String> repeatWeekdays) {
            return repeatWeekdays(Output.of(repeatWeekdays));
        }

        /**
         * @param repeatWeekdays The day on which an auto snapshot is created.
         * - A maximum of 7 time points can be selected.
         * - The format is  an JSON array of [&#34;1&#34;, &#34;2&#34;, … &#34;7&#34;]  and the time points are separated by commas (,).
         * 
         * @return builder
         * 
         */
        public Builder repeatWeekdays(String... repeatWeekdays) {
            return repeatWeekdays(List.of(repeatWeekdays));
        }

        /**
         * @param retentionDays The number of days for which you want to retain auto snapshots. Unit: days. Valid values:
         * - `-1`: the default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
         * 
         * @return builder
         * 
         */
        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            $.retentionDays = retentionDays;
            return this;
        }

        /**
         * @param retentionDays The number of days for which you want to retain auto snapshots. Unit: days. Valid values:
         * - `-1`: the default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
         * 
         * @return builder
         * 
         */
        public Builder retentionDays(Integer retentionDays) {
            return retentionDays(Output.of(retentionDays));
        }

        /**
         * @param status The status of the automatic snapshot policy.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the automatic snapshot policy.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param timePoints The point in time at which an auto snapshot is created.
         * - A maximum of 24 time points can be selected.
         * - The format is  an JSON array of [&#34;0&#34;, &#34;1&#34;, … &#34;23&#34;] and the time points are separated by commas (,).
         * 
         * @return builder
         * 
         */
        public Builder timePoints(@Nullable Output<List<String>> timePoints) {
            $.timePoints = timePoints;
            return this;
        }

        /**
         * @param timePoints The point in time at which an auto snapshot is created.
         * - A maximum of 24 time points can be selected.
         * - The format is  an JSON array of [&#34;0&#34;, &#34;1&#34;, … &#34;23&#34;] and the time points are separated by commas (,).
         * 
         * @return builder
         * 
         */
        public Builder timePoints(List<String> timePoints) {
            return timePoints(Output.of(timePoints));
        }

        /**
         * @param timePoints The point in time at which an auto snapshot is created.
         * - A maximum of 24 time points can be selected.
         * - The format is  an JSON array of [&#34;0&#34;, &#34;1&#34;, … &#34;23&#34;] and the time points are separated by commas (,).
         * 
         * @return builder
         * 
         */
        public Builder timePoints(String... timePoints) {
            return timePoints(List.of(timePoints));
        }

        public AutoSnapshotPolicyState build() {
            return $;
        }
    }

}
