// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstancesInstance {
    /**
     * @return List of CEN Bandwidth Package IDs in the specified CEN instance.
     * 
     */
    private List<String> cenBandwidthPackageIds;
    /**
     * @return ID of the CEN instance.
     * 
     */
    private String cenId;
    /**
     * @return Name of the CEN instance.
     * 
     */
    private String cenInstanceName;
    /**
     * @return The creation time of the CEN Instance.
     * 
     */
    private String createTime;
    /**
     * @return Description of the CEN instance.
     * 
     */
    private String description;
    /**
     * @return ID of the CEN instance.
     * 
     */
    private String id;
    /**
     * @return Name of the CEN instance.
     * 
     */
    private String name;
    /**
     * @return Indicates the allowed level of CIDR block overlapping.
     * 
     */
    private String protectionLevel;
    /**
     * @return The status of CEN instance. Valid value: `Active`, `Creating` and `Deleting`.
     * 
     */
    private String status;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private Map<String,Object> tags;

    private GetInstancesInstance() {}
    /**
     * @return List of CEN Bandwidth Package IDs in the specified CEN instance.
     * 
     */
    public List<String> cenBandwidthPackageIds() {
        return this.cenBandwidthPackageIds;
    }
    /**
     * @return ID of the CEN instance.
     * 
     */
    public String cenId() {
        return this.cenId;
    }
    /**
     * @return Name of the CEN instance.
     * 
     */
    public String cenInstanceName() {
        return this.cenInstanceName;
    }
    /**
     * @return The creation time of the CEN Instance.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Description of the CEN instance.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ID of the CEN instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the CEN instance.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Indicates the allowed level of CIDR block overlapping.
     * 
     */
    public String protectionLevel() {
        return this.protectionLevel;
    }
    /**
     * @return The status of CEN instance. Valid value: `Active`, `Creating` and `Deleting`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> cenBandwidthPackageIds;
        private String cenId;
        private String cenInstanceName;
        private String createTime;
        private String description;
        private String id;
        private String name;
        private String protectionLevel;
        private String status;
        private Map<String,Object> tags;
        public Builder() {}
        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cenBandwidthPackageIds = defaults.cenBandwidthPackageIds;
    	      this.cenId = defaults.cenId;
    	      this.cenInstanceName = defaults.cenInstanceName;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.protectionLevel = defaults.protectionLevel;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder cenBandwidthPackageIds(List<String> cenBandwidthPackageIds) {
            this.cenBandwidthPackageIds = Objects.requireNonNull(cenBandwidthPackageIds);
            return this;
        }
        public Builder cenBandwidthPackageIds(String... cenBandwidthPackageIds) {
            return cenBandwidthPackageIds(List.of(cenBandwidthPackageIds));
        }
        @CustomType.Setter
        public Builder cenId(String cenId) {
            this.cenId = Objects.requireNonNull(cenId);
            return this;
        }
        @CustomType.Setter
        public Builder cenInstanceName(String cenInstanceName) {
            this.cenInstanceName = Objects.requireNonNull(cenInstanceName);
            return this;
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
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder protectionLevel(String protectionLevel) {
            this.protectionLevel = Objects.requireNonNull(protectionLevel);
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
        public GetInstancesInstance build() {
            final var o = new GetInstancesInstance();
            o.cenBandwidthPackageIds = cenBandwidthPackageIds;
            o.cenId = cenId;
            o.cenInstanceName = cenInstanceName;
            o.createTime = createTime;
            o.description = description;
            o.id = id;
            o.name = name;
            o.protectionLevel = protectionLevel;
            o.status = status;
            o.tags = tags;
            return o;
        }
    }
}