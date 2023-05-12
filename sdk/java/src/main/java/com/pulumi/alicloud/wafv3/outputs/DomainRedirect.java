// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.wafv3.outputs;

import com.pulumi.alicloud.wafv3.outputs.DomainRedirectRequestHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainRedirect {
    /**
     * @return The IP address of the origin server corresponding to the domain name or the back-to-origin domain name of the server.
     * 
     */
    private final @Nullable List<String> backends;
    /**
     * @return Connection timeout. Unit: seconds, value range: 5~120.
     * 
     */
    private final @Nullable Integer connectTimeout;
    /**
     * @return Whether to enable forced HTTP back-to-origin. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
     * - **true**: indicates that forced HTTP back-to-origin is enabled.
     * - **false**: indicates that forced HTTP back-to-origin is not enabled.
     * 
     */
    private final @Nullable Boolean focusHttpBackend;
    /**
     * @return Open long connection, default true.
     * 
     */
    private final @Nullable Boolean keepalive;
    /**
     * @return Number of long connections,  default: `60`. range :60-1000.
     * 
     */
    private final @Nullable Integer keepaliveRequests;
    /**
     * @return Long connection over time, default: `15`. Range: 1-60.
     * 
     */
    private final @Nullable Integer keepaliveTimeout;
    /**
     * @return The load balancing algorithm used when returning to the source. Value:
     * - **iphash**: indicates the IPHash algorithm.
     * - **roundRobin**: indicates the polling algorithm.
     * - **leastTime**: indicates the Least Time algorithm.
     * - This value can be selected only if the value of **protection_resource** is **gslb** (indicating that the protected resource type uses shared cluster intelligent load balancing).
     * 
     */
    private final String loadbalance;
    /**
     * @return Read timeout duration. **Unit**: seconds, **Value range**: 5~1800.
     * 
     */
    private final @Nullable Integer readTimeout;
    /**
     * @return The traffic tag field and value of the domain name, which is used to mark the traffic processed by WAF. the format of this parameter value is `[{&#34; k &#34;:&#34;_key_&#34;,&#34; v &#34;:&#34;_value_&#34;}]`. where_key_represents the specified custom request header field, and_value_represents the value set for this field.By specifying the custom request header field and the corresponding value, when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field value to the request header as the traffic mark, which is convenient for backend service statistics.Explain that if the custom header field already exists in the request, the system will overwrite the value of the custom field in the request with the set traffic tag value.See the following `Block RequestHeaders`.
     * 
     */
    private final @Nullable List<DomainRedirectRequestHeader> requestHeaders;
    /**
     * @return Back to Source Retry. default: true, retry 3 times by default.
     * 
     */
    private final @Nullable Boolean retry;
    /**
     * @return Whether to enable back-to-source SNI. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
     * - **true**: indicates that the back-to-source SNI is enabled.
     * - **false** (default) indicates that the back-to-source SNI is not enabled.
     * 
     */
    private final @Nullable Boolean sniEnabled;
    /**
     * @return Sets the value of the custom SNI extension field. If this parameter is not set, the value of the **Host** field in the request header is used as the value of the SNI extension field by default.In general, you do not need to customize SNI unless your business has special configuration requirements. You want WAF to use SNI that is inconsistent with the actual request Host in the back-to-origin request (that is, the custom SNI set here).&gt; This parameter is required only when **sni_enalbed** is set to **true** (indicating that back-to-source SNI is enabled).
     * 
     */
    private final @Nullable String sniHost;
    /**
     * @return Write timeout duration&gt; **Unit**: seconds, **Value range**: 5~1800.
     * 
     */
    private final @Nullable Integer writeTimeout;

    @CustomType.Constructor
    private DomainRedirect(
        @CustomType.Parameter("backends") @Nullable List<String> backends,
        @CustomType.Parameter("connectTimeout") @Nullable Integer connectTimeout,
        @CustomType.Parameter("focusHttpBackend") @Nullable Boolean focusHttpBackend,
        @CustomType.Parameter("keepalive") @Nullable Boolean keepalive,
        @CustomType.Parameter("keepaliveRequests") @Nullable Integer keepaliveRequests,
        @CustomType.Parameter("keepaliveTimeout") @Nullable Integer keepaliveTimeout,
        @CustomType.Parameter("loadbalance") String loadbalance,
        @CustomType.Parameter("readTimeout") @Nullable Integer readTimeout,
        @CustomType.Parameter("requestHeaders") @Nullable List<DomainRedirectRequestHeader> requestHeaders,
        @CustomType.Parameter("retry") @Nullable Boolean retry,
        @CustomType.Parameter("sniEnabled") @Nullable Boolean sniEnabled,
        @CustomType.Parameter("sniHost") @Nullable String sniHost,
        @CustomType.Parameter("writeTimeout") @Nullable Integer writeTimeout) {
        this.backends = backends;
        this.connectTimeout = connectTimeout;
        this.focusHttpBackend = focusHttpBackend;
        this.keepalive = keepalive;
        this.keepaliveRequests = keepaliveRequests;
        this.keepaliveTimeout = keepaliveTimeout;
        this.loadbalance = loadbalance;
        this.readTimeout = readTimeout;
        this.requestHeaders = requestHeaders;
        this.retry = retry;
        this.sniEnabled = sniEnabled;
        this.sniHost = sniHost;
        this.writeTimeout = writeTimeout;
    }

    /**
     * @return The IP address of the origin server corresponding to the domain name or the back-to-origin domain name of the server.
     * 
     */
    public List<String> backends() {
        return this.backends == null ? List.of() : this.backends;
    }
    /**
     * @return Connection timeout. Unit: seconds, value range: 5~120.
     * 
     */
    public Optional<Integer> connectTimeout() {
        return Optional.ofNullable(this.connectTimeout);
    }
    /**
     * @return Whether to enable forced HTTP back-to-origin. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
     * - **true**: indicates that forced HTTP back-to-origin is enabled.
     * - **false**: indicates that forced HTTP back-to-origin is not enabled.
     * 
     */
    public Optional<Boolean> focusHttpBackend() {
        return Optional.ofNullable(this.focusHttpBackend);
    }
    /**
     * @return Open long connection, default true.
     * 
     */
    public Optional<Boolean> keepalive() {
        return Optional.ofNullable(this.keepalive);
    }
    /**
     * @return Number of long connections,  default: `60`. range :60-1000.
     * 
     */
    public Optional<Integer> keepaliveRequests() {
        return Optional.ofNullable(this.keepaliveRequests);
    }
    /**
     * @return Long connection over time, default: `15`. Range: 1-60.
     * 
     */
    public Optional<Integer> keepaliveTimeout() {
        return Optional.ofNullable(this.keepaliveTimeout);
    }
    /**
     * @return The load balancing algorithm used when returning to the source. Value:
     * - **iphash**: indicates the IPHash algorithm.
     * - **roundRobin**: indicates the polling algorithm.
     * - **leastTime**: indicates the Least Time algorithm.
     * - This value can be selected only if the value of **protection_resource** is **gslb** (indicating that the protected resource type uses shared cluster intelligent load balancing).
     * 
     */
    public String loadbalance() {
        return this.loadbalance;
    }
    /**
     * @return Read timeout duration. **Unit**: seconds, **Value range**: 5~1800.
     * 
     */
    public Optional<Integer> readTimeout() {
        return Optional.ofNullable(this.readTimeout);
    }
    /**
     * @return The traffic tag field and value of the domain name, which is used to mark the traffic processed by WAF. the format of this parameter value is `[{&#34; k &#34;:&#34;_key_&#34;,&#34; v &#34;:&#34;_value_&#34;}]`. where_key_represents the specified custom request header field, and_value_represents the value set for this field.By specifying the custom request header field and the corresponding value, when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field value to the request header as the traffic mark, which is convenient for backend service statistics.Explain that if the custom header field already exists in the request, the system will overwrite the value of the custom field in the request with the set traffic tag value.See the following `Block RequestHeaders`.
     * 
     */
    public List<DomainRedirectRequestHeader> requestHeaders() {
        return this.requestHeaders == null ? List.of() : this.requestHeaders;
    }
    /**
     * @return Back to Source Retry. default: true, retry 3 times by default.
     * 
     */
    public Optional<Boolean> retry() {
        return Optional.ofNullable(this.retry);
    }
    /**
     * @return Whether to enable back-to-source SNI. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
     * - **true**: indicates that the back-to-source SNI is enabled.
     * - **false** (default) indicates that the back-to-source SNI is not enabled.
     * 
     */
    public Optional<Boolean> sniEnabled() {
        return Optional.ofNullable(this.sniEnabled);
    }
    /**
     * @return Sets the value of the custom SNI extension field. If this parameter is not set, the value of the **Host** field in the request header is used as the value of the SNI extension field by default.In general, you do not need to customize SNI unless your business has special configuration requirements. You want WAF to use SNI that is inconsistent with the actual request Host in the back-to-origin request (that is, the custom SNI set here).&gt; This parameter is required only when **sni_enalbed** is set to **true** (indicating that back-to-source SNI is enabled).
     * 
     */
    public Optional<String> sniHost() {
        return Optional.ofNullable(this.sniHost);
    }
    /**
     * @return Write timeout duration&gt; **Unit**: seconds, **Value range**: 5~1800.
     * 
     */
    public Optional<Integer> writeTimeout() {
        return Optional.ofNullable(this.writeTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainRedirect defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> backends;
        private @Nullable Integer connectTimeout;
        private @Nullable Boolean focusHttpBackend;
        private @Nullable Boolean keepalive;
        private @Nullable Integer keepaliveRequests;
        private @Nullable Integer keepaliveTimeout;
        private String loadbalance;
        private @Nullable Integer readTimeout;
        private @Nullable List<DomainRedirectRequestHeader> requestHeaders;
        private @Nullable Boolean retry;
        private @Nullable Boolean sniEnabled;
        private @Nullable String sniHost;
        private @Nullable Integer writeTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backends = defaults.backends;
    	      this.connectTimeout = defaults.connectTimeout;
    	      this.focusHttpBackend = defaults.focusHttpBackend;
    	      this.keepalive = defaults.keepalive;
    	      this.keepaliveRequests = defaults.keepaliveRequests;
    	      this.keepaliveTimeout = defaults.keepaliveTimeout;
    	      this.loadbalance = defaults.loadbalance;
    	      this.readTimeout = defaults.readTimeout;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.retry = defaults.retry;
    	      this.sniEnabled = defaults.sniEnabled;
    	      this.sniHost = defaults.sniHost;
    	      this.writeTimeout = defaults.writeTimeout;
        }

        public Builder backends(@Nullable List<String> backends) {
            this.backends = backends;
            return this;
        }
        public Builder backends(String... backends) {
            return backends(List.of(backends));
        }
        public Builder connectTimeout(@Nullable Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Builder focusHttpBackend(@Nullable Boolean focusHttpBackend) {
            this.focusHttpBackend = focusHttpBackend;
            return this;
        }
        public Builder keepalive(@Nullable Boolean keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public Builder keepaliveRequests(@Nullable Integer keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Builder keepaliveTimeout(@Nullable Integer keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Builder loadbalance(String loadbalance) {
            this.loadbalance = Objects.requireNonNull(loadbalance);
            return this;
        }
        public Builder readTimeout(@Nullable Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }
        public Builder requestHeaders(@Nullable List<DomainRedirectRequestHeader> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public Builder requestHeaders(DomainRedirectRequestHeader... requestHeaders) {
            return requestHeaders(List.of(requestHeaders));
        }
        public Builder retry(@Nullable Boolean retry) {
            this.retry = retry;
            return this;
        }
        public Builder sniEnabled(@Nullable Boolean sniEnabled) {
            this.sniEnabled = sniEnabled;
            return this;
        }
        public Builder sniHost(@Nullable String sniHost) {
            this.sniHost = sniHost;
            return this;
        }
        public Builder writeTimeout(@Nullable Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }        public DomainRedirect build() {
            return new DomainRedirect(backends, connectTimeout, focusHttpBackend, keepalive, keepaliveRequests, keepaliveTimeout, loadbalance, readTimeout, requestHeaders, retry, sniEnabled, sniHost, writeTimeout);
        }
    }
}
