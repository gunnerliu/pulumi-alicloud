// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupsGroup {
    /**
     * @return Billing status.
     * - NORMAL: The API group is normal.
     * - LOCKED: Locked due to outstanding payment.
     * 
     */
    private String billingStatus;
    /**
     * @return Creation time (Greenwich mean time).
     * 
     */
    private String createdTime;
    /**
     * @return API group description.
     * 
     */
    private String description;
    /**
     * @return API group ID, which is generated by the system and globally unique.
     * 
     */
    private String id;
    /**
     * @return Locking in invalid state.
     * - NORMAL: The API group is normal.
     * - LOCKED: Locked due to illegality.
     * 
     */
    private String illegalStatus;
    /**
     * @return Last modification time (Greenwich mean time).
     * 
     */
    private String modifiedTime;
    /**
     * @return API group name.
     * 
     */
    private String name;
    /**
     * @return The ID of the region where the API group is located.
     * 
     */
    private String regionId;
    /**
     * @return Second-level domain name automatically assigned to the API group.
     * 
     */
    private String subDomain;
    /**
     * @return Upper QPS limit of the API group; default value: 500, which can be increased by submitting an application.
     * 
     */
    private Integer trafficLimit;

    private GetGroupsGroup() {}
    /**
     * @return Billing status.
     * - NORMAL: The API group is normal.
     * - LOCKED: Locked due to outstanding payment.
     * 
     */
    public String billingStatus() {
        return this.billingStatus;
    }
    /**
     * @return Creation time (Greenwich mean time).
     * 
     */
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * @return API group description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return API group ID, which is generated by the system and globally unique.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Locking in invalid state.
     * - NORMAL: The API group is normal.
     * - LOCKED: Locked due to illegality.
     * 
     */
    public String illegalStatus() {
        return this.illegalStatus;
    }
    /**
     * @return Last modification time (Greenwich mean time).
     * 
     */
    public String modifiedTime() {
        return this.modifiedTime;
    }
    /**
     * @return API group name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the region where the API group is located.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return Second-level domain name automatically assigned to the API group.
     * 
     */
    public String subDomain() {
        return this.subDomain;
    }
    /**
     * @return Upper QPS limit of the API group; default value: 500, which can be increased by submitting an application.
     * 
     */
    public Integer trafficLimit() {
        return this.trafficLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String billingStatus;
        private String createdTime;
        private String description;
        private String id;
        private String illegalStatus;
        private String modifiedTime;
        private String name;
        private String regionId;
        private String subDomain;
        private Integer trafficLimit;
        public Builder() {}
        public Builder(GetGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingStatus = defaults.billingStatus;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.illegalStatus = defaults.illegalStatus;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.regionId = defaults.regionId;
    	      this.subDomain = defaults.subDomain;
    	      this.trafficLimit = defaults.trafficLimit;
        }

        @CustomType.Setter
        public Builder billingStatus(String billingStatus) {
            this.billingStatus = Objects.requireNonNull(billingStatus);
            return this;
        }
        @CustomType.Setter
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
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
        public Builder illegalStatus(String illegalStatus) {
            this.illegalStatus = Objects.requireNonNull(illegalStatus);
            return this;
        }
        @CustomType.Setter
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        @CustomType.Setter
        public Builder subDomain(String subDomain) {
            this.subDomain = Objects.requireNonNull(subDomain);
            return this;
        }
        @CustomType.Setter
        public Builder trafficLimit(Integer trafficLimit) {
            this.trafficLimit = Objects.requireNonNull(trafficLimit);
            return this;
        }
        public GetGroupsGroup build() {
            final var _resultValue = new GetGroupsGroup();
            _resultValue.billingStatus = billingStatus;
            _resultValue.createdTime = createdTime;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.illegalStatus = illegalStatus;
            _resultValue.modifiedTime = modifiedTime;
            _resultValue.name = name;
            _resultValue.regionId = regionId;
            _resultValue.subDomain = subDomain;
            _resultValue.trafficLimit = trafficLimit;
            return _resultValue;
        }
    }
}
