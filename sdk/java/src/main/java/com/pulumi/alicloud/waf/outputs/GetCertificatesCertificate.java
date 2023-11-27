// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.waf.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCertificatesCertificate {
    /**
     * @return Certificate recording ID.
     * 
     */
    private String certificateId;
    /**
     * @return Your certificate name.
     * 
     */
    private String certificateName;
    /**
     * @return Certificate bound to the domain name.
     * 
     */
    private String commonName;
    /**
     * @return The domain that you want to add to WAF.
     * 
     */
    private String domain;
    /**
     * @return The ID of the Certificate.
     * 
     */
    private String id;
    /**
     * @return WAF instance ID.
     * 
     */
    private String instanceId;
    private Boolean isUsing;
    private List<String> sans;

    private GetCertificatesCertificate() {}
    /**
     * @return Certificate recording ID.
     * 
     */
    public String certificateId() {
        return this.certificateId;
    }
    /**
     * @return Your certificate name.
     * 
     */
    public String certificateName() {
        return this.certificateName;
    }
    /**
     * @return Certificate bound to the domain name.
     * 
     */
    public String commonName() {
        return this.commonName;
    }
    /**
     * @return The domain that you want to add to WAF.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return The ID of the Certificate.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return WAF instance ID.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    public Boolean isUsing() {
        return this.isUsing;
    }
    public List<String> sans() {
        return this.sans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificatesCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificateId;
        private String certificateName;
        private String commonName;
        private String domain;
        private String id;
        private String instanceId;
        private Boolean isUsing;
        private List<String> sans;
        public Builder() {}
        public Builder(GetCertificatesCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.certificateName = defaults.certificateName;
    	      this.commonName = defaults.commonName;
    	      this.domain = defaults.domain;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.isUsing = defaults.isUsing;
    	      this.sans = defaults.sans;
        }

        @CustomType.Setter
        public Builder certificateId(String certificateId) {
            this.certificateId = Objects.requireNonNull(certificateId);
            return this;
        }
        @CustomType.Setter
        public Builder certificateName(String certificateName) {
            this.certificateName = Objects.requireNonNull(certificateName);
            return this;
        }
        @CustomType.Setter
        public Builder commonName(String commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }
        @CustomType.Setter
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder isUsing(Boolean isUsing) {
            this.isUsing = Objects.requireNonNull(isUsing);
            return this;
        }
        @CustomType.Setter
        public Builder sans(List<String> sans) {
            this.sans = Objects.requireNonNull(sans);
            return this;
        }
        public Builder sans(String... sans) {
            return sans(List.of(sans));
        }
        public GetCertificatesCertificate build() {
            final var _resultValue = new GetCertificatesCertificate();
            _resultValue.certificateId = certificateId;
            _resultValue.certificateName = certificateName;
            _resultValue.commonName = commonName;
            _resultValue.domain = domain;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.isUsing = isUsing;
            _resultValue.sans = sans;
            return _resultValue;
        }
    }
}
