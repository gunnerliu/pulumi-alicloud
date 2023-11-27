// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSnapshotsSnapshot {
    private String category;
    /**
     * @return Creation time. Time of creation. It is represented according to ISO8601, and UTC time is used. Format: YYYY-MM-DDThh:mmZ.
     * 
     */
    private String creationTime;
    /**
     * @return Description of the snapshot.
     * 
     */
    private String description;
    private String diskId;
    /**
     * @return Whether the snapshot is encrypted or not.
     * 
     */
    private Boolean encrypted;
    /**
     * @return ID of the snapshot.
     * 
     */
    private String id;
    private Boolean instantAccess;
    private Integer instantAccessRetentionDays;
    /**
     * @return Name of the snapshot.
     * 
     */
    private String name;
    /**
     * @return Product code on the image market place.
     * 
     */
    private String productCode;
    /**
     * @return Progress of snapshot creation, presented in percentage.
     * 
     */
    private String progress;
    /**
     * @return The remaining time of a snapshot creation task, in seconds.
     * 
     */
    private Integer remainTime;
    private String resourceGroupId;
    /**
     * @return The number of days that an automatic snapshot retains in the console for your instance.
     * 
     */
    private Integer retentionDays;
    private String snapshotId;
    private String snapshotName;
    private String snapshotSn;
    private String snapshotType;
    /**
     * @return Source disk ID, which is retained after the source disk of the snapshot is deleted.
     * 
     */
    private String sourceDiskId;
    /**
     * @return Size of the source disk, measured in GB.
     * 
     */
    private String sourceDiskSize;
    /**
     * @return Source disk attribute. Value range: `System`,`Data`.
     * 
     */
    private String sourceDiskType;
    private String sourceStorageType;
    /**
     * @return The snapshot status. Value range: `progressing`, `accomplished` and `failed`.
     * 
     */
    private String status;
    /**
     * @return A map of tags assigned to the snapshot.
     * 
     */
    private Map<String,Object> tags;
    private String type;
    /**
     * @return Whether the snapshots are used to create resources or not. Value range: `image`, `disk`, `image_disk` and `none`.
     * 
     */
    private String usage;

    private GetSnapshotsSnapshot() {}
    public String category() {
        return this.category;
    }
    /**
     * @return Creation time. Time of creation. It is represented according to ISO8601, and UTC time is used. Format: YYYY-MM-DDThh:mmZ.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return Description of the snapshot.
     * 
     */
    public String description() {
        return this.description;
    }
    public String diskId() {
        return this.diskId;
    }
    /**
     * @return Whether the snapshot is encrypted or not.
     * 
     */
    public Boolean encrypted() {
        return this.encrypted;
    }
    /**
     * @return ID of the snapshot.
     * 
     */
    public String id() {
        return this.id;
    }
    public Boolean instantAccess() {
        return this.instantAccess;
    }
    public Integer instantAccessRetentionDays() {
        return this.instantAccessRetentionDays;
    }
    /**
     * @return Name of the snapshot.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Product code on the image market place.
     * 
     */
    public String productCode() {
        return this.productCode;
    }
    /**
     * @return Progress of snapshot creation, presented in percentage.
     * 
     */
    public String progress() {
        return this.progress;
    }
    /**
     * @return The remaining time of a snapshot creation task, in seconds.
     * 
     */
    public Integer remainTime() {
        return this.remainTime;
    }
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The number of days that an automatic snapshot retains in the console for your instance.
     * 
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }
    public String snapshotId() {
        return this.snapshotId;
    }
    public String snapshotName() {
        return this.snapshotName;
    }
    public String snapshotSn() {
        return this.snapshotSn;
    }
    public String snapshotType() {
        return this.snapshotType;
    }
    /**
     * @return Source disk ID, which is retained after the source disk of the snapshot is deleted.
     * 
     */
    public String sourceDiskId() {
        return this.sourceDiskId;
    }
    /**
     * @return Size of the source disk, measured in GB.
     * 
     */
    public String sourceDiskSize() {
        return this.sourceDiskSize;
    }
    /**
     * @return Source disk attribute. Value range: `System`,`Data`.
     * 
     */
    public String sourceDiskType() {
        return this.sourceDiskType;
    }
    public String sourceStorageType() {
        return this.sourceStorageType;
    }
    /**
     * @return The snapshot status. Value range: `progressing`, `accomplished` and `failed`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A map of tags assigned to the snapshot.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    public String type() {
        return this.type;
    }
    /**
     * @return Whether the snapshots are used to create resources or not. Value range: `image`, `disk`, `image_disk` and `none`.
     * 
     */
    public String usage() {
        return this.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotsSnapshot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String category;
        private String creationTime;
        private String description;
        private String diskId;
        private Boolean encrypted;
        private String id;
        private Boolean instantAccess;
        private Integer instantAccessRetentionDays;
        private String name;
        private String productCode;
        private String progress;
        private Integer remainTime;
        private String resourceGroupId;
        private Integer retentionDays;
        private String snapshotId;
        private String snapshotName;
        private String snapshotSn;
        private String snapshotType;
        private String sourceDiskId;
        private String sourceDiskSize;
        private String sourceDiskType;
        private String sourceStorageType;
        private String status;
        private Map<String,Object> tags;
        private String type;
        private String usage;
        public Builder() {}
        public Builder(GetSnapshotsSnapshot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.diskId = defaults.diskId;
    	      this.encrypted = defaults.encrypted;
    	      this.id = defaults.id;
    	      this.instantAccess = defaults.instantAccess;
    	      this.instantAccessRetentionDays = defaults.instantAccessRetentionDays;
    	      this.name = defaults.name;
    	      this.productCode = defaults.productCode;
    	      this.progress = defaults.progress;
    	      this.remainTime = defaults.remainTime;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.retentionDays = defaults.retentionDays;
    	      this.snapshotId = defaults.snapshotId;
    	      this.snapshotName = defaults.snapshotName;
    	      this.snapshotSn = defaults.snapshotSn;
    	      this.snapshotType = defaults.snapshotType;
    	      this.sourceDiskId = defaults.sourceDiskId;
    	      this.sourceDiskSize = defaults.sourceDiskSize;
    	      this.sourceDiskType = defaults.sourceDiskType;
    	      this.sourceStorageType = defaults.sourceStorageType;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.usage = defaults.usage;
        }

        @CustomType.Setter
        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder diskId(String diskId) {
            this.diskId = Objects.requireNonNull(diskId);
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instantAccess(Boolean instantAccess) {
            this.instantAccess = Objects.requireNonNull(instantAccess);
            return this;
        }
        @CustomType.Setter
        public Builder instantAccessRetentionDays(Integer instantAccessRetentionDays) {
            this.instantAccessRetentionDays = Objects.requireNonNull(instantAccessRetentionDays);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder productCode(String productCode) {
            this.productCode = Objects.requireNonNull(productCode);
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
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
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
        public Builder snapshotSn(String snapshotSn) {
            this.snapshotSn = Objects.requireNonNull(snapshotSn);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotType(String snapshotType) {
            this.snapshotType = Objects.requireNonNull(snapshotType);
            return this;
        }
        @CustomType.Setter
        public Builder sourceDiskId(String sourceDiskId) {
            this.sourceDiskId = Objects.requireNonNull(sourceDiskId);
            return this;
        }
        @CustomType.Setter
        public Builder sourceDiskSize(String sourceDiskSize) {
            this.sourceDiskSize = Objects.requireNonNull(sourceDiskSize);
            return this;
        }
        @CustomType.Setter
        public Builder sourceDiskType(String sourceDiskType) {
            this.sourceDiskType = Objects.requireNonNull(sourceDiskType);
            return this;
        }
        @CustomType.Setter
        public Builder sourceStorageType(String sourceStorageType) {
            this.sourceStorageType = Objects.requireNonNull(sourceStorageType);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder usage(String usage) {
            this.usage = Objects.requireNonNull(usage);
            return this;
        }
        public GetSnapshotsSnapshot build() {
            final var _resultValue = new GetSnapshotsSnapshot();
            _resultValue.category = category;
            _resultValue.creationTime = creationTime;
            _resultValue.description = description;
            _resultValue.diskId = diskId;
            _resultValue.encrypted = encrypted;
            _resultValue.id = id;
            _resultValue.instantAccess = instantAccess;
            _resultValue.instantAccessRetentionDays = instantAccessRetentionDays;
            _resultValue.name = name;
            _resultValue.productCode = productCode;
            _resultValue.progress = progress;
            _resultValue.remainTime = remainTime;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.retentionDays = retentionDays;
            _resultValue.snapshotId = snapshotId;
            _resultValue.snapshotName = snapshotName;
            _resultValue.snapshotSn = snapshotSn;
            _resultValue.snapshotType = snapshotType;
            _resultValue.sourceDiskId = sourceDiskId;
            _resultValue.sourceDiskSize = sourceDiskSize;
            _resultValue.sourceDiskType = sourceDiskType;
            _resultValue.sourceStorageType = sourceStorageType;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.type = type;
            _resultValue.usage = usage;
            return _resultValue;
        }
    }
}
