// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EcsInstanceSetDataDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final EcsInstanceSetDataDiskArgs Empty = new EcsInstanceSetDataDiskArgs();

    /**
     * The ID of the automatic snapshot policy applied to the system disk.
     * 
     */
    @Import(name="autoSnapshotPolicyId")
    private @Nullable Output<String> autoSnapshotPolicyId;

    /**
     * @return The ID of the automatic snapshot policy applied to the system disk.
     * 
     */
    public Optional<Output<String>> autoSnapshotPolicyId() {
        return Optional.ofNullable(this.autoSnapshotPolicyId);
    }

    /**
     * The category of the disk. Valid values: `cloud_efficiency`, `cloud_ssd`, `cloud_essd`, `cloud`.
     * 
     */
    @Import(name="diskCategory")
    private @Nullable Output<String> diskCategory;

    /**
     * @return The category of the disk. Valid values: `cloud_efficiency`, `cloud_ssd`, `cloud_essd`, `cloud`.
     * 
     */
    public Optional<Output<String>> diskCategory() {
        return Optional.ofNullable(this.diskCategory);
    }

    /**
     * The description of the data disk.
     * 
     */
    @Import(name="diskDescription")
    private @Nullable Output<String> diskDescription;

    /**
     * @return The description of the data disk.
     * 
     */
    public Optional<Output<String>> diskDescription() {
        return Optional.ofNullable(this.diskDescription);
    }

    /**
     * The name of the data disk.
     * 
     */
    @Import(name="diskName")
    private @Nullable Output<String> diskName;

    /**
     * @return The name of the data disk.
     * 
     */
    public Optional<Output<String>> diskName() {
        return Optional.ofNullable(this.diskName);
    }

    /**
     * The size of the data disk. Unit: GiB.
     * - When `disk_category` is `cloud_efficiency`, Valid values: `20` to `32768`.
     * - When `disk_category` is `cloud_ssd`, Valid values: `20` to `32768`.
     * - When `disk_category` is `cloud_essd`, Valid values: `20` to `32768`.
     * - When `disk_category` is `cloud`, Valid values: `5` to `200`.
     * 
     */
    @Import(name="diskSize", required=true)
    private Output<Integer> diskSize;

    /**
     * @return The size of the data disk. Unit: GiB.
     * - When `disk_category` is `cloud_efficiency`, Valid values: `20` to `32768`.
     * - When `disk_category` is `cloud_ssd`, Valid values: `20` to `32768`.
     * - When `disk_category` is `cloud_essd`, Valid values: `20` to `32768`.
     * - When `disk_category` is `cloud`, Valid values: `5` to `200`.
     * 
     */
    public Output<Integer> diskSize() {
        return this.diskSize;
    }

    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * The KMS key ID corresponding to the data disk.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The KMS key ID corresponding to the data disk.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The performance level of the ESSD used as data disk. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
     * 
     */
    @Import(name="performanceLevel")
    private @Nullable Output<String> performanceLevel;

    /**
     * @return The performance level of the ESSD used as data disk. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
     * 
     */
    public Optional<Output<String>> performanceLevel() {
        return Optional.ofNullable(this.performanceLevel);
    }

    /**
     * The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    /**
     * @return The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
     * 
     */
    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    private EcsInstanceSetDataDiskArgs() {}

    private EcsInstanceSetDataDiskArgs(EcsInstanceSetDataDiskArgs $) {
        this.autoSnapshotPolicyId = $.autoSnapshotPolicyId;
        this.diskCategory = $.diskCategory;
        this.diskDescription = $.diskDescription;
        this.diskName = $.diskName;
        this.diskSize = $.diskSize;
        this.encrypted = $.encrypted;
        this.kmsKeyId = $.kmsKeyId;
        this.performanceLevel = $.performanceLevel;
        this.snapshotId = $.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EcsInstanceSetDataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EcsInstanceSetDataDiskArgs $;

        public Builder() {
            $ = new EcsInstanceSetDataDiskArgs();
        }

        public Builder(EcsInstanceSetDataDiskArgs defaults) {
            $ = new EcsInstanceSetDataDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoSnapshotPolicyId The ID of the automatic snapshot policy applied to the system disk.
         * 
         * @return builder
         * 
         */
        public Builder autoSnapshotPolicyId(@Nullable Output<String> autoSnapshotPolicyId) {
            $.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * @param autoSnapshotPolicyId The ID of the automatic snapshot policy applied to the system disk.
         * 
         * @return builder
         * 
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            return autoSnapshotPolicyId(Output.of(autoSnapshotPolicyId));
        }

        /**
         * @param diskCategory The category of the disk. Valid values: `cloud_efficiency`, `cloud_ssd`, `cloud_essd`, `cloud`.
         * 
         * @return builder
         * 
         */
        public Builder diskCategory(@Nullable Output<String> diskCategory) {
            $.diskCategory = diskCategory;
            return this;
        }

        /**
         * @param diskCategory The category of the disk. Valid values: `cloud_efficiency`, `cloud_ssd`, `cloud_essd`, `cloud`.
         * 
         * @return builder
         * 
         */
        public Builder diskCategory(String diskCategory) {
            return diskCategory(Output.of(diskCategory));
        }

        /**
         * @param diskDescription The description of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder diskDescription(@Nullable Output<String> diskDescription) {
            $.diskDescription = diskDescription;
            return this;
        }

        /**
         * @param diskDescription The description of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder diskDescription(String diskDescription) {
            return diskDescription(Output.of(diskDescription));
        }

        /**
         * @param diskName The name of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder diskName(@Nullable Output<String> diskName) {
            $.diskName = diskName;
            return this;
        }

        /**
         * @param diskName The name of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder diskName(String diskName) {
            return diskName(Output.of(diskName));
        }

        /**
         * @param diskSize The size of the data disk. Unit: GiB.
         * - When `disk_category` is `cloud_efficiency`, Valid values: `20` to `32768`.
         * - When `disk_category` is `cloud_ssd`, Valid values: `20` to `32768`.
         * - When `disk_category` is `cloud_essd`, Valid values: `20` to `32768`.
         * - When `disk_category` is `cloud`, Valid values: `5` to `200`.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(Output<Integer> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        /**
         * @param diskSize The size of the data disk. Unit: GiB.
         * - When `disk_category` is `cloud_efficiency`, Valid values: `20` to `32768`.
         * - When `disk_category` is `cloud_ssd`, Valid values: `20` to `32768`.
         * - When `disk_category` is `cloud_essd`, Valid values: `20` to `32768`.
         * - When `disk_category` is `cloud`, Valid values: `5` to `200`.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(Integer diskSize) {
            return diskSize(Output.of(diskSize));
        }

        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        /**
         * @param kmsKeyId The KMS key ID corresponding to the data disk.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The KMS key ID corresponding to the data disk.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param performanceLevel The performance level of the ESSD used as data disk. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
         * 
         * @return builder
         * 
         */
        public Builder performanceLevel(@Nullable Output<String> performanceLevel) {
            $.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * @param performanceLevel The performance level of the ESSD used as data disk. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
         * 
         * @return builder
         * 
         */
        public Builder performanceLevel(String performanceLevel) {
            return performanceLevel(Output.of(performanceLevel));
        }

        /**
         * @param snapshotId The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        public EcsInstanceSetDataDiskArgs build() {
            $.diskSize = Objects.requireNonNull($.diskSize, "expected parameter 'diskSize' to be non-null");
            return $;
        }
    }

}
