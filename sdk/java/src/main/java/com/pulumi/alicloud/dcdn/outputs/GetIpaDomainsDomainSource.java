// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIpaDomainsDomainSource {
    /**
     * @return The address of the origin server.
     * 
     */
    private String content;
    /**
     * @return The custom port.
     * 
     */
    private Integer port;
    /**
     * @return The priority of the origin server if multiple origin servers are specified.
     * 
     */
    private String priority;
    /**
     * @return The type of the origin server.
     * 
     */
    private String type;
    /**
     * @return The weight of the origin server if multiple origin servers are specified.
     * 
     */
    private Integer weight;

    private GetIpaDomainsDomainSource() {}
    /**
     * @return The address of the origin server.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return The custom port.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The priority of the origin server if multiple origin servers are specified.
     * 
     */
    public String priority() {
        return this.priority;
    }
    /**
     * @return The type of the origin server.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The weight of the origin server if multiple origin servers are specified.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpaDomainsDomainSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String content;
        private Integer port;
        private String priority;
        private String type;
        private Integer weight;
        public Builder() {}
        public Builder(GetIpaDomainsDomainSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.port = defaults.port;
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder priority(String priority) {
            this.priority = Objects.requireNonNull(priority);
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
        public GetIpaDomainsDomainSource build() {
            final var _resultValue = new GetIpaDomainsDomainSource();
            _resultValue.content = content;
            _resultValue.port = port;
            _resultValue.priority = priority;
            _resultValue.type = type;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
