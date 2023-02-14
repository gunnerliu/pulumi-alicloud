// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetListenersSlbListener {
    /**
     * @return Port opened on the backend server to receive requests.
     * 
     */
    private Integer backendPort;
    /**
     * @return Peak bandwidth. If the value is set to -1, the listener is not limited by bandwidth.
     * 
     */
    private Integer bandwidth;
    /**
     * @return ID of the CA certificate (only required when two-way authentication is used). Only available when the protocol is `https`.
     * 
     */
    private String caCertificateId;
    /**
     * @return Cookie configured by the backend server. Only available when the sticky_session_type is `server`.
     * 
     */
    private String cookie;
    /**
     * @return Cookie timeout in seconds. Only available when the sticky_session_type is `insert`.
     * 
     */
    private Integer cookieTimeout;
    /**
     * @return The description of slb listener.
     * 
     */
    private String description;
    /**
     * @return Whether to enable https listener support http2 or not. Valid values are `on` and `off`. Default to `on`.
     * 
     */
    private String enableHttp2;
    /**
     * @return Connection timeout in seconds for the Layer 4 TCP listener. Only available when the protocol is `tcp`.
     * 
     */
    private Integer establishedTimeout;
    /**
     * @return Filter listeners by the specified frontend port.
     * 
     */
    private Integer frontendPort;
    /**
     * @return Indicate whether Gzip compression is enabled or not. Possible values are `on` and `off`. Only available when the protocol is `http` or `https`.
     * 
     */
    private String gzip;
    /**
     * @return Indicate whether health check is enabled of not. Possible values are `on` and `off`.
     * 
     */
    private String healthCheck;
    /**
     * @return Port used for health check.
     * 
     */
    private Integer healthCheckConnectPort;
    /**
     * @return Amount of time in seconds to wait for the response for a health check.
     * 
     */
    private Integer healthCheckConnectTimeout;
    /**
     * @return Domain name used for health check. The SLB sends HTTP head requests to the backend server, the domain is useful when the backend server verifies the host field in the requests. Only available when the protocol is `http`, `https` or `tcp` (in this case health_check_type must be `http`).
     * 
     */
    private String healthCheckDomain;
    /**
     * @return HTTP status codes indicating that the health check is normal. It can contain several comma-separated values such as &#34;http_2xx,http_3xx&#34;. Only available when the protocol is `http`, `https` or `tcp` (in this case health_check_type must be `http`).
     * 
     */
    private String healthCheckHttpCode;
    /**
     * @return Time interval between two consecutive health checks.
     * 
     */
    private Integer healthCheckInterval;
    /**
     * @return Amount of time in seconds to wait for the response from a health check. If an ECS instance sends no response within the specified timeout period, the health check fails. Only available when the protocol is `http` or `https`.
     * 
     */
    private Integer healthCheckTimeout;
    /**
     * @return Health check method. Possible values are `tcp` and `http`. Only available when the protocol is `tcp`.
     * 
     */
    private String healthCheckType;
    /**
     * @return URI used for health check. Only available when the protocol is `http`, `https` or `tcp` (in this case health_check_type must be `http`).
     * 
     */
    private String healthCheckUri;
    /**
     * @return Number of consecutive successes of health check performed on the same ECS instance (from failure to success).
     * 
     */
    private Integer healthyThreshold;
    /**
     * @return Timeout of http or https listener established connection idle timeout. Valid value range: [1-60] in seconds. Default to 15.
     * 
     */
    private Integer idleTimeout;
    /**
     * @return ID of the active/standby server group.
     * 
     */
    private String masterSlaveServerGroupId;
    /**
     * @return Timeout value of the TCP connection in seconds. If the value is 0, the session persistence function is disabled. Only available when the protocol is `tcp`.
     * 
     */
    private Integer persistenceTimeout;
    /**
     * @return Filter listeners by the specified protocol. Valid values: `http`, `https`, `tcp` and `udp`.
     * 
     */
    private String protocol;
    /**
     * @return Whether to support carrying the client source address to the backend server through the Proxy Protocol. Valid values are `true` and `false`. Default to `false`.
     * 
     */
    private Boolean proxyProtocolV2Enabled;
    /**
     * @return Timeout of http or https listener request (which does not get response from backend) timeout. Valid value range: [1-180] in seconds. Default to 60.
     * 
     */
    private Integer requestTimeout;
    /**
     * @return Algorithm used to distribute traffic. Possible values: `wrr` (weighted round robin), `wlc` (weighted least connection) and `rr` (round robin).
     * 
     */
    private String scheduler;
    /**
     * @return Security status. Only available when the protocol is `https`.
     * 
     */
    private String securityStatus;
    private String serverCertificateId;
    /**
     * @return ID of the linked VServer group.
     * 
     */
    private String serverGroupId;
    /**
     * @return ID of the server certificate. Only available when the protocol is `https`.
     * 
     */
    private String sslCertificateId;
    /**
     * @return Listener status.
     * 
     */
    private String status;
    /**
     * @return Indicate whether session persistence is enabled or not. If enabled, all session requests from the same client are sent to the same backend server. Possible values are `on` and `off`. Only available when the protocol is `http` or `https`.
     * 
     */
    private String stickySession;
    /**
     * @return Method used to handle the cookie. Possible values are `insert` (cookie added to the response) and `server` (cookie set by the backend server). Only available when the protocol is `http` or `https` and sticky_session is `on`.
     * 
     */
    private String stickySessionType;
    /**
     * @return Https listener TLS cipher policy. Valid values are `tls_cipher_policy_1_0`, `tls_cipher_policy_1_1`, `tls_cipher_policy_1_2`, `tls_cipher_policy_1_2_strict`. Default to `tls_cipher_policy_1_0`.
     * 
     */
    private String tlsCipherPolicy;
    /**
     * @return Number of consecutive failures of health check performed on the same ECS instance (from success to failure).
     * 
     */
    private Integer unhealthyThreshold;
    /**
     * @return Indicate whether the HTTP header field &#34;X-Forwarded-For&#34; is added or not; it allows the backend server to know about the user&#39;s IP address. Possible values are `on` and `off`. Only available when the protocol is `http` or `https`.
     * 
     */
    private String xForwardedFor;
    /**
     * @return Indicate whether the HTTP header field &#34;X-Forwarded-For_SLBID&#34; is added or not; it allows the backend server to know about the SLB ID. Possible values are `on` and `off`. Only available when the protocol is `http` or `https`.
     * 
     */
    private String xForwardedForSlbId;
    /**
     * @return Indicate whether the HTTP header field &#34;X-Forwarded-For_SLBIP&#34; is added or not; it allows the backend server to know about the SLB IP address. Possible values are `on` and `off`. Only available when the protocol is `http` or `https`.
     * 
     */
    private String xForwardedForSlbIp;
    /**
     * @return Indicate whether the HTTP header field &#34;X-Forwarded-For_proto&#34; is added or not; it allows the backend server to know about the user&#39;s protocol. Possible values are `on` and `off`. Only available when the protocol is `http` or `https`.
     * 
     */
    private String xForwardedForSlbProto;

    private GetListenersSlbListener() {}
    /**
     * @return Port opened on the backend server to receive requests.
     * 
     */
    public Integer backendPort() {
        return this.backendPort;
    }
    /**
     * @return Peak bandwidth. If the value is set to -1, the listener is not limited by bandwidth.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return ID of the CA certificate (only required when two-way authentication is used). Only available when the protocol is `https`.
     * 
     */
    public String caCertificateId() {
        return this.caCertificateId;
    }
    /**
     * @return Cookie configured by the backend server. Only available when the sticky_session_type is `server`.
     * 
     */
    public String cookie() {
        return this.cookie;
    }
    /**
     * @return Cookie timeout in seconds. Only available when the sticky_session_type is `insert`.
     * 
     */
    public Integer cookieTimeout() {
        return this.cookieTimeout;
    }
    /**
     * @return The description of slb listener.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Whether to enable https listener support http2 or not. Valid values are `on` and `off`. Default to `on`.
     * 
     */
    public String enableHttp2() {
        return this.enableHttp2;
    }
    /**
     * @return Connection timeout in seconds for the Layer 4 TCP listener. Only available when the protocol is `tcp`.
     * 
     */
    public Integer establishedTimeout() {
        return this.establishedTimeout;
    }
    /**
     * @return Filter listeners by the specified frontend port.
     * 
     */
    public Integer frontendPort() {
        return this.frontendPort;
    }
    /**
     * @return Indicate whether Gzip compression is enabled or not. Possible values are `on` and `off`. Only available when the protocol is `http` or `https`.
     * 
     */
    public String gzip() {
        return this.gzip;
    }
    /**
     * @return Indicate whether health check is enabled of not. Possible values are `on` and `off`.
     * 
     */
    public String healthCheck() {
        return this.healthCheck;
    }
    /**
     * @return Port used for health check.
     * 
     */
    public Integer healthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }
    /**
     * @return Amount of time in seconds to wait for the response for a health check.
     * 
     */
    public Integer healthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }
    /**
     * @return Domain name used for health check. The SLB sends HTTP head requests to the backend server, the domain is useful when the backend server verifies the host field in the requests. Only available when the protocol is `http`, `https` or `tcp` (in this case health_check_type must be `http`).
     * 
     */
    public String healthCheckDomain() {
        return this.healthCheckDomain;
    }
    /**
     * @return HTTP status codes indicating that the health check is normal. It can contain several comma-separated values such as &#34;http_2xx,http_3xx&#34;. Only available when the protocol is `http`, `https` or `tcp` (in this case health_check_type must be `http`).
     * 
     */
    public String healthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }
    /**
     * @return Time interval between two consecutive health checks.
     * 
     */
    public Integer healthCheckInterval() {
        return this.healthCheckInterval;
    }
    /**
     * @return Amount of time in seconds to wait for the response from a health check. If an ECS instance sends no response within the specified timeout period, the health check fails. Only available when the protocol is `http` or `https`.
     * 
     */
    public Integer healthCheckTimeout() {
        return this.healthCheckTimeout;
    }
    /**
     * @return Health check method. Possible values are `tcp` and `http`. Only available when the protocol is `tcp`.
     * 
     */
    public String healthCheckType() {
        return this.healthCheckType;
    }
    /**
     * @return URI used for health check. Only available when the protocol is `http`, `https` or `tcp` (in this case health_check_type must be `http`).
     * 
     */
    public String healthCheckUri() {
        return this.healthCheckUri;
    }
    /**
     * @return Number of consecutive successes of health check performed on the same ECS instance (from failure to success).
     * 
     */
    public Integer healthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * @return Timeout of http or https listener established connection idle timeout. Valid value range: [1-60] in seconds. Default to 15.
     * 
     */
    public Integer idleTimeout() {
        return this.idleTimeout;
    }
    /**
     * @return ID of the active/standby server group.
     * 
     */
    public String masterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }
    /**
     * @return Timeout value of the TCP connection in seconds. If the value is 0, the session persistence function is disabled. Only available when the protocol is `tcp`.
     * 
     */
    public Integer persistenceTimeout() {
        return this.persistenceTimeout;
    }
    /**
     * @return Filter listeners by the specified protocol. Valid values: `http`, `https`, `tcp` and `udp`.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Whether to support carrying the client source address to the backend server through the Proxy Protocol. Valid values are `true` and `false`. Default to `false`.
     * 
     */
    public Boolean proxyProtocolV2Enabled() {
        return this.proxyProtocolV2Enabled;
    }
    /**
     * @return Timeout of http or https listener request (which does not get response from backend) timeout. Valid value range: [1-180] in seconds. Default to 60.
     * 
     */
    public Integer requestTimeout() {
        return this.requestTimeout;
    }
    /**
     * @return Algorithm used to distribute traffic. Possible values: `wrr` (weighted round robin), `wlc` (weighted least connection) and `rr` (round robin).
     * 
     */
    public String scheduler() {
        return this.scheduler;
    }
    /**
     * @return Security status. Only available when the protocol is `https`.
     * 
     */
    public String securityStatus() {
        return this.securityStatus;
    }
    public String serverCertificateId() {
        return this.serverCertificateId;
    }
    /**
     * @return ID of the linked VServer group.
     * 
     */
    public String serverGroupId() {
        return this.serverGroupId;
    }
    /**
     * @return ID of the server certificate. Only available when the protocol is `https`.
     * 
     */
    public String sslCertificateId() {
        return this.sslCertificateId;
    }
    /**
     * @return Listener status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Indicate whether session persistence is enabled or not. If enabled, all session requests from the same client are sent to the same backend server. Possible values are `on` and `off`. Only available when the protocol is `http` or `https`.
     * 
     */
    public String stickySession() {
        return this.stickySession;
    }
    /**
     * @return Method used to handle the cookie. Possible values are `insert` (cookie added to the response) and `server` (cookie set by the backend server). Only available when the protocol is `http` or `https` and sticky_session is `on`.
     * 
     */
    public String stickySessionType() {
        return this.stickySessionType;
    }
    /**
     * @return Https listener TLS cipher policy. Valid values are `tls_cipher_policy_1_0`, `tls_cipher_policy_1_1`, `tls_cipher_policy_1_2`, `tls_cipher_policy_1_2_strict`. Default to `tls_cipher_policy_1_0`.
     * 
     */
    public String tlsCipherPolicy() {
        return this.tlsCipherPolicy;
    }
    /**
     * @return Number of consecutive failures of health check performed on the same ECS instance (from success to failure).
     * 
     */
    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }
    /**
     * @return Indicate whether the HTTP header field &#34;X-Forwarded-For&#34; is added or not; it allows the backend server to know about the user&#39;s IP address. Possible values are `on` and `off`. Only available when the protocol is `http` or `https`.
     * 
     */
    public String xForwardedFor() {
        return this.xForwardedFor;
    }
    /**
     * @return Indicate whether the HTTP header field &#34;X-Forwarded-For_SLBID&#34; is added or not; it allows the backend server to know about the SLB ID. Possible values are `on` and `off`. Only available when the protocol is `http` or `https`.
     * 
     */
    public String xForwardedForSlbId() {
        return this.xForwardedForSlbId;
    }
    /**
     * @return Indicate whether the HTTP header field &#34;X-Forwarded-For_SLBIP&#34; is added or not; it allows the backend server to know about the SLB IP address. Possible values are `on` and `off`. Only available when the protocol is `http` or `https`.
     * 
     */
    public String xForwardedForSlbIp() {
        return this.xForwardedForSlbIp;
    }
    /**
     * @return Indicate whether the HTTP header field &#34;X-Forwarded-For_proto&#34; is added or not; it allows the backend server to know about the user&#39;s protocol. Possible values are `on` and `off`. Only available when the protocol is `http` or `https`.
     * 
     */
    public String xForwardedForSlbProto() {
        return this.xForwardedForSlbProto;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenersSlbListener defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer backendPort;
        private Integer bandwidth;
        private String caCertificateId;
        private String cookie;
        private Integer cookieTimeout;
        private String description;
        private String enableHttp2;
        private Integer establishedTimeout;
        private Integer frontendPort;
        private String gzip;
        private String healthCheck;
        private Integer healthCheckConnectPort;
        private Integer healthCheckConnectTimeout;
        private String healthCheckDomain;
        private String healthCheckHttpCode;
        private Integer healthCheckInterval;
        private Integer healthCheckTimeout;
        private String healthCheckType;
        private String healthCheckUri;
        private Integer healthyThreshold;
        private Integer idleTimeout;
        private String masterSlaveServerGroupId;
        private Integer persistenceTimeout;
        private String protocol;
        private Boolean proxyProtocolV2Enabled;
        private Integer requestTimeout;
        private String scheduler;
        private String securityStatus;
        private String serverCertificateId;
        private String serverGroupId;
        private String sslCertificateId;
        private String status;
        private String stickySession;
        private String stickySessionType;
        private String tlsCipherPolicy;
        private Integer unhealthyThreshold;
        private String xForwardedFor;
        private String xForwardedForSlbId;
        private String xForwardedForSlbIp;
        private String xForwardedForSlbProto;
        public Builder() {}
        public Builder(GetListenersSlbListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.bandwidth = defaults.bandwidth;
    	      this.caCertificateId = defaults.caCertificateId;
    	      this.cookie = defaults.cookie;
    	      this.cookieTimeout = defaults.cookieTimeout;
    	      this.description = defaults.description;
    	      this.enableHttp2 = defaults.enableHttp2;
    	      this.establishedTimeout = defaults.establishedTimeout;
    	      this.frontendPort = defaults.frontendPort;
    	      this.gzip = defaults.gzip;
    	      this.healthCheck = defaults.healthCheck;
    	      this.healthCheckConnectPort = defaults.healthCheckConnectPort;
    	      this.healthCheckConnectTimeout = defaults.healthCheckConnectTimeout;
    	      this.healthCheckDomain = defaults.healthCheckDomain;
    	      this.healthCheckHttpCode = defaults.healthCheckHttpCode;
    	      this.healthCheckInterval = defaults.healthCheckInterval;
    	      this.healthCheckTimeout = defaults.healthCheckTimeout;
    	      this.healthCheckType = defaults.healthCheckType;
    	      this.healthCheckUri = defaults.healthCheckUri;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.masterSlaveServerGroupId = defaults.masterSlaveServerGroupId;
    	      this.persistenceTimeout = defaults.persistenceTimeout;
    	      this.protocol = defaults.protocol;
    	      this.proxyProtocolV2Enabled = defaults.proxyProtocolV2Enabled;
    	      this.requestTimeout = defaults.requestTimeout;
    	      this.scheduler = defaults.scheduler;
    	      this.securityStatus = defaults.securityStatus;
    	      this.serverCertificateId = defaults.serverCertificateId;
    	      this.serverGroupId = defaults.serverGroupId;
    	      this.sslCertificateId = defaults.sslCertificateId;
    	      this.status = defaults.status;
    	      this.stickySession = defaults.stickySession;
    	      this.stickySessionType = defaults.stickySessionType;
    	      this.tlsCipherPolicy = defaults.tlsCipherPolicy;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
    	      this.xForwardedFor = defaults.xForwardedFor;
    	      this.xForwardedForSlbId = defaults.xForwardedForSlbId;
    	      this.xForwardedForSlbIp = defaults.xForwardedForSlbIp;
    	      this.xForwardedForSlbProto = defaults.xForwardedForSlbProto;
        }

        @CustomType.Setter
        public Builder backendPort(Integer backendPort) {
            this.backendPort = Objects.requireNonNull(backendPort);
            return this;
        }
        @CustomType.Setter
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        @CustomType.Setter
        public Builder caCertificateId(String caCertificateId) {
            this.caCertificateId = Objects.requireNonNull(caCertificateId);
            return this;
        }
        @CustomType.Setter
        public Builder cookie(String cookie) {
            this.cookie = Objects.requireNonNull(cookie);
            return this;
        }
        @CustomType.Setter
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = Objects.requireNonNull(cookieTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder enableHttp2(String enableHttp2) {
            this.enableHttp2 = Objects.requireNonNull(enableHttp2);
            return this;
        }
        @CustomType.Setter
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.establishedTimeout = Objects.requireNonNull(establishedTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder frontendPort(Integer frontendPort) {
            this.frontendPort = Objects.requireNonNull(frontendPort);
            return this;
        }
        @CustomType.Setter
        public Builder gzip(String gzip) {
            this.gzip = Objects.requireNonNull(gzip);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheck(String healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = Objects.requireNonNull(healthCheckConnectPort);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = Objects.requireNonNull(healthCheckConnectTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = Objects.requireNonNull(healthCheckDomain);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = Objects.requireNonNull(healthCheckHttpCode);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = Objects.requireNonNull(healthCheckInterval);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = Objects.requireNonNull(healthCheckTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckType(String healthCheckType) {
            this.healthCheckType = Objects.requireNonNull(healthCheckType);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckUri(String healthCheckUri) {
            this.healthCheckUri = Objects.requireNonNull(healthCheckUri);
            return this;
        }
        @CustomType.Setter
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }
        @CustomType.Setter
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = Objects.requireNonNull(idleTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = Objects.requireNonNull(masterSlaveServerGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder persistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = Objects.requireNonNull(persistenceTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder proxyProtocolV2Enabled(Boolean proxyProtocolV2Enabled) {
            this.proxyProtocolV2Enabled = Objects.requireNonNull(proxyProtocolV2Enabled);
            return this;
        }
        @CustomType.Setter
        public Builder requestTimeout(Integer requestTimeout) {
            this.requestTimeout = Objects.requireNonNull(requestTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder scheduler(String scheduler) {
            this.scheduler = Objects.requireNonNull(scheduler);
            return this;
        }
        @CustomType.Setter
        public Builder securityStatus(String securityStatus) {
            this.securityStatus = Objects.requireNonNull(securityStatus);
            return this;
        }
        @CustomType.Setter
        public Builder serverCertificateId(String serverCertificateId) {
            this.serverCertificateId = Objects.requireNonNull(serverCertificateId);
            return this;
        }
        @CustomType.Setter
        public Builder serverGroupId(String serverGroupId) {
            this.serverGroupId = Objects.requireNonNull(serverGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder sslCertificateId(String sslCertificateId) {
            this.sslCertificateId = Objects.requireNonNull(sslCertificateId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder stickySession(String stickySession) {
            this.stickySession = Objects.requireNonNull(stickySession);
            return this;
        }
        @CustomType.Setter
        public Builder stickySessionType(String stickySessionType) {
            this.stickySessionType = Objects.requireNonNull(stickySessionType);
            return this;
        }
        @CustomType.Setter
        public Builder tlsCipherPolicy(String tlsCipherPolicy) {
            this.tlsCipherPolicy = Objects.requireNonNull(tlsCipherPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }
        @CustomType.Setter
        public Builder xForwardedFor(String xForwardedFor) {
            this.xForwardedFor = Objects.requireNonNull(xForwardedFor);
            return this;
        }
        @CustomType.Setter
        public Builder xForwardedForSlbId(String xForwardedForSlbId) {
            this.xForwardedForSlbId = Objects.requireNonNull(xForwardedForSlbId);
            return this;
        }
        @CustomType.Setter
        public Builder xForwardedForSlbIp(String xForwardedForSlbIp) {
            this.xForwardedForSlbIp = Objects.requireNonNull(xForwardedForSlbIp);
            return this;
        }
        @CustomType.Setter
        public Builder xForwardedForSlbProto(String xForwardedForSlbProto) {
            this.xForwardedForSlbProto = Objects.requireNonNull(xForwardedForSlbProto);
            return this;
        }
        public GetListenersSlbListener build() {
            final var o = new GetListenersSlbListener();
            o.backendPort = backendPort;
            o.bandwidth = bandwidth;
            o.caCertificateId = caCertificateId;
            o.cookie = cookie;
            o.cookieTimeout = cookieTimeout;
            o.description = description;
            o.enableHttp2 = enableHttp2;
            o.establishedTimeout = establishedTimeout;
            o.frontendPort = frontendPort;
            o.gzip = gzip;
            o.healthCheck = healthCheck;
            o.healthCheckConnectPort = healthCheckConnectPort;
            o.healthCheckConnectTimeout = healthCheckConnectTimeout;
            o.healthCheckDomain = healthCheckDomain;
            o.healthCheckHttpCode = healthCheckHttpCode;
            o.healthCheckInterval = healthCheckInterval;
            o.healthCheckTimeout = healthCheckTimeout;
            o.healthCheckType = healthCheckType;
            o.healthCheckUri = healthCheckUri;
            o.healthyThreshold = healthyThreshold;
            o.idleTimeout = idleTimeout;
            o.masterSlaveServerGroupId = masterSlaveServerGroupId;
            o.persistenceTimeout = persistenceTimeout;
            o.protocol = protocol;
            o.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
            o.requestTimeout = requestTimeout;
            o.scheduler = scheduler;
            o.securityStatus = securityStatus;
            o.serverCertificateId = serverCertificateId;
            o.serverGroupId = serverGroupId;
            o.sslCertificateId = sslCertificateId;
            o.status = status;
            o.stickySession = stickySession;
            o.stickySessionType = stickySessionType;
            o.tlsCipherPolicy = tlsCipherPolicy;
            o.unhealthyThreshold = unhealthyThreshold;
            o.xForwardedFor = xForwardedFor;
            o.xForwardedForSlbId = xForwardedForSlbId;
            o.xForwardedForSlbIp = xForwardedForSlbIp;
            o.xForwardedForSlbProto = xForwardedForSlbProto;
            return o;
        }
    }
}