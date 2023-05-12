// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetZonesZone {
    /**
     * @return Set of supported disk categories.
     * 
     */
    private final List<String> availableDiskCategories;
    /**
     * @return Allowed instance types.
     * 
     */
    private final List<String> availableInstanceTypes;
    /**
     * @return Filter the results by a specific resource type.
     * Valid values: `Instance`, `Disk`, `VSwitch`, `Rds`, `KVStore`, `FunctionCompute`, `Elasticsearch`, `Slb`.
     * 
     * &gt; **NOTE:** From version 1.134.0, the `available_resource_creation` value &#34;Rds&#34; has been deprecated.
     * If you want to fetch the available zones for RDS instance, you can use datasource alicloud_db_zones
     * 
     */
    private final List<String> availableResourceCreations;
    /**
     * @return ID of the zone.
     * 
     */
    private final String id;
    /**
     * @return Name of the zone in the local language.
     * 
     */
    private final String localName;
    /**
     * @return A list of zone ids in which the multi zone.
     * 
     */
    private final List<String> multiZoneIds;
    /**
     * @return A list of slb slave zone ids in which the slb master zone.
     * 
     */
    private final List<String> slbSlaveZoneIds;

    @CustomType.Constructor
    private GetZonesZone(
        @CustomType.Parameter("availableDiskCategories") List<String> availableDiskCategories,
        @CustomType.Parameter("availableInstanceTypes") List<String> availableInstanceTypes,
        @CustomType.Parameter("availableResourceCreations") List<String> availableResourceCreations,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("localName") String localName,
        @CustomType.Parameter("multiZoneIds") List<String> multiZoneIds,
        @CustomType.Parameter("slbSlaveZoneIds") List<String> slbSlaveZoneIds) {
        this.availableDiskCategories = availableDiskCategories;
        this.availableInstanceTypes = availableInstanceTypes;
        this.availableResourceCreations = availableResourceCreations;
        this.id = id;
        this.localName = localName;
        this.multiZoneIds = multiZoneIds;
        this.slbSlaveZoneIds = slbSlaveZoneIds;
    }

    /**
     * @return Set of supported disk categories.
     * 
     */
    public List<String> availableDiskCategories() {
        return this.availableDiskCategories;
    }
    /**
     * @return Allowed instance types.
     * 
     */
    public List<String> availableInstanceTypes() {
        return this.availableInstanceTypes;
    }
    /**
     * @return Filter the results by a specific resource type.
     * Valid values: `Instance`, `Disk`, `VSwitch`, `Rds`, `KVStore`, `FunctionCompute`, `Elasticsearch`, `Slb`.
     * 
     * &gt; **NOTE:** From version 1.134.0, the `available_resource_creation` value &#34;Rds&#34; has been deprecated.
     * If you want to fetch the available zones for RDS instance, you can use datasource alicloud_db_zones
     * 
     */
    public List<String> availableResourceCreations() {
        return this.availableResourceCreations;
    }
    /**
     * @return ID of the zone.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the zone in the local language.
     * 
     */
    public String localName() {
        return this.localName;
    }
    /**
     * @return A list of zone ids in which the multi zone.
     * 
     */
    public List<String> multiZoneIds() {
        return this.multiZoneIds;
    }
    /**
     * @return A list of slb slave zone ids in which the slb master zone.
     * 
     */
    public List<String> slbSlaveZoneIds() {
        return this.slbSlaveZoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZonesZone defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> availableDiskCategories;
        private List<String> availableInstanceTypes;
        private List<String> availableResourceCreations;
        private String id;
        private String localName;
        private List<String> multiZoneIds;
        private List<String> slbSlaveZoneIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetZonesZone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableDiskCategories = defaults.availableDiskCategories;
    	      this.availableInstanceTypes = defaults.availableInstanceTypes;
    	      this.availableResourceCreations = defaults.availableResourceCreations;
    	      this.id = defaults.id;
    	      this.localName = defaults.localName;
    	      this.multiZoneIds = defaults.multiZoneIds;
    	      this.slbSlaveZoneIds = defaults.slbSlaveZoneIds;
        }

        public Builder availableDiskCategories(List<String> availableDiskCategories) {
            this.availableDiskCategories = Objects.requireNonNull(availableDiskCategories);
            return this;
        }
        public Builder availableDiskCategories(String... availableDiskCategories) {
            return availableDiskCategories(List.of(availableDiskCategories));
        }
        public Builder availableInstanceTypes(List<String> availableInstanceTypes) {
            this.availableInstanceTypes = Objects.requireNonNull(availableInstanceTypes);
            return this;
        }
        public Builder availableInstanceTypes(String... availableInstanceTypes) {
            return availableInstanceTypes(List.of(availableInstanceTypes));
        }
        public Builder availableResourceCreations(List<String> availableResourceCreations) {
            this.availableResourceCreations = Objects.requireNonNull(availableResourceCreations);
            return this;
        }
        public Builder availableResourceCreations(String... availableResourceCreations) {
            return availableResourceCreations(List.of(availableResourceCreations));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder localName(String localName) {
            this.localName = Objects.requireNonNull(localName);
            return this;
        }
        public Builder multiZoneIds(List<String> multiZoneIds) {
            this.multiZoneIds = Objects.requireNonNull(multiZoneIds);
            return this;
        }
        public Builder multiZoneIds(String... multiZoneIds) {
            return multiZoneIds(List.of(multiZoneIds));
        }
        public Builder slbSlaveZoneIds(List<String> slbSlaveZoneIds) {
            this.slbSlaveZoneIds = Objects.requireNonNull(slbSlaveZoneIds);
            return this;
        }
        public Builder slbSlaveZoneIds(String... slbSlaveZoneIds) {
            return slbSlaveZoneIds(List.of(slbSlaveZoneIds));
        }        public GetZonesZone build() {
            return new GetZonesZone(availableDiskCategories, availableInstanceTypes, availableResourceCreations, id, localName, multiZoneIds, slbSlaveZoneIds);
        }
    }
}
