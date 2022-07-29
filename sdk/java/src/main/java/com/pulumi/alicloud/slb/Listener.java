// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.slb.ListenerArgs;
import com.pulumi.alicloud.slb.inputs.ListenerState;
import com.pulumi.alicloud.slb.outputs.ListenerXForwardedFor;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Application Load Balancer Listener resource.
 * 
 * For information about slb and how to use it, see [What is Server Load Balancer](https://www.alibabacloud.com/help/doc-detail/27539.htm).
 * 
 * For information about listener and how to use it, to see the following:
 * 
 * * [Configure a HTTP Listener](https://www.alibabacloud.com/help/doc-detail/27592.htm).
 * * [Configure a HTTPS Listener](https://www.alibabacloud.com/help/doc-detail/27593.htm).
 * * [Configure a TCP Listener](https://www.alibabacloud.com/help/doc-detail/27594.htm).
 * * [Configure a UDP Listener](https://www.alibabacloud.com/help/doc-detail/27595.htm).
 * 
 * ## Listener fields and protocol mapping
 * 
 * load balance support 4 protocol to listen on, they are `http`,`https`,`tcp`,`udp`, the every listener support which portocal following:
 * 
 * listener parameter | support protocol | value range |
 * ------------- | ------------- | ------------- |
 * backend_port | http &amp; https &amp; tcp &amp; udp | 1-65535 |
 * frontend_port | http &amp; https &amp; tcp &amp; udp | 1-65535 |
 * protocol | http &amp; https &amp; tcp &amp; udp |
 * bandwidth | http &amp; https &amp; tcp &amp; udp | -1 / 1-1000 |
 * scheduler | http &amp; https &amp; tcp &amp; udp | wrr, rr, wlc, tch, qch |
 * sticky_session | http &amp; https | on or off |
 * sticky_session_type | http &amp; https | insert or server |
 * cookie_timeout | http &amp; https | 1-86400  |
 * cookie | http &amp; https |   |
 * persistence_timeout | tcp &amp; udp | 0-3600 |
 * health_check | http &amp; https | on or off |
 * health_check_type | tcp | tcp or http |
 * health_check_domain | http &amp; https &amp; tcp |
 * health_check_method | http &amp; https &amp; tcp |
 * health_check_uri | http &amp; https &amp; tcp |  |
 * health_check_connect_port | http &amp; https &amp; tcp &amp; udp | 1-65535 or -520 |
 * healthy_threshold | http &amp; https &amp; tcp &amp; udp | 1-10 |
 * unhealthy_threshold | http &amp; https &amp; tcp &amp; udp | 1-10 |
 * health_check_timeout | http &amp; https &amp; tcp &amp; udp | 1-300 |
 * health_check_interval | http &amp; https &amp; tcp &amp; udp | 1-50 |
 * health_check_http_code | http &amp; https &amp; tcp | http_2xx,http_3xx,http_4xx,http_5xx |
 * server_certificate_id | https |  |
 * gzip | http &amp; https | true or false  |
 * x_forwarded_for | http &amp; https |  |
 * acl_status | http &amp; https &amp; tcp &amp; udp | on or off |
 * acl_type   | http &amp; https &amp; tcp &amp; udp | white or black |
 * acl_id     | http &amp; https &amp; tcp &amp; udp | the id of resource alicloud_slb_acl|
 * established_timeout | tcp       | 10-900|
 * idle_timeout |http &amp; https      | 1-60  |
 * request_timeout |http &amp; https   | 1-180 |
 * enable_http2    |https          | on or off |
 * tls_cipher_policy |https        |  tls_cipher_policy_1_0, tls_cipher_policy_1_1, tls_cipher_policy_1_2, tls_cipher_policy_1_2_strict |
 * server_group_id    | http &amp; https &amp; tcp &amp; udp | the id of resource alicloud.slb.ServerGroup |
 * 
 * The listener mapping supports the following:
 * 
 * ## Import
 * 
 * Load balancer listener can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:slb/listener:Listener example &#34;lb-abc123456:tcp:22&#34;
 * ```
 * 
 */
@ResourceType(type="alicloud:slb/listener:Listener")
public class Listener extends com.pulumi.resources.CustomResource {
    /**
     * the id of access control list to be apply on the listener, is the id of resource alicloud_slb_acl. If `acl_status` is &#34;on&#34;, it is mandatory. Otherwise, it will be ignored.
     * 
     */
    @Export(name="aclId", type=String.class, parameters={})
    private Output</* @Nullable */ String> aclId;

    /**
     * @return the id of access control list to be apply on the listener, is the id of resource alicloud_slb_acl. If `acl_status` is &#34;on&#34;, it is mandatory. Otherwise, it will be ignored.
     * 
     */
    public Output<Optional<String>> aclId() {
        return Codegen.optional(this.aclId);
    }
    /**
     * Whether to enable &#34;acl(access control list)&#34;, the acl is specified by `acl_id`. Valid values are `on` and `off`. Default to `off`.
     * 
     */
    @Export(name="aclStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> aclStatus;

    /**
     * @return Whether to enable &#34;acl(access control list)&#34;, the acl is specified by `acl_id`. Valid values are `on` and `off`. Default to `off`.
     * 
     */
    public Output<Optional<String>> aclStatus() {
        return Codegen.optional(this.aclStatus);
    }
    /**
     * Mode for handling the acl specified by acl_id. If `acl_status` is &#34;on&#34;, it is mandatory. Otherwise, it will be ignored. Valid values are `white` and `black`. `white` means the Listener can only be accessed by client ip belongs to the acl; `black` means the Listener can not be accessed by client ip belongs to the acl.
     * 
     */
    @Export(name="aclType", type=String.class, parameters={})
    private Output</* @Nullable */ String> aclType;

    /**
     * @return Mode for handling the acl specified by acl_id. If `acl_status` is &#34;on&#34;, it is mandatory. Otherwise, it will be ignored. Valid values are `white` and `black`. `white` means the Listener can only be accessed by client ip belongs to the acl; `black` means the Listener can not be accessed by client ip belongs to the acl.
     * 
     */
    public Output<Optional<String>> aclType() {
        return Codegen.optional(this.aclType);
    }
    /**
     * Port used by the Server Load Balancer instance backend. Valid value range: [1-65535].
     * 
     */
    @Export(name="backendPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> backendPort;

    /**
     * @return Port used by the Server Load Balancer instance backend. Valid value range: [1-65535].
     * 
     */
    public Output<Optional<Integer>> backendPort() {
        return Codegen.optional(this.backendPort);
    }
    /**
     * Bandwidth peak of Listener. For the public network instance charged per traffic consumed, the Bandwidth on Listener can be set to -1, indicating the bandwidth peak is unlimited. Valid values are [-1, 1-1000] in Mbps.
     * 
     */
    @Export(name="bandwidth", type=Integer.class, parameters={})
    private Output<Integer> bandwidth;

    /**
     * @return Bandwidth peak of Listener. For the public network instance charged per traffic consumed, the Bandwidth on Listener can be set to -1, indicating the bandwidth peak is unlimited. Valid values are [-1, 1-1000] in Mbps.
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }
    /**
     * SLB CA certificate ID. Only when `protocol` is `https` can be specified.
     * 
     */
    @Export(name="caCertificateId", type=String.class, parameters={})
    private Output</* @Nullable */ String> caCertificateId;

    /**
     * @return SLB CA certificate ID. Only when `protocol` is `https` can be specified.
     * 
     */
    public Output<Optional<String>> caCertificateId() {
        return Codegen.optional(this.caCertificateId);
    }
    /**
     * The cookie configured on the server. It is mandatory when `sticky_session` is &#34;on&#34; and `sticky_session_type` is &#34;server&#34;. Otherwise, it will be ignored. Valid value：String in line with RFC 2965, with length being 1- 200. It only contains characters such as ASCII codes, English letters and digits instead of the comma, semicolon or spacing, and it cannot start with $.
     * 
     */
    @Export(name="cookie", type=String.class, parameters={})
    private Output</* @Nullable */ String> cookie;

    /**
     * @return The cookie configured on the server. It is mandatory when `sticky_session` is &#34;on&#34; and `sticky_session_type` is &#34;server&#34;. Otherwise, it will be ignored. Valid value：String in line with RFC 2965, with length being 1- 200. It only contains characters such as ASCII codes, English letters and digits instead of the comma, semicolon or spacing, and it cannot start with $.
     * 
     */
    public Output<Optional<String>> cookie() {
        return Codegen.optional(this.cookie);
    }
    /**
     * Cookie timeout. It is mandatory when `sticky_session` is &#34;on&#34; and `sticky_session_type` is &#34;insert&#34;. Otherwise, it will be ignored. Valid value range: [1-86400] in seconds.
     * 
     */
    @Export(name="cookieTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cookieTimeout;

    /**
     * @return Cookie timeout. It is mandatory when `sticky_session` is &#34;on&#34; and `sticky_session_type` is &#34;insert&#34;. Otherwise, it will be ignored. Valid value range: [1-86400] in seconds.
     * 
     */
    public Output<Optional<Integer>> cookieTimeout() {
        return Codegen.optional(this.cookieTimeout);
    }
    /**
     * Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     * 
     */
    @Export(name="deleteProtectionValidation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteProtectionValidation;

    /**
     * @return Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     * 
     */
    public Output<Optional<Boolean>> deleteProtectionValidation() {
        return Codegen.optional(this.deleteProtectionValidation);
    }
    /**
     * The description of slb listener. This description can have a string of 1 to 80 characters. Default value: null.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of slb listener. This description can have a string of 1 to 80 characters. Default value: null.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether to enable https listener support http2 or not. Valid values are `on` and `off`. Default to `on`.
     * 
     */
    @Export(name="enableHttp2", type=String.class, parameters={})
    private Output</* @Nullable */ String> enableHttp2;

    /**
     * @return Whether to enable https listener support http2 or not. Valid values are `on` and `off`. Default to `on`.
     * 
     */
    public Output<Optional<String>> enableHttp2() {
        return Codegen.optional(this.enableHttp2);
    }
    /**
     * Timeout of tcp listener established connection idle timeout. Valid value range: [10-900] in seconds. Default to 900.
     * 
     */
    @Export(name="establishedTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> establishedTimeout;

    /**
     * @return Timeout of tcp listener established connection idle timeout. Valid value range: [10-900] in seconds. Default to 900.
     * 
     */
    public Output<Optional<Integer>> establishedTimeout() {
        return Codegen.optional(this.establishedTimeout);
    }
    /**
     * The port that http redirect to https.
     * 
     */
    @Export(name="forwardPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> forwardPort;

    /**
     * @return The port that http redirect to https.
     * 
     */
    public Output<Optional<Integer>> forwardPort() {
        return Codegen.optional(this.forwardPort);
    }
    /**
     * Port used by the Server Load Balancer instance frontend. Valid value range: [1-65535].
     * 
     */
    @Export(name="frontendPort", type=Integer.class, parameters={})
    private Output<Integer> frontendPort;

    /**
     * @return Port used by the Server Load Balancer instance frontend. Valid value range: [1-65535].
     * 
     */
    public Output<Integer> frontendPort() {
        return this.frontendPort;
    }
    /**
     * Whether to enable &#34;Gzip Compression&#34;. If enabled, files of specific file types will be compressed, otherwise, no files will be compressed. Default to true. Available in v1.13.0+.
     * 
     */
    @Export(name="gzip", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> gzip;

    /**
     * @return Whether to enable &#34;Gzip Compression&#34;. If enabled, files of specific file types will be compressed, otherwise, no files will be compressed. Default to true. Available in v1.13.0+.
     * 
     */
    public Output<Optional<Boolean>> gzip() {
        return Codegen.optional(this.gzip);
    }
    /**
     * Whether to enable health check. Valid values are`on` and `off`. TCP and UDP listener&#39;s HealthCheck is always on, so it will be ignore when launching TCP or UDP listener.
     * 
     */
    @Export(name="healthCheck", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthCheck;

    /**
     * @return Whether to enable health check. Valid values are`on` and `off`. TCP and UDP listener&#39;s HealthCheck is always on, so it will be ignore when launching TCP or UDP listener.
     * 
     */
    public Output<Optional<String>> healthCheck() {
        return Codegen.optional(this.healthCheck);
    }
    /**
     * The port that is used for health checks. Valid value range: [0-65535]. Default to `0` means that the port on a backend server is used for health checks.
     * 
     */
    @Export(name="healthCheckConnectPort", type=Integer.class, parameters={})
    private Output<Integer> healthCheckConnectPort;

    /**
     * @return The port that is used for health checks. Valid value range: [0-65535]. Default to `0` means that the port on a backend server is used for health checks.
     * 
     */
    public Output<Integer> healthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }
    /**
     * Domain name used for health check. When it used to launch TCP listener, `health_check_type` must be &#34;http&#34;. Its length is limited to 1-80 and only characters such as letters, digits, ‘-‘ and ‘.’ are allowed. When it is not set or empty,  Server Load Balancer uses the private network IP address of each backend server as Domain used for health check.
     * 
     */
    @Export(name="healthCheckDomain", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthCheckDomain;

    /**
     * @return Domain name used for health check. When it used to launch TCP listener, `health_check_type` must be &#34;http&#34;. Its length is limited to 1-80 and only characters such as letters, digits, ‘-‘ and ‘.’ are allowed. When it is not set or empty,  Server Load Balancer uses the private network IP address of each backend server as Domain used for health check.
     * 
     */
    public Output<Optional<String>> healthCheckDomain() {
        return Codegen.optional(this.healthCheckDomain);
    }
    /**
     * Regular health check HTTP status code. Multiple codes are segmented by “,”. It is required when `health_check` is on. Default to `http_2xx`.  Valid values are: `http_2xx`,  `http_3xx`, `http_4xx` and `http_5xx`.
     * 
     */
    @Export(name="healthCheckHttpCode", type=String.class, parameters={})
    private Output<String> healthCheckHttpCode;

    /**
     * @return Regular health check HTTP status code. Multiple codes are segmented by “,”. It is required when `health_check` is on. Default to `http_2xx`.  Valid values are: `http_2xx`,  `http_3xx`, `http_4xx` and `http_5xx`.
     * 
     */
    public Output<String> healthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }
    /**
     * Time interval of health checks. It is required when `health_check` is on. Valid value range: [1-50] in seconds. Default to 2.
     * 
     */
    @Export(name="healthCheckInterval", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthCheckInterval;

    /**
     * @return Time interval of health checks. It is required when `health_check` is on. Valid value range: [1-50] in seconds. Default to 2.
     * 
     */
    public Output<Optional<Integer>> healthCheckInterval() {
        return Codegen.optional(this.healthCheckInterval);
    }
    /**
     * HealthCheckMethod used for health check.Valid values: [&#34;head&#34;, &#34;get&#34;] `http` and `https` support regions ap-northeast-1, ap-southeast-1, ap-southeast-2, ap-southeast-3, us-east-1, us-west-1, eu-central-1, ap-south-1, me-east-1, cn-huhehaote, cn-zhangjiakou, ap-southeast-5, cn-shenzhen, cn-hongkong, cn-qingdao, cn-chengdu, eu-west-1, cn-hangzhou&#34;, cn-beijing, cn-shanghai.This function does not support the TCP protocol .
     * 
     */
    @Export(name="healthCheckMethod", type=String.class, parameters={})
    private Output<String> healthCheckMethod;

    /**
     * @return HealthCheckMethod used for health check.Valid values: [&#34;head&#34;, &#34;get&#34;] `http` and `https` support regions ap-northeast-1, ap-southeast-1, ap-southeast-2, ap-southeast-3, us-east-1, us-west-1, eu-central-1, ap-south-1, me-east-1, cn-huhehaote, cn-zhangjiakou, ap-southeast-5, cn-shenzhen, cn-hongkong, cn-qingdao, cn-chengdu, eu-west-1, cn-hangzhou&#34;, cn-beijing, cn-shanghai.This function does not support the TCP protocol .
     * 
     */
    public Output<String> healthCheckMethod() {
        return this.healthCheckMethod;
    }
    /**
     * Maximum timeout of each health check response. It is required when `health_check` is on. Valid value range: [1-300] in seconds. Default to 5. Note: If `health_check_timeout` &lt; `health_check_interval`, its will be replaced by `health_check_interval`.
     * 
     */
    @Export(name="healthCheckTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthCheckTimeout;

    /**
     * @return Maximum timeout of each health check response. It is required when `health_check` is on. Valid value range: [1-300] in seconds. Default to 5. Note: If `health_check_timeout` &lt; `health_check_interval`, its will be replaced by `health_check_interval`.
     * 
     */
    public Output<Optional<Integer>> healthCheckTimeout() {
        return Codegen.optional(this.healthCheckTimeout);
    }
    /**
     * Type of health check. Valid values are: `tcp` and `http`. Default to `tcp` . TCP supports TCP and HTTP health check mode, you can select the particular mode depending on your application.
     * 
     */
    @Export(name="healthCheckType", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthCheckType;

    /**
     * @return Type of health check. Valid values are: `tcp` and `http`. Default to `tcp` . TCP supports TCP and HTTP health check mode, you can select the particular mode depending on your application.
     * 
     */
    public Output<Optional<String>> healthCheckType() {
        return Codegen.optional(this.healthCheckType);
    }
    /**
     * URI used for health check. When it used to launch TCP listener, `health_check_type` must be &#34;http&#34;. Its length is limited to 1-80 and it must start with /. Only characters such as letters, digits, ‘-’, ‘/’, ‘.’, ‘%’, ‘?’, #’ and ‘&amp;’ are allowed.
     * 
     */
    @Export(name="healthCheckUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthCheckUri;

    /**
     * @return URI used for health check. When it used to launch TCP listener, `health_check_type` must be &#34;http&#34;. Its length is limited to 1-80 and it must start with /. Only characters such as letters, digits, ‘-’, ‘/’, ‘.’, ‘%’, ‘?’, #’ and ‘&amp;’ are allowed.
     * 
     */
    public Output<Optional<String>> healthCheckUri() {
        return Codegen.optional(this.healthCheckUri);
    }
    /**
     * The number of health checks that an unhealthy backend server must consecutively pass before it can be declared healthy. In this case, the health check state is changed from fail to success. It is required when `health_check` is on. Valid value range: [2-10] in seconds. Default to 3. **NOTE:** This parameter takes effect only if the `health_check` parameter is set to `on`.
     * 
     */
    @Export(name="healthyThreshold", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthyThreshold;

    /**
     * @return The number of health checks that an unhealthy backend server must consecutively pass before it can be declared healthy. In this case, the health check state is changed from fail to success. It is required when `health_check` is on. Valid value range: [2-10] in seconds. Default to 3. **NOTE:** This parameter takes effect only if the `health_check` parameter is set to `on`.
     * 
     */
    public Output<Optional<Integer>> healthyThreshold() {
        return Codegen.optional(this.healthyThreshold);
    }
    /**
     * Timeout of http or https listener established connection idle timeout. Valid value range: [1-60] in seconds. Default to 15.
     * 
     */
    @Export(name="idleTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> idleTimeout;

    /**
     * @return Timeout of http or https listener established connection idle timeout. Valid value range: [1-60] in seconds. Default to 15.
     * 
     */
    public Output<Optional<Integer>> idleTimeout() {
        return Codegen.optional(this.idleTimeout);
    }
    /**
     * @deprecated
     * Field &#39;instance_port&#39; has been deprecated, and using &#39;backend_port&#39; to replace.
     * 
     */
    @Deprecated /* Field 'instance_port' has been deprecated, and using 'backend_port' to replace. */
    @Export(name="instancePort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> instancePort;

    public Output<Optional<Integer>> instancePort() {
        return Codegen.optional(this.instancePort);
    }
    /**
     * @deprecated
     * Field &#39;lb_port&#39; has been deprecated, and using &#39;frontend_port&#39; to replace.
     * 
     */
    @Deprecated /* Field 'lb_port' has been deprecated, and using 'frontend_port' to replace. */
    @Export(name="lbPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> lbPort;

    public Output<Optional<Integer>> lbPort() {
        return Codegen.optional(this.lbPort);
    }
    /**
     * @deprecated
     * Field &#39;lb_protocol&#39; has been deprecated, and using &#39;protocol&#39; to replace.
     * 
     */
    @Deprecated /* Field 'lb_protocol' has been deprecated, and using 'protocol' to replace. */
    @Export(name="lbProtocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> lbProtocol;

    public Output<Optional<String>> lbProtocol() {
        return Codegen.optional(this.lbProtocol);
    }
    /**
     * Whether to enable http redirect to https, Valid values are `on` and `off`. Default to `off`.
     * 
     */
    @Export(name="listenerForward", type=String.class, parameters={})
    private Output<String> listenerForward;

    /**
     * @return Whether to enable http redirect to https, Valid values are `on` and `off`. Default to `off`.
     * 
     */
    public Output<String> listenerForward() {
        return this.listenerForward;
    }
    /**
     * The Load Balancer ID which is used to launch a new listener.
     * 
     */
    @Export(name="loadBalancerId", type=String.class, parameters={})
    private Output<String> loadBalancerId;

    /**
     * @return The Load Balancer ID which is used to launch a new listener.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * The ID of the master slave server group.
     * 
     */
    @Export(name="masterSlaveServerGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> masterSlaveServerGroupId;

    /**
     * @return The ID of the master slave server group.
     * 
     */
    public Output<Optional<String>> masterSlaveServerGroupId() {
        return Codegen.optional(this.masterSlaveServerGroupId);
    }
    /**
     * Timeout of connection persistence. Valid value range: [0-3600] in seconds. Default to 0 and means closing it.
     * 
     */
    @Export(name="persistenceTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> persistenceTimeout;

    /**
     * @return Timeout of connection persistence. Valid value range: [0-3600] in seconds. Default to 0 and means closing it.
     * 
     */
    public Output<Optional<Integer>> persistenceTimeout() {
        return Codegen.optional(this.persistenceTimeout);
    }
    /**
     * The protocol to listen on. Valid values are [`http`, `https`, `tcp`, `udp`].
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The protocol to listen on. Valid values are [`http`, `https`, `tcp`, `udp`].
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * Timeout of http or https listener request (which does not get response from backend) timeout. Valid value range: [1-180] in seconds. Default to 60.
     * 
     */
    @Export(name="requestTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> requestTimeout;

    /**
     * @return Timeout of http or https listener request (which does not get response from backend) timeout. Valid value range: [1-180] in seconds. Default to 60.
     * 
     */
    public Output<Optional<Integer>> requestTimeout() {
        return Codegen.optional(this.requestTimeout);
    }
    /**
     * Scheduling algorithm,  Valid values: `wrr`, `rr`, `wlc`, `sch`, `tcp`, `qch`. Default to `wrr`.
     * Only when `protocol` is `tcp` or `udp`, `scheduler` can be set to `sch`. Only when instance is guaranteed-performance instance and `protocol` is `tcp` or `udp`, `scheduler` can be set to `tch`. Only when instance is guaranteed-performance instance and `protocol` is `udp`, `scheduler` can be set to `qch`.
     * 
     */
    @Export(name="scheduler", type=String.class, parameters={})
    private Output</* @Nullable */ String> scheduler;

    /**
     * @return Scheduling algorithm,  Valid values: `wrr`, `rr`, `wlc`, `sch`, `tcp`, `qch`. Default to `wrr`.
     * Only when `protocol` is `tcp` or `udp`, `scheduler` can be set to `sch`. Only when instance is guaranteed-performance instance and `protocol` is `tcp` or `udp`, `scheduler` can be set to `tch`. Only when instance is guaranteed-performance instance and `protocol` is `udp`, `scheduler` can be set to `qch`.
     * 
     */
    public Output<Optional<String>> scheduler() {
        return Codegen.optional(this.scheduler);
    }
    /**
     * SLB Server certificate ID. It is required when `protocol` is `https`. The `server_certificate_id` is also required when the value of the `ssl_certificate_id`  is Empty.
     * 
     */
    @Export(name="serverCertificateId", type=String.class, parameters={})
    private Output<String> serverCertificateId;

    /**
     * @return SLB Server certificate ID. It is required when `protocol` is `https`. The `server_certificate_id` is also required when the value of the `ssl_certificate_id`  is Empty.
     * 
     */
    public Output<String> serverCertificateId() {
        return this.serverCertificateId;
    }
    /**
     * the id of server group to be apply on the listener, is the id of resource `alicloud.slb.ServerGroup`.
     * 
     */
    @Export(name="serverGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverGroupId;

    /**
     * @return the id of server group to be apply on the listener, is the id of resource `alicloud.slb.ServerGroup`.
     * 
     */
    public Output<Optional<String>> serverGroupId() {
        return Codegen.optional(this.serverGroupId);
    }
    /**
     * SLB Server certificate ID. It has been deprecated from 1.59.0 and using `server_certificate_id` instead.
     * 
     * @deprecated
     * Field &#39;ssl_certificate_id&#39; has been deprecated from 1.59.0 and using &#39;server_certificate_id&#39; instead.
     * 
     */
    @Deprecated /* Field 'ssl_certificate_id' has been deprecated from 1.59.0 and using 'server_certificate_id' instead. */
    @Export(name="sslCertificateId", type=String.class, parameters={})
    private Output<String> sslCertificateId;

    /**
     * @return SLB Server certificate ID. It has been deprecated from 1.59.0 and using `server_certificate_id` instead.
     * 
     */
    public Output<String> sslCertificateId() {
        return this.sslCertificateId;
    }
    /**
     * Whether to enable session persistence, Valid values are `on` and `off`. Default to `off`.
     * 
     */
    @Export(name="stickySession", type=String.class, parameters={})
    private Output</* @Nullable */ String> stickySession;

    /**
     * @return Whether to enable session persistence, Valid values are `on` and `off`. Default to `off`.
     * 
     */
    public Output<Optional<String>> stickySession() {
        return Codegen.optional(this.stickySession);
    }
    /**
     * Mode for handling the cookie. If `sticky_session` is &#34;on&#34;, it is mandatory. Otherwise, it will be ignored. Valid values are `insert` and `server`. `insert` means it is inserted from Server Load Balancer; `server` means the Server Load Balancer learns from the backend server.
     * 
     */
    @Export(name="stickySessionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> stickySessionType;

    /**
     * @return Mode for handling the cookie. If `sticky_session` is &#34;on&#34;, it is mandatory. Otherwise, it will be ignored. Valid values are `insert` and `server`. `insert` means it is inserted from Server Load Balancer; `server` means the Server Load Balancer learns from the backend server.
     * 
     */
    public Output<Optional<String>> stickySessionType() {
        return Codegen.optional(this.stickySessionType);
    }
    /**
     * Https listener TLS cipher policy. Valid values are `tls_cipher_policy_1_0`, `tls_cipher_policy_1_1`, `tls_cipher_policy_1_2`, `tls_cipher_policy_1_2_strict`. Default to `tls_cipher_policy_1_0`. Currently the `tls_cipher_policy` can not be updated when load balancer instance is &#34;Shared-Performance&#34;.
     * 
     */
    @Export(name="tlsCipherPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> tlsCipherPolicy;

    /**
     * @return Https listener TLS cipher policy. Valid values are `tls_cipher_policy_1_0`, `tls_cipher_policy_1_1`, `tls_cipher_policy_1_2`, `tls_cipher_policy_1_2_strict`. Default to `tls_cipher_policy_1_0`. Currently the `tls_cipher_policy` can not be updated when load balancer instance is &#34;Shared-Performance&#34;.
     * 
     */
    public Output<Optional<String>> tlsCipherPolicy() {
        return Codegen.optional(this.tlsCipherPolicy);
    }
    /**
     * The number of health checks that a healthy backend server must consecutively fail before it can be declared unhealthy. In this case, the health check state is changed from success to fail. It is required when `health_check` is on. Valid value range: [2-10] in seconds. Default to 3. **NOTE:** This parameter takes effect only if the `health_check` parameter is set to `on`.
     * 
     */
    @Export(name="unhealthyThreshold", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> unhealthyThreshold;

    /**
     * @return The number of health checks that a healthy backend server must consecutively fail before it can be declared unhealthy. In this case, the health check state is changed from success to fail. It is required when `health_check` is on. Valid value range: [2-10] in seconds. Default to 3. **NOTE:** This parameter takes effect only if the `health_check` parameter is set to `on`.
     * 
     */
    public Output<Optional<Integer>> unhealthyThreshold() {
        return Codegen.optional(this.unhealthyThreshold);
    }
    /**
     * Whether to set additional HTTP Header field &#34;X-Forwarded-For&#34; (documented below). Available in v1.13.0+. The details see Block `x_forwarded_for`.
     * 
     */
    @Export(name="xForwardedFor", type=ListenerXForwardedFor.class, parameters={})
    private Output<ListenerXForwardedFor> xForwardedFor;

    /**
     * @return Whether to set additional HTTP Header field &#34;X-Forwarded-For&#34; (documented below). Available in v1.13.0+. The details see Block `x_forwarded_for`.
     * 
     */
    public Output<ListenerXForwardedFor> xForwardedFor() {
        return this.xForwardedFor;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Listener(String name) {
        this(name, ListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Listener(String name, ListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:slb/listener:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Listener(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:slb/listener:Listener", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Listener get(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, state, options);
    }
}
