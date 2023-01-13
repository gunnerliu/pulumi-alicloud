// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EcsLaunchTemplateDataDisk {
    /**
     * @return The category of the disk.
     * 
     */
    private @Nullable String category;
    /**
     * @return Indicates whether the data disk is released with the instance.
     * 
     */
    private @Nullable Boolean deleteWithInstance;
    /**
     * @return The description of the data disk.
     * 
     */
    private @Nullable String description;
    /**
     * @return Encrypted the data in this disk.
     * 
     */
    private @Nullable Boolean encrypted;
    /**
     * @return The name of the data disk.
     * 
     */
    private @Nullable String name;
    /**
     * @return The performance level of the ESSD used as the data disk.
     * 
     */
    private @Nullable String performanceLevel;
    /**
     * @return The size of the data disk.
     * 
     */
    private @Nullable Integer size;
    /**
     * @return The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
     * 
     */
    private @Nullable String snapshotId;

    private EcsLaunchTemplateDataDisk() {}
    /**
     * @return The category of the disk.
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    /**
     * @return Indicates whether the data disk is released with the instance.
     * 
     */
    public Optional<Boolean> deleteWithInstance() {
        return Optional.ofNullable(this.deleteWithInstance);
    }
    /**
     * @return The description of the data disk.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Encrypted the data in this disk.
     * 
     */
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * @return The name of the data disk.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The performance level of the ESSD used as the data disk.
     * 
     */
    public Optional<String> performanceLevel() {
        return Optional.ofNullable(this.performanceLevel);
    }
    /**
     * @return The size of the data disk.
     * 
     */
    public Optional<Integer> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
     * 
     */
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EcsLaunchTemplateDataDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String category;
        private @Nullable Boolean deleteWithInstance;
        private @Nullable String description;
        private @Nullable Boolean encrypted;
        private @Nullable String name;
        private @Nullable String performanceLevel;
        private @Nullable Integer size;
        private @Nullable String snapshotId;
        public Builder() {}
        public Builder(EcsLaunchTemplateDataDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.deleteWithInstance = defaults.deleteWithInstance;
    	      this.description = defaults.description;
    	      this.encrypted = defaults.encrypted;
    	      this.name = defaults.name;
    	      this.performanceLevel = defaults.performanceLevel;
    	      this.size = defaults.size;
    	      this.snapshotId = defaults.snapshotId;
        }

        @CustomType.Setter
        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder deleteWithInstance(@Nullable Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder performanceLevel(@Nullable String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable Integer size) {
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public EcsLaunchTemplateDataDisk build() {
            final var o = new EcsLaunchTemplateDataDisk();
            o.category = category;
            o.deleteWithInstance = deleteWithInstance;
            o.description = description;
            o.encrypted = encrypted;
            o.name = name;
            o.performanceLevel = performanceLevel;
            o.size = size;
            o.snapshotId = snapshotId;
            return o;
        }
    }
}
