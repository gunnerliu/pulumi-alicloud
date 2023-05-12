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
     * @return Indicates whether client IP addresses are reserved. Valid values: `true`: Client IP addresses are reserved, `false`: Client IP addresses are not reserved. Default value is `false`.
     * 
     */
    private final @Nullable Boolean enableClientipPreservation;
    /**
     * @return The IP address or domain name of Endpoint N in the endpoint group.
     * 
     */
    private final String endpoint;
    /**
     * @return The type of Endpoint N in the endpoint group. Valid values: `Domain`: a custom domain name, `Ip`: a custom IP address, `PublicIp`: an Alibaba Cloud public IP address, `ECS`: an Alibaba Cloud Elastic Compute Service (ECS) instance, `SLB`: an Alibaba Cloud Server Load Balancer (SLB) instance.
     * 
     * &gt; **NOTE:** When the terminal node type is ECS or SLB, if the service association role does not exist, the system will automatically create a service association role named aliyunserviceroleforgavpcndpoint.
     * 
     */
    private final String type;
    /**
     * @return The weight of Endpoint N in the endpoint group. Valid value is 0 to 255.
     * 
     * &gt; **NOTE:** If the weight of a terminal node is set to 0, global acceleration will terminate the distribution of traffic to the terminal node. Please be careful.
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private EndpointGroupEndpointConfiguration(
        @CustomType.Parameter("enableClientipPreservation") @Nullable Boolean enableClientipPreservation,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("weight") Integer weight) {
        this.enableClientipPreservation = enableClientipPreservation;
        this.endpoint = endpoint;
        this.type = type;
        this.weight = weight;
    }

    /**
     * @return Indicates whether client IP addresses are reserved. Valid values: `true`: Client IP addresses are reserved, `false`: Client IP addresses are not reserved. Default value is `false`.
     * 
     */
    public Optional<Boolean> enableClientipPreservation() {
        return Optional.ofNullable(this.enableClientipPreservation);
    }
    /**
     * @return The IP address or domain name of Endpoint N in the endpoint group.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The type of Endpoint N in the endpoint group. Valid values: `Domain`: a custom domain name, `Ip`: a custom IP address, `PublicIp`: an Alibaba Cloud public IP address, `ECS`: an Alibaba Cloud Elastic Compute Service (ECS) instance, `SLB`: an Alibaba Cloud Server Load Balancer (SLB) instance.
     * 
     * &gt; **NOTE:** When the terminal node type is ECS or SLB, if the service association role does not exist, the system will automatically create a service association role named aliyunserviceroleforgavpcndpoint.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The weight of Endpoint N in the endpoint group. Valid value is 0 to 255.
     * 
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

    public static final class Builder {
        private @Nullable Boolean enableClientipPreservation;
        private String endpoint;
        private String type;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGroupEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableClientipPreservation = defaults.enableClientipPreservation;
    	      this.endpoint = defaults.endpoint;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        public Builder enableClientipPreservation(@Nullable Boolean enableClientipPreservation) {
            this.enableClientipPreservation = enableClientipPreservation;
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public EndpointGroupEndpointConfiguration build() {
            return new EndpointGroupEndpointConfiguration(enableClientipPreservation, endpoint, type, weight);
        }
    }
}
