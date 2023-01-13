// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEcsLaunchTemplatesTemplateDataDisk {
    /**
     * @return The category of the system disk.
     * 
     */
    private String category;
    /**
     * @return Specifies whether to release the system disk when the instance is released.
     * 
     */
    private Boolean deleteWithInstance;
    /**
     * @return System disk description.
     * 
     */
    private String description;
    /**
     * @return Encrypted the data in this disk.
     * 
     */
    private Boolean encrypted;
    /**
     * @return System disk name.
     * 
     */
    private String name;
    /**
     * @return The performance level of the ESSD used as the system disk.
     * 
     */
    private String performanceLevel;
    /**
     * @return Size of the system disk, measured in GB.
     * 
     */
    private Integer size;
    /**
     * @return The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
     * 
     */
    private String snapshotId;

    private GetEcsLaunchTemplatesTemplateDataDisk() {}
    /**
     * @return The category of the system disk.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return Specifies whether to release the system disk when the instance is released.
     * 
     */
    public Boolean deleteWithInstance() {
        return this.deleteWithInstance;
    }
    /**
     * @return System disk description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Encrypted the data in this disk.
     * 
     */
    public Boolean encrypted() {
        return this.encrypted;
    }
    /**
     * @return System disk name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The performance level of the ESSD used as the system disk.
     * 
     */
    public String performanceLevel() {
        return this.performanceLevel;
    }
    /**
     * @return Size of the system disk, measured in GB.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
     * 
     */
    public String snapshotId() {
        return this.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsLaunchTemplatesTemplateDataDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String category;
        private Boolean deleteWithInstance;
        private String description;
        private Boolean encrypted;
        private String name;
        private String performanceLevel;
        private Integer size;
        private String snapshotId;
        public Builder() {}
        public Builder(GetEcsLaunchTemplatesTemplateDataDisk defaults) {
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
        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        @CustomType.Setter
        public Builder deleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = Objects.requireNonNull(deleteWithInstance);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = Objects.requireNonNull(performanceLevel);
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }
        public GetEcsLaunchTemplatesTemplateDataDisk build() {
            final var o = new GetEcsLaunchTemplatesTemplateDataDisk();
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
