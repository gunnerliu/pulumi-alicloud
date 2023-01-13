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
    private List<String> availableDiskCategories;
    /**
     * @return Allowed instance types.
     * 
     */
    private List<String> availableInstanceTypes;
    /**
     * @return Filter the results by a specific resource type.
     * Valid values: `Instance`, `Disk`, `VSwitch`, `Rds`, `KVStore`, `FunctionCompute`, `Elasticsearch`, `Slb`.
     * 
     */
    private List<String> availableResourceCreations;
    /**
     * @return ID of the zone.
     * 
     */
    private String id;
    /**
     * @return Name of the zone in the local language.
     * 
     */
    private String localName;
    /**
     * @return A list of zone ids in which the multi zone.
     * 
     */
    private List<String> multiZoneIds;
    /**
     * @return A list of slb slave zone ids in which the slb master zone.
     * 
     */
    private List<String> slbSlaveZoneIds;

    private GetZonesZone() {}
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
    @CustomType.Builder
    public static final class Builder {
        private List<String> availableDiskCategories;
        private List<String> availableInstanceTypes;
        private List<String> availableResourceCreations;
        private String id;
        private String localName;
        private List<String> multiZoneIds;
        private List<String> slbSlaveZoneIds;
        public Builder() {}
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

        @CustomType.Setter
        public Builder availableDiskCategories(List<String> availableDiskCategories) {
            this.availableDiskCategories = Objects.requireNonNull(availableDiskCategories);
            return this;
        }
        public Builder availableDiskCategories(String... availableDiskCategories) {
            return availableDiskCategories(List.of(availableDiskCategories));
        }
        @CustomType.Setter
        public Builder availableInstanceTypes(List<String> availableInstanceTypes) {
            this.availableInstanceTypes = Objects.requireNonNull(availableInstanceTypes);
            return this;
        }
        public Builder availableInstanceTypes(String... availableInstanceTypes) {
            return availableInstanceTypes(List.of(availableInstanceTypes));
        }
        @CustomType.Setter
        public Builder availableResourceCreations(List<String> availableResourceCreations) {
            this.availableResourceCreations = Objects.requireNonNull(availableResourceCreations);
            return this;
        }
        public Builder availableResourceCreations(String... availableResourceCreations) {
            return availableResourceCreations(List.of(availableResourceCreations));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder localName(String localName) {
            this.localName = Objects.requireNonNull(localName);
            return this;
        }
        @CustomType.Setter
        public Builder multiZoneIds(List<String> multiZoneIds) {
            this.multiZoneIds = Objects.requireNonNull(multiZoneIds);
            return this;
        }
        public Builder multiZoneIds(String... multiZoneIds) {
            return multiZoneIds(List.of(multiZoneIds));
        }
        @CustomType.Setter
        public Builder slbSlaveZoneIds(List<String> slbSlaveZoneIds) {
            this.slbSlaveZoneIds = Objects.requireNonNull(slbSlaveZoneIds);
            return this;
        }
        public Builder slbSlaveZoneIds(String... slbSlaveZoneIds) {
            return slbSlaveZoneIds(List.of(slbSlaveZoneIds));
        }
        public GetZonesZone build() {
            final var o = new GetZonesZone();
            o.availableDiskCategories = availableDiskCategories;
            o.availableInstanceTypes = availableInstanceTypes;
            o.availableResourceCreations = availableResourceCreations;
            o.id = id;
            o.localName = localName;
            o.multiZoneIds = multiZoneIds;
            o.slbSlaveZoneIds = slbSlaveZoneIds;
            return o;
        }
    }
}
