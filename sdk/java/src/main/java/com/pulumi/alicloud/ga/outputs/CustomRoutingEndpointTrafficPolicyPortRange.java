// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomRoutingEndpointTrafficPolicyPortRange {
    /**
     * @return The start port of the port range of the traffic destination. The specified port must fall within the port range of the specified endpoint group.
     * 
     */
    private final @Nullable Integer fromPort;
    /**
     * @return The end port of the port range of the traffic destination. The specified port must fall within the port range of the specified endpoint group.
     * 
     */
    private final @Nullable Integer toPort;

    @CustomType.Constructor
    private CustomRoutingEndpointTrafficPolicyPortRange(
        @CustomType.Parameter("fromPort") @Nullable Integer fromPort,
        @CustomType.Parameter("toPort") @Nullable Integer toPort) {
        this.fromPort = fromPort;
        this.toPort = toPort;
    }

    /**
     * @return The start port of the port range of the traffic destination. The specified port must fall within the port range of the specified endpoint group.
     * 
     */
    public Optional<Integer> fromPort() {
        return Optional.ofNullable(this.fromPort);
    }
    /**
     * @return The end port of the port range of the traffic destination. The specified port must fall within the port range of the specified endpoint group.
     * 
     */
    public Optional<Integer> toPort() {
        return Optional.ofNullable(this.toPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRoutingEndpointTrafficPolicyPortRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fromPort;
        private @Nullable Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRoutingEndpointTrafficPolicyPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(@Nullable Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Builder toPort(@Nullable Integer toPort) {
            this.toPort = toPort;
            return this;
        }        public CustomRoutingEndpointTrafficPolicyPortRange build() {
            return new CustomRoutingEndpointTrafficPolicyPortRange(fromPort, toPort);
        }
    }
}
