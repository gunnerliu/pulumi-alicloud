// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourceGroupsGroupRegionStatus {
    /**
     * @return The region ID.
     * 
     */
    private String regionId;
    /**
     * @return The status of the resource group. Valid values: `Creating`, `Deleted`, `Deleting`, `OK` and `PendingDelete`. **NOTE:** From version 1.114.0, `status` can be set to `Deleting`.
     * 
     */
    private String status;

    private GetResourceGroupsGroupRegionStatus() {}
    /**
     * @return The region ID.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return The status of the resource group. Valid values: `Creating`, `Deleted`, `Deleting`, `OK` and `PendingDelete`. **NOTE:** From version 1.114.0, `status` can be set to `Deleting`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceGroupsGroupRegionStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String regionId;
        private String status;
        public Builder() {}
        public Builder(GetResourceGroupsGroupRegionStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionId = defaults.regionId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetResourceGroupsGroupRegionStatus build() {
            final var _resultValue = new GetResourceGroupsGroupRegionStatus();
            _resultValue.regionId = regionId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
