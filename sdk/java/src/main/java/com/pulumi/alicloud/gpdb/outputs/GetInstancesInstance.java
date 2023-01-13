// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstancesInstance {
    /**
     * @return Instance availability zone.
     * 
     */
    private String availabilityZone;
    /**
     * @return Billing method. Value options are `PostPaid` for  Pay-As-You-Go and `PrePaid` for yearly or monthly subscription.
     * 
     */
    private String chargeType;
    /**
     * @return The time when you create an instance. The format is YYYY-MM-DDThh:mm:ssZ, such as 2011-05-30T12:11:4Z.
     * 
     */
    private String creationTime;
    /**
     * @return The description of an instance.
     * 
     */
    private String description;
    /**
     * @return Database engine type. Supported option is `gpdb`.
     * 
     */
    private String engine;
    /**
     * @return Database engine version.
     * 
     */
    private String engineVersion;
    /**
     * @return The instance id.
     * 
     */
    private String id;
    /**
     * @return The group type.
     * 
     */
    private String instanceClass;
    /**
     * @return The number of groups.
     * 
     */
    private String instanceGroupCount;
    private String instanceNetworkType;
    /**
     * @return Region ID the instance belongs to.
     * 
     */
    private String regionId;
    /**
     * @return Status of the instance.
     * 
     */
    private String status;

    private GetInstancesInstance() {}
    /**
     * @return Instance availability zone.
     * 
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * @return Billing method. Value options are `PostPaid` for  Pay-As-You-Go and `PrePaid` for yearly or monthly subscription.
     * 
     */
    public String chargeType() {
        return this.chargeType;
    }
    /**
     * @return The time when you create an instance. The format is YYYY-MM-DDThh:mm:ssZ, such as 2011-05-30T12:11:4Z.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return The description of an instance.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Database engine type. Supported option is `gpdb`.
     * 
     */
    public String engine() {
        return this.engine;
    }
    /**
     * @return Database engine version.
     * 
     */
    public String engineVersion() {
        return this.engineVersion;
    }
    /**
     * @return The instance id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The group type.
     * 
     */
    public String instanceClass() {
        return this.instanceClass;
    }
    /**
     * @return The number of groups.
     * 
     */
    public String instanceGroupCount() {
        return this.instanceGroupCount;
    }
    public String instanceNetworkType() {
        return this.instanceNetworkType;
    }
    /**
     * @return Region ID the instance belongs to.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return Status of the instance.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String availabilityZone;
        private String chargeType;
        private String creationTime;
        private String description;
        private String engine;
        private String engineVersion;
        private String id;
        private String instanceClass;
        private String instanceGroupCount;
        private String instanceNetworkType;
        private String regionId;
        private String status;
        public Builder() {}
        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.chargeType = defaults.chargeType;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.instanceClass = defaults.instanceClass;
    	      this.instanceGroupCount = defaults.instanceGroupCount;
    	      this.instanceNetworkType = defaults.instanceNetworkType;
    	      this.regionId = defaults.regionId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        @CustomType.Setter
        public Builder chargeType(String chargeType) {
            this.chargeType = Objects.requireNonNull(chargeType);
            return this;
        }
        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        @CustomType.Setter
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceClass(String instanceClass) {
            this.instanceClass = Objects.requireNonNull(instanceClass);
            return this;
        }
        @CustomType.Setter
        public Builder instanceGroupCount(String instanceGroupCount) {
            this.instanceGroupCount = Objects.requireNonNull(instanceGroupCount);
            return this;
        }
        @CustomType.Setter
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = Objects.requireNonNull(instanceNetworkType);
            return this;
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
        public GetInstancesInstance build() {
            final var o = new GetInstancesInstance();
            o.availabilityZone = availabilityZone;
            o.chargeType = chargeType;
            o.creationTime = creationTime;
            o.description = description;
            o.engine = engine;
            o.engineVersion = engineVersion;
            o.id = id;
            o.instanceClass = instanceClass;
            o.instanceGroupCount = instanceGroupCount;
            o.instanceNetworkType = instanceNetworkType;
            o.regionId = regionId;
            o.status = status;
            return o;
        }
    }
}
