// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeKubernetesWorkerDataDisk {
    /**
     * @return Worker node data disk auto snapshot policy.
     * 
     */
    private final @Nullable String autoSnapshotPolicyId;
    /**
     * @return The type of the data disks. Valid values: `cloud`, `cloud_efficiency`, `cloud_ssd` and `cloud_essd`. Default to `cloud_efficiency`.
     * 
     */
    private final @Nullable String category;
    private final @Nullable String device;
    /**
     * @return Specifies whether to encrypt data disks. Valid values: true and false. Default is `false`.
     * 
     */
    private final @Nullable String encrypted;
    private final @Nullable String kmsKeyId;
    /**
     * @return The kubernetes cluster&#39;s name. It is unique in one Alicloud account.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Worker node data disk performance level, when `category` values `cloud_essd`, the optional values are `PL0`, `PL1`, `PL2` or `PL3`, but the specific performance level is related to the disk capacity. For more information, see [Enhanced SSDs](https://www.alibabacloud.com/help/doc-detail/122389.htm). Default is `PL1`.
     * 
     */
    private final @Nullable String performanceLevel;
    /**
     * @return The size of a data disk, at least 40. Unit: GiB.
     * 
     */
    private final @Nullable String size;
    private final @Nullable String snapshotId;

    @CustomType.Constructor
    private EdgeKubernetesWorkerDataDisk(
        @CustomType.Parameter("autoSnapshotPolicyId") @Nullable String autoSnapshotPolicyId,
        @CustomType.Parameter("category") @Nullable String category,
        @CustomType.Parameter("device") @Nullable String device,
        @CustomType.Parameter("encrypted") @Nullable String encrypted,
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("performanceLevel") @Nullable String performanceLevel,
        @CustomType.Parameter("size") @Nullable String size,
        @CustomType.Parameter("snapshotId") @Nullable String snapshotId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        this.category = category;
        this.device = device;
        this.encrypted = encrypted;
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.performanceLevel = performanceLevel;
        this.size = size;
        this.snapshotId = snapshotId;
    }

    /**
     * @return Worker node data disk auto snapshot policy.
     * 
     */
    public Optional<String> autoSnapshotPolicyId() {
        return Optional.ofNullable(this.autoSnapshotPolicyId);
    }
    /**
     * @return The type of the data disks. Valid values: `cloud`, `cloud_efficiency`, `cloud_ssd` and `cloud_essd`. Default to `cloud_efficiency`.
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    /**
     * @return Specifies whether to encrypt data disks. Valid values: true and false. Default is `false`.
     * 
     */
    public Optional<String> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return The kubernetes cluster&#39;s name. It is unique in one Alicloud account.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Worker node data disk performance level, when `category` values `cloud_essd`, the optional values are `PL0`, `PL1`, `PL2` or `PL3`, but the specific performance level is related to the disk capacity. For more information, see [Enhanced SSDs](https://www.alibabacloud.com/help/doc-detail/122389.htm). Default is `PL1`.
     * 
     */
    public Optional<String> performanceLevel() {
        return Optional.ofNullable(this.performanceLevel);
    }
    /**
     * @return The size of a data disk, at least 40. Unit: GiB.
     * 
     */
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeKubernetesWorkerDataDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String autoSnapshotPolicyId;
        private @Nullable String category;
        private @Nullable String device;
        private @Nullable String encrypted;
        private @Nullable String kmsKeyId;
        private @Nullable String name;
        private @Nullable String performanceLevel;
        private @Nullable String size;
        private @Nullable String snapshotId;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeKubernetesWorkerDataDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoSnapshotPolicyId = defaults.autoSnapshotPolicyId;
    	      this.category = defaults.category;
    	      this.device = defaults.device;
    	      this.encrypted = defaults.encrypted;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.performanceLevel = defaults.performanceLevel;
    	      this.size = defaults.size;
    	      this.snapshotId = defaults.snapshotId;
        }

        public Builder autoSnapshotPolicyId(@Nullable String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        public Builder encrypted(@Nullable String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder performanceLevel(@Nullable String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }        public EdgeKubernetesWorkerDataDisk build() {
            return new EdgeKubernetesWorkerDataDisk(autoSnapshotPolicyId, category, device, encrypted, kmsKeyId, name, performanceLevel, size, snapshotId);
        }
    }
}
