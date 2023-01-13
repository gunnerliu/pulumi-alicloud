// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudstoragegateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewaySmbUsersUser {
    /**
     * @return The Gateway ID.
     * 
     */
    private String gatewayId;
    /**
     * @return The ID of the Gateway SMB User.
     * 
     */
    private String id;
    /**
     * @return The username of the Gateway SMB User.
     * 
     */
    private String username;

    private GetGatewaySmbUsersUser() {}
    /**
     * @return The Gateway ID.
     * 
     */
    public String gatewayId() {
        return this.gatewayId;
    }
    /**
     * @return The ID of the Gateway SMB User.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The username of the Gateway SMB User.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewaySmbUsersUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String gatewayId;
        private String id;
        private String username;
        public Builder() {}
        public Builder(GetGatewaySmbUsersUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayId = defaults.gatewayId;
    	      this.id = defaults.id;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public GetGatewaySmbUsersUser build() {
            final var o = new GetGatewaySmbUsersUser();
            o.gatewayId = gatewayId;
            o.id = id;
            o.username = username;
            return o;
        }
    }
}
