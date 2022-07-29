// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEipsEip {
    /**
     * @return EIP internet max bandwidth in Mbps.
     * 
     */
    private final String bandwidth;
    /**
     * @return Time of creation.
     * 
     */
    private final String creationTime;
    /**
     * @return (Optional, Available in v1.124.4+) Whether enable the deletion protection or not.
     * 
     */
    private final Boolean deletionProtection;
    /**
     * @return ID of the EIP.
     * 
     */
    private final String id;
    /**
     * @return The ID of the instance that is being bound.
     * 
     */
    private final String instanceId;
    /**
     * @return The instance type of that the EIP is bound.
     * 
     */
    private final String instanceType;
    /**
     * @return EIP internet charge type.
     * 
     */
    private final String internetChargeType;
    /**
     * @return Public IP Address of the the EIP.
     * 
     */
    private final String ipAddress;
    /**
     * @return EIP status. Possible values are: `Associating`, `Unassociating`, `InUse` and `Available`.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetEipsEip(
        @CustomType.Parameter("bandwidth") String bandwidth,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("deletionProtection") Boolean deletionProtection,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("internetChargeType") String internetChargeType,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("status") String status) {
        this.bandwidth = bandwidth;
        this.creationTime = creationTime;
        this.deletionProtection = deletionProtection;
        this.id = id;
        this.instanceId = instanceId;
        this.instanceType = instanceType;
        this.internetChargeType = internetChargeType;
        this.ipAddress = ipAddress;
        this.status = status;
    }

    /**
     * @return EIP internet max bandwidth in Mbps.
     * 
     */
    public String bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return Time of creation.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return (Optional, Available in v1.124.4+) Whether enable the deletion protection or not.
     * 
     */
    public Boolean deletionProtection() {
        return this.deletionProtection;
    }
    /**
     * @return ID of the EIP.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the instance that is being bound.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The instance type of that the EIP is bound.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return EIP internet charge type.
     * 
     */
    public String internetChargeType() {
        return this.internetChargeType;
    }
    /**
     * @return Public IP Address of the the EIP.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return EIP status. Possible values are: `Associating`, `Unassociating`, `InUse` and `Available`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEipsEip defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bandwidth;
        private String creationTime;
        private Boolean deletionProtection;
        private String id;
        private String instanceId;
        private String instanceType;
        private String internetChargeType;
        private String ipAddress;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEipsEip defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.creationTime = defaults.creationTime;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceType = defaults.instanceType;
    	      this.internetChargeType = defaults.internetChargeType;
    	      this.ipAddress = defaults.ipAddress;
    	      this.status = defaults.status;
        }

        public Builder bandwidth(String bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder deletionProtection(Boolean deletionProtection) {
            this.deletionProtection = Objects.requireNonNull(deletionProtection);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = Objects.requireNonNull(internetChargeType);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetEipsEip build() {
            return new GetEipsEip(bandwidth, creationTime, deletionProtection, id, instanceId, instanceType, internetChargeType, ipAddress, status);
        }
    }
}
