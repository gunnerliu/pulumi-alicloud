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
    private final String acceleratorId;
    /**
     * @return The IP address of the traffic policy.
     * 
     */
    private final @Nullable String address;
    /**
     * @return A list of Custom Routing Endpoint Traffic Policies. Each element contains the following attributes:
     * 
     */
    private final List<GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy> customRoutingEndpointTrafficPolicies;
    /**
     * @return The ID of the Custom Routing Endpoint Group.
     * 
     */
    private final @Nullable String endpointGroupId;
    /**
     * @return The ID of the Custom Routing Endpoint.
     * 
     */
    private final @Nullable String endpointId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    /**
     * @return The ID of the custom routing listener to which the endpoint belongs.
     * 
     */
    private final @Nullable String listenerId;
    private final @Nullable String outputFile;
    private final @Nullable Integer pageNumber;
    private final @Nullable Integer pageSize;

    @CustomType.Constructor
    private GetCustomRoutingEndpointTrafficPoliciesResult(
        @CustomType.Parameter("acceleratorId") String acceleratorId,
        @CustomType.Parameter("address") @Nullable String address,
        @CustomType.Parameter("customRoutingEndpointTrafficPolicies") List<GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy> customRoutingEndpointTrafficPolicies,
        @CustomType.Parameter("endpointGroupId") @Nullable String endpointGroupId,
        @CustomType.Parameter("endpointId") @Nullable String endpointId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("listenerId") @Nullable String listenerId,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("pageNumber") @Nullable Integer pageNumber,
        @CustomType.Parameter("pageSize") @Nullable Integer pageSize) {
        this.acceleratorId = acceleratorId;
        this.address = address;
        this.customRoutingEndpointTrafficPolicies = customRoutingEndpointTrafficPolicies;
        this.endpointGroupId = endpointGroupId;
        this.endpointId = endpointId;
        this.id = id;
        this.ids = ids;
        this.listenerId = listenerId;
        this.outputFile = outputFile;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

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

        public Builder() {
    	      // Empty
        }

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

        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = Objects.requireNonNull(acceleratorId);
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        public Builder customRoutingEndpointTrafficPolicies(List<GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy> customRoutingEndpointTrafficPolicies) {
            this.customRoutingEndpointTrafficPolicies = Objects.requireNonNull(customRoutingEndpointTrafficPolicies);
            return this;
        }
        public Builder customRoutingEndpointTrafficPolicies(GetCustomRoutingEndpointTrafficPoliciesCustomRoutingEndpointTrafficPolicy... customRoutingEndpointTrafficPolicies) {
            return customRoutingEndpointTrafficPolicies(List.of(customRoutingEndpointTrafficPolicies));
        }
        public Builder endpointGroupId(@Nullable String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public Builder endpointId(@Nullable String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder listenerId(@Nullable String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder pageNumber(@Nullable Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Builder pageSize(@Nullable Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }        public GetCustomRoutingEndpointTrafficPoliciesResult build() {
            return new GetCustomRoutingEndpointTrafficPoliciesResult(acceleratorId, address, customRoutingEndpointTrafficPolicies, endpointGroupId, endpointId, id, ids, listenerId, outputFile, pageNumber, pageSize);
        }
    }
}
