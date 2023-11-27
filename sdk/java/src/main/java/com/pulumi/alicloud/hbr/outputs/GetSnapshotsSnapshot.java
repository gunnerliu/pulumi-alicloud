// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnapshotsSnapshot {
    /**
     * @return The actual data volume of the snapshot. Unit byte.
     * 
     */
    private String actualBytes;
    /**
     * @return The actual number of items in the snapshot. (Currently only file backup is available).
     * 
     */
    private String actualItems;
    /**
     * @return Backup type. Possible values: `COMPLETE` (full backup).
     * 
     */
    private String backupType;
    /**
     * @return The name of OSS bucket.
     * 
     */
    private String bucket;
    /**
     * @return The incremental amount of backup data. Unit byte.
     * 
     */
    private String bytesDone;
    /**
     * @return The total amount of data sources. Unit byte.
     * 
     */
    private String bytesTotal;
    /**
     * @return The ID of ECS backup client.
     * 
     */
    private String clientId;
    /**
     * @return The time when the snapshot completed. UNIX time in seconds.
     * 
     */
    private String completeTime;
    /**
     * @return File System Creation Time of Nas. Unix Time Seconds.
     * 
     */
    private String createTime;
    /**
     * @return Snapshot creation time. UNIX time in seconds.
     * 
     */
    private String createdTime;
    private String errorFile;
    /**
     * @return The ID of NAS File system.
     * 
     */
    private String fileSystemId;
    /**
     * @return The ID of the Snapshot.
     * 
     */
    private String id;
    /**
     * @return The ID of ECS instance.
     * 
     */
    private String instanceId;
    /**
     * @return The number of backup items. (Currently only file backup is available).
     * 
     */
    private String itemsDone;
    /**
     * @return The total number of data source items. (Currently only file backup is available).
     * 
     */
    private String itemsTotal;
    /**
     * @return The job ID of backup task.
     * 
     */
    private String jobId;
    /**
     * @return The hashcode of parent backup snapshot.
     * 
     */
    private String parentSnapshotHash;
    /**
     * @return Backup Path.
     * 
     */
    private String path;
    /**
     * @return Backup file prefix.
     * 
     */
    private String prefix;
    /**
     * @return The number of days to keep.
     * 
     */
    private String retention;
    /**
     * @return The hashcode of Snapshot.
     * 
     */
    private String snapshotHash;
    /**
     * @return The ID of the Snapshot.
     * 
     */
    private String snapshotId;
    /**
     * @return Data source type, optional values: `ECS_FILE`, `OSS`, `NAS`.
     * 
     */
    private String sourceType;
    /**
     * @return The start time of the snapshot. UNIX time in seconds.
     * 
     */
    private String startTime;
    /**
     * @return The status of snapshot execution. Possible values: `COMPLETE`, `PARTIAL_COMPLETE`, `FAILED`.
     * 
     */
    private String status;
    /**
     * @return The update time of snapshot. UNIX time in seconds.
     * 
     */
    private String updatedTime;

    private GetSnapshotsSnapshot() {}
    /**
     * @return The actual data volume of the snapshot. Unit byte.
     * 
     */
    public String actualBytes() {
        return this.actualBytes;
    }
    /**
     * @return The actual number of items in the snapshot. (Currently only file backup is available).
     * 
     */
    public String actualItems() {
        return this.actualItems;
    }
    /**
     * @return Backup type. Possible values: `COMPLETE` (full backup).
     * 
     */
    public String backupType() {
        return this.backupType;
    }
    /**
     * @return The name of OSS bucket.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return The incremental amount of backup data. Unit byte.
     * 
     */
    public String bytesDone() {
        return this.bytesDone;
    }
    /**
     * @return The total amount of data sources. Unit byte.
     * 
     */
    public String bytesTotal() {
        return this.bytesTotal;
    }
    /**
     * @return The ID of ECS backup client.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The time when the snapshot completed. UNIX time in seconds.
     * 
     */
    public String completeTime() {
        return this.completeTime;
    }
    /**
     * @return File System Creation Time of Nas. Unix Time Seconds.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Snapshot creation time. UNIX time in seconds.
     * 
     */
    public String createdTime() {
        return this.createdTime;
    }
    public String errorFile() {
        return this.errorFile;
    }
    /**
     * @return The ID of NAS File system.
     * 
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }
    /**
     * @return The ID of the Snapshot.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of ECS instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The number of backup items. (Currently only file backup is available).
     * 
     */
    public String itemsDone() {
        return this.itemsDone;
    }
    /**
     * @return The total number of data source items. (Currently only file backup is available).
     * 
     */
    public String itemsTotal() {
        return this.itemsTotal;
    }
    /**
     * @return The job ID of backup task.
     * 
     */
    public String jobId() {
        return this.jobId;
    }
    /**
     * @return The hashcode of parent backup snapshot.
     * 
     */
    public String parentSnapshotHash() {
        return this.parentSnapshotHash;
    }
    /**
     * @return Backup Path.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Backup file prefix.
     * 
     */
    public String prefix() {
        return this.prefix;
    }
    /**
     * @return The number of days to keep.
     * 
     */
    public String retention() {
        return this.retention;
    }
    /**
     * @return The hashcode of Snapshot.
     * 
     */
    public String snapshotHash() {
        return this.snapshotHash;
    }
    /**
     * @return The ID of the Snapshot.
     * 
     */
    public String snapshotId() {
        return this.snapshotId;
    }
    /**
     * @return Data source type, optional values: `ECS_FILE`, `OSS`, `NAS`.
     * 
     */
    public String sourceType() {
        return this.sourceType;
    }
    /**
     * @return The start time of the snapshot. UNIX time in seconds.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The status of snapshot execution. Possible values: `COMPLETE`, `PARTIAL_COMPLETE`, `FAILED`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The update time of snapshot. UNIX time in seconds.
     * 
     */
    public String updatedTime() {
        return this.updatedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotsSnapshot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String actualBytes;
        private String actualItems;
        private String backupType;
        private String bucket;
        private String bytesDone;
        private String bytesTotal;
        private String clientId;
        private String completeTime;
        private String createTime;
        private String createdTime;
        private String errorFile;
        private String fileSystemId;
        private String id;
        private String instanceId;
        private String itemsDone;
        private String itemsTotal;
        private String jobId;
        private String parentSnapshotHash;
        private String path;
        private String prefix;
        private String retention;
        private String snapshotHash;
        private String snapshotId;
        private String sourceType;
        private String startTime;
        private String status;
        private String updatedTime;
        public Builder() {}
        public Builder(GetSnapshotsSnapshot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actualBytes = defaults.actualBytes;
    	      this.actualItems = defaults.actualItems;
    	      this.backupType = defaults.backupType;
    	      this.bucket = defaults.bucket;
    	      this.bytesDone = defaults.bytesDone;
    	      this.bytesTotal = defaults.bytesTotal;
    	      this.clientId = defaults.clientId;
    	      this.completeTime = defaults.completeTime;
    	      this.createTime = defaults.createTime;
    	      this.createdTime = defaults.createdTime;
    	      this.errorFile = defaults.errorFile;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.itemsDone = defaults.itemsDone;
    	      this.itemsTotal = defaults.itemsTotal;
    	      this.jobId = defaults.jobId;
    	      this.parentSnapshotHash = defaults.parentSnapshotHash;
    	      this.path = defaults.path;
    	      this.prefix = defaults.prefix;
    	      this.retention = defaults.retention;
    	      this.snapshotHash = defaults.snapshotHash;
    	      this.snapshotId = defaults.snapshotId;
    	      this.sourceType = defaults.sourceType;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.updatedTime = defaults.updatedTime;
        }

        @CustomType.Setter
        public Builder actualBytes(String actualBytes) {
            this.actualBytes = Objects.requireNonNull(actualBytes);
            return this;
        }
        @CustomType.Setter
        public Builder actualItems(String actualItems) {
            this.actualItems = Objects.requireNonNull(actualItems);
            return this;
        }
        @CustomType.Setter
        public Builder backupType(String backupType) {
            this.backupType = Objects.requireNonNull(backupType);
            return this;
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder bytesDone(String bytesDone) {
            this.bytesDone = Objects.requireNonNull(bytesDone);
            return this;
        }
        @CustomType.Setter
        public Builder bytesTotal(String bytesTotal) {
            this.bytesTotal = Objects.requireNonNull(bytesTotal);
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder completeTime(String completeTime) {
            this.completeTime = Objects.requireNonNull(completeTime);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        @CustomType.Setter
        public Builder errorFile(String errorFile) {
            this.errorFile = Objects.requireNonNull(errorFile);
            return this;
        }
        @CustomType.Setter
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder itemsDone(String itemsDone) {
            this.itemsDone = Objects.requireNonNull(itemsDone);
            return this;
        }
        @CustomType.Setter
        public Builder itemsTotal(String itemsTotal) {
            this.itemsTotal = Objects.requireNonNull(itemsTotal);
            return this;
        }
        @CustomType.Setter
        public Builder jobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }
        @CustomType.Setter
        public Builder parentSnapshotHash(String parentSnapshotHash) {
            this.parentSnapshotHash = Objects.requireNonNull(parentSnapshotHash);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        @CustomType.Setter
        public Builder retention(String retention) {
            this.retention = Objects.requireNonNull(retention);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotHash(String snapshotHash) {
            this.snapshotHash = Objects.requireNonNull(snapshotHash);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder updatedTime(String updatedTime) {
            this.updatedTime = Objects.requireNonNull(updatedTime);
            return this;
        }
        public GetSnapshotsSnapshot build() {
            final var _resultValue = new GetSnapshotsSnapshot();
            _resultValue.actualBytes = actualBytes;
            _resultValue.actualItems = actualItems;
            _resultValue.backupType = backupType;
            _resultValue.bucket = bucket;
            _resultValue.bytesDone = bytesDone;
            _resultValue.bytesTotal = bytesTotal;
            _resultValue.clientId = clientId;
            _resultValue.completeTime = completeTime;
            _resultValue.createTime = createTime;
            _resultValue.createdTime = createdTime;
            _resultValue.errorFile = errorFile;
            _resultValue.fileSystemId = fileSystemId;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.itemsDone = itemsDone;
            _resultValue.itemsTotal = itemsTotal;
            _resultValue.jobId = jobId;
            _resultValue.parentSnapshotHash = parentSnapshotHash;
            _resultValue.path = path;
            _resultValue.prefix = prefix;
            _resultValue.retention = retention;
            _resultValue.snapshotHash = snapshotHash;
            _resultValue.snapshotId = snapshotId;
            _resultValue.sourceType = sourceType;
            _resultValue.startTime = startTime;
            _resultValue.status = status;
            _resultValue.updatedTime = updatedTime;
            return _resultValue;
        }
    }
}
