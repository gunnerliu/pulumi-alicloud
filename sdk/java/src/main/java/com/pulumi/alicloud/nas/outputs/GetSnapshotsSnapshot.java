// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnapshotsSnapshot {
    /**
     * @return The creation time of the resource.
     * 
     */
    private String createTime;
    /**
     * @return The description of the snapshot.
     * 
     */
    private String description;
    /**
     * @return The type of the encryption.
     * 
     */
    private Integer encryptType;
    /**
     * @return The ID of the Snapshot.
     * 
     */
    private String id;
    /**
     * @return The progress of the snapshot creation. The value of this parameter is expressed as a percentage.
     * 
     */
    private String progress;
    /**
     * @return The remaining time that is required to create the snapshot. Unit: seconds.
     * 
     */
    private Integer remainTime;
    /**
     * @return The retention period of the automatic snapshot. Unit: days.
     * 
     */
    private Integer retentionDays;
    /**
     * @return The ID of the resource.
     * 
     */
    private String snapshotId;
    /**
     * @return The name of the snapshot.
     * 
     */
    private String snapshotName;
    /**
     * @return The ID of the source file system.
     * 
     */
    private String sourceFileSystemId;
    /**
     * @return The capacity of the source file system. Unit: GiB.
     * 
     */
    private String sourceFileSystemSize;
    /**
     * @return The version of the source file system.
     * 
     */
    private String sourceFileSystemVersion;
    /**
     * @return The status of the snapshot.
     * 
     */
    private String status;

    private GetSnapshotsSnapshot() {}
    /**
     * @return The creation time of the resource.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of the snapshot.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The type of the encryption.
     * 
     */
    public Integer encryptType() {
        return this.encryptType;
    }
    /**
     * @return The ID of the Snapshot.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The progress of the snapshot creation. The value of this parameter is expressed as a percentage.
     * 
     */
    public String progress() {
        return this.progress;
    }
    /**
     * @return The remaining time that is required to create the snapshot. Unit: seconds.
     * 
     */
    public Integer remainTime() {
        return this.remainTime;
    }
    /**
     * @return The retention period of the automatic snapshot. Unit: days.
     * 
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }
    /**
     * @return The ID of the resource.
     * 
     */
    public String snapshotId() {
        return this.snapshotId;
    }
    /**
     * @return The name of the snapshot.
     * 
     */
    public String snapshotName() {
        return this.snapshotName;
    }
    /**
     * @return The ID of the source file system.
     * 
     */
    public String sourceFileSystemId() {
        return this.sourceFileSystemId;
    }
    /**
     * @return The capacity of the source file system. Unit: GiB.
     * 
     */
    public String sourceFileSystemSize() {
        return this.sourceFileSystemSize;
    }
    /**
     * @return The version of the source file system.
     * 
     */
    public String sourceFileSystemVersion() {
        return this.sourceFileSystemVersion;
    }
    /**
     * @return The status of the snapshot.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotsSnapshot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String description;
        private Integer encryptType;
        private String id;
        private String progress;
        private Integer remainTime;
        private Integer retentionDays;
        private String snapshotId;
        private String snapshotName;
        private String sourceFileSystemId;
        private String sourceFileSystemSize;
        private String sourceFileSystemVersion;
        private String status;
        public Builder() {}
        public Builder(GetSnapshotsSnapshot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.encryptType = defaults.encryptType;
    	      this.id = defaults.id;
    	      this.progress = defaults.progress;
    	      this.remainTime = defaults.remainTime;
    	      this.retentionDays = defaults.retentionDays;
    	      this.snapshotId = defaults.snapshotId;
    	      this.snapshotName = defaults.snapshotName;
    	      this.sourceFileSystemId = defaults.sourceFileSystemId;
    	      this.sourceFileSystemSize = defaults.sourceFileSystemSize;
    	      this.sourceFileSystemVersion = defaults.sourceFileSystemVersion;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder encryptType(Integer encryptType) {
            this.encryptType = Objects.requireNonNull(encryptType);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder progress(String progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }
        @CustomType.Setter
        public Builder remainTime(Integer remainTime) {
            this.remainTime = Objects.requireNonNull(remainTime);
            return this;
        }
        @CustomType.Setter
        public Builder retentionDays(Integer retentionDays) {
            this.retentionDays = Objects.requireNonNull(retentionDays);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotName(String snapshotName) {
            this.snapshotName = Objects.requireNonNull(snapshotName);
            return this;
        }
        @CustomType.Setter
        public Builder sourceFileSystemId(String sourceFileSystemId) {
            this.sourceFileSystemId = Objects.requireNonNull(sourceFileSystemId);
            return this;
        }
        @CustomType.Setter
        public Builder sourceFileSystemSize(String sourceFileSystemSize) {
            this.sourceFileSystemSize = Objects.requireNonNull(sourceFileSystemSize);
            return this;
        }
        @CustomType.Setter
        public Builder sourceFileSystemVersion(String sourceFileSystemVersion) {
            this.sourceFileSystemVersion = Objects.requireNonNull(sourceFileSystemVersion);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetSnapshotsSnapshot build() {
            final var _resultValue = new GetSnapshotsSnapshot();
            _resultValue.createTime = createTime;
            _resultValue.description = description;
            _resultValue.encryptType = encryptType;
            _resultValue.id = id;
            _resultValue.progress = progress;
            _resultValue.remainTime = remainTime;
            _resultValue.retentionDays = retentionDays;
            _resultValue.snapshotId = snapshotId;
            _resultValue.snapshotName = snapshotName;
            _resultValue.sourceFileSystemId = sourceFileSystemId;
            _resultValue.sourceFileSystemSize = sourceFileSystemSize;
            _resultValue.sourceFileSystemVersion = sourceFileSystemVersion;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
