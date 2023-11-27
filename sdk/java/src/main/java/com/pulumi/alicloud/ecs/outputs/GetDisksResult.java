// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetDisksDisk;
import com.pulumi.alicloud.ecs.outputs.GetDisksOperationLock;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDisksResult {
    private @Nullable List<String> additionalAttributes;
    private @Nullable String autoSnapshotPolicyId;
    /**
     * @return Availability zone of the disk.
     * 
     * @deprecated
     * Field &#39;availability_zone&#39; has been deprecated from provider version 1.122.0. New field &#39;zone_id&#39; instead
     * 
     */
    @Deprecated /* Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead */
    private @Nullable String availabilityZone;
    /**
     * @return Disk category. Possible values: `cloud` (basic cloud disk), `cloud_efficiency` (ultra cloud disk), `ephemeral_ssd` (local SSD cloud disk), `cloud_ssd` (SSD cloud disk), and `cloud_essd` (ESSD cloud disk).
     * 
     */
    private @Nullable String category;
    private @Nullable Boolean deleteAutoSnapshot;
    private @Nullable Boolean deleteWithInstance;
    private @Nullable String diskName;
    private @Nullable String diskType;
    /**
     * @return A list of disks. Each element contains the following attributes:
     * 
     */
    private List<GetDisksDisk> disks;
    private @Nullable Boolean dryRun;
    private @Nullable Boolean enableAutoSnapshot;
    private @Nullable Boolean enableAutomatedSnapshotPolicy;
    private @Nullable Boolean enableShared;
    /**
     * @return Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
     * 
     */
    private @Nullable String encrypted;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    /**
     * @return ID of the related instance. It is `null` unless the `status` is `In_use`.
     * 
     */
    private @Nullable String instanceId;
    private @Nullable String kmsKeyId;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable List<GetDisksOperationLock> operationLocks;
    private @Nullable String outputFile;
    private @Nullable Integer pageNumber;
    private @Nullable Integer pageSize;
    private @Nullable String paymentType;
    private @Nullable Boolean portable;
    /**
     * @return The Id of resource group.
     * 
     */
    private @Nullable String resourceGroupId;
    /**
     * @return Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
     * 
     */
    private @Nullable String snapshotId;
    /**
     * @return Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
     * 
     */
    private @Nullable String status;
    /**
     * @return A map of tags assigned to the disk.
     * 
     */
    private @Nullable Map<String,Object> tags;
    private Integer totalCount;
    /**
     * @return Disk type. Possible values: `system` and `data`.
     * 
     * @deprecated
     * Field &#39;type&#39; has been deprecated from provider version 1.122.0. New field &#39;disk_type&#39; instead.
     * 
     */
    @Deprecated /* Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead. */
    private @Nullable String type;
    private @Nullable String zoneId;

    private GetDisksResult() {}
    public List<String> additionalAttributes() {
        return this.additionalAttributes == null ? List.of() : this.additionalAttributes;
    }
    public Optional<String> autoSnapshotPolicyId() {
        return Optional.ofNullable(this.autoSnapshotPolicyId);
    }
    /**
     * @return Availability zone of the disk.
     * 
     * @deprecated
     * Field &#39;availability_zone&#39; has been deprecated from provider version 1.122.0. New field &#39;zone_id&#39; instead
     * 
     */
    @Deprecated /* Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead */
    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    /**
     * @return Disk category. Possible values: `cloud` (basic cloud disk), `cloud_efficiency` (ultra cloud disk), `ephemeral_ssd` (local SSD cloud disk), `cloud_ssd` (SSD cloud disk), and `cloud_essd` (ESSD cloud disk).
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    public Optional<Boolean> deleteAutoSnapshot() {
        return Optional.ofNullable(this.deleteAutoSnapshot);
    }
    public Optional<Boolean> deleteWithInstance() {
        return Optional.ofNullable(this.deleteWithInstance);
    }
    public Optional<String> diskName() {
        return Optional.ofNullable(this.diskName);
    }
    public Optional<String> diskType() {
        return Optional.ofNullable(this.diskType);
    }
    /**
     * @return A list of disks. Each element contains the following attributes:
     * 
     */
    public List<GetDisksDisk> disks() {
        return this.disks;
    }
    public Optional<Boolean> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }
    public Optional<Boolean> enableAutoSnapshot() {
        return Optional.ofNullable(this.enableAutoSnapshot);
    }
    public Optional<Boolean> enableAutomatedSnapshotPolicy() {
        return Optional.ofNullable(this.enableAutomatedSnapshotPolicy);
    }
    public Optional<Boolean> enableShared() {
        return Optional.ofNullable(this.enableShared);
    }
    /**
     * @return Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
     * 
     */
    public Optional<String> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return ID of the related instance. It is `null` unless the `status` is `In_use`.
     * 
     */
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public List<GetDisksOperationLock> operationLocks() {
        return this.operationLocks == null ? List.of() : this.operationLocks;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }
    public Optional<String> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }
    public Optional<Boolean> portable() {
        return Optional.ofNullable(this.portable);
    }
    /**
     * @return The Id of resource group.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    /**
     * @return Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
     * 
     */
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    /**
     * @return Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return A map of tags assigned to the disk.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Integer totalCount() {
        return this.totalCount;
    }
    /**
     * @return Disk type. Possible values: `system` and `data`.
     * 
     * @deprecated
     * Field &#39;type&#39; has been deprecated from provider version 1.122.0. New field &#39;disk_type&#39; instead.
     * 
     */
    @Deprecated /* Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead. */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDisksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> additionalAttributes;
        private @Nullable String autoSnapshotPolicyId;
        private @Nullable String availabilityZone;
        private @Nullable String category;
        private @Nullable Boolean deleteAutoSnapshot;
        private @Nullable Boolean deleteWithInstance;
        private @Nullable String diskName;
        private @Nullable String diskType;
        private List<GetDisksDisk> disks;
        private @Nullable Boolean dryRun;
        private @Nullable Boolean enableAutoSnapshot;
        private @Nullable Boolean enableAutomatedSnapshotPolicy;
        private @Nullable Boolean enableShared;
        private @Nullable String encrypted;
        private String id;
        private List<String> ids;
        private @Nullable String instanceId;
        private @Nullable String kmsKeyId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable List<GetDisksOperationLock> operationLocks;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private @Nullable String paymentType;
        private @Nullable Boolean portable;
        private @Nullable String resourceGroupId;
        private @Nullable String snapshotId;
        private @Nullable String status;
        private @Nullable Map<String,Object> tags;
        private Integer totalCount;
        private @Nullable String type;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(GetDisksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalAttributes = defaults.additionalAttributes;
    	      this.autoSnapshotPolicyId = defaults.autoSnapshotPolicyId;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.category = defaults.category;
    	      this.deleteAutoSnapshot = defaults.deleteAutoSnapshot;
    	      this.deleteWithInstance = defaults.deleteWithInstance;
    	      this.diskName = defaults.diskName;
    	      this.diskType = defaults.diskType;
    	      this.disks = defaults.disks;
    	      this.dryRun = defaults.dryRun;
    	      this.enableAutoSnapshot = defaults.enableAutoSnapshot;
    	      this.enableAutomatedSnapshotPolicy = defaults.enableAutomatedSnapshotPolicy;
    	      this.enableShared = defaults.enableShared;
    	      this.encrypted = defaults.encrypted;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.operationLocks = defaults.operationLocks;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.paymentType = defaults.paymentType;
    	      this.portable = defaults.portable;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.snapshotId = defaults.snapshotId;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.totalCount = defaults.totalCount;
    	      this.type = defaults.type;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder additionalAttributes(@Nullable List<String> additionalAttributes) {
            this.additionalAttributes = additionalAttributes;
            return this;
        }
        public Builder additionalAttributes(String... additionalAttributes) {
            return additionalAttributes(List.of(additionalAttributes));
        }
        @CustomType.Setter
        public Builder autoSnapshotPolicyId(@Nullable String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        @CustomType.Setter
        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder deleteAutoSnapshot(@Nullable Boolean deleteAutoSnapshot) {
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }
        @CustomType.Setter
        public Builder deleteWithInstance(@Nullable Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        @CustomType.Setter
        public Builder diskName(@Nullable String diskName) {
            this.diskName = diskName;
            return this;
        }
        @CustomType.Setter
        public Builder diskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }
        @CustomType.Setter
        public Builder disks(List<GetDisksDisk> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }
        public Builder disks(GetDisksDisk... disks) {
            return disks(List.of(disks));
        }
        @CustomType.Setter
        public Builder dryRun(@Nullable Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        @CustomType.Setter
        public Builder enableAutoSnapshot(@Nullable Boolean enableAutoSnapshot) {
            this.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }
        @CustomType.Setter
        public Builder enableAutomatedSnapshotPolicy(@Nullable Boolean enableAutomatedSnapshotPolicy) {
            this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder enableShared(@Nullable Boolean enableShared) {
            this.enableShared = enableShared;
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(@Nullable String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder operationLocks(@Nullable List<GetDisksOperationLock> operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public Builder operationLocks(GetDisksOperationLock... operationLocks) {
            return operationLocks(List.of(operationLocks));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder pageNumber(@Nullable Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        @CustomType.Setter
        public Builder pageSize(@Nullable Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        @CustomType.Setter
        public Builder paymentType(@Nullable String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        @CustomType.Setter
        public Builder portable(@Nullable Boolean portable) {
            this.portable = portable;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder totalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public GetDisksResult build() {
            final var _resultValue = new GetDisksResult();
            _resultValue.additionalAttributes = additionalAttributes;
            _resultValue.autoSnapshotPolicyId = autoSnapshotPolicyId;
            _resultValue.availabilityZone = availabilityZone;
            _resultValue.category = category;
            _resultValue.deleteAutoSnapshot = deleteAutoSnapshot;
            _resultValue.deleteWithInstance = deleteWithInstance;
            _resultValue.diskName = diskName;
            _resultValue.diskType = diskType;
            _resultValue.disks = disks;
            _resultValue.dryRun = dryRun;
            _resultValue.enableAutoSnapshot = enableAutoSnapshot;
            _resultValue.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            _resultValue.enableShared = enableShared;
            _resultValue.encrypted = encrypted;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceId = instanceId;
            _resultValue.kmsKeyId = kmsKeyId;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.operationLocks = operationLocks;
            _resultValue.outputFile = outputFile;
            _resultValue.pageNumber = pageNumber;
            _resultValue.pageSize = pageSize;
            _resultValue.paymentType = paymentType;
            _resultValue.portable = portable;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.snapshotId = snapshotId;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.totalCount = totalCount;
            _resultValue.type = type;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
