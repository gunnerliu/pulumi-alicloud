// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eais.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstancesInstance {
    /**
     * @return The ID of the ECS instance to be bound.
     * 
     */
    private String clientInstanceId;
    /**
     * @return The name of the ECS instance bound to the EAIS instance.
     * 
     */
    private String clientInstanceName;
    /**
     * @return The type of the ECS instance bound to the EAIS instance.
     * 
     */
    private String clientInstanceType;
    /**
     * @return The ID of the Instance.
     * 
     */
    private String id;
    /**
     * @return The ID of the resource.
     * 
     */
    private String instanceId;
    /**
     * @return The name of the resource.
     * 
     */
    private String instanceName;
    /**
     * @return The type of the resource. Valid values: `eais.ei-a6.4xlarge`, `eais.ei-a6.2xlarge`, `eais.ei-a6.xlarge`, `eais.ei-a6.large`, `eais.ei-a6.medium`.
     * 
     */
    private String instanceType;
    /**
     * @return The status of the resource. Valid values: `Attaching`, `Available`, `Detaching`, `InUse`, `Starting`, `Unavailable`.
     * 
     */
    private String status;
    /**
     * @return The ID of the region to which the EAIS instance belongs.
     * 
     */
    private String zoneId;

    private GetInstancesInstance() {}
    /**
     * @return The ID of the ECS instance to be bound.
     * 
     */
    public String clientInstanceId() {
        return this.clientInstanceId;
    }
    /**
     * @return The name of the ECS instance bound to the EAIS instance.
     * 
     */
    public String clientInstanceName() {
        return this.clientInstanceName;
    }
    /**
     * @return The type of the ECS instance bound to the EAIS instance.
     * 
     */
    public String clientInstanceType() {
        return this.clientInstanceType;
    }
    /**
     * @return The ID of the Instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the resource.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return The type of the resource. Valid values: `eais.ei-a6.4xlarge`, `eais.ei-a6.2xlarge`, `eais.ei-a6.xlarge`, `eais.ei-a6.large`, `eais.ei-a6.medium`.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The status of the resource. Valid values: `Attaching`, `Available`, `Detaching`, `InUse`, `Starting`, `Unavailable`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the region to which the EAIS instance belongs.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientInstanceId;
        private String clientInstanceName;
        private String clientInstanceType;
        private String id;
        private String instanceId;
        private String instanceName;
        private String instanceType;
        private String status;
        private String zoneId;
        public Builder() {}
        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientInstanceId = defaults.clientInstanceId;
    	      this.clientInstanceName = defaults.clientInstanceName;
    	      this.clientInstanceType = defaults.clientInstanceType;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.instanceType = defaults.instanceType;
    	      this.status = defaults.status;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder clientInstanceId(String clientInstanceId) {
            this.clientInstanceId = Objects.requireNonNull(clientInstanceId);
            return this;
        }
        @CustomType.Setter
        public Builder clientInstanceName(String clientInstanceName) {
            this.clientInstanceName = Objects.requireNonNull(clientInstanceName);
            return this;
        }
        @CustomType.Setter
        public Builder clientInstanceType(String clientInstanceType) {
            this.clientInstanceType = Objects.requireNonNull(clientInstanceType);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public GetInstancesInstance build() {
            final var o = new GetInstancesInstance();
            o.clientInstanceId = clientInstanceId;
            o.clientInstanceName = clientInstanceName;
            o.clientInstanceType = clientInstanceType;
            o.id = id;
            o.instanceId = instanceId;
            o.instanceName = instanceName;
            o.instanceType = instanceType;
            o.status = status;
            o.zoneId = zoneId;
            return o;
        }
    }
}
