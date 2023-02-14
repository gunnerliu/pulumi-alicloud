// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSystemSecurityPoliciesPolicy {
    /**
     * @return The supported cipher suites, which are determined by the TLS protocol version.
     * 
     */
    private List<String> ciphers;
    /**
     * @return The ID of the Security Policy.
     * 
     */
    private String id;
    /**
     * @return The first ID of the resource.
     * 
     */
    private String securityPolicyId;
    /**
     * @return The TLS protocol versions are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
     * 
     */
    private List<String> tlsVersions;

    private GetSystemSecurityPoliciesPolicy() {}
    /**
     * @return The supported cipher suites, which are determined by the TLS protocol version.
     * 
     */
    public List<String> ciphers() {
        return this.ciphers;
    }
    /**
     * @return The ID of the Security Policy.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String securityPolicyId() {
        return this.securityPolicyId;
    }
    /**
     * @return The TLS protocol versions are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
     * 
     */
    public List<String> tlsVersions() {
        return this.tlsVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemSecurityPoliciesPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> ciphers;
        private String id;
        private String securityPolicyId;
        private List<String> tlsVersions;
        public Builder() {}
        public Builder(GetSystemSecurityPoliciesPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ciphers = defaults.ciphers;
    	      this.id = defaults.id;
    	      this.securityPolicyId = defaults.securityPolicyId;
    	      this.tlsVersions = defaults.tlsVersions;
        }

        @CustomType.Setter
        public Builder ciphers(List<String> ciphers) {
            this.ciphers = Objects.requireNonNull(ciphers);
            return this;
        }
        public Builder ciphers(String... ciphers) {
            return ciphers(List.of(ciphers));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder securityPolicyId(String securityPolicyId) {
            this.securityPolicyId = Objects.requireNonNull(securityPolicyId);
            return this;
        }
        @CustomType.Setter
        public Builder tlsVersions(List<String> tlsVersions) {
            this.tlsVersions = Objects.requireNonNull(tlsVersions);
            return this;
        }
        public Builder tlsVersions(String... tlsVersions) {
            return tlsVersions(List.of(tlsVersions));
        }
        public GetSystemSecurityPoliciesPolicy build() {
            final var o = new GetSystemSecurityPoliciesPolicy();
            o.ciphers = ciphers;
            o.id = id;
            o.securityPolicyId = securityPolicyId;
            o.tlsVersions = tlsVersions;
            return o;
        }
    }
}