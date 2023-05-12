// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAutoSnapshotPoliciesPolicy {
    /**
     * @return The ID of the automatic snapshot policy.
     * 
     */
    private final String autoSnapshotPolicyId;
    /**
     * @return The name of the automatic snapshot policy.
     * 
     */
    private final String autoSnapshotPolicyName;
    /**
     * @return The time when the automatic snapshot policy was created.
     * 
     */
    private final String createTime;
    /**
     * @return The number of file systems to which the automatic snapshot policy applies.
     * 
     */
    private final Integer fileSystemNums;
    /**
     * @return ID of the Auto Snapshot Policy.
     * 
     */
    private final String id;
    /**
     * @return The day on which an auto snapshot was created.
     * 
     */
    private final List<String> repeatWeekdays;
    /**
     * @return The number of days for which you want to retain auto snapshots.
     * 
     */
    private final Integer retentionDays;
    /**
     * @return The status of the automatic snapshot policy. Valid values: `Creating`, `Available`.
     * 
     */
    private final String status;
    /**
     * @return The point in time at which an auto snapshot was created. Unit: hours.
     * 
     */
    private final List<String> timePoints;

    @CustomType.Constructor
    private GetAutoSnapshotPoliciesPolicy(
        @CustomType.Parameter("autoSnapshotPolicyId") String autoSnapshotPolicyId,
        @CustomType.Parameter("autoSnapshotPolicyName") String autoSnapshotPolicyName,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("fileSystemNums") Integer fileSystemNums,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("repeatWeekdays") List<String> repeatWeekdays,
        @CustomType.Parameter("retentionDays") Integer retentionDays,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("timePoints") List<String> timePoints) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        this.autoSnapshotPolicyName = autoSnapshotPolicyName;
        this.createTime = createTime;
        this.fileSystemNums = fileSystemNums;
        this.id = id;
        this.repeatWeekdays = repeatWeekdays;
        this.retentionDays = retentionDays;
        this.status = status;
        this.timePoints = timePoints;
    }

    /**
     * @return The ID of the automatic snapshot policy.
     * 
     */
    public String autoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }
    /**
     * @return The name of the automatic snapshot policy.
     * 
     */
    public String autoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }
    /**
     * @return The time when the automatic snapshot policy was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The number of file systems to which the automatic snapshot policy applies.
     * 
     */
    public Integer fileSystemNums() {
        return this.fileSystemNums;
    }
    /**
     * @return ID of the Auto Snapshot Policy.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The day on which an auto snapshot was created.
     * 
     */
    public List<String> repeatWeekdays() {
        return this.repeatWeekdays;
    }
    /**
     * @return The number of days for which you want to retain auto snapshots.
     * 
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }
    /**
     * @return The status of the automatic snapshot policy. Valid values: `Creating`, `Available`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The point in time at which an auto snapshot was created. Unit: hours.
     * 
     */
    public List<String> timePoints() {
        return this.timePoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutoSnapshotPoliciesPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoSnapshotPolicyId;
        private String autoSnapshotPolicyName;
        private String createTime;
        private Integer fileSystemNums;
        private String id;
        private List<String> repeatWeekdays;
        private Integer retentionDays;
        private String status;
        private List<String> timePoints;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutoSnapshotPoliciesPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoSnapshotPolicyId = defaults.autoSnapshotPolicyId;
    	      this.autoSnapshotPolicyName = defaults.autoSnapshotPolicyName;
    	      this.createTime = defaults.createTime;
    	      this.fileSystemNums = defaults.fileSystemNums;
    	      this.id = defaults.id;
    	      this.repeatWeekdays = defaults.repeatWeekdays;
    	      this.retentionDays = defaults.retentionDays;
    	      this.status = defaults.status;
    	      this.timePoints = defaults.timePoints;
        }

        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = Objects.requireNonNull(autoSnapshotPolicyId);
            return this;
        }
        public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
            this.autoSnapshotPolicyName = Objects.requireNonNull(autoSnapshotPolicyName);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder fileSystemNums(Integer fileSystemNums) {
            this.fileSystemNums = Objects.requireNonNull(fileSystemNums);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder repeatWeekdays(List<String> repeatWeekdays) {
            this.repeatWeekdays = Objects.requireNonNull(repeatWeekdays);
            return this;
        }
        public Builder repeatWeekdays(String... repeatWeekdays) {
            return repeatWeekdays(List.of(repeatWeekdays));
        }
        public Builder retentionDays(Integer retentionDays) {
            this.retentionDays = Objects.requireNonNull(retentionDays);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder timePoints(List<String> timePoints) {
            this.timePoints = Objects.requireNonNull(timePoints);
            return this;
        }
        public Builder timePoints(String... timePoints) {
            return timePoints(List.of(timePoints));
        }        public GetAutoSnapshotPoliciesPolicy build() {
            return new GetAutoSnapshotPoliciesPolicy(autoSnapshotPolicyId, autoSnapshotPolicyName, createTime, fileSystemNums, id, repeatWeekdays, retentionDays, status, timePoints);
        }
    }
}
