// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEcsKeyPairsPairInstance {
    /**
     * @return The ID of the availability zone where the ECS instance is located.
     * 
     */
    private final String availabilityZone;
    private final String description;
    private final String imageId;
    /**
     * @return The ID of the ECS instance.
     * 
     */
    private final String instanceId;
    /**
     * @return The name of the ECS instance.
     * 
     */
    private final String instanceName;
    private final String instanceType;
    /**
     * @return The Key Pair Name.
     * 
     */
    private final String keyName;
    /**
     * @return The private IP address of the ECS instance.
     * 
     */
    private final String privateIp;
    /**
     * @return The public IP address or EIP of the ECS instance.
     * 
     */
    private final String publicIp;
    private final String regionId;
    private final String status;
    /**
     * @return The ID of the VSwitch attached to the ECS instance.
     * 
     */
    private final String vswitchId;

    @CustomType.Constructor
    private GetEcsKeyPairsPairInstance(
        @CustomType.Parameter("availabilityZone") String availabilityZone,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("instanceName") String instanceName,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("keyName") String keyName,
        @CustomType.Parameter("privateIp") String privateIp,
        @CustomType.Parameter("publicIp") String publicIp,
        @CustomType.Parameter("regionId") String regionId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("vswitchId") String vswitchId) {
        this.availabilityZone = availabilityZone;
        this.description = description;
        this.imageId = imageId;
        this.instanceId = instanceId;
        this.instanceName = instanceName;
        this.instanceType = instanceType;
        this.keyName = keyName;
        this.privateIp = privateIp;
        this.publicIp = publicIp;
        this.regionId = regionId;
        this.status = status;
        this.vswitchId = vswitchId;
    }

    /**
     * @return The ID of the availability zone where the ECS instance is located.
     * 
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }
    public String description() {
        return this.description;
    }
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return The ID of the ECS instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The name of the ECS instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The Key Pair Name.
     * 
     */
    public String keyName() {
        return this.keyName;
    }
    /**
     * @return The private IP address of the ECS instance.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    /**
     * @return The public IP address or EIP of the ECS instance.
     * 
     */
    public String publicIp() {
        return this.publicIp;
    }
    public String regionId() {
        return this.regionId;
    }
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the VSwitch attached to the ECS instance.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsKeyPairsPairInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityZone;
        private String description;
        private String imageId;
        private String instanceId;
        private String instanceName;
        private String instanceType;
        private String keyName;
        private String privateIp;
        private String publicIp;
        private String regionId;
        private String status;
        private String vswitchId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEcsKeyPairsPairInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.description = defaults.description;
    	      this.imageId = defaults.imageId;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.instanceType = defaults.instanceType;
    	      this.keyName = defaults.keyName;
    	      this.privateIp = defaults.privateIp;
    	      this.publicIp = defaults.publicIp;
    	      this.regionId = defaults.regionId;
    	      this.status = defaults.status;
    	      this.vswitchId = defaults.vswitchId;
        }

        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }        public GetEcsKeyPairsPairInstance build() {
            return new GetEcsKeyPairsPairInstance(availabilityZone, description, imageId, instanceId, instanceName, instanceType, keyName, privateIp, publicIp, regionId, status, vswitchId);
        }
    }
}
