// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.wafv3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainListen {
    /**
     * @return The ID of the certificate to be added. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol).
     * 
     */
    private final @Nullable String certId;
    /**
     * @return The type of encryption suite to add. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
     * - **1**: indicates that all encryption suites are added.
     * - **2**: indicates that a strong encryption package is added. You can select this value only if the value of **tls_version** is `tlsv1.2`.
     * - **99**: indicates that a custom encryption suite is added.
     * 
     */
    private final @Nullable Integer cipherSuite;
    /**
     * @return The specific custom encryption suite to add.
     * 
     */
    private final @Nullable List<String> customCiphers;
    /**
     * @return Whether TSL1.3 version is supported. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
     * - **true**: indicates that TSL1.3 is supported.
     * - **false**: indicates that TSL1.3 is not supported.
     * 
     */
    private final @Nullable Boolean enableTlsv3;
    /**
     * @return Whether to enable exclusive IP address. This parameter is used only when the value of **ipv6_enabled** is **false** (indicating that IPv6 is not enabled) and the value of **protection_resource** is **share** (indicating that a shared cluster is used). Value:
     * - **true**: indicates that the exclusive IP address is enabled.
     * - **false** (default): indicates that exclusive IP address is not enabled.
     * 
     */
    private final @Nullable Boolean exclusiveIp;
    /**
     * @return Whether to enable the forced jump of HTTPS. This parameter is used only when the value of `https_ports` is not empty (indicating that the domain name uses HTTPS protocol) and the value of httports is empty (indicating that the domain name does not use HTTP protocol). Value:
     * - **true**: indicates that HTTPS forced redirection is enabled.
     * - **false**: indicates that HTTPS forced redirection is not enabled.
     * 
     */
    private final @Nullable Boolean focusHttps;
    /**
     * @return Whether to turn on http2. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
     * - **true:** indicates that HTTP2 is enabled.
     * - **false** (default): indicates that HTTP2 is not enabled.
     * 
     */
    private final @Nullable Boolean http2Enabled;
    /**
     * @return The listening port of the HTTP protocol.
     * 
     */
    private final @Nullable List<Integer> httpPorts;
    /**
     * @return The listening port of the HTTPS protocol.
     * 
     */
    private final @Nullable List<Integer> httpsPorts;
    /**
     * @return Whether IPv6 is turned on. Value:
     * - **true**: indicates that IPv6 is enabled.
     * - **false** (default): indicates that IPv6 is not enabled.
     * 
     */
    private final @Nullable Boolean ipv6Enabled;
    /**
     * @return The type of protection resource to use. Value:
     * - **share** (default): indicates that a shared cluster is used.
     * - **gslb**: indicates that the shared cluster intelligent load balancing is used.
     * 
     */
    private final @Nullable String protectionResource;
    /**
     * @return The version of TLS to add. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value: **tlsv1**, **tlsv1.1**, **tlsv1.2**.
     * 
     */
    private final @Nullable String tlsVersion;
    /**
     * @return WAF obtains the real IP address of the client. Value:
     * - **0** (default): indicates that the client has not forwarded the traffic to WAF through other layer -7 agents.
     * - **1**: indicates that the first value of the X-Forwarded-For(XFF) field in the WAF read request header is used as the client IP address.
     * - **2**: indicates that the custom field value set by you in the WAF read request header is used as the client IP address.
     * 
     */
    private final @Nullable Integer xffHeaderMode;
    /**
     * @return Set the list of custom fields used to obtain the client IP address.
     * 
     */
    private final @Nullable List<String> xffHeaders;

    @CustomType.Constructor
    private DomainListen(
        @CustomType.Parameter("certId") @Nullable String certId,
        @CustomType.Parameter("cipherSuite") @Nullable Integer cipherSuite,
        @CustomType.Parameter("customCiphers") @Nullable List<String> customCiphers,
        @CustomType.Parameter("enableTlsv3") @Nullable Boolean enableTlsv3,
        @CustomType.Parameter("exclusiveIp") @Nullable Boolean exclusiveIp,
        @CustomType.Parameter("focusHttps") @Nullable Boolean focusHttps,
        @CustomType.Parameter("http2Enabled") @Nullable Boolean http2Enabled,
        @CustomType.Parameter("httpPorts") @Nullable List<Integer> httpPorts,
        @CustomType.Parameter("httpsPorts") @Nullable List<Integer> httpsPorts,
        @CustomType.Parameter("ipv6Enabled") @Nullable Boolean ipv6Enabled,
        @CustomType.Parameter("protectionResource") @Nullable String protectionResource,
        @CustomType.Parameter("tlsVersion") @Nullable String tlsVersion,
        @CustomType.Parameter("xffHeaderMode") @Nullable Integer xffHeaderMode,
        @CustomType.Parameter("xffHeaders") @Nullable List<String> xffHeaders) {
        this.certId = certId;
        this.cipherSuite = cipherSuite;
        this.customCiphers = customCiphers;
        this.enableTlsv3 = enableTlsv3;
        this.exclusiveIp = exclusiveIp;
        this.focusHttps = focusHttps;
        this.http2Enabled = http2Enabled;
        this.httpPorts = httpPorts;
        this.httpsPorts = httpsPorts;
        this.ipv6Enabled = ipv6Enabled;
        this.protectionResource = protectionResource;
        this.tlsVersion = tlsVersion;
        this.xffHeaderMode = xffHeaderMode;
        this.xffHeaders = xffHeaders;
    }

    /**
     * @return The ID of the certificate to be added. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol).
     * 
     */
    public Optional<String> certId() {
        return Optional.ofNullable(this.certId);
    }
    /**
     * @return The type of encryption suite to add. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
     * - **1**: indicates that all encryption suites are added.
     * - **2**: indicates that a strong encryption package is added. You can select this value only if the value of **tls_version** is `tlsv1.2`.
     * - **99**: indicates that a custom encryption suite is added.
     * 
     */
    public Optional<Integer> cipherSuite() {
        return Optional.ofNullable(this.cipherSuite);
    }
    /**
     * @return The specific custom encryption suite to add.
     * 
     */
    public List<String> customCiphers() {
        return this.customCiphers == null ? List.of() : this.customCiphers;
    }
    /**
     * @return Whether TSL1.3 version is supported. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
     * - **true**: indicates that TSL1.3 is supported.
     * - **false**: indicates that TSL1.3 is not supported.
     * 
     */
    public Optional<Boolean> enableTlsv3() {
        return Optional.ofNullable(this.enableTlsv3);
    }
    /**
     * @return Whether to enable exclusive IP address. This parameter is used only when the value of **ipv6_enabled** is **false** (indicating that IPv6 is not enabled) and the value of **protection_resource** is **share** (indicating that a shared cluster is used). Value:
     * - **true**: indicates that the exclusive IP address is enabled.
     * - **false** (default): indicates that exclusive IP address is not enabled.
     * 
     */
    public Optional<Boolean> exclusiveIp() {
        return Optional.ofNullable(this.exclusiveIp);
    }
    /**
     * @return Whether to enable the forced jump of HTTPS. This parameter is used only when the value of `https_ports` is not empty (indicating that the domain name uses HTTPS protocol) and the value of httports is empty (indicating that the domain name does not use HTTP protocol). Value:
     * - **true**: indicates that HTTPS forced redirection is enabled.
     * - **false**: indicates that HTTPS forced redirection is not enabled.
     * 
     */
    public Optional<Boolean> focusHttps() {
        return Optional.ofNullable(this.focusHttps);
    }
    /**
     * @return Whether to turn on http2. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
     * - **true:** indicates that HTTP2 is enabled.
     * - **false** (default): indicates that HTTP2 is not enabled.
     * 
     */
    public Optional<Boolean> http2Enabled() {
        return Optional.ofNullable(this.http2Enabled);
    }
    /**
     * @return The listening port of the HTTP protocol.
     * 
     */
    public List<Integer> httpPorts() {
        return this.httpPorts == null ? List.of() : this.httpPorts;
    }
    /**
     * @return The listening port of the HTTPS protocol.
     * 
     */
    public List<Integer> httpsPorts() {
        return this.httpsPorts == null ? List.of() : this.httpsPorts;
    }
    /**
     * @return Whether IPv6 is turned on. Value:
     * - **true**: indicates that IPv6 is enabled.
     * - **false** (default): indicates that IPv6 is not enabled.
     * 
     */
    public Optional<Boolean> ipv6Enabled() {
        return Optional.ofNullable(this.ipv6Enabled);
    }
    /**
     * @return The type of protection resource to use. Value:
     * - **share** (default): indicates that a shared cluster is used.
     * - **gslb**: indicates that the shared cluster intelligent load balancing is used.
     * 
     */
    public Optional<String> protectionResource() {
        return Optional.ofNullable(this.protectionResource);
    }
    /**
     * @return The version of TLS to add. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value: **tlsv1**, **tlsv1.1**, **tlsv1.2**.
     * 
     */
    public Optional<String> tlsVersion() {
        return Optional.ofNullable(this.tlsVersion);
    }
    /**
     * @return WAF obtains the real IP address of the client. Value:
     * - **0** (default): indicates that the client has not forwarded the traffic to WAF through other layer -7 agents.
     * - **1**: indicates that the first value of the X-Forwarded-For(XFF) field in the WAF read request header is used as the client IP address.
     * - **2**: indicates that the custom field value set by you in the WAF read request header is used as the client IP address.
     * 
     */
    public Optional<Integer> xffHeaderMode() {
        return Optional.ofNullable(this.xffHeaderMode);
    }
    /**
     * @return Set the list of custom fields used to obtain the client IP address.
     * 
     */
    public List<String> xffHeaders() {
        return this.xffHeaders == null ? List.of() : this.xffHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainListen defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certId;
        private @Nullable Integer cipherSuite;
        private @Nullable List<String> customCiphers;
        private @Nullable Boolean enableTlsv3;
        private @Nullable Boolean exclusiveIp;
        private @Nullable Boolean focusHttps;
        private @Nullable Boolean http2Enabled;
        private @Nullable List<Integer> httpPorts;
        private @Nullable List<Integer> httpsPorts;
        private @Nullable Boolean ipv6Enabled;
        private @Nullable String protectionResource;
        private @Nullable String tlsVersion;
        private @Nullable Integer xffHeaderMode;
        private @Nullable List<String> xffHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainListen defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certId = defaults.certId;
    	      this.cipherSuite = defaults.cipherSuite;
    	      this.customCiphers = defaults.customCiphers;
    	      this.enableTlsv3 = defaults.enableTlsv3;
    	      this.exclusiveIp = defaults.exclusiveIp;
    	      this.focusHttps = defaults.focusHttps;
    	      this.http2Enabled = defaults.http2Enabled;
    	      this.httpPorts = defaults.httpPorts;
    	      this.httpsPorts = defaults.httpsPorts;
    	      this.ipv6Enabled = defaults.ipv6Enabled;
    	      this.protectionResource = defaults.protectionResource;
    	      this.tlsVersion = defaults.tlsVersion;
    	      this.xffHeaderMode = defaults.xffHeaderMode;
    	      this.xffHeaders = defaults.xffHeaders;
        }

        public Builder certId(@Nullable String certId) {
            this.certId = certId;
            return this;
        }
        public Builder cipherSuite(@Nullable Integer cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }
        public Builder customCiphers(@Nullable List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public Builder customCiphers(String... customCiphers) {
            return customCiphers(List.of(customCiphers));
        }
        public Builder enableTlsv3(@Nullable Boolean enableTlsv3) {
            this.enableTlsv3 = enableTlsv3;
            return this;
        }
        public Builder exclusiveIp(@Nullable Boolean exclusiveIp) {
            this.exclusiveIp = exclusiveIp;
            return this;
        }
        public Builder focusHttps(@Nullable Boolean focusHttps) {
            this.focusHttps = focusHttps;
            return this;
        }
        public Builder http2Enabled(@Nullable Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Builder httpPorts(@Nullable List<Integer> httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public Builder httpPorts(Integer... httpPorts) {
            return httpPorts(List.of(httpPorts));
        }
        public Builder httpsPorts(@Nullable List<Integer> httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public Builder httpsPorts(Integer... httpsPorts) {
            return httpsPorts(List.of(httpsPorts));
        }
        public Builder ipv6Enabled(@Nullable Boolean ipv6Enabled) {
            this.ipv6Enabled = ipv6Enabled;
            return this;
        }
        public Builder protectionResource(@Nullable String protectionResource) {
            this.protectionResource = protectionResource;
            return this;
        }
        public Builder tlsVersion(@Nullable String tlsVersion) {
            this.tlsVersion = tlsVersion;
            return this;
        }
        public Builder xffHeaderMode(@Nullable Integer xffHeaderMode) {
            this.xffHeaderMode = xffHeaderMode;
            return this;
        }
        public Builder xffHeaders(@Nullable List<String> xffHeaders) {
            this.xffHeaders = xffHeaders;
            return this;
        }
        public Builder xffHeaders(String... xffHeaders) {
            return xffHeaders(List.of(xffHeaders));
        }        public DomainListen build() {
            return new DomainListen(certId, cipherSuite, customCiphers, enableTlsv3, exclusiveIp, focusHttps, http2Enabled, httpPorts, httpsPorts, ipv6Enabled, protectionResource, tlsVersion, xffHeaderMode, xffHeaders);
        }
    }
}
