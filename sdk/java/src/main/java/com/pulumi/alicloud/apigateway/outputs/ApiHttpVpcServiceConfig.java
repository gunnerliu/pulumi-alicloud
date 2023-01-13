// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiHttpVpcServiceConfig {
    private @Nullable String aoneName;
    /**
     * @return The http method of backend service.
     * 
     */
    private String method;
    /**
     * @return System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html).
     * 
     */
    private String name;
    /**
     * @return The path of backend service.
     * 
     */
    private String path;
    /**
     * @return Backend service time-out time; unit: millisecond.
     * 
     */
    private Integer timeout;

    private ApiHttpVpcServiceConfig() {}
    public Optional<String> aoneName() {
        return Optional.ofNullable(this.aoneName);
    }
    /**
     * @return The http method of backend service.
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html).
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The path of backend service.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Backend service time-out time; unit: millisecond.
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiHttpVpcServiceConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aoneName;
        private String method;
        private String name;
        private String path;
        private Integer timeout;
        public Builder() {}
        public Builder(ApiHttpVpcServiceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aoneName = defaults.aoneName;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder aoneName(@Nullable String aoneName) {
            this.aoneName = aoneName;
            return this;
        }
        @CustomType.Setter
        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public ApiHttpVpcServiceConfig build() {
            final var o = new ApiHttpVpcServiceConfig();
            o.aoneName = aoneName;
            o.method = method;
            o.name = name;
            o.path = path;
            o.timeout = timeout;
            return o;
        }
    }
}
