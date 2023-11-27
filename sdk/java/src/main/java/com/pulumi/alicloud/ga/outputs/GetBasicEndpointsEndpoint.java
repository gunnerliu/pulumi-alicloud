// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBasicEndpointsEndpoint {
    /**
     * @return The ID of the Global Accelerator Basic Accelerator instance.
     * 
     */
    private String acceleratorId;
    /**
     * @return The name of the Basic Endpoint.
     * 
     */
    private String basicEndpointName;
    /**
     * @return The address of the Basic Endpoint.
     * 
     */
    private String endpointAddress;
    /**
     * @return The ID of the Basic Endpoint Group.
     * 
     */
    private String endpointGroupId;
    /**
     * @return The ID of the Basic Endpoint.
     * 
     */
    private String endpointId;
    /**
     * @return The sub address of the Basic Endpoint.
     * 
     */
    private String endpointSubAddress;
    /**
     * @return The sub address type of the Basic Endpoint.
     * 
     */
    private String endpointSubAddressType;
    /**
     * @return The type of the Basic Endpoint. Valid values: `ENI`, `SLB`, `ECS` and `NLB`.
     * 
     */
    private String endpointType;
    /**
     * @return The zone id of the Basic Endpoint.
     * 
     */
    private String endpointZoneId;
    /**
     * @return The id of the Global Accelerator Basic Endpoint. It formats as `&lt;endpoint_group_id&gt;:&lt;endpoint_id&gt;`.
     * 
     */
    private String id;
    /**
     * @return The status of the Global Accelerator Basic Endpoint. Valid Value: `init`, `active`, `updating`, `binding`, `unbinding`, `deleting`, `bound`.
     * 
     */
    private String status;

    private GetBasicEndpointsEndpoint() {}
    /**
     * @return The ID of the Global Accelerator Basic Accelerator instance.
     * 
     */
    public String acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * @return The name of the Basic Endpoint.
     * 
     */
    public String basicEndpointName() {
        return this.basicEndpointName;
    }
    /**
     * @return The address of the Basic Endpoint.
     * 
     */
    public String endpointAddress() {
        return this.endpointAddress;
    }
    /**
     * @return The ID of the Basic Endpoint Group.
     * 
     */
    public String endpointGroupId() {
        return this.endpointGroupId;
    }
    /**
     * @return The ID of the Basic Endpoint.
     * 
     */
    public String endpointId() {
        return this.endpointId;
    }
    /**
     * @return The sub address of the Basic Endpoint.
     * 
     */
    public String endpointSubAddress() {
        return this.endpointSubAddress;
    }
    /**
     * @return The sub address type of the Basic Endpoint.
     * 
     */
    public String endpointSubAddressType() {
        return this.endpointSubAddressType;
    }
    /**
     * @return The type of the Basic Endpoint. Valid values: `ENI`, `SLB`, `ECS` and `NLB`.
     * 
     */
    public String endpointType() {
        return this.endpointType;
    }
    /**
     * @return The zone id of the Basic Endpoint.
     * 
     */
    public String endpointZoneId() {
        return this.endpointZoneId;
    }
    /**
     * @return The id of the Global Accelerator Basic Endpoint. It formats as `&lt;endpoint_group_id&gt;:&lt;endpoint_id&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The status of the Global Accelerator Basic Endpoint. Valid Value: `init`, `active`, `updating`, `binding`, `unbinding`, `deleting`, `bound`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBasicEndpointsEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acceleratorId;
        private String basicEndpointName;
        private String endpointAddress;
        private String endpointGroupId;
        private String endpointId;
        private String endpointSubAddress;
        private String endpointSubAddressType;
        private String endpointType;
        private String endpointZoneId;
        private String id;
        private String status;
        public Builder() {}
        public Builder(GetBasicEndpointsEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorId = defaults.acceleratorId;
    	      this.basicEndpointName = defaults.basicEndpointName;
    	      this.endpointAddress = defaults.endpointAddress;
    	      this.endpointGroupId = defaults.endpointGroupId;
    	      this.endpointId = defaults.endpointId;
    	      this.endpointSubAddress = defaults.endpointSubAddress;
    	      this.endpointSubAddressType = defaults.endpointSubAddressType;
    	      this.endpointType = defaults.endpointType;
    	      this.endpointZoneId = defaults.endpointZoneId;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = Objects.requireNonNull(acceleratorId);
            return this;
        }
        @CustomType.Setter
        public Builder basicEndpointName(String basicEndpointName) {
            this.basicEndpointName = Objects.requireNonNull(basicEndpointName);
            return this;
        }
        @CustomType.Setter
        public Builder endpointAddress(String endpointAddress) {
            this.endpointAddress = Objects.requireNonNull(endpointAddress);
            return this;
        }
        @CustomType.Setter
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = Objects.requireNonNull(endpointGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder endpointId(String endpointId) {
            this.endpointId = Objects.requireNonNull(endpointId);
            return this;
        }
        @CustomType.Setter
        public Builder endpointSubAddress(String endpointSubAddress) {
            this.endpointSubAddress = Objects.requireNonNull(endpointSubAddress);
            return this;
        }
        @CustomType.Setter
        public Builder endpointSubAddressType(String endpointSubAddressType) {
            this.endpointSubAddressType = Objects.requireNonNull(endpointSubAddressType);
            return this;
        }
        @CustomType.Setter
        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        @CustomType.Setter
        public Builder endpointZoneId(String endpointZoneId) {
            this.endpointZoneId = Objects.requireNonNull(endpointZoneId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetBasicEndpointsEndpoint build() {
            final var _resultValue = new GetBasicEndpointsEndpoint();
            _resultValue.acceleratorId = acceleratorId;
            _resultValue.basicEndpointName = basicEndpointName;
            _resultValue.endpointAddress = endpointAddress;
            _resultValue.endpointGroupId = endpointGroupId;
            _resultValue.endpointId = endpointId;
            _resultValue.endpointSubAddress = endpointSubAddress;
            _resultValue.endpointSubAddressType = endpointSubAddressType;
            _resultValue.endpointType = endpointType;
            _resultValue.endpointZoneId = endpointZoneId;
            _resultValue.id = id;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
