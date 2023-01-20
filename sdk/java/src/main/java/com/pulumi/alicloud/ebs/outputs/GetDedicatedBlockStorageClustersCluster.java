// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDedicatedBlockStorageClustersCluster {
    /**
     * @return The available capacity of the dedicated block storage cluster. Unit: GiB.
     * 
     */
    private String availableCapacity;
    /**
     * @return The type of cloud disk that can be created by a dedicated block storage cluster.
     * 
     */
    private String category;
    /**
     * @return The creation time of the resource
     * 
     */
    private String createTime;
    /**
     * @return The first ID of the resource
     * 
     */
    private String dedicatedBlockStorageClusterId;
    /**
     * @return The name of the resource
     * 
     */
    private String dedicatedBlockStorageClusterName;
    /**
     * @return Capacity to be delivered in GB.
     * 
     */
    private String deliveryCapacity;
    /**
     * @return The description of the dedicated block storage cluster.
     * 
     */
    private String description;
    /**
     * @return The expiration time of the dedicated block storage cluster, in the Unix timestamp format, in seconds.
     * 
     */
    private String expiredTime;
    private String id;
    /**
     * @return Cloud disk performance level, possible values:-PL0.-PL1.-PL2.-PL3.&gt; Only valid in SupportedCategory = cloud_essd.
     * 
     */
    private String performanceLevel;
    /**
     * @return The ID of the resource group
     * 
     */
    private String resourceGroupId;
    /**
     * @return The status of the resource
     * 
     */
    private String status;
    /**
     * @return This parameter is not supported.
     * 
     */
    private String supportedCategory;
    /**
     * @return The total capacity of the dedicated block storage cluster. Unit: GiB.
     * 
     */
    private String totalCapacity;
    /**
     * @return The dedicated block storage cluster performance type. Possible values:-Standard: Basic type. This type of dedicated block storage cluster can create an ESSD PL0 cloud disk.-Premium: performance type. This type of dedicated block storage cluster can create an ESSD PL1 cloud disk.
     * 
     */
    private String type;
    /**
     * @return The used (created disk) capacity of the current cluster, in GB
     * 
     */
    private String usedCapacity;
    /**
     * @return The zone ID  of the resource
     * 
     */
    private String zoneId;

    private GetDedicatedBlockStorageClustersCluster() {}
    /**
     * @return The available capacity of the dedicated block storage cluster. Unit: GiB.
     * 
     */
    public String availableCapacity() {
        return this.availableCapacity;
    }
    /**
     * @return The type of cloud disk that can be created by a dedicated block storage cluster.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return The creation time of the resource
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The first ID of the resource
     * 
     */
    public String dedicatedBlockStorageClusterId() {
        return this.dedicatedBlockStorageClusterId;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String dedicatedBlockStorageClusterName() {
        return this.dedicatedBlockStorageClusterName;
    }
    /**
     * @return Capacity to be delivered in GB.
     * 
     */
    public String deliveryCapacity() {
        return this.deliveryCapacity;
    }
    /**
     * @return The description of the dedicated block storage cluster.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The expiration time of the dedicated block storage cluster, in the Unix timestamp format, in seconds.
     * 
     */
    public String expiredTime() {
        return this.expiredTime;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Cloud disk performance level, possible values:-PL0.-PL1.-PL2.-PL3.&gt; Only valid in SupportedCategory = cloud_essd.
     * 
     */
    public String performanceLevel() {
        return this.performanceLevel;
    }
    /**
     * @return The ID of the resource group
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The status of the resource
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return This parameter is not supported.
     * 
     */
    public String supportedCategory() {
        return this.supportedCategory;
    }
    /**
     * @return The total capacity of the dedicated block storage cluster. Unit: GiB.
     * 
     */
    public String totalCapacity() {
        return this.totalCapacity;
    }
    /**
     * @return The dedicated block storage cluster performance type. Possible values:-Standard: Basic type. This type of dedicated block storage cluster can create an ESSD PL0 cloud disk.-Premium: performance type. This type of dedicated block storage cluster can create an ESSD PL1 cloud disk.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The used (created disk) capacity of the current cluster, in GB
     * 
     */
    public String usedCapacity() {
        return this.usedCapacity;
    }
    /**
     * @return The zone ID  of the resource
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedBlockStorageClustersCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String availableCapacity;
        private String category;
        private String createTime;
        private String dedicatedBlockStorageClusterId;
        private String dedicatedBlockStorageClusterName;
        private String deliveryCapacity;
        private String description;
        private String expiredTime;
        private String id;
        private String performanceLevel;
        private String resourceGroupId;
        private String status;
        private String supportedCategory;
        private String totalCapacity;
        private String type;
        private String usedCapacity;
        private String zoneId;
        public Builder() {}
        public Builder(GetDedicatedBlockStorageClustersCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableCapacity = defaults.availableCapacity;
    	      this.category = defaults.category;
    	      this.createTime = defaults.createTime;
    	      this.dedicatedBlockStorageClusterId = defaults.dedicatedBlockStorageClusterId;
    	      this.dedicatedBlockStorageClusterName = defaults.dedicatedBlockStorageClusterName;
    	      this.deliveryCapacity = defaults.deliveryCapacity;
    	      this.description = defaults.description;
    	      this.expiredTime = defaults.expiredTime;
    	      this.id = defaults.id;
    	      this.performanceLevel = defaults.performanceLevel;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.status = defaults.status;
    	      this.supportedCategory = defaults.supportedCategory;
    	      this.totalCapacity = defaults.totalCapacity;
    	      this.type = defaults.type;
    	      this.usedCapacity = defaults.usedCapacity;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder availableCapacity(String availableCapacity) {
            this.availableCapacity = Objects.requireNonNull(availableCapacity);
            return this;
        }
        @CustomType.Setter
        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder dedicatedBlockStorageClusterId(String dedicatedBlockStorageClusterId) {
            this.dedicatedBlockStorageClusterId = Objects.requireNonNull(dedicatedBlockStorageClusterId);
            return this;
        }
        @CustomType.Setter
        public Builder dedicatedBlockStorageClusterName(String dedicatedBlockStorageClusterName) {
            this.dedicatedBlockStorageClusterName = Objects.requireNonNull(dedicatedBlockStorageClusterName);
            return this;
        }
        @CustomType.Setter
        public Builder deliveryCapacity(String deliveryCapacity) {
            this.deliveryCapacity = Objects.requireNonNull(deliveryCapacity);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = Objects.requireNonNull(expiredTime);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = Objects.requireNonNull(performanceLevel);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder supportedCategory(String supportedCategory) {
            this.supportedCategory = Objects.requireNonNull(supportedCategory);
            return this;
        }
        @CustomType.Setter
        public Builder totalCapacity(String totalCapacity) {
            this.totalCapacity = Objects.requireNonNull(totalCapacity);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder usedCapacity(String usedCapacity) {
            this.usedCapacity = Objects.requireNonNull(usedCapacity);
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public GetDedicatedBlockStorageClustersCluster build() {
            final var o = new GetDedicatedBlockStorageClustersCluster();
            o.availableCapacity = availableCapacity;
            o.category = category;
            o.createTime = createTime;
            o.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
            o.dedicatedBlockStorageClusterName = dedicatedBlockStorageClusterName;
            o.deliveryCapacity = deliveryCapacity;
            o.description = description;
            o.expiredTime = expiredTime;
            o.id = id;
            o.performanceLevel = performanceLevel;
            o.resourceGroupId = resourceGroupId;
            o.status = status;
            o.supportedCategory = supportedCategory;
            o.totalCapacity = totalCapacity;
            o.type = type;
            o.usedCapacity = usedCapacity;
            o.zoneId = zoneId;
            return o;
        }
    }
}
