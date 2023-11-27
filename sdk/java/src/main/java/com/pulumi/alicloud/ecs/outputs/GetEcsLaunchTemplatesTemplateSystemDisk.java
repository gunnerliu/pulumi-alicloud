// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEcsLaunchTemplatesTemplateSystemDisk {
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
     * @return The Iops.
     * 
     */
    private String iops;
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

    private GetEcsLaunchTemplatesTemplateSystemDisk() {}
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
     * @return The Iops.
     * 
     */
    public String iops() {
        return this.iops;
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsLaunchTemplatesTemplateSystemDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String category;
        private Boolean deleteWithInstance;
        private String description;
        private String iops;
        private String name;
        private String performanceLevel;
        private Integer size;
        public Builder() {}
        public Builder(GetEcsLaunchTemplatesTemplateSystemDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.deleteWithInstance = defaults.deleteWithInstance;
    	      this.description = defaults.description;
    	      this.iops = defaults.iops;
    	      this.name = defaults.name;
    	      this.performanceLevel = defaults.performanceLevel;
    	      this.size = defaults.size;
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
        public Builder iops(String iops) {
            this.iops = Objects.requireNonNull(iops);
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
        public GetEcsLaunchTemplatesTemplateSystemDisk build() {
            final var _resultValue = new GetEcsLaunchTemplatesTemplateSystemDisk();
            _resultValue.category = category;
            _resultValue.deleteWithInstance = deleteWithInstance;
            _resultValue.description = description;
            _resultValue.iops = iops;
            _resultValue.name = name;
            _resultValue.performanceLevel = performanceLevel;
            _resultValue.size = size;
            return _resultValue;
        }
    }
}
