// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointGroupEndpointConfiguration {
    /**
     * @return Indicates whether client IP addresses are reserved. Default Value: `false`. Valid values:
     * 
     */
    private @Nullable Boolean enableClientipPreservation;
    /**
     * @return Specifies whether to preserve client IP addresses by using the ProxyProtocol module. Default Value: `false`. Valid values:
     * 
     */
    private @Nullable Boolean enableProxyProtocol;
    /**
     * @return The IP address or domain name of Endpoint N in the endpoint group.
     * 
     */
    private String endpoint;
    /**
     * @return The type of Endpoint N in the endpoint group. Valid values:
     * 
     */
    private String type;
    /**
     * @return The weight of Endpoint N in the endpoint group. Valid values: `0` to `255`.
     * &gt; **NOTE:** If the weight of a terminal node is set to 0, global acceleration will terminate the distribution of traffic to the terminal node. Please be careful.
     * 
     */
    private Integer weight;

    private EndpointGroupEndpointConfiguration() {}
    /**
     * @return Indicates whether client IP addresses are reserved. Default Value: `false`. Valid values:
     * 
     */
    public Optional<Boolean> enableClientipPreservation() {
        return Optional.ofNullable(this.enableClientipPreservation);
    }
    /**
     * @return Specifies whether to preserve client IP addresses by using the ProxyProtocol module. Default Value: `false`. Valid values:
     * 
     */
    public Optional<Boolean> enableProxyProtocol() {
        return Optional.ofNullable(this.enableProxyProtocol);
    }
    /**
     * @return The IP address or domain name of Endpoint N in the endpoint group.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The type of Endpoint N in the endpoint group. Valid values:
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The weight of Endpoint N in the endpoint group. Valid values: `0` to `255`.
     * &gt; **NOTE:** If the weight of a terminal node is set to 0, global acceleration will terminate the distribution of traffic to the terminal node. Please be careful.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupEndpointConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableClientipPreservation;
        private @Nullable Boolean enableProxyProtocol;
        private String endpoint;
        private String type;
        private Integer weight;
        public Builder() {}
        public Builder(EndpointGroupEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableClientipPreservation = defaults.enableClientipPreservation;
    	      this.enableProxyProtocol = defaults.enableProxyProtocol;
    	      this.endpoint = defaults.endpoint;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder enableClientipPreservation(@Nullable Boolean enableClientipPreservation) {
            this.enableClientipPreservation = enableClientipPreservation;
            return this;
        }
        @CustomType.Setter
        public Builder enableProxyProtocol(@Nullable Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public EndpointGroupEndpointConfiguration build() {
            final var _resultValue = new EndpointGroupEndpointConfiguration();
            _resultValue.enableClientipPreservation = enableClientipPreservation;
            _resultValue.enableProxyProtocol = enableProxyProtocol;
            _resultValue.endpoint = endpoint;
            _resultValue.type = type;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
