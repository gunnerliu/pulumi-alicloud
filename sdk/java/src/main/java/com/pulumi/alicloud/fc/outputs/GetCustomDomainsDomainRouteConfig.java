// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCustomDomainsDomainRouteConfig {
    /**
     * @return The name of the Function Compute function that requests are routed to.
     * 
     */
    private String functionName;
    /**
     * @return The requests of the specified HTTP methos are routed from. Valid method: GET, POST, DELETE, HEAD, PUT and PATCH. For example, &#34;GET, HEAD&#34; methods indicate that only requests from GET and HEAD methods are routed.
     * 
     */
    private List<String> methods;
    /**
     * @return The path that requests are routed from.
     * 
     */
    private String path;
    /**
     * @return The version or alias of the Function Compute service that requests are routed to. For example, qualifier v1 indicates that the requests are routed to the version 1 Function Compute service.
     * 
     */
    private String qualifier;
    /**
     * @return The name of the Function Compute service that requests are routed to.
     * 
     */
    private String serviceName;

    private GetCustomDomainsDomainRouteConfig() {}
    /**
     * @return The name of the Function Compute function that requests are routed to.
     * 
     */
    public String functionName() {
        return this.functionName;
    }
    /**
     * @return The requests of the specified HTTP methos are routed from. Valid method: GET, POST, DELETE, HEAD, PUT and PATCH. For example, &#34;GET, HEAD&#34; methods indicate that only requests from GET and HEAD methods are routed.
     * 
     */
    public List<String> methods() {
        return this.methods;
    }
    /**
     * @return The path that requests are routed from.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The version or alias of the Function Compute service that requests are routed to. For example, qualifier v1 indicates that the requests are routed to the version 1 Function Compute service.
     * 
     */
    public String qualifier() {
        return this.qualifier;
    }
    /**
     * @return The name of the Function Compute service that requests are routed to.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomDomainsDomainRouteConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String functionName;
        private List<String> methods;
        private String path;
        private String qualifier;
        private String serviceName;
        public Builder() {}
        public Builder(GetCustomDomainsDomainRouteConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.methods = defaults.methods;
    	      this.path = defaults.path;
    	      this.qualifier = defaults.qualifier;
    	      this.serviceName = defaults.serviceName;
        }

        @CustomType.Setter
        public Builder functionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }
        @CustomType.Setter
        public Builder methods(List<String> methods) {
            this.methods = Objects.requireNonNull(methods);
            return this;
        }
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder qualifier(String qualifier) {
            this.qualifier = Objects.requireNonNull(qualifier);
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetCustomDomainsDomainRouteConfig build() {
            final var o = new GetCustomDomainsDomainRouteConfig();
            o.functionName = functionName;
            o.methods = methods;
            o.path = path;
            o.qualifier = qualifier;
            o.serviceName = serviceName;
            return o;
        }
    }
}
