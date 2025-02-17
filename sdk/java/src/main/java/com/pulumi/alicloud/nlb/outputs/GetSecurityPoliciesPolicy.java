// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSecurityPoliciesPolicy {
    /**
     * @return The supported cipher suites, which are determined by the TLS protocol version.
     * 
     */
    private List<String> ciphers;
    /**
     * @return The id of the TLS security policy.
     * 
     */
    private String id;
    /**
     * @return The ID of the resource group.
     * 
     */
    private String resourceGroupId;
    /**
     * @return The name of the TLS security policy.
     * 
     */
    private String securityPolicyName;
    /**
     * @return The status of the resource.
     * 
     */
    private String status;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return The TLS protocol versions that are supported.
     * 
     */
    private List<String> tlsVersions;

    private GetSecurityPoliciesPolicy() {}
    /**
     * @return The supported cipher suites, which are determined by the TLS protocol version.
     * 
     */
    public List<String> ciphers() {
        return this.ciphers;
    }
    /**
     * @return The id of the TLS security policy.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the resource group.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The name of the TLS security policy.
     * 
     */
    public String securityPolicyName() {
        return this.securityPolicyName;
    }
    /**
     * @return The status of the resource.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The TLS protocol versions that are supported.
     * 
     */
    public List<String> tlsVersions() {
        return this.tlsVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityPoliciesPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> ciphers;
        private String id;
        private String resourceGroupId;
        private String securityPolicyName;
        private String status;
        private Map<String,Object> tags;
        private List<String> tlsVersions;
        public Builder() {}
        public Builder(GetSecurityPoliciesPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ciphers = defaults.ciphers;
    	      this.id = defaults.id;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.securityPolicyName = defaults.securityPolicyName;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tlsVersions = defaults.tlsVersions;
        }

        @CustomType.Setter
        public Builder ciphers(List<String> ciphers) {
            if (ciphers == null) {
              throw new MissingRequiredPropertyException("GetSecurityPoliciesPolicy", "ciphers");
            }
            this.ciphers = ciphers;
            return this;
        }
        public Builder ciphers(String... ciphers) {
            return ciphers(List.of(ciphers));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSecurityPoliciesPolicy", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            if (resourceGroupId == null) {
              throw new MissingRequiredPropertyException("GetSecurityPoliciesPolicy", "resourceGroupId");
            }
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder securityPolicyName(String securityPolicyName) {
            if (securityPolicyName == null) {
              throw new MissingRequiredPropertyException("GetSecurityPoliciesPolicy", "securityPolicyName");
            }
            this.securityPolicyName = securityPolicyName;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetSecurityPoliciesPolicy", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetSecurityPoliciesPolicy", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder tlsVersions(List<String> tlsVersions) {
            if (tlsVersions == null) {
              throw new MissingRequiredPropertyException("GetSecurityPoliciesPolicy", "tlsVersions");
            }
            this.tlsVersions = tlsVersions;
            return this;
        }
        public Builder tlsVersions(String... tlsVersions) {
            return tlsVersions(List.of(tlsVersions));
        }
        public GetSecurityPoliciesPolicy build() {
            final var _resultValue = new GetSecurityPoliciesPolicy();
            _resultValue.ciphers = ciphers;
            _resultValue.id = id;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.securityPolicyName = securityPolicyName;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.tlsVersions = tlsVersions;
            return _resultValue;
        }
    }
}
