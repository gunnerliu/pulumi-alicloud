// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CustomDomainCertConfig {
    /**
     * @return The name of the certificate, used to distinguish different certificates.
     * 
     */
    private final String certName;
    /**
     * @return Certificate data of the HTTPS certificates, follow the &#39;pem&#39; format.
     * 
     */
    private final String certificate;
    /**
     * @return Private key of the HTTPS certificates, follow the &#39;pem&#39; format.
     * 
     */
    private final String privateKey;

    @CustomType.Constructor
    private CustomDomainCertConfig(
        @CustomType.Parameter("certName") String certName,
        @CustomType.Parameter("certificate") String certificate,
        @CustomType.Parameter("privateKey") String privateKey) {
        this.certName = certName;
        this.certificate = certificate;
        this.privateKey = privateKey;
    }

    /**
     * @return The name of the certificate, used to distinguish different certificates.
     * 
     */
    public String certName() {
        return this.certName;
    }
    /**
     * @return Certificate data of the HTTPS certificates, follow the &#39;pem&#39; format.
     * 
     */
    public String certificate() {
        return this.certificate;
    }
    /**
     * @return Private key of the HTTPS certificates, follow the &#39;pem&#39; format.
     * 
     */
    public String privateKey() {
        return this.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDomainCertConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certName;
        private String certificate;
        private String privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDomainCertConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certName = defaults.certName;
    	      this.certificate = defaults.certificate;
    	      this.privateKey = defaults.privateKey;
        }

        public Builder certName(String certName) {
            this.certName = Objects.requireNonNull(certName);
            return this;
        }
        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }        public CustomDomainCertConfig build() {
            return new CustomDomainCertConfig(certName, certificate, privateKey);
        }
    }
}
