// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink.outputs;

import com.pulumi.alicloud.privatelink.outputs.GetVpcEndpointServiceUsersUser;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVpcEndpointServiceUsersResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String outputFile;
    private final String serviceId;
    private final @Nullable String userId;
    private final List<GetVpcEndpointServiceUsersUser> users;

    @CustomType.Constructor
    private GetVpcEndpointServiceUsersResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("serviceId") String serviceId,
        @CustomType.Parameter("userId") @Nullable String userId,
        @CustomType.Parameter("users") List<GetVpcEndpointServiceUsersUser> users) {
        this.id = id;
        this.ids = ids;
        this.outputFile = outputFile;
        this.serviceId = serviceId;
        this.userId = userId;
        this.users = users;
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public String serviceId() {
        return this.serviceId;
    }
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }
    public List<GetVpcEndpointServiceUsersUser> users() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointServiceUsersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private String serviceId;
        private @Nullable String userId;
        private List<GetVpcEndpointServiceUsersUser> users;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcEndpointServiceUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.serviceId = defaults.serviceId;
    	      this.userId = defaults.userId;
    	      this.users = defaults.users;
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
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder userId(@Nullable String userId) {
            this.userId = userId;
            return this;
        }
        public Builder users(List<GetVpcEndpointServiceUsersUser> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public Builder users(GetVpcEndpointServiceUsersUser... users) {
            return users(List.of(users));
        }        public GetVpcEndpointServiceUsersResult build() {
            return new GetVpcEndpointServiceUsersResult(id, ids, outputFile, serviceId, userId, users);
        }
    }
}
