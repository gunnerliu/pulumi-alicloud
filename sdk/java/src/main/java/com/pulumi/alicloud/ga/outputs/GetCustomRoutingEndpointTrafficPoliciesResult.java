// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.alicloud.ga.outputs.GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCustomRoutingEndpointTrafficPoliciesResult {
    /**
     * @return The ID of the GA instance to which the endpoint belongs.
     * 
     */
    private String acceleratorId;
    /**
     * @return The IP address of the traffic policy.
     * 
     */
    private @Nullable String address;
    /**
     * @return A list of Custom Routing Endpoint Traffic Policies. Each element contains the following attributes:
     * 
     */
    private List<GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy> customRoutingEndpointTrafficPolicies;
    /**
     * @return The ID of the Custom Routing Endpoint Group.
     * 
     */
    private @Nullable String endpointGroupId;
    /**
     * @return The ID of the Custom Routing Endpoint.
     * 
     */
    private @Nullable String endpointId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    /**
     * @return The ID of the custom routing listener to which the endpoint belongs.
     * 
     */
    private @Nullable String listenerId;
    private @Nullable String outputFile;
    private @Nullable Integer pageNumber;
    private @Nullable Integer pageSize;

    private GetCustomRoutingEndpointTrafficPoliciesResult() {}
    /**
     * @return The ID of the GA instance to which the endpoint belongs.
     * 
     */
    public String acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * @return The IP address of the traffic policy.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return A list of Custom Routing Endpoint Traffic Policies. Each element contains the following attributes:
     * 
     */
    public List<GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy> customRoutingEndpointTrafficPolicies() {
        return this.customRoutingEndpointTrafficPolicies;
    }
    /**
     * @return The ID of the Custom Routing Endpoint Group.
     * 
     */
    public Optional<String> endpointGroupId() {
        return Optional.ofNullable(this.endpointGroupId);
    }
    /**
     * @return The ID of the Custom Routing Endpoint.
     * 
     */
    public Optional<String> endpointId() {
        return Optional.ofNullable(this.endpointId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return The ID of the custom routing listener to which the endpoint belongs.
     * 
     */
    public Optional<String> listenerId() {
        return Optional.ofNullable(this.listenerId);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomRoutingEndpointTrafficPoliciesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acceleratorId;
        private @Nullable String address;
        private List<GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy> customRoutingEndpointTrafficPolicies;
        private @Nullable String endpointGroupId;
        private @Nullable String endpointId;
        private String id;
        private List<String> ids;
        private @Nullable String listenerId;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        public Builder() {}
        public Builder(GetCustomRoutingEndpointTrafficPoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorId = defaults.acceleratorId;
    	      this.address = defaults.address;
    	      this.customRoutingEndpointTrafficPolicies = defaults.customRoutingEndpointTrafficPolicies;
    	      this.endpointGroupId = defaults.endpointGroupId;
    	      this.endpointId = defaults.endpointId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.listenerId = defaults.listenerId;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
        }

        @CustomType.Setter
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = Objects.requireNonNull(acceleratorId);
            return this;
        }
        @CustomType.Setter
        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder customRoutingEndpointTrafficPolicies(List<GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy> customRoutingEndpointTrafficPolicies) {
            this.customRoutingEndpointTrafficPolicies = Objects.requireNonNull(customRoutingEndpointTrafficPolicies);
            return this;
        }
        public Builder customRoutingEndpointTrafficPolicies(GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy... customRoutingEndpointTrafficPolicies) {
            return customRoutingEndpointTrafficPolicies(List.of(customRoutingEndpointTrafficPolicies));
        }
        @CustomType.Setter
        public Builder endpointGroupId(@Nullable String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder endpointId(@Nullable String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder listenerId(@Nullable String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder pageNumber(@Nullable Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        @CustomType.Setter
        public Builder pageSize(@Nullable Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public GetCustomRoutingEndpointTrafficPoliciesResult build() {
            final var _resultValue = new GetCustomRoutingEndpointTrafficPoliciesResult();
            _resultValue.acceleratorId = acceleratorId;
            _resultValue.address = address;
            _resultValue.customRoutingEndpointTrafficPolicies = customRoutingEndpointTrafficPolicies;
            _resultValue.endpointGroupId = endpointGroupId;
            _resultValue.endpointId = endpointId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.listenerId = listenerId;
            _resultValue.outputFile = outputFile;
            _resultValue.pageNumber = pageNumber;
            _resultValue.pageSize = pageSize;
            return _resultValue;
        }
    }
}
