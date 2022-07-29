// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.alb.ListenerArgs;
import com.pulumi.alicloud.alb.inputs.ListenerState;
import com.pulumi.alicloud.alb.outputs.ListenerAccessLogTracingConfig;
import com.pulumi.alicloud.alb.outputs.ListenerAclConfig;
import com.pulumi.alicloud.alb.outputs.ListenerCertificates;
import com.pulumi.alicloud.alb.outputs.ListenerDefaultAction;
import com.pulumi.alicloud.alb.outputs.ListenerQuicConfig;
import com.pulumi.alicloud.alb.outputs.ListenerXForwardedForConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Application Load Balancer (ALB) Listener resource.
 * 
 * For information about Application Load Balancer (ALB) Listener and how to use it, see [What is Listener](https://www.alibabacloud.com/help/doc-detail/214348.htm).
 * 
 * &gt; **NOTE:** Available in v1.133.0+.
 * 
 * ## Import
 * 
 * Application Load Balancer (ALB) Listener can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:alb/listener:Listener example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:alb/listener:Listener")
public class Listener extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether the access log has a custom header field. Valid values: true and false. Default value: false.
     * 
     */
    @Export(name="accessLogRecordCustomizedHeadersEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> accessLogRecordCustomizedHeadersEnabled;

    /**
     * @return Indicates whether the access log has a custom header field. Valid values: true and false. Default value: false.
     * 
     */
    public Output<Boolean> accessLogRecordCustomizedHeadersEnabled() {
        return this.accessLogRecordCustomizedHeadersEnabled;
    }
    /**
     * Xtrace Configuration Information. See the following `Block access_log_tracing_config`.
     * 
     */
    @Export(name="accessLogTracingConfig", type=ListenerAccessLogTracingConfig.class, parameters={})
    private Output</* @Nullable */ ListenerAccessLogTracingConfig> accessLogTracingConfig;

    /**
     * @return Xtrace Configuration Information. See the following `Block access_log_tracing_config`.
     * 
     */
    public Output<Optional<ListenerAccessLogTracingConfig>> accessLogTracingConfig() {
        return Codegen.optional(this.accessLogTracingConfig);
    }
    /**
     * The configurations of the access control lists (ACLs). See the following `Block acl_config`. **NOTE:** Field `acl_config` has been deprecated from provider version 1.163.0, and it will be removed in the future version. Please use the new resource `alicloud.alb.ListenerAclAttachment`.,
     * 
     * @deprecated
     * Field &#39;acl_config&#39; has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_alb_listener_acl_attachment&#39;.
     * 
     */
    @Deprecated /* Field 'acl_config' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_alb_listener_acl_attachment'. */
    @Export(name="aclConfig", type=ListenerAclConfig.class, parameters={})
    private Output<ListenerAclConfig> aclConfig;

    /**
     * @return The configurations of the access control lists (ACLs). See the following `Block acl_config`. **NOTE:** Field `acl_config` has been deprecated from provider version 1.163.0, and it will be removed in the future version. Please use the new resource `alicloud.alb.ListenerAclAttachment`.,
     * 
     */
    public Output<ListenerAclConfig> aclConfig() {
        return this.aclConfig;
    }
    /**
     * The default certificate of the Listener. See the following `Block certificates`. **NOTE:** When `listener_protocol` is `HTTPS`, The default certificate must be set one。
     * 
     */
    @Export(name="certificates", type=ListenerCertificates.class, parameters={})
    private Output</* @Nullable */ ListenerCertificates> certificates;

    /**
     * @return The default certificate of the Listener. See the following `Block certificates`. **NOTE:** When `listener_protocol` is `HTTPS`, The default certificate must be set one。
     * 
     */
    public Output<Optional<ListenerCertificates>> certificates() {
        return Codegen.optional(this.certificates);
    }
    /**
     * The Default Rule Action List. See the following `Block default_actions`.
     * 
     */
    @Export(name="defaultActions", type=List.class, parameters={ListenerDefaultAction.class})
    private Output</* @Nullable */ List<ListenerDefaultAction>> defaultActions;

    /**
     * @return The Default Rule Action List. See the following `Block default_actions`.
     * 
     */
    public Output<Optional<List<ListenerDefaultAction>>> defaultActions() {
        return Codegen.optional(this.defaultActions);
    }
    /**
     * The dry run.
     * 
     */
    @Export(name="dryRun", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
     * 
     */
    @Export(name="gzipEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> gzipEnabled;

    /**
     * @return Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
     * 
     */
    public Output<Boolean> gzipEnabled() {
        return this.gzipEnabled;
    }
    /**
     * Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
     * 
     */
    @Export(name="http2Enabled", type=Boolean.class, parameters={})
    private Output<Boolean> http2Enabled;

    /**
     * @return Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
     * 
     */
    public Output<Boolean> http2Enabled() {
        return this.http2Enabled;
    }
    /**
     * Specify the Connection Idle Timeout Value: `1` to `60`. Unit: Seconds.
     * 
     */
    @Export(name="idleTimeout", type=Integer.class, parameters={})
    private Output<Integer> idleTimeout;

    /**
     * @return Specify the Connection Idle Timeout Value: `1` to `60`. Unit: Seconds.
     * 
     */
    public Output<Integer> idleTimeout() {
        return this.idleTimeout;
    }
    /**
     * The description of the listener. The description must be 2 to 256 characters in length. The name can contain only the characters in the following string: `/^([^\x00-\xff]|[\w.,;/@-]){2,256}$/`.
     * 
     */
    @Export(name="listenerDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> listenerDescription;

    /**
     * @return The description of the listener. The description must be 2 to 256 characters in length. The name can contain only the characters in the following string: `/^([^\x00-\xff]|[\w.,;/@-]){2,256}$/`.
     * 
     */
    public Output<Optional<String>> listenerDescription() {
        return Codegen.optional(this.listenerDescription);
    }
    /**
     * The ALB Instance Front-End, and Those of the Ports Used. Value: `1` to `65535`.
     * 
     */
    @Export(name="listenerPort", type=Integer.class, parameters={})
    private Output<Integer> listenerPort;

    /**
     * @return The ALB Instance Front-End, and Those of the Ports Used. Value: `1` to `65535`.
     * 
     */
    public Output<Integer> listenerPort() {
        return this.listenerPort;
    }
    /**
     * Snooping Protocols. Valid Values: `HTTP`, `HTTPS` Or `QUIC`.
     * 
     */
    @Export(name="listenerProtocol", type=String.class, parameters={})
    private Output<String> listenerProtocol;

    /**
     * @return Snooping Protocols. Valid Values: `HTTP`, `HTTPS` Or `QUIC`.
     * 
     */
    public Output<String> listenerProtocol() {
        return this.listenerProtocol;
    }
    /**
     * The ALB Instance Id.
     * 
     */
    @Export(name="loadBalancerId", type=String.class, parameters={})
    private Output<String> loadBalancerId;

    /**
     * @return The ALB Instance Id.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * Configuration Associated with the QuIC Listening. See the following `Block quic_config`.
     * 
     */
    @Export(name="quicConfig", type=ListenerQuicConfig.class, parameters={})
    private Output<ListenerQuicConfig> quicConfig;

    /**
     * @return Configuration Associated with the QuIC Listening. See the following `Block quic_config`.
     * 
     */
    public Output<ListenerQuicConfig> quicConfig() {
        return this.quicConfig;
    }
    /**
     * The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
     * 
     */
    @Export(name="requestTimeout", type=Integer.class, parameters={})
    private Output<Integer> requestTimeout;

    /**
     * @return The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
     * 
     */
    public Output<Integer> requestTimeout() {
        return this.requestTimeout;
    }
    /**
     * Security Policy.
     * 
     */
    @Export(name="securityPolicyId", type=String.class, parameters={})
    private Output<String> securityPolicyId;

    /**
     * @return Security Policy.
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }
    /**
     * The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The `x_forward_for` Related Attribute Configuration. See the following `Block x_forwarded_for_config`. **NOTE:** The attribute is valid when the attribute `listener_protocol` is `HTTPS`.
     * 
     */
    @Export(name="xForwardedForConfig", type=ListenerXForwardedForConfig.class, parameters={})
    private Output<ListenerXForwardedForConfig> xForwardedForConfig;

    /**
     * @return The `x_forward_for` Related Attribute Configuration. See the following `Block x_forwarded_for_config`. **NOTE:** The attribute is valid when the attribute `listener_protocol` is `HTTPS`.
     * 
     */
    public Output<ListenerXForwardedForConfig> xForwardedForConfig() {
        return this.xForwardedForConfig;
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
        super("alicloud:alb/listener:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Listener(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:alb/listener:Listener", name, state, makeResourceOptions(options, id));
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
