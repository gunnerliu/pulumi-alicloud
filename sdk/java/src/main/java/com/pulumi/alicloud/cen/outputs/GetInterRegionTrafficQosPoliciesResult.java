// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetInterRegionTrafficQosPoliciesPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInterRegionTrafficQosPoliciesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String nameRegex;
    /**
     * @return A list of Inter Region Traffic Qos Policy names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    /**
     * @return A list of Cen Inter Region Traffic Qos Policies. Each element contains the following attributes:
     * 
     */
    private final List<GetInterRegionTrafficQosPoliciesPolicy> policies;
    /**
     * @return The status of the Inter Region Traffic Qos Policy.
     * 
     */
    private final @Nullable String status;
    private final @Nullable String trafficQosPolicyDescription;
    private final @Nullable String trafficQosPolicyId;
    private final @Nullable String trafficQosPolicyName;
    /**
     * @return The ID of the inter-region connection.
     * 
     */
    private final String transitRouterAttachmentId;
    /**
     * @return The ID of the transit router.
     * 
     */
    private final String transitRouterId;

    @CustomType.Constructor
    private GetInterRegionTrafficQosPoliciesResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("policies") List<GetInterRegionTrafficQosPoliciesPolicy> policies,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("trafficQosPolicyDescription") @Nullable String trafficQosPolicyDescription,
        @CustomType.Parameter("trafficQosPolicyId") @Nullable String trafficQosPolicyId,
        @CustomType.Parameter("trafficQosPolicyName") @Nullable String trafficQosPolicyName,
        @CustomType.Parameter("transitRouterAttachmentId") String transitRouterAttachmentId,
        @CustomType.Parameter("transitRouterId") String transitRouterId) {
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.policies = policies;
        this.status = status;
        this.trafficQosPolicyDescription = trafficQosPolicyDescription;
        this.trafficQosPolicyId = trafficQosPolicyId;
        this.trafficQosPolicyName = trafficQosPolicyName;
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        this.transitRouterId = transitRouterId;
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
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of Inter Region Traffic Qos Policy names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of Cen Inter Region Traffic Qos Policies. Each element contains the following attributes:
     * 
     */
    public List<GetInterRegionTrafficQosPoliciesPolicy> policies() {
        return this.policies;
    }
    /**
     * @return The status of the Inter Region Traffic Qos Policy.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> trafficQosPolicyDescription() {
        return Optional.ofNullable(this.trafficQosPolicyDescription);
    }
    public Optional<String> trafficQosPolicyId() {
        return Optional.ofNullable(this.trafficQosPolicyId);
    }
    public Optional<String> trafficQosPolicyName() {
        return Optional.ofNullable(this.trafficQosPolicyName);
    }
    /**
     * @return The ID of the inter-region connection.
     * 
     */
    public String transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }
    /**
     * @return The ID of the transit router.
     * 
     */
    public String transitRouterId() {
        return this.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterRegionTrafficQosPoliciesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetInterRegionTrafficQosPoliciesPolicy> policies;
        private @Nullable String status;
        private @Nullable String trafficQosPolicyDescription;
        private @Nullable String trafficQosPolicyId;
        private @Nullable String trafficQosPolicyName;
        private String transitRouterAttachmentId;
        private String transitRouterId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInterRegionTrafficQosPoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.policies = defaults.policies;
    	      this.status = defaults.status;
    	      this.trafficQosPolicyDescription = defaults.trafficQosPolicyDescription;
    	      this.trafficQosPolicyId = defaults.trafficQosPolicyId;
    	      this.trafficQosPolicyName = defaults.trafficQosPolicyName;
    	      this.transitRouterAttachmentId = defaults.transitRouterAttachmentId;
    	      this.transitRouterId = defaults.transitRouterId;
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
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder policies(List<GetInterRegionTrafficQosPoliciesPolicy> policies) {
            this.policies = Objects.requireNonNull(policies);
            return this;
        }
        public Builder policies(GetInterRegionTrafficQosPoliciesPolicy... policies) {
            return policies(List.of(policies));
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder trafficQosPolicyDescription(@Nullable String trafficQosPolicyDescription) {
            this.trafficQosPolicyDescription = trafficQosPolicyDescription;
            return this;
        }
        public Builder trafficQosPolicyId(@Nullable String trafficQosPolicyId) {
            this.trafficQosPolicyId = trafficQosPolicyId;
            return this;
        }
        public Builder trafficQosPolicyName(@Nullable String trafficQosPolicyName) {
            this.trafficQosPolicyName = trafficQosPolicyName;
            return this;
        }
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = Objects.requireNonNull(transitRouterAttachmentId);
            return this;
        }
        public Builder transitRouterId(String transitRouterId) {
            this.transitRouterId = Objects.requireNonNull(transitRouterId);
            return this;
        }        public GetInterRegionTrafficQosPoliciesResult build() {
            return new GetInterRegionTrafficQosPoliciesResult(id, ids, nameRegex, names, outputFile, policies, status, trafficQosPolicyDescription, trafficQosPolicyId, trafficQosPolicyName, transitRouterAttachmentId, transitRouterId);
        }
    }
}
