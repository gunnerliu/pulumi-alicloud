// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.scdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainCertInfo {
    /**
     * @return If You Enable HTTPS Here Certificate Name.
     * 
     */
    private @Nullable String certName;
    /**
     * @return Certificate Type. Value Range:
     * * upload: Certificate
     * * cas: Certificate Authority Certificate.
     * * free: Free Certificate.
     * 
     */
    private @Nullable String certType;
    /**
     * @return Private Key. Do Not Enable Certificate without Entering a User Name and Configure Certificates Enter Private Key.
     * 
     */
    private @Nullable String sslPri;
    /**
     * @return Whether to Enable SSL Certificate. Valid Values: on, off. Valid values: `on`, `off`.
     * 
     */
    private @Nullable String sslProtocol;
    /**
     * @return If You Enable HTTPS Here Key.
     * 
     */
    private @Nullable String sslPub;

    private DomainCertInfo() {}
    /**
     * @return If You Enable HTTPS Here Certificate Name.
     * 
     */
    public Optional<String> certName() {
        return Optional.ofNullable(this.certName);
    }
    /**
     * @return Certificate Type. Value Range:
     * * upload: Certificate
     * * cas: Certificate Authority Certificate.
     * * free: Free Certificate.
     * 
     */
    public Optional<String> certType() {
        return Optional.ofNullable(this.certType);
    }
    /**
     * @return Private Key. Do Not Enable Certificate without Entering a User Name and Configure Certificates Enter Private Key.
     * 
     */
    public Optional<String> sslPri() {
        return Optional.ofNullable(this.sslPri);
    }
    /**
     * @return Whether to Enable SSL Certificate. Valid Values: on, off. Valid values: `on`, `off`.
     * 
     */
    public Optional<String> sslProtocol() {
        return Optional.ofNullable(this.sslProtocol);
    }
    /**
     * @return If You Enable HTTPS Here Key.
     * 
     */
    public Optional<String> sslPub() {
        return Optional.ofNullable(this.sslPub);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainCertInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certName;
        private @Nullable String certType;
        private @Nullable String sslPri;
        private @Nullable String sslProtocol;
        private @Nullable String sslPub;
        public Builder() {}
        public Builder(DomainCertInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certName = defaults.certName;
    	      this.certType = defaults.certType;
    	      this.sslPri = defaults.sslPri;
    	      this.sslProtocol = defaults.sslProtocol;
    	      this.sslPub = defaults.sslPub;
        }

        @CustomType.Setter
        public Builder certName(@Nullable String certName) {
            this.certName = certName;
            return this;
        }
        @CustomType.Setter
        public Builder certType(@Nullable String certType) {
            this.certType = certType;
            return this;
        }
        @CustomType.Setter
        public Builder sslPri(@Nullable String sslPri) {
            this.sslPri = sslPri;
            return this;
        }
        @CustomType.Setter
        public Builder sslProtocol(@Nullable String sslProtocol) {
            this.sslProtocol = sslProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder sslPub(@Nullable String sslPub) {
            this.sslPub = sslPub;
            return this;
        }
        public DomainCertInfo build() {
            final var _resultValue = new DomainCertInfo();
            _resultValue.certName = certName;
            _resultValue.certType = certType;
            _resultValue.sslPri = sslPri;
            _resultValue.sslProtocol = sslProtocol;
            _resultValue.sslPub = sslPub;
            return _resultValue;
        }
    }
}
